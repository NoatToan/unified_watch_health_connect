package a3;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class k implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f706g;

    /* JADX WARN: Multi-variable type inference failed */
    public k(e23.p<? super p3.m, ? super Integer, Unit> pVar, h4.r rVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, o4.r1 r1Var, long j8, long j14) {
        this.f700a = pVar;
        this.f701b = rVar;
        this.f702c = pVar2;
        this.f703d = pVar3;
        this.f704e = r1Var;
        this.f705f = j8;
        this.f706g = j14;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            f.b(this.f700a, this.f701b, this.f702c, this.f703d, this.f704e, this.f705f, this.f706g, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
