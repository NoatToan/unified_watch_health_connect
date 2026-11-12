package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "Lcom/garmin/android/apps/connectmobile/v2;", "Lqs1/b;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$updateTrailReviewPhotos$uploadJob$1", f = "TrailDetailsViewModel.kt", l = {853}, m = "invokeSuspend", v = 2)
public final class d1 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends v2<? extends qs1.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f147592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f147593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f147594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f147595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<pt1.u> f147596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.r0<pt1.e> f147597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(k kVar, Context context, long j8, List<pt1.u> list, p005kotlin.jvm.internal.r0<pt1.e> r0Var, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f147593c = kVar;
        this.f147594d = context;
        this.f147595e = j8;
        this.f147596f = list;
        this.f147597g = r0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d1 d1Var = new d1(this.f147593c, this.f147594d, this.f147595e, this.f147596f, this.f147597g, dVar);
        d1Var.f147592b = obj;
        return d1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends v2<? extends qs1.b>>> dVar) {
        return ((d1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f147592b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147591a;
        int i15 = 1;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        k kVar = this.f147593c;
        vs1.e0 e0Var = kVar.f147685v;
        v0 v0Var = new v0(b0Var, kVar, this.f147597g, i15);
        this.f147592b = null;
        this.f147591a = 1;
        e0Var.getClass();
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new vs1.g0(this.f147596f, e0Var, this.f147594d, this.f147595e, v0Var, null), this);
        return objE0 == aVar ? aVar : objE0;
    }
}
