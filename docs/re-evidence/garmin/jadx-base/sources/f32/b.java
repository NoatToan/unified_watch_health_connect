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
@v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.DetailsCoroutineScopeDataFetcher$fetchDetailsData$1", f = "DetailsCoroutineScopeDataFetcher.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f32.a<Object> f68652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f68653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<Object>> f68654d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.view.summary.data.DetailsCoroutineScopeDataFetcher$fetchDetailsData$1$1", f = "DetailsCoroutineScopeDataFetcher.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f68655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DateTime f68656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f32.a<Object> f68657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<Object>> f68658d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, f32.a<Object> aVar, y0<fw.m<Object>> y0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f68656b = dateTime;
            this.f68657c = aVar;
            this.f68658d = y0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f68656b, this.f68657c, this.f68658d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f68655a;
            if (i14 == 0) {
                r.b(obj);
                Thread.currentThread().getName();
                DateTime dateTime = this.f68656b;
                Objects.toString(dateTime);
                this.f68655a = 1;
                if (f32.a.c(this.f68657c, dateTime, this.f68658d, this) == aVar) {
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
    public b(f32.a<Object> aVar, DateTime dateTime, y0<fw.m<Object>> y0Var, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f68652b = aVar;
        this.f68653c = dateTime;
        this.f68654d = y0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f68652b, this.f68653c, this.f68654d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68651a;
        DateTime dateTime = this.f68653c;
        f32.a<Object> aVar2 = this.f68652b;
        if (i14 == 0) {
            r.b(obj);
            z zVar = aVar2.f68648c.f22991c;
            a aVar3 = new a(dateTime, aVar2, this.f68654d, null);
            this.f68651a = 1;
            if (ge1.b.e0(zVar, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        aVar2.f68650e.remove(dateTime);
        return Unit.INSTANCE;
    }
}
