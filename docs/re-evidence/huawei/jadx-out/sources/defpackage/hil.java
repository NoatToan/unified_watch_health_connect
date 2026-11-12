package defpackage;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.ui.fitness.mvp.TrainDetailContract;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes31.dex */
public class hil extends UiCallback<Workout> {
    private WeakReference<TrainDetailContract.Ipresenter> d;

    @Override // com.huawei.basefitnessadvice.callback.UiCallback
    public void onFailure(int i, String str) {
    }

    public hil(TrainDetailContract.Ipresenter ipresenter) {
        this.d = null;
        this.d = new WeakReference<>(ipresenter);
    }

    @Override // com.huawei.basefitnessadvice.callback.UiCallback
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onSuccess(Workout workout) {
        if (workout == null) {
            LogUtil.j("TrainDetailRefreshDataCallback", "data in onSuccess is null");
            return;
        }
        WeakReference<TrainDetailContract.Ipresenter> weakReference = this.d;
        if (weakReference == null) {
            LogUtil.j("TrainDetailRefreshDataCallback", "mTrainDetail in onSuccess is null");
            return;
        }
        TrainDetailContract.Ipresenter ipresenter = weakReference.get();
        if (ipresenter == null) {
            LogUtil.j("TrainDetailRefreshDataCallback", "trainDetail in onSuccess is null");
        } else if (workout instanceof FitWorkout) {
            ipresenter.initTradeView((FitWorkout) workout);
        }
    }
}
