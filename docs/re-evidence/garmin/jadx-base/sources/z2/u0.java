package z2;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final boolean a(b5.q qVar) {
        MotionEvent motionEventA;
        List<b5.a0> list = qVar.f15870a;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = list.get(i14).f15756i;
            b5.m0.f15849b.getClass();
            if (i15 != b5.m0.f15851d) {
                MotionEvent motionEventA2 = qVar.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = qVar.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
