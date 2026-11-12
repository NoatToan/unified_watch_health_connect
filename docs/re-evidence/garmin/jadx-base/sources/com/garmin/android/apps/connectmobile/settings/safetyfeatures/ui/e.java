package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;
import g.h;
import java.util.Iterator;
import java.util.List;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import pj1.d0;
import pj1.s;
import uj1.a0;
import uj1.b0;
import uj1.c0;
import w61.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lyj1/b;", "features", "", "isNavigatingToRealtimeSettings", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f43777g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43778a = View.generateViewId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43779b = new w1(s0.f105811a.b(s.class), new c(this), new C0815e(this), new d(null, this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f43780c = m.b(new b0(this, 6));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f43781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Long> f43782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f43783f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/e$b", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements androidx.core.view.s {
        public b() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menu.getClass();
            menuInflater.getClass();
            MenuItem menuItemAdd = menu.add(0, e.this.f43778a, 0, R.string.lbl_help);
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(1);
            }
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            menuItem.getClass();
            int itemId = menuItem.getItemId();
            e eVar = e.this;
            int i14 = eVar.f43778a;
            t tVar = eVar.f43783f;
            if (itemId != i14) {
                return false;
            }
            Context contextRequireContext = eVar.requireContext();
            contextRequireContext.getClass();
            yj1.b bVar = (yj1.b) ((androidx.lifecycle.s0) tVar.getValue()).d();
            boolean z14 = bVar != null && bVar.f197523f;
            yj1.b bVar2 = (yj1.b) ((androidx.lifecycle.s0) tVar.getValue()).d();
            boolean z15 = bVar2 != null && bVar2.f197521d;
            yj1.b bVar3 = (yj1.b) ((androidx.lifecycle.s0) tVar.getValue()).d();
            d0.m(contextRequireContext, z14, z15, bVar3 != null && bVar3.f197519b, false);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f43785a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43785a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f43787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f43786a = aVar;
            this.f43787b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43786a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43787b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C0815e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f43788a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0815e(Fragment fragment) {
            super(0);
            this.f43788a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43788a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public e() {
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new h(), new f.b(this) { // from class: uj1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e f171499b;

            {
                this.f171499b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                int i15 = i14;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = this.f171499b;
                switch (i15) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            l20.a aVar3 = null;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                aVar3 = (l20.a) parcelable;
                            }
                            eVar.v6().i5(aVar3);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                        bool.getClass();
                        eVar.v6().U4(bool.booleanValue());
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.f43781d = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Long> cVarRegisterForActivityResult2 = registerForActivityResult(((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).e(), new f.b(this) { // from class: uj1.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e f171499b;

            {
                this.f171499b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Parcelable parcelable;
                int i16 = i15;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = this.f171499b;
                switch (i16) {
                    case 0:
                        f.a aVar = (f.a) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                        aVar.getClass();
                        if (aVar.f67585a == -1) {
                            Intent intent = aVar.f67586b;
                            l20.a aVar3 = null;
                            if (intent != null) {
                                if (Build.VERSION.SDK_INT >= 33) {
                                    parcelable = (Parcelable) intent.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", l20.a.class);
                                } else {
                                    Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_SELECTED_EMERGENCY_CONTACT");
                                    parcelable = (l20.a) (parcelableExtra instanceof l20.a ? parcelableExtra : null);
                                }
                                aVar3 = (l20.a) parcelable;
                            }
                            eVar.v6().i5(aVar3);
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                        bool.getClass();
                        eVar.v6().U4(bool.booleanValue());
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.f43782e = cVarRegisterForActivityResult2;
        this.f43783f = m.b(new b0(this, 7));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new z3.e(-738254474, true, new a0(this, 1)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v6().V0.m(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        List<ue0.h> list;
        String displayName;
        Iterator<T> it;
        Object next;
        ue0.h hVar;
        String displayName2;
        Long lB;
        Object next2;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new b(), androidx.lifecycle.b0.b.RESUMED);
        s sVarV6 = v6();
        long jU6 = u6();
        List list2 = (List) sVarV6.f137979k0.d();
        String str = null;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((sd2.f) next2).getUnitID() != jU6);
            sd2.f fVar = (sd2.f) next2;
            if (fVar != null) {
                displayName = fVar.getDisplayName();
                if (displayName == null) {
                    displayName = fVar.getProductDisplayName();
                    displayName.getClass();
                }
            } else {
                list = sVarV6.I;
                if (list != null) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        lB = ((ue0.h) next).getDeviceId();
                        if (lB != null && lB.longValue() == jU6) {
                            break;
                        }
                    }
                    hVar = (ue0.h) next;
                    if (hVar != null) {
                        displayName2 = hVar.getDisplayName();
                        if (displayName2 == null) {
                            displayName2 = hVar.getProductDisplayName();
                        }
                        str = displayName2;
                    }
                }
                if (str == null) {
                    displayName = "";
                } else {
                    displayName = str;
                }
            }
        } else {
            list = sVarV6.I;
            if (list != null) {
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    lB = ((ue0.h) next).getDeviceId();
                    if (lB != null) {
                        break;
                        break;
                    }
                }
                hVar = (ue0.h) next;
                if (hVar != null) {
                    displayName2 = hVar.getDisplayName();
                    if (displayName2 == null) {
                        displayName2 = hVar.getProductDisplayName();
                    }
                    str = displayName2;
                }
            }
            if (str == null) {
                displayName = "";
            } else {
                displayName = str;
            }
        }
        g22.e.g(this, displayName);
        v6().M0.f(getViewLifecycleOwner(), new g(new c0(this, 4)));
        v6().S0.f(getViewLifecycleOwner(), new g(new c0(this, 5)));
        v6().U0.f(getViewLifecycleOwner(), new g(new c0(this, 6)));
        v6().Y0.f(getViewLifecycleOwner(), new g(new c0(this, 7)));
    }

    public final long u6() {
        return ((Number) this.f43780c.getValue()).longValue();
    }

    public final s v6() {
        return (s) this.f43779b.getValue();
    }

    public final void w6(wj1.a aVar) {
        EmergencyCallingActivity.a aVar2 = EmergencyCallingActivity.f43789d;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        hl.a.c cVar = hl.a.c.f84256b;
        aVar2.getClass();
        this.f43781d.a(EmergencyCallingActivity.a.a(contextRequireContext, aVar, null, cVar), null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARGS_UNIT_ID", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
