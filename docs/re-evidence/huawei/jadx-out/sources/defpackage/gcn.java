package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.huawei.haf.bundle.AppBundlePluginProxy;
import com.huawei.haf.router.routes.AppRoute$$Info$$HuaweiHealth;
import com.huawei.health.motiontrack.api.TrackManagerApi;
import com.huawei.health.motiontrack.api.ViewHolderBase;
import com.huawei.health.servicesapi.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class gcn extends AppBundlePluginProxy<TrackManagerApi> implements TrackManagerApi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile gcn f34900b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TrackManagerApi f34901a;

    private gcn() {
        super("TrackManagerProxy", AppRoute$$Info$$HuaweiHealth.M_57, "com.huawei.healthcloud.plugintrack.impl.TrackManagerImpl");
        this.f34901a = createPluginApi();
    }

    public static gcn c() {
        gcn gcnVar;
        if (f34900b == null) {
            synchronized (gcn.class) {
                if (f34900b == null) {
                    f34900b = new gcn();
                }
                gcnVar = f34900b;
            }
            return gcnVar;
        }
        return f34900b;
    }

    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    public boolean isPluginAvaiable() {
        return f34900b != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.bundle.AppBundlePluginProxy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(TrackManagerApi trackManagerApi) {
        this.f34901a = trackManagerApi;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean getRunWorkoutStarted() {
        if (isPluginAvaiable()) {
            return this.f34901a.getRunWorkoutStarted();
        }
        return false;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean getVoiceEnable() {
        if (isPluginAvaiable()) {
            return this.f34901a.getVoiceEnable();
        }
        return false;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void initTargetList(List<gze> list) {
        if (isPluginAvaiable()) {
            this.f34901a.initTargetList(list);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public ViewHolderBase getChartViewHolder(Context context, int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.getChartViewHolder(context, i);
        }
        return null;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int getHeartPostureType(int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.getHeartPostureType(i);
        }
        return 1;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean isSportingStatus() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.isSportingStatus();
        }
        return false;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public Map<Integer, Float> validPaceMap(Map<Integer, Float> map) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.validPaceMap(map);
        }
        return new TreeMap();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean sentHeartZoneSplicingMessages() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.sentHeartZoneSplicingMessages();
        }
        return false;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void pushRqData(int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.pushRqData(i);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getUserRunLevelDataByRq(int i, int i2, int i3, IBaseResponseCallback iBaseResponseCallback) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.getUserRunLevelDataByRq(i, i2, i3, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getTrackDraw(List<Map<Long, double[]>> list, IBaseResponseCallback iBaseResponseCallback) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.getTrackDraw(list, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void getTrackDraw(List<Long> list, List<Long> list2, IBaseResponseCallback iBaseResponseCallback) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.getTrackDraw(list, list2, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public MotionPath readTemporaryMotionPath(Context context, String str) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi == null) {
            return null;
        }
        trackManagerApi.readTemporaryMotionPath(context, str);
        return null;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void initGolfDeviceEngineManager() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.initGolfDeviceEngineManager();
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startTrackDetail(long j, long j2) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.startTrackDetail(j, j2);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startNearTrackDetail() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.startNearTrackDetail();
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void gotoSport(Context context, int i, int i2, float f) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.gotoSport(context, i, i2, f);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int startRunCourseSport(Context context, int i, int i2, float f, Bundle bundle) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.startRunCourseSport(context, i, i2, f, bundle);
        }
        return 1;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void playSound(Object obj, String str) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.playSound(obj, str);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void playSound(String str, Object obj, String str2) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.playSound(str, obj, str2);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void sendPlayerCommand(String str, int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.sendPlayerCommand(str, i);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void startVoiceService(String str, String str2, int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.startVoiceService(str, str2, i);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void stopVoiceService(String str) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.stopVoiceService(str);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public List<Integer> getFitnessSportTypeList(String str) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.getFitnessSportTypeList(str);
        }
        return new ArrayList();
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void pourInterfaceToKitSportApi() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.pourInterfaceToKitSportApi();
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public int getSportState() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.getSportState();
        }
        return -1;
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public Drawable acquireSportTypeDrawable(int i) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.acquireSportTypeDrawable(i);
        }
        return BaseApplication.getContext().getDrawable(R.drawable.ic_health_list_outdoor_running);
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void stopLastAutoTrack() {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.stopLastAutoTrack();
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public String getMarathonTitleName(Map<String, String> map) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.getMarathonTitleName(map);
        }
        return "";
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public void showEditRecordNameDialog(Context context, long j, long j2, int i, IBaseResponseCallback iBaseResponseCallback) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            trackManagerApi.showEditRecordNameDialog(context, j, j2, i, iBaseResponseCallback);
        }
    }

    @Override // com.huawei.health.motiontrack.api.TrackManagerApi
    public boolean deleteFile(Context context, String str) {
        TrackManagerApi trackManagerApi = this.f34901a;
        if (trackManagerApi != null) {
            return trackManagerApi.deleteFile(context, str);
        }
        return false;
    }
}
