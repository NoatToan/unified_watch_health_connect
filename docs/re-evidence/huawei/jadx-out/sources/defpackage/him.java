package defpackage;

import com.huawei.health.suggestion.ui.fitness.activity.TrainDetail;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class him implements IBaseResponseCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<TrainDetail> f36774c;
    private int e;

    public him(TrainDetail trainDetail, int i) {
        this.f36774c = new WeakReference<>(trainDetail);
        this.e = i;
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        WeakReference<TrainDetail> weakReference = this.f36774c;
        if (weakReference == null) {
            LogUtil.j("Suggestion_TrainDetail", "errorCode is not success", Integer.valueOf(i));
            return;
        }
        TrainDetail trainDetail = weakReference.get();
        if (trainDetail == null) {
            LogUtil.j("Suggestion_TrainDetail", "onResponse detail is null.");
        } else {
            if (i == 0) {
                if (this.e == 0) {
                    trainDetail.d();
                }
                trainDetail.finish();
                return;
            }
            LogUtil.j("Suggestion_TrainDetail", "errorCode is not success", Integer.valueOf(i));
        }
    }
}
