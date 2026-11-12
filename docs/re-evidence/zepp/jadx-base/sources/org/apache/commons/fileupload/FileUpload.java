package org.apache.commons.fileupload;

/* JADX INFO: loaded from: classes23.dex */
public class FileUpload extends FileUploadBase {
    private FileItemFactory e;

    public FileUpload() {
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    public FileItemFactory getFileItemFactory() {
        return this.e;
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    public void setFileItemFactory(FileItemFactory fileItemFactory) {
        this.e = fileItemFactory;
    }

    public FileUpload(FileItemFactory fileItemFactory) {
        this.e = fileItemFactory;
    }
}
