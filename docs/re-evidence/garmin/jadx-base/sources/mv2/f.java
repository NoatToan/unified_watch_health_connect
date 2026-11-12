package mv2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import dv0.n;
import gw2.j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmv2/f;", "Lev2/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class f extends ev2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        context.getClass();
    }

    public static a m(long j8) {
        int i14 = (int) (j8 / ((long) DateTimeConstants.SECONDS_PER_HOUR));
        long j14 = j8 - ((long) (i14 * DateTimeConstants.SECONDS_PER_HOUR));
        int i15 = (int) (j14 / ((long) 60));
        return new a(i14, i15, (int) (j14 - ((long) (i15 * 60))));
    }

    @Override // zw2.f
    public final void h(dx2.c cVar, Map map, Object obj) {
        cVar.getClass();
        map.getClass();
        List list = null;
        try {
            if (!(obj instanceof List)) {
                obj = null;
            }
            list = (List) obj;
        } catch (ClassCastException unused) {
        }
        if (list != null) {
            int iIntValue = ((Number) list.get(0)).intValue();
            long seconds = TimeUnit.MINUTES.toSeconds(((Number) list.get(1)).intValue()) + TimeUnit.HOURS.toSeconds(iIntValue) + ((long) ((Number) list.get(2)).intValue());
            Integer numP4 = dx2.c.P4(map);
            if (numP4 != null) {
                cVar.c5(this.f207282a, j.TIME_PICKER, numP4.intValue(), Long.valueOf(seconds), new n(2));
            }
        }
    }

    @Override // ev2.e
    public final String l(dx2.c cVar, Map<String, ? extends Object> map) {
        e eVarW4 = cVar.W4(map);
        tv2.c cVar2 = eVarW4 != null ? eVarW4.f121208b : null;
        if (cVar2 == null) {
            return "";
        }
        String strB = b(cVar2);
        return strB.length() > 0 ? strB : "";
    }
}
