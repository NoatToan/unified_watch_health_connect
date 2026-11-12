package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
public class hyq extends ryq {
    public static boolean c = true;

    @Override // defpackage.ryq
    public void a(View view) {
    }

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // defpackage.ryq
    public void c(View view) {
    }

    @Override // defpackage.ryq
    @SuppressLint({"NewApi"})
    public void f(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }
}
