package fg;

import com.alipay.sdk.app.PayTask;
import nh.i;

/* JADX INFO: loaded from: classes7.dex */
public class e implements i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayTask f71205a;

    public e(PayTask payTask) {
        this.f71205a = payTask;
    }

    @Override // nh.i.c
    public final void a() {
        this.f71205a.dismissLoading();
    }
}
