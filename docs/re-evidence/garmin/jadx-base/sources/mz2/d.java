package mz2;

import e23.l;
import o53.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
public final class d extends w implements l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c83.d f122008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, c83.d dVar) {
        super(1);
        this.f122007a = rVar;
        this.f122008b = dVar;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        if (this.f122007a.isCancelled()) {
            this.f122008b.cancel();
        }
        return Unit.INSTANCE;
    }
}
