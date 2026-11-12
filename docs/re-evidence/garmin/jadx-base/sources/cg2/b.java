package cg2;

import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicPropertiesKt;
import com.airbnb.lottie.compose.LottieDynamicProperty;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o13.z;
import p13.d0;
import p13.j0;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import sg2.f;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public static final void a(r rVar, List list, List list2, m mVar, int i14) throws FileNotFoundException {
        o0 o0Var;
        o0 o0VarE = mVar.E(853385243);
        int i15 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(list2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m40boximpl(LottieCompositionSpec.RawRes.m41constructorimpl(R.raw.lottie_muscle_mapping)), null, null, null, null, null, o0VarE, 0, 62);
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                o0VarE.C(1288703210);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1288703211);
                ArrayList<String[]> arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List<String[]> listB = new c().b((a) it.next());
                    if (listB == null) {
                        listB = j0.f134944a;
                    }
                    d0.v(arrayList2, listB);
                }
                o0VarE.C(-235518718);
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                for (String[] strArr : arrayList2) {
                    Integer num = LottieProperty.COLOR;
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(o0VarE).l();
                    z.a aVar = z.f128618b;
                    arrayList3.add(LottieDynamicPropertiesKt.rememberLottieDynamicProperty(num, Integer.valueOf(Long.hashCode(jL)), (String[]) Arrays.copyOf(strArr, strArr.length), o0VarE, 6));
                }
                o0VarE.g0(false);
                arrayList.addAll(new ArrayList(arrayList3));
                o0VarE.g0(false);
            }
            if (list2 == null) {
                o0VarE.C(1289103079);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1289103080);
                ArrayList<String[]> arrayList4 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    List<String[]> listB2 = new c().b((a) it3.next());
                    if (listB2 == null) {
                        listB2 = j0.f134944a;
                    }
                    d0.v(arrayList4, listB2);
                }
                o0VarE.C(-235505819);
                ArrayList arrayList5 = new ArrayList(y.r(arrayList4, 10));
                for (String[] strArr2 : arrayList4) {
                    Integer num2 = LottieProperty.COLOR;
                    gl.c.f77766a.getClass();
                    long jR = gl.c.a(o0VarE).r();
                    z.a aVar2 = z.f128618b;
                    arrayList5.add(LottieDynamicPropertiesKt.rememberLottieDynamicProperty(num2, Integer.valueOf(Long.hashCode(jR)), (String[]) Arrays.copyOf(strArr2, strArr2.length), o0VarE, 6));
                }
                o0VarE.g0(false);
                arrayList.addAll(new ArrayList(arrayList5));
                o0VarE.g0(false);
            }
            LottieDynamicProperty[] lottieDynamicPropertyArr = (LottieDynamicProperty[]) arrayList.toArray(new LottieDynamicProperty[0]);
            f.a(rVar, 0L, z3.f.c(-900978393, new aa2.f(19, LottieDynamicPropertiesKt.rememberLottieDynamicProperties((LottieDynamicProperty[]) Arrays.copyOf(lottieDynamicPropertyArr, lottieDynamicPropertyArr.length), o0VarE, LottieDynamicProperty.$stable), lottieCompositionResultRememberLottieComposition), o0VarE), o0VarE, 390, 2);
            o0Var = o0VarE;
            x1 x1Var2 = n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(rVar, list, list2, i14, 8);
        }
    }
}
