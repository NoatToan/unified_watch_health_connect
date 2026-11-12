package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class swg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static swg f48760a;

    public static swg d() {
        swg swgVar;
        synchronized (swg.class) {
            if (f48760a == null) {
                f48760a = new swg();
            }
            swgVar = f48760a;
        }
        return swgVar;
    }

    public FitnessSessionManager.SessionActivityAction a() {
        return new FitnessSessionManager.SessionActivityAction() { // from class: swg.2
            @Override // com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager.SessionActivityAction
            public void startSportHistoryActivity(Context context) {
                Intent intent = new Intent(context, (Class<?>) SportHistoryActivity.class);
                intent.setFlags(268435456);
                intent.putExtra(BleConstants.SPORT_TYPE, 10001);
                iov.d(context, intent);
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(0, R.anim.activity_no_animation_short);
                }
                swg.this.c(context, 10001, 0);
            }

            @Override // com.huawei.health.suggestion.ui.fitness.viewholder.FitnessSessionManager.SessionActivityAction
            public void startSportHistoryActivity(Context context, int i, int i2) {
                Intent intent = new Intent(context, (Class<?>) SportHistoryActivity.class);
                intent.setFlags(268435456);
                intent.putExtra(BleConstants.SPORT_TYPE, i);
                intent.putExtra("subSportType", i2);
                iov.d(context, intent);
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(0, R.anim.activity_no_animation_short);
                }
                swg.this.c(context, i, i2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context, final int i, final int i2) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: swo
            @Override // java.lang.Runnable
            public final void run() {
                swg.a(i, i2, context);
            }
        });
    }

    static /* synthetic */ void a(int i, int i2, Context context) {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(i));
        map.put("category", Integer.valueOf(i2));
        lmf.d().c(context, AnalyticsValue.HEALTH_HOME_GPS_HISTORY_2010015.value(), map, 0);
    }
}
