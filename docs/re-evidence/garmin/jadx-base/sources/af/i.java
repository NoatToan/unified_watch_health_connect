package af;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laf/i;", "Laf/g;", "Lye/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lef/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lef/b;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends g<ye.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f3024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f3025g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"af/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            network.getClass();
            networkCapabilities.getClass();
            u uVarA = u.a();
            int i14 = j.f3027a;
            networkCapabilities.toString();
            uVarA.getClass();
            i.this.b(new ye.f(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            network.getClass();
            u uVarA = u.a();
            int i14 = j.f3027a;
            uVarA.getClass();
            i iVar = i.this;
            iVar.b(j.a(iVar.f3024f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, ef.b bVar) {
        super(context, bVar);
        context.getClass();
        bVar.getClass();
        Object systemService = this.f3019b.getSystemService("connectivity");
        systemService.getClass();
        this.f3024f = (ConnectivityManager) systemService;
        this.f3025g = new a();
    }

    @Override // af.g
    public final ye.f a() {
        return j.a(this.f3024f);
    }

    @Override // af.g
    public final void c() {
        try {
            u uVarA = u.a();
            int i14 = j.f3027a;
            uVarA.getClass();
            ConnectivityManager connectivityManager = this.f3024f;
            a aVar = this.f3025g;
            connectivityManager.getClass();
            aVar.getClass();
            connectivityManager.registerDefaultNetworkCallback(aVar);
        } catch (IllegalArgumentException unused) {
            u uVarA2 = u.a();
            int i15 = j.f3027a;
            uVarA2.getClass();
        } catch (SecurityException unused2) {
            u uVarA3 = u.a();
            int i16 = j.f3027a;
            uVarA3.getClass();
        }
    }

    @Override // af.g
    public final void d() {
        try {
            u uVarA = u.a();
            int i14 = j.f3027a;
            uVarA.getClass();
            this.f3024f.unregisterNetworkCallback(this.f3025g);
        } catch (IllegalArgumentException unused) {
            u uVarA2 = u.a();
            int i15 = j.f3027a;
            uVarA2.getClass();
        } catch (SecurityException unused2) {
            u uVarA3 = u.a();
            int i16 = j.f3027a;
            uVarA3.getClass();
        }
    }
}
