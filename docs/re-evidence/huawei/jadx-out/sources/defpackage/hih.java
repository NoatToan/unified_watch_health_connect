package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.content.res.ResourcesCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.TrainDetail;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.imageview.HealthImageView;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hih extends UiCallback<List<?>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<TrainDetail> f36766c;

    public hih(TrainDetail trainDetail) {
        this.f36766c = new WeakReference<>(trainDetail);
    }

    @Override // com.huawei.basefitnessadvice.callback.UiCallback
    public void onFailure(int i, String str) {
        LogUtil.a("TrainDetailFaDeviceUiCallback", "the errorCode:", Integer.valueOf(i), " the errorInfo: ", str);
    }

    @Override // com.huawei.basefitnessadvice.callback.UiCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSuccess(List<?> list) {
        if (njy.e(list)) {
            return;
        }
        final TrainDetail trainDetail = this.f36766c.get();
        if (trainDetail == null || trainDetail.isFinishing() || trainDetail.isDestroyed()) {
            LogUtil.j("TrainDetailFaDeviceUiCallback", "trainDetail is null or destroyed, not need to pop Dialog");
            return;
        }
        View viewInflate = LayoutInflater.from(trainDetail).inflate(R.layout.view_circulating_bubble, (ViewGroup) null);
        d(viewInflate, trainDetail);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSoftInputMode(16);
        popupWindow.setOutsideTouchable(false);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: hii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hih.e(trainDetail, popupWindow, view);
            }
        });
        popupWindow.showAtLocation(viewInflate, 48, 0, qrs.s(trainDetail) + qrs.d((Context) trainDetail, 8.0f));
        b(trainDetail.a().acquireWorkoutId(), trainDetail.a().acquireWorkoutName(), "0");
        SharedPreferenceManager.c("fit_SharedPreference", "showFaRemindTime", System.currentTimeMillis());
        trainDetail.b().postDelayed(new Runnable() { // from class: hij
            @Override // java.lang.Runnable
            public final void run() {
                popupWindow.dismiss();
            }
        }, 6000L);
    }

    static /* synthetic */ void e(TrainDetail trainDetail, PopupWindow popupWindow, View view) {
        trainDetail.b().sendMessage(trainDetail.b().obtainMessage(108));
        popupWindow.dismiss();
        SharedPreferenceManager.c("fit_SharedPreference", "clickFaRemindTime", System.currentTimeMillis());
        b(trainDetail.a().acquireWorkoutId(), trainDetail.a().acquireWorkoutName(), "1");
    }

    public static boolean b() {
        return SharedPreferenceManager.d("fit_SharedPreference", "clickFaRemindTime", 0L) != 0 || System.currentTimeMillis() - SharedPreferenceManager.d("fit_SharedPreference", "showFaRemindTime", 0L) >= 86400000;
    }

    public static void b(String str, String str2, String str3) {
        HashMap map = new HashMap(4);
        map.put("click", "1");
        map.put("event", str3);
        map.put("workout_id", str);
        map.put("workout_name", str2);
        idy.b(AnalyticsValue.EVENT_FA_REMIND_1130062.value(), map);
    }

    private void d(View view, TrainDetail trainDetail) {
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.bubble_from_image);
        HealthImageView healthImageView2 = (HealthImageView) view.findViewById(R.id.bubble_to_image);
        HealthImageView healthImageView3 = (HealthImageView) view.findViewById(R.id.bubble_connection_image);
        boolean zAh = qrs.ah(BaseApplication.getContext());
        if (qqs.e(BaseApplication.getContext())) {
            view.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.bg_circulating_bubble_dark, null));
        } else {
            view.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.bg_circulating_bubble, null));
        }
        if (zAh) {
            healthImageView.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.ic_public_device_pad, null));
        } else {
            healthImageView.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.ic_public_devices_phone, null));
        }
        healthImageView2.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.ic_public_smartscreen, null));
        healthImageView3.setBackground(ResourcesCompat.getDrawable(trainDetail.getResources(), R.drawable.connection, null));
    }
}
