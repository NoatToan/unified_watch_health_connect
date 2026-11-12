package pj1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$removeEmergencyContact$1$1", f = "SafetyFeaturesViewModel.kt", l = {1092}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f138008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l20.a f138009c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.SafetyFeaturesViewModel$removeEmergencyContact$1$1$1", f = "SafetyFeaturesViewModel.kt", l = {1094, 1095, 1099}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f138010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f138011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l20.a f138012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, l20.a aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f138011b = sVar;
            this.f138012c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f138011b, this.f138012c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        
            if (r14 == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        
            if (r5.z4(r14, r13) == r0) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            v2 v2Var;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f138010a;
            s sVar = this.f138011b;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    v2Var = (v2) obj;
                    aVar = this;
                } else if (i14 == 2) {
                    o13.r.b(obj);
                    aVar = this;
                    v2Var = (v2) obj;
                } else {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            hl.a aVar3 = sVar.f137981q;
            boolean zG = p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b);
            l20.a aVar4 = this.f138012c;
            if (zG) {
                m20.z zVar = (m20.z) sVar.f137901c.getValue();
                l20.a aVarJ = com.garmin.android.apps.connectmobile.contacts.b.j(aVar4);
                this.f138010a = 1;
                obj = zVar.h(aVarJ, this);
                if (obj != aVar2) {
                    v2Var = (v2) obj;
                    aVar = this;
                }
            } else {
                if (!(aVar3 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                re0.o oVar = (re0.o) sVar.f137902d.getValue();
                long j8 = ((hl.a.b) sVar.f137981q).f84252b;
                String contactId = aVar4.getContactId();
                if (contactId == null) {
                    contactId = "";
                }
                l20.a aVarJ2 = com.garmin.android.apps.connectmobile.contacts.b.j(aVar4);
                this.f138010a = 2;
                aVar = this;
                obj = oVar.q(j8, contactId, aVarJ2, aVar);
            }
            return aVar2;
            if (v2Var instanceof v2.b) {
                hl.a aVar5 = sVar.f137981q;
                aVar.f138010a = 3;
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                y0<g3<tj1.e>> y0VarC4 = sVar.C4();
                g3.a aVar6 = g3.f35298f;
                g3<tj1.e> g3VarD = sVar.C4().d();
                v2.a aVar7 = (v2.a) v2Var;
                y0VarC4.j(g3.a.a(aVar6, aVar7.f47385c, null, g3VarD != null ? g3VarD.f35301b : null, aVar7.f47384b, 2));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(s sVar, l20.a aVar, t13.d<? super x> dVar) {
        super(2, dVar);
        this.f138008b = sVar;
        this.f138009c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x(this.f138008b, this.f138009c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f138007a;
        if (i14 == 0) {
            o13.r.b(obj);
            s sVar = this.f138008b;
            y0<g3<tj1.e>> y0VarC4 = sVar.C4();
            g3.a aVar2 = g3.f35298f;
            g3<tj1.e> g3VarD = sVar.C4().d();
            tj1.e eVar = g3VarD != null ? g3VarD.f35301b : null;
            aVar2.getClass();
            y0VarC4.j(g3.a.b(eVar));
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(sVar, this.f138009c, null);
            this.f138007a = 1;
            if (ge1.b.e0(bVar, aVar3, this) == aVar) {
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
