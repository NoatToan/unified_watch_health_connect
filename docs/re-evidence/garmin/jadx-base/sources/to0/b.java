package to0;

import c22.b0;
import c22.o;
import d53.k;
import hb2.h;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;
import p13.x;
import p13.y;
import uo0.g;
import vo0.e;
import vo0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lto0/b;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f165839a = new b();

    private b() {
    }

    public static boolean a(e eVar) {
        eVar.getClass();
        return s.g(eVar.getResultType(), g.LOCALITY.f172112a) && s.g(eVar.getLocalityType(), g.CITY.f172112a);
    }

    public static String b(String str) {
        if (!b0.d()) {
            return str;
        }
        for (Map.Entry entry : u0.e(new p("Taiwan", "China Taiwan"), new p("台灣", "中國台灣"), new p("台湾", "中国台湾"), new p("Hong Kong", "China Hong Kong"), new p("香港", h.d(h.a(((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c())).equals("zh_TW") ? "中國香港" : "中国香港"), new p("Macao", "China Macao"), new p("Macau", "China Macau"), new p("澳門", "中國澳門"), new p("澳门", "中国澳门")).entrySet()) {
            str = new k(e5.f(entry.getKey(), "(?<!中国|中國|China )")).f(str, (String) entry.getValue());
        }
        return str;
    }

    public static f c(f fVar) {
        String strB;
        fVar.getClass();
        List<e> listB = fVar.b();
        ArrayList arrayList = new ArrayList(y.r(listB, 10));
        for (e eVarB : listB) {
            List listK = x.k("TWN", "HKG", "MAC");
            vo0.a address = eVarB.getAddress();
            vo0.a aVarB = null;
            String strB2 = null;
            if (h0.R(listK, address != null ? address.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String() : null)) {
                String title = eVarB.getTitle();
                b bVar = f165839a;
                if (title != null) {
                    bVar.getClass();
                    strB = b(title);
                } else {
                    strB = null;
                }
                vo0.a address2 = eVarB.getAddress();
                if (address2 != null) {
                    String label = eVarB.getAddress().getCom.google.firebase.messaging.Constants.ScionAnalytics.PARAM_LABEL java.lang.String();
                    if (label != null) {
                        bVar.getClass();
                        strB2 = b(label);
                    }
                    aVarB = vo0.a.b(address2, strB2);
                }
                eVarB = e.b(eVarB, strB, aVarB);
            }
            arrayList.add(eVarB);
        }
        return new f(arrayList);
    }
}
