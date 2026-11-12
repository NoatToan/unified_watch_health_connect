package com.garmin.android.apps.connectmobile.liveeventsharing.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import cu0.i;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f38572b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38573a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38574a;

        public b(Fragment fragment) {
            this.f38574a = fragment;
        }

        @Override // e23.a
        public final m invoke() {
            return this.f38574a.requireActivity();
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.liveeventsharing.ui.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0681c implements e23.a<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f38575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f38576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f38577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f38578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f38579e;

        public C0681c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f38575a = fragment;
            this.f38576b = qualifier;
            this.f38577c = aVar;
            this.f38578d = aVar2;
            this.f38579e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, cu0.i] */
        @Override // e23.a
        public final i invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f38577c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f38575a;
            e23.a aVar = this.f38578d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(i.class), f189591b, null, defaultViewModelCreationExtras, this.f38576b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f38579e, 4, null);
        }
    }

    public c() {
        super(R.layout.gcm_live_event_sharing_msg_options);
        this.f38573a = o13.m.a(n.NONE, new C0681c(this, null, new b(this), null, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m activity = getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, getString(R.string.live_event_sharing_options));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.layout_msg_trigger);
        viewFindViewById.getClass();
        final int i14 = 0;
        ((LinearLayout) viewFindViewById).setOnClickListener(new View.OnClickListener(this) { // from class: mu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.c f121106b;

            {
                this.f121106b = this;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o13.l] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.c cVar = this.f121106b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.f38572b;
                        cu0.i iVar = (cu0.i) cVar.f38573a.getValue();
                        iVar.getClass();
                        iVar.f55591i.m("LiveEventMessageTriggersFragment");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.f38572b;
                        cu0.i iVar2 = (cu0.i) cVar.f38573a.getValue();
                        iVar2.getClass();
                        iVar2.f55591i.m("LiveEventMessageContentFragment");
                        break;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.layout_msg_content);
        viewFindViewById2.getClass();
        final int i15 = 1;
        ((LinearLayout) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: mu0.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.liveeventsharing.ui.c f121106b;

            {
                this.f121106b = this;
            }

            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, o13.l] */
            /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o13.l] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.liveeventsharing.ui.c cVar = this.f121106b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.a aVar = com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.f38572b;
                        cu0.i iVar = (cu0.i) cVar.f38573a.getValue();
                        iVar.getClass();
                        iVar.f55591i.m("LiveEventMessageTriggersFragment");
                        break;
                    default:
                        com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.a aVar2 = com.garmin.android.apps.connectmobile.liveeventsharing.ui.c.f38572b;
                        cu0.i iVar2 = (cu0.i) cVar.f38573a.getValue();
                        iVar2.getClass();
                        iVar2.f55591i.m("LiveEventMessageContentFragment");
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/liveeventsharing/ui/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
