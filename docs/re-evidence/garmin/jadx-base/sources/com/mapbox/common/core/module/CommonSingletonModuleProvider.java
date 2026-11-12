package com.mapbox.common.core.module;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.common.module.LibraryLoader;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import o13.l;
import o13.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/core/module/CommonSingletonModuleProvider;", "", "<init>", "()V", "Lcom/mapbox/annotation/module/MapboxModuleType;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "(Lcom/mapbox/annotation/module/MapboxModuleType;)[Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance$delegate", "Lo13/l;", "getLoaderInstance", "()Lcom/mapbox/common/module/LibraryLoader;", "loaderInstance", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CommonSingletonModuleProvider {
    public static final CommonSingletonModuleProvider INSTANCE = new CommonSingletonModuleProvider();

    /* JADX INFO: renamed from: loaderInstance$delegate, reason: from kotlin metadata */
    private static final l loaderInstance = m.b(CommonSingletonModuleProvider$loaderInstance$2.INSTANCE);

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapboxModuleType.values().length];
            try {
                iArr[MapboxModuleType.CommonLogger.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapboxModuleType.CommonLibraryLoader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private CommonSingletonModuleProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(MapboxModuleType type) {
        int i14 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i14 == 1) {
            return new ModuleProviderArgument[0];
        }
        if (i14 == 2) {
            return new ModuleProviderArgument[0];
        }
        com.google.firebase.messaging.l.j(type, "unsupported module type - ");
        return null;
    }

    public final LibraryLoader getLoaderInstance() {
        return (LibraryLoader) loaderInstance.getValue();
    }
}
