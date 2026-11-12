package sa;

import bb.g0;
import bb.x;

/* JADX INFO: loaded from: classes.dex */
public class m extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.o f158131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.media3.exoplayer.source.o oVar, g0 g0Var) {
        super(g0Var);
        this.f158131b = oVar;
    }

    @Override // bb.x, bb.g0
    public final long getDurationUs() {
        return this.f158131b.E;
    }
}
