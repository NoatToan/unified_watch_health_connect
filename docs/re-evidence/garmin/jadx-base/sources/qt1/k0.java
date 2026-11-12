package qt1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.viewmodel.TrailDetailsViewModel$reportIssue$1", f = "TrailDetailsViewModel.kt", l = {475, 485, 489, 496, 499}, m = "invokeSuspend", v = 2)
public final class k0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f147734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f147735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1.g f147736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f147737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(k kVar, pt1.g gVar, Context context, t13.d<? super k0> dVar) {
        super(2, dVar);
        this.f147735b = kVar;
        this.f147736c = gVar;
        this.f147737d = context;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k0(this.f147735b, this.f147736c, this.f147737d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r2.a(r10, r38) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        if (p005kotlin.Unit.INSTANCE == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        if (r8.K4(r9, r38) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r8.K4(r9, r38) == r1) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objN2;
        us1.l lVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f147734a;
        k kVar = this.f147735b;
        if (i14 != 0) {
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
        }
        o13.r.b(obj);
        kVar.Q4(true);
        ss1.a aVar2 = kVar.f147666a;
        pt1.g gVar = this.f147736c;
        long j8 = gVar.f140845a;
        us1.d dVar = gVar.f140848d;
        if (dVar == null || (lVar = dVar.f172381b) == null || (str = lVar.f172437a) == null) {
            str = us1.l.MAPPING.f172437a;
        }
        qs1.b0 b0Var = new qs1.b0(j8, str, gVar.f140847c, gVar.f140849e, g22.n.g(kVar.f147671f.b()));
        this.f147734a = 1;
        objN2 = aVar2.n2(b0Var, this);
        if (objN2 != aVar) {
        }
        return aVar;
        v2 v2Var = (v2) objN2;
        boolean z14 = v2Var instanceof v2.b;
        Context context = this.f147737d;
        if (z14) {
            vs1.h hVar = kVar.f147668c;
            pt1.k kVar2 = new pt1.k(context.getString(R.string.snackbar_notification_report_submitted), null, null, 6, null);
            this.f147734a = 2;
        } else if (v2Var instanceof v2.a) {
            Integer num = ((v2.a) v2Var).f47384b;
            if (num != null && num.intValue() == 429) {
                p2 p2Var = kVar.f147673h;
                pt1.o oVarA = pt1.o.a((pt1.o) p2Var.getValue(), false, null, false, true, R.string.issue_report_limit_reached_message, false, false, null, 0, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, 1073741727);
                this.f147734a = 3;
                p2Var.k(null, oVarA);
            } else {
                this.f147734a = 4;
            }
        } else {
            this.f147734a = 5;
        }
        return aVar;
    }
}
