package com.huawei.hms.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class ExtractNativeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13089a = "ExtractNativeUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13090b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13091c = -1;
    private static final int d = 50;
    private static final int e = 52428800;
    private static final Pattern f = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f13092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ZipEntry f13093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f13094c;

        private b(ZipEntry zipEntry, String str, String str2) {
            this.f13093b = zipEntry;
            this.f13092a = str;
            this.f13094c = str2;
        }
    }

    public static boolean a(Context context, String str) {
        try {
            if ((context.getPackageManager().getPackageArchiveInfo(str, 128).applicationInfo.flags & 268435456) == 268435456) {
                Logger.i(f13089a, "The extract-native-flag has set, need to extract.");
                return true;
            }
            Logger.i(f13089a, "The extract-native-flag has not set, No need to extract.");
            return false;
        } catch (Exception unused) {
            Logger.w(f13089a, "Get package name failed: name not found.");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[SYNTHETIC] */
    private static int a(ZipFile zipFile, b bVar, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        int i = -1;
        FileOutputStream fileOutputStream = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            try {
                byte[] bArr = new byte[4096];
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str, bVar.f13092a));
                try {
                    inputStream3 = zipFile.getInputStream(bVar.f13093b);
                    int i2 = 0;
                    while (true) {
                        int i3 = inputStream3.read(bArr);
                        if (i3 <= 0) {
                            i = 0;
                            break;
                        }
                        i2 += i3;
                        if (i2 > 52428800) {
                            Logger.e(f13089a, "so file too big , " + bVar.f13094c + " , " + bVar.f13092a);
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i3);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e2) {
                        Logger.e(f13089a, "IOException", e2);
                    }
                } catch (FileNotFoundException unused) {
                    inputStream2 = inputStream3;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Logger.e(f13089a, "FileNotFoundException");
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                Logger.e(f13089a, "IOException", e3);
                            }
                        }
                        if (inputStream2 != null) {
                            inputStream3 = inputStream2;
                        }
                        return i;
                    } catch (Throwable th) {
                        inputStream = inputStream2;
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e4) {
                                Logger.e(f13089a, "IOException", e4);
                            }
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            Logger.e(f13089a, "IOException", e5);
                            throw th;
                        }
                    }
                } catch (IOException e6) {
                    e = e6;
                    inputStream = inputStream3;
                    fileOutputStream = fileOutputStream2;
                    try {
                        Logger.e(f13089a, "IOException", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e7) {
                                Logger.e(f13089a, "IOException", e7);
                            }
                        }
                        if (inputStream != null) {
                            inputStream3 = inputStream;
                        }
                        return i;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        inputStream.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = inputStream3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                inputStream2 = null;
            } catch (IOException e8) {
                e = e8;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
            inputStream3.close();
        } catch (IOException e9) {
            Logger.e(f13089a, "IOException", e9);
        }
        return i;
    }

    private static int a(Enumeration enumeration, HashMap<String, HashSet<b>> map, int i) {
        while (enumeration.hasMoreElements()) {
            Object objNextElement = enumeration.nextElement();
            if (objNextElement != null && (objNextElement instanceof ZipEntry)) {
                ZipEntry zipEntry = (ZipEntry) objNextElement;
                String name = zipEntry.getName();
                if (name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                    Logger.e(f13089a, "Unsafe zip name!");
                    return -1;
                }
                Matcher matcher = f.matcher(name);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    HashSet<b> hashSet = map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new b(zipEntry, strGroup2, strGroup));
                    i++;
                }
            }
        }
        return i;
    }

    public static int a(File file, String str) throws Throwable {
        ZipFile zipFile;
        Logger.i(f13089a, "begin extractNativeLibrary");
        if (ModuleCopy.isPathInvalid(str)) {
            return -1;
        }
        ZipFile zipFile2 = null;
        int i = 0;
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        HashMap map = new HashMap();
                        int iA = a(enumerationEntries, (HashMap<String, HashSet<b>>) map, 0);
                        if (iA == -1) {
                            Logger.e(f13089a, "Unsafe zip name!");
                            try {
                                zipFile.close();
                                return -1;
                            } catch (IOException e2) {
                                Logger.e(f13089a, "IOException:", e2);
                                return -1;
                            }
                        }
                        if (iA > 50) {
                            Logger.e(f13089a, "the total number is larger than the max");
                            try {
                                zipFile.close();
                                return -1;
                            } catch (IOException e3) {
                                Logger.e(f13089a, "IOException:", e3);
                                return -1;
                            }
                        }
                        Iterator it = map.keySet().iterator();
                        int iA2 = 0;
                        while (it.hasNext()) {
                            try {
                                Set<b> set = (Set) map.get((String) it.next());
                                if (set == null) {
                                    Logger.e(f13089a, "Get nativeZipEntries failed.");
                                    try {
                                        zipFile.close();
                                        return -1;
                                    } catch (IOException e4) {
                                        Logger.e(f13089a, "IOException:", e4);
                                        return -1;
                                    }
                                }
                                for (b bVar : set) {
                                    if (!TextUtils.isEmpty(bVar.f13092a)) {
                                        String str2 = str + File.separator + bVar.f13094c;
                                        FileUtils.b(str2);
                                        new File(str2).setExecutable(true, false);
                                        iA2 = a(zipFile, bVar, str2);
                                        if (iA2 != 0) {
                                            try {
                                                zipFile.close();
                                                return iA2;
                                            } catch (IOException e5) {
                                                Logger.e(f13089a, "IOException:", e5);
                                                return iA2;
                                            }
                                        }
                                        new File(str2, bVar.f13092a).setReadOnly();
                                    }
                                }
                            } catch (IOException e6) {
                                e = e6;
                                i = iA2;
                                zipFile2 = zipFile;
                                Logger.e(f13089a, "catch IOException ", e);
                                if (zipFile2 == null) {
                                    return i;
                                }
                                try {
                                    zipFile2.close();
                                    return i;
                                } catch (IOException e7) {
                                    e = e7;
                                    iA2 = i;
                                }
                            }
                            Logger.e(f13089a, "IOException:", e);
                            return iA2;
                        }
                        try {
                            zipFile.close();
                            return iA2;
                        } catch (IOException e8) {
                            e = e8;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (IOException e10) {
                            Logger.e(f13089a, "IOException:", e10);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
