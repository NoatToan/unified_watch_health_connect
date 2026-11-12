package y51;

import b63.o;
import b63.u;
import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.PendingActivitiesRepositoryImpl$updatePendingActivityStatus$2", f = "PendingActivitiesRepositoryImpl.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super v2<? extends Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f194503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f194504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.e f194506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f194507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f194508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f194509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f194510i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.pendingactivity.api.PendingActivitiesRepositoryImpl$updatePendingActivityStatus$2$1", f = "PendingActivitiesRepositoryImpl.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f194511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f194512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f194513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f194514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z51.e f194515e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ u f194516f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ u f194517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f194518h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f194519i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, o oVar, String str, z51.e eVar, u uVar, u uVar2, String str2, String str3, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f194512b = fVar;
            this.f194513c = oVar;
            this.f194514d = str;
            this.f194515e = eVar;
            this.f194516f = uVar;
            this.f194517g = uVar2;
            this.f194518h = str2;
            this.f194519i = str3;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f194512b, this.f194513c, this.f194514d, this.f194515e, this.f194516f, this.f194517g, this.f194518h, this.f194519i, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f194511a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<Unit>> i0VarA = this.f194512b.f194520a.a(this.f194513c, this.f194514d, new z51.f(this.f194515e, this.f194516f, this.f194517g, this.f194518h, this.f194519i));
            this.f194511a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, o oVar, String str, z51.e eVar, u uVar, u uVar2, String str2, String str3, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f194503b = fVar;
        this.f194504c = oVar;
        this.f194505d = str;
        this.f194506e = eVar;
        this.f194507f = uVar;
        this.f194508g = uVar2;
        this.f194509h = str2;
        this.f194510i = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f194503b, this.f194504c, this.f194505d, this.f194506e, this.f194507f, this.f194508g, this.f194509h, this.f194510i, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends Unit>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194502a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        String str = this.f194510i;
        f fVar = this.f194503b;
        a aVar2 = new a(fVar, this.f194504c, this.f194505d, this.f194506e, this.f194507f, this.f194508g, this.f194509h, str, null);
        this.f194502a = 1;
        fVar.getClass();
        Object objJ = f0.J(fVar, aVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
