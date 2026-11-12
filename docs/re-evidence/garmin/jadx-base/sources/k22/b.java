package k22;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk22/b;", "Lk22/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f102454a;

    public b(Context context) {
        context.getClass();
        this.f102454a = context;
    }

    @Override // k22.a
    public final String a(String str, String... strArr) {
        str.getClass();
        Context context = this.f102454a;
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier, Arrays.copyOf(strArr, strArr.length));
        }
        return null;
    }

    @Override // k22.a
    public final String b(Object... objArr) {
        String string = this.f102454a.getString(R.string.device_settings_group_ride_canned_msg_18, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    @Override // k22.a
    public final String[] c(int i14) {
        return this.f102454a.getResources().getStringArray(i14);
    }

    @Override // k22.a
    public final String d(String str) {
        str.getClass();
        Context context = this.f102454a;
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            return context.getString(identifier);
        }
        return null;
    }

    @Override // k22.a
    public final String getString(int i14) {
        return this.f102454a.getString(i14);
    }
}
