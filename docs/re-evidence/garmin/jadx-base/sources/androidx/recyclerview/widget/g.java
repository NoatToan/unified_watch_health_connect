package androidx.recyclerview.widget;

import android.view.ViewGroup;
import i3.e5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f10457a;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f10458c = new a(true, EnumC0146a.NO_STABLE_IDS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnumC0146a f10460b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a$a, reason: collision with other inner class name */
        public enum EnumC0146a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        public a(boolean z14, EnumC0146a enumC0146a) {
            this.f10459a = z14;
            this.f10460b = enumC0146a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public g(a aVar, List<? extends RecyclerView.h<? extends RecyclerView.f0>> list) {
        this.f10457a = new h(this, aVar);
        for (RecyclerView.h<? extends RecyclerView.f0> hVar : list) {
            h hVar2 = this.f10457a;
            hVar2.a(hVar2.f10469e.size(), hVar);
        }
        super.setHasStableIds(this.f10457a.f10471g != a.EnumC0146a.NO_STABLE_IDS);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int findRelativeAdapterPositionIn(RecyclerView.h<? extends RecyclerView.f0> hVar, RecyclerView.f0 f0Var, int i14) {
        h hVar2 = this.f10457a;
        z zVar = hVar2.f10468d.get(f0Var);
        if (zVar == null) {
            return -1;
        }
        RecyclerView.h<RecyclerView.f0> hVar3 = zVar.f10702c;
        int iC = i14 - hVar2.c(zVar);
        int itemCount = hVar3.getItemCount();
        if (iC >= 0 && iC < itemCount) {
            return hVar3.findRelativeAdapterPositionIn(hVar, f0Var, iC);
        }
        StringBuilder sbJ = e5.j(iC, itemCount, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbJ.append(f0Var);
        sbJ.append("adapter:");
        sbJ.append(hVar);
        throw new IllegalStateException(sbJ.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        Iterator it = this.f10457a.f10469e.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += ((z) it.next()).f10704e;
        }
        return i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i14) {
        h hVar = this.f10457a;
        h.a aVarD = hVar.d(i14);
        z zVar = aVarD.f10473a;
        long jA = zVar.f10701b.a(zVar.f10702c.getItemId(aVarD.f10474b));
        aVarD.f10475c = false;
        aVarD.f10473a = null;
        aVarD.f10474b = -1;
        hVar.f10470f = aVarD;
        return jA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        h hVar = this.f10457a;
        h.a aVarD = hVar.d(i14);
        z zVar = aVarD.f10473a;
        int iA = zVar.f10700a.a(zVar.f10702c.getItemViewType(aVarD.f10474b));
        aVarD.f10475c = false;
        aVarD.f10473a = null;
        aVarD.f10474b = -1;
        hVar.f10470f = aVarD;
        return iA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        h hVar = this.f10457a;
        ArrayList arrayList = hVar.f10467c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it3 = hVar.f10469e.iterator();
        while (it3.hasNext()) {
            ((z) it3.next()).f10702c.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        h hVar = this.f10457a;
        h.a aVarD = hVar.d(i14);
        hVar.f10468d.put(f0Var, aVarD.f10473a);
        z zVar = aVarD.f10473a;
        zVar.f10702c.bindViewHolder(f0Var, aVarD.f10474b);
        aVarD.f10475c = false;
        aVarD.f10473a = null;
        aVarD.f10474b = -1;
        hVar.f10470f = aVarD;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        z zVarA = this.f10457a.f10466b.a(i14);
        return zVarA.f10702c.onCreateViewHolder(viewGroup, zVarA.f10700a.b(i14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        h hVar = this.f10457a;
        ArrayList arrayList = hVar.f10467c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = hVar.f10469e.iterator();
        while (it.hasNext()) {
            ((z) it.next()).f10702c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(RecyclerView.f0 f0Var) {
        h hVar = this.f10457a;
        IdentityHashMap<RecyclerView.f0, z> identityHashMap = hVar.f10468d;
        z zVar = identityHashMap.get(f0Var);
        if (zVar == null) {
            androidx.core.view.j.t("Cannot find wrapper for ", f0Var, ", seems like it is not bound by this adapter: ", hVar);
            return false;
        }
        boolean zOnFailedToRecycleView = zVar.f10702c.onFailedToRecycleView(f0Var);
        identityHashMap.remove(f0Var);
        return zOnFailedToRecycleView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(RecyclerView.f0 f0Var) {
        this.f10457a.e(f0Var).f10702c.onViewAttachedToWindow(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewDetachedFromWindow(RecyclerView.f0 f0Var) {
        this.f10457a.e(f0Var).f10702c.onViewDetachedFromWindow(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(RecyclerView.f0 f0Var) {
        h hVar = this.f10457a;
        IdentityHashMap<RecyclerView.f0, z> identityHashMap = hVar.f10468d;
        z zVar = identityHashMap.get(f0Var);
        if (zVar == null) {
            androidx.core.view.j.t("Cannot find wrapper for ", f0Var, ", seems like it is not bound by this adapter: ", hVar);
        } else {
            zVar.f10702c.onViewRecycled(f0Var);
            identityHashMap.remove(f0Var);
        }
    }

    public final void r(RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z14) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public g(a aVar, RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        this(aVar, (List<? extends RecyclerView.h<? extends RecyclerView.f0>>) Arrays.asList(hVarArr));
    }

    public g(List<? extends RecyclerView.h<? extends RecyclerView.f0>> list) {
        this(a.f10458c, list);
    }

    @SafeVarargs
    public g(RecyclerView.h<? extends RecyclerView.f0>... hVarArr) {
        this(a.f10458c, hVarArr);
    }
}
