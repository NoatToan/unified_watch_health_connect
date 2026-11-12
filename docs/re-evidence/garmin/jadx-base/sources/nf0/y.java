package nf0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnf0/y;", "Landroidx/lifecycle/x1$c;", "", "deviceUnitId", "<init>", "(J)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f125869a;

    public y(long j8) {
        this.f125869a = j8;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(o.class)) {
            return new o(this.f125869a);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
