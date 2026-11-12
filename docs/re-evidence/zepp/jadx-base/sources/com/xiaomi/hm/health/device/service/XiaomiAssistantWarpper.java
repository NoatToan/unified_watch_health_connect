package com.xiaomi.hm.health.device.service;

import android.content.Context;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import java.util.Calendar;
import miui.assistant.index.AssistContentIndex;
import miui.assistant.index.AssistContentItem;
import miui.assistant.index.IndexCallback;
import miui.assistant.index.IndexStatus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class XiaomiAssistantWarpper {
    private static final String a = "XiaomiAssistantWarpper";

    public class a implements IndexCallback {
        @Override // miui.assistant.index.IndexCallback
        public void onIndexed(IndexStatus indexStatus) {
            if (indexStatus == null) {
                HMLog.i(XiaomiAssistantWarpper.a, "IndexStatus is null!!!", new Object[0]);
                return;
            }
            HMLog.i(XiaomiAssistantWarpper.a, "onIndexed:" + indexStatus.getCode() + "," + indexStatus.getDesc(), new Object[0]);
        }
    }

    private static boolean a(Context context) {
        if (!MiuiAPI.isMiui(context)) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.miui.personalassistant", 0) != null;
        } catch (Exception e) {
            HMLog.i(a, "Exception:" + e.getMessage(), new Object[0]);
            return false;
        }
    }

    public static void postToXiaomiAssistant(Context context, RealtimeStep realtimeStep) {
        int totalDis;
        int totalCal;
        if (!a(context)) {
            HMLog.i(a, "not support xiaomi assistant!!!", new Object[0]);
            return;
        }
        if (realtimeStep == null || realtimeStep.getTotalStep() < 0) {
            HMLog.i(a, "realtime step is empty!!!", new Object[0]);
            return;
        }
        AssistContentItem assistContentItem = new AssistContentItem();
        int totalStep = realtimeStep.isSupportStepExtra() ? realtimeStep.getTotalStep() : realtimeStep.getTotalStep() + HMDeviceUtils.getBindBaseStep();
        assistContentItem.setUniqueId("1");
        assistContentItem.setCardName(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
        assistContentItem.setTitle(String.valueOf(totalStep));
        assistContentItem.setUnit(context.getResources().getString(R.string.step));
        assistContentItem.setUri(String.format("%s://%s/action", HMConfig.getScheme(), HMConfig.getAppHost()));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        assistContentItem.setDueTime(calendar.getTimeInMillis() - System.currentTimeMillis());
        if (realtimeStep.isSupportStepExtra()) {
            totalDis = realtimeStep.getTotalDis();
            totalCal = realtimeStep.getTotalCal();
        } else {
            int[] disAndCalByStep = HMDeviceUtils.getDisAndCalByStep(totalStep);
            totalDis = disAndCalByStep[0];
            totalCal = disAndCalByStep[1];
        }
        String str = UnitManager.getInstance().formatValue(totalDis) + UnitManager.getInstance().getUnit(totalDis);
        String str2 = totalCal + context.getString(R.string.kilo_cal);
        assistContentItem.setContentDescription(str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cal", str2);
            assistContentItem.setExtrasJson(jSONObject.toString());
        } catch (Exception unused) {
        }
        HMLog.i(a, "step:" + totalStep + ",disDes:" + str + ",calDes:" + str2, new Object[0]);
        AssistContentIndex.getDefaultIndex().indexItem(context, assistContentItem, new a());
    }
}
