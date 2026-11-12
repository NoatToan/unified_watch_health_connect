package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwonesdk.datastructure.request.SubDataType;
import com.huawei.hwonesdk.process.HiHealthProcess;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class nsd implements HiHealthProcess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Gson f43577b = new Gson();

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public HiDataReadOption preProcess(String str) {
        ReleaseLogUtil.d("R_HiHealthProcess__readSportData", "Enter AggregateSportDataProcess");
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.a("HiHealthProcess__readSportData", "preProcess request is empty");
            return null;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        nrb nrbVar = (nrb) peh.b(str, nrb.class);
        if (nrbVar == null) {
            ReleaseLogUtil.a("HiHealthProcess__readSportData", "sampleStatReadRequest is null");
            return null;
        }
        hiDataReadOption.setTimeInterval(nrbVar.c(), nrbVar.e());
        hiDataReadOption.setType(nrbVar.o());
        hiDataReadOption.setSortOrder(nrbVar.g());
        return hiDataReadOption;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (obj == null || !(obj2 instanceof nrb)) {
            LogUtil.d("HiHealthProcess__readSportData", "postProcess null");
            return "";
        }
        List<HiHealthData> listE = e(obj, 0);
        nrb nrbVar = (nrb) obj2;
        ArrayList arrayList = new ArrayList();
        boolean zE = nrbVar.n() != null ? nrbVar.n().e() : false;
        for (HiHealthData hiHealthData : listE) {
            if (hiHealthData != null) {
                MotionPathSimplify motionPathSimplifyD = ntv.d(hiHealthData);
                nrh nrhVar = new nrh(hiHealthData);
                nrhVar.d(nrbVar.l());
                nrhVar.c(new SubDataType(motionPathSimplifyD.requestSportType()));
                Gson gson = f43577b;
                nrhVar.a((Map<String, Object>) gson.fromJson(gson.toJson(motionPathSimplifyD), Map.class));
                if (zE) {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    d(nrhVar, motionPathSimplifyD, countDownLatch);
                    try {
                        if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                            ReleaseLogUtil.e("HiHealthProcess__readSportData", "postProcess wait timeout");
                        }
                    } catch (InterruptedException unused) {
                        LogUtil.c("HiHealthProcess__readSportData", "postProcess occur InterruptedException");
                    }
                }
                arrayList.add(nrhVar);
            }
        }
        nqk.b(arrayList, nrbVar.g());
        LogUtil.a("HiHealthProcess__readSportData", "arkUiDataList is ", peh.c(arrayList));
        return peh.c(arrayList);
    }

    private void d(final nrh nrhVar, MotionPathSimplify motionPathSimplify, final CountDownLatch countDownLatch) {
        if (nrhVar == null || motionPathSimplify == null) {
            countDownLatch.countDown();
            LogUtil.d("HiHealthProcess__readSportData", "readTrackDetail param invalid.");
        } else {
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            hiDataReadOption.setTimeInterval(motionPathSimplify.requestStartTime(), motionPathSimplify.requestEndTime());
            hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
            HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: nsd.4
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() <= 0) {
                        countDownLatch.countDown();
                        LogUtil.d("HiHealthProcess__readSportData", "readTrackDetail onResult map is empty.");
                        return;
                    }
                    Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                    if (!njy.b(obj2, HiHealthData.class)) {
                        countDownLatch.countDown();
                        LogUtil.d("HiHealthProcess__readSportData", "readTrackDetail onResult map is empty.");
                        return;
                    }
                    String strB = xjl.b(BaseApplication.getContext(), ((HiHealthData) ((List) obj2).get(0)).getSequenceFileUrl());
                    if (!TextUtils.isEmpty(strB)) {
                        nrhVar.b(strB);
                    }
                    countDownLatch.countDown();
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    countDownLatch.countDown();
                }
            });
        }
    }

    public static List<HiHealthData> e(Object obj, int i) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.d("HiHealthProcess__readSportData", "data error.");
            return Collections.EMPTY_LIST;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
            LogUtil.d("HiHealthProcess__readSportData", "getTrackData onResult obj not instanceof List");
            return Collections.EMPTY_LIST;
        }
        List<HiHealthData> list = (List) sparseArray.get(i);
        if (!njy.e(list) && list.get(0) != null) {
            return list;
        }
        LogUtil.d("HiHealthProcess__readSportData", "getTrackData size 0");
        return Collections.EMPTY_LIST;
    }

    @Override // com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess__readSportData", "doAction callback is null");
            return;
        }
        HiDataReadOption hiDataReadOptionPreProcess = preProcess(str);
        LogUtil.a("HiHealthProcess__readSportData", "preProcess readHiHealthSportDataPro", hiDataReadOptionPreProcess);
        if (hiDataReadOptionPreProcess == null) {
            iBaseResponseCallback.a(0, "[]");
            ReleaseLogUtil.a("HiHealthProcess__readSportData", "doAction option is null");
            return;
        }
        int iB = b(str);
        if (iB > 0) {
            HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchSequenceDataProBySportType(HiDataReadProOption.builder().e(hiDataReadOptionPreProcess).b(iB).b(), new a(this, str, iBaseResponseCallback));
        } else {
            HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchSequenceDataBySportType(hiDataReadOptionPreProcess, new a(this, str, iBaseResponseCallback));
        }
    }

    private int b(String str) {
        nrb nrbVar = (nrb) peh.b(str, nrb.class);
        if (nrbVar == null || nrbVar.l() == null || nrbVar.l().getmId() <= 0) {
            return 0;
        }
        return nrbVar.l().getmId();
    }

    static class a implements HiDataReadResultListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nsd f43580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f43581c;
        private final IBaseResponseCallback d;

        a(nsd nsdVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43580b = nsdVar;
            this.f43581c = str;
            this.d = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, int i, int i2) {
            LogUtil.a("HiHealthProcess__readSportData", "readHiHealthSportDataPro success, data is ", obj);
            if (this.d == null) {
                ReleaseLogUtil.e("HiHealthProcess__readSportData", "onResult callback is null");
                return;
            }
            if (this.f43580b == null) {
                ReleaseLogUtil.e("HiHealthProcess__readSportData", "onResult process is null");
                this.d.a(-1, "");
                return;
            }
            final nrb nrbVar = (nrb) peh.b(this.f43581c, nrb.class);
            if (nrbVar == null) {
                ReleaseLogUtil.e("HiHealthProcess__readSportData", "onResult request is null");
                this.d.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nsf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d(obj, nrbVar);
                    }
                });
            }
        }

        /* synthetic */ void d(Object obj, nrb nrbVar) {
            this.d.a(0, this.f43580b.postProcess(obj, nrbVar));
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HiHealthProcess__readSportData", "readHiHealthSportDataPro, data is ", obj);
            this.d.a(-1, "");
        }
    }
}
