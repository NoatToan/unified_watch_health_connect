package az1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import f12.l;
import fw.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Laz1/h;", "Landroidx/fragment/app/Fragment;", "Luy1/a$b;", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends Fragment implements uy1.a.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f13755m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f13756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zy1.b f13757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f13758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uy1.a f13759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f13760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f13761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f13762g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f13763h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f13764i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final az1.f f13765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final az1.f f13766k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f13767l;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13768a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13768a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"az1/h$c", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = h.f13755m;
            h.this.w6();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13770a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f13770a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f13771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f13772b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f13771a = aVar;
            this.f13772b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f13771a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13772b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f13773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f13773a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f13773a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [az1.f] */
    /* JADX WARN: Type inference failed for: r0v4, types: [az1.f] */
    public h() {
        super(R.layout.event_dashboard_priority_list_fragment);
        this.f13756a = new w1(s0.f105811a.b(zy1.d.class), new d(this), new f(this), new e(null, this));
        final int i14 = 0;
        this.f13765j = new z0(this) { // from class: az1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13752b;

            {
                this.f13752b = this;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v6 */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ?? B1;
                ?? r15;
                uy1.a aVar;
                int i15 = i14;
                h hVar = this.f13752b;
                switch (i15) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        h.a aVar2 = h.f13755m;
                        g3Var.getClass();
                        int i16 = h.b.f13768a[g3Var.f35300a.ordinal()];
                        if (i16 != 1) {
                            if (i16 == 2) {
                                g22.e.a(hVar, null);
                                g22.e.f(hVar);
                                return;
                            } else if (i16 == 3) {
                                g22.e.l(hVar);
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        g22.e.f(hVar);
                        bz1.a aVar3 = (bz1.a) g3Var.f35301b;
                        if (aVar3 != null) {
                            List<fg0.k> list = aVar3.f22287c;
                            if (hVar.u6().I == dg0.a.SUPPORTING_EVENT) {
                                long j8 = aVar3.f22285a;
                                TextView textView = hVar.f13762g;
                                if (j8 == -1) {
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("mTitle");
                                        throw null;
                                    }
                                    textView.setText(hVar.getString(R.string.primary_event));
                                    if (list != null) {
                                        B1 = new ArrayList(y.r(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            B1.add(((fg0.k) it.next()).clone());
                                        }
                                        r15 = B1;
                                    } else {
                                        r15 = 0;
                                    }
                                } else {
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("mTitle");
                                        throw null;
                                    }
                                    textView.setText(hVar.getString(R.string.supporting_events));
                                    TextView textView2 = hVar.f13763h;
                                    if (textView2 == null) {
                                        p005kotlin.jvm.internal.s.m("headerView");
                                        throw null;
                                    }
                                    textView2.setText(hVar.getString(R.string.select_supporting_events));
                                    TextView textView3 = hVar.f13764i;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("headerDescView");
                                        throw null;
                                    }
                                    textView3.setText(hVar.getString(R.string.supporing_event_description));
                                    if (list != null) {
                                        B1 = new ArrayList(y.r(list, 10));
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            B1.add(((fg0.k) it3.next()).clone());
                                        }
                                        r15 = B1;
                                    } else {
                                        r15 = 0;
                                    }
                                }
                            } else {
                                TextView textView4 = hVar.f13762g;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mTitle");
                                    throw null;
                                }
                                textView4.setText(hVar.getString(R.string.primary_event));
                                List<fg0.k> list2 = aVar3.f22286b;
                                if (list2 != null) {
                                    B1 = h0.b1(list2);
                                    r15 = B1;
                                } else {
                                    r15 = 0;
                                }
                            }
                            if (r15 != 0) {
                                Context contextRequireContext = hVar.requireContext();
                                contextRequireContext.getClass();
                                long j14 = aVar3.f22285a;
                                aVar = new uy1.a(contextRequireContext, j14, r15, j14 != -1 && hVar.u6().I == dg0.a.SUPPORTING_EVENT);
                            } else {
                                aVar = null;
                            }
                            hVar.f13759d = aVar;
                            if (aVar != null) {
                                aVar.f173386e = hVar;
                            }
                            RecyclerView recyclerView = hVar.f13758c;
                            if (recyclerView != null) {
                                recyclerView.setAdapter(aVar);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        h.a aVar4 = h.f13755m;
                        if (g3Var2 != null) {
                            int i17 = h.b.f13768a[g3Var2.f35300a.ordinal()];
                            if (i17 == 1) {
                                g22.e.f(hVar);
                                Object obj2 = g3Var2.f35301b;
                                Boolean bool = Boolean.TRUE;
                                if (p005kotlin.jvm.internal.s.g(obj2, bool)) {
                                    ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).T3(true);
                                    hVar.u6().c5(bool);
                                }
                                hVar.u6().b5().m(null);
                                hVar.w6();
                                return;
                            }
                            if (i17 != 2) {
                                if (i17 == 3) {
                                    g22.e.l(hVar);
                                    return;
                                } else {
                                    u0.r();
                                    return;
                                }
                            }
                            g22.e.f(hVar);
                            g22.e.a(hVar, null);
                            hVar.u6().b5().m(null);
                            hVar.w6();
                            return;
                        }
                        return;
                }
            }
        };
        final int i15 = 1;
        this.f13766k = new z0(this) { // from class: az1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13752b;

            {
                this.f13752b = this;
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00f1  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r15v0 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r15v2 */
            /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r3v6 */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                ?? B1;
                ?? r15;
                uy1.a aVar;
                int i16 = i15;
                h hVar = this.f13752b;
                switch (i16) {
                    case 0:
                        g3 g3Var = (g3) obj;
                        h.a aVar2 = h.f13755m;
                        g3Var.getClass();
                        int i17 = h.b.f13768a[g3Var.f35300a.ordinal()];
                        if (i17 != 1) {
                            if (i17 == 2) {
                                g22.e.a(hVar, null);
                                g22.e.f(hVar);
                                return;
                            } else if (i17 == 3) {
                                g22.e.l(hVar);
                                return;
                            } else {
                                u0.r();
                                return;
                            }
                        }
                        g22.e.f(hVar);
                        bz1.a aVar3 = (bz1.a) g3Var.f35301b;
                        if (aVar3 != null) {
                            List<fg0.k> list = aVar3.f22287c;
                            if (hVar.u6().I == dg0.a.SUPPORTING_EVENT) {
                                long j8 = aVar3.f22285a;
                                TextView textView = hVar.f13762g;
                                if (j8 == -1) {
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("mTitle");
                                        throw null;
                                    }
                                    textView.setText(hVar.getString(R.string.primary_event));
                                    if (list != null) {
                                        B1 = new ArrayList(y.r(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            B1.add(((fg0.k) it.next()).clone());
                                        }
                                        r15 = B1;
                                    } else {
                                        r15 = 0;
                                    }
                                } else {
                                    if (textView == null) {
                                        p005kotlin.jvm.internal.s.m("mTitle");
                                        throw null;
                                    }
                                    textView.setText(hVar.getString(R.string.supporting_events));
                                    TextView textView2 = hVar.f13763h;
                                    if (textView2 == null) {
                                        p005kotlin.jvm.internal.s.m("headerView");
                                        throw null;
                                    }
                                    textView2.setText(hVar.getString(R.string.select_supporting_events));
                                    TextView textView3 = hVar.f13764i;
                                    if (textView3 == null) {
                                        p005kotlin.jvm.internal.s.m("headerDescView");
                                        throw null;
                                    }
                                    textView3.setText(hVar.getString(R.string.supporing_event_description));
                                    if (list != null) {
                                        B1 = new ArrayList(y.r(list, 10));
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            B1.add(((fg0.k) it3.next()).clone());
                                        }
                                        r15 = B1;
                                    } else {
                                        r15 = 0;
                                    }
                                }
                            } else {
                                TextView textView4 = hVar.f13762g;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("mTitle");
                                    throw null;
                                }
                                textView4.setText(hVar.getString(R.string.primary_event));
                                List<fg0.k> list2 = aVar3.f22286b;
                                if (list2 != null) {
                                    B1 = h0.b1(list2);
                                    r15 = B1;
                                } else {
                                    r15 = 0;
                                }
                            }
                            if (r15 != 0) {
                                Context contextRequireContext = hVar.requireContext();
                                contextRequireContext.getClass();
                                long j14 = aVar3.f22285a;
                                aVar = new uy1.a(contextRequireContext, j14, r15, j14 != -1 && hVar.u6().I == dg0.a.SUPPORTING_EVENT);
                            } else {
                                aVar = null;
                            }
                            hVar.f13759d = aVar;
                            if (aVar != null) {
                                aVar.f173386e = hVar;
                            }
                            RecyclerView recyclerView = hVar.f13758c;
                            if (recyclerView != null) {
                                recyclerView.setAdapter(aVar);
                                return;
                            } else {
                                p005kotlin.jvm.internal.s.m("recyclerViewEvents");
                                throw null;
                            }
                        }
                        return;
                    default:
                        g3 g3Var2 = (g3) obj;
                        h.a aVar4 = h.f13755m;
                        if (g3Var2 != null) {
                            int i18 = h.b.f13768a[g3Var2.f35300a.ordinal()];
                            if (i18 == 1) {
                                g22.e.f(hVar);
                                Object obj2 = g3Var2.f35301b;
                                Boolean bool = Boolean.TRUE;
                                if (p005kotlin.jvm.internal.s.g(obj2, bool)) {
                                    ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).T3(true);
                                    hVar.u6().c5(bool);
                                }
                                hVar.u6().b5().m(null);
                                hVar.w6();
                                return;
                            }
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    g22.e.l(hVar);
                                    return;
                                } else {
                                    u0.r();
                                    return;
                                }
                            }
                            g22.e.f(hVar);
                            g22.e.a(hVar, null);
                            hVar.u6().b5().m(null);
                            hVar.w6();
                            return;
                        }
                        return;
                }
            }
        };
        this.f13767l = new c();
    }

    public static void v6(h hVar, fg0.k kVar, List list, int i14) {
        Object next;
        String strR = null;
        if ((i14 & 1) != 0) {
            kVar = null;
        }
        if ((i14 & 2) != 0) {
            list = null;
        }
        uy1.a aVar = hVar.f13759d;
        if (aVar != null) {
            Iterator<T> it = aVar.f173384c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Long l14 = ((fg0.k) next).getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                long j8 = aVar.f173383b;
                if (l14 != null && l14.longValue() == j8) {
                    break;
                }
            }
            fg0.k kVar2 = (fg0.k) next;
            if (kVar2 != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strR = kVar2.r(false);
            }
        }
        if (strR == null) {
            zy1.d dVarU6 = hVar.u6();
            dVarU6.P = kVar;
            dVarU6.T = list;
            dVarU6.a5().m("EventChangePriorityConfirmationFragment");
            return;
        }
        Context contextRequireContext = hVar.requireContext();
        contextRequireContext.getClass();
        String string = hVar.getString(R.string.quit_current_plan_question);
        string.getClass();
        lz1.e.f(contextRequireContext, string, hVar.getString(R.string.update_training_priority_message, strR), R.string.lbl_common_continue, new a4.a(hVar, 9, kVar, list));
    }

    @Override // uy1.a.b
    public final void f(fg0.k kVar) {
        kVar.getClass();
        TextView textView = this.f13760e;
        if (textView == null) {
            p005kotlin.jvm.internal.s.m("mSave");
            throw null;
        }
        Long l14 = kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
        uy1.a aVar = this.f13759d;
        textView.setEnabled(!p005kotlin.jvm.internal.s.g(l14, aVar != null ? Long.valueOf(aVar.f173383b) : null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        Object context = getContext();
        zy1.b bVar = context instanceof zy1.b ? (zy1.b) context : null;
        this.f13757b = bVar;
        final int i14 = 0;
        if (bVar != null) {
            bVar.i0(false);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f13767l, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.rv_events);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f13758c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        View viewFindViewById2 = view2.findViewById(R.id.toolbar_actionbar_default);
        viewFindViewById2.getClass();
        View viewFindViewById3 = view2.findViewById(R.id.title_text_view);
        viewFindViewById3.getClass();
        this.f13762g = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.text_view_cancel);
        viewFindViewById4.getClass();
        this.f13761f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.text_view_save);
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        this.f13760e = textView;
        textView.setEnabled(false);
        View viewFindViewById6 = view2.findViewById(R.id.header);
        viewFindViewById6.getClass();
        this.f13763h = (TextView) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.header_desc);
        viewFindViewById7.getClass();
        this.f13764i = (TextView) viewFindViewById7;
        TextView textView2 = this.f13761f;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("mCancel");
            throw null;
        }
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: az1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13754b;

            {
                this.f13754b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                List<fg0.k> list;
                int i15 = i14;
                h hVar = this.f13754b;
                switch (i15) {
                    case 0:
                        h.a aVar = h.f13755m;
                        hVar.w6();
                        break;
                    default:
                        uy1.a aVar2 = hVar.f13759d;
                        if (aVar2 == null || !aVar2.f173385d) {
                            if (aVar2 != null) {
                                int i16 = aVar2.f173387f;
                                fg0.k kVar = i16 > -1 ? aVar2.f173384c.get(i16) : null;
                                if (kVar != null) {
                                    if (!hVar.u6().e5(true)) {
                                        hVar.u6().f5(kVar);
                                    } else {
                                        h.v6(hVar, kVar, null, 2);
                                    }
                                }
                            }
                            break;
                        } else {
                            boolean zE5 = hVar.u6().e5(false);
                            uy1.a aVar3 = hVar.f13759d;
                            if (zE5) {
                                h.v6(hVar, null, aVar3 != null ? aVar3.f173384c : null, 1);
                                break;
                            } else if (aVar3 != null && (list = aVar3.f173384c) != null) {
                                hVar.u6().d5(list);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        TextView textView3 = this.f13760e;
        if (textView3 == null) {
            p005kotlin.jvm.internal.s.m("mSave");
            throw null;
        }
        final int i15 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: az1.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f13754b;

            {
                this.f13754b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                List<fg0.k> list;
                int i16 = i15;
                h hVar = this.f13754b;
                switch (i16) {
                    case 0:
                        h.a aVar = h.f13755m;
                        hVar.w6();
                        break;
                    default:
                        uy1.a aVar2 = hVar.f13759d;
                        if (aVar2 == null || !aVar2.f173385d) {
                            if (aVar2 != null) {
                                int i17 = aVar2.f173387f;
                                fg0.k kVar = i17 > -1 ? aVar2.f173384c.get(i17) : null;
                                if (kVar != null) {
                                    if (!hVar.u6().e5(true)) {
                                        hVar.u6().f5(kVar);
                                    } else {
                                        h.v6(hVar, kVar, null, 2);
                                    }
                                }
                            }
                            break;
                        } else {
                            boolean zE5 = hVar.u6().e5(false);
                            uy1.a aVar3 = hVar.f13759d;
                            if (zE5) {
                                h.v6(hVar, null, aVar3 != null ? aVar3.f173384c : null, 1);
                                break;
                            } else if (aVar3 != null && (list = aVar3.f173384c) != null) {
                                hVar.u6().d5(list);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        u6().M0.f(getViewLifecycleOwner(), this.f13765j);
        u6().I0.f(getViewLifecycleOwner(), this.f13766k);
        View viewFindViewById8 = view2.findViewById(R.id.toolbar_actionbar_default);
        a0 a0Var = new a0(18);
        WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
        androidx.core.view.s0.d.c(viewFindViewById8, a0Var);
    }

    public final zy1.d u6() {
        return (zy1.d) this.f13756a.getValue();
    }

    public final void w6() {
        this.f13767l.f(false);
        requireActivity().onBackPressed();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Laz1/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
