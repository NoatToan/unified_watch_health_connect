package com.xiaomi.smarthome.library.file;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.library.mime.MimeUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
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
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FileUtil {
    public static void byte2File(byte[] bArr, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        StringBuilder sb;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str);
            if (!file.exists() && file.isDirectory()) {
                file.mkdirs();
            }
            fileOutputStream = new FileOutputStream(new File(str + File.separator + str2));
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(bArr);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e) {
                            MiJiaLog.onlyLogcat(6, "byte2File", "byte2File IOException 1:" + e.getLocalizedMessage());
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            sb = new StringBuilder();
                            sb.append("byte2File IOException 2:");
                            sb.append(e.getLocalizedMessage());
                            MiJiaLog.onlyLogcat(6, "byte2File", sb.toString());
                        }
                    } catch (Exception e3) {
                        e = e3;
                        bufferedOutputStream = bufferedOutputStream2;
                        MiJiaLog.onlyLogcat(6, "byte2File", "byte2File Exception:" + e.getLocalizedMessage());
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                                MiJiaLog.onlyLogcat(6, "byte2File", "byte2File IOException 1:" + e4.getLocalizedMessage());
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                e = e5;
                                sb = new StringBuilder();
                                sb.append("byte2File IOException 2:");
                                sb.append(e.getLocalizedMessage());
                                MiJiaLog.onlyLogcat(6, "byte2File", sb.toString());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e6) {
                                MiJiaLog.onlyLogcat(6, "byte2File", "byte2File IOException 1:" + e6.getLocalizedMessage());
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e7) {
                            MiJiaLog.onlyLogcat(6, "byte2File", "byte2File IOException 2:" + e7.getLocalizedMessage());
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

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                MiJiaLog.onlyLogcat(5, "TAG", "RnPluginFileUtils#close, close error:" + Log.getStackTraceString(e));
            }
        }
    }

    public static void closeSilently(Closeable closeable) {
        close(closeable);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        return FileUtils.copy(inputStream, outputStream);
    }

    public static void copyFile(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            try {
                if (new File(str).exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = fileInputStream2.read(bArr);
                                if (i == -1) {
                                    break;
                                } else {
                                    fileOutputStream.write(bArr, 0, i);
                                }
                            }
                            fileInputStream = fileInputStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            try {
                                e.printStackTrace();
                                if (fileInputStream == null || fileOutputStream == null) {
                                    return;
                                }
                                fileInputStream.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                th = th;
                                if (fileInputStream != null && fileOutputStream != null) {
                                    try {
                                        fileInputStream.close();
                                        fileOutputStream.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                    }
                } else {
                    fileOutputStream = null;
                }
                if (fileInputStream == null || fileOutputStream == null) {
                    return;
                }
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static boolean copyFileToFile(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
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
        File file = new File(str);
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

    public static void deleteDirectory(String str) {
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > 0) {
                for (File file2 : file.listFiles()) {
                    if (file2 != null && file2.exists()) {
                        deleteDirectory(file2.getAbsolutePath());
                    }
                }
            }
            file.delete();
        }
    }

    public static boolean deleteFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && !file.isDirectory() && file.delete();
    }

    public static boolean deleteFileOrDir(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (file.isFile()) {
            return file.exists() && file.delete();
        }
        if (!file.isDirectory()) {
            return false;
        }
        deleteDirectory(str);
        return true;
    }

    public static byte[] file2Byte(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            MiJiaLog.onlyLogcat(6, "file2Byte", "file2Byte FileNotFoundException:" + e.getLocalizedMessage());
            return null;
        } catch (IOException e2) {
            MiJiaLog.onlyLogcat(6, "file2Byte", "file2Byte IOException:" + e2.getLocalizedMessage());
            return null;
        }
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    private static String getDataColumn(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String getExtensionFromFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : "";
    }

    public static String getExtensionFromFilePath(String str) {
        return getExtensionFromFileName(getNameFromFilePath(str));
    }

    public static int getFileCount(String str) {
        File file = new File(str);
        if (file.exists()) {
            return getFileCount(file);
        }
        return 0;
    }

    public static File getFileFromUri(Context context, Uri uri) {
        String filePathFromUri = getFilePathFromUri(context, uri);
        if (TextUtils.isEmpty(filePathFromUri)) {
            return null;
        }
        return new File(filePathFromUri);
    }

    @TargetApi(19)
    public static String getFilePathFromUri(Context context, Uri uri) {
        Uri uri2 = null;
        if (uri != null) {
            if (DocumentsContract.isDocumentUri(context, uri)) {
                if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                    String str = strArrSplit[0];
                    if ("image".equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{strArrSplit[1]});
                }
            } else {
                if (MiuiCursorConstants.CONTENT.equalsIgnoreCase(uri.getScheme())) {
                    return getDataColumn(context, uri, null, null);
                }
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
        }
        return null;
    }

    public static Bitmap getImageThumbnail(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i3 = options.outWidth / i;
        int i4 = options.outHeight / i2;
        if (i3 >= i4) {
            i3 = i4;
        }
        int i5 = i3 > 0 ? i3 : 1;
        options.inJustDecodeBounds = false;
        options.inSampleSize = i5;
        return ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(str, options), i, i2, 2);
    }

    public static long getLastModifiedTime(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return new File(str).lastModified();
    }

    public static String getMimeTypeFromFilePath(String str) {
        String strGuessMimeTypeFromExtension;
        if (TextUtils.isEmpty(str)) {
            return "application/octet-stream";
        }
        String nameFromFilePath = getNameFromFilePath(str);
        return (TextUtils.isEmpty(nameFromFilePath) || (strGuessMimeTypeFromExtension = MimeUtils.guessMimeTypeFromExtension(getExtensionFromFileName(nameFromFilePath))) == null) ? "application/octet-stream" : strGuessMimeTypeFromExtension;
    }

    public static String getMimeTypeFromUri(Context context, Uri uri) {
        String strGuessMimeTypeFromExtension;
        File fileFromUri = getFileFromUri(context, uri);
        return (fileFromUri == null || (strGuessMimeTypeFromExtension = MimeUtils.guessMimeTypeFromExtension(getExtensionFromFileName(fileFromUri.getName()))) == null) ? "application/octet-stream" : strGuessMimeTypeFromExtension;
    }

    public static String getNameFromFileName(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : str;
    }

    public static String getNameFromFilePath(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1) : str;
    }

    public static String getPathFromFilePath(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf != -1 ? str.substring(0, iLastIndexOf) : "";
    }

    public static Uri insertPdfFileToMediaStore(String str, Context context, String str2) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                File file = new File(str2);
                if (!file.exists()) {
                    file.createNewFile();
                }
                ContentValues contentValues = new ContentValues();
                ContentResolver contentResolver = context.getContentResolver();
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String str3 = Environment.DIRECTORY_DOCUMENTS + File.separator + "external";
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", "application/pdf");
                contentValues.put("relative_path", str3);
                contentValues.put("is_pending", (Integer) 1);
                Uri uriInsert = contentResolver.insert(contentUri, contentValues);
                if (uriInsert == null) {
                    contentValues.put("relative_path", str3 + System.currentTimeMillis());
                    uriInsert = contentResolver.insert(contentUri, contentValues);
                }
                copy(new FileInputStream(str2), contentResolver.openOutputStream(uriInsert));
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                contentResolver.update(uriInsert, contentValues, null, null);
                return uriInsert;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isFileNameTooLength(String str) {
        return str != null && str.length() > 50;
    }

    public static boolean isSDCardBusy() {
        return !Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isSDCardUnavailable() {
        return Environment.getExternalStorageState().equals("removed");
    }

    public static String loadJSONFromAsset(Context context, String str) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            byte[] bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
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

    private static FileInputStream openInputStream(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    public static byte[] readFile(String str) {
        byte[] bArr = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (FileNotFoundException | IOException unused) {
            return bArr;
        }
    }

    public static byte[] readFileFromUri(Context context, Uri uri) throws IOException {
        File fileFromUri = getFileFromUri(context, uri);
        return fileFromUri != null ? readFileToByteArray(fileFromUri) : new byte[0];
    }

    public static byte[] readFileToByteArray(File file) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream;
        try {
            fileInputStreamOpenInputStream = openInputStream(file);
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    throw new IllegalArgumentException("Size cannot be greater than Integer max value: " + length);
                }
                int i = (int) length;
                int i2 = 0;
                if (i == 0) {
                    byte[] bArr = new byte[0];
                    if (fileInputStreamOpenInputStream != null) {
                        fileInputStreamOpenInputStream.close();
                    }
                    return bArr;
                }
                byte[] bArr2 = new byte[i];
                while (i2 < i) {
                    int i3 = fileInputStreamOpenInputStream.read(bArr2, i2, i - i2);
                    if (i3 == -1) {
                        break;
                    }
                    i2 += i3;
                }
                if (i2 == i) {
                    if (fileInputStreamOpenInputStream != null) {
                        fileInputStreamOpenInputStream.close();
                    }
                    return bArr2;
                }
                throw new IOException("Unexpected read size. current: " + i2 + ", expected: " + i);
            } catch (Throwable th) {
                th = th;
                if (fileInputStreamOpenInputStream != null) {
                    fileInputStreamOpenInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStreamOpenInputStream = null;
        }
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

    public static boolean safeDelSingleFile(File file) {
        return file != null && safeDelSingleFile(file.getAbsolutePath());
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
            comparator = new Comparator<File>() { // from class: com.xiaomi.smarthome.library.file.FileUtil.1
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
        PrintWriter printWriter = null;
        try {
            try {
                File file = new File(str2);
                if (file.exists()) {
                    file.delete();
                } else {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file.createNewFile();
                }
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
                    if (printWriter == null) {
                        return false;
                    }
                    try {
                        printWriter.close();
                        return false;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        return false;
                    }
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
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    private static void writeFileByteArray(File file, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File '" + file + "' does not exist");
            }
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canRead()) {
                throw new IOException("File '" + file + "' cannot be read");
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                fileOutputStream2.close();
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void writeFileContent(Context context, Uri uri, byte[] bArr) throws Throwable {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri != null) {
            writeFileByteArray(fileFromUri, bArr);
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

    public static boolean safeDelSingleFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File("" + System.currentTimeMillis());
        file.renameTo(file2);
        return file2.delete();
    }

    public static int getFileCount(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return 0;
        }
        int i = 0;
        for (File file2 : fileArrListFiles) {
            if (!file2.isHidden()) {
                i++;
            }
        }
        return i;
    }
}
