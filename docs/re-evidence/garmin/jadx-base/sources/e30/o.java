package e30;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lw20/e;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.details.GetCoursePowerGuideUseCase$invoke$1", f = "GetCoursePowerGuideUseCase.kt", l = {22, 24, 25, 32, 35, 38}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<r53.j<? super w20.e>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ab1.g f62704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f62706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f62707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f62708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f62709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, boolean z14, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f62707d = pVar;
        this.f62708e = str;
        this.f62709f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f62707d, this.f62708e, this.f62709f, dVar);
        oVar.f62706c = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super w20.e> jVar, t13.d<? super Unit> dVar) {
        return ((o) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[PHI: r2 r10
      0x006f: PHI (r2v5 ab1.g) = (r2v4 ab1.g), (r2v6 ab1.g) binds: [B:28:0x006c, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x006f: PHI (r10v18 java.lang.Object) = (r10v17 java.lang.Object), (r10v0 java.lang.Object) binds: [B:28:0x006c, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
    
        if (r0.emit(r3, r9) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r0.emit(null, r9) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r0.emit(null, r9) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (r0.emit(null, r9) == r1) goto L41;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Long lValueOf;
        ab1.g gVar;
        r53.j jVar = (r53.j) this.f62706c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62705b;
        p pVar = this.f62707d;
        switch (i14) {
            case 0:
                o13.r.b(obj);
                int i15 = p.f62710c;
                pVar.getClass();
                String str = this.f62708e;
                if (str == null || str.length() == 0) {
                    lValueOf = null;
                } else {
                    try {
                        long j8 = Long.parseLong(str);
                        if (j8 > 0) {
                            lValueOf = Long.valueOf(j8);
                        } else {
                            lValueOf = null;
                        }
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
                if (lValueOf != null) {
                    if (this.f62709f) {
                        long jLongValue = lValueOf.longValue();
                        this.f62706c = jVar;
                        this.f62705b = 1;
                        obj = p.b(pVar, jLongValue, this);
                        if (obj != aVar) {
                            gVar = (ab1.g) obj;
                            if (gVar == null) {
                                this.f62706c = null;
                                this.f62704a = null;
                                this.f62705b = 4;
                            } else {
                                this.f62706c = jVar;
                                this.f62704a = gVar;
                                this.f62705b = 2;
                                obj = p.a(pVar, gVar, this);
                                if (obj != aVar) {
                                    w20.e eVar = new w20.e(gVar, (w01.c) obj);
                                    this.f62706c = null;
                                    this.f62704a = null;
                                    this.f62705b = 3;
                                }
                            }
                        }
                        break;
                    } else {
                        this.f62706c = null;
                        this.f62705b = 5;
                        break;
                    }
                    return aVar;
                }
                this.f62706c = null;
                this.f62705b = 6;
                break;
            case 1:
                o13.r.b(obj);
                gVar = (ab1.g) obj;
                if (gVar == null) {
                    this.f62706c = jVar;
                    this.f62704a = gVar;
                    this.f62705b = 2;
                    obj = p.a(pVar, gVar, this);
                    if (obj != aVar) {
                        w20.e eVar2 = new w20.e(gVar, (w01.c) obj);
                        this.f62706c = null;
                        this.f62704a = null;
                        this.f62705b = 3;
                    }
                    break;
                } else {
                    this.f62706c = null;
                    this.f62704a = null;
                    this.f62705b = 4;
                    break;
                }
                return aVar;
            case 2:
                gVar = this.f62704a;
                o13.r.b(obj);
                w20.e eVar3 = new w20.e(gVar, (w01.c) obj);
                this.f62706c = null;
                this.f62704a = null;
                this.f62705b = 3;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                o13.r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
