package defpackage;

import android.content.Context;
import com.huawei.health.basesport.wearengine.DeviceStateListener;
import com.huawei.health.basesport.wearengine.SportHiWearBusinessType;
import com.huawei.health.plugintrack.protobuf.rqdata.UserRunLevelDataForDevice;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.RunLevelDetail;
import com.huawei.hwcloudmodel.model.unite.UserRunLevelData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class jye implements DeviceStateListener {
    private static final Object d = new Object();
    private static jye e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jyb f39213a = jyb.e();

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnected() {
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onConnecting() {
    }

    @Override // com.huawei.health.basesport.wearengine.DeviceStateListener
    public void onDisconnected() {
    }

    private jye() {
        d(this);
    }

    private void d(DeviceStateListener deviceStateListener) {
        if (deviceStateListener == null) {
            ReleaseLogUtil.a("RQDataDeviceManager", "registerDeviceStateListener failed with null params");
        } else {
            this.f39213a.registerDeviceStateListener(deviceStateListener);
        }
    }

    public static jye d(Context context) {
        jye jyeVar;
        synchronized (d) {
            if (e == null) {
                LogUtil.a("RQDataDeviceManager", "getInstance");
                e = new jye();
            }
            jyeVar = e;
        }
        return jyeVar;
    }

    public void e(gzp gzpVar, int i, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("RQDataDeviceManager", "pushRQData enter.");
        if (gzpVar == null) {
            iBaseResponseCallback.a(1, 1);
            return;
        }
        int iE = dey.e();
        int typeValue = SportHiWearBusinessType.TRACK_RQ_DATA_INFO_FILE.getTypeValue();
        String str = "userRQData_" + typeValue + "_" + iE;
        byte[] byteArray = e(gzpVar, i).build().toByteArray();
        dey.c cVar = new dey.c();
        cVar.d(typeValue).c(byteArray.length).b(1).e(iE);
        dey deyVarA = cVar.a();
        LogUtil.d("RQDataDeviceManager", str, deyVarA.toString());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deyVarA.h());
        byteBufferAllocate.put(deyVarA.b());
        byteBufferAllocate.put(byteArray);
        byteBufferAllocate.flip();
        xiu.c cVar2 = new xiu.c();
        cVar2.a(byteBufferAllocate.array());
        dff dffVar = z ? new dff(this.f39213a, "RQDataDeviceManager", typeValue, iE, iBaseResponseCallback) : null;
        this.f39213a.registerCallback(dffVar, typeValue);
        this.f39213a.sendCommandToDevice(str, cVar2.c(), dffVar, iBaseResponseCallback);
    }

    private UserRunLevelDataForDevice.RunLevelInfo.Builder e(gzp gzpVar, int i) {
        UserRunLevelDataForDevice.RunLevelInfo.Builder builderNewBuilder = UserRunLevelDataForDevice.RunLevelInfo.newBuilder();
        UserRunLevelData userRunLevelDataE = gzpVar.e();
        RunLevelDetail runLevelDetail = gzpVar.a().get(Integer.valueOf(i));
        builderNewBuilder.setModifiedTime(gzpVar.c());
        builderNewBuilder.setKm1(userRunLevelDataE.getTimeForOneKm());
        builderNewBuilder.setKm3(userRunLevelDataE.getTimeForThreeKm());
        builderNewBuilder.setKm5(userRunLevelDataE.getTimeForFiveKm());
        builderNewBuilder.setKm10(userRunLevelDataE.getTimeForTenKm());
        builderNewBuilder.setHalfMarathon(userRunLevelDataE.getHalfMarathon());
        builderNewBuilder.setMarathon(userRunLevelDataE.getMarathon());
        builderNewBuilder.setCurrentRunLevel(userRunLevelDataE.getCurrentRunLevel());
        builderNewBuilder.setRunLevelPercent(userRunLevelDataE.getRanking());
        builderNewBuilder.setCondition(runLevelDetail.getCondition());
        builderNewBuilder.setFitness(runLevelDetail.getFitness());
        builderNewBuilder.setFatigue(runLevelDetail.getFatigue());
        builderNewBuilder.setTotalPoint(runLevelDetail.getTotalPoint());
        builderNewBuilder.build().toByteArray();
        LogUtil.a("RQDataDeviceManager", "data convert success", builderNewBuilder.build().toString());
        return builderNewBuilder;
    }
}
