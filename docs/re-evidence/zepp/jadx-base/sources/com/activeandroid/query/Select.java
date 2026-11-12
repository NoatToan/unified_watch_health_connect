package com.activeandroid.query;

import android.text.TextUtils;
import com.activeandroid.Model;

/* JADX INFO: loaded from: classes2.dex */
public final class Select implements Sqlable {
    private String[] mColumns;
    private boolean mDistinct = false;
    private boolean mAll = false;

    public static class Column {
        public String alias;
        public String name;

        public Column(String str, String str2) {
            this.name = str;
            this.alias = str2;
        }
    }

    public Select() {
    }

    public Select all() {
        this.mDistinct = false;
        this.mAll = true;
        return this;
    }

    public Select distinct() {
        this.mDistinct = true;
        this.mAll = false;
        return this;
    }

    public From from(Class<? extends Model> cls) {
        return new From(cls, this);
    }

    @Override // com.activeandroid.query.Sqlable
    public String toSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        if (this.mDistinct) {
            sb.append("DISTINCT ");
        } else if (this.mAll) {
            sb.append("ALL ");
        }
        String[] strArr = this.mColumns;
        if (strArr == null || strArr.length <= 0) {
            sb.append("* ");
        } else {
            sb.append(TextUtils.join(", ", this.mColumns) + " ");
        }
        return sb.toString();
    }

    public Select(String... strArr) {
        this.mColumns = strArr;
    }

    public Select(Column... columnArr) {
        int length = columnArr.length;
        this.mColumns = new String[length];
        for (int i = 0; i < length; i++) {
            this.mColumns[i] = columnArr[i].name + " AS " + columnArr[i].alias;
        }
    }
}
