package tm0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltm0/r;", "Landroidx/lifecycle/x1$c;", "", "groupId", "<init>", "(J)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f165438a;

    public r(long j8) {
        this.f165438a = j8;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.equals(l.class)) {
            return new l(this.f165438a);
        }
        vb.h.s("Failed requirement.");
        return null;
    }
}
