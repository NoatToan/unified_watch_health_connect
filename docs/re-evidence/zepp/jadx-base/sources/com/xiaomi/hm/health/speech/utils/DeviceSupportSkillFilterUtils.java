package com.xiaomi.hm.health.speech.utils;

import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.speech.constant.BandSeriesDeviceSkill;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class DeviceSupportSkillFilterUtils {
    private static ArrayList<BandSeriesDeviceSkill> a = new ArrayList<>();
    private static ArrayList<BandSeriesDeviceSkill> b;

    static {
        ArrayList<BandSeriesDeviceSkill> arrayList = new ArrayList<>();
        b = arrayList;
        arrayList.addAll(Arrays.asList(BandSeriesDeviceSkill.values()));
    }

    private static ArrayList<BandSeriesDeviceSkill> a(HMMiLiProDevice hmMiLiProDevice) {
        return HMDeviceConfig.hasFeatureSpeech(hmMiLiProDevice.getDeviceInfo().getDeviceSource()) ? b : a;
    }

    public static boolean isSpecifiedSkillInDeviceSupportSkillCollection(BandSeriesDeviceSkill specifiedDeviceSkill, HMMiLiProDevice hmMiLiProDevice) {
        if (specifiedDeviceSkill != null && hmMiLiProDevice != null) {
            Iterator<BandSeriesDeviceSkill> it2 = a(hmMiLiProDevice).iterator();
            while (it2.hasNext()) {
                if (it2.next() == specifiedDeviceSkill) {
                    return true;
                }
            }
        }
        return false;
    }
}
