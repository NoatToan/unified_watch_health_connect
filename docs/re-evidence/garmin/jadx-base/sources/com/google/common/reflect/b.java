package com.google.common.reflect;

import com.google.common.base.Function;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class b implements Function {
    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        return MutableTypeToInstanceMap.UnmodifiableEntry.a((Map.Entry) obj);
    }
}
