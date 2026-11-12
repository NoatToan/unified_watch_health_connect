package com.garmin.android.apps.connectmobile.activity.details.presentation.share;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.b0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import kotlin.w3;
import lc.h0;
import lc.t0;
import lc.y;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qr.t;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/share/ActivityCustomShareFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/net/Uri;", "backgroundUri", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityCustomShareFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30115a;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activity/details/presentation/share/ActivityCustomShareFragment$a", "Landroidx/core/view/s;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f30117b;

        public a(View view2) {
            this.f30117b = view2;
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            zl.a.f(menu, menuInflater, R.menu.activity_custom_share_menu, menu);
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            Context contextRequireContext = ActivityCustomShareFragment.this.requireContext();
            contextRequireContext.getClass();
            oc.b.B(menu, contextRequireContext);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            if (menuItem.getItemId() != R.id.menu_item_share_edit) {
                return false;
            }
            View view2 = this.f30117b;
            view2.getClass();
            y yVarA = t0.a(view2);
            h0 h0VarJ = yVarA.f111904b.j();
            if (h0VarJ == null || h0VarJ.f111773b.f144346e != R.id.activityCustomShareFragment) {
                return true;
            }
            yVarA.g(R.id.action_activityCustomShareFragment_to_editCustomImageFragment, null);
            return true;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30118a;

        public b(Fragment fragment) {
            this.f30118a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f30118a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30121c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30123e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30119a = fragment;
            this.f30120b = qualifier;
            this.f30121c = aVar;
            this.f30122d = aVar2;
            this.f30123e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30121c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30119a;
            e23.a aVar = this.f30122d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), f189591b, null, defaultViewModelCreationExtras, this.f30120b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30123e, 4, null);
        }
    }

    public ActivityCustomShareFragment() {
        super(R.layout.composable_container);
        this.f30115a = o13.m.a(n.NONE, new c(this, null, new b(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ComposeView composeView = (ComposeView) view2.findViewById(R.id.composable_container);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new e(133443427, true, new dh1.a(this, 1)));
        g22.e.k(this, new a(view2), b0.b.RESUMED);
    }
}
