package org.apache.commons.fileupload;

/* JADX INFO: loaded from: classes23.dex */
public class InvalidFileNameException extends RuntimeException {
    private static final long serialVersionUID = 7922042602454350470L;
    private final String a;

    public InvalidFileNameException(String str, String str2) {
        super(str2);
        this.a = str;
    }

    public String getName() {
        return this.a;
    }
}
