package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class pit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30452a;

    public pit(Context context) {
        this.f30452a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (pit.class) {
            try {
                hashSet = c().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public final void b() {
        synchronized (pit.class) {
            c().edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    public final SharedPreferences c() {
        return this.f30452a.getSharedPreferences("playcore_split_install_internal", 0);
    }
}
