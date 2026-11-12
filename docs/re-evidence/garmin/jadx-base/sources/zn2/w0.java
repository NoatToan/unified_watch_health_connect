package zn2;

import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayPushNotificationHandler$handlePushNotificationImpl$1", f = "NewFitPayPushNotificationHandler.kt", l = {233, 128}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f205905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f205906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v0 f205907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f205908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f205910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f205911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f205912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f205913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v0 f205914j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Map<String, String> map, v0 v0Var, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f205913i = map;
        this.f205914j = v0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        w0 w0Var = new w0(this.f205913i, this.f205914j, dVar);
        w0Var.f205912h = obj;
        return w0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0105 A[Catch: all -> 0x0021, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:53:0x00f9, B:56:0x0105, B:59:0x0112, B:61:0x0118, B:63:0x0120, B:64:0x0126, B:41:0x00c9, B:43:0x00d2, B:46:0x00d8, B:48:0x00ee, B:49:0x00f1), top: B:76:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0112 A[Catch: all -> 0x0021, LOOP:0: B:59:0x0112->B:82:0x0112, LOOP_START, TRY_ENTER, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:53:0x00f9, B:56:0x0105, B:59:0x0112, B:61:0x0118, B:63:0x0120, B:64:0x0126, B:41:0x00c9, B:43:0x00d2, B:46:0x00d8, B:48:0x00ee, B:49:0x00f1), top: B:76:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0118 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:7:0x001c, B:53:0x00f9, B:56:0x0105, B:59:0x0112, B:61:0x0118, B:63:0x0120, B:64:0x0126, B:41:0x00c9, B:43:0x00d2, B:46:0x00d8, B:48:0x00ee, B:49:0x00f1), top: B:76:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0112 A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14;
        int i15;
        Map<String, String> map;
        v0 v0Var;
        z53.a aVar;
        z0 z0Var;
        int i16;
        z0 z0Var2;
        boolean zBooleanValue;
        LinkedBlockingDeque linkedBlockingDeque;
        Map<String, String> map2;
        Map<String, String> map3 = this.f205913i;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i17 = this.f205911g;
        try {
            if (i17 != 0) {
                if (i17 == 1) {
                    int i18 = this.f205910f;
                    int i19 = this.f205909e;
                    map = this.f205908d;
                    v0 v0Var2 = this.f205907c;
                    z53.a aVar3 = this.f205906b;
                    z0Var = this.f205905a;
                    o13.r.b(obj);
                    i16 = i18;
                    v0Var = v0Var2;
                    i15 = i19;
                    aVar = aVar3;
                } else {
                    if (i17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v0Var = this.f205907c;
                    aVar = this.f205906b;
                    z0Var2 = this.f205905a;
                    o13.r.b(obj);
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                v0Var.f205892d = false;
                linkedBlockingDeque = v0Var.f205890b;
                if (!zBooleanValue) {
                    v0.f205887h.error("handlePushNotification: failed to wake up fitpay, can not deliver pushnotification");
                    Unit unit = Unit.INSTANCE;
                    aVar.e(null);
                    return unit;
                }
                while (linkedBlockingDeque.size() > 0) {
                    map2 = (Map) linkedBlockingDeque.poll();
                    if (map2 != null) {
                        z0Var2.f205982d.e(map2);
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                aVar.e(null);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            try {
                String str = v0.f205888i;
                String str2 = map3.get(str);
                if (str2 == null) {
                    v0.f205887h.error("handlePushNotification: " + str + " is empty: " + map3);
                    return Unit.INSTANCE;
                }
                to2.c cVarValueOf = to2.c.valueOf(str2);
                v0 v0Var3 = this.f205914j;
                to2.c[] cVarArr = v0Var3.f205894f;
                int length = cVarArr.length;
                int i24 = 0;
                while (true) {
                    if (i24 >= length) {
                        i14 = 0;
                        break;
                    }
                    if (cVarArr[i24] == cVarValueOf) {
                        i14 = 1;
                        break;
                    }
                    i24++;
                }
                i15 = i14 ^ 1;
                if (i14 == 0) {
                    ms2.g gVarA = ps2.w.f140538a.a(is2.b.FITPAY);
                    if (!(gVarA instanceof z0)) {
                        gVarA = null;
                    }
                    z0 z0Var3 = (z0) gVarA;
                    if (z0Var3 == null) {
                        v0.f205887h.error("handlePushNotification: failed to get NewFitPayServiceProvider to handle push notification " + map3);
                        return Unit.INSTANCE;
                    }
                    z53.b bVar = v0Var3.f205893e;
                    this.f205912h = null;
                    this.f205905a = z0Var3;
                    this.f205906b = bVar;
                    this.f205907c = v0Var3;
                    this.f205908d = map3;
                    this.f205909e = i15;
                    this.f205910f = 0;
                    this.f205911g = 1;
                    if (bVar.c(this) != aVar2) {
                        map = map3;
                        v0Var = v0Var3;
                        aVar = bVar;
                        z0Var = z0Var3;
                        i16 = 0;
                    }
                    return aVar2;
                }
                try {
                    new go2.b(cVarValueOf, map3).a(new z10.d(15, map3, v0Var3));
                } catch (Exception e4) {
                    v0.f205887h.error("handlePushNotification: can not handle pushNotif " + cVarValueOf, (Throwable) e4);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            } catch (Exception unused) {
                v0.f205887h.error("handlePushNotification: Cannot find UserEventsType: " + map3);
                return Unit.INSTANCE;
            }
            v0Var.f205890b.add(map);
            if (v0Var.f205892d) {
                Unit unit3 = Unit.INSTANCE;
                aVar.e(null);
                return unit3;
            }
            v0Var.f205892d = true;
            this.f205912h = null;
            this.f205905a = z0Var;
            this.f205906b = aVar;
            this.f205907c = v0Var;
            this.f205908d = null;
            this.f205909e = i15;
            this.f205910f = i16;
            this.f205911g = 2;
            obj = z0Var.f205983e ? Boolean.TRUE : z0Var.r(false, this);
            if (obj != aVar2) {
                z0Var2 = z0Var;
                zBooleanValue = ((Boolean) obj).booleanValue();
                v0Var.f205892d = false;
                linkedBlockingDeque = v0Var.f205890b;
                if (!zBooleanValue) {
                    v0.f205887h.error("handlePushNotification: failed to wake up fitpay, can not deliver pushnotification");
                    Unit unit4 = Unit.INSTANCE;
                    aVar.e(null);
                    return unit4;
                }
                while (linkedBlockingDeque.size() > 0) {
                    map2 = (Map) linkedBlockingDeque.poll();
                    if (map2 != null) {
                        z0Var2.f205982d.e(map2);
                    }
                }
                Unit unit5 = Unit.INSTANCE;
                aVar.e(null);
                return Unit.INSTANCE;
            }
            return aVar2;
        } catch (Throwable th3) {
            "handlePushNotification: ".e(null);
            throw th3;
        }
    }
}
