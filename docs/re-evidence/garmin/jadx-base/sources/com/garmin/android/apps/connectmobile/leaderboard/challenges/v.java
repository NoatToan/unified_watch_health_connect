package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.gcmx.ProgressImageView;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/v;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37909g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37910a = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.p f37911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f37912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f37913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f37914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f37915f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/leaderboard/challenges/v$b", "Lb/s;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b.s {
        public b() {
            super(true);
        }

        @Override // b.s
        public final void b() {
            v vVar = v.this;
            com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = vVar.f37911b;
            if (pVar != null) {
                vVar.u6(pVar);
            } else {
                p005kotlin.jvm.internal.s.m("savedBadgeChallenge");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f37917a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f37917a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f37917a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f37917a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37918a;

        public d(Fragment fragment) {
            this.f37918a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f37918a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<pt0.p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f37919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f37920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f37921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f37922d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f37923e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f37919a = fragment;
            this.f37920b = qualifier;
            this.f37921c = aVar;
            this.f37922d = aVar2;
            this.f37923e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, pt0.p] */
        @Override // e23.a
        public final pt0.p invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f37921c.invoke();
            y1 f185700a = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f37919a;
            e23.a aVar = this.f37922d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(p005kotlin.jvm.internal.s0.f105811a.b(pt0.p.class), f185700a, null, defaultViewModelCreationExtras, this.f37920b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f37923e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b.u onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.lifecycle.n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.b(new b(), viewLifecycleOwner);
        return layoutInflater.inflate(R.layout.badge_challenge_joined_fragment, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, o13.l] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.joined_background_image);
        viewFindViewById.getClass();
        this.f37912c = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.joined_title);
        viewFindViewById2.getClass();
        this.f37913d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.challenge_duration);
        viewFindViewById3.getClass();
        this.f37914e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.challenge_rules);
        viewFindViewById4.getClass();
        this.f37915f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.checked_icon);
        viewFindViewById5.getClass();
        ((ProgressImageView) viewFindViewById5).setValueWithBorder(100.0f);
        ((pt0.p) this.f37910a.getValue()).f140757d.f(getViewLifecycleOwner(), new c(new ml0.e(2, this, view2)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o13.l] */
    public final void u6(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        Intent intent = ((pt0.p) this.f37910a.getValue()).f140764k;
        if (pVar.Z0()) {
            intent.getClass();
            intent.putExtra("KEY_SHOULD_CHECK_PREMIUM_SUBSCRIPTION_NOTICE", true);
            intent.putExtra("extra_challenge_end_date", pVar.getEndDate());
        }
        mVarRequireActivity.setResult(-1, intent);
        mVarRequireActivity.finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/v$a;", "", "<init>", "()V", "", "COMPLETE_PROGRESS", "F", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
