package kd0;

import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NewsfeedDelegateImpl$observeNewsfeedUnreadStatus$1$1", f = "NewsfeedDelegateImpl.kt", l = {249}, m = "invokeSuspend", v = 2)
public final class r4 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hz0.l f104338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f104339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i.c f104340e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Loz0/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.NewsfeedDelegateImpl$observeNewsfeedUnreadStatus$1$1$result$1", f = "NewsfeedDelegateImpl.kt", l = {249}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends oz0.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i.c f104342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.r0<String> f104343c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i.c cVar, p005kotlin.jvm.internal.r0<String> r0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104342b = cVar;
            this.f104343c = r0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104342b, this.f104343c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super com.garmin.android.apps.connectmobile.v2<? extends oz0.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104341a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            hz0.m.f86458c.getClass();
            hz0.m mVarA = hz0.m.a.a(this.f104342b);
            String str = this.f104343c.f105810a;
            this.f104341a = 1;
            Object objJ = com.garmin.android.apps.connectmobile.f0.J(mVarA, new hz0.n(mVarA, str, null), this);
            return objJ == aVar ? aVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(hz0.l lVar, DateTime dateTime, i.c cVar, t13.d<? super r4> dVar) {
        super(2, dVar);
        this.f104338c = lVar;
        this.f104339d = dateTime;
        this.f104340e = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r4 r4Var = new r4(this.f104338c, this.f104339d, this.f104340e, dVar);
        r4Var.f104337b = obj;
        return r4Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Object, java.lang.String] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f104337b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f104336a;
        DateTime dateTime = this.f104339d;
        hz0.l lVar = this.f104338c;
        if (i14 == 0) {
            p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(obj);
            ?? A = lVar.a();
            r0VarS.f105810a = A;
            if (A.length() == 0) {
                ?? Print = c22.j0.f23101c.print(dateTime.minusDays(90));
                Print.getClass();
                r0VarS.f105810a = Print;
            }
            x53.c cVar = o53.s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar2 = new a(this.f104340e, r0VarS, null);
            this.f104337b = b0Var;
            this.f104336a = 1;
            obj = ge1.b.e0(bVar, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) obj;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            oz0.b bVar2 = (oz0.b) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            lVar.c(bVar2.getNumberOfFollowings());
            DateTime lastUnreadPostExpirationTimeGMT = bVar2.getLastUnreadPostExpirationTimeGMT();
            if (lastUnreadPostExpirationTimeGMT == null) {
                lVar.d(false);
                return Unit.INSTANCE;
            }
            String strPrint = c22.j0.f23101c.print(lastUnreadPostExpirationTimeGMT);
            strPrint.getClass();
            lVar.b(strPrint);
            lVar.d(lastUnreadPostExpirationTimeGMT.getMillis() > dateTime.getMillis());
        } else {
            lVar.d(false);
        }
        return Unit.INSTANCE;
    }
}
