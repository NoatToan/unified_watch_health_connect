package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f34954a = Integer.toString(20002);

    public static void e(long j, long j2) {
        LogUtil.a("Track_SportDataCacheUtil", "enter queryTrackDetail startTime is ", Long.valueOf(j), " endTime is ", Long.valueOf(j2));
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.b()).readHiHealthData(hiDataReadOption, new AnonymousClass5());
    }

    /* JADX INFO: renamed from: gdv$5, reason: invalid class name */
    class AnonymousClass5 implements HiDataReadResultListener {
        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        AnonymousClass5() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (!(obj instanceof SparseArray)) {
                LogUtil.j("Track_SportDataCacheUtil", "onResult !(data instanceof SparseArray)");
                return;
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                LogUtil.j("Track_SportDataCacheUtil", "gotoTrackDetail map size is 0");
                return;
            }
            Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
            if (njy.b(obj2, HiHealthData.class)) {
                List list = (List) obj2;
                if (njy.e(list)) {
                    LogUtil.j("Track_SportDataCacheUtil", "gotoTrackDetail list is null");
                    return;
                }
                final HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.j("Track_SportDataCacheUtil", "gotoTrackDetail hiHealthData is null");
                } else {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: gdx
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            gdv.AnonymousClass5.e(hiHealthData);
                        }
                    });
                }
            }
        }

        static /* synthetic */ void e(HiHealthData hiHealthData) throws Throwable {
            MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
            ntv.b(hiHealthData, motionPathSimplify);
            motionPathSimplify.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
            motionPathSimplify.saveProductId(hiHealthData.getString("device_prodid"));
            motionPathSimplify.saveSubProductId(hiHealthData.getString("device_subprodid"));
            if (motionPathSimplify.hasTrackPoint()) {
                gdv.b(motionPathSimplify);
            } else {
                gdv.e(motionPathSimplify, (Bitmap) null);
            }
        }
    }

    public static void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gdz
            @Override // java.lang.Runnable
            public final void run() {
                gdv.j();
            }
        });
    }

    static /* synthetic */ void j() {
        ReleaseLogUtil.e("Track_SportDataCacheUtil", "clearAllCache");
        String str = f34954a;
        SharedPreferenceManager.b(str, "sportDataCache");
        SharedPreferenceManager.b(str, "sportSaveTimeCache");
        SharedPreferenceManager.b(str, "sportTimeCache");
        qqf.c("sportBitmapCache", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(MotionPathSimplify motionPathSimplify, Bitmap bitmap) throws Throwable {
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        if (d() > jRequestStartTime) {
            ReleaseLogUtil.e("Track_SportDataCacheUtil", "previous data, discarding!!");
            return;
        }
        String strB = qqt.b(motionPathSimplify);
        ReleaseLogUtil.d("Track_SportDataCacheUtil", "saveSportDataCache simplySp: ", Long.valueOf(jRequestStartTime));
        Context contextB = BaseApplication.b();
        String str = f34954a;
        SharedPreferenceManager.e(contextB, str, "sportDataCache", strB, null);
        SharedPreferenceManager.c(str, "sportSaveTimeCache", System.currentTimeMillis());
        SharedPreferenceManager.c(str, "sportTimeCache", jRequestStartTime);
        qqf.c("sportBitmapCache", true);
        if (bitmap != null) {
            ReleaseLogUtil.d("Track_SportDataCacheUtil", "setSportBitmapCache");
            c(bitmap);
        }
    }

    public static long d() {
        return SharedPreferenceManager.d(f34954a, "sportTimeCache", 0L);
    }

    public static long a() {
        return SharedPreferenceManager.d(f34954a, "sportSaveTimeCache", 0L);
    }

    public static MotionPathSimplify e() {
        try {
            return (MotionPathSimplify) HiJsonUtil.d(SharedPreferenceManager.e(BaseApplication.b(), f34954a, "sportDataCache"), MotionPathSimplify.class);
        } catch (JsonSyntaxException e) {
            LogUtil.e("Track_SportDataCacheUtil", "getSportDataCache JsonSyntaxException, e is ", e.getMessage());
            return null;
        }
    }

    public static Bitmap b() {
        return qqf.a("sportBitmapCache", true);
    }

    private static void c(Bitmap bitmap) throws Throwable {
        qqf.e("sportBitmapCache", bitmap, Bitmap.CompressFormat.PNG, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final MotionPathSimplify motionPathSimplify) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (motionPathSimplify.requestSportType() == 512 && njy.b(motionPathSimplify.requestChildSportItems())) {
            for (RelativeSportData relativeSportData : motionPathSimplify.requestChildSportItems()) {
                if (relativeSportData.isHasDetailInfo()) {
                    arrayList.add(Long.valueOf(relativeSportData.getStartTime()));
                    arrayList2.add(Long.valueOf(relativeSportData.getEndTime()));
                }
            }
        } else {
            arrayList.add(Long.valueOf(motionPathSimplify.requestStartTime()));
            arrayList2.add(Long.valueOf(motionPathSimplify.requestEndTime()));
        }
        LogUtil.a("Track_SportDataCacheUtil", "enter getTrackDraw");
        gcn.c().getTrackDraw(arrayList, arrayList2, new IBaseResponseCallback() { // from class: gea
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) throws Throwable {
                gdv.d(motionPathSimplify, i, obj);
            }
        });
    }

    static /* synthetic */ void d(MotionPathSimplify motionPathSimplify, int i, Object obj) throws Throwable {
        if (i == 0 && (obj instanceof Bitmap)) {
            e(motionPathSimplify, (Bitmap) obj);
        } else {
            LogUtil.a("Track_SportDataCacheUtil", "track pic is not back hasTrack is true");
            e(motionPathSimplify, (Bitmap) null);
        }
    }
}
