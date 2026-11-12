package lj0;

import android.util.Pair;
import java.text.MessageFormat;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.a f113026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f113027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Pair<String, String>> f113028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f113029d;

    public i(g gVar, Object[] objArr) {
        this.f113029d = true;
        if (!(gVar instanceof h.a)) {
            h hVar = new h(gVar);
            gVar = new h.a(hVar, hVar.f113008a, hVar.f113010c, hVar.f113009b, hVar.f113011d, hVar.f113012e, hVar.f113013f, hVar.f113014g, hVar.f113015h, hVar.f113016i);
        }
        this.f113026a = (h.a) gVar;
        this.f113027b = objArr;
    }

    public final Object[] a() {
        h.a aVar = this.f113026a;
        Object[] objArr = this.f113027b;
        if (aVar != null) {
            for (int i14 = 0; i14 < objArr.length; i14++) {
                Object obj = objArr[i14];
                if (obj != null) {
                    objArr[i14] = obj.toString();
                }
            }
        }
        return objArr;
    }

    public final String toString() {
        String str = MessageFormat.format(this.f113026a.f113019c, this.f113027b);
        return str.matches("^\\w+://") ? str : ((bv.d) KoinJavaComponent.get(bv.d.class)).J().concat(str);
    }

    public i(g gVar, Object[] objArr, boolean z14) {
        this(gVar, objArr);
        this.f113029d = z14;
    }

    public i(g gVar, Object[] objArr, List<Pair<String, String>> list) {
        this(gVar, objArr);
        this.f113028c = list;
    }
}
