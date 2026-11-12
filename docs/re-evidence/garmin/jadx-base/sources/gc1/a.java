package gc1;

import android.content.Context;
import androidx.core.view.j;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import pi0.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgc1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.a f76926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f76927c;

    public a(Context context) {
        context.getClass();
        this.f76925a = context;
        this.f76926b = new l22.a(context);
        this.f76927c = new e(context);
    }

    public static String a(a aVar, Float f14) {
        if (f14 != null) {
            aVar.getClass();
            if (f14.floatValue() > 0.0f) {
                return j.f((int) f14.floatValue(), " %");
            }
        }
        return aVar.f76926b.getString(R.string.no_value_card).concat(" %");
    }
}
