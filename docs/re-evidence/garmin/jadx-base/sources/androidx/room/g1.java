package androidx.room;

import java.lang.ref.WeakReference;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/g1;", "Landroidx/room/m$b;", "Landroidx/room/m;", "tracker", "delegate", "<init>", "(Landroidx/room/m;Landroidx/room/m$b;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g1 extends m.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<m.b> f10845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(m mVar, m.b bVar) {
        super(bVar.f10893a);
        mVar.getClass();
        bVar.getClass();
        this.f10844b = mVar;
        this.f10845c = new WeakReference<>(bVar);
    }

    @Override // androidx.room.m.b
    public final void a(Set<String> set) {
        set.getClass();
        m.b bVar = this.f10845c.get();
        if (bVar == null) {
            this.f10844b.c(this);
        } else {
            bVar.a(set);
        }
    }
}
