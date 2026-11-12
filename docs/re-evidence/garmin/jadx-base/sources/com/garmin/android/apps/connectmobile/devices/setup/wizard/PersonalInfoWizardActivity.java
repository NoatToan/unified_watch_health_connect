package com.garmin.android.apps.connectmobile.devices.setup.wizard;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.GCMWebViewActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity;
import dv.k;
import e23.l;
import fw.p;
import hv.o;
import hv.q;
import lc.u0;
import o13.h;
import o13.m;
import o13.n;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import q92.x;
import z10.d1;
import z10.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/wizard/PersonalInfoWizardActivity;", "Ldd0/a;", "Lcom/garmin/android/apps/connectmobile/devices/setup/wizard/g$c;", "Ldv/k;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PersonalInfoWizardActivity extends dd0.a implements com.garmin.android.apps.connectmobile.devices.setup.wizard.g.c, k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f34487g = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f34488c = new w1(s0.f105811a.b(o.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34489d = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dd0.o f34490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dd0.o f34491f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34492a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34492a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f34493a;

        public c(l lVar) {
            lVar.getClass();
            this.f34493a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f34493a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34493a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34494a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f34495b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f34496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f34497d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f34494a = gVar;
            this.f34495b = qualifier;
            this.f34496c = aVar;
            this.f34497d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.j] */
        @Override // e23.a
        public final j invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f34494a;
            y1 f189591b = gVar.getF189591b();
            e23.a aVar = this.f34496c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(j.class), f189591b, null, defaultViewModelCreationExtras, this.f34495b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f34497d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34498a;

        public e(b.g gVar) {
            this.f34498a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f34498a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f34499a;

        public f(b.g gVar) {
            this.f34499a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f34499a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f34500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f34501b;

        public g(e23.a aVar, b.g gVar) {
            this.f34500a = aVar;
            this.f34501b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f34500a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f34501b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dd0.o] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dd0.o] */
    public PersonalInfoWizardActivity() {
        final int i14 = 0;
        this.f34490e = new z0(this) { // from class: dd0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalInfoWizardActivity f59180b;

            {
                this.f59180b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i15 = i14;
                PersonalInfoWizardActivity personalInfoWizardActivity = this.f59180b;
                switch (i15) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            personalInfoWizardActivity.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            personalInfoWizardActivity.hideProgressOverlay();
                        } else if (kVar instanceof v92.k.b) {
                            personalInfoWizardActivity.hideProgressOverlay();
                            personalInfoWizardActivity.displayFailedMessage();
                            personalInfoWizardActivity.ga();
                        } else if (!(kVar instanceof v92.k.a)) {
                            u0.r();
                        } else {
                            ((z10.j) personalInfoWizardActivity.f34489d.getValue()).x4(x.DI_CONNECT_UPLOAD);
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        PersonalInfoWizardActivity.a aVar2 = PersonalInfoWizardActivity.f34487g;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(personalInfoWizardActivity, eVar.f176402a, eVar.f176403b);
                            break;
                        } else if (iVar instanceof v92.i.b) {
                            d1.u(d1.f200951a, personalInfoWizardActivity, (v92.i.b) iVar);
                            break;
                        } else if (iVar instanceof v92.i.a) {
                            personalInfoWizardActivity.finish();
                            break;
                        } else if (iVar instanceof v92.i.c) {
                            personalInfoWizardActivity.ga();
                            break;
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f34491f = new z0(this) { // from class: dd0.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalInfoWizardActivity f59180b;

            {
                this.f59180b = this;
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o13.l] */
            @Override // androidx.lifecycle.z0
            public final void onChanged(Object obj) {
                int i16 = i15;
                PersonalInfoWizardActivity personalInfoWizardActivity = this.f59180b;
                switch (i16) {
                    case 0:
                        v92.k kVar = (v92.k) obj;
                        PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
                        kVar.getClass();
                        if (kVar instanceof v92.k.d) {
                            personalInfoWizardActivity.showProgressOverlay();
                        } else if (kVar instanceof v92.k.c) {
                            personalInfoWizardActivity.hideProgressOverlay();
                        } else if (kVar instanceof v92.k.b) {
                            personalInfoWizardActivity.hideProgressOverlay();
                            personalInfoWizardActivity.displayFailedMessage();
                            personalInfoWizardActivity.ga();
                        } else if (!(kVar instanceof v92.k.a)) {
                            u0.r();
                        } else {
                            ((z10.j) personalInfoWizardActivity.f34489d.getValue()).x4(x.DI_CONNECT_UPLOAD);
                        }
                        break;
                    default:
                        v92.i iVar = (v92.i) obj;
                        PersonalInfoWizardActivity.a aVar2 = PersonalInfoWizardActivity.f34487g;
                        iVar.getClass();
                        if (iVar instanceof v92.i.e) {
                            v92.i.e eVar = (v92.i.e) iVar;
                            GCMWebViewActivity.fa(personalInfoWizardActivity, eVar.f176402a, eVar.f176403b);
                            break;
                        } else if (iVar instanceof v92.i.b) {
                            d1.u(d1.f200951a, personalInfoWizardActivity, (v92.i.b) iVar);
                            break;
                        } else if (iVar instanceof v92.i.a) {
                            personalInfoWizardActivity.finish();
                            break;
                        } else if (iVar instanceof v92.i.c) {
                            personalInfoWizardActivity.ga();
                            break;
                        } else if (!iVar.equals(v92.i.d.f176401a)) {
                            u0.r();
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // com.garmin.android.apps.connectmobile.devices.setup.wizard.g.c
    public final void M8() {
        com.garmin.android.apps.connectmobile.devices.model.l lVar = this.f59152a;
        Intent intent = new Intent(this, (Class<?>) BLEScanningWizardActivity.class);
        intent.putExtra("GCM_deviceDTO", lVar);
        startActivity(intent);
        finish();
    }

    public final void ga() {
        o oVar = (o) this.f34488c.getValue();
        y0 y0Var = new y0();
        w9.a aVarA = v1.a(oVar);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new q(y0Var, oVar, null), 2);
        y0Var.f(this, new c(new dd0.n(this, 2)));
    }

    @Override // dd0.a, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (d1.f()) {
            d1.o(this, new dd0.m(this, 0));
        }
        showProgressOverlay();
        ge1.b.T(f0.w(this), null, null, new dd0.q(this, null), 3);
        o oVar = (o) this.f34488c.getValue();
        y0 y0Var = new y0();
        ge1.b.T(v1.a(oVar), null, null, new hv.p(y0Var, null), 3);
        y0Var.f(this, new c(new dd0.n(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/setup/wizard/PersonalInfoWizardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
