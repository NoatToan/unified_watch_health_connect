package s00;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.j1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls00/k0;", "Ls00/j;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k0 extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f155303a = 0;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155304a;

        static {
            int[] iArr = new int[n00.c.values().length];
            try {
                iArr[n00.c.SUBSCRIPTION_EXPIRING_SOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n00.c.FREE_TRIAL_EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n00.c.SUBSCRIPTION_PAYMENT_DECLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n00.c.SUBSCRIPTION_DUNNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n00.c.SUBSCRIPTION_CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f155304a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.cloudmessaging.handlers.SubscriptionCommonPushNotificationHandler$handleSubscriptionPaymentNotification$1", f = "SubscriptionCommonPushNotificationHandler.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f155305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f155306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f155307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f155308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k0 f155309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n00.c f155310f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bundle bundle, Context context, k0 k0Var, n00.c cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f155307c = bundle;
            this.f155308d = context;
            this.f155309e = k0Var;
            this.f155310f = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(this.f155307c, this.f155308d, this.f155309e, this.f155310f, dVar);
            cVar.f155306b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f155305a;
            if (i14 == 0) {
                o13.r.b(obj);
                String string = this.f155307c.getString("days_until_expiration");
                if (string == null) {
                    a2 a2Var = a2.SUBSCRIPTIONS;
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "SubscriptionCommonPushNotificationHandler", "Missing days_until_expiration.");
                    string = "";
                }
                Integer numI = d53.t.i(string);
                Context context = this.f155308d;
                String string2 = (numI != null && numI.intValue() == 1) ? context.getString(R.string.your_payment_method_is_no_longer_valid_and_will_expire_in_1_day) : context.getString(R.string.your_payment_method_is_no_longer_valid_and_will_expire_in_days, string);
                string2.getClass();
                this.f155306b = null;
                this.f155305a = 1;
                if (k0.f(this.f155309e, context, this.f155310f, string2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object f(k0 k0Var, Context context, n00.c cVar, String str, v13.c cVar2) {
        p0 p0Var;
        String str2;
        sz0.e eVar;
        Context context2;
        int i14;
        k0 k0Var2;
        k0Var.getClass();
        if (cVar2 instanceof p0) {
            p0Var = (p0) cVar2;
            int i15 = p0Var.f155397k;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                p0Var.f155397k = i15 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(k0Var, cVar2);
            }
        } else {
            p0Var = new p0(k0Var, cVar2);
        }
        Object obj = p0Var.f155395i;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = p0Var.f155397k;
        if (i16 == 0) {
            o13.r.b(obj);
            sz0.e eVar2 = sz0.e.L0;
            int iD = k0Var.d(cVar);
            String string = context.getString(R.string.lbl_garmin_connect_plus);
            p0Var.f155387a = k0Var;
            p0Var.f155388b = context;
            p0Var.f155389c = eVar2;
            p0Var.f155390d = string;
            p0Var.f155391e = str;
            p0Var.f155392f = k0Var;
            p0Var.f155393g = context;
            p0Var.f155394h = iD;
            p0Var.f155397k = 1;
            Object objG = k0Var.g(p0Var);
            if (objG == aVar) {
                return aVar;
            }
            str2 = string;
            obj = objG;
            eVar = eVar2;
            context2 = context;
            i14 = iD;
            k0Var2 = k0Var;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i17 = p0Var.f155394h;
            context = p0Var.f155393g;
            k0Var2 = p0Var.f155392f;
            str = p0Var.f155391e;
            String str3 = p0Var.f155390d;
            sz0.e eVar3 = p0Var.f155389c;
            Context context3 = p0Var.f155388b;
            k0 k0Var3 = p0Var.f155387a;
            o13.r.b(obj);
            i14 = i17;
            k0Var = k0Var3;
            context2 = context3;
            str2 = str3;
            eVar = eVar3;
        }
        String str4 = str;
        k0Var2.getClass();
        PendingIntent pendingIntentC = j.c(context, (Intent) obj);
        k0Var.getClass();
        j.e(context2, eVar, i14, str2, str4, pendingIntentC);
        return Unit.INSTANCE;
    }

    @Override // n00.d
    public final void a(GarminConnectMobileApp garminConnectMobileApp, n00.c cVar, Bundle bundle) {
        boolean zG;
        garminConnectMobileApp.getClass();
        cVar.getClass();
        if (cVar == n00.c.SUBSCRIPTION_CHANGE) {
            zG = true;
        } else {
            String string = bundle.getString("subscription_group_code");
            zG = p005kotlin.jvm.internal.s.g(string, "ConnectPlus");
            if (!zG) {
                a2 a2Var = a2.SUBSCRIPTIONS;
                String strN = fb1.c.n("Invalid group code ", string);
                i2.f36769a.getClass();
                i2.a.b(a2Var, "SubscriptionCommonPushNotificationHandler", strN);
            }
        }
        if (zG) {
            int i14 = b.f155304a[cVar.ordinal()];
            if (i14 == 1) {
                a2 a2Var2 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var2, "SubscriptionCommonPushNotificationHandler", "Received subscription expiring notification.");
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new o0(bundle, this, garminConnectMobileApp, cVar, null), 3);
                return;
            }
            if (i14 == 2) {
                a2 a2Var3 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var3, "SubscriptionCommonPushNotificationHandler", "Received free trial expiring notification.");
                x53.c cVar3 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new m0(bundle, this, garminConnectMobileApp, cVar, null), 3);
                return;
            }
            if (i14 == 3) {
                h(garminConnectMobileApp, bundle, cVar);
                return;
            }
            if (i14 == 4) {
                h(garminConnectMobileApp, bundle, cVar);
                return;
            }
            if (i14 == 5) {
                a2 a2Var4 = a2.SUBSCRIPTIONS;
                i2.f36769a.getClass();
                i2.a.b(a2Var4, "SubscriptionCommonPushNotificationHandler", "Received subscription change notification.");
                x53.c cVar4 = s0.f129406a;
                ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new n0(garminConnectMobileApp, null), 3);
                return;
            }
            i2.f36769a.getClass();
            i2.a.f(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Unknown push notification type " + cVar);
        }
    }

    @Override // n00.d
    public final n00.c[] b() {
        return new n00.c[]{n00.c.SUBSCRIPTION_EXPIRING_SOON, n00.c.FREE_TRIAL_EXPIRING, n00.c.SUBSCRIPTION_PAYMENT_DECLINED, n00.c.SUBSCRIPTION_DUNNING, n00.c.SUBSCRIPTION_CHANGE};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(v13.c cVar) {
        l0 l0Var;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f155315c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f155315c = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        Object objH = l0Var.f155313a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var.f155315c;
        if (i15 == 0) {
            o13.r.b(objH);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            l0Var.f155315c = 1;
            objH = j1Var.h(l0Var);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        return new Intent("android.intent.action.VIEW", (Uri) objH);
    }

    public final void h(Context context, Bundle bundle, n00.c cVar) {
        i2.f36769a.getClass();
        i2.a.k(a2.SUBSCRIPTIONS, "SubscriptionCommonPushNotificationHandler", "Received subscription payment issue notification " + cVar + ".");
        x53.c cVar2 = s0.f129406a;
        ge1.b.T(o53.c0.a(x53.b.f189152a), null, null, new c(bundle, context, this, cVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ls00/k0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DAYS_UNTIL_EXPIRATION_KEY", "GROUP_CODE_KEY", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
