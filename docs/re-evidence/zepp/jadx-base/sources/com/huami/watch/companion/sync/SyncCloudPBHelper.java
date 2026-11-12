package com.huami.watch.companion.sync;

import android.content.Context;
import com.google.gson.Gson;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.sport.event.PBInfoChangedEvent;
import com.huami.watch.companion.sport.pb.PBConfig;
import com.huami.watch.companion.sport.pb.PBDataAPI;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.sport.pb.PBType;
import com.huami.watch.companion.sport.pb.PBUtil;
import com.huami.watch.companion.sport.pb.PersonalBest;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SyncCloudPBHelper extends BaseSyncHelper {
    private static final String e = "SyncCloud-PBData";

    private long a(List<PersonalBest> list) {
        long j = -1;
        for (PersonalBest personalBest : list) {
            PBType pBTypeFind = PBType.find(personalBest.getName());
            if (pBTypeFind != null && (pBTypeFind.getUnit() == PBManager.get().getUnit(this.mContext) || pBTypeFind.getUnit() == PBConfig.Unit.NONE)) {
                long trackId = personalBest.getTrackId();
                if (trackId > j) {
                    j = trackId;
                }
            }
        }
        return j;
    }

    private long b() {
        return !UnitManager.isDistanceKM(this.mContext) ? Box.getPBImperialUnconfirmedTrackId().longValue() : Box.getPBMetricUnconfirmedTrackId().longValue();
    }

    private void c(long j) {
        if (UnitManager.isDistanceKM(this.mContext)) {
            Box.putPBMetricUnconfirmedTrackId(j);
        } else {
            Box.putPBImperialUnconfirmedTrackId(j);
        }
    }

    private void d() {
        PBDataAPI.PersonalBestResult pBData = PBDataAPI.getPBData(this.mContext, PBConfig.KEY_CONFIRMED);
        PBDataAPI.PersonalBestResult pBData2 = PBDataAPI.getPBData(this.mContext, PBConfig.KEY_UNCONFIRMED);
        if (pBData.success && pBData2.success) {
            List<PersonalBest> arrayList = pBData.infoList;
            List<PersonalBest> arrayList2 = pBData2.infoList;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList<>();
            }
            e(arrayList, arrayList2);
            arrayList.addAll(arrayList2);
            String json = new Gson().toJson(arrayList);
            String personalBestInfo = Box.getPersonalBestInfo();
            Log.d(e, "Cloud pb data:" + json + ",local:" + personalBestInfo, new Object[0]);
            if (personalBestInfo.equals(json)) {
                return;
            }
            long jB = b();
            long jA = a(arrayList2);
            if (jA > jB) {
                Log.d(e, "New pb data coming...", new Object[0]);
                PBManager.get().setHasNewUnconfirmed(true);
                c(jA);
            }
            Box.putPersonalBestInfo(json);
            PBManager.get().refresh();
            RxBus.get().postMainThread(new PBInfoChangedEvent());
        }
    }

    private void e(List<PersonalBest> list, List<PersonalBest> list2) {
        Iterator<PersonalBest> it2 = list2.iterator();
        while (it2.hasNext()) {
            PersonalBest next = it2.next();
            PBType pBTypeFind = PBType.find(next.getName());
            if (pBTypeFind != null) {
                for (PersonalBest personalBest : list) {
                    if (pBTypeFind == PBType.find(personalBest.getName()) && !PBUtil.isValueValid(pBTypeFind.getName(), next.getValue(), personalBest.getValue())) {
                        Log.d(e, "Unconfirmed pb is not valid:" + next, new Object[0]);
                        it2.remove();
                        break;
                    }
                }
            } else {
                it2.remove();
            }
        }
    }

    public static SyncCloudPBHelper getHelper(Context context) {
        return (SyncCloudPBHelper) BaseSyncHelper.getHelper(context, null, SyncCloudPBHelper.class);
    }

    @Override // com.huami.watch.companion.sync.BaseSyncHelper
    public boolean onStart() {
        d();
        return true;
    }
}
