package defpackage;

import android.text.format.DateUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.adapter.BaseGroupDataAdapter;

/* JADX INFO: loaded from: classes19.dex */
public class vae extends BaseGroupDataAdapter.GroupData<vai> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50853c;

    public long c() {
        return this.f50853c;
    }

    public void d(long j) {
        this.f50853c = j;
    }

    @Override // com.huawei.ui.commonui.adapter.BaseGroupDataAdapter.GroupData
    public String getTitle() {
        return DateUtils.formatDateTime(BaseApplication.getContext(), this.f50853c, 36);
    }
}
