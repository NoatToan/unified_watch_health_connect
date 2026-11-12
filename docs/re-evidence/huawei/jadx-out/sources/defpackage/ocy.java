package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import net.openid.appauth.AuthState;
import org.json.JSONException;

/* JADX INFO: loaded from: classes12.dex */
public class ocy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f44168c = new Object();
    private static volatile ocy e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReentrantLock f44169a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<AuthState> f44170b = new AtomicReference<>();
    private final SharedPreferences d;

    public static ocy c(Context context) {
        if (e == null) {
            synchronized (f44168c) {
                if (e == null) {
                    e = new ocy(context.getApplicationContext());
                }
            }
        }
        return e;
    }

    private ocy(Context context) {
        this.d = context.getSharedPreferences("AuthState", 0);
    }

    public AuthState d() {
        if (this.f44170b.get() != null) {
            return this.f44170b.get();
        }
        AuthState authStateC = c();
        return LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this.f44170b, null, authStateC) ? authStateC : this.f44170b.get();
    }

    public AuthState e(AuthState authState) {
        d(authState);
        this.f44170b.set(authState);
        return authState;
    }

    public AuthState d(zqt zqtVar, zqw zqwVar) {
        AuthState authStateD = d();
        authStateD.d(zqtVar, zqwVar);
        return e(authStateD);
    }

    public AuthState e(zrl zrlVar, zqw zqwVar) {
        AuthState authStateD = d();
        authStateD.e(zrlVar, zqwVar);
        return e(authStateD);
    }

    private AuthState c() {
        AuthState authState;
        this.f44169a.lock();
        try {
            String string = this.d.getString("state", null);
            if (string == null) {
                authState = new AuthState();
            } else {
                try {
                    authState = AuthState.a(string);
                } catch (JSONException unused) {
                    Log.w("AuthStateManager", "Failed to deserialize stored auth state - discarding");
                    authState = new AuthState();
                }
            }
            this.f44169a.unlock();
            return authState;
        } catch (Throwable th) {
            this.f44169a.unlock();
            throw th;
        }
    }

    private void d(AuthState authState) {
        this.f44169a.lock();
        try {
            SharedPreferences.Editor editorEdit = this.d.edit();
            if (authState != null) {
                editorEdit.putString("state", authState.f());
            } else {
                editorEdit.remove("state");
            }
            if (!editorEdit.commit()) {
                throw new IllegalStateException("Failed to write state to shared prefs");
            }
            this.f44169a.unlock();
        } catch (Throwable th) {
            this.f44169a.unlock();
            throw th;
        }
    }
}
