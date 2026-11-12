package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealthservice.sync.dataswitch.MotionPathDataSwitch;
import com.huawei.hwcloudmodel.healthdatacloud.model.AddMotionPathReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteMotionPathReq;
import com.huawei.hwcloudmodel.model.unite.AddMotionPathRsp;
import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.hwcloudmodel.model.unite.MotionPathDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lhq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Context f40164c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kwt f40165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private lqo f40166b;
    private boolean d;
    private kws e;
    private int f;
    private int g;
    private lho h;
    private kxk i;
    private int j;

    private lhq() {
        this.f = 0;
        this.g = 0;
        this.d = false;
        this.e = kws.e(f40164c);
        this.f40165a = kwt.b();
        this.f40166b = lqo.b(f40164c);
        this.i = kxk.c();
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final lhq f40167b = new lhq();
    }

    public static lhq a(Context context) {
        f40164c = context.getApplicationContext();
        return a.f40167b;
    }

    public void b(int i, HiSyncOption hiSyncOption, int i2, MotionPathDataSwitch motionPathDataSwitch, lho lhoVar) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncTrack", "pushData() begin !");
        this.j = i;
        this.h = lhoVar;
        this.f = 0;
        this.g = 0;
        this.d = liq.f();
        if (!lgp.n()) {
            ReleaseLogUtil.e("HiH_HiSyncTrack", "pushData() dataPrivacy switch is closed, push end !");
            return;
        }
        lis.b(2.0d, "SYNC_TRACK_UPLOAD_PERCENT_MAX");
        List<Integer> listB = this.f40165a.b(i);
        if (HiCommonUtil.b(listB)) {
            lis.c(f40164c);
            ReleaseLogUtil.d("HiH_HiSyncTrack", "pushData() end !, dataClientId is Empty");
            return;
        }
        List<Integer> listB2 = kws.e(f40164c).b();
        if (HiCommonUtil.b(listB2)) {
            lis.c(f40164c);
            ReleaseLogUtil.d("HiH_HiSyncTrack", "pushData() end !, sequence no data to cloud");
            return;
        }
        listB.retainAll(listB2);
        if (HiCommonUtil.b(listB)) {
            lis.c(f40164c);
            ReleaseLogUtil.d("HiH_HiSyncTrack", "pushData() end !, clientIds is Empty");
            return;
        }
        LogUtil.a("HiH_HiSyncTrack", "clientIds list is ", listB);
        c(i, hiSyncOption, listB);
        if (this.d) {
            e(listB, hiSyncOption, i2, motionPathDataSwitch);
            this.g = 0;
        }
        for (Integer num : listB) {
            lis.b(f40164c, 1.0d, 1.0d / ((double) listB.size()), 2.0d);
            c(num.intValue(), hiSyncOption, i2, motionPathDataSwitch);
        }
        lis.c(f40164c);
        ReleaseLogUtil.d("HiH_HiSyncTrack", "pushData() end !");
    }

    private void e(List<Integer> list, HiSyncOption hiSyncOption, int i, MotionPathDataSwitch motionPathDataSwitch) throws lif {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), hiSyncOption, i, motionPathDataSwitch);
        }
    }

    private void c(int i, HiSyncOption hiSyncOption, int i2, MotionPathDataSwitch motionPathDataSwitch) throws lif {
        kul kulVarA = this.i.a(this.j, 0L, 2);
        long jH = kulVarA != null ? kulVarA.h() : 0L;
        int iE = lju.e();
        while (this.f < 2) {
            List<HiHealthData> listD = d(i, iE);
            ArrayList arrayList = new ArrayList(listD.size());
            arrayList.addAll(listD);
            if (arrayList.isEmpty()) {
                break;
            }
            if (!e(arrayList, hiSyncOption, i2, motionPathDataSwitch, false, jH)) {
                LogUtil.j("HiH_HiSyncTrack", "uploadTrack failed , clientId is ", Integer.valueOf(i));
                break;
            } else if (arrayList.size() < 10) {
                LogUtil.a("HiH_HiSyncTrack", "uploadTrack the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is", Integer.valueOf(arrayList.size()), ", clientId is", Integer.valueOf(i));
                break;
            }
        }
        this.f = 0;
    }

    private void e(int i, HiSyncOption hiSyncOption, int i2, MotionPathDataSwitch motionPathDataSwitch) throws lif {
        kul kulVarA = this.i.a(this.j, 0L, 2);
        long jH = kulVarA != null ? kulVarA.h() : 0L;
        while (this.f < 2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jP = HiDateUtil.p(jCurrentTimeMillis);
            long jG = HiDateUtil.g(jCurrentTimeMillis);
            List<Integer> listC = c();
            listC.addAll(HiHealthDictManager.a(f40164c).e());
            List<HiHealthData> listD = this.e.d(i, 30001, CommonUtil.c(listC), 0, jP, jG);
            if (!HiCommonUtil.b(listD)) {
                List<HiHealthData> arrayList = new ArrayList<>(listD.size());
                arrayList.addAll(listD);
                if (arrayList.isEmpty()) {
                    break;
                }
                if (!e(arrayList, hiSyncOption, i2, motionPathDataSwitch, true, jH)) {
                    LogUtil.j("HiH_HiSyncTrack", "uploadTodayTrackData failed , clientId is ", Integer.valueOf(i));
                    break;
                } else if (arrayList.size() < 10) {
                    LogUtil.a("HiH_HiSyncTrack", "uploadTodayTrackData the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is", Integer.valueOf(arrayList.size()));
                    break;
                }
            } else {
                break;
            }
        }
        this.f = 0;
    }

    private List<HiHealthData> d(int i, int i2) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(i));
        List<Integer> listC = c();
        listC.addAll(HiHealthDictManager.a(f40164c).e());
        return this.e.a(arrayList, 30001, CommonUtil.c(listC), 0, lju.c(i2, 10));
    }

    private boolean e(List<HiHealthData> list, HiSyncOption hiSyncOption, int i, MotionPathDataSwitch motionPathDataSwitch, boolean z, long j) throws lif {
        if (z || !this.d) {
            int i2 = this.g + 1;
            this.g = i2;
            liq.c(i2, hiSyncOption.getSyncManual());
        } else {
            int i3 = this.g + 1;
            this.g = i3;
            if (10 < i3) {
                this.f += 2;
                return false;
            }
        }
        List<MotionPathDetail> listD = motionPathDataSwitch.d(list, i);
        if (HiCommonUtil.b(listD)) {
            ReleaseLogUtil.e("HiH_HiSyncTrack", "uploadTrackDataOnce cloudTrack is null or empty ");
            return false;
        }
        AddMotionPathReq addMotionPathReq = new AddMotionPathReq();
        addMotionPathReq.setDetailInfo(listD);
        addMotionPathReq.setTimeZone(list.get(0).getTimeZone());
        addMotionPathReq.setLocalMaxVersion(Long.valueOf(j));
        while (this.f < 2) {
            try {
                AddMotionPathRsp addMotionPathRspE = this.f40166b.e(addMotionPathReq);
                if (addMotionPathRspE != null && addMotionPathRspE.getResultCode().intValue() == 1001) {
                    ParamValidDetail paramValidDetail = addMotionPathRspE.getParamValidDetail();
                    liq.d(addMotionPathRspE, paramValidDetail);
                    if (paramValidDetail == null) {
                        this.f++;
                    } else {
                        liq.a(list, paramValidDetail, (Map<Long, List<Long>>) null);
                        d(list);
                        ReleaseLogUtil.d("HiH_HiSyncTrack", "uploadTrackDone failed ! resultCode is ", addMotionPathRspE.getResultCode(), ", resultDesc is ", addMotionPathRspE.getResultDesc());
                        b(addMotionPathReq, addMotionPathRspE, 2);
                        return true;
                    }
                } else if (!lih.e(addMotionPathRspE, false)) {
                    this.f++;
                } else {
                    d(list);
                    b(addMotionPathReq, addMotionPathRspE, 2);
                    ReleaseLogUtil.d("HiH_HiSyncTrack", "uploadTrackDataOnce OK ! uploadCount is ", Integer.valueOf(this.g), ", date size = ", Integer.valueOf(list.size()));
                    return true;
                }
            } catch (OutOfMemoryError e) {
                ReleaseLogUtil.d("HiH_HiSyncTrack", "addMotionPathSync OutOfMemoryError", LogAnonymous.b(e));
                this.f++;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncTrack", "uploadTrackDataOnce failed ! uploadCount is ", Integer.valueOf(this.g), ", date size = ", Integer.valueOf(list.size()));
        return false;
    }

    private void b(AddMotionPathReq addMotionPathReq, AddMotionPathRsp addMotionPathRsp, int i) throws lif {
        ReleaseLogUtil.d("HiH_HiSyncTrack", "track LocalMaxVersion=", addMotionPathReq.getLocalMaxVersion(), ",rsp=", addMotionPathRsp.getTimestamp(), ",isHasMore=", Boolean.valueOf(addMotionPathRsp.isHasMore()), ",cloudTp=", Integer.valueOf(i));
        if (addMotionPathRsp.isHasMore()) {
            SyncKey syncKey = new SyncKey();
            syncKey.setType(Integer.valueOf(i));
            syncKey.setVersion(addMotionPathRsp.getTimestamp());
            syncKey.setDeviceCode(0L);
            this.h.b(syncKey);
            return;
        }
        if (this.i.d(this.j, i, addMotionPathRsp.getTimestamp().longValue(), 0L)) {
            return;
        }
        ReleaseLogUtil.e("HiH_HiSyncTrack", "sequence downloadMore saveVersionToDB failed!");
    }

    private void d(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int iB = 0;
        sb.append(list.get(0).getType());
        sb.append("_");
        sb.append(list.get(0).getSubType());
        liq.a(list, sb.toString());
        for (HiHealthData hiHealthData : list) {
            long dataId = hiHealthData.getDataId();
            long j = hiHealthData.getLong("modified_time");
            if (this.e.a(dataId, j)) {
                iB = this.e.b(dataId, j);
            }
            ReleaseLogUtil.d("HiH_HiSyncTrack", "uploadTrackDone sequenceID is ", Long.valueOf(hiHealthData.getDataId()), ", startTime is ", Long.valueOf(hiHealthData.getStartTime()), ", endTime is ", Long.valueOf(hiHealthData.getEndTime()), ", type is ", Integer.valueOf(hiHealthData.getType()), ", sportType is ", Integer.valueOf(hiHealthData.getSubType()), " update ans is ", Integer.valueOf(iB));
        }
    }

    private void c(int i, HiSyncOption hiSyncOption, List<Integer> list) throws lif {
        LogUtil.a("HiH_HiSyncTrack", "delTrack userid is ", Integer.valueOf(i));
        while (this.f < 2) {
            List<HiHealthData> listA = this.e.a(list, 30001, CommonUtil.c(HiHealthDictManager.a(f40164c).e()), 2, 10);
            if (HiCommonUtil.b(listA)) {
                LogUtil.j("HiH_HiSyncTrack", "no track date should be delete!");
                break;
            } else {
                if (!c(listA, hiSyncOption)) {
                    break;
                }
                e(listA);
                if (listA.size() < 10) {
                    LogUtil.a("HiH_HiSyncTrack", "delTrack the size is smaller than HiSyncUtil.UPLOAD_TRACK_DATA_MAX, size is", Integer.valueOf(listA.size()));
                    break;
                }
            }
        }
        this.f = 0;
    }

    private boolean c(List<HiHealthData> list, HiSyncOption hiSyncOption) throws lif {
        int i = this.g + 1;
        this.g = i;
        liq.c(i, hiSyncOption.getSyncManual());
        List<DataDeleteCondition> listD = liq.d(f40164c.getApplicationContext(), list);
        if (HiCommonUtil.b(listD)) {
            LogUtil.j("HiH_HiSyncTrack", "delTrackDataOnce conditons is null or empty ");
            return false;
        }
        DeleteMotionPathReq deleteMotionPathReq = new DeleteMotionPathReq();
        deleteMotionPathReq.setDeleteMotionConditons(listD);
        while (this.f < 2) {
            if (!lih.e(this.f40166b.c(deleteMotionPathReq), false)) {
                this.f++;
            } else {
                ReleaseLogUtil.d("HiH_HiSyncTrack", "delTrackDataOnce OK ! deleteCount is ", Integer.valueOf(this.g));
                return true;
            }
        }
        ReleaseLogUtil.d("HiH_HiSyncTrack", "delTrackDataOnce failed ! deleteCount is ", Integer.valueOf(this.g));
        return false;
    }

    private void e(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            LogUtil.a("HiH_HiSyncTrack", "delTrackDone sequenceID is ", Long.valueOf(hiHealthData.getDataId()), " delete is ", Integer.valueOf(this.e.c(hiHealthData)));
        }
    }

    private List<Integer> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(263);
        arrayList.add(10001);
        arrayList.add(500001);
        return arrayList;
    }
}
