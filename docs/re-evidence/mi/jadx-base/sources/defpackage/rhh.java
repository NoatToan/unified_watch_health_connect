package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class rhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile rhh f32549a;

    public static rhh a() {
        if (f32549a == null) {
            synchronized (rhh.class) {
                try {
                    if (f32549a == null) {
                        f32549a = new rhh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f32549a;
    }

    public int b(View view, int i) {
        return iz6.f().heightPixels - i;
    }

    public Point c() {
        return null;
    }

    public float d() {
        return 1.0f;
    }

    public View e(Dialog dialog, ReactViewGroup reactViewGroup, Activity activity) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }
}
