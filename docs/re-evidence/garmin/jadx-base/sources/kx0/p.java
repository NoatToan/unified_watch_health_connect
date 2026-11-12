package kx0;

import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.io.Serializable;
import java.util.ArrayList;
import o53.b0;
import o53.j0;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$2", f = "MenstrualCycleSettingsViewModel.kt", l = {234, 235}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f107089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o13.p f107090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f107091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f107092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f107093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db1.m f107094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ LocalDate f107095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UserSettingsDTO f107096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ JSONObject f107097i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Ldb1/m;", "", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$2$postPregnancySettings$1", f = "MenstrualCycleSettingsViewModel.kt", l = {227}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends db1.m, ? extends Throwable>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f107099b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ db1.m f107100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LocalDate f107101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, db1.m mVar2, LocalDate localDate, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f107099b = mVar;
            this.f107100c = mVar2;
            this.f107101d = localDate;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f107099b, this.f107100c, this.f107101d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends db1.m, ? extends Throwable>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107098a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107098a = 1;
                Serializable serializableZ4 = m.z4(this.f107099b, this.f107100c, this.f107101d, this);
                return serializableZ4 == aVar ? aVar : serializableZ4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Throwable;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsViewModel$postSettings$2$postUserSettings$1", f = "MenstrualCycleSettingsViewModel.kt", l = {232}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Throwable>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f107102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f107103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserSettingsDTO f107104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ JSONObject f107105d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f107103b = mVar;
            this.f107104c = userSettingsDTO;
            this.f107105d = jSONObject;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f107103b, this.f107104c, this.f107105d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Throwable> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f107102a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f107102a = 1;
                Serializable serializableX4 = m.x4(this.f107103b, this.f107104c, this.f107105d, this);
                return serializableX4 == aVar ? aVar : serializableX4;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, db1.m mVar2, LocalDate localDate, UserSettingsDTO userSettingsDTO, JSONObject jSONObject, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f107093e = mVar;
        this.f107094f = mVar2;
        this.f107095g = localDate;
        this.f107096h = userSettingsDTO;
        this.f107097i = jSONObject;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f107093e, this.f107094f, this.f107095g, this.f107096h, this.f107097i, dVar);
        pVar.f107092d = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j0 j0VarJ;
        o13.p pVar;
        Throwable th3;
        ArrayList arrayList;
        Throwable th4;
        b0 b0Var = (b0) this.f107092d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f107091c;
        m mVar = this.f107093e;
        if (i14 == 0) {
            o13.r.b(obj);
            j0 j0VarJ2 = ge1.b.j(b0Var, null, null, new a(mVar, this.f107094f, this.f107095g, null), 3);
            j0VarJ = ge1.b.j(b0Var, null, null, new b(mVar, this.f107096h, this.f107097i, null), 3);
            this.f107092d = null;
            this.f107089a = j0VarJ;
            this.f107091c = 1;
            obj = j0VarJ2.C(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            j0VarJ = this.f107089a;
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = this.f107090b;
            o13.r.b(obj);
        }
        th3 = (Throwable) obj;
        arrayList = new ArrayList();
        th4 = (Throwable) pVar.f128595b;
        if (th4 != null) {
            arrayList.add(th4);
        }
        if (th3 != null) {
            arrayList.add(th3);
        }
        mVar.f107068k.j(tb1.d.b(null, null, null, tb1.d.a(arrayList), 7));
        return Unit.INSTANCE;
        o13.p pVar2 = (o13.p) obj;
        this.f107092d = null;
        this.f107089a = null;
        this.f107090b = pVar2;
        this.f107091c = 2;
        Object objAwait = j0VarJ.await(this);
        if (objAwait != aVar) {
            pVar = pVar2;
            obj = objAwait;
            th3 = (Throwable) obj;
            arrayList = new ArrayList();
            th4 = (Throwable) pVar.f128595b;
            if (th4 != null) {
                arrayList.add(th4);
            }
            if (th3 != null) {
                arrayList.add(th3);
            }
            mVar.f107068k.j(tb1.d.b(null, null, null, tb1.d.a(arrayList), 7));
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
