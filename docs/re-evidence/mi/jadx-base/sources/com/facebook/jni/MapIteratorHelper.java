package com.facebook.jni;

import defpackage.v07;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class MapIteratorHelper {

    @v07
    private final Iterator<Map.Entry> mIterator;

    @v07
    private Object mKey;

    @v07
    private Object mValue;

    @v07
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    @v07
    public boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
