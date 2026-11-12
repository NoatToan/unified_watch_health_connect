package n23;

/* JADX INFO: loaded from: classes3.dex */
public class e4 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4 f122436a = new e4();

    @Override // e23.l
    public final Object invoke(Object obj) {
        k23.k kVar = (k23.k) obj;
        l4 l4Var = l4.f122528a;
        kVar.getClass();
        StringBuilder sb3 = new StringBuilder();
        String name = kVar.getName();
        if (name == null) {
            name = "_";
        }
        sb3.append(name);
        sb3.append(": ");
        sb3.append(kVar.getType());
        return sb3.toString();
    }
}
