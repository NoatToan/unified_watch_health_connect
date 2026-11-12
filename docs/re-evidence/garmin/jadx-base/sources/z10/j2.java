package z10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/j2;", "Ldv/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j2 extends dv.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f201069f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f201070b = o13.m.a(o13.n.NONE, new d(this, null, new c(this), null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<d20.b> f201071c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spinner f201072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f201073e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f201074a;

        public b(e23.l lVar) {
            lVar.getClass();
            this.f201074a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f201074a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f201074a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f201075a;

        public c(Fragment fragment) {
            this.f201075a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f201075a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<com.garmin.android.apps.connectmobile.startup.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f201076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f201077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f201078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f201079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f201080e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f201076a = fragment;
            this.f201077b = qualifier;
            this.f201078c = aVar;
            this.f201079d = aVar2;
            this.f201080e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.startup.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f201078c.invoke();
            androidx.lifecycle.y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f201076a;
            e23.a aVar = this.f201079d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.e.class), f189591b, null, defaultViewModelCreationExtras, this.f201077b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f201080e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("selectedCountryCode")) {
            return;
        }
        this.f201073e = arguments.getString("selectedCountryCode");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.location_verify_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        String string = getString(R.string.location_selection_vc_title);
        com.garmin.android.apps.connectmobile.d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.updateActionBar(string, 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(0L);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.countries_list);
        viewFindViewById.getClass();
        this.f201072d = (Spinner) viewFindViewById;
        view2.findViewById(R.id.confirm_button).setOnClickListener(new xp0.d(this, 17));
        com.garmin.android.apps.connectmobile.startup.e eVar = (com.garmin.android.apps.connectmobile.startup.e) this.f201070b.getValue();
        eVar.getClass();
        androidx.lifecycle.m.a(null, new com.garmin.android.apps.connectmobile.startup.f(eVar, null), 3).f(getViewLifecycleOwner(), new b(new yw2.h(this, 1)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz10/j2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SELECTED_COUNTRY_CODE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j2 a(String str) {
            j2 j2Var = new j2();
            Bundle bundle = new Bundle();
            bundle.putString("selectedCountryCode", str);
            j2Var.setArguments(bundle);
            return j2Var;
        }

        private a() {
        }
    }
}
