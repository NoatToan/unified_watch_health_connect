package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.ArrayUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler;
import com.huawei.ui.thirdpartservice.syncdata.SyncTask;
import com.huawei.ui.thirdpartservice.syncdata.net.SyncDataToKomootApi;
import com.huawei.ui.thirdpartservice.syncdata.oauth.OauthManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class xbu extends BasePlatformHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f52683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<Integer> f52684c;
    private final SyncDataToKomootApi d;

    public xbu(Context context, BasePlatformHandler.SyncResultListener syncResultListener) {
        super(context, syncResultListener);
        this.f52683b = new int[]{257, 258, 259};
        this.d = (SyncDataToKomootApi) oet.d().e(SyncDataToKomootApi.class);
        init();
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getPlatform() {
        return "Komoot";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getSyncFileType() {
        return "gpx";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public OauthManager getOauthManager() {
        return xbp.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ SyncTask c(HiHealthData hiHealthData, File file) {
        return new xbv(hiHealthData, getGpxType(hiHealthData.getSubType()), file, this.d);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public BasePlatformHandler.GenerateSyncDataTaskFactory getGenerateSyncDataTaskFactory() {
        return new BasePlatformHandler.GenerateSyncDataTaskFactory() { // from class: xbq
            @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler.GenerateSyncDataTaskFactory
            public final SyncTask generateSyncDataTask(HiHealthData hiHealthData, File file) {
                return this.f52679a.c(hiHealthData, file);
            }
        };
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public Set<Integer> getSyncDataType() {
        if (this.f52684c == null) {
            this.f52684c = new HashSet();
        }
        this.f52684c.addAll(Arrays.asList(ArrayUtils.toWrapperArray(this.f52683b)));
        return Collections.unmodifiableSet(this.f52684c);
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getGpxType(int i) {
        switch (i) {
            case 257:
                return "hike";
            case 258:
                return "jogging";
            case 259:
                return "touringbicycle";
            default:
                return "";
        }
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public String getSynchronizedTimeStampsKey() {
        return "key_komoot_synchronized_time";
    }

    @Override // com.huawei.ui.thirdpartservice.syncdata.BasePlatformHandler
    public boolean needUpload(HiHealthData hiHealthData) {
        return super.needUpload(hiHealthData) && hiHealthData.getInt("trackdata_deviceType") != 32;
    }
}
