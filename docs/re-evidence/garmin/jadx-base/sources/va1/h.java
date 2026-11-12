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
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.google.protobuf.DescriptorProtos;
import j20.x;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import r22.t1;
import r22.u1;
import ty1.f1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lva1/h;", "Lva1/b;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends va1.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f176605f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f176606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u1 f176607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wa1.b f176608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f176609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w1 f176610e = new w1(s0.f105811a.b(ua1.c.class), new c(this), new e(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f176611a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f176611a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f176611a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f176611a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f176612a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f176612a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f176613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f176614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f176613a = aVar;
            this.f176614b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f176613a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f176614b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f176615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f176615a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f176615a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    static {
        new a(null);
    }

    @Override // va1.b
    public final int V5() {
        return R.string.power_guide_title_select_ability;
    }

    @Override // va1.b
    public final String b5() {
        return "SelectAbilityFrag";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.power_guide_selection_fragment, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v5, types: [java.lang.Throwable] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String str;
        sa1.g[] gVarArr;
        int i14;
        String string;
        String str2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f176606a = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        RecyclerView recyclerView2 = this.f176606a;
        String str3 = "recyclerView";
        String str4 = null;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        int i15 = 1;
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.f176606a;
        if (recyclerView3 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = this.f176606a;
        if (recyclerView4 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView4.setMotionEventSplittingEnabled(false);
        TextView textView = new TextView(new ContextThemeWrapper(getContext(), R.style.PowerGuideHeaderText), null, 0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setText(R.string.power_guide_header_select_ability);
        RecyclerView recyclerView5 = this.f176606a;
        if (recyclerView5 == null) {
            s.m("recyclerView");
            throw null;
        }
        Context context = recyclerView5.getContext();
        boolean z14 = am.j.z(f12.l.f68084a);
        ArrayList arrayList = new ArrayList();
        sa1.g[] gVarArrValues = sa1.g.values();
        ArrayList arrayList2 = new ArrayList(gVarArrValues.length);
        int length = gVarArrValues.length;
        int i16 = 0;
        while (i16 < length) {
            sa1.g gVar = gVarArrValues[i16];
            String str5 = gVar.f158276a;
            String str6 = str4;
            String string2 = context.getString(gVar.f158277b);
            q3 q3Var = z14 ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
            int i17 = f.f176602a[gVar.ordinal()];
            if (i17 == i15) {
                str = str5;
                gVarArr = gVarArrValues;
                q3 q3Var2 = q3Var;
                i14 = length;
                l3.a aVar = l3.f23124b;
                double d14 = gVar.f158279d;
                aVar.getClass();
                string = context.getString(R.string.lbl_below, l3.a.M0(context, d14, q3Var2, l3.f23131i, true));
            } else if (i17 != 2) {
                if (i17 != 3) {
                    l3.a aVar2 = l3.f23124b;
                    double d15 = gVar.f158278c;
                    aVar2.getClass();
                    q3 q3Var3 = q3Var;
                    i14 = length;
                    str = str5;
                    gVarArr = gVarArrValues;
                    string = x.d(l3.a.M0(context, d15, q3Var3, l3.f23131i, false), "-", l3.a.N0(context, gVar.f158279d, q3Var3, l3.f23131i, false, null), StringUtils.SPACE, context.getString(q3Var3.f23223e));
                } else {
                    str3 = str3;
                    arrayList2 = arrayList2;
                    i14 = length;
                    i16 = i16;
                    str = str5;
                    gVarArr = gVarArrValues;
                    str2 = str6;
                }
                arrayList2.add(new t1(str, null, null, string2, str2, false, false, null, false, null, DescriptorProtos.Edition.EDITION_PROTO2_VALUE, null));
                i16++;
                length = i14;
                arrayList2 = arrayList2;
                str3 = str3;
                gVarArrValues = gVarArr;
                i15 = 1;
                str4 = str6;
            } else {
                str = str5;
                gVarArr = gVarArrValues;
                q3 q3Var4 = q3Var;
                i14 = length;
                l3.a aVar3 = l3.f23124b;
                double d16 = gVar.f158278c;
                aVar3.getClass();
                string = context.getString(R.string.lbl_above_speed, l3.a.M0(context, d16, q3Var4, l3.f23131i, true));
            }
            str2 = string;
            arrayList2.add(new t1(str, null, null, string2, str2, false, false, null, false, null, DescriptorProtos.Edition.EDITION_PROTO2_VALUE, null));
            i16++;
            length = i14;
            arrayList2 = arrayList2;
            str3 = str3;
            gVarArrValues = gVarArr;
            i15 = 1;
            str4 = str6;
        }
        String str7 = str3;
        ?? r34 = str4;
        arrayList.addAll(arrayList2);
        RecyclerView recyclerView6 = this.f176606a;
        if (recyclerView6 == null) {
            s.m(str7);
            throw r34;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(recyclerView6.getContext());
        RecyclerView recyclerView7 = this.f176606a;
        if (recyclerView7 == null) {
            s.m(str7);
            throw r34;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.power_guide_select_ability_footer, (ViewGroup) recyclerView7, false);
        final int i18 = 1;
        e23.l lVar = new e23.l(this) { // from class: va1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f176604b;

            {
                this.f176604b = this;
            }

            /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
            /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
            /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
                  (r3v4 java.lang.Object) from 0x009e: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:47:0x009d, B:61:0x009e] A[DONT_GENERATE, DONT_INLINE]
                  (r3v4 java.lang.Object) from 0x0090: CHECK_CAST (r22.t1) (r3v4 java.lang.Object)
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
                    va1.h r2 = r6.f176604b
                    switch(r0) {
                        case 0: goto L75;
                        case 1: goto L21;
                        default: goto L8;
                    }
                L8:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    wa1.b r0 = r2.f176608c
                    if (r0 == 0) goto L1b
                    r7.getClass()
                    int r7 = r7.intValue()
                    r0.a(r7)
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L1b:
                    java.lang.String r7 = "ftpItemViewHolder"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L21:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    int r7 = r7.intValue()
                    int r0 = va1.h.f176605f
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto L49
                    java.util.Iterator r0 = r0.iterator()
                L33:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L45
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    boolean r4 = r4.f149897g
                    if (r4 == 0) goto L33
                    goto L46
                L45:
                    r3 = r1
                L46:
                    r22.t1 r3 = (r22.t1) r3
                    goto L4a
                L49:
                    r3 = r1
                L4a:
                    if (r3 == 0) goto L4f
                    java.lang.String r0 = r3.f149891a
                    goto L50
                L4f:
                    r0 = r1
                L50:
                    sa1.g r3 = sa1.g.CUSTOM
                    java.lang.String r3 = r3.f158276a
                    boolean r0 = p005kotlin.jvm.internal.s.g(r0, r3)
                    if (r0 == 0) goto L72
                    android.widget.Button r0 = r2.f176609d
                    if (r0 == 0) goto L6c
                    double r1 = (double) r7
                    r3 = 0
                    int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r7 <= 0) goto L67
                    r7 = 1
                    goto L68
                L67:
                    r7 = 0
                L68:
                    r0.setEnabled(r7)
                    goto L72
                L6c:
                    java.lang.String r7 = "nextBtn"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L72:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L75:
                    sa1.g r7 = (sa1.g) r7
                    int r0 = va1.h.f176605f
                    if (r7 == 0) goto Lb0
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto Lb0
                    java.util.Iterator r0 = r0.iterator()
                L85:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9d
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    java.lang.String r4 = r4.f149891a
                    java.lang.String r5 = r7.f158276a
                    boolean r4 = p005kotlin.jvm.internal.s.g(r4, r5)
                    if (r4 == 0) goto L85
                    goto L9e
                L9d:
                    r3 = r1
                L9e:
                    r22.t1 r3 = (r22.t1) r3
                    if (r3 == 0) goto Lb0
                    r22.u1 r7 = r2.f176607b
                    if (r7 == 0) goto Laa
                    r7.B(r3)
                    goto Lb0
                Laa:
                    java.lang.String r7 = "adapter"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                Lb0:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: va1.g.invoke(java.lang.Object):java.lang.Object");
            }
        };
        View viewFindViewById2 = viewInflate.findViewById(R.id.ftp_item);
        viewFindViewById2.getClass();
        w1 w1Var = this.f176610e;
        wa1.b bVar = new wa1.b(viewFindViewById2, ((ua1.c) w1Var.getValue()).f169613i, lVar);
        this.f176608c = bVar;
        bVar.f183789a.setEnabled(false);
        bVar.f183792d.setEnabled(false);
        bVar.f183793e.setEnabled(false);
        final int i19 = 2;
        ((ua1.c) w1Var.getValue()).f169614j.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: va1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f176604b;

            {
                this.f176604b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
                  (r3v4 java.lang.Object) from 0x009e: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:47:0x009d, B:61:0x009e] A[DONT_GENERATE, DONT_INLINE]
                  (r3v4 java.lang.Object) from 0x0090: CHECK_CAST (r22.t1) (r3v4 java.lang.Object)
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
                    va1.h r2 = r6.f176604b
                    switch(r0) {
                        case 0: goto L75;
                        case 1: goto L21;
                        default: goto L8;
                    }
                L8:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    wa1.b r0 = r2.f176608c
                    if (r0 == 0) goto L1b
                    r7.getClass()
                    int r7 = r7.intValue()
                    r0.a(r7)
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L1b:
                    java.lang.String r7 = "ftpItemViewHolder"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L21:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    int r7 = r7.intValue()
                    int r0 = va1.h.f176605f
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto L49
                    java.util.Iterator r0 = r0.iterator()
                L33:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L45
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    boolean r4 = r4.f149897g
                    if (r4 == 0) goto L33
                    goto L46
                L45:
                    r3 = r1
                L46:
                    r22.t1 r3 = (r22.t1) r3
                    goto L4a
                L49:
                    r3 = r1
                L4a:
                    if (r3 == 0) goto L4f
                    java.lang.String r0 = r3.f149891a
                    goto L50
                L4f:
                    r0 = r1
                L50:
                    sa1.g r3 = sa1.g.CUSTOM
                    java.lang.String r3 = r3.f158276a
                    boolean r0 = p005kotlin.jvm.internal.s.g(r0, r3)
                    if (r0 == 0) goto L72
                    android.widget.Button r0 = r2.f176609d
                    if (r0 == 0) goto L6c
                    double r1 = (double) r7
                    r3 = 0
                    int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r7 <= 0) goto L67
                    r7 = 1
                    goto L68
                L67:
                    r7 = 0
                L68:
                    r0.setEnabled(r7)
                    goto L72
                L6c:
                    java.lang.String r7 = "nextBtn"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L72:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L75:
                    sa1.g r7 = (sa1.g) r7
                    int r0 = va1.h.f176605f
                    if (r7 == 0) goto Lb0
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto Lb0
                    java.util.Iterator r0 = r0.iterator()
                L85:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9d
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    java.lang.String r4 = r4.f149891a
                    java.lang.String r5 = r7.f158276a
                    boolean r4 = p005kotlin.jvm.internal.s.g(r4, r5)
                    if (r4 == 0) goto L85
                    goto L9e
                L9d:
                    r3 = r1
                L9e:
                    r22.t1 r3 = (r22.t1) r3
                    if (r3 == 0) goto Lb0
                    r22.u1 r7 = r2.f176607b
                    if (r7 == 0) goto Laa
                    r7.B(r3)
                    goto Lb0
                Laa:
                    java.lang.String r7 = "adapter"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                Lb0:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: va1.g.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        u1 u1Var = new u1(new f1(this, 28));
        u1Var.t(textView);
        u1Var.D(arrayList);
        u1Var.r(viewInflate);
        u1Var.f149752e = new uu.o(27);
        this.f176607b = u1Var;
        RecyclerView recyclerView8 = this.f176606a;
        if (recyclerView8 == null) {
            s.m(str7);
            throw r34;
        }
        recyclerView8.setAdapter(u1Var);
        View viewFindViewById3 = view2.findViewById(R.id.primary_action_btn);
        viewFindViewById3.getClass();
        Button button = (Button) viewFindViewById3;
        this.f176609d = button;
        button.setOnClickListener(new t61.m(this, 25));
        final int i24 = 0;
        ((ua1.c) w1Var.getValue()).f169615k.f(getViewLifecycleOwner(), new b(new e23.l(this) { // from class: va1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f176604b;

            {
                this.f176604b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 java.lang.Object, still in use, count: 2, list:
                  (r3v4 java.lang.Object) from 0x009e: PHI (r3 I:??) = (r3v1 java.lang.Object), (r3v4 java.lang.Object) binds: [B:47:0x009d, B:61:0x009e] A[DONT_GENERATE, DONT_INLINE]
                  (r3v4 java.lang.Object) from 0x0090: CHECK_CAST (r22.t1) (r3v4 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // e23.l
            public final java.lang.Object invoke(java.lang.Object r7) {
                /*
                    r6 = this;
                    int r0 = r2
                    r1 = 0
                    va1.h r2 = r6.f176604b
                    switch(r0) {
                        case 0: goto L75;
                        case 1: goto L21;
                        default: goto L8;
                    }
                L8:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    wa1.b r0 = r2.f176608c
                    if (r0 == 0) goto L1b
                    r7.getClass()
                    int r7 = r7.intValue()
                    r0.a(r7)
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L1b:
                    java.lang.String r7 = "ftpItemViewHolder"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L21:
                    java.lang.Integer r7 = (java.lang.Integer) r7
                    int r7 = r7.intValue()
                    int r0 = va1.h.f176605f
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto L49
                    java.util.Iterator r0 = r0.iterator()
                L33:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L45
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    boolean r4 = r4.f149897g
                    if (r4 == 0) goto L33
                    goto L46
                L45:
                    r3 = r1
                L46:
                    r22.t1 r3 = (r22.t1) r3
                    goto L4a
                L49:
                    r3 = r1
                L4a:
                    if (r3 == 0) goto L4f
                    java.lang.String r0 = r3.f149891a
                    goto L50
                L4f:
                    r0 = r1
                L50:
                    sa1.g r3 = sa1.g.CUSTOM
                    java.lang.String r3 = r3.f158276a
                    boolean r0 = p005kotlin.jvm.internal.s.g(r0, r3)
                    if (r0 == 0) goto L72
                    android.widget.Button r0 = r2.f176609d
                    if (r0 == 0) goto L6c
                    double r1 = (double) r7
                    r3 = 0
                    int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r7 <= 0) goto L67
                    r7 = 1
                    goto L68
                L67:
                    r7 = 0
                L68:
                    r0.setEnabled(r7)
                    goto L72
                L6c:
                    java.lang.String r7 = "nextBtn"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                L72:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                L75:
                    sa1.g r7 = (sa1.g) r7
                    int r0 = va1.h.f176605f
                    if (r7 == 0) goto Lb0
                    java.util.ArrayList r0 = r2.u6()
                    if (r0 == 0) goto Lb0
                    java.util.Iterator r0 = r0.iterator()
                L85:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L9d
                    java.lang.Object r3 = r0.next()
                    r4 = r3
                    r22.t1 r4 = (r22.t1) r4
                    java.lang.String r4 = r4.f149891a
                    java.lang.String r5 = r7.f158276a
                    boolean r4 = p005kotlin.jvm.internal.s.g(r4, r5)
                    if (r4 == 0) goto L85
                    goto L9e
                L9d:
                    r3 = r1
                L9e:
                    r22.t1 r3 = (r22.t1) r3
                    if (r3 == 0) goto Lb0
                    r22.u1 r7 = r2.f176607b
                    if (r7 == 0) goto Laa
                    r7.B(r3)
                    goto Lb0
                Laa:
                    java.lang.String r7 = "adapter"
                    p005kotlin.jvm.internal.s.m(r7)
                    throw r1
                Lb0:
                    kotlin.Unit r7 = p005kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: va1.g.invoke(java.lang.Object):java.lang.Object");
            }
        }));
    }

    public final ArrayList u6() {
        u1 u1Var = this.f176607b;
        if (u1Var != null) {
            return u1Var.A();
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lva1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
