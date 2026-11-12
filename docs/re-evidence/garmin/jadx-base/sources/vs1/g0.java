package vs1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/v2;", "Lqs1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UploadTrailReviewImagesUseCase$submitTrailReviewPhotos$2", f = "UploadTrailReviewImagesUseCase.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class g0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends v2<? extends qs1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f179797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<pt1.u> f179798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f179799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f179800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f179801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f179802g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lqs1/b;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.domain.usecase.UploadTrailReviewImagesUseCase$submitTrailReviewPhotos$2$1$1", f = "UploadTrailReviewImagesUseCase.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends qs1.b>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f179803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f179804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f179805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f179806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pt1.u f179807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f179808f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e0 e0Var, Context context, long j8, pt1.u uVar, e23.a<Unit> aVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f179804b = e0Var;
            this.f179805c = context;
            this.f179806d = j8;
            this.f179807e = uVar;
            this.f179808f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f179804b, this.f179805c, this.f179806d, this.f179807e, this.f179808f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends qs1.b>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f179803a;
            if (i14 == 0) {
                o13.r.b(obj);
                pt1.u uVar = this.f179807e;
                int i15 = uVar.f140991f;
                this.f179803a = 1;
                aVar = this;
                obj = e0.a(this.f179804b, this.f179805c, this.f179806d, i15, uVar, aVar);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                aVar = this;
            }
            v2 v2Var = (v2) obj;
            aVar.f179808f.invoke();
            return v2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(List<pt1.u> list, e0 e0Var, Context context, long j8, e23.a<Unit> aVar, t13.d<? super g0> dVar) {
        super(2, dVar);
        this.f179798c = list;
        this.f179799d = e0Var;
        this.f179800e = context;
        this.f179801f = j8;
        this.f179802g = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g0 g0Var = new g0(this.f179798c, this.f179799d, this.f179800e, this.f179801f, this.f179802g, dVar);
        g0Var.f179797b = obj;
        return g0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends v2<? extends qs1.b>>> dVar) {
        return ((g0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f179797b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179796a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        List<pt1.u> list = this.f179798c;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f179799d, this.f179800e, this.f179801f, (pt1.u) it.next(), this.f179802g, null), 3));
        }
        this.f179797b = null;
        this.f179796a = 1;
        Object objO = g8.i.o(arrayList, this);
        return objO == aVar ? aVar : objO;
    }
}
