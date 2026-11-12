package og2;

import org.koin.core.component.KoinComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Log2/v0;", "Log2/i0;", "Lorg/koin/core/component/KoinComponent;", "", "usingMetric", "<init>", "(Z)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends i0 implements KoinComponent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f132136b;

    public v0(boolean z14) {
        this.f132136b = z14;
    }

    @Override // og2.i0
    public final String a(float f14) {
        return b().h().f3292a.r(Float.valueOf(f14), this.f132136b);
    }
}
