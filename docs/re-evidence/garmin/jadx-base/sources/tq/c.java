package tq;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltq/c;", "Landroidx/lifecycle/x1$c;", "", "activityId", "Lam/x0;", "activityType", "activityStartTimeMillis", "<init>", "(JLam/x0;J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f166011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f166012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f166013c;

    public c(long j8, x0 x0Var, long j14) {
        x0Var.getClass();
        this.f166011a = j8;
        this.f166012b = x0Var;
        this.f166013c = j14;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(a.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new a(this.f166011a, this.f166012b, this.f166013c);
    }
}
