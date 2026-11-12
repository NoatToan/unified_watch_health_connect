package co;

import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lco/l;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28117a;

        static {
            int[] iArr = new int[eo.e.values().length];
            try {
                iArr[eo.e.MINIMUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eo.e.MAXIMUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28117a = iArr;
        }
    }

    public static p a(eo.e eVar, Integer num, Integer num2, int i14) {
        Object c1915a;
        int iIntValue = num != null ? num.intValue() : 0;
        int iIntValue2 = num2 != null ? num2.intValue() : i14;
        int i15 = eVar == null ? -1 : a.f28117a[eVar.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                return new p(null, null);
            }
            return new p(null, iIntValue2 < iIntValue ? jo.a.b.f99692b : null);
        }
        if (iIntValue < 0 || iIntValue > i14) {
            c1915a = new jo.a.C1915a(0, i14);
        } else {
            c1915a = iIntValue > iIntValue2 ? jo.a.c.f99693b : null;
        }
        return new p(c1915a, null);
    }
}
