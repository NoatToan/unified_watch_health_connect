package com.huami.watch.companion.sync;

import com.huami.watch.companion.sport.pb.PBUtil;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncDataMapper {
    public static List<SmartWatchProfile.BlePBInfo> toBlePBWatchData(List<PersonalBest> list) {
        ArrayList arrayList = new ArrayList();
        for (PersonalBest personalBest : list) {
            SmartWatchProfile.BlePBInfo blePBInfo = new SmartWatchProfile.BlePBInfo();
            blePBInfo.timestamp = (int) (personalBest.getTimestamp() / 1000);
            blePBInfo.trackId = (int) personalBest.getTrackId();
            blePBInfo.type = (byte) personalBest.getType();
            blePBInfo.value = PBUtil.convertToBleWatchValue(personalBest.getName(), personalBest.getValue());
            blePBInfo.name = (byte) PBUtil.getPBNameIndexToWatch(personalBest.getName());
            arrayList.add(blePBInfo);
        }
        return arrayList;
    }
}
