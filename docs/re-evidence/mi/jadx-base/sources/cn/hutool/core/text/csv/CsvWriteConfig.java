package cn.hutool.core.text.csv;

import io.netty.util.internal.StringUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CsvWriteConfig extends CsvConfig implements Serializable {
    private static final long serialVersionUID = 5396453565371560052L;
    protected boolean alwaysDelimitText;
    protected char[] lineDelimiter = {StringUtil.CARRIAGE_RETURN, '\n'};

    public static CsvWriteConfig defaultConfig() {
        return new CsvWriteConfig();
    }

    public CsvWriteConfig setAlwaysDelimitText(boolean z) {
        this.alwaysDelimitText = z;
        return this;
    }

    public CsvWriteConfig setLineDelimiter(char[] cArr) {
        this.lineDelimiter = cArr;
        return this;
    }
}
