package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.model.bean.PrivacyDataModel;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDetailActivity;
import defpackage.coq;
import defpackage.fsp;
import defpackage.fua;
import defpackage.iov;
import defpackage.lmf;
import defpackage.ltc;
import defpackage.qrs;
import defpackage.twu;
import defpackage.wgv;
import defpackage.wia;
import defpackage.wua;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenRecordProvider extends MinorProvider<twu> {
    twu d;
    Context e;

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public void loadDefaultData(SectionBean sectionBean) {
        super.loadDefaultData(sectionBean);
        sectionBean.c(d(BaseApplication.getContext()));
    }

    private HashMap<String, Object> d(Context context) {
        HashMap<String, Object> map = new HashMap<>();
        if (fua.e()) {
            map.put("TITLE", context.getString(R.string.IDS_hw_health_lower_spo2_high_risk));
        } else {
            map.put("TITLE", context.getString(R.string.IDS_hw_health_blood_oxygen_lower_spo2));
        }
        map.put("SHOWMORE", context.getString(R.string.IDS_hw_health_blood_oxygen_more_records));
        map.put("TITLE_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_assessment));
        map.put("RIGHT_ICON", Integer.valueOf(R.drawable.common_ui_arrow_right));
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_percent);
        map.put("LEFT_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_risk));
        map.put("MIDDLE_UNIT", string);
        String string2 = BaseApplication.getContext().getResources().getString(com.huawei.health.servicesui.R.string.IDS_fitness_data_list_activity_meter_unit);
        map.put("MIDDLE_TEXT", context.getString(R.string.IDS_hw_show_main_permission_blood_oxygen));
        map.put("RIGHT_UNIT", string2);
        map.put("RIGHT_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_elevation));
        map.put("EXTRA_LEFT_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_lower_spo2));
        map.put("EXTRA_RIGHT_ICON", Integer.valueOf(R.drawable.common_ui_arrow_right));
        map.put("EXTRA_BOTTOM_TEXT", context.getString(R.string.IDS_hw_health_blood_oxygen_elevation));
        map.put("EXTRA_BOTTOM_UNIT", string2);
        return map;
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, twu twuVar) {
        this.d = twuVar;
        this.e = BaseApplication.getContext();
        map.put("VIEW_LIST", c(this.d));
        b(map);
    }

    private List<fsp> c(twu twuVar) {
        if (twuVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        List<HiHealthData> listC = twuVar.c();
        if (listC == null) {
            return new ArrayList();
        }
        for (HiHealthData hiHealthData : listC) {
            if (hiHealthData.getInt("bloodOxygenCardKey") == 1001) {
                if (hiHealthData.getInt("altitudeKey") == Integer.MIN_VALUE) {
                    LogUtil.a("BloodOxygenRecordProvider", "The altitude data is being synchronized");
                } else {
                    arrayList.add(c(hiHealthData));
                }
            } else if (!fua.e() || hiHealthData.getInt("altitudeKey") <= 2500) {
                fsp fspVar = new fsp();
                fspVar.c(1);
                int intValue = hiHealthData.getIntValue();
                fspVar.d(wua.c(this.e, hiHealthData.getLong("start_time")));
                fspVar.a(ltc.c(intValue, 2, 0));
                fspVar.e(wua.c(intValue));
                arrayList.add(fspVar);
            } else if (hiHealthData.getInt("altitudeKey") == Integer.MIN_VALUE) {
                LogUtil.a("BloodOxygenRecordProvider", "The altitude data is being synchronized");
            } else {
                fsp fspVar2 = new fsp();
                fspVar2.c(2);
                int intValue2 = hiHealthData.getIntValue();
                fspVar2.d(wua.c(this.e, hiHealthData.getLong("start_time")));
                fspVar2.a(ltc.c(intValue2, 2, 0));
                fspVar2.e(wua.c(intValue2));
                fspVar2.b(wgv.e(hiHealthData.getInt("altitudeKey")));
                arrayList.add(fspVar2);
            }
        }
        return arrayList;
    }

    private void a(int i, fsp fspVar) {
        String strH = wua.h(i);
        if (strH.equals(this.e.getString(R.string.IDS_hw_health_blood_oxygen_mild))) {
            fspVar.e(this.e.getResources().getDrawable(R.drawable.section_blood_oxygen_yellow_button));
            fspVar.c(strH);
        } else if (strH.equals(this.e.getString(R.string.IDS_hw_health_blood_oxygen_moderate))) {
            fspVar.e(this.e.getResources().getDrawable(R.drawable.section_blood_oxygen_orange_button));
            fspVar.c(strH);
        } else if (strH.equals(this.e.getString(R.string.IDS_hw_health_blood_oxygen_severe))) {
            fspVar.e(this.e.getResources().getDrawable(R.drawable.section_blood_oxygen_red_button));
            fspVar.c(strH);
        } else {
            fspVar.e(this.e.getResources().getDrawable(R.drawable.section_blood_oxygen_green_button));
            fspVar.c(strH);
        }
    }

    private fsp c(HiHealthData hiHealthData) {
        fsp fspVar = new fsp();
        fspVar.c(0);
        int i = hiHealthData.getInt("lakeLouiseScoreKey");
        int intValue = hiHealthData.getIntValue();
        long j = hiHealthData.getLong("start_time");
        fspVar.e(wia.e(this.e, "[\\d]", wgv.e(hiHealthData.getInt("altitudeKey")), R.style.privacy_only_risk_num, R.style.privacy_only_risk_unit));
        fspVar.e(wua.c(intValue));
        fspVar.d(wua.c(this.e, j));
        fspVar.e(wgv.c(intValue));
        fspVar.d(wua.e(i));
        a(i, fspVar);
        fspVar.b(wia.e(this.e, "[\\d]", this.e.getResources().getQuantityString(R.plurals.IDS_hw_health_blood_oxygen_score, i, Integer.valueOf(i)), R.style.privacy_only_risk_num, R.style.privacy_only_risk_unit));
        return fspVar;
    }

    private void b(Map<String, Object> map) {
        map.put("CLICK_EVENT_LISTENER", new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenRecordProvider.2
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
                if (qrs.c(500)) {
                    return;
                }
                if (!"SHOWMORE".equals(str)) {
                    LogUtil.a("BloodOxygenRecordProvider", "useless click");
                    return;
                }
                LogUtil.a("BloodOxygenRecordProvider", "begin to click show more");
                PageModelArgs pageModelArgs = new PageModelArgs(105, "PrivacyDataConstructor", 3, 1);
                pageModelArgs.setClassType(0);
                if (fua.e()) {
                    pageModelArgs.putInt("Subpage", 4);
                    List<HiHealthData> listC = BloodOxygenRecordProvider.this.d != null ? BloodOxygenRecordProvider.this.d.c() : null;
                    if (listC != null && listC.size() > 0) {
                        pageModelArgs.putLong("Time", listC.get(listC.size() - 1).getStartTime());
                    }
                }
                Intent intent = new Intent(BloodOxygenRecordProvider.this.e, (Class<?>) PrivacyDataModelActivity.class);
                intent.putExtra("extra_page_model_args", pageModelArgs);
                iov.d(BloodOxygenRecordProvider.this.e, intent);
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                if (qrs.c(500)) {
                    return;
                }
                LogUtil.a("BloodOxygenRecordProvider", "click position" + i);
                BloodOxygenRecordProvider.this.c(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        PrivacyDataModel privacyDataModel = new PrivacyDataModel();
        List<HiHealthData> listC = this.d.c();
        if (coq.d(listC) || i < 0 || i > listC.size() - 1) {
            LogUtil.a("BloodOxygenRecordProvider", "dataList is null or position out of bounds");
            return;
        }
        HiHealthData hiHealthData = listC.get(i);
        privacyDataModel.setStartTime(hiHealthData.getLong("start_time"));
        privacyDataModel.setEndTime(hiHealthData.getEndTime());
        privacyDataModel.setModifyTime(hiHealthData.getModifiedTime());
        privacyDataModel.setClientId(hiHealthData.getClientId());
        privacyDataModel.putInt("bloodOxygenKey", hiHealthData.getIntValue());
        privacyDataModel.putInt("altitudeKey", hiHealthData.getInt("altitudeKey"));
        if (hiHealthData.getInt("lakeLouiseScoreKey") != 0) {
            e(hiHealthData);
            privacyDataModel.putInt("lakeLouiseScoreKey", hiHealthData.getInt("lakeLouiseScoreKey"));
        }
        b(hiHealthData);
        PageModelArgs pageModelArgs = new PageModelArgs();
        pageModelArgs.setDataSource(3);
        pageModelArgs.setPageType(105);
        Intent intent = new Intent();
        intent.putExtra("extra_privacy_data_model", privacyDataModel);
        intent.putExtra("extra_page_model_args", pageModelArgs);
        intent.setClass(this.e, PrivacyDetailActivity.class);
        try {
            iov.d(this.e, intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("BloodOxygenRecordProvider", "ActivityNotFoundException" + e.getMessage());
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider
    public String getLogTag() {
        return "BloodOxygenRecordProvider";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, twu twuVar) {
        if (coq.d(twuVar.c())) {
            sectionBean.c((Object) null);
        } else {
            sectionBean.c(twuVar);
        }
    }

    public void e(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", 1);
        int iIntValue = wua.f52491c.get(Integer.valueOf(hiHealthData.getInt("lakeLouiseScoreKey"))).intValue();
        if (iIntValue == 3) {
            map.put("level", "3");
        } else if (iIntValue == 2) {
            map.put("level", "2");
        } else if (iIntValue == 1) {
            map.put("level", "1");
        } else {
            LogUtil.a("BloodOxygenRecordProvider", "cardType is invalid" + iIntValue);
        }
        lmf.d().c(this.e, AnalyticsValue.BLOOD_OXYGEN_ABNORMAL_DATA.value(), map, 0);
        LogUtil.a("BloodOxygenRecordProvider", "BICollect", Marker.ANY_NON_NULL_MARKER + map.get("level"));
    }

    public void b(HiHealthData hiHealthData) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("type", 2);
        int iA = wua.a(hiHealthData.getIntValue());
        int iA2 = wua.a(iA);
        if (iA2 == 2) {
            map.put("level", "2");
        } else if (iA2 == 1) {
            map.put("level", "1");
        } else {
            LogUtil.a("BloodOxygenRecordProvider", "BloodOxygenAbnormal is invalid" + iA + Marker.ANY_NON_NULL_MARKER + iA2);
        }
        lmf.d().c(this.e, AnalyticsValue.BLOOD_OXYGEN_ABNORMAL_DATA.value(), map, 0);
    }
}
