package du2;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class f extends q implements l<rs2.c, Boolean> {
    public f(Object obj) {
        super(1, obj, g.a.class, "shouldShowAlertsDefault", "shouldShowAlertsDefault(Lcom/garmin/gfdi/DeviceInfo;)Z", 0);
    }

    @Override // e23.l
    public final Boolean invoke(rs2.c cVar) {
        Boolean boolC;
        rs2.c cVar2 = cVar;
        cVar2.getClass();
        ((g.a) this.receiver).getClass();
        boolean zBooleanValue = true;
        try {
            boolean z14 = lm2.h.f113619b;
            if (z14) {
                boolC = Boolean.valueOf(((em2.d) lm2.h.e()).e(new bm2.d(cVar2, null), 3));
            } else {
                boolC = sm2.g.c(cVar2);
            }
            g.f61294h.trace("shouldShowAlertsDefault: productNbr[" + cVar2.getF92744h() + "], enabled[" + boolC + "], pairingInit[" + z14 + "]");
            if (boolC != null) {
                zBooleanValue = boolC.booleanValue();
            }
        } catch (LinkageError unused) {
        } catch (Throwable th3) {
            g.f61294h.warn("shouldShowAlertsDefault: productNbr[" + cVar2.getF92744h() + "] failed", th3);
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
