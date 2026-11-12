package az0;

import android.content.Context;
import android.net.ConnectivityManager;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Laz0/e;", "Laz0/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f13694a;

    public e(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        this.f13694a = (ConnectivityManager) systemService;
    }

    @Override // az0.c
    public final r53.b a() {
        return s.f(new d(this, null));
    }
}
