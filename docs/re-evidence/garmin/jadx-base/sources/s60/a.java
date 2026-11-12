package s60;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import oi0.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import pi0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ls60/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f157613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f157614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f157615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f157616d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f157617a;

        static {
            int[] iArr = new int[s60.b.values().length];
            try {
                iArr[s60.b.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s60.b.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s60.b.ABBREVIATED_NO_SPACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f157617a = iArr;
        }
    }

    static {
        new C2978a(null);
    }

    public a(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f157613a = aVar;
        this.f157614b = new e(context);
        this.f157615c = new h(context);
        this.f157616d = aVar.getString(R.string.no_value);
    }

    public final String a(Double d14, s60.b bVar) {
        int i14;
        int i15 = bVar == null ? -1 : b.f157617a[bVar.ordinal()];
        if (i15 != 1) {
            i14 = R.string.common_abbrev_n_meters_label;
            if (i15 != 2 && i15 == 3) {
                i14 = R.string.common_abbrev_n_meters_no_space_label;
            }
        } else {
            i14 = R.string.common_n_meters_label;
        }
        l22.a aVar = this.f157613a;
        String strA = aVar.a(i14, "100");
        if (d14 == null || Double.isNaN(d14.doubleValue()) || s.c(d14, 0.0d)) {
            String string = aVar.getString(R.string.no_duration_value);
            return bVar != null ? aVar.a(R.string.string_slash_string_pattern, string, strA) : string;
        }
        l3.a aVar2 = l3.f23124b;
        double dDoubleValue = d14.doubleValue();
        aVar2.getClass();
        String strW0 = l3.a.w0(l3.a.r(dDoubleValue, true));
        if (bVar != null) {
            return bVar == s60.b.ABBREVIATED_NO_SPACE ? aVar.a(R.string.string_slash_string_no_second_space_pattern, strW0, strA) : aVar.a(R.string.string_slash_string_pattern, strW0, strA);
        }
        return strW0;
    }

    public final String b(double d14) {
        l22.a aVar = this.f157613a;
        if (d14 == 0.0d || Double.isNaN(d14)) {
            return aVar.getString(R.string.common_no_data);
        }
        String strA = aVar.a(R.string.common_n_meters_label, aVar.getString(R.string.lbl_value_one_hundred));
        l3.f23124b.getClass();
        return aVar.a(R.string.string_per_string_pattern, this.f157615c.d(l3.a.r(d14, true), true), strA);
    }

    /* JADX INFO: renamed from: s60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls60/a$a;", "", "<init>", "()V", "", "ONE_HUNDRED", "Ljava/lang/String;", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2978a {
        public /* synthetic */ C2978a(j jVar) {
            this();
        }

        private C2978a() {
        }
    }
}
