package com.huawei.watchface.mvp.model.datatype;

import com.huawei.watchface.v3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class TlvFather {
    private static final int DEFAULT_TLV_ARRAY_LENGTH = 10;
    private List<TlvFather> tlvFatherList;
    private List<Tlv> tlvList;

    public TlvFather(List<Tlv> list, List<TlvFather> list2) {
        this.tlvList = (List) v3.a(list);
        this.tlvFatherList = (List) v3.a(list2);
    }

    public List<TlvFather> getTlvFatherList() {
        return (List) v3.a(this.tlvFatherList);
    }

    public List<Tlv> getTlvList() {
        return (List) v3.a(this.tlvList);
    }

    public void setTlvFatherList(List<TlvFather> list) {
        this.tlvFatherList = (List) v3.a(list);
    }

    public void setTlvList(List<Tlv> list) {
        this.tlvList = (List) v3.a(list);
    }

    public TlvFather() {
        this.tlvList = new ArrayList(10);
        this.tlvFatherList = new ArrayList(10);
    }
}
