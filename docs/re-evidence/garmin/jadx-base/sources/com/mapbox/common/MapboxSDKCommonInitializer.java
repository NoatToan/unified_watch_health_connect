package com.mapbox.common;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mapbox/common/MapboxSDKCommonInitializer;", "Lcom/mapbox/common/BaseMapboxInitializer;", "Lcom/mapbox/common/MapboxSDKCommon;", "()V", "initializerClass", "Ljava/lang/Class;", "Lcom/mapbox/common/MapboxSDKCommonInitializerImpl;", "getInitializerClass", "()Ljava/lang/Class;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxSDKCommonInitializer extends BaseMapboxInitializer<MapboxSDKCommon> {
    private final Class<MapboxSDKCommonInitializerImpl> initializerClass = MapboxSDKCommonInitializerImpl.class;

    @Override // com.mapbox.common.BaseMapboxInitializer
    public Class<? extends zd.b<MapboxSDKCommon>> getInitializerClass() {
        return this.initializerClass;
    }
}
