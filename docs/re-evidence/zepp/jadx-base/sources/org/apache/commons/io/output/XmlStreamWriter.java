package org.apache.commons.io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.input.XmlStreamReader;

/* JADX INFO: loaded from: classes23.dex */
public class XmlStreamWriter extends Writer {
    private static final int f = 4096;
    public static final Pattern g = XmlStreamReader.ENCODING_PATTERN;
    private final OutputStream a;
    private final String b;
    private StringWriter c;
    private Writer d;
    private String e;

    public XmlStreamWriter(OutputStream outputStream) {
        this(outputStream, (String) null);
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        StringBuffer buffer = this.c.getBuffer();
        int length = buffer.length() + i2 > 4096 ? 4096 - buffer.length() : i2;
        this.c.write(cArr, i, length);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int iIndexOf = buffer.indexOf("?>");
                if (iIndexOf > 0) {
                    Matcher matcher = g.matcher(buffer.substring(0, iIndexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase();
                        this.e = upperCase;
                        this.e = upperCase.substring(1, upperCase.length() - 1);
                    } else {
                        this.e = this.b;
                    }
                } else if (buffer.length() >= 4096) {
                    this.e = this.b;
                }
            } else {
                this.e = this.b;
            }
            if (this.e != null) {
                this.c = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.a, this.e);
                this.d = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i2 > length) {
                    this.d.write(cArr, i + length, i2 - length);
                }
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d == null) {
            this.e = this.b;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.a, this.e);
            this.d = outputStreamWriter;
            outputStreamWriter.write(this.c.toString());
        }
        this.d.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.d;
        if (writer != null) {
            writer.flush();
        }
    }

    public String getDefaultEncoding() {
        return this.b;
    }

    public String getEncoding() {
        return this.e;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.c != null) {
            a(cArr, i, i2);
        } else {
            this.d.write(cArr, i, i2);
        }
    }

    public XmlStreamWriter(OutputStream outputStream, String str) {
        this.c = new StringWriter(4096);
        this.a = outputStream;
        this.b = str == null ? "UTF-8" : str;
    }

    public XmlStreamWriter(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    public XmlStreamWriter(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }
}
