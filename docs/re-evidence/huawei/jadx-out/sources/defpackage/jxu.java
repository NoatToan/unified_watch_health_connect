package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.util.HotTrackDrawCustomTarget;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class jxu {
    private static int e = Color.rgb(107, FitnessSleepType.HW_FITNESS_NOON, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f39182a = new Object();

    private static float a(float f, int i, float f2, float f3) {
        return (i - ((f2 - f3) * f)) / 2.0f;
    }

    private static float c(float f, float f2) {
        if (Math.abs(f) < 1.0E-7f || Math.abs(f2) < 1.0E-7f) {
            LogUtil.a("Track_TrackDrawUtil", "getRatio: width or height is 0");
            return 0.0f;
        }
        float f3 = 1100.0f / f;
        float f4 = 650.0f / f2;
        return f3 < f4 ? f3 : f4;
    }

    private static void c(List<PointF> list, Canvas canvas, Paint paint, List<Integer> list2) {
        LogUtil.a("Track_TrackDrawUtil", "paintTrackMap colorList size: ", Integer.valueOf(list2.size()), "pointList size : ", Integer.valueOf(list.size()));
        synchronized (f39182a) {
            for (int i = 0; i < list.size() - 1; i++) {
                a(list, canvas, list2, i);
            }
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setAlpha(255);
        paint2.setStrokeWidth(20.0f);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        canvas.drawCircle(list.get(0).x, list.get(0).y, 30.0f, paint);
        canvas.drawCircle(list.get(list.size() - 1).x, list.get(list.size() - 1).y, 30.0f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#FF8CD600"));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(Color.parseColor("#FFFAB22A"));
        canvas.drawCircle(list.get(0).x, list.get(0).y, 30.0f, paint);
        canvas.drawCircle(list.get(list.size() - 1).x, list.get(list.size() - 1).y, 30.0f, paint2);
    }

    private static void a(List<PointF> list, Canvas canvas, List<Integer> list2, int i) {
        Paint paint = new Paint();
        PointF pointF = list.get(i);
        PointF pointF2 = list.get(i + 1);
        Path path = new Path();
        if (pointF == null || e(pointF.x, pointF.y) || pointF2 == null) {
            return;
        }
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        int iIntValue = e;
        if (njy.c(list2, i)) {
            iIntValue = list2.get(i).intValue();
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(20.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.close();
        canvas.drawPath(path, paint);
        paint.reset();
    }

    private static boolean e(float f, float f2) {
        return Math.abs(((double) f) + 80.0d) < 1.0000000116860974E-7d && Math.abs(((double) f2) - 90.0d) < 1.0000000116860974E-7d;
    }

    public static void b(List<Long> list, List<Long> list2, Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("Track_TrackDrawUtil", "getTrackDraw callback is null");
        } else {
            if (e(list, list2, context, iBaseResponseCallback)) {
                return;
            }
            c(list, list2, context, iBaseResponseCallback, new TreeMap());
        }
    }

    private static void a(List<Long> list, int i, IBaseResponseCallback iBaseResponseCallback, List<njj> list2, Map<Long, Map<Long, double[]>> map) {
        ArrayList arrayList = new ArrayList(20);
        for (Map.Entry<Long, Map<Long, double[]>> entry : map.entrySet()) {
            if (list.size() > 0 && entry.getKey().equals(list.get(0))) {
                arrayList.add(entry.getValue());
            } else if (list.size() > 1 && entry.getKey().equals(list.get(1))) {
                arrayList.add(entry.getValue());
            } else if (list.size() > 2 && entry.getKey().equals(list.get(2))) {
                arrayList.add(entry.getValue());
            } else {
                LogUtil.d("Track_TrackDrawUtil", "Track more");
            }
        }
        ArrayList arrayList2 = new ArrayList(20);
        c cVarD = d(arrayList, arrayList2);
        if (cVarD == null) {
            LogUtil.a("Track_TrackDrawUtil", "saveDataAndDraw: bound is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList(20);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.addAll((List) it.next());
        }
        e = Color.rgb(107, FitnessSleepType.HW_FITNESS_NOON, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);
        b((ArrayList<PointF>) arrayList3, list2, i, iBaseResponseCallback, cVarD);
    }

    private static void c(final List<Long> list, List<Long> list2, final Context context, final IBaseResponseCallback iBaseResponseCallback, final Map<Long, Map<Long, double[]>> map) {
        for (int i = 0; i < list.size(); i++) {
            HiDataReadOption hiDataReadOption = new HiDataReadOption();
            hiDataReadOption.setTimeInterval(list.get(i).longValue(), list2.get(i).longValue());
            hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
            HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jxu.3
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i2, Object obj, int i3, int i4) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i2, int i3) {
                    IBaseResponseCallback iBaseResponseCallback2;
                    if (i2 != 0 && (iBaseResponseCallback2 = iBaseResponseCallback) != null) {
                        iBaseResponseCallback2.a(-1, null);
                        LogUtil.e("Track_TrackDrawUtil", "MSG_TYPE_TRACK_RECOVER_TIME_RECOMMEND Not return valid data");
                    }
                    LogUtil.a("Track_TrackDrawUtil", "onResult: errorCode = ", Integer.valueOf(i2), " anchor = ", Integer.valueOf(i3));
                    jxu.a(obj, context, iBaseResponseCallback, (List<Long>) list, (Map<Long, Map<Long, double[]>>) map);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(Object obj, Context context, IBaseResponseCallback iBaseResponseCallback, List<Long> list, Map<Long, Map<Long, double[]>> map) {
        List<HiHealthData> listE = e(obj);
        if (njy.e(listE)) {
            LogUtil.j("Track_TrackDrawUtil", "getTrackDetailData list is null or empty");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        HiHealthData hiHealthData = listE.get(0);
        if (hiHealthData == null) {
            LogUtil.j("Track_TrackDrawUtil", "getTrackDetailData onResult hiHealthData is null");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        String metaData = hiHealthData.getMetaData();
        motionPathSimplify.saveStartTime(hiHealthData.getStartTime());
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) yly.c(metaData, HiTrackMetaData.class);
        if (hiTrackMetaData != null) {
            motionPathSimplify.saveSportType(hiTrackMetaData.getSportType());
            motionPathSimplify.savePaceMap(new TreeMap(hiTrackMetaData.getPaceMap()));
        }
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (TextUtils.isEmpty(sequenceFileUrl)) {
            LogUtil.j("Track_TrackDrawUtil", "getTrackDetailData onResult fileUrl is empty");
            iBaseResponseCallback.a(-1, null);
            return;
        }
        File file = new File(context.getFilesDir().getPath() + File.separator + sequenceFileUrl);
        if (!file.exists()) {
            iBaseResponseCallback.a(-1, null);
            LogUtil.j("Track_TrackDrawUtil", "getTrackDetailData file not exist");
            return;
        }
        LogUtil.a("Track_TrackDrawUtil", "getTrackDetailDataResult: motionFile size is ", Long.valueOf(file.length()));
        MotionPath motionPathB = jac.b(context, sequenceFileUrl);
        if (motionPathB != null) {
            motionPathSimplify.savePaceV2(motionPathB.getPacesV2());
            b(motionPathSimplify, motionPathB, list, map, iBaseResponseCallback);
        } else {
            LogUtil.j("Track_TrackDrawUtil", "getTrackDetailData motion path is null");
            iBaseResponseCallback.a(-1, null);
        }
    }

    private static List<HiHealthData> e(Object obj) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.j("Track_TrackDrawUtil", "handleNullResult onResult data not instanceof SparseArray");
            return null;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() <= 0) {
            LogUtil.j("Track_TrackDrawUtil", "handleNullResult onResult map size is null");
            return null;
        }
        Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        if (!njy.b(obj2, HiHealthData.class)) {
            LogUtil.j("Track_TrackDrawUtil", "handleNullResult onResult obj not instanceof List");
            return null;
        }
        List<HiHealthData> arrayList = new ArrayList<>();
        if (obj2 instanceof List) {
            arrayList = (List) obj2;
        }
        if (!njy.e(arrayList)) {
            return arrayList;
        }
        LogUtil.j("Track_TrackDrawUtil", "handleNullResult onResult list is null or empty");
        return null;
    }

    private static void b(MotionPathSimplify motionPathSimplify, MotionPath motionPath, List<Long> list, Map<Long, Map<Long, double[]>> map, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Track_TrackDrawUtil", "motionPath.requestLbsDataMap()", Integer.valueOf(motionPath.requestLbsDataMap().size()));
        map.put(Long.valueOf(motionPathSimplify.requestStartTime()), motionPath.requestLbsDataMap());
        int iRequestSportType = list.size() > 1 ? 512 : motionPathSimplify.requestSportType();
        List<njj> listRequestPaceList = motionPathSimplify.requestPaceList();
        if (map.size() == list.size()) {
            LogUtil.a("Track_TrackDrawUtil", "sTempBuffer.size()", Integer.valueOf(map.size()), "startTime.size()", Integer.valueOf(list.size()));
            a(list, iRequestSportType, iBaseResponseCallback, listRequestPaceList, map);
        } else {
            LogUtil.a("Track_TrackDrawUtil", "size is different ,sTempBuffer.size()", Integer.valueOf(map.size()), "startTime.size()", Integer.valueOf(list.size()));
            iBaseResponseCallback.a(-1, null);
        }
    }

    private static boolean e(List<Long> list, List<Long> list2, Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("Track_TrackDrawUtil", "callback == null");
            return true;
        }
        if (context == null) {
            LogUtil.e("Track_TrackDrawUtil", "getTrackDraw:context ==null");
            iBaseResponseCallback.a(-1, null);
            return true;
        }
        if (list != null && list2 != null && list.size() == list2.size()) {
            return false;
        }
        LogUtil.e("Track_TrackDrawUtil", "getTrackDraw:time is not correct");
        iBaseResponseCallback.a(-1, null);
        return true;
    }

    public static void e(List<Map<Long, double[]>> list, IBaseResponseCallback iBaseResponseCallback) {
        ArrayList arrayList = new ArrayList(20);
        c cVarD = d(list, arrayList);
        if (cVarD == null) {
            iBaseResponseCallback.a(-1, null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(20);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll((List) it.next());
        }
        e = Color.rgb(66, 150, 248);
        b((ArrayList<PointF>) arrayList2, (List<njj>) null, 257, iBaseResponseCallback, cVarD);
    }

    private static void b(ArrayList<PointF> arrayList, List<njj> list, int i, IBaseResponseCallback iBaseResponseCallback, c cVar) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1190, 740, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            canvas.drawBitmap(bitmapCreateBitmap, new Matrix(), paint);
            paint.setStrokeWidth(20.0f);
            if (Utils.o()) {
                paint.setColor(Color.parseColor("#FF4296F8"));
            } else {
                paint.setColor(Color.parseColor("#FF8CD600"));
            }
            paint.setAntiAlias(true);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStyle(Paint.Style.STROKE);
            List arrayList2 = new ArrayList(20);
            if (list == null || list.size() < 1 || Utils.o() || i == 512) {
                arrayList2.add(Integer.valueOf(e));
            } else {
                arrayList2 = d(arrayList.size(), list, i);
            }
            if (arrayList.size() == 0) {
                LogUtil.e("Track_TrackDrawUtil", "pointListFormat is null");
                iBaseResponseCallback.a(-1, null);
                return;
            }
            int size = arrayList.size() > 10000 ? (int) (arrayList.size() * 0.1f) : 200;
            if (arrayList2.size() > arrayList.size() && Math.abs(arrayList.size() - arrayList2.size()) > size) {
                LogUtil.j("Track_TrackDrawUtil", "listAll.size() - colorList.size() > ", Integer.valueOf(size));
                iBaseResponseCallback.a(303, null);
                return;
            }
            ArrayList<PointF> arrayListC = c(arrayList, cVar);
            if (njy.e(arrayListC, 2)) {
                ReleaseLogUtil.b("Track_TrackDrawUtil", "pointListFormat size is empty ");
                iBaseResponseCallback.a(-1, null);
            } else {
                c(arrayListC, canvas, paint, arrayList2);
                iBaseResponseCallback.a(0, bitmapCreateBitmap);
            }
        } catch (OutOfMemoryError unused) {
            ReleaseLogUtil.b("Track_TrackDrawUtil", "error is oom,catch it");
            iBaseResponseCallback.a(-1, null);
        }
    }

    private static ArrayList<PointF> c(ArrayList<PointF> arrayList, c cVar) {
        if (njy.e(arrayList)) {
            return new ArrayList<>(0);
        }
        float fC = c(cVar.f39186a - cVar.f39187b, cVar.e - cVar.f39188c);
        ArrayList<PointF> arrayList2 = new ArrayList<>(20);
        if (Math.abs(fC) < 1.0E-7f) {
            LogUtil.e("Track_TrackDrawUtil", "adaptToCanvas: ratio is 0");
            return new ArrayList<>(0);
        }
        float fA = a(fC, 1190, cVar.f39186a, cVar.f39187b);
        float fA2 = a(fC, 740, cVar.e, cVar.f39188c);
        for (PointF pointF : arrayList) {
            arrayList2.add(new PointF(((pointF.x - cVar.f39187b) * fC) + fA, ((cVar.e - pointF.y) * fC) + fA2));
        }
        return arrayList2;
    }

    private static List<Integer> d(int i, List<njj> list, int i2) {
        List<Integer> listA;
        int iIntValue;
        float[] fArr = new float[list.size()];
        Integer[] numArr = new Integer[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            njj njjVar = list.get(i3);
            fArr[i3] = njjVar.e();
            numArr[i3] = Integer.valueOf(izt.c(njjVar.d(), i2));
        }
        try {
            listA = izt.a(fArr, numArr);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("Track_TrackDrawUtil", "get color List is oom");
            listA = null;
        }
        if (listA == null) {
            LogUtil.e("Track_TrackDrawUtil", "color list is null");
            return new ArrayList(0);
        }
        LogUtil.a("Track_TrackDrawUtil", "colorList ", Integer.valueOf(listA.size()), " pointSize ", Integer.valueOf(i));
        int size = listA.size();
        if (size < i) {
            if (size == 0) {
                iIntValue = e;
            } else {
                iIntValue = listA.get(size - 1).intValue();
            }
            for (int i4 = 0; i4 < i - size; i4++) {
                listA.add(Integer.valueOf(iIntValue));
            }
        }
        return listA;
    }

    private static c d(List<Map<Long, double[]>> list, List<List<PointF>> list2) {
        if (njy.e(list)) {
            return null;
        }
        c cVar = new c(-90.0f, -180.0f, 90.0f, 180.0f);
        for (Map<Long, double[]> map : list) {
            if (map == null || map.size() == 0) {
                LogUtil.j("Track_TrackDrawUtil", "multi buffer lbsDataMap is null ");
            } else {
                ArrayList arrayList = new ArrayList(20);
                for (Map.Entry<Long, double[]> entry : map.entrySet()) {
                    if (entry.getValue().length < 2) {
                        LogUtil.e("Track_TrackDrawUtil", "wrong data");
                    } else {
                        float f = (float) entry.getValue()[0];
                        float f2 = (float) entry.getValue()[1];
                        if (!e(f2, f) && f2 <= 180.0f && f2 > -180.0f && f > -90.0f && f < 90.0f) {
                            e(arrayList, f, f2, cVar);
                        }
                    }
                }
                list2.add(arrayList);
            }
        }
        return cVar;
    }

    private static void e(List<PointF> list, float f, float f2, c cVar) {
        if (f2 > cVar.f39186a) {
            cVar.f39186a = f2;
        }
        if (f2 < cVar.f39187b) {
            cVar.f39187b = f2;
        }
        if (f > cVar.e) {
            cVar.e = f;
        }
        if (f < cVar.f39188c) {
            cVar.f39188c = f;
        }
        list.add(new PointF(f2, f));
    }

    /* JADX INFO: loaded from: classes33.dex */
    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f39186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f39187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f39188c;
        private float e;

        public c(float f, float f2, float f3, float f4) {
            this.e = f;
            this.f39186a = f2;
            this.f39188c = f3;
            this.f39187b = f4;
        }
    }

    public static boolean b(Map<String, String> map) {
        boolean zContainsKey = map.containsKey("hotPathId");
        LogUtil.a("Track_TrackDrawUtil", "initRunRouteView : isHotPathIdExists = ", Boolean.valueOf(zContainsKey));
        return zContainsKey;
    }

    public static void d(String str, final HotTrackDrawCustomTarget<Drawable> hotTrackDrawCustomTarget) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_TrackDrawUtil", "hotPathId is empty");
        } else {
            gch.b().getHotPathDetail(str, new UiCallback<gdm>() { // from class: jxu.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("Track_TrackDrawUtil", "can't get hotPathDetail & errorCode = ", Integer.valueOf(i), " & errorInfo is ", str2);
                    hotTrackDrawCustomTarget.onLoadFailed(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdm gdmVar) {
                    if (gdmVar == null) {
                        LogUtil.j("Track_TrackDrawUtil", "hotPathDetail is null");
                        hotTrackDrawCustomTarget.onLoadFailed(null);
                        return;
                    }
                    hotTrackDrawCustomTarget.onGetHotTrackDetailInfo(gdmVar);
                    gdw gdwVarN = gdmVar.n();
                    if (gdwVarN == null) {
                        LogUtil.j("Track_TrackDrawUtil", "pathImageInfo is null");
                        hotTrackDrawCustomTarget.onLoadFailed(null);
                    } else {
                        String strC = gdwVarN.c();
                        LogUtil.a("Track_TrackDrawUtil", "defaultImageUrl = ", strC);
                        qqf.b(strC, hotTrackDrawCustomTarget);
                    }
                }
            });
        }
    }

    public static void b(List<GpsPoint> list, String str, InterfaceHiMap interfaceHiMap) {
        if (njy.e(list)) {
            LogUtil.j("Track_TrackDrawUtil", "drawHotTrackPath list is null");
            return;
        }
        if (interfaceHiMap == null) {
            LogUtil.j("Track_TrackDrawUtil", "map is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<GpsPoint> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(izt.b(it.next()));
        }
        List<jpg> listD = izt.d(arrayList, str, interfaceHiMap.getMapEngineType());
        jrs jrsVar = new jrs();
        jrsVar.a(listD);
        jrsVar.c(ContextCompat.getColor(BaseApplication.getContext(), R.color.hot_track_line_color));
        jrsVar.d(false);
        jrsVar.b(jer.d(4.0f));
        interfaceHiMap.drawLines(jrsVar);
    }
}
