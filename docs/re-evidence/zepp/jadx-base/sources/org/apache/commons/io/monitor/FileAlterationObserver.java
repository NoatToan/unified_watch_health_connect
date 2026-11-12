package org.apache.commons.io.monitor;

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

/* JADX INFO: loaded from: classes23.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final List<FileAlterationListener> a;
    private final FileEntry b;
    private final FileFilter c;
    private final Comparator<File> d;

    public FileAlterationObserver(String str) {
        this(new File(str));
    }

    private void a(FileEntry fileEntry, FileEntry[] fileEntryArr, File[] fileArr) {
        FileEntry[] fileEntryArr2 = fileArr.length > 0 ? new FileEntry[fileArr.length] : FileEntry.i;
        int i = 0;
        for (FileEntry fileEntry2 : fileEntryArr) {
            while (i < fileArr.length && this.d.compare(fileEntry2.getFile(), fileArr[i]) > 0) {
                fileEntryArr2[i] = b(fileEntry, fileArr[i]);
                c(fileEntryArr2[i]);
                i++;
            }
            if (i >= fileArr.length || this.d.compare(fileEntry2.getFile(), fileArr[i]) != 0) {
                a(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                e(fileEntry2);
            } else {
                g(fileEntry2, fileArr[i]);
                a(fileEntry2, fileEntry2.getChildren(), h(fileArr[i]));
                fileEntryArr2[i] = fileEntry2;
                i++;
            }
        }
        while (i < fileArr.length) {
            fileEntryArr2[i] = b(fileEntry, fileArr[i]);
            c(fileEntryArr2[i]);
            i++;
        }
        fileEntry.setChildren(fileEntryArr2);
    }

    private FileEntry b(FileEntry fileEntry, File file) {
        FileEntry fileEntryNewChildInstance = fileEntry.newChildInstance(file);
        fileEntryNewChildInstance.refresh(file);
        fileEntryNewChildInstance.setChildren(f(file, fileEntryNewChildInstance));
        return fileEntryNewChildInstance;
    }

    private void c(FileEntry fileEntry) {
        for (FileAlterationListener fileAlterationListener : this.a) {
            if (fileEntry.isDirectory()) {
                fileAlterationListener.onDirectoryCreate(fileEntry.getFile());
            } else {
                fileAlterationListener.onFileCreate(fileEntry.getFile());
            }
        }
        for (FileEntry fileEntry2 : fileEntry.getChildren()) {
            c(fileEntry2);
        }
    }

    private void e(FileEntry fileEntry) {
        for (FileAlterationListener fileAlterationListener : this.a) {
            if (fileEntry.isDirectory()) {
                fileAlterationListener.onDirectoryDelete(fileEntry.getFile());
            } else {
                fileAlterationListener.onFileDelete(fileEntry.getFile());
            }
        }
    }

    private FileEntry[] f(File file, FileEntry fileEntry) {
        File[] fileArrH = h(file);
        FileEntry[] fileEntryArr = fileArrH.length > 0 ? new FileEntry[fileArrH.length] : FileEntry.i;
        for (int i = 0; i < fileArrH.length; i++) {
            fileEntryArr[i] = b(fileEntry, fileArrH[i]);
        }
        return fileEntryArr;
    }

    private void g(FileEntry fileEntry, File file) {
        if (fileEntry.refresh(file)) {
            for (FileAlterationListener fileAlterationListener : this.a) {
                if (fileEntry.isDirectory()) {
                    fileAlterationListener.onDirectoryChange(file);
                } else {
                    fileAlterationListener.onFileChange(file);
                }
            }
        }
    }

    private File[] h(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            FileFilter fileFilter = this.c;
            fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        } else {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = FileUtils.EMPTY_FILE_ARRAY;
        }
        Comparator<File> comparator = this.d;
        if (comparator != null && fileArrListFiles.length > 1) {
            Arrays.sort(fileArrListFiles, comparator);
        }
        return fileArrListFiles;
    }

    public void addListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            this.a.add(fileAlterationListener);
        }
    }

    public void checkAndNotify() {
        Iterator<FileAlterationListener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onStart(this);
        }
        File file = this.b.getFile();
        if (file.exists()) {
            FileEntry fileEntry = this.b;
            a(fileEntry, fileEntry.getChildren(), h(file));
        } else if (this.b.isExists()) {
            FileEntry fileEntry2 = this.b;
            a(fileEntry2, fileEntry2.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        Iterator<FileAlterationListener> it3 = this.a.iterator();
        while (it3.hasNext()) {
            it3.next().onStop(this);
        }
    }

    public void destroy() throws Exception {
    }

    public File getDirectory() {
        return this.b.getFile();
    }

    public FileFilter getFileFilter() {
        return this.c;
    }

    public Iterable<FileAlterationListener> getListeners() {
        return this.a;
    }

    public void initialize() throws Exception {
        FileEntry fileEntry = this.b;
        fileEntry.refresh(fileEntry.getFile());
        this.b.setChildren(f(this.b.getFile(), this.b));
    }

    public void removeListener(FileAlterationListener fileAlterationListener) {
        if (fileAlterationListener != null) {
            while (this.a.remove(fileAlterationListener)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[file='");
        sb.append(getDirectory().getPath());
        sb.append('\'');
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.toString());
        }
        sb.append(", listeners=");
        sb.append(this.a.size());
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
        this.a = new CopyOnWriteArrayList();
        if (fileEntry != null) {
            if (fileEntry.getFile() != null) {
                this.b = fileEntry;
                this.c = fileFilter;
                if (iOCase != null && !iOCase.equals(IOCase.SYSTEM)) {
                    if (iOCase.equals(IOCase.INSENSITIVE)) {
                        this.d = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
                        return;
                    } else {
                        this.d = NameFileComparator.NAME_COMPARATOR;
                        return;
                    }
                }
                this.d = NameFileComparator.NAME_SYSTEM_COMPARATOR;
                return;
            }
            throw new IllegalArgumentException("Root directory is missing");
        }
        throw new IllegalArgumentException("Root entry is missing");
    }
}
