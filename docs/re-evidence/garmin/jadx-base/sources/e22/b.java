package e22;

import c22.e3;
import e23.l;
import java.util.Comparator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b<T> implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f62641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f62642b;

    public b(l lVar, String str) {
        this.f62641a = lVar;
        this.f62642b = str;
    }

    @Override // java.util.Comparator
    public final int compare(T t7, T t14) {
        l lVar = this.f62641a;
        String strH = zf.b.H((String) lVar.invoke(t14));
        String str = this.f62642b;
        return r13.a.b(Double.valueOf(e3.a(strH, str)), Double.valueOf(e3.a(zf.b.H((String) lVar.invoke(t7)), str)));
    }
}
