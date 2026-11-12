package cn.hutool.core.text.csv;

import cn.hutool.core.io.IORuntimeException;
import defpackage.c55;
import defpackage.fmh;
import defpackage.jm9;
import java.io.File;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes.dex */
public class CsvReader extends CsvBaseReader {
    private static final long serialVersionUID = 1;
    private final Reader reader;

    public CsvReader() {
        this(null);
    }

    public CsvData read() throws IORuntimeException {
        return read(this.reader);
    }

    public CsvReader(CsvReadConfig csvReadConfig) {
        this((Reader) null, csvReadConfig);
    }

    public void read(c55 c55Var) throws IORuntimeException {
        read(this.reader, c55Var);
    }

    public CsvReader(File file, CsvReadConfig csvReadConfig) {
        this(file, CsvBaseReader.DEFAULT_CHARSET, csvReadConfig);
    }

    public CsvReader(Path path, CsvReadConfig csvReadConfig) {
        this(path, CsvBaseReader.DEFAULT_CHARSET, csvReadConfig);
    }

    public CsvReader(File file, Charset charset, CsvReadConfig csvReadConfig) {
        this(jm9.v(file, charset), csvReadConfig);
    }

    public CsvReader(Path path, Charset charset, CsvReadConfig csvReadConfig) {
        this(fmh.e(path, charset), csvReadConfig);
    }

    public CsvReader(Reader reader, CsvReadConfig csvReadConfig) {
        super(csvReadConfig);
        this.reader = reader;
    }
}
