package com.huami.ecg.core.util;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\"\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0014J \u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010 \u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010$\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"R\u0016\u0010%\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010(\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010&¨\u0006,"}, d2 = {"Lcom/huami/ecg/core/util/EcgRawFileOp;", "", "Ljava/io/File;", "dataFile", "", "", GoogleApiAvailabilityLight.a, "uid", "c", "dir", "subDir", "fileName", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "type", "b", "", "data", "savedFile", "", "saveData", "append", "", "saveByteData", "readNormalizedUvData", "", "readNormalizedFloatUvData", "", "readNormalizedUVData", "file", "getFloatListWithFile", "saveFloatArrayData", "getBioIDPath", "", "secondtime", "getEcgFilterFile", "TAG", "Ljava/lang/String;", "BIOID_DIR", "FILTER_DIR", "TAG_FILE_NAME_FILTER", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgRawFileOp {

    @NotNull
    public static final String BIOID_DIR = "bioid";

    @NotNull
    public static final String FILTER_DIR = "filter";
    public static final EcgRawFileOp INSTANCE = new EcgRawFileOp();

    @NotNull
    public static final String TAG = "EcgRawFileOp";

    @NotNull
    public static final String TAG_FILE_NAME_FILTER = "ecg-filter";

    private EcgRawFileOp() {
    }

    private final File a(File dir, String subDir, String fileName) {
        if (!TextUtils.isEmpty(subDir) && !new File(dir, subDir).exists()) {
            new File(dir, subDir).mkdir();
        }
        if (TextUtils.isEmpty(subDir)) {
            return TextUtils.isEmpty(fileName) ? dir : new File(dir, fileName);
        }
        if (TextUtils.isEmpty(fileName)) {
            return new File(dir, subDir);
        }
        return new File(dir.getPath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + subDir, fileName);
    }

    private final File b(Context context, String type) {
        if (!AppUtil.INSTANCE.isExternalStorageAvailable()) {
            return context.getFilesDir();
        }
        File externalFilesDir = context.getExternalFilesDir(type);
        return externalFilesDir != null ? externalFilesDir : context.getFilesDir();
    }

    private final String c(String uid) {
        if (TextUtils.isEmpty(uid)) {
            uid = EcgData.DEFAULT_DIGIT_VALUE;
        }
        return uid + '-';
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x008b A[Catch: Exception -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x003f, blocks: (B:20:0x003a, B:58:0x008b, B:75:0x00b3), top: B:108:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b3 A[Catch: Exception -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #10 {Exception -> 0x003f, blocks: (B:20:0x003a, B:58:0x008b, B:75:0x00b3), top: B:108:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private final List<String> d(File dataFile) throws Throwable {
        ?? r9;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader2;
        Exception e;
        FileNotFoundException e2;
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream((File) dataFile);
                    try {
                        dataFile = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                        try {
                            bufferedReader2 = new BufferedReader(dataFile);
                            while (true) {
                                try {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        try {
                                            break;
                                        } catch (Exception e3) {
                                            e3.printStackTrace();
                                        }
                                    } else if (line.length() > 0) {
                                        arrayList.add(line);
                                    }
                                } catch (FileNotFoundException e4) {
                                    e2 = e4;
                                    HMLog.i(TAG, e2.toString(), new Object[0]);
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    if (dataFile != 0) {
                                        try {
                                            dataFile.close();
                                        } catch (Exception e6) {
                                            e6.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                    return arrayList;
                                } catch (Exception e7) {
                                    e = e7;
                                    HMLog.i(TAG, e.toString(), new Object[0]);
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                        }
                                    }
                                    if (dataFile != 0) {
                                        try {
                                            dataFile.close();
                                        } catch (Exception e9) {
                                            e9.printStackTrace();
                                        }
                                    }
                                    if (bufferedReader2 != null) {
                                        bufferedReader2.close();
                                    }
                                    return arrayList;
                                }
                            }
                            fileInputStream.close();
                            try {
                                dataFile.close();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            bufferedReader2.close();
                        } catch (FileNotFoundException e11) {
                            bufferedReader2 = null;
                            e2 = e11;
                        } catch (Exception e12) {
                            bufferedReader2 = null;
                            e = e12;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = null;
                            fileInputStream2 = fileInputStream;
                            r9 = dataFile;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                            }
                            if (r9 != 0) {
                                try {
                                    r9.close();
                                } catch (Exception e14) {
                                    e14.printStackTrace();
                                }
                            }
                            if (bufferedReader != null) {
                                throw th;
                            }
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Exception e15) {
                                e15.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e16) {
                        e = e16;
                        bufferedReader2 = null;
                        e2 = e;
                        dataFile = bufferedReader2;
                        HMLog.i(TAG, e2.toString(), new Object[0]);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (dataFile != 0) {
                            dataFile.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return arrayList;
                    } catch (Exception e17) {
                        e = e17;
                        bufferedReader2 = null;
                        e = e;
                        dataFile = bufferedReader2;
                        HMLog.i(TAG, e.toString(), new Object[0]);
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (dataFile != 0) {
                            dataFile.close();
                        }
                        if (bufferedReader2 != null) {
                            bufferedReader2.close();
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        dataFile = 0;
                        bufferedReader = null;
                    }
                } catch (Exception e18) {
                    e18.printStackTrace();
                }
            } catch (FileNotFoundException e19) {
                e = e19;
                fileInputStream = null;
                bufferedReader2 = null;
            } catch (Exception e20) {
                e = e20;
                fileInputStream = null;
                bufferedReader2 = null;
            } catch (Throwable th3) {
                th = th3;
                r9 = 0;
                bufferedReader = null;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (r9 != 0) {
                    r9.close();
                }
                if (bufferedReader != null) {
                    throw th;
                }
                bufferedReader.close();
                throw th;
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @NotNull
    public final File getBioIDPath(@NotNull String fileName) {
        return new File(b(EcgCore.INSTANCE.getContext(), BIOID_DIR).getPath() + File.separator + fileName);
    }

    @NotNull
    public final File getEcgFilterFile(@NotNull String uid, long secondtime) {
        return a(b(EcgCore.INSTANCE.getContext(), "filter"), uid, c(uid) + secondtime + "-ecg-filter.txt");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<Float> getFloatListWithFile(@Nullable File file) {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        Exception e;
        DataInputStream dataInputStream2;
        ArrayList arrayList = new ArrayList();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    dataInputStream2 = new DataInputStream(fileInputStream);
                    while (dataInputStream2.available() > 0) {
                        try {
                            arrayList.add(Float.valueOf(dataInputStream2.readFloat()));
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            if (dataInputStream2 != null) {
                                try {
                                    dataInputStream2.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            return arrayList;
                        }
                    }
                    try {
                        fileInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    try {
                        dataInputStream2.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    return arrayList;
                } catch (Exception e7) {
                    e = e7;
                    dataInputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    file = null;
                    fileInputStream2 = fileInputStream;
                    dataInputStream = file;
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (dataInputStream != 0) {
                        throw th;
                    }
                    try {
                        dataInputStream.close();
                        throw th;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            fileInputStream = null;
            e = e10;
            dataInputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            dataInputStream = 0;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (dataInputStream != 0) {
                throw th;
            }
            dataInputStream.close();
            throw th;
        }
    }

    @NotNull
    public final float[] readNormalizedFloatUvData(@Nullable File dataFile) {
        return CollectionsKt___CollectionsKt.toFloatArray(readNormalizedUVData(dataFile));
    }

    @NotNull
    public final List<Float> readNormalizedUVData(@Nullable File dataFile) throws Throwable {
        if (dataFile == null || !dataFile.exists()) {
            return new ArrayList(0);
        }
        List<String> listD = d(dataFile);
        ArrayList arrayList = new ArrayList(listD.size());
        Iterator<String> it2 = listD.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(EcgUtilKt.parseFloat(it2.next())));
        }
        return arrayList;
    }

    @Nullable
    public final double[] readNormalizedUvData(@Nullable File dataFile) throws Throwable {
        List<Float> normalizedUVData = readNormalizedUVData(dataFile);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(normalizedUVData, 10));
        Iterator<T> it2 = normalizedUVData.iterator();
        while (it2.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it2.next()).floatValue()));
        }
        return CollectionsKt___CollectionsKt.toDoubleArray(arrayList);
    }

    public final boolean saveByteData(@Nullable List<Byte> data, @Nullable File savedFile) throws Throwable {
        if (!((data == null || savedFile == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(savedFile);
                try {
                    fileOutputStream2.write(CollectionsKt___CollectionsKt.toByteArray(data));
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    HMLog.e(TAG, e.getMessage(), new Object[0]);
                    throw e;
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    HMLog.e(TAG, e.getMessage(), new Object[0]);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        } catch (Exception e7) {
            e = e7;
        }
    }

    public final boolean saveData(@Nullable double[] data, @Nullable File savedFile) throws IOException {
        return saveData(data, savedFile, false);
    }

    public final boolean saveFloatArrayData(@Nullable File file, @NotNull float[] data) {
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    try {
                        for (float f : data) {
                            dataOutputStream2.writeFloat(f);
                        }
                        dataOutputStream2.flush();
                        try {
                            dataOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            fileOutputStream.close();
                            return true;
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            return true;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        dataOutputStream = dataOutputStream2;
                        e.printStackTrace();
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream2;
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e7) {
                            e7.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception e8) {
                    e = e8;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.io.OutputStreamWriter] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final boolean saveData(@Nullable double[] data, @Nullable File savedFile, boolean append) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        if (!((data == null || savedFile == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        for (double d : data) {
            sb.append(d);
            sb.append(property);
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = append != 0 ? new FileOutputStream(savedFile, true) : new FileOutputStream(savedFile);
                try {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(fileOutputStream2, StandardCharsets.UTF_8);
                    try {
                        outputStreamWriter2.write(sb.toString());
                        outputStreamWriter2.flush();
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            outputStreamWriter2.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return true;
                    } catch (IOException e3) {
                        e = e3;
                        HMLog.e(TAG, e.getMessage(), new Object[0]);
                        throw e;
                    } catch (Exception e4) {
                        fileOutputStream = fileOutputStream2;
                        outputStreamWriter = outputStreamWriter2;
                        e = e4;
                        HMLog.e(TAG, e.getMessage(), new Object[0]);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        append = outputStreamWriter2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (append == 0) {
                            throw th;
                        }
                        try {
                            append.close();
                            throw th;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                } catch (Exception e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    outputStreamWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    append = 0;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Exception e12) {
            e = e12;
            outputStreamWriter = null;
        } catch (Throwable th4) {
            th = th4;
            append = 0;
        }
    }
}
