package defpackage;

import android.util.LruCache;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class ljn {

    public static class f implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = 7917358048129161438L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData2.getValue(), hiHealthData.getValue());
        }
    }

    public static class i implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = 3563079841739268264L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData2.getModifiedTime(), hiHealthData.getModifiedTime());
        }
    }

    public static class g implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -6461843525091425852L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return Double.compare(hiHealthData.getValue(), hiHealthData2.getValue());
        }
    }

    public static class j implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = 7917358048129161438L;
        private final String d;

        public j(String str) {
            this.d = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            try {
                return ljn.d(hiHealthData, hiHealthData2, this.d);
            } catch (JSONException e) {
                ReleaseLogUtil.e("HiH_HiCompareUtil", "SequenceComparator JSONException!, e is ", e.getMessage());
                return 0;
            }
        }
    }

    public static class m implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -6461843525091425852L;
        private final String d;

        public m(String str) {
            this.d = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            try {
                return ljn.d(hiHealthData2, hiHealthData, this.d);
            } catch (JSONException e) {
                ReleaseLogUtil.e("HiH_HiCompareUtil", "SequenceComparator JSONException!, e is ", e.getMessage());
                return 0;
            }
        }
    }

    public static class c implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -4424372499856808535L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HashMap<Integer, Integer> f40354b = new HashMap<>();
        private String d;

        private void e(HashMap<Integer, Integer> map) {
            this.f40354b = map;
        }

        private void b(String str) {
            this.d = str;
        }

        public c(HashMap<Integer, Integer> map, String str) {
            e(map);
            b(str);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            HiDeviceInfo hiDeviceInfoB = kwy.b(BaseApplication.getContext()).b(hiHealthData2.getDeviceUuid());
            HiDeviceInfo hiDeviceInfoB2 = kwy.b(BaseApplication.getContext()).b(hiHealthData.getDeviceUuid());
            Integer num = 0;
            if (hiDeviceInfoB == null || hiDeviceInfoB2 == null) {
                return 0;
            }
            int deviceType = hiDeviceInfoB.getDeviceType();
            int deviceType2 = hiDeviceInfoB2.getDeviceType();
            Integer num2 = this.f40354b.get(Integer.valueOf(deviceType));
            Integer num3 = this.f40354b.get(Integer.valueOf(deviceType2));
            if (num2 == null) {
                num2 = num;
            }
            return ljn.c(hiHealthData, hiHealthData2, num2.intValue(), (num3 != null ? num3 : 0).intValue(), this.d);
        }
    }

    public static class b implements Comparator<HiHealthData>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static LruCache<String, String> f40352b = new LruCache<>(16);
        private static final long serialVersionUID = -4424372499856808535L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, Integer> f40353a = new HashMap();
        private String d;

        private void b(Map<String, Integer> map) {
            this.f40353a = map;
        }

        private void d(String str) {
            this.d = str;
        }

        public b(Map<String, Integer> map, String str) {
            b(map);
            d(str);
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            ProductMapInfo productMapInfo;
            ProductMapInfo productMapInfo2;
            String strE = f40352b.get(hiHealthData2.getDeviceUuid());
            String strE2 = f40352b.get(hiHealthData.getDeviceUuid());
            Integer num = 0;
            if (strE == null || strE2 == null) {
                HiDeviceInfo hiDeviceInfoB = kwy.b(BaseApplication.getContext()).b(hiHealthData2.getDeviceUuid());
                HiDeviceInfo hiDeviceInfoB2 = kwy.b(BaseApplication.getContext()).b(hiHealthData.getDeviceUuid());
                if (hiDeviceInfoB == null || hiDeviceInfoB2 == null) {
                    return 0;
                }
                int deviceType = hiDeviceInfoB.getDeviceType();
                int deviceType2 = hiDeviceInfoB2.getDeviceType();
                List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(deviceType));
                List<ProductMapInfo> listC2 = ProductMap.c("deviceId", String.valueOf(deviceType2));
                if (HiCommonUtil.b(listC) || HiCommonUtil.b(listC2)) {
                    productMapInfo = null;
                    productMapInfo2 = null;
                } else {
                    productMapInfo = listC.get(0);
                    productMapInfo2 = listC2.get(0);
                }
                strE = productMapInfo == null ? null : productMapInfo.e();
                strE2 = productMapInfo2 == null ? null : productMapInfo2.e();
                if (strE != null) {
                    f40352b.put(hiHealthData2.getDeviceUuid(), strE);
                }
                if (strE2 != null) {
                    f40352b.put(hiHealthData.getDeviceUuid(), strE2);
                }
            }
            Integer num2 = this.f40353a.get(strE);
            Integer num3 = this.f40353a.get(strE2);
            if (num2 == null) {
                num2 = num;
            }
            return ljn.c(hiHealthData, hiHealthData2, num2.intValue(), (num3 != null ? num3 : 0).intValue(), this.d);
        }
    }

    public static class l implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -9060400917279988443L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return kwc.e(hiHealthData2.getType(), hiHealthData.getType());
        }
    }

    public static class e implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -8047434309060251472L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return kwc.d(hiHealthData2.getType(), hiHealthData.getType());
        }
    }

    public static class a implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = -4424372499856808535L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            return kwc.b(hiHealthData2.getType(), hiHealthData.getType());
        }
    }

    public static class d implements Comparator<Integer>, Serializable {
        private static final long serialVersionUID = 2979456610634806074L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            HiDeviceInfo hiDeviceInfoD = kyh.d(BaseApplication.getContext()).d(num.intValue());
            HiDeviceInfo hiDeviceInfoD2 = kyh.d(BaseApplication.getContext()).d(num2.intValue());
            if (hiDeviceInfoD == null || hiDeviceInfoD2 == null) {
                LogUtil.j("HiH_HiCompareUtil", "compare error input ! lhs is ", num, " rhs is ", num2);
                return 0;
            }
            int priority = hiDeviceInfoD2.getPriority() - hiDeviceInfoD.getPriority();
            return priority != 0 ? priority : hiDeviceInfoD2.getDeviceUniqueCode().compareTo(hiDeviceInfoD.getDeviceUniqueCode());
        }
    }

    public static class h implements Comparator<HiHealthData>, Serializable {
        private static final long serialVersionUID = 2979456610634806074L;

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compare(HiHealthData hiHealthData, HiHealthData hiHealthData2) {
            int type = hiHealthData2.getType() - hiHealthData.getType();
            return type != 0 ? type : hiHealthData.getMergedStatus() - hiHealthData2.getMergedStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(HiHealthData hiHealthData, HiHealthData hiHealthData2, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(hiHealthData.getMetaData());
        JSONObject jSONObject2 = new JSONObject(hiHealthData2.getMetaData());
        return CommonUtil.c(jSONObject2, str) - CommonUtil.c(jSONObject, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(HiHealthData hiHealthData, HiHealthData hiHealthData2, int i2, int i3, String str) {
        byte b2;
        int iCompare = Integer.compare(i2, i3);
        if (iCompare != 0) {
            return iCompare;
        }
        str.hashCode();
        switch (str) {
            case "MAX":
                b2 = 0;
                break;
            case "MIN":
                b2 = 1;
                break;
            case "NEW":
                b2 = 2;
                break;
            case "OLD":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return Double.compare(hiHealthData2.getValue(), hiHealthData.getValue());
        }
        if (b2 == 1) {
            return Double.compare(hiHealthData.getValue(), hiHealthData2.getValue());
        }
        if (b2 == 2) {
            return -1;
        }
        if (b2 == 3) {
            return 1;
        }
        LogUtil.j("HiH_HiCompareUtil", "This mergePolicy ", str, " is not supported!");
        return iCompare;
    }
}
