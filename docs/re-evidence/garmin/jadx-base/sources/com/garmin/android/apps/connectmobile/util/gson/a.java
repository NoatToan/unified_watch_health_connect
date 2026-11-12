package com.garmin.android.apps.connectmobile.util.gson;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/util/gson/a;", "Lcom/google/gson/ExclusionStrategy;", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements ExclusionStrategy {
    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipClass(Class<?> cls) {
        return false;
    }

    @Override // com.google.gson.ExclusionStrategy
    public final boolean shouldSkipField(FieldAttributes fieldAttributes) {
        fieldAttributes.getClass();
        return fieldAttributes.getAnnotation(b.class) != null;
    }
}
