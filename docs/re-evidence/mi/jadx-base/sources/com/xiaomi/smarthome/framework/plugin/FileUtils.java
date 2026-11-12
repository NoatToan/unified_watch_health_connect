package com.xiaomi.smarthome.framework.plugin;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.work.Data;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtils {
    public static final String STD_PLUGIN_STORAGE_PATH_KEY = "std-plugin";
    private static final String TAG = "FileUtils";

    public static void cacheResFile(@Nullable Context context, int i, @NotNull File file) throws Throwable {
        if (file.exists()) {
            return;
        }
        try {
            copy(context.getResources().openRawResource(i), new FileOutputStream(file));
        } catch (Exception unused) {
        }
    }

    public static void close(Closeable closeable) {
        closeQuietly(closeable);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        long j = 0;
        if (inputStream == null || outputStream == null) {
            return 0L;
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            byte[] bArr = new byte[16384];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
                while (true) {
                    try {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            close(bufferedInputStream2);
                            close(bufferedOutputStream);
                            return j;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        j += (long) i;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream = bufferedInputStream2;
                        close(bufferedInputStream);
                        close(bufferedOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    public static boolean copyAsserts(Context context, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        File fileCreateFileWhetherExists = createFileWhetherExists(str2);
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getResources().getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(fileCreateFileWhetherExists);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            closeQuietly(inputStreamOpen);
                            closeQuietly(fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Exception unused) {
                    inputStream = inputStreamOpen;
                    try {
                        deleteFile(str2);
                        closeQuietly(inputStream);
                        closeQuietly(fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        closeQuietly(inputStream);
                        closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    closeQuietly(inputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static boolean copyFileToFile(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return true;
            }
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.exists() && !copyFileToFile(file2.getAbsolutePath(), new File(str2, file2.getName()).getAbsolutePath())) {
                    return false;
                }
            }
            return true;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(createFileWhetherExists(str2));
            byte[] bArr = new byte[2048];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileOutputStream.flush();
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void createDirIfNotExists(String str) {
        File file = new File(str);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static File createFileIfNotExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return createFileIfNotExists(new File(str));
    }

    public static File createFileWhetherExists(String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        return file;
    }

    public static boolean deleteDirectory(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return deleteDirectory(new File(str));
    }

    public static boolean deleteFile(String str) {
        return deleteDirectory(str);
    }

    public static boolean deleteFileOrDir(String str) {
        return deleteDirectory(str);
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static long getAppFileFreeSize(Context context) {
        return new File(getAppFilesDir(context)).getUsableSpace();
    }

    public static String getAppFilesDir(Context context) {
        try {
            try {
                return context.getFilesDir().getPath();
            } catch (Throwable unused) {
                StringBuilder sb = new StringBuilder();
                String str = File.separator;
                sb.append(str);
                sb.append("data");
                sb.append(str);
                sb.append("data");
                sb.append(str);
                sb.append(context.getPackageName());
                sb.append(str);
                sb.append("files");
                String string = sb.toString();
                new File(string).mkdirs();
                return string;
            }
        } catch (Throwable unused2) {
            File dir = context.getDir("files", 0);
            dir.mkdirs();
            return dir.getPath();
        }
    }

    public static long getLastModifiedTime(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return new File(str).lastModified();
    }

    public static boolean isSDCardBusy() {
        return !Environment.getExternalStorageState().equals("mounted");
    }

    public static String loadJSONFromAsset(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new String(bArr, "UTF-8");
        } catch (IOException unused) {
            return "";
        }
    }

    public static void makeFileDirectories(String str) {
        File parentFile;
        if (TextUtils.isEmpty(str) || (parentFile = new File(str).getParentFile()) == null || parentFile.exists()) {
            return;
        }
        parentFile.mkdirs();
    }

    public static void moveDirectory(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (!file.isDirectory()) {
                file.renameTo(new File(str2));
                return;
            }
            new File(str2).mkdirs();
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && file2.exists()) {
                        moveDirectory(file2.getAbsolutePath(), new File(str2, file2.getName()).getAbsolutePath());
                    }
                }
            }
            file.delete();
        }
    }

    public static ParcelFileDescriptor open(Context context, Uri uri, int i) throws FileNotFoundException {
        String str;
        if (!TextUtils.equals(MiuiCursorConstants.CONTENT, uri.getScheme()) && !TextUtils.equals("file", uri.getScheme())) {
            return ParcelFileDescriptor.open(new File(uri.toString()), i);
        }
        if (i != 536870912) {
            str = i != 805306368 ? "r" : "rw";
        } else {
            str = Constants.DEVICE_TYPE_WEAR;
        }
        return context.getContentResolver().openFileDescriptor(uri, str);
    }

    public static byte[] readFile(String str) {
        return readFile(new File(str));
    }

    public static String readGzipFile(File file) throws Throwable {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream2 = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    gZIPInputStream = new GZIPInputStream(new FileInputStream(file), Data.MAX_DATA_BYTES);
                    try {
                        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                        while (true) {
                            int i = gZIPInputStream.read(bArr);
                            if (i < 0) {
                                String str = new String(byteArrayOutputStream.toByteArray());
                                closeQuietly(gZIPInputStream);
                                closeQuietly(byteArrayOutputStream);
                                return str;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                        gZIPInputStream2 = gZIPInputStream;
                        closeQuietly(gZIPInputStream2);
                        closeQuietly(byteArrayOutputStream);
                        throw th;
                    }
                }
            } catch (IOException unused2) {
                gZIPInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            closeQuietly(gZIPInputStream);
            closeQuietly(byteArrayOutputStream);
            return null;
        }
        closeQuietly(null);
        closeQuietly(byteArrayOutputStream);
        return null;
    }

    public static Parcel readParcel(File file) {
        Parcel parcel = readParcel(readFile(file));
        if (parcel == null) {
            file.delete();
        }
        return parcel;
    }

    public static String readStringFromFile(String str) throws Throwable {
        String str2;
        File file = new File(str);
        FileReader fileReader = null;
        try {
            if (!file.exists()) {
                return null;
            }
            try {
                FileReader fileReader2 = new FileReader(file);
                try {
                    try {
                        char[] cArr = new char[(int) file.length()];
                        fileReader2.read(cArr);
                        str2 = new String(cArr);
                        try {
                            fileReader2.close();
                            fileReader2.close();
                        } catch (Exception e) {
                            e = e;
                            fileReader = fileReader2;
                            e.printStackTrace();
                            if (fileReader != null) {
                                fileReader.close();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str2 = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileReader = fileReader2;
                }
            } catch (Exception e3) {
                e = e3;
                str2 = null;
            }
            return str2;
        } catch (Throwable th2) {
            th = th2;
        }
        if (fileReader != null) {
            fileReader.close();
        }
        throw th;
    }

    public static String readTxtFromFile(String str) {
        File file = new File(str);
        if (!file.isFile()) {
            return "";
        }
        try {
            return readTxtFromStream(new FileInputStream(file));
        } catch (FileNotFoundException | IOException unused) {
            return "";
        }
    }

    public static final String readTxtFromStream(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append("\n");
            }
            inputStream.close();
        }
        return sb.toString();
    }

    public static void trimFilesToSize(File[] fileArr, long j, Comparator<File> comparator) {
        long length = 0;
        for (File file : fileArr) {
            length += file.length();
        }
        if (length < j) {
            return;
        }
        List listAsList = Arrays.asList(fileArr);
        if (comparator == null) {
            comparator = new Comparator<File>() { // from class: com.xiaomi.smarthome.framework.plugin.FileUtils.1
                @Override // java.util.Comparator
                public int compare(File file2, File file3) {
                    return (int) (file3.length() - file2.length());
                }
            };
        }
        Collections.sort(listAsList, comparator);
        Iterator it = listAsList.iterator();
        while (length > j && it.hasNext()) {
            File file2 = (File) it.next();
            length -= file2.length();
            deleteFileOrDir(file2.getPath());
        }
    }

    public static boolean writeDataToFile(String str, String str2) throws Throwable {
        if (str == null) {
            return false;
        }
        PrintWriter printWriter = null;
        try {
            try {
                File file = new File(str2);
                createFileIfNotExists(file);
                PrintWriter printWriter2 = new PrintWriter(file);
                try {
                    printWriter2.write(str);
                    printWriter2.flush();
                    try {
                        printWriter2.close();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    printWriter = printWriter2;
                    e.printStackTrace();
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    printWriter = printWriter2;
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeFile(String str, String str2, boolean z) {
        File file;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (z) {
                file = new File(str + ".tmp");
            } else {
                file = new File(str);
            }
            createFileIfNotExists(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(str2);
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
            if (!z) {
                return true;
            }
            File file2 = new File(str);
            if (file.renameTo(file2) || !file2.delete()) {
                return true;
            }
            file.renameTo(file2);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean writeFileToOutputStream(OutputStream outputStream, String str) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        IOException e;
        FileNotFoundException e2;
        File file = new File(str);
        if (!file.exists() || outputStream == null) {
            return false;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i != -1) {
                            outputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                    outputStream.flush();
                    IOUtils.closeQuietly(fileInputStream);
                    return true;
                } catch (FileNotFoundException e4) {
                    e2 = e4;
                    e2.printStackTrace();
                    try {
                        outputStream.flush();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    IOUtils.closeQuietly(fileInputStream);
                    return false;
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    try {
                        outputStream.flush();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    IOUtils.closeQuietly(fileInputStream);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    outputStream.flush();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                IOUtils.closeQuietly((InputStream) null);
                throw th;
            }
        } catch (FileNotFoundException e9) {
            fileInputStream = null;
            e2 = e9;
        } catch (IOException e10) {
            fileInputStream = null;
            e = e10;
        } catch (Throwable th3) {
            th = th3;
            outputStream.flush();
            IOUtils.closeQuietly((InputStream) null);
            throw th;
        }
    }

    public static boolean writeGzipFile(File file, byte[] bArr) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            createFileIfNotExists(file);
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file), Data.MAX_DATA_BYTES);
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.flush();
                closeQuietly(gZIPOutputStream2);
                return true;
            } catch (Throwable unused) {
                gZIPOutputStream = gZIPOutputStream2;
                closeQuietly(gZIPOutputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public static boolean writeInputStreamToFile(InputStream inputStream, String str, String str2, String str3) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(createFileWhetherExists(str));
            try {
                if (!TextUtils.isEmpty(str2)) {
                    fileOutputStream2.write(str2.getBytes());
                }
                if (inputStream != null) {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                    inputStream.close();
                }
                if (!TextUtils.isEmpty(str3)) {
                    fileOutputStream2.write(str3.getBytes());
                }
                fileOutputStream2.flush();
                fileOutputStream2.close();
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeTxtToFile(String str, String str2) {
        return writeFile(str, str2, false);
    }

    public static boolean deleteFile(File file) {
        return deleteDirectory(file);
    }

    public static byte[] readFile(File file) {
        FileInputStream fileInputStream;
        try {
            if (!file.exists()) {
                closeQuietly(null);
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                closeQuietly(fileInputStream);
                return bArr;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
        }
        closeQuietly(fileInputStream);
        return null;
    }

    public static File createFileIfNotExists(File file) {
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
        }
        return file;
    }

    public static boolean deleteDirectory(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
            for (File file2 : fileArrListFiles) {
                deleteFile(file2);
            }
        }
        return file.delete();
    }

    public static Parcel readParcel(byte[] bArr) {
        if (bArr != null) {
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.setDataCapacity(bArr.length);
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                return parcelObtain;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static boolean writeFile(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            createFileIfNotExists(file);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                closeQuietly(fileOutputStream2);
                return true;
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }
}
