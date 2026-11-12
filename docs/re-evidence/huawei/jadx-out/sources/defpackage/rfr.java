package defpackage;

import com.huawei.ui.device.views.device.RoundProgressImageView;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class rfr implements Runnable {
    public final /* synthetic */ RoundProgressImageView d;

    public /* synthetic */ rfr(RoundProgressImageView roundProgressImageView) {
        this.d = roundProgressImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d();
    }
}
