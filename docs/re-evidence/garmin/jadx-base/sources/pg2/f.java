package pg2;

import android.app.Activity;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpg2/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f137643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f137644b;

    public f(Integer num, Activity activity) {
        this.f137643a = num;
        this.f137644b = activity;
    }

    @Override // p3.h0
    public final void dispose() {
        Integer num = this.f137643a;
        if (num != null) {
            this.f137644b.setRequestedOrientation(num.intValue());
        }
    }
}
