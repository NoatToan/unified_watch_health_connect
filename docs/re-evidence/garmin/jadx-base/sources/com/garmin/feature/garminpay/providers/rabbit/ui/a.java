package com.garmin.feature.garminpay.providers.rabbit.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import com.garmin.garminpay.wallet.exception.ExpressCardSettingException;
import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import ps2.g;
import ps2.n;
import ps2.w;
import v13.i;
import vb.h;
import wr2.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\rJ\u0010\u0010\u001f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001f\u0010\rJ\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000eH\u0096@¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010\"\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/garmin/feature/garminpay/providers/rabbit/ui/a;", "Lsy2/a;", "Lqq2/a;", "Lcom/garmin/feature/garminpay/providers/rabbit/ui/IRabbitCardDetailModel;", "", "cardNumber", "Lsd2/f;", "device", "<init>", "(Ljava/lang/String;Lsd2/f;)V", "Lo13/q;", "", "P0", "(Lt13/d;)Ljava/lang/Object;", "", "isActive", "R0", "(ZLt13/d;)Ljava/lang/Object;", "Q0", "(Z)V", "Lcom/garmin/device/nfc/b;", "card", "S0", "(Lcom/garmin/device/nfc/b;)V", "Landroid/content/Intent;", "intent", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "u", "(Landroid/content/Intent;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Loq2/a;", "Z", "q0", "enabled", "w", "i0", "c", "Ljava/lang/String;", "n0", "()Ljava/lang/String;", "d", "Lsd2/f;", "getDevice", "()Lsd2/f;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends sy2.a<qq2.a> implements IRabbitCardDetailModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51755e = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cardNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sd2.f device;

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel", f = "RabbitCardDetailModel.kt", l = {95}, m = "removeExpressTransitIfNecessary-IoAF18A", v = 2)
    public static final class C1074a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f51758a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51760c;

        public C1074a(t13.d<? super C1074a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f51758a = obj;
            this.f51760c |= Integer.MIN_VALUE;
            Object objP0 = a.this.P0(this);
            return objP0 == u13.a.COROUTINE_SUSPENDED ? objP0 : q.a(objP0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel$removeExpressTransitIfNecessary$2", f = "RabbitCardDetailModel.kt", l = {98, 100}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super q<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f51761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f51764d;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = a.this.new b(dVar);
            bVar.f51764d = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super q<? extends Unit>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        
            if (w2.a0.g(r4, r8) == r0) goto L26;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object bVar;
            Throwable thB;
            n nVar;
            int i14;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f51763c;
            a aVar2 = a.this;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        i14 = this.f51762b;
                        nVar = this.f51761a;
                        r.b(obj);
                    } else {
                        if (i15 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    bVar = Unit.INSTANCE;
                    int i16 = q.f128596b;
                    thB = q.b(bVar);
                    if (thB != null) {
                        return q.a(bVar);
                    }
                    if (thB instanceof ExpressCardSettingException) {
                        throw thB;
                    }
                    throw new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, a0.f(aVar2.getDevice().getUnitID(), "Error with device(", ")"), thB);
                }
                r.b(obj);
                int i17 = q.f128596b;
                w wVar = w.f140538a;
                long unitID = aVar2.getDevice().getUnitID();
                wVar.getClass();
                n nVarI = w.i(unitID);
                nVarI.getClass();
                e13.b bVarA = nVarI.a();
                this.f51764d = null;
                this.f51761a = nVarI;
                this.f51762b = 0;
                this.f51763c = 1;
                Object objF = w2.a0.f(bVarA, this);
                if (objF != aVar) {
                    nVar = nVarI;
                    obj = objF;
                    i14 = 0;
                }
                return aVar;
                hs2.c cVar = (hs2.c) ((Optional) obj).orNull();
                if (cVar != null && cVar.f85442b.equals(qs2.a.f147387p.f147399d)) {
                    nVar.getClass();
                    g gVar = new g(nVar, 2);
                    int i18 = w03.b.f181178a;
                    z03.d dVar = new z03.d(gVar);
                    this.f51764d = null;
                    this.f51761a = null;
                    this.f51762b = i14;
                    this.f51763c = 2;
                }
                bVar = Unit.INSTANCE;
                int i19 = q.f128596b;
            } catch (Throwable th3) {
                int i24 = q.f128596b;
                bVar = new q.b(th3);
            }
            thB = q.b(bVar);
            if (thB != null) {
                return q.a(bVar);
            }
            if (thB instanceof ExpressCardSettingException) {
                throw thB;
            }
            throw new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, a0.f(aVar2.getDevice().getUnitID(), "Error with device(", ")"), thB);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel$setCardEnabledOnDevice$2", f = "RabbitCardDetailModel.kt", l = {66, 68}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f51766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f51767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f51770e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f51772g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z14, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f51772g = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = a.this.new c(this.f51772g, dVar);
            cVar.f51770e = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        
            if (r10 == r0) goto L27;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object bVar;
            int i14;
            boolean z14;
            a aVar;
            Object objR0;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f51769d;
            boolean z15 = this.f51772g;
            a aVar3 = a.this;
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        i14 = this.f51768c;
                        z14 = this.f51767b;
                        aVar = this.f51766a;
                        r.b(obj);
                        ((q) obj).getClass();
                    } else {
                        if (i15 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                        objR0 = ((q) obj).f128597a;
                    }
                    bVar = q.a(objR0);
                    if (!(bVar instanceof q.b)) {
                        aVar3.Q0(z15);
                    }
                    Throwable thB = q.b(bVar);
                    if (thB == null) {
                        return Unit.INSTANCE;
                    }
                    throw thB;
                }
                r.b(obj);
                int i16 = q.f128596b;
                w wVar = w.f140538a;
                long unitID = aVar3.getDevice().getUnitID();
                wVar.getClass();
                n nVarI = w.i(unitID);
                nVarI.getClass();
                if (nVarI.f140499b.q() == hs2.g.DISCONNECTED) {
                    throw new ExpressCardSettingException(ExpressCardSettingException.a.DEVICE_NOT_CONNECTED, "Device is not connected");
                }
                i14 = 0;
                if (!z15) {
                    this.f51770e = null;
                    this.f51766a = aVar3;
                    this.f51767b = z15;
                    this.f51768c = 0;
                    this.f51769d = 1;
                    if (aVar3.P0(this) == aVar2) {
                    }
                    return aVar2;
                }
                z14 = z15;
                aVar = aVar3;
                this.f51770e = null;
                this.f51766a = null;
                this.f51768c = i14;
                this.f51769d = 2;
                objR0 = aVar.R0(z14, this);
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel$setRabbitAsExpressTransit$2", f = "RabbitCardDetailModel.kt", l = {86}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f51774b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = a.this.new d(dVar);
            dVar2.f51774b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51773a;
            a aVar2 = a.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    int i15 = q.f128596b;
                    GarminPayCoreDatabase.b bVar2 = GarminPayCoreDatabase.f52316a;
                    Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                    bVar2.getClass();
                    fs2.a aVar3 = (fs2.a) h0.I0(GarminPayCoreDatabase.b.a(contextC).e().j(aVar2.getDevice().getUnitID(), "RABBIT"));
                    w wVar = w.f140538a;
                    long unitID = aVar2.getDevice().getUnitID();
                    wVar.getClass();
                    n nVarI = w.i(unitID);
                    nVarI.getClass();
                    if (!g22.n.d(aVar3.f73434i)) {
                        throw new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, "Card Id is empty or null");
                    }
                    byte[] bArrDecode = Base64.decode(aVar3.f73434i, 0);
                    bArrDecode.getClass();
                    z03.d dVarP = nVarI.p(bArrDecode, qs2.a.f147387p.f147399d, Float.POSITIVE_INFINITY);
                    this.f51774b = null;
                    this.f51773a = 1;
                    if (w2.a0.g(dVarP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = Unit.INSTANCE;
                int i16 = q.f128596b;
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
            Throwable thB = q.b(bVar);
            if (thB == null) {
                return Unit.INSTANCE;
            }
            if (thB instanceof ExpressCardSettingException) {
                throw thB;
            }
            throw new ExpressCardSettingException(ExpressCardSettingException.a.GENERAL_ERROR, a0.f(aVar2.getDevice().getUnitID(), "Error with device(", ")"), thB);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel", f = "RabbitCardDetailModel.kt", l = {111}, m = "updateCard-gIAlu-s", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f51776a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51778c;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f51776a = obj;
            this.f51778c |= Integer.MIN_VALUE;
            Object objR0 = a.this.R0(false, this);
            return objR0 == u13.a.COROUTINE_SUSPENDED ? objR0 : q.a(objR0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel$updateCard$2", f = "RabbitCardDetailModel.kt", l = {125}, m = "invokeSuspend", v = 2)
    public static final class f extends i implements p<b0, t13.d<? super q<? extends Boolean>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f51780b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f51782d;

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.rabbit.ui.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)Z"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.rabbit.ui.RabbitCardDetailModel$updateCard$2$1$1$1", f = "RabbitCardDetailModel.kt", l = {125}, m = "invokeSuspend", v = 2)
        public static final class C1075a extends i implements p<wl2.b, t13.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f51784b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.garmin.device.nfc.h[] f51785c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1075a(com.garmin.device.nfc.h[] hVarArr, t13.d<? super C1075a> dVar) {
                super(2, dVar);
                this.f51785c = hVarArr;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                C1075a c1075a = new C1075a(this.f51785c, dVar);
                c1075a.f51784b = obj;
                return c1075a;
            }

            @Override // e23.p
            public final Object invoke(wl2.b bVar, t13.d<? super Boolean> dVar) {
                return ((C1075a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                wl2.b bVar = (wl2.b) this.f51784b;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51783a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                com.garmin.device.nfc.h[] hVarArr = this.f51785c;
                hVarArr.getClass();
                int i15 = wl2.b.f186020p;
                ListenableFuture<Boolean> listenableFutureN = bVar.n(hVarArr, 0L);
                this.f51784b = null;
                this.f51783a = 1;
                Object objB = t53.c.b(listenableFutureN, this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z14, t13.d<? super f> dVar) {
            super(2, dVar);
            this.f51782d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            f fVar = a.this.new f(this.f51782d, dVar);
            fVar.f51780b = obj;
            return fVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super q<? extends Boolean>> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003f  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object bVar;
            ms2.d dVarG;
            byte[] bArr;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51779a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    w wVar = w.f140538a;
                    a aVar2 = a.this;
                    long unitID = aVar2.getDevice().getUnitID();
                    is2.b bVar2 = is2.b.RABBIT;
                    wVar.getClass();
                    n nVarI = w.i(unitID);
                    if (nVarI != null) {
                        dVarG = nVarI.g(bVar2);
                        if (!(dVarG instanceof oq2.c)) {
                            dVarG = null;
                        }
                    } else {
                        dVarG = null;
                    }
                    dVarG.getClass();
                    oq2.c cVar = (oq2.c) dVarG;
                    com.garmin.device.nfc.b bVar3 = cVar.f133312f;
                    if (bVar3 == null) {
                        h.z("There should be a card in rabbit device service provider");
                        return null;
                    }
                    com.garmin.device.nfc.b bVarClone = bVar3.clone();
                    aVar2.S0(bVarClone);
                    bVarClone.f50855h = null;
                    if (this.f51782d) {
                        oq2.b.f133301a.getClass();
                        bArr = oq2.b.f133302b;
                    } else {
                        oq2.b.f133301a.getClass();
                        bArr = oq2.b.f133303c;
                    }
                    if (bArr != null) {
                        bVarClone.f50858k = Arrays.copyOf(bArr, bArr.length);
                    } else {
                        bVarClone.f50858k = null;
                    }
                    k kVar = k.f186863a;
                    byte[] bArr2 = bVarClone.f50850c;
                    bArr2.getClass();
                    String str = new String(bArr2, d53.c.f57666b);
                    qs2.a aVar3 = qs2.a.f147387p;
                    byte[] bArr3 = bVarClone.f50854g;
                    bArr3.getClass();
                    byte[] bArr4 = bVarClone.f50858k;
                    bArr4.getClass();
                    byte bD = u.D(bArr4);
                    kVar.getClass();
                    byte[] bArrA = k.a(str, aVar3, bArr3, bD);
                    bVarClone.f50856i = Arrays.copyOf(bArrA, bArrA.length);
                    ArrayList arrayList = new ArrayList();
                    if (bVarClone.f50848a != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_TYPE, bVarClone.f50848a));
                    }
                    if (bVarClone.f50849b != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_ISSUER_NAME, bVarClone.f50849b));
                    }
                    if (bVarClone.f50850c != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_DESCRIPTION, bVarClone.f50850c));
                    }
                    if (bVarClone.f50851d != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_PAN, bVarClone.f50851d));
                    }
                    if (bVarClone.f50852e != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_EXP_MONTH, bVarClone.f50852e));
                    }
                    if (bVarClone.f50853f != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_EXP_YEAR, bVarClone.f50853f));
                    }
                    if (bVarClone.f50854g != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_TOP_OF_WALLET_APDU, bVarClone.f50854g));
                    }
                    if (bVarClone.f50855h != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_IMAGE_HASH, bVarClone.f50855h));
                    }
                    if (bVarClone.f50856i != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CREDIT_CARD_HASH, bVarClone.f50856i));
                    }
                    if (bVarClone.f50857j != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CREDIT_CARD_ID, bVarClone.f50857j));
                    }
                    if (bVarClone.f50858k != null) {
                        arrayList.add(new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_ACTIVE, bVarClone.f50858k));
                    }
                    com.garmin.device.nfc.h[] hVarArr = (com.garmin.device.nfc.h[]) arrayList.toArray(new com.garmin.device.nfc.h[0]);
                    int i15 = q.f128596b;
                    hs2.d dVar = cVar.f133308b;
                    C1075a c1075a = new C1075a(hVarArr, null);
                    this.f51780b = null;
                    this.f51779a = 1;
                    obj = ks2.e.d(dVar, c1075a, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                bVar = (Boolean) obj;
                bVar.getClass();
                int i16 = q.f128596b;
            } catch (Throwable th3) {
                int i17 = q.f128596b;
                bVar = new q.b(th3);
            }
            if (!(bVar instanceof q.b) && !((Boolean) bVar).booleanValue()) {
                throw new IRabbitCardDetailModel.OperateRabbitCardException();
            }
            Throwable thB = q.b(bVar);
            if (thB == null) {
                return q.a(bVar);
            }
            if (thB instanceof NfcTransferCoroutineException) {
                throw thB;
            }
            throw new IRabbitCardDetailModel.OperateRabbitCardException(thB);
        }
    }

    public a(String str, sd2.f fVar) {
        str.getClass();
        fVar.getClass();
        this.cardNumber = str;
        this.device = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(t13.d<? super q<Unit>> dVar) throws Throwable {
        C1074a c1074a;
        if (dVar instanceof C1074a) {
            c1074a = (C1074a) dVar;
            int i14 = c1074a.f51760c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1074a.f51760c = i14 - Integer.MIN_VALUE;
            } else {
                c1074a = new C1074a(dVar);
            }
        } else {
            c1074a = new C1074a(dVar);
        }
        Object objE0 = c1074a.f51758a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1074a.f51760c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            b bVar2 = new b(null);
            c1074a.f51760c = 1;
            objE0 = ge1.b.e0(bVar, bVar2, c1074a);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((q) objE0).f128597a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final void Q0(boolean isActive) {
        ms2.d dVarG;
        byte[] bArr;
        w wVar = w.f140538a;
        long unitID = getDevice().getUnitID();
        is2.b bVar = is2.b.RABBIT;
        wVar.getClass();
        n nVarI = w.i(unitID);
        if (nVarI != null) {
            dVarG = nVarI.g(bVar);
            if (!(dVarG instanceof oq2.c)) {
                dVarG = null;
            }
        } else {
            dVarG = null;
        }
        dVarG.getClass();
        oq2.c cVar = (oq2.c) dVarG;
        es2.a aVar = cVar.f133310d;
        try {
            com.garmin.device.nfc.b bVar2 = cVar.f133312f;
            bVar2.getClass();
            if (isActive) {
                oq2.b.f133301a.getClass();
                bArr = oq2.b.f133302b;
            } else {
                oq2.b.f133301a.getClass();
                bArr = oq2.b.f133303c;
            }
            if (bArr != null) {
                bVar2.f50858k = Arrays.copyOf(bArr, bArr.length);
            } else {
                bVar2.f50858k = null;
            }
            fs2.a aVar2 = (fs2.a) h0.I0(aVar.j(cVar.f133308b.getF99647a(), cVar.f133307a.name()));
            aVar2.f73433h = isActive ? qs2.f.ACTIVE : qs2.f.DISABLED;
            aVar.d(aVar2);
        } catch (Exception e4) {
            oq2.c.f133306g.error("Failed to update card active", (Throwable) e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R0(boolean z14, t13.d<? super q<Boolean>> dVar) throws Throwable {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i14 = eVar.f51778c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f51778c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objE0 = eVar.f51776a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f51778c;
        if (i15 == 0) {
            r.b(objE0);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            f fVar = new f(z14, null);
            eVar.f51778c = 1;
            objE0 = ge1.b.e0(bVar, fVar, eVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        return ((q) objE0).f128597a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(com.garmin.device.nfc.b card) {
        byte[] bArr = card.f50857j;
        if (bArr != null) {
            bArr.getClass();
            if (!(bArr.length == 0)) {
                byte[] bArr2 = card.f50848a;
                if (bArr2 != null) {
                    bArr2.getClass();
                    if (!(bArr2.length == 0)) {
                        byte[] bArr3 = card.f50856i;
                        if (bArr3 != null) {
                            bArr3.getClass();
                            if (!(bArr3.length == 0)) {
                                byte[] bArr4 = card.f50858k;
                                if (bArr4 != null) {
                                    bArr4.getClass();
                                    if (!(bArr4.length == 0)) {
                                        byte[] bArr5 = card.f50849b;
                                        if (bArr5 != null) {
                                            bArr5.getClass();
                                            if (!(bArr5.length == 0)) {
                                                byte[] bArr6 = card.f50850c;
                                                if (bArr6 != null) {
                                                    bArr6.getClass();
                                                    if (!(bArr6.length == 0)) {
                                                        byte[] bArr7 = card.f50854g;
                                                        if (bArr7 != null) {
                                                            bArr7.getClass();
                                                            if (!(bArr7.length == 0)) {
                                                                return;
                                                            }
                                                        }
                                                        h.s("Rabbit Top Of Wallet is empty");
                                                        return;
                                                    }
                                                }
                                                h.s("Rabbit Description is empty");
                                                return;
                                            }
                                        }
                                        h.s("Rabbit Issuer Name is empty");
                                        return;
                                    }
                                }
                                h.s("Rabbit Card Active is empty");
                                return;
                            }
                        }
                        h.s("Rabbit Card Hash is empty");
                        return;
                    }
                }
                h.s("Rabbit Card Type is empty");
                return;
            }
        }
        h.s("Rabbit Card Id is empty");
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public Object Z(t13.d<? super oq2.a> dVar) {
        zf.b.r();
        return GsonUtil.f47253b.fromJson(gh2.i.f77458c.a().f77477b.h("garminpay_rabbit_app_info"), oq2.a.class);
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public sd2.f getDevice() {
        return this.device;
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public Object i0(t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new d(null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    /* JADX INFO: renamed from: n0, reason: from getter */
    public String getCardNumber() {
        return this.cardNumber;
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public Object q0(t13.d<? super Boolean> dVar) throws IRabbitCardDetailModel.DeviceNotSupportException {
        w wVar = w.f140538a;
        long unitID = getDevice().getUnitID();
        is2.b bVar = is2.b.RABBIT;
        wVar.getClass();
        n nVarI = w.i(unitID);
        ms2.d dVar2 = null;
        if (nVarI != null) {
            ms2.d dVarG = nVarI.g(bVar);
            if (dVarG instanceof oq2.c) {
                dVar2 = dVarG;
            }
        }
        dVar2.getClass();
        com.garmin.device.nfc.b bVar2 = ((oq2.c) dVar2).f133312f;
        if (bVar2 == null || bVar2.f50858k == null) {
            throw new IRabbitCardDetailModel.DeviceNotSupportException();
        }
        oq2.b.f133301a.getClass();
        return Boolean.valueOf(Arrays.equals(oq2.b.f133302b, bVar2.f50858k));
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public Object u(Intent intent, String str, t13.d<? super Boolean> dVar) {
        boolean z14 = false;
        List<ResolveInfo> listQueryIntentActivities = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getPackageManager().queryIntentActivities(intent, 0);
        listQueryIntentActivities.getClass();
        if (!listQueryIntentActivities.isEmpty()) {
            Iterator<T> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (s.g(((ResolveInfo) it.next()).activityInfo.packageName, str)) {
                    z14 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z14);
    }

    @Override // com.garmin.feature.garminpay.providers.rabbit.ui.IRabbitCardDetailModel
    public Object w(boolean z14, t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new c(z14, null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }
}
