package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.timepicker.HealthTimePicker;
import com.huawei.ui.homehealth.R;
import health.compact.a.SharedPreferenceManager;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class tfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f49053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GroupBtnSelectedAdapter f49054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f49055c;
    private HealthTimePicker d;
    private boolean[] e = new boolean[7];
    private UiCallback h = new UiCallback<Map<String, String>>() { // from class: tfg.3
        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Track_RemindSettingDialogUtil", "mSwitchUiCallback onFailure");
            tfg.this.a();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Map<String, String> map) {
            LogUtil.a("Track_RemindSettingDialogUtil", "mSwitchUiCallback onSuccess");
            if (map == null) {
                LogUtil.j("Track_RemindSettingDialogUtil", "onSuccess data == null ");
                return;
            }
            tfg.this.f49053a = map.get("sport_remind_switch_status");
            LogUtil.a("Track_RemindSettingDialogUtil", "mSwitchStatus ", tfg.this.f49053a);
            tfg.this.a();
        }
    };
    private Handler i = new Handler() { // from class: tfg.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("Track_RemindSettingDialogUtil", "message is null.");
                return;
            }
            super.handleMessage(message);
            if (message.what != 200) {
                return;
            }
            tfg.this.b();
        }
    };

    public void e(Context context) {
        LogUtil.a("Track_RemindSettingDialogUtil", "initReminderDialog Enter");
        this.f49055c = context;
        String strE = SharedPreferenceManager.e(context, Integer.toString(20002), "is_reminder_dialog_shown");
        LogUtil.a("Track_RemindSettingDialogUtil", "initReminderDialog isFirstInit ", strE);
        if (strE == null || "".equals(strE) || Boolean.toString(Boolean.TRUE.booleanValue()).equals(strE)) {
            szr.e((UiCallback<Map<String, String>>) this.h);
            SharedPreferenceManager.e(context, Integer.toString(20002), "is_reminder_dialog_shown", Boolean.toString(Boolean.FALSE.booleanValue()), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("Track_RemindSettingDialogUtil", "initRemindPeriodArrayData ", this.f49053a);
        if (!TextUtils.isEmpty(this.f49053a)) {
            return;
        }
        int i = 0;
        while (true) {
            boolean[] zArr = this.e;
            if (i < zArr.length) {
                zArr[i] = i != 5;
                i++;
            } else {
                this.i.sendEmptyMessage(200);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("Track_RemindSettingDialogUtil", "showSportReminderSettingDialog enter ");
        View viewInflate = LayoutInflater.from(this.f49055c).inflate(R.layout.dialog_reminder_setting_view, (ViewGroup) null);
        this.d = (HealthTimePicker) viewInflate.findViewById(R.id.sport_remind_edit_time_pick);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 18);
        calendar.set(12, 30);
        this.d.setTime(calendar.get(11), calendar.get(12));
        c(viewInflate, new String[]{this.f49055c.getString(com.huawei.ui.device.R.string.IDS_monday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_tuesday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_wednesday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_thursday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_friday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_saturday), this.f49055c.getString(com.huawei.ui.device.R.string.IDS_sunday)});
        this.f49054b.d(new GroupBtnSelectedAdapter.OnItemClickListener() { // from class: tfg.1
            @Override // com.huawei.ui.commonui.adapter.GroupBtnSelectedAdapter.OnItemClickListener
            public void onItemClick(View view, HealthButton healthButton, int i) {
                boolean[] zArr = (boolean[]) tfg.this.e.clone();
                zArr[i] = !zArr[i];
                for (int i2 = 0; i2 < 7; i2++) {
                    boolean z = zArr[i2];
                }
                tfg.this.e[i] = !tfg.this.e[i];
                tfg.this.f49054b.d(view, healthButton, i);
            }
        });
        d(viewInflate);
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("type", 2);
        lmf.d().c(this.f49055c, AnalyticsValue.REMIND_DIALOG_SHOW_COUNT.value(), map, 0);
    }

    private void d(View view) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f49055c);
        builder.d(view).d(R.string.IDS_social_clearup_storage_button_finish, new View.OnClickListener() { // from class: tfg.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        }).c(R.string.IDS_track_not_edit, new View.OnClickListener() { // from class: tfg.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                buh.d("is_reminder_dialog_click", String.valueOf(true));
                HashMap map = new HashMap(2);
                map.put("click", 1);
                map.put("type", 2);
                lmf.d().c(tfg.this.f49055c, AnalyticsValue.REMIND_DIALOG_SELECT_BUTTON_DO_NOT_SET.value(), map, 0);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.show();
        customViewDialogD.setCanceledOnTouchOutside(false);
        a(builder, customViewDialogD);
    }

    private void c(View view, String[] strArr) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.period_reminder_layout);
        final Context context = this.f49055c;
        final int i = 4;
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i) { // from class: com.huawei.ui.homehealth.util.RemindSettingDialogUtil$6
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        healthRecycleView.setLayoutManager(gridLayoutManager);
        GroupBtnSelectedAdapter groupBtnSelectedAdapter = new GroupBtnSelectedAdapter(this.f49055c, strArr, this.e);
        this.f49054b = groupBtnSelectedAdapter;
        groupBtnSelectedAdapter.c(this.f49055c.getResources().getDrawable(R.drawable.train_date_unselect_bg), this.f49055c.getResources().getColor(R.color.textColorPrimary));
        this.f49054b.d(this.f49055c.getResources().getDrawable(R.drawable.train_date_selected_bg), this.f49055c.getResources().getColor(R.color.textColorPrimaryInverse));
        healthRecycleView.setAdapter(this.f49054b);
        healthRecycleView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: tfg.7
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                GridLayoutManager gridLayoutManager2 = gridLayoutManager;
                if (gridLayoutManager2 == null || gridLayoutManager2.getSpanCount() <= 1) {
                    return;
                }
                int spanCount = gridLayoutManager.getSpanCount();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                int dimensionPixelSize = tfg.this.f49055c.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_16dp);
                int dimensionPixelSize2 = tfg.this.f49055c.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.dialog_btn_padding_left_right);
                if (childAdapterPosition < spanCount) {
                    rect.bottom = dimensionPixelSize2;
                } else {
                    rect.top = dimensionPixelSize2;
                }
                int i2 = ((spanCount - 1) * dimensionPixelSize) / spanCount;
                int i3 = (childAdapterPosition % spanCount) * (dimensionPixelSize - i2);
                rect.left = i3;
                rect.right = i2 - i3;
            }
        });
    }

    private void a(CustomViewDialog.Builder builder, final CustomViewDialog customViewDialog) {
        builder.b().setOnClickListener(new View.OnClickListener() { // from class: tfg.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z = true;
                buh.d("is_reminder_dialog_click", String.valueOf(true));
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < tfg.this.e.length; i++) {
                    if (tfg.this.e[i]) {
                        sb.append((i + 1) + "_");
                        z = false;
                    }
                }
                if (z) {
                    qpx.e(tfg.this.f49055c, R.string.IDS_track_remind_period_tips);
                } else {
                    tfg.this.d(sb, customViewDialog);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(StringBuilder sb, CustomViewDialog customViewDialog) {
        String string = sb.toString();
        String strSubstring = string.substring(0, string.length() - 1);
        SharedPreferenceManager.e(this.f49055c, Integer.toString(20002), "sport_remind_reminder_period", strSubstring, null);
        String string2 = Integer.toString((this.d.getHour() * 3600) + (this.d.getMinute() * 60));
        SharedPreferenceManager.e(this.f49055c, Integer.toString(20002), "sport_remind_reminder_time", string2, null);
        SharedPreferenceManager.e(this.f49055c, Integer.toString(20002), "sport_remind_is_opened", "1", null);
        HashMap map = new HashMap();
        map.put("sport_remind_switch_status", "1");
        map.put("sport_remind_period", strSubstring);
        map.put("sport_remind_time", string2);
        szr.d(map);
        customViewDialog.dismiss();
        szr.e(this.f49055c);
        HashMap map2 = new HashMap(2);
        map2.put("click", 1);
        map2.put("type", 2);
        lmf.d().c(this.f49055c, AnalyticsValue.REMIND_DIALOG_SELECT_BUTTON_DONE.value(), map2, 0);
        HashMap map3 = new HashMap(4);
        map3.put("click", 1);
        map3.put("type", 1);
        map3.put("time", string2);
        map3.put(TypedValues.CycleType.S_WAVE_PERIOD, strSubstring);
        lmf.d().c(this.f49055c, AnalyticsValue.REMIND_SPORT_SELECT_TIME_AND_PERIOD.value(), map3, 0);
    }
}
