package com.garmin.android.apps.connectmobile.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import aq1.j0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import e23.l;
import g.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o13.h;
import o13.m;
import o13.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import po2.o;
import pu.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/auth/PostUserAuthenticationActivity;", "Lcom/garmin/android/apps/connectmobile/bic/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PostUserAuthenticationActivity extends com.garmin.android.apps.connectmobile.bic.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f30291i = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f30293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.c<String[]> f30294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.appcompat.app.e f30295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f30296h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f30298b;

        static {
            int[] iArr = new int[j0.values().length];
            try {
                iArr[j0.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j0.HIDE_LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j0.SHOW_GRADUATION_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[j0.GRADUATION_CONSENTS_CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[j0.CONSENT_CHECK_ENDED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f30297a = iArr;
            int[] iArr2 = new int[h0.values().length];
            try {
                iArr2[h0.NO_DISPLAY_MANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h0.GCS_SECURITY_CHECK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h0.GCS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f30298b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f30299a;

        public c(l lVar) {
            lVar.getClass();
            this.f30299a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f30299a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30299a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<pu.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30301b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30303d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f30300a = gVar;
            this.f30301b = qualifier;
            this.f30302c = aVar;
            this.f30303d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, pu.j0] */
        @Override // e23.a
        public final pu.j0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f30300a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f30302c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(pu.j0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f30301b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f30303d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<com.garmin.android.apps.connectmobile.startup.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f30304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f30305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f30306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f30307d;

        public e(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f30304a = gVar;
            this.f30305b = qualifier;
            this.f30306c = aVar;
            this.f30307d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.startup.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.startup.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f30304a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f30306c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.startup.e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f30305b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f30307d, 4, null);
        }
    }

    public PostUserAuthenticationActivity() {
        final int i14 = 0;
        e23.a aVar = new e23.a(this) { // from class: pu.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostUserAuthenticationActivity f141126b;

            {
                this.f141126b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                PostUserAuthenticationActivity postUserAuthenticationActivity = this.f141126b;
                switch (i15) {
                    case 0:
                        return ParametersHolderKt.parametersOf((re2.b.d) postUserAuthenticationActivity.f30296h.getValue());
                    default:
                        PostUserAuthenticationActivity.a aVar2 = PostUserAuthenticationActivity.f30291i;
                        Intent intent = postUserAuthenticationActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("EXTRA_USER_SIGN_IN_TYPE") : null;
                            serializableExtra = (re2.b.d) (serializableExtra2 instanceof re2.b.d ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("EXTRA_USER_SIGN_IN_TYPE", re2.b.d.class);
                        }
                        re2.b.d dVar = (re2.b.d) serializableExtra;
                        return dVar == null ? re2.b.d.IT_WEB_SIGN_IN : dVar;
                }
            }
        };
        o13.n nVar = o13.n.NONE;
        this.f30292d = m.a(nVar, new d(this, null, null, aVar));
        this.f30293e = m.a(nVar, new e(this, null, null, null));
        this.f30294f = registerForActivityResult(new f(), new jp.a(this, 21));
        final int i15 = 1;
        this.f30296h = m.b(new e23.a(this) { // from class: pu.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostUserAuthenticationActivity f141126b;

            {
                this.f141126b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                PostUserAuthenticationActivity postUserAuthenticationActivity = this.f141126b;
                switch (i16) {
                    case 0:
                        return ParametersHolderKt.parametersOf((re2.b.d) postUserAuthenticationActivity.f30296h.getValue());
                    default:
                        PostUserAuthenticationActivity.a aVar2 = PostUserAuthenticationActivity.f30291i;
                        Intent intent = postUserAuthenticationActivity.getIntent();
                        Serializable serializableExtra = null;
                        if (Build.VERSION.SDK_INT < 33) {
                            Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("EXTRA_USER_SIGN_IN_TYPE") : null;
                            serializableExtra = (re2.b.d) (serializableExtra2 instanceof re2.b.d ? serializableExtra2 : null);
                        } else if (intent != null) {
                            serializableExtra = intent.getSerializableExtra("EXTRA_USER_SIGN_IN_TYPE", re2.b.d.class);
                        }
                        re2.b.d dVar = (re2.b.d) serializableExtra;
                        return dVar == null ? re2.b.d.IT_WEB_SIGN_IN : dVar;
                }
            }
        });
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final List<androidx.lifecycle.n> getCommonBehaviorHandlers() {
        List<androidx.lifecycle.n> commonBehaviorHandlers = super.getCommonBehaviorHandlers();
        commonBehaviorHandlers.getClass();
        ArrayList arrayList = new ArrayList(commonBehaviorHandlers);
        arrayList.removeIf(new a73.n(new o(16), 26));
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_parallax_content_frame);
        j22.b bVar = j22.b.f96736a;
        j22.g gVar = j22.g.f96760e;
        bVar.getClass();
        j22.b.v(this.f30294f, gVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/auth/PostUserAuthenticationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_USER_SIGN_IN_TYPE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
