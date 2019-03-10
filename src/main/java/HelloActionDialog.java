import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

public class HelloActionDialog extends AnAction {
   public void actionPerformed(AnActionEvent event) {
        SampleDialogWrapper dialog = new SampleDialogWrapper();
        dialog.pack();
        dialog.show();
    }

    public class SampleDialogWrapper extends DialogWrapper {

        public SampleDialogWrapper() {
            super(true); // use current window as parent
            init();
            setTitle("Test DialogWrapper");
        }

        @Nullable
        @Override
        protected JComponent createCenterPanel() {
            JPanel dialogPanel = new JPanel(new BorderLayout());

            JLabel label = new JLabel("testing");
            label.setPreferredSize(new Dimension(100, 100));
            dialogPanel.add(label, BorderLayout.CENTER);

            return dialogPanel;
        }
    }
}
