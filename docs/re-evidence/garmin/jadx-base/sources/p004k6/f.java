package p004k6;

import e23.p;
import h4.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class f extends w implements p<m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f103034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<m, Integer, Unit> f103035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f103036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f103037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(r rVar, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
        super(2);
        this.f103034a = rVar;
        this.f103035b = pVar;
        this.f103036c = i14;
        this.f103037d = i15;
    }

    @Override // e23.p
    public final Unit invoke(m mVar, Integer num) {
        num.intValue();
        int iT = p0.t(this.f103036c | 1);
        int i14 = this.f103037d;
        c.b(this.f103034a, this.f103035b, mVar, iT, i14);
        return Unit.INSTANCE;
    }
}
