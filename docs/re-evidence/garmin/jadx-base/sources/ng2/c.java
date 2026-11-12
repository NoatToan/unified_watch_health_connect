package ng2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class c extends q implements e23.q<ag2.c.a, Double, Boolean, String> {
    public c(Object obj) {
        super(3, obj, rg2.h.class, "formatValue", "formatValue(Lcom/garmin/android/livesessionview/models/definition/Item$ItemType;DZ)Ljava/lang/String;", 0);
    }

    @Override // e23.q
    public final String invoke(ag2.c.a aVar, Double d14, Boolean bool) {
        ag2.c.a aVar2 = aVar;
        double dDoubleValue = d14.doubleValue();
        boolean zBooleanValue = bool.booleanValue();
        aVar2.getClass();
        return ((rg2.h) this.receiver).y4(aVar2, dDoubleValue, zBooleanValue);
    }
}
