package zv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import gw2.i;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import zw2.f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzv2/b;", "Lzw2/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class b extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // zw2.f
    public Integer g(Map<String, ? extends Object> map) {
        Integer num;
        map.getClass();
        try {
            Object obj = map.get(i.LINK_OPTIONS.f79975a);
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (!s.g(map2 != null ? map2.get(i.DEST_PAGE.f79975a) : null, "ECG_SETUP")) {
                if (!s.g(map2 != null ? map2.get(i.DEST_PAGE.f79975a) : null, "ECG_FEATURE")) {
                    num = null;
                }
                if (num == null) {
                    return null;
                }
                return num;
            }
            num = 8;
        } catch (Exception unused) {
        }
        if (num == null) {
            return null;
        }
        return num;
    }
}
