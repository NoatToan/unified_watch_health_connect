package va1;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.x;
import p13.y;
import r22.t1;
import r22.u1;
import ty1.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lva1/j;", "Lva1/b;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j extends va1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f176618f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f176619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u1 f176620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa1.a f176621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f176622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f176623e = new w1(s0.f105811a.b(ua1.c.class), new c(this), new e(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176624a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f176624a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176624a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176624a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f176625a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176625a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176626a = aVar;
            this.f176627b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176626a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176627b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176628a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f176628a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f176628a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // va1.b
    public final int V5() {
        return R.string.power_guide_title_select_bike_weight;
    }

    @Override // va1.b
    public final String b5() {
        return "SelectBikeWeightFrag";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.power_guide_selection_fragment, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0126  */
    /* JADX WARN: Code duplicated, block: B:24:0x012a  */
    /* JADX WARN: Code duplicated, block: B:26:0x012e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0135  */
    /* JADX WARN: Code duplicated, block: B:29:0x0139  */
    /* JADX WARN: Code duplicated, block: B:30:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [va1.c$c] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String str;
        Context context;
        String strD;
        ?? r14;
        ?? r15;
        String string;
        Integer numValueOf;
        va1.c.AbstractC3296c abstractC3296c;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f176619a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        RecyclerView recyclerView2 = this.f176619a;
        String str2 = null;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.f176619a;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = this.f176619a;
        if (recyclerView4 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView4.setMotionEventSplittingEnabled(false);
        TextView textView = new TextView(new ContextThemeWrapper(getContext(), R.style.PowerGuideHeaderText), null, 0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setText(R.string.power_guide_header_select_bike_weight);
        RecyclerView recyclerView5 = this.f176619a;
        if (recyclerView5 == null) {
            s.m("recyclerView");
            throw null;
        }
        Context context2 = recyclerView5.getContext();
        boolean z14 = am.j.z(f12.l.f68084a);
        ArrayList arrayList = new ArrayList();
        va1.c.f176585c.getClass();
        List<va1.c> listK = x.k(new va1.c.AbstractC3296c.d(), new va1.c.AbstractC3296c.a(), new va1.c.AbstractC3296c.C3297c(), new va1.c.AbstractC3296c.b(), new va1.c.b());
        ArrayList arrayList2 = new ArrayList(y.r(listK, 10));
        for (va1.c cVar : listK) {
            context2.getClass();
            cVar.getClass();
            if (cVar instanceof va1.c.b) {
                strD = context2.getString(R.string.lbl_custom_weight);
                strD.getClass();
                str = str2;
                context = context2;
            } else {
                va1.c.AbstractC3296c abstractC3296c2 = (va1.c.AbstractC3296c) cVar;
                DecimalFormat decimalFormat = l3.f23126d;
                str = str2;
                if (z14) {
                    context = context2;
                    strD = j20.x.d(decimalFormat.format(abstractC3296c2.f176588d), "-", decimalFormat.format(abstractC3296c2.f176589e), StringUtils.SPACE, context.getResources().getString(R.string.lbl_kg));
                } else {
                    context = context2;
                    strD = j20.x.d(decimalFormat.format(abstractC3296c2.f176590f), "-", decimalFormat.format(abstractC3296c2.f176591g), StringUtils.SPACE, context.getResources().getString(R.string.lbl_lbs));
                }
                if (cVar instanceof va1.c.AbstractC3296c) {
                    abstractC3296c = (va1.c.AbstractC3296c) cVar;
                } else {
                    r14 = str;
                }
                if (r14 != 0) {
                    numValueOf = Integer.valueOf(r14.f176592h);
                } else {
                    r15 = str;
                }
                if (r15 != 0) {
                    r14 = abstractC3296c;
                    r14 = abstractC3296c;
                    r15 = numValueOf;
                    string = getString(r15.intValue());
                } else {
                    r14 = abstractC3296c;
                    r14 = abstractC3296c;
                    r15 = numValueOf;
                    string = str;
                }
                Context context3 = context;
                arrayList2.add(new t1(cVar.f176586a, null, null, strD, string, false, false, oi0.c.A(context3, new uu.o(29), strD), false, null, 870, null));
                str2 = str;
                context2 = context3;
                z14 = z14;
            }
            if (cVar instanceof va1.c.AbstractC3296c) {
                abstractC3296c = (va1.c.AbstractC3296c) cVar;
            } else {
                r14 = str;
            }
            if (r14 != 0) {
                numValueOf = Integer.valueOf(r14.f176592h);
            } else {
                r15 = str;
            }
            if (r15 != 0) {
                r14 = abstractC3296c;
                r14 = abstractC3296c;
                r15 = numValueOf;
                string = getString(r15.intValue());
            } else {
                r14 = abstractC3296c;
                r14 = abstractC3296c;
                r15 = numValueOf;
                string = str;
            }
            Context context4 = context;
            arrayList2.add(new t1(cVar.f176586a, null, null, strD, string, false, false, oi0.c.A(context4, new uu.o(29), strD), false, null, 870, null));
            str2 = str;
            context2 = context4;
            z14 = z14;
        }
        ?? r34 = str2;
        arrayList.addAll(arrayList2);
        RecyclerView recyclerView6 = this.f176619a;
        if (recyclerView6 == null) {
            s.m("recyclerView");
            throw r34;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(recyclerView6.getContext());
        RecyclerView recyclerView7 = this.f176619a;
        if (recyclerView7 == null) {
            s.m("recyclerView");
            throw r34;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.power_guide_select_bike_weight_footer, (ViewGroup) recyclerView7, false);
        final int i14 = 1;
        e23.l lVar = new e23.l(this) { // from class: va1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f176617b;

            {
                this.f176617b = this;
            }

            /* JADX WARN: Code duplicated, block: B:51:0x009d  */
            /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:54:0x00a5  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
                  (r3v5 java.lang.Object) from 0x0099: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:48:0x0098, B:62:0x0099] A[DONT_GENERATE, DONT_INLINE]
                  (r3v5 java.lang.Object) from 0x008b: CHECK_CAST (r22.t1) (r3v5 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r2
                    r1 = 0
                    va1.j r2 = r6.f176617b
                    switch(r0) {
                        case 0: goto L59;
                        default: goto L8;
                    }
                L8:
                    java.lang.Double r7 = (java.lang.Double) r7
                    double r3 = r7.doubleValue()
                    int r7 = va1.j.f176618f
                    java.util.ArrayList r7 = r2.u6()
                    if (r7 == 0) goto L30
                    java.util.Iterator r7 = r7.iterator()
                L1a:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L2c
                    java.lang.Object r0 = r7.next()
                    r5 = r0
                    r22.t1 r5 = (r22.t1) r5
                    boolean r5 = r5.f149897g
                    if (r5 == 0) goto L1a
                    goto L2d
                L2c:
                    r0 = r1
                L2d:
                    r22.t1 r0 = (r22.t1) r0
                    goto L31
                L30:
                    r0 = r1
                L31:
                    if (r0 == 0) goto L36
                    java.lang.String r7 = r0.f149891a
                    goto L37
                L36:
                    r7 = r1
                L37:
                    java.lang.String r0 = "CUSTOM"
                    boolean r7 = p005kotlin.jvm.internal.s.g(r7, r0)
                    if (r7 == 0) goto L56
                    android.widget.Button r7 = r2.f176622d
                    if (r7 == 0) goto L50
                    r0 = 0
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L4b
                    r0 = 1
                    goto L4c
                L4b:
                    r0 = 0
                L4c:
                    r7.setEnabled(r0)
                    goto L56
                L50:
                    java.lang.String r7 = "nextBtn"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L56:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L59:
                    va1.c r7 = (va1.c) r7
                    int r0 = va1.j.f176618f
                    if (r7 == 0) goto Lab
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto Lab
                    boolean r3 = r7 instanceof va1.c.b
                    if (r3 == 0) goto L7c
                    wa1.a r3 = r2.f176621c
                    if (r3 == 0) goto L76
                    r4 = r7
                    va1.c$b r4 = (va1.c.b) r4
                    double r4 = r4.f176587b
                    r3.a(r4)
                    goto L7c
                L76:
                    java.lang.String r7 = "weightItemViewHolder"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L7c:
                    java.util.Iterator r0 = r0.iterator()
                L80:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L98
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    java.lang.String r4 = r4.f149891a
                    java.lang.String r5 = r7.f176586a
                    boolean r4 = p005kotlin.jvm.internal.s.g(r4, r5)
                    if (r4 == 0) goto L80
                    goto L99
                L98:
                    r3 = r1
                L99:
                    r22.t1 r3 = (r22.t1) r3
                    if (r3 == 0) goto Lab
                    r22.u1 r7 = r2.f176620b
                    if (r7 == 0) goto La5
                    r7.B(r3)
                    goto Lab
                La5:
                    java.lang.String r7 = "adapter"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                Lab:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: va1.i.invoke(java.lang.Object):java.lang.Object");
            }
        };
        View viewFindViewById2 = viewInflate.findViewById(R.id.weight_item);
        viewFindViewById2.getClass();
        wa1.a aVar = new wa1.a(viewFindViewById2, lVar);
        this.f176621c = aVar;
        aVar.f183783a.setEnabled(false);
        aVar.f183786d.setEnabled(false);
        aVar.f183787e.setEnabled(false);
        u1 u1Var = new u1(new f1(this, 29));
        u1Var.t(textView);
        u1Var.D(arrayList);
        u1Var.r(viewInflate);
        u1Var.f149752e = new uu.o(28);
        this.f176620b = u1Var;
        RecyclerView recyclerView8 = this.f176619a;
        if (recyclerView8 == null) {
            s.m("recyclerView");
            throw r34;
        }
        recyclerView8.setAdapter(u1Var);
        View viewFindViewById3 = view2.findViewById(R.id.primary_action_btn);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f176622d = button;
        button.setOnClickListener(new t61.m(this, 26));
        final int i15 = 0;
        ((ua1.c) this.f176623e.getValue()).f169612h.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: va1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f176617b;

            {
                this.f176617b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 java.lang.Object, still in use, count: 2, list:
                  (r3v5 java.lang.Object) from 0x0099: PHI (r3 I:??) = (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:48:0x0098, B:62:0x0099] A[DONT_GENERATE, DONT_INLINE]
                  (r3v5 java.lang.Object) from 0x008b: CHECK_CAST (r22.t1) (r3v5 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r2
                    r1 = 0
                    va1.j r2 = r6.f176617b
                    switch(r0) {
                        case 0: goto L59;
                        default: goto L8;
                    }
                L8:
                    java.lang.Double r7 = (java.lang.Double) r7
                    double r3 = r7.doubleValue()
                    int r7 = va1.j.f176618f
                    java.util.ArrayList r7 = r2.u6()
                    if (r7 == 0) goto L30
                    java.util.Iterator r7 = r7.iterator()
                L1a:
                    boolean r0 = r7.hasNext()
                    if (r0 == 0) goto L2c
                    java.lang.Object r0 = r7.next()
                    r5 = r0
                    r22.t1 r5 = (r22.t1) r5
                    boolean r5 = r5.f149897g
                    if (r5 == 0) goto L1a
                    goto L2d
                L2c:
                    r0 = r1
                L2d:
                    r22.t1 r0 = (r22.t1) r0
                    goto L31
                L30:
                    r0 = r1
                L31:
                    if (r0 == 0) goto L36
                    java.lang.String r7 = r0.f149891a
                    goto L37
                L36:
                    r7 = r1
                L37:
                    java.lang.String r0 = "CUSTOM"
                    boolean r7 = p005kotlin.jvm.internal.s.g(r7, r0)
                    if (r7 == 0) goto L56
                    android.widget.Button r7 = r2.f176622d
                    if (r7 == 0) goto L50
                    r0 = 0
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L4b
                    r0 = 1
                    goto L4c
                L4b:
                    r0 = 0
                L4c:
                    r7.setEnabled(r0)
                    goto L56
                L50:
                    java.lang.String r7 = "nextBtn"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L56:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L59:
                    va1.c r7 = (va1.c) r7
                    int r0 = va1.j.f176618f
                    if (r7 == 0) goto Lab
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto Lab
                    boolean r3 = r7 instanceof va1.c.b
                    if (r3 == 0) goto L7c
                    wa1.a r3 = r2.f176621c
                    if (r3 == 0) goto L76
                    r4 = r7
                    va1.c$b r4 = (va1.c.b) r4
                    double r4 = r4.f176587b
                    r3.a(r4)
                    goto L7c
                L76:
                    java.lang.String r7 = "weightItemViewHolder"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L7c:
                    java.util.Iterator r0 = r0.iterator()
                L80:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L98
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    java.lang.String r4 = r4.f149891a
                    java.lang.String r5 = r7.f176586a
                    boolean r4 = p005kotlin.jvm.internal.s.g(r4, r5)
                    if (r4 == 0) goto L80
                    goto L99
                L98:
                    r3 = r1
                L99:
                    r22.t1 r3 = (r22.t1) r3
                    if (r3 == 0) goto Lab
                    r22.u1 r7 = r2.f176620b
                    if (r7 == 0) goto La5
                    r7.B(r3)
                    goto Lab
                La5:
                    java.lang.String r7 = "adapter"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                Lab:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: va1.i.invoke(java.lang.Object):java.lang.Object");
            }
        }));
    }

    public final ArrayList u6() {
        u1 u1Var = this.f176620b;
        if (u1Var != null) {
            return u1Var.A();
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lva1/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
