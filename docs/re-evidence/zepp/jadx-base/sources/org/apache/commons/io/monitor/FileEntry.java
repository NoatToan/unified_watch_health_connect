package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public class FileEntry implements Serializable {
    public static final FileEntry[] i = new FileEntry[0];
    private static final long serialVersionUID = -2505664948818681153L;
    private final FileEntry a;
    private FileEntry[] b;
    private final File c;
    private String d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;

    public FileEntry(File file) {
        this(null, file);
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.b;
        return fileEntryArr != null ? fileEntryArr : i;
    }

    public File getFile() {
        return this.c;
    }

    public long getLastModified() {
        return this.g;
    }

    public long getLength() {
        return this.h;
    }

    public int getLevel() {
        FileEntry fileEntry = this.a;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public String getName() {
        return this.d;
    }

    public FileEntry getParent() {
        return this.a;
    }

    public boolean isDirectory() {
        return this.f;
    }

    public boolean isExists() {
        return this.e;
    }

    public FileEntry newChildInstance(File file) {
        return new FileEntry(this, file);
    }

    public boolean refresh(File file) {
        boolean z = this.e;
        long j = this.g;
        boolean z2 = this.f;
        long j2 = this.h;
        this.d = file.getName();
        boolean zExists = file.exists();
        this.e = zExists;
        this.f = zExists && file.isDirectory();
        long length = 0;
        this.g = this.e ? file.lastModified() : 0L;
        if (this.e && !this.f) {
            length = file.length();
        }
        this.h = length;
        return (this.e == z && this.g == j && this.f == z2 && length == j2) ? false : true;
    }

    public void setChildren(FileEntry[] fileEntryArr) {
        this.b = fileEntryArr;
    }

    public void setDirectory(boolean z) {
        this.f = z;
    }

    public void setExists(boolean z) {
        this.e = z;
    }

    public void setLastModified(long j) {
        this.g = j;
    }

    public void setLength(long j) {
        this.h = j;
    }

    public void setName(String str) {
        this.d = str;
    }

    public FileEntry(FileEntry fileEntry, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.c = file;
        this.a = fileEntry;
        this.d = file.getName();
    }
}
