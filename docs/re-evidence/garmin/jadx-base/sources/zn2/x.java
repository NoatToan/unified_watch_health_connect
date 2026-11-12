package zn2;

import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import java.io.Serializable;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Las2/b;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "<anonymous>", "(Lo53/b0;)Las2/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider$getTransitCardBalance$2", f = "NewFitPayDeviceServiceProvider.kt", l = {262, 269, 271}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super as2.b<CurrencyValue>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public as2.g f205922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f205923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f205925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f205926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f205927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, String str, boolean z14, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f205925d = tVar;
        this.f205926e = str;
        this.f205927f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f205925d, this.f205926e, this.f205927f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super as2.b<CurrencyValue>> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:15:0x002c, B:40:0x0092, B:43:0x00b2), top: B:58:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r2.c().compareTo((org.joda.time.ReadableInstant) org.joda.time.DateTime.now().minusMillis(30000)) > 0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        as2.g gVar;
        as2.g gVar2;
        Throwable th3;
        as2.g gVar3;
        Object objE0;
        Object obj2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205924c;
        boolean z14 = this.f205927f;
        String str = this.f205926e;
        t tVar = this.f205925d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                g1 g1Var = tVar.f205817c.f205979a;
                this.f205924c = 1;
                g1Var.getClass();
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new f2(g1Var, str, null), this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f205923b;
                    gVar2 = this.f205922a;
                    try {
                        o13.r.b(obj);
                        return (as2.b) obj2;
                    } catch (Throwable th4) {
                        th3 = th4;
                        if (!z14) {
                            throw th3;
                        }
                        if (gVar2 != null) {
                            return gVar2.d();
                        }
                        return null;
                    }
                }
                gVar3 = this.f205922a;
                try {
                    o13.r.b(obj);
                    g1 g1Var2 = tVar.f205817c.f205979a;
                    this.f205922a = gVar3;
                    this.f205923b = obj;
                    this.f205924c = 3;
                    g1Var2.getClass();
                    x53.c cVar2 = o53.s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new l3(g1Var2, str, (as2.b) obj, null), this);
                    if (objE0 == aVar) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 != aVar) {
                        gVar2 = gVar3;
                        obj2 = obj;
                        return (as2.b) obj2;
                    }
                    return aVar;
                } catch (Throwable th5) {
                    th3 = th5;
                    gVar2 = gVar3;
                    if (!z14) {
                        throw th3;
                    }
                    if (gVar2 != null) {
                        return gVar2.d();
                    }
                    return null;
                }
            }
            o13.r.b(obj);
            if (gVar == null) {
                throw new ns2.d("Cannot load card from cache ID of which is " + str + ".");
            }
            this.f205922a = gVar;
            this.f205924c = 2;
            Serializable serializableF = t.f(tVar, gVar, this);
            if (serializableF != aVar) {
                gVar3 = gVar;
                obj = serializableF;
                g1 g1Var3 = tVar.f205817c.f205979a;
                this.f205922a = gVar3;
                this.f205923b = obj;
                this.f205924c = 3;
                g1Var3.getClass();
                x53.c cVar3 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new l3(g1Var3, str, (as2.b) obj, null), this);
                if (objE0 == aVar) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != aVar) {
                    gVar2 = gVar3;
                    obj2 = obj;
                    return (as2.b) obj2;
                }
            }
            return aVar;
        } catch (Throwable th6) {
            gVar2 = gVar;
            th3 = th6;
            if (!z14) {
                throw th3;
            }
            if (gVar2 != null) {
                return gVar2.d();
            }
            return null;
        }
        gVar = (as2.g) obj;
        if (z14) {
            if (gVar != null) {
                Logger logger = t.f205814n;
                tVar.getClass();
                as2.b bVarD = gVar.d();
                if (bVarD != null) {
                }
            }
            if (gVar != null) {
                return gVar.d();
            }
            return null;
        }
    }
}
