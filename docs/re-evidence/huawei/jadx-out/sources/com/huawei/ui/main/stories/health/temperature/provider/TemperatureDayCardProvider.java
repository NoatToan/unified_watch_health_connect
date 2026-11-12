package com.huawei.ui.main.stories.health.temperature.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.activity.TemperatureWarningActivity;
import defpackage.ftk;
import defpackage.idy;
import defpackage.mbw;
import defpackage.njy;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uzw;
import defpackage.vbg;
import defpackage.vbr;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes43.dex */
public class TemperatureDayCardProvider extends MinorProvider<vbg> {
    private WeakReference<Context> e;
    private CustomViewDialog f;
    private vbg h;
    private static final String d = "KnitHealthData_CardSelected_" + DataInfos.TemperatureDayDetail;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f28115c = DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE_ALARM.value();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ftk> f28116a = new ArrayList();
    private boolean g = Utils.o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28117b = 0;
    private boolean j = true;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        sectionBean.c(a(BaseApplication.getContext()));
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        LogUtil.a("TemperatureDayCardProvider", "loadData");
        if (sectionBean == null || this.h == null) {
            return;
        }
        LogUtil.a("TemperatureDayCardProvider", "sectionBean setData");
        sectionBean.c(this.h);
    }

    private HashMap<String, Object> a(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        LogUtil.a("TemperatureDayCardProvider", "generateDefaultViewMap");
        map.put("REMIND_SHOW_MODEL", true);
        map.put("REMIND_TEXT", context.getString(R.string.IDS_temperature_warning));
        map.put("REMIND_HISTORY_TEXT", context.getString(R.string.IDS_temperature_history_warning));
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(R.mipmap.ic_temperature_information));
        arrayList.add(Integer.valueOf(R.mipmap.ic_temperature_information));
        map.put("REMIND_IMG_VIEW", arrayList);
        map.put("REMIND_ARROWS", Integer.valueOf(R.drawable.ic_arrows_right));
        map.put("LOW_REMIND_TEXT", context.getString(R.string.IDS_temperature_warning_low));
        map.put("HIGH_REMIND_TEXT", context.getString(R.string.IDS_temperature_warning_high));
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, vbg vbgVar) {
        LogUtil.a("TemperatureDayCardProvider", "parseParams");
        this.e = new WeakReference<>(context);
        this.h = vbgVar;
        Map<String, SpannableStringBuilder> mapB = vbgVar.b();
        uzw uzwVar = new uzw();
        String string = getExtra().getString(KnitHealthDetailActivity.TEMPERATURE_TYPE);
        if (!mapB.isEmpty()) {
            LogUtil.a("TemperatureDayCardProvider", "putTemperature");
            mapB.put("TEMPERATURE_MIN_MAX", mapB.get("TEMPERATURE_MIN_MAX"));
            mapB.put("SKIN_TEMPERATURE_MIN_MAX", mapB.get("SKIN_TEMPERATURE_MIN_MAX"));
        }
        if (this.j) {
            map.put(KnitHealthDetailActivity.TEMPERATURE_TYPE, string);
            this.j = false;
        }
        map.put("TEMPERATURE_CARD_DATA", uzwVar.e(mapB, qre.f(R.string.IDS_settings_health_temperature), qre.f(R.string.IDS_health_skin_temperature)));
        LogUtil.a("TemperatureDayCardProvider", "data type is " + vbgVar.a());
        LogUtil.a("TemperatureDayCardProvider", "remind data is empty ? " + njy.e(vbgVar.c()));
        LogUtil.a("TemperatureDayCardProvider", "is oversea " + this.g);
        if (njy.e(vbgVar.c()) || this.g || "SKIN_TEMPERATURE_MIN_MAX".equals(vbgVar.a())) {
            LogUtil.a("TemperatureDayCardProvider", "not show remind view");
            map.put("IS_REMIND_SHOW", false);
        } else {
            LogUtil.a("TemperatureDayCardProvider", "show remind view");
            map.put("IS_REMIND_SHOW", true);
        }
        d(map, vbgVar);
        b(map);
    }

    private void d(HashMap<String, Object> map, vbg vbgVar) {
        List<HiHealthData> listC = vbgVar.c();
        if (njy.e(listC)) {
            return;
        }
        this.f28116a.clear();
        Collections.sort(listC, new Comparator() { // from class: vbd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((HiHealthData) obj2).getEndTime(), ((HiHealthData) obj).getEndTime());
            }
        });
        if (listC.size() > 2) {
            listC = listC.subList(0, 2);
        }
        this.f28116a.addAll(a(listC));
        map.put("REMIND_DATA", this.f28116a);
    }

    private void b(Map<String, Object> map) {
        final Context context = this.e.get();
        if (context == null) {
            LogUtil.j("TemperatureDayCardProvider", "setClickListener: context is null");
        } else {
            map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureDayCardProvider.5
                @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
                public void onClick(int i) {
                }

                @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
                public void onClick(int i, int i2) {
                }

                @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
                public void onClick(int i, String str) {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }

                @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
                public void onClick(String str) {
                    try {
                        if ("TEMPERATURE_SELECT".equals(str)) {
                            ObserverManagerUtil.e(TemperatureDayCardProvider.d, "TEMPERATURE_MIN_MAX");
                            return;
                        }
                        if ("SKIN_TEMPERATURE_SELECT".equals(str)) {
                            ObserverManagerUtil.e(TemperatureDayCardProvider.d, "SKIN_TEMPERATURE_MIN_MAX");
                            return;
                        }
                        if ("REMIND_WARNING_TIP_IMG".equals(str)) {
                            if (qrs.r()) {
                                LogUtil.e("TemperatureDayCardProvider", "remind warning tip imp isFastClick");
                                return;
                            } else {
                                idy.c(AnalyticsValue.TEMPERATURE_REMIND_TIPS_2060077.value());
                                TemperatureDayCardProvider.this.e();
                                return;
                            }
                        }
                        if ("REMIND_TITLE".equals(str)) {
                            if (qrs.r()) {
                                LogUtil.e("TemperatureDayCardProvider", "remind title isFastClick");
                                return;
                            } else {
                                idy.c(AnalyticsValue.TEMPERATURE_REMIND_2060078.value());
                                context.startActivity(new Intent(context, (Class<?>) TemperatureWarningActivity.class));
                                return;
                            }
                        }
                        if (!"REMIND_HISTORY_VIEW".equals(str)) {
                            LogUtil.a("TemperatureDayCardProvider", "useless click");
                        } else if (qrs.r()) {
                            LogUtil.e("TemperatureDayCardProvider", "remind histroy text isFastClick");
                        } else {
                            idy.c(AnalyticsValue.TEMPERATURE_REMIND_2060078.value());
                            context.startActivity(new Intent(context, (Class<?>) TemperatureWarningActivity.class));
                        }
                    } catch (ActivityNotFoundException e) {
                        LogUtil.e("TemperatureDayCardProvider", "ActivityNotFoundException", e.getMessage());
                    }
                }
            });
        }
    }

    private List<ftk> a(List<HiHealthData> list) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j("TemperatureDayCardProvider", "convert list is empty");
            return arrayList;
        }
        Context context = BaseApplication.getContext();
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                ftk ftkVar = new ftk(hiHealthData.getStartTime(), hiHealthData.getEndTime());
                ftkVar.e(hiHealthData.getType());
                long endTime = hiHealthData.getEndTime() - 600000;
                long endTime2 = hiHealthData.getEndTime();
                ftkVar.c(DateUtils.formatDateRange(context, endTime, endTime2, 137));
                ftkVar.a(DateUtils.formatDateRange(context, endTime, endTime2, 153));
                if (hiHealthData.getType() == f28115c) {
                    String strE = UnitUtil.e(vbr.h(37.2f), 1, 1);
                    if (UnitUtil.a()) {
                        string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temp_over_suspected_celsius_unit, strE);
                    } else {
                        string = BaseApplication.getContext().getString(com.huawei.health.servicesui.R.string.IDS_temp_over_suspected_fahrenheit_unit, strE);
                    }
                } else {
                    String strD = d(hiHealthData.getMetaData());
                    if (!strD.isEmpty()) {
                        if (UnitUtil.a()) {
                            string = context.getResources().getString(R.string.IDS_settings_health_temperature_unit, strD);
                        } else {
                            string = context.getResources().getString(R.string.IDS_temp_unit_fahrenheit, strD);
                        }
                    }
                }
                ftkVar.d(string);
                arrayList.add(ftkVar);
            }
        }
        return arrayList;
    }

    private static String d(String str) {
        String string;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TemperatureDayCardProvider", "getCelsiusRange metaData is empty");
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            float fMin = 0.0f;
            float fMax = 0.0f;
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    if (i == 0) {
                        fMin = iIntValue;
                    }
                    float f = iIntValue;
                    fMin = Math.min(fMin, f);
                    fMax = Math.max(fMax, f);
                } else {
                    LogUtil.j("TemperatureDayCardProvider", "convert no Integer");
                }
            }
            if (fMin == 0.0f || fMax == 0.0f) {
                LogUtil.j("TemperatureDayCardProvider", "max or min error");
                return "";
            }
            String strD = d(fMin / 10.0f);
            String strD2 = d(fMax / 10.0f);
            if (UnitUtil.a()) {
                string = BaseApplication.getContext().getString(R.string.IDS_temperature_warning_celsius);
            } else {
                string = BaseApplication.getContext().getString(R.string.IDS_temperature_warning_fahrenheit);
            }
            return String.format(Locale.ENGLISH, string, strD, strD2);
        } catch (JSONException unused) {
            LogUtil.e("TemperatureDayCardProvider", "convert JSONException");
            return "";
        }
    }

    public static String d(float f) {
        if (f == 0.0f) {
            return String.valueOf(f);
        }
        if (UnitUtil.a()) {
            return UnitUtil.e(f, 1, 1);
        }
        return UnitUtil.e((f * 1.8f) + 32.0f, 1, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.e("TemperatureDayCardProvider", "start showTipDialog");
        final Context context = this.e.get();
        if (context == null) {
            LogUtil.j("TemperatureDayCardProvider", "showTipDialog: context is null");
            return;
        }
        HealthTextView healthTextView = new HealthTextView(context);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        String str = context.getString(R.string.IDS_temperature_warning_tip) + " ";
        String string = context.getString(R.string.IDS_temperature_warning_set);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        if (mbw.a()) {
            LogUtil.e("TemperatureDayCardProvider", "is Device Sport TemperatureMain");
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.huawei.ui.main.stories.health.temperature.provider.TemperatureDayCardProvider.4
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    if (TemperatureDayCardProvider.this.f != null) {
                        Intent intent = new Intent();
                        intent.setClassName(context, "com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity");
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException e) {
                            LogUtil.e("TemperatureDayCardProvider", "ActivityNotFoundException", e.getMessage());
                        }
                        TemperatureDayCardProvider.this.f.cancel();
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(ContextCompat.getColor(context, R.color.colorAccent));
                    textPaint.setUnderlineText(false);
                }
            }, str.length(), spannableStringBuilder.length(), 17);
        }
        healthTextView.setText(spannableStringBuilder);
        healthTextView.setTextAppearance(context, R.style.CustomDialog_message);
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).d(healthTextView).d(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: vbm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50908b.b(view);
            }
        }).d();
        this.f = customViewDialogD;
        customViewDialogD.show();
    }

    public /* synthetic */ void b(View view) {
        CustomViewDialog customViewDialog = this.f;
        if (customViewDialog != null) {
            customViewDialog.cancel();
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "TemperatureDayCardProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, vbg vbgVar) {
        LogUtil.a("TemperatureDayCardProvider", "onSetSectionBeanData");
        if (vbgVar.b().isEmpty() || this.g) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(vbgVar);
        }
    }
}
