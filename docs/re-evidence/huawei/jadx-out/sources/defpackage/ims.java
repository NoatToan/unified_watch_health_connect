package defpackage;

import android.widget.RemoteViews;
import com.hihonor.assistant.cardmgrsdk.model.ClickPendingIntent;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import health.compact.a.UnitUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ims {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ClickPendingIntent> f37841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteViews f37842b;
    private String e;

    public ims(String str) {
        this.e = str;
    }

    public RemoteViews d(HiTrackMetaData hiTrackMetaData, long j, String str, String str2) {
        LogUtil.a("YoYoWidgetMovement", "generate called: ", Long.valueOf(j));
        RemoteViews remoteViewsC = c(hiTrackMetaData, j);
        this.f37842b = remoteViewsC;
        if (remoteViewsC == null) {
            LogUtil.e("YoYoWidgetMovement", "generate RemoteViews is null");
            return null;
        }
        this.f37841a = iph.d(str, str2);
        LogUtil.a("YoYoWidgetMovement", "generate RemoteViews: ", this.e);
        return this.f37842b;
    }

    public static RemoteViews c(HiTrackMetaData hiTrackMetaData, long j) {
        LogUtil.a("YoYoWidgetMovement", "updateRemoteViewsContent ");
        RemoteViews remoteViews = new RemoteViews(BaseApplication.b().getPackageName(), R.layout.layout_yoyo_widget);
        remoteViews.setTextViewText(R.id.honor_yoyo_text_time, new SimpleDateFormat("MM/dd HH:mm").format(new Date(j)));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_details_data, a(hiTrackMetaData));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_average_pace_data, e(hiTrackMetaData));
        if (hiTrackMetaData.getAvgHeartRate() > 0) {
            remoteViews.setTextViewText(R.id.honor_yoyo_text_heart_data, String.valueOf(hiTrackMetaData.getAvgHeartRate()));
        } else {
            LogUtil.a("YoYoWidgetMovement", "movement heartRate is zero ");
            remoteViews.setViewVisibility(R.id.honor_yoyo_image_heart, 8);
            remoteViews.setViewVisibility(R.id.honor_yoyo_text_heart_data, 8);
            remoteViews.setViewVisibility(R.id.honor_yoyo_text_heart_data_unit, 8);
        }
        remoteViews.setTextViewText(R.id.honor_yoyo_text_date, iph.b(hiTrackMetaData.getTotalTime()));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_heat_data, iph.e(hiTrackMetaData.getTotalCalories()));
        if (hiTrackMetaData.getSportType() == 257 || hiTrackMetaData.getSportType() == 281) {
            remoteViews.setTextViewText(R.id.honor_yoyo_text_details, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_single_walk));
            remoteViews.setImageViewResource(R.id.card_chahua_bg, R.drawable.img_walk_bg);
        } else {
            remoteViews.setTextViewText(R.id.honor_yoyo_text_details, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_single_run));
            remoteViews.setImageViewResource(R.id.card_chahua_bg, R.drawable.card_chahuabg);
        }
        remoteViews.setTextViewText(R.id.honor_yoyo_details_data_unit, BaseApplication.b().getResources().getString(UnitUtil.d() ? R.string.IDS_band_data_sport_distance_unit_en : R.string.IDS_band_data_sport_distance_unit));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_date_title, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_exercise_time));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_heat, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_prefix));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_heat_unit, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit));
        remoteViews.setTextViewText(R.id.honor_yoyo_text_average_pace, BaseApplication.b().getResources().getString(R.string.IDS_plugindameon_yoyo_average_pace));
        return remoteViews;
    }

    private static String a(HiTrackMetaData hiTrackMetaData) {
        double totalDistance = ((double) hiTrackMetaData.getTotalDistance()) / 1000.0d;
        if (UnitUtil.d()) {
            return UnitUtil.e(UnitUtil.e(totalDistance, 3), 1, 2);
        }
        return UnitUtil.e(totalDistance, 1, 2);
    }

    private static String e(HiTrackMetaData hiTrackMetaData) {
        if (UnitUtil.d()) {
            return iph.b((float) iph.e(true, 3, hiTrackMetaData.getAvgPace()));
        }
        return iph.b(hiTrackMetaData.getAvgPace());
    }

    public List<ClickPendingIntent> c() {
        return this.f37841a;
    }
}
