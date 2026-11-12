package org.apache.commons.fileupload;

import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public class DiskFileUpload extends FileUploadBase {
    private DefaultFileItemFactory e;

    @Deprecated
    public DiskFileUpload() {
        this.e = new DefaultFileItemFactory();
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    @Deprecated
    public FileItemFactory getFileItemFactory() {
        return this.e;
    }

    @Deprecated
    public String getRepositoryPath() {
        return this.e.getRepository().getPath();
    }

    @Deprecated
    public int getSizeThreshold() {
        return this.e.getSizeThreshold();
    }

    @Deprecated
    public List<FileItem> parseRequest(HttpServletRequest httpServletRequest, int i, long j, String str) throws FileUploadException {
        setSizeThreshold(i);
        setSizeMax(j);
        setRepositoryPath(str);
        return parseRequest(httpServletRequest);
    }

    @Override // org.apache.commons.fileupload.FileUploadBase
    @Deprecated
    public void setFileItemFactory(FileItemFactory fileItemFactory) {
        this.e = (DefaultFileItemFactory) fileItemFactory;
    }

    @Deprecated
    public void setRepositoryPath(String str) {
        this.e.setRepository(new File(str));
    }

    @Deprecated
    public void setSizeThreshold(int i) {
        this.e.setSizeThreshold(i);
    }

    @Deprecated
    public DiskFileUpload(DefaultFileItemFactory defaultFileItemFactory) {
        this.e = defaultFileItemFactory;
    }
}
