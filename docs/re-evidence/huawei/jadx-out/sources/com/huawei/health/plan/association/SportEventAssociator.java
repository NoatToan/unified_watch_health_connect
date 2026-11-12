package com.huawei.health.plan.association;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import defpackage.gcn;
import defpackage.ggc;
import defpackage.ggm;
import defpackage.gnf;
import defpackage.lsl;
import defpackage.lua;
import defpackage.njy;
import defpackage.ntv;
import defpackage.ntx;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public class SportEventAssociator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8525a;
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<ggm> f8526c = null;

    public interface AssociationCallback {
        void onSuccess(List<c> list);
    }

    public interface Callback {
        void onResult(int i, String str);
    }

    public interface CompetitionCallback {
        void onCompetitionListReceived(List<gnf.e> list);
    }

    public static /* synthetic */ c a(c cVar, c cVar2) {
        return cVar;
    }

    private boolean a(int i, double d) {
        double d2 = i;
        return 0.8d * d <= d2 && d2 <= d * 1.2d;
    }

    public static /* synthetic */ c f(c cVar) {
        return cVar;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<gnf.e> f8538c;
        private ggm d;

        public c(ggm ggmVar, List<gnf.e> list) {
            this.d = ggmVar;
            this.f8538c = list;
        }

        public ggm e() {
            return this.d;
        }

        public List<gnf.e> b() {
            return this.f8538c;
        }
    }

    public void a(long j, long j2, final CompetitionCallback competitionCallback) {
        if (j <= 0 || j2 <= 0) {
            ReleaseLogUtil.a("R_SportEventAssociator", "startTime or endTime < 0");
            c(competitionCallback, Collections.EMPTY_LIST);
        } else if (j2 < j) {
            ReleaseLogUtil.a("R_SportEventAssociator", "endTime < startTime");
            c(competitionCallback, Collections.EMPTY_LIST);
        } else {
            ReleaseLogUtil.d("R_SportEventAssociator", "getCompetitions startTime=", Long.valueOf(j), " endTime=", Long.valueOf(j2));
            ((PlanApi) Services.d("CoursePlanService", PlanApi.class)).e(j, j2, new UiCallback<gnf>() { // from class: com.huawei.health.plan.association.SportEventAssociator.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.a("R_SportEventAssociator", "errorCode:", Integer.valueOf(i), " errorInfo:", str);
                    SportEventAssociator.this.c(competitionCallback, (List<gnf.e>) Collections.EMPTY_LIST);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gnf gnfVar) {
                    ReleaseLogUtil.d("R_SportEventAssociator", "getCompetitions onSuccess");
                    SportEventAssociator.this.c(competitionCallback, gnfVar != null ? gnfVar.c() : Collections.EMPTY_LIST);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CompetitionCallback competitionCallback, List<gnf.e> list) {
        if (competitionCallback != null) {
            ReleaseLogUtil.d("R_SportEventAssociator", "competitions isEmpty ? ", Boolean.valueOf(njy.e(list)));
            if (njy.e(list)) {
                list = Collections.EMPTY_LIST;
            }
            competitionCallback.onCompetitionListReceived(list);
        }
    }

    public void d(long j, long j2, int[] iArr, IBaseResponseCallback iBaseResponseCallback) {
        e(new ntx.d().b(j).d(j2).a(iArr).a(), iBaseResponseCallback);
    }

    private void e(ntx ntxVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.d("R_SportEventAssociator", "requestTrackSimplifyData callback is null");
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(ntxVar.a(), ntxVar.e());
        hiDataReadOption.setType(ntxVar.d());
        hiDataReadOption.setCount(ntxVar.c());
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(this.f8525a).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.health.plan.association.SportEventAssociator.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                SportEventAssociator.this.d(obj, i, iBaseResponseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                iBaseResponseCallback.a(i2, Collections.EMPTY_LIST);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("R_SportEventAssociator", "requestSportRecordSimplifyDataResult callback is null.");
            return;
        }
        if (!(obj instanceof SparseArray)) {
            iBaseResponseCallback.a(i, Collections.EMPTY_LIST);
            ReleaseLogUtil.e("R_SportEventAssociator", "requestSportRecordSimplifyDataResult object is not SparseArray.");
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
            iBaseResponseCallback.a(i, Collections.EMPTY_LIST);
            ReleaseLogUtil.e("R_SportEventAssociator", "requestSportRecordSimplifyDataResult onResult obj not instanceof List");
            return;
        }
        List list = (List) sparseArray.get(i);
        if (list.isEmpty()) {
            ReleaseLogUtil.e("R_SportEventAssociator", "requestSportRecordSimplifyDataResult onResult list is empty");
            iBaseResponseCallback.a(i, Collections.EMPTY_LIST);
        } else {
            iBaseResponseCallback.a(i, list);
            LogUtil.j("R_SportEventAssociator", "requestSportRecordSimplifyDataResult list.size = ", Integer.valueOf(list.size()));
        }
    }

    public SportEventAssociator(Context context) {
        this.f8525a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void e(final String str, final long j, final long j2, final int[] iArr, final AssociationCallback associationCallback) {
        if (j <= 0 || j2 <= 0) {
            ReleaseLogUtil.a("R_SportEventAssociator", "startTime or endTime < 0");
            c(associationCallback);
            return;
        }
        if (j2 < j) {
            ReleaseLogUtil.a("R_SportEventAssociator", "endTime < startTime");
            c(associationCallback);
        } else if (iArr == null || iArr.length == 0) {
            ReleaseLogUtil.a("R_SportEventAssociator", "sportTypes isEmpty ");
            c(associationCallback);
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggg
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(str, j, j2, iArr, associationCallback);
                }
            });
        } else {
            this.f8526c = new ArrayList();
            d(j, j2, iArr, new IBaseResponseCallback() { // from class: com.huawei.health.plan.association.SportEventAssociator.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    try {
                        if (njy.b(obj, HiHealthData.class)) {
                            SportEventAssociator sportEventAssociator = SportEventAssociator.this;
                            sportEventAssociator.f8526c = sportEventAssociator.b((List<HiHealthData>) obj);
                        }
                        if (!njy.e(SportEventAssociator.this.f8526c)) {
                            SportEventAssociator.this.a(SportEventAssociator.this.e ? lsl.c(j, 0) : j, SportEventAssociator.this.e ? lsl.c(j) : j2, new CompetitionCallback() { // from class: com.huawei.health.plan.association.SportEventAssociator.5.2
                                @Override // com.huawei.health.plan.association.SportEventAssociator.CompetitionCallback
                                public void onCompetitionListReceived(List<gnf.e> list) {
                                    if (!njy.e(list)) {
                                        SportEventAssociator.this.a(SportEventAssociator.this.f8526c, list, associationCallback);
                                    } else {
                                        ReleaseLogUtil.d("R_SportEventAssociator", "eventAssociation getCompetitions isEmpty");
                                        SportEventAssociator.this.c(associationCallback);
                                    }
                                }
                            });
                        } else {
                            ReleaseLogUtil.d("R_SportEventAssociator", "mySportRecordInfoList isEmpty");
                            SportEventAssociator.this.c(associationCallback);
                        }
                    } catch (ClassCastException e) {
                        ReleaseLogUtil.e("R_SportEventAssociator", "parseTrackSimplifyData ", e.getMessage());
                        SportEventAssociator.this.c(associationCallback);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AssociationCallback associationCallback) {
        if (associationCallback != null) {
            associationCallback.onSuccess(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<ggm> b(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null || list.isEmpty()) {
            ReleaseLogUtil.d("R_SportEventAssociator", "convertToSportRecordInfos trackData is empty");
            return arrayList;
        }
        for (HiHealthData hiHealthData : list) {
            MotionPathSimplify motionPathSimplifyD = ntv.d(hiHealthData);
            if (motionPathSimplifyD == null) {
                ReleaseLogUtil.d("R_SportEventAssociator", "convertToSportRecordInfos motionPathSimplify is null");
            } else if (motionPathSimplifyD.requestFatherSportItem() != null) {
                ReleaseLogUtil.d("R_SportEventAssociator", "convertToSportRecordInfos fatherSportItem is no null continue");
            } else if (!this.e && motionPathSimplifyD.requestSportDataSource() == 2) {
                ReleaseLogUtil.d("R_SportEventAssociator", "convertToSportRecordInfos SportDataSource is 2 continue");
            } else {
                HiTrackMetaData hiTrackMetaDataC = c(hiHealthData.getMetaData());
                if (hiTrackMetaDataC == null) {
                    ReleaseLogUtil.d("R_SportEventAssociator", "convertToSportRecordInfos metaData is null");
                } else {
                    ggm ggmVar = new ggm();
                    ggmVar.c(hiHealthData.getType());
                    ggmVar.a(hiHealthData.getStartTime());
                    ggmVar.c(hiHealthData.getEndTime());
                    ggmVar.a(hiTrackMetaDataC.getSportType());
                    ggmVar.c(hiHealthData.getTimeZone());
                    ggmVar.b(hiTrackMetaDataC.getTotalDistance());
                    arrayList.add(ggmVar);
                }
            }
        }
        return arrayList;
    }

    public void b(final long j, final long j2, final List<ggm> list, final AssociationCallback associationCallback) {
        if (j <= 0 || j2 <= 0) {
            ReleaseLogUtil.a("R_SportEventAssociator", "startTime or endTime < 0");
            return;
        }
        if (j2 < j) {
            ReleaseLogUtil.a("R_SportEventAssociator", "endTime < startTime");
        } else if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ggh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35055c.c(j, j2, list, associationCallback);
                }
            });
        } else {
            a(j, j2, new CompetitionCallback() { // from class: com.huawei.health.plan.association.SportEventAssociator.1
                @Override // com.huawei.health.plan.association.SportEventAssociator.CompetitionCallback
                public void onCompetitionListReceived(List<gnf.e> list2) {
                    if (njy.e(list2)) {
                        ReleaseLogUtil.d("R_SportEventAssociator", "getCompetitions  competitionList isEmpty");
                    } else {
                        SportEventAssociator.this.a(list, list2, associationCallback);
                    }
                }
            });
        }
    }

    public /* synthetic */ void c(long j, long j2, List list, AssociationCallback associationCallback) {
        b(j, j2, (List<ggm>) list, associationCallback);
    }

    public void a(List<ggm> list, List<gnf.e> list2, AssociationCallback associationCallback) {
        ArrayList arrayList = new ArrayList();
        for (ggm ggmVar : list) {
            List<gnf.e> listB = b(ggmVar, list2);
            ReleaseLogUtil.d("R_SportEventAssociator", "matchedCompetitions is empty? ", Boolean.valueOf(njy.e(listB)));
            if (!listB.isEmpty()) {
                arrayList.add(new c(ggmVar, listB));
            }
        }
        associationCallback.onSuccess(arrayList);
    }

    private List<gnf.e> b(ggm ggmVar, List<gnf.e> list) {
        if (!this.e && !d(ggmVar.b())) {
            ReleaseLogUtil.d("R_SportEventAssociator", "not WithinLast7Days");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (gnf.e eVar : list) {
            if (e(ggmVar, eVar)) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    private boolean d(long j) {
        ReleaseLogUtil.d("R_SportEventAssociator", "isWithinLast7Days  sportTime:", Long.valueOf(j));
        return !lsl.e(j, lsl.c(System.currentTimeMillis(), -6), (TimeZone) null);
    }

    private boolean e(ggm ggmVar, gnf.e eVar) {
        if (ggmVar == null || eVar == null || njy.e(eVar.c())) {
            return false;
        }
        int iE = ggmVar.e();
        if (DateFormatUtil.a(ggmVar.b(), lsl.a(ggmVar.a())) != DateFormatUtil.a(eVar.d(), lsl.a(eVar.i()))) {
            return false;
        }
        Iterator<gnf.d> it = eVar.c().iterator();
        while (it.hasNext()) {
            try {
                if (a(iE, Double.parseDouble(it.next().a()) * 1000.0d)) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                ReleaseLogUtil.a("R_SportEventAssociator", "NumberFormatException!");
            }
        }
        return false;
    }

    private HiTrackMetaData c(String str) {
        try {
            return (HiTrackMetaData) HiJsonUtil.d(str, HiTrackMetaData.class);
        } catch (JsonSyntaxException unused) {
            ReleaseLogUtil.a("R_SportEventAssociator", "getHiTrackMetaData trackMetaData is not JSON");
            return null;
        }
    }

    private void e(ggm ggmVar, HiDataOperateListener hiDataOperateListener) {
        if (ggmVar == null) {
            ReleaseLogUtil.e("R_SportEventAssociator", "deleteSportRecordFromDataPlatform sportRecord is null");
            return;
        }
        long jB = ggmVar.b();
        long jD = ggmVar.d();
        int iC = ggmVar.c();
        ReleaseLogUtil.d("R_SportEventAssociator", "deleteSportRecordFromDataPlatform  StartTime:", Long.valueOf(jB), " endtime:", Long.valueOf(jD), " type:", Integer.valueOf(iC));
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimeInterval(jB, jD);
        hiDataDeleteOption.setTypes(new int[]{iC});
        HiHealthManager.d(BaseApplication.getContext()).deleteHiHealthData(hiDataDeleteOption, hiDataOperateListener);
    }

    public void a(c cVar, final int i, final Callback callback) {
        if (cVar == null || cVar.e() == null) {
            ReleaseLogUtil.e("R_SportEventAssociator", "doAssociatorRecordData eventAssociationResult or  SportRecordInfo is null");
            a(callback, 1, "");
            return;
        }
        if (njy.e(cVar.b())) {
            ReleaseLogUtil.e("R_SportEventAssociator", "doAssociatorRecordData competitions isEmpty");
            a(callback, 1, "");
            return;
        }
        final ggm ggmVarE = cVar.e();
        long jB = ggmVarE.b();
        long jD = ggmVarE.d();
        final gnf.e eVar = cVar.b().get(0);
        if (eVar == null) {
            ReleaseLogUtil.e("R_SportEventAssociator", "doAssociatorRecordData competition is null");
            a(callback, 1, "");
            return;
        }
        if (jB <= 0 || jD <= 0) {
            ReleaseLogUtil.a("R_SportEventAssociator", "doAssociatorRecordData startTime or endTime < 0");
            a(callback, 1, "");
            return;
        }
        if (jD < jB) {
            ReleaseLogUtil.a("R_SportEventAssociator", "doAssociatorRecordData endTime < startTime");
            a(callback, 1, "");
            return;
        }
        LogUtil.a("R_SportEventAssociator", "Start to doAssociatorRecordData startTime:", Long.valueOf(jB), ", endTime:", Long.valueOf(jD));
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi == null) {
            ReleaseLogUtil.a("R_SportEventAssociator", "doAssociatorRecordData : healthDataMgrApi is null.");
            a(callback, 1, "");
        } else {
            healthDataMgrApi.requestTrackDetailData(jB, jD, new IBaseResponseCallback() { // from class: ggi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f35057b.c(callback, ggmVarE, i, eVar, i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void c(final Callback callback, ggm ggmVar, final int i, final gnf.e eVar, int i2, Object obj) {
        if (i2 != 0) {
            LogUtil.e("R_SportEventAssociator", "doAssociatorRecordData requestTrackDetailData not success, errorCode=", Integer.valueOf(i2));
            a(callback, 1, "");
        }
        if (obj == null) {
            ReleaseLogUtil.a("R_SportEventAssociator", "scoreCard requestTrackDetailData objData null");
            a(callback, 1, "");
            return;
        }
        if (!njy.b(obj, HiHealthData.class)) {
            ReleaseLogUtil.a("R_SportEventAssociator", "scoreCard requestTrackDetailData objData not instanceof List");
            a(callback, 1, "");
            return;
        }
        final List list = (List) obj;
        if (list.isEmpty() || list.get(0) == null) {
            ReleaseLogUtil.a("R_SportEventAssociator", "requestTrackDetailData list size 0.");
            a(callback, 1, "");
        } else {
            e(ggmVar, new HiDataOperateListener() { // from class: com.huawei.health.plan.association.SportEventAssociator.4
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i3, Object obj2) {
                    ReleaseLogUtil.d("R_SportEventAssociator", "deleteSportRecordFromDataPlatform errorCode:", Integer.valueOf(i3), " start to handleSaveRecordData");
                    SportEventAssociator.this.c((HiHealthData) list.get(0), i, eVar, callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Callback callback, int i, String str) {
        if (callback != null) {
            callback.onResult(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final HiHealthData hiHealthData, int i, gnf.e eVar, final Callback callback) {
        gnf.d next;
        gnf.c cVar;
        HiTrackMetaData hiTrackMetaDataC = c(hiHealthData.getMetaData());
        if (hiTrackMetaDataC == null) {
            a(callback, 1, "");
            ReleaseLogUtil.d("R_SportEventAssociator", "handleSaveRecordData hiTrackMetaData isEmpty");
            return;
        }
        hiTrackMetaDataC.setSportType(i);
        Map<String, String> extendTrackMap = hiTrackMetaDataC.getExtendTrackMap();
        if (njy.e(extendTrackMap)) {
            extendTrackMap = new HashMap<>();
        }
        List<gnf.d> listC = eVar.c();
        if (njy.e(listC)) {
            ReleaseLogUtil.d("R_SportEventAssociator", "handleSaveRecordData groupList isEmpty");
            a(callback, 1, "");
            return;
        }
        Iterator<gnf.d> it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                cVar = null;
                break;
            } else {
                next = it.next();
                if (njy.b(next.e())) {
                    cVar = next.e().get(0);
                    break;
                }
            }
        }
        if (next == null || cVar == null || TextUtils.isEmpty(next.a()) || TextUtils.isEmpty(cVar.d())) {
            ReleaseLogUtil.d("R_SportEventAssociator", "init competition groupBean or objectiveInfo is empty");
            a(callback, 1, "");
            return;
        }
        ReleaseLogUtil.d("R_SportEventAssociator", "start handleSaveRecordData newSportType:", Integer.valueOf(i));
        double dA = CommonUtils.a(next.a());
        extendTrackMap.put("competitionId", eVar.a());
        extendTrackMap.put("alias", eVar.b());
        extendTrackMap.put("targetDistance", String.valueOf(dA * 1000.0d));
        extendTrackMap.put("competitionCategory", "0");
        extendTrackMap.put("targetTime", cVar.d());
        hiTrackMetaDataC.setExtendTrackDataMap(extendTrackMap);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiHealthData.setSubType(i);
        hiHealthData.setMetaData(HiJsonUtil.d(hiTrackMetaDataC));
        hiHealthData.setDeviceUuid(hiHealthData.getString("device_uniquecode"));
        hiHealthData.setType(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        hiHealthData.setSyncStatus(0);
        hiDataInsertOption.addData(hiHealthData);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.health.plan.association.SportEventAssociator.6
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
                ReleaseLogUtil.d("R_SportEventAssociator", "insertHiHealthData deleteFile ", sequenceFileUrl, " success? ", Boolean.valueOf(gcn.c().deleteFile(SportEventAssociator.this.f8525a, sequenceFileUrl)));
                if (i2 != 0) {
                    SportEventAssociator.this.a(callback, 1, "");
                    ReleaseLogUtil.d("R_SportEventAssociator", "insertHiHealthData fail errorCode:", Integer.valueOf(i2));
                } else {
                    ReleaseLogUtil.d("R_SportEventAssociator", "insertHiHealthData success");
                    SportEventAssociator.this.a(callback, i2, "insertHiHealthData success");
                }
            }
        });
    }

    public void d(String str, List<c> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.a("R_SportEventAssociator", "updateSportEventSharedPreferenceBykey results isEmpty");
            return;
        }
        ReleaseLogUtil.d("R_SportEventAssociator", "updateSportEventSharedPreferenceBykey key:", str);
        String strH = lua.h(str, str);
        if (!StringUtils.g(strH)) {
            list.addAll((List) HiJsonUtil.a(strH, new TypeToken<List<c>>() { // from class: com.huawei.health.plan.association.SportEventAssociator.7
            }.getType()));
        }
        List<c> arrayList = new ArrayList<>((Collection<? extends c>) ((Map) list.stream().filter(new Predicate() { // from class: gge
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SportEventAssociator.b((SportEventAssociator.c) obj);
            }
        }).collect(Collectors.toMap(new Function() { // from class: ggb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((SportEventAssociator.c) obj).e().b());
            }
        }, new Function() { // from class: gfy
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SportEventAssociator.f((SportEventAssociator.c) obj);
            }
        }, new BinaryOperator() { // from class: gga
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return SportEventAssociator.a((SportEventAssociator.c) obj, (SportEventAssociator.c) obj2);
            }
        }))).values());
        if (HwExerciseConstants.MATCHED_COMPETITION.equals(str)) {
            String strH2 = lua.h("ignore_related_records", "ignore_related_records");
            if (!StringUtils.g(strH2)) {
                arrayList = c(arrayList, (List<c>) HiJsonUtil.a(strH2, new TypeToken<List<c>>() { // from class: com.huawei.health.plan.association.SportEventAssociator.8
                }.getType()));
            }
        }
        LogUtil.a("R_SportEventAssociator", "updateSportEventSharedPreference: ", HiJsonUtil.d(arrayList));
        lua.c(str, str, HiJsonUtil.d(arrayList), null);
    }

    public static /* synthetic */ boolean b(c cVar) {
        return (cVar == null || cVar.e() == null) ? false : true;
    }

    public List<c> c(List<c> list, List<c> list2) {
        ReleaseLogUtil.d("R_SportEventAssociator", "enter filterDuplicateResults");
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList(list);
        }
        final Set set = (Set) list2.stream().filter(new Predicate() { // from class: gfx
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SportEventAssociator.d((SportEventAssociator.c) obj);
            }
        }).map(new Function() { // from class: ggd
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return SportEventAssociator.c((SportEventAssociator.c) obj);
            }
        }).collect(Collectors.toSet());
        ReleaseLogUtil.d("R_SportEventAssociator", "filterDuplicateResults finish");
        return (List) list.stream().filter(new ggc()).filter(new Predicate() { // from class: ggj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SportEventAssociator.c(set, (SportEventAssociator.c) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ boolean d(c cVar) {
        return (cVar == null || cVar.e() == null) ? false : true;
    }

    public static /* synthetic */ String c(c cVar) {
        ggm ggmVarE = cVar.e();
        return ggmVarE.b() + "_" + ggmVarE.d();
    }

    public static /* synthetic */ boolean c(Set set, c cVar) {
        ggm ggmVarE = cVar.e();
        if (ggmVarE == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ggmVarE.b());
        sb.append("_");
        sb.append(ggmVarE.d());
        return !set.contains(sb.toString());
    }

    public static List<c> b(String str) {
        String strH = lua.h(str, str);
        if (StringUtils.g(strH)) {
            ReleaseLogUtil.d("R_SportEventAssociator", "getAssociatedEventsFromSpByKey return emptyList");
            return Collections.EMPTY_LIST;
        }
        List list = (List) HiJsonUtil.a(strH, new TypeToken<List<c>>() { // from class: com.huawei.health.plan.association.SportEventAssociator.9
        }.getType());
        if (list == null) {
            ReleaseLogUtil.d("R_SportEventAssociator", "getAssociatedEventsFromSpByKey return emptyList");
            return Collections.EMPTY_LIST;
        }
        return (List) list.stream().filter(new ggc()).filter(new Predicate() { // from class: ggf
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SportEventAssociator.a((SportEventAssociator.c) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ boolean a(c cVar) {
        return (cVar.e() == null || njy.e(cVar.b())) ? false : true;
    }
}
