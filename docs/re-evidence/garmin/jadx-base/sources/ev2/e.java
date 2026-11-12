package ev2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cx2.h;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lev2/e;", "Lzw2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class e extends zw2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f66172b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        this.f66172b = new h("DoubleLabelTransform", null, 2, null);
    }

    public Long k(dx2.c cVar, Map<String, ? extends Object> map) {
        c cVarD4 = cVar.D4(map);
        if (cVarD4 != null) {
            Long l14 = cVarD4.f66167b;
            if (l14 == null) {
                l14 = cVarD4.f66168c;
            }
            if (l14 != null) {
                return l14;
            }
            this.f66172b.d(null, "Did not get display value for " + map);
        }
        return null;
    }

    public String l(dx2.c cVar, Map<String, ? extends Object> map) {
        c cVarD4 = cVar.D4(map);
        if (cVarD4 == null) {
            return "";
        }
        String strB = b(cVarD4.f66166a);
        if (strB.length() > 0) {
            return strB;
        }
        this.f66172b.d(null, "Did not get display value for " + map);
        return "";
    }
}
