package n23;

/* JADX INFO: loaded from: classes3.dex */
public class i4 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f122511a;

    public i4(boolean z14) {
        this.f122511a = z14;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k23.r rVar = (k23.r) obj;
        l4 l4Var = l4.f122528a;
        rVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f122511a ? "(raw) " : "");
        sb3.append(rVar);
        return sb3.toString();
    }
}
