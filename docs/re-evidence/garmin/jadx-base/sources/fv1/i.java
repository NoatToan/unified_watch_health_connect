package fv1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.x;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import com.garmin.android.apps.connectmobile.z1;
import e23.p;
import java.util.List;
import java.util.Locale;
import kotlin.w3;
import o53.b0;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.j0;
import r53.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lfv1/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f73723f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f73724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bw1.b<vt1.f> f73725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f73726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f73727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f73728e;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"fv1/i$b", "Lbw1/a;", "Lvt1/f;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements bw1.a<vt1.f> {
        public b() {
        }

        @Override // bw1.a
        public final void a(View view2, int i14, Object obj) {
            vt1.f fVar = (vt1.f) obj;
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.gcm_checkable_row);
            viewFindViewById.getClass();
            GCMCheckableRow gCMCheckableRow = (GCMCheckableRow) viewFindViewById;
            i iVar = i.this;
            Context contextRequireContext = iVar.requireContext();
            contextRequireContext.getClass();
            gCMCheckableRow.setDefaultText(fVar.c(contextRequireContext));
            bw1.b<vt1.f> bVar = iVar.f73725b;
            if (bVar == null) {
                s.m("itemAdapter");
                throw null;
            }
            gCMCheckableRow.setChecked(bVar.f21570c == i14);
            gCMCheckableRow.setOnClickListener(new cw2.b(16, iVar, fVar));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.editgoal.fragments.FBTEditTrainingGoalFragment$onViewCreated$1", f = "FBTEditTrainingGoalFragment.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73730a;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f73732a;

            public a(i iVar) {
                this.f73732a = iVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                Object obj2;
                gv1.a aVar = (gv1.a) obj;
                if (aVar == null || (obj2 = aVar.f79442a) == null) {
                    obj2 = vt1.g.FINISH;
                }
                a aVar2 = i.f73723f;
                i iVar = this.f73732a;
                iVar.getClass();
                vt1.g.f180106c.getClass();
                List<? extends T> listB1 = h0.b1(vt1.g.f180110g);
                bw1.b<vt1.f> bVar = iVar.f73725b;
                if (bVar == null) {
                    s.m("itemAdapter");
                    throw null;
                }
                listB1.getClass();
                bVar.f21568a = listB1;
                bVar.notifyDataSetChanged();
                bw1.b<vt1.f> bVar2 = iVar.f73725b;
                if (bVar2 == null) {
                    s.m("itemAdapter");
                    throw null;
                }
                obj2.getClass();
                bVar2.f21570c = bVar2.f21568a.indexOf(obj2);
                bVar2.notifyDataSetChanged();
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to fv1.i$c for r5v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r5.f73730a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 == r3) goto L10
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r6)
                return r2
            L10:
                o13.r.b(r6)
                goto L35
            L14:
                o13.r.b(r6)
                fv1.i$a r6 = fv1.i.f73723f
                fv1.i r6 = fv1.i.this
                androidx.lifecycle.w1 r1 = r6.f73724a
                java.lang.Object r1 = r1.getValue()
                ev1.b r1 = (ev1.b) r1
                r53.b2 r1 = r1.T
                fv1.i$c$a r4 = new fv1.i$c$a
                r4.<init>(r6)
                r5.f73730a = r3
                r53.o2<T> r6 = r1.f150540a
                java.lang.Object r6 = r6.collect(r4, r5)
                if (r6 != r0) goto L35
                return r0
            L35:
                o2.c.f()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: fv1.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73733a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f73733a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f73733a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f73734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f73735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f73734a = aVar;
            this.f73735b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f73734a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f73735b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f73736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f73736a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f73736a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public i() {
        super(R.layout.fbta_goal_selection_frag);
        this.f73724a = new w1(s0.f105811a.b(ev1.b.class), new d(this), new f(this), new e(null, this));
        this.f73728e = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        requireActivity().setTitle(R.string.set_goals_title);
        View viewFindViewById = view2.findViewById(R.id.goals_rv);
        viewFindViewById.getClass();
        this.f73726c = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.wizard_header_container);
        viewFindViewById2.getClass();
        this.f73727d = (ComposeView) viewFindViewById2;
        ((AppCompatButton) view2.findViewById(R.id.btn_next)).setOnClickListener(new x(this, 24));
        String string = getString(R.string.lbl_event);
        string.getClass();
        String lowerCase = string.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string2 = getString(R.string.what_is_your_goal_question, lowerCase);
        string2.getClass();
        ComposeView composeView = this.f73727d;
        if (composeView == null) {
            s.m("wizardHeaderContainer");
            throw null;
        }
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-1062003244, true, new fv1.b(string2, 1)));
        bw1.b<vt1.f> bVar = new bw1.b<>(j0.f134944a, this.f73728e);
        this.f73725b = bVar;
        RecyclerView recyclerView = this.f73726c;
        if (recyclerView == null) {
            s.m("goalTypesRc");
            throw null;
        }
        recyclerView.setAdapter(bVar);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.updateActionBarNavigation(2);
        }
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ge1.b.T(f0.w(viewLifecycleOwner), null, null, new c(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv1/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
