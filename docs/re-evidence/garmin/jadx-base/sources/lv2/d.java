package lv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ev2.e;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llv2/d;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ev2.e
    public final Long k(dx2.c cVar, Map<String, ? extends Object> map) {
        Long l14;
        c cVarQ4 = cVar.Q4(map);
        if (cVarQ4 == null || (l14 = cVarQ4.f115054d) == null) {
            return null;
        }
        return l14;
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        c cVarQ4 = cVar.Q4(map);
        if (cVarQ4 == null) {
            return "";
        }
        String strB = b(cVarQ4.f115052b);
        return strB.length() > 0 ? strB : "";
    }
}
