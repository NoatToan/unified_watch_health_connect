package defpackage;

import android.util.SparseArray;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class jxh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static MotionPathSimplify f39157c;

    public static void a(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jxh.2
            final njd d = new njd();

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                IBaseResponseCallback iBaseResponseCallback2;
                if (i != 0 && (iBaseResponseCallback2 = iBaseResponseCallback) != null) {
                    iBaseResponseCallback2.a(i, this.d);
                }
                jxh.a(obj, this.d, iBaseResponseCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, njd njdVar, IBaseResponseCallback iBaseResponseCallback) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult data not instanceof SparseArray");
            return;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult map size is null");
            return;
        }
        Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult obj not instanceof List");
            return;
        }
        List list = (List) obj2;
        if (list.isEmpty()) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult list is empty");
            return;
        }
        HiHealthData hiHealthData = (HiHealthData) list.get(0);
        if (hiHealthData == null) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult hiHealthData is null");
            return;
        }
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        String strB = ntv.b(hiHealthData, motionPathSimplify);
        motionPathSimplify.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
        motionPathSimplify.saveProductId(hiHealthData.getString("device_prodid"));
        motionPathSimplify.saveSubProductId(hiHealthData.getString("device_subprodid"));
        if (strB == null) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData onResult fileUrl is null");
            return;
        }
        njdVar.c(strB);
        njdVar.e(motionPathSimplify);
        if (iBaseResponseCallback == null) {
            LogUtil.e("Track_TrackDataRequestUtil", "getTrackDetailData callback is null");
        } else {
            iBaseResponseCallback.a(0, njdVar);
        }
    }

    public static void d(long j, long j2, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (z) {
            e(j, j2, iBaseResponseCallback);
        } else {
            d(j, j2, iBaseResponseCallback);
        }
    }

    private static void e(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setSortOrder(0);
        HiDataReadProOption hiDataReadProOptionB = HiDataReadProOption.builder().e(hiDataReadOption).b(33001).b();
        LogUtil.a("Track_TrackDataRequestUtil", "requestTrackDetailData mergeTrack proOption: ", qqt.b(hiDataReadProOptionB));
        HiHealthManager.d(com.huawei.haf.application.BaseApplication.b()).fetchSequenceDataProBySportType(hiDataReadProOptionB, new HiDataReadResultListener() { // from class: jxh.5
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    LogUtil.j("Track_TrackDataRequestUtil", "gotoMergeTrackDetail data is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("Track_TrackDataRequestUtil", "onResult !(data instanceof SparseArray)");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0 || !(sparseArray.valueAt(0) instanceof List)) {
                    LogUtil.j("Track_TrackDataRequestUtil", "requestTrackDetailData onResult map is empty.");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, sparseArray.valueAt(0));
                }
            }
        });
    }

    private static void d(long j, long j2, final IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jxh.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (iBaseResponseCallback == null) {
                    LogUtil.e("Track_TrackDataRequestUtil", "requestTrackDetailData callback is null");
                    return;
                }
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("Track_TrackDataRequestUtil", "requestTrackDetailData onResult data not instanceof SparseArray.");
                    iBaseResponseCallback.a(-1, null);
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.j("Track_TrackDataRequestUtil", "requestTrackDetailData onResult map is empty.");
                    iBaseResponseCallback.a(-1, null);
                } else {
                    iBaseResponseCallback.a(0, sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN));
                }
            }
        });
    }

    public static MotionPathSimplify b() {
        return f39157c;
    }

    public static void a(MotionPathSimplify motionPathSimplify) {
        f39157c = motionPathSimplify;
    }

    public static void e() {
        f39157c = null;
    }

    public static void b(long j, long j2, IBaseResponseCallback iBaseResponseCallback) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{286});
        HiHealthManager.d(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new AnonymousClass4(iBaseResponseCallback));
    }

    /* JADX INFO: renamed from: jxh$4, reason: invalid class name */
    class AnonymousClass4 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ IBaseResponseCallback f39160c;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass4(IBaseResponseCallback iBaseResponseCallback) {
            this.f39160c = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("Track_TrackDataRequestUtil", "data not instanceof SparseArray");
                this.f39160c.a(-1, "");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (!njy.b(sparseArray.get(0), HiHealthData.class)) {
                LogUtil.e("Track_TrackDataRequestUtil", "fetchSequenceDataBySportType onResult obj not instanceof List");
                this.f39160c.a(-1, Collections.EMPTY_LIST);
                return;
            }
            List list = (List) sparseArray.get(0);
            if (njy.e(list)) {
                LogUtil.e("Track_TrackDataRequestUtil", "list is empty");
                this.f39160c.a(-1, Collections.EMPTY_LIST);
            } else {
                final ArrayList arrayList = new ArrayList();
                list.forEach(new Consumer() { // from class: jxo
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        arrayList.add(Long.valueOf(((HiHealthData) obj2).getStartTime()));
                    }
                });
                this.f39160c.a(0, (List) arrayList.stream().sorted().collect(Collectors.toList()));
            }
        }
    }
}
