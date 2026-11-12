package org.apache.commons.fileupload.disk;

import java.io.File;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.io.FileCleaningTracker;

/* JADX INFO: loaded from: classes23.dex */
public class DiskFileItemFactory implements FileItemFactory {
    public static final int DEFAULT_SIZE_THRESHOLD = 10240;
    private File a;
    private int b;
    private FileCleaningTracker c;

    public DiskFileItemFactory() {
        this(10240, null);
    }

    @Override // org.apache.commons.fileupload.FileItemFactory
    public FileItem createItem(String str, String str2, boolean z, String str3) {
        DiskFileItem diskFileItem = new DiskFileItem(str, str2, z, str3, this.b, this.a);
        FileCleaningTracker fileCleaningTracker = getFileCleaningTracker();
        if (fileCleaningTracker != null) {
            fileCleaningTracker.track(diskFileItem.getTempFile(), diskFileItem);
        }
        return diskFileItem;
    }

    public FileCleaningTracker getFileCleaningTracker() {
        return this.c;
    }

    public File getRepository() {
        return this.a;
    }

    public int getSizeThreshold() {
        return this.b;
    }

    public void setFileCleaningTracker(FileCleaningTracker fileCleaningTracker) {
        this.c = fileCleaningTracker;
    }

    public void setRepository(File file) {
        this.a = file;
    }

    public void setSizeThreshold(int i) {
        this.b = i;
    }

    public DiskFileItemFactory(int i, File file) {
        this.b = 10240;
        this.b = i;
        this.a = file;
    }
}
