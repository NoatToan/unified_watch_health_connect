package ua1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import va1.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.powerguide.create.CreatePowerGuideStrategyViewModel$startFTPSetup$1", f = "CreatePowerGuideStrategyViewModel.kt", l = {120, 122, 124, 139}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f169632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f169633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f169634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f169634c = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f169634c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (r7.C4(r9, r8) == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2 v2Var;
        v2 v2Var2;
        Integer ftp;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f169633b;
        c cVar = this.f169634c;
        if (i14 == 0) {
            r.b(obj);
            this.f169633b = 1;
            if (c.x4(cVar, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    this.f169632a = (v2.b) v2Var;
                    this.f169633b = 3;
                    if (c.y4(cVar, this) != aVar) {
                        v2Var2 = v2Var;
                        v2.b bVar = (v2.b) v2Var2;
                        DateTime dateTimeA = ((ab1.c) bVar.f47386a).a();
                        ftp = ((ab1.c) bVar.f47386a).getFtp();
                        if (ftp != null) {
                            cVar.getClass();
                            cVar.z4(o.SELECT_ABILITY);
                        } else {
                            cVar.getClass();
                            cVar.z4(o.SELECT_ABILITY);
                        }
                    }
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String string = ((v2.a) v2Var).f47383a.toString();
                    this.f169632a = null;
                    this.f169633b = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                v2Var2 = this.f169632a;
                r.b(obj);
                v2.b bVar2 = (v2.b) v2Var2;
                DateTime dateTimeA2 = ((ab1.c) bVar2.f47386a).a();
                ftp = ((ab1.c) bVar2.f47386a).getFtp();
                if (ftp != null || ftp.intValue() <= 0) {
                    cVar.getClass();
                    cVar.z4(o.SELECT_ABILITY);
                } else if (dateTimeA2 == null || !dateTimeA2.withTimeAtStartOfDay().isAfter(DateTime.now().minusDays(90).withTimeAtStartOfDay())) {
                    cVar.f169614j.j(ftp);
                    cVar.z4(o.CONFIRM_FTP);
                } else {
                    cVar.f169614j.j(ftp);
                    cVar.z4(o.SELECT_RIDING_POSITION);
                }
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        }
        return Unit.INSTANCE;
        sa1.c cVar2 = cVar.f169607c;
        this.f169633b = 2;
        cVar2.getClass();
        obj = f0.J(cVar2, new sa1.d(cVar2, null), this);
        if (obj != aVar) {
            v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                this.f169632a = (v2.b) v2Var;
                this.f169633b = 3;
                if (c.y4(cVar, this) != aVar) {
                    v2Var2 = v2Var;
                    v2.b bVar3 = (v2.b) v2Var2;
                    DateTime dateTimeA3 = ((ab1.c) bVar3.f47386a).a();
                    ftp = ((ab1.c) bVar3.f47386a).getFtp();
                    if (ftp != null) {
                        cVar.getClass();
                        cVar.z4(o.SELECT_ABILITY);
                    } else {
                        cVar.getClass();
                        cVar.z4(o.SELECT_ABILITY);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (v2Var instanceof v2.a) {
                    u0.r();
                    return null;
                }
                String string2 = ((v2.a) v2Var).f47383a.toString();
                this.f169632a = null;
                this.f169633b = 4;
            }
        }
        return aVar;
    }
}
