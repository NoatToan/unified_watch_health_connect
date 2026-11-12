package d52;

import android.content.Context;
import c22.l3;
import c22.m3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.text.NumberFormat;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ld52/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f57567c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f57568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f57569b;

    static {
        new a(null);
    }

    public e(Context context) {
        context.getClass();
        this.f57568a = context;
        this.f57569b = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.KILOMETER : m3.MILE;
    }

    public static String b(int i14) {
        String str = NumberFormat.getIntegerInstance().format(i14);
        str.getClass();
        return str;
    }

    public final String a(Integer num) {
        if (num == null || num.intValue() < 0) {
            return f();
        }
        l3.a aVar = l3.f23124b;
        double dIntValue = num.intValue();
        aVar.getClass();
        return l3.a.P(this.f57568a, dIntValue, this.f57569b, l3.f23130h, false, f());
    }

    public final String c(Integer num) {
        if (num == null) {
            return f();
        }
        String str = NumberFormat.getIntegerInstance().format(num);
        str.getClass();
        return str;
    }

    public final b92.a d(String str) {
        Context context = this.f57568a;
        String strO = xy2.b.O(context, str);
        return wz1.a.a(oi0.c.A(context, new com.google.maps.android.compose.clustering.d(24), context.getString(R.string.lbl_average_daily)) + StringUtils.SPACE + strO);
    }

    public final String e(Integer num) {
        if (num == null || num.intValue() < 0) {
            return "";
        }
        String string = this.f57568a.getString(this.f57569b.f23164e);
        string.getClass();
        return string;
    }

    public final String f() {
        String string = this.f57568a.getString(R.string.no_value);
        string.getClass();
        return string;
    }

    public final String g(String str) {
        String string = this.f57568a.getString(R.string.lbl_pushes);
        return zl.a.c(string, str, StringUtils.SPACE, string);
    }

    public final b92.a h(String str, String str2, String str3) {
        str2.getClass();
        String strO = xy2.b.O(this.f57568a, str);
        if (str3 == null) {
            str3 = "";
        }
        StringBuilder sbL = e5.l(str2, StringUtils.SPACE, strO, StringUtils.SPACE, str3);
        sbL.append(StringUtils.SPACE);
        return wz1.a.a(sbL.toString());
    }

    public final b92.a i(String str) {
        Context context = this.f57568a;
        String strO = xy2.b.O(context, str);
        return wz1.a.a(oi0.c.A(context, new com.google.maps.android.compose.clustering.d(23), context.getString(R.string.lbl_average_weekly)) + StringUtils.SPACE + strO);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld52/e$a;", "", "<init>", "()V", "", "EMPTY_STRING", "Ljava/lang/String;", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
