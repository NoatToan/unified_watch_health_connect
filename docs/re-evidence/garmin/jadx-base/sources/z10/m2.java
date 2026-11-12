package z10;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz10/m2;", "Ldv/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m2 extends dv.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f201155f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f201156b = o13.m.a(o13.n.NONE, new c(this, null, new b(this), null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f201157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f201158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s92.g f201159e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f201160a;

        public b(Fragment fragment) {
            this.f201160a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f201160a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<com.garmin.android.apps.connectmobile.startup.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f201161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f201162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f201163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f201164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f201165e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f201161a = fragment;
            this.f201162b = qualifier;
            this.f201163c = aVar;
            this.f201164d = aVar2;
            this.f201165e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.startup.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f201163c.invoke();
            androidx.lifecycle.y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f201161a;
            e23.a aVar = this.f201164d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f201162b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f201165e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("PrivacyPolicyFragment", s92.g.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("PrivacyPolicyFragment");
                if (!(parcelable2 instanceof s92.g)) {
                    parcelable2 = null;
                }
                parcelable = (s92.g) parcelable2;
            }
            this.f201159e = (s92.g) parcelable;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.consent_china_privacy_policy, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        String string = getString(R.string.txt_privacy_policy);
        com.garmin.android.apps.connectmobile.d3 d3Var = this.f61319a;
        if (d3Var != null) {
            d3Var.updateActionBar(string, 1);
        }
        s92.g gVar = this.f201159e;
        if (gVar != null) {
            View viewFindViewById = view2.findViewById(R.id.privacy_policy_link);
            viewFindViewById.getClass();
            this.f201158d = (TextView) viewFindViewById;
            List<s92.e> listD = gVar.d();
            if (listD != null && !listD.isEmpty()) {
                s92.e eVar = listD.get(0);
                String text = eVar != null ? eVar.getText() : null;
                if (text != null && !d53.w.J(text)) {
                    TextView textView = this.f201158d;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("privacyPolicyButton");
                        throw null;
                    }
                    textView.setText(eVar != null ? eVar.getText() : null);
                }
                TextView textView2 = this.f201158d;
                if (textView2 == null) {
                    p005kotlin.jvm.internal.s.m("privacyPolicyButton");
                    throw null;
                }
                textView2.setOnClickListener(new wv2.h(13, eVar, this));
            }
            View viewFindViewById2 = view2.findViewById(R.id.btn_continue);
            viewFindViewById2.getClass();
            Button button = (Button) viewFindViewById2;
            button.setEnabled(false);
            View viewFindViewById3 = view2.findViewById(R.id.privacy_policy_checkbox);
            viewFindViewById3.getClass();
            CheckBox checkBox = (CheckBox) viewFindViewById3;
            checkBox.setOnClickListener(new wv2.h(14, button, checkBox));
            button.setOnClickListener(new wv2.h(15, this, gVar));
            View viewFindViewById4 = view2.findViewById(R.id.privacy_policy_message);
            viewFindViewById4.getClass();
            this.f201157c = (TextView) viewFindViewById4;
            List<s92.b> listB = gVar.b();
            if (listB == null || listB.isEmpty()) {
                return;
            }
            TextView textView3 = this.f201157c;
            if (textView3 != null) {
                textView3.setText(listB.get(0).getCopy());
            } else {
                p005kotlin.jvm.internal.s.m("consentText");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lz10/m2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_CONSENT_TEXT_DTO", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
