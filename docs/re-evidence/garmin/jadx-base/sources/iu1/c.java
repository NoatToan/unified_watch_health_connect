package iu1;

import java.util.concurrent.atomic.AtomicBoolean;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Liu1/c;", "Liu1/a;", "<init>", "()V", "gcm-legacy_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f95043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f95044b = new AtomicBoolean(false);

    @Override // iu1.a
    public final void a(b bVar) {
        this.f95043a = bVar;
    }

    public abstract void b();

    @Override // iu1.a
    public final void cancel() {
        this.f95044b.set(true);
    }

    @Override // iu1.a
    public final void execute() {
        if (!this.f95044b.get()) {
            b();
        }
        b bVar = this.f95043a;
        if (bVar != null) {
            bVar.d(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        }
    }
}
