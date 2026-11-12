package fh2;

import java.util.TimerTask;
import java.util.UUID;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class c extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UUID f71624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f71625b;

    public c(d dVar, UUID uuid) {
        this.f71625b = dVar;
        this.f71624a = uuid;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Logger logger = d.f71626f;
        this.f71625b.e(this.f71624a);
    }
}
