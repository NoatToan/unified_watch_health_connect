package p002j6;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import d4.f;
import e23.l;
import h5.o1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BI\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013BK\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0014\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 RB\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(RB\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(RB\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00142\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"0\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(R\u0014\u00103\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lj6/p;", "Landroid/view/View;", "T", "Lj6/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lp3/p;", "parentContext", "typedView", "La5/b;", "dispatcher", "Ld4/f;", "saveStateRegistry", "", "compositeKeyHash", "Lh5/o1;", "owner", "<init>", "(Landroid/content/Context;Lp3/p;Landroid/view/View;La5/b;Ld4/f;ILh5/o1;)V", "Lkotlin/Function1;", "factory", "(Landroid/content/Context;Le23/l;Lp3/p;Ld4/f;ILh5/o1;)V", "E", "La5/b;", "getDispatcher", "()La5/b;", "Ld4/f$a;", "value", "I", "Ld4/f$a;", "setSavableRegistryEntry", "(Ld4/f$a;)V", "savableRegistryEntry", "", "P", "Le23/l;", "getUpdateBlock", "()Le23/l;", "setUpdateBlock", "(Le23/l;)V", "updateBlock", "getResetBlock", "setResetBlock", "resetBlock", "k0", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p<T extends View> extends p002j6.a {
    public final T D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final a5.b dispatcher;
    public final f F;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public f.a savableRegistryEntry;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public l<? super T, Unit> updateBlock;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public l<? super T, Unit> resetBlock;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public l<? super T, Unit> releaseBlock;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<T> f97249a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p<T> pVar) {
            super(0);
            this.f97249a = pVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            p<T> pVar = this.f97249a;
            pVar.getReleaseBlock().invoke(pVar.D);
            p.g(pVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<T> f97250a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p<T> pVar) {
            super(0);
            this.f97250a = pVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            p<T> pVar = this.f97250a;
            pVar.getResetBlock().invoke(pVar.D);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<T> f97251a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p<T> pVar) {
            super(0);
            this.f97251a = pVar;
        }

        @Override // e23.a
        public final Unit invoke() {
            p<T> pVar = this.f97251a;
            pVar.getUpdateBlock().invoke(pVar.D);
            return Unit.INSTANCE;
        }
    }

    private p(Context context, p3.p pVar, T t7, a5.b bVar, f fVar, int i14, o1 o1Var) {
        super(context, pVar, i14, bVar, t7, o1Var);
        this.D = t7;
        this.dispatcher = bVar;
        this.F = fVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i14);
        Object objE = fVar != null ? fVar.e(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objE instanceof SparseArray ? (SparseArray) objE : null;
        if (sparseArray != null) {
            t7.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.f(strValueOf, new o(this)));
        }
        j6.c.h hVar = p002j6.c.f97195a;
        this.updateBlock = hVar;
        this.resetBlock = hVar;
        this.releaseBlock = hVar;
    }

    public static final void g(p pVar) {
        pVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(f.a aVar) {
        f.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.unregister();
        }
        this.savableRegistryEntry = aVar;
    }

    public final a5.b getDispatcher() {
        return this.dispatcher;
    }

    public final l<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final l<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    public /* bridge */ /* synthetic */ kotlin.a getSubCompositionView() {
        return null;
    }

    public final l<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(l<? super T, Unit> lVar) {
        this.releaseBlock = lVar;
        setRelease(new a(this));
    }

    public final void setResetBlock(l<? super T, Unit> lVar) {
        this.resetBlock = lVar;
        setReset(new b(this));
    }

    public final void setUpdateBlock(l<? super T, Unit> lVar) {
        this.updateBlock = lVar;
        setUpdate(new c(this));
    }

    public /* synthetic */ p(Context context, p3.p pVar, View view2, a5.b bVar, f fVar, int i14, o1 o1Var, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : pVar, view2, (i15 & 8) != 0 ? new a5.b() : bVar, fVar, i14, o1Var);
    }

    public /* synthetic */ p(Context context, l lVar, p3.p pVar, f fVar, int i14, o1 o1Var, int i15, j jVar) {
        this(context, lVar, (i15 & 4) != 0 ? null : pVar, fVar, i14, o1Var);
    }

    public p(Context context, l<? super Context, ? extends T> lVar, p3.p pVar, f fVar, int i14, o1 o1Var) {
        this(context, pVar, lVar.invoke(context), null, fVar, i14, o1Var, 8, null);
    }
}
