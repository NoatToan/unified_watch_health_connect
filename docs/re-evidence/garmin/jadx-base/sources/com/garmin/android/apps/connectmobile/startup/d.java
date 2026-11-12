package com.garmin.android.apps.connectmobile.startup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import aq1.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import java.util.Arrays;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/d;", "Ldv/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends dv.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f44815e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44816b = o13.m.a(n.NONE, new e(this, null, new C0856d(this), null, null));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.e f44817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f44818d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44819a;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.SHOW_GRADUATION_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.SHOW_LOCATION_POPUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.SHOW_LOCATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.CONFIRM_LOCATION_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j0.CONFIRM_LOCATION_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[j0.SHOW_CONNECT_PRIVACY_CONSENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[j0.SHOW_CONNECT_PRIVACY_CONSENT_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[j0.GRANT_CONNECT_PRIVACY_CONSENT_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[j0.SHOW_DISPLAY_NAME_APPROVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[j0.APPROVE_DISPLAY_NAME_ERROR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f44819a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f44820a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f44820a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44820a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44820a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.startup.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0856d implements e23.a<androidx.fragment.app.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44821a;

        public C0856d(Fragment fragment) {
            this.f44821a = fragment;
        }

        @Override // e23.a
        public final androidx.fragment.app.m invoke() {
            return this.f44821a.requireActivity();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.apps.connectmobile.startup.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f44822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f44823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f44824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f44825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f44826e;

        public e(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f44822a = fragment;
            this.f44823b = qualifier;
            this.f44824c = aVar;
            this.f44825d = aVar2;
            this.f44826e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.startup.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f44824c.invoke();
            y1 viewModelStore = viewModelStoreOwner.getF189591b();
            Fragment fragment = this.f44822a;
            e23.a aVar = this.f44825d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                b.g gVar = viewModelStoreOwner instanceof b.g ? (b.g) viewModelStoreOwner : null;
                if (gVar != null) {
                    defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                    defaultViewModelCreationExtras.getClass();
                }
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f44823b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f44826e, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String[] strArr;
        String[] stringArray;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (stringArray = arguments.getStringArray("KEY_ARG_STARTUP_CHECKS")) != null) {
            this.f44818d = stringArray;
            return;
        }
        if (k1.f37122a.r()) {
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            strArr = com.garmin.android.apps.connectmobile.startup.c.a.f44813b;
        } else {
            com.garmin.android.apps.connectmobile.startup.c.f44811b.getClass();
            strArr = com.garmin.android.apps.connectmobile.startup.c.a.f44814c;
        }
        this.f44818d = strArr;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.gcm3_content_frame, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        com.garmin.android.apps.connectmobile.startup.e eVarV6 = v6();
        String[] strArr = this.f44818d;
        if (strArr != null) {
            eVarV6.K4((String[]) Arrays.copyOf(strArr, strArr.length)).f(getViewLifecycleOwner(), new c(new a03.f(this, 19)));
        } else {
            s.m("startupChecks");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.startup.e v6() {
        return (com.garmin.android.apps.connectmobile.startup.e) this.f44816b.getValue();
    }

    public final void w6(Fragment fragment, String str) {
        if (getChildFragmentManager().G(str) != null) {
            String strM = am.j.m("Fragment with tag=[", str, "] already showing -> don't pop it again");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StartupChecksFragment", strM);
            return;
        }
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(childFragmentManager);
        aVar2.l(R.id.content_frame, fragment, str);
        aVar2.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "KEY_ARG_STARTUP_CHECKS", "ACTION_GET_LOCATION", "ACTION_GET_CONNECT_PRIVACY_CONSENT", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(String... strArr) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putStringArray("KEY_ARG_STARTUP_CHECKS", strArr);
            dVar.setArguments(bundle);
            return dVar;
        }

        private a() {
        }
    }
}
