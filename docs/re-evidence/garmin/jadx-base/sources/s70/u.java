package s70;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class u {
    public static final void a(h4.r rVar, ArrayList arrayList, p3.m mVar, int i14) {
        String strJ;
        int i15;
        p3.o0 o0VarE = mVar.E(1377910857);
        int i16 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(arrayList) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            l72.s sVar = l72.s.f111232a;
            l72.s.b bVar = l72.s.b.INFO;
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.m0.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_broadcast_enabled);
            int size = arrayList.size();
            if (1 > size || size >= 4) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1954352165, R.string.lbl_broadcast_in_progress_on_multiple_devices, o0VarE, false);
            } else {
                o0VarE.C(-1954733899);
                int size2 = arrayList.size();
                if (size2 != 1) {
                    i15 = size2 != 2 ? R.string.lbl_broadcast_in_progress_on_three_devices : R.string.lbl_broadcast_in_progress_on_two_devices;
                } else {
                    i15 = R.string.lbl_broadcast_in_progress_on_one_device;
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                strJ = gl1.y.P(i15, Arrays.copyOf(strArr, strArr.length), o0VarE);
                o0VarE.g0(false);
            }
            sVar.d(rVar, bVar, dVarA, strQ, strJ, null, null, null, o0VarE, (i16 & 14) | 48, 480);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hw1.g(rVar, arrayList, i14, 1);
        }
    }
}
