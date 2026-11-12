package b10;

import android.content.Context;
import android.text.format.DateFormat;
import b63.u;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lb10/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f14205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14206b;

    static {
        new C0201a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f14205a = new l22.a(context);
        this.f14206b = DateFormat.is24HourFormat(context);
    }

    public static String b(a aVar, u uVar, int i14) {
        boolean z14 = (i14 & 4) == 0;
        if (uVar == null) {
            return aVar.f14205a.getString(R.string.no_value_card);
        }
        String str = DateTimeFormatter.ofPattern(aVar.d(true, z14), Locale.ROOT).format(uVar.f16216a);
        str.getClass();
        return str;
    }

    public final String a(u uVar, u uVar2, boolean z14) {
        if (uVar == null || uVar2 == null) {
            return null;
        }
        String strB = b(this, uVar, 2);
        Locale locale = Locale.ROOT;
        String lowerCase = strB.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = b(this, uVar2, 2).toLowerCase(locale);
        lowerCase2.getClass();
        return this.f14205a.a(z14 ? R.string.msg_to_achieve_your_sleep_need_go_to_bed_between_range_hour : R.string.msg_your_recommended_bedtime_was_between_range_hour, lowerCase, lowerCase2);
    }

    public final String c(u uVar) {
        if (uVar == null || this.f14206b) {
            return "";
        }
        String str = DateTimeFormatter.ofPattern("a", Locale.ROOT).format(uVar.f16216a);
        str.getClass();
        return str;
    }

    public final String d(boolean z14, boolean z15) {
        if (this.f14206b) {
            return z14 ? "HH:mm" : "HH";
        }
        if (z14 && z15) {
            return "h:mm a";
        }
        if (z14) {
            return "h:mm";
        }
        return z15 ? "ha" : "h";
    }

    /* JADX INFO: renamed from: b10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb10/a$a;", "", "<init>", "()V", "", "DATE_FORMAT_HOUR_MINUTE_OF_DAY_NO_AM_PM", "Ljava/lang/String;", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0201a {
        public /* synthetic */ C0201a(j jVar) {
            this();
        }

        private C0201a() {
        }
    }
}
