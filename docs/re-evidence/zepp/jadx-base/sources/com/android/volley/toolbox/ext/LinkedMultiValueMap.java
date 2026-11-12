package com.android.volley.toolbox.ext;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class LinkedMultiValueMap<K, V> extends BasicMultiValueMap<K, V> {
    public LinkedMultiValueMap() {
        super(new LinkedHashMap());
    }
}
