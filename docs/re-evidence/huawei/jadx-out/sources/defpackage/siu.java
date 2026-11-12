package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.huawei.health.health.utils.functionsetcard.manager.model.CardConfig;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class siu {
    public static void e(Context context, final int[] iArr, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            return;
        }
        if (context == null || iArr == null) {
            iBaseResponseCallback.a(7, null);
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setCount(1);
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(jCurrentTimeMillis);
        HiHealthManager.d(context).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: siu.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("FunctionSet_CardManagerHelper", "errorCode = ", Integer.valueOf(i), " input types:", Arrays.toString(iArr));
                ReleaseLogUtil.d("FunctionSet_TIME", "query all data times:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                List listD = siu.d(siu.d(obj, i));
                ReleaseLogUtil.d("FunctionSet_CardManagerHelper", "has data card type size:", Integer.valueOf(listD.size()));
                iBaseResponseCallback.a(i, listD);
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                ReleaseLogUtil.e("FunctionSet_CardManagerHelper", "onResultIntent");
                iBaseResponseCallback.a(7, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SparseArray<Object> d(Object obj, int i) {
        ReleaseLogUtil.d("FunctionSet_CardManagerHelper", "result = ", Integer.valueOf(i));
        if (i != 0 || !(obj instanceof SparseArray)) {
            ReleaseLogUtil.a("FunctionSet_CardManagerHelper", "checkResult result != SUCCESS && data not instanceof SparseArray");
            return null;
        }
        return (SparseArray) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<Integer> d(SparseArray sparseArray) {
        if (sparseArray == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    public static int[] a(Collection<Integer> collection) {
        int i = 0;
        if (njy.e(collection)) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static boolean e() {
        LoginInit loginInit = LoginInit.getInstance(BaseApplication.getContext());
        if (loginInit == null) {
            ReleaseLogUtil.e("FunctionSet_CardManagerHelper", "queryPhysiologicalCycleShow network error");
            return false;
        }
        String gender = loginInit.getGender();
        String birthDate = loginInit.getBirthDate();
        LogUtil.a("FunctionSet_CardManagerHelper", "gender: ", gender, ", birthDate: ", birthDate);
        if (gender == null || birthDate == null) {
            ReleaseLogUtil.e("FunctionSet_CardManagerHelper", "queryPhysiologicalCycleShow gender or birthDate is null");
            return false;
        }
        try {
            boolean zEquals = "1".equals(gender);
            int iD = (HiDateUtil.d(System.currentTimeMillis()) / 10000) - (Integer.parseInt(birthDate) / 10000);
            boolean z = iD <= 55 && iD >= 16;
            LogUtil.a("FunctionSet_CardManagerHelper", "gender: ", gender, ", age: ", Integer.valueOf(iD), ", isShow: ", Boolean.valueOf(zEquals && z));
            if (fua.s()) {
                return zEquals;
            }
            return zEquals && z;
        } catch (NumberFormatException unused) {
            ReleaseLogUtil.a("FunctionSet_CardManagerHelper", "queryPhysiologicalCycleShow NumberFormatException");
            return false;
        }
    }

    public static int d() {
        if (CommonUtil.ca()) {
            return 32768;
        }
        if (CommonUtil.ao()) {
            return 4;
        }
        return CommonUtil.ap() ? 2 : 1;
    }

    public static boolean e(String str, String str2) {
        String string = Integer.toString(1);
        String string2 = Integer.toString(2);
        return (str.equals(string) || str.equals(string2) || str2.equals(string) || str2.equals(string2)) ? false : true;
    }

    public static List<String> c(List<CardConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CardConfig cardConfig : list) {
            if (cardConfig != null) {
                arrayList.add(cardConfig.getCardId());
            }
        }
        return arrayList;
    }
}
