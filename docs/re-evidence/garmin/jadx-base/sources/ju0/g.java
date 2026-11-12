package ju0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import m20.z;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lfw/m;", "Liu0/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.network.LiveEventSharingRepo$getAllResources$1", f = "LiveEventSharingRepo.kt", l = {55, 58, 59, 65, 68, 71, 73}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<r53.j<? super fw.m<? extends iu0.d>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f100893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f100894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f100895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f100896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f100897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f100896d = eVar;
        this.f100897e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f100896d, this.f100897e, dVar);
        gVar.f100895c = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super fw.m<? extends iu0.d>> jVar, t13.d<? super Unit> dVar) {
        return ((g) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053 A[PHI: r3
      0x0053: PHI (r3v6 java.lang.Object) = (r3v5 java.lang.Object), (r3v8 java.lang.Object) binds: [B:14:0x004f, B:8:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x006d A[PHI: r3 r4
      0x006d: PHI (r3v9 com.garmin.android.apps.connectmobile.v2) = (r3v7 com.garmin.android.apps.connectmobile.v2), (r3v22 com.garmin.android.apps.connectmobile.v2) binds: [B:17:0x0069, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x006d: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v18 java.lang.Object) binds: [B:17:0x0069, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:35:0x012a  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fa, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0127, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0140, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L37;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x006d, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objC;
        v2 v2Var;
        Object objG;
        v2 v2Var2;
        sd2.f fVarI;
        boolean z14;
        r53.j jVar = (r53.j) this.f100895c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f100894b;
        e eVar = this.f100896d;
        String str = this.f100897e;
        switch (i14) {
            case 0:
                r.b(obj);
                fw.m mVarF = fw.m.a.f(fw.m.f73767e, null, null, 3);
                this.f100895c = jVar;
                this.f100894b = 1;
                if (jVar.emit(mVarF, this) != aVar) {
                    this.f100895c = jVar;
                    this.f100894b = 2;
                    objC = eVar.c(str, this);
                    if (objC != aVar) {
                        v2Var = (v2) objC;
                        e.a aVar2 = e.f100881g;
                        z zVar = (z) eVar.f100887f.getValue();
                        this.f100895c = jVar;
                        this.f100893a = v2Var;
                        this.f100894b = 3;
                        objG = zVar.g(this);
                        if (objG != aVar) {
                            v2Var2 = (v2) objG;
                            rd2.j jVar2 = rd2.f.a().f152045a;
                            long j8 = Long.parseLong(str);
                            jVar2.getClass();
                            fVarI = rd2.j.i(j8, null);
                            i2.f36769a.getClass();
                            i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventSharingRepo", "getAllResources(): deviceId: " + str + ", \nsettings: " + v2Var + ", \ndeviceSelected: " + fVarI);
                            z14 = v2Var instanceof v2.b;
                            if (!z14 && (v2Var2 instanceof v2.b)) {
                                fw.m mVarG = fw.m.a.g(fw.m.f73767e, new iu0.d((q) ((v2.b) v2Var).f47386a, (l20.r) ((v2.b) v2Var2).f47386a, fVarI), 1);
                                this.f100895c = null;
                                this.f100893a = null;
                                this.f100894b = 4;
                            } else if (z14) {
                                fw.m mVarG2 = fw.m.a.g(fw.m.f73767e, new iu0.d((q) ((v2.b) v2Var).f47386a, null, fVarI, 2, null), 1);
                                this.f100895c = null;
                                this.f100893a = null;
                                this.f100894b = 5;
                            } else if (v2Var2 instanceof v2.b) {
                                fw.m mVarB = fw.m.a.b(fw.m.f73767e, new fw.g(), null, 1);
                                this.f100895c = null;
                                this.f100893a = null;
                                this.f100894b = 7;
                            } else {
                                fw.m mVarB2 = fw.m.a.b(fw.m.f73767e, new fw.g(), new iu0.d(null, (l20.r) ((v2.b) v2Var2).f47386a, fVarI, 1, null), 1);
                                this.f100895c = null;
                                this.f100893a = null;
                                this.f100894b = 6;
                            }
                        }
                    }
                    break;
                }
                return aVar;
            case 1:
                r.b(obj);
                this.f100895c = jVar;
                this.f100894b = 2;
                objC = eVar.c(str, this);
                if (objC != aVar) {
                    v2Var = (v2) objC;
                    e.a aVar3 = e.f100881g;
                    z zVar2 = (z) eVar.f100887f.getValue();
                    this.f100895c = jVar;
                    this.f100893a = v2Var;
                    this.f100894b = 3;
                    objG = zVar2.g(this);
                    if (objG != aVar) {
                        v2Var2 = (v2) objG;
                        rd2.j jVar3 = rd2.f.a().f152045a;
                        long j14 = Long.parseLong(str);
                        jVar3.getClass();
                        fVarI = rd2.j.i(j14, null);
                        i2.f36769a.getClass();
                        i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventSharingRepo", "getAllResources(): deviceId: " + str + ", \nsettings: " + v2Var + ", \ndeviceSelected: " + fVarI);
                        z14 = v2Var instanceof v2.b;
                        if (!z14) {
                        }
                        if (z14) {
                            fw.m mVarG3 = fw.m.a.g(fw.m.f73767e, new iu0.d((q) ((v2.b) v2Var).f47386a, null, fVarI, 2, null), 1);
                            this.f100895c = null;
                            this.f100893a = null;
                            this.f100894b = 5;
                        } else if (v2Var2 instanceof v2.b) {
                            fw.m mVarB3 = fw.m.a.b(fw.m.f73767e, new fw.g(), null, 1);
                            this.f100895c = null;
                            this.f100893a = null;
                            this.f100894b = 7;
                        } else {
                            fw.m mVarB4 = fw.m.a.b(fw.m.f73767e, new fw.g(), new iu0.d(null, (l20.r) ((v2.b) v2Var2).f47386a, fVarI, 1, null), 1);
                            this.f100895c = null;
                            this.f100893a = null;
                            this.f100894b = 6;
                        }
                    }
                    break;
                }
                return aVar;
            case 2:
                r.b(obj);
                objC = obj;
                v2Var = (v2) objC;
                e.a aVar4 = e.f100881g;
                z zVar3 = (z) eVar.f100887f.getValue();
                this.f100895c = jVar;
                this.f100893a = v2Var;
                this.f100894b = 3;
                objG = zVar3.g(this);
                if (objG != aVar) {
                    v2Var2 = (v2) objG;
                    rd2.j jVar4 = rd2.f.a().f152045a;
                    long j15 = Long.parseLong(str);
                    jVar4.getClass();
                    fVarI = rd2.j.i(j15, null);
                    i2.f36769a.getClass();
                    i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventSharingRepo", "getAllResources(): deviceId: " + str + ", \nsettings: " + v2Var + ", \ndeviceSelected: " + fVarI);
                    z14 = v2Var instanceof v2.b;
                    if (!z14) {
                    }
                    if (z14) {
                        fw.m mVarG4 = fw.m.a.g(fw.m.f73767e, new iu0.d((q) ((v2.b) v2Var).f47386a, null, fVarI, 2, null), 1);
                        this.f100895c = null;
                        this.f100893a = null;
                        this.f100894b = 5;
                    } else if (v2Var2 instanceof v2.b) {
                        fw.m mVarB5 = fw.m.a.b(fw.m.f73767e, new fw.g(), null, 1);
                        this.f100895c = null;
                        this.f100893a = null;
                        this.f100894b = 7;
                    } else {
                        fw.m mVarB6 = fw.m.a.b(fw.m.f73767e, new fw.g(), new iu0.d(null, (l20.r) ((v2.b) v2Var2).f47386a, fVarI, 1, null), 1);
                        this.f100895c = null;
                        this.f100893a = null;
                        this.f100894b = 6;
                    }
                    break;
                }
                return aVar;
            case 3:
                v2Var = this.f100893a;
                r.b(obj);
                objG = obj;
                v2Var2 = (v2) objG;
                rd2.j jVar5 = rd2.f.a().f152045a;
                long j16 = Long.parseLong(str);
                jVar5.getClass();
                fVarI = rd2.j.i(j16, null);
                i2.f36769a.getClass();
                i2.a.b(a2.LIVE_EVENT_SHARING, "LiveEventSharingRepo", "getAllResources(): deviceId: " + str + ", \nsettings: " + v2Var + ", \ndeviceSelected: " + fVarI);
                z14 = v2Var instanceof v2.b;
                if (!z14) {
                }
                if (z14) {
                    fw.m mVarG5 = fw.m.a.g(fw.m.f73767e, new iu0.d((q) ((v2.b) v2Var).f47386a, null, fVarI, 2, null), 1);
                    this.f100895c = null;
                    this.f100893a = null;
                    this.f100894b = 5;
                } else if (v2Var2 instanceof v2.b) {
                    fw.m mVarB7 = fw.m.a.b(fw.m.f73767e, new fw.g(), null, 1);
                    this.f100895c = null;
                    this.f100893a = null;
                    this.f100894b = 7;
                } else {
                    fw.m mVarB8 = fw.m.a.b(fw.m.f73767e, new fw.g(), new iu0.d(null, (l20.r) ((v2.b) v2Var2).f47386a, fVarI, 1, null), 1);
                    this.f100895c = null;
                    this.f100893a = null;
                    this.f100894b = 6;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                r.b(obj);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
