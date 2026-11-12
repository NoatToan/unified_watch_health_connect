package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public class pyq extends nyq {
    public static boolean h = true;

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i);
        } else if (h) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                h = false;
            }
        }
    }
}
