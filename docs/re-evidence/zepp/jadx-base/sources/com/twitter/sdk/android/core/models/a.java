package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
class a implements Serializable {
    private static final int a = 0;
    private static final int b = 1;

    @SerializedName("indices")
    public final List<Integer> indices;

    public a(int i, int i2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(0, Integer.valueOf(i));
        arrayList.add(1, Integer.valueOf(i2));
        this.indices = Collections.unmodifiableList(arrayList);
    }

    public int getEnd() {
        return this.indices.get(1).intValue();
    }

    public int getStart() {
        return this.indices.get(0).intValue();
    }
}
