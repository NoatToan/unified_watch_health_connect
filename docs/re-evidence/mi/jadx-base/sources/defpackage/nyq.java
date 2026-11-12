package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
public class nyq extends lyq {
    public static boolean g = true;

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void e(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
