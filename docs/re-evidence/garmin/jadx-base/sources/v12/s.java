package v12;

import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import r53.e2;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.UpdateCustomPastActivitiesPrivacyViewModel$onPrivacyChangeConfirmed$1", f = "UpdateCustomPastActivitiesPrivacyViewModel.kt", l = {51, 53, 55, 56, 59, 61}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f174805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f174806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f174807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f174808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f174810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f174811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List<ip.a> f174812h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, List<ip.a> list, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f174811g = pVar;
        this.f174812h = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f174811g, this.f174812h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d A[PHI: r1
      0x006d: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v5 java.lang.Object) binds: [B:16:0x0069, B:9:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7 A[PHI: r1
      0x00b7: PHI (r1v9 java.lang.Object) = (r1v4 java.lang.Object), (r1v6 java.lang.Object), (r1v11 java.lang.Object) binds: [B:19:0x0071, B:25:0x00b4, B:7:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r11.emit(r2, r10) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ff, code lost:
    
        if (r11.emit(r3, r10) == r0) goto L38;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objD;
        Object obj2;
        boolean zBooleanValue;
        boolean z14;
        int i14;
        p pVar;
        e2 e2Var;
        p.b.c cVar;
        Throwable thB;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f174810f;
        p pVar2 = this.f174811g;
        switch (i15) {
            case 0:
                o13.r.b(obj);
                ip.i iVar = pVar2.f174790a;
                this.f174810f = 1;
                objD = iVar.d(this.f174812h, this);
                if (objD != aVar) {
                    obj2 = objD;
                    p2 p2Var = pVar2.f174791b;
                    p.a aVarA = p.a.a((p.a) p2Var.getValue(), null, false, false, 3);
                    this.f174805a = obj2;
                    this.f174810f = 2;
                    p2Var.k(null, aVarA);
                    if (Unit.INSTANCE != aVar) {
                        int i16 = o13.q.f128596b;
                        if (obj2 instanceof o13.q.b) {
                            thB = o13.q.b(obj2);
                            if (thB != null) {
                                if (!(thB instanceof PrivacyUpdateRequestError)) {
                                }
                                e2 e2Var2 = pVar2.f174792c;
                                p.b.a aVar2 = new p.b.a(new fw.r());
                                this.f174805a = null;
                                this.f174806b = obj2;
                                this.f174807c = null;
                                this.f174809e = 0;
                                this.f174810f = 6;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                        p2 p2Var2 = pVar2.f174791b;
                        p.a aVarA2 = p.a.a((p.a) p2Var2.getValue(), j0.f134944a, false, false, 6);
                        this.f174805a = null;
                        this.f174806b = obj2;
                        this.f174807c = pVar2;
                        this.f174808d = zBooleanValue;
                        this.f174809e = 0;
                        this.f174810f = 3;
                        p2Var2.k(null, aVarA2);
                        if (Unit.INSTANCE != aVar) {
                            z14 = zBooleanValue;
                            i14 = 0;
                            pVar = pVar2;
                            e2Var = pVar.f174792c;
                            cVar = p.b.c.f174799a;
                            this.f174805a = null;
                            this.f174806b = obj2;
                            this.f174807c = null;
                            this.f174808d = z14;
                            this.f174809e = i14;
                            this.f174810f = 4;
                            if (e2Var.emit(cVar, this) != aVar) {
                                thB = o13.q.b(obj2);
                                if (thB != null) {
                                    if (!(thB instanceof PrivacyUpdateRequestError) && p005kotlin.jvm.internal.s.g(((PrivacyUpdateRequestError) thB).getError(), PrivacyUpdateRequestError.TOO_MANY_REQUESTS)) {
                                        e2 e2Var3 = pVar2.f174792c;
                                        p.b.d dVar = p.b.d.f174800a;
                                        this.f174805a = null;
                                        this.f174806b = obj2;
                                        this.f174807c = null;
                                        this.f174809e = 0;
                                        this.f174810f = 5;
                                    } else {
                                        e2 e2Var4 = pVar2.f174792c;
                                        p.b.a aVar3 = new p.b.a(new fw.r());
                                        this.f174805a = null;
                                        this.f174806b = obj2;
                                        this.f174807c = null;
                                        this.f174809e = 0;
                                        this.f174810f = 6;
                                    }
                                    break;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                o13.r.b(obj);
                objD = ((o13.q) obj).f128597a;
                obj2 = objD;
                p2 p2Var3 = pVar2.f174791b;
                p.a aVarA3 = p.a.a((p.a) p2Var3.getValue(), null, false, false, 3);
                this.f174805a = obj2;
                this.f174810f = 2;
                p2Var3.k(null, aVarA3);
                if (Unit.INSTANCE != aVar) {
                    int i17 = o13.q.f128596b;
                    if (obj2 instanceof o13.q.b) {
                        thB = o13.q.b(obj2);
                        if (thB != null) {
                            if (!(thB instanceof PrivacyUpdateRequestError)) {
                            }
                            e2 e2Var5 = pVar2.f174792c;
                            p.b.a aVar4 = new p.b.a(new fw.r());
                            this.f174805a = null;
                            this.f174806b = obj2;
                            this.f174807c = null;
                            this.f174809e = 0;
                            this.f174810f = 6;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    zBooleanValue = ((Boolean) obj2).booleanValue();
                    p2 p2Var4 = pVar2.f174791b;
                    p.a aVarA4 = p.a.a((p.a) p2Var4.getValue(), j0.f134944a, false, false, 6);
                    this.f174805a = null;
                    this.f174806b = obj2;
                    this.f174807c = pVar2;
                    this.f174808d = zBooleanValue;
                    this.f174809e = 0;
                    this.f174810f = 3;
                    p2Var4.k(null, aVarA4);
                    if (Unit.INSTANCE != aVar) {
                        z14 = zBooleanValue;
                        i14 = 0;
                        pVar = pVar2;
                        e2Var = pVar.f174792c;
                        cVar = p.b.c.f174799a;
                        this.f174805a = null;
                        this.f174806b = obj2;
                        this.f174807c = null;
                        this.f174808d = z14;
                        this.f174809e = i14;
                        this.f174810f = 4;
                        if (e2Var.emit(cVar, this) != aVar) {
                            thB = o13.q.b(obj2);
                            if (thB != null) {
                                if (!(thB instanceof PrivacyUpdateRequestError)) {
                                }
                                e2 e2Var6 = pVar2.f174792c;
                                p.b.a aVar5 = new p.b.a(new fw.r());
                                this.f174805a = null;
                                this.f174806b = obj2;
                                this.f174807c = null;
                                this.f174809e = 0;
                                this.f174810f = 6;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                return aVar;
            case 2:
                obj2 = this.f174805a;
                o13.r.b(obj);
                int i18 = o13.q.f128596b;
                if (obj2 instanceof o13.q.b) {
                    thB = o13.q.b(obj2);
                    if (thB != null) {
                        if (!(thB instanceof PrivacyUpdateRequestError)) {
                        }
                        e2 e2Var7 = pVar2.f174792c;
                        p.b.a aVar6 = new p.b.a(new fw.r());
                        this.f174805a = null;
                        this.f174806b = obj2;
                        this.f174807c = null;
                        this.f174809e = 0;
                        this.f174810f = 6;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                zBooleanValue = ((Boolean) obj2).booleanValue();
                p2 p2Var5 = pVar2.f174791b;
                p.a aVarA5 = p.a.a((p.a) p2Var5.getValue(), j0.f134944a, false, false, 6);
                this.f174805a = null;
                this.f174806b = obj2;
                this.f174807c = pVar2;
                this.f174808d = zBooleanValue;
                this.f174809e = 0;
                this.f174810f = 3;
                p2Var5.k(null, aVarA5);
                if (Unit.INSTANCE != aVar) {
                    z14 = zBooleanValue;
                    i14 = 0;
                    pVar = pVar2;
                    e2Var = pVar.f174792c;
                    cVar = p.b.c.f174799a;
                    this.f174805a = null;
                    this.f174806b = obj2;
                    this.f174807c = null;
                    this.f174808d = z14;
                    this.f174809e = i14;
                    this.f174810f = 4;
                    if (e2Var.emit(cVar, this) != aVar) {
                        thB = o13.q.b(obj2);
                        if (thB != null) {
                            if (!(thB instanceof PrivacyUpdateRequestError)) {
                            }
                            e2 e2Var8 = pVar2.f174792c;
                            p.b.a aVar7 = new p.b.a(new fw.r());
                            this.f174805a = null;
                            this.f174806b = obj2;
                            this.f174807c = null;
                            this.f174809e = 0;
                            this.f174810f = 6;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return aVar;
            case 3:
                int i19 = this.f174809e;
                z14 = this.f174808d;
                pVar = this.f174807c;
                Object obj3 = this.f174806b;
                o13.r.b(obj);
                i14 = i19;
                obj2 = obj3;
                e2Var = pVar.f174792c;
                cVar = p.b.c.f174799a;
                this.f174805a = null;
                this.f174806b = obj2;
                this.f174807c = null;
                this.f174808d = z14;
                this.f174809e = i14;
                this.f174810f = 4;
                if (e2Var.emit(cVar, this) != aVar) {
                    thB = o13.q.b(obj2);
                    if (thB != null) {
                        if (!(thB instanceof PrivacyUpdateRequestError)) {
                        }
                        e2 e2Var9 = pVar2.f174792c;
                        p.b.a aVar8 = new p.b.a(new fw.r());
                        this.f174805a = null;
                        this.f174806b = obj2;
                        this.f174807c = null;
                        this.f174809e = 0;
                        this.f174810f = 6;
                        break;
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 4:
                obj2 = this.f174806b;
                o13.r.b(obj);
                thB = o13.q.b(obj2);
                if (thB != null) {
                    if (!(thB instanceof PrivacyUpdateRequestError)) {
                    }
                    e2 e2Var10 = pVar2.f174792c;
                    p.b.a aVar9 = new p.b.a(new fw.r());
                    this.f174805a = null;
                    this.f174806b = obj2;
                    this.f174807c = null;
                    this.f174809e = 0;
                    this.f174810f = 6;
                    break;
                }
                return Unit.INSTANCE;
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
