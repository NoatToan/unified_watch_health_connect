package com.xiaomi.hm.health.baseutil;

import com.xiaomi.hm.health.baseutil.ZipUtil;
import defpackage.le;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class ZipUtil {
    private static final int BUFF_SIZE = 1048576;
    private static final String TAG = "ZipUtil";

    public static Enumeration<?> getEntriesEnumeration(File file) {
        return new ZipFile(file).entries();
    }

    public static ArrayList<String> getEntriesNames(File file) {
        ArrayList<String> arrayList = new ArrayList<>();
        Enumeration<?> entriesEnumeration = getEntriesEnumeration(file);
        while (entriesEnumeration.hasMoreElements()) {
            arrayList.add(new String(getEntryName((ZipEntry) entriesEnumeration.nextElement()).getBytes("GB2312"), "8859_1"));
        }
        return arrayList;
    }

    public static String getEntryComment(ZipEntry zipEntry) {
        return new String(zipEntry.getComment().getBytes("GB2312"), "8859_1");
    }

    public static String getEntryName(ZipEntry zipEntry) {
        return new String(zipEntry.getName().getBytes("GB2312"), "8859_1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$unzipFile$0() {
        return "解压文件路径存在路径穿越问题";
    }

    public static void unzipFile(String str, String str2) throws Throwable {
        InputStream inputStream;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile = new ZipFile(str);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = zipFile.getInputStream(zipEntryNextElement);
                try {
                    if (name.contains("../")) {
                        le.e(TAG, new Function0() { // from class: e1s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ZipUtil.lambda$unzipFile$0();
                            }
                        });
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } else {
                        String strReplaceAll = (str2 + "/" + name).replaceAll("\\*", "/");
                        File file2 = new File(strReplaceAll.substring(0, strReplaceAll.lastIndexOf(47)));
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (!new File(strReplaceAll).isDirectory()) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(strReplaceAll);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    } else {
                                        fileOutputStream2.write(bArr, 0, i);
                                    }
                                }
                                inputStream.close();
                                fileOutputStream2.close();
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        } else if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        }
    }

    public static ArrayList<File> upZipSelectedFile(File file, String str, String str2) throws IOException {
        ArrayList<File> arrayList = new ArrayList<>();
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            if (zipEntryNextElement.getName().contains(str2)) {
                InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                File file3 = new File(new String((str + File.separator + zipEntryNextElement.getName()).getBytes("8859_1"), "GB2312"));
                if (!file3.exists()) {
                    File parentFile = file3.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    file3.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
                inputStream.close();
                fileOutputStream.close();
                arrayList.add(file3);
            }
        }
        return arrayList;
    }

    private static void zipFile(File file, ZipOutputStream zipOutputStream, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.trim().length() == 0 ? "" : File.separator);
        sb.append(file.getName());
        String string = sb.toString();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                zipFile(file2, zipOutputStream, string);
            }
            return;
        }
        byte[] bArr = new byte[1048576];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1048576);
        zipOutputStream.putNextEntry(new ZipEntry(string));
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedInputStream.close();
                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    public static void zipFiles(Collection<File> collection, File file) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            zipFile(it.next(), zipOutputStream, "");
        }
        zipOutputStream.close();
    }

    public static void zipFiles(Collection<File> collection, File file, String str) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file), 1048576));
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            zipFile(it.next(), zipOutputStream, "");
        }
        zipOutputStream.setComment(str);
        zipOutputStream.close();
    }
}
