package com.alipay.apmobilesecuritysdk.d;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.alipay.apmobilesecuritysdk.e.f;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.maps.android.BuildConfig;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:145:0x026c  */
    /* JADX WARN: Code duplicated, block: B:155:0x02aa A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #12 {all -> 0x02bd, blocks: (B:153:0x02a0, B:155:0x02aa), top: B:503:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e1 A[Catch: all -> 0x030a, TryCatch #60 {all -> 0x030a, blocks: (B:174:0x02db, B:176:0x02e1, B:178:0x02e7, B:180:0x02ef, B:182:0x02f2, B:184:0x02fc), top: B:599:0x02db }] */
    /* JADX WARN: Code duplicated, block: B:199:0x032c A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #20 {all -> 0x0344, blocks: (B:197:0x0326, B:199:0x032c), top: B:519:0x0326 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x033a  */
    /* JADX WARN: Code duplicated, block: B:222:0x03ac A[Catch: all -> 0x03b5, TRY_LEAVE, TryCatch #7 {all -> 0x03b5, blocks: (B:220:0x03a2, B:222:0x03ac), top: B:493:0x03a2 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:233:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:238:0x0405 A[Catch: all -> 0x0449, TryCatch #29 {all -> 0x0449, blocks: (B:236:0x03fb, B:238:0x0405, B:240:0x040b, B:242:0x0411, B:243:0x0415, B:245:0x041b, B:247:0x0423, B:249:0x042a, B:251:0x0434, B:253:0x043e), top: B:537:0x03fb }] */
    /* JADX WARN: Code duplicated, block: B:245:0x041b A[Catch: all -> 0x0449, TryCatch #29 {all -> 0x0449, blocks: (B:236:0x03fb, B:238:0x0405, B:240:0x040b, B:242:0x0411, B:243:0x0415, B:245:0x041b, B:247:0x0423, B:249:0x042a, B:251:0x0434, B:253:0x043e), top: B:537:0x03fb }] */
    /* JADX WARN: Code duplicated, block: B:261:0x0476 A[Catch: Exception -> 0x0497, LOOP:9: B:259:0x0470->B:261:0x0476, LOOP_END, TryCatch #28 {Exception -> 0x0497, blocks: (B:258:0x0457, B:259:0x0470, B:261:0x0476, B:262:0x047a), top: B:535:0x0457 }] */
    /* JADX WARN: Code duplicated, block: B:270:0x04a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:273:0x04b3 A[Catch: all -> 0x04b7, TRY_LEAVE, TryCatch #8 {all -> 0x04b7, blocks: (B:271:0x04a9, B:273:0x04b3), top: B:495:0x04a9 }] */
    /* JADX WARN: Code duplicated, block: B:275:0x04b9 A[Catch: all -> 0x04c2, TRY_ENTER, TryCatch #16 {all -> 0x04c2, blocks: (B:266:0x049d, B:275:0x04b9, B:281:0x04c7), top: B:511:0x049d }] */
    /* JADX WARN: Code duplicated, block: B:280:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:287:0x04f2 A[Catch: all -> 0x0510, TryCatch #62 {all -> 0x0510, blocks: (B:284:0x04d2, B:287:0x04f2, B:290:0x0501, B:292:0x0508, B:293:0x050b), top: B:603:0x04d2 }] */
    /* JADX WARN: Code duplicated, block: B:289:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:291:0x0505  */
    /* JADX WARN: Code duplicated, block: B:299:0x0546  */
    /* JADX WARN: Code duplicated, block: B:303:0x0561 A[Catch: all -> 0x057d, TRY_LEAVE, TryCatch #52 {all -> 0x057d, blocks: (B:301:0x055b, B:303:0x0561), top: B:583:0x055b }] */
    /* JADX WARN: Code duplicated, block: B:317:0x05da  */
    /* JADX WARN: Code duplicated, block: B:324:0x060c  */
    /* JADX WARN: Code duplicated, block: B:327:0x0615  */
    /* JADX WARN: Code duplicated, block: B:331:0x0639  */
    /* JADX WARN: Code duplicated, block: B:339:0x0695  */
    /* JADX WARN: Code duplicated, block: B:342:0x06af A[Catch: all -> 0x06c5, TryCatch #22 {all -> 0x06c5, blocks: (B:340:0x069b, B:342:0x06af, B:345:0x06b7), top: B:523:0x069b }] */
    /* JADX WARN: Code duplicated, block: B:343:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:345:0x06b7 A[Catch: all -> 0x06c5, TRY_LEAVE, TryCatch #22 {all -> 0x06c5, blocks: (B:340:0x069b, B:342:0x06af, B:345:0x06b7), top: B:523:0x069b }] */
    /* JADX WARN: Code duplicated, block: B:348:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:358:0x0702  */
    /* JADX WARN: Code duplicated, block: B:359:0x0705 A[Catch: all -> 0x073d, TRY_ENTER, TryCatch #11 {all -> 0x073d, blocks: (B:356:0x06f4, B:359:0x0705, B:361:0x0719, B:365:0x0727, B:366:0x072e), top: B:501:0x06f4 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x0719 A[Catch: all -> 0x073d, TRY_LEAVE, TryCatch #11 {all -> 0x073d, blocks: (B:356:0x06f4, B:359:0x0705, B:361:0x0719, B:365:0x0727, B:366:0x072e), top: B:501:0x06f4 }] */
    /* JADX WARN: Code duplicated, block: B:372:0x075d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:375:0x0763  */
    /* JADX WARN: Code duplicated, block: B:378:0x076b  */
    /* JADX WARN: Code duplicated, block: B:379:0x076e  */
    /* JADX WARN: Code duplicated, block: B:386:0x0797 A[Catch: all -> 0x07b5, TryCatch #6 {all -> 0x07b5, blocks: (B:384:0x0789, B:386:0x0797, B:388:0x079d), top: B:491:0x0789 }] */
    /* JADX WARN: Code duplicated, block: B:395:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:402:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:409:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:410:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:414:0x0815  */
    /* JADX WARN: Code duplicated, block: B:416:0x0818  */
    /* JADX WARN: Code duplicated, block: B:495:0x04a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x049d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:0x0457 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x03fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x02db A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0574 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x0571 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[LOOP:4: B:583:0x055b->B:628:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x047a A[EDGE_INSN: B:643:0x047a->B:262:0x047a BREAK  A[LOOP:9: B:259:0x0470->B:261:0x0476], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        r7 = hg.d.a("ANDROIDID");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.io.LineNumberReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.io.Reader] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v71, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v59, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> a(Context context) {
        String subscriberId;
        boolean z14;
        String androidId;
        List<Sensor> sensorList;
        String strO;
        String str;
        String string;
        String string2;
        String strA;
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        ?? lineNumberReader;
        String strValueOf;
        String strTrim;
        BufferedReader bufferedReader;
        FileReader fileReader;
        String strTrim2;
        BufferedReader bufferedReader2;
        FileReader fileReader2;
        long j8;
        long blockCount;
        long blockSize;
        String strValueOf2;
        String str2;
        ?? jSONArray;
        SensorManager sensorManager;
        List<Sensor> sensorList2;
        String string3;
        String str3;
        ByteArrayInputStream byteArrayInputStream;
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr;
        int i14;
        String strA2;
        TelephonyManager telephonyManager;
        String string4;
        StringBuilder sb3;
        ?? linkedHashMap;
        StringBuilder sb4;
        LinkedHashMap linkedHashMap2;
        boolean z15;
        String[] strArr;
        StringBuilder sb5;
        int i15;
        StringBuilder sb6;
        ?? linkedHashMap3;
        String string5;
        String str4;
        String string6;
        String str5;
        String displayName;
        String string7;
        int i16;
        String str6;
        long availableBlocks;
        long blockSize2;
        AudioManager audioManager;
        int i17;
        String strC;
        int intExtra;
        ?? r14;
        String str7;
        String[] strArr2;
        int i18;
        long jMax;
        long jLastModified;
        String str8;
        String lowerCase;
        char c14;
        String str9;
        boolean z16;
        char c15;
        LineNumberReader lineNumberReader2;
        String line;
        char c16;
        StringBuilder sb7;
        String[] strArr3;
        int i19;
        String str10;
        TelephonyManager telephonyManager2;
        String line2;
        BufferedReader bufferedReader3;
        FileReader fileReader3;
        String line3;
        String[] strArrSplit;
        String line4;
        APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(context);
        hg.b bVar = hg.b.f83645b;
        bVar.f83646a = aPSecuritySdk;
        HashMap map = new HashMap();
        f fVarA = com.alipay.apmobilesecuritysdk.e.e.a(context);
        synchronized (bVar) {
            try {
                subscriberId = bVar.f83646a.getSubscriberId();
                z14 = false;
                if (subscriberId == null && (subscriberId = hg.d.a("imsi")) == null) {
                    if (bVar.f83646a.isBackgroundRunning()) {
                        subscriberId = "";
                    } else if ((context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) != 0) == true) {
                        subscriberId = "";
                    } else {
                        if (subscriberId == null) {
                            subscriberId = "";
                        }
                        hg.d.b("imsi", subscriberId);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (bVar) {
            androidId = bVar.f83646a.getAndroidId();
            if (androidId == null && androidId == null) {
                if (bVar.f83646a.isBackgroundRunning()) {
                    androidId = "";
                } else {
                    try {
                        androidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
                    } catch (Throwable unused) {
                    }
                    if (androidId == null) {
                        androidId = "";
                    }
                    hg.d.b("ANDROIDID", androidId);
                }
            }
        }
        if (fVarA != null) {
            if (oi0.c.g(subscriberId)) {
                subscriberId = fVarA.b();
            }
            if (oi0.c.g(androidId)) {
                androidId = fVarA.e();
            }
        }
        String str11 = subscriberId;
        String str12 = androidId;
        f fVar = new f("", str11, "", "", str12);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", fVar.a());
                jSONObject.put("imsi", fVar.b());
                jSONObject.put("mac", fVar.c());
                jSONObject.put("bluetoothmac", fVar.d());
                jSONObject.put("gsi", fVar.e());
                String string8 = jSONObject.toString();
                com.alipay.apmobilesecuritysdk.f.a.a("device_feature_file_name", "device_feature_file_key", string8);
                com.alipay.apmobilesecuritysdk.f.a.a(context, "device_feature_prefs_name", "device_feature_prefs_key", string8);
            } catch (Exception e4) {
                com.alipay.apmobilesecuritysdk.c.a.a(e4);
            }
        }
        map.put("AD1", "");
        map.put("AD2", str11);
        if (context != null) {
            try {
                SensorManager sensorManager2 = (SensorManager) context.getSystemService("sensor");
                if (sensorManager2 == null || (sensorList = sensorManager2.getSensorList(-1)) == null || sensorList.size() <= 0) {
                    strO = null;
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    for (Sensor sensor : sensorList) {
                        sb8.append(sensor.getName());
                        sb8.append(sensor.getVersion());
                        sb8.append(sensor.getVendor());
                    }
                    strO = oi0.c.o(sb8.toString());
                }
            } catch (Throwable unused2) {
            }
        } else {
            strO = null;
        }
        if (strO == null) {
            strO = "";
        }
        map.put("AD3", strO);
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            str = Integer.toString(displayMetrics.widthPixels) + Marker.ANY_MARKER + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused3) {
            str = "";
        }
        map.put("AD5", str);
        try {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(displayMetrics2.widthPixels);
            string = sb9.toString();
        } catch (Throwable unused4) {
            string = "";
        }
        map.put("AD6", string);
        try {
            DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(displayMetrics3.heightPixels);
            string2 = sb10.toString();
        } catch (Throwable unused5) {
            string2 = "";
        }
        map.put("AD7", string2);
        synchronized (bVar) {
            try {
                strA = hg.d.a("SimSerial");
                if (strA == null) {
                    if (bVar.f83646a.isBackgroundRunning()) {
                        strA = "";
                    } else if ((context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) != 0) == true) {
                        strA = "";
                    } else {
                        hg.d.b("SimSerial", strA);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        map.put("AD9", strA);
        map.put("AD10", str12);
        String strTrim3 = "0000000000000000";
        try {
            fileInputStream = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    lineNumberReader = new LineNumberReader(inputStreamReader);
                    for (int i24 = 1; i24 < 100; i24++) {
                        try {
                            String line5 = lineNumberReader.readLine();
                            if (line5 == null) {
                                break;
                            }
                            if (line5.indexOf("Serial") >= 0) {
                                strTrim3 = line5.substring(line5.indexOf(":") + 1, line5.length()).trim();
                                break;
                            }
                        } catch (Throwable unused6) {
                            if (lineNumberReader != 0) {
                                try {
                                    lineNumberReader.close();
                                } catch (Throwable unused7) {
                                }
                            }
                            if (inputStreamReader != null) {
                                try {
                                    inputStreamReader.close();
                                } catch (Throwable unused8) {
                                }
                            }
                            if (fileInputStream != null) {
                            }
                            if (strTrim3 == null) {
                                strTrim3 = "";
                            }
                            map.put("AD11", strTrim3);
                            strValueOf = String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new hg.c(bVar)).length);
                            map.put("AD12", strValueOf);
                            strTrim = "";
                            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                            try {
                                bufferedReader = new BufferedReader(fileReader, 8192);
                                line4 = bufferedReader.readLine();
                                if (oi0.c.g(line4)) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused9) {
                                    }
                                    try {
                                        fileReader.close();
                                    } catch (Throwable unused10) {
                                    }
                                    strTrim2 = "";
                                } else {
                                    strTrim2 = line4.trim();
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused11) {
                                    }
                                    try {
                                        fileReader.close();
                                    } catch (Throwable unused12) {
                                    }
                                }
                            } catch (Throwable unused13) {
                                bufferedReader = null;
                            }
                            if (oi0.c.g(strTrim2)) {
                                try {
                                    fileReader3 = new FileReader("/proc/cpuinfo");
                                    try {
                                        bufferedReader3 = new BufferedReader(fileReader3, 8192);
                                        while (true) {
                                            try {
                                                line3 = bufferedReader3.readLine();
                                                if (line3 != null) {
                                                    break;
                                                }
                                                if (oi0.c.g(line3)) {
                                                }
                                            } catch (Throwable unused14) {
                                                if (fileReader3 != null) {
                                                    try {
                                                        fileReader3.close();
                                                    } catch (Throwable unused15) {
                                                    }
                                                }
                                                if (bufferedReader3 != null) {
                                                }
                                                strTrim2 = strTrim;
                                                map.put("AD13", strTrim2);
                                                fileReader2 = new FileReader("/proc/meminfo");
                                                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                                                line2 = bufferedReader2.readLine();
                                                if (line2 != null) {
                                                    j8 = Integer.parseInt(line2.split("\\s+")[1]);
                                                } else {
                                                    j8 = 0;
                                                }
                                                fileReader2.close();
                                                bufferedReader2.close();
                                                map.put("AD14", String.valueOf(j8));
                                                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                                                blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                                                map.put("AD15", String.valueOf(blockCount));
                                                StatFs statFs2 = new StatFs("/sdcard");
                                                blockSize = ((long) statFs2.getBlockSize()) * ((long) statFs2.getBlockCount());
                                                map.put("AD16", String.valueOf(blockSize));
                                                map.put("AD17", "");
                                                telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                                                if (telephonyManager2 != null) {
                                                    strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                                                } else {
                                                    strValueOf2 = "";
                                                }
                                                map.put("AD19", strValueOf2);
                                                Class<?> cls = Class.forName("android.os.SystemProperties");
                                                str2 = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
                                                map.put("AD20", str2 != null ? str2 : "");
                                                map.put("AD22", "");
                                                jSONArray = new JSONArray();
                                                if (context != null) {
                                                    try {
                                                        sensorManager = (SensorManager) context.getSystemService("sensor");
                                                        if (sensorManager != null) {
                                                            for (Sensor sensor2 : sensorList2) {
                                                                if (sensor2 != null) {
                                                                    JSONObject jSONObject2 = new JSONObject();
                                                                    jSONObject2.put("name", sensor2.getName());
                                                                    jSONObject2.put("version", sensor2.getVersion());
                                                                    jSONObject2.put("vendor", sensor2.getVendor());
                                                                    jSONArray.put(jSONObject2);
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable unused16) {
                                                    }
                                                }
                                                string3 = jSONArray.toString();
                                                str3 = "";
                                                if (!oi0.c.g(string3)) {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                                        bArr = new byte[1024];
                                                        while (true) {
                                                            i14 = byteArrayInputStream.read(bArr, 0, 1024);
                                                            if (i14 != -1) {
                                                                break;
                                                            }
                                                            gZIPOutputStream.write(bArr, 0, i14);
                                                        }
                                                        gZIPOutputStream.flush();
                                                        gZIPOutputStream.close();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        byteArrayOutputStream.flush();
                                                        byteArrayOutputStream.close();
                                                        byteArrayInputStream.close();
                                                        str3 = new String(Base64.encode(byteArray, 2));
                                                    } catch (Exception unused17) {
                                                    }
                                                }
                                                map.put("AD24", str3);
                                                synchronized (bVar) {
                                                    try {
                                                        strA2 = hg.d.a("NetworkOperatorName");
                                                        if (strA2 == null) {
                                                            if (context != null) {
                                                                try {
                                                                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                                                    if (telephonyManager != null) {
                                                                        strA2 = telephonyManager.getNetworkOperatorName();
                                                                    }
                                                                } catch (Throwable unused18) {
                                                                }
                                                            }
                                                            if (strA2 != null) {
                                                                strA2 = "";
                                                            } else {
                                                                strA2 = "";
                                                            }
                                                            hg.d.b("NetworkOperatorName", strA2);
                                                        }
                                                        map.put("AD26", strA2);
                                                        sb7 = new StringBuilder();
                                                        strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
                                                        sb7.append("00:");
                                                        for (i19 = 0; i19 < 7; i19++) {
                                                            if (new File(strArr3[i19]).exists()) {
                                                                str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                                            } else {
                                                                str10 = "0";
                                                            }
                                                            sb7.append(str10);
                                                        }
                                                        string4 = sb7.toString();
                                                        map.put("AD27", string4);
                                                        sb3 = new StringBuilder("00:");
                                                        linkedHashMap = new LinkedHashMap();
                                                        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
                                                        linkedHashMap.put("/proc/tty/drivers", "goldfish");
                                                        linkedHashMap.put("/proc/cpuinfo", "goldfish");
                                                        for (String str13 : linkedHashMap.keySet()) {
                                                            try {
                                                                lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
                                                                while (true) {
                                                                    try {
                                                                        line = lineNumberReader2.readLine();
                                                                        if (line != null) {
                                                                            c16 = '0';
                                                                            break;
                                                                        }
                                                                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                                                                            c16 = '1';
                                                                            break;
                                                                        }
                                                                    } catch (Throwable unused19) {
                                                                        sb3.append('0');
                                                                        if (lineNumberReader2 != null) {
                                                                        }
                                                                    }
                                                                }
                                                                sb3.append(c16);
                                                            } catch (Throwable unused20) {
                                                                lineNumberReader2 = null;
                                                            }
                                                            lineNumberReader2.close();
                                                        }
                                                        map.put("AD28", sb3.toString());
                                                        sb4 = new StringBuilder("00:");
                                                        linkedHashMap2 = new LinkedHashMap();
                                                        linkedHashMap2.put("ro.hardware", "goldfish");
                                                        linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                                        linkedHashMap2.put("ro.product.device", "generic");
                                                        linkedHashMap2.put("ro.product.model", "sdk");
                                                        linkedHashMap2.put("ro.product.brand", "generic");
                                                        linkedHashMap2.put("ro.product.name", "sdk");
                                                        linkedHashMap2.put("ro.build.fingerprint", "test-keys");
                                                        linkedHashMap2.put("ro.product.manufacturer", "unknow");
                                                        for (String str14 : linkedHashMap2.keySet()) {
                                                            String str15 = (String) linkedHashMap2.get(str14);
                                                            str9 = "";
                                                            try {
                                                                z16 = z14;
                                                                try {
                                                                    str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
                                                                } catch (Exception unused21) {
                                                                }
                                                            } catch (Exception unused22) {
                                                                z16 = z14;
                                                            }
                                                            if (str9 == null) {
                                                                c15 = '0';
                                                            } else {
                                                                c15 = '0';
                                                            }
                                                            sb4.append(c15);
                                                            z14 = z16;
                                                        }
                                                        z15 = z14;
                                                        map.put("AD29", sb4.toString());
                                                        strArr = new String[]{"dalvik.system.Taint"};
                                                        sb5 = new StringBuilder("00:");
                                                        for (i15 = z15 ? 1 : 0; i15 <= 0; i15++) {
                                                            try {
                                                                Class.forName(strArr[z15 ? 1 : 0]);
                                                                sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                                            } catch (Throwable unused23) {
                                                                sb5.append("0");
                                                            }
                                                        }
                                                        map.put("AD30", sb5.toString());
                                                        sb6 = new StringBuilder("00:");
                                                        linkedHashMap3 = new LinkedHashMap();
                                                        linkedHashMap3.put("BRAND", "generic");
                                                        linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
                                                        linkedHashMap3.put("DEVICE", "generic");
                                                        linkedHashMap3.put("HARDWARE", "goldfish");
                                                        linkedHashMap3.put("PRODUCT", "sdk");
                                                        linkedHashMap3.put("MODEL", "sdk");
                                                        for (String str16 : linkedHashMap3.keySet()) {
                                                            try {
                                                                str8 = (String) Build.class.getField(str16).get(null);
                                                                String str17 = (String) linkedHashMap3.get(str16);
                                                                if (str8 != null) {
                                                                    lowerCase = str8.toLowerCase();
                                                                } else {
                                                                    lowerCase = null;
                                                                }
                                                                if (lowerCase == null) {
                                                                    c14 = '0';
                                                                } else {
                                                                    c14 = '0';
                                                                }
                                                                sb6.append(c14);
                                                            } catch (Throwable unused24) {
                                                                sb6.append('0');
                                                            }
                                                        }
                                                        map.put("AD31", sb6.toString());
                                                        map.put("AD32", hg.b.b());
                                                        StringBuilder sb11 = new StringBuilder();
                                                        sb11.append(SystemClock.elapsedRealtime());
                                                        string5 = sb11.toString();
                                                        map.put("AD33", string5);
                                                        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                                                            strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                                                            jMax = 0;
                                                            for (i18 = z15 ? 1 : 0; i18 < 5; i18++) {
                                                                try {
                                                                    jLastModified = new File(strArr2[i18]).lastModified();
                                                                } catch (Throwable unused25) {
                                                                    jLastModified = -1;
                                                                }
                                                                jMax = Math.max(jLastModified, jMax);
                                                            }
                                                            str4 = "1:" + jMax;
                                                        } else {
                                                            str4 = "0:0";
                                                        }
                                                        map.put("AD34", str4);
                                                        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                                        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                                                        intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                                                        if (intExtra != 2) {
                                                            r14 = 1;
                                                        } else {
                                                            r14 = 1;
                                                        }
                                                        StringBuilder sb12 = new StringBuilder();
                                                        if (r14 != 0) {
                                                            str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                                        } else {
                                                            str7 = "0";
                                                        }
                                                        sb12.append(str7);
                                                        sb12.append(":");
                                                        sb12.append(intExtra2);
                                                        string6 = sb12.toString();
                                                        map.put("AD35", string6);
                                                        str5 = "";
                                                        strC = hg.b.c(context);
                                                        String strD = bVar.d();
                                                        if (oi0.c.k(strC)) {
                                                            str5 = strC + ":" + bVar.d();
                                                        }
                                                        map.put("AD36", str5);
                                                        displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
                                                        map.put("AD37", displayName != null ? displayName : "");
                                                        string7 = Locale.getDefault().toString();
                                                        map.put("AD38", string7 != null ? string7 : "");
                                                        i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
                                                        if (i16 == 1) {
                                                            str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                                        } else {
                                                            str6 = "0";
                                                        }
                                                        map.put("AD39", str6);
                                                        JSONObject jSONObject3 = new JSONObject();
                                                        audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                                        if (audioManager.getRingerMode() == 0) {
                                                            i17 = 1;
                                                        } else {
                                                            i17 = 0;
                                                        }
                                                        int streamVolume = audioManager.getStreamVolume(0);
                                                        int streamVolume2 = audioManager.getStreamVolume(1);
                                                        int streamVolume3 = audioManager.getStreamVolume(2);
                                                        int streamVolume4 = audioManager.getStreamVolume(3);
                                                        int streamVolume5 = audioManager.getStreamVolume(4);
                                                        jSONObject3.put("ringermode", String.valueOf(i17));
                                                        jSONObject3.put("call", String.valueOf(streamVolume));
                                                        jSONObject3.put("system", String.valueOf(streamVolume2));
                                                        jSONObject3.put("ring", String.valueOf(streamVolume3));
                                                        jSONObject3.put("music", String.valueOf(streamVolume4));
                                                        jSONObject3.put("alarm", String.valueOf(streamVolume5));
                                                        map.put("AD40", jSONObject3.toString());
                                                        StatFs statFs3 = new StatFs(Environment.getDataDirectory().getPath());
                                                        availableBlocks = ((long) statFs3.getAvailableBlocks()) * ((long) statFs3.getBlockSize());
                                                        map.put("AD41", String.valueOf(availableBlocks));
                                                        StatFs statFs4 = new StatFs("/sdcard");
                                                        blockSize2 = ((long) statFs4.getBlockSize()) * ((long) statFs4.getAvailableBlocks());
                                                        map.put("AD42", String.valueOf(blockSize2));
                                                        return map;
                                                    } catch (Throwable th5) {
                                                        throw th5;
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            fileReader3.close();
                                        } catch (Throwable unused26) {
                                        }
                                    } catch (Throwable unused27) {
                                        bufferedReader3 = null;
                                    }
                                } catch (Throwable unused28) {
                                    bufferedReader3 = null;
                                    fileReader3 = null;
                                }
                                try {
                                    bufferedReader3.close();
                                } catch (Throwable unused29) {
                                }
                                strTrim2 = strTrim;
                            }
                            map.put("AD13", strTrim2);
                            fileReader2 = new FileReader("/proc/meminfo");
                            try {
                                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                                line2 = bufferedReader2.readLine();
                                if (line2 != null) {
                                    j8 = Integer.parseInt(line2.split("\\s+")[1]);
                                } else {
                                    j8 = 0;
                                }
                                fileReader2.close();
                            } catch (Throwable unused30) {
                                bufferedReader2 = null;
                            }
                            bufferedReader2.close();
                            map.put("AD14", String.valueOf(j8));
                            StatFs statFs5 = new StatFs(Environment.getDataDirectory().getPath());
                            blockCount = ((long) statFs5.getBlockCount()) * ((long) statFs5.getBlockSize());
                            map.put("AD15", String.valueOf(blockCount));
                            StatFs statFs6 = new StatFs("/sdcard");
                            blockSize = ((long) statFs6.getBlockSize()) * ((long) statFs6.getBlockCount());
                            map.put("AD16", String.valueOf(blockSize));
                            map.put("AD17", "");
                            telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager2 != null) {
                                strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                            } else {
                                strValueOf2 = "";
                            }
                            map.put("AD19", strValueOf2);
                            Class<?> cls2 = Class.forName("android.os.SystemProperties");
                            str2 = (String) cls2.getMethod("get", String.class, String.class).invoke(cls2.newInstance(), "gsm.version.baseband", "no message");
                            map.put("AD20", str2 != null ? str2 : "");
                            map.put("AD22", "");
                            jSONArray = new JSONArray();
                            if (context != null) {
                                sensorManager = (SensorManager) context.getSystemService("sensor");
                                if (sensorManager != null) {
                                    while (r8.hasNext()) {
                                        if (sensor2 != null) {
                                            JSONObject jSONObject4 = new JSONObject();
                                            jSONObject4.put("name", sensor2.getName());
                                            jSONObject4.put("version", sensor2.getVersion());
                                            jSONObject4.put("vendor", sensor2.getVendor());
                                            jSONArray.put(jSONObject4);
                                        }
                                    }
                                }
                            }
                            string3 = jSONArray.toString();
                            str3 = "";
                            if (!oi0.c.g(string3)) {
                                byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                                bArr = new byte[1024];
                                while (true) {
                                    i14 = byteArrayInputStream.read(bArr, 0, 1024);
                                    if (i14 != -1) {
                                        break;
                                        break;
                                    }
                                    gZIPOutputStream.write(bArr, 0, i14);
                                }
                                gZIPOutputStream.flush();
                                gZIPOutputStream.close();
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.flush();
                                byteArrayOutputStream2.close();
                                byteArrayInputStream.close();
                                str3 = new String(Base64.encode(byteArray2, 2));
                            }
                            map.put("AD24", str3);
                            synchronized (bVar) {
                                strA2 = hg.d.a("NetworkOperatorName");
                                if (strA2 == null) {
                                    if (context != null) {
                                        telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                        if (telephonyManager != null) {
                                            strA2 = telephonyManager.getNetworkOperatorName();
                                        }
                                    }
                                    if (strA2 != null) {
                                        strA2 = "";
                                    } else {
                                        strA2 = "";
                                    }
                                    hg.d.b("NetworkOperatorName", strA2);
                                }
                                map.put("AD26", strA2);
                                sb7 = new StringBuilder();
                                strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
                                sb7.append("00:");
                                while (i19 < 7) {
                                    if (new File(strArr3[i19]).exists()) {
                                        str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                    } else {
                                        str10 = "0";
                                    }
                                    sb7.append(str10);
                                }
                                string4 = sb7.toString();
                                map.put("AD27", string4);
                                sb3 = new StringBuilder("00:");
                                linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
                                linkedHashMap.put("/proc/tty/drivers", "goldfish");
                                linkedHashMap.put("/proc/cpuinfo", "goldfish");
                                while (r9.hasNext()) {
                                    lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
                                    while (true) {
                                        line = lineNumberReader2.readLine();
                                        if (line != null) {
                                            c16 = '0';
                                            break;
                                        }
                                        if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                                            c16 = '1';
                                            break;
                                        }
                                    }
                                    sb3.append(c16);
                                    lineNumberReader2.close();
                                }
                                map.put("AD28", sb3.toString());
                                sb4 = new StringBuilder("00:");
                                linkedHashMap2 = new LinkedHashMap();
                                linkedHashMap2.put("ro.hardware", "goldfish");
                                linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                linkedHashMap2.put("ro.product.device", "generic");
                                linkedHashMap2.put("ro.product.model", "sdk");
                                linkedHashMap2.put("ro.product.brand", "generic");
                                linkedHashMap2.put("ro.product.name", "sdk");
                                linkedHashMap2.put("ro.build.fingerprint", "test-keys");
                                linkedHashMap2.put("ro.product.manufacturer", "unknow");
                                while (r9.hasNext()) {
                                    String str18 = (String) linkedHashMap2.get(str14);
                                    str9 = "";
                                    z16 = z14;
                                    str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
                                    if (str9 == null) {
                                        c15 = '0';
                                    } else {
                                        c15 = '0';
                                    }
                                    sb4.append(c15);
                                    z14 = z16;
                                }
                                z15 = z14;
                                map.put("AD29", sb4.toString());
                                strArr = new String[]{"dalvik.system.Taint"};
                                sb5 = new StringBuilder("00:");
                                while (i15 <= 0) {
                                    Class.forName(strArr[z15 ? 1 : 0]);
                                    sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                }
                                map.put("AD30", sb5.toString());
                                sb6 = new StringBuilder("00:");
                                linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.put("BRAND", "generic");
                                linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
                                linkedHashMap3.put("DEVICE", "generic");
                                linkedHashMap3.put("HARDWARE", "goldfish");
                                linkedHashMap3.put("PRODUCT", "sdk");
                                linkedHashMap3.put("MODEL", "sdk");
                                while (r7.hasNext()) {
                                    str8 = (String) Build.class.getField(str16).get(null);
                                    String str19 = (String) linkedHashMap3.get(str16);
                                    if (str8 != null) {
                                        lowerCase = str8.toLowerCase();
                                    } else {
                                        lowerCase = null;
                                    }
                                    if (lowerCase == null) {
                                        c14 = '0';
                                    } else {
                                        c14 = '0';
                                    }
                                    sb6.append(c14);
                                }
                                map.put("AD31", sb6.toString());
                                map.put("AD32", hg.b.b());
                                StringBuilder sb13 = new StringBuilder();
                                sb13.append(SystemClock.elapsedRealtime());
                                string5 = sb13.toString();
                                map.put("AD33", string5);
                                if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                                    str4 = "0:0";
                                } else {
                                    strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                                    jMax = 0;
                                    while (i18 < 5) {
                                        jLastModified = new File(strArr2[i18]).lastModified();
                                        jMax = Math.max(jLastModified, jMax);
                                    }
                                    str4 = "1:" + jMax;
                                }
                                map.put("AD34", str4);
                                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                int intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1);
                                intExtra = intentRegisterReceiver2.getIntExtra("status", -1);
                                if (intExtra != 2) {
                                    r14 = 1;
                                } else {
                                    r14 = 1;
                                }
                                StringBuilder sb14 = new StringBuilder();
                                if (r14 != 0) {
                                    str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                } else {
                                    str7 = "0";
                                }
                                sb14.append(str7);
                                sb14.append(":");
                                sb14.append(intExtra3);
                                string6 = sb14.toString();
                                map.put("AD35", string6);
                                str5 = "";
                                strC = hg.b.c(context);
                                String strD2 = bVar.d();
                                if (oi0.c.k(strC)) {
                                    str5 = strC + ":" + bVar.d();
                                }
                                map.put("AD36", str5);
                                displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
                                map.put("AD37", displayName != null ? displayName : "");
                                string7 = Locale.getDefault().toString();
                                map.put("AD38", string7 != null ? string7 : "");
                                i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
                                if (i16 == 1) {
                                    str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                } else {
                                    str6 = "0";
                                }
                                map.put("AD39", str6);
                                JSONObject jSONObject5 = new JSONObject();
                                audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                if (audioManager.getRingerMode() == 0) {
                                    i17 = 1;
                                } else {
                                    i17 = 0;
                                }
                                int streamVolume6 = audioManager.getStreamVolume(0);
                                int streamVolume7 = audioManager.getStreamVolume(1);
                                int streamVolume8 = audioManager.getStreamVolume(2);
                                int streamVolume9 = audioManager.getStreamVolume(3);
                                int streamVolume10 = audioManager.getStreamVolume(4);
                                jSONObject5.put("ringermode", String.valueOf(i17));
                                jSONObject5.put("call", String.valueOf(streamVolume6));
                                jSONObject5.put("system", String.valueOf(streamVolume7));
                                jSONObject5.put("ring", String.valueOf(streamVolume8));
                                jSONObject5.put("music", String.valueOf(streamVolume9));
                                jSONObject5.put("alarm", String.valueOf(streamVolume10));
                                map.put("AD40", jSONObject5.toString());
                                StatFs statFs7 = new StatFs(Environment.getDataDirectory().getPath());
                                availableBlocks = ((long) statFs7.getAvailableBlocks()) * ((long) statFs7.getBlockSize());
                                map.put("AD41", String.valueOf(availableBlocks));
                                StatFs statFs8 = new StatFs("/sdcard");
                                blockSize2 = ((long) statFs8.getBlockSize()) * ((long) statFs8.getAvailableBlocks());
                                map.put("AD42", String.valueOf(blockSize2));
                                return map;
                            }
                        }
                    }
                    try {
                        lineNumberReader.close();
                    } catch (Throwable unused31) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused32) {
                    }
                } catch (Throwable unused33) {
                    lineNumberReader = 0;
                }
            } catch (Throwable unused34) {
                inputStreamReader = null;
                lineNumberReader = inputStreamReader;
                if (lineNumberReader != 0) {
                    lineNumberReader.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (strTrim3 == null) {
                    strTrim3 = "";
                }
                map.put("AD11", strTrim3);
                strValueOf = String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new hg.c(bVar)).length);
                map.put("AD12", strValueOf);
                strTrim = "";
                fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                bufferedReader = new BufferedReader(fileReader, 8192);
                line4 = bufferedReader.readLine();
                if (oi0.c.g(line4)) {
                    strTrim2 = line4.trim();
                    bufferedReader.close();
                    fileReader.close();
                } else {
                    bufferedReader.close();
                    fileReader.close();
                    strTrim2 = "";
                }
                if (oi0.c.g(strTrim2)) {
                    fileReader3 = new FileReader("/proc/cpuinfo");
                    bufferedReader3 = new BufferedReader(fileReader3, 8192);
                    while (true) {
                        line3 = bufferedReader3.readLine();
                        if (line3 != null) {
                            break;
                        }
                        if (oi0.c.g(line3)) {
                        }
                    }
                    fileReader3.close();
                    bufferedReader3.close();
                    strTrim2 = strTrim;
                }
                map.put("AD13", strTrim2);
                fileReader2 = new FileReader("/proc/meminfo");
                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                line2 = bufferedReader2.readLine();
                if (line2 != null) {
                    j8 = Integer.parseInt(line2.split("\\s+")[1]);
                } else {
                    j8 = 0;
                }
                fileReader2.close();
                bufferedReader2.close();
                map.put("AD14", String.valueOf(j8));
                StatFs statFs9 = new StatFs(Environment.getDataDirectory().getPath());
                blockCount = ((long) statFs9.getBlockCount()) * ((long) statFs9.getBlockSize());
                map.put("AD15", String.valueOf(blockCount));
                StatFs statFs10 = new StatFs("/sdcard");
                blockSize = ((long) statFs10.getBlockSize()) * ((long) statFs10.getBlockCount());
                map.put("AD16", String.valueOf(blockSize));
                map.put("AD17", "");
                telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager2 != null) {
                    strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                } else {
                    strValueOf2 = "";
                }
                map.put("AD19", strValueOf2);
                Class<?> cls3 = Class.forName("android.os.SystemProperties");
                str2 = (String) cls3.getMethod("get", String.class, String.class).invoke(cls3.newInstance(), "gsm.version.baseband", "no message");
                map.put("AD20", str2 != null ? str2 : "");
                map.put("AD22", "");
                jSONArray = new JSONArray();
                if (context != null) {
                    sensorManager = (SensorManager) context.getSystemService("sensor");
                    if (sensorManager != null) {
                        while (r8.hasNext()) {
                            if (sensor2 != null) {
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("name", sensor2.getName());
                                jSONObject6.put("version", sensor2.getVersion());
                                jSONObject6.put("vendor", sensor2.getVendor());
                                jSONArray.put(jSONObject6);
                            }
                        }
                    }
                }
                string3 = jSONArray.toString();
                str3 = "";
                if (!oi0.c.g(string3)) {
                    byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream3);
                    bArr = new byte[1024];
                    while (true) {
                        i14 = byteArrayInputStream.read(bArr, 0, 1024);
                        if (i14 != -1) {
                            break;
                            break;
                        }
                        gZIPOutputStream.write(bArr, 0, i14);
                    }
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                    byteArrayOutputStream3.flush();
                    byteArrayOutputStream3.close();
                    byteArrayInputStream.close();
                    str3 = new String(Base64.encode(byteArray3, 2));
                }
                map.put("AD24", str3);
                synchronized (bVar) {
                    strA2 = hg.d.a("NetworkOperatorName");
                    if (strA2 == null) {
                        if (context != null) {
                            telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (telephonyManager != null) {
                                strA2 = telephonyManager.getNetworkOperatorName();
                            }
                        }
                        if (strA2 != null) {
                            strA2 = "";
                        } else {
                            strA2 = "";
                        }
                        hg.d.b("NetworkOperatorName", strA2);
                    }
                    map.put("AD26", strA2);
                    sb7 = new StringBuilder();
                    strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
                    sb7.append("00:");
                    while (i19 < 7) {
                        if (new File(strArr3[i19]).exists()) {
                            str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                        } else {
                            str10 = "0";
                        }
                        sb7.append(str10);
                    }
                    string4 = sb7.toString();
                    map.put("AD27", string4);
                    sb3 = new StringBuilder("00:");
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
                    linkedHashMap.put("/proc/tty/drivers", "goldfish");
                    linkedHashMap.put("/proc/cpuinfo", "goldfish");
                    while (r9.hasNext()) {
                        lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
                        while (true) {
                            line = lineNumberReader2.readLine();
                            if (line != null) {
                                c16 = '0';
                                break;
                            }
                            if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                                c16 = '1';
                                break;
                            }
                        }
                        sb3.append(c16);
                        lineNumberReader2.close();
                    }
                    map.put("AD28", sb3.toString());
                    sb4 = new StringBuilder("00:");
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("ro.hardware", "goldfish");
                    linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    linkedHashMap2.put("ro.product.device", "generic");
                    linkedHashMap2.put("ro.product.model", "sdk");
                    linkedHashMap2.put("ro.product.brand", "generic");
                    linkedHashMap2.put("ro.product.name", "sdk");
                    linkedHashMap2.put("ro.build.fingerprint", "test-keys");
                    linkedHashMap2.put("ro.product.manufacturer", "unknow");
                    while (r9.hasNext()) {
                        String str110 = (String) linkedHashMap2.get(str14);
                        str9 = "";
                        z16 = z14;
                        str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
                        if (str9 == null) {
                            c15 = '0';
                        } else {
                            c15 = '0';
                        }
                        sb4.append(c15);
                        z14 = z16;
                    }
                    z15 = z14;
                    map.put("AD29", sb4.toString());
                    strArr = new String[]{"dalvik.system.Taint"};
                    sb5 = new StringBuilder("00:");
                    while (i15 <= 0) {
                        Class.forName(strArr[z15 ? 1 : 0]);
                        sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    map.put("AD30", sb5.toString());
                    sb6 = new StringBuilder("00:");
                    linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("BRAND", "generic");
                    linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
                    linkedHashMap3.put("DEVICE", "generic");
                    linkedHashMap3.put("HARDWARE", "goldfish");
                    linkedHashMap3.put("PRODUCT", "sdk");
                    linkedHashMap3.put("MODEL", "sdk");
                    while (r7.hasNext()) {
                        str8 = (String) Build.class.getField(str16).get(null);
                        String str111 = (String) linkedHashMap3.get(str16);
                        if (str8 != null) {
                            lowerCase = str8.toLowerCase();
                        } else {
                            lowerCase = null;
                        }
                        if (lowerCase == null) {
                            c14 = '0';
                        } else {
                            c14 = '0';
                        }
                        sb6.append(c14);
                    }
                    map.put("AD31", sb6.toString());
                    map.put("AD32", hg.b.b());
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(SystemClock.elapsedRealtime());
                    string5 = sb15.toString();
                    map.put("AD33", string5);
                    if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                        str4 = "0:0";
                    } else {
                        strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                        jMax = 0;
                        while (i18 < 5) {
                            jLastModified = new File(strArr2[i18]).lastModified();
                            jMax = Math.max(jLastModified, jMax);
                        }
                        str4 = "1:" + jMax;
                    }
                    map.put("AD34", str4);
                    Intent intentRegisterReceiver3 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    int intExtra4 = intentRegisterReceiver3.getIntExtra("level", -1);
                    intExtra = intentRegisterReceiver3.getIntExtra("status", -1);
                    if (intExtra != 2) {
                        r14 = 1;
                    } else {
                        r14 = 1;
                    }
                    StringBuilder sb16 = new StringBuilder();
                    if (r14 != 0) {
                        str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    } else {
                        str7 = "0";
                    }
                    sb16.append(str7);
                    sb16.append(":");
                    sb16.append(intExtra4);
                    string6 = sb16.toString();
                    map.put("AD35", string6);
                    str5 = "";
                    strC = hg.b.c(context);
                    String strD3 = bVar.d();
                    if (oi0.c.k(strC)) {
                        str5 = strC + ":" + bVar.d();
                    }
                    map.put("AD36", str5);
                    displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
                    map.put("AD37", displayName != null ? displayName : "");
                    string7 = Locale.getDefault().toString();
                    map.put("AD38", string7 != null ? string7 : "");
                    i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
                    if (i16 == 1) {
                        str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                    } else {
                        str6 = "0";
                    }
                    map.put("AD39", str6);
                    JSONObject jSONObject7 = new JSONObject();
                    audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                    if (audioManager.getRingerMode() == 0) {
                        i17 = 1;
                    } else {
                        i17 = 0;
                    }
                    int streamVolume11 = audioManager.getStreamVolume(0);
                    int streamVolume12 = audioManager.getStreamVolume(1);
                    int streamVolume13 = audioManager.getStreamVolume(2);
                    int streamVolume14 = audioManager.getStreamVolume(3);
                    int streamVolume15 = audioManager.getStreamVolume(4);
                    jSONObject7.put("ringermode", String.valueOf(i17));
                    jSONObject7.put("call", String.valueOf(streamVolume11));
                    jSONObject7.put("system", String.valueOf(streamVolume12));
                    jSONObject7.put("ring", String.valueOf(streamVolume13));
                    jSONObject7.put("music", String.valueOf(streamVolume14));
                    jSONObject7.put("alarm", String.valueOf(streamVolume15));
                    map.put("AD40", jSONObject7.toString());
                    StatFs statFs11 = new StatFs(Environment.getDataDirectory().getPath());
                    availableBlocks = ((long) statFs11.getAvailableBlocks()) * ((long) statFs11.getBlockSize());
                    map.put("AD41", String.valueOf(availableBlocks));
                    StatFs statFs12 = new StatFs("/sdcard");
                    blockSize2 = ((long) statFs12.getBlockSize()) * ((long) statFs12.getAvailableBlocks());
                    map.put("AD42", String.valueOf(blockSize2));
                    return map;
                }
            }
        } catch (Throwable unused35) {
            fileInputStream = null;
            inputStreamReader = null;
        }
        try {
            fileInputStream.close();
        } catch (Throwable unused36) {
        }
        if (strTrim3 == null) {
            strTrim3 = "";
        }
        map.put("AD11", strTrim3);
        try {
            strValueOf = String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new hg.c(bVar)).length);
        } catch (Throwable unused37) {
            strValueOf = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        }
        map.put("AD12", strValueOf);
        strTrim = "";
        try {
            try {
                try {
                    try {
                        fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
                        bufferedReader = new BufferedReader(fileReader, 8192);
                        try {
                            try {
                                line4 = bufferedReader.readLine();
                                if (oi0.c.g(line4)) {
                                    strTrim2 = line4.trim();
                                    bufferedReader.close();
                                    fileReader.close();
                                } else {
                                    bufferedReader.close();
                                    fileReader.close();
                                    strTrim2 = "";
                                }
                            } catch (Throwable unused38) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable unused39) {
                                    }
                                }
                                if (fileReader != null) {
                                }
                                strTrim2 = "";
                                if (oi0.c.g(strTrim2)) {
                                    fileReader3 = new FileReader("/proc/cpuinfo");
                                    bufferedReader3 = new BufferedReader(fileReader3, 8192);
                                    while (true) {
                                        line3 = bufferedReader3.readLine();
                                        if (line3 != null) {
                                            break;
                                        }
                                        if (oi0.c.g(line3)) {
                                        }
                                    }
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    strTrim2 = strTrim;
                                }
                                map.put("AD13", strTrim2);
                                fileReader2 = new FileReader("/proc/meminfo");
                                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                                line2 = bufferedReader2.readLine();
                                if (line2 != null) {
                                    j8 = Integer.parseInt(line2.split("\\s+")[1]);
                                } else {
                                    j8 = 0;
                                }
                                fileReader2.close();
                                bufferedReader2.close();
                                map.put("AD14", String.valueOf(j8));
                                StatFs statFs13 = new StatFs(Environment.getDataDirectory().getPath());
                                blockCount = ((long) statFs13.getBlockCount()) * ((long) statFs13.getBlockSize());
                                map.put("AD15", String.valueOf(blockCount));
                                StatFs statFs14 = new StatFs("/sdcard");
                                blockSize = ((long) statFs14.getBlockSize()) * ((long) statFs14.getBlockCount());
                                map.put("AD16", String.valueOf(blockSize));
                                map.put("AD17", "");
                                telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                                if (telephonyManager2 != null) {
                                    strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                                } else {
                                    strValueOf2 = "";
                                }
                                map.put("AD19", strValueOf2);
                                Class<?> cls4 = Class.forName("android.os.SystemProperties");
                                str2 = (String) cls4.getMethod("get", String.class, String.class).invoke(cls4.newInstance(), "gsm.version.baseband", "no message");
                                map.put("AD20", str2 != null ? str2 : "");
                                map.put("AD22", "");
                                jSONArray = new JSONArray();
                                if (context != null) {
                                    sensorManager = (SensorManager) context.getSystemService("sensor");
                                    if (sensorManager != null) {
                                        while (r8.hasNext()) {
                                            if (sensor2 != null) {
                                                JSONObject jSONObject8 = new JSONObject();
                                                jSONObject8.put("name", sensor2.getName());
                                                jSONObject8.put("version", sensor2.getVersion());
                                                jSONObject8.put("vendor", sensor2.getVendor());
                                                jSONArray.put(jSONObject8);
                                            }
                                        }
                                    }
                                }
                                string3 = jSONArray.toString();
                                str3 = "";
                                if (!oi0.c.g(string3)) {
                                    byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
                                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream4);
                                    bArr = new byte[1024];
                                    while (true) {
                                        i14 = byteArrayInputStream.read(bArr, 0, 1024);
                                        if (i14 != -1) {
                                            break;
                                            break;
                                        }
                                        gZIPOutputStream.write(bArr, 0, i14);
                                    }
                                    gZIPOutputStream.flush();
                                    gZIPOutputStream.close();
                                    byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.flush();
                                    byteArrayOutputStream4.close();
                                    byteArrayInputStream.close();
                                    str3 = new String(Base64.encode(byteArray4, 2));
                                }
                                map.put("AD24", str3);
                                synchronized (bVar) {
                                    strA2 = hg.d.a("NetworkOperatorName");
                                    if (strA2 == null) {
                                        if (context != null) {
                                            telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                            if (telephonyManager != null) {
                                                strA2 = telephonyManager.getNetworkOperatorName();
                                            }
                                        }
                                        if (strA2 != null) {
                                            strA2 = "";
                                        } else {
                                            strA2 = "";
                                        }
                                        hg.d.b("NetworkOperatorName", strA2);
                                    }
                                    map.put("AD26", strA2);
                                    sb7 = new StringBuilder();
                                    strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
                                    sb7.append("00:");
                                    while (i19 < 7) {
                                        if (new File(strArr3[i19]).exists()) {
                                            str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                        } else {
                                            str10 = "0";
                                        }
                                        sb7.append(str10);
                                    }
                                    string4 = sb7.toString();
                                    map.put("AD27", string4);
                                    sb3 = new StringBuilder("00:");
                                    linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
                                    linkedHashMap.put("/proc/tty/drivers", "goldfish");
                                    linkedHashMap.put("/proc/cpuinfo", "goldfish");
                                    while (r9.hasNext()) {
                                        lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
                                        while (true) {
                                            line = lineNumberReader2.readLine();
                                            if (line != null) {
                                                c16 = '0';
                                                break;
                                            }
                                            if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                                                c16 = '1';
                                                break;
                                            }
                                        }
                                        sb3.append(c16);
                                        lineNumberReader2.close();
                                    }
                                    map.put("AD28", sb3.toString());
                                    sb4 = new StringBuilder("00:");
                                    linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("ro.hardware", "goldfish");
                                    linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                    linkedHashMap2.put("ro.product.device", "generic");
                                    linkedHashMap2.put("ro.product.model", "sdk");
                                    linkedHashMap2.put("ro.product.brand", "generic");
                                    linkedHashMap2.put("ro.product.name", "sdk");
                                    linkedHashMap2.put("ro.build.fingerprint", "test-keys");
                                    linkedHashMap2.put("ro.product.manufacturer", "unknow");
                                    while (r9.hasNext()) {
                                        String str112 = (String) linkedHashMap2.get(str14);
                                        str9 = "";
                                        z16 = z14;
                                        str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
                                        if (str9 == null) {
                                            c15 = '0';
                                        } else {
                                            c15 = '0';
                                        }
                                        sb4.append(c15);
                                        z14 = z16;
                                    }
                                    z15 = z14;
                                    map.put("AD29", sb4.toString());
                                    strArr = new String[]{"dalvik.system.Taint"};
                                    sb5 = new StringBuilder("00:");
                                    while (i15 <= 0) {
                                        Class.forName(strArr[z15 ? 1 : 0]);
                                        sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                    }
                                    map.put("AD30", sb5.toString());
                                    sb6 = new StringBuilder("00:");
                                    linkedHashMap3 = new LinkedHashMap();
                                    linkedHashMap3.put("BRAND", "generic");
                                    linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
                                    linkedHashMap3.put("DEVICE", "generic");
                                    linkedHashMap3.put("HARDWARE", "goldfish");
                                    linkedHashMap3.put("PRODUCT", "sdk");
                                    linkedHashMap3.put("MODEL", "sdk");
                                    while (r7.hasNext()) {
                                        str8 = (String) Build.class.getField(str16).get(null);
                                        String str113 = (String) linkedHashMap3.get(str16);
                                        if (str8 != null) {
                                            lowerCase = str8.toLowerCase();
                                        } else {
                                            lowerCase = null;
                                        }
                                        if (lowerCase == null) {
                                            c14 = '0';
                                        } else {
                                            c14 = '0';
                                        }
                                        sb6.append(c14);
                                    }
                                    map.put("AD31", sb6.toString());
                                    map.put("AD32", hg.b.b());
                                    StringBuilder sb17 = new StringBuilder();
                                    sb17.append(SystemClock.elapsedRealtime());
                                    string5 = sb17.toString();
                                    map.put("AD33", string5);
                                    if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                                        str4 = "0:0";
                                    } else {
                                        strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                                        jMax = 0;
                                        while (i18 < 5) {
                                            jLastModified = new File(strArr2[i18]).lastModified();
                                            jMax = Math.max(jLastModified, jMax);
                                        }
                                        str4 = "1:" + jMax;
                                    }
                                    map.put("AD34", str4);
                                    Intent intentRegisterReceiver4 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                    int intExtra5 = intentRegisterReceiver4.getIntExtra("level", -1);
                                    intExtra = intentRegisterReceiver4.getIntExtra("status", -1);
                                    if (intExtra != 2) {
                                        r14 = 1;
                                    } else {
                                        r14 = 1;
                                    }
                                    StringBuilder sb18 = new StringBuilder();
                                    if (r14 != 0) {
                                        str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                    } else {
                                        str7 = "0";
                                    }
                                    sb18.append(str7);
                                    sb18.append(":");
                                    sb18.append(intExtra5);
                                    string6 = sb18.toString();
                                    map.put("AD35", string6);
                                    str5 = "";
                                    strC = hg.b.c(context);
                                    String strD4 = bVar.d();
                                    if (oi0.c.k(strC)) {
                                        str5 = strC + ":" + bVar.d();
                                    }
                                    map.put("AD36", str5);
                                    displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
                                    map.put("AD37", displayName != null ? displayName : "");
                                    string7 = Locale.getDefault().toString();
                                    map.put("AD38", string7 != null ? string7 : "");
                                    i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
                                    if (i16 == 1) {
                                        str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                    } else {
                                        str6 = "0";
                                    }
                                    map.put("AD39", str6);
                                    JSONObject jSONObject9 = new JSONObject();
                                    audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                    if (audioManager.getRingerMode() == 0) {
                                        i17 = 1;
                                    } else {
                                        i17 = 0;
                                    }
                                    int streamVolume16 = audioManager.getStreamVolume(0);
                                    int streamVolume17 = audioManager.getStreamVolume(1);
                                    int streamVolume18 = audioManager.getStreamVolume(2);
                                    int streamVolume19 = audioManager.getStreamVolume(3);
                                    int streamVolume110 = audioManager.getStreamVolume(4);
                                    jSONObject9.put("ringermode", String.valueOf(i17));
                                    jSONObject9.put("call", String.valueOf(streamVolume16));
                                    jSONObject9.put("system", String.valueOf(streamVolume17));
                                    jSONObject9.put("ring", String.valueOf(streamVolume18));
                                    jSONObject9.put("music", String.valueOf(streamVolume19));
                                    jSONObject9.put("alarm", String.valueOf(streamVolume110));
                                    map.put("AD40", jSONObject9.toString());
                                    StatFs statFs15 = new StatFs(Environment.getDataDirectory().getPath());
                                    availableBlocks = ((long) statFs15.getAvailableBlocks()) * ((long) statFs15.getBlockSize());
                                    map.put("AD41", String.valueOf(availableBlocks));
                                    StatFs statFs16 = new StatFs("/sdcard");
                                    blockSize2 = ((long) statFs16.getBlockSize()) * ((long) statFs16.getAvailableBlocks());
                                    map.put("AD42", String.valueOf(blockSize2));
                                    return map;
                                }
                            }
                            try {
                                fileReader2 = new FileReader("/proc/meminfo");
                                bufferedReader2 = new BufferedReader(fileReader2, 8192);
                                try {
                                    line2 = bufferedReader2.readLine();
                                    if (line2 != null) {
                                        j8 = Integer.parseInt(line2.split("\\s+")[1]);
                                    } else {
                                        j8 = 0;
                                    }
                                    try {
                                        fileReader2.close();
                                    } catch (Throwable unused40) {
                                    }
                                } catch (Throwable unused41) {
                                    if (fileReader2 != null) {
                                        try {
                                            fileReader2.close();
                                        } catch (Throwable unused42) {
                                        }
                                    }
                                    j8 = 0;
                                    if (bufferedReader2 != null) {
                                    }
                                    map.put("AD14", String.valueOf(j8));
                                    StatFs statFs17 = new StatFs(Environment.getDataDirectory().getPath());
                                    blockCount = ((long) statFs17.getBlockCount()) * ((long) statFs17.getBlockSize());
                                    map.put("AD15", String.valueOf(blockCount));
                                    StatFs statFs18 = new StatFs("/sdcard");
                                    blockSize = ((long) statFs18.getBlockSize()) * ((long) statFs18.getBlockCount());
                                    map.put("AD16", String.valueOf(blockSize));
                                    map.put("AD17", "");
                                    telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                                    if (telephonyManager2 != null) {
                                        strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                                    } else {
                                        strValueOf2 = "";
                                    }
                                    map.put("AD19", strValueOf2);
                                    Class<?> cls5 = Class.forName("android.os.SystemProperties");
                                    str2 = (String) cls5.getMethod("get", String.class, String.class).invoke(cls5.newInstance(), "gsm.version.baseband", "no message");
                                    map.put("AD20", str2 != null ? str2 : "");
                                    map.put("AD22", "");
                                    jSONArray = new JSONArray();
                                    if (context != null) {
                                        sensorManager = (SensorManager) context.getSystemService("sensor");
                                        if (sensorManager != null) {
                                            while (r8.hasNext()) {
                                                if (sensor2 != null) {
                                                    JSONObject jSONObject10 = new JSONObject();
                                                    jSONObject10.put("name", sensor2.getName());
                                                    jSONObject10.put("version", sensor2.getVersion());
                                                    jSONObject10.put("vendor", sensor2.getVendor());
                                                    jSONArray.put(jSONObject10);
                                                }
                                            }
                                        }
                                    }
                                    string3 = jSONArray.toString();
                                    str3 = "";
                                    if (!oi0.c.g(string3)) {
                                        byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
                                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream5);
                                        bArr = new byte[1024];
                                        while (true) {
                                            i14 = byteArrayInputStream.read(bArr, 0, 1024);
                                            if (i14 != -1) {
                                                break;
                                                break;
                                            }
                                            gZIPOutputStream.write(bArr, 0, i14);
                                        }
                                        gZIPOutputStream.flush();
                                        gZIPOutputStream.close();
                                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                                        byteArrayOutputStream5.flush();
                                        byteArrayOutputStream5.close();
                                        byteArrayInputStream.close();
                                        str3 = new String(Base64.encode(byteArray5, 2));
                                    }
                                    map.put("AD24", str3);
                                    synchronized (bVar) {
                                        strA2 = hg.d.a("NetworkOperatorName");
                                        if (strA2 == null) {
                                            if (context != null) {
                                                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                                if (telephonyManager != null) {
                                                    strA2 = telephonyManager.getNetworkOperatorName();
                                                }
                                            }
                                            if (strA2 != null) {
                                                strA2 = "";
                                            } else {
                                                strA2 = "";
                                            }
                                            hg.d.b("NetworkOperatorName", strA2);
                                        }
                                        map.put("AD26", strA2);
                                        sb7 = new StringBuilder();
                                        strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
                                        sb7.append("00:");
                                        while (i19 < 7) {
                                            if (new File(strArr3[i19]).exists()) {
                                                str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                            } else {
                                                str10 = "0";
                                            }
                                            sb7.append(str10);
                                        }
                                        string4 = sb7.toString();
                                        map.put("AD27", string4);
                                        sb3 = new StringBuilder("00:");
                                        linkedHashMap = new LinkedHashMap();
                                        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
                                        linkedHashMap.put("/proc/tty/drivers", "goldfish");
                                        linkedHashMap.put("/proc/cpuinfo", "goldfish");
                                        while (r9.hasNext()) {
                                            lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
                                            while (true) {
                                                line = lineNumberReader2.readLine();
                                                if (line != null) {
                                                    c16 = '0';
                                                    break;
                                                }
                                                if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                                                    c16 = '1';
                                                    break;
                                                }
                                            }
                                            sb3.append(c16);
                                            lineNumberReader2.close();
                                        }
                                        map.put("AD28", sb3.toString());
                                        sb4 = new StringBuilder("00:");
                                        linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap2.put("ro.hardware", "goldfish");
                                        linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                        linkedHashMap2.put("ro.product.device", "generic");
                                        linkedHashMap2.put("ro.product.model", "sdk");
                                        linkedHashMap2.put("ro.product.brand", "generic");
                                        linkedHashMap2.put("ro.product.name", "sdk");
                                        linkedHashMap2.put("ro.build.fingerprint", "test-keys");
                                        linkedHashMap2.put("ro.product.manufacturer", "unknow");
                                        while (r9.hasNext()) {
                                            String str114 = (String) linkedHashMap2.get(str14);
                                            str9 = "";
                                            z16 = z14;
                                            str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
                                            if (str9 == null) {
                                                c15 = '0';
                                            } else {
                                                c15 = '0';
                                            }
                                            sb4.append(c15);
                                            z14 = z16;
                                        }
                                        z15 = z14;
                                        map.put("AD29", sb4.toString());
                                        strArr = new String[]{"dalvik.system.Taint"};
                                        sb5 = new StringBuilder("00:");
                                        while (i15 <= 0) {
                                            Class.forName(strArr[z15 ? 1 : 0]);
                                            sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                                        }
                                        map.put("AD30", sb5.toString());
                                        sb6 = new StringBuilder("00:");
                                        linkedHashMap3 = new LinkedHashMap();
                                        linkedHashMap3.put("BRAND", "generic");
                                        linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
                                        linkedHashMap3.put("DEVICE", "generic");
                                        linkedHashMap3.put("HARDWARE", "goldfish");
                                        linkedHashMap3.put("PRODUCT", "sdk");
                                        linkedHashMap3.put("MODEL", "sdk");
                                        while (r7.hasNext()) {
                                            str8 = (String) Build.class.getField(str16).get(null);
                                            String str115 = (String) linkedHashMap3.get(str16);
                                            if (str8 != null) {
                                                lowerCase = str8.toLowerCase();
                                            } else {
                                                lowerCase = null;
                                            }
                                            if (lowerCase == null) {
                                                c14 = '0';
                                            } else {
                                                c14 = '0';
                                            }
                                            sb6.append(c14);
                                        }
                                        map.put("AD31", sb6.toString());
                                        map.put("AD32", hg.b.b());
                                        StringBuilder sb19 = new StringBuilder();
                                        sb19.append(SystemClock.elapsedRealtime());
                                        string5 = sb19.toString();
                                        map.put("AD33", string5);
                                        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                                            str4 = "0:0";
                                        } else {
                                            strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                                            jMax = 0;
                                            while (i18 < 5) {
                                                jLastModified = new File(strArr2[i18]).lastModified();
                                                jMax = Math.max(jLastModified, jMax);
                                            }
                                            str4 = "1:" + jMax;
                                        }
                                        map.put("AD34", str4);
                                        Intent intentRegisterReceiver5 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                        int intExtra6 = intentRegisterReceiver5.getIntExtra("level", -1);
                                        intExtra = intentRegisterReceiver5.getIntExtra("status", -1);
                                        if (intExtra != 2) {
                                            r14 = 1;
                                        } else {
                                            r14 = 1;
                                        }
                                        StringBuilder sb110 = new StringBuilder();
                                        if (r14 != 0) {
                                            str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                        } else {
                                            str7 = "0";
                                        }
                                        sb110.append(str7);
                                        sb110.append(":");
                                        sb110.append(intExtra6);
                                        string6 = sb110.toString();
                                        map.put("AD35", string6);
                                        str5 = "";
                                        strC = hg.b.c(context);
                                        String strD5 = bVar.d();
                                        if (oi0.c.k(strC)) {
                                            str5 = strC + ":" + bVar.d();
                                        }
                                        map.put("AD36", str5);
                                        displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
                                        map.put("AD37", displayName != null ? displayName : "");
                                        string7 = Locale.getDefault().toString();
                                        map.put("AD38", string7 != null ? string7 : "");
                                        i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
                                        if (i16 == 1) {
                                            str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                                        } else {
                                            str6 = "0";
                                        }
                                        map.put("AD39", str6);
                                        JSONObject jSONObject11 = new JSONObject();
                                        audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                        if (audioManager.getRingerMode() == 0) {
                                            i17 = 1;
                                        } else {
                                            i17 = 0;
                                        }
                                        int streamVolume111 = audioManager.getStreamVolume(0);
                                        int streamVolume112 = audioManager.getStreamVolume(1);
                                        int streamVolume113 = audioManager.getStreamVolume(2);
                                        int streamVolume114 = audioManager.getStreamVolume(3);
                                        int streamVolume115 = audioManager.getStreamVolume(4);
                                        jSONObject11.put("ringermode", String.valueOf(i17));
                                        jSONObject11.put("call", String.valueOf(streamVolume111));
                                        jSONObject11.put("system", String.valueOf(streamVolume112));
                                        jSONObject11.put("ring", String.valueOf(streamVolume113));
                                        jSONObject11.put("music", String.valueOf(streamVolume114));
                                        jSONObject11.put("alarm", String.valueOf(streamVolume115));
                                        map.put("AD40", jSONObject11.toString());
                                        StatFs statFs19 = new StatFs(Environment.getDataDirectory().getPath());
                                        availableBlocks = ((long) statFs19.getAvailableBlocks()) * ((long) statFs19.getBlockSize());
                                        map.put("AD41", String.valueOf(availableBlocks));
                                        StatFs statFs110 = new StatFs("/sdcard");
                                        blockSize2 = ((long) statFs110.getBlockSize()) * ((long) statFs110.getAvailableBlocks());
                                        map.put("AD42", String.valueOf(blockSize2));
                                        return map;
                                    }
                                }
                            } catch (Throwable unused43) {
                                bufferedReader2 = null;
                                fileReader2 = null;
                            }
                            if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                                str4 = "0:0";
                            } else {
                                strArr2 = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
                                jMax = 0;
                                while (i18 < 5) {
                                    jLastModified = new File(strArr2[i18]).lastModified();
                                    jMax = Math.max(jLastModified, jMax);
                                }
                                str4 = "1:" + jMax;
                            }
                        } catch (Throwable unused44) {
                            str4 = "";
                        }
                    } catch (Throwable unused45) {
                        bufferedReader = null;
                        fileReader = null;
                    }
                    telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager2 != null) {
                        strValueOf2 = String.valueOf(telephonyManager2.getNetworkType());
                    } else {
                        strValueOf2 = "";
                    }
                } catch (Throwable unused46) {
                }
                strC = hg.b.c(context);
                String strD6 = bVar.d();
                if (oi0.c.k(strC) && oi0.c.k(strD6)) {
                    str5 = strC + ":" + bVar.d();
                }
            } catch (Throwable unused47) {
            }
            StatFs statFs111 = new StatFs("/sdcard");
            blockSize2 = ((long) statFs111.getBlockSize()) * ((long) statFs111.getAvailableBlocks());
        } catch (Throwable unused48) {
            blockSize2 = 0;
        }
        if (oi0.c.g(strTrim2)) {
            fileReader3 = new FileReader("/proc/cpuinfo");
            bufferedReader3 = new BufferedReader(fileReader3, 8192);
            while (true) {
                line3 = bufferedReader3.readLine();
                if (line3 != null) {
                    break;
                }
                if (oi0.c.g(line3) && (strArrSplit = line3.split(":")) != null && strArrSplit.length > 1 && strArrSplit[0].contains("BogoMIPS")) {
                    strTrim = strArrSplit[1].trim();
                    break;
                }
            }
            fileReader3.close();
            bufferedReader3.close();
            strTrim2 = strTrim;
        }
        map.put("AD13", strTrim2);
        try {
            bufferedReader2.close();
        } catch (Throwable unused49) {
        }
        map.put("AD14", String.valueOf(j8));
        try {
            StatFs statFs112 = new StatFs(Environment.getDataDirectory().getPath());
            blockCount = ((long) statFs112.getBlockCount()) * ((long) statFs112.getBlockSize());
        } catch (Throwable unused50) {
            blockCount = 0;
        }
        map.put("AD15", String.valueOf(blockCount));
        try {
            StatFs statFs113 = new StatFs("/sdcard");
            blockSize = ((long) statFs113.getBlockSize()) * ((long) statFs113.getBlockCount());
        } catch (Throwable unused51) {
            blockSize = 0;
        }
        map.put("AD16", String.valueOf(blockSize));
        map.put("AD17", "");
        map.put("AD19", strValueOf2);
        try {
            Class<?> cls6 = Class.forName("android.os.SystemProperties");
            str2 = (String) cls6.getMethod("get", String.class, String.class).invoke(cls6.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused52) {
            str2 = "";
        }
        map.put("AD20", str2 != null ? str2 : "");
        map.put("AD22", "");
        jSONArray = new JSONArray();
        if (context != null) {
            sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null && (sensorList2 = sensorManager.getSensorList(-1)) != null && sensorList2.size() > 0) {
                while (r8.hasNext()) {
                    if (sensor2 != null) {
                        JSONObject jSONObject12 = new JSONObject();
                        jSONObject12.put("name", sensor2.getName());
                        jSONObject12.put("version", sensor2.getVersion());
                        jSONObject12.put("vendor", sensor2.getVendor());
                        jSONArray.put(jSONObject12);
                    }
                }
            }
        }
        string3 = jSONArray.toString();
        str3 = "";
        if (!oi0.c.g(string3)) {
            byteArrayInputStream = new ByteArrayInputStream(string3.getBytes("utf-8"));
            ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream6);
            bArr = new byte[1024];
            while (true) {
                i14 = byteArrayInputStream.read(bArr, 0, 1024);
                if (i14 != -1) {
                    break;
                    break;
                }
                gZIPOutputStream.write(bArr, 0, i14);
            }
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
            byteArrayOutputStream6.flush();
            byteArrayOutputStream6.close();
            byteArrayInputStream.close();
            str3 = new String(Base64.encode(byteArray6, 2));
        }
        map.put("AD24", str3);
        synchronized (bVar) {
            strA2 = hg.d.a("NetworkOperatorName");
            if (strA2 == null) {
                if (context != null) {
                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        strA2 = telephonyManager.getNetworkOperatorName();
                    }
                }
                if (strA2 != null || BuildConfig.TRAVIS.equals(strA2)) {
                    strA2 = "";
                }
                hg.d.b("NetworkOperatorName", strA2);
            }
        }
        map.put("AD26", strA2);
        try {
            sb7 = new StringBuilder();
            strArr3 = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb7.append("00:");
            while (i19 < 7) {
                if (new File(strArr3[i19]).exists()) {
                    str10 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
                } else {
                    str10 = "0";
                }
                sb7.append(str10);
            }
            string4 = sb7.toString();
        } catch (Throwable unused53) {
            string4 = "";
        }
        map.put("AD27", string4);
        sb3 = new StringBuilder("00:");
        linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        while (r9.hasNext()) {
            lineNumberReader2 = new LineNumberReader(new InputStreamReader(new FileInputStream(str13)));
            while (true) {
                line = lineNumberReader2.readLine();
                if (line != null) {
                    c16 = '0';
                    break;
                }
                if (line.toLowerCase().contains((CharSequence) linkedHashMap.get(str13))) {
                    c16 = '1';
                    break;
                }
            }
            sb3.append(c16);
            lineNumberReader2.close();
        }
        map.put("AD28", sb3.toString());
        sb4 = new StringBuilder("00:");
        linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("ro.hardware", "goldfish");
        linkedHashMap2.put("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        linkedHashMap2.put("ro.product.device", "generic");
        linkedHashMap2.put("ro.product.model", "sdk");
        linkedHashMap2.put("ro.product.brand", "generic");
        linkedHashMap2.put("ro.product.name", "sdk");
        linkedHashMap2.put("ro.build.fingerprint", "test-keys");
        linkedHashMap2.put("ro.product.manufacturer", "unknow");
        while (r9.hasNext()) {
            String str116 = (String) linkedHashMap2.get(str14);
            str9 = "";
            z16 = z14;
            str9 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str14, "");
            if (str9 == null && str9.contains(str116)) {
                c15 = '1';
            } else {
                c15 = '0';
            }
            sb4.append(c15);
            z14 = z16;
        }
        z15 = z14;
        map.put("AD29", sb4.toString());
        strArr = new String[]{"dalvik.system.Taint"};
        sb5 = new StringBuilder("00:");
        while (i15 <= 0) {
            Class.forName(strArr[z15 ? 1 : 0]);
            sb5.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        map.put("AD30", sb5.toString());
        sb6 = new StringBuilder("00:");
        linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("BRAND", "generic");
        linkedHashMap3.put("BOARD", PrivacyUpdateRequestError.UNKNOWN);
        linkedHashMap3.put("DEVICE", "generic");
        linkedHashMap3.put("HARDWARE", "goldfish");
        linkedHashMap3.put("PRODUCT", "sdk");
        linkedHashMap3.put("MODEL", "sdk");
        while (r7.hasNext()) {
            str8 = (String) Build.class.getField(str16).get(null);
            String str117 = (String) linkedHashMap3.get(str16);
            if (str8 != null) {
                lowerCase = str8.toLowerCase();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null && lowerCase.contains(str117)) {
                c14 = '1';
            } else {
                c14 = '0';
            }
            sb6.append(c14);
        }
        map.put("AD31", sb6.toString());
        map.put("AD32", hg.b.b());
        try {
            StringBuilder sb111 = new StringBuilder();
            sb111.append(SystemClock.elapsedRealtime());
            string5 = sb111.toString();
        } catch (Throwable unused54) {
            string5 = "";
        }
        map.put("AD33", string5);
        map.put("AD34", str4);
        try {
            Intent intentRegisterReceiver6 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra7 = intentRegisterReceiver6.getIntExtra("level", -1);
            intExtra = intentRegisterReceiver6.getIntExtra("status", -1);
            if (intExtra != 2 || intExtra == 5) {
                r14 = 1;
            } else {
                r14 = z15 ? 1 : 0;
            }
            StringBuilder sb112 = new StringBuilder();
            if (r14 != 0) {
                str7 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } else {
                str7 = "0";
            }
            sb112.append(str7);
            sb112.append(":");
            sb112.append(intExtra7);
            string6 = sb112.toString();
        } catch (Throwable unused55) {
            string6 = "";
        }
        map.put("AD35", string6);
        str5 = "";
        map.put("AD36", str5);
        try {
            displayName = TimeZone.getDefault().getDisplayName(z15, z15 ? 1 : 0);
        } catch (Throwable unused56) {
            displayName = "";
        }
        map.put("AD37", displayName != null ? displayName : "");
        try {
            string7 = Locale.getDefault().toString();
        } catch (Throwable unused57) {
            string7 = "";
        }
        map.put("AD38", string7 != null ? string7 : "");
        try {
            i16 = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused58) {
            i16 = 0;
        }
        if (i16 == 1) {
            str6 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
        } else {
            str6 = "0";
        }
        map.put("AD39", str6);
        JSONObject jSONObject13 = new JSONObject();
        try {
            audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager.getRingerMode() == 0) {
                i17 = 1;
            } else {
                i17 = 0;
            }
            int streamVolume116 = audioManager.getStreamVolume(0);
            int streamVolume117 = audioManager.getStreamVolume(1);
            int streamVolume118 = audioManager.getStreamVolume(2);
            int streamVolume119 = audioManager.getStreamVolume(3);
            int streamVolume1110 = audioManager.getStreamVolume(4);
            jSONObject13.put("ringermode", String.valueOf(i17));
            jSONObject13.put("call", String.valueOf(streamVolume116));
            jSONObject13.put("system", String.valueOf(streamVolume117));
            jSONObject13.put("ring", String.valueOf(streamVolume118));
            jSONObject13.put("music", String.valueOf(streamVolume119));
            jSONObject13.put("alarm", String.valueOf(streamVolume1110));
        } catch (Throwable unused59) {
        }
        map.put("AD40", jSONObject13.toString());
        try {
            StatFs statFs114 = new StatFs(Environment.getDataDirectory().getPath());
            availableBlocks = ((long) statFs114.getAvailableBlocks()) * ((long) statFs114.getBlockSize());
        } catch (Throwable unused60) {
            availableBlocks = 0;
        }
        map.put("AD41", String.valueOf(availableBlocks));
        map.put("AD42", String.valueOf(blockSize2));
        return map;
    }
}
