package b03;

import e23.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0001\nB-\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lb03/a;", "", "RowType", "", "queries", "Lkotlin/Function1;", "Ld03/c;", "mapper", "<init>", "(Ljava/util/List;Le23/l;)V", "a", "runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class a<RowType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?>> f14170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<d03.c, RowType> f14171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e03.a f14172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f14173d;

    /* JADX INFO: renamed from: b03.a$a, reason: collision with other inner class name */
    public interface InterfaceC0200a {
        void a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<a<?>> list, l<? super d03.c, ? extends RowType> lVar) {
        list.getClass();
        lVar.getClass();
        this.f14170a = list;
        this.f14171b = lVar;
        this.f14172c = new e03.a();
        this.f14173d = new CopyOnWriteArrayList();
    }

    public abstract d03.c a();

    public final ArrayList b() throws IOException {
        ArrayList arrayList = new ArrayList();
        d03.c cVarA = a();
        while (cVarA.next()) {
            try {
                arrayList.add(this.f14171b.invoke(cVarA));
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(cVarA, th3);
                    throw th4;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        cVarA.close();
        return arrayList;
    }

    public final void c() {
        synchronized (this.f14172c) {
            try {
                Iterator it = this.f14173d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0200a) it.next()).a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
