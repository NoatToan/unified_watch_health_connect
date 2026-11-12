package am;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/i1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getPeakPowerCurve$1", f = "ActivityRepo.kt", l = {294, 294}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<r53.j<? super v2<? extends ps.i1>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r53.j f4007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f4010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f4011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4013g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lps/i1;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo$getPeakPowerCurve$1$1", f = "ActivityRepo.kt", l = {294}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super c83.a0<ps.i1>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f4015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f4017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f4018e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, String str, String str2, String str3, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f4015b = mVar;
            this.f4016c = str;
            this.f4017d = str2;
            this.f4018e = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f4015b, this.f4016c, this.f4017d, this.f4018e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<ps.i1>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f4014a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<ps.i1>> i0VarZ = this.f4015b.f4069a.z(this.f4016c, this.f4017d, this.f4018e);
            this.f4014a = 1;
            Object objAwait = i0VarZ.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m mVar, String str, String str2, String str3, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f4010d = mVar;
        this.f4011e = str;
        this.f4012f = str2;
        this.f4013g = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i0 i0Var = new i0(this.f4010d, this.f4011e, this.f4012f, this.f4013g, dVar);
        i0Var.f4009c = obj;
        return i0Var;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super v2<? extends ps.i1>> jVar, t13.d<? super Unit> dVar) {
        return ((i0) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r13, r12) == r1) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r53.j jVar = (r53.j) this.f4009c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f4008b;
        if (i14 != 0) {
            if (i14 == 1) {
                jVar = this.f4007a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        String str = this.f4013g;
        m mVar = this.f4010d;
        a aVar2 = new a(mVar, this.f4011e, this.f4012f, str, null);
        this.f4009c = null;
        this.f4007a = jVar;
        this.f4008b = 1;
        mVar.getClass();
        obj = com.garmin.android.apps.connectmobile.f0.J(mVar, aVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        this.f4009c = null;
        this.f4007a = null;
        this.f4008b = 2;
    }
}
