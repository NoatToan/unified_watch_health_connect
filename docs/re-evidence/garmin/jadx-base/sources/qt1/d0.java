package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$insertUserSuggestion$1", f = "TrailDetailsViewModel.kt", l = {423, 432, 436, 443, 446}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.m f147589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f147590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k kVar, pt1.m mVar, Context context, t13.d<? super d0> dVar) {
        super(2, dVar);
        this.f147588b = kVar;
        this.f147589c = mVar;
        this.f147590d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d0(this.f147588b, this.f147589c, this.f147590d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r2.a(r10, r38) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e9, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f2, code lost:
    
        if (r8.K4(r9, r38) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fb, code lost:
    
        if (r8.K4(r9, r38) == r1) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objN2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147587a;
        k kVar = this.f147588b;
        if (i14 == 0) {
            o13.r.b(obj);
            kVar.Q4(true);
            ss1.a aVar2 = kVar.f147666a;
            pt1.m mVar = this.f147589c;
            qs1.b0 b0Var = new qs1.b0(mVar.f140889a, us1.l.DESCRIPTION.f172437a, mVar.f140891c, false, g22.n.g(kVar.f147671f.b()), 8, null);
            this.f147587a = 1;
            objN2 = aVar2.n2(b0Var, this);
            if (objN2 != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objN2 = obj;
        } else if (i14 == 2) {
            o13.r.b(obj);
            kVar.I4();
        } else {
            if (i14 != 3 && i14 != 4 && i14 != 5) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        kVar.Q4(false);
        return Unit.INSTANCE;
        v2 v2Var = (v2) objN2;
        boolean z14 = v2Var instanceof v2.b;
        Context context = this.f147590d;
        if (z14) {
            vs1.h hVar = kVar.f147668c;
            pt1.k kVar2 = new pt1.k(context.getString(R.string.snackbar_notification_suggestion_added), null, null, 6, null);
            this.f147587a = 2;
        } else if (v2Var instanceof v2.a) {
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 429) {
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, true, R.string.trail_suggestion_limit_reached, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741727);
                this.f147587a = 3;
                p2Var.k(null, oVarA);
            } else {
                this.f147587a = 4;
            }
        } else {
            this.f147587a = 5;
        }
        return aVar;
    }
}
