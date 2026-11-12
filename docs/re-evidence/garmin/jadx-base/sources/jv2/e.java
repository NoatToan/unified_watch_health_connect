package jv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import dv0.n;
import gw2.j;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljv2/e;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class e extends ev2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
    }

    @Override // zw2.f
    public final void h(dx2.c cVar, Map map, Object obj) {
        cVar.getClass();
        map.getClass();
        Integer numP4 = dx2.c.P4(map);
        if (numP4 != null) {
            cVar.c5(this.f207282a, j.INTEGER_PICKER, numP4.intValue(), obj.toString(), new n(2));
        }
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        d dVarK4 = cVar.K4(map);
        tv2.c cVar2 = dVarK4 != null ? dVarK4.f101198b : null;
        if (cVar2 == null) {
            return "";
        }
        String strB = b(cVar2);
        return strB.length() > 0 ? strB : "";
    }
}
