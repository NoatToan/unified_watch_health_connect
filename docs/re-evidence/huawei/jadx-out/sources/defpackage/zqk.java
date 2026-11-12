package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes20.dex */
public class zqk {
    public static final byte[] d = {0, 0, -92, -127};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f54480a = {0, 0, -19, 65};

    public static void a(Path path, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        if (c()) {
            b(path, bArr);
        } else if (b() || a()) {
            c(path, bArr);
        }
    }

    public static void d(Path path, long j) {
        if (j <= 0 || !Files.exists(path, new LinkOption[0])) {
            return;
        }
        try {
            Files.setLastModifiedTime(path, FileTime.fromMillis(zqp.c(j)));
        } catch (Exception unused) {
        }
    }

    public static void c(File file, long j) {
        file.setLastModified(zqp.c(j));
    }

    public static byte[] c(File file) {
        if (file != null) {
            try {
                if (Files.isSymbolicLink(file.toPath()) || file.exists()) {
                    Path path = file.toPath();
                    if (c()) {
                        return a(path);
                    }
                    if (!b() && !a()) {
                        return new byte[4];
                    }
                    return b(path);
                }
            } catch (NoSuchMethodError unused) {
                return new byte[4];
            }
        }
        return new byte[4];
    }

    public static List<File> c(File file, ZipParameters zipParameters) throws ZipException {
        if (file == null) {
            throw new ZipException("input path is null, cannot read files in the directory");
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (file.isDirectory() && file.canRead() && fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if ((zipParameters.i() == null || !zipParameters.i().isExcluded(file2)) && (!file2.isHidden() || zipParameters.p())) {
                    arrayList.add(file2);
                    ZipParameters.SymbolicLinkAction symbolicLinkActionN = zipParameters.n();
                    boolean zE = e(file2);
                    if ((zE && !ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY.equals(symbolicLinkActionN)) || (!zE && file2.isDirectory())) {
                        arrayList.addAll(c(file2, zipParameters));
                    }
                }
            }
        }
        return arrayList;
    }

