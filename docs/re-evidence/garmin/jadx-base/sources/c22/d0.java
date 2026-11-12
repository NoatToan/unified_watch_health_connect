package c22;

import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/d0;", "", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23017a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/d0$a;", "", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Set a(k22.b bVar, long j8, String str, int i14) {
            zy.e dVar;
            List<String> listC;
            int iB;
            int i15 = i14;
            if (zb0.u0.n(str, zb0.u0.f203804r2, zb0.u0.f203809s2, zb0.u0.f203815t2, zb0.u0.f203820u2, zb0.u0.f203826v2, zb0.u0.f203850z2, zb0.u0.f203844y2, zb0.u0.U3, zb0.u0.A2, zb0.u0.B2, zb0.u0.C2, zb0.u0.D2, zb0.u0.f203838x2, zb0.u0.E2, zb0.u0.F2, zb0.u0.f203847y5, zb0.u0.f203853z5)) {
                dVar = new az.e(bVar);
            } else if (zb0.u0.n(str, zb0.u0.f203832w2, zb0.u0.f203758k3, zb0.u0.f203765l3)) {
                dVar = new az.a(bVar);
            } else if (zb0.u0.n(str, zb0.u0.D, zb0.u0.E, zb0.u0.f203836x, zb0.u0.F, zb0.u0.I, zb0.u0.P, zb0.u0.T, zb0.u0.f203848z, zb0.u0.X, zb0.u0.Y, zb0.u0.Z, zb0.u0.f203755k0)) {
                dVar = new az.c(bVar);
            } else {
                dVar = zb0.u0.n(str, zb0.u0.f203771m2) ? new az.d(bVar) : new az.b(bVar);
            }
            if (i15 != 0) {
                iB = 3;
                if (i15 == 1) {
                    listC = dVar.e();
                } else if (i15 != 3) {
                    String[] strArrC = bVar.c(R.array.canned_text_replies);
                    listC = strArrC != null ? p13.u.C(strArrC) : p13.j0.f134944a;
                    iB = 8;
                } else {
                    listC = dVar.a();
                    iB = dVar.d();
                }
            } else {
                listC = dVar.c();
                iB = dVar.b();
            }
            int i16 = iB;
            ArrayList arrayList = new ArrayList(p13.y.r(listC, 10));
            int i17 = 0;
            for (Object obj : listC) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    p13.x.q();
                    throw null;
                }
                String str2 = (String) obj;
                boolean z14 = i17 < i16;
                if (!z14) {
                    i17 = -1;
                }
                arrayList.add(new sd2.c(j8, str2, i15, z14, i17));
                i15 = i14;
                i17 = i18;
            }
            return p13.h0.g1(arrayList);
        }

        private a() {
        }
    }
}
