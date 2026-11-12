package com.xiaomi.clientreport.processor;

import com.xiaomi.clientreport.data.a;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public interface IEventProcessor {
    String bytesToString(byte[] bArr);

    void setEventMap(HashMap<String, ArrayList<a>> map);

    byte[] stringToBytes(String str);
}
