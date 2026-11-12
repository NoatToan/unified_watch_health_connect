package ap;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lap/l;", "Landroidx/lifecycle/x1$c;", "", "activityId", "Lzo/k;", "entryPoint", "<init>", "(JLzo/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo.k f11647b;

    public l(long j8, zo.k kVar) {
        kVar.getClass();
        this.f11646a = j8;
        this.f11647b = kVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        return new d(this.f11646a, this.f11647b);
    }
}
