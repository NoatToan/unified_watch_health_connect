package defpackage;

import com.huawei.ui.commonui.dialog.ThreeCircleShareCallback;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class uia implements ThreeCircleShareCallback, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50117b;

    public /* synthetic */ uia(int i) {
        this.f50117b = i;
    }

    @Override // com.huawei.ui.commonui.dialog.ThreeCircleShareCallback
    public final void onCallback(boolean z) {
        uhu.e(this.f50117b, z);
    }
}
