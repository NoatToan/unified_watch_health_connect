package id2;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lid2/d;", "Lid2/e;", "", "appName", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "(Ljava/lang/String;I)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93039c;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context) {
        context.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this(packageName, kd2.a.a(applicationContext));
    }

    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("Garmin-Client-Name", this.f93038b).header("Garmin-Client-Version", this.f93039c).header("Garmin-Client-Platform", "Android").header("Garmin-Client-Platform-Version", String.valueOf(Build.VERSION.SDK_INT)).build());
    }

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f93038b = str;
        this.f93039c = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, int i14) {
        this(str, String.valueOf(i14));
        str.getClass();
    }
}
