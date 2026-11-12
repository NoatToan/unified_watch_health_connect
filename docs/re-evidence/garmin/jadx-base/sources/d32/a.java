package d32;

import android.content.DialogInterface;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57387a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f57387a) {
            case 0:
                b.a aVar = b.f57388a;
                synchronized (c.class) {
                    c.f57390a.getClass();
                    c.f57391b = false;
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (b.class) {
                    b.f57389b = null;
                }
                return;
            default:
                int i14 = tm0.c.f165349i;
                return;
        }
    }
}
