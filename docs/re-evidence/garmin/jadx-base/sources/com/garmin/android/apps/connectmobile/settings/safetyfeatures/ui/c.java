package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.u0;
import e23.l;
import o13.h;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import ty1.f1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/c;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f43732k = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f43733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f43734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f.c<Long> f43735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f43736j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43737a;

        public b(l lVar) {
            lVar.getClass();
            this.f43737a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43737a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43737a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0813c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0813c(Fragment fragment) {
            super(0);
            this.f43738a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43738a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43739a = aVar;
            this.f43740b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43739a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43740b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43741a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f43741a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43741a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public c() {
        super(R.layout.fragment_lte_device_selector, false, false, 0, 14, null);
        this.f43733g = new w1(s0.f105811a.b(pj1.s.class), new C0813c(this), new e(this), new d(null, this));
        this.f43736j = m.b(new f1(this, 15));
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        f.c<Long> cVarRegisterForActivityResult;
        View viewFindViewById = view2.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        viewFindViewById.getClass();
        this.f43734h = (RecyclerView) viewFindViewById;
        uj1.n nVar = new uj1.n(new tn2.t(this, 27));
        RecyclerView recyclerView2 = this.f43734h;
        if (recyclerView2 == null) {
            s.m("recyclerView");
            throw null;
        }
        recyclerView2.setAdapter(nVar);
        ((pj1.s) this.f43733g.getValue()).Z.f(getViewLifecycleOwner(), new b(new tn2.t(nVar, 28)));
        if (((Boolean) this.f43736j.getValue()).booleanValue()) {
            final int i14 = 0;
            cVarRegisterForActivityResult = registerForActivityResult(((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).d(), new f.b(this) { // from class: uj1.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c f171544b;

                {
                    this.f171544b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar = this.f171544b;
                    switch (i15) {
                        case 0:
                            wi1.e eVar = (wi1.e) obj;
                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                            eVar.getClass();
                            pj1.s sVar = (pj1.s) cVar.f43733g.getValue();
                            ge1.b.T(v1.a(sVar), null, null, new pj1.v(eVar, sVar, null), 3);
                            cVar.dismiss();
                            break;
                        default:
                            Boolean bool = (Boolean) obj;
                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                            bool.getClass();
                            ((pj1.s) cVar.f43733g.getValue()).U4(bool.booleanValue());
                            cVar.dismiss();
                            break;
                    }
                }
            });
            cVarRegisterForActivityResult.getClass();
        } else {
            final int i15 = 1;
            cVarRegisterForActivityResult = registerForActivityResult(((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).e(), new f.b(this) { // from class: uj1.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c f171544b;

                {
                    this.f171544b = this;
                }

                @Override // f.b
                public final void a(Object obj) {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c cVar = this.f171544b;
                    switch (i16) {
                        case 0:
                            wi1.e eVar = (wi1.e) obj;
                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                            eVar.getClass();
                            pj1.s sVar = (pj1.s) cVar.f43733g.getValue();
                            ge1.b.T(v1.a(sVar), null, null, new pj1.v(eVar, sVar, null), 3);
                            cVar.dismiss();
                            break;
                        default:
                            Boolean bool = (Boolean) obj;
                            com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.c.f43732k;
                            bool.getClass();
                            ((pj1.s) cVar.f43733g.getValue()).U4(bool.booleanValue());
                            cVar.dismiss();
                            break;
                    }
                }
            });
            cVarRegisterForActivityResult.getClass();
        }
        this.f43735i = cVarRegisterForActivityResult;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.safety_feature_setup);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARG_IS_SETUP_WIZARD", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
