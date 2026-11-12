package com.huawei.ui.thirdpartservice.syncdata;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.route.TrackInfo;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.lls;
import defpackage.lsy;
import defpackage.njy;
import defpackage.pee;
import defpackage.xcl;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class SyncDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29158a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PlatformManager f29159c = new PlatformManager();
    private final SyncStatusListener e;

    public interface SyncStatusListener {
        void endSyncData();
    }

    public SyncDataManager(Context context, SyncStatusListener syncStatusListener) {
        this.f29158a = context.getApplicationContext();
        this.e = syncStatusListener;
    }

    public void d() {
        PlatformManager platformManager = this.f29159c;
        if (platformManager != null) {
            platformManager.c();
        }
    }

    public void e() {
        PlatformManager platformManager = this.f29159c;
        if (platformManager != null) {
            platformManager.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        this.f29159c.b(new PlatformManager.PlatformStatusCallback() { // from class: com.huawei.ui.thirdpartservice.syncdata.SyncDataManager.1
            @Override // com.huawei.ui.thirdpartservice.syncdata.PlatformManager.PlatformStatusCallback
            public void onInitFinish(boolean z) {
                if (z && SyncDataManager.this.f29159c != null) {
                    SyncDataManager syncDataManager = SyncDataManager.this;
                    syncDataManager.a(syncDataManager.f29159c.b(), System.currentTimeMillis());
                } else {
                    SyncDataManager.this.e.endSyncData();
                }
            }

            @Override // com.huawei.ui.thirdpartservice.syncdata.PlatformManager.PlatformStatusCallback
            public void onSyncFinish() {
                LogUtil.a("SyncDataManager", "PlatformManager onSyncFinish");
                SyncDataManager.this.a();
                SyncDataManager.this.e.endSyncData();
            }
        });
    }

    public void c() {
        lsy.a(new Runnable() { // from class: xam
            @Override // java.lang.Runnable
            public final void run() {
                this.d.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j, long j2) {
        LogUtil.a("SyncDataManager", " load sync data: ", Long.valueOf(j), " to ", Long.valueOf(j2));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(this.f29159c.d());
        hiDataReadOption.setSortOrder(0);
        HiHealthNativeApi.a(this.f29158a).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.thirdpartservice.syncdata.SyncDataManager.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (i == 0 && (obj instanceof SparseArray)) {
                    SyncDataManager.this.b((SparseArray<?>) obj);
                } else {
                    SyncDataManager.this.e.endSyncData();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(SparseArray<?> sparseArray) {
        boolean z = false;
        if (!njy.b(sparseArray.get(0), HiHealthData.class)) {
            this.e.endSyncData();
            return;
        }
        List<HiHealthData> list = (List) sparseArray.get(0);
        if (list.isEmpty()) {
            this.e.endSyncData();
            return;
        }
        for (HiHealthData hiHealthData : list) {
            if (this.f29159c.a(hiHealthData)) {
                ReleaseLogUtil.d("R_HL_SyncDataManager", "type:", Integer.valueOf(hiHealthData.getSubType()), " execute upload start time: ", Long.valueOf(hiHealthData.getStartTime()), " end time:", Long.valueOf(hiHealthData.getEndTime()));
                HiTrackMetaData hiTrackMetaDataD = d(hiHealthData);
                if (hiTrackMetaDataD != null) {
                    ReleaseLogUtil.d("R_HL_SyncDataManager", "data need sync", Integer.valueOf(hiHealthData.getSubType()));
                    e(this.f29158a, hiTrackMetaDataD, hiHealthData.getStartTime(), hiHealthData.getEndTime());
                    z = true;
                }
            }
        }
        if (z) {
            return;
        }
        ReleaseLogUtil.d("R_HL_SyncDataManager", "no data need sync");
        this.e.endSyncData();
    }

    private void e(Context context, final HiTrackMetaData hiTrackMetaData, long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.ui.thirdpartservice.syncdata.SyncDataManager.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (i != 0 || !(obj instanceof SparseArray)) {
                    LogUtil.j("SyncDataManager", "Query detail data error: ");
                } else {
                    SyncDataManager.this.d((SparseArray) obj, hiTrackMetaData);
                }
            }
        });
    }

    private HiTrackMetaData d(HiHealthData hiHealthData) {
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) lls.b(hiHealthData.getMetaData(), new TypeToken<HiTrackMetaData>(this) { // from class: com.huawei.ui.thirdpartservice.syncdata.SyncDataManager.4
        });
        if (hiTrackMetaData == null) {
            LogUtil.j("SyncDataManager", "Track meta data is null.");
            return null;
        }
        int abnormalTrack = hiTrackMetaData.getAbnormalTrack();
        int duplicated = hiTrackMetaData.getDuplicated();
        if (abnormalTrack == 0 && duplicated == 0) {
            return hiTrackMetaData;
        }
        LogUtil.j("SyncDataManager", "TrackMetaData is abnormal or repetition: ", Integer.valueOf(abnormalTrack), ", ", Integer.valueOf(duplicated));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(SparseArray<?> sparseArray, HiTrackMetaData hiTrackMetaData) {
        LogUtil.a("SyncDataManager", "parseSingleData: ");
        Object obj = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.j("SyncDataManager", "paseSingleData onResult obj not instanceof List");
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            LogUtil.j("SyncDataManager", "paseSingleData onResult list is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            LogUtil.j("SyncDataManager", "paseSingleData onResult hiHealthData is null");
            return;
        }
        if (this.f29159c.a(hiHealthData)) {
            try {
                String strC = CommonUtil.c(BaseApplication.b().getFilesDir().getCanonicalPath());
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("SyncDataManager", "readTemporaryMotionPath savePath is empty");
                    return;
                }
                String strD = xcl.d(strC, hiHealthData.getSequenceFileUrl());
                TrackInfo trackInfoB = !TextUtils.isEmpty(strD) ? xcl.b(strD) : null;
                LogUtil.a("SyncDataManager", "createGpxFile");
                this.f29159c.a(hiHealthData, hiTrackMetaData, trackInfoB);
            } catch (IOException e) {
                LogUtil.e("SyncDataManager", LogAnonymous.b(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (!pee.e(b())) {
                LogUtil.j("SyncDataManager", "delete gpx file error.");
            } else {
                LogUtil.a("SyncDataManager", "delete gpx file success.");
            }
        } catch (IOException e) {
            LogUtil.j("SyncDataManager", "delete gpx file error.", e.getMessage());
        }
    }

    private File b() throws IOException {
        return new File(CommonUtil.c(BaseApplication.b().getFilesDir().getCanonicalPath()), SyncDataConstant.SYNC_DATA_TRACKS_FOLDER + File.separator + SyncDataConstant.SYNC_DATA_TRACKS_EXPORT_FOLDER);
    }
}
