package com.garmin.feature.garminpay.providers.gpay.ui.common;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.i0;
import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import e23.l;
import gp2.g;
import lc.u0;
import o13.r;
import o53.f0;
import o53.s0;
import op2.i;
import op2.k;
import op2.m;
import op2.n;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import ps2.w;
import sd2.f;
import u53.o;
import u62.z;
import vb.h;
import zn2.g1;
import zn2.t;
import zn2.y;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/NewFitPayWebNavigationActivity;", "Lhn2/c;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewFitPayWebNavigationActivity extends hn2.c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f51549w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f51550x;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f51551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gp2.a f51552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.common.a f51553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public op2.d f51554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public gp2.b f51555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f51556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z0 f51558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qs2.a f51559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f f51560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.c<Intent> f51561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f51562r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f.c<Intent> f51563t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final f.c<Intent> f51564v;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/NewFitPayWebNavigationActivity$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        ADD_CARD_FLOW("ADD_CARD_FLOW"),
        MANAGE_CARD_FLOW("MANAGE_CARD_FLOW");

        b(String str) {
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f51571d;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.SETUP_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a.UNDER_MAINTENANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51568a = iArr;
            int[] iArr2 = new int[qs2.a.values().length];
            try {
                iArr2[qs2.a.f147379h.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[qs2.a.f147378g.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[qs2.a.f147380i.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[qs2.a.f147381j.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[qs2.a.f147388q.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f51569b = iArr2;
            int[] iArr3 = new int[gp2.a.values().length];
            try {
                iArr3[gp2.a.DEVICE_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[gp2.a.USER_WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[gp2.a.SELECT_BUSINESS_OPERATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f51570c = iArr3;
            int[] iArr4 = new int[g.values().length];
            try {
                iArr4[g.CREATE_CREDIT_CARD_AND_CREDENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[g.CREATE_CREDIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[g.VERIFY_CREDIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[g.CREATE_CREDENTIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[g.VERIFY_CREDENTIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f51571d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/common/NewFitPayWebNavigationActivity$d", "Landroidx/lifecycle/x1$c;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements x1.c {
        public d() {
        }

        @Override // androidx.lifecycle.x1.c
        public final <T extends u1> T create(Class<T> cls) {
            cls.getClass();
            if (!cls.equals(n.class)) {
                h.s("Failed requirement.");
                return null;
            }
            NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = NewFitPayWebNavigationActivity.this;
            long longExtra = newFitPayWebNavigationActivity.getIntent().getLongExtra("device.unit.id", -1L);
            Intent intent = newFitPayWebNavigationActivity.getIntent();
            Parcelable parcelable = null;
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra.product") : null;
                parcelable = (Product) (parcelableExtra instanceof Product ? parcelableExtra : null);
            } else if (intent != null) {
                parcelable = (Parcelable) intent.getParcelableExtra("extra.product", Product.class);
            }
            return new n(longExtra, (Product) parcelable);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements androidx.lifecycle.z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51573a;

        public e(l lVar) {
            lVar.getClass();
            this.f51573a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51573a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51573a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51550x = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayWebNavigationActivity");
    }

    public NewFitPayWebNavigationActivity() {
        final int i14 = 0;
        this.f51561q = registerForActivityResult(new g.h(), new f.b(this) { // from class: op2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayWebNavigationActivity f133219b;

            {
                this.f133219b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133219b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        NewFitPayWebNavigationActivity.a aVar2 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger = NewFitPayWebNavigationActivity.f51550x;
                        int i16 = aVar.f67585a;
                        z.i("termsConditionsActivityLauncher: resultCode=", i16, logger);
                        if (i16 != -1) {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                        z0 z0Var = newFitPayWebNavigationActivity.f51558n;
                        if (z0Var == null) {
                            s.m("fitPayServiceProvider");
                            throw null;
                        }
                        z0Var.s();
                        if (newFitPayWebNavigationActivity.ea()) {
                            newFitPayWebNavigationActivity.ha();
                            return;
                        } else {
                            newFitPayWebNavigationActivity.fa(false);
                            return;
                        }
                    case 1:
                        NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger2 = NewFitPayWebNavigationActivity.f51550x;
                        int i17 = aVar.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i17, logger2);
                        if (i17 == -1) {
                            newFitPayWebNavigationActivity.fa(true);
                            return;
                        } else {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                    case 2:
                        NewFitPayWebNavigationActivity.a aVar4 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger3 = NewFitPayWebNavigationActivity.f51550x;
                        int i18 = aVar.f67585a;
                        z.i("fitPayAddCardActivityLauncher: resultCode=", i18, logger3);
                        if (i18 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i18 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                    default:
                        NewFitPayWebNavigationActivity.a aVar5 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger4 = NewFitPayWebNavigationActivity.f51550x;
                        int i19 = aVar.f67585a;
                        z.i("fitPayManageCardActivityLauncher: resultCode=", i19, logger4);
                        if (i19 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i19 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        final int i15 = 1;
        this.f51562r = registerForActivityResult(new g.h(), new f.b(this) { // from class: op2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayWebNavigationActivity f133219b;

            {
                this.f133219b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133219b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        NewFitPayWebNavigationActivity.a aVar2 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger = NewFitPayWebNavigationActivity.f51550x;
                        int i17 = aVar.f67585a;
                        z.i("termsConditionsActivityLauncher: resultCode=", i17, logger);
                        if (i17 != -1) {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                        z0 z0Var = newFitPayWebNavigationActivity.f51558n;
                        if (z0Var == null) {
                            s.m("fitPayServiceProvider");
                            throw null;
                        }
                        z0Var.s();
                        if (newFitPayWebNavigationActivity.ea()) {
                            newFitPayWebNavigationActivity.ha();
                            return;
                        } else {
                            newFitPayWebNavigationActivity.fa(false);
                            return;
                        }
                    case 1:
                        NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger2 = NewFitPayWebNavigationActivity.f51550x;
                        int i18 = aVar.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i18, logger2);
                        if (i18 == -1) {
                            newFitPayWebNavigationActivity.fa(true);
                            return;
                        } else {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                    case 2:
                        NewFitPayWebNavigationActivity.a aVar4 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger3 = NewFitPayWebNavigationActivity.f51550x;
                        int i19 = aVar.f67585a;
                        z.i("fitPayAddCardActivityLauncher: resultCode=", i19, logger3);
                        if (i19 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i19 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                    default:
                        NewFitPayWebNavigationActivity.a aVar5 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger4 = NewFitPayWebNavigationActivity.f51550x;
                        int i110 = aVar.f67585a;
                        z.i("fitPayManageCardActivityLauncher: resultCode=", i110, logger4);
                        if (i110 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i110 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        final int i16 = 2;
        this.f51563t = registerForActivityResult(new g.h(), new f.b(this) { // from class: op2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayWebNavigationActivity f133219b;

            {
                this.f133219b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133219b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        NewFitPayWebNavigationActivity.a aVar2 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger = NewFitPayWebNavigationActivity.f51550x;
                        int i18 = aVar.f67585a;
                        z.i("termsConditionsActivityLauncher: resultCode=", i18, logger);
                        if (i18 != -1) {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                        z0 z0Var = newFitPayWebNavigationActivity.f51558n;
                        if (z0Var == null) {
                            s.m("fitPayServiceProvider");
                            throw null;
                        }
                        z0Var.s();
                        if (newFitPayWebNavigationActivity.ea()) {
                            newFitPayWebNavigationActivity.ha();
                            return;
                        } else {
                            newFitPayWebNavigationActivity.fa(false);
                            return;
                        }
                    case 1:
                        NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger2 = NewFitPayWebNavigationActivity.f51550x;
                        int i19 = aVar.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i19, logger2);
                        if (i19 == -1) {
                            newFitPayWebNavigationActivity.fa(true);
                            return;
                        } else {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                    case 2:
                        NewFitPayWebNavigationActivity.a aVar4 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger3 = NewFitPayWebNavigationActivity.f51550x;
                        int i110 = aVar.f67585a;
                        z.i("fitPayAddCardActivityLauncher: resultCode=", i110, logger3);
                        if (i110 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i110 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                    default:
                        NewFitPayWebNavigationActivity.a aVar5 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger4 = NewFitPayWebNavigationActivity.f51550x;
                        int i111 = aVar.f67585a;
                        z.i("fitPayManageCardActivityLauncher: resultCode=", i111, logger4);
                        if (i111 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i111 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                }
            }
        });
        final int i17 = 3;
        this.f51564v = registerForActivityResult(new g.h(), new f.b(this) { // from class: op2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewFitPayWebNavigationActivity f133219b;

            {
                this.f133219b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i18 = i17;
                NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133219b;
                f.a aVar = (f.a) obj;
                switch (i18) {
                    case 0:
                        NewFitPayWebNavigationActivity.a aVar2 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger = NewFitPayWebNavigationActivity.f51550x;
                        int i19 = aVar.f67585a;
                        z.i("termsConditionsActivityLauncher: resultCode=", i19, logger);
                        if (i19 != -1) {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                        z0 z0Var = newFitPayWebNavigationActivity.f51558n;
                        if (z0Var == null) {
                            s.m("fitPayServiceProvider");
                            throw null;
                        }
                        z0Var.s();
                        if (newFitPayWebNavigationActivity.ea()) {
                            newFitPayWebNavigationActivity.ha();
                            return;
                        } else {
                            newFitPayWebNavigationActivity.fa(false);
                            return;
                        }
                    case 1:
                        NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger2 = NewFitPayWebNavigationActivity.f51550x;
                        int i110 = aVar.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i110, logger2);
                        if (i110 == -1) {
                            newFitPayWebNavigationActivity.fa(true);
                            return;
                        } else {
                            newFitPayWebNavigationActivity.finish();
                            return;
                        }
                    case 2:
                        NewFitPayWebNavigationActivity.a aVar4 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger3 = NewFitPayWebNavigationActivity.f51550x;
                        int i111 = aVar.f67585a;
                        z.i("fitPayAddCardActivityLauncher: resultCode=", i111, logger3);
                        if (i111 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i111 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                    default:
                        NewFitPayWebNavigationActivity.a aVar5 = NewFitPayWebNavigationActivity.f51549w;
                        aVar.getClass();
                        Logger logger4 = NewFitPayWebNavigationActivity.f51550x;
                        int i112 = aVar.f67585a;
                        z.i("fitPayManageCardActivityLauncher: resultCode=", i112, logger4);
                        if (i112 == -1) {
                            hn2.c.U9(newFitPayWebNavigationActivity, newFitPayWebNavigationActivity, null, 12);
                            return;
                        } else {
                            if (i112 == 0) {
                                newFitPayWebNavigationActivity.finish();
                                return;
                            }
                            return;
                        }
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002e, B:57:0x00b8, B:63:0x00c2, B:19:0x0040, B:47:0x009c, B:52:0x00a5, B:54:0x00a9, B:61:0x00be, B:62:0x00c1, B:38:0x007a, B:42:0x0083, B:44:0x008b, B:50:0x00a1, B:51:0x00a4), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00be A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:12:0x002e, B:57:0x00b8, B:63:0x00c2, B:19:0x0040, B:47:0x009c, B:52:0x00a5, B:54:0x00a9, B:61:0x00be, B:62:0x00c1, B:38:0x007a, B:42:0x0083, B:44:0x008b, B:50:0x00a1, B:51:0x00a4), top: B:69:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        if (r12 == r1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object ca(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, qs2.d dVar, v13.c cVar) {
        k kVar;
        ms2.d dVarG;
        String f73434i;
        int i14;
        z0 z0Var;
        yo2.b bVar;
        newFitPayWebNavigationActivity.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i15 = kVar.f133224e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.f133224e = i15 - Integer.MIN_VALUE;
            } else {
                kVar = new k(newFitPayWebNavigationActivity, cVar);
            }
        } else {
            kVar = new k(newFitPayWebNavigationActivity, cVar);
        }
        Object objA = kVar.f133222c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = kVar.f133224e;
        Logger logger = f51550x;
        try {
            if (i16 != 0) {
                if (i16 == 1) {
                    i14 = kVar.f133221b;
                    f73434i = kVar.f133220a;
                    r.b(objA);
                } else {
                    if (i16 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(objA);
                }
                bVar = (yo2.b) objA;
                if (bVar == null) {
                    return bVar;
                }
                logger.error("getCreditCard: creditCardId is missing");
                return null;
            }
            r.b(objA);
            w wVar = w.f140538a;
            op2.d dVar2 = newFitPayWebNavigationActivity.f51554j;
            if (dVar2 == null) {
                s.m("fitPayWebNavigationViewModel");
                throw null;
            }
            long deviceUnitId = dVar2.getDeviceUnitId();
            is2.b bVar2 = is2.b.FITPAY;
            wVar.getClass();
            ps2.n nVarI = w.i(deviceUnitId);
            if (nVarI == null) {
                dVarG = null;
            } else {
                dVarG = nVarI.g(bVar2);
                if (!(dVarG != null ? dVarG instanceof t : true)) {
                    dVarG = null;
                }
            }
            t tVar = dVarG instanceof t ? (t) dVarG : null;
            if (tVar == null) {
                logger.warn("getCreditCard: failed to get device service provider");
                tVar = null;
            }
            f73434i = dVar.getF73434i();
            if (f73434i != null) {
                i14 = 0;
                if (tVar != null) {
                    fo2.s sVar = tVar.f205819e.f205629a;
                    z0 z0Var2 = newFitPayWebNavigationActivity.f51558n;
                    if (z0Var2 == null) {
                        s.m("fitPayServiceProvider");
                        throw null;
                    }
                    g1 g1Var = z0Var2.f205979a;
                    kVar.f133220a = f73434i;
                    kVar.f133221b = 0;
                    kVar.f133224e = 1;
                    ch.qos.logback.classic.Logger logger2 = g1.f205525n;
                    objA = g1Var.A(f73434i, sVar, false, kVar);
                    if (objA == aVar) {
                    }
                } else {
                    z0Var = newFitPayWebNavigationActivity.f51558n;
                    if (z0Var != null) {
                        s.m("fitPayServiceProvider");
                        throw null;
                    }
                    g1 g1Var2 = z0Var.f205979a;
                    kVar.f133220a = null;
                    kVar.f133221b = i14;
                    kVar.f133224e = 2;
                    objA = g1Var2.B(f73434i, kVar);
                }
                return aVar;
            }
            logger.error("getCreditCard: creditCardId is missing");
            return null;
            bVar = (yo2.b) objA;
            if (bVar == null) {
                z0Var = newFitPayWebNavigationActivity.f51558n;
                if (z0Var != null) {
                    s.m("fitPayServiceProvider");
                    throw null;
                }
                g1 g1Var3 = z0Var.f205979a;
                kVar.f133220a = null;
                kVar.f133221b = i14;
                kVar.f133224e = 2;
                objA = g1Var3.B(f73434i, kVar);
            }
            if (bVar == null) {
                return bVar;
            }
            logger.error("getCreditCard: creditCardId is missing");
            return null;
        } catch (Exception e4) {
            logger.error("getCreditCard: ", (Throwable) e4);
            return null;
        }
    }

    public final void da() {
        if (isFinishing()) {
            return;
        }
        br2.c.h(br2.c.f19585a, this, new i(this, 5), null, 4);
    }

    public final boolean ea() {
        g gVar = this.f51556l;
        int i14 = gVar == null ? -1 : c.f51571d[gVar.ordinal()];
        if (i14 == -1) {
            return false;
        }
        if (i14 != 1 && i14 != 2 && i14 != 3) {
            if (i14 == 4 || i14 == 5) {
                return false;
            }
            u0.r();
            return false;
        }
        z0 z0Var = this.f51558n;
        if (z0Var == null) {
            s.m("fitPayServiceProvider");
            throw null;
        }
        g1 g1Var = z0Var.f205979a;
        f fVar = this.f51560p;
        if (fVar != null) {
            fo2.s sVarE = g1Var.E(fVar.getUnitID());
            return sVarE == null || sVarE.f73106f != y.INITIALIZED;
        }
        s.m("deviceRecord");
        throw null;
    }

    public final void fa(boolean z14) {
        f51550x.debug("launchAddCardFlow");
        qs2.a aVar = this.f51559o;
        if (aVar == null) {
            ga();
            return;
        }
        int i14 = c.f51569b[aVar.ordinal()];
        if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
            ga();
            Unit unit = Unit.INSTANCE;
            return;
        }
        if (i14 != 5) {
            c22.t.h(aVar, " is not expected to be handled in NewFitPayServiceProvider");
            return;
        }
        f fVar = this.f51560p;
        if (fVar == null) {
            s.m("deviceRecord");
            throw null;
        }
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        gl.b.I(i0VarW, o.f168762a, new m(z14, this, fVar, null), 2);
        Unit unit2 = Unit.INSTANCE;
    }

    public final void ga() {
        g gVar = this.f51556l;
        gp2.b bVar = this.f51555k;
        Unit unit = null;
        if (gVar != null && bVar != null) {
            FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
            op2.d dVar = this.f51554j;
            if (dVar == null) {
                s.m("fitPayWebNavigationViewModel");
                throw null;
            }
            Long lValueOf = Long.valueOf(dVar.getDeviceUnitId());
            aVar.getClass();
            startActivity(FitPayAddCardActivity.a.b(lValueOf, null, null, null, gVar, bVar, false, null));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            f51550x.error("No init information. Cannot continue.");
        }
        finish();
    }

    public final void ha() {
        op2.d dVar = this.f51554j;
        if (dVar == null) {
            s.m("fitPayWebNavigationViewModel");
            throw null;
        }
        wr.g.v("onBoardDevice: Device ", dVar.getDeviceUnitId(), " is not provisioned yet, navigating to NewDeviceOnBoardingActivity", f51550x);
        NewDeviceOnBoardingActivity.a aVar = NewDeviceOnBoardingActivity.f51700k;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        f fVar = this.f51560p;
        if (fVar == null) {
            s.m("deviceRecord");
            throw null;
        }
        long unitID = fVar.getUnitID();
        f fVar2 = this.f51560p;
        if (fVar2 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String productDisplayName = fVar2.getProductDisplayName();
        productDisplayName.getClass();
        f fVar3 = this.f51560p;
        if (fVar3 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String imageURL = fVar3.getImageURL();
        if (imageURL == null) {
            imageURL = "";
        }
        aVar.getClass();
        this.f51562r.a(NewDeviceOnBoardingActivity.a.a(contextC, unitID, productDisplayName, imageURL), null);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        Object serializableExtra2;
        Object serializableExtra3;
        super.onCreate(bundle);
        Logger logger = f51550x;
        logger.debug("onCreate");
        R9(R.layout.activity_fitpay_web_view, hn2.c.a.UP, "");
        this.f51554j = (op2.d) new ry2.d(this, new x1(this, new d())).f155186a.a(op2.d.class, n.class);
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra.webview.navigation", b.class) : null;
        } else {
            Object serializableExtra4 = intent != null ? intent.getSerializableExtra("extra.webview.navigation") : null;
            if (!(serializableExtra4 instanceof b)) {
                serializableExtra4 = null;
            }
            serializableExtra = (b) serializableExtra4;
        }
        b bVar = (b) serializableExtra;
        if (bVar == null) {
            logger.error("onCreate: fitPayWebViewNavigation is missing");
            da();
            return;
        }
        this.f51551g = bVar;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("extra.add.card.source", gp2.a.class) : null;
        } else {
            Object serializableExtra5 = intent2 != null ? intent2.getSerializableExtra("extra.add.card.source") : null;
            if (!(serializableExtra5 instanceof gp2.a)) {
                serializableExtra5 = null;
            }
            serializableExtra2 = (gp2.a) serializableExtra5;
        }
        this.f51552h = (gp2.a) serializableExtra2;
        Intent intent3 = getIntent();
        if (i14 >= 33) {
            serializableExtra3 = intent3 != null ? intent3.getSerializableExtra("business.operator", qs2.a.class) : null;
        } else {
            Object serializableExtra6 = intent3 != null ? intent3.getSerializableExtra("business.operator") : null;
            if (!(serializableExtra6 instanceof qs2.a)) {
                serializableExtra6 = null;
            }
            serializableExtra3 = (qs2.a) serializableExtra6;
        }
        this.f51559o = (qs2.a) serializableExtra3;
        op2.d dVar = this.f51554j;
        if (dVar == null) {
            s.m("fitPayWebNavigationViewModel");
            throw null;
        }
        boolean z14 = dVar.getDeviceUnitId() > 0;
        gp2.a aVar = this.f51552h;
        int i15 = aVar == null ? -1 : c.f51570c[aVar.ordinal()];
        if (i15 != 1) {
            if (i15 == 2) {
                this.f51556l = z14 ? g.CREATE_CREDIT_CARD_AND_CREDENTIAL : g.CREATE_CREDENTIAL;
                this.f51555k = gp2.b.SHOW_PAYMENT_CARD_INFO_FORM;
            } else if (i15 != 3) {
                logger.error("No source information. Cannot continue.");
            } else {
                this.f51556l = g.CREATE_CREDIT_CARD_AND_CREDENTIAL;
                this.f51555k = gp2.b.LOAD_PAYMENT_CARDS_NOT_IN_DEVICE;
            }
        } else if (z14) {
            this.f51556l = g.CREATE_CREDIT_CARD_AND_CREDENTIAL;
            this.f51555k = gp2.b.LOAD_PAYMENT_CARDS_NOT_IN_DEVICE;
        } else {
            this.f51556l = null;
        }
        op2.d dVar2 = this.f51554j;
        if (dVar2 == null) {
            s.m("fitPayWebNavigationViewModel");
            throw null;
        }
        if (dVar2.getDeviceUnitId() < 0) {
            op2.d dVar3 = this.f51554j;
            if (dVar3 == null) {
                s.m("fitPayWebNavigationViewModel");
                throw null;
            }
            logger.warn("onCreate: invalid deviceId " + dVar3 + ".deviceUnitId, can not onBoard the device " + dVar3 + ".deviceUnitId");
            da();
            return;
        }
        ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
        z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
        if (z0Var == null) {
            logger.error("handleFitPayWVNavigation: fitPayServiceProvider is null");
            da();
            return;
        }
        this.f51558n = z0Var;
        com.garmin.feature.garminpay.providers.gpay.ui.common.a aVar2 = (com.garmin.feature.garminpay.providers.gpay.ui.common.a) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.common.a.class));
        z0 z0Var2 = this.f51558n;
        if (z0Var2 == null) {
            s.m("fitPayServiceProvider");
            throw null;
        }
        if (z0Var2.f205983e) {
            ge1.b.T(f0.w(this), null, null, new com.garmin.feature.garminpay.providers.gpay.ui.common.c(this, null), 3);
        } else {
            aVar2.x4();
        }
        this.f51553i = aVar2;
        y0<com.garmin.feature.garminpay.providers.gpay.ui.common.a.EnumC1069a> y0Var = aVar2.f51575b;
        if (y0Var != null) {
            y0Var.f(this, new e(new nw0.f(this, 18)));
        } else {
            logger.error("onCreate: fitPaySetupRecoveryViewModel is null");
            da();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/common/NewFitPayWebNavigationActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, long j8, b bVar, gp2.a aVar2, qs2.a aVar3, qs2.d dVar, Product product, int i14) {
            if ((i14 & 8) != 0) {
                aVar2 = null;
            }
            if ((i14 & 32) != 0) {
                dVar = null;
            }
            aVar.getClass();
            context.getClass();
            bVar.getClass();
            Intent intent = new Intent(context, (Class<?>) NewFitPayWebNavigationActivity.class);
            intent.putExtra("device.unit.id", j8);
            intent.putExtra("extra.webview.navigation", bVar);
            intent.putExtra("extra.add.card.source", aVar2);
            if (aVar3 != null) {
                intent.putExtra("business.operator", aVar3);
            }
            if (dVar != null) {
                intent.putExtra("extra.wallet.item", dVar);
            }
            if (product != null) {
                intent.putExtra("extra.product", product);
            }
            return intent;
        }

        private a() {
        }
    }
}
