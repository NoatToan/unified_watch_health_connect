package pn1;

import am.x0;
import am.z0;
import aq.n2;
import aq.o3;
import com.garmin.android.apps.connectmobile.activities.newmodel.o;
import com.garmin.android.apps.connectmobile.activities.newmodel.q;
import d53.t;
import d53.w;
import i3.mc;
import im.d0;
import im.n;
import ms.x;
import nr.w0;
import o53.b0;
import p005kotlin.Unit;
import p3.n1;
import ps.a1;
import ps.q1;
import ro0.l;
import zm.p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138666a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f138668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f138669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f138670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f138671f;

    public /* synthetic */ c(ls.a aVar, rr.h hVar, int i14, im.b bVar, boolean z14) {
        this.f138669d = aVar;
        this.f138670e = hVar;
        this.f138667b = i14;
        this.f138671f = bVar;
        this.f138668c = z14;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.a
    public final Object invoke() {
        Long lJ;
        w0 h0Var;
        w0 s0Var;
        n nVar;
        q deviceMetadataDTO;
        String deviceId;
        switch (this.f138666a) {
            case 0:
                b0 b0Var = (b0) this.f138669d;
                n1 n1Var = (n1) this.f138670e;
                mc mcVar = (mc) this.f138671f;
                if (this.f138668c) {
                    n1Var.t(this.f138667b);
                    ge1.b.T(b0Var, null, null, new e.a(mcVar, null), 3);
                }
                break;
            default:
                ls.a aVar = (ls.a) this.f138669d;
                rr.h hVar = (rr.h) this.f138670e;
                im.b bVar = (im.b) this.f138671f;
                x xVar = new x();
                q1 q1Var = aVar.f114451b;
                w0 qVar = null;
                boolean zA = xVar.a(q1Var != null ? q1Var.getAverageGradeAdjustedSpeed() : null);
                a1 a1Var = aVar.f114452c;
                boolean z14 = this.f138668c;
                if (a1Var == null || (deviceMetadataDTO = a1Var.getDeviceMetadataDTO()) == null || (deviceId = deviceMetadataDTO.getDeviceId()) == null || (lJ = t.j(deviceId)) == null) {
                    lJ = null;
                } else {
                    long jLongValue = lJ.longValue();
                    if (!z14 || jLongValue <= 0) {
                        lJ = null;
                    }
                }
                nr.q qVar2 = new nr.q(bVar, zA, lJ, z14);
                p pVar = qVar2.f127304a;
                String f113501k1 = pVar.getF113501k1();
                if (f113501k1 == null) {
                    f113501k1 = x0.f4346x.f4358a;
                }
                String str = f113501k1;
                int i14 = this.f138667b;
                Long l14 = qVar2.f127306c;
                switch (i14) {
                    case 1:
                    case 50:
                    case 52:
                    case 64:
                    case 67:
                    case 68:
                    case 69:
                        h0Var = new w0.h0(l.PACE, qVar2.f127305b ? "INCLUDING_AVG_GRADE_ADJUSTED_PACE" : null);
                        qVar = h0Var;
                        break;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 16:
                    case 66:
                    case 83:
                    case 84:
                        s0Var = new w0.s0(i14, str, pVar.W(), false, false, false, false, false, false, false, 1016, null);
                        qVar = s0Var;
                        break;
                    case 17:
                        s0Var = new w0.g0(null, l14, str, qVar2.f127307d, 1, null);
                        qVar = s0Var;
                        break;
                    case 18:
                    case 79:
                        s0Var = new w0.d1(null, l14, str, qVar2.f127307d, 1, null);
                        qVar = s0Var;
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 95:
                        o oVarQ1 = pVar.Q1();
                        im.b bVar2 = pVar instanceof im.b ? (im.b) pVar : null;
                        if (bVar2 == null || (nVar = bVar2.X) == null) {
                            nVar = n.SEATED_STANDING;
                        }
                        qVar = new w0.q(oVarQ1, nVar);
                        break;
                    case 32:
                        d0 d0VarC3 = pVar.C3();
                        double d14 = d0VarC3 != null ? d0VarC3.f94139a : Double.NaN;
                        d0 d0VarD2 = pVar.D2();
                        o3.b bVar3 = (Double.isNaN(d14) || Double.isNaN(d0VarD2 != null ? d0VarD2.f94139a : Double.NaN)) ? o3.b.TRAINING_EFFECT_HELP_AEROBIC : o3.b.TRAINING_EFFECT_HELP_BOTH;
                        String f113508r1 = pVar.getF113508r1();
                        qVar = new w0.i1(bVar3, f113508r1 != null ? !w.J(f113508r1) : false);
                        break;
                    case 33:
                        h0Var = new w0.h0(l.PERFORMANCE_CONDITION, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 36:
                    case 37:
                        qVar = w0.t.f127538a;
                        break;
                    case 39:
                        qVar = new w0.e0(n2.b.f12116j);
                        break;
                    case 40:
                        qVar = new w0.e0(n2.b.f12115i);
                        break;
                    case 41:
                        h0Var = new w0.h0(l.RESPIRATION_RATE, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 42:
                        h0Var = new w0.h0(l.ACTIVITY_LAP_RACING, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 44:
                        h0Var = new w0.h0(l.SKI_CADENCE, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 49:
                        h0Var = new w0.h0(z0.X(str) ? l.SURF_WAVE_DISTANCE : l.WAKESPORTS_RUN_DISTANCE, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 54:
                    case 89:
                        h0Var = new w0.h0(l.STAMINA, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 56:
                        h0Var = new w0.h0(l.RUN_WALK, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 76:
                        h0Var = new w0.h0(l.SKI_POWER, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 78:
                        h0Var = new w0.h0(l.SLOPE_DIFFICULTY_GUIDE, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 81:
                        h0Var = new w0.h0(l.ACTIVITY_BIKE_FORCE, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 82:
                        h0Var = new w0.h0(l.IMPACT_LOAD, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 86:
                        h0Var = new w0.h0(l.SKI_GLIDE_LENGTH, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 90:
                    case 91:
                        h0Var = new w0.y(null, str, 1, null);
                        qVar = h0Var;
                        break;
                    case 92:
                        h0Var = new w0.h0(l.PACK_CALORIES, null, 2, null);
                        qVar = h0Var;
                        break;
                    case 96:
                        h0Var = new w0.h0(l.CDTA, null, 2, null);
                        qVar = h0Var;
                        break;
                }
                if (qVar != null) {
                    hVar.f154177a.a(qVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(boolean z14, int i14, b0 b0Var, n1 n1Var, mc mcVar) {
        this.f138668c = z14;
        this.f138667b = i14;
        this.f138669d = b0Var;
        this.f138670e = n1Var;
        this.f138671f = mcVar;
    }
}
