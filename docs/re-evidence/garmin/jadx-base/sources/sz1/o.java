package sz1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsz1/o;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-training-readiness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f161565b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161566a;

        static {
            int[] iArr = new int[oz1.c.values().length];
            try {
                iArr[oz1.c.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz1.c.RECOVERY_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz1.c.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[oz1.c.ACUTE_LOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[oz1.c.RECENT_SLEEP_SCORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[oz1.c.RECENT_STRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[oz1.c.RECENT_DIVES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f161566a = iArr;
        }
    }

    public o(Context context) {
        context.getClass();
        this.f161564a = context;
        this.f161565b = new l22.a(context);
    }

    public final String a(oz1.b bVar, Boolean bool) {
        Object next;
        pi0.e eVar = new pi0.e(this.f161564a);
        String timestampLocal = bVar.getTimestampLocal();
        if (timestampLocal == null) {
            timestampLocal = bVar.getTimestamp();
        }
        String strC = eVar.c(new DateTime(timestampLocal), qi0.f.RELATIVE_24H_AM_PM_TIME);
        oz1.t.a aVar = oz1.t.f134619c;
        String inputContext = bVar.getInputContext();
        aVar.getClass();
        Iterator<T> it = oz1.t.f134624h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((oz1.t) next).f134625a, inputContext));
        oz1.t tVar = (oz1.t) next;
        boolean zEquals = bool.equals(Boolean.TRUE);
        l22.a aVar2 = this.f161565b;
        return (!zEquals || tVar == null) ? aVar2.a(R.string.tr_updated_at, strC) : aVar2.a(R.string.value_dot_value, aVar2.a(R.string.tr_updated_at, strC), aVar2.getString(tVar.f134626b));
    }
}
