package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import wr.g;

/* JADX INFO: loaded from: classes3.dex */
public class FileExistsException extends IOException {
    private static final long serialVersionUID = 1;

    public FileExistsException(File file) {
        super(g.o("File ", file, " exists"));
    }

    public FileExistsException(String str) {
        super(str);
    }

    public FileExistsException() {
    }
}
