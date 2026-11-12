package j00;

import android.content.Context;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj00/e;", "Lj00/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz.a f95971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95972b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95973a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95973a = iArr;
        }
    }

    public e(Context context) {
        context.getClass();
        this.f95971a = new jz.a(new l22.a(context));
        this.f95972b = DateFormat.is24HourFormat(context);
    }

    @Override // j00.b
    public final String a(DateTime dateTime, d dVar) {
        dVar.getClass();
        int i14 = a.f95973a[dVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? super.a(dateTime, dVar) : b(dateTime);
        }
        return c(dateTime);
    }

    public String b(DateTime dateTime) {
        return this.f95971a.b(dateTime, this.f95972b);
    }

    public String c(DateTime dateTime) {
        return this.f95971a.b(dateTime, this.f95972b);
    }
}
