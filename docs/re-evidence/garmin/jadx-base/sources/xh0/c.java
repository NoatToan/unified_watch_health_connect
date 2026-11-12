package xh0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxh0/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f190978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f190979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190980c;

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        this.f190978a = context;
        String string = context.getString(R.string.arrow_up);
        string.getClass();
        this.f190979b = string;
        String string2 = context.getString(R.string.arrow_down);
        string2.getClass();
        this.f190980c = string2;
    }

    public static String a(float f14) {
        return String.valueOf(MathKt.c(f14));
    }

    public static String b(double d14) {
        return String.valueOf((int) Math.floor(d14));
    }

    public static b92.a c(String str, String str2) {
        str2.getClass();
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        c0235a.f16962a.put(str, str2);
        return c0235a.b();
    }

    public final String d(Double d14) {
        if (d14 == null) {
            return e();
        }
        String strB = b(d14.doubleValue());
        String string = this.f190978a.getString(R.string.lbl_floors_climbed);
        string.getClass();
        return strB + string;
    }

    public final String e() {
        String string = this.f190978a.getString(R.string.txt_empty_page_no_data);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxh0/c$a;", "", "<init>", "()V", "", "NO_VALUE", "I", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
