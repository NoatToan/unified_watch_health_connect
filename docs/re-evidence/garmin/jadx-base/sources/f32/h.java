package f32;

import androidx.lifecycle.y0;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.z;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.SummaryCoroutineScopeDataFetcher$fetchSummaryData$1", f = "SummaryCoroutineScopeDataFetcher.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j<Object> f68668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o13.p<DateTime, DateTime> f68669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f68670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f68671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<Object>> f68672f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.SummaryCoroutineScopeDataFetcher$fetchSummaryData$1$1", f = "SummaryCoroutineScopeDataFetcher.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j<Object> f68674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o13.p<DateTime, DateTime> f68675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ DateTime f68676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DateTime f68677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<Object>> f68678f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j<Object> jVar, o13.p<DateTime, DateTime> pVar, DateTime dateTime, DateTime dateTime2, y0<fw.m<Object>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f68674b = jVar;
            this.f68675c = pVar;
            this.f68676d = dateTime;
            this.f68677e = dateTime2;
            this.f68678f = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68674b, this.f68675c, this.f68676d, this.f68677e, this.f68678f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68673a;
            if (i14 == 0) {
                r.b(obj);
                j<Object> jVar = this.f68674b;
                String str = jVar.f68688d;
                Thread.currentThread().getName();
                Objects.toString(this.f68675c);
                this.f68673a = 1;
                if (j.c(jVar, this.f68676d, this.f68677e, this.f68678f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j<Object> jVar, o13.p<DateTime, DateTime> pVar, DateTime dateTime, DateTime dateTime2, y0<fw.m<Object>> y0Var, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f68668b = jVar;
        this.f68669c = pVar;
        this.f68670d = dateTime;
        this.f68671e = dateTime2;
        this.f68672f = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f68668b, this.f68669c, this.f68670d, this.f68671e, this.f68672f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68667a;
        j<Object> jVar = this.f68668b;
        if (i14 == 0) {
            r.b(obj);
            z zVar = jVar.f68687c.f22991c;
            a aVar2 = new a(jVar, this.f68669c, this.f68670d, this.f68671e, this.f68672f, null);
            this.f68667a = 1;
            if (ge1.b.e0(zVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        jVar.f68690f.remove(this.f68669c);
        return Unit.INSTANCE;
    }
}
