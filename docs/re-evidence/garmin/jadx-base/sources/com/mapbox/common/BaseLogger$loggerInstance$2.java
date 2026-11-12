package com.mapbox.common;

import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.base.common.logger.Logger;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/mapbox/base/common/logger/Logger;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class BaseLogger$loggerInstance$2 extends w implements e23.a<Logger> {
    public static final BaseLogger$loggerInstance$2 INSTANCE = new BaseLogger$loggerInstance$2();

    /* JADX INFO: renamed from: com.mapbox.common.BaseLogger$loggerInstance$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "it", "Lcom/mapbox/annotation/module/MapboxModuleType;", "invoke", "(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<MapboxModuleType, ModuleProviderArgument[]> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
            mapboxModuleType.getClass();
            return new ModuleProviderArgument[0];
        }
    }

    public BaseLogger$loggerInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Logger invoke() {
        return (Logger) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLogger, AnonymousClass1.INSTANCE);
    }
}
