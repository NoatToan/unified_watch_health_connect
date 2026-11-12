package defpackage;

import android.widget.RemoteViews;
import com.hihonor.assistant.cardmgrsdk.model.ClickPendingIntent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class imt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ClickPendingIntent> f37843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteViews f37844b;
    private String e;

    public imt(String str) {
        this.e = str;
    }

    public RemoteViews e(WorkoutRecord workoutRecord, String str, String str2) {
        LogUtil.a("YoYoWidgetFitness", "generate called");
        RemoteViews remoteViewsC = c(workoutRecord);
        this.f37844b = remoteViewsC;
        if (remoteViewsC == null) {
            LogUtil.e("YoYoWidgetFitness", "generate RemoteViews is null");
            return null;
        }
        this.f37843a = iph.d(str, str2);
        LogUtil.a("YoYoWidgetFitness", "generate RemoteViews: ", this.e);
        return this.f37844b;
    }

    public static RemoteViews c(WorkoutRecord workoutRecord) {
        LogUtil.a("YoYoWidgetFitness", "updateRemoteViewsContent ");
        RemoteViews remoteViews = new RemoteViews(BaseApplication.b().getPackageName(), R.layout.layout_yoyo_widget);
        remoteViews.setTextViewText(R.id.honor_yoyo_text_time, new SimpleDateFormat("MM/dd HH:mm").format(new Date(workoutRecord.isFitnessRecordFromDevice() ? workoutRecord.startTime() : workoutRecord.acquireExerciseTime())));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_details_data, iph.e((int) workoutRecord.acquireActualCalorie()));
        int iAcquireAvgHeartRate = workoutRecord.acquireAvgHeartRate();
        if (iAcquireAvgHeartRate > 0) {
            remoteViews.setTextViewText(R.id.honor_yoyo_text_heart_data, String.valueOf(iAcquireAvgHeartRate));
        } else {
            LogUtil.a("YoYoWidgetFitness", "movement heartRate is zero ");
            remoteViews.setViewVisibility(R.id.honor_yoyo_image_heart, 8);
            remoteViews.setViewVisibility(R.id.honor_yoyo_text_heart_data, 8);
            remoteViews.setViewVisibility(R.id.honor_yoyo_text_heart_data_unit, 8);
        }
        remoteViews.setTextViewText(R.id.honor_yoyo_text_date, iph.b(workoutRecord.getDuration()));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_heat_data, BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_plugindameon_yoyo_times, 1, 1));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_average_pace_data, String.valueOf(workoutRecord.acquireDifficulty()));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_details, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_strength_training));
        remoteViews.setImageViewResource(R.id.card_chahua_bg, R.drawable.img_fitness_bg);
        remoteViews.setTextViewText(R.id.honor_yoyo_details_data_unit, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_date_title, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_time_spent));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_heat, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_number_times));
        remoteViews.setViewVisibility(R.id.honor_yoyo_text_heat_unit, 8);
        remoteViews.setTextViewText(R.id.honor_yoyo_text_average_pace, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_difficulty));
        return remoteViews;
    }

    public List<ClickPendingIntent> a() {
        return this.f37843a;
    }
}
