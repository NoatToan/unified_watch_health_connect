package com.huami.chart.data;

/* JADX INFO: loaded from: classes6.dex */
public class XAxisData extends BaseIndex {
    private static final String g = "";
    private static final String h = "";
    private int d;
    private String e;
    private String f;

    public XAxisData(int i) {
        this(i, "", "");
    }

    @Override // com.huami.chart.data.BaseIndex
    public int getIndex() {
        return this.d;
    }

    public String getSubTitle() {
        return this.f;
    }

    public String getTitle() {
        return this.e;
    }

    @Override // com.huami.chart.data.BaseIndex
    public String toString() {
        return "(" + this.d + " : " + this.e + ", " + this.f + ")";
    }

    public XAxisData(int i, String str) {
        this(i, str, "");
    }

    public XAxisData(int i, String str, String str2) {
        super(i);
        this.d = i;
        this.e = str;
        this.f = str2;
    }
}
