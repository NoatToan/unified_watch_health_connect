package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/fragment/app/q0;", "", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "<init>", "(Landroid/view/ViewGroup;)V", "a", "b", "c", "d", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class q0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7323g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f7324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f7325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f7326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7329f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/q0$b;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7331b;

        public boolean a() {
            return this instanceof androidx.fragment.app.e.c;
        }

        public void b(ViewGroup viewGroup) {
        }

        public void c(ViewGroup viewGroup) {
        }

        public void d(b.c cVar, ViewGroup viewGroup) {
        }

        public void e(ViewGroup viewGroup) {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/q0$c;", "Landroidx/fragment/app/q0$d;", "Landroidx/fragment/app/q0$d$b;", "finalState", "Landroidx/fragment/app/q0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/d0;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/q0$d$b;Landroidx/fragment/app/q0$d$a;Landroidx/fragment/app/d0;)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final d0 f7332l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, d0 d0Var) {
            bVar.getClass();
            aVar.getClass();
            d0Var.getClass();
            Fragment fragment = d0Var.f7166c;
            fragment.getClass();
            super(bVar, aVar, fragment);
            this.f7332l = d0Var;
        }

        @Override // androidx.fragment.app.q0.d
        public final void b() {
            super.b();
            this.f7335c.mTransitioning = false;
            this.f7332l.i();
        }

        @Override // androidx.fragment.app.q0.d
        public final void e() {
            if (this.f7340h) {
                return;
            }
            this.f7340h = true;
            d.a aVar = this.f7334b;
            d.a aVar2 = d.a.ADDING;
            d0 d0Var = this.f7332l;
            if (aVar != aVar2) {
                if (aVar == d.a.REMOVING) {
                    Fragment fragment = d0Var.f7166c;
                    fragment.getClass();
                    View viewRequireView = fragment.requireView();
                    viewRequireView.getClass();
                    if (v.R(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = d0Var.f7166c;
            fragment2.getClass();
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (v.R(2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = this.f7335c.requireView();
            viewRequireView2.getClass();
            if (viewRequireView2.getParent() == null) {
                if (v.R(2)) {
                    fragment2.toString();
                    viewRequireView2.toString();
                }
                d0Var.a();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                if (v.R(2)) {
                    viewRequireView2.toString();
                }
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
            if (v.R(2)) {
                fragment2.getPostOnViewCreatedAlpha();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/fragment/app/q0$d;", "", "Landroidx/fragment/app/q0$d$b;", "finalState", "Landroidx/fragment/app/q0$d$a;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/q0$d$b;Landroidx/fragment/app/q0$d$a;Landroidx/fragment/app/Fragment;)V", "a", "b", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f7333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f7334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Fragment f7335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f7336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f7338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f7339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f7340h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f7342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList f7343k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/q0$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7355a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f7355a = iArr;
            }
        }

        public d(b bVar, a aVar, Fragment fragment) {
            bVar.getClass();
            aVar.getClass();
            fragment.getClass();
            this.f7333a = bVar;
            this.f7334b = aVar;
            this.f7335c = fragment;
            this.f7336d = new ArrayList();
            this.f7341i = true;
            ArrayList arrayList = new ArrayList();
            this.f7342j = arrayList;
            this.f7343k = arrayList;
        }

        public final void a(ViewGroup viewGroup) {
            this.f7340h = false;
            if (this.f7337e) {
                return;
            }
            this.f7337e = true;
            if (this.f7342j.isEmpty()) {
                b();
                return;
            }
            for (b bVar : p13.h0.b1(this.f7343k)) {
                bVar.getClass();
                if (!bVar.f7331b) {
                    bVar.b(viewGroup);
                }
                bVar.f7331b = true;
            }
        }

        public void b() {
            this.f7340h = false;
            if (this.f7338f) {
                return;
            }
            if (v.R(2)) {
                toString();
            }
            this.f7338f = true;
            Iterator it = this.f7336d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(b bVar) {
            bVar.getClass();
            ArrayList arrayList = this.f7342j;
            if (arrayList.remove(bVar) && arrayList.isEmpty()) {
                b();
            }
        }

        public final void d(b bVar, a aVar) {
            bVar.getClass();
            aVar.getClass();
            int i14 = c.f7355a[aVar.ordinal()];
            Fragment fragment = this.f7335c;
            if (i14 == 1) {
                if (this.f7333a == b.REMOVED) {
                    if (v.R(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f7334b);
                    }
                    this.f7333a = b.VISIBLE;
                    this.f7334b = a.ADDING;
                    this.f7341i = true;
                    return;
                }
                return;
            }
            if (i14 == 2) {
                if (v.R(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f7333a);
                    Objects.toString(this.f7334b);
                }
                this.f7333a = b.REMOVED;
                this.f7334b = a.REMOVING;
                this.f7341i = true;
                return;
            }
            if (i14 == 3 && this.f7333a != b.REMOVED) {
                if (v.R(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f7333a);
                    bVar.toString();
                }
                this.f7333a = bVar;
            }
        }

        public void e() {
            this.f7340h = true;
        }

        public final String toString() {
            StringBuilder sbL = hb.a.l("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbL.append(this.f7333a);
            sbL.append(" lifecycleImpact = ");
            sbL.append(this.f7334b);
            sbL.append(" fragment = ");
            sbL.append(this.f7335c);
            sbL.append(CoreConstants.CURLY_RIGHT);
            return sbL.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/q0$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f7348a = new a(null);

            /* JADX INFO: renamed from: androidx.fragment.app.q0$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0102b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7354a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f7354a = iArr;
                }
            }

            public final void a(View view2, ViewGroup viewGroup) {
                view2.getClass();
                viewGroup.getClass();
                int i14 = C0102b.f7354a[ordinal()];
                if (i14 == 1) {
                    ViewParent parent = view2.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (v.R(2)) {
                            view2.toString();
                            viewGroup2.toString();
                        }
                        viewGroup2.removeView(view2);
                        return;
                    }
                    return;
                }
                if (i14 == 2) {
                    if (v.R(2)) {
                        view2.toString();
                    }
                    ViewParent parent2 = view2.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (v.R(2)) {
                            view2.toString();
                            viewGroup.toString();
                        }
                        viewGroup.addView(view2);
                    }
                    view2.setVisibility(0);
                    return;
                }
                if (i14 == 3) {
                    if (v.R(2)) {
                        view2.toString();
                    }
                    view2.setVisibility(8);
                } else {
                    if (i14 != 4) {
                        return;
                    }
                    if (v.R(2)) {
                        view2.toString();
                    }
                    view2.setVisibility(4);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/q0$d$b$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                public static b a(View view2) {
                    view2.getClass();
                    return (view2.getAlpha() == 0.0f && view2.getVisibility() == 0) ? b.INVISIBLE : b(view2.getVisibility());
                }

                public static b b(int i14) {
                    if (i14 == 0) {
                        return b.VISIBLE;
                    }
                    if (i14 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i14 == 8) {
                        return b.GONE;
                    }
                    vb.h.s(am.j.h(i14, "Unknown visibility "));
                    return null;
                }

                private a() {
                }
            }
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7356a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f7356a = iArr;
        }
    }

    public q0(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f7324a = viewGroup;
        this.f7325b = new ArrayList();
        this.f7326c = new ArrayList();
    }

    public static final q0 i(ViewGroup viewGroup, v vVar) {
        f7323g.getClass();
        viewGroup.getClass();
        vVar.getClass();
        vVar.Q().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof q0) {
            return (q0) tag;
        }
        androidx.fragment.app.e eVar = new androidx.fragment.app.e(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, eVar);
        return eVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z14;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z14 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                d dVar = (d) it.next();
                if (!dVar.f7343k.isEmpty()) {
                    ArrayList arrayList2 = dVar.f7343k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it3 = arrayList2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (((b) it3.next()).a());
                }
                z14 = false;
            }
        }
        if (z14) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                p13.d0.v(arrayList3, ((d) it4.next()).f7343k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(d dVar) {
        dVar.getClass();
        if (dVar.f7341i) {
            d.b bVar = dVar.f7333a;
            View viewRequireView = dVar.f7335c.requireView();
            viewRequireView.getClass();
            bVar.a(viewRequireView, this.f7324a);
            dVar.f7341i = false;
        }
    }

    public abstract void b(ArrayList arrayList, boolean z14);

    public final void c(List<d> list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayListL, ((d) it.next()).f7343k);
        }
        List listB1 = p13.h0.b1(p13.h0.g1(arrayListL));
        int size = listB1.size();
        for (int i14 = 0; i14 < size; i14++) {
            ((b) listB1.get(i14)).c(this.f7324a);
        }
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            a(list.get(i15));
        }
        List listB2 = p13.h0.b1(list);
        int size3 = listB2.size();
        for (int i16 = 0; i16 < size3; i16++) {
            d dVar = (d) listB2.get(i16);
            if (dVar.f7343k.isEmpty()) {
                dVar.b();
            }
        }
    }

    public final void d(d.b bVar, d.a aVar, d0 d0Var) {
        synchronized (this.f7325b) {
            try {
                Fragment fragment = d0Var.f7166c;
                fragment.getClass();
                d dVarF = f(fragment);
                if (dVarF == null) {
                    Fragment fragment2 = d0Var.f7166c;
                    dVarF = (fragment2.mTransitioning || fragment2.mRemoving) ? g(fragment2) : null;
                }
                if (dVarF != null) {
                    dVarF.d(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, d0Var);
                this.f7325b.add(cVar);
                final int i14 = 0;
                cVar.f7336d.add(new Runnable(this) { // from class: androidx.fragment.app.p0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ q0 f7321b;

                    {
                        this.f7321b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i15 = i14;
                        q0.c cVar2 = cVar;
                        q0 q0Var = this.f7321b;
                        switch (i15) {
                            case 0:
                                q0.a aVar2 = q0.f7323g;
                                if (q0Var.f7325b.contains(cVar2)) {
                                    q0.d.b bVar2 = cVar2.f7333a;
                                    View view2 = cVar2.f7335c.mView;
                                    view2.getClass();
                                    bVar2.a(view2, q0Var.f7324a);
                                }
                                break;
                            default:
                                q0.a aVar3 = q0.f7323g;
                                q0Var.f7325b.remove(cVar2);
                                q0Var.f7326c.remove(cVar2);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                cVar.f7336d.add(new Runnable(this) { // from class: androidx.fragment.app.p0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ q0 f7321b;

                    {
                        this.f7321b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i16 = i15;
                        q0.c cVar2 = cVar;
                        q0 q0Var = this.f7321b;
                        switch (i16) {
                            case 0:
                                q0.a aVar2 = q0.f7323g;
                                if (q0Var.f7325b.contains(cVar2)) {
                                    q0.d.b bVar2 = cVar2.f7333a;
                                    View view2 = cVar2.f7335c.mView;
                                    view2.getClass();
                                    bVar2.a(view2, q0Var.f7324a);
                                }
                                break;
                            default:
                                q0.a aVar3 = q0.f7323g;
                                q0Var.f7325b.remove(cVar2);
                                q0Var.f7326c.remove(cVar2);
                                break;
                        }
                    }
                });
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e() {
        boolean z14;
        if (this.f7329f) {
            return;
        }
        if (!this.f7324a.isAttachedToWindow()) {
            h();
            this.f7328e = false;
            return;
        }
        synchronized (this.f7325b) {
            try {
                ArrayList<d> arrayListD1 = p13.h0.d1(this.f7326c);
                this.f7326c.clear();
                Iterator it = arrayListD1.iterator();
                while (true) {
                    z14 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f7325b.isEmpty() || !dVar.f7335c.mTransitioning) {
                        z14 = false;
                    }
                    dVar.f7339g = z14;
                }
                for (d dVar2 : arrayListD1) {
                    if (this.f7327d) {
                        if (v.R(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.b();
                    } else {
                        if (v.R(2)) {
                            Objects.toString(dVar2);
                        }
                        dVar2.a(this.f7324a);
                    }
                    this.f7327d = false;
                    if (!dVar2.f7338f) {
                        this.f7326c.add(dVar2);
                    }
                }
                if (!this.f7325b.isEmpty()) {
                    m();
                    ArrayList arrayListD2 = p13.h0.d1(this.f7325b);
                    if (arrayListD2.isEmpty()) {
                        return;
                    }
                    this.f7325b.clear();
                    this.f7326c.addAll(arrayListD2);
                    b(arrayListD2, this.f7328e);
                    boolean zJ = j(arrayListD2);
                    Iterator it3 = arrayListD2.iterator();
                    boolean z15 = true;
                    while (it3.hasNext()) {
                        if (!((d) it3.next()).f7335c.mTransitioning) {
                            z15 = false;
                        }
                    }
                    if (!z15 || zJ) {
                        z14 = false;
                    }
                    this.f7327d = z14;
                    if (!z15) {
                        l(arrayListD2);
                        c(arrayListD2);
                    } else if (zJ) {
                        l(arrayListD2);
                        int size = arrayListD2.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            a((d) arrayListD2.get(i14));
                        }
                    }
                    this.f7328e = false;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final d f(Fragment fragment) {
        Object next;
        Iterator it = this.f7325b.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (dVar.f7335c.equals(fragment) && !dVar.f7337e) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final d g(Fragment fragment) {
        Object next;
        Iterator it = this.f7326c.iterator();
        while (it.hasNext()) {
            next = it.next();
            d dVar = (d) next;
            if (dVar.f7335c.equals(fragment) && !dVar.f7337e) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final void h() {
        boolean zIsAttachedToWindow = this.f7324a.isAttachedToWindow();
        synchronized (this.f7325b) {
            try {
                m();
                l(this.f7325b);
                ArrayList<d> arrayListD1 = p13.h0.d1(this.f7326c);
                Iterator it = arrayListD1.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f7339g = false;
                }
                for (d dVar : arrayListD1) {
                    if (v.R(2)) {
                        if (!zIsAttachedToWindow) {
                            this.f7324a.toString();
                        }
                        Objects.toString(dVar);
                    }
                    dVar.a(this.f7324a);
                }
                ArrayList<d> arrayListD2 = p13.h0.d1(this.f7325b);
                Iterator it3 = arrayListD2.iterator();
                while (it3.hasNext()) {
                    ((d) it3.next()).f7339g = false;
                }
                for (d dVar2 : arrayListD2) {
                    if (v.R(2)) {
                        if (!zIsAttachedToWindow) {
                            this.f7324a.toString();
                        }
                        Objects.toString(dVar2);
                    }
                    dVar2.a(this.f7324a);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k() {
        Object objPrevious;
        synchronized (this.f7325b) {
            try {
                m();
                ArrayList arrayList = this.f7325b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.f7348a;
                    View view2 = dVar.f7335c.mView;
                    view2.getClass();
                    aVar.getClass();
                    d.b bVarA = d.b.a.a(view2);
                    d.b bVar = dVar.f7333a;
                    d.b bVar2 = d.b.VISIBLE;
                    if (bVar == bVar2 && bVarA != bVar2) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                Fragment fragment = dVar2 != null ? dVar2.f7335c : null;
                this.f7329f = fragment != null ? fragment.isPostponed() : false;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l(List<d> list) {
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            list.get(i14).e();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p13.d0.v(arrayList, ((d) it.next()).f7343k);
        }
        List listB1 = p13.h0.b1(p13.h0.g1(arrayList));
        int size2 = listB1.size();
        for (int i15 = 0; i15 < size2; i15++) {
            b bVar = (b) listB1.get(i15);
            bVar.getClass();
            if (!bVar.f7330a) {
                bVar.e(this.f7324a);
            }
            bVar.f7330a = true;
        }
    }

    public final void m() {
        for (d dVar : this.f7325b) {
            if (dVar.f7334b == d.a.ADDING) {
                View viewRequireView = dVar.f7335c.requireView();
                viewRequireView.getClass();
                d.b.a aVar = d.b.f7348a;
                int visibility = viewRequireView.getVisibility();
                aVar.getClass();
                dVar.d(d.b.a.b(visibility), d.a.NONE);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/q0$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
