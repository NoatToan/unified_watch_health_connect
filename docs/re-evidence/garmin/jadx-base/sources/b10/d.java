package b10;

import android.content.Context;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lb10/d;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f14214d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f14215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u00.a f14216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14217c;

    static {
        new a(null);
    }

    public d(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f14215a = aVar;
        this.f14216b = new u00.a(aVar);
        this.f14217c = DateFormat.is24HourFormat(context);
    }

    public final String a(Integer num) {
        l22.a aVar = this.f14215a;
        if (num != null && num.intValue() == 0) {
            return aVar.getString(R.string.lbl_minimal);
        }
        if (num != null && num.intValue() == 1) {
            return aVar.getString(R.string.lbl_few);
        }
        if (num != null && num.intValue() == 2) {
            return aVar.getString(R.string.lbl_occasional);
        }
        return (num != null && num.intValue() == 3) ? aVar.getString(R.string.lbl_frequent) : b();
    }

    public final String b() {
        return this.f14215a.getString(R.string.no_value);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String c(String str) {
        String upperCase;
        if (str != null) {
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = str.toUpperCase(locale);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            int iHashCode = upperCase.hashCode();
            l22.a aVar = this.f14215a;
            switch (iHashCode) {
                case -30683114:
                    if (upperCase.equals("EXCELLENT")) {
                        return aVar.getString(R.string.lbl_excellent);
                    }
                    break;
                case 2150180:
                    if (upperCase.equals("FAIR")) {
                        return aVar.getString(R.string.lbl_fair);
                    }
                    break;
                case 2193597:
                    if (upperCase.equals("GOOD")) {
                        return aVar.getString(R.string.lbl_good);
                    }
                    break;
                case 2461730:
                    if (upperCase.equals("POOR")) {
                        return aVar.getString(R.string.lbl_poor);
                    }
                    break;
            }
        }
        return b();
    }

    public final String d(Integer num) {
        if (num == null) {
            return b();
        }
        int iIntValue = num.intValue();
        u00.a aVar = this.f14216b;
        if (iIntValue != 0) {
            return aVar.c(num.intValue());
        }
        String lowerCase = "0".concat(aVar.f167336a.getString(R.string.sleep_my_day_hour_unit)).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public final String e(Integer num) {
        String strValueOf;
        return (num == null || (strValueOf = String.valueOf(num.intValue())) == null) ? b() : strValueOf;
    }

    public final String f(long j8) throws ParseException {
        if (j8 == -1) {
            return b();
        }
        double dFloor = Math.floor(j8 / 60.0d);
        double d14 = 60;
        double d15 = dFloor / d14;
        double dCeil = Math.ceil(dFloor % d14);
        Object obj = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(((int) d15) + ":" + ((int) dCeil));
        if (obj == null) {
            obj = "";
        }
        String str = new SimpleDateFormat(this.f14217c ? "HH:mm" : "h:mm a", Locale.getDefault()).format(obj);
        str.getClass();
        return str;
    }

    public final String g(long j8) throws ParseException {
        if (j8 == -1) {
            return b();
        }
        double dFloor = Math.floor(j8 / 60.0d);
        double d14 = 60;
        double d15 = dFloor / d14;
        double dCeil = Math.ceil(dFloor % d14);
        Object obj = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(((int) d15) + ":" + ((int) dCeil));
        if (obj == null) {
            obj = "";
        }
        String str = new SimpleDateFormat(this.f14217c ? "HH:mm" : "h:mm", Locale.getDefault()).format(obj);
        str.getClass();
        return str;
    }

    public final String h(long j8) throws ParseException {
        if (this.f14217c || j8 == -1) {
            return null;
        }
        double dFloor = Math.floor(j8 / 60.0d);
        double d14 = 60;
        double d15 = dFloor / d14;
        double dCeil = Math.ceil(dFloor % d14);
        Object obj = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(((int) d15) + ":" + ((int) dCeil));
        if (obj == null) {
            obj = "";
        }
        return new SimpleDateFormat("a", Locale.getDefault()).format(obj);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lb10/d$a;", "", "<init>", "()V", "", "QUALIFIER_KEY_EXCELLENT", "Ljava/lang/String;", "QUALIFIER_KEY_POOR", "QUALIFIER_KEY_FAIR", "QUALIFIER_KEY_GOOD", "", "ONE_MINUTE_IN_SECONDS", "I", "ONE_HOUR_IN_MINUTES", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
