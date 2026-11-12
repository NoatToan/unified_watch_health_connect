package defpackage;

import com.google.gson.GsonBuilder;
import com.huawei.health.ecologydevice.callback.RopeHistoryCallback;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ehc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ehg> f32971a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ehg> f32972b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RopeHistoryCallback f32973c;
    private String e;

    public ehc(String str, RopeHistoryCallback ropeHistoryCallback) {
        this.e = str;
        this.f32973c = ropeHistoryCallback;
    }

    public void c(RopeHistoryCallback ropeHistoryCallback) {
        this.f32973c = ropeHistoryCallback;
    }

    public void b(ehg ehgVar) {
        LogUtil.d("PDROPE_RopeHistoryProcessor", "old size before:", Integer.valueOf(this.f32971a.size()));
        if (ehgVar == null) {
            return;
        }
        if (njy.b(this.f32971a)) {
            Iterator<ehg> it = this.f32971a.iterator();
            while (it.hasNext()) {
                if (it.next().g() == ehgVar.g()) {
                    return;
                }
            }
        }
        RopeHistoryCallback ropeHistoryCallback = this.f32973c;
        if (ropeHistoryCallback != null) {
            ropeHistoryCallback.mergeHistorySuccess(ehgVar.e());
        }
        this.f32971a.add(ehgVar);
        LogUtil.d("PDROPE_RopeHistoryProcessor", "old size after:", Integer.valueOf(this.f32971a.size()));
    }

    public void a() {
        LogUtil.a("PDROPE_RopeHistoryProcessor", "uploadHistoryData");
        if (njy.e(this.f32971a)) {
            LogUtil.a("PDROPE_RopeHistoryProcessor", "No data to upload");
            return;
        }
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        if (this.f32972b.size() > 0) {
            LogUtil.a("PDROPE_RopeHistoryProcessor", "uploading");
            return;
        }
        this.f32972b.addAll(this.f32971a);
        this.f32971a.clear();
        egs egsVar = new egs();
        for (ehg ehgVar : this.f32972b) {
            if (egsVar.e(ehgVar) == null) {
                LogUtil.a("PDROPE_RopeHistoryProcessor", "clearData delete");
            } else {
                hiDataInsertOption.addData(a(ehgVar));
            }
        }
        if (njy.e(hiDataInsertOption.getDatas())) {
            LogUtil.a("PDROPE_RopeHistoryProcessor", "Cleared all data, no data to upload");
            e(this.f32972b.size());
            this.f32972b.clear();
            return;
        }
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: ehe
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                this.d.e(hiDataInsertOption, i, obj);
            }
        });
    }

    /* synthetic */ void e(HiDataInsertOption hiDataInsertOption, int i, Object obj) {
        LogUtil.a("PDROPE_RopeHistoryProcessor", "uploadHistoryData onResult errorCode:", Integer.valueOf(i));
        if (obj != null) {
            LogUtil.d("PDROPE_RopeHistoryProcessor", "uploadHistoryData onResult object:", obj);
        }
        if (i == 0) {
            e(this.f32972b.size());
            new egy().e(hiDataInsertOption.getDatas());
            RopeHistoryCallback ropeHistoryCallback = this.f32973c;
            if (ropeHistoryCallback != null) {
                ropeHistoryCallback.uploadHistorySuccess();
            }
            LogUtil.a("PDROPE_RopeHistoryProcessor", "syncCloud, size() = ", Integer.valueOf(hiDataInsertOption.getDatas().size()));
            d();
        } else {
            LogUtil.j("PDROPE_RopeHistoryProcessor", "uploadHistoryData ERROR:", Integer.valueOf(i));
        }
        this.f32972b.clear();
    }

    private void d() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
        LogUtil.a("PDROPE_RopeHistoryProcessor", "syncCloud, end");
    }

    private HiHealthData a(ehg ehgVar) {
        HiHealthData hiHealthData = new HiHealthData();
        long jG = ((long) ehgVar.g()) * 1000;
        long jE = (((long) ehgVar.e()) * 1000) + jG;
        LogUtil.d("PDROPE_RopeHistoryProcessor", "startTime:", Long.valueOf(jG), ", date:", qrk.d(jG), " endTime:", Long.valueOf(jE), ", date:", qrk.d(jE));
        hiHealthData.setTimeInterval(jG, jE);
        hiHealthData.setType(30001);
        hiHealthData.setValue(ehgVar.j());
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();
        hiHealthData.setMetaData(gsonBuilder.create().toJson(c(ehgVar), HiTrackMetaData.class));
        if (njy.b(ehgVar.b())) {
            StringBuffer stringBuffer = new StringBuffer();
            for (dsl dslVar : ehgVar.b()) {
                ntq ntqVar = new ntq();
                ntqVar.i(ehgVar.h());
                ntqVar.e(dslVar.a());
                ntqVar.e(dslVar.j());
                ntqVar.c(dslVar.f());
                ntqVar.c(dslVar.b());
                ntqVar.d(dslVar.c() * 1000);
                ntqVar.a(dslVar.e());
                ntqVar.j(dslVar.d());
                ntqVar.toTrackString(stringBuffer);
            }
            hiHealthData.setSequenceData(stringBuffer.toString());
        } else {
            hiHealthData.setSequenceData("0");
        }
        hiHealthData.setDeviceUuid(this.e);
        return hiHealthData;
    }

    private HiTrackMetaData c(ehg ehgVar) {
        HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
        hiTrackMetaData.setSportType(283);
        hiTrackMetaData.setTotalCalories(ehgVar.i() * 1000);
        hiTrackMetaData.setChiefSportDataType(7);
        hiTrackMetaData.setSportDataSource(5);
        hiTrackMetaData.setHasTrackPoint(false);
        long jE = ((long) ehgVar.e()) * 1000;
        hiTrackMetaData.setTotalTime(jE);
        HashMap map = new HashMap();
        int iD = ehgVar.d();
        if (iD == 65535) {
            iD = -1;
        }
        map.put("interruptTimes", String.valueOf(iD));
        int iC = ehgVar.c();
        map.put("maxSkippingTimes", String.valueOf(iC != 65535 ? iC : -1));
        int iC2 = CommonUtil.c(ehgVar.j(), jE);
        map.put("skipSpeed", String.valueOf(iC2));
        hiTrackMetaData.setAbnormalTrack(njz.e(iC2, null));
        map.put("skipNum", String.valueOf(ehgVar.j()));
        if (njy.b(ehgVar.b())) {
            map.put("total_action_group", String.valueOf(ehgVar.a()));
        }
        if (ehgVar.h() != 0) {
            map.put("skippingMode", String.valueOf(ehgVar.h()));
        }
        if (ehgVar.h() == 3 && ehgVar.f() != null) {
            map.put("singleShakeNum", String.valueOf(ehgVar.f().e()));
            map.put("doubleShakeNum", String.valueOf(ehgVar.f().d()));
            map.put("tripleShakeNum", String.valueOf(ehgVar.f().c()));
            map.put("reversedSkipNum", String.valueOf(ehgVar.f().a()));
        }
        hiTrackMetaData.setTotalSteps(ehgVar.j());
        hiTrackMetaData.setExtendTrackDataMap(map);
        return hiTrackMetaData;
    }

    private void e(int i) {
        LogUtil.a("PDROPE_RopeHistoryProcessor", "deleteDeviceHistoryData count:", Integer.valueOf(i));
        emh.b().c(3, 8, new int[]{i});
    }
}
