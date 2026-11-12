package zn2;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfo2/l0;", "<anonymous>", "(Lo53/b0;)Lfo2/l0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$getCredentialAndRefreshCache$2", f = "NewUserDataManager.kt", l = {1715, 398, GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE}, m = "invokeSuspend", v = 2)
public final class i2 extends v13.i implements e23.p<o53.b0, t13.d<? super fo2.l0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f205581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f205582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g1 f205583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f205585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f205586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f205587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f205588h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(g1 g1Var, String str, t13.d<? super i2> dVar) {
        super(2, dVar);
        this.f205587g = g1Var;
        this.f205588h = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i2(this.f205587g, this.f205588h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super fo2.l0> dVar) {
        return ((i2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:8:0x0019, B:28:0x008a, B:31:0x00be, B:24:0x006a), top: B:41:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [z53.a] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        ?? r14;
        z53.a aVar;
        String str;
        g1 g1Var;
        int i14;
        int i15;
        g1 g1Var2;
        Object objB;
        Object objE0;
        Object obj2;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f205586f;
        int i17 = 0;
        try {
            if (i16 == 0) {
                o13.r.b(obj);
                g1 g1Var3 = this.f205587g;
                aVar = g1Var3.f205538m;
                this.f205581a = aVar;
                str = this.f205588h;
                this.f205582b = str;
                this.f205583c = g1Var3;
                this.f205584d = 0;
                this.f205586f = 1;
                if (aVar.c(this) != aVar2) {
                    g1Var = g1Var3;
                    i14 = 0;
                }
                return aVar2;
            }
            if (i16 == 1) {
                int i18 = this.f205584d;
                g1Var = this.f205583c;
                str = (String) this.f205582b;
                z53.a aVar3 = this.f205581a;
                o13.r.b(obj);
                i14 = i18;
                aVar = aVar3;
            } else {
                if (i16 == 2) {
                    i17 = this.f205585e;
                    int i19 = this.f205584d;
                    g1 g1Var4 = (g1) this.f205582b;
                    z53.a aVar4 = this.f205581a;
                    try {
                        o13.r.b(obj);
                        g1Var2 = g1Var4;
                        i15 = i19;
                        aVar = aVar4;
                        objB = ao2.b.b((c83.a0) obj);
                        fo2.l0 l0Var = (fo2.l0) objB;
                        long j8 = g1.c(g1Var2, l0Var.getDeviceId()).f73103c;
                        List listC = p13.w.c(l0Var);
                        this.f205581a = aVar;
                        this.f205582b = objB;
                        this.f205583c = null;
                        this.f205584d = i15;
                        this.f205585e = i17;
                        this.f205586f = 3;
                        x53.c cVar = o53.s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new l1(j8, listC, g1Var2, null), this);
                        if (objE0 == aVar2) {
                            objE0 = Unit.INSTANCE;
                        }
                        if (objE0 != aVar2) {
                            obj2 = objB;
                        }
                        return aVar2;
                    } catch (Throwable th4) {
                        th3 = th4;
                        r14 = aVar4;
                        r14.e(null);
                        throw th3;
                    }
                }
                if (i16 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.f205582b;
                aVar = this.f205581a;
                o13.r.b(obj);
            }
            aVar.e(null);
            return obj2;
            u0 u0Var = u0.f205864a;
            this.f205581a = aVar;
            this.f205582b = g1Var;
            this.f205583c = null;
            this.f205584d = i14;
            this.f205585e = 0;
            this.f205586f = 2;
            u0Var.getClass();
            Object objN = u0.g().N(str, this);
            if (objN != aVar2) {
                i15 = i14;
                obj = objN;
                g1Var2 = g1Var;
                objB = ao2.b.b((c83.a0) obj);
                fo2.l0 l0Var2 = (fo2.l0) objB;
                long j14 = g1.c(g1Var2, l0Var2.getDeviceId()).f73103c;
                List listC2 = p13.w.c(l0Var2);
                this.f205581a = aVar;
                this.f205582b = objB;
                this.f205583c = null;
                this.f205584d = i15;
                this.f205585e = i17;
                this.f205586f = 3;
                x53.c cVar2 = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new l1(j14, listC2, g1Var2, null), this);
                if (objE0 == aVar2) {
                    objE0 = Unit.INSTANCE;
                }
                if (objE0 != aVar2) {
                    obj2 = objB;
                    aVar.e(null);
                    return obj2;
                }
            }
            return aVar2;
        } catch (Throwable th5) {
            th3 = th5;
            r14 = i16;
        }
    }
}
