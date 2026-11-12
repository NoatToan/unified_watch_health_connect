package com.huawei.phoneservice.feedbackcommon.utils;

import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import com.huawei.secure.android.common.util.HexUtil;
import defpackage.zom;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ZipUtil {
    public static final int DEFAULT_SPLIT_VOLUME_SIZE = 33554432;
    private static final int FILE_MIN_NUMBER = 1;
    private static final int INITIAL_CAPACITY = 16;
    private static final String TAG = "ZipUtil";
    private static long size;

    public static void setSize(long j) {
        size = j;
    }

    public static String mapToString(String str) {
        Set<Map.Entry<String, Object>> setEntrySet = getMap(str).entrySet();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : setEntrySet) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("&");
        }
        return sb.length() != 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public static int isZipSplitVolumeKeepFolder(String str, String str2, long j) {
        String message;
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (file2.exists()) {
                file2.delete();
            }
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            zom zomVar = new zom(file2);
            ZipParameters zipParameters = new ZipParameters();
            zipParameters.e(false);
            zipParameters.d(CompressionMethod.DEFLATE);
            zipParameters.b(CompressionLevel.MAXIMUM);
            if (0 == j) {
                zomVar.d(file, zipParameters, true, 33554432L);
                return 2;
            }
            zomVar.d(file, zipParameters, true, j);
            return 2;
        } catch (ZipException e) {
            message = e.getMessage();
            com.huawei.phoneservice.faq.base.util.g.c(TAG, message);
            return 1;
        } catch (Exception e2) {
            message = e2.getMessage();
            com.huawei.phoneservice.faq.base.util.g.c(TAG, message);
            return 1;
        }
    }

    private static boolean isValidFile(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public static void getSize(File[] fileArr) {
        if (fileArr == null || fileArr.length <= 0) {
            return;
        }
        for (File file : fileArr) {
            if (file.isFile()) {
                size += file.length();
            }
            if (file.isDirectory()) {
                getSize(file.listFiles());
            }
        }
    }

    public static long getSize() {
        return size;
    }

    private static Map<String, Object> getMap(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            HashMap map = new HashMap(16);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.get(next));
            }
            return map;
        } catch (JSONException e) {
            com.huawei.phoneservice.faq.base.util.g.c(TAG, e.getMessage());
            return null;
        }
    }

    public static Map<String, String> getCommonHeaderParameter(String str) {
        HashMap map = new HashMap(16);
        map.put("Content-type", FeedbackWebConstants.HEAD_CONTENT_TYPE_VALUE);
        if (str != null) {
            map.put("Authorization", str);
        }
        return map;
    }

    public static int fileToZip(String str, String str2, String str3, long j) {
        String message;
        String str4;
        try {
            File canonicalFile = new File(str).getCanonicalFile();
            if (canonicalFile.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String str5 = File.separator;
                sb.append(str5);
                sb.append(str3);
                sb.append(".zip");
                File canonicalFile2 = new File(sb.toString()).getCanonicalFile();
                File file = new File(str2);
                if (!file.exists()) {
                    file.mkdirs();
                }
                if (canonicalFile2.exists()) {
                    canonicalFile2.delete();
                }
                File[] fileArrListFiles = canonicalFile.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length >= 1) {
                    return isZipSplitVolumeKeepFolder(str, str2 + str5 + str3 + ".zip", j);
                }
                str4 = "SOURCE_FOLDER IS EMPTY";
            } else {
                str4 = "SOURCE_FILE NOT EXISTS";
            }
            com.huawei.phoneservice.faq.base.util.g.a(TAG, str4);
            return 0;
        } catch (FileNotFoundException unused) {
            message = "FileNotFoundException Exception";
            com.huawei.phoneservice.faq.base.util.g.c(TAG, message);
            return 0;
        } catch (IOException e) {
            message = e.getMessage();
            com.huawei.phoneservice.faq.base.util.g.c(TAG, message);
            return 0;
        } catch (Exception e2) {
            message = e2.getMessage();
            com.huawei.phoneservice.faq.base.util.g.c(TAG, message);
            return 0;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0040: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:20:0x0040 */
    public static String fileSha256(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        if (!isValidFile(file)) {
            com.huawei.phoneservice.faq.base.util.g.a("FileSHA256", "file is not valid");
            return "";
        }
        FileInputStream fileInputStream3 = null;
        try {
            try {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        while (true) {
                            int i = fileInputStream2.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            messageDigest.update(bArr, 0, i);
                            z = true;
                        }
                        String strByteArray2HexStr = z ? HexUtil.byteArray2HexStr(messageDigest.digest()) : null;
                        fileInputStream2.close();
                        return strByteArray2HexStr;
                    } catch (IOException e) {
                        e = e;
                        com.huawei.phoneservice.faq.base.util.g.a("FileSHA256", "IOException" + e.getMessage());
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        return null;
                    } catch (NoSuchAlgorithmException e2) {
                        e = e2;
                        com.huawei.phoneservice.faq.base.util.g.a("FileSHA256", "NoSuchAlgorithmException" + e.getMessage());
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        return null;
                    }
                } catch (IOException e3) {
                    com.huawei.phoneservice.faq.base.util.g.c(TAG, e3.getMessage());
                    return null;
                }
            } catch (IOException e4) {
                e = e4;
                fileInputStream2 = null;
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                fileInputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (IOException e6) {
                        com.huawei.phoneservice.faq.base.util.g.c(TAG, e6.getMessage());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream3 = fileInputStream;
        }
    }

    public static boolean deleteFile(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            deleteFile(file2);
        }
        return file.delete();
    }
}