    public static String e(String str) {
        int iLastIndexOf = str.lastIndexOf(".");
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static String c(String str) throws ZipException {
        if (!zqp.c(str)) {
            throw new ZipException("zip file name is empty or null, cannot determine zip file name");
        }
        if (str.contains(System.getProperty("file.separator"))) {
            str = str.substring(str.lastIndexOf(System.getProperty("file.separator")) + 1);
        }
        return str.endsWith(".zip") ? str.substring(0, str.lastIndexOf(".")) : str;
    }

    public static String a(File file, ZipParameters zipParameters) throws ZipException {
        String strC;
        String strSubstring;
        try {
            String canonicalPath = file.getCanonicalPath();
            if (zqp.c(zipParameters.d())) {
                String canonicalPath2 = new File(zipParameters.d()).getCanonicalPath();
                if (!canonicalPath2.endsWith(zql.f54482a)) {
                    canonicalPath2 = canonicalPath2 + zql.f54482a;
                }
                if (e(file)) {
                    strSubstring = new File(file.getParentFile().getCanonicalFile().getPath() + File.separator + file.getCanonicalFile().getName()).getPath().substring(canonicalPath2.length());
                } else if (!file.getCanonicalFile().getPath().startsWith(canonicalPath2)) {
                    strSubstring = file.getCanonicalFile().getParentFile().getName() + zql.f54482a + file.getCanonicalFile().getName();
                } else {
                    strSubstring = canonicalPath.substring(canonicalPath2.length());
                }
                if (strSubstring.startsWith(System.getProperty("file.separator"))) {
                    strSubstring = strSubstring.substring(1);
                }
                File file2 = new File(canonicalPath);
                if (file2.isDirectory()) {
                    strC = strSubstring.replaceAll("\\\\", "/") + "/";
                } else {
                    strC = strSubstring.substring(0, strSubstring.lastIndexOf(file2.getName())).replaceAll("\\\\", "/") + c(file2, zipParameters.m());
                }
            } else {
                File file3 = new File(canonicalPath);
                strC = c(file3, zipParameters.m());
                if (file3.isDirectory()) {
                    strC = strC + "/";
                }
            }
            String strO = zipParameters.o();
            if (zqp.c(strO)) {
                if (!strO.endsWith("\\") && !strO.endsWith("/")) {
                    strO = strO + zql.f54482a;
                }
                strO = strO.replaceAll("\\\\", "/");
                strC = strO + strC;
            }
            if (zqp.c(strC)) {
                return strC;
            }
            String str = "fileName to add to zip is empty or null. fileName: '" + strC + "' DefaultFolderPath: '" + zipParameters.d() + "' FileNameInZip: " + zipParameters.m();
            if (e(file)) {
                str = str + "isSymlink: true ";
            }
            if (zqp.c(strO)) {
                str = "rootFolderNameInZip: '" + strO + "' ";
            }
            throw new ZipException(str);
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    private static String c(File file, String str) throws IOException {
        if (zqp.c(str)) {
            return str;
        }
        if (e(file)) {
            return file.toPath().toRealPath(LinkOption.NOFOLLOW_LINKS).getFileName().toString();
        }
        return file.getName();
    }

    public static boolean a(String str) {
        return str.endsWith("/") || str.endsWith("\\");
    }

    public static void b(RandomAccessFile randomAccessFile, OutputStream outputStream, long j, long j2, ProgressMonitor progressMonitor, int i) throws ZipException {
        byte[] bArr;
        long j3 = 0;
        if (j < 0 || j2 < 0 || j > j2) {
            throw new ZipException("invalid offsets");
        }
        if (j == j2) {
            return;
        }
        try {
            randomAccessFile.seek(j);
            long j4 = j2 - j;
            if (j4 < i) {
                bArr = new byte[(int) j4];
            } else {
                bArr = new byte[i];
            }
            while (true) {
                int i2 = randomAccessFile.read(bArr);
                if (i2 == -1) {
                    return;
                }
                outputStream.write(bArr, 0, i2);
                long j5 = i2;
                progressMonitor.a(j5);
                if (progressMonitor.b()) {
                    progressMonitor.d(ProgressMonitor.Result.CANCELLED);
                    return;
                }
                j3 += j5;
                if (j3 == j4) {
                    return;
                }
                if (((long) bArr.length) + j3 > j4) {
                    bArr = new byte[(int) (j4 - j3)];
                }
            }
        } catch (IOException e) {
            throw new ZipException(e);
        }
    }

    public static void c(List<File> list, ZipParameters.SymbolicLinkAction symbolicLinkAction) throws ZipException {
        for (File file : list) {
            if (e(file)) {
                if (symbolicLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE) || symbolicLinkAction.equals(ZipParameters.SymbolicLinkAction.INCLUDE_LINKED_FILE_ONLY)) {
                    f(file);
                }
            } else {
                j(file);
            }
        }
    }

    public static boolean b(File file) {
        return file.getName().endsWith(".zip.001");
    }

    public static String d(File file) {
        String name = file.getName();
        if (!name.contains(".")) {
            return "";
        }
        return name.substring(name.lastIndexOf(".") + 1);
    }

    public static File[] a(File file) {
        final String strE = e(file.getName());
        File[] fileArrListFiles = file.getParentFile().listFiles(new FilenameFilter() { // from class: zqk.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file2, String str) {
                return str.startsWith(strE + ".");
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        Arrays.sort(fileArrListFiles);
        return fileArrListFiles;
    }

    public static boolean e(File file) {
        try {
            return Files.isSymbolicLink(file.toPath());
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static String g(File file) {
        try {
            return Files.readSymbolicLink(file.toPath()).toString();
        } catch (Error | Exception unused) {
            return "";
        }
    }

    public static byte[] c(boolean z) {
        byte[] bArr = new byte[4];
        if (!a() && !b()) {
            if (c() && z) {
                bArr[0] = zqg.e(bArr[0], 4);
            }
            return bArr;
        }
        if (z) {
            System.arraycopy(f54480a, 0, bArr, 0, 4);
            return bArr;
        }
        System.arraycopy(d, 0, bArr, 0, 4);
        return bArr;
    }

    public static boolean c() {
        return System.getProperty("os.name").toLowerCase().contains("win");
    }

    public static boolean b() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }

    public static boolean a() {
        return System.getProperty("os.name").toLowerCase().contains("nux");
    }

    private static void b(Path path, byte[] bArr) {
        DosFileAttributeView dosFileAttributeView;
        if (bArr[0] == 0 || (dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS)) == null) {
            return;
        }
        try {
            dosFileAttributeView.setReadOnly(zqg.a(bArr[0], 0));
            dosFileAttributeView.setHidden(zqg.a(bArr[0], 1));
            dosFileAttributeView.setSystem(zqg.a(bArr[0], 2));
            dosFileAttributeView.setArchive(zqg.a(bArr[0], 5));
        } catch (IOException unused) {
        }
    }

    private static void c(Path path, byte[] bArr) {
        if (bArr[2] == 0 && bArr[3] == 0) {
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            a(bArr[3], 0, hashSet, PosixFilePermission.OWNER_READ);
            a(bArr[2], 7, hashSet, PosixFilePermission.OWNER_WRITE);
            a(bArr[2], 6, hashSet, PosixFilePermission.OWNER_EXECUTE);
            a(bArr[2], 5, hashSet, PosixFilePermission.GROUP_READ);
            a(bArr[2], 4, hashSet, PosixFilePermission.GROUP_WRITE);
            a(bArr[2], 3, hashSet, PosixFilePermission.GROUP_EXECUTE);
            a(bArr[2], 2, hashSet, PosixFilePermission.OTHERS_READ);
            a(bArr[2], 1, hashSet, PosixFilePermission.OTHERS_WRITE);
            a(bArr[2], 0, hashSet, PosixFilePermission.OTHERS_EXECUTE);
            Files.setPosixFilePermissions(path, hashSet);
        } catch (IOException unused) {
        }
    }

    private static byte[] a(Path path) {
        byte[] bArr = new byte[4];
        try {
            DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, LinkOption.NOFOLLOW_LINKS);
            if (dosFileAttributeView != null) {
                DosFileAttributes attributes = dosFileAttributeView.readAttributes();
                bArr[0] = a(attributes.isArchive(), a(attributes.isDirectory(), a(attributes.isSystem(), a(attributes.isHidden(), a(attributes.isReadOnly(), (byte) 0, 0), 1), 2), 4), 5);
            }
        } catch (IOException unused) {
        }
        return bArr;
    }

    private static void j(File file) throws ZipException {
        if (file.exists()) {
            return;
        }
        throw new ZipException("File does not exist: " + file);
    }

    private static void f(File file) throws ZipException {
        if (file.exists()) {
            return;
        }
        throw new ZipException("Symlink target '" + g(file) + "' does not exist for link '" + file + "'");
    }

    private static byte[] b(Path path) {
        byte[] bArr = new byte[4];
        try {
            Set<PosixFilePermission> setPermissions = ((PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, LinkOption.NOFOLLOW_LINKS)).readAttributes().permissions();
            boolean zIsSymbolicLink = Files.isSymbolicLink(path);
            if (zIsSymbolicLink) {
                byte bE = zqg.e(bArr[3], 7);
                bArr[3] = bE;
                bArr[3] = zqg.c(bE, 6);
            } else {
                bArr[3] = a(Files.isRegularFile(path, new LinkOption[0]), bArr[3], 7);
                bArr[3] = a(Files.isDirectory(path, new LinkOption[0]), bArr[3], 6);
            }
            bArr[3] = a(zIsSymbolicLink, bArr[3], 5);
            bArr[3] = a(setPermissions.contains(PosixFilePermission.OWNER_READ), bArr[3], 0);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.OWNER_WRITE), bArr[2], 7);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.OWNER_EXECUTE), bArr[2], 6);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.GROUP_READ), bArr[2], 5);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.GROUP_WRITE), bArr[2], 4);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.GROUP_EXECUTE), bArr[2], 3);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.OTHERS_READ), bArr[2], 2);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.OTHERS_WRITE), bArr[2], 1);
            bArr[2] = a(setPermissions.contains(PosixFilePermission.OTHERS_EXECUTE), bArr[2], 0);
        } catch (IOException unused) {
        }
        return bArr;
    }

    private static byte a(boolean z, byte b2, int i) {
        return z ? zqg.e(b2, i) : b2;
    }

    private static void a(byte b2, int i, Set<PosixFilePermission> set, PosixFilePermission posixFilePermission) {
        if (zqg.a(b2, i)) {
            set.add(posixFilePermission);
        }
    }
}
