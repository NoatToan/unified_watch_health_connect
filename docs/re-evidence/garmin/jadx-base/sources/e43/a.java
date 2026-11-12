package e43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparable<a> {
    public abstract b a();

    @Override // java.lang.Comparable
    public final int compareTo(a aVar) {
        a aVar2 = aVar;
        aVar2.getClass();
        return a().compareTo(aVar2.a());
    }
}
