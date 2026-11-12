package ye;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001:\u0001\tB!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lye/c;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Lye/b;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Le23/l;)V", "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f196780b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<b, Unit> f196781a;

    /* JADX WARN: Multi-variable type inference failed */
    private c(e23.l<? super b, Unit> lVar) {
        this.f196781a = lVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        u uVarA = u.a();
        int i14 = l.f196812a;
        uVarA.getClass();
        this.f196781a.invoke(b.a.f196778a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        u uVarA = u.a();
        int i14 = l.f196812a;
        uVarA.getClass();
        this.f196781a.invoke(new b.C3684b(7));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lye/c$a;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(lVar);
    }
}
