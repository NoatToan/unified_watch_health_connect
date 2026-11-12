package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import java.text.Collator;
import lx0.k;
import o13.m;
import o13.n;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0692a f39101d = new C0692a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39102e = a.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f39104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39105c = m.a(n.NONE, new c(this, null, new b(this), null, null));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39106a;

        public b(Fragment fragment) {
            this.f39106a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f39106a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f39107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f39108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f39109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f39110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f39111e;

        public c(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f39107a = fragment;
            this.f39108b = qualifier;
            this.f39109c = aVar;
            this.f39110d = aVar2;
            this.f39111e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, lx0.k] */
        @Override // e23.a
        public final k invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f39109c.invoke();
            y1 f189591b = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f39107a;
            e23.a aVar = this.f39110d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                g gVar = viewModelStoreOwner instanceof g ? (g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(k.class), f189591b, null, defaultViewModelCreationExtras, this.f39108b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f39111e, 4, null);
        }
    }

    public a() {
        final int i14 = 0;
        this.f39103a = m.b(new e23.a(this) { // from class: lx0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a f115141b;

            {
                this.f115141b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a aVar = this.f115141b;
                switch (i15) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.C0692a c0692a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39101d;
                        ww0.i.a aVar2 = ww0.i.f187563a;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        aVar2.getClass();
                        Collator collator = Collator.getInstance();
                        collator.setStrength(1);
                        return (ww0.i[]) u.Y(ww0.i.values(), new ww0.d(new wb1.i(14, collator, contextRequireContext), 1)).toArray(new ww0.i[0]);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.C0692a c0692a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39101d;
                        ww0.i[] iVarArr = (ww0.i[]) aVar.f39103a.getValue();
                        k kVar = (k) aVar.f39105c.getValue();
                        Context contextRequireContext2 = aVar.requireContext();
                        contextRequireContext2.getClass();
                        return new b(iVarArr, kVar, contextRequireContext2);
                }
            }
        });
        final int i15 = 1;
        this.f39104b = m.b(new e23.a(this) { // from class: lx0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a f115141b;

            {
                this.f115141b = this;
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a aVar = this.f115141b;
                switch (i16) {
                    case 0:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.C0692a c0692a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39101d;
                        ww0.i.a aVar2 = ww0.i.f187563a;
                        Context contextRequireContext = aVar.requireContext();
                        contextRequireContext.getClass();
                        aVar2.getClass();
                        Collator collator = Collator.getInstance();
                        collator.setStrength(1);
                        return (ww0.i[]) u.Y(ww0.i.values(), new ww0.d(new wb1.i(14, collator, contextRequireContext), 1)).toArray(new ww0.i[0]);
                    default:
                        com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.C0692a c0692a2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a.f39101d;
                        ww0.i[] iVarArr = (ww0.i[]) aVar.f39103a.getValue();
                        k kVar = (k) aVar.f39105c.getValue();
                        Context contextRequireContext2 = aVar.requireContext();
                        contextRequireContext2.getClass();
                        return new b(iVarArr, kVar, contextRequireContext2);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.fragment_mct_setup_contraception, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onCreate(bundle);
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.contraception_setup_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter((lx0.b) this.f39104b.getValue());
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/setup/a$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0692a {
        public /* synthetic */ C0692a(j jVar) {
            this();
        }

        private C0692a() {
        }
    }
}
