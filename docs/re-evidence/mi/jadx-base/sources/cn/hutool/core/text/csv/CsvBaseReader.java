package cn.hutool.core.text.csv;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.text.csv.CsvBaseReader;
import defpackage.au3;
import defpackage.b55;
import defpackage.c55;
import defpackage.cid;
import defpackage.fmh;
import defpackage.g4h;
import defpackage.qk1;
import java.io.File;
import java.io.Reader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class CsvBaseReader implements Serializable {
    protected static final Charset DEFAULT_CHARSET = au3.f3449b;
    private static final long serialVersionUID = 1;
    private final CsvReadConfig config;

    public CsvBaseReader() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$read$1(List list, Class cls, b55 b55Var) {
        list.add(b55Var.i(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$readMapList$0(List list, b55 b55Var) {
        list.add(b55Var.f());
    }

    private CsvParser parse(Reader reader) throws IORuntimeException {
        return new CsvParser(reader, this.config);
    }

    public CsvData read(File file) throws IORuntimeException {
        return read(file, DEFAULT_CHARSET);
    }

    public List<Map<String, String>> readMapList(Reader reader) throws IORuntimeException {
        this.config.setContainsHeader(true);
        final ArrayList arrayList = new ArrayList();
        read(reader, new c55() { // from class: z45
            @Override // defpackage.c55
            public final void a(b55 b55Var) {
                CsvBaseReader.lambda$readMapList$0(arrayList, b55Var);
            }
        });
        return arrayList;
    }

    public void setContainsHeader(boolean z) {
        this.config.setContainsHeader(z);
    }

    public void setErrorOnDifferentFieldCount(boolean z) {
        this.config.setErrorOnDifferentFieldCount(z);
    }

    public void setFieldSeparator(char c) {
        this.config.setFieldSeparator(c);
    }

    public void setSkipEmptyRows(boolean z) {
        this.config.setSkipEmptyRows(z);
    }

    public void setTextDelimiter(char c) {
        this.config.setTextDelimiter(c);
    }

    public CsvBaseReader(CsvReadConfig csvReadConfig) {
        this.config = (CsvReadConfig) g4h.e(csvReadConfig, CsvReadConfig.defaultConfig());
    }

    public CsvData read(File file, Charset charset) throws IORuntimeException {
        Path path = file.toPath();
        Objects.requireNonNull(path, "file must not be null");
        return read(path, charset);
    }

    public CsvData read(Path path) throws IORuntimeException {
        return read(path, DEFAULT_CHARSET);
    }

    public CsvData read(Path path, Charset charset) throws IORuntimeException {
        qk1.u(path, "path must not be null", new Object[0]);
        return read(fmh.e(path, charset));
    }

    public CsvData read(Reader reader) throws IORuntimeException {
        CsvParser csvParser = parse(reader);
        final ArrayList arrayList = new ArrayList();
        read(csvParser, new c55() { // from class: x45
            @Override // defpackage.c55
            public final void a(b55 b55Var) {
                arrayList.add(b55Var);
            }
        });
        return new CsvData(this.config.containsHeader ? csvParser.getHeader() : null, arrayList);
    }

    public <T> List<T> read(Reader reader, final Class<T> cls) {
        this.config.setContainsHeader(true);
        final ArrayList arrayList = new ArrayList();
        read(reader, new c55() { // from class: y45
            @Override // defpackage.c55
            public final void a(b55 b55Var) {
                CsvBaseReader.lambda$read$1(arrayList, cls, b55Var);
            }
        });
        return arrayList;
    }

    public void read(Reader reader, c55 c55Var) throws IORuntimeException {
        read(parse(reader), c55Var);
    }

    private void read(CsvParser csvParser, c55 c55Var) throws IORuntimeException {
        while (true) {
            try {
                b55 b55VarNextRow = csvParser.nextRow();
                if (b55VarNextRow != null) {
                    c55Var.a(b55VarNextRow);
                } else {
                    cid.a(csvParser);
                    return;
                }
            } catch (Throwable th) {
                cid.a(csvParser);
                throw th;
            }
        }
    }
}
