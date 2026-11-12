package com.huawei.health.ecologydevice.fitness.datastruct;

import com.huawei.ecologydevice.R;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import defpackage.egx;
import defpackage.ehb;
import defpackage.ehn;
import defpackage.eho;
import defpackage.emh;
import defpackage.era;
import defpackage.erh;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qrk;
import health.compact.a.HuaweiHealth;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class LogOperationsData extends BaseRopeData {
    private static final int CHARGING_ENDS_EVENT = 1;
    private static final int CUT_SONGS_DURING_EXERCISE_EVENT = 3;
    private static final int END_OF_EXERCISE_EVENT = 2;
    private static final int ROPE_FUNCTION_CLICK_EVENT = 4;
    private static final String TAG = "LogOperationsData";
    private static final long TIME_MULTIPLIER = 1000;
    private static final int VOICE_ASSISTANT_TYPE_EVENT = 6;
    private static final int VOLUME_SETTING_EVENT = 5;
    private List<ehb> mRecords;
    private final emh mRopeDeviceManager;
    private final String mSmartProductId;
    private StringBuffer mStringBuffer;

    public LogOperationsData() {
        super(30);
        emh emhVarB = emh.b();
        this.mRopeDeviceManager = emhVarB;
        this.mRecords = new ArrayList();
        this.mStringBuffer = null;
        emhVarB.j();
        this.mSmartProductId = era.b(emhVarB.i());
    }

    public String getLogStr() {
        Object obj = this.mFitnessData.get(40061);
        return obj instanceof String ? (String) obj : "";
    }

    public void setLogStr(String str) {
        this.mFitnessData.put(40061, str);
    }

    private void parseBiLogList() {
        int i = this.mOffset;
        int iD = ehn.d(this.mData, 17, i);
        boolean z = (iD & 2) != 0;
        LogUtil.a(TAG, "isHasMoreData = ", Boolean.valueOf(z));
        if (!z && (iD & 1) == 0) {
            LogUtil.a(TAG, "No bi record in devices");
            return;
        }
        ehb ehbVar = new ehb();
        int iD2 = ehn.d(this.mData, 20, i + 1);
        LogUtil.a(TAG, "bi record time = ", Integer.valueOf(iD2));
        ehbVar.e(iD2);
        int iD3 = ehn.d(this.mData, 17, i + 5);
        LogUtil.a(TAG, "event = ", Integer.valueOf(iD3));
        HashMap map = new HashMap();
        map.put("kind_name", HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING.toString());
        map.put("macAddress", erh.d(this.mRopeDeviceManager.d()));
        map.put("prodId", this.mSmartProductId);
        parseBiContent(ehbVar, map, i + 6, iD3);
        ehbVar.b(map);
        this.mRecords.add(ehbVar);
        LogUtil.a(TAG, "biLogDatum = ", ehbVar.toString());
        if (z) {
            return;
        }
        LogUtil.a(TAG, "mRecords.size() = ", Integer.valueOf(this.mRecords.size()));
        int i2 = 0;
        for (ehb ehbVar2 : this.mRecords) {
            lmf.d().c(BaseApplication.getContext(), ehbVar2.c(), ehbVar2.d(), 0);
            i2++;
            if (i2 >= 50) {
                break;
            }
        }
        this.mRecords.clear();
        deleteDeviceBiRecords();
    }

    private void deleteDeviceBiRecords() {
        emh.b().b(6, 3, new int[]{1});
    }

    private void parseBiContent(ehb ehbVar, Map<String, Object> map, int i, int i2) {
        switch (i2) {
            case 1:
                parseChangingEndsEvent(ehbVar, map, i);
                break;
            case 2:
                parseEndOfExerciseEvent(ehbVar, map, i);
                break;
            case 3:
                ehbVar.b(AnalyticsValue.CUT_SONGS_DURING_EXERCISE_VALUE.value());
                putCutSongsDuringExerciseEvent(map, i);
                break;
            case 4:
                ehbVar.b(AnalyticsValue.ROPE_FUNCTION_CLICK_VALUE.value());
                putClickEventPara(map, i);
                break;
            case 5:
                parseVolumeSettingEvent(ehbVar, map, i);
                break;
            case 6:
                parseVoiceAssistantEvent(ehbVar, map, i);
                break;
        }
    }

    private void putClickEventPara(Map<String, Object> map, int i) {
        int iD = ehn.d(this.mData, 17, i);
        map.put("click", Integer.valueOf(iD));
        LogUtil.a(TAG, "click = ", Integer.valueOf(iD));
        int iD2 = ehn.d(this.mData, 17, i + 1);
        LogUtil.a(TAG, "eventType = ", Integer.valueOf(iD2));
        map.put("eventType", Integer.valueOf(iD2));
    }

    private void putCutSongsDuringExerciseEvent(Map<String, Object> map, int i) {
        int iD = ehn.d(this.mData, 17, i);
        LogUtil.a(TAG, "listLength = ", Integer.valueOf(iD));
        int i2 = i + 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < iD; i3++) {
            arrayList.add(Integer.valueOf(ehn.d(this.mData, 18, i2)));
            arrayList2.add(Integer.valueOf(ehn.d(this.mData, 18, i2 + 2)));
            arrayList3.add(Integer.valueOf(ehn.d(this.mData, 17, i2 + 4)));
            i2 += 5;
        }
        map.put("musicIdList", arrayList);
        map.put("musicDurationList", arrayList2);
        map.put("musicNumberList", arrayList3);
        map.put("recordTime", qrk.a(((long) ehn.d(this.mData, 20, i2)) * 1000));
    }

    private void parseVoiceAssistantEvent(ehb ehbVar, Map<String, Object> map, int i) {
        ehbVar.b(AnalyticsValue.VOICE_ASSISTANT_TYPE_EVENT.value());
        map.put("type", Integer.valueOf(ehn.d(this.mData, 17, i)));
    }

    private void parseVolumeSettingEvent(ehb ehbVar, Map<String, Object> map, int i) {
        ehbVar.b(AnalyticsValue.VOLUME_SETTING_EVENT.value());
        map.put("volume", Integer.valueOf(ehn.d(this.mData, 17, i)));
    }

    private void parseEndOfExerciseEvent(ehb ehbVar, Map<String, Object> map, int i) {
        ehbVar.b(AnalyticsValue.END_OF_EXERCISE_EVENT.value());
        map.put(Wpt.MODE, Integer.valueOf(ehn.d(this.mData, 17, i)));
        map.put("jump_numbers", Integer.valueOf(ehn.d(this.mData, 18, i + 1)));
        int iD = ehn.d(this.mData, 18, i + 3);
        map.put("jump_duration", Integer.valueOf(iD));
        long jB = ehbVar.b();
        map.put("jump_start_time", qrk.a((jB - ((long) iD)) * 1000));
        map.put("jump_end_time", qrk.a(jB * 1000));
        int iD2 = ehn.d(this.mData, 18, i + 5);
        LogUtil.a(TAG, "courseId = ", Integer.valueOf(iD2));
        map.put("course_id", Integer.valueOf(iD2));
    }

    private void parseChangingEndsEvent(ehb ehbVar, Map<String, Object> map, int i) {
        long jB = ehbVar.b();
        map.put("charge_end_time", qrk.a(jB * 1000));
        ehbVar.b(AnalyticsValue.CHARGING_ENDS_EVENT.value());
        long jD = ehn.d(this.mData, 20, i);
        map.put("charge_start_time", qrk.a(1000 * jD));
        map.put("duration", Long.valueOf(jB - jD));
        map.put("start_battery", Integer.valueOf(ehn.d(this.mData, 17, i + 4)));
        map.put("end_bettary", Integer.valueOf(ehn.d(this.mData, 17, i + 5)));
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public BaseRopeData parseData() {
        LogUtil.a(TAG, "parseData, mCode = ", Integer.valueOf(this.mCode));
        int i = this.mCode;
        if (i == 1) {
            parseBiLogList();
            return this;
        }
        if (i != 2) {
            return this;
        }
        if (this.mStringBuffer == null) {
            this.mStringBuffer = new StringBuffer();
        }
        if (this.mDataLength != 0) {
            String strE = ehn.e(ehn.c(this.mData, this.mOffset, this.mDataLength), 0);
            LogUtil.a(TAG, "logStr = ", strE);
            setLogStr(strE);
            this.mStringBuffer.append(strE);
            return this;
        }
        eho.c(this.mCode, this.mStringBuffer.toString());
        setLogStr(this.mStringBuffer.toString());
        this.mStringBuffer.setLength(0);
        this.mStringBuffer = null;
        qpx.e(HuaweiHealth.a(), HuaweiHealth.a().getResources().getString(R.string.IDS_fitness_equip_log_collection));
        return this;
    }

    @Override // com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData
    public egx getTransmitCommand() {
        byte[] bArr;
        egx.c cVar = new egx.c();
        cVar.a(this.mCommand);
        cVar.d(this.mCode);
        if (this.mCode == 3) {
            bArr = new byte[1];
            ehn.a(bArr, this.mPara[0], 0);
        } else {
            bArr = new byte[0];
        }
        cVar.e(bArr);
        return cVar.c();
    }
}
