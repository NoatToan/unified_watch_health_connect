package o5;

import android.os.CancellationSignal;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cause", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class d extends w implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f129148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CancellationSignal cancellationSignal) {
        super(1);
        this.f129148a = cancellationSignal;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        if (th3 != null) {
            this.f129148a.cancel();
        }
        return Unit.INSTANCE;
    }
}
