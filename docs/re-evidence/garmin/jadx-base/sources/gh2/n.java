package gh2;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import java.util.Observable;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f77476a = m.a("RemoteConfiguration");

    public final void a() {
        f77476a.debug("dump:\n" + d());
    }

    public abstract void b();

    public abstract boolean c(String str);

    public abstract String d();

    public abstract Pair[] e();

    public abstract FirebaseRemoteConfigInfo f();

    public abstract long g(String str);

    public abstract String h(String str);

    public void i() {
        b();
    }
}
