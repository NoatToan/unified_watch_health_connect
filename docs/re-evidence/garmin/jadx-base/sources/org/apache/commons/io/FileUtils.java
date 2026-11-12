package org.apache.commons.io;

import a73.o;
import c22.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.l;
import com.google.protobuf.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import o2.c;
import org.apache.commons.io.file.Counters;
import org.apache.commons.io.file.PathUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        ONE_KB_BI = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        ONE_MB_BI = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        ONE_GB_BI = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        ONE_TB_BI = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        ONE_PB_BI = bigIntegerMultiply4;
        ONE_EB_BI = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(ONE_EB));
        ONE_ZB = bigIntegerMultiply5;
        ONE_YB = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        EMPTY_FILE_ARRAY = new File[0];
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        BigInteger bigInteger2 = ONE_EB_BI;
        BigInteger bigIntegerDivide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (bigIntegerDivide.compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger2)).concat(" EB");
        }
        BigInteger bigInteger4 = ONE_PB_BI;
        if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger4)).concat(" PB");
        }
        BigInteger bigInteger5 = ONE_TB_BI;
        if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger5)).concat(" TB");
        }
        BigInteger bigInteger6 = ONE_GB_BI;
        if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger6)).concat(" GB");
        }
        BigInteger bigInteger7 = ONE_MB_BI;
        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
            return String.valueOf(bigInteger.divide(bigInteger7)).concat(" MB");
        }
        BigInteger bigInteger8 = ONE_KB_BI;
        return bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0 ? String.valueOf(bigInteger.divide(bigInteger8)).concat(" KB") : String.valueOf(bigInteger).concat(" bytes");
    }

    private static void checkDirectory(File file) {
        if (!file.exists()) {
            t.h(file, " does not exist");
        } else {
            if (file.isDirectory()) {
                return;
            }
            t.h(file, " is not a directory");
        }
    }

    private static void checkEqualSizes(File file, File file2, long j8, long j14) throws IOException {
        if (j8 == j14) {
            return;
        }
        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + j8 + " Actual: " + j14);
    }

    private static void checkFileRequirements(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, "target");
        if (!file.exists()) {
            throw new FileNotFoundException(g.o("Source '", file, "' does not exist"));
        }
    }

    public static Checksum checksum(File file, Checksum checksum) throws IOException {
        if (file.isDirectory()) {
            h.s("Checksums can't be computed on directories");
            return null;
        }
        CheckedInputStream checkedInputStream = new CheckedInputStream(new FileInputStream(file), checksum);
        try {
            IOUtils.consume(checkedInputStream);
            checkedInputStream.close();
            return checksum;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    checkedInputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static long checksumCRC32(File file) {
        return checksum(file, new CRC32()).getValue();
    }

    public static void cleanDirectory(File file) throws IOException {
        File[] fileArrVerifiedListFiles = verifiedListFiles(file);
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrVerifiedListFiles) {
            try {
                forceDelete(file2);
            } catch (IOException e4) {
                arrayList.add(e4);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    private static void cleanDirectoryOnExit(File file) throws IOException {
        File[] fileArrVerifiedListFiles = verifiedListFiles(file);
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrVerifiedListFiles) {
            try {
                forceDeleteOnExit(file2);
            } catch (IOException e4) {
                arrayList.add(e4);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new IOExceptionList(arrayList);
        }
    }

    public static boolean contentEquals(File file, File file2) throws IOException {
        boolean zExists;
        if (file == null && file2 == null) {
            return true;
        }
        if (((file == null) ^ (file2 == null)) || (zExists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            h.C("Can't compare directories, only files");
            return false;
        }
        if (file.length() != file2.length()) {
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                boolean zContentEquals = IOUtils.contentEquals(fileInputStream, fileInputStream2);
                fileInputStream2.close();
                fileInputStream.close();
                return zContentEquals;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    fileInputStream.close();
                } catch (Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) throws IOException {
        boolean zExists;
        if (file == null && file2 == null) {
            return true;
        }
        if (((file == null) ^ (file2 == null)) || (zExists = file.exists()) != file2.exists()) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            h.C("Can't compare directories, only files");
            return false;
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), Charsets.toCharset(str));
        try {
            InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(file2), Charsets.toCharset(str));
            try {
                boolean zContentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader, inputStreamReader2);
                inputStreamReader2.close();
                inputStreamReader.close();
                return zContentEqualsIgnoreEOL;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        inputStreamReader2.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th8) {
                    th6.addSuppressed(th8);
                }
                throw th7;
            }
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z14, CopyOption... copyOptionArr) throws IOException {
        ArrayList arrayList;
        checkFileRequirements(file, file2);
        if (!file.isDirectory()) {
            h.C(g.o("Source '", file, "' exists but is not a directory"));
            return;
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            c.k(file, "' and destination '", file2, "' are the same", "Source '");
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(fileArrListFiles.length);
                for (File file3 : fileArrListFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
        } else {
            arrayList = null;
        }
        doCopyDirectory(file, file2, fileFilter, z14, arrayList, copyOptionArr);
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceDir");
        if (file.exists() && !file.isDirectory()) {
            h.s(g.o("Source '", file, "' is not a directory"));
            return;
        }
        Objects.requireNonNull(file2, "destinationDir");
        if (!file2.exists() || file2.isDirectory()) {
            copyDirectory(file, new File(file2, file.getName()), true);
        } else {
            h.s(g.o("Destination '", file2, "' is not a directory"));
        }
    }

    public static void copyFile(File file, File file2, boolean z14, CopyOption... copyOptionArr) throws IOException {
        checkFileRequirements(file, file2);
        if (file.isDirectory()) {
            h.C(g.o("Source '", file, "' exists but is a directory"));
            return;
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            c.k(file, "' and destination '", file2, "' are the same", "Source '");
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            h.C(g.o("Destination '", parentFile, "' directory cannot be created"));
        } else if (!file2.exists() || file2.canWrite()) {
            doCopyFile(file, file2, z14, copyOptionArr);
        } else {
            h.C(g.o("Destination '", file2, "' exists but is read-only"));
        }
    }

    public static void copyFileToDirectory(File file, File file2, boolean z14) throws IOException {
        Objects.requireNonNull(file2, "destinationDir");
        if (!file2.exists() || file2.isDirectory()) {
            copyFile(file, new File(file2, file.getName()), z14);
        } else {
            h.s(g.o("Destination '", file2, "' is not a directory"));
        }
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        try {
            copyToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static void copyToDirectory(File file, File file2) throws IOException {
        Objects.requireNonNull(file, "sourceFile");
        if (file.isFile()) {
            copyFileToDirectory(file, file2);
        } else if (file.isDirectory()) {
            copyDirectoryToDirectory(file, file2);
        } else {
            h.C(g.o("The source ", file, " does not exist"));
        }
    }

    public static void copyToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file);
        try {
            IOUtils.copy(inputStream, fileOutputStreamOpenOutputStream);
            if (fileOutputStreamOpenOutputStream != null) {
                fileOutputStreamOpenOutputStream.close();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static void copyURLToFile(URL url, File file, int i14, int i15) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(i14);
        uRLConnectionOpenConnection.setReadTimeout(i15);
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            copyInputStreamToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static String decodeUrl(String str) {
        int i14;
        if (str == null || str.indexOf(37) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb3 = new StringBuilder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        int i15 = 0;
        while (i15 < length) {
            if (str.charAt(i15) == '%') {
                while (true) {
                    i14 = i15 + 3;
                    try {
                        try {
                            byteBufferAllocate.put((byte) Integer.parseInt(str.substring(i15 + 1, i14), 16));
                            if (i14 >= length) {
                                break;
                            }
                            try {
                                if (str.charAt(i14) != '%') {
                                    break;
                                }
                                i15 = i14;
                            } catch (RuntimeException unused) {
                                i15 = i14;
                                if (byteBufferAllocate.position() > 0) {
                                    byteBufferAllocate.flip();
                                    sb3.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                                    byteBufferAllocate.clear();
                                }
                                sb3.append(str.charAt(i15));
                                i15++;
                            }
                        } catch (RuntimeException unused2) {
                        }
                    } catch (Throwable th3) {
                        if (byteBufferAllocate.position() > 0) {
                            byteBufferAllocate.flip();
                            sb3.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                            byteBufferAllocate.clear();
                        }
                        throw th3;
                    }
                }
                if (byteBufferAllocate.position() > 0) {
                    byteBufferAllocate.flip();
                    sb3.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                    byteBufferAllocate.clear();
                }
                i15 = i14;
            }
            sb3.append(str.charAt(i15));
            i15++;
        }
        return sb3.toString();
    }

    public static void deleteDirectory(File file) throws IOException {
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            if (file.delete()) {
                return;
            }
            h.C(g.o("Unable to delete directory ", file, "."));
        }
    }

    private static void deleteDirectoryOnExit(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (isSymlink(file)) {
                return;
            }
            cleanDirectoryOnExit(file);
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    public static boolean directoryContains(File file, File file2) {
        if (file == null) {
            h.s("Directory must not be null");
            return false;
        }
        if (!file.isDirectory()) {
            h.s(v.h.v(file, "Not a directory: "));
            return false;
        }
        if (file2 != null && file.exists() && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, boolean z14, List<String> list, CopyOption... copyOptionArr) throws IOException {
        FileFilter fileFilter2;
        boolean z15;
        List<String> list2;
        CopyOption[] copyOptionArr2;
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (fileArrListFiles == null) {
            h.C(v.h.v(file, "Failed to list contents of "));
            return;
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                h.C(g.o("Destination '", file2, "' exists but is not a directory"));
                return;
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            h.C(g.o("Destination '", file2, "' directory cannot be created"));
            return;
        }
        if (!file2.canWrite()) {
            h.C(g.o("Destination '", file2, "' cannot be written to"));
            return;
        }
        int length = fileArrListFiles.length;
        int i14 = 0;
        while (i14 < length) {
            File file3 = fileArrListFiles[i14];
            File file4 = new File(file2, file3.getName());
            if (list != null && list.contains(file3.getCanonicalPath())) {
                fileFilter2 = fileFilter;
                z15 = z14;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
            } else if (file3.isDirectory()) {
                fileFilter2 = fileFilter;
                z15 = z14;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
                doCopyDirectory(file3, file4, fileFilter2, z15, list2, copyOptionArr2);
            } else {
                fileFilter2 = fileFilter;
                z15 = z14;
                list2 = list;
                copyOptionArr2 = copyOptionArr;
                doCopyFile(file3, file4, z15, copyOptionArr2);
            }
            i14++;
            fileFilter = fileFilter2;
            z14 = z15;
            list = list2;
            copyOptionArr = copyOptionArr2;
        }
        if (z14) {
            setLastModified(file, file2);
        }
    }

    private static void doCopyFile(File file, File file2, boolean z14, CopyOption... copyOptionArr) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            h.C(g.o("Destination '", file2, "' exists but is a directory"));
            return;
        }
        Path path = file.toPath();
        Path path2 = file2.toPath();
        Files.copy(path, path2, copyOptionArr);
        checkEqualSizes(file, file2, Files.size(path), Files.size(path2));
        checkEqualSizes(file, file2, file.length(), file2.length());
        if (z14) {
            setLastModified(file, file2);
        }
    }

    public static void forceDelete(File file) throws IOException {
        try {
            Counters.PathCounters pathCountersDelete = PathUtils.delete(file.toPath());
            if (pathCountersDelete.getFileCounter().get() < 1 && pathCountersDelete.getDirectoryCounter().get() < 1) {
                throw new FileNotFoundException(v.h.v(file, "File does not exist: "));
            }
        } catch (IOException e4) {
            h.u(v.h.v(file, "Unable to delete file: "), e4);
        }
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            h.C(g.o("File ", file, " exists and is not a directory. Unable to create directory."));
        } else {
            if (file.mkdirs() || file.isDirectory()) {
                return;
            }
            h.C(v.h.v(file, "Unable to create directory "));
        }
    }

    public static void forceMkdirParent(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        forceMkdir(parentFile);
    }

    public static File getFile(String... strArr) {
        Objects.requireNonNull(strArr, "names");
        File file = null;
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    private static void innerListFiles(Collection<File> collection, File file, IOFileFilter iOFileFilter, boolean z14) {
        File[] fileArrListFiles = file.listFiles((FileFilter) iOFileFilter);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    if (z14) {
                        collection.add(file2);
                    }
                    innerListFiles(collection, file2, iOFileFilter, z14);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    private static Collection<File> innerListFilesOrDirectories(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, boolean z14) {
        validateListFilesParameters(file, iOFileFilter);
        IOFileFilter upEffectiveFileFilter = setUpEffectiveFileFilter(iOFileFilter);
        IOFileFilter upEffectiveDirFilter = setUpEffectiveDirFilter(iOFileFilter2);
        LinkedList linkedList = new LinkedList();
        if (z14) {
            linkedList.add(file);
        }
        innerListFiles(linkedList, file, FileFilterUtils.or(upEffectiveFileFilter, upEffectiveDirFilter), z14);
        return linkedList;
    }

    public static boolean isFileNewer(File file, File file2) {
        Objects.requireNonNull(file2, "reference");
        if (file2.exists()) {
            return isFileNewer(file, file2.lastModified());
        }
        h.s(g.o("The reference file '", file2, "' doesn't exist"));
        return false;
    }

    public static boolean isFileOlder(File file, File file2) {
        Objects.requireNonNull(file2, "reference");
        if (file2.exists()) {
            return isFileOlder(file, file2.lastModified());
        }
        h.s(g.o("The reference file '", file2, "' doesn't exist"));
        return false;
    }

    public static boolean isSymlink(File file) {
        Objects.requireNonNull(file, "file");
        return Files.isSymbolicLink(file.toPath());
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static LineIterator lineIterator(File file, String str) {
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            fileInputStreamOpenInputStream = openInputStream(file);
            return IOUtils.lineIterator(fileInputStreamOpenInputStream, str);
        } catch (IOException | RuntimeException e4) {
            IOUtils.closeQuietly(fileInputStreamOpenInputStream, new o(e4, 4));
            throw e4;
        }
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z14) {
        return listFiles(file, strArr == null ? TrueFileFilter.INSTANCE : new SuffixFileFilter(toSuffixes(strArr)), z14 ? TrueFileFilter.INSTANCE : FalseFileFilter.INSTANCE);
    }

    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return innerListFilesOrDirectories(file, iOFileFilter, iOFileFilter2, true);
    }

    public static void moveDirectory(File file, File file2) throws IOException {
        validateMoveParameters(file, file2);
        if (!file.isDirectory()) {
            h.C(g.o("Source '", file, "' is not a directory"));
            return;
        }
        if (file2.exists()) {
            throw new FileExistsException(g.o("Destination '", file2, "' already exists"));
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
            h.t("Cannot move directory: ", file, " to a subdirectory of itself: ", file2);
            return;
        }
        copyDirectory(file, file2);
        deleteDirectory(file);
        if (file.exists()) {
            c.k(file, "' after copy to '", file2, "'", "Failed to delete original directory '");
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z14) throws IOException {
        validateMoveParameters(file, file2);
        if (!file2.exists() && z14 && !file2.mkdirs()) {
            h.C(g.o("Could not create destination directories '", file2, "'"));
            return;
        }
        if (file2.exists()) {
            if (file2.isDirectory()) {
                moveDirectory(file, new File(file2, file.getName()));
                return;
            } else {
                h.C(g.o("Destination '", file2, "' is not a directory"));
                return;
            }
        }
        throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z14 + "]");
    }

    public static void moveFile(File file, File file2) throws IOException {
        validateMoveParameters(file, file2);
        if (file.isDirectory()) {
            h.C(g.o("Source '", file, "' is a directory"));
            return;
        }
        if (file2.exists()) {
            throw new FileExistsException(g.o("Destination '", file2, "' already exists"));
        }
        if (file2.isDirectory()) {
            h.C(g.o("Destination '", file2, "' is a directory"));
            return;
        }
        if (file.renameTo(file2)) {
            return;
        }
        copyFile(file, file2);
        if (file.delete()) {
            return;
        }
        deleteQuietly(file2);
        c.k(file, "' after copy to '", file2, "'", "Failed to delete original file '");
    }

    public static void moveFileToDirectory(File file, File file2, boolean z14) throws IOException {
        validateMoveParameters(file, file2);
        if (!file2.exists() && z14 && !file2.mkdirs()) {
            h.C(g.o("Could not create destination directories '", file2, "'"));
            return;
        }
        if (file2.exists()) {
            if (file2.isDirectory()) {
                moveFile(file, new File(file2, file.getName()));
                return;
            } else {
                h.C(g.o("Destination '", file2, "' is not a directory"));
                return;
            }
        }
        throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z14 + "]");
    }

    public static void moveToDirectory(File file, File file2, boolean z14) throws IOException {
        validateMoveParameters(file, file2);
        if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z14);
        } else {
            moveFileToDirectory(file, file2, z14);
        }
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(g.o("File '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            h.C(g.o("File '", file, "' exists but is a directory"));
            return null;
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        h.C(g.o("File '", file, "' cannot be read"));
        return null;
    }

    public static FileOutputStream openOutputStream(File file, boolean z14) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                h.C(g.o("Directory '", parentFile, "' could not be created"));
                return null;
            }
        } else {
            if (file.isDirectory()) {
                h.C(g.o("File '", file, "' exists but is a directory"));
                return null;
            }
            if (!file.canWrite()) {
                h.C(g.o("File '", file, "' cannot be written to"));
                return null;
            }
        }
        return new FileOutputStream(file, z14);
    }

    public static byte[] readFileToByteArray(File file) throws IOException {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        try {
            long length = file.length();
            byte[] byteArray = length > 0 ? IOUtils.toByteArray(fileInputStreamOpenInputStream, length) : IOUtils.toByteArray(fileInputStreamOpenInputStream);
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return byteArray;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        fileInputStreamOpenInputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static String readFileToString(File file, Charset charset) throws IOException {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        try {
            String string = IOUtils.toString(fileInputStreamOpenInputStream, Charsets.toCharset(charset));
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return string;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        fileInputStreamOpenInputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        try {
            List<String> lines = IOUtils.readLines(fileInputStreamOpenInputStream, Charsets.toCharset(charset));
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return lines;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileInputStreamOpenInputStream != null) {
                    try {
                        fileInputStreamOpenInputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    private static void setLastModified(File file, File file2) throws IOException {
        if (file2.setLastModified(file.lastModified())) {
            return;
        }
        h.C(v.h.v(file, "Failed setLastModified on "));
    }

    private static IOFileFilter setUpEffectiveDirFilter(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? FalseFileFilter.INSTANCE : FileFilterUtils.and(iOFileFilter, DirectoryFileFilter.INSTANCE);
    }

    private static IOFileFilter setUpEffectiveFileFilter(IOFileFilter iOFileFilter) {
        return FileFilterUtils.and(iOFileFilter, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE));
    }

    public static long sizeOf(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
        }
        a.i(file, " does not exist");
        return 0L;
    }

    private static long sizeOf0(File file) {
        return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
        }
        a.i(file, " does not exist");
        return null;
    }

    private static BigInteger sizeOfBig0(File file) {
        return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }

    public static long sizeOfDirectory(File file) {
        checkDirectory(file);
        return sizeOfDirectory0(file);
    }

    private static long sizeOfDirectory0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jSizeOf0 = 0;
        for (File file2 : fileArrListFiles) {
            if (!isSymlink(file2)) {
                jSizeOf0 += sizeOf0(file2);
                if (jSizeOf0 < 0) {
                    return jSizeOf0;
                }
            }
        }
        return jSizeOf0;
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
        checkDirectory(file);
        return sizeOfDirectoryBig0(file);
    }

    private static BigInteger sizeOfDirectoryBig0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (File file2 : fileArrListFiles) {
            if (!isSymlink(file2)) {
                bigIntegerAdd = bigIntegerAdd.add(sizeOfBig0(file2));
            }
        }
        return bigIntegerAdd;
    }

    public static File toFile(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(decodeUrl(url.getFile().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar)));
    }

    public static File[] toFiles(URL... urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i14 = 0; i14 < urlArr.length; i14++) {
            URL url = urlArr[i14];
            if (url != null) {
                if (!url.getProtocol().equals("file")) {
                    l.j(url, "URL could not be converted to a File: ");
                    return null;
                }
                fileArr[i14] = toFile(url);
            }
        }
        return fileArr;
    }

    private static String[] toSuffixes(String... strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i14 = 0; i14 < strArr.length; i14++) {
            strArr2[i14] = "." + strArr[i14];
        }
        return strArr2;
    }

    public static URL[] toURLs(File... fileArr) {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i14 = 0; i14 < length; i14++) {
            urlArr[i14] = fileArr[i14].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) throws IOException {
        if (!file.exists()) {
            openOutputStream(file).close();
        }
        if (file.setLastModified(System.currentTimeMillis())) {
            return;
        }
        h.C(v.h.v(file, "Unable to set the last modification time for "));
    }

    private static void validateListFilesParameters(File file, IOFileFilter iOFileFilter) {
        if (file.isDirectory()) {
            Objects.requireNonNull(iOFileFilter, "fileFilter");
        } else {
            h.s(v.h.v(file, "Parameter 'directory' is not a directory: "));
        }
    }

    private static void validateMoveParameters(File file, File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "source");
        Objects.requireNonNull(file2, FirebaseAnalytics.Param.DESTINATION);
        if (!file.exists()) {
            throw new FileNotFoundException(g.o("Source '", file, "' does not exist"));
        }
    }

    private static File[] verifiedListFiles(File file) throws IOException {
        if (!file.exists()) {
            a.i(file, " does not exist");
            return null;
        }
        if (!file.isDirectory()) {
            a.i(file, " is not a directory");
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        h.C(v.h.v(file, "Failed to list contents of "));
        return null;
    }

    public static boolean waitFor(File file, int i14) {
        long jCurrentTimeMillis = (((long) i14) * 1000) + System.currentTimeMillis();
        boolean z14 = false;
        while (!file.exists()) {
            try {
                long jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis();
                if (jCurrentTimeMillis2 < 0) {
                    if (z14) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                }
                try {
                    Thread.sleep(Math.min(100L, jCurrentTimeMillis2));
                } catch (InterruptedException unused) {
                    z14 = true;
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return true;
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z14) throws IOException {
        writeStringToFile(file, charSequence == null ? null : charSequence.toString(), charset, z14);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i14, int i15, boolean z14) throws IOException {
        FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file, z14);
        try {
            fileOutputStreamOpenOutputStream.write(bArr, i14, i15);
            fileOutputStreamOpenOutputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z14) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openOutputStream(file, z14));
        try {
            IOUtils.writeLines(collection, str2, bufferedOutputStream, str);
            bufferedOutputStream.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z14) throws IOException {
        FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file, z14);
        try {
            IOUtils.write(str, (OutputStream) fileOutputStreamOpenOutputStream, charset);
            if (fileOutputStreamOpenOutputStream != null) {
                fileOutputStreamOpenOutputStream.close();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z14) {
        return listFiles(file, strArr, z14).iterator();
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence, boolean z14) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), z14);
    }

    public static void write(File file, CharSequence charSequence, Charset charset) throws IOException {
        write(file, charSequence, charset, false);
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void write(File file, CharSequence charSequence, String str) throws IOException {
        write(file, charSequence, str, false);
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z14) throws IOException {
        write(file, charSequence, Charsets.toCharset(str), z14);
    }

    public static LineIterator lineIterator(File file) {
        return lineIterator(file, null);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z14) throws IOException {
        writeByteArrayToFile(file, bArr, 0, bArr.length, z14);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i14, int i15) throws IOException {
        writeByteArrayToFile(file, bArr, i14, i15, false);
    }

    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return innerListFilesOrDirectories(file, iOFileFilter, iOFileFilter2, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) throws IOException {
        writeByteArrayToFile(file, bArr, false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str, boolean z14) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), z14);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z14) throws IOException {
        writeLines(file, null, collection, null, z14);
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws IOException {
        writeStringToFile(file, str, charset, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str) throws IOException {
        writeLines(file, null, collection, str, false);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    public static File getFile(File file, String... strArr) {
        Objects.requireNonNull(file, "directory");
        Objects.requireNonNull(strArr, "names");
        int length = strArr.length;
        int i14 = 0;
        while (i14 < length) {
            File file2 = new File(file, strArr[i14]);
            i14++;
            file = file2;
        }
        return file;
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z14) throws IOException {
        writeLines(file, null, collection, str, z14);
    }

    public static void writeStringToFile(File file, String str, String str2) throws IOException {
        writeStringToFile(file, str, str2, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection) throws IOException {
        writeLines(file, str, collection, null, false);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z14) throws IOException {
        writeStringToFile(file, str, Charsets.toCharset(str2), z14);
    }

    @Deprecated
    public static String readFileToString(File file) {
        return readFileToString(file, Charset.defaultCharset());
    }

    @Deprecated
    public static List<String> readLines(File file) {
        return readLines(file, Charset.defaultCharset());
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z14) throws IOException {
        writeLines(file, str, collection, null, z14);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileNewer(file, chronoLocalDate.atTime(localTime));
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(chronoLocalDate, "chronoLocalDate");
        Objects.requireNonNull(localTime, "localTime");
        return isFileOlder(file, chronoLocalDate.atTime(localTime));
    }

    public static String readFileToString(File file, String str) {
        return readFileToString(file, Charsets.toCharset(str));
    }

    public static List<String> readLines(File file, String str) {
        return readLines(file, Charsets.toCharset(str));
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) throws IOException {
        writeLines(file, str, collection, str2, false);
    }

    public static void writeLines(File file, Collection<?> collection) throws IOException {
        writeLines(file, null, collection, null, false);
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileNewer(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime) {
        return isFileOlder(file, chronoLocalDateTime, ZoneId.systemDefault());
    }

    public static void copyToDirectory(Iterable<File> iterable, File file) throws IOException {
        Objects.requireNonNull(iterable, "sourceIterable");
        Iterator<File> it = iterable.iterator();
        while (it.hasNext()) {
            copyFileToDirectory(it.next(), file);
        }
    }

    public static void copyURLToFile(URL url, File file) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            copyInputStreamToFile(inputStreamOpenStream, file);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (inputStreamOpenStream != null) {
                    try {
                        inputStreamOpenStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static boolean isFileNewer(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileNewer(file, (ChronoZonedDateTime<?>) chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileOlder(File file, ChronoLocalDateTime<?> chronoLocalDateTime, ZoneId zoneId) {
        Objects.requireNonNull(chronoLocalDateTime, "chronoLocalDateTime");
        Objects.requireNonNull(zoneId, "zoneId");
        return isFileOlder(file, (ChronoZonedDateTime<?>) chronoLocalDateTime.atZone(zoneId));
    }

    public static boolean isFileNewer(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return isFileNewer(file, chronoZonedDateTime.toInstant());
    }

    public static boolean isFileOlder(File file, ChronoZonedDateTime<?> chronoZonedDateTime) {
        Objects.requireNonNull(chronoZonedDateTime, "chronoZonedDateTime");
        return isFileOlder(file, chronoZonedDateTime.toInstant());
    }

    public static boolean isFileNewer(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileNewer(file, date.getTime());
    }

    public static boolean isFileOlder(File file, Date date) {
        Objects.requireNonNull(date, "date");
        return isFileOlder(file, date.getTime());
    }

    public static void copyFileToDirectory(File file, File file2) throws IOException {
        copyFileToDirectory(file, file2, true);
    }

    public static boolean isFileNewer(File file, ChronoLocalDate chronoLocalDate) {
        return isFileNewer(file, chronoLocalDate, LocalTime.now());
    }

    public static boolean isFileOlder(File file, ChronoLocalDate chronoLocalDate) {
        return isFileOlder(file, chronoLocalDate, LocalTime.now());
    }

    public static boolean isFileNewer(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return isFileNewer(file, instant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static boolean isFileOlder(File file, Instant instant) {
        Objects.requireNonNull(instant, "instant");
        return isFileOlder(file, instant.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static boolean isFileNewer(File file, long j8) {
        Objects.requireNonNull(file, "file");
        return file.exists() && file.lastModified() > j8;
    }

    public static boolean isFileOlder(File file, long j8) {
        Objects.requireNonNull(file, "file");
        return file.exists() && file.lastModified() < j8;
    }

    public static FileOutputStream openOutputStream(File file) {
        return openOutputStream(file, false);
    }

    public static void copyFile(File file, File file2, boolean z14) throws IOException {
        copyFile(file, file2, z14, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFile(File file, File file2) throws IOException {
        copyFile(file, file2, true);
    }

    public static long copyFile(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long jCopyLarge = IOUtils.copyLarge(fileInputStream, outputStream);
            fileInputStream.close();
            return jCopyLarge;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public static void copyDirectory(File file, File file2, boolean z14) throws IOException {
        copyDirectory(file, file2, null, z14);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) throws IOException {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z14) throws IOException {
        copyDirectory(file, file2, fileFilter, z14, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        copyDirectory(file, file2, true);
    }

    public static String byteCountToDisplaySize(long j8) {
        return byteCountToDisplaySize(BigInteger.valueOf(j8));
    }
}
