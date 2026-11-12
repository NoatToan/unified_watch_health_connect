package n41;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import pi0.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln41/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-overnighthrv_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f123602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f123603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f123604d;

    public a(Context context) {
        context.getClass();
        this.f123601a = context;
        this.f123602b = new l22.a(context);
        this.f123603c = new e(context);
        this.f123604d = "ms";
    }

    public static String a(a aVar, Integer num) {
        if (num != null) {
            aVar.getClass();
            if (num.intValue() > 0) {
                return aVar.b(num.intValue());
            }
        }
        return aVar.f123602b.getString(R.string.no_value_card);
    }

    public final String b(int i14) {
        l22.a aVar = this.f123602b;
        return aVar.a(R.string.string_space_string_pattern, Integer.valueOf(i14), aVar.getString(R.string.lbl_ms));
    }
}
