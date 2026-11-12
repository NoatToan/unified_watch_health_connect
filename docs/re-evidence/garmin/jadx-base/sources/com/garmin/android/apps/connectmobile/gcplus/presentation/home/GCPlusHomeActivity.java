package com.garmin.android.apps.connectmobile.gcplus.presentation.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import ht.o;
import lc.u0;
import o13.m;
import o13.n;
import o53.c0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import zd0.u1;
import ze2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "b", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCPlusHomeActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35323e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f35324a = (u1) AndroidKoinScopeExtKt.getKoinScope(this).get((k23.d<?>) s0.f105811a.b(u1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35325b = m.a(n.NONE, new f(this, null, null, new a03.e(this, 8)));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f35326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f35327d;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f35335a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.EXCEPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.NO_IT_OAUTH2_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.INOPERABLE_WEBVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.IT_PORTAL_BOOTSTRAP_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.IT_PORTAL_SESSION_EXPIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.NO_NETWORK_CONNECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.NO_USER_SIGNED_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f35335a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements p<String, String, Unit> {
        public d(Object obj) {
            super(2, obj, GCPlusHomeActivity.class, "launchMFAOrPurchaseFlow", "launchMFAOrPurchaseFlow(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            str3.getClass();
            str4.getClass();
            GCPlusHomeActivity gCPlusHomeActivity = (GCPlusHomeActivity) this.receiver;
            a aVar = GCPlusHomeActivity.f35323e;
            gCPlusHomeActivity.ca().f35413g.a(o.PURCHASE_STARTED);
            com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVarCa = gCPlusHomeActivity.ca();
            eVarCa.getClass();
            eVarCa.f35421o = str4;
            com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVarCa2 = gCPlusHomeActivity.ca();
            eVarCa2.getClass();
            eVarCa2.f35422p = str3;
            x53.c cVar = o53.s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new ak0.d(gCPlusHomeActivity, str3, str4, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements e23.a<Unit> {
        public e(Object obj) {
            super(0, obj, GCPlusHomeActivity.class, "exit", "exit()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            GCPlusHomeActivity gCPlusHomeActivity = (GCPlusHomeActivity) this.receiver;
            a aVar = GCPlusHomeActivity.f35323e;
            gCPlusHomeActivity.setResult(-1);
            gCPlusHomeActivity.onNavigateUp();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<com.garmin.android.apps.connectmobile.gcplus.presentation.home.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f35336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f35337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f35338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f35339d;

        public f(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f35336a = gVar;
            this.f35337b = qualifier;
            this.f35338c = aVar;
            this.f35339d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, com.garmin.android.apps.connectmobile.gcplus.presentation.home.e] */
        @Override // e23.a
        public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.e invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f35336a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f35338c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e.class), viewModelStore, null, defaultViewModelCreationExtras, this.f35337b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f35339d, 4, null);
        }
    }

    public GCPlusHomeActivity() {
        final int i14 = 0;
        this.f35326c = registerForActivityResult(new g.h(), new f.b(this) { // from class: ak0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCPlusHomeActivity f3590b;

            {
                this.f3590b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                GCPlusHomeActivity gCPlusHomeActivity = this.f3590b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        GCPlusHomeActivity.a aVar2 = GCPlusHomeActivity.f35323e;
                        aVar.getClass();
                        ht.i iVar = (ht.i) KoinJavaComponent.get$default(ht.i.class, null, null, 6, null);
                        int i16 = aVar.f67585a;
                        if (i16 == -1) {
                            a2 a2Var = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "GCPlusHomeActivity", "User successful at purchasing a subscription. Refreshing.");
                            ht.i.c(iVar, ht.k.UAC_SUCCESS, null, null, 14);
                            iVar.a(ht.o.PURCHASE_COMPLETED);
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVarCa = gCPlusHomeActivity.ca();
                            eVarCa.getClass();
                            ge1.b.T(v1.a(eVarCa), null, null, new com.garmin.android.apps.connectmobile.gcplus.presentation.home.g(eVarCa, null), 3);
                        } else if (i16 == 0) {
                            a2 a2Var2 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var2, "GCPlusHomeActivity", "User cancelled their subscription purchase.");
                            ht.i.c(iVar, ht.k.UAC_QUIT, null, null, 14);
                            iVar.a(ht.o.PURCHASE_CANCELLED);
                        } else if (i16 == 9) {
                            iVar.a(ht.o.PURCHASE_FAILED);
                        } else {
                            a2 a2Var3 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "GCPlusHomeActivity", "User failed their subscription purchase.");
                        }
                        break;
                    default:
                        GCPlusHomeActivity.a aVar3 = GCPlusHomeActivity.f35323e;
                        aVar.getClass();
                        int i17 = aVar.f67585a;
                        if (i17 == -1) {
                            String str = gCPlusHomeActivity.ca().f35422p;
                            if (str == null) {
                                a2 a2Var4 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "GCPlusHomeActivity", "MFA flow completed successfully but no metaPackageSku was found.");
                                Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                            } else {
                                ge1.b.T(o53.f0.w(gCPlusHomeActivity), null, null, new e(gCPlusHomeActivity, str, gCPlusHomeActivity.ca().f35421o, null), 3);
                            }
                            break;
                        } else if (i17 == 1) {
                            Intent intent = aVar.f67586b;
                            ze2.k kVarA = intent != null ? ze2.o.a(intent) : null;
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.p(a2Var5, "GCPlusHomeActivity", "MFA flow error: " + kVarA);
                            ze2.l lVar = kVarA != null ? kVarA.f204311a : null;
                            switch (lVar != null ? GCPlusHomeActivity.c.f35335a[lVar.ordinal()] : -1) {
                                case -1:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                                    break;
                                case 0:
                                default:
                                    u0.r();
                                    break;
                                case 6:
                                    i2.a.f(a2Var5, "GCPlusHomeActivity", "MFA flow error: no network connection");
                                    Toast.makeText(gCPlusHomeActivity, R.string.wifi_no_network_available, 0).show();
                                    break;
                                case 7:
                                    i2.a.f(a2Var5, "GCPlusHomeActivity", "MFA flow error: no user signed in. This should be impossible.");
                                    break;
                            }
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f35327d = registerForActivityResult(new g.h(), new f.b(this) { // from class: ak0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GCPlusHomeActivity f3590b;

            {
                this.f3590b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                GCPlusHomeActivity gCPlusHomeActivity = this.f3590b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        GCPlusHomeActivity.a aVar2 = GCPlusHomeActivity.f35323e;
                        aVar.getClass();
                        ht.i iVar = (ht.i) KoinJavaComponent.get$default(ht.i.class, null, null, 6, null);
                        int i17 = aVar.f67585a;
                        if (i17 == -1) {
                            a2 a2Var = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var, "GCPlusHomeActivity", "User successful at purchasing a subscription. Refreshing.");
                            ht.i.c(iVar, ht.k.UAC_SUCCESS, null, null, 14);
                            iVar.a(ht.o.PURCHASE_COMPLETED);
                            com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVarCa = gCPlusHomeActivity.ca();
                            eVarCa.getClass();
                            ge1.b.T(v1.a(eVarCa), null, null, new com.garmin.android.apps.connectmobile.gcplus.presentation.home.g(eVarCa, null), 3);
                        } else if (i17 == 0) {
                            a2 a2Var2 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var2, "GCPlusHomeActivity", "User cancelled their subscription purchase.");
                            ht.i.c(iVar, ht.k.UAC_QUIT, null, null, 14);
                            iVar.a(ht.o.PURCHASE_CANCELLED);
                        } else if (i17 == 9) {
                            iVar.a(ht.o.PURCHASE_FAILED);
                        } else {
                            a2 a2Var3 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.b(a2Var3, "GCPlusHomeActivity", "User failed their subscription purchase.");
                        }
                        break;
                    default:
                        GCPlusHomeActivity.a aVar3 = GCPlusHomeActivity.f35323e;
                        aVar.getClass();
                        int i18 = aVar.f67585a;
                        if (i18 == -1) {
                            String str = gCPlusHomeActivity.ca().f35422p;
                            if (str == null) {
                                a2 a2Var4 = a2.SUBSCRIPTIONS;
                                i2.f36769a.getClass();
                                i2.a.f(a2Var4, "GCPlusHomeActivity", "MFA flow completed successfully but no metaPackageSku was found.");
                                Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                            } else {
                                ge1.b.T(o53.f0.w(gCPlusHomeActivity), null, null, new e(gCPlusHomeActivity, str, gCPlusHomeActivity.ca().f35421o, null), 3);
                            }
                            break;
                        } else if (i18 == 1) {
                            Intent intent = aVar.f67586b;
                            ze2.k kVarA = intent != null ? ze2.o.a(intent) : null;
                            a2 a2Var5 = a2.SUBSCRIPTIONS;
                            i2.f36769a.getClass();
                            i2.a.p(a2Var5, "GCPlusHomeActivity", "MFA flow error: " + kVarA);
                            ze2.l lVar = kVarA != null ? kVarA.f204311a : null;
                            switch (lVar != null ? GCPlusHomeActivity.c.f35335a[lVar.ordinal()] : -1) {
                                case -1:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                    Toast.makeText(gCPlusHomeActivity, R.string.msg_something_went_wrong_please_try_again_later, 0).show();
                                    break;
                                case 0:
                                default:
                                    u0.r();
                                    break;
                                case 6:
                                    i2.a.f(a2Var5, "GCPlusHomeActivity", "MFA flow error: no network connection");
                                    Toast.makeText(gCPlusHomeActivity, R.string.wifi_no_network_available, 0).show();
                                    break;
                                case 7:
                                    i2.a.f(a2Var5, "GCPlusHomeActivity", "MFA flow error: no user signed in. This should be impossible.");
                                    break;
                            }
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final com.garmin.android.apps.connectmobile.gcplus.presentation.home.e ca() {
        return (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) this.f35325b.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b.j.a(this);
        super.onCreate(bundle);
        c.j.a(this, new z3.e(-940213425, true, new ak0.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "REFRESH_SUBSCRIPTION_CACHE", "EXTRA_DESTINATION", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, b bVar, int i14) {
            if ((i14 & 4) != 0) {
                bVar = b.f.f35334a;
            }
            aVar.getClass();
            context.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) GCPlusHomeActivity.class);
            intent.putExtra("REFRESH_SUBSCRIPTION_CACHE", true);
            intent.putExtra("EXTRA_DESTINATION", bVar);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "Landroid/os/Parcelable;", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "f", "c", "d", "b", "a", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$d;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$e;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$f;", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "", "offerId", "<init>", "(Ljava/lang/String;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {
            public static final Parcelable.Creator<a> CREATOR = new C0608a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f35328a;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0608a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new a(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i14) {
                    return new a[i14];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                str.getClass();
                this.f35328a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f35328a, ((a) obj).f35328a);
            }

            public final int hashCode() {
                return this.f35328a.hashCode();
            }

            public final String toString() {
                return am.j.m("ExclusiveOfferDetail(offerId=", this.f35328a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f35328a);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$b;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0609b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0609b f35329a = new C0609b();
            public static final Parcelable.Creator<C0609b> CREATOR = new a();

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0609b> {
                @Override // android.os.Parcelable.Creator
                public final C0609b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return C0609b.f35329a;
                }

                @Override // android.os.Parcelable.Creator
                public final C0609b[] newArray(int i14) {
                    return new C0609b[i14];
                }
            }

            private C0609b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0609b);
            }

            public final int hashCode() {
                return -1964632986;
            }

            public final String toString() {
                return "ExclusiveOffers";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$c;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f35330a = new c();
            public static final Parcelable.Creator<c> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                public final c createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return c.f35330a;
                }

                @Override // android.os.Parcelable.Creator
                public final c[] newArray(int i14) {
                    return new c[i14];
                }
            }

            private c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1582017761;
            }

            public final String toString() {
                return "FeatureEducation";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$d;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f35331a = new d();
            public static final Parcelable.Creator<d> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                public final d createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return d.f35331a;
                }

                @Override // android.os.Parcelable.Creator
                public final d[] newArray(int i14) {
                    return new d[i14];
                }
            }

            private d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1217948618;
            }

            public final String toString() {
                return "FeatureSettings";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$e;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "", "fromDeepLink", "Lc80/q;", "focusedFeature", "<init>", "(ZLc80/q;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends b {
            public static final Parcelable.Creator<e> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f35332a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c80.q f35333b;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<e> {
                @Override // android.os.Parcelable.Creator
                public final e createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new e(parcel.readInt() != 0, parcel.readInt() == 0 ? null : c80.q.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final e[] newArray(int i14) {
                    return new e[i14];
                }
            }

            public e(boolean z14, c80.q qVar) {
                super(null);
                this.f35332a = z14;
                this.f35333b = qVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.f35332a == eVar.f35332a && this.f35333b == eVar.f35333b;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f35332a) * 31;
                c80.q qVar = this.f35333b;
                return iHashCode + (qVar == null ? 0 : qVar.hashCode());
            }

            public final String toString() {
                return "Paywall(fromDeepLink=" + this.f35332a + ", focusedFeature=" + this.f35333b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(this.f35332a ? 1 : 0);
                c80.q qVar = this.f35333b;
                if (qVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(qVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b$f;", "Lcom/garmin/android/apps/connectmobile/gcplus/presentation/home/GCPlusHomeActivity$b;", "<init>", "()V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f35334a = new f();
            public static final Parcelable.Creator<f> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                public final f createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return f.f35334a;
                }

                @Override // android.os.Parcelable.Creator
                public final f[] newArray(int i14) {
                    return new f[i14];
                }
            }

            private f() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 1051158194;
            }

            public final String toString() {
                return "Settings";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
