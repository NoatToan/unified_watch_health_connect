package com.garmin.android.library.backgroundtaskmanagement;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f50126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50128h;

    public d(b bVar, boolean z14) {
        super(bVar.f50093c);
        this.f50127g = false;
        this.f50126f = bVar;
        this.f50128h = z14;
    }

    public abstract void b();

    public void c(b.c cVar) {
        b bVar = this.f50126f;
        if (bVar == null || this.f50127g) {
            return;
        }
        bVar.j(this, cVar);
        this.f50127g = true;
    }

    public d(b bVar) {
        this(bVar, true);
    }
}
