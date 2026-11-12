package com.huawei.hianalytics.framework.data;

import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.b;
import com.huawei.hianalytics.framework.f;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes3.dex */
public class WorkKeyHandler {
    public static final WorkKeyHandler d = new WorkKeyHandler();
    public static IAesKeyGetter e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkKeyBean f11511a = new WorkKeyBean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11513c;

    public static class WorkKeyBean {
        public static final int SOURCE_QOES = 1;
        public static final int SOURCE_SDK = 0;
        String encrypted;
        String pubKeyVer;
        String workKey;
        long uploadTime = 0;
        long keyTtlTime = 0;
        int source = 0;

        public String getEncrypted() {
            return this.encrypted;
        }

        public long getKeyTtlTime() {
            return this.keyTtlTime;
        }

        public String getPubKeyVer() {
            return this.pubKeyVer;
        }

        public int getSource() {
            return this.source;
        }

        public long getUploadTime() {
            return this.uploadTime;
        }

        public String getWorkKey() {
            return this.workKey;
        }

        public void setEncrypted(String str) {
            this.encrypted = str;
        }

        public void setKeyTtlTime(long j) {
            this.keyTtlTime = j;
        }

        public void setPubKeyVer(String str) {
            this.pubKeyVer = str;
        }

        public void setSource(int i) {
            this.source = i;
        }

        public void setUploadTime(long j) {
            this.uploadTime = j;
        }

        public void setWorkKey(String str) {
            this.workKey = str;
        }
    }

    public static WorkKeyHandler getHandler() {
        return d;
    }

    public static void setAesKeyGetter(IAesKeyGetter iAesKeyGetter) {
        e = iAesKeyGetter;
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        String strRsaEncrypt = b.e.f11498a.rsaEncrypt(this.f11512b, this.f11513c, strGenerateSecureRandomStr);
        String str = this.f11513c;
        long j = f.f11517a;
        this.f11511a.setEncrypted(strRsaEncrypt);
        this.f11511a.setWorkKey(strGenerateSecureRandomStr);
        this.f11511a.setUploadTime(jCurrentTimeMillis);
        this.f11511a.setKeyTtlTime(j + jCurrentTimeMillis);
        this.f11511a.setPubKeyVer(str);
        this.f11511a.setSource(0);
        IAesKeyGetter iAesKeyGetter = e;
        if (iAesKeyGetter != null) {
            iAesKeyGetter.saveWorkKeyBeanToDisk(this.f11511a);
        }
    }

    public String getEncrypted() {
        return this.f11511a.encrypted;
    }

    public long getKeyTtl() {
        return this.f11511a.keyTtlTime;
    }

    public String getPubKeyVer() {
        return this.f11511a.pubKeyVer;
    }

    public long getUploadTime() {
        return this.f11511a.uploadTime;
    }

    public String getWorkKey() {
        return this.f11511a.workKey;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090 A[Catch: all -> 0x00b3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001f, B:11:0x0035, B:13:0x0039, B:15:0x0051, B:17:0x0057, B:19:0x005d, B:21:0x0065, B:25:0x0071, B:26:0x0090, B:27:0x0094, B:32:0x00a5, B:35:0x00aa), top: B:41:0x0001 }] */
    public void refreshKey(String str, String str2) {
        int source;
        long j;
        synchronized (this) {
            long uploadTime = getUploadTime();
            Pair<String, String> rsaPublicKeyFromNetWork = b.e.f11498a.getRsaPublicKeyFromNetWork(str, str2);
            String str3 = (String) rsaPublicKeyFromNetWork.first;
            this.f11512b = str3;
            this.f11513c = (String) rsaPublicKeyFromNetWork.second;
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(this.f11513c)) {
                HiLog.sw("WorkKeyHandler", "get rsa pubkey config error");
                return;
            }
            long j2 = 0;
            if (uploadTime == 0) {
                String str4 = "";
                String str5 = "";
                String str6 = "";
                IAesKeyGetter iAesKeyGetter = e;
                if (iAesKeyGetter != null) {
                    WorkKeyBean workKeyBeanFromDisk = iAesKeyGetter.getWorkKeyBeanFromDisk();
                    str4 = workKeyBeanFromDisk.workKey;
                    str5 = workKeyBeanFromDisk.encrypted;
                    str6 = workKeyBeanFromDisk.pubKeyVer;
                    long j3 = workKeyBeanFromDisk.uploadTime;
                    j = workKeyBeanFromDisk.keyTtlTime;
                    source = workKeyBeanFromDisk.getSource();
                    j2 = j3;
                } else {
                    source = 0;
                    j = 0;
                }
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || !TextUtils.equals(str6, "2.0")) {
                    a();
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (j2 >= jCurrentTimeMillis || jCurrentTimeMillis >= j) {
                        a();
                    } else {
                        this.f11511a.setEncrypted(str5);
                        this.f11511a.setWorkKey(str4);
                        this.f11511a.setUploadTime(j2);
                        this.f11511a.setKeyTtlTime(j);
                        this.f11511a.setPubKeyVer(str6);
                        this.f11511a.setSource(source);
                    }
                }
            } else {
                long keyTtl = getKeyTtl();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (uploadTime >= jCurrentTimeMillis2 || jCurrentTimeMillis2 >= keyTtl) {
                    a();
                }
            }
        }
    }
}
