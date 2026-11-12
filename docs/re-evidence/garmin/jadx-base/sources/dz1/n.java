package dz1;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import b.u;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldz1/n;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f61786f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f61787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ry1.a f61788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f61789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gg0.f f61790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f61791e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"dz1/n$b", "Lb/s;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends s {
        public b() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b.s
        public final void b() {
            w1 w1Var;
            cz1.a aVar;
            y0<my1.d> y0Var;
            my1.d dVarB;
            n nVar = n.this;
            gg0.f fVar = nVar.f61790d;
            w1 w1Var2 = nVar.f61787a;
            if (fVar != null) {
                cz1.a aVar2 = (cz1.a) w1Var2.getValue();
                my1.d dVar = (my1.d) aVar2.L0.d();
                aVar2.X = dVar != null ? dVar.f121487d : null;
                y0<my1.d> y0VarZ4 = aVar2.Z4();
                if (dVar != null) {
                    w1Var = w1Var2;
                    aVar = aVar2;
                    y0Var = y0VarZ4;
                    dVarB = my1.d.b(dVar, null, null, null, fVar, null, null, null, false, null, null, null, 0.0d, 0.0d, null, null, null, 1048567);
                } else {
                    w1Var = w1Var2;
                    aVar = aVar2;
                    y0Var = y0VarZ4;
                    dVarB = null;
                }
                y0Var.m(dVarB);
                ((y0) aVar.O0.getValue()).j(fVar);
                cz1.a aVar3 = (cz1.a) w1Var.getValue();
                my1.d dVarD = aVar3.Z4().d();
                aVar3.Z4().m(dVarD != null ? my1.d.b(dVarD, null, null, null, null, null, null, null, true, ny1.b.RUNNING_DISTANCE, ez1.g.TYPE_ALL, ez1.h.ALL, 0.0d, 0.0d, null, null, null, 1034367) : null);
            }
            nVar.f61791e.f(false);
            nVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f61793a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f61793a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f61794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f61795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f61794a = aVar;
            this.f61795b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f61794a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f61795b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f61796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f61796a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f61796a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public n() {
        super(R.layout.event_type_list_fragment);
        this.f61787a = new w1(s0.f105811a.b(cz1.a.class), new c(this), new e(this), new d(null, this));
        this.f61791e = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f61788b = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "EventTypeListFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((cz1.a) this.f61787a.getValue()).j5(true);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00da A[SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        ArrayList arrayList;
        List listB;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f61788b;
        if (aVar != null) {
            String string = getString(R.string.activity_details_event_type);
            string.getClass();
            aVar.g(2, string);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f61791e, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f61789c = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        w1 w1Var = this.f61787a;
        my1.d dVarD = ((cz1.a) w1Var.getValue()).Z4().d();
        this.f61790d = dVarD != null ? dVarD.f121487d : null;
        List list = (List) new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("triathlon_events_enabled"), new cz1.b().getType());
        if (list == null) {
            gg0.f.f77128d.getClass();
            List listB2 = gg0.f.a.b();
            arrayList = new ArrayList();
            for (Object obj : listB2) {
                if (!((gg0.f) obj).g()) {
                    arrayList.add(obj);
                }
            }
            listB = arrayList;
        } else {
            if (!list.contains("AnyUser")) {
                if (list.contains("MBTester")) {
                    s3.f23252a.getClass();
                    if (!s3.a("ROLE_MBTESTER")) {
                        if (list.contains("DITester")) {
                            s3.f23252a.getClass();
                            if (s3.a("ROLE_DI_TESTER")) {
                            }
                        }
                        gg0.f.f77128d.getClass();
                        List listB3 = gg0.f.a.b();
                        arrayList = new ArrayList();
                        while (r4.hasNext()) {
                            if (!((gg0.f) obj).g()) {
                                arrayList.add(obj);
                            }
                        }
                        listB = arrayList;
                    }
                } else {
                    if (list.contains("DITester")) {
                        s3.f23252a.getClass();
                        if (s3.a("ROLE_DI_TESTER")) {
                        }
                    }
                    gg0.f.f77128d.getClass();
                    List listB4 = gg0.f.a.b();
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        if (!((gg0.f) obj).g()) {
                            arrayList.add(obj);
                        }
                    }
                    listB = arrayList;
                }
            }
            gg0.f.f77128d.getClass();
            listB = gg0.f.a.b();
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        uy1.d dVar = new uy1.d(contextRequireContext, this.f61790d, listB);
        dVar.f173404d = this;
        RecyclerView recyclerView2 = this.f61789c;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(dVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldz1/n$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
