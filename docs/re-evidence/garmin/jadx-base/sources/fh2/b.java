package fh2;

import java.util.TimerTask;
import java.util.UUID;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class b extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UUID f71621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f71622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f71623c;

    public b(d dVar, UUID uuid, byte[] bArr) {
        this.f71623c = dVar;
        this.f71621a = uuid;
        this.f71622b = bArr;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Logger logger = d.f71626f;
        this.f71623c.f(this.f71621a, this.f71622b);
    }
}
