package sy;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsy/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f161151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f161152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161153c;

    public a(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f161151a = aVar;
        this.f161152b = new pi0.e(context);
        this.f161153c = aVar.getString(R.string.no_value);
    }

    public final String a(Integer num) {
        if (num == null || num.intValue() == 0) {
            return this.f161153c;
        }
        l3.f23124b.getClass();
        String str = l3.f23131i.format(num.intValue());
        str.getClass();
        return str;
    }
}
