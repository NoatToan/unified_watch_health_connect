package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.ActiveTargetActivity;
import defpackage.ieg;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.qgm;
import defpackage.qhb;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.tty;
import defpackage.ujr;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveHoursStandProvider extends MinorProvider<tty> implements WheelChairStateManager.SwitchStateListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tty f26524c;
    private boolean d;
    private SectionBean e;
    private int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f26522a = new SparseIntArray();
    private int j = 0;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        this.e = sectionBean;
        tty ttyVar = new tty();
        this.f26524c = ttyVar;
        this.e.c(ttyVar);
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("SCUI_ActiveHoursStandProvider", "enter loadData");
        a();
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void parseParams(final Context context, HashMap map, tty ttyVar) {
        if (TextUtils.isEmpty(ttyVar.c()) || TextUtils.isEmpty(ttyVar.e())) {
            LogUtil.d("SCUI_ActiveHoursStandProvider", "ActiveHoursData data is error");
            return;
        }
        long jB = ttyVar.b();
        g(jB);
        if (!TextUtils.isEmpty(this.f26523b) && this.f26523b.equals(ttyVar.e())) {
            e(context, this.d);
        } else {
            e(context, ttyVar.h());
            this.f26524c.b(ttyVar.c());
        }
        this.f26524c.a(ttyVar.e());
        this.f26524c.e(jB);
        LogUtil.a("SCUI_ActiveHoursStandProvider", "parseParams mActiveHoursData is ", this.f26524c);
        map.put("STAND_TODAY_DATA", Boolean.valueOf(TimeUtil.d(jB, System.currentTimeMillis()) || TimeUtil.d(jB, TimeUtil.c(System.currentTimeMillis()))));
        int iMin = Math.min(ttyVar.d() / 4, 24);
        this.j = iMin;
        this.f26524c.d(iMin * 4);
        map.put("STAND_PROGRESS", Integer.valueOf(a(jB)));
        map.put("STAND_TIME", (this.f26524c.h() || !i(jB)) ? this.f26524c.e() : "");
        map.put("STAND_PROGRESS_TEXT", b(jB));
        if (!TimeUtil.d(jB, System.currentTimeMillis())) {
            map.put("TITLE", null);
            return;
        }
        map.put("STAND_TIP", e());
        map.put("STAND_CONTENT", this.f26524c.c());
        map.put("RIGHT_ICON_CLICK_EVENT", d(context));
        map.put("CLICK_EVENT_LISTENER", new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursStandProvider.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_ActiveHoursStandProvider", "OnClickListener() onClick mark stand");
                if (!ActiveHoursStandProvider.this.f26524c.h()) {
                    ActiveHoursStandProvider.this.e(context);
                    long jB2 = ActiveHoursStandProvider.this.f26524c.b();
                    ActiveHoursStandProvider.this.c(context, jB2);
                    ActiveHoursStandProvider.this.d(jB2);
                    return;
                }
                LogUtil.d("SCUI_ActiveHoursStandProvider", "mark stand card is marked");
            }
        });
    }

    private void g(long j) {
        if ((j <= 0 || !lsl.aa(j)) && this.f26522a.get(DateFormatUtil.a(j)) <= 0) {
            qhb.c(j, "900200009", new a(this));
        }
    }

    private boolean e(long j) {
        return j >= ieg.a(System.currentTimeMillis()) && j <= ieg.d(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        HashMap map = new HashMap(3);
        map.put("click", "1");
        map.put("from", Integer.valueOf(getExtra().getInt("from")));
        map.put("type", Integer.valueOf(e(j) ? 1 : 2));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.CLICK_THE_MARKER_TO_STAND_1040095.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Context context, long j) {
        HiHealthData hiHealthData = new HiHealthData(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE.value());
        if (!i(j)) {
            LogUtil.d("SCUI_ActiveHoursStandProvider", "the current time cannot be marked");
            return;
        }
        hiHealthData.setTimeInterval(ieg.a(j), ieg.d(j));
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setValue(1);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hiHealthData);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(context).insertHiHealthData(hiDataInsertOption, new d(this, context, j));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()));
        ujr.c(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context) {
        Intent intent = new Intent();
        intent.setAction("ENTER_HOUR_LAYOUT");
        BroadcastManagerUtil.e(context, intent);
        LogUtil.a("SCUI_ActiveHoursStandProvider", "send ENTER_HOUR_LAYOUT end");
    }

    private boolean i(long j) {
        boolean zD = TimeUtil.d(j, System.currentTimeMillis());
        boolean z = ieg.a(j) <= ieg.a(System.currentTimeMillis());
        LogUtil.a("SCUI_ActiveHoursStandProvider", "isMarkableByTime isSameDay is ", Boolean.valueOf(zD), " isMarkable is ", Boolean.valueOf(z));
        return zD && z;
    }

    private void e(Context context, boolean z) {
        int i;
        if (this.f26524c == null) {
            LogUtil.d("SCUI_ActiveHoursStandProvider", "setMarkStandStatus mActiveHoursData is null");
            return;
        }
        String strF = qre.f(z ? R.string.IDS_active_standing : R.string.IDS_stand_now);
        SpannableString spannableString = new SpannableString(strF);
        if (z) {
            i = R.color.textColorSecondary;
        } else {
            i = R.color.active_time_color;
        }
        qri.b(spannableString, strF, i);
        this.f26524c.b(spannableString);
        this.f26524c.d(z);
    }

    private void a() {
        if (this.f26524c.b() != 0 && !lsl.aa(this.f26524c.b())) {
            LogUtil.a("SCUI_ActiveHoursStandProvider", "queryCountData is not today return ", Long.valueOf(this.f26524c.b()));
        } else {
            qgm.c("900200009", new e());
        }
    }

    private View.OnClickListener d(final Context context) {
        return new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursStandProvider$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActiveHoursStandProvider.d(context, view);
            }
        };
    }

    static /* synthetic */ void d(Context context, View view) {
        if (qrs.c(500)) {
            LogUtil.d("SCUI_ActiveHoursStandProvider", "click too fast");
        } else {
            ActiveTargetActivity.e(context, 4, 3);
        }
    }

    private int c(long j) {
        if (j > 0 && lsl.aa(j)) {
            return this.f;
        }
        int i = this.f26522a.get(DateFormatUtil.a(j, TimeZone.getDefault()));
        return i <= 0 ? this.f : i;
    }

    private int a(long j) {
        int iC = c(j);
        if (iC > 0) {
            return (int) (UnitUtil.d(this.j / iC, 2) * 100.0d);
        }
        return 0;
    }

    private SpannableString b(long j) {
        int iC = c(j);
        String strE = UnitUtil.e(this.j, 1, 0);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_current_total_time, strE, qre.e(R.plurals.IDS_hour_unit, iC, UnitUtil.e(iC, 1, 0))));
        qri.b(spannableString, strE, R.color.textColorPrimary);
        qri.c(spannableString, strE, qre.b(R.dimen.health_common_20sp));
        qri.e(spannableString, strE, R.string.textFontFamilyMedium);
        return spannableString;
    }

    private String e() {
        int i = this.f;
        if (i <= 0) {
            return "";
        }
        int i2 = this.j;
        if (i2 >= i) {
            return qre.f(R.string.IDS_hour_target_tip_2);
        }
        int i3 = i - i2;
        return qre.a(R.string.IDS_hour_target_tip_1, qre.e(R.plurals.IDS_hour_unit, i3, UnitUtil.e(i3, 1, 0)));
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        ReleaseLogUtil.d("SCUI_ActiveHoursStandProvider", "onSwitchStateChanged isOn:", Boolean.valueOf(z));
        SectionBean sectionBean = this.e;
        if (sectionBean == null) {
            LogUtil.a("SCUI_ActiveHoursStandProvider", "mSectionBean == null");
        } else {
            sectionBean.c(this.f26524c);
        }
    }

    static class a implements ResponseCallback<List<HiHealthData>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ActiveHoursStandProvider> f26527b;

        a(ActiveHoursStandProvider activeHoursStandProvider) {
            this.f26527b = new WeakReference<>(activeHoursStandProvider);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, List<HiHealthData> list) {
            HiHealthData hiHealthData;
            ActiveHoursStandProvider activeHoursStandProvider;
            if (CollectionUtils.a(list) || (hiHealthData = list.get(0)) == null || (activeHoursStandProvider = this.f26527b.get()) == null) {
                return;
            }
            activeHoursStandProvider.f26522a.append(DateFormatUtil.a(hiHealthData.getStartTime(), TimeZone.getDefault()), hiHealthData.getInt("activeGoalValue"));
            if (activeHoursStandProvider.e != null) {
                activeHoursStandProvider.e.c(activeHoursStandProvider.f26524c);
            }
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<ActiveHoursStandProvider> f26530a;

        private e(ActiveHoursStandProvider activeHoursStandProvider) {
            this.f26530a = new WeakReference<>(activeHoursStandProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SCUI_ActiveHoursStandProvider", "onResponse: errorCode = ", Integer.valueOf(i), " objData = ", obj == null ? null : obj.toString());
            ActiveHoursStandProvider activeHoursStandProvider = this.f26530a.get();
            if (activeHoursStandProvider != null) {
                activeHoursStandProvider.f = 12;
                if (obj instanceof Integer) {
                    activeHoursStandProvider.f = ((Integer) obj).intValue();
                } else {
                    LogUtil.d("SCUI_ActiveHoursStandProvider", "onResponse: objData is not instanceof ActiveGoalModel");
                }
                if (activeHoursStandProvider.e != null) {
                    activeHoursStandProvider.e.c(activeHoursStandProvider.f26524c);
                    return;
                }
                return;
            }
            LogUtil.d("SCUI_ActiveHoursStandProvider", "onResponse: provider is null");
        }
    }

    static class d implements HiDataOperateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f26528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<ActiveHoursStandProvider> f26529c;
        private Context d;

        public d(ActiveHoursStandProvider activeHoursStandProvider, Context context, long j) {
            this.f26529c = new WeakReference<>(activeHoursStandProvider);
            this.d = context;
            this.f26528b = j;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            ActiveHoursStandProvider activeHoursStandProvider = this.f26529c.get();
            if (activeHoursStandProvider == null) {
                LogUtil.d("SCUI_ActiveHoursStandProvider", "onResult: provider is null");
                return;
            }
            LogUtil.a("SCUI_ActiveHoursStandProvider", "onResult: insert insertHiHealthData errorCode is ", Integer.valueOf(i));
            if (i == 0) {
                activeHoursStandProvider.a(this.d, this.f26528b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, long j) {
        e(context, true);
        this.e.c(this.f26524c);
        this.d = true;
        this.f26523b = this.f26524c.e();
        ObserverManagerUtil.e("observer_label_mark_stand", Long.valueOf(ieg.a(j) + 1800000));
        qpx.e(context, context.getResources().getString(R.string.IDS_active_insert_success));
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
    }
}
