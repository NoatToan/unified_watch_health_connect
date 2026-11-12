package com.ximalaya.ting.android.player;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bodyfat.slimming.constants.LoseWeightPropertyKey;
import com.ximalaya.ting.android.player.model.HttpConfig;
import com.ximalaya.ting.android.player.xdcs.IStatToServer;
import com.ximalaya.ting.android.player.xdcs.IStatToServerFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class PlayerUtil {
    public static final String TAIHE_TAG = "#ximalaya-taihe";
    private static String cpuInfo = "";

    public static boolean checkSdcard() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.getExternalStorageDirectory().canWrite();
    }

    public static void cleanCacheByMD5SoundPlay(String str) {
        File file = new File(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY);
        if (!file.isDirectory() || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = str + ".chunk";
        new File(file, str2).delete();
        new File(file, str + ".index").delete();
    }

    public static void cleanUpCacheSound(String str) {
        String str2;
        File file = new File(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY);
        if (file.isDirectory()) {
            String str3 = null;
            if (TextUtils.isEmpty(str)) {
                str2 = null;
            } else {
                String fileNameMd5 = MD5.getFileNameMd5(str);
                str3 = fileNameMd5 + ".chunk";
                str2 = fileNameMd5 + ".index";
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && ((str3 == null || !str3.equalsIgnoreCase(file2.getName())) && ((str2 == null || !str2.equalsIgnoreCase(file2.getName())) && (str2 == null || !str2.endsWith(XMediaPlayerConstants.FILE_PLAY_CACHE_INFO))))) {
                        file2.delete();
                    }
                }
            }
        }
        PlayCacheByLRU.getInstance().removeAllExcludeCurPlay(str);
    }

    private static HttpConfig createPlayerConfig(Map<String, String> map) {
        HttpConfig httpConfig = new HttpConfig();
        httpConfig.connectionTimeOut = 20000;
        httpConfig.readTimeOut = 20000;
        httpConfig.useCache = true;
        HashMap map2 = new HashMap();
        httpConfig.property = map2;
        String str = StaticConfig.mUseragent;
        if (str != null) {
            map2.put("User-Agent", str);
        }
        Map<String, String> map3 = StaticConfig.mHeads;
        if (map3 != null) {
            httpConfig.property.putAll(map3);
        }
        if (map != null) {
            httpConfig.property.putAll(map);
        }
        return httpConfig;
    }

    public static boolean existSDCard() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static File fileIsExistCreate(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static String formatDuring(long j) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        String str;
        StringBuilder sb4;
        StringBuilder sb5;
        StringBuilder sb6;
        if (j < TimeUtils.TIME_1_HOURS) {
            if (j < 60) {
                if (j < 10) {
                    return "00:0" + ((int) j);
                }
                return "00:" + ((int) j);
            }
            int i = (int) (j / 60);
            int i2 = (int) (j % 60);
            StringBuilder sb7 = new StringBuilder();
            if (i < 10) {
                sb = new StringBuilder();
                sb.append("0");
            } else {
                sb = new StringBuilder();
                sb.append("");
            }
            sb.append(i);
            sb7.append(sb.toString());
            sb7.append(":");
            if (i2 < 10) {
                sb2 = new StringBuilder();
                sb2.append("0");
            } else {
                sb2 = new StringBuilder();
                sb2.append("");
            }
            sb2.append(i2);
            sb7.append(sb2.toString());
            return sb7.toString();
        }
        int i3 = (int) (j / TimeUtils.TIME_1_HOURS);
        int i4 = (int) (j % TimeUtils.TIME_1_HOURS);
        if (i4 < 60) {
            StringBuilder sb8 = new StringBuilder();
            if (i3 < 10) {
                sb3 = new StringBuilder();
                sb3.append("0");
            } else {
                sb3 = new StringBuilder();
                sb3.append("");
            }
            sb3.append(i3);
            sb8.append(sb3.toString());
            sb8.append(":");
            if (i4 < 10) {
                str = "00:0" + i4;
            } else {
                str = "00:" + i4;
            }
            sb8.append(str);
            return sb8.toString();
        }
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        StringBuilder sb9 = new StringBuilder();
        if (i3 < 10) {
            sb4 = new StringBuilder();
            sb4.append("0");
        } else {
            sb4 = new StringBuilder();
            sb4.append("");
        }
        sb4.append(i3);
        sb9.append(sb4.toString());
        sb9.append(":");
        if (i5 < 10) {
            sb5 = new StringBuilder();
            sb5.append("0");
        } else {
            sb5 = new StringBuilder();
            sb5.append("");
        }
        sb5.append(i5);
        sb9.append(sb5.toString());
        sb9.append(":");
        if (i6 < 10) {
            sb6 = new StringBuilder();
            sb6.append("0");
        } else {
            sb6 = new StringBuilder();
            sb6.append("");
        }
        sb6.append(i6);
        sb9.append(sb6.toString());
        return sb9.toString();
    }

    private static String getCPUInfos() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:102:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f0 A[Catch: Exception -> 0x025e, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x025e, blocks: (B:116:0x01da, B:120:0x01f0), top: B:180:0x01da }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0218  */
    /* JADX WARN: Code duplicated, block: B:125:0x021c A[Catch: Exception -> 0x025a, TRY_LEAVE, TryCatch #11 {Exception -> 0x025a, blocks: (B:122:0x01f6, B:125:0x021c), top: B:186:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0262  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:168:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac A[Catch: Exception -> 0x00a1, TRY_LEAVE, TryCatch #16 {Exception -> 0x00a1, blocks: (B:42:0x009b, B:50:0x00b3, B:55:0x00bd, B:47:0x00ac), top: B:195:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3 A[Catch: Exception -> 0x00a1, TRY_ENTER, TryCatch #16 {Exception -> 0x00a1, blocks: (B:42:0x009b, B:50:0x00b3, B:55:0x00bd, B:47:0x00ac), top: B:195:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ee A[Catch: Exception -> 0x0277, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0277, blocks: (B:63:0x00db, B:70:0x00ee), top: B:172:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Instruction removed from duplicated block: B:125:0x021c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02b9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02d6, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v12 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v14 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7, types: [long] */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [long] */
    /* JADX WARN: Type inference failed for: r9v5, types: [long] */
    public static HttpURLConnection getConnectionUseDnsCache(String[] strArr, String str, int i, boolean z, String str2) {
        boolean z2;
        ?? r7;
        String str3;
        ?? r23;
        ?? r14;
        ?? r12;
        char c;
        ?? r19;
        ?? r110;
        ?? r111;
        ?? r112;
        HttpConfig httpConfig;
        boolean z3;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        int responseCode;
        ?? r24;
        ?? r113;
        IDomainServerIpCallback iDomainServerIpCallback = StaticConfig.mIDomainServerIpCallback;
        String[][] staticDomainServerIp = iDomainServerIpCallback != null ? iDomainServerIpCallback.getStaticDomainServerIp(strArr[0]) : null;
        char c2 = 1;
        if (staticDomainServerIp == null || staticDomainServerIp.length == 0) {
            staticDomainServerIp = new String[][]{new String[]{strArr[0], null}};
            z2 = true;
        } else {
            z2 = false;
        }
        IStatToServerFactory iStatToServerFactory = StaticConfig.sIStatToServerFactory;
        IStatToServer statToServer = iStatToServerFactory != null ? iStatToServerFactory.getStatToServer() : null;
        Logger.log("UnicomDigestAuthenticator 000 == 开始获取httpconnect");
        str = "";
        ?? r13 = 0;
        String str4 = "";
        int i2 = 0;
        ?? r15 = 0;
        ?? httpURLConnection = 0;
        while (true) {
            if (i2 >= staticDomainServerIp.length) {
                r7 = httpURLConnection;
                break;
            }
            releaseHttpUrlConnection(httpURLConnection);
            try {
                HashMap map = new HashMap();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        map.put("RANGE", str);
                        if (staticDomainServerIp[i2][c2] != null) {
                            try {
                                r19 = httpURLConnection;
                                try {
                                    map.put("Host", staticDomainServerIp[i2][1]);
                                    str4 = staticDomainServerIp[i2][1];
                                    map.put("httpdnsType", "ip");
                                    r112 = r19;
                                    str3 = str4;
                                    if (i == 0) {
                                        try {
                                            map.put("Accept-Encoding", LoseWeightPropertyKey.IDENTITY);
                                        } catch (Exception e) {
                                            e = e;
                                            z2 = z2;
                                            r13 = r13;
                                            r15 = r15 == true ? 1 : 0;
                                            str = str;
                                            r111 = r112;
                                            httpURLConnection = r111;
                                            e.printStackTrace();
                                            if (iDomainServerIpCallback != null) {
                                                c = 0;
                                                iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                            } else {
                                                c = 0;
                                            }
                                            if (z2) {
                                                if (statToServer != null) {
                                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                                }
                                                r14 = r15;
                                                str4 = str3;
                                                r12 = r13;
                                                i2++;
                                                str = str;
                                                z2 = z2;
                                                c2 = 1;
                                                httpURLConnection = httpURLConnection;
                                                r13 = r12;
                                                r15 = r14;
                                            } else if (statToServer != null) {
                                                statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                            }
                                            r14 = r15;
                                            str4 = str3;
                                            r12 = r13;
                                            i2++;
                                            str = str;
                                            z2 = z2;
                                            c2 = 1;
                                            httpURLConnection = httpURLConnection;
                                            r13 = r12;
                                            r15 = r14;
                                        }
                                    } else if (i == 1) {
                                        map.put("Accept-Encoding", str);
                                    }
                                    try {
                                        httpConfig = StaticConfig.mHttpConfig;
                                        if (httpConfig == null && ((httpConfig.proxyType == 1 && 3 == i) || staticDomainServerIp[i2][0].endsWith(TAIHE_TAG))) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        z2 = z2;
                                        try {
                                            httpURLConnection = getHttpURLConnection(staticDomainServerIp[i2][0], z3, str2, map);
                                            try {
                                                httpURLConnection.setInstanceFollowRedirects(true);
                                                jCurrentTimeMillis = System.currentTimeMillis();
                                                if (i == 1) {
                                                    try {
                                                        httpURLConnection.connect();
                                                        jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        r13 = (r15 == true ? 1 : 0) + 1;
                                                        try {
                                                            responseCode = httpURLConnection.getResponseCode();
                                                            r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                                                            Logger.log(r15);
                                                            try {
                                                                if (i == 0) {
                                                                    r15 = 206;
                                                                    if (responseCode == 206) {
                                                                        if (statToServer != null) {
                                                                            try {
                                                                                statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                                                            } catch (Exception e2) {
                                                                                e = e2;
                                                                                r23 = jCurrentTimeMillis2;
                                                                                str = str;
                                                                                r15 = r13;
                                                                                r13 = r23;
                                                                                e.printStackTrace();
                                                                                if (iDomainServerIpCallback != null) {
                                                                                    c = 0;
                                                                                    iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                                                } else {
                                                                                    c = 0;
                                                                                }
                                                                                if (z2) {
                                                                                    if (statToServer != null) {
                                                                                        statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                                                                    }
                                                                                    r14 = r15;
                                                                                    str4 = str3;
                                                                                    r12 = r13;
                                                                                    i2++;
                                                                                    str = str;
                                                                                    z2 = z2;
                                                                                    c2 = 1;
                                                                                    httpURLConnection = httpURLConnection;
                                                                                    r13 = r12;
                                                                                    r15 = r14;
                                                                                } else if (statToServer != null) {
                                                                                    statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                                                                }
                                                                                r14 = r15;
                                                                                str4 = str3;
                                                                                r12 = r13;
                                                                                i2++;
                                                                                str = str;
                                                                                z2 = z2;
                                                                                c2 = 1;
                                                                                httpURLConnection = httpURLConnection;
                                                                                r13 = r12;
                                                                                r15 = r14;
                                                                            }
                                                                        }
                                                                        return httpURLConnection;
                                                                    }
                                                                }
                                                                r23 = jCurrentTimeMillis2;
                                                                str = str;
                                                                try {
                                                                    if (i == 0 && responseCode >= 200 && responseCode < 400) {
                                                                        if (statToServer != null) {
                                                                            String str5 = staticDomainServerIp[i2][0];
                                                                            String str6 = r13 + str;
                                                                            String str7 = StaticConfig.mUseragent;
                                                                            ?? sb = new StringBuilder();
                                                                            sb.append(r23);
                                                                            sb.append(str);
                                                                            statToServer.addEndHttpDnsRequest(str5, "success", str6, str3, str7, sb.toString(), "");
                                                                        }
                                                                        return httpURLConnection;
                                                                    }
                                                                    r15 = r13;
                                                                    r13 = r23;
                                                                    if (iDomainServerIpCallback == null) {
                                                                        r23 = httpURLConnection;
                                                                    } else {
                                                                        if (responseCode == 403 || z) {
                                                                            try {
                                                                                iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                                                if (!z2) {
                                                                                    r24 = httpURLConnection;
                                                                                    if (statToServer != null) {
                                                                                        r23 = r24;
                                                                                        statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                                                        r23 = r24;
                                                                                    }
                                                                                } else if (statToServer != null) {
                                                                                    r23 = httpURLConnection;
                                                                                    try {
                                                                                        statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                                                        r23 = r23;
                                                                                    } catch (Exception e3) {
                                                                                        e = e3;
                                                                                        httpURLConnection = r23;
                                                                                        e.printStackTrace();
                                                                                        if (iDomainServerIpCallback != null) {
                                                                                            c = 0;
                                                                                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                                                        } else {
                                                                                            c = 0;
                                                                                        }
                                                                                        if (z2) {
                                                                                            if (statToServer != null) {
                                                                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                                                                            }
                                                                                            r14 = r15;
                                                                                            str4 = str3;
                                                                                            r12 = r13;
                                                                                        } else if (statToServer != null) {
                                                                                            statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                                                                        }
                                                                                        r14 = r15;
                                                                                        str4 = str3;
                                                                                        r12 = r13;
                                                                                    }
                                                                                } else {
                                                                                    r23 = httpURLConnection;
                                                                                }
                                                                            } catch (Exception e4) {
                                                                                e = e4;
                                                                                r23 = httpURLConnection;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                String newDownloadUrlIfExpire = iDomainServerIpCallback.getNewDownloadUrlIfExpire(strArr[0]);
                                                                                if (TextUtils.isEmpty(newDownloadUrlIfExpire)) {
                                                                                    r7 = httpURLConnection;
                                                                                    break;
                                                                                }
                                                                                strArr[0] = newDownloadUrlIfExpire;
                                                                                return getConnectionUseDnsCache(strArr, str, i, true, "GET");
                                                                            } catch (Exception e5) {
                                                                                e = e5;
                                                                            }
                                                                        }
                                                                        e.printStackTrace();
                                                                        if (iDomainServerIpCallback != null) {
                                                                            c = 0;
                                                                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                                        } else {
                                                                            c = 0;
                                                                        }
                                                                        if (z2) {
                                                                            if (statToServer != null) {
                                                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                                                            }
                                                                            r14 = r15;
                                                                            str4 = str3;
                                                                            r12 = r13;
                                                                        } else if (statToServer != null) {
                                                                            statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                                                        }
                                                                        r14 = r15;
                                                                        str4 = str3;
                                                                        r12 = r13;
                                                                    }
                                                                    r23 = r24;
                                                                    r14 = r15 == true ? 1 : 0;
                                                                    str4 = str3;
                                                                    r12 = r13;
                                                                    httpURLConnection = r23;
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                            }
                                                        } catch (Exception e8) {
                                                            e = e8;
                                                            r23 = httpURLConnection;
                                                            r15 = r13;
                                                            r13 = jCurrentTimeMillis2;
                                                            str = str;
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        r13 = r13;
                                                        r15 = r15 == true ? 1 : 0;
                                                        r23 = r23;
                                                        str = str;
                                                        e.printStackTrace();
                                                        if (iDomainServerIpCallback != null) {
                                                            c = 0;
                                                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                        } else {
                                                            c = 0;
                                                        }
                                                        if (z2) {
                                                            if (statToServer != null) {
                                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                                            }
                                                            r14 = r15;
                                                            str4 = str3;
                                                            r12 = r13;
                                                            i2++;
                                                            str = str;
                                                            z2 = z2;
                                                            c2 = 1;
                                                            httpURLConnection = httpURLConnection;
                                                            r13 = r12;
                                                            r15 = r14;
                                                        } else if (statToServer != null) {
                                                            statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                                        }
                                                        r14 = r15;
                                                        str4 = str3;
                                                        r12 = r13;
                                                        i2++;
                                                        str = str;
                                                        z2 = z2;
                                                        c2 = 1;
                                                        httpURLConnection = httpURLConnection;
                                                        r13 = r12;
                                                        r15 = r14;
                                                    }
                                                } else {
                                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                                    r13 = (r15 == true ? 1 : 0) + 1;
                                                    responseCode = httpURLConnection.getResponseCode();
                                                    r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                                                    Logger.log(r15);
                                                    if (i == 0) {
                                                        r15 = 206;
                                                        if (responseCode == 206) {
                                                            if (statToServer != null) {
                                                                statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                                            }
                                                            return httpURLConnection;
                                                        }
                                                    }
                                                    r23 = jCurrentTimeMillis2;
                                                    str = str;
                                                    if (i == 0) {
                                                    }
                                                    r15 = r13;
                                                    r13 = r23;
                                                    if (iDomainServerIpCallback == null) {
                                                        r23 = httpURLConnection;
                                                    } else if (responseCode == 403) {
                                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                        if (!z2) {
                                                            r24 = httpURLConnection;
                                                            if (statToServer != null) {
                                                                r23 = r24;
                                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                                r23 = r24;
                                                            }
                                                        } else if (statToServer != null) {
                                                            r23 = httpURLConnection;
                                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                            r23 = r23;
                                                        } else {
                                                            r23 = httpURLConnection;
                                                        }
                                                    } else {
                                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                                        if (!z2) {
                                                            r24 = httpURLConnection;
                                                            if (statToServer != null) {
                                                                r23 = r24;
                                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                                r23 = r24;
                                                            }
                                                        } else if (statToServer != null) {
                                                            r23 = httpURLConnection;
                                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                            r23 = r23;
                                                        } else {
                                                            r23 = httpURLConnection;
                                                        }
                                                    }
                                                    r23 = r24;
                                                    r14 = r15 == true ? 1 : 0;
                                                    str4 = str3;
                                                    r12 = r13;
                                                    httpURLConnection = r23;
                                                }
                                            } catch (Exception e10) {
                                                e = e10;
                                                r23 = httpURLConnection;
                                                str = str;
                                                r13 = r13;
                                                r15 = r15 == true ? 1 : 0;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str = str;
                                            r13 = r13;
                                            r15 = r15 == true ? 1 : 0;
                                            r111 = r112;
                                            httpURLConnection = r111;
                                        }
                                    } catch (Exception e12) {
                                        e = e12;
                                        z2 = z2;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    r110 = r19;
                                    str3 = str4;
                                    r15 = r15;
                                    r13 = r13;
                                    r111 = r110;
                                    httpURLConnection = r111;
                                    e.printStackTrace();
                                    if (iDomainServerIpCallback != null) {
                                        c = 0;
                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                    } else {
                                        c = 0;
                                    }
                                    if (z2) {
                                        if (statToServer != null) {
                                            statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                        }
                                        r14 = r15;
                                        str4 = str3;
                                        r12 = r13;
                                        i2++;
                                        str = str;
                                        z2 = z2;
                                        c2 = 1;
                                        httpURLConnection = httpURLConnection;
                                        r13 = r12;
                                        r15 = r14;
                                    } else if (statToServer != null) {
                                        statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                    }
                                    r14 = r15;
                                    str4 = str3;
                                    r12 = r13;
                                    i2++;
                                    str = str;
                                    z2 = z2;
                                    c2 = 1;
                                    httpURLConnection = httpURLConnection;
                                    r13 = r12;
                                    r15 = r14;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str3 = str4;
                            }
                        } else {
                            r113 = httpURLConnection;
                            try {
                                map.put("httpdnsType", "domain");
                                r112 = r113;
                                str3 = str4;
                                if (i == 0) {
                                    map.put("Accept-Encoding", LoseWeightPropertyKey.IDENTITY);
                                } else if (i == 1) {
                                    map.put("Accept-Encoding", str);
                                }
                                httpConfig = StaticConfig.mHttpConfig;
                                if (httpConfig == null) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                z2 = z2;
                                httpURLConnection = getHttpURLConnection(staticDomainServerIp[i2][0], z3, str2, map);
                                httpURLConnection.setInstanceFollowRedirects(true);
                                jCurrentTimeMillis = System.currentTimeMillis();
                                if (i == 1) {
                                    httpURLConnection.connect();
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    r13 = (r15 == true ? 1 : 0) + 1;
                                    responseCode = httpURLConnection.getResponseCode();
                                    r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                                    Logger.log(r15);
                                    if (i == 0) {
                                        r15 = 206;
                                        if (responseCode == 206) {
                                            if (statToServer != null) {
                                                statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                            }
                                            return httpURLConnection;
                                        }
                                    }
                                    r23 = jCurrentTimeMillis2;
                                    str = str;
                                    if (i == 0) {
                                    }
                                    r15 = r13;
                                    r13 = r23;
                                    if (iDomainServerIpCallback == null) {
                                        r23 = httpURLConnection;
                                    } else if (responseCode == 403) {
                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                        if (!z2) {
                                            r24 = httpURLConnection;
                                            if (statToServer != null) {
                                                r23 = r24;
                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                r23 = r24;
                                            }
                                        } else if (statToServer != null) {
                                            r23 = httpURLConnection;
                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                            r23 = r23;
                                        } else {
                                            r23 = httpURLConnection;
                                        }
                                    } else {
                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                        if (!z2) {
                                            r24 = httpURLConnection;
                                            if (statToServer != null) {
                                                r23 = r24;
                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                r23 = r24;
                                            }
                                        } else if (statToServer != null) {
                                            r23 = httpURLConnection;
                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                            r23 = r23;
                                        } else {
                                            r23 = httpURLConnection;
                                        }
                                    }
                                    r23 = r24;
                                    r14 = r15 == true ? 1 : 0;
                                    str4 = str3;
                                    r12 = r13;
                                    httpURLConnection = r23;
                                } else {
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    r13 = (r15 == true ? 1 : 0) + 1;
                                    responseCode = httpURLConnection.getResponseCode();
                                    r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                                    Logger.log(r15);
                                    if (i == 0) {
                                        r15 = 206;
                                        if (responseCode == 206) {
                                            if (statToServer != null) {
                                                statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                            }
                                            return httpURLConnection;
                                        }
                                    }
                                    r23 = jCurrentTimeMillis2;
                                    str = str;
                                    if (i == 0) {
                                    }
                                    r15 = r13;
                                    r13 = r23;
                                    if (iDomainServerIpCallback == null) {
                                        r23 = httpURLConnection;
                                    } else if (responseCode == 403) {
                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                        if (!z2) {
                                            r24 = httpURLConnection;
                                            if (statToServer != null) {
                                                r23 = r24;
                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                r23 = r24;
                                            }
                                        } else if (statToServer != null) {
                                            r23 = httpURLConnection;
                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                            r23 = r23;
                                        } else {
                                            r23 = httpURLConnection;
                                        }
                                    } else {
                                        iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                        if (!z2) {
                                            r24 = httpURLConnection;
                                            if (statToServer != null) {
                                                r23 = r24;
                                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                                r23 = r24;
                                            }
                                        } else if (statToServer != null) {
                                            r23 = httpURLConnection;
                                            statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                            r23 = r23;
                                        } else {
                                            r23 = httpURLConnection;
                                        }
                                    }
                                    r23 = r24;
                                    r14 = r15 == true ? 1 : 0;
                                    str4 = str3;
                                    r12 = r13;
                                    httpURLConnection = r23;
                                }
                            } catch (Exception e15) {
                                e = e15;
                                r110 = r113;
                                str3 = str4;
                                r15 = r15;
                                r13 = r13;
                                r111 = r110;
                                httpURLConnection = r111;
                                e.printStackTrace();
                                if (iDomainServerIpCallback != null) {
                                    c = 0;
                                    iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                                } else {
                                    c = 0;
                                }
                                if (z2) {
                                    if (statToServer != null) {
                                        statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                                    }
                                    r14 = r15;
                                    str4 = str3;
                                    r12 = r13;
                                    i2++;
                                    str = str;
                                    z2 = z2;
                                    c2 = 1;
                                    httpURLConnection = httpURLConnection;
                                    r13 = r12;
                                    r15 = r14;
                                } else if (statToServer != null) {
                                    statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                                }
                                r14 = r15;
                                str4 = str3;
                                r12 = r13;
                                i2++;
                                str = str;
                                z2 = z2;
                                c2 = 1;
                                httpURLConnection = httpURLConnection;
                                r13 = r12;
                                r15 = r14;
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str3 = str4;
                        e.printStackTrace();
                        if (iDomainServerIpCallback != null) {
                            c = 0;
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                        } else {
                            c = 0;
                        }
                        if (z2) {
                            if (statToServer != null) {
                                statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", r15 + str, str3, StaticConfig.mUseragent, r13 + str, e.toString());
                            }
                            r14 = r15;
                            str4 = str3;
                            r12 = r13;
                            i2++;
                            str = str;
                            z2 = z2;
                            c2 = 1;
                            httpURLConnection = httpURLConnection;
                            r13 = r12;
                            r15 = r14;
                        } else if (statToServer != null) {
                            statToServer.statNormalRequest(strArr[c], StaticConfig.mUseragent, r13 + str, e.toString());
                        }
                        r14 = r15;
                        str4 = str3;
                        r12 = r13;
                        i2++;
                        str = str;
                        z2 = z2;
                        c2 = 1;
                        httpURLConnection = httpURLConnection;
                        r13 = r12;
                        r15 = r14;
                    }
                } else if (staticDomainServerIp[i2][c2] != null) {
                    r19 = httpURLConnection;
                    map.put("Host", staticDomainServerIp[i2][1]);
                    str4 = staticDomainServerIp[i2][1];
                    map.put("httpdnsType", "ip");
                    r112 = r19;
                    str3 = str4;
                    if (i == 0) {
                        map.put("Accept-Encoding", LoseWeightPropertyKey.IDENTITY);
                    } else if (i == 1) {
                        map.put("Accept-Encoding", str);
                    }
                    httpConfig = StaticConfig.mHttpConfig;
                    if (httpConfig == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    z2 = z2;
                    httpURLConnection = getHttpURLConnection(staticDomainServerIp[i2][0], z3, str2, map);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (i == 1) {
                        httpURLConnection.connect();
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        r13 = (r15 == true ? 1 : 0) + 1;
                        responseCode = httpURLConnection.getResponseCode();
                        r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                        Logger.log(r15);
                        if (i == 0) {
                            r15 = 206;
                            if (responseCode == 206) {
                                if (statToServer != null) {
                                    statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                }
                                return httpURLConnection;
                            }
                        }
                        r23 = jCurrentTimeMillis2;
                        str = str;
                        if (i == 0) {
                        }
                        r15 = r13;
                        r13 = r23;
                        if (iDomainServerIpCallback == null) {
                            r23 = httpURLConnection;
                        } else if (responseCode == 403) {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        } else {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        }
                        r23 = r24;
                        r14 = r15 == true ? 1 : 0;
                        str4 = str3;
                        r12 = r13;
                        httpURLConnection = r23;
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        r13 = (r15 == true ? 1 : 0) + 1;
                        responseCode = httpURLConnection.getResponseCode();
                        r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                        Logger.log(r15);
                        if (i == 0) {
                            r15 = 206;
                            if (responseCode == 206) {
                                if (statToServer != null) {
                                    statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                }
                                return httpURLConnection;
                            }
                        }
                        r23 = jCurrentTimeMillis2;
                        str = str;
                        if (i == 0) {
                        }
                        r15 = r13;
                        r13 = r23;
                        if (iDomainServerIpCallback == null) {
                            r23 = httpURLConnection;
                        } else if (responseCode == 403) {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        } else {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        }
                        r23 = r24;
                        r14 = r15 == true ? 1 : 0;
                        str4 = str3;
                        r12 = r13;
                        httpURLConnection = r23;
                    }
                } else {
                    r113 = httpURLConnection;
                    map.put("httpdnsType", "domain");
                    r112 = r113;
                    str3 = str4;
                    if (i == 0) {
                        map.put("Accept-Encoding", LoseWeightPropertyKey.IDENTITY);
                    } else if (i == 1) {
                        map.put("Accept-Encoding", str);
                    }
                    httpConfig = StaticConfig.mHttpConfig;
                    if (httpConfig == null) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    z2 = z2;
                    httpURLConnection = getHttpURLConnection(staticDomainServerIp[i2][0], z3, str2, map);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (i == 1) {
                        httpURLConnection.connect();
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        r13 = (r15 == true ? 1 : 0) + 1;
                        responseCode = httpURLConnection.getResponseCode();
                        r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                        Logger.log(r15);
                        if (i == 0) {
                            r15 = 206;
                            if (responseCode == 206) {
                                if (statToServer != null) {
                                    statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                }
                                return httpURLConnection;
                            }
                        }
                        r23 = jCurrentTimeMillis2;
                        str = str;
                        if (i == 0) {
                        }
                        r15 = r13;
                        r13 = r23;
                        if (iDomainServerIpCallback == null) {
                            r23 = httpURLConnection;
                        } else if (responseCode == 403) {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        } else {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        }
                        r23 = r24;
                        r14 = r15 == true ? 1 : 0;
                        str4 = str3;
                        r12 = r13;
                        httpURLConnection = r23;
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                        r13 = (r15 == true ? 1 : 0) + 1;
                        responseCode = httpURLConnection.getResponseCode();
                        r15 = "UnicomDigestAuthenticator 456 == 耗时= " + (System.currentTimeMillis() - jCurrentTimeMillis) + " | code = " + responseCode;
                        Logger.log(r15);
                        if (i == 0) {
                            r15 = 206;
                            if (responseCode == 206) {
                                if (statToServer != null) {
                                    statToServer.addEndHttpDnsRequest(staticDomainServerIp[i2][0], "success", r13 + str, str3, StaticConfig.mUseragent, jCurrentTimeMillis2 + str, "");
                                }
                                return httpURLConnection;
                            }
                        }
                        r23 = jCurrentTimeMillis2;
                        str = str;
                        if (i == 0) {
                        }
                        r15 = r13;
                        r13 = r23;
                        if (iDomainServerIpCallback == null) {
                            r23 = httpURLConnection;
                        } else if (responseCode == 403) {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        } else {
                            iDomainServerIpCallback.setBadIp(staticDomainServerIp[i2][1], staticDomainServerIp[i2][0], strArr[0]);
                            if (!z2) {
                                r24 = httpURLConnection;
                                if (statToServer != null) {
                                    r23 = r24;
                                    statToServer.addHttpDnsEvent(staticDomainServerIp[i2][0], "fail", (r15 == true ? 1 : 0) + str, str3, StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                    r23 = r24;
                                }
                            } else if (statToServer != null) {
                                r23 = httpURLConnection;
                                statToServer.statNormalRequest(strArr[0], StaticConfig.mUseragent, r13 + str, "response code is " + responseCode);
                                r23 = r23;
                            } else {
                                r23 = httpURLConnection;
                            }
                        }
                        r23 = r24;
                        r14 = r15 == true ? 1 : 0;
                        str4 = str3;
                        r12 = r13;
                        httpURLConnection = r23;
                    }
                }
            } catch (Exception e17) {
                e = e17;
            }
            i2++;
            str = str;
            z2 = z2;
            c2 = 1;
            httpURLConnection = httpURLConnection;
            r13 = r12;
            r15 = r14;
        }
        if (statToServer != null) {
            statToServer.endAllHttpDnsRequest();
        }
        return r7;
    }

    public static String getCpuInfo() {
        if (!TextUtils.isEmpty(cpuInfo)) {
            return cpuInfo;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"), 8192);
            String[] strArrSplit = bufferedReader.readLine().split("\\s+");
            for (int i = 2; i < strArrSplit.length; i++) {
                cpuInfo += strArrSplit[i] + " ";
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return cpuInfo;
    }

    public static HttpURLConnection getHttpURLConnection(String str, String str2, Map<String, String> map) throws IOException {
        return getHttpURLConnection(str, true, str2, map);
    }

    public static final long getPlayCacheSize() {
        if (checkSdcard()) {
            return 0 + sizeOfDirectory(new File(XMediaPlayerConstants.INCOM_AUDIO_FILE_DIRECTORY));
        }
        return 0L;
    }

    public static boolean isArm64V8() {
        String string;
        if (Build.VERSION.SDK_INT >= 21) {
            string = Arrays.toString(Build.SUPPORTED_ABIS);
        } else {
            string = Build.CPU_ABI + Build.CPU_ABI2;
        }
        Log.i("os.arch", "supportAbi:" + string);
        return string != null && string.contains("arm64-v8a");
    }

    public static boolean isArmV7Plus() {
        String string;
        if (Build.VERSION.SDK_INT >= 21) {
            string = Arrays.toString(Build.SUPPORTED_ABIS);
        } else {
            string = Build.CPU_ABI + Build.CPU_ABI2;
        }
        Log.i("os.arch", "supportAbi:" + string);
        if (string != null) {
            return string.contains("armeabi-v7a") || string.contains("arm64-v8a");
        }
        return false;
    }

    public static boolean isConnectNetwork(Context context) {
        if (context == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isLocalFile(String str) {
        if (str != null) {
            return (str.startsWith("http://") || str.startsWith("https://")) ? false : true;
        }
        return true;
    }

    public static boolean isNEON() {
        String lowerCase;
        String cPUInfos = getCPUInfos();
        return (cPUInfos == null || (lowerCase = cPUInfos.toLowerCase()) == null || !lowerCase.contains("neon")) ? false : true;
    }

    public static boolean isX86Arch() {
        String property = System.getProperty("os.arch");
        Log.i("os.arch", property + Constant.DEFAULT_CVN2);
        if (property == null || !property.contains("86")) {
            return false;
        }
        Log.i("os.arch", property + "111");
        return true;
    }

    public static String readStrFromFile(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        stringBuffer.append(line);
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        throw th;
                    }
                    String string = stringBuffer.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    return string;
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
            }
        } catch (Exception e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void releaseHttpUrlConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static long sizeOfDirectory(File file) {
        long jSizeOfDirectory = 0;
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                if (!file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(file);
                    sb.append(" does not exist");
                } else if (!file.isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(file);
                    sb2.append(" is not a directory");
                }
                return 0L;
            }
            for (File file2 : fileArrListFiles) {
                jSizeOfDirectory += file2.isDirectory() ? sizeOfDirectory(file2) : file2.length();
            }
        }
        return jSizeOfDirectory;
    }

    public static void writeFile(String str, byte[] bArr, int i) {
        try {
            if (str.contains("http")) {
                str = str.substring(str.length() - 10, str.length());
            }
            File file = new File(Environment.getExternalStorageDirectory().getPath() + "/ting/" + str);
            file.getParentFile().mkdirs();
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static void writeStr2File(String str, String str2) throws Throwable {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        fileIsExistCreate(str2);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(str2));
                    try {
                        bufferedWriter2.write(str);
                        bufferedWriter2.close();
                    } catch (Exception e) {
                        e = e;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter == null) {
                        } else {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
    public static HttpURLConnection getHttpURLConnection(String str, boolean z, String str2, Map<String, String> map) throws IOException {
        HttpURLConnection httpUrlConnect;
        Logger.log("PlayerUtil.getHttpURLConnection  " + str + "   " + map);
        URL url = new URL(str);
        HttpConfig httpConfig = StaticConfig.mHttpConfig;
        if (httpConfig == null || !z) {
            httpUrlConnect = null;
        } else {
            IGetHttpUrlConnectByUrl iGetHttpUrlConnectByUrl = httpConfig.mGetHttpUrlConnectByUrl;
            if (iGetHttpUrlConnectByUrl != null) {
                httpUrlConnect = iGetHttpUrlConnectByUrl.getHttpUrlConnect(str, str2, createPlayerConfig(map));
            } else if (TextUtils.isEmpty(httpConfig.proxyHost)) {
                httpUrlConnect = null;
            } else {
                Proxy.Type type = Proxy.Type.HTTP;
                HttpConfig httpConfig2 = StaticConfig.mHttpConfig;
                httpUrlConnect = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(new Proxy(type, new InetSocketAddress(httpConfig2.proxyHost, httpConfig2.proxyPort)))));
                httpUrlConnect.setRequestMethod(str2);
                if (!TextUtils.isEmpty(StaticConfig.mHttpConfig.authorization)) {
                    httpUrlConnect.setRequestProperty("Authorization", StaticConfig.mHttpConfig.authorization);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry != null) {
                            httpUrlConnect.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                Map<String, String> map2 = StaticConfig.mHttpConfig.property;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        if (entry2 != null) {
                            httpUrlConnect.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
            }
        }
        if (httpUrlConnect == null) {
            Logger.log("getHttpURLConnection", "openConnection Url:" + url + "   " + map);
            httpUrlConnect = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpUrlConnect.setConnectTimeout(20000);
            httpUrlConnect.setReadTimeout(20000);
            httpUrlConnect.setUseCaches(true);
            httpUrlConnect.setRequestMethod(str2);
            String str3 = StaticConfig.mUseragent;
            if (str3 != null) {
                httpUrlConnect.setRequestProperty("User-Agent", str3);
            }
            Map<String, String> map3 = StaticConfig.mHeads;
            if (map3 != null && map3.size() > 0) {
                for (Map.Entry<String, String> entry3 : StaticConfig.mHeads.entrySet()) {
                    if (entry3 != null) {
                        httpUrlConnect.setRequestProperty(entry3.getKey(), entry3.getValue());
                    }
                }
            }
            if (map != null) {
                for (Map.Entry<String, String> entry4 : map.entrySet()) {
                    if (entry4 != null) {
                        httpUrlConnect.setRequestProperty(entry4.getKey(), entry4.getValue());
                    }
                }
            }
        }
        return httpUrlConnect;
    }
}
