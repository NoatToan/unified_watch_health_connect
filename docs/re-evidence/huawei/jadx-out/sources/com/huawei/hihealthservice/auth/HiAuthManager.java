package com.huawei.hihealthservice.auth;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiScopeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kxo;
import defpackage.kya;
import health.compact.a.HiCommonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HiAuthManager implements IAuth {
    private static final String LOG_TAG = "Debug_HiAuthManager";
    private kxo mRawQueryManager;

    private HiAuthManager() {
        this.mRawQueryManager = kxo.a();
    }

    static class Instance {
        private static final HiAuthManager INSTANCE = new HiAuthManager();

        private Instance() {
        }
    }

    public static HiAuthManager getInstance() {
        return Instance.INSTANCE;
    }

    @Override // com.huawei.hihealthservice.auth.IAuth
    public void checkInsertAuth(int i, int i2, List<HiHealthData> list) throws HiAuthException {
        boolean zD;
        List<String> listC = HiScopeUtil.c(list);
        LogUtil.d(LOG_TAG, "checkInsertAuth permissions are ", listC);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j(LOG_TAG, "checkInsertAuth permissions is null");
            return;
        }
        for (String str : listC) {
            if (kya.a().d(i, i2) != null) {
                zD = kya.a().a(i, i2, str);
                LogUtil.d(LOG_TAG, "checkInsertAuth permissions from cache, isExist = ", Boolean.valueOf(zD));
            } else {
                zD = this.mRawQueryManager.d(i, i2, 1, str);
                LogUtil.d(LOG_TAG, "checkInsertAuth permissions from database, isExist = ", Boolean.valueOf(zD));
            }
            if (!zD) {
                LogUtil.j(LOG_TAG, "checkInsertAuth permissions is not exist, permissions = ", listC);
                throw new HiAuthException("checkInsertAuth fail not exist permission : " + str);
            }
        }
    }

    @Override // com.huawei.hihealthservice.auth.IAuth
    public void checkReadAuth(int i, int i2, int[] iArr) throws HiAuthException {
        List<String> listC = HiScopeUtil.c(iArr);
        List<String> listB = HiScopeUtil.b(iArr);
        LogUtil.d(LOG_TAG, "checkReadAuth permissions are ", listC, " or ", listB);
        if (HiCommonUtil.b(listC) && HiCommonUtil.b(listB)) {
            LogUtil.j(LOG_TAG, "checkReadAuth permissions is null");
            return;
        }
        boolean zIsNotExist = isNotExist(i, i2, listC);
        boolean zIsNotExist2 = isNotExist(i, i2, listB);
        if (zIsNotExist && zIsNotExist2) {
            LogUtil.j(LOG_TAG, "checkReadAuth permissions is not exist, permissions = ", listC);
            throw new HiAuthException("checkReadAuth fail not read & write permission ");
        }
    }

    private boolean isNotExist(int i, int i2, List<String> list) throws HiAuthException {
        boolean zD;
        if (list == null) {
            LogUtil.j(LOG_TAG, "checkReadAuth permissions is null");
            return false;
        }
        for (String str : list) {
            if (kya.a().d(i, i2) != null) {
                zD = kya.a().a(i, i2, str);
                LogUtil.d(LOG_TAG, "checkReadAuth permissions from cache, isExist = ", Boolean.valueOf(zD));
            } else {
                zD = this.mRawQueryManager.d(i, i2, 1, str);
                LogUtil.d(LOG_TAG, "checkReadAuth permissions from database, isExist = ", Boolean.valueOf(zD));
            }
            if (!zD) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hihealthservice.auth.IAuth
    public void checkDeleteAuth(int i, int i2, int[] iArr) throws HiAuthException {
        boolean zD;
        List<String> listD = HiScopeUtil.d(iArr);
        LogUtil.d(LOG_TAG, "checkDeleteAuth permissions are ", listD);
        if (HiCommonUtil.b(listD)) {
            LogUtil.j(LOG_TAG, "checkDeleteAuth permissions is null");
            return;
        }
        for (String str : listD) {
            if (kya.a().d(i, i2) != null) {
                zD = kya.a().a(i, i2, str);
                LogUtil.d(LOG_TAG, "checkDeleteAuth permissions from cache, isExist = ", Boolean.valueOf(zD));
            } else {
                zD = this.mRawQueryManager.d(i, i2, 1, str);
                LogUtil.d(LOG_TAG, "checkDeleteAuth permissions from database, isExist = ", Boolean.valueOf(zD));
            }
            if (!zD) {
                LogUtil.j(LOG_TAG, "checkDeleteAuth permissions is not exist, permissions = ", listD);
                throw new HiAuthException("checkDeleteAuth fail not exist permission : " + str);
            }
        }
    }
}
