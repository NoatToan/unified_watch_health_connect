package com.huawei.watchface.mvp.model.datatype;

import com.huawei.watchface.v3;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class Tlv {
    private List<Tlv> childList;
    private int length;
    private String tag;
    private String value;

    public Tlv(String str, int i, String str2, List<Tlv> list) {
        this.tag = str;
        this.length = i;
        this.value = str2;
        this.childList = list;
    }

    public List<Tlv> getChildList() {
        return (List) v3.a(this.childList);
    }

    public int getLength() {
        return ((Integer) v3.a(Integer.valueOf(this.length))).intValue();
    }

    public String getTag() {
        return (String) v3.a(this.tag);
    }

    public String getValue() {
        return (String) v3.a(this.value);
    }

    public void setChildList(List<Tlv> list) {
        this.childList = (List) v3.a(list);
    }

    public void setLength(int i) {
        this.length = ((Integer) v3.a(Integer.valueOf(i))).intValue();
    }

    public void setTag(String str) {
        this.tag = (String) v3.a(str);
    }

    public void setValue(String str) {
        this.value = (String) v3.a(str);
    }

    public Tlv(String str, int i, String str2) {
        this.tag = str;
        this.length = i;
        this.value = str2;
    }

    public Tlv() {
    }
}
