package wn;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwn/a;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f186092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186093b;

    public a(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f186092a = aVar;
        this.f186093b = aVar.getString(R.string.no_value);
    }

    public final String a(Double d14) {
        String strValueOf;
        return (d14 == null || (strValueOf = String.valueOf((int) d14.doubleValue())) == null) ? this.f186093b : strValueOf;
    }

    public abstract g b(int i14, T t7);

    public final String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.equals(this.f186093b)) {
            return null;
        }
        return str2;
    }
}
