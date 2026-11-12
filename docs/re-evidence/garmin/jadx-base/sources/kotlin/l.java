package kotlin;

import android.os.Trace;
import android.view.MotionEvent;
import e23.a;
import p13.k;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f91255b;

    public /* synthetic */ l(m mVar, int i14) {
        this.f91254a = i14;
        this.f91255b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f91254a;
        m mVar = this.f91255b;
        switch (i14) {
            case 0:
                k<a<p005kotlin.Unit>> kVar = mVar.f91278i;
                m.a aVar = m.K1;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!kVar.isEmpty()) {
                    try {
                        kVar.removeLast().invoke();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                p005kotlin.Unit unit = p005kotlin.Unit.INSTANCE;
                Trace.endSection();
                return;
            case 1:
                mVar.A1 = false;
                MotionEvent motionEvent = mVar.f91299s1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    mVar.f0(motionEvent);
                    return;
                } else {
                    h.z("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                m.V(mVar.getRoot());
                return;
            default:
                m.V(mVar.getRoot());
                return;
        }
    }
}
