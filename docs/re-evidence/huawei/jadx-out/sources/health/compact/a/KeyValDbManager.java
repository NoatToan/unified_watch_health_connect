package health.compact.a;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KeyValDbManager extends HwBaseManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile KeyValDbManager f36590c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36591b;
    private List<String> d;

    private KeyValDbManager(Context context) {
        super(context);
        this.f36591b = "";
        this.d = new ArrayList();
        com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "Enter KeyValDbManager");
        e();
        this.d.add("key_wether_to_auth");
        this.d.add("user_id");
    }

    public static KeyValDbManager d(Context context) {
        if (f36590c == null) {
            synchronized (KeyValDbManager.class) {
                if (f36590c == null) {
                    if (context == null) {
                        f36590c = new KeyValDbManager(BaseApplication.getContext());
                    } else {
                        f36590c = new KeyValDbManager(context.getApplicationContext());
                    }
                }
            }
        }
        return f36590c;
    }

    private void e() {
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        this.f36591b = whiteBoxManagerB.a(1, 34) + whiteBoxManagerB.a(1, 1034) + whiteBoxManagerB.a(1, 2034);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046 A[PHI: r0 r3
      0x0046: PHI (r0v4 android.database.Cursor) = (r0v3 android.database.Cursor), (r0v6 android.database.Cursor) binds: [B:15:0x0044, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r3v3 java.lang.String) = (r3v7 java.lang.String), (r3v6 java.lang.String) binds: [B:15:0x0044, B:9:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    private String a(String str) throws Throwable {
        Cursor cursorQueryStorageData;
        String str2 = "key = '" + str + "'";
        com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getValue, whereSql = ", str2);
        ?? r3 = 0;
        string = null;
        string = null;
        string = null;
        String string = null;
        try {
            try {
                cursorQueryStorageData = queryStorageData("keyvaldb", 2, str2);
                if (cursorQueryStorageData != null) {
                    try {
                        if (cursorQueryStorageData.moveToFirst()) {
                            string = cursorQueryStorageData.getString(1);
                        }
                    } catch (SQLException unused) {
                        com.huawei.hwlogsmodel.LogUtil.e("KeyValDbManager", "getValue, queryStorage error");
                        if (cursorQueryStorageData != null) {
                            cursorQueryStorageData.close();
                        }
                    }
                }
                if (cursorQueryStorageData != null) {
                    cursorQueryStorageData.close();
                }
            } catch (Throwable th) {
                th = th;
                r3 = str2;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLException unused2) {
            cursorQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getValue, key = ", str, ", value = ", string);
        return string;
    }

    public String c(String str) {
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "getValue, key is null");
            return null;
        }
        MMKV mmkvB = MmkvUtil.b("keyvaldb_unencrypt", null);
        String strDecodeString = mmkvB.decodeString(str);
        if (strDecodeString == null) {
            strDecodeString = a(str);
            if (strDecodeString == null) {
                mmkvB.encode(str, "empty_value");
            } else {
                mmkvB.encode(str, strDecodeString);
            }
        }
        String str2 = "empty_value".equals(strDecodeString) ? null : strDecodeString;
        if (this.d.contains(str)) {
            com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getValue, key = ", str, ", value = ", str2);
        }
        return str2;
    }

    @Deprecated
    public void c(String str, String str2, StorageDataCallback storageDataCallback) {
        StorageResult storageResult = new StorageResult();
        if (str == null || str2 == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setValue, key or value is null so return PARAMS_ERROR.");
            storageResult.e(AwarenessConstants.ERROR_UNKNOWN_CODE);
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "Enter setValue() with key=", str, ", value=", str2);
            boolean zEncode = MmkvUtil.b("keyvaldb_unencrypt", null).encode(str, str2);
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", zEncode ? "setValue success." : "setValue failed key =", str);
            storageResult.e(zEncode ? 0 : -1);
        }
        if (this.d.contains(str)) {
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "setValue, key = ", str, ", value = ", str2);
        }
        if (storageDataCallback != null) {
            storageDataCallback.onProcessed(storageResult);
        }
    }

    public void b(String str, String str2) {
        if (str == null || str2 == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setValue, key or value is null so return PARAMS_ERROR.");
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "Enter setValue() with key=", str, ", value=", str2);
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", MmkvUtil.b("keyvaldb_unencrypt", null).encode(str, str2) ? "setValue success." : "setValue failed, key = ", str);
        }
    }

    @Deprecated
    public void a(String str, String str2, StorageParams storageParams, StorageDataCallback storageDataCallback) {
        StorageResult storageResult = new StorageResult();
        if (str == null || str2 == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setEncryptValue, key or value is null so return PARAMS_ERROR.");
            storageResult.e(AwarenessConstants.ERROR_UNKNOWN_CODE);
        } else if (storageParams == null || storageParams.a() == 0) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setEncryptValue, storageParams is not encryptDataType.");
            storageResult.e(AwarenessConstants.ERROR_UNKNOWN_CODE);
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "Enter setEncryptValue() with key=", str, ", value=", str2, ", dataKey=", Integer.valueOf(storageParams.a()));
            boolean zEncode = MmkvUtil.b("keyvaldb_encrypt", this.f36591b).encode(str, str2);
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", zEncode ? "setEncryptValue success." : "setValue failed key =", str);
            storageResult.e(zEncode ? 0 : -1);
        }
        if (storageDataCallback != null) {
            storageDataCallback.onProcessed(storageResult);
        }
    }

    public void b(String str, String str2, StorageParams storageParams) {
        if (str == null || str2 == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setEncryptValue, key or value is null so return PARAMS_ERROR.");
        } else if (storageParams == null || storageParams.a() == 0) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "setEncryptValue, storageParams is not encryptDataType.");
        } else {
            com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "Enter setEncryptValue() with key=", str, ", value=", str2, ", dataKey=", Integer.valueOf(storageParams.a()));
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", MmkvUtil.b("keyvaldb_encrypt", this.f36591b).encode(str, str2) ? "setEncryptValue success." : "setValue failed key =", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private String d(String str, StorageParams storageParams) throws Throwable {
        Cursor cursorQueryStorageData;
        String string;
        String str2 = "key = '" + str + "'";
        com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getEncryptValue, whereSql = ", str2);
        ?? r4 = 0;
        try {
            try {
                cursorQueryStorageData = queryStorageData("keyvaldb", 2, str2);
                if (cursorQueryStorageData != null) {
                    try {
                        if (cursorQueryStorageData.moveToFirst()) {
                            string = cursorQueryStorageData.getString(1);
                        } else {
                            string = null;
                        }
                    } catch (SQLException unused) {
                        com.huawei.hwlogsmodel.LogUtil.e("KeyValDbManager", "getEncryptValue, queryStorage error");
                        if (cursorQueryStorageData != null) {
                            cursorQueryStorageData.close();
                        }
                        string = null;
                    }
                } else {
                    string = null;
                }
                if (cursorQueryStorageData != null) {
                    cursorQueryStorageData.close();
                }
            } catch (Throwable th) {
                th = th;
                r4 = str2;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLException unused2) {
            cursorQueryStorageData = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getEncryptValue, key = ", str, ", value = ", string);
        if (string == null) {
            return string;
        }
        if (storageParams != null) {
            try {
                if (storageParams.a() != 0) {
                    return HwEncryptUtil.b(BaseApplication.getContext()).c(storageParams.a(), string);
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused3) {
                com.huawei.hwlogsmodel.LogUtil.e("KeyValDbManager", "getEncryptValue decryptData Exception");
                return null;
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "getEncryptValue, storageParams is not encryptDataType.");
        return null;
    }

    public String b(String str, StorageParams storageParams) throws Throwable {
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.j("KeyValDbManager", "getEncryptValue, key is null");
            return null;
        }
        if (storageParams == null || storageParams.a() == 0) {
            com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "getEncryptValue, storageParams is not encryptDataType.");
            return null;
        }
        MMKV mmkvB = MmkvUtil.b("keyvaldb_encrypt", this.f36591b);
        String strDecodeString = mmkvB.decodeString(str);
        if (strDecodeString == null && !"server_token".equals(str)) {
            strDecodeString = d(str, storageParams);
            if (strDecodeString == null) {
                mmkvB.encode(str, "empty_value");
            } else {
                mmkvB.encode(str, strDecodeString);
            }
        }
        String str2 = "empty_value".equals(strDecodeString) ? null : strDecodeString;
        com.huawei.hwlogsmodel.LogUtil.d("KeyValDbManager", "getEncryptValue, key = ", str, ", value = ", str2);
        return str2;
    }

    public int d(String str) {
        MMKV mmkvB = MmkvUtil.b("keyvaldb_encrypt", this.f36591b);
        if (mmkvB.contains(str)) {
            mmkvB.encode(str, "empty_value");
        } else {
            MMKV mmkvB2 = MmkvUtil.b("keyvaldb_unencrypt", null);
            if (mmkvB2.contains(str)) {
                mmkvB2.encode(str, "empty_value");
            } else {
                com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "deleteKey, key is not in mmkv.");
            }
        }
        com.huawei.hwlogsmodel.LogUtil.a("KeyValDbManager", "deleteKey, key:", str);
        return 0;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 20007;
    }
}
