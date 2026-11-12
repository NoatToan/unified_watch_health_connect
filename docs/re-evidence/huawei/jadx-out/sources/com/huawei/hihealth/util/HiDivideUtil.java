package com.huawei.hihealth.util;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.IAggregateListener;
import com.huawei.hihealth.IAggregateListenerEx;
import com.huawei.hihealth.IDataReadResultListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import health.compact.a.HiCommonUtil;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HiDivideUtil {
    private static boolean c(int i) {
        return i >= 30001 && i <= 30999;
    }

    private HiDivideUtil() {
    }

    public static void d(List list, IAggregateListener iAggregateListener) throws RemoteException {
        if (HiCommonUtil.b(list)) {
            if (iAggregateListener != null) {
                iAggregateListener.onResult(null, 0, 1);
                return;
            }
            return;
        }
        int size = list.size();
        int iC = c(size, list);
        LogUtil.a("HiH_HiDivideUtil", "dataList size : ", Integer.valueOf(size), ", divideList part : ", Integer.valueOf(iC));
        int i = 0;
        while (i < size) {
            int i2 = i + iC;
            if (i2 >= size) {
                if (iAggregateListener != null) {
                    iAggregateListener.onResult(list.subList(i, size), size, 1);
                }
            } else if (iAggregateListener != null) {
                iAggregateListener.onResult(list.subList(i, i2), i2, 0);
            }
            i = i2;
        }
    }

    public static void d(int i, List list, IAggregateListenerEx iAggregateListenerEx) throws RemoteException {
        if (HiCommonUtil.b(list)) {
            if (iAggregateListenerEx != null) {
                iAggregateListenerEx.onResult(null, i, 1);
                return;
            }
            return;
        }
        int size = list.size();
        int iC = c(size, list);
        LogUtil.a("HiH_HiDivideUtil", "dataType = ", Integer.valueOf(i), ", dataList size = ", Integer.valueOf(size), ", divideList part = ", Integer.valueOf(iC));
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + iC;
            if (i3 >= size) {
                if (iAggregateListenerEx != null) {
                    iAggregateListenerEx.onResult(list.subList(i2, size), i, 1);
                }
            } else if (iAggregateListenerEx != null) {
                iAggregateListenerEx.onResult(list.subList(i2, i3), i, 0);
            }
            i2 = i3;
        }
    }

    private static int c(int i, List list) {
        if (i > 0) {
            if (!(list.get(0) instanceof HiHealthData)) {
                LogUtil.c("HiH_HiDivideUtil", "getDivideLength dataList error");
            } else {
                int contentLength = ((HiHealthData) list.get(0)).getContentLength();
                if (contentLength > 10) {
                    int i2 = 400 - (((contentLength - 10) / 3) * 100);
                    if (i2 <= 0) {
                        return 100;
                    }
                    return i2;
                }
            }
        }
        return 400;
    }

    public static void d(int i, List list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (!HiCommonUtil.b(list)) {
            b(iDataReadResultListener, list, i, 1);
        } else if (iDataReadResultListener != null) {
            iDataReadResultListener.onResult(new ArrayList(0), i, 1);
        }
    }

    private static void b(IDataReadResultListener iDataReadResultListener, List list, int i, int i2) throws RemoteException {
        if (iDataReadResultListener == null || list.isEmpty()) {
            return;
        }
        e((List<HiHealthData>) list);
        if (list.size() == 1) {
            LogUtil.a("HiH_HiDivideUtil", "onResultSplitIfOverLimit splitInfo: dataType=", Integer.valueOf(i), ", listSize=", Integer.valueOf(list.size()), ", parcelSize=", null, ", endFlag=", Integer.valueOf(i2));
            iDataReadResultListener.onResult(list, i, i2);
            return;
        }
        int iA = a(list);
        if (iA > 204800 && list.size() > 1) {
            int size = list.size() / 2;
            b(iDataReadResultListener, list.subList(0, size), i, 0);
            b(iDataReadResultListener, list.subList(size, list.size()), i, i2);
        } else {
            LogUtil.a("HiH_HiDivideUtil", "onResultSplitIfOverLimit splitInfo: dataType=", Integer.valueOf(i), ", listSize=", Integer.valueOf(list.size()), ", parcelSize=", Integer.valueOf(iA), ", endFlag=", Integer.valueOf(i2));
            iDataReadResultListener.onResult(list, i, i2);
        }
    }

    private static int a(List list) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeList(list);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        return iDataSize;
    }

    public static void e(int i, List<HiHealthData> list, IDataReadResultListener iDataReadResultListener) throws RemoteException {
        if (HiCommonUtil.b(list)) {
            if (iDataReadResultListener != null) {
                iDataReadResultListener.onResult(new ArrayList(10), i, 1);
                return;
            }
            return;
        }
        e(list);
        HiHealthData hiHealthData = list.get(0);
        String sequenceData = hiHealthData.getSequenceData();
        int length = TextUtils.isEmpty(sequenceData) ? 0 : sequenceData.length();
        String metaData = hiHealthData.getMetaData();
        LogUtil.a("HiH_HiDivideUtil", "dataType = ", Integer.valueOf(i), ", dataList size = ", Integer.valueOf(list.size()), ", divideSequenceData length = ", Integer.valueOf(length), ", metaData length = ", Integer.valueOf(TextUtils.isEmpty(metaData) ? 0 : metaData.length()), ", divideList part = ", 131072);
        if (length <= 0) {
            if (iDataReadResultListener != null) {
                iDataReadResultListener.onResult(new ArrayList(10), i, 1);
                return;
            }
            return;
        }
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 131072;
            if (i3 >= length) {
                hiHealthData.setSequenceData(sequenceData.substring(i2, length));
                hiHealthData.setMetaData(metaData);
                ArrayList arrayList = new ArrayList();
                arrayList.add(hiHealthData);
                if (iDataReadResultListener != null) {
                    iDataReadResultListener.onResult(arrayList, i, 1);
                }
            } else {
                hiHealthData.setSequenceData(sequenceData.substring(i2, i3));
                hiHealthData.setMetaData(null);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(hiHealthData);
                if (iDataReadResultListener != null) {
                    iDataReadResultListener.onResult(arrayList2, i, 0);
                }
            }
            i2 = i3;
        }
    }

    public static boolean d(List<HiHealthData> list, int i, List<HiHealthData> list2) {
        if (!HiCommonUtil.b(list)) {
            list2.addAll(list);
        }
        return i == 2;
    }

    public static boolean d(List<HiHealthData> list, int i, int i2, List<HiHealthData> list2, SparseArray<List<HiHealthData>> sparseArray) {
        if (!HiCommonUtil.b(list)) {
            list2.addAll(list);
        }
        if (i2 != 1) {
            return i2 == 2;
        }
        if (HiCommonUtil.b(list2)) {
            return false;
        }
        c(sparseArray, list2, i);
        return false;
    }

    public static boolean c(Context context, List<HiHealthData> list, int[] iArr, List<HiHealthData> list2, SparseArray<List<HiHealthData>> sparseArray) {
        if (iArr == null || iArr.length != 2) {
            return false;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        if (HiHealthDataType.d(i) == HiHealthDataType.Category.SEQUENCE) {
            if (HiCommonUtil.b(list)) {
                return i2 == 2;
            }
            d(list);
            if (list.get(0).getSequenceData() != null) {
                b(context, list, iArr, list2, sparseArray);
            } else {
                d(list, i, i2, list2, sparseArray);
            }
            return false;
        }
        d(list);
        return d(list, i, i2, list2, sparseArray);
    }

    private static void b(Context context, List<HiHealthData> list, int[] iArr, List<HiHealthData> list2, SparseArray<List<HiHealthData>> sparseArray) {
        HiHealthData hiHealthData;
        String sequenceData;
        if (iArr == null || iArr.length != 2) {
            return;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        if (HiCommonUtil.b(list2)) {
            hiHealthData = null;
            sequenceData = null;
        } else {
            hiHealthData = list2.get(0);
            sequenceData = hiHealthData.getSequenceData();
        }
        if (!HiCommonUtil.b(list)) {
            if (hiHealthData == null) {
                hiHealthData = list.get(0);
                list2.add(hiHealthData);
            } else {
                hiHealthData.setSequenceData(sequenceData + list.get(0).getSequenceData());
            }
        }
        if (hiHealthData == null) {
            LogUtil.d("HiH_HiDivideUtil", "packageSequenceDivideData data is null");
            return;
        }
        if (i2 != 1 || HiCommonUtil.b(list2)) {
            return;
        }
        try {
            a(context, i == 30003, HiZipUtil.d(hiHealthData.getSequenceData()), hiHealthData);
            hiHealthData.setMetaData(list.get(0).getMetaData());
            c(sparseArray, list2, i);
        } catch (IOException e) {
            LogUtil.c("HiH_HiDivideUtil", "packageSequenceDivideData uncompress e = ", e.getMessage());
        }
    }

    public static void a(Context context, boolean z, String str, HiHealthData hiHealthData) {
        if (z) {
            String str2 = "HiTrack_" + hiHealthData.getStartTime() + hiHealthData.getEndTime() + System.currentTimeMillis();
            if (!HiFileUtil.b(context, str, str2)) {
                str2 = null;
            }
            hiHealthData.setSequenceData(null);
            hiHealthData.setSequenceFileUrl(str2);
            return;
        }
        hiHealthData.setSequenceData(str);
    }

    public static List<HiDataInsertOption> d(HiDataInsertOption hiDataInsertOption) {
        List<HiHealthData> datas = hiDataInsertOption.getDatas();
        ArrayList arrayList = new ArrayList();
        if (HiCommonUtil.b(datas)) {
            arrayList.add(hiDataInsertOption);
            return arrayList;
        }
        HiHealthData hiHealthData = datas.get(0);
        ReleaseLogUtil.c("HiH_HiDivideUtil", "divideInsertOption,", Integer.valueOf(hiHealthData.getType()));
        if (HiHealthDataType.d(hiHealthData.getType()) == HiHealthDataType.Category.SEQUENCE) {
            e(datas);
            if (hiHealthData.getSequenceData() != null) {
                e(datas, arrayList, hiDataInsertOption.getWriteStatType(), hiDataInsertOption.getPackageName());
                return arrayList;
            }
            c(datas, arrayList, hiDataInsertOption.getWriteStatType(), null);
            return arrayList;
        }
        int type = hiHealthData.getType();
        if (type != 2106) {
            switch (type) {
                case 2008:
                case 2009:
                case 2010:
                case 2011:
                case 2012:
                case 2013:
                case 2014:
                case 2015:
                    break;
                default:
                    c(datas, arrayList, hiDataInsertOption.getWriteStatType(), null);
                    break;
            }
            return arrayList;
        }
        c(datas, arrayList, hiDataInsertOption.getWriteStatType(), hiDataInsertOption.getPackageName());
        return arrayList;
    }

    private static void e(List<HiHealthData> list) {
        HiHealthData hiHealthData;
        if (CollectionUtils.a(list) || (hiHealthData = list.get(0)) == null || !c(hiHealthData.getType())) {
            return;
        }
        for (HiHealthData hiHealthData2 : list) {
            String metaData = hiHealthData2.getMetaData();
            int length = TextUtils.isEmpty(metaData) ? 0 : metaData.length();
            if (length > 262144) {
                String str = "HiMetaData_" + hiHealthData2.getStartTime() + hiHealthData2.getEndTime() + System.currentTimeMillis();
                if (!HiFileUtil.b(BaseApplication.b(), metaData, str)) {
                    ReleaseLogUtil.e("HiH_HiDivideUtil", "Failed to setBigMetadataToFile failed");
                } else {
                    hiHealthData2.setMetaData(str);
                    ReleaseLogUtil.c("HiH_HiDivideUtil", "Success to setBigMetadataToFile size = ", Integer.valueOf(length));
                }
            }
        }
    }

    public static void d(List<HiHealthData> list) {
        HiHealthData hiHealthData;
        if (CollectionUtils.a(list) || (hiHealthData = list.get(0)) == null || !c(hiHealthData.getType())) {
            return;
        }
        for (HiHealthData hiHealthData2 : list) {
            String metaData = hiHealthData2.getMetaData();
            if (metaData != null && metaData.startsWith("HiMetaData_")) {
                try {
                    String strA = HiFileUtil.a(BaseApplication.b(), metaData);
                    if (strA == null || strA.isEmpty()) {
                        ReleaseLogUtil.e("HiH_HiDivideUtil", "metaData is null");
                    } else {
                        ReleaseLogUtil.c("HiH_HiDivideUtil", "handleMetadataFile metaData length=", Integer.valueOf(strA.length()));
                    }
                    hiHealthData2.setMetaData(strA);
                    e(metaData);
                } catch (Throwable th) {
                    e(metaData);
                    throw th;
                }
            }
        }
    }

    private static void e(String str) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(BaseApplication.b().getExternalFilesDir(null), str);
            if (file.exists()) {
                ReleaseLogUtil.c("HiH_HiDivideUtil", "deleteMetaDataFile deleted = ", Boolean.valueOf(file.delete()), ", path = ", str);
            }
        } catch (Exception e) {
            ReleaseLogUtil.e("HiH_HiDivideUtil", "deleteMetaDataFile exception = ", e.getMessage());
        }
    }

    private static void e(List<HiHealthData> list, List<HiDataInsertOption> list2, int i, String str) {
        String strA = "";
        for (HiHealthData hiHealthData : list) {
            try {
                strA = HiZipUtil.a(hiHealthData.getSequenceData());
            } catch (IOException e) {
                LogUtil.d("HiH_HiDivideUtil", "divideInsertSequence e = ", e.getMessage());
            }
            int length = strA.length();
            LogUtil.a("HiH_HiDivideUtil", "divideInsertSequence compressed = ", Integer.valueOf(length), ", original size = ", Integer.valueOf(hiHealthData.getSequenceData().length()));
            hiHealthData.putBoolean("is_sequence_zip", true);
            if (length <= 0) {
                e(list2, hiHealthData, i, str);
            } else {
                hiHealthData.setDataId(System.currentTimeMillis());
                int i2 = 0;
                while (i2 < length) {
                    int i3 = 262144 + i2;
                    if (i3 >= length) {
                        hiHealthData.setSequenceData(strA.substring(i2, length));
                        hiHealthData.putBoolean("is_dividing", false);
                        e(list2, hiHealthData, i, str);
                        LogUtil.a("HiH_HiDivideUtil", "divideInsertSequence finally index is ", Integer.valueOf(i2), ",track size is ", Integer.valueOf(hiHealthData.getSequenceData().length()));
                    } else {
                        hiHealthData.setSequenceData(strA.substring(i2, i3));
                        hiHealthData.putBoolean("is_dividing", true);
                        e(list2, hiHealthData, i, str);
                        LogUtil.a("HiH_HiDivideUtil", "divideInsertSequence process index is ", Integer.valueOf(i2), ",track size is ", Integer.valueOf(hiHealthData.getSequenceData().length()));
                    }
                    i2 = i3;
                }
            }
        }
        LogUtil.a("HiH_HiDivideUtil", "divideInsertSequence datas size = ", Integer.valueOf(list.size()), ", options size = ", Integer.valueOf(list2.size()));
    }

    private static void c(List<HiHealthData> list, List<HiDataInsertOption> list2, int i, String str) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 500;
            if (i3 >= size) {
                a(list2, list.subList(i2, size), i, str);
            } else {
                a(list2, list.subList(i2, i3), i, str);
            }
            i2 = i3;
        }
        LogUtil.a("HiH_HiDivideUtil", "divideInsertOther datas size = ", Integer.valueOf(size), ", options size = ", Integer.valueOf(list2.size()));
    }

    private static void c(SparseArray<List<HiHealthData>> sparseArray, List<HiHealthData> list, int i) {
        List<HiHealthData> arrayList = sparseArray.get(i);
        if (HiCommonUtil.b(arrayList)) {
            arrayList = new ArrayList<>();
        }
        arrayList.addAll(list);
        sparseArray.append(i, arrayList);
        list.clear();
    }

    private static void e(List<HiDataInsertOption> list, HiHealthData hiHealthData, int i, String str) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setWriteStatType(i);
        hiDataInsertOption.addData(hiHealthData.copyData());
        if (!TextUtils.isEmpty(str)) {
            hiDataInsertOption.setPackageName(str);
        }
        list.add(hiDataInsertOption);
    }

    private static void a(List<HiDataInsertOption> list, List<HiHealthData> list2, int i, String str) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setWriteStatType(i);
        hiDataInsertOption.setDatas(list2);
        if (!TextUtils.isEmpty(str)) {
            hiDataInsertOption.setPackageName(str);
        }
        list.add(hiDataInsertOption);
    }
}
