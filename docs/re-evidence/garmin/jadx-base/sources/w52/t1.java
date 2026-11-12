package w52;

import java.util.List;
import l72.i3;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw52/t1;", "Lr52/c;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t1 implements r52.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f182748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<i3> f182749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<i3> f182750c;

    public t1(x3<Boolean> x3Var, List<i3> list, List<i3> list2) {
        this.f182748a = x3Var;
        this.f182749b = list;
        this.f182750c = list2;
    }

    @Override // r52.c
    public final void b(String str, String str2, u4.d dVar, boolean z14) {
        str2.getClass();
        this.f182749b.add(new i3(str, str2, z14, dVar, str2));
    }

    @Override // r52.c
    public final void c(String str, String str2, boolean z14) {
        str2.getClass();
        this.f182750c.add(new i3(str, str2, z14, null, str2));
    }

    @Override // r52.c
    public final boolean isLoading() {
        return this.f182748a.getF182175a().booleanValue();
    }
}
