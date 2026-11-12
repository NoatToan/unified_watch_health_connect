package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.baseapi.pluginlocation.TrackOptimizationApi;
import com.huawei.health.baseapi.pluginlocation.callback.HwPluginCloudTrackCallback;
import com.huawei.health.baseapi.pluginlocation.callback.HwPluginTrackMapCallback;
import com.huawei.health.pluginlocation.TrackProcess;
import com.huawei.health.pluginlocation.Utils.BiApi;
import com.huawei.health.pluginlocation.Utils.BiReportImpl;
import com.huawei.health.pluginlocation.fileserviceutil.GpsFileUtil;
import com.huawei.health.pluginlocation.logger.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class gqp implements TrackOptimizationApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f35910c = false;
    private TrackProcess e = new TrackProcess();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GpsFileUtil f35911b = new GpsFileUtil();

    static {
        try {
            System.loadLibrary("TrackProcessNew");
            f35910c = true;
        } catch (UnsatisfiedLinkError unused) {
            grn.e("AAR,TrackOptimizationImpl", "can't load TrackProcessNew");
            f35910c = false;
        }
    }

    public gqp(BiApi biApi, Logger logger) {
        grn.a(logger);
        if (biApi == null) {
            grn.c("AAR,TrackOptimizationImpl", "biApi is null");
        } else {
            new BiReportImpl(biApi);
        }
    }

    @Override // com.huawei.health.baseapi.pluginlocation.TrackOptimizationApi
    public int getOptimizedTrack(String str, String str2, String str3, boolean z, HwPluginTrackMapCallback hwPluginTrackMapCallback, boolean z2, String str4) {
        if (a(str4)) {
            return this.f35911b.pluginGetOptimizedTrack(str, str2, z, hwPluginTrackMapCallback, z2, str3);
        }
        return -1;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            grn.d("AAR,TrackOptimizationImpl", "device not support, stop getOptimizedTrack");
            return false;
        }
        if (f35910c) {
            return true;
        }
        grn.d("AAR,TrackOptimizationImpl", "getOptimizedTrack lib not load");
        return false;
    }

    @Override // com.huawei.health.baseapi.pluginlocation.TrackOptimizationApi
    public void postMotionPath(List<gqm> list) {
        this.e.postMotionPath(list);
    }

    @Override // com.huawei.health.baseapi.pluginlocation.TrackOptimizationApi
    public void setExtraData(boolean z, boolean z2, Context context, String str) {
        this.f35911b.setExtraData(z, z2, context, str);
    }

    @Override // com.huawei.health.baseapi.pluginlocation.TrackOptimizationApi
    public void getCloudTrack(HwPluginCloudTrackCallback hwPluginCloudTrackCallback) {
        this.e.getCloudTrack(hwPluginCloudTrackCallback);
    }
}
