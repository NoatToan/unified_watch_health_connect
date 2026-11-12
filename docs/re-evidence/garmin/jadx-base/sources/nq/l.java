package nq;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnq/l;", "Landroidx/lifecycle/x1$c;", "", "activityId", "Lam/x0;", "activityType", "", "isWheelchairEnabled", "<init>", "(JLam/x0;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f126922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f126923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126924c;

    public l(long j8, x0 x0Var, boolean z14) {
        x0Var.getClass();
        this.f126922a = j8;
        this.f126923b = x0Var;
        this.f126924c = z14;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.isAssignableFrom(k.class)) {
            vb.h.s("Unknown ViewModel class");
            return null;
        }
        return new k(this.f126922a, this.f126923b, this.f126924c);
    }
}
