package tf0;

import androidx.lifecycle.y0;
import androidx.room.a0;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.LinkedHashMap;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q92.x;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ltf0/i;", "", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lvf0/a;", "repository", "<init>", "(Lo53/b0;Lvf0/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f164439d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f164440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vf0.a f164441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f164442c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.epoch.component.EpochReloadStateHandler$requestEpochData$1", f = "EpochReloadStateHandler.kt", l = {66}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f164443a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f164445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f164446d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f164445c = str;
            this.f164446d = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return i.this.new b(this.f164445c, this.f164446d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f164443a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f164443a = 1;
                if (i.a(i.this, this.f164445c, this.f164446d, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        f164439d = 8;
    }

    public i(b0 b0Var, vf0.a aVar) {
        b0Var.getClass();
        aVar.getClass();
        this.f164440a = b0Var;
        this.f164441b = aVar;
        this.f164442c = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(i iVar, String str, String str2, v13.c cVar) {
        j jVar;
        iVar.getClass();
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f164450d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f164450d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(iVar, cVar);
            }
        } else {
            jVar = new j(iVar, cVar);
        }
        Object objJ = jVar.f164448b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f164450d;
        if (i15 == 0) {
            o13.r.b(objJ);
            iVar.b(str).m(sf0.i.c.f158853a);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "EpochReloadStateHandler", "postEpochRequest: loading");
            vf0.a aVar3 = iVar.f164441b;
            jVar.f164447a = str;
            jVar.f164450d = 1;
            aVar3.getClass();
            objJ = f0.J(aVar3, new vf0.b(aVar3, str, str2, null), jVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = jVar.f164447a;
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var2, "EpochReloadStateHandler", "postEpochRequest: success");
            uf0.b bVar = (uf0.b) ((v2.b) v2Var).f47386a;
            y0<sf0.i> y0VarB = iVar.b(str);
            i2.a.b(a2Var2, "EpochReloadStateHandler", "onEpochRequestSuccess: status=" + (bVar != null ? bVar.getStatus() : null));
            String status = bVar != null ? bVar.getStatus() : null;
            if (status == null) {
                y0VarB.m(new sf0.i.e(bVar, true));
            } else {
                int iHashCode = status.hashCode();
                if (iHashCode != 66247144) {
                    if (iHashCode != 183181625) {
                        if (iHashCode == 1485840007 && status.equals("PAT_VERIFICATION_REQUIRED")) {
                            y0VarB.m(new sf0.i.f(bVar.a()));
                        } else {
                            y0VarB.m(new sf0.i.e(bVar, true));
                        }
                    } else if (status.equals("COMPLETE")) {
                        y0VarB.m(new sf0.i.a(true));
                    } else {
                        y0VarB.m(new sf0.i.e(bVar, true));
                    }
                } else if (status.equals("ERROR")) {
                    y0VarB.m(sf0.i.b.f158852a);
                } else {
                    y0VarB.m(new sf0.i.e(bVar, true));
                }
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            i2.a aVar5 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var3, "EpochReloadStateHandler", "postEpochRequest: error");
            iVar.b(str).m(sf0.i.b.f158852a);
        }
        return Unit.INSTANCE;
    }

    public final y0<sf0.i> b(String str) {
        str.getClass();
        String strConcat = "getEpochReloadState: date=".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EpochReloadStateHandler", strConcat);
        LinkedHashMap linkedHashMap = this.f164442c;
        Object y0Var = linkedHashMap.get(str);
        if (y0Var == null) {
            y0Var = new y0();
            linkedHashMap.put(str, y0Var);
        }
        y0<sf0.i> y0Var2 = (y0) y0Var;
        sf0.i iVarD = y0Var2.d();
        if (iVarD == null) {
            y0Var2.m(sf0.i.d.f158854a);
            return y0Var2;
        }
        if (iVarD instanceof sf0.i.a) {
            ((sf0.i.a) iVarD).f158851a = false;
            return y0Var2;
        }
        if (iVarD instanceof sf0.i.e) {
            ((sf0.i.e) iVarD).f158856b = false;
            return y0Var2;
        }
        i2.a.b(a2Var, "EpochReloadStateHandler", "getEpochReloadState: skip state: " + iVarD);
        return y0Var2;
    }

    public final void c(e eVar, String str) {
        eVar.getClass();
        if (eVar.equals(tf0.b.f164430a)) {
            d(str, "");
            return;
        }
        if (eVar instanceof c) {
            String deviceId = ((c) eVar).f164431a.getDeviceId();
            String strJ = a0.j("onEpochDeviceSelected: date=", str, " deviceId=", deviceId);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "EpochReloadStateHandler", strJ);
            d(str, deviceId);
            return;
        }
        if (!eVar.equals(d.f164432a)) {
            u0.r();
            return;
        }
        i2.a aVar2 = i2.f36769a;
        a2 a2Var2 = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var2, "EpochReloadStateHandler", "resetEpochFlow");
        b(str).m(null);
    }

    public final void d(String str, String str2) {
        String strJ = a0.j("requestEpochData: date=", str, " deviceId=", str2);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "EpochReloadStateHandler", strJ);
        tf0.a.f164428a.getClass();
        if (!d1.h(x.DI_CONNECT_UPLOAD, true)) {
            i2.a.f(a2Var, "EpochReloadStateHandler", "For epoch reload storage consent is needed");
            return;
        }
        i2.a.b(a2Var, "EpochReloadStateHandler", "requestEpochData: upload feature enabled");
        ge1.b.T(this.f164440a, null, null, new b(str, str2, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltf0/i$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i(b0 b0Var, vf0.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, (i14 & 2) != 0 ? vf0.a.C3325a.a(vf0.a.f177868b) : aVar);
    }
}
