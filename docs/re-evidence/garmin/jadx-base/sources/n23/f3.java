package n23;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class f3 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.p f122466a;

    public f3(e23.p pVar) {
        this.f122466a = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i3.a aVar = i3.f122504a;
        return ((Number) this.f122466a.invoke(obj, obj2)).intValue();
    }
}
