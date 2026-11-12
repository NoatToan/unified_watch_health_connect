package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.HealthDataInputDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriod;
import com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.activity.healthdata.BloodSugarHistoryActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.InputBloodSugarActivity;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract;
import com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uxd extends HealthDetailCommonActivityPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Long f50688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Long f50689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static H5ProLaunchOption f50690c;
    private static String d;
    private static String e;
    private Long f;
    private double g;
    private Long h;
    private int i;
    private int j;
    private LastTimeHealthDataReader k;
    private HealthRadioButton[] l;
    private int m;
    private Handler n;
    private int o;
    private HealthTextView p;
    private int q;
    private LinearLayout r;
    private long s;
    private BloodSugarTimePeriodView t;
    private HealthToolBar w;

    static /* synthetic */ void a(View view) {
    }

    public uxd() {
        super("Main_BloodSugarActivityPresenter");
        this.j = 0;
        this.i = 0;
        this.o = -1;
        this.m = 0;
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void getLastDataTimestamp(IBaseResponseCallback iBaseResponseCallback) {
        a(iBaseResponseCallback);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void initToolBar() {
        b();
        this.f = Long.valueOf(System.currentTimeMillis());
        i();
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter, com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void setChartStartTimeAndEndTime(long j, long j2) {
        f50688a = Long.valueOf(j);
        f50689b = Long.valueOf(j2);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter, com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void notifyChartDateStatus(DateType dateType, boolean z, boolean z2) {
        y();
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter, com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityPresenter
    public void notifyViewPagerChange(int i) {
        this.j = i;
        b();
        y();
    }

    private void i() {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            ReleaseLogUtil.d("Main_BloodSugarActivityPresenter", "init detailActivityView is null");
            return;
        }
        Context viewContext = view.getViewContext();
        if (viewContext == null) {
            ReleaseLogUtil.d("Main_BloodSugarActivityPresenter", "init context is null");
            return;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo != null) {
            d = userInfo.getName();
        }
        e = CommonUtil.z();
        if (this.w == null) {
            HealthToolBar healthToolBar = view.getHealthToolBar();
            this.w = healthToolBar;
            if (healthToolBar != null) {
                healthToolBar.d(qre.a(viewContext, R.layout.hw_toolbar_bottomview, (ViewGroup) null));
            }
            t();
        }
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR);
        if (njy.e(arrayListD) || arrayListD.size() == 0) {
            j();
        } else {
            y();
        }
    }

    public void e() {
        if (getView() == null || getView().getViewContext() == null) {
            LogUtil.j("Main_BloodSugarActivityPresenter", "getView is null || getViewContext is null");
            return;
        }
        Context viewContext = getView().getViewContext();
        if (String.valueOf(false).equals(uvz.d(viewContext, "IS_FIRST_ENTRY_BLOOD_SUGAR"))) {
            return;
        }
        View viewInflate = LayoutInflater.from(viewContext).inflate(R.layout.blood_sugar_first_entry_guide, (ViewGroup) null);
        if (LanguageUtil.ba(viewContext)) {
            viewInflate.setBackgroundResource(R.drawable.blood_sugar_first_entry_guide_mirror);
        } else {
            viewInflate.setBackgroundResource(R.drawable.blood_sugar_first_entry_guide);
        }
        b(viewContext, viewInflate);
    }

    private void b(final Context context, View view) {
        int i;
        final int iD = qrs.d(context, 220.0f);
        final PopupWindow popupWindow = new PopupWindow(view, iD, -2, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSoftInputMode(16);
        popupWindow.setOutsideTouchable(false);
        final TextView textView = (TextView) view.findViewById(R.id.blood_sugar_first_entry_guide_content);
        textView.setOnClickListener(new View.OnClickListener() { // from class: uxc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                popupWindow.dismiss();
            }
        });
        int iD2 = qrs.d(context, 24.0f);
        int iD3 = qrs.d(context, 24.0f);
        if (LanguageUtil.ba(context)) {
            i = (-iD2) / 2;
        } else {
            i = ((iD2 * 3) / 2) - iD;
        }
        final int i2 = i;
        view.measure(0, 0);
        final int measuredHeight = view.getMeasuredHeight();
        final int iD4 = ((-measuredHeight) - qrs.d(context, 8.0f)) - iD3;
        final ImageView imageView = (ImageView) this.w.e(3).findViewById(R.id.toolbar_imageView);
        uvz.d(context, "IS_FIRST_ENTRY_BLOOD_SUGAR", String.valueOf(false));
        popupWindow.showAsDropDown(imageView, i2, iD4);
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: uxd.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int height = textView.getHeight();
                int iD5 = measuredHeight - qrs.d(context, 28.0f);
                if (height > iD5) {
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    popupWindow.update(imageView, i2, (iD4 - height) + iD5, iD, -2);
                }
            }
        });
    }

    private void t() {
        if (this.w == null) {
            LogUtil.e("Main_BloodSugarActivityPresenter", "mToolBar is null");
        } else {
            l();
            this.w.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: uxt
                @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
                public final void onSingleTap(int i) {
                    this.f50715a.a(i);
                }
            });
        }
    }

    /* synthetic */ void a(int i) {
        if (i == 0) {
            login(String.valueOf(i), AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_DETAIL_RECORD_2030031.value());
            return;
        }
        if (i == 1) {
            login(String.valueOf(i), AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_DETAIL_MEASURE_2030032.value());
        } else if (i == 3) {
            login(String.valueOf(i), "");
        } else {
            if (i != 4) {
                return;
            }
            a(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), "1");
            iov.d(getView().getViewContext(), new Intent(getView().getViewContext(), (Class<?>) BloodSugarHistoryActivity.class));
        }
    }

    private void l() {
        HealthToolBar healthToolBar = this.w;
        healthToolBar.setIconTitle(0, healthToolBar.getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_input));
        this.w.setIconVisible(0, 8);
        HealthToolBar healthToolBar2 = this.w;
        healthToolBar2.setIconTitle(1, healthToolBar2.getResources().getString(R.string.IDS_hw_show_main_health_page_healthdata_bloodpresure_mesure));
        this.w.setIconVisible(1, 8);
        HealthToolBar healthToolBar3 = this.w;
        healthToolBar3.setIconTitle(4, healthToolBar3.getResources().getString(R.string.IDS_hw_base_health_data_history_record));
        HealthToolBar healthToolBar4 = this.w;
        healthToolBar4.setIconTitle(3, healthToolBar4.getResources().getString(R.string.IDS_w_m_t_diet_diary));
        this.w.setIconVisible(3, 0);
        Context contextB = BaseApplication.b();
        if (LanguageUtil.ba(contextB)) {
            this.w.setIcon(0, qqz.e(contextB, R.drawable.ic_public_detection));
            this.w.setIcon(1, qqz.e(contextB, R.drawable.ic_celiang));
            this.w.setIcon(4, qqz.e(contextB, R.drawable.ic_record));
            this.w.setIcon(3, qqz.e(contextB, R.drawable.ic_diet_diary));
            return;
        }
        this.w.setIcon(0, R.drawable.ic_public_detection);
        this.w.setIcon(1, R.drawable.ic_celiang);
        this.w.setIcon(4, R.drawable.ic_record);
        this.w.setIcon(3, R.drawable.ic_diet_diary);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public void onLogined(String str) {
        if (String.valueOf(1).equals(str)) {
            a();
            return;
        }
        if (String.valueOf(0).equals(str)) {
            x();
            return;
        }
        if (String.valueOf(3).equals(str)) {
            if (this.j == 0 && n()) {
                s();
                return;
            } else {
                a((String) null);
                return;
            }
        }
        if ("BLOOD_SUGAR_INPUT_DIALOG".equals(str)) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "position=INPUT_DIALOG_KEY");
            h();
        } else {
            LogUtil.j("Main_BloodSugarActivityPresenter", "unknow position=", str);
        }
    }

    private void x() {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        e(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_DETAIL_RECORD_2030031.value());
        a(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), "5");
        iov.d(view.getViewContext(), new Intent(view.getViewContext(), (Class<?>) InputBloodSugarActivity.class));
    }

    private void a() {
        if (e((IBaseResponseCallback) null, 0L) > 0) {
            v();
        } else {
            q();
        }
    }

    private void j() {
        HealthToolBar healthToolBar = this.w;
        if (healthToolBar == null) {
            LogUtil.e("Main_BloodSugarActivityPresenter", "mToolBar is null");
            return;
        }
        healthToolBar.setIconVisible(0, 0);
        if (EnvironmentInfo.m()) {
            this.w.setIconVisible(1, 8);
        } else {
            this.w.setIconVisible(1, 0);
        }
        this.w.setIconVisible(4, 8);
    }

    private void v() {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        e(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_DETAIL_MEASURE_2030032.value());
        a(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), "6");
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.d());
        intent.setClassName(BaseApplication.d(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("kind", "HDK_BLOOD_SUGAR");
        intent.putExtra("view", "MeasureDevice");
        iov.d(view.getViewContext(), intent);
    }

    private void q() {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(view.getViewContext());
        builder.a(view.getViewContext().getString(R.string.IDS_hw_plugin_device_selection_click_bind_my_device_select)).a(view.getViewContext().getString(R.string.IDS_hw_health_show_common_dialog_ok_button), new View.OnClickListener() { // from class: uxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50712b.i(view2);
            }
        }).d(view.getViewContext().getString(R.string.IDS_hw_health_show_common_dialog_cancle_button), new View.OnClickListener() { // from class: uxq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                LogUtil.d("Main_BloodSugarActivityPresenter", "showBindDialog click negative view");
            }
        });
        builder.c().show();
    }

    /* synthetic */ void i(View view) {
        u();
    }

    private void e(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(getView().getViewContext(), str, map, 0);
    }

    private static void a(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", str2);
        lmf.d().c(BaseApplication.b(), str, map, 0);
    }

    private void u() {
        e(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_DETAIL_BIND_2030033.value());
        a(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), "6");
        etn.a(getView().getViewContext(), "HDK_BLOOD_SUGAR");
    }

    public int e(IBaseResponseCallback iBaseResponseCallback, long j) {
        ArrayList<String> arrayListD = drw.e().d(HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR);
        int size = !njy.e(arrayListD) ? arrayListD.size() : 0;
        if (iBaseResponseCallback != null) {
            if (size == 0) {
                iBaseResponseCallback.a(-1, Long.valueOf(j));
                j();
                return size;
            }
            iBaseResponseCallback.a(0, Long.valueOf(j));
            LogUtil.d("Main_BloodSugarActivityPresenter", "has Device");
        }
        return size;
    }

    private void a(final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Main_BloodSugarActivityPresenter", "getBloodSugar last data timestamp : callback ==null");
            return;
        }
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        Context viewContext = view.getViewContext();
        if (viewContext instanceof BaseActivity) {
            if (this.k == null) {
                this.k = new LastTimeHealthDataReader((BaseActivity) viewContext, new IBaseResponseCallback() { // from class: uxs
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.e.a(iBaseResponseCallback, i, obj);
                    }
                });
            }
            this.k.b(LastTimeHealthDataReader.CardData.BLOOD_SUGAR);
        }
    }

    /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        if (obj instanceof HiHealthData) {
            iBaseResponseCallback.a(0, Long.valueOf(((HiHealthData) obj).getStartTime()));
            return;
        }
        LogUtil.a("Main_BloodSugarActivityPresenter", "objData not instanceof HiHealthData");
        e(iBaseResponseCallback, 1L);
        p();
    }

    private boolean k() {
        if (e((IBaseResponseCallback) null, 0L) > 0) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "has device");
            return false;
        }
        if (wvf.a(Integer.toString(10054), "BLOOD_SUGAR_INPUT_DIALOG", 604800000L)) {
            return true;
        }
        LogUtil.a("Main_BloodSugarActivityPresenter", "not to showBloodSugarInputDialog, cause not over four week");
        return false;
    }

    private void p() {
        if (k()) {
            HealthDataInputDialog.DataSetFormatter dataSetFormatter = new HealthDataInputDialog.DataSetFormatter() { // from class: uxv
                @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.DataSetFormatter
                public final String format(int i) {
                    return UnitUtil.e(i, 1, 0);
                }
            };
            HealthDataInputDialog.SelectedValueProcessor selectedValueProcessor = new HealthDataInputDialog.SelectedValueProcessor() { // from class: uxd.1
                @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
                public int process(int i, int i2) {
                    return i;
                }

                @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.SelectedValueProcessor
                public String format(int i) {
                    return UnitUtil.e((i * 0.1f) + 1.0f, 1, 1);
                }
            };
            final Context viewContext = getView().getViewContext();
            HealthDataInputDialog.e eVarE = new HealthDataInputDialog.e(1, 33, dataSetFormatter, selectedValueProcessor).d(40).e(viewContext.getResources().getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol)).e(1);
            int color = ContextCompat.getColor(viewContext, R.color.blood_sugar_theme_color);
            final HealthDataInputDialog healthDataInputDialogA = new HealthDataInputDialog(viewContext).e(color).c(viewContext.getResources().getString(R.string.IDS_blood_sugar_guide_title)).b(viewContext.getResources().getString(R.string.IDS_blood_sugar_guide_desc)).a(eVarE).a(d(viewContext));
            healthDataInputDialogA.d(new HealthDataInputDialog.PositiveBtnClickListener() { // from class: uxg
                @Override // com.huawei.ui.commonui.dialog.HealthDataInputDialog.PositiveBtnClickListener
                public final void onClick(List list) {
                    this.e.b(viewContext, healthDataInputDialogA, list);
                }
            });
            healthDataInputDialogA.c(new View.OnClickListener() { // from class: uxu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50716b.b(healthDataInputDialogA, viewContext, view);
                }
            });
            healthDataInputDialogA.show();
            b(viewContext, 0);
        }
    }

    /* synthetic */ void b(Context context, HealthDataInputDialog healthDataInputDialog, List list) {
        if (this.s > System.currentTimeMillis()) {
            qpx.e(context, context.getResources().getString(R.string.IDS_hw_health_show_healthdata_timeerror));
            return;
        }
        this.g = (((double) ((Integer) list.get(0)).intValue()) * 0.1d) + 1.0d;
        login("BLOOD_SUGAR_INPUT_DIALOG");
        healthDataInputDialog.dismiss();
        b(context, 2);
    }

    /* synthetic */ void b(HealthDataInputDialog healthDataInputDialog, Context context, View view) {
        healthDataInputDialog.dismiss();
        b(context, 1);
    }

    private void b(Context context, int i) {
        String strValue = AnalyticsValue.HEALTH_HOME_BLOOD_SUGAR_SHOW_NO_DATA_VIEW_2210002.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("event", Integer.valueOf(i));
        lmf.d().c(context, strValue, map, 0);
    }

    private View d(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.blood_sugar_dialog_time_item, (ViewGroup) null);
        viewInflate.findViewById(R.id.time_layout).setOnClickListener(new View.OnClickListener() { // from class: uxd.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                uxd.this.r();
            }
        });
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        long timeInMillis = calendar.getTimeInMillis();
        this.s = timeInMillis;
        this.q = wuc.e(timeInMillis);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.hw_show_health_data_inputbloodsugar_top_time);
        this.p = healthTextView;
        healthTextView.setText(qrk.a(context, this.s, 1));
        BloodSugarTimePeriodView bloodSugarTimePeriodView = (BloodSugarTimePeriodView) viewInflate.findViewById(R.id.hw_health_input_bloodsugar_time_period);
        this.t = bloodSugarTimePeriodView;
        bloodSugarTimePeriodView.b();
        this.t.setOnTimePeriodItemChangedListener(new BloodSugarTimePeriodView.OnTimePeriodItemChangedListener() { // from class: uxd.5
            @Override // com.huawei.ui.commonui.linechart.view.timeperiod.BloodSugarTimePeriodView.OnTimePeriodItemChangedListener
            public void onTimePeriodItemChanged(int i, BloodSugarTimePeriod bloodSugarTimePeriod) {
                uxd.this.q = bloodSugarTimePeriod.getCode();
            }
        });
        this.t.b(this.s, this.q);
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        final Context viewContext = getView().getViewContext();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog((Activity) viewContext, new HealthTimePickerDialog.TimeSelectedListener() { // from class: uxd.3
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i, int i2) {
                calendar.set(11, i);
                calendar.set(12, i2);
                uxd.this.p.setText(qrk.a(viewContext, calendar.getTimeInMillis(), 1));
                uxd.this.t.b(calendar.getTimeInMillis(), wuc.e(uxd.this.s));
                uxd.this.s = calendar.getTimeInMillis();
            }
        });
        healthTimePickerDialog.b(0, 0, 0, calendar.get(11), calendar.get(12));
        healthTimePickerDialog.e(viewContext.getString(R.string.IDS_hw_health_show_healthdata_measure_time));
        healthTimePickerDialog.show();
    }

    private void h() {
        long j = this.s;
        uwf.d().c(BaseApplication.b(), new long[]{j, j}, this.q, this.g, new IBaseResponseCallback() { // from class: uxd.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("Main_BloodSugarActivityPresenter", "insertBloodSugarData errorCode=", Integer.valueOf(i), ", ", obj.toString());
                if (i == 0) {
                    uxd.this.o();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("recordType", 2);
        map.put("dataType", Integer.valueOf(wuc.c(this.q)));
        map.put("from", 3);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_INPUT_2030034.value(), map, 0);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter
    public List<Integer> getSubscribeList() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12260b));
        arrayList.add(Integer.valueOf(HiSubscribeType.e));
        return arrayList;
    }

    private void b() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        c(map, this.j);
        if (getView() != null && getView().getViewContext() != null) {
            lmf.d().c(getView().getViewContext(), strValue, map, 0);
        }
        c();
    }

    private void c() {
        String strValue = AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        this.h = Long.valueOf(System.currentTimeMillis());
        map.put("startTime", this.f);
        map.put("endTime", this.h);
        c(map, this.i);
        if (getView() != null && getView().getViewContext() != null) {
            lmf.d().c(getView().getViewContext(), strValue, map, 0);
        }
        this.i = this.j;
        this.f = this.h;
    }

    private void c(Map<String, Object> map, int i) {
        if (i == 0) {
            map.put("type", "2");
            return;
        }
        if (i == 1) {
            map.put("type", "3");
        } else if (i == 2) {
            map.put("type", "4");
        } else {
            LogUtil.j("Main_BloodSugarActivityPresenter", "Is not correct currentPage");
        }
    }

    private void y() {
        HealthToolBar healthToolBar = this.w;
        if (healthToolBar == null) {
            LogUtil.e("Main_BloodSugarActivityPresenter", "mToolBar is null");
            return;
        }
        healthToolBar.setIconVisible(0, 0);
        if (EnvironmentInfo.m()) {
            this.w.setIconVisible(1, 8);
        } else {
            this.w.setIconVisible(1, 0);
        }
        this.w.setIconVisible(4, 0);
        this.w.setIconVisible(3, 0);
        wqq.d("tool_bar_top_index_y", Integer.valueOf(e((View) this.w, true)));
    }

    private void g(View view) {
        view.findViewById(R.id.settings_meal_goto_records).setOnClickListener(new View.OnClickListener() { // from class: uxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.d(view2);
            }
        });
        final HealthRadioButton healthRadioButton = (HealthRadioButton) view.findViewById(R.id.settings_meal_breakfast_radio);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) view.findViewById(R.id.settings_meal_breakfast_extra_radio);
        final HealthRadioButton healthRadioButton3 = (HealthRadioButton) view.findViewById(R.id.settings_meal_lunch_radio);
        final HealthRadioButton healthRadioButton4 = (HealthRadioButton) view.findViewById(R.id.settings_meal_afternoon_extra_radio);
        final HealthRadioButton healthRadioButton5 = (HealthRadioButton) view.findViewById(R.id.settings_meal_dinner_radio);
        final HealthRadioButton healthRadioButton6 = (HealthRadioButton) view.findViewById(R.id.settings_meal_dinner_extra_radio);
        this.l = new HealthRadioButton[]{healthRadioButton, healthRadioButton2, healthRadioButton3, healthRadioButton4, healthRadioButton5, healthRadioButton6};
        this.o = 10;
        healthRadioButton.setChecked(true);
        view.findViewById(R.id.settings_meal_breakfast).setOnClickListener(new View.OnClickListener() { // from class: uya
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.g(healthRadioButton, view2);
            }
        });
        view.findViewById(R.id.settings_meal_breakfast_extra).setOnClickListener(new View.OnClickListener() { // from class: uxy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50721a.a(healthRadioButton2, view2);
            }
        });
        view.findViewById(R.id.settings_meal_lunch).setOnClickListener(new View.OnClickListener() { // from class: uxw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50718a.d(healthRadioButton3, view2);
            }
        });
        view.findViewById(R.id.settings_meal_afternoon_extra).setOnClickListener(new View.OnClickListener() { // from class: uxi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50706c.b(healthRadioButton4, view2);
            }
        });
        view.findViewById(R.id.settings_meal_dinner).setOnClickListener(new View.OnClickListener() { // from class: uxl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.e(healthRadioButton5, view2);
            }
        });
        view.findViewById(R.id.settings_meal_dinner_extra).setOnClickListener(new View.OnClickListener() { // from class: uxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.c(healthRadioButton6, view2);
            }
        });
    }

    /* synthetic */ void d(View view) {
        a((String) null);
    }

    /* synthetic */ void g(HealthRadioButton healthRadioButton, View view) {
        this.o = 10;
        a(healthRadioButton);
    }

    /* synthetic */ void a(HealthRadioButton healthRadioButton, View view) {
        this.o = 11;
        a(healthRadioButton);
    }

    /* synthetic */ void d(HealthRadioButton healthRadioButton, View view) {
        this.o = 20;
        a(healthRadioButton);
    }

    /* synthetic */ void b(HealthRadioButton healthRadioButton, View view) {
        this.o = 21;
        a(healthRadioButton);
    }

    /* synthetic */ void e(HealthRadioButton healthRadioButton, View view) {
        this.o = 30;
        a(healthRadioButton);
    }

    /* synthetic */ void c(HealthRadioButton healthRadioButton, View view) {
        this.o = 31;
        a(healthRadioButton);
    }

    private void a(HealthRadioButton healthRadioButton) {
        HealthRadioButton[] healthRadioButtonArr = this.l;
        int length = healthRadioButtonArr.length;
        for (int i = 0; i < length; i++) {
            HealthRadioButton healthRadioButton2 = healthRadioButtonArr[i];
            healthRadioButton2.setChecked(healthRadioButton2 == healthRadioButton);
        }
    }

    private boolean m() {
        int i = this.o;
        return i == 11 || i == 21 || i == 31;
    }

    private void s() {
        LogUtil.a("Main_BloodSugarActivityPresenter", "showMealPickerDialog()");
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        Context viewContext = view.getViewContext();
        Object systemService = viewContext.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "showMealPickerDialog() object is invalid type");
            return;
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.hw_show_settings_meal_view, (ViewGroup) null);
        if (viewInflate == null) {
            LogUtil.d("Main_BloodSugarActivityPresenter", "showMealPickerDialog() view is null");
            return;
        }
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(viewContext);
        builder.a(viewContext.getString(R.string.IDS_bsdiet_choose_meal)).d(viewInflate).d(R.string.IDS_device_show_next, new View.OnClickListener() { // from class: uxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f50704c.j(view2);
            }
        }).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: uxk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                uxd.a(view2);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        g(viewInflate);
        customViewDialogD.show();
    }

    /* synthetic */ void j(View view) {
        if (m()) {
            e(0L);
        } else {
            g();
        }
    }

    private void g() {
        this.n = new c(this);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ReleaseLogUtil.c("Main_BloodSugarActivityPresenter", "getDietTime dayFormat ", Integer.valueOf(iA));
        vil.d(iA, iA, (ResponseCallback<List<vgo>>) new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<vgo> list) {
        long jF = 0;
        if (njy.e(list)) {
            a(0L);
            return;
        }
        vgo vgoVar = list.get(0);
        if (vgoVar == null) {
            a(0L);
            return;
        }
        List<vgw> listA = vgoVar.a();
        if (!njy.e(listA)) {
            for (vgw vgwVar : listA) {
                int i = vgwVar.i();
                LogUtil.a("Main_BloodSugarActivityPresenter", "queryTimeDietRecord meals is ", Integer.valueOf(listA.size()), " timeType is ", Integer.valueOf(this.o), " whichMeal is ", Integer.valueOf(i));
                if (this.o == i) {
                    jF = vgwVar.f();
                }
            }
        }
        a(jF);
    }

    static final class e implements ResponseCallback<List<vgo>> {
        private final WeakReference<uxd> d;

        e(uxd uxdVar) {
            this.d = new WeakReference<>(uxdVar);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "GetDietRecordDataCallback errorCode ", Integer.valueOf(i), " list ", list);
            uxd uxdVar = this.d.get();
            if (uxdVar != null) {
                uxdVar.c(list);
            } else {
                LogUtil.j("Main_BloodSugarActivityPresenter", "GetDietRecordDataCallback bloodSugarActivityPresenter is null");
            }
        }
    }

    private void a(long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 0;
        messageObtain.obj = Long.valueOf(j);
        this.n.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final long j) {
        final Context viewContext = getView().getViewContext();
        LogUtil.a("Main_BloodSugarActivityPresenter", "showMealTimeDialog()");
        if (!(viewContext.getSystemService("layout_inflater") instanceof LayoutInflater) || !(viewContext instanceof Activity)) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "showMealTimeDialog ", "object and context is invalid type");
            return;
        }
        final Calendar calendar = Calendar.getInstance();
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog((Activity) viewContext, new HealthTimePickerDialog.TimeSelectedListener() { // from class: uxx
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public final void onTimeSelected(int i, int i2) {
                this.f50720c.d(calendar, j, viewContext, i, i2);
            }
        });
        healthTimePickerDialog.e(viewContext.getString(R.string.IDS_bsdiet_meal_start_time, f()));
        healthTimePickerDialog.show();
    }

    /* synthetic */ void d(Calendar calendar, long j, Context context, int i, int i2) {
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        LogUtil.d("Main_BloodSugarActivityPresenter", "showMealTimeDialog(), calendarTime = ", Long.valueOf(timeInMillis));
        String strD = UnitUtil.d("HH:mm", 1000 * j);
        String strD2 = UnitUtil.d("HH:mm", timeInMillis);
        if (System.currentTimeMillis() < timeInMillis) {
            qpx.e(context, context.getResources().getString(R.string.IDS_hw_health_show_healthdata_timeerror));
            e(j);
        } else if (strD.equals(strD2) || j == 0 || m()) {
            d(timeInMillis);
        } else {
            c(strD, strD2, timeInMillis);
        }
    }

    private void c(String str, String str2, final long j) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(getView().getViewContext());
        builder.a(getView().getViewContext().getString(R.string.IDS_bsdiet_meal_change_time, f(), str, str2)).a(getView().getViewContext().getString(R.string.IDS_hw_common_ui_dialog_confirm), new View.OnClickListener() { // from class: uxp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(j, view);
            }
        }).d(getView().getViewContext().getString(R.string.IDS_hw_common_ui_dialog_cancel), new View.OnClickListener() { // from class: uxr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.d("Main_BloodSugarActivityPresenter", "showMealWarnDialog click negative view");
            }
        });
        builder.c().show();
    }

    /* synthetic */ void b(long j, View view) {
        d(j);
    }

    private String f() {
        Context viewContext = getView().getViewContext();
        int i = this.o;
        if (i == 10) {
            return viewContext.getString(R.string.IDS_bsdiet_breakfast);
        }
        if (i == 11) {
            return viewContext.getString(R.string.IDS_bsdiet_breakfast_extra);
        }
        if (i == 20) {
            return viewContext.getString(R.string.IDS_bsdiet_lunch);
        }
        if (i == 21) {
            return viewContext.getString(R.string.IDS_bsdiet_afternoon_extra);
        }
        if (i == 30) {
            return viewContext.getString(R.string.IDS_bsdiet_dinner);
        }
        if (i == 31) {
            return viewContext.getString(R.string.IDS_bsdiet_dinner_extra);
        }
        LogUtil.j("Main_BloodSugarActivityPresenter", "getTimeDialogTitle mMealType is wrong: ", Integer.valueOf(i));
        return "";
    }

    private void d(long j) {
        long j2 = j / 1000;
        String str = "#/record_breakfast?whichMeal=" + this.o + "&whichMealLabel=" + f() + "&date=" + (lsl.r(j) / 1000) + "&setTime=" + j2;
        LogUtil.a("Main_BloodSugarActivityPresenter", "jumpDietDetails uri = ", str);
        a(str);
    }

    private void a(String str) {
        DataDetailActivityContract.DetailActivityView view = getView();
        if (view == null) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("type", 0);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_FEED_BACK_2040134.value(), map);
        DietDiaryRepository.jumpDietDetails(view.getViewContext(), str);
    }

    public int e(View view, boolean z) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return z ? iArr[1] : iArr[1] + view.getHeight();
    }

    public static void d() {
        a(AnalyticsValue.HEALTH_HEALTH_BLOODSUGAR_CARD_DATA_2030070.value(), "7");
        H5proUtil.initH5pro();
        H5ProLaunchOption h5ProLaunchOption = new H5ProLaunchOption();
        f50690c = h5ProLaunchOption;
        h5ProLaunchOption.addCustomizeArg(HwPayConstant.KEY_USER_NAME, d);
        f50690c.addCustomizeArg("startTime", String.valueOf(f50688a));
        f50690c.addCustomizeArg("endTime", String.valueOf(f50689b));
        f50690c.addCustomizeArg("language", e);
        H5ProClient.startH5MiniProgram(BaseApplication.b(), "com.huawei.healthsport.h5-bloodsugar-export", f50690c);
    }

    @Override // com.huawei.ui.main.stories.template.health.impl.HealthDetailCommonActivityPresenter, com.huawei.ui.main.stories.template.BasePresenter
    public void detachView() {
        this.w = null;
        super.detachView();
        ula.c().e();
    }

    private boolean n() {
        return "BLOOD_SUGAR_CONTINUE".equals((String) wqq.a("blood_sugar_data_type", String.class));
    }

    public void b(int i) {
        if (this.r == null) {
            LogUtil.j("Main_BloodSugarActivityPresenter", "handleDietTimeRemindShow mRemindLayout is null");
            return;
        }
        if (vcr.e(getView().getViewContext()) && i == 0 && n() && this.m > 0) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
    }

    public void b(View view) {
        LogUtil.a("Main_BloodSugarActivityPresenter", "handleDietTimeRemind");
        if (!vcr.e(getView().getViewContext())) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "handleDietTimeRemind showRemindTimeWindow() is false!");
            return;
        }
        if (!(view instanceof LinearLayout)) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "handleDietTimeRemind view is wrong!");
            return;
        }
        this.r = (LinearLayout) view;
        this.n = new c(this);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.c(jCurrentTimeMillis, -30));
        ReleaseLogUtil.c("Main_BloodSugarActivityPresenter", "handleDietTimeRemind startDate ", Integer.valueOf(iA2), " endDate ", Integer.valueOf(iA));
        vil.d(iA2, iA, (ResponseCallback<List<vgo>>) new b(this));
    }

    static class b implements ResponseCallback<List<vgo>> {
        private final WeakReference<uxd> d;

        b(uxd uxdVar) {
            this.d = new WeakReference<>(uxdVar);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<vgo> list) {
            LogUtil.a("Main_BloodSugarActivityPresenter", "InnerViewDietDiaryCbk errorCode ", Integer.valueOf(i), " list ", list);
            uxd uxdVar = this.d.get();
            if (uxdVar == null) {
                ReleaseLogUtil.d("Main_BloodSugarActivityPresenter", "InnerViewDietDiaryCbk activity is null");
                return;
            }
            if (njy.e(list)) {
                uxdVar.d(0);
                return;
            }
            int i2 = 0;
            for (vgo vgoVar : list) {
                if (vgoVar == null) {
                    uxdVar.d(0);
                    return;
                }
                List<vgw> listA = vgoVar.a();
                if (njy.b(listA)) {
                    for (vgw vgwVar : listA) {
                        if (vgwVar != null && !njy.e(vgwVar.c()) && vgwVar.f() == 0) {
                            i2++;
                        }
                    }
                }
            }
            uxdVar.d(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = Integer.valueOf(i);
        this.n.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        HealthTextView healthTextView;
        LogUtil.a("Main_BloodSugarActivityPresenter", "setBloodSugarDietTimeRemind count = ", Integer.valueOf(i));
        wqq.d("blood_sugar_remind_count", Integer.valueOf(i));
        if (i == 0) {
            return;
        }
        this.m = i;
        if (getView() == null || getView().getViewContext() == null) {
            LogUtil.j("Main_BloodSugarActivityPresenter", "setBloodSugarDietTimeRemind getView or getViewContext is null");
            return;
        }
        final Context viewContext = getView().getViewContext();
        String quantityString = viewContext.getResources().getQuantityString(R.plurals.IDS_bsdiet_set_time_remind, i, Integer.valueOf(i));
        if (qrs.ac()) {
            this.r.findViewById(R.id.blood_sugar_diet_set_time_remind_text).setVisibility(8);
            HealthScrollView healthScrollView = (HealthScrollView) this.r.findViewById(R.id.scroll_blood_sugar_diet_set_time);
            healthScrollView.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = healthScrollView.getLayoutParams();
            layoutParams.height = qrs.m() / 6;
            healthScrollView.setLayoutParams(layoutParams);
            healthTextView = (HealthTextView) this.r.findViewById(R.id.blood_sugar_diet_set_time_remind_text_large);
        } else {
            healthTextView = (HealthTextView) this.r.findViewById(R.id.blood_sugar_diet_set_time_remind_text);
        }
        healthTextView.setText(quantityString);
        TextView textView = (TextView) this.r.findViewById(R.id.blood_sugar_diet_set_time_remind_go);
        textView.setAllCaps(true);
        textView.setOnClickListener(new View.OnClickListener() { // from class: uxm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(viewContext, view);
            }
        });
        this.r.findViewById(R.id.blood_sugar_diet_set_time_remind_cancel).setOnClickListener(new View.OnClickListener() { // from class: uxn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50711b.a(viewContext, view);
            }
        });
        if (n() && this.j == 0) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
            LogUtil.j("Main_BloodSugarActivityPresenter", "setBloodSugarDietTimeRemind count < 0 ");
        }
    }

    /* synthetic */ void d(Context context, View view) {
        vcr.c(context);
        DietDiaryRepository.jumpDietDetails(context, "#/settime_list");
        this.r.setVisibility(8);
    }

    /* synthetic */ void a(Context context, View view) {
        vcr.c(context);
        this.r.setVisibility(8);
    }

    static class c extends BaseHandler<uxd> {
        c(uxd uxdVar) {
            super(uxdVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(uxd uxdVar, Message message) {
            if (message.what == 0) {
                uxdVar.e(message.obj instanceof Long ? ((Long) message.obj).longValue() : 0L);
            }
            if (message.what == 1) {
                uxdVar.e(message.obj instanceof Integer ? ((Integer) message.obj).intValue() : 0);
            }
        }
    }
}
