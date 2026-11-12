package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.DataApi;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.UiCallback;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ugp implements DataApi {
    private Handler e = new Handler(Looper.getMainLooper());

    @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.DataApi
    public void downloadWorkoutMediaFiles(UiCallback<String> uiCallback) {
        List<ugv> listC = ugo.c();
        LogUtil.a("DataImpl", "downloadWorkoutMediaFiles files");
        b(listC, 10485760L, uiCallback);
    }

    public void b(List<ugv> list, long j, UiCallback<String> uiCallback) {
        if (ugq.a(list) == null) {
            uiCallback.onSuccess(this.e, "");
        } else {
            LogUtil.a("DataImpl", "DownloadTask");
            new ugu(list, j, uiCallback).b();
        }
    }
}
