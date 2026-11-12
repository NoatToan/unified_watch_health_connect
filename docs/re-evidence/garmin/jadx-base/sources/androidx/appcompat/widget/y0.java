package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;
import com.google.android.material.motion.MaterialBackHandler;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5287b;

    public /* synthetic */ y0(Object obj, int i14) {
        this.f5286a = i14;
        this.f5287b = obj;
    }

    public final void onBackInvoked() {
        int i14 = this.f5286a;
        Object obj = this.f5287b;
        switch (i14) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                ((MaterialBackHandler) obj).handleBackInvoked();
                break;
            case 2:
                ((i.f) obj).U();
                break;
            case 3:
                e23.a aVar = (e23.a) obj;
                int i15 = p004k6.q.f103091a;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            default:
                ((wc.o) obj).a();
                break;
        }
    }
}
