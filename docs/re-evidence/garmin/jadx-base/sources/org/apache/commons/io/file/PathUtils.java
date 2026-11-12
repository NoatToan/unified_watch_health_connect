package org.apache.commons.io.file;

import a73.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.io.IOUtils;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class PathUtils {
    public static final DeleteOption[] EMPTY_DELETE_OPTION_ARRAY = new DeleteOption[0];
    public static final FileVisitOption[] EMPTY_FILE_VISIT_OPTION_ARRAY = new FileVisitOption[0];
    public static final LinkOption[] EMPTY_LINK_OPTION_ARRAY = new LinkOption[0];
    public static final OpenOption[] EMPTY_OPEN_OPTION_ARRAY = new OpenOption[0];

    public static class RelativeSortedPaths {
        final boolean equals;
        final List<Path> relativeFileList1;
        final List<Path> relativeFileList2;

        private RelativeSortedPaths(Path path, Path path2, int i14, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) {
            List<Path> list;
            List<Path> list2 = null;
            if (path == null && path2 == null) {
                this.equals = true;
            } else {
                if ((path == null) ^ (path2 == null)) {
                    this.equals = false;
                } else {
                    boolean zExists = Files.exists(path, linkOptionArr);
                    boolean zExists2 = Files.exists(path2, linkOptionArr);
                    if (zExists && zExists2) {
                        AccumulatorPathVisitor accumulatorPathVisitorAccumulate = PathUtils.accumulate(path, i14, fileVisitOptionArr);
                        AccumulatorPathVisitor accumulatorPathVisitorAccumulate2 = PathUtils.accumulate(path2, i14, fileVisitOptionArr);
                        if (accumulatorPathVisitorAccumulate.getDirList().size() == accumulatorPathVisitorAccumulate2.getDirList().size() && accumulatorPathVisitorAccumulate.getFileList().size() == accumulatorPathVisitorAccumulate2.getFileList().size() && accumulatorPathVisitorAccumulate.relativizeDirectories(path, true, null).equals(accumulatorPathVisitorAccumulate2.relativizeDirectories(path2, true, null))) {
                            List<Path> listRelativizeFiles = accumulatorPathVisitorAccumulate.relativizeFiles(path, true, null);
                            List<Path> listRelativizeFiles2 = accumulatorPathVisitorAccumulate2.relativizeFiles(path2, true, null);
                            this.equals = listRelativizeFiles.equals(listRelativizeFiles2);
                            list2 = listRelativizeFiles;
                            list = listRelativizeFiles2;
                        } else {
                            this.equals = false;
                        }
                        this.relativeFileList1 = list2;
                        this.relativeFileList2 = list;
                    }
                    this.equals = (zExists || zExists2) ? false : true;
                }
            }
            list = null;
            this.relativeFileList1 = list2;
            this.relativeFileList2 = list;
        }
    }

    private PathUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AccumulatorPathVisitor accumulate(Path path, int i14, FileVisitOption[] fileVisitOptionArr) {
        return (AccumulatorPathVisitor) visitFileTree(AccumulatorPathVisitor.withLongCounters(), path, toFileVisitOptionSet(fileVisitOptionArr), i14);
    }

    public static Counters.PathCounters cleanDirectory(Path path, DeleteOption... deleteOptionArr) {
        return ((CleaningPathVisitor) visitFileTree(new CleaningPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters copyDirectory(Path path, Path path2, CopyOption... copyOptionArr) {
        return ((CopyDirectoryVisitor) visitFileTree(new CopyDirectoryVisitor(Counters.longPathCounters(), path, path2, copyOptionArr), path)).getPathCounters();
    }

    public static Path copyFile(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            Files.copy(inputStreamOpenStream, path, copyOptionArr);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return path;
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

    public static Path copyFileToDirectory(URL url, Path path, CopyOption... copyOptionArr) throws IOException {
        InputStream inputStreamOpenStream = url.openStream();
        try {
            Files.copy(inputStreamOpenStream, path.resolve(url.getFile()), copyOptionArr);
            if (inputStreamOpenStream != null) {
                inputStreamOpenStream.close();
            }
            return path;
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

    public static Counters.PathCounters countDirectory(Path path) {
        return ((CountingPathVisitor) visitFileTree(new CountingPathVisitor(Counters.longPathCounters()), path)).getPathCounters();
    }

    public static Counters.PathCounters delete(Path path, DeleteOption... deleteOptionArr) {
        return Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS) ? deleteDirectory(path, deleteOptionArr) : deleteFile(path, deleteOptionArr);
    }

    public static Counters.PathCounters deleteDirectory(Path path, DeleteOption... deleteOptionArr) {
        return ((DeletingPathVisitor) visitFileTree(new DeletingPathVisitor(Counters.longPathCounters(), deleteOptionArr, new String[0]), path)).getPathCounters();
    }

    public static Counters.PathCounters deleteFile(Path path, DeleteOption... deleteOptionArr) throws NoSuchFileException {
        LinkOption linkOption = LinkOption.NOFOLLOW_LINKS;
        if (Files.isDirectory(path, linkOption)) {
            throw new NoSuchFileException(path.toString());
        }
        Counters.PathCounters pathCountersLongPathCounters = Counters.longPathCounters();
        boolean zExists = Files.exists(path, linkOption);
        long size = zExists ? Files.size(path) : 0L;
        if (overrideReadOnly(deleteOptionArr) && zExists) {
            setReadOnly(path, false, linkOption);
        }
        if (Files.deleteIfExists(path)) {
            pathCountersLongPathCounters.getFileCounter().increment();
            pathCountersLongPathCounters.getByteCounter().add(size);
        }
        return pathCountersLongPathCounters;
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr, FileVisitOption[] fileVisitOptionArr) {
        if (path == null && path2 == null) {
            return true;
        }
        if ((path == null) ^ (path2 == null)) {
            return false;
        }
        if (!Files.exists(path, new LinkOption[0]) && !Files.exists(path2, new LinkOption[0])) {
            return true;
        }
        RelativeSortedPaths relativeSortedPaths = new RelativeSortedPaths(path, path2, Integer.MAX_VALUE, linkOptionArr, fileVisitOptionArr);
        if (!relativeSortedPaths.equals) {
            return false;
        }
        List<Path> list = relativeSortedPaths.relativeFileList1;
        List<Path> list2 = relativeSortedPaths.relativeFileList2;
        for (Path path3 : list) {
            if (Collections.binarySearch(list2, path3) <= -1) {
                h.z("Unexpected mismatch.");
                return false;
            }
            if (!fileContentEquals(path.resolve(path3), path2.resolve(path3), linkOptionArr, openOptionArr)) {
                return false;
            }
        }
        return true;
    }

    public static boolean directoryContentEquals(Path path, Path path2, int i14, LinkOption[] linkOptionArr, FileVisitOption[] fileVisitOptionArr) {
        return new RelativeSortedPaths(path, path2, i14, linkOptionArr, fileVisitOptionArr).equals;
    }

    public static boolean fileContentEquals(Path path, Path path2, LinkOption[] linkOptionArr, OpenOption[] openOptionArr) throws IOException {
        if (path == null && path2 == null) {
            return true;
        }
        if ((path == null) ^ (path2 == null)) {
            return false;
        }
        Path pathNormalize = path.normalize();
        Path pathNormalize2 = path2.normalize();
        boolean zExists = Files.exists(pathNormalize, linkOptionArr);
        if (zExists != Files.exists(pathNormalize2, linkOptionArr)) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (Files.isDirectory(pathNormalize, linkOptionArr)) {
            h.B(pathNormalize, "Can't compare directories, only files: ");
            return false;
        }
        if (Files.isDirectory(pathNormalize2, linkOptionArr)) {
            h.B(pathNormalize2, "Can't compare directories, only files: ");
            return false;
        }
        if (Files.size(pathNormalize) != Files.size(pathNormalize2)) {
            return false;
        }
        if (path.equals(path2)) {
            return true;
        }
        InputStream inputStreamNewInputStream = Files.newInputStream(pathNormalize, openOptionArr);
        try {
            InputStream inputStreamNewInputStream2 = Files.newInputStream(pathNormalize2, openOptionArr);
            try {
                boolean zContentEquals = IOUtils.contentEquals(inputStreamNewInputStream, inputStreamNewInputStream2);
                if (inputStreamNewInputStream2 != null) {
                    inputStreamNewInputStream2.close();
                }
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
                return zContentEquals;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    if (inputStreamNewInputStream2 != null) {
                        try {
                            inputStreamNewInputStream2.close();
                        } catch (Throwable th5) {
                            th3.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                if (inputStreamNewInputStream != null) {
                    try {
                        inputStreamNewInputStream.close();
                    } catch (Throwable th8) {
                        th6.addSuppressed(th8);
                    }
                }
                throw th7;
            }
        }
    }

    public static List<AclEntry> getAclEntryList(Path path) {
        AclFileAttributeView aclFileAttributeView = (AclFileAttributeView) Files.getFileAttributeView(path, AclFileAttributeView.class, new LinkOption[0]);
        if (aclFileAttributeView == null) {
            return null;
        }
        return aclFileAttributeView.getAcl();
    }

    public static boolean isEmpty(Path path) {
        return Files.isDirectory(path, new LinkOption[0]) ? isEmptyDirectory(path) : isEmptyFile(path);
    }

    public static boolean isEmptyDirectory(Path path) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
        try {
            if (directoryStreamNewDirectoryStream.iterator().hasNext()) {
                directoryStreamNewDirectoryStream.close();
                return false;
            }
            directoryStreamNewDirectoryStream.close();
            return true;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                if (directoryStreamNewDirectoryStream != null) {
                    try {
                        directoryStreamNewDirectoryStream.close();
                    } catch (Throwable th5) {
                        th3.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
    }

    public static boolean isEmptyFile(Path path) {
        return Files.size(path) <= 0;
    }

    private static boolean overrideReadOnly(DeleteOption[] deleteOptionArr) {
        if (deleteOptionArr == null) {
            return false;
        }
        for (DeleteOption deleteOption : deleteOptionArr) {
            if (deleteOption == StandardDeleteOption.OVERRIDE_READ_ONLY) {
                return true;
            }
        }
        return false;
    }

    public static List<Path> relativize(Collection<Path> collection, Path path, boolean z14, Comparator<? super Path> comparator) {
        Stream<Path> stream = collection.stream();
        path.getClass();
        Stream map = stream.map(new k(path, 6));
        if (z14) {
            map = comparator == null ? map.sorted() : map.sorted(comparator);
        }
        return (List) map.collect(Collectors.toList());
    }

    public static Path setReadOnly(Path path, boolean z14, LinkOption... linkOptionArr) {
        DosFileAttributeView dosFileAttributeView = (DosFileAttributeView) Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
        if (dosFileAttributeView != null) {
            dosFileAttributeView.setReadOnly(z14);
            return path;
        }
        PosixFileAttributeView posixFileAttributeView = (PosixFileAttributeView) Files.getFileAttributeView(path, PosixFileAttributeView.class, linkOptionArr);
        if (posixFileAttributeView == null) {
            h.B(path, "No DosFileAttributeView or PosixFileAttributeView for ");
            return null;
        }
        Set<PosixFilePermission> setPermissions = posixFileAttributeView.readAttributes().permissions();
        setPermissions.remove(PosixFilePermission.OWNER_WRITE);
        setPermissions.remove(PosixFilePermission.GROUP_WRITE);
        setPermissions.remove(PosixFilePermission.OTHERS_WRITE);
        return Files.setPosixFilePermissions(path, setPermissions);
    }

    public static Set<FileVisitOption> toFileVisitOptionSet(FileVisitOption... fileVisitOptionArr) {
        return fileVisitOptionArr == null ? EnumSet.noneOf(FileVisitOption.class) : (Set) Arrays.stream(fileVisitOptionArr).collect(Collectors.toSet());
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t7, String str, String... strArr) {
        return (T) visitFileTree(t7, Paths.get(str, strArr));
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t7, Path path, Set<FileVisitOption> set, int i14) throws IOException {
        Files.walkFileTree(path, set, i14, t7);
        return t7;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t7, Path path) throws IOException {
        Files.walkFileTree(path, t7);
        return t7;
    }

    public static <T extends FileVisitor<? super Path>> T visitFileTree(T t7, URI uri) {
        return (T) visitFileTree(t7, Paths.get(uri));
    }

    public static boolean directoryContentEquals(Path path, Path path2) {
        return directoryContentEquals(path, path2, Integer.MAX_VALUE, EMPTY_LINK_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static Counters.PathCounters delete(Path path) {
        return delete(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters cleanDirectory(Path path) {
        return cleanDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Counters.PathCounters deleteDirectory(Path path) {
        return deleteDirectory(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static Path copyFileToDirectory(Path path, Path path2, CopyOption... copyOptionArr) {
        return Files.copy(path, path2.resolve(path.getFileName()), copyOptionArr);
    }

    public static Counters.PathCounters deleteFile(Path path) {
        return deleteFile(path, EMPTY_DELETE_OPTION_ARRAY);
    }

    public static boolean directoryAndFileContentEquals(Path path, Path path2) {
        return directoryAndFileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY, EMPTY_FILE_VISIT_OPTION_ARRAY);
    }

    public static boolean fileContentEquals(Path path, Path path2) {
        return fileContentEquals(path, path2, EMPTY_LINK_OPTION_ARRAY, EMPTY_OPEN_OPTION_ARRAY);
    }
}
