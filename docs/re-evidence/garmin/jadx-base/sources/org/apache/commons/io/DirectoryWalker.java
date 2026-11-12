package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DirectoryWalker<T> {
    private final int depthLimit;
    private final FileFilter filter;

    public DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i14) {
        if (iOFileFilter == null && iOFileFilter2 == null) {
            this.filter = null;
        } else {
            this.filter = FileFilterUtils.or(FileFilterUtils.makeDirectoryOnly(iOFileFilter == null ? TrueFileFilter.TRUE : iOFileFilter), FileFilterUtils.makeFileOnly(iOFileFilter2 == null ? TrueFileFilter.TRUE : iOFileFilter2));
        }
        this.depthLimit = i14;
    }

    private void walk(File file, int i14, Collection<T> collection) throws CancelException {
        checkIfCancelled(file, i14, collection);
        if (handleDirectory(file, i14, collection)) {
            handleDirectoryStart(file, i14, collection);
            int i15 = i14 + 1;
            int i16 = this.depthLimit;
            if (i16 < 0 || i15 <= i16) {
                checkIfCancelled(file, i14, collection);
                FileFilter fileFilter = this.filter;
                File[] fileArrFilterDirectoryContents = filterDirectoryContents(file, i14, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (fileArrFilterDirectoryContents == null) {
                    handleRestricted(file, i15, collection);
                } else {
                    for (File file2 : fileArrFilterDirectoryContents) {
                        if (file2.isDirectory()) {
                            walk(file2, i15, collection);
                        } else {
                            checkIfCancelled(file2, i15, collection);
                            handleFile(file2, i15, collection);
                            checkIfCancelled(file2, i15, collection);
                        }
                    }
                }
            }
            handleDirectoryEnd(file, i14, collection);
        }
        checkIfCancelled(file, i14, collection);
    }

    public final void checkIfCancelled(File file, int i14, Collection<T> collection) throws CancelException {
        if (handleIsCancelled(file, i14, collection)) {
            throw new CancelException(file, i14);
        }
    }

    public File[] filterDirectoryContents(File file, int i14, File... fileArr) {
        return fileArr;
    }

    public void handleCancelled(File file, Collection<T> collection, CancelException cancelException) throws CancelException {
        throw cancelException;
    }

    public boolean handleDirectory(File file, int i14, Collection<T> collection) {
        return true;
    }

    public void handleDirectoryEnd(File file, int i14, Collection<T> collection) {
    }

    public void handleDirectoryStart(File file, int i14, Collection<T> collection) {
    }

    public void handleEnd(Collection<T> collection) {
    }

    public void handleFile(File file, int i14, Collection<T> collection) {
    }

    public boolean handleIsCancelled(File file, int i14, Collection<T> collection) {
        return false;
    }

    public void handleRestricted(File file, int i14, Collection<T> collection) {
    }

    public void handleStart(File file, Collection<T> collection) {
    }

    public static class CancelException extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public CancelException(String str, File file, int i14) {
            super(str);
            this.file = file;
            this.depth = i14;
        }

        public int getDepth() {
            return this.depth;
        }

        public File getFile() {
            return this.file;
        }

        public CancelException(File file, int i14) {
            this("Operation Cancelled", file, i14);
        }
    }

    public DirectoryWalker(FileFilter fileFilter, int i14) {
        this.filter = fileFilter;
        this.depthLimit = i14;
    }

    public DirectoryWalker() {
        this(null, -1);
    }

    public final void walk(File file, Collection<T> collection) throws CancelException {
        Objects.requireNonNull(file, "startDirectory");
        try {
            handleStart(file, collection);
            walk(file, 0, collection);
            handleEnd(collection);
        } catch (CancelException e4) {
            handleCancelled(file, collection, e4);
        }
    }
}
