package v41;

import com.garmin.android.apps.connectmobile.v2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.c2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.domain.usecase.SavePlanUseCase$savePlan$1", f = "SavePlanUseCase.kt", l = {40, 60, 62}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f175683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f175684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f175685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f175687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f175685c = zVar;
        this.f175686d = aVar;
        this.f175687e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f175685c, this.f175686d, this.f175687e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x01bb  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r9 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0188, code lost:
    
        if (r2 == r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ac, code lost:
    
        if (r2 == r1) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u41.b value;
        Long l14;
        Object objY;
        Object objJ;
        Object objJ2;
        u41.b value2;
        com.garmin.android.apps.connectmobile.courses.model.e value3;
        com.garmin.android.apps.connectmobile.courses.model.e eVar;
        u41.b value4;
        u41.b bVar;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar2;
        String str;
        v2 v2Var;
        z1<u41.b> z1Var;
        u41.b value5;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175684b;
        e23.a<Unit> aVar3 = this.f175686d;
        z zVar = this.f175685c;
        if (i14 == 0) {
            o13.r.b(obj);
            z1<u41.b> z1Var2 = zVar.f175692e;
            do {
                value = z1Var2.getValue();
            } while (!z1Var2.b(value, u41.b.a(value, null, null, null, 0, 0, null, null, null, null, null, null, true, false, false, 14335)));
            l14 = zVar.f175692e.getValue().f168609a.f39760b.f39764a;
            com.garmin.android.apps.connectmobile.courses.model.e value6 = zVar.f175693f.getValue();
            String str2 = value6 != null ? value6.courseId : null;
            if (str2 != null && !p005kotlin.jvm.internal.s.g(value6.userProfilePk, String.valueOf(zVar.f175689b.getUserProfilePk())) && !p005kotlin.jvm.internal.s.g(value6.getHasShareableEvent(), Boolean.TRUE)) {
                z20.j jVar = zVar.f175691d;
                String str3 = value6.courseName;
                if (str3 == null) {
                    str3 = "";
                }
                c2 c2Var = new c2(new z20.i(str2, jVar, str3, null));
                x53.c cVar = s0.f129406a;
                r53.i iVarA = r53.s.A(c2Var, x53.b.f189152a);
                this.f175683a = l14;
                this.f175684b = 1;
                objY = r53.s.y(iVarA, this);
            } else if (l14 == null) {
                r41.a aVar4 = zVar.f175690c;
                com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar5 = zVar.f175692e.getValue().f168609a;
                this.f175683a = null;
                this.f175684b = 2;
                objJ2 = com.garmin.android.apps.connectmobile.f0.J(aVar4, new r41.b(aVar4, aVar5, null), this);
            } else {
                r41.a aVar6 = zVar.f175690c;
                long jLongValue = l14.longValue();
                com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar7 = zVar.f175692e.getValue().f168609a;
                this.f175683a = null;
                this.f175684b = 3;
                objJ = com.garmin.android.apps.connectmobile.f0.J(aVar6, new r41.h(aVar6, jLongValue, aVar7, null), this);
            }
            return aVar2;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                o13.r.b(obj);
                objJ2 = obj;
                v2Var = (v2) objJ2;
                if (v2Var instanceof v2.b) {
                    this.f175687e.invoke();
                } else {
                    aVar3.invoke();
                }
                z1Var = zVar.f175692e;
                do {
                    value5 = z1Var.getValue();
                } while (!z1Var.b(value5, u41.b.a(value5, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335)));
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                this.f175687e.invoke();
            } else {
                aVar3.invoke();
            }
            z1Var = zVar.f175692e;
            do {
                value5 = z1Var.getValue();
            } while (!z1Var.b(value5, u41.b.a(value5, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335)));
            return Unit.INSTANCE;
        }
        l14 = this.f175683a;
        o13.r.b(obj);
        objY = obj;
        Long l15 = l14;
        v2 v2Var2 = (v2) objY;
        if (v2Var2 instanceof v2.b) {
            z1<com.garmin.android.apps.connectmobile.courses.model.e> z1Var3 = zVar.f175693f;
            do {
                value3 = z1Var3.getValue();
                eVar = (com.garmin.android.apps.connectmobile.courses.model.e) ((v2.b) v2Var2).f47386a;
            } while (!z1Var3.b(value3, eVar));
            z1<u41.b> z1Var4 = zVar.f175692e;
            do {
                value4 = z1Var4.getValue();
                bVar = value4;
                aVar = bVar.f168609a;
                bVar2 = aVar.f39760b;
                str = eVar.courseId;
            } while (!z1Var4.b(value4, u41.b.a(bVar, com.garmin.android.apps.connectmobile.pacepro.data.dto.a.b(aVar, null, com.garmin.android.apps.connectmobile.pacepro.data.dto.b.b(bVar2, null, str != null ? d53.t.j(str) : null, null, null, 0.0d, null, null, 0L, 0.0d, false, null, null, null, 262139), 1), null, null, 0, 0, null, null, null, null, null, null, false, false, false, 16382)));
        } else {
            z1<u41.b> z1Var5 = zVar.f175692e;
            do {
                value2 = z1Var5.getValue();
            } while (!z1Var5.b(value2, u41.b.a(value2, null, null, null, 0, 0, null, null, null, null, null, null, false, false, false, 14335)));
            aVar3.invoke();
        }
        l14 = l15;
        if (l14 == null) {
            r41.a aVar8 = zVar.f175690c;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar9 = zVar.f175692e.getValue().f168609a;
            this.f175683a = null;
            this.f175684b = 2;
            objJ2 = com.garmin.android.apps.connectmobile.f0.J(aVar8, new r41.b(aVar8, aVar9, null), this);
        } else {
            r41.a aVar10 = zVar.f175690c;
            long jLongValue2 = l14.longValue();
            com.garmin.android.apps.connectmobile.pacepro.data.dto.a aVar11 = zVar.f175692e.getValue().f168609a;
            this.f175683a = null;
            this.f175684b = 3;
            objJ = com.garmin.android.apps.connectmobile.f0.J(aVar10, new r41.h(aVar10, jLongValue2, aVar11, null), this);
        }
        return aVar2;
    }
}
