package st1;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.i;
import vb.h;
import zf0.a0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.domain.usecase.QuitActiveTrainingPlansUseCase$handleUnlinkEvent$2", f = "QuitActiveTrainingPlansUseCase.kt", l = {SyslogConstants.LOG_LOCAL2, 148, 150, 154, 158}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.a f160879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f160880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f160881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f160882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f160883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f160884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f160885g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, boolean z14, Long l14, String str, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f160882d = cVar;
        this.f160883e = z14;
        this.f160884f = l14;
        this.f160885g = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f160882d, this.f160883e, this.f160884f, this.f160885g, dVar);
        eVar.f160881c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r3 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r3 == r2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bf, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r2) goto L44;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00fd, please report this as an issue */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        Object objA;
        v2 v2Var;
        v2 v2Var2;
        v2.a aVar;
        Exception exc;
        b0 b0Var = (b0) this.f160881c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160880b;
        c cVar = this.f160882d;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = cVar.f160873e;
            g3 g3VarC = g3.a.c(g3.f35298f);
            this.f160881c = b0Var;
            this.f160880b = 1;
            p2Var.k(null, g3VarC);
            if (Unit.INSTANCE != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objA = obj;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    p2 p2Var2 = cVar.f160873e;
                    g3 g3VarE = g3.a.e(g3.f35298f);
                    this.f160881c = null;
                    this.f160879a = null;
                    this.f160880b = 4;
                    p2Var2.k(null, g3VarE);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    p2 p2Var3 = cVar.f160873e;
                    g3 g3VarA = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    this.f160881c = b0Var;
                    this.f160879a = (v2.a) v2Var;
                    this.f160880b = 5;
                    p2Var3.k(null, g3VarA);
                    if (Unit.INSTANCE != aVar2) {
                        v2Var2 = v2Var;
                        aVar = (v2.a) v2Var2;
                        exc = aVar.f47383a;
                        if (exc instanceof IllegalStateException) {
                            i2.a aVar3 = i2.f36769a;
                            a2 a2Var = a2.GENERAL;
                            aVar3.getClass();
                            i2.a.f(a2Var, "QuitActiveTrainingPlansUseCase", "eventID or EventUuid is null");
                        } else {
                            String str = "Error occurred while unlinking the event from plan " + exc + " :: " + aVar.f47384b;
                            i2.a aVar4 = i2.f36769a;
                            a2 a2Var2 = a2.GENERAL;
                            aVar4.getClass();
                            i2.a.f(a2Var2, "QuitActiveTrainingPlansUseCase", str);
                        }
                    }
                }
                return aVar2;
            }
            if (i14 == 3) {
                r.b(obj);
                objJ = obj;
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    p2 p2Var4 = cVar.f160873e;
                    g3 g3VarE2 = g3.a.e(g3.f35298f);
                    this.f160881c = null;
                    this.f160879a = null;
                    this.f160880b = 4;
                    p2Var4.k(null, g3VarE2);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    p2 p2Var5 = cVar.f160873e;
                    g3 g3VarA2 = g3.a.a(g3.f35298f, null, null, null, null, 15);
                    this.f160881c = b0Var;
                    this.f160879a = (v2.a) v2Var;
                    this.f160880b = 5;
                    p2Var5.k(null, g3VarA2);
                    if (Unit.INSTANCE != aVar2) {
                        v2Var2 = v2Var;
                        aVar = (v2.a) v2Var2;
                        exc = aVar.f47383a;
                        if (exc instanceof IllegalStateException) {
                            i2.a aVar5 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar5.getClass();
                            i2.a.f(a2Var3, "QuitActiveTrainingPlansUseCase", "eventID or EventUuid is null");
                        } else {
                            String str2 = "Error occurred while unlinking the event from plan " + exc + " :: " + aVar.f47384b;
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var4 = a2.GENERAL;
                            aVar6.getClass();
                            i2.a.f(a2Var4, "QuitActiveTrainingPlansUseCase", str2);
                        }
                    }
                }
                return aVar2;
            }
            if (i14 == 4) {
                r.b(obj);
            } else {
                if (i14 != 5) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v2Var2 = this.f160879a;
                r.b(obj);
                aVar = (v2.a) v2Var2;
                exc = aVar.f47383a;
                if (exc instanceof IllegalStateException) {
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var5, "QuitActiveTrainingPlansUseCase", "eventID or EventUuid is null");
                } else {
                    String str3 = "Error occurred while unlinking the event from plan " + exc + " :: " + aVar.f47384b;
                    i2.a aVar8 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar8.getClass();
                    i2.a.f(a2Var6, "QuitActiveTrainingPlansUseCase", str3);
                }
            }
        }
        return Unit.INSTANCE;
        boolean z14 = this.f160883e;
        String str4 = this.f160885g;
        Long l14 = this.f160884f;
        if (z14) {
            this.f160881c = b0Var;
            this.f160880b = 2;
            objA = c.a(cVar, l14, str4, this);
        } else {
            this.f160881c = b0Var;
            this.f160880b = 3;
            zf0.d dVar = cVar.f160871c;
            if (str4 != null) {
                objJ = f0.J(dVar, new a0(dVar, str4, null), this);
            } else {
                objJ = l14 != null ? f0.J(dVar, new zf0.i(dVar, l14.longValue(), null), this) : new v2.a(new IllegalStateException(), null, null, 6, null);
            }
        }
        return aVar2;
    }
}
