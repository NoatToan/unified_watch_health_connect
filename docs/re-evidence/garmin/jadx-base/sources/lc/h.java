package lc;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llc/h;", "Llc/g;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h extends g<float[]> {
    public h() {
        super(true);
    }

    public static float[] j(String str) {
        str.getClass();
        q0.f111845j.getClass();
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    @Override // lc.q0
    public final Object a(Bundle bundle, String str) {
        if (!kg.f.v(str, str, bundle) || nd.b.k(bundle, str)) {
            return null;
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // lc.q0
    public final String b() {
        return "float[]";
    }

    @Override // lc.q0
    public final Object c(Object obj, String str) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return j(str);
        }
        float[] fArrJ = j(str);
        int length = fArr.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(fArrJ, 0, fArrCopyOf, length, 1);
        return fArrCopyOf;
    }

    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ Object h(String str) {
        return j(str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // lc.q0
    public final boolean g(Object obj, Object obj2) {
        Float[] fArr;
        float[] fArr2 = (float[]) obj;
        float[] fArr3 = (float[]) obj2;
        Float[] fArr4 = null;
        if (fArr2 != null) {
            fArr = new Float[fArr2.length];
            int length = fArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                fArr[i14] = Float.valueOf(fArr2[i14]);
            }
        } else {
            fArr = null;
        }
        if (fArr3 != null) {
            fArr4 = new Float[fArr3.length];
            int length2 = fArr3.length;
            for (int i15 = 0; i15 < length2; i15++) {
                fArr4[i15] = Float.valueOf(fArr3[i15]);
            }
        }
        return p13.m.b(fArr, fArr4);
    }

    @Override // lc.g
    public final float[] h() {
        return new float[0];
    }

    @Override // lc.g
    public final List i(float[] fArr) {
        List<Float> listF0;
        float[] fArr2 = fArr;
        if (fArr2 == null || (listF0 = p13.u.f0(fArr2)) == null) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(listF0, 10));
        Iterator<T> it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
