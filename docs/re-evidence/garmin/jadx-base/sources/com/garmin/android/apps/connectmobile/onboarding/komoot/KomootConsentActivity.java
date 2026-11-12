package com.garmin.android.apps.connectmobile.onboarding.komoot;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import e23.l;
import fw.p;
import o13.h;
import o53.f0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.w;
import p13.x;
import p3.q1;
import q31.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/komoot/KomootConsentActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class KomootConsentActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39717c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f39718a = new w1(s0.f105811a.b(g.class), new e(this), new d(this), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39719b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39720a;

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
            f39720a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39721a;

        public c(l lVar) {
            lVar.getClass();
            this.f39721a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f39721a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39721a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39722a;

        public d(b.g gVar) {
            this.f39722a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f39722a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f39723a;

        public e(b.g gVar) {
            this.f39723a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f39723a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f39724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f39725b;

        public f(e23.a aVar, b.g gVar) {
            this.f39724a = aVar;
            this.f39725b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f39724a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f39725b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b31.f fVar = (b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null);
        e31.a aVar = e31.a.ENTERED_KOMOOT;
        if (!fVar.e(aVar)) {
            q31.c.f142410a.getClass();
            zk.c.f205034a.a(x.k("GCS", "FIREBASE")).a(new zk.a("PARTNER_ONBOARDING", w.c(new zk.e("partnerOnboardingEvent", new q31.c.a("KOMOOT", "LEARN_MORE"))), false, 0L, 12, null));
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(aVar);
        }
        if (!getIntent().hasExtra("connection_status")) {
            f0.N(new q31.f((g) this.f39718a.getValue(), null)).f(this, new c(new q1(this, 26)));
            return;
        }
        q31.c.f142410a.getClass();
        zk.c.f205034a.a(x.k("GCS", "FIREBASE")).a(new zk.a("PARTNER_ONBOARDING", w.c(new zk.e("partnerOnboardingEvent", new q31.c.a("KOMOOT", "KOMOOT_FROM_DEEPLINK"))), false, 0L, 12, null));
        initComposeScreen(new z3.e(1109389986, true, new ap2.f(getIntent().getBooleanExtra("connection_status", false), this, 12)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/onboarding/komoot/KomootConsentActivity$a;", "", "<init>", "()V", "", "KOMOOT_APPLICATION_NAME", "Ljava/lang/String;", "KOMOOT_URI", "CONNECTION_STATUS", "CONNECT_SUCCESS", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Activity activity, Uri uri) {
            Intent intent = new Intent(activity, (Class<?>) KomootConsentActivity.class);
            intent.addFlags(67108864);
            intent.putExtra("connection_status", Boolean.parseBoolean(uri.getQueryParameter("garmin_connect_success")));
            activity.startActivity(intent);
        }

        private a() {
        }
    }
}
