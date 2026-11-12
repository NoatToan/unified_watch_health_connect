package u10;

import android.content.Context;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;

/* JADX INFO: loaded from: classes7.dex */
public class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectIQOAuthRequest f167763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f167764b;

    public m(Context context, ConnectIQOAuthRequest connectIQOAuthRequest) {
        this.f167764b = context;
        this.f167763a = connectIQOAuthRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConnectIQOAuthRequest connectIQOAuthRequest = this.f167763a;
        Context context = this.f167764b;
        context.startActivity(s10.b.h(context, connectIQOAuthRequest));
    }
}
