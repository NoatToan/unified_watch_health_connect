package yb;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends ia.d implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f195660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f195661e;

    @Override // ia.d
    public final void c() {
        super.c();
        this.f195660d = null;
    }

    @Override // yb.i
    public final List<ea.a> getCues(long j8) {
        i iVar = this.f195660d;
        iVar.getClass();
        return iVar.getCues(j8 - this.f195661e);
    }

    @Override // yb.i
    public final long getEventTime(int i14) {
        i iVar = this.f195660d;
        iVar.getClass();
        return iVar.getEventTime(i14) + this.f195661e;
    }

    @Override // yb.i
    public final int getEventTimeCount() {
        i iVar = this.f195660d;
        iVar.getClass();
        return iVar.getEventTimeCount();
    }

    @Override // yb.i
    public final int getNextEventTimeIndex(long j8) {
        i iVar = this.f195660d;
        iVar.getClass();
        return iVar.getNextEventTimeIndex(j8 - this.f195661e);
    }
}
