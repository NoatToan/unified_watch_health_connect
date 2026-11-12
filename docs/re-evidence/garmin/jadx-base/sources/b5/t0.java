package b5;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f15901a = new StackTraceElement[0];

    public static h4.r a(h4.r rVar, w wVar) {
        return rVar.then(new u(wVar, false));
    }

    public static final void b(q qVar, long j8, e23.l lVar, boolean z14) {
        MotionEvent motionEventA = qVar.a();
        if (motionEventA == null) {
            vb.h.s("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z14) {
            motionEventA.setAction(3);
        }
        int i14 = (int) (j8 >> 32);
        int i15 = (int) (j8 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i14), -Float.intBitsToFloat(i15));
        lVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
        motionEventA.setAction(action);
    }
}
