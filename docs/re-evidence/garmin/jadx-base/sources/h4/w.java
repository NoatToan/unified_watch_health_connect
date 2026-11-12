package h4;

import ch.qos.logback.core.CoreConstants;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import h5.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh4/w;", "Lh5/c0;", "Lh4/r$c;", "", "zIndex", "<init>", "(F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends r.c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f81586a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1 f81587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f81588b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1 v1Var, w wVar) {
            super(1);
            this.f81587a = v1Var;
            this.f81588b = wVar;
        }

        @Override // e23.l
        public final Unit invoke(v1.a aVar) {
            aVar.r(this.f81587a, 0, 0, this.f81588b.f81586a);
            return Unit.INSTANCE;
        }
    }

    public w(float f14) {
        this.f81586a = f14;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final a1 mo5measure3p2s80s(b1 b1Var, y0 y0Var, long j8) {
        v1 v1VarQ = y0Var.Q(j8);
        return b1.h0(b1Var, v1VarQ.f69144a, v1VarQ.f69145b, new a(v1VarQ, this));
    }

    public final String toString() {
        return q6.f.p(new StringBuilder("ZIndexModifier(zIndex="), this.f81586a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
