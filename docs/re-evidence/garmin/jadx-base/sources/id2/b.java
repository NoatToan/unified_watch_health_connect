package id2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lid2/b;", "Lid2/e;", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "(I)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93036b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(kd2.a.a(context));
        context.getClass();
    }

    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("X-Garmin-Paired-App-Version", this.f93036b).header("X-Garmin-Client-Platform", "Android").build());
    }

    public b(String str) {
        str.getClass();
        this.f93036b = str;
    }

    public b(int i14) {
        this(String.valueOf(i14));
    }
}
