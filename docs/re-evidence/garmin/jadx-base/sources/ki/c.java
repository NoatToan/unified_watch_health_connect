package ki;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import r53.i;
import vb.h;
import vh.e;
import vh.f;
import vh.n0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lki/c;", "Lki/b;", "", "Lki/a;", "interceptors", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Ljava/util/List;I)V", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f104803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104804b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends a> list, int i14) {
        list.getClass();
        this.f104803a = list;
        this.f104804b = i14;
    }

    @Override // ki.b
    public final <D extends n0.a> i<f<D>> a(e<D> eVar) {
        eVar.getClass();
        List<a> list = this.f104803a;
        int size = list.size();
        int i14 = this.f104804b;
        if (i14 < size) {
            return list.get(i14).a(eVar, new c(list, i14 + 1));
        }
        h.z("Check failed.");
        return null;
    }
}
