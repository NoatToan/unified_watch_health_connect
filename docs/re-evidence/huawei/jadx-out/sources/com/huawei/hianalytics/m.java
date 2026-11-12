package com.huawei.hianalytics;

import android.app.ActivityManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.InflaterOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static String a() {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            List listA = f2.a().a();
            String label = (listA == null || listA.isEmpty() || (runningTaskInfo = (ActivityManager.RunningTaskInfo) listA.get(0)) == null || Build.VERSION.SDK_INT < 29) ? "" : runningTaskInfo.taskDescription.getLabel();
            if (!TextUtils.isEmpty(label)) {
                return label;
            }
            CharSequence charSequenceLoadLabel = f2.a().b().loadLabel(EnvUtils.getAppContext().getPackageManager());
            return charSequenceLoadLabel instanceof String ? (String) charSequenceLoadLabel : "";
        } catch (Throwable th) {
            HiLog.i("DcUtil", "getLabel ex: " + th.getMessage());
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static String a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        InflaterOutputStream inflaterOutputStream;
        String string = "";
        if (bArr == null || bArr.length < 1) {
            return "";
        }
        InflaterOutputStream inflaterOutputStream2 = null;
        inflaterOutputStream2 = null;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream);
                    try {
                        inflaterOutputStream.write(bArr);
                        string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.toString());
                        try {
                            inflaterOutputStream.close();
                        } catch (IOException e) {
                            HiLog.e("DcUtil", e.getMessage());
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        try {
                            HiLog.e("DcUtil", e.getMessage());
                            if (inflaterOutputStream != null) {
                                try {
                                    inflaterOutputStream.close();
                                } catch (IOException e3) {
                                    HiLog.e("DcUtil", e3.getMessage());
                                }
                            }
                            if (byteArrayOutputStream2 != null) {
                                byteArrayOutputStream2.close();
                            }
                            return string;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            inflaterOutputStream2 = inflaterOutputStream;
                            if (inflaterOutputStream2 != null) {
                                try {
                                    inflaterOutputStream2.close();
                                } catch (IOException e4) {
                                    HiLog.e("DcUtil", e4.getMessage());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th;
                                } catch (IOException e5) {
                                    HiLog.e("DcUtil", e5.getMessage());
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inflaterOutputStream2 = inflaterOutputStream;
                        if (inflaterOutputStream2 != null) {
                            inflaterOutputStream2.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    e = e6;
                    inflaterOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (inflaterOutputStream2 != null) {
                        inflaterOutputStream2.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (IOException e7) {
                HiLog.e("DcUtil", e7.getMessage());
            }
        } catch (IOException e8) {
            e = e8;
            inflaterOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        return string;
    }

    public static boolean a(String str) {
        if (!l.a().f11572c || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Iterator it = l.a().n.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str).matches()) {
                    return true;
                }
            }
        } catch (Throwable th) {
            HiLog.i("DcUtil", "isLiteAppPage fail: " + th.getMessage());
        }
        return false;
    }
}
