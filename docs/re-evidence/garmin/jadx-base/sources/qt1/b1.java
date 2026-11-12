package qt1;

import android.content.Context;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$updateReviewStateTimestamp$1", f = "TrailDetailsViewModel.kt", l = {990}, m = "invokeSuspend", v = 2)
public final class b1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f147543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f147544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(k kVar, long j8, Context context, t13.d<? super b1> dVar) {
        super(2, dVar);
        this.f147542b = kVar;
        this.f147543c = j8;
        this.f147544d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b1(this.f147542b, this.f147543c, this.f147544d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147541a;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = this.f147542b.f147674i;
            pt1.l lVarA = pt1.l.a((pt1.l) p2Var.getValue(), 0L, null, 0, this.f147543c, new pi0.e(this.f147544d).a(new DateTime(this.f147543c), qi0.a.YEAR_ABBREV_MONTH_DAY), null, false, null, null, null, null, false, 32671);
            this.f147541a = 1;
            p2Var.k(null, lVarA);
            if (Unit.INSTANCE == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
