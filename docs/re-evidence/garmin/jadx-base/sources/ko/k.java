package ko;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import p005kotlin.Metadata;
import ps.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lko/k;", "Landroidx/lifecycle/x1$c;", "Lam/x0;", "activityType", "Lps/p;", "activitySplits", "Lko/h;", "intervalDataMapper", "<init>", "(Lam/x0;Lps/p;Lko/h;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f105743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f105744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f105745c;

    public k(x0 x0Var, p pVar, h hVar) {
        pVar.getClass();
        hVar.getClass();
        this.f105743a = x0Var;
        this.f105744b = pVar;
        this.f105745c = hVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        return new j(this.f105743a, this.f105744b, this.f105745c);
    }
}
