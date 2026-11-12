package com.huawei.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.account.aidl.AccountAidlInfo;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import defpackage.aww;
import defpackage.lsp;
import defpackage.lsr;
import defpackage.ltz;
import defpackage.lub;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AccountInteractors {
    private static final int ERROR_CODE = 907127009;
    private static final int QUALITY = 100;
    private static final String TAG = "AccountInteractors";
    private static final int WAIT_TIME = 3;

    private AccountInteractors() {
    }

    public static AccountAidlInfo isWearLogined(Context context) {
        final aww awwVarE = aww.e(context);
        final AccountAidlInfo[] accountAidlInfoArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        awwVarE.d(new IBaseResponseCallback() { // from class: com.huawei.common.util.AccountInteractors.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    LogUtil.a(AccountInteractors.TAG, "accountmigrate: isWearLogined bindRemoteService = true");
                    accountAidlInfoArr[0] = awwVarE.e();
                } else {
                    accountAidlInfoArr[0] = null;
                }
                try {
                    countDownLatch.countDown();
                } catch (UnsupportedOperationException unused) {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            LogUtil.e(TAG, "accountmigrate: 2.0isLogin InterruptedException e = ", e.getMessage());
        }
        AccountAidlInfo accountAidlInfo = accountAidlInfoArr[0];
        if (accountAidlInfo != null && TextUtils.isEmpty(accountAidlInfo.getServeToken())) {
            LogUtil.a(TAG, "accountmigrate: accountAidlInfo[0] but st is empty.");
            return null;
        }
        return accountAidlInfoArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00d4 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0151 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0117 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String saveImage(Context context, String str, Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        LogUtil.a(TAG, "saveImage");
        if (bitmap == null) {
            LogUtil.e(TAG, "bitmap is null");
            return "";
        }
        String filePath = getFilePath(context, str);
        File file = new File(filePath);
        if (file.exists() && !file.delete()) {
            LogUtil.e(TAG, "delete old file error");
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!file.createNewFile()) {
                    LogUtil.e(TAG, "saveImage createNewFile error");
                    return "";
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                    } catch (IOException unused) {
                        LogUtil.e(TAG, "saveImage finally flush IOException");
                    } finally {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                            LogUtil.e(TAG, "saveImage finally close IOException");
                        }
                    }
                } catch (FileNotFoundException unused3) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e(TAG, "saveImage FileNotFoundException");
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                        } catch (IOException unused4) {
                            LogUtil.e(TAG, "saveImage finally flush IOException");
                        } finally {
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                } catch (IOException unused5) {
                                    LogUtil.e(TAG, "saveImage finally close IOException");
                                }
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException unused6) {
                    fileOutputStream2 = fileOutputStream;
                    LogUtil.e(TAG, "saveImage IOException");
                    try {
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.flush();
                        }
                    } catch (IOException unused7) {
                        LogUtil.e(TAG, "saveImage finally flush IOException");
                    } finally {
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused8) {
                                LogUtil.e(TAG, "saveImage finally close IOException");
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        if (fileOutputStream != null) {
                            fileOutputStream.flush();
                        }
                    } catch (IOException unused9) {
                        LogUtil.e(TAG, "saveImage finally flush IOException");
                        throw th;
                    } finally {
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused10) {
                                LogUtil.e(TAG, "saveImage finally close IOException");
                            }
                        }
                    }
                    throw th;
                }
                return filePath;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused11) {
        } catch (IOException | IllegalArgumentException | IllegalStateException unused12) {
        }
    }

    private static String getFilePath(Context context, String str) {
        File file = new File(context.getFilesDir() + File.separator + "photos" + File.separator + "headimage");
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.e(TAG, "create file error");
        }
        try {
            return file.getCanonicalPath() + File.separator + lsp.b(context, str);
        } catch (IOException unused) {
            LogUtil.e(TAG, "IOException");
            return "";
        }
    }

    public static boolean isInstallHwIdApk(Context context) {
        boolean zCheckIsInstallHuaweiAccount = HuaweiLoginManager.checkIsInstallHuaweiAccount(context);
        LogUtil.a(TAG, "accountmigrate: isInstallHwIdApk = " + zCheckIsInstallHuaweiAccount);
        return zCheckIsInstallHuaweiAccount;
    }

    public static int checkCloudAndLocalDataMigrated(Context context) {
        LogUtil.a(TAG, "accountmigrate: checkCloudAndLocalDataMigrated ");
        ArrayList<ltz> arrayListA = lub.c().a(LoginInit.getInstance(context).getAccountInfo(1011));
        if (arrayListA == null) {
            return 0;
        }
        int size = arrayListA.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ltz ltzVar = arrayListA.get(i2);
            LogUtil.d(TAG, "accountmigrate: checkCloudAndLocalDataMigrated migrateTable" + i2 + " = " + ltzVar.toString());
            if (ltzVar.i() && ltzVar.j()) {
                i++;
            }
        }
        LogUtil.a(TAG, "accountmigrate: checkCloudAndLocalDataMigrated successNum = ", Integer.valueOf(i));
        return i;
    }

    public static void clearCloudAndLocalDataMigratedTag(Context context) {
        LogUtil.a(TAG, "accountmigrate: clearCloudAndLocalDataMigratedTag ");
        ArrayList<ltz> arrayListA = lub.c().a(LoginInit.getInstance(context).getAccountInfo(1011));
        if (arrayListA == null) {
            return;
        }
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            ltz ltzVar = arrayListA.get(i);
            if (ltzVar.i() && ltzVar.j()) {
                lub.c().e(ltzVar.a(), ltzVar.b());
                lub.c().b(ltzVar.a(), ltzVar.b());
            }
        }
    }

    public static void clearCloudPushRecevieTag(Context context) {
        LogUtil.a(TAG, "accountmigrate: clearCloudPushRecevieTag ");
        SharedPreferenceManager.e(context, Integer.toString(10015), "is_cloud_push_receiver", "is_cloud_push_receiver_false", new StorageParams(0));
    }

    public static boolean isReceivedCloudPush(Context context) {
        LogUtil.a(TAG, "accountmigrate: isReceivedCloudPush ");
        String strE = SharedPreferenceManager.e(context, Integer.toString(10015), "is_cloud_push_receiver");
        LogUtil.a(TAG, "accountmigrate: isReceivedCloudPush isRecevie = ", strE);
        return "is_cloud_push_receiver_true".equals(strE);
    }

    public static void saveMigrateInfoToDb(String str, String str2, String str3, boolean z) {
        LogUtil.a(TAG, "accountmigrate: saveMigrateInfoToDb");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.a(TAG, "null,return");
            return;
        }
        ltz ltzVar = new ltz();
        ltzVar.a(str3);
        ltzVar.e(str);
        ltzVar.b(str2);
        ltzVar.c(z);
        ltzVar.d(false);
        ltzVar.d(false);
        lub.c().e(ltzVar);
        lub.c().a(str3);
        LogUtil.d(TAG, "accountmigrate: saveMigrateInfoToDb migrateTable = ", ltzVar.toString());
    }

    public static void uploadMigrateerrorCode(long j) {
        LogUtil.a(TAG, "accountmigrate: uploadMigrateerrorCode");
        Bundle bundle = new Bundle();
        bundle.putLong("error_code", j);
        LogUtil.a(ERROR_CODE, TAG, bundle, false, "notice cloud migrate account data but return error message." + bundle);
    }

    public static long stringToLong(String str) throws NumberFormatException {
        LogUtil.a(TAG, "accountmigrate: stringToLong");
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            LogUtil.a(TAG, "NumberFormatException Error " + str);
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static void saveAccountInfo(Context context, HiAccountInfo hiAccountInfo) {
        if (context == null) {
            LogUtil.j(TAG, "context == null");
        } else {
            if (hiAccountInfo == null) {
                LogUtil.a(TAG, "saveAccountInfo delete result=", Integer.valueOf(SharedPreferenceUtil.getInstance(context).saveAccountInfo(null)));
                return;
            }
            String strD = lsr.d(hiAccountInfo, "1.0");
            LogUtil.a(TAG, "saveAccountInfo size=", Integer.valueOf(strD.length()), ", result=", Integer.valueOf(SharedPreferenceUtil.getInstance(context).saveAccountInfo(strD)), ", info=", Integer.valueOf(hiAccountInfo.getHuid() != null ? hiAccountInfo.getHuid().length() : 0), ", ver=", "1.0");
        }
    }

    public static HiAccountInfo restoreAccountInfo(Context context) {
        if (context == null) {
            LogUtil.j(TAG, "restoreAccountInfo, context == null");
            return null;
        }
        String strRestoreAccountInfo = SharedPreferenceUtil.getInstance(context).restoreAccountInfo();
        if (TextUtils.isEmpty(strRestoreAccountInfo)) {
            LogUtil.a(TAG, "restoreAccountInfo, return null");
            return null;
        }
        HiAccountInfo hiAccountInfo = (HiAccountInfo) lsr.b(strRestoreAccountInfo, HiAccountInfo.CREATOR, "1.0");
        LogUtil.a(TAG, "restoreAccountInfo size=", Integer.valueOf(strRestoreAccountInfo.length()), ", info=", Integer.valueOf((hiAccountInfo == null || hiAccountInfo.getHuid() == null) ? 0 : hiAccountInfo.getHuid().length()), ", ver=", "1.0");
        return hiAccountInfo;
    }
}
