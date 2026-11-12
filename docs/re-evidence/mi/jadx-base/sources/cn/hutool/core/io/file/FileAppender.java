package cn.hutool.core.io.file;

import defpackage.au3;
import java.io.File;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FileAppender implements Serializable {
    private static final long serialVersionUID = 1;
    private final int capacity;
    private final boolean isNewLineMode;
    private final List<String> list;
    private final FileWriter writer;

    public FileAppender(File file, int i, boolean z) {
        this(file, au3.f3449b, i, z);
    }

    public FileAppender append(String str) {
        if (this.list.size() >= this.capacity) {
            flush();
        }
        this.list.add(str);
        return this;
    }

    public FileAppender flush() {
        PrintWriter printWriter = this.writer.getPrintWriter(true);
        try {
            Iterator<String> it = this.list.iterator();
            while (it.hasNext()) {
                printWriter.print(it.next());
                if (this.isNewLineMode) {
                    printWriter.println();
                }
            }
            if (printWriter != null) {
                printWriter.close();
            }
            this.list.clear();
            return this;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (printWriter != null) {
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public FileAppender(File file, Charset charset, int i, boolean z) {
        this.list = new ArrayList(100);
        this.capacity = i;
        this.isNewLineMode = z;
        this.writer = FileWriter.create(file, charset);
    }
}
