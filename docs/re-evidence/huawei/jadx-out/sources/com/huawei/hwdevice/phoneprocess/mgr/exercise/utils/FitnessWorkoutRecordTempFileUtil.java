package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import android.content.Context;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.xji;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class FitnessWorkoutRecordTempFileUtil {
    private static final String TAG = "FitnessWorkoutRecordTempFile";
    public static final String TEMP_WORKOUT_RECORD_FILE_PREFIX_NAME = "FitnessWorkoutRecord_";

    private FitnessWorkoutRecordTempFileUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:77:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[Catch: all -> 0x0141, SYNTHETIC, TryCatch #2 {, blocks: (B:8:0x000c, B:14:0x006d, B:17:0x007c, B:19:0x0081, B:16:0x0071, B:59:0x0113, B:63:0x0124, B:66:0x0133, B:65:0x0128, B:61:0x0117, B:37:0x00bf, B:41:0x00d0, B:43:0x00d4, B:39:0x00c3, B:48:0x00ee, B:52:0x00ff, B:54:0x0103, B:50:0x00f2, B:67:0x0134), top: B:74:0x0006, inners: #3, #5, #6, #8, #12, #14, #15, #17 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.ObjectOutputStream] */
    public static String saveTempFile(Context context, WorkoutRecord workoutRecord) {
        Throwable th;
        IOException e;
        synchronized (FitnessWorkoutRecordTempFileUtil.class) {
            ?? r3 = 0;
            ObjectOutputStream objectOutputStream = null;
            ObjectOutputStream objectOutputStream2 = null;
            ObjectOutputStream objectOutputStream3 = null;
            FileOutputStream fileOutputStream = null;
            FileOutputStream fileOutputStream2 = null;
            r3 = 0;
            if (context == 0 || workoutRecord == null) {
                LogUtil.a(TAG, "context or workoutRecord is null");
                return null;
            }
            String str = TEMP_WORKOUT_RECORD_FILE_PREFIX_NAME + System.currentTimeMillis() + ".tmp";
            try {
                try {
                    xji.a(new File(context.getFilesDir(), str).getCanonicalPath(), "S2", 0);
                    String strD = HiJsonUtil.d(workoutRecord);
                    LogUtil.a(TAG, "WorkoutRecord Save fileName:", str, ",saveData:", strD);
                    LogUtil.a(TAG, "WorkoutRecord Save:", strD);
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 0);
                    try {
                        ObjectOutputStream objectOutputStream4 = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                        try {
                            objectOutputStream4.writeObject(strD);
                            objectOutputStream4.flush();
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException unused) {
                                    LogUtil.j(TAG, "fileOutputStream close failed");
                                }
                            }
                            try {
                                objectOutputStream4.close();
                            } catch (IOException unused2) {
                                LogUtil.j(TAG, "fileOutputStream close failed");
                            }
                        } catch (FileNotFoundException unused3) {
                            objectOutputStream = objectOutputStream4;
                            ObjectOutputStream objectOutputStream5 = objectOutputStream;
                            fileOutputStream = fileOutputStreamOpenFileOutput;
                            context = objectOutputStream5;
                            LogUtil.a(TAG, "fileNotFound");
                            r3 = fileOutputStream;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    r3 = fileOutputStream;
                                } catch (IOException unused4) {
                                    String str2 = TAG;
                                    LogUtil.j(TAG, "fileOutputStream close failed");
                                    r3 = str2;
                                }
                                if (context != 0) {
                                    try {
                                        context.close();
                                    } catch (IOException unused5) {
                                        context = new Object[]{"fileOutputStream close failed"};
                                        LogUtil.j(TAG, context);
                                    }
                                }
                            } else if (context != 0) {
                                context.close();
                            }
                            return str;
                        } catch (IOException e2) {
                            e = e2;
                            objectOutputStream2 = objectOutputStream4;
                            ObjectOutputStream objectOutputStream6 = objectOutputStream2;
                            fileOutputStream2 = fileOutputStreamOpenFileOutput;
                            context = objectOutputStream6;
                            LogUtil.e(TAG, "saveWorkoutRecordTempFile", LogAnonymous.b(e));
                            r3 = fileOutputStream2;
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    r3 = fileOutputStream2;
                                } catch (IOException unused6) {
                                    String str3 = TAG;
                                    LogUtil.j(TAG, "fileOutputStream close failed");
                                    r3 = str3;
                                }
                                if (context != 0) {
                                    try {
                                        context.close();
                                    } catch (IOException unused7) {
                                        context = new Object[]{"fileOutputStream close failed"};
                                        LogUtil.j(TAG, context);
                                    }
                                }
                            } else if (context != 0) {
                                context.close();
                            }
                            return str;
                        } catch (Throwable th2) {
                            th = th2;
                            objectOutputStream3 = objectOutputStream4;
                            ObjectOutputStream objectOutputStream7 = objectOutputStream3;
                            r3 = fileOutputStreamOpenFileOutput;
                            context = objectOutputStream7;
                            if (r3 == 0) {
                                if (context != 0) {
                                    throw th;
                                }
                                context.close();
                                throw th;
                            }
                            try {
                                r3.close();
                            } catch (IOException unused8) {
                                LogUtil.j(TAG, "fileOutputStream close failed");
                            }
                            if (context != 0) {
                                throw th;
                            }
                            try {
                                context.close();
                                throw th;
                            } catch (IOException unused9) {
                                LogUtil.j(TAG, "fileOutputStream close failed");
                                throw th;
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException unused10) {
                    } catch (IOException e3) {
                        e = e3;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (FileNotFoundException unused11) {
                context = 0;
            } catch (IOException e4) {
                e = e4;
                context = 0;
            } catch (Throwable th5) {
                th = th5;
                context = 0;
            }
            return str;
        }
    }

    public static WorkoutRecord readWorkoutRecord(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.a(TAG, "readWorkoutRecord ", "context or workoutRecordTempFilePath is null");
            return null;
        }
        LogUtil.a(TAG, "WorkoutRecord read fileName:", str);
        WorkoutRecord workoutRecord = getWorkoutRecord(context, str);
        if (workoutRecord == null) {
            LogUtil.a(TAG, "WorkoutRecord is wrong, try temp file");
            workoutRecord = getWorkoutRecord(context, str);
        }
        LogUtil.a(TAG, "WorkoutRecord :", HiJsonUtil.d(workoutRecord));
        return workoutRecord;
    }

    public static WorkoutRecord getWorkoutRecord(Context context, String str) {
        return (WorkoutRecord) HiJsonUtil.d((String) getObjectFromFile(context, str, String.class), WorkoutRecord.class);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileInputStream] */
    private static <T> T getObjectFromFile(Context context, String str, Class<T> cls) throws Throwable {
        ?? r11;
        Throwable e;
        FileInputStream fileInputStreamOpenFileInput;
        ObjectInputStream objectInputStream;
        Context context2;
        String str2;
        Throwable th;
        ?? r5;
        T t = (T) null;
        if (context == null) {
            LogUtil.a(TAG, "getObjectFromFile ", "context is null");
            return null;
        }
        try {
            try {
                fileInputStreamOpenFileInput = context.openFileInput(str);
                try {
                    objectInputStream = new ObjectInputStream(fileInputStreamOpenFileInput);
                    try {
                        Object object = objectInputStream.readObject();
                        t = t;
                        if (cls != null && cls.isInstance(object)) {
                            t = t;
                            t = (T) object;
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException unused) {
                                LogUtil.a(TAG, "fileNotFound");
                            } catch (IOException e2) {
                                LogUtil.a(TAG, "fileInputStream ", LogAnonymous.b(e2));
                            }
                        }
                        try {
                            objectInputStream.close();
                        } catch (FileNotFoundException unused2) {
                            LogUtil.a(TAG, "fileNotFound");
                        } catch (IOException e3) {
                            LogUtil.a(TAG, "objectInputStream ", LogAnonymous.b(e3));
                        }
                    } catch (FileNotFoundException unused3) {
                        LogUtil.a(TAG, "fileNotFound");
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException unused4) {
                                LogUtil.a(TAG, "fileNotFound");
                            } catch (IOException e4) {
                                LogUtil.a(TAG, "fileInputStream ", LogAnonymous.b(e4));
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (FileNotFoundException unused5) {
                                LogUtil.a(TAG, "fileNotFound");
                            } catch (IOException e5) {
                                LogUtil.a(TAG, "objectInputStream ", LogAnonymous.b(e5));
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException unused6) {
                                LogUtil.a(TAG, "fileNotFound");
                            } catch (IOException e7) {
                                LogUtil.a(TAG, "fileInputStream ", LogAnonymous.b(e7));
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (FileNotFoundException unused7) {
                                LogUtil.a(TAG, "fileNotFound");
                            } catch (IOException e8) {
                                LogUtil.a(TAG, "objectInputStream ", LogAnonymous.b(e8));
                            }
                        }
                    } catch (ClassCastException e9) {
                        e = e9;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (IllegalMonitorStateException e11) {
                        e = e11;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (IllegalStateException e12) {
                        e = e12;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (NullPointerException e13) {
                        e = e13;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    }
                } catch (FileNotFoundException unused8) {
                    objectInputStream = null;
                } catch (IOException e15) {
                    e = e15;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (ClassCastException e16) {
                    e = e16;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (ClassNotFoundException e17) {
                    e = e17;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (IllegalMonitorStateException e18) {
                    e = e18;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (IllegalStateException e19) {
                    e = e19;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (NullPointerException e20) {
                    e = e20;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (OutOfMemoryError e21) {
                    e = e21;
                    e = e;
                    objectInputStream = null;
                    LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return t;
                } catch (Throwable th2) {
                    th = th2;
                    Context context3 = (T) fileInputStreamOpenFileInput;
                    str2 = null;
                    context2 = context3;
                    Throwable th3 = th;
                    r11 = str2;
                    th = th3;
                    r5 = context2;
                    if (r5 != 0) {
                        try {
                            r5.close();
                        } catch (FileNotFoundException unused9) {
                            LogUtil.a(TAG, "fileNotFound");
                        } catch (IOException e22) {
                            LogUtil.a(TAG, "fileInputStream ", LogAnonymous.b(e22));
                        }
                    }
                    if (r11 != 0) {
                        throw th;
                    }
                    try {
                        r11.close();
                        throw th;
                    } catch (FileNotFoundException unused10) {
                        LogUtil.a(TAG, "fileNotFound");
                        throw th;
                    } catch (IOException e23) {
                        LogUtil.a(TAG, "objectInputStream ", LogAnonymous.b(e23));
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                context2 = context;
                str2 = str;
                th = th4;
            }
        } catch (FileNotFoundException unused11) {
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
        } catch (IOException e24) {
            e = e24;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (ClassCastException e25) {
            e = e25;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (ClassNotFoundException e26) {
            e = e26;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (IllegalMonitorStateException e27) {
            e = e27;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (IllegalStateException e28) {
            e = e28;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (NullPointerException e29) {
            e = e29;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (OutOfMemoryError e30) {
            e = e30;
            e = e;
            fileInputStreamOpenFileInput = null;
            objectInputStream = null;
            LogUtil.a(TAG, "getObjectFromFile ", LogAnonymous.b(e));
            if (fileInputStreamOpenFileInput != null) {
                fileInputStreamOpenFileInput.close();
            }
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            return t;
        } catch (Throwable th5) {
            th = th5;
            r11 = 0;
            r5 = t;
            if (r5 != 0) {
                r5.close();
            }
            if (r11 != 0) {
                throw th;
            }
            r11.close();
            throw th;
        }
        return t;
    }

    public static void deleteTempFile(Context context, String str) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            ReleaseLogUtil.e(TAG, "deleteFile filesDir is null");
        } else {
            FileUtils.e(new File(filesDir, str));
        }
    }
}
