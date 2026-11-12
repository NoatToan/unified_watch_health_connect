package com.huawei.wisesecurity.ucs.credential.nativelib;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yra;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class UcsLib {
    private static final String LIB_NAME = "ucs-credential";
    private static final long NATIVE_VERIFY_SIGNATURE_FAIL = 60000;
    private static final String TAG = "UcsLib";
    private static volatile boolean flag = false;
    private static volatile boolean updateRootKeyFlag = false;
    private static final Charset UTF_8 = StandardCharsets.UTF_8;
    private static final Object CA_LOCK = new Object();

    public static class OutputParam {
        public byte[] bytes = null;
        public byte[] secondBytes = null;
        public byte[] thirdBytes = null;
    }

    private static native long getSoVersion();

    private static native long nativeCheckPkgNameCertFP(Context context, byte[] bArr, byte[] bArr2, OutputParam outputParam);

    private static native long nativeDecryptKek(byte[] bArr, int i, OutputParam outputParam);

    private static native long nativeDecryptKekWithEc(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, OutputParam outputParam);

    private static native long nativeGenReqJws(Context context, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, OutputParam outputParam);

    private static native long nativeGenerateEcKeyPair(Context context, OutputParam outputParam);

    private static native long nativeGetPkgNameCertFP(Context context, OutputParam outputParam);

    private static native long updateRootKey(byte[] bArr, int i, OutputParam outputParam);

    public static void ucsUpdateRootKey(byte[] bArr, int i) throws yqj {
        synchronized (CA_LOCK) {
            OutputParam outputParamNewOutputParam = newOutputParam();
            long jUpdateRootKey = updateRootKey(bArr, i, outputParamNewOutputParam);
            updateRootKeyFlag = jUpdateRootKey == 0;
            if (jUpdateRootKey != 0) {
                String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to updateRootKey");
                yqi.e(TAG, errorMessage, new Object[0]);
                throw new yqj(1009L, errorMessage);
            }
        }
    }

    public static long ucsGetSoVersion() {
        return getSoVersion();
    }

    public static OutputParam newOutputParam() {
        return new OutputParam();
    }

    public static String loadLibrary() {
        String string;
        synchronized (UcsLib.class) {
            string = "";
            if (!flag) {
                try {
                    System.loadLibrary(LIB_NAME);
                    yqi.a(TAG, "load lib {0} success", LIB_NAME);
                    flag = true;
                } catch (Throwable th) {
                    StringBuilder sbB = yql.b("load lib ucs-credential error : ");
                    sbB.append(th.getMessage());
                    string = sbB.toString();
                    yqi.e(TAG, string, new Object[0]);
                }
            }
        }
        return string;
    }

    public static boolean isRootKeyUpdated() {
        return updateRootKeyFlag;
    }

    public static List<String> getPkgNameCertFP(Context context) throws yqj {
        ArrayList arrayList = new ArrayList();
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeGetPkgNameCertFP = nativeGetPkgNameCertFP(context, outputParamNewOutputParam);
        if (jNativeGetPkgNameCertFP != 0) {
            String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to getPkgNameCertFP");
            throw yra.e(TAG, errorMessage, new Object[0], jNativeGetPkgNameCertFP, errorMessage);
        }
        arrayList.add(new String(outputParamNewOutputParam.bytes, StandardCharsets.UTF_8));
        arrayList.add(new String(outputParamNewOutputParam.secondBytes, StandardCharsets.UTF_8));
        return arrayList;
    }

    private static String getErrorMessage(OutputParam outputParam, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        byte[] bArr = outputParam.thirdBytes;
        sb.append(bArr != null ? new String(bArr, StandardCharsets.UTF_8) : "errorLog is null.");
        return sb.toString();
    }

    public static EcKeyPair generateEcKeyPair(Context context) throws yqj {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeGenerateEcKeyPair = nativeGenerateEcKeyPair(context, outputParamNewOutputParam);
        if (jNativeGenerateEcKeyPair == 0) {
            return EcKeyPair.newBuilder().publicKey(outputParamNewOutputParam.bytes).privateKey(outputParamNewOutputParam.secondBytes).build();
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to nativeGenerateEcKeyPair");
        throw yra.e(TAG, errorMessage, new Object[0], jNativeGenerateEcKeyPair, errorMessage);
    }

    public static byte[] genReqJws(Context context, String str, String str2, int i, int i2) throws yqj {
        String str3 = str == null ? "" : str;
        if (context == null) {
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "context cannot empty..");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, "packageName cannot empty..");
        }
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeGenReqJws = nativeGenReqJws(context, str3.getBytes(StandardCharsets.UTF_8), str2.getBytes(StandardCharsets.UTF_8), i, String.valueOf(i2).getBytes(StandardCharsets.UTF_8), outputParamNewOutputParam);
        if (jNativeGenReqJws == 0) {
            return outputParamNewOutputParam.bytes;
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to genReqJws");
        throw yra.e(TAG, errorMessage, new Object[0], jNativeGenReqJws, errorMessage);
    }

    public static byte[] decryptKekWithEc(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws yqj {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeDecryptKekWithEc = nativeDecryptKekWithEc(bArr, i, bArr2, bArr3, bArr4, outputParamNewOutputParam);
        if (jNativeDecryptKekWithEc == 0) {
            return outputParamNewOutputParam.bytes;
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to decryptKekWithEc");
        throw yra.e(TAG, errorMessage, new Object[0], jNativeDecryptKekWithEc, errorMessage);
    }

    public static byte[] decryptKek(byte[] bArr, int i) throws yqj {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeDecryptKek = nativeDecryptKek(bArr, i, outputParamNewOutputParam);
        if (jNativeDecryptKek == 0) {
            return outputParamNewOutputParam.bytes;
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to decryptKek");
        throw yra.e(TAG, errorMessage, new Object[0], jNativeDecryptKek, errorMessage);
    }

    public static boolean checkPkgNameCertFP(Context context, String str, String str2, StringBuilder sb) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "appPkgName is null.";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                OutputParam outputParamNewOutputParam = newOutputParam();
                long jNativeCheckPkgNameCertFP = nativeCheckPkgNameCertFP(context, str.getBytes(StandardCharsets.UTF_8), str2.getBytes(StandardCharsets.UTF_8), outputParamNewOutputParam);
                if (jNativeCheckPkgNameCertFP != 0) {
                    sb.append(getErrorMessage(outputParamNewOutputParam, ""));
                }
                return jNativeCheckPkgNameCertFP == 0;
            }
            str3 = "appCertFP is null.";
        }
        sb.append(str3);
        return false;
    }

    public static void checkNativeLibrary() throws yqj {
        if (flag) {
            return;
        }
        String strLoadLibrary = loadLibrary();
        if (flag) {
            return;
        }
        throw new yqj(1004L, "UCS load library error : " + strLoadLibrary);
    }
}
