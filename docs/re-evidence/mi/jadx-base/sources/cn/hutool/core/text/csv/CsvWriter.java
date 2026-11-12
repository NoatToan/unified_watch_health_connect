package cn.hutool.core.text.csv;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.IORuntimeException;
import defpackage.au3;
import defpackage.cid;
import defpackage.g4h;
import defpackage.jm9;
import defpackage.qj1;
import defpackage.rh2;
import defpackage.yj4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class CsvWriter implements Closeable, Flushable, Serializable {
    private static final long serialVersionUID = 1;
    private final CsvWriteConfig config;
    private boolean newline;
    private final Writer writer;

    public CsvWriter(String str) {
        this(jm9.o(str));
    }

    private void appendField(String str) throws IOException {
        boolean z;
        CsvWriteConfig csvWriteConfig = this.config;
        boolean z2 = csvWriteConfig.alwaysDelimitText;
        char c = csvWriteConfig.textDelimiter;
        char c2 = csvWriteConfig.fieldSeparator;
        if (this.newline) {
            this.newline = false;
        } else {
            this.writer.write(c2);
        }
        if (str == null) {
            if (z2) {
                this.writer.write(new char[]{c, c});
                return;
            }
            return;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            char c3 = charArray[i];
            if (c3 == c) {
                z = true;
                z2 = true;
                break;
            } else {
                if (c3 == c2 || c3 == '\n' || c3 == '\r') {
                    z2 = true;
                }
                i++;
            }
        }
        if (z2) {
            this.writer.write(c);
        }
        if (z) {
            for (char c4 : charArray) {
                if (c4 == c) {
                    this.writer.write(c);
                }
                this.writer.write(c4);
            }
        } else {
            this.writer.write(charArray);
        }
        if (z2) {
            this.writer.write(c);
        }
    }

    private void appendLine(String... strArr) throws IORuntimeException {
        try {
            doAppendLine(strArr);
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    private void doAppendLine(String... strArr) throws IOException {
        if (strArr != null) {
            for (String str : strArr) {
                appendField(str);
            }
            this.writer.write(this.config.lineDelimiter);
            this.newline = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cid.a(this.writer);
    }

    @Override // java.io.Flushable
    public void flush() throws IORuntimeException {
        try {
            this.writer.flush();
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public CsvWriter setAlwaysDelimitText(boolean z) {
        this.config.setAlwaysDelimitText(z);
        return this;
    }

    public CsvWriter setLineDelimiter(char[] cArr) {
        this.config.setLineDelimiter(cArr);
        return this;
    }

    public CsvWriter write(String[]... strArr) throws IORuntimeException {
        if (qj1.E(strArr)) {
            for (String[] strArr2 : strArr) {
                appendLine(strArr2);
            }
            flush();
        }
        return this;
    }

    public CsvWriter writeBeans(Collection<?> collection) {
        if (CollUtil.j(collection)) {
            Iterator<?> it = collection.iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map<String, Object> mapE = rh2.e(it.next());
                if (z) {
                    writeLine((String[]) mapE.keySet().toArray(new String[0]));
                    z = false;
                }
                writeLine(yj4.y(mapE.values()));
            }
            flush();
        }
        return this;
    }

    public CsvWriter writeComment(String str) {
        try {
            this.writer.write(this.config.commentCharacter);
            this.writer.write(str);
            this.writer.write(this.config.lineDelimiter);
            this.newline = true;
            return this;
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public CsvWriter writeLine(String... strArr) throws IORuntimeException {
        if (qj1.D(strArr)) {
            return writeLine();
        }
        appendLine(strArr);
        return this;
    }

    public CsvWriter(File file) {
        this(file, au3.f3449b);
    }

    public CsvWriter(String str, Charset charset) {
        this(jm9.o(str), charset);
    }

    public CsvWriter(File file, Charset charset) {
        this(file, charset, false);
    }

    public CsvWriter writeLine() throws IORuntimeException {
        try {
            this.writer.write(this.config.lineDelimiter);
            this.newline = true;
            return this;
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public CsvWriter(String str, Charset charset, boolean z) {
        this(jm9.o(str), charset, z);
    }

    public CsvWriter write(Collection<?> collection) throws IORuntimeException {
        if (CollUtil.j(collection)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                appendLine(yj4.y(it.next()));
            }
            flush();
        }
        return this;
    }

    public CsvWriter(File file, Charset charset, boolean z) {
        this(file, charset, z, (CsvWriteConfig) null);
    }

    public CsvWriter(String str, Charset charset, boolean z, CsvWriteConfig csvWriteConfig) {
        this(jm9.o(str), charset, z, csvWriteConfig);
    }

    public CsvWriter(File file, Charset charset, boolean z, CsvWriteConfig csvWriteConfig) {
        this(jm9.y(file, charset, z), csvWriteConfig);
    }

    public CsvWriter(Writer writer) {
        this(writer, (CsvWriteConfig) null);
    }

    public CsvWriter write(CsvData csvData) {
        if (csvData != null) {
            if (CollUtil.j(csvData.getHeader())) {
                writeLine((String[]) csvData.getHeader().toArray(new String[0]));
            }
            write(csvData.getRows());
            flush();
        }
        return this;
    }

    public CsvWriter(Writer writer, CsvWriteConfig csvWriteConfig) {
        this.newline = true;
        this.writer = writer instanceof BufferedWriter ? writer : new BufferedWriter(writer);
        this.config = (CsvWriteConfig) g4h.e(csvWriteConfig, CsvWriteConfig.defaultConfig());
    }
}
