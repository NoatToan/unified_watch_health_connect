package jb;

import bb.o;
import bb.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f98092b;

    public d(o oVar, long j8) {
        super(oVar);
        fa.a.a(oVar.getPosition() >= j8);
        this.f98092b = j8;
    }

    @Override // bb.w, bb.o
    public final long getLength() {
        return super.getLength() - this.f98092b;
    }

    @Override // bb.w, bb.o
    public final long getPeekPosition() {
        return super.getPeekPosition() - this.f98092b;
    }

    @Override // bb.w, bb.o
    public final long getPosition() {
        return super.getPosition() - this.f98092b;
    }
}
