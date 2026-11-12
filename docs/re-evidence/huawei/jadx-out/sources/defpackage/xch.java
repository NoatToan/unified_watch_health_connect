package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler;
import com.huawei.ui.thirdpartservice.syncdata.SyncTask;
import com.huawei.ui.thirdpartservice.syncdata.net.SyncDataToStravaApi;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class xch extends BasePlatformHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f52697b;
    private Set<Integer> d;
    private final SyncDataToStravaApi e;

    public xch(Context context, BasePlatformHandler.SyncResultListener syncResultListener) {
        super(context, syncResultListener);
        this.f52697b = new int[]{257, 281, 258, OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE, 264, 259, OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE, OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM, 262, 282, 195, 217, 219, 218, 203, 199, OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE, 202, 194, 140, 143, 137, OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT, 138, OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER, 130, OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE, a.C, 227};
        this.e = (SyncDataToStravaApi) oet.d().e(SyncDataToStravaApi.class);
        init();
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getPlatform() {
        return "Strava";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getSyncFileType() {
        return BasePlatformHandler.SYNC_FILE_TYPE_FIT;
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public OauthManager getOauthManager() {
        return xcj.c();
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public BasePlatformHandler.GenerateSyncDataTaskFactory getGenerateSyncDataTaskFactory() {
        return new BasePlatformHandler.GenerateSyncDataTaskFactory() { // from class: xck
            @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler.GenerateSyncDataTaskFactory
            public final SyncTask generateSyncDataTask(HiHealthData hiHealthData, File file) {
                return this.f52700b.c(hiHealthData, file);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SyncTask c(HiHealthData hiHealthData, File file) {
        return new xcn(hiHealthData, d(hiHealthData), file, this.e);
    }

    private String d(HiHealthData hiHealthData) {
        if (hiHealthData.getSubType() == 227) {
            try {
                return gcn.c().getMarathonTitleName(((HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class)).getExtendTrackMap());
            } catch (Exception e) {
                ReleaseLogUtil.e("Strava", "Strava get desc parse json error: ", ExceptionUtils.c(e));
                return "";
            }
        }
        return getGpxType(hiHealthData.getSubType());
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getGpxType(int i) {
        switch (i) {
            case 257:
                return "Walk";
            case 258:
                return "Run";
            case 259:
                return "Ride";
            default:
                return "";
        }
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public Set<Integer> getSyncDataType() {
        if (this.d == null) {
            this.d = new HashSet();
        }
        this.d.addAll(Arrays.asList(ArrayUtils.toWrapperArray(this.f52697b)));
        return Collections.unmodifiableSet(this.d);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getSynchronizedTimeStampsKey() {
        return "key_strava_synchronized_time";
    }
}
