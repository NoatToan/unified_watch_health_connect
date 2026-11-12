package pc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.v;
import androidx.fragment.app.z;
import androidx.lifecycle.b0;
import androidx.lifecycle.k0;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import lc.k;
import lc.o0;
import lc.v0;
import lc.w0;
import lc.x0;
import lc.y;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.y0;
import p13.c1;
import p13.h0;
import r53.p2;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@v0.a("dialog")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpc/b;", "Llc/v0;", "Lpc/b$b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;)V", "b", "a", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends v0<C2598b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f137161h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f137162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f137163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f137164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f137165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f137166g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"pc/b$c", "Landroidx/lifecycle/k0;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements k0 {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f137169a;

            static {
                int[] iArr = new int[b0.a.values().length];
                try {
                    iArr[b0.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b0.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b0.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b0.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f137169a = iArr;
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.k0
        public final void onStateChanged(n0 n0Var, b0.a aVar) {
            int iNextIndex;
            int i14 = a.f137169a[aVar.ordinal()];
            b bVar = b.this;
            if (i14 == 1) {
                i iVar = (i) n0Var;
                int i15 = b.f137161h;
                Iterable iterable = (Iterable) bVar.b().f111900e.f150540a.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (s.g(((lc.v) it.next()).f111886f, iVar.getTag())) {
                            return;
                        }
                    }
                }
                iVar.dismiss();
                return;
            }
            Object obj = null;
            if (i14 == 2) {
                i iVar2 = (i) n0Var;
                int i16 = b.f137161h;
                for (Object obj2 : (Iterable) bVar.b().f111901f.f150540a.getValue()) {
                    if (s.g(((lc.v) obj2).f111886f, iVar2.getTag())) {
                        obj = obj2;
                    }
                }
                lc.v vVar = (lc.v) obj;
                if (vVar != null) {
                    bVar.b().b(vVar);
                    return;
                }
                return;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    return;
                }
                i iVar3 = (i) n0Var;
                int i17 = b.f137161h;
                for (Object obj3 : (Iterable) bVar.b().f111901f.f150540a.getValue()) {
                    if (s.g(((lc.v) obj3).f111886f, iVar3.getTag())) {
                        obj = obj3;
                    }
                }
                lc.v vVar2 = (lc.v) obj;
                if (vVar2 != null) {
                    bVar.b().b(vVar2);
                }
                iVar3.getF158016a().d(this);
                return;
            }
            i iVar4 = (i) n0Var;
            if (iVar4.requireDialog().isShowing()) {
                return;
            }
            int i18 = b.f137161h;
            List list = (List) bVar.b().f111900e.f150540a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (s.g(((lc.v) listIterator.previous()).f111886f, iVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            lc.v vVar3 = (lc.v) h0.e0(iNextIndex, list);
            if (!s.g(h0.n0(list), vVar3)) {
                iVar4.toString();
            }
            if (vVar3 != null) {
                bVar.l(iNextIndex, vVar3, false);
            }
        }
    }

    static {
        new a(null);
    }

    public b(Context context, v vVar) {
        context.getClass();
        vVar.getClass();
        this.f137162c = context;
        this.f137163d = vVar;
        this.f137164e = new LinkedHashSet();
        this.f137165f = new c();
        this.f137166g = new LinkedHashMap();
    }

    @Override // lc.v0
    public final lc.h0 a() {
        return new C2598b(this);
    }

    @Override // lc.v0
    public final void d(List list, o0 o0Var) {
        v vVar = this.f137163d;
        if (vVar.V()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lc.v vVar2 = (lc.v) it.next();
            k(vVar2).show(vVar, vVar2.f111886f);
            lc.v vVar3 = (lc.v) h0.n0((List) b().f111900e.f150540a.getValue());
            boolean zR = h0.R((Iterable) b().f111901f.f150540a.getValue(), vVar3);
            b().h(vVar2);
            if (vVar3 != null && !zR) {
                b().b(vVar3);
            }
        }
    }

    @Override // lc.v0
    public final void e(y.b bVar) {
        b0 f158016a;
        this.f111890a = bVar;
        this.f111891b = true;
        Iterator it = ((List) bVar.f111900e.f150540a.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            v vVar = this.f137163d;
            if (!zHasNext) {
                vVar.f7386q.add(new z() { // from class: pc.a
                    @Override // androidx.fragment.app.z
                    public final void a(v vVar2, Fragment fragment) {
                        int i14 = b.f137161h;
                        vVar2.getClass();
                        b bVar2 = this.f137160a;
                        LinkedHashSet linkedHashSet = bVar2.f137164e;
                        if (y0.a(linkedHashSet).remove(fragment.getTag())) {
                            fragment.getF158016a().a(bVar2.f137165f);
                        }
                        LinkedHashMap linkedHashMap = bVar2.f137166g;
                        y0.c(linkedHashMap).remove(fragment.getTag());
                    }
                });
                return;
            }
            lc.v vVar2 = (lc.v) it.next();
            i iVar = (i) vVar.G(vVar2.f111886f);
            if (iVar == null || (f158016a = iVar.getF158016a()) == null) {
                this.f137164e.add(vVar2.f111886f);
            } else {
                f158016a.a(this.f137165f);
            }
        }
    }

    @Override // lc.v0
    public final void f(lc.v vVar) {
        String str = vVar.f111886f;
        v vVar2 = this.f137163d;
        if (vVar2.V()) {
            return;
        }
        i iVar = (i) this.f137166g.get(str);
        if (iVar == null) {
            Fragment fragmentG = vVar2.G(str);
            iVar = fragmentG instanceof i ? (i) fragmentG : null;
        }
        if (iVar != null) {
            iVar.getF158016a().d(this.f137165f);
            iVar.dismiss();
        }
        k(vVar).show(vVar2, str);
        x0 x0VarB = b();
        List list = (List) x0VarB.f111900e.f150540a.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            lc.v vVar3 = (lc.v) listIterator.previous();
            if (s.g(vVar3.f111886f, str)) {
                p2 p2Var = x0VarB.f111898c;
                p2Var.k(null, c1.i(c1.i((Set) p2Var.getValue(), vVar3), vVar));
                x0VarB.c(vVar);
                return;
            }
        }
        j.s("List contains no element matching the predicate.");
    }

    @Override // lc.v0
    public final void i(lc.v vVar, boolean z14) {
        v vVar2 = this.f137163d;
        if (vVar2.V()) {
            return;
        }
        List list = (List) b().f111900e.f150540a.getValue();
        int iIndexOf = list.indexOf(vVar);
        Iterator it = h0.G0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentG = vVar2.G(((lc.v) it.next()).f111886f);
            if (fragmentG != null) {
                ((i) fragmentG).dismiss();
            }
        }
        l(iIndexOf, vVar, z14);
    }

    public final i k(lc.v vVar) {
        lc.h0 h0Var = vVar.f111882b;
        h0Var.getClass();
        C2598b c2598b = (C2598b) h0Var;
        String str = c2598b.f137167g;
        if (str == null) {
            h.z("DialogFragment class was not set");
            return null;
        }
        char cCharAt = str.charAt(0);
        Context context = this.f137162c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment fragmentInstantiate = this.f137163d.P().instantiate(context.getClassLoader(), str);
        fragmentInstantiate.getClass();
        if (i.class.isAssignableFrom(fragmentInstantiate.getClass())) {
            i iVar = (i) fragmentInstantiate;
            iVar.setArguments(vVar.f111888h.a());
            iVar.getF158016a().a(this.f137165f);
            this.f137166g.put(vVar.f111886f, iVar);
            return iVar;
        }
        StringBuilder sb3 = new StringBuilder("Dialog destination ");
        String str2 = c2598b.f137167g;
        if (str2 != null) {
            h.x(am.j.o(str2, " is not an instance of DialogFragment", sb3));
            return null;
        }
        h.z("DialogFragment class was not set");
        return null;
    }

    public final void l(int i14, lc.v vVar, boolean z14) {
        lc.v vVar2 = (lc.v) h0.e0(i14 - 1, (List) b().f111900e.f150540a.getValue());
        boolean zR = h0.R((Iterable) b().f111901f.f150540a.getValue(), vVar2);
        b().e(vVar, z14);
        if (vVar2 == null || zR) {
            return;
        }
        b().b(vVar2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpc/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: pc.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lpc/b$b;", "Llc/h0;", "Llc/k;", "Llc/v0;", "fragmentNavigator", "<init>", "(Llc/v0;)V", "Llc/w0;", "navigatorProvider", "(Llc/w0;)V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class C2598b extends lc.h0 implements k {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f137167g;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2598b(w0 w0Var) {
            this((v0<? extends C2598b>) w0Var.b(b.class));
            w0Var.getClass();
        }

        @Override // lc.h0
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof C2598b) && super.equals(obj) && s.g(this.f137167g, ((C2598b) obj).f137167g);
        }

        @Override // lc.h0
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f137167g;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // lc.h0
        public final void i(Context context, AttributeSet attributeSet) {
            super.i(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, e.f137174a);
            typedArrayObtainAttributes.getClass();
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f137167g = string;
            }
            typedArrayObtainAttributes.recycle();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2598b(v0<? extends C2598b> v0Var) {
            super(v0Var);
            v0Var.getClass();
        }
    }
}
