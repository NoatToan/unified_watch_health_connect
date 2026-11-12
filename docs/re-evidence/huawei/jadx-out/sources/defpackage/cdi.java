package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basichealthmodel.R;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class cdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1488a;
    private HealthTextView ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomAlertDialog.Builder f1489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f1490c;
    private final Context d;
    private final a e;
    private CustomAlertDialog f;
    private boolean g;
    private long h;
    private final boolean i;
    private boolean j;
    private ResponseCallback<HealthLifeTaskBean> k;
    private Calendar l;
    private ConstraintLayout m;
    private long n;
    private HealthTextView o;
    private final String p;
    private HealthTextView q;
    private HealthMultiNumberPicker r;
    private int[] s;
    private HealthLifeTaskBean t;
    private Calendar u;
    private ConstraintLayout v;
    private HealthTextView w;
    private HealthMultiNumberPicker x;
    private View y;
    private int[] z;

    public cdi(Context context, HealthLifeTaskBean healthLifeTaskBean, ResponseCallback<HealthLifeTaskBean> responseCallback) {
        Context contextB = BaseApplication.b();
        this.d = contextB;
        this.i = LanguageUtil.c(contextB);
        this.f1488a = context;
        this.t = healthLifeTaskBean;
        this.k = responseCallback;
        this.p = cbg.q();
        this.e = new a(this);
    }

    public void b() {
        View viewInflate = LayoutInflater.from(this.f1488a).inflate(R.layout.manual_input_sleep_data_layout, (ViewGroup) null);
        this.y = viewInflate;
        this.r = (HealthMultiNumberPicker) viewInflate.findViewById(R.id.sleep_time_picker);
        this.x = (HealthMultiNumberPicker) this.y.findViewById(R.id.wakeup_time_picker);
        this.o = (HealthTextView) this.y.findViewById(R.id.goToBedTime);
        this.q = (HealthTextView) this.y.findViewById(R.id.goToBedTimeValue);
        this.w = (HealthTextView) this.y.findViewById(R.id.wakeupTime);
        this.ac = (HealthTextView) this.y.findViewById(R.id.wakeupTimeValue);
        this.f1490c = (HealthTextView) this.y.findViewById(R.id.input_error_tip);
        this.m = (ConstraintLayout) this.y.findViewById(R.id.goToBed);
        this.v = (ConstraintLayout) this.y.findViewById(R.id.wakeup);
        this.j = qrs.x(this.f1488a);
        c();
        o();
        i();
    }

    private void c() {
        ImageView imageView = (ImageView) this.y.findViewById(R.id.right_icon);
        if (this.j) {
            imageView.setImageDrawable(qqz.c(this.f1488a, com.huawei.ui.commonui.R.drawable.ic_right_grey_update_dark));
            this.o.setTextColor(this.f1488a.getColor(R.color.common_color_white));
            this.q.setTextColor(this.f1488a.getColor(R.color.common_color_white));
            this.w.setTextColor(this.f1488a.getColor(R.color.common_color_white));
            this.ac.setTextColor(this.f1488a.getColor(R.color.common_color_white));
        } else {
            imageView.setImageDrawable(qqz.c(this.f1488a, R.drawable.ic_right_grey_update));
            this.o.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
            this.q.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: cdp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        this.m.setOnClickListener(new View.OnClickListener() { // from class: cdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1494b.a(view);
            }
        });
        this.v.setOnClickListener(new View.OnClickListener() { // from class: cdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1493c.c(view);
            }
        });
        d(true);
        HealthTextView healthTextView = (HealthTextView) this.y.findViewById(R.id.inputDetail);
        lrd.a(healthTextView, qre.f(com.huawei.ui.commonui.R.string.IDS_detail_input), (Class<?>) Button.class);
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: cdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1487b.d(view);
            }
        });
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("HL_InputSleepDataHelper", "go to target manager activity.");
        AppRouter.c("/PluginHealthModel/HealthModelGoalManagerActivity").b(this.f1488a);
        CustomAlertDialog customAlertDialog = this.f;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    /* synthetic */ void a(View view) {
        this.r.setVisibility(0);
        this.x.setVisibility(8);
        g();
        k();
        d(true);
    }

    /* synthetic */ void c(View view) {
        this.g = true;
        this.ac.setText(this.f1488a.getString(com.huawei.ui.commonui.R.string.IDS_today_time, UnitUtil.e(this.u, 129)));
        a();
        this.r.setVisibility(8);
        this.x.setVisibility(0);
        n();
        l();
        d(false);
    }

    /* synthetic */ void d(View view) {
        LogUtil.a("HL_InputSleepDataHelper", "jumpToDetailInputSleepH5.");
        cbg.d(this.f1488a, this.l.getTimeInMillis(), this.u.getTimeInMillis());
        CustomAlertDialog customAlertDialog = this.f;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    private void d(boolean z) {
        lrd.c(this.m, z);
        lrd.c(this.v, !z);
    }

    private void o() {
        String target;
        HealthLifeTaskBean healthLifeTaskBean = this.t;
        if (healthLifeTaskBean == null || healthLifeTaskBean.getHealthLifeBean() == null) {
            target = "7:00";
        } else {
            target = this.t.getHealthLifeBean().getTarget();
        }
        HealthTextView healthTextView = (HealthTextView) this.y.findViewById(R.id.currentTargetValue);
        healthTextView.setText(qre.a(com.huawei.ui.commonui.R.string.IDS_current_wakeup_target_new, qrk.a(this.d, a(0, target).getTimeInMillis(), 1)));
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: cdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        HealthLifeBean healthLifeBeanD = bxd.d(this.p, 6, DateFormatUtil.a(lsl.w(System.currentTimeMillis())));
        if (TextUtils.isEmpty(healthLifeBeanD.getTarget())) {
            LogUtil.a("HL_InputSleepDataHelper", "wakeupBean == null");
        } else {
            LogUtil.a("HL_InputSleepDataHelper", "wakeupBean target:", healthLifeBeanD.getTarget());
            if (!healthLifeBeanD.getTarget().equals(target)) {
                HealthTextView healthTextView2 = (HealthTextView) this.y.findViewById(R.id.targetTips2);
                healthTextView2.setText(this.f1488a.getString(com.huawei.ui.commonui.R.string.IDS_change_target_tip, qrk.a(this.d, a(0, healthLifeBeanD.getTarget()).getTimeInMillis(), 1)));
                healthTextView2.setVisibility(0);
            }
        }
        ((HealthTextView) this.y.findViewById(R.id.targetTips1)).setText(this.f1488a.getString(com.huawei.ui.commonui.R.string.IDS_wakeup_task_tip, 1));
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("HL_InputSleepDataHelper", "go to target manager activity.");
        AppRouter.c("/PluginHealthModel/HealthModelGoalManagerActivity").b(this.f1488a);
        CustomAlertDialog customAlertDialog = this.f;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String target;
        String target2;
        HealthLifeTaskBean healthLifeTaskBean = this.t;
        if (healthLifeTaskBean == null || healthLifeTaskBean.getHealthLifeBean() == null) {
            target = "7:00";
        } else {
            target = this.t.getHealthLifeBean().getTarget();
        }
        long j = this.n;
        if (j == 0) {
            this.u = a(0, target);
        } else {
            this.u = c(0, j);
        }
        if (this.u.getTimeInMillis() > System.currentTimeMillis()) {
            Calendar calendar = Calendar.getInstance();
            this.u = calendar;
            calendar.set(13, 0);
            this.u.set(14, 0);
        }
        HealthLifeBean healthLifeBeanD = bxd.d(this.p, 7, DateFormatUtil.a(lsl.u(System.currentTimeMillis())));
        if (TextUtils.isEmpty(healthLifeBeanD.getTarget())) {
            target2 = "23:00";
        } else {
            LogUtil.a("HL_InputSleepDataHelper", "sleepBean target:", healthLifeBeanD.getTarget(), " result:", healthLifeBeanD.getResult());
            target2 = healthLifeBeanD.getTarget();
        }
        if (this.h == 0) {
            this.l = a(-1, target2);
        } else {
            this.l = c(DateFormatUtil.a(this.n) == DateFormatUtil.a(this.h) ? 0 : -1, this.h);
        }
        if (ift.i(this.l.getTimeInMillis()).equals(ift.i(System.currentTimeMillis()))) {
            this.q.setText(this.f1488a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_today_time, UnitUtil.e(this.l, 129)));
        } else {
            this.q.setText(UnitUtil.e(this.l, 153));
        }
        LogUtil.a("HL_InputSleepDataHelper", "mSleepTime:", this.l.getTime().toString(), " mWakeUpTime:", this.u.getTime().toString());
        int[] iArr = new int[3];
        this.s = iArr;
        this.z = new int[3];
        c(this.l, iArr);
        c(this.u, this.z);
        d();
        h();
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f1488a);
        this.f1489b = builder;
        builder.a(this.y).d(com.huawei.ui.commonui.R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: cdj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f1492a.a(dialogInterface, i);
            }
        }).a(com.huawei.ui.commonui.R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: cdl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("HL_InputSleepDataHelper", "dialog cancel");
            }
        });
        this.f1489b.c().setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        this.f1489b.a().setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        this.f1489b.e(this.f1488a.getResources().getDimensionPixelSize(R.dimen.health_common_12dp), this.f1488a.getResources().getDimensionPixelSize(R.dimen.health_common_12dp));
        CharSequence text = this.ac.getText();
        LogUtil.a("HL_InputSleepDataHelper", "showDialog charSequence ", text);
        if (TextUtils.isEmpty(text) || "--".contentEquals(text)) {
            b(false, 0.4f);
        }
        CustomAlertDialog customAlertDialogB = this.f1489b.b();
        this.f = customAlertDialogB;
        customAlertDialogB.show();
        cbk.e();
    }

    /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        j();
    }

    private void j() {
        long timeInMillis = this.l.getTimeInMillis();
        long j = timeInMillis - (timeInMillis % 60000);
        long timeInMillis2 = this.u.getTimeInMillis();
        long j2 = timeInMillis2 - (timeInMillis2 % 60000);
        int iValue = DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value();
        int iValue2 = DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value();
        int iValue3 = DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_WAKEUP_TIME.value();
        int iValue4 = DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_FALL_ASLEEP_TIME.value();
        ReleaseLogUtil.c("R_HL_InputSleepDataHelper", "insertData startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2), " typeForBedTime ", Integer.valueOf(iValue), " typeForRisingTime ", Integer.valueOf(iValue2), " typeForWakeupTime ", Integer.valueOf(iValue3), " typeForFallAsleepTime ", Integer.valueOf(iValue4));
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiHealthData hiHealthDataE = e(jCurrentTimeMillis, jCurrentTimeMillis, iValue, j, "-1");
        HiHealthData hiHealthDataE2 = e(jCurrentTimeMillis, jCurrentTimeMillis, iValue2, j2, "-1");
        HiHealthData hiHealthDataE3 = e(jCurrentTimeMillis, jCurrentTimeMillis, iValue3, j2, "-1");
        HiHealthData hiHealthDataE4 = e(jCurrentTimeMillis, jCurrentTimeMillis, iValue4, j, "-1");
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(hiHealthDataE);
        arrayList.add(hiHealthDataE2);
        arrayList.add(hiHealthDataE3);
        arrayList.add(hiHealthDataE4);
        arrayList.addAll(d(j, j2));
        LogUtil.a("HL_InputSleepDataHelper", "insertSleepData list.size(): ", Integer.valueOf(arrayList.size()));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(this.d).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: cdm
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.d.a(i, obj);
            }
        });
    }

    /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("HL_InputSleepDataHelper", "insertSleepData onResponse! ", Long.valueOf(System.currentTimeMillis()));
        if (i == 0) {
            LogUtil.a("HL_InputSleepDataHelper", "insertSleepData success");
            ResponseCallback<HealthLifeTaskBean> responseCallback = this.k;
            if (responseCallback != null) {
                responseCallback.onResponse(1, this.t);
            }
            qpx.e(this.f1488a, com.huawei.ui.commonui.R.string.IDS_manual_sleep_input_success);
            cbk.b(this.u, this.l);
            return;
        }
        LogUtil.j("HL_InputSleepDataHelper", "insertSleepData fail: ", Integer.valueOf(i));
        qpx.e(this.f1488a, com.huawei.ui.commonui.R.string.IDS_hwh_show_save_failed);
    }

    private HiHealthData e(long j, long j2, int i, long j3, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setTimeInterval(j, j2);
        hiHealthData.setType(i);
        hiHealthData.setValue(j3);
        hiHealthData.setDeviceUuid(str);
        return hiHealthData;
    }

    private List<HiHealthData> d(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        while (j <= j2 - 60000) {
            HiHealthData hiHealthData = new HiHealthData();
            long j3 = 60000 + j;
            hiHealthData.setTimeInterval(j, j3);
            hiHealthData.setType(22107);
            hiHealthData.setDeviceUuid("-1");
            arrayList.add(hiHealthData);
            j = j3;
        }
        return arrayList;
    }

    private void c(Calendar calendar, int[] iArr) {
        iArr[c("date")] = (calendar.get(6) - ((!lsl.i(calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis()) ? calendar.getActualMaximum(6) : 0) + Calendar.getInstance().get(6))) + 1;
        iArr[c("hour")] = calendar.get(11);
        iArr[c("minute")] = calendar.get(12);
    }

    private Calendar c(int i, long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        LogUtil.a("HL_InputSleepDataHelper", "parseTimeToCalendar hour:", Integer.valueOf(i2), " minute:", Integer.valueOf(i3));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, i);
        calendar2.set(11, i2);
        calendar2.set(12, i3);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2;
    }

    private Calendar a(int i, String str) {
        int iJ;
        int iJ2;
        String[] strArrSplit = str.split(":");
        Calendar calendar = Calendar.getInstance();
        if (strArrSplit.length != 2) {
            calendar.add(6, i);
            return calendar;
        }
        if (strArrSplit[0].startsWith("0")) {
            iJ = CommonUtil.j(strArrSplit[0].substring(1));
        } else {
            iJ = CommonUtil.j(strArrSplit[0]);
        }
        if (strArrSplit[1].startsWith("0")) {
            iJ2 = CommonUtil.j(strArrSplit[1].substring(1));
        } else {
            iJ2 = CommonUtil.j(strArrSplit[1]);
        }
        calendar.add(6, i);
        calendar.set(11, iJ);
        calendar.set(12, iJ2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    private int c(String str) {
        if (Objects.equals(str, "date")) {
            return this.i ? 2 : 0;
        }
        if (Objects.equals(str, "hour")) {
            return !this.i ? 1 : 0;
        }
        if (Objects.equals(str, "minute")) {
            return this.i ? 1 : 2;
        }
        ReleaseLogUtil.d("R_HL_InputSleepDataHelper", "getPickerColumnIndex type ", str);
        return 0;
    }

    private void d() {
        HashMap map = new HashMap(3);
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        map.put(Integer.valueOf(c("date")), new String[]{UnitUtil.a(calendar.getTime(), 24), this.f1488a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_detail_sleep_bottom_btu_day_txt)});
        map.put(Integer.valueOf(c("hour")), this.r.c(0, 23, null));
        map.put(Integer.valueOf(c("minute")), this.r.c(0, 59, null));
        this.r.setDataContent(3, map, new boolean[]{true, true, true}, this.s);
        this.r.setSelectorTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        this.r.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: cds
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public final void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
                this.f1498b.b(i, healthMultiNumberPicker, i2, i3);
            }
        });
    }

    /* synthetic */ void b(int i, HealthMultiNumberPicker healthMultiNumberPicker, int i2, int i3) {
        this.s[i] = i3;
        e(i, i2, i3);
        f();
        a();
    }

    private void h() {
        HashMap map = new HashMap(3);
        map.put(Integer.valueOf(c("date")), new String[]{this.f1488a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_detail_sleep_bottom_btu_day_txt)});
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        LogUtil.a("HL_InputSleepDataHelper", "hour:", Integer.valueOf(i), " minute:", Integer.valueOf(i2));
        final int iC = c("hour");
        map.put(Integer.valueOf(iC), this.x.c(0, i, null));
        int iC2 = c("minute");
        HealthMultiNumberPicker healthMultiNumberPicker = this.x;
        if (i != this.z[iC]) {
            i2 = 59;
        }
        map.put(Integer.valueOf(iC2), healthMultiNumberPicker.c(0, i2, null));
        this.x.setDataContent(3, map, new boolean[]{true, true, true}, this.z);
        this.x.setSelectorTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        this.x.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: cdr
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public final void onValueChange(int i3, HealthMultiNumberPicker healthMultiNumberPicker2, int i4, int i5) {
                this.d.e(iC, i3, healthMultiNumberPicker2, i4, i5);
            }
        });
    }

    /* synthetic */ void e(int i, int i2, HealthMultiNumberPicker healthMultiNumberPicker, int i3, int i4) {
        int[] iArr = this.z;
        iArr[i2] = i4;
        if (i2 == i) {
            b(i3, iArr, this.x);
        }
        m();
        a();
    }

    private void b(int i, int[] iArr, HealthMultiNumberPicker healthMultiNumberPicker) {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        LogUtil.a("HL_InputSleepDataHelper", "hour:", Integer.valueOf(i2), " minute:", Integer.valueOf(i3), " oldVal:", Integer.valueOf(i));
        int iC = c("minute");
        if (iArr[c("hour")] != i2) {
            if (i == i2) {
                healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, 59, null), iArr[iC]);
            }
        } else if (iArr[iC] >= i3) {
            iArr[iC] = i3;
            healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, i3, null), i3);
        } else {
            healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, i3, null), iArr[iC]);
        }
    }

    private void e(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        LogUtil.a("HL_InputSleepDataHelper", "hour:", Integer.valueOf(i4), " minute:", Integer.valueOf(i5), " oldVal:", Integer.valueOf(i2));
        int iC = c("hour");
        if (i == c("date")) {
            if (i3 == 1) {
                e(i4, i5, this.s, this.r);
            } else {
                int iC2 = c("minute");
                HealthMultiNumberPicker healthMultiNumberPicker = this.r;
                healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, 23, null), this.s[iC]);
                HealthMultiNumberPicker healthMultiNumberPicker2 = this.r;
                healthMultiNumberPicker2.setDisplayedValues(iC2, healthMultiNumberPicker2.c(0, 59, null), this.s[iC2]);
            }
        }
        if (i == iC) {
            b(i2, this.s, this.r);
        }
    }

    private void e(int i, int i2, int[] iArr, HealthMultiNumberPicker healthMultiNumberPicker) {
        int iC = c("hour");
        int iC2 = c("minute");
        if (iArr[iC] >= i) {
            iArr[iC] = i;
            iArr[iC2] = i2;
            healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, i, null), i);
            healthMultiNumberPicker.setDisplayedValues(iC2, healthMultiNumberPicker.c(0, i2, null), i2);
            return;
        }
        iArr[iC2] = i2;
        healthMultiNumberPicker.setDisplayedValues(iC, healthMultiNumberPicker.c(0, i, null), iArr[iC]);
        healthMultiNumberPicker.setDisplayedValues(iC2, healthMultiNumberPicker.c(0, 59, null), iArr[iC2]);
    }

    private Calendar f() {
        String string;
        Calendar calendar = Calendar.getInstance();
        int iC = c("date");
        int[] iArr = this.s;
        int i = iArr[iC];
        int i2 = iArr[c("hour")];
        int i3 = this.s[c("minute")];
        calendar.add(6, i - 1);
        calendar.set(11, i2);
        calendar.set(12, i3);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.l = calendar;
        if (this.s[iC] == 0) {
            string = UnitUtil.a(calendar.getTime(), 145);
        } else {
            string = this.f1488a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_today_time, UnitUtil.a(calendar.getTime(), 129));
        }
        this.q.setText(string);
        return calendar;
    }

    private void m() {
        Calendar calendar = Calendar.getInstance();
        int i = this.z[c("hour")];
        int i2 = this.z[c("minute")];
        calendar.add(6, 0);
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.u = calendar;
        this.ac.setText(this.f1488a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_today_time, UnitUtil.a(calendar.getTime(), 129)));
    }

    private void a() {
        long timeInMillis = this.u.getTimeInMillis() / 1000;
        long timeInMillis2 = this.l.getTimeInMillis() / 1000;
        if (timeInMillis <= timeInMillis2 && this.g) {
            e(0, this.f1488a.getString(com.huawei.ui.commonui.R.string.IDS_sleep_input_error_tip));
            b(false, 0.4f);
            return;
        }
        if (timeInMillis - timeInMillis2 > k.b.m && this.g) {
            e(0, this.f1488a.getString(com.huawei.ui.commonui.R.string.IDS_sleep_duration_exceeds_tip, this.f1488a.getResources().getQuantityString(com.huawei.ui.commonui.R.plurals.IDS_hour_string, 24, UnitUtil.e(24.0d, 1, 0))));
            b(false, 0.4f);
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(13, 59);
        calendar.set(14, 999);
        if (timeInMillis * 1000 >= calendar.getTimeInMillis() || timeInMillis2 * 1000 >= calendar.getTimeInMillis()) {
            e(4, "");
            b(false, 0.4f);
        } else {
            e(4, "");
            if (this.g) {
                b(true, 1.0f);
            }
        }
    }

    private void e(final int i, final String str) {
        HandlerExecutor.c(new Runnable() { // from class: cde
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(i, str);
            }
        }, 300L);
    }

    /* synthetic */ void b(int i, String str) {
        if (i == 0) {
            this.f1490c.setVisibility(i);
            this.f1490c.setText(str);
        } else {
            this.f1490c.setVisibility(4);
        }
    }

    private void b(boolean z, float f) {
        CustomAlertDialog.Builder builder = this.f1489b;
        if (builder == null || builder.c() == null) {
            return;
        }
        this.f1489b.c().setClickable(z);
        this.f1489b.c().setAlpha(f);
    }

    private void g() {
        ((ImageView) this.y.findViewById(R.id.bedIcon)).setBackground(ContextCompat.getDrawable(this.f1488a, R.drawable.gotobed));
        if (!this.j) {
            this.o.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
            this.q.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        }
        this.m.setBackgroundResource(R.drawable.shape_corner_selected);
    }

    private void k() {
        ((ImageView) this.y.findViewById(R.id.wakeupIcon)).setBackground(ContextCompat.getDrawable(this.f1488a, R.drawable.wakeup_unselect));
        if (!this.j) {
            this.w.setTextColor(this.f1488a.getColor(com.huawei.ui.commonui.R.color.item_text_color));
            this.ac.setTextColor(this.f1488a.getColor(com.huawei.ui.commonui.R.color.item_text_color));
        }
        this.v.setBackgroundResource(R.drawable.shape_corner_unselect);
    }

    private void l() {
        ((ImageView) this.y.findViewById(R.id.wakeupIcon)).setBackground(ContextCompat.getDrawable(this.f1488a, R.drawable.wakeup));
        if (!this.j) {
            this.w.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
            this.ac.setTextColor(this.f1488a.getColor(R.color.sleep_input_primary_color));
        }
        this.v.setBackgroundResource(R.drawable.shape_corner_selected);
    }

    private void n() {
        ((ImageView) this.y.findViewById(R.id.bedIcon)).setBackground(ContextCompat.getDrawable(this.f1488a, R.drawable.gotobed_unselect));
        if (!this.j) {
            this.o.setTextColor(this.f1488a.getColor(com.huawei.ui.commonui.R.color.item_text_color));
            this.q.setTextColor(this.f1488a.getColor(com.huawei.ui.commonui.R.color.item_text_color));
        }
        this.m.setBackgroundResource(R.drawable.shape_corner_unselect);
    }

    private void i() {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        hiDataReadOption.setTimeInterval(String.valueOf(20140101), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value()});
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setCount(1);
        HiHealthManager.d(this.d).readHiHealthData(hiDataReadOption, new d(this));
    }

    static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<cdi> f1491b;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(cdi cdiVar) {
            this.f1491b = new WeakReference<>(cdiVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            cdi cdiVar = this.f1491b.get();
            if (cdiVar == null) {
                ReleaseLogUtil.d("R_HL_InputSleepDataHelper", "InnerResultListener onResult helper is null object ", obj);
                return;
            }
            if (!(obj instanceof SparseArray)) {
                ReleaseLogUtil.d("R_HL_InputSleepDataHelper", "InnerResultListener onResult object ", obj);
                cbg.d(cdiVar.e, 1);
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            List list = (List) sparseArray.get(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_BED_TIME.value());
            List list2 = (List) sparseArray.get(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD_RISING_TIME.value());
            if (njy.b(list)) {
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    ReleaseLogUtil.d("R_HL_InputSleepDataHelper", "InnerResultListener onResult bedTimeList data is null");
                } else {
                    long value = (long) hiHealthData.getValue();
                    LogUtil.a("HL_InputSleepDataHelper", "InnerResultListener onResult bedTime ", Long.valueOf(value), " statTime ", Long.valueOf(hiHealthData.getStartTime()));
                    cdiVar.h = value;
                }
            }
            if (njy.b(list2)) {
                HiHealthData hiHealthData2 = (HiHealthData) list2.get(0);
                if (hiHealthData2 == null) {
                    ReleaseLogUtil.d("R_HL_InputSleepDataHelper", "InnerResultListener onResult risingTimeList data is null");
                } else {
                    long value2 = (long) hiHealthData2.getValue();
                    LogUtil.a("HL_InputSleepDataHelper", "InnerResultListener onResult risingTime ", Long.valueOf(value2), " statTime ", Long.valueOf(hiHealthData2.getStartTime()));
                    cdiVar.n = value2;
                }
            }
            cbg.d(cdiVar.e, 1);
        }
    }

    static class a extends BaseHandler<cdi> {
        a(cdi cdiVar) {
            super(cdiVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(cdi cdiVar, Message message) {
            if (message.what == 1) {
                cdiVar.e();
            }
        }
    }
}
