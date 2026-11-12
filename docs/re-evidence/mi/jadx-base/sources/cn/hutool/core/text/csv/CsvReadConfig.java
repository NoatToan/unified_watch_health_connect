package cn.hutool.core.text.csv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CsvReadConfig extends CsvConfig implements Serializable {
    private static final long serialVersionUID = 5396453565371560052L;
    protected long beginLineNo;
    protected boolean containsHeader;
    protected boolean errorOnDifferentFieldCount;
    protected boolean skipEmptyRows = true;
    protected long endLineNo = 9223372036854775806L;

    public static CsvReadConfig defaultConfig() {
        return new CsvReadConfig();
    }

    public CsvReadConfig setBeginLineNo(long j) {
        this.beginLineNo = j;
        return this;
    }

    public CsvReadConfig setContainsHeader(boolean z) {
        this.containsHeader = z;
        return this;
    }

    public CsvReadConfig setEndLineNo(long j) {
        this.endLineNo = j;
        return this;
    }

    public CsvReadConfig setErrorOnDifferentFieldCount(boolean z) {
        this.errorOnDifferentFieldCount = z;
        return this;
    }

    public CsvReadConfig setSkipEmptyRows(boolean z) {
        this.skipEmptyRows = z;
        return this;
    }
}
