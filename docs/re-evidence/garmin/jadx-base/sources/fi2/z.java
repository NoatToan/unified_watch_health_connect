package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/z;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class z extends ei2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(context);
        context.getClass();
    }

    public static void t(ii2.b bVar, Map map, Boolean bool, Boolean bool2) {
        if (bool != null) {
            bVar.L4(bool, String.valueOf(map.get(mh2.i.ALL_DAY_VALUE_ID.f118617a)));
        }
        if (bool2 != null) {
            bVar.L4(bool2, String.valueOf(map.get(mh2.i.SLEEP_VALUE_ID.f118617a)));
        }
    }

    public static /* synthetic */ void u(z zVar, ii2.b bVar, Map map, Boolean bool, int i14) {
        Boolean bool2 = Boolean.FALSE;
        if ((i14 & 4) != 0) {
            bool2 = null;
        }
        if ((i14 & 8) != 0) {
            bool = null;
        }
        zVar.getClass();
        t(bVar, map, bool2, bool);
    }

    public void r(boolean z14, x xVar) {
        xVar.invoke(Boolean.FALSE);
    }

    public void s(boolean z14, y yVar) {
        yVar.invoke(Boolean.FALSE);
    }
}
