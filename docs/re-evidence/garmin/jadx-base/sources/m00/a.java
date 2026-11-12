package m00;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ss.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lm00/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll22/b;", "resourceResolver", "<init>", "(Landroid/content/Context;Ll22/b;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f115515e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f115516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f115517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f115518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f115519d;

    static {
        new C2200a(null);
        f115515e = 8;
    }

    public a(Context context, l22.b bVar) {
        context.getClass();
        bVar.getClass();
        this.f115516a = context;
        this.f115517b = bVar;
        this.f115518c = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).g();
        this.f115519d = bVar.getString(R.string.no_value);
    }

    public final String a(Double d14, boolean z14) {
        if (d14 != null) {
            String strB = k.b(ls.e.ASCENT, this.f115517b, d14, z14 ? 1 : 16);
            if (strB != null) {
                return strB;
            }
        }
        return this.f115519d;
    }

    public final String b(Double d14) {
        String strB;
        String str = this.f115519d;
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue()) || (strB = k.b(ls.e.AVERAGE_CYCLING_CADENCE, this.f115517b, d14, 1)) == null) ? str : strB;
    }

    public final String c(Double d14) {
        l22.b bVar = this.f115517b;
        if (d14 == null) {
            String lowerCase = bVar.getString(R.string.lbl_grade).toLowerCase(Locale.ROOT);
            return zl.a.c(lowerCase, this.f115519d, StringUtils.SPACE, lowerCase);
        }
        String str = l3.f23126d.format(d14.doubleValue());
        str.getClass();
        return bVar.a(R.string.grade_percent, str);
    }

    public final String d(Double d14) {
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue())) ? this.f115519d : tn.k.g(l3.f23126d.format(d14.doubleValue()), "%");
    }

    public final String e(double d14, Double d15) {
        String str = this.f115519d;
        if (d15 == null || Double.isNaN(d14) || Double.isInfinite(d14) || d14 == 0.0d) {
            return str;
        }
        String strB = k.b(ls.e.AVERAGE_POWER_PER_KG, this.f115517b, u0.h(d14, d15), 16);
        return strB == null ? str : strB;
    }

    public final String f(Double d14) {
        String strB;
        String str = this.f115519d;
        return (d14 == null || Double.isNaN(d14.doubleValue()) || Double.isInfinite(d14.doubleValue()) || (strB = k.b(ls.e.BIKE_SPEED, this.f115517b, d14, 1)) == null) ? str : strB;
    }

    public final String g(Integer num) {
        l22.b bVar = this.f115517b;
        return (num == null || num.intValue() <= 0) ? bVar.getString(R.string.lbl_single_climb) : bVar.a(R.string.lbl_climb_number, String.valueOf(num.intValue()));
    }

    public final String h(int i14) {
        return i14 == -1 ? "" : this.f115517b.getString(i14);
    }

    /* JADX INFO: renamed from: m00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lm00/a$a;", "", "<init>", "()V", "", "HORS_CATEGORY", "Ljava/lang/String;", "FIRST_CATEGORY", "SECOND_CATEGORY", "THIRD_CATEGORY", "FOURTH_CATEGORY", "FIFTH_CATEGORY", "SIXTH_CATEGORY", "NONE", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2200a {
        public /* synthetic */ C2200a(j jVar) {
            this();
        }

        private C2200a() {
        }
    }

    public /* synthetic */ a(Context context, l22.b bVar, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? new l22.a(context) : bVar);
    }
}
