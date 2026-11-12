package com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import b.s;
import b.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import gj1.i;
import java.util.Iterator;
import java.util.List;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/primarytrainingdevice/view/a;", "Landroidx/fragment/app/Fragment;", "Ljj1/a$a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements jj1.a.InterfaceC1904a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0810a f43671l = new C0810a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ry1.a f43672a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jj1.a f43674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f43675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f43676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f43677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f43678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f43679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f43680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f43681j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43673b = new w1(s0.f105811a.b(ij1.g.class), new e(this), new g(this), new f(null, this));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f43682k = new c();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f43684b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43683a = iArr;
            int[] iArr2 = new int[ej1.b.values().length];
            try {
                iArr2[ej1.b.WEARABLE_DEVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ej1.b.TRAINING_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f43684b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/primarytrainingdevice/view/a$c", "Lb/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends s {
        public c() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            a aVar = a.this;
            aVar.f43682k.f(false);
            aVar.requireActivity().onBackPressed();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43686a;

        public d(l lVar) {
            lVar.getClass();
            this.f43686a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43686a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43686a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43687a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43687a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43687a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43689b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43688a = aVar;
            this.f43689b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43688a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43689b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f43690a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43690a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041 A[EDGE_INSN: B:14:0x0041->B:24:0x0063 BREAK  A[LOOP:0: B:16:0x0047->B:67:0x0047]] */
    @Override // jj1.a.InterfaceC1904a
    public final void S1(gj1.b bVar) {
        boolean z14;
        String string;
        String string2;
        gj1.f fVar;
        i wearableDevices;
        List<gj1.b> listB;
        bVar.getClass();
        boolean zG = p005kotlin.jvm.internal.s.g(bVar.getPrimaryTrainingCapable(), Boolean.TRUE);
        ij1.g gVarU6 = u6();
        Long deviceId = bVar.getDeviceId();
        if (deviceId == null) {
            z14 = false;
            break;
        }
        long jLongValue = deviceId.longValue();
        g3<gj1.f> g3VarD = gVarU6.y4().d();
        if (g3VarD != null && (fVar = g3VarD.f35301b) != null && (wearableDevices = fVar.getWearableDevices()) != null && (listB = wearableDevices.b()) != null && !listB.isEmpty()) {
            Iterator<T> it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                Long deviceId2 = ((gj1.b) it.next()).getDeviceId();
                if (deviceId2 != null && deviceId2.longValue() == jLongValue) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        boolean zG2 = p005kotlin.jvm.internal.s.g(bVar.getDeviceId(), this.f43681j);
        boolean zG3 = p005kotlin.jvm.internal.s.g(bVar.getDeviceId(), this.f43680i);
        boolean z15 = zG && !zG3;
        boolean z16 = z14 && !zG2;
        ej1.b bVar2 = u6().f93835b;
        ej1.b bVar3 = ej1.b.WEARABLE_DEVICE;
        if (bVar2 == bVar3) {
            if (z15) {
                string = getString(R.string.update_primary_training_question_title);
                string.getClass();
            } else {
                string = getString(R.string.update_primary_wearable_question_title);
                string.getClass();
            }
        } else if (z16) {
            string = getString(R.string.update_primary_wearable_question_title);
            string.getClass();
        } else {
            string = getString(R.string.update_primary_training_question_title);
            string.getClass();
        }
        String str = string;
        if (u6().f93835b == bVar3) {
            if (z15) {
                string2 = getString(R.string.set_primarty_trainining_device_question, bVar.getDisplayName());
                string2.getClass();
            } else if (p005kotlin.jvm.internal.s.g(bVar.getLhaBackupCapable(), Boolean.FALSE)) {
                string2 = getString(R.string.partially_compatible_device_confirmation, bVar.getDisplayName());
                string2.getClass();
            } else {
                string2 = getString(R.string.primary_wearable_change_confirmation, bVar.getDisplayName());
                string2.getClass();
            }
        } else if (z16) {
            string2 = getString(R.string.set_primarty_wearable_device_question, bVar.getDisplayName());
            string2.getClass();
        } else {
            string2 = getString(R.string.primary_training_change_confirmation, bVar.getDisplayName());
            string2.getClass();
        }
        String str2 = string2;
        o13.p pVar = new o13.p(((u6().f93835b == bVar3 && z15) || (u6().f93835b == ej1.b.TRAINING_DEVICE && z16)) ? getString(R.string.not_now_lbl) : getString(R.string.lbl_cancel), new ha0.e(this, z15, bVar, z16));
        o13.p pVar2 = new o13.p(getString(R.string.lbl_update), new ij1.e(this, zG, bVar, z16, zG3));
        c22.f fVar2 = c22.f.f23050a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fVar2.getClass();
        androidx.appcompat.app.e eVarB = c22.f.b(contextRequireContext, str, str2, pVar2, pVar, null, false);
        eVarB.show();
        oe2.f.e(eVarB, 1.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f43672a = context instanceof ry1.a ? (ry1.a) context : null;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.TRAINING_INITIATIVE;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "PrimaryDeviceFragment", "Host activity must implement SetupFragmentListener.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.primary_device_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((y0) u6().f93843j.getValue()).j(Boolean.TRUE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ry1.a aVar = this.f43672a;
        if (aVar != null) {
            String string = getString(R.string.primary_wearable);
            string.getClass();
            aVar.g(2, string);
        }
        u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(this.f43682k, viewLifecycleOwner);
        View viewFindViewById = view2.findViewById(R.id.rv_devices);
        viewFindViewById.getClass();
        this.f43675d = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.textview_header);
        viewFindViewById2.getClass();
        this.f43676e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.textview_footer);
        viewFindViewById3.getClass();
        this.f43677f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.textview_not_compatible_header);
        viewFindViewById4.getClass();
        this.f43678g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.textview_not_compatible_list);
        viewFindViewById5.getClass();
        this.f43679h = (TextView) viewFindViewById5;
        final int i14 = 0;
        ((y0) u6().f93837d.getValue()).f(getViewLifecycleOwner(), new d(new l(this) { // from class: ij1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a f93822b;

            {
                this.f93822b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v19 java.lang.Object, still in use, count: 2, list:
                  (r2v19 java.lang.Object) from 0x01c7: PHI (r2 I:??) = (r2v16 java.lang.Object), (r2v19 java.lang.Object) binds: [B:96:0x01c6, B:195:0x01c7] A[DONT_GENERATE, DONT_INLINE]
                  (r2v19 java.lang.Object) from 0x01b7: CHECK_CAST (gj1.b) (r2v19 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 818
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ij1.c.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i15 = 1;
        ((androidx.lifecycle.s0) u6().f93839f.getValue()).f(getViewLifecycleOwner(), new d(new l(this) { // from class: ij1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a f93822b;

            {
                this.f93822b = this;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x01d1  */
            /* JADX WARN: Code duplicated, block: B:99:0x01cb  */
            /* JADX WARN: Multi-variable type inference failed */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v19 java.lang.Object, still in use, count: 2, list:
                  (r2v19 java.lang.Object) from 0x01c7: PHI (r2 I:??) = (r2v16 java.lang.Object), (r2v19 java.lang.Object) binds: [B:96:0x01c6, B:195:0x01c7] A[DONT_GENERATE, DONT_INLINE]
                  (r2v19 java.lang.Object) from 0x01b7: CHECK_CAST (gj1.b) (r2v19 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r21) {
                /*
                    Method dump skipped, instruction units count: 818
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ij1.c.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        g3<gj1.f> g3VarD = u6().y4().d();
        gj1.f fVar = g3VarD != null ? g3VarD.f35301b : null;
        if (fVar != null) {
            ij1.g gVarU6 = u6();
            ge1.b.T(v1.a(gVarU6), null, null, new ij1.h(gVarU6, fVar, null), 3);
        } else {
            ij1.g gVarU7 = u6();
            ge1.b.T(v1.a(gVarU7), null, null, new ij1.i(gVarU7, null), 3);
        }
    }

    public final ij1.g u6() {
        return (ij1.g) this.f43673b.getValue();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/primarytrainingdevice/view/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0810a {
        public /* synthetic */ C0810a(j jVar) {
            this();
        }

        private C0810a() {
        }
    }
}
