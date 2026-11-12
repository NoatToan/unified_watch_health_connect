package com.xiaomi.fitness.share;

import com.mibi.sdk.common.CommonConstants;
import com.miui.tsmclient.nfc.NfcConstants;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\tH\u0016J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0005H\u0005¢\u0006\u0002\b\u000fR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/share/BaseShareFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "saveSharePic", "", "shareToWX", CommonConstants.KEY_SESSION, "shareViaMore", NfcConstants.METHOD_SET_CONFIG, q.f13857a, "setConfig1", "getConfig", "(I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseShareFragment extends BaseFragment {
    private int config;

    public BaseShareFragment() {
        super(0, 1, null);
        this.config = 7;
    }

    public final int getConfig() {
        return this.config;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return 0;
    }

    public void saveSharePic() {
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    @JvmName(name = "setConfig1")
    public final void setConfig1(int config) {
        this.config = config;
    }

    public abstract void shareToWX(int session);

    public void shareViaMore() {
    }
}
