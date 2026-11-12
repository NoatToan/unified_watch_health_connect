package com.huawei.hms.ads.uiengineloader;

import android.content.Context;
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
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12880a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12881b = "ExtractNativeUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f12882c = -1;
    private static final int d = 128;
    private static final int e = 50;
    private static final int f = 52428800;
    private static final Pattern g = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    public static boolean a(Context context, String str) {
        try {
            if ((context.getPackageManager().getPackageArchiveInfo(str, 128).applicationInfo.flags & 268435456) == 268435456) {
                af.b(f12881b, "The extract-native-flag has set, need to extract.");
                return true;
            }
            af.b(f12881b, "The extract-native-flag has not set, No need to extract.");
            return false;
        } catch (Exception unused) {
            af.c(f12881b, "Get package name failed: name not found.");
            return true;
        }
    }

    public static void a(Enumeration enumeration, Set<a> set, String str) throws ZipException {
        while (enumeration.hasMoreElements()) {
            Object objNextElement = enumeration.nextElement();
            if (objNextElement != null && (objNextElement instanceof ZipEntry)) {
                ZipEntry zipEntry = (ZipEntry) objNextElement;
                String name = zipEntry.getName();
                if (name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                    throw new ZipException("Unsafe zip name!");
                }
                Matcher matcher = g.matcher(name);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup.equals(str)) {
                        set.add(new a(zipEntry, strGroup2, strGroup, (byte) 0));
                    }
                }
            }
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f12883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ZipEntry f12884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f12885c;

        /* synthetic */ a(ZipEntry zipEntry, String str, String str2, byte b2) {
            this(zipEntry, str, str2);
        }

        private a(ZipEntry zipEntry, String str, String str2) {
            this.f12884b = zipEntry;
            this.f12883a = str;
            this.f12885c = str2;
        }
    }

    public static int a(ZipFile zipFile, Set<a> set, String str) throws Throwable {
        af.b(f12881b, "begin extractNativeLibrary ");
        int i = 0;
        for (a aVar : set) {
            File file = new File(str);
            if (!file.exists()) {
                ad.a(str);
            }
            file.setExecutable(true, false);
            int iA = a(zipFile, aVar, str);
            if (iA != 0) {
                return iA;
            }
            new File(str, aVar.f12883a).setReadable(true, false);
            i = iA;
        }
        return i;
    }

    private static int a(ZipFile zipFile, a aVar, String str) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2;
        String str2;
        int i = -1;
        FileOutputStream fileOutputStream = null;
        inputStream = null;
        inputStream = null;
        InputStream inputStream3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        try {
            byte[] bArr = new byte[4096];
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str, aVar.f12883a));
            try {
                inputStream3 = zipFile.getInputStream(aVar.f12884b);
                int i2 = 0;
                while (true) {
                    int i3 = inputStream3.read(bArr);
                    if (i3 <= 0) {
                        i = 0;
                        break;
                    }
                    i2 += i3;
                    if (i2 > 52428800) {
                        af.d(f12881b, "so file too big , " + aVar.f12885c + " , " + aVar.f12883a);
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i3);
                }
                aj.a(fileOutputStream2);
                aj.a(inputStream3);
                return i;
            } catch (FileNotFoundException unused) {
                inputStream2 = inputStream3;
                fileOutputStream = fileOutputStream2;
                str2 = "FileNotFoundException";
                try {
                    af.d(f12881b, str2);
                    aj.a(fileOutputStream);
                    aj.a(inputStream2);
                    return -1;
                } catch (Throwable th) {
                    inputStream = inputStream2;
                    th = th;
                    aj.a(fileOutputStream);
                    aj.a(inputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                inputStream2 = inputStream3;
                fileOutputStream = fileOutputStream2;
                str2 = "IOException";
                af.d(f12881b, str2);
                aj.a(fileOutputStream);
                aj.a(inputStream2);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream3;
                fileOutputStream = fileOutputStream2;
                aj.a(fileOutputStream);
                aj.a(inputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            inputStream2 = null;
        } catch (IOException unused4) {
            inputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    private static int a(Enumeration enumeration, HashMap<String, HashSet<a>> map, int i) {
        while (enumeration.hasMoreElements()) {
            Object objNextElement = enumeration.nextElement();
            if (objNextElement != null && (objNextElement instanceof ZipEntry)) {
                ZipEntry zipEntry = (ZipEntry) objNextElement;
                String name = zipEntry.getName();
                if (name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                    af.d(f12881b, "Unsafe zip name!");
                    return -1;
                }
                Matcher matcher = g.matcher(name);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    HashSet<a> hashSet = map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new a(zipEntry, strGroup2, strGroup, (byte) 0));
                    i++;
                }
            }
        }
        return i;
    }

    public static int a(File file, String str) throws Throwable {
        ZipFile zipFile;
        af.b(f12881b, "begin extractNativeLibrary");
        int i = 0;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        HashMap map = new HashMap();
                        int iA = a(enumerationEntries, (HashMap<String, HashSet<a>>) map, 0);
                        if (iA == -1) {
                            af.d(f12881b, "Unsafe zip name!");
                            aj.a(zipFile);
                            return -1;
                        }
                        if (iA > 50) {
                            af.d(f12881b, "the total number is larger than the max");
                            aj.a(zipFile);
                            return -1;
                        }
                        Iterator it = map.keySet().iterator();
                        int iA2 = 0;
                        while (it.hasNext()) {
                            try {
                                Set<a> set = (Set) map.get((String) it.next());
                                if (set == null) {
                                    af.d(f12881b, "Get nativeZipEntries failed.");
                                    aj.a(zipFile);
                                    return -1;
                                }
                                for (a aVar : set) {
                                    String str2 = str + File.separator + aVar.f12885c;
                                    ad.a(str2);
                                    new File(str2).setExecutable(true, false);
                                    iA2 = a(zipFile, aVar, str2);
                                    if (iA2 != 0) {
                                        aj.a(zipFile);
                                        return iA2;
                                    }
                                    new File(str2, aVar.f12883a).setReadable(true, false);
                                }
                            } catch (IOException unused) {
                                i = iA2;
                                zipFile2 = zipFile;
                                af.d(f12881b, "catch IOException");
                                aj.a(zipFile2);
                                return i;
                            }
                        }
                        aj.a(zipFile);
                        return iA2;
                    } catch (IOException unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    aj.a(zipFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = zipFile2;
            }
        } catch (IOException unused3) {
        }
    }
}
