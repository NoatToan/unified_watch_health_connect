package defpackage;

import android.util.SparseArray;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char f38468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38470c;
    private int d;
    private char e;
    private boolean f;
    private int g;
    private int h = -1;
    private boolean i;
    private int j;
    private char k;
    private int l;
    private int m;
    private char n;
    private float o;
    private UserInfomation p;

    public jef(final boolean z) {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new BaseResponseCallback() { // from class: jej
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f38487a.a(z, i, (UserInfomation) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, int i, UserInfomation userInfomation) {
        this.p = userInfomation;
        c(z);
    }

    private void c(boolean z) {
        this.d = o();
        UserInfomation userInfomation = this.p;
        if (userInfomation != null) {
            this.g = userInfomation.getGenderOrDefaultValue();
            this.f38469b = this.p.getAgeOrDefaultValue();
        }
        this.i = false;
        if (z) {
            this.f38470c = 0;
            this.m = 0;
            this.j = 0;
            this.f = false;
            this.e = (char) 0;
            this.l = 0;
        } else {
            this.n = (char) 0;
            this.k = (char) 0;
        }
        this.f38468a = 'A';
    }

    public int d(int i) {
        if (i == 0) {
            return ((Integer) lst.d(Integer.valueOf(this.j))).intValue();
        }
        if (i == 5) {
            return ((Integer) lst.d(Integer.valueOf(this.m))).intValue();
        }
        LogUtil.j("Track_SmartCoachBeforeSportConfig", "getLast5DaysAverageRestHeartRate no match dayCount.");
        return this.h;
    }

    public void c(int i, int i2) {
        if (i == 0) {
            this.j = ((Integer) lst.d(Integer.valueOf(i2))).intValue();
        } else if (i == 5) {
            this.m = ((Integer) lst.d(Integer.valueOf(i2))).intValue();
        } else {
            LogUtil.j("Track_SmartCoachBeforeSportConfig", "setLast5DaysAverageRestHeartRate no match dayCount.");
        }
    }

    public boolean b(int i) {
        if (i == 7) {
            return ((Boolean) lst.d(Boolean.valueOf(this.i))).booleanValue();
        }
        return false;
    }

    public void b(int i, boolean z) {
        if (i == 7) {
            this.i = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
        }
    }

    public char a() {
        return ((Character) lst.d(Character.valueOf(this.e))).charValue();
    }

    public void b(char c2) {
        this.e = ((Character) lst.d(Character.valueOf(c2))).charValue();
    }

    public char d() {
        return ((Character) lst.d(Character.valueOf(this.f38468a))).charValue();
    }

    public void c(char c2) {
        this.f38468a = ((Character) lst.d(Character.valueOf(c2))).charValue();
    }

    public char f() {
        return ((Character) lst.d(Character.valueOf(this.k))).charValue();
    }

    public void e(char c2) {
        this.k = ((Character) lst.d(Character.valueOf(c2))).charValue();
    }

    public char i() {
        return ((Character) lst.d(Character.valueOf(this.n))).charValue();
    }

    public void d(char c2) {
        this.n = ((Character) lst.d(Character.valueOf(c2))).charValue();
    }

    public int c() {
        return ((Integer) lst.d(Integer.valueOf(this.d))).intValue();
    }

    public String k() {
        return this.g == 0 ? "male" : "female";
    }

    public int b() {
        return ((Integer) lst.d(Integer.valueOf(this.g))).intValue();
    }

    public int j() {
        return ((Integer) lst.d(Integer.valueOf(this.f38469b))).intValue();
    }

    public boolean l() {
        return ((Boolean) lst.d(Boolean.valueOf(this.f))).booleanValue();
    }

    public void a(boolean z) {
        this.f = ((Boolean) lst.d(Boolean.valueOf(z))).booleanValue();
    }

    public int g() {
        return ((Integer) lst.d(Integer.valueOf(this.l))).intValue();
    }

    public void c(int i) {
        this.l = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public void e(int i) {
        this.f38470c = ((Integer) lst.d(Integer.valueOf(i))).intValue();
    }

    public float h() {
        return ((Float) lst.d(Float.valueOf(this.o))).floatValue();
    }

    public void c(float f) {
        this.o = ((Float) lst.d(Float.valueOf(f))).floatValue();
    }

    private int o() {
        UserInfomation userInfomation = this.p;
        if (userInfomation != null) {
            int height = userInfomation.getHeight();
            double weight = this.p.getWeight();
            if (height != 0) {
                return (int) ((weight * 10000.0d) / ((double) (height * height)));
            }
            return 0;
        }
        LogUtil.j("Track_SmartCoachBeforeSportConfig", "getUserBmiValue userInfo is null.");
        return 0;
    }

    public void b(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        e(lsl.c(jCurrentTimeMillis, 1 - i), jCurrentTimeMillis, i2, iBaseResponseCallback);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    public static void e(long j, long j2, int i, final IBaseResponseCallback iBaseResponseCallback) {
        final int[] iArr;
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        int iA = DateFormatUtil.a(j);
        int iA2 = DateFormatUtil.a(j2);
        hiDataReadOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        if (i == 262) {
            iArr = new int[]{30021};
        } else if (i == 264) {
            iArr = new int[]{30006};
        } else {
            switch (i) {
                case 257:
                    iArr = new int[]{30005};
                    break;
                case 258:
                    iArr = new int[]{30006};
                    break;
                case 259:
                    iArr = new int[]{30007};
                    break;
                default:
                    iArr = new int[]{30002};
                    break;
            }
        }
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: jef.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i2, Object obj, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i2, int i3) {
                if (obj == null) {
                    iBaseResponseCallback.a(i2, null);
                    LogUtil.j("Track_SmartCoachBeforeSportConfig", "requestTrackSimplifyData The return run data is null");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    iBaseResponseCallback.a(i2, null);
                    LogUtil.j("Track_SmartCoachBeforeSportConfig", "requestTrackSimplifyData The return run data is empty");
                } else {
                    jef.e(sparseArray.get(iArr[0]), i2, iBaseResponseCallback);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, int i, IBaseResponseCallback iBaseResponseCallback) {
        List list = njy.b(obj, HiHealthData.class) ? (List) obj : null;
        if (njy.e(list)) {
            LogUtil.j("Track_SmartCoachBeforeSportConfig", "requestTrackSimplifyData list is null or empty");
            iBaseResponseCallback.a(i, null);
        } else {
            iBaseResponseCallback.a(i, list);
            LogUtil.j("Track_SmartCoachBeforeSportConfig", "requestTrackSimplifyData list.size = ", Integer.valueOf(list.size()));
        }
    }

    public char c(int i, long j, int i2) {
        int i3 = i / 60;
        if (i3 <= 0) {
            LogUtil.j("Track_SmartCoachBeforeSportConfig", "getRecoverGearByTime recoverTime <= 0");
            return (char) 0;
        }
        int iCurrentTimeMillis = i3 - ((int) ((System.currentTimeMillis() - j) / 3600000));
        if (i2 == 1) {
            if (iCurrentTimeMillis <= 13) {
                return 'A';
            }
            if (iCurrentTimeMillis <= 30) {
                return 'B';
            }
            if (iCurrentTimeMillis <= 54) {
                return 'C';
            }
            if (iCurrentTimeMillis <= 96) {
                return 'D';
            }
            LogUtil.j("Track_SmartCoachBeforeSportConfig", "getRecoverGearByTime no match recoverTime");
            return (char) 0;
        }
        if (iCurrentTimeMillis <= 18) {
            return 'A';
        }
        if (iCurrentTimeMillis <= 35) {
            return 'B';
        }
        if (iCurrentTimeMillis <= 53) {
            return 'C';
        }
        if (iCurrentTimeMillis <= 96) {
            return 'D';
        }
        LogUtil.j("Track_SmartCoachBeforeSportConfig", "getRecoverGearByTime no match recoverTime");
        return (char) 0;
    }

    public static boolean e() {
        double dCurrentTimeMillis = System.currentTimeMillis() - qnh.e(System.currentTimeMillis());
        return dCurrentTimeMillis >= 1.8E7d && dCurrentTimeMillis <= 3.06E7d;
    }
}
