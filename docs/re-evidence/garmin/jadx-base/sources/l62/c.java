package l62;

import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.reschedule.RescheduleSTPViewModel$rescheduleWorkout$1", f = "RescheduleSTPViewModel.kt", l = {69, 70, 71, 77, 80, 81}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f110537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f110538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f110539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f110540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f110541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f110542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f110543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, long j8, long j14, long j15, e23.a<Unit> aVar, t13.d<? super c> dVar2) {
        super(2, dVar2);
        this.f110539c = dVar;
        this.f110540d = j8;
        this.f110541e = j14;
        this.f110542f = j15;
        this.f110543g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f110539c, this.f110540d, this.f110541e, this.f110542f, this.f110543g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[PHI: r10 r12
      0x0078: PHI (r10v2 l62.c) = (r10v1 l62.c), (r10v3 l62.c) binds: [B:19:0x0075, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0078: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:19:0x0075, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[PHI: r1 r10
      0x00a8: PHI (r1v7 boolean) = (r1v5 boolean), (r1v9 boolean) binds: [B:28:0x00a5, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r10v6 l62.c) = (r10v2 l62.c), (r10v7 l62.c) binds: [B:28:0x00a5, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008e, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b6, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r0) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110538b;
        d dVar = this.f110539c;
        switch (i14) {
            case 0:
                r.b(obj);
                p2 p2Var = dVar.f110547d;
                Boolean bool = Boolean.TRUE;
                this.f110538b = 1;
                p2Var.k(null, bool);
                if (Unit.INSTANCE != aVar) {
                    p2 p2Var2 = dVar.f110549f;
                    Boolean bool2 = Boolean.FALSE;
                    this.f110538b = 2;
                    p2Var2.k(null, bool2);
                    if (Unit.INSTANCE == aVar) {
                        o52.e eVar = dVar.f110544a;
                        String string = new DateTime(this.f110542f, DateTimeZone.UTC).toString("yyyy-MM-dd");
                        string.getClass();
                        this.f110538b = 3;
                        cVar = this;
                        obj = eVar.v(this.f110540d, this.f110541e, string, cVar);
                        if (obj != aVar) {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            if (!zBooleanValue) {
                                p2 p2Var3 = dVar.f110547d;
                                Boolean bool3 = Boolean.FALSE;
                                cVar.f110537a = zBooleanValue;
                                cVar.f110538b = 5;
                                p2Var3.k(null, bool3);
                                if (Unit.INSTANCE != aVar) {
                                    p2 p2Var4 = dVar.f110549f;
                                    Boolean bool4 = Boolean.TRUE;
                                    cVar.f110537a = zBooleanValue;
                                    cVar.f110538b = 6;
                                    p2Var4.k(null, bool4);
                                }
                            } else {
                                p2 p2Var5 = dVar.f110547d;
                                Boolean bool5 = Boolean.FALSE;
                                cVar.f110537a = zBooleanValue;
                                cVar.f110538b = 4;
                                p2Var5.k(null, bool5);
                            }
                        }
                        break;
                    }
                    return aVar;
                }
                return aVar;
            case 1:
                r.b(obj);
                p2 p2Var6 = dVar.f110549f;
                Boolean bool6 = Boolean.FALSE;
                this.f110538b = 2;
                p2Var6.k(null, bool6);
                if (Unit.INSTANCE == aVar) {
                    o52.e eVar2 = dVar.f110544a;
                    String string2 = new DateTime(this.f110542f, DateTimeZone.UTC).toString("yyyy-MM-dd");
                    string2.getClass();
                    this.f110538b = 3;
                    cVar = this;
                    obj = eVar2.v(this.f110540d, this.f110541e, string2, cVar);
                    if (obj != aVar) {
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!zBooleanValue) {
                            p2 p2Var7 = dVar.f110547d;
                            Boolean bool7 = Boolean.FALSE;
                            cVar.f110537a = zBooleanValue;
                            cVar.f110538b = 5;
                            p2Var7.k(null, bool7);
                            if (Unit.INSTANCE != aVar) {
                                p2 p2Var8 = dVar.f110549f;
                                Boolean bool8 = Boolean.TRUE;
                                cVar.f110537a = zBooleanValue;
                                cVar.f110538b = 6;
                                p2Var8.k(null, bool8);
                            }
                        } else {
                            p2 p2Var9 = dVar.f110547d;
                            Boolean bool9 = Boolean.FALSE;
                            cVar.f110537a = zBooleanValue;
                            cVar.f110538b = 4;
                            p2Var9.k(null, bool9);
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                o52.e eVar3 = dVar.f110544a;
                String string3 = new DateTime(this.f110542f, DateTimeZone.UTC).toString("yyyy-MM-dd");
                string3.getClass();
                this.f110538b = 3;
                cVar = this;
                obj = eVar3.v(this.f110540d, this.f110541e, string3, cVar);
                if (obj != aVar) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (!zBooleanValue) {
                        p2 p2Var10 = dVar.f110547d;
                        Boolean bool10 = Boolean.FALSE;
                        cVar.f110537a = zBooleanValue;
                        cVar.f110538b = 5;
                        p2Var10.k(null, bool10);
                        if (Unit.INSTANCE != aVar) {
                            p2 p2Var11 = dVar.f110549f;
                            Boolean bool11 = Boolean.TRUE;
                            cVar.f110537a = zBooleanValue;
                            cVar.f110538b = 6;
                            p2Var11.k(null, bool11);
                        }
                    } else {
                        p2 p2Var12 = dVar.f110547d;
                        Boolean bool12 = Boolean.FALSE;
                        cVar.f110537a = zBooleanValue;
                        cVar.f110538b = 4;
                        p2Var12.k(null, bool12);
                    }
                    break;
                }
                return aVar;
            case 3:
                r.b(obj);
                cVar = this;
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                    p2 p2Var13 = dVar.f110547d;
                    Boolean bool13 = Boolean.FALSE;
                    cVar.f110537a = zBooleanValue;
                    cVar.f110538b = 4;
                    p2Var13.k(null, bool13);
                    break;
                } else {
                    p2 p2Var14 = dVar.f110547d;
                    Boolean bool14 = Boolean.FALSE;
                    cVar.f110537a = zBooleanValue;
                    cVar.f110538b = 5;
                    p2Var14.k(null, bool14);
                    if (Unit.INSTANCE != aVar) {
                        p2 p2Var15 = dVar.f110549f;
                        Boolean bool15 = Boolean.TRUE;
                        cVar.f110537a = zBooleanValue;
                        cVar.f110538b = 6;
                        p2Var15.k(null, bool15);
                    }
                    break;
                }
                return aVar;
            case 4:
                r.b(obj);
                cVar = this;
                cVar.f110543g.invoke();
                return Unit.INSTANCE;
            case 5:
                zBooleanValue = this.f110537a;
                r.b(obj);
                cVar = this;
                p2 p2Var16 = dVar.f110549f;
                Boolean bool16 = Boolean.TRUE;
                cVar.f110537a = zBooleanValue;
                cVar.f110538b = 6;
                p2Var16.k(null, bool16);
                break;
            case 6:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
