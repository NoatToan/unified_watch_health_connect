package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class lyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25565a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f25566b = new Handler(Looper.getMainLooper());
    public final c1d c;

    public lyr(c1d c1dVar) {
        sk1.c(c1dVar);
        this.c = c1dVar;
    }

    public void a(HashMap<String, u1d<Boolean>> map) {
        if (map == null || map.size() <= 0 || this.f25565a) {
            return;
        }
        this.f25565a = true;
        this.f25566b.post(new myr(map, this.c, null));
    }
}
