package defpackage;

import android.content.Context;
import androidx.appcompat.widget.AppCompatCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public class ocj extends AppCompatCheckBox {
    public boolean e;

    public ocj(Context context) {
        super(context);
        this.e = true;
    }

    public void b(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
        }
        this.e = true;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.e) {
            this.e = false;
            super.setChecked(z);
        }
    }
}
