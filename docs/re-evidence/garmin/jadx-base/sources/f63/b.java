package f63;

import e23.l;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012*\u0010\u0007\u001a&\u0012\"\u0012 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf63/b;", "T", "Lf63/e;", "", "Lo13/p;", "Lkotlin/Function1;", "", "formatters", "<init>", "(Ljava/util/List;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p<l<T, Boolean>, e<T>>> f69376a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends p<? extends l<? super T, Boolean>, ? extends e<? super T>>> list) {
        list.getClass();
        this.f69376a = list;
    }

    @Override // f63.e
    public final void a(Object obj, StringBuilder sb3, boolean z14) {
        for (p<l<T, Boolean>, e<T>> pVar : this.f69376a) {
            l<T, Boolean> lVar = pVar.f128594a;
            e<T> eVar = pVar.f128595b;
            if (lVar.invoke(obj).booleanValue()) {
                eVar.a(obj, sb3, z14);
                return;
            }
        }
    }
}
