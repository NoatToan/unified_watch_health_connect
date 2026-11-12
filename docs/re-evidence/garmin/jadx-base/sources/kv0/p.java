package kv0;

import com.garmin.android.apps.connectmobile.g3;
import java.util.LinkedHashMap;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import wd2.m1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel$onAutoStartSettingChanged$1", f = "LiveTrackStatusViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ou0.f f106705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f106707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f106708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f106710f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, boolean z14, long j8, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f106708d = jVar;
        this.f106709e = z14;
        this.f106710f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f106708d, this.f106709e, this.f106710f, dVar);
        pVar.f106707c = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ou0.f fVarA;
        Object objX4;
        ge2.e eVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        long j8;
        ge2.a aVar;
        m1 m1Var;
        Map<Long, ge2.a> map;
        b0 b0Var = (b0) this.f106707c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106706b;
        boolean z14 = this.f106709e;
        j jVar = this.f106708d;
        if (i14 == 0) {
            r.b(obj);
            ge2.e eVar2 = (ge2.e) ((g3) jVar.f106669f.f150540a.getValue()).f35301b;
            fVarA = eVar2 != null ? ou0.a.a(eVar2) : null;
            if (z14) {
                this.f106707c = b0Var;
                this.f106705a = fVarA;
                this.f106706b = 1;
                objX4 = j.x4(jVar, this);
                if (objX4 == aVar2) {
                    return aVar2;
                }
            } else {
                eVar = (ge2.e) ((g3) jVar.f106669f.f150540a.getValue()).f35301b;
                if (eVar != null || (map = eVar.f77022a) == null) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    linkedHashMap = new LinkedHashMap(map);
                }
                linkedHashMap2 = linkedHashMap;
                j8 = this.f106710f;
                aVar = (ge2.a) linkedHashMap2.get(new Long(j8));
                if (aVar != null) {
                    linkedHashMap2.put(new Long(j8), ge2.a.a(aVar, Boolean.valueOf(z14), null, null, null, 14));
                } else {
                    linkedHashMap2.put(new Long(j8), new ge2.a(Boolean.valueOf(z14), null, null, null, 14, null));
                }
                m1Var = jVar.f106668e;
                if (m1Var != null) {
                    m1Var.f(j8, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ou0.f fVar = this.f106705a;
        r.b(obj);
        fVarA = fVar;
        objX4 = obj;
        if (((Boolean) objX4).booleanValue()) {
            eVar = (ge2.e) ((g3) jVar.f106669f.f150540a.getValue()).f35301b;
            if (eVar != null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap2 = linkedHashMap;
            j8 = this.f106710f;
            aVar = (ge2.a) linkedHashMap2.get(new Long(j8));
            if (aVar != null) {
                linkedHashMap2.put(new Long(j8), ge2.a.a(aVar, Boolean.valueOf(z14), null, null, null, 14));
            } else {
                linkedHashMap2.put(new Long(j8), new ge2.a(Boolean.valueOf(z14), null, null, null, 14, null));
            }
            m1Var = jVar.f106668e;
            if (m1Var != null) {
                m1Var.f(j8, new ge2.e(linkedHashMap2, null, null, null, null, null, null, 126, null));
            }
        } else {
            if (fVarA != null ? s.g(fVarA.f133983a, Boolean.TRUE) : false) {
                jVar.C4(i.b.f106656a);
            } else {
                if ((fVarA != null ? fVarA.f133984b : null) instanceof ou0.b.c) {
                    jVar.C4(i.c.f106657a);
                } else {
                    jVar.C4(i.b.f106656a);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
