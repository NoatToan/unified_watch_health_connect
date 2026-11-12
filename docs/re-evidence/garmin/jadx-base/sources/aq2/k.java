package aq2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import fo2.l0;
import java.lang.reflect.Type;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00050\u0001¨\u0006\u0006"}, d2 = {"aq2/k$a", "Lcom/google/gson/reflect/TypeToken;", "Las2/g;", "Lfo2/l0;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "Lcom/garmin/feature/garminpay/providers/gpay/TransitCard;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends TypeToken<as2.g<l0, CurrencyValue>> {
    }

    public static final as2.g<l0, CurrencyValue> a(fs2.a aVar) {
        aVar.getClass();
        Type type = new a().getType();
        type.getClass();
        j.f12491a.getClass();
        Gson gsonD = j.d();
        Object objFromJson = null;
        if (!s.g(aVar.f73435j, "")) {
            try {
                objFromJson = gsonD.fromJson(aVar.f73435j, type);
            } catch (Exception unused) {
            }
        }
        as2.g<l0, CurrencyValue> gVar = (as2.g) objFromJson;
        if (gVar != null) {
            return gVar;
        }
        o2.c.m(am.j.m("Cannot parse ", aVar.f73435j, " as TransitCard"));
        return null;
    }

    public static final qs2.a b(String str) {
        str.getClass();
        qs2.a aVar = qs2.a.f147388q;
        if (str.equals(aVar.f147399d)) {
            return aVar;
        }
        vb.h.z(am.j.m("Unhandled card type '", str, "'"));
        return null;
    }
}
