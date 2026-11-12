package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.z1;
import cu0.i;
import e23.l;
import mh1.x;
import o13.h;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f38557g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMComplexOneLineButton f38558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMComplexOneLineButton f38559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMComplexOneLineButton f38560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComposeView f38561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f38562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f38563f;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.liveeventsharing.ui.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0680b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38564a;

        static {
            int[] iArr = new int[ju0.c.values().length];
            try {
                iArr[ju0.c.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ju0.c.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38564a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f38565a;

        public c(l lVar) {
            lVar.getClass();
            this.f38565a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f38565a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38565a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38566a;

        public d(Fragment fragment) {
            this.f38566a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f38566a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38570d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38571e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38567a = fragment;
            this.f38568b = qualifier;
            this.f38569c = aVar;
            this.f38570d = aVar2;
            this.f38571e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, cu0.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38569c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f38567a;
            e23.a aVar = this.f38570d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), f189591b, null, defaultViewModelCreationExtras, this.f38568b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38571e, 4, null);
        }
    }

    public b() {
        super(R.layout.gcm_live_event_sharing_message_content);
        this.f38563f = o13.m.a(o13.n.NONE, new e(this, null, new d(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, getString(R.string.live_event_sharing_msg_content));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        i iVarU6 = u6();
        int i14 = i.f55582o;
        iVarU6.C4(null);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.pace_speed_toggle);
        viewFindViewById.getClass();
        this.f38558a = (GCMComplexOneLineButton) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.cumulative_time_toggle);
        viewFindViewById2.getClass();
        this.f38559b = (GCMComplexOneLineButton) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.last_laptime_toggle);
        viewFindViewById3.getClass();
        this.f38560c = (GCMComplexOneLineButton) viewFindViewById3;
        this.f38561d = (ComposeView) view2.findViewById(R.id.completion_time);
        View viewFindViewById4 = view2.findViewById(R.id.text_bubble);
        viewFindViewById4.getClass();
        this.f38562e = (TextView) viewFindViewById4;
        u6().f55588f.f(getViewLifecycleOwner(), new c(new x(this, 16)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final i u6() {
        return (i) this.f38563f.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
