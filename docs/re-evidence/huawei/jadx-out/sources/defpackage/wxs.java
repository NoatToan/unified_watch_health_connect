package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.huawei.ui.thirdpartservice.activity.base.CheckConnectCallback;
import com.huawei.ui.thirdpartservice.activity.strava.StravaConnectActivity;
import com.huawei.ui.thirdpartservice.activity.strava.StravaHealthActivity;

/* JADX INFO: loaded from: classes20.dex */
public class wxs extends CheckConnectCallback {
    public wxs(Activity activity) {
        super(activity);
    }

    @Override // com.huawei.ui.thirdpartservice.activity.base.CheckConnectCallback
    public void startToDisConnectActivity(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) StravaHealthActivity.class));
    }

    @Override // com.huawei.ui.thirdpartservice.activity.base.CheckConnectCallback
    public void startToConnectActivity(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) StravaConnectActivity.class));
    }
}
