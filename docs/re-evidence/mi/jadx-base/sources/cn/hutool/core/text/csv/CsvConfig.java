package cn.hutool.core.text.csv;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class CsvConfig implements Serializable {
    private static final long serialVersionUID = -8069578249066158459L;
    protected char fieldSeparator = ',';
    protected char textDelimiter = '\"';
    protected char commentCharacter = '#';

    public CsvConfig setCommentCharacter(char c) {
        this.commentCharacter = c;
        return this;
    }

    public CsvConfig setFieldSeparator(char c) {
        this.fieldSeparator = c;
        return this;
    }

    public CsvConfig setTextDelimiter(char c) {
        this.textDelimiter = c;
        return this;
    }
}
