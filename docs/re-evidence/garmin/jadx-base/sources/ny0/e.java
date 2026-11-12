package ny0;

import android.content.Context;
import android.content.Intent;
import c.q;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import sy0.k;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.summary.MultiDayActivitySummaryKt$multiDayActivitySummary$1$3$1$1", f = "MultiDayActivitySummary.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f128336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f128337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f128338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy0.a f128339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q<Intent, f.a> f128340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, p1<Boolean> p1Var, Context context, fy0.a aVar, q<Intent, f.a> qVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f128336a = kVar;
        this.f128337b = p1Var;
        this.f128338c = context;
        this.f128339d = aVar;
        this.f128340e = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f128336a, this.f128337b, this.f128338c, this.f128339d, this.f128340e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p1<Boolean> p1Var = this.f128337b;
        if (p1Var.getF182175a().booleanValue()) {
            String str = this.f128336a.f161233a;
            if (str.length() > 0) {
                Context context = this.f128338c;
                String string = context.getString(R.string.social_share_web_link);
                string.getClass();
                x0.f23314a.getClass();
                String str2 = x0.f23377da;
                str2.getClass();
                this.f128340e.a(this.f128339d.a(context, str, string, g2.f(str2)), null);
            }
            p1Var.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
