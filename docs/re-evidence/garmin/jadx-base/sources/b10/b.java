package b10;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lb10/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f14208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f14209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u00.a f14210d;

    public b(Context context) {
        context.getClass();
        this.f14207a = context;
        l22.a aVar = new l22.a(context);
        this.f14208b = aVar;
        this.f14209c = new d(context);
        this.f14210d = new u00.a(aVar);
    }

    public final String a(long j8) {
        d dVar = this.f14209c;
        String string = dVar.f14215a.getString(R.string.sleep_lbl_bedtime);
        return j8 != -1 ? e5.g(dVar.f(j8), StringUtils.SPACE, g(string)) : h(string);
    }

    public final String b(int i14) {
        String string = this.f14209c.f14215a.getString(R.string.lbl_score);
        return i14 >= 0 ? e.d(i14, StringUtils.SPACE, g(string)) : h(string);
    }

    public final String c(Integer num) {
        String string = this.f14209c.f14215a.getString(R.string.lbl_sleep_duration);
        return (num == null || num.intValue() <= 0) ? h(string) : e5.g(this.f14210d.e(num.intValue()), StringUtils.SPACE, g(string));
    }

    public final String d(Integer num) {
        String string = this.f14209c.f14215a.getString(R.string.lbl_sleep_need);
        return num.intValue() > 0 ? e5.g(this.f14210d.e(num.intValue()), StringUtils.SPACE, g(string)) : h(string);
    }

    public final String e(long j8) {
        d dVar = this.f14209c;
        String string = dVar.f14215a.getString(R.string.sleep_lbl_wake_time);
        return j8 != -1 ? e5.g(dVar.f(j8), StringUtils.SPACE, g(string)) : h(string);
    }

    public final String f(Integer num) {
        String string = this.f14209c.f14215a.getString(R.string.lbl_score);
        l22.a aVar = this.f14208b;
        return (num == null || num.intValue() < 0) ? e5.g(string, StringUtils.SPACE, aVar.getString(R.string.txt_empty_page_no_data)) : h0.k0(x.k(aVar.a(R.string.msg_value_out_of_100, num), string), StringUtils.SPACE, null, null, null, 62);
    }

    public final String g(String str) {
        String string = this.f14207a.getString(R.string.lbl_average);
        return zl.a.c(string, string, StringUtils.SPACE, str);
    }

    public final String h(String str) {
        return e5.g(g(str), StringUtils.SPACE, this.f14208b.getString(R.string.txt_empty_page_no_data));
    }

    public final String i(String str) {
        Context context = this.f14207a;
        String string = context.getString(R.string.lbl_average);
        string.getClass();
        String string2 = context.getString(R.string.common_weekly);
        string2.getClass();
        return string + StringUtils.SPACE + string2 + StringUtils.SPACE + str;
    }
}
