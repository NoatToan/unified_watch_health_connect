package gh2;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes11.dex */
public class o extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f77477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f77478c;

    public class a implements Observer {
        public a() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            o oVar = o.this;
            oVar.setChanged();
            oVar.notifyObservers(obj);
        }
    }

    public o(n nVar) {
        a aVar = new a();
        this.f77478c = aVar;
        nVar.getClass();
        n nVar2 = this.f77477b;
        if (nVar2 != null) {
            nVar2.deleteObserver(aVar);
        }
        this.f77477b = nVar;
        nVar.addObserver(aVar);
    }

    @Override // gh2.n
    public final void b() {
        this.f77477b.b();
    }

    @Override // gh2.n
    public final boolean c(String str) {
        return this.f77477b.c(str);
    }

    @Override // gh2.n
    public final String d() {
        return this.f77477b.d();
    }

    @Override // gh2.n
    public final Pair[] e() {
        return this.f77477b.e();
    }

    @Override // gh2.n
    public final FirebaseRemoteConfigInfo f() {
        return this.f77477b.f();
    }

    @Override // gh2.n
    public final long g(String str) {
        return this.f77477b.g(str);
    }

    @Override // gh2.n
    public final String h(String str) {
        return this.f77477b.h(str);
    }

    @Override // gh2.n
    public final void i() {
        this.f77477b.i();
    }
}
