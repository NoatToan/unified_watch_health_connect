package org.apache.commons.io.monitor;

import defpackage.il9;
import defpackage.lm9;
import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;

/* JADX INFO: loaded from: classes3.dex */
public class FileAlterationObserver implements Serializable {
    private final Comparator<File> comparator;
    private final FileFilter fileFilter;
    private final List<il9> listeners;
    private final FileEntry rootEntry;

    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    private FileEntry createFileEntry(FileEntry fileEntry, File file) {
        FileEntry fileEntryNewChildInstance = fileEntry.newChildInstance(file);
        fileEntryNewChildInstance.refresh(file);
        File[] fileArrListFiles = listFiles(file);
        FileEntry[] fileEntryArr = fileArrListFiles.length > 0 ? new FileEntry[fileArrListFiles.length] : FileEntry.EMPTY_ENTRIES;
        for (int i = 0; i < fileArrListFiles.length; i++) {
            fileEntryArr[i] = createFileEntry(fileEntryNewChildInstance, fileArrListFiles[i]);
        }
        fileEntryNewChildInstance.setChildren(fileEntryArr);
        return fileEntryNewChildInstance;
    }

    private void doCreate(FileEntry fileEntry) {
        for (il9 il9Var : this.listeners) {
            if (fileEntry.isDirectory()) {
                il9Var.c(fileEntry.getFile());
            } else {
                il9Var.a(fileEntry.getFile());
            }
        }
        for (FileEntry fileEntry2 : fileEntry.getChildren()) {
            doCreate(fileEntry2);
        }
    }

    private void doDelete(FileEntry fileEntry) {
        for (il9 il9Var : this.listeners) {
            if (fileEntry.isDirectory()) {
                il9Var.g(fileEntry.getFile());
            } else {
                il9Var.e(fileEntry.getFile());
            }
        }
    }

    private void doMatch(FileEntry fileEntry, File file) {
        if (fileEntry.refresh(file)) {
            for (il9 il9Var : this.listeners) {
                if (fileEntry.isDirectory()) {
                    il9Var.b(file);
                } else {
                    il9Var.f(file);
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
            fileArrListFiles = lm9.c;
        }
        Comparator<File> comparator = this.comparator;
        if (comparator != null && fileArrListFiles.length > 1) {
            Arrays.sort(fileArrListFiles, comparator);
        }
        return fileArrListFiles;
    }

    public void addListener(il9 il9Var) {
        if (il9Var != null) {
            this.listeners.add(il9Var);
        }
    }

    public void checkAndNotify() {
        Iterator<il9> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        File file = this.rootEntry.getFile();
        if (file.exists()) {
            FileEntry fileEntry = this.rootEntry;
            checkAndNotify(fileEntry, fileEntry.getChildren(), listFiles(file));
        } else if (this.rootEntry.isExists()) {
            FileEntry fileEntry2 = this.rootEntry;
            checkAndNotify(fileEntry2, fileEntry2.getChildren(), lm9.c);
        }
        Iterator<il9> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().h(this);
        }
    }

    public void destroy() throws Exception {
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<il9> getListeners() {
        return this.listeners;
    }

    public void initialize() throws Exception {
        FileEntry fileEntry = this.rootEntry;
        fileEntry.refresh(fileEntry.getFile());
        File[] fileArrListFiles = listFiles(this.rootEntry.getFile());
        FileEntry[] fileEntryArr = fileArrListFiles.length > 0 ? new FileEntry[fileArrListFiles.length] : FileEntry.EMPTY_ENTRIES;
        for (int i = 0; i < fileArrListFiles.length; i++) {
            fileEntryArr[i] = createFileEntry(this.rootEntry, fileArrListFiles[i]);
        }
        this.rootEntry.setChildren(fileEntryArr);
    }

    public void removeListener(il9 il9Var) {
        if (il9Var != null) {
            while (this.listeners.remove(il9Var)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[file='");
        sb.append(getDirectory().getPath());
        sb.append('\'');
        if (this.fileFilter != null) {
            sb.append(", ");
            sb.append(this.fileFilter.toString());
        }
        sb.append(", listeners=");
        sb.append(this.listeners.size());
        sb.append("]");
        return sb.toString();
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

    public FileAlterationObserver(FileEntry fileEntry, FileFilter fileFilter, IOCase iOCase) {
        this.listeners = new CopyOnWriteArrayList();
        if (fileEntry != null) {
            if (fileEntry.getFile() != null) {
                this.rootEntry = fileEntry;
                this.fileFilter = fileFilter;
                if (iOCase != null && !iOCase.equals(IOCase.SYSTEM)) {
                    if (iOCase.equals(IOCase.INSENSITIVE)) {
                        this.comparator = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
                        return;
                    } else {
                        this.comparator = NameFileComparator.NAME_COMPARATOR;
                        return;
                    }
                }
                this.comparator = NameFileComparator.NAME_SYSTEM_COMPARATOR;
                return;
            }
            throw new IllegalArgumentException("Root directory is missing");
        }
        throw new IllegalArgumentException("Root entry is missing");
    }

    private void checkAndNotify(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2 = fileArr.length > 0 ? new FileEntry[fileArr.length] : FileEntry.EMPTY_ENTRIES;
        int i = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i]) > 0) {
                FileEntry fileEntryCreateFileEntry = createFileEntry(fileEntry, fileArr[i]);
                fileEntryArr2[i] = fileEntryCreateFileEntry;
                doCreate(fileEntryCreateFileEntry);
                i++;
            }
            if (i < fileArr.length && this.comparator.compare(fileEntry2.getFile(), fileArr[i]) == 0) {
                doMatch(fileEntry2, fileArr[i]);
                checkAndNotify(fileEntry2, fileEntry2.getChildren(), listFiles(fileArr[i]));
                fileEntryArr2[i] = fileEntry2;
                i++;
            } else {
                checkAndNotify(fileEntry2, fileEntry2.getChildren(), lm9.c);
                doDelete(fileEntry2);
            }
        }
        while (i < fileArr.length) {
            FileEntry fileEntryCreateFileEntry2 = createFileEntry(fileEntry, fileArr[i]);
            fileEntryArr2[i] = fileEntryCreateFileEntry2;
            doCreate(fileEntryCreateFileEntry2);
            i++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }
}
