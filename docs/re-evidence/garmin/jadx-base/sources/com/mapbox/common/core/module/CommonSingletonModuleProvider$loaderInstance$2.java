package com.mapbox.common.core.module;

import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import e23.a;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/mapbox/common/module/LibraryLoader;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CommonSingletonModuleProvider$loaderInstance$2 extends w implements a<LibraryLoader> {
    public static final CommonSingletonModuleProvider$loaderInstance$2 INSTANCE = new CommonSingletonModuleProvider$loaderInstance$2();

    /* JADX INFO: renamed from: com.mapbox.common.core.module.CommonSingletonModuleProvider$loaderInstance$2$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements l<MapboxModuleType, ModuleProviderArgument[]> {
        public AnonymousClass1(Object obj) {
            super(1, obj, CommonSingletonModuleProvider.class, "paramsProvider", "paramsProvider(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", 0);
        }

        @Override // e23.l
        public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
            mapboxModuleType.getClass();
            return ((CommonSingletonModuleProvider) this.receiver).paramsProvider(mapboxModuleType);
        }
    }

    public CommonSingletonModuleProvider$loaderInstance$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final LibraryLoader invoke() {
        return (LibraryLoader) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.CommonLibraryLoader, new AnonymousClass1(CommonSingletonModuleProvider.INSTANCE));
    }
}
