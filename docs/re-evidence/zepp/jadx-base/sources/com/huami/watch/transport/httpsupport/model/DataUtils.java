package com.huami.watch.transport.httpsupport.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import clc.utils.debug.slog.SlogConfig;
import clc.utils.debug.slog.SolidLogger;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.UUID;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class DataUtils {
    public static final String DPATH_PARENT = "/sdcard/.dpath";
    public static final String FIRST_LAUNCH_KEY = "__key_first_boot";
    private static final String a = "DataUtil";
    private static boolean b = false;

    public static class BytesZipUtil {
        public static byte[] gZip(byte[] bArr) {
            byte[] bArr2;
            GZIPOutputStream gZIPOutputStream;
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] byteArray = null;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        gZIPOutputStream.close();
                        byteArray = byteArrayOutputStream2.toByteArray();
                        byteArrayOutputStream2.close();
                        try {
                            byteArrayOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            gZIPOutputStream.close();
                            return byteArray;
                        } catch (IOException e2) {
                            e = e2;
                            e.printStackTrace();
                            return byteArray;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bArr2 = byteArray;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            th.printStackTrace();
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    e = e4;
                                    byteArray = bArr2;
                                    e.printStackTrace();
                                    return byteArray;
                                }
                            }
                            return bArr2;
                        } catch (Throwable th2) {
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (gZIPOutputStream == null) {
                                throw th2;
                            }
                            try {
                                gZIPOutputStream.close();
                                throw th2;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gZIPOutputStream = null;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    bArr2 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                bArr2 = null;
                gZIPOutputStream = null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15, types: [java.util.zip.GZIPInputStream] */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v20 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.util.zip.GZIPInputStream] */
        /* JADX WARN: Type inference failed for: r9v8, types: [java.util.zip.GZIPInputStream] */
        public static byte[] unGZip(byte[] bArr) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            ByteArrayOutputStream byteArrayOutputStream;
            ?? gZIPInputStream;
            byte[] bArr2;
            Throwable th;
            ?? r9;
            ByteArrayInputStream byteArrayInputStream2 = null;
            byte[] byteArray = null;
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    try {
                        byte[] bArr3 = new byte[1024];
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i = gZIPInputStream.read(bArr3, 0, 1024);
                                if (i == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr3, 0, i);
                            } catch (Exception e) {
                                e = e;
                                bArr2 = byteArray;
                                byteArrayInputStream2 = byteArrayInputStream;
                                gZIPInputStream = gZIPInputStream;
                                try {
                                    e.printStackTrace();
                                    if (byteArrayInputStream2 != null) {
                                        try {
                                            byteArrayInputStream2.close();
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                    if (gZIPInputStream != 0) {
                                        try {
                                            gZIPInputStream.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (IOException e4) {
                                            e = e4;
                                            byteArray = bArr2;
                                        }
                                    }
                                    return bArr2;
                                } catch (Throwable th2) {
                                    byteArrayInputStream = byteArrayInputStream2;
                                    th = th2;
                                    if (byteArrayInputStream != null) {
                                        try {
                                            byteArrayInputStream.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (gZIPInputStream != 0) {
                                        try {
                                            gZIPInputStream.close();
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                    if (byteArrayOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (byteArrayInputStream != null) {
                                    byteArrayInputStream.close();
                                }
                                if (gZIPInputStream != 0) {
                                    gZIPInputStream.close();
                                }
                                if (byteArrayOutputStream == null) {
                                    throw th;
                                }
                                byteArrayOutputStream.close();
                                throw th;
                            }
                            e.printStackTrace();
                            return byteArray;
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                            return byteArray;
                        } catch (IOException e10) {
                            e = e10;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        byteArrayOutputStream = null;
                        r9 = gZIPInputStream;
                        byteArrayInputStream2 = byteArrayInputStream;
                        bArr2 = byteArrayOutputStream;
                        gZIPInputStream = r9;
                        e.printStackTrace();
                        if (byteArrayInputStream2 != null) {
                            byteArrayInputStream2.close();
                        }
                        if (gZIPInputStream != 0) {
                            gZIPInputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return bArr2;
                    } catch (Throwable th4) {
                        byteArrayOutputStream = null;
                        th = th4;
                    }
                } catch (Exception e12) {
                    e = e12;
                    r9 = 0;
                    byteArrayOutputStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = null;
                    th = th;
                    gZIPInputStream = byteArrayOutputStream;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (gZIPInputStream != 0) {
                        gZIPInputStream.close();
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                gZIPInputStream = 0;
                bArr2 = null;
                byteArrayOutputStream = null;
            } catch (Throwable th6) {
                th = th6;
                byteArrayInputStream = null;
                byteArrayOutputStream = null;
            }
        }
    }

    public static final class DataItemKey {
        public static final String KEY_CODE = "key_code";
        public static final String KEY_EXTRA_HEADER = "key_header";
        private static final String a = "key_action";
        private static final String b = "key_data";
        private static final String c = "key_extra";
        private static final String d = "key_flags";
        private static final String e = "key_id";
        private static final String f = "key_method";
        private static final String g = "key_owner";
        private static final String h = "key_state";
        private static final String i = "key_timeout";
        private static final String j = "key_url";

        public static final class EXTRA {
            public static final String KEY_COMBO_RES_GETURL = "getURL";
            public static final String KEY_COMBO_RES_PUTURL = "putURL";
            public static final String KEY_DUMPED_EXTRA_PATH = "exf_path";
            public static final String KEY_EXTRA_EXTENSION_SLOT_FRAME = "extra_slot_frame";
            public static final String KEY_EXTRA_EXTENSION_SLOT_POINT = "extra_slot_point";
            public static final String KEY_EXTRA_FILE_DATA = "exf";
        }
    }

    private static void a(String str, String str2) {
        RandomAccessFile randomAccessFile;
        synchronized (DataUtils.class) {
            try {
                try {
                    randomAccessFile = new RandomAccessFile(str, "rw");
                } catch (FileNotFoundException e) {
                    try {
                        new File(str.substring(0, str.lastIndexOf(File.separator))).mkdirs();
                        new File(str).createNewFile();
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused) {
                            Log.i(SlogConfig.STORAGE_NAME, "file close failed : " + str, e);
                        }
                        randomAccessFile = randomAccessFile2;
                    } catch (IOException unused2) {
                        Log.i(SlogConfig.STORAGE_NAME, "file write failed : " + str, e);
                        return;
                    }
                }
                String string = str2.toString();
                try {
                    randomAccessFile.seek(randomAccessFile.length());
                    randomAccessFile.write(string.getBytes());
                    randomAccessFile.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static DataItem createDataBundleToDataItem(DataBundle dataBundle) {
        DataItem dataItem = new DataItem();
        dataItem.setAction(dataBundle.getString(Constants.KEY_ACTION));
        dataItem.setOwner(dataBundle.getString("key_owner"));
        dataItem.setUrl(dataBundle.getString("key_url"));
        dataItem.setState(dataBundle.getInt("key_state"));
        dataItem.setIdentifier(dataBundle.getString("key_id"));
        dataItem.setMethod(dataBundle.getString("key_method"));
        dataItem.setData(dataBundle.getString("key_data"));
        dataItem.setFlags(dataBundle.getInt("key_flags"));
        dataItem.setTimeout(dataBundle.getLong("key_timeout"));
        dataItem.setExtraData(dataBundle.getString("key_extra"));
        dataItem.setCode(dataBundle.getInt(DataItemKey.KEY_CODE));
        return dataItem;
    }

    public static DataBundle createDataItemToDataBundle(DataItem dataItem) {
        DataBundle dataBundle = new DataBundle();
        dataBundle.putString(Constants.KEY_ACTION, dataItem.getAction());
        dataBundle.putString("key_owner", dataItem.getOwner());
        dataBundle.putString("key_url", dataItem.getUrl());
        dataBundle.putInt("key_state", dataItem.getState());
        dataBundle.putString("key_id", dataItem.getIdentifier());
        dataBundle.putString("key_method", dataItem.getMethod());
        dataBundle.putString("key_data", dataItem.getData());
        dataBundle.putInt("key_flags", dataItem.getFlags());
        dataBundle.putLong("key_timeout", dataItem.getTimeout());
        dataBundle.putString("key_extra", dataItem.getExtraData().toString());
        dataBundle.putInt(DataItemKey.KEY_CODE, dataItem.getCode());
        return dataBundle;
    }

    public static final Long drawTimeStamp(DataItem dataItem) {
        Long lValueOf;
        if (dataItem == null) {
            return null;
        }
        String identifier = dataItem.getIdentifier();
        if (TextUtils.isEmpty(identifier)) {
            boolean z = GlobalDefine.DEBUG_SERIAL_MODE;
            if (z) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "====item =====>" + dataItem + " , but targetWho is NULL!");
            }
            if (z) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "====item =====>" + dataItem + " , but targetWho is NULL!");
            }
            return null;
        }
        String strSubstring = identifier.substring(identifier.lastIndexOf("_", identifier.length() - 1));
        if (TextUtils.isEmpty(strSubstring)) {
            boolean z2 = GlobalDefine.DEBUG_SERIAL_MODE;
            if (z2) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "====strTime =====>" + dataItem + " , time is NULL!");
            }
            if (z2) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "====strTime =====>" + dataItem + " , time is NULL!");
            }
            return null;
        }
        try {
            lValueOf = Long.valueOf(strSubstring);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            lValueOf = 0L;
        }
        if (lValueOf.longValue() == 0) {
            boolean z3 = GlobalDefine.DEBUG_SERIAL_MODE;
            if (z3) {
                Log.i(GlobalDefine.TAG_SERIAL_MODE, "Warning: ====parsed time is ))))) 0/NULL =====>" + dataItem);
            }
            if (z3) {
                SolidLogger.getInstance().with(GlobalDefine.TAG_SERIAL_MODE, "Warning: ====parsed time is ))))) 0/NULL =====>" + dataItem);
            }
        }
        return lValueOf;
    }

    public static final String drillUnzipData(DataItem dataItem) {
        if (dataItem == null) {
            return null;
        }
        try {
            String data = dataItem.getData();
            if (TextUtils.isEmpty(data)) {
                return null;
            }
            String strRemovePrefix = dataItem.removePrefix(data);
            if (TextUtils.isEmpty(strRemovePrefix)) {
                return "";
            }
            try {
                return new String(BytesZipUtil.unGZip(Base64.decode(strRemovePrefix, 0)));
            } catch (Exception unused) {
                return "";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final String generateId() {
        String strSubstring = UUID.randomUUID().toString().substring(0, 8);
        String strValueOf = String.valueOf(getTimeStamp());
        String strSubstring2 = strValueOf.substring(2, strValueOf.length() - 1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strSubstring);
        stringBuffer.append("_");
        stringBuffer.append(strSubstring2);
        return stringBuffer.toString();
    }

    public static final Long getTimeStamp() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static boolean isFirstBoot(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean z = defaultSharedPreferences.getBoolean(FIRST_LAUNCH_KEY, true);
        Log.i(a, "isFirstBoot: " + z);
        if (z) {
            b = true;
            defaultSharedPreferences.edit().putBoolean(FIRST_LAUNCH_KEY, false).commit();
        }
        return b;
    }

    public static String saveToFileAndManage(String str, String str2) {
        String str3;
        synchronized (DataUtils.class) {
            str3 = DPATH_PARENT + File.separator + str;
            File file = new File(str3);
            if (file.exists()) {
                file.delete();
            }
            a(str3, str2);
        }
        return str3;
    }
}
