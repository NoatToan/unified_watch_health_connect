package ls0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lls0/s;", "Landroidx/lifecycle/x1$c;", "", "returnFlight", "", "destinationIndex", "Lyr0/i;", "flight", "<init>", "(ZILyr0/i;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yr0.i f114766c;

    public s(boolean z14, int i14, yr0.i iVar) {
        iVar.getClass();
        this.f114764a = z14;
        this.f114765b = i14;
        this.f114766c = iVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(q.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new q(this.f114764a, this.f114765b, this.f114766c);
    }
}
