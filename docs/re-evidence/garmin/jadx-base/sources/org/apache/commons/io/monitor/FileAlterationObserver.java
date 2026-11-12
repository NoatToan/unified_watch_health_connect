package org.apache.commons.io.monitor;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final FileFilter fileFilter;
    private final List<FileAlterationListener> listeners;
    private final FileEntry rootEntry;

    public FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
        this.listeners = new CopyOnWriteArrayList();
        if (fileEntry == null) {
            h.s("Root entry is missing");
            throw null;
        }
        if (fileEntry.getFile() == null) {
            h.s("Root directory is missing");
            throw null;
        }
        this.rootEntry = fileEntry;
        this.fileFilter = fileFilter;
        if (iOCase == null || iOCase.equals(IOCase.SYSTEM)) {
            this.comparator = NameFileComparator.NAME_SYSTEM_COMPARATOR;
        } else if (iOCase.equals(IOCase.INSENSITIVE)) {
            this.comparator = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
        } else {
            this.comparator = NameFileComparator.NAME_COMPARATOR;
        }
    }

    private void checkAndNotify(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2 = fileArr.length > 0 ? new FileEntry[fileArr.length] : FileEntry.EMPTY_ENTRIES;
        int i14 = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i14 < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i14]) > 0) {
                FileEntry fileEntryCreateFileEntry = createFileEntry(fileEntry, fileArr[i14]);
                fileEntryArr2[i14] = fileEntryCreateFileEntry;
                doCreate(fileEntryCreateFileEntry);
                i14++;
            }
            if (i14 >= fileArr.length || this.comparator.compare(fileEntry2.getFile(), fileArr[i14]) != 0) {
                checkAndNotify(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                doDelete(fileEntry2);
            } else {
                doMatch(fileEntry2, fileArr[i14]);
                checkAndNotify(fileEntry2, fileEntry2.getChildren(), listFiles(fileArr[i14]));
                fileEntryArr2[i14] = fileEntry2;
                i14++;
            }
        }
        while (i14 < fileArr.length) {
            FileEntry fileEntryCreateFileEntry2 = createFileEntry(fileEntry, fileArr[i14]);
            fileEntryArr2[i14] = fileEntryCreateFileEntry2;
            doCreate(fileEntryCreateFileEntry2);
            i14++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }

    private FileEntry createFileEntry(FileEntry fileEntry, File file) {
        FileEntry fileEntryNewChildInstance = fileEntry.newChildInstance(file);
        fileEntryNewChildInstance.refresh(file);
        fileEntryNewChildInstance.setChildren(doListFiles(file, fileEntryNewChildInstance));
        return fileEntryNewChildInstance;
    }

    private void doCreate(FileEntry fileEntry) {
        for (FileAlterationListener fileAlterationListener : this.listeners) {
            if (fileEntry.isDirectory()) {
                fileAlterationListener.onDirectoryCreate(fileEntry.getFile());
            } else {
                fileAlterationListener.onFileCreate(fileEntry.getFile());
            }
        }
        for (FileEntry fileEntry2 : fileEntry.getChildren()) {
            doCreate(fileEntry2);
        }
    }

    private void doDelete(FileEntry fileEntry) {
        for (FileAlterationListener fileAlterationListener : this.listeners) {
            if (fileEntry.isDirectory()) {
                fileAlterationListener.onDirectoryDelete(fileEntry.getFile());
            } else {
                fileAlterationListener.onFileDelete(fileEntry.getFile());
            }
        }
    }

    private FileEntry[] doListFiles(File file, FileEntry fileEntry) {
        File[] fileArrListFiles = listFiles(file);
        FileEntry[] fileEntryArr = fileArrListFiles.length > 0 ? new FileEntry[fileArrListFiles.length] : FileEntry.EMPTY_ENTRIES;
        for (int i14 = 0; i14 < fileArrListFiles.length; i14++) {
            fileEntryArr[i14] = createFileEntry(fileEntry, fileArrListFiles[i14]);
        }
        return fileEntryArr;
    }

    private void doMatch(FileEntry fileEntry, File file) {
        if (fileEntry.refresh(file)) {
            for (FileAlterationListener fileAlterationListener : this.listeners) {
                if (fileEntry.isDirectory()) {
                    fileAlterationListener.onDirectoryChange(file);
                } else {
                    fileAlterationListener.onFileChange(file);
                }
            }
        }
    }

    private File[] listFiles(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            FileFilter fileFilter = this.fileFilter;
            fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        } else {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = FileUtils.EMPTY_FILE_ARRAY;
        }
        Comparator<File> comparator = this.comparator;
        if (comparator != null && fileArrListFiles.length > 1) {
            Arrays.sort(fileArrListFiles, comparator);
        }
        return fileArrListFiles;
    }

    public void addListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.listeners.add(fileAlterationListener);
        }
    }

    public void destroy() {
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<FileAlterationListener> getListeners() {
        return this.listeners;
    }

    public void initialize() {
        FileEntry fileEntry = this.rootEntry;
        fileEntry.refresh(fileEntry.getFile());
        this.rootEntry.setChildren(doListFiles(this.rootEntry.getFile(), this.rootEntry));
    }

    public void removeListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            while (this.listeners.remove(fileAlterationListener)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getClass().getSimpleName());
        sb3.append("[file='");
        sb3.append(getDirectory().getPath());
        sb3.append(CoreConstants.SINGLE_QUOTE_CHAR);
        if (this.fileFilter != null) {
            sb3.append(", ");
            sb3.append(this.fileFilter.toString());
        }
        sb3.append(", listeners=");
        sb3.append(this.listeners.size());
        sb3.append("]");
        return sb3.toString();
    }

    public FileAlterationObserver(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    public FileAlterationObserver(String str, FileFilter fileFilter, IOCase iOCase) {
        this(new File(str), fileFilter, iOCase);
    }

    public FileAlterationObserver(File file) {
        this(file, (FileFilter) null);
    }

    public FileAlterationObserver(File file, FileFilter fileFilter) {
        this(file, fileFilter, (IOCase) null);
    }

    public FileAlterationObserver(File file, FileFilter fileFilter, IOCase iOCase) {
        this(new FileEntry(file), fileFilter, iOCase);
    }

    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    public void checkAndNotify() {
        Iterator<FileAlterationListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onStart(this);
        }
        File file = this.rootEntry.getFile();
        boolean zExists = file.exists();
        FileEntry fileEntry = this.rootEntry;
        if (zExists) {
            checkAndNotify(fileEntry, fileEntry.getChildren(), listFiles(file));
        } else if (fileEntry.isExists()) {
            FileEntry fileEntry2 = this.rootEntry;
            checkAndNotify(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        Iterator<FileAlterationListener> it3 = this.listeners.iterator();
        while (it3.hasNext()) {
            it3.next().onStop(this);
        }
    }
}
