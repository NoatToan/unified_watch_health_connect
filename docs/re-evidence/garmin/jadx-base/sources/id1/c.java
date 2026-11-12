package id1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.s;
import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import h0.r0;
import i3.f2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006\u0012\u0013\u0014\u0015\u0016\u0017B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00070\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0018"}, d2 = {"Lid1/c;", "Lid1/a;", "Lid1/c$e;", "Lid1/h$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lid1/c$a;", "mAdapterDelegates", "Landroidx/recyclerview/widget/RecyclerView$p;", "mLayoutManager", "<init>", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView$p;)V", "adapterDelegates", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "layoutManager", "(Landroid/content/Context;Ljava/util/List;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$p;)V", "c", JWKParameterNames.RSA_EXPONENT, "f", "d", "a", "b", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends id1.a<e> implements h.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<a<? extends e>> f93019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RecyclerView.p f93020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecyclerView f93021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f93022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f93023i;

    public interface a<T extends e> {
        Class<T> a();

        AbstractC1775c<T> b(LayoutInflater layoutInflater, ViewGroup viewGroup, d dVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lid1/c$b;", "Landroidx/recyclerview/widget/o$f;", "Lid1/c$e;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends o.f<e> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            eVar3.getClass();
            eVar4.getClass();
            return eVar3.c(eVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            eVar3.getClass();
            eVar4.getClass();
            return eVar3.a(eVar4);
        }
    }

    /* JADX INFO: renamed from: id1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lid1/c$c;", "Lid1/c$e;", "T", "Lid1/a$a;", "Landroid/view/View;", "itemView", "Lid1/c$d;", "mDelegate", "<init>", "(Landroid/view/View;Lid1/c$d;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC1775c<T extends e> extends id1.a.AbstractC1773a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f93024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f93025b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC1775c(View view2, d dVar) {
            super(view2);
            view2.getClass();
            dVar.getClass();
            this.f93024a = dVar;
            this.f93025b = new ArrayList();
        }

        @Override // id1.a.AbstractC1773a
        public final void d(int i14) {
            e(this.f93024a.getItem(i14));
            f();
        }

        public abstract void e(T t7);

        public final void f() {
            this.f93024a.getItem(getBindingAdapterPosition());
            ArrayList arrayList = this.f93025b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                s0.n(((Number) it.next()).intValue(), this.itemView);
            }
            arrayList.clear();
        }
    }

    public interface d {
        e getItem(int i14);
    }

    public interface e {
        boolean a(e eVar);

        default boolean c(e eVar) {
            eVar.getClass();
            return equals(eVar);
        }
    }

    public interface f {
        boolean a();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"id1/c$g", "Lid1/c$d;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g implements d {
        public g() {
        }

        @Override // id1.c.d
        public final e getItem(int i14) {
            e eVarR = c.this.r(i14);
            eVarR.getClass();
            return eVarR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, List<? extends a<? extends e>> list, RecyclerView.p pVar) {
        super(context, new b());
        context.getClass();
        list.getClass();
        this.f93019e = list;
        this.f93020f = pVar;
        this.f93022h = m.b(new f2(this, 8));
        this.f93023i = new g();
    }

    @Override // id1.h.a
    public final Boolean f(int i14, int i15) {
        e eVarR = r(i15);
        eVarR.getClass();
        e eVar = eVarR;
        e eVarR2 = r(i14);
        eVarR2.getClass();
        e eVar2 = eVarR2;
        if (!(eVar instanceof f) || !((f) eVar).a() || !(eVar2 instanceof f) || !((f) eVar2).a()) {
            return Boolean.FALSE;
        }
        Collection collection = this.f10698a.f10426f;
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection);
        Collections.swap(arrayList, i14, i15);
        t(arrayList);
        return Boolean.TRUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        e eVarR = r(i14);
        eVarR.getClass();
        e eVar = eVarR;
        Iterator<a<? extends e>> it = this.f93019e.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (it.next().a().equals(eVar.getClass())) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.recyclerview.widget.x
    public final void t(List<? extends e> list) {
        ArrayList<e> arrayList = (ArrayList) list;
        this.f10698a.b((List<T>) list, new r0(15, arrayList, this));
        boolean zIsEmpty = arrayList.isEmpty();
        t tVar = this.f93022h;
        if (!zIsEmpty) {
            for (e eVar : arrayList) {
                f fVar = eVar instanceof f ? (f) eVar : null;
                if (fVar != null && fVar.a()) {
                    ((s) tVar.getValue()).e(this.f93021g);
                    return;
                }
            }
        }
        ((s) tVar.getValue()).e(null);
    }

    @Override // id1.a
    public final id1.a.AbstractC1773a u(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        List<a<? extends e>> list = this.f93019e;
        if (i14 <= x.j(list)) {
            return list.get(i14).b(layoutInflater, viewGroup, this.f93023i);
        }
        vb.h.z("Invalid viewType. Did you forget to register an adapter delegate?");
        return null;
    }

    public /* synthetic */ c(Context context, List list, RecyclerView.p pVar, int i14, j jVar) {
        this(context, list, (i14 & 4) != 0 ? null : pVar);
    }

    public /* synthetic */ c(Context context, List list, RecyclerView recyclerView, RecyclerView.p pVar, int i14, j jVar) {
        this(context, list, recyclerView, (i14 & 8) != 0 ? null : pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, List<? extends a<? extends e>> list, RecyclerView recyclerView, RecyclerView.p pVar) {
        this(context, list, pVar);
        context.getClass();
        list.getClass();
        recyclerView.getClass();
        this.f93021g = recyclerView;
        recyclerView.setAdapter(this);
        RecyclerView.p pVar2 = this.f93020f;
        RecyclerView.p pVar3 = pVar2;
        if (pVar2 == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f93012b);
            linearLayoutManager.setOrientation(1);
            pVar3 = linearLayoutManager;
        }
        recyclerView.setLayoutManager(pVar3);
    }
}
