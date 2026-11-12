package sg2;

import android.app.Activity;
import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsg2/i;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f159244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f159245b;

    public i(Integer num, Activity activity) {
        this.f159244a = num;
        this.f159245b = activity;
    }

    @Override // p3.h0
    public final void dispose() {
        Integer num = this.f159244a;
        if (num != null) {
            this.f159245b.setRequestedOrientation(num.intValue());
        }
    }
}
