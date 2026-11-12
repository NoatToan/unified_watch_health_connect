package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$editReviewFromTrailDetails$1$1", f = "TrailDetailsViewModel.kt", l = {587, 596}, m = "invokeSuspend", v = 2)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f147836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f147837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k kVar, Context context, long j8, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f147835b = kVar;
        this.f147836c = context;
        this.f147837d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f147835b, this.f147836c, this.f147837d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r5.K4(r2, r8) == r0) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147834a;
        Context context = this.f147836c;
        k kVar = this.f147835b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f147834a = 1;
            obj = k.O4(kVar, context, this.f147837d, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            kVar.f147677l.setValue(((v2.b) v2Var).f47386a);
            kVar.E4(pt1.n.h.f140902a);
        } else if ((v2Var instanceof v2.a) && (num = ((v2.a) v2Var).f47384b) != null && num.intValue() == 404) {
            kVar.f147677l.setValue(null);
            kVar.E4(pt1.n.h.f140902a);
        } else {
            this.f147834a = 2;
        }
        return Unit.INSTANCE;
    }
}
