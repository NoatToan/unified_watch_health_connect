package sk;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UUID f159555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f159556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f159557c;

    public j(h hVar, UUID uuid, byte[] bArr) {
        this.f159557c = hVar;
        this.f159555a = uuid;
        this.f159556b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f159557c.f159541c.b(this.f159555a, this.f159556b);
    }
}
