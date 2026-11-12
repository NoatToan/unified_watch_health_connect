package gg1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.FontScale;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg1/r;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f77297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lg1.a f77298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f77299c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f77300a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f77300a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f77300a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f77301a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e23.a aVar) {
            super(0);
            this.f77301a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f77301a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f77302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o13.l lVar) {
            super(0);
            this.f77302a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f77302a.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f77303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f77304b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, o13.l lVar) {
            super(0);
            this.f77303a = aVar;
            this.f77304b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f77303a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f77304b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f77305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f77306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, o13.l lVar) {
            super(0);
            this.f77305a = fragment;
            this.f77306b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f77306b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f77305a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public r() {
        o13.l lVarA = o13.m.a(o13.n.NONE, new b(new a(this)));
        this.f77299c = new w1(p005kotlin.jvm.internal.s0.f105811a.b(lg1.e.class), new c(lVarA), new e(this, lVarA), new d(null, lVarA));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm_developer_settings, viewGroup, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        boolean zA;
        Object obj;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.search_view);
        viewFindViewById.getClass();
        ((SearchView) viewFindViewById).setOnQueryTextListener(new q(this));
        View viewFindViewById2 = view2.findViewById(R.id.recycler_view);
        viewFindViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f77297a = recyclerView;
        recyclerView.setVisibility(8);
        RecyclerView recyclerView2 = this.f77297a;
        if (recyclerView2 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager(view2.getContext()));
        RecyclerView recyclerView3 = this.f77297a;
        if (recyclerView3 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView3.setHasFixedSize(true);
        StringBuilder sb3 = new StringBuilder();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        sb3.append(c22.b.a(contextRequireContext));
        sb3.append("x");
        String string = sb3.toString();
        lg1.d[] dVarArr = (lg1.d[]) lg1.d.Z1.toArray(new lg1.d[0]);
        ArrayList arrayList = new ArrayList();
        for (lg1.d dVar : dVarArr) {
            switch (lg1.e.a.f112248a[dVar.ordinal()]) {
                case 1:
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_TESTER_ASSOCIATE")) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                    break;
                case 2:
                    s3.f23252a.getClass();
                    zA = s3.a("ROLE_DI_TESTER");
                    break;
                case 3:
                    if (GCMSettingManager.k() == v0.ProdServerEnvironment) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                    break;
                case 4:
                    c22.z0.f23761a.getClass();
                    s3.f23252a.getClass();
                    zA = s3.a("ROLE_DI_TESTER");
                    break;
                case 5:
                    c22.z0.f23761a.getClass();
                    s3.f23252a.getClass();
                    zA = s3.a("ROLE_DI_TESTER");
                    break;
                case 6:
                    c22.z0.f23761a.getClass();
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_TESTER_ASSOCIATE") || s3.a("ROLE_DI_TESTER")) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                    break;
                case 7:
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_TESTER_ASSOCIATE") || s3.a("ROLE_DI_TESTER")) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                    break;
                case 8:
                    s3.f23252a.getClass();
                    if (s3.a("ROLE_TESTER_ASSOCIATE") || s3.a("ROLE_DI_TESTER")) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                    break;
                default:
                    zA = true;
                    break;
            }
            if (zA) {
                lg1.d dVar2 = lg1.d.FONT_SCALE;
                String str = dVar.f112247d;
                if (dVar == dVar2) {
                    Object objNewInstance = Class.forName(str).getConstructor(String.class).newInstance(string);
                    objNewInstance.getClass();
                    obj = (FontScale) objNewInstance;
                } else {
                    Object objNewInstance2 = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
                    objNewInstance2.getClass();
                    obj = (IDeveloperItemStrategy) objNewInstance2;
                }
                arrayList.add(obj);
            }
        }
        lg1.a aVar = new lg1.a(arrayList, new fe2.z(this, 18), new g12.f(this, 13));
        this.f77298b = aVar;
        RecyclerView recyclerView4 = this.f77297a;
        if (recyclerView4 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView4.setAdapter(aVar);
        RecyclerView recyclerView5 = this.f77297a;
        if (recyclerView5 == null) {
            p005kotlin.jvm.internal.s.m("recyclerView");
            throw null;
        }
        recyclerView5.setVisibility(0);
    }
}
