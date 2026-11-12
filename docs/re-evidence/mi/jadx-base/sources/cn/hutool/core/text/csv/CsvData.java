package cn.hutool.core.text.csv;

import defpackage.b55;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class CsvData implements Iterable<b55>, Serializable {
    private static final long serialVersionUID = 1;
    private final List<String> header;
    private final List<b55> rows;

    public CsvData(List<String> list, List<b55> list2) {
        this.header = list;
        this.rows = list2;
    }

    public List<String> getHeader() {
        return Collections.unmodifiableList(this.header);
    }

    public b55 getRow(int i) {
        return this.rows.get(i);
    }

    public int getRowCount() {
        return this.rows.size();
    }

    public List<b55> getRows() {
        return this.rows;
    }

    @Override // java.lang.Iterable
    public Iterator<b55> iterator() {
        return this.rows.iterator();
    }

    public String toString() {
        return "CsvData{header=" + this.header + ", rows=" + this.rows + AbstractJsonLexerKt.END_OBJ;
    }
}
