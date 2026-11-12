package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class eel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f16566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f16567b;

    public static eel b(ViewGroup viewGroup) {
        return (eel) viewGroup.getTag(ypi.e);
    }

    public static void c(ViewGroup viewGroup, eel eelVar) {
        viewGroup.setTag(ypi.e, eelVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f16566a) != this || (runnable = this.f16567b) == null) {
            return;
        }
        runnable.run();
    }
}
