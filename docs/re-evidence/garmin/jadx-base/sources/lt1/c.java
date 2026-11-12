package lt1;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114860a;

        static {
            int[] iArr = new int[us1.k.values().length];
            try {
                iArr[us1.k.HIGHEST_RATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us1.k.MOST_POPULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us1.k.NEAR_ME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f114860a = iArr;
        }
    }

    public static final List a(ArrayList arrayList, LatLng latLng, us1.k kVar) {
        latLng.getClass();
        kVar.getClass();
        int i14 = a.f114860a[kVar.ordinal()];
        if (i14 == 1) {
            return h0.N0(arrayList, new g(new e()));
        }
        if (i14 == 2) {
            return h0.N0(arrayList, new h(new f()));
        }
        if (i14 == 3) {
            return h0.N0(arrayList, new i(new d(latLng)));
        }
        u0.r();
        return null;
    }
}
