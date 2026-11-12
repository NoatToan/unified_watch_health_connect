package com.garmin.android.apps.connectmobile.activity.details.presentation.overview;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.u0;
import java.text.DecimalFormat;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import qr.t;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activity/details/presentation/overview/SelectTrailBottomSheet;", "Lcom/garmin/android/apps/connectmobile/u0;", "<init>", "()V", "Lnr/u0;", "trailsData", "Lms1/d;", "selectedTrailsData", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectTrailBottomSheet extends u0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f30107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DecimalFormat f30108h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30109a;

        public a(Fragment fragment) {
            this.f30109a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f30109a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f30110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30112c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30113d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f30114e;

        public b(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f30110a = fragment;
            this.f30111b = qualifier;
            this.f30112c = aVar;
            this.f30113d = aVar2;
            this.f30114e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, qr.t] */
        @Override // e23.a
        public final t invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f30112c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f30110a;
            e23.a aVar = this.f30113d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t.class), viewModelStore, null, defaultViewModelCreationExtras, this.f30111b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f30114e, 4, null);
        }
    }

    public SelectTrailBottomSheet() {
        super(R.layout.select_trail_bottom_sheet_content, true, false, 0, 12, null);
        this.f30107g = o13.m.a(n.NONE, new b(this, null, new a(this), null, null));
        this.f30108h = l3.f23129g;
    }

    @Override // com.garmin.android.apps.connectmobile.b0
    public final void u6(View view2) {
        ((ComposeView) view2.findViewById(R.id.compose_view)).setContent(new e(-691037123, true, new vy0.e(this, 24)));
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String w6() {
        String string = getString(R.string.select_trail);
        string.getClass();
        return string;
    }

    @Override // com.garmin.android.apps.connectmobile.u0
    public final String y6() {
        String string = getString(R.string.choose_the_trail_you_hiked);
        string.getClass();
        return string;
    }
}
