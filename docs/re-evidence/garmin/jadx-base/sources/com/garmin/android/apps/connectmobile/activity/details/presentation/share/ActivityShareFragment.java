package com.garmin.android.apps.connectmobile.activity.details.presentation.share;

import a61.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import f.c;
import g.h;
import kotlin.w3;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qr.t;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/share/ActivityShareFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityShareFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c<Intent> f30124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30125b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30126a;

        public a(Fragment fragment) {
            this.f30126a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f30126a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30131e;

        public b(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30127a = fragment;
            this.f30128b = qualifier;
            this.f30129c = aVar;
            this.f30130d = aVar2;
            this.f30131e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30129c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30127a;
            e23.a aVar = this.f30130d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f30128b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30131e, 4, null);
        }
    }

    public ActivityShareFragment() {
        super(R.layout.composable_container);
        this.f30125b = o13.m.a(n.NONE, new b(this, null, new a(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new h(), new i(this, 14));
        cVarRegisterForActivityResult.getClass();
        this.f30124a = cVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new e(563277187, true, new dh1.a(this, 2)));
    }
}
