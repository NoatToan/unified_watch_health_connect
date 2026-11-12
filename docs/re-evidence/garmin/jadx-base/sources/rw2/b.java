package rw2;

import e23.l;
import e23.p;
import java.util.HashMap;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel$fetchViewValues$1", f = "SettingsDataModel.kt", l = {217, 237}, m = "invokeSuspend", v = 1)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f154885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rw2.a f154886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<Boolean, Unit> f154887d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "com.garmin.realtimesettings.app.datalayer.SettingsDataModel$fetchViewValues$1$1", f = "SettingsDataModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f154888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f154889b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, Unit> lVar, boolean z14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f154888a = lVar;
            this.f154889b = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f154888a, this.f154889b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f154888a.invoke(Boolean.valueOf(this.f154889b));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(int i14, rw2.a aVar, l<? super Boolean, Unit> lVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f154885b = i14;
        this.f154886c = aVar;
        this.f154887d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f154885b, this.f154886c, this.f154887d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        if (ge1.b.e0(r15, r0, r14) == r1) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long jA;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154884a;
        boolean z14 = false;
        int i15 = this.f154885b;
        rw2.a aVar2 = this.f154886c;
        try {
            if (i14 == 0) {
                r.b(obj);
                hw2.e eVar = new hw2.e();
                this.f154884a = 1;
                obj = eVar.a(i15, this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
            HashMap map = (HashMap) obj;
            aVar2.getClass();
            map.getClass();
            aVar2.f154867g = map;
            Object obj2 = map.get(gw2.i.GLOBAL_VERSION.f79975a);
            long jA2 = 0;
            if (obj2 != null) {
                cx2.b.a aVar3 = cx2.b.f56665a;
                String string = obj2.toString();
                aVar3.getClass();
                jA = cx2.b.a.a(string);
            } else {
                jA = 0;
            }
            Object obj3 = aVar2.f154867g.get(gw2.i.COMPOSITION_VERSION.f79975a);
            if (obj3 != null) {
                cx2.b.a aVar4 = cx2.b.f56665a;
                String string2 = obj3.toString();
                aVar4.getClass();
                jA2 = cx2.b.a.a(string2);
            }
            aVar2.f154872l = new e(jA, jA2);
            aVar2.f154861a.b("fetchViewValuesCompositions: Received data values for " + i15);
            z14 = true;
        } catch (NullPointerException e4) {
            cx2.h hVar = aVar2.f154861a;
            String strE = sn.a.e(i15, "fetchViewValuesCompositions: Received null from device for ", ": ", e4.getLocalizedMessage());
            Logger logger = cx2.h.f56678c;
            hVar.d(null, strE);
        } catch (Exception e14) {
            cx2.h hVar2 = aVar2.f154861a;
            String strE2 = sn.a.e(i15, "fetchViewValuesCompositions: Problem in getting data values for ", ": ", e14.getLocalizedMessage());
            Logger logger2 = cx2.h.f56678c;
            hVar2.d(null, strE2);
        }
        x53.c cVar = s0.f129406a;
        t1 t1Var = o.f168762a;
        a aVar5 = new a(this.f154887d, z14, null);
        this.f154884a = 2;
    }
}
