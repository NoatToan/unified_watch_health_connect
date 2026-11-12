package mo0;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import mi0.i;
import oi0.c;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmo0/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f119868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fo0.a f119869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f119870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l22.a f119871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w00.b f119872e;

    public a(Context context) {
        context.getClass();
        this.f119868a = context;
        this.f119869b = (fo0.a) KoinJavaComponent.get$default(fo0.a.class, null, null, 6, null);
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f119870c = string;
        l22.a aVar = new l22.a(context);
        this.f119871d = aVar;
        this.f119872e = new w00.b(aVar);
    }

    public final String a(double d14) {
        String str = this.f119870c;
        if (d14 <= 0.0d) {
            return str;
        }
        l3.f23124b.getClass();
        return l3.a.k0(this.f119871d, d14, false, str);
    }

    public final String b(Integer num) {
        l3.a aVar = l3.f23124b;
        double dIntValue = num != null ? num.intValue() : -1.0d;
        aVar.getClass();
        return l3.a.k0(this.f119871d, dIntValue, true, this.f119870c);
    }

    public final String c(Integer num, String str) {
        str.getClass();
        Context context = this.f119868a;
        l22.a aVar = this.f119871d;
        return (num == null || num.intValue() <= 0) ? aVar.a(R.string.string_space_string_pattern, c.A(context, new i(10), str), aVar.getString(R.string.txt_empty_page_no_data)) : aVar.a(R.string.string_space_string_space_string_pattern, c.A(context, new i(11), str), num, aVar.getString(R.string.lbl_heart_rate_beats_per_minute));
    }
}
