package sr;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsr/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f160570b;

    public g(Context context) {
        context.getClass();
        this.f160569a = context;
        this.f160570b = new l22.a(context);
    }

    public final String a(Integer num) {
        if (num == null || num.intValue() == 0) {
            return this.f160570b.getString(R.string.no_duration_value);
        }
        l3.a aVar = l3.f23124b;
        long jIntValue = ((long) num.intValue()) * 1000;
        aVar.getClass();
        return l3.a.b1(jIntValue);
    }

    public final String b(Double d14, ns.u.a aVar) {
        String strC = u00.b.c(new ns.u(this.f160570b, aVar, false, null, 12, null), d14, 9, 4);
        return strC == null ? this.f160570b.getString(R.string.no_value) : strC;
    }
}
