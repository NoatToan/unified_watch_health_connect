package sk;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f159506a;

    public c(d dVar) {
        this.f159506a = dVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        h hVar = this.f159506a.f159507a;
        UUID uuid = b.f159489a;
        hVar.b(uuid, b.f159492d);
        hVar.b(uuid, b.f159494f);
        hVar.b(uuid, b.f159496h);
        hVar.b(uuid, b.f159499k);
        hVar.a(uuid, b.f159491c);
    }
}
