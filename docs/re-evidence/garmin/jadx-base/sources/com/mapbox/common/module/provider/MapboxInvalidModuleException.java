package com.mapbox.common.module.provider;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.annotation.MapboxAnnotationConstants;
import com.mapbox.annotation.module.MapboxModuleType;
import d53.n;
import d53.u;
import java.util.Arrays;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxInvalidModuleException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/mapbox/annotation/module/MapboxModuleType;", "(Lcom/mapbox/annotation/module/MapboxModuleType;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class MapboxInvalidModuleException extends RuntimeException {
    private final MapboxModuleType type;

    public MapboxInvalidModuleException(MapboxModuleType mapboxModuleType) {
        mapboxModuleType.getClass();
        StringBuilder sb3 = new StringBuilder("\n    ");
        sb3.append(mapboxModuleType.name());
        sb3.append(" has been excluded from build but a correct alternative was not provided.\n    Make sure that:\n    - Your custom module implements ");
        sb3.append(mapboxModuleType.getInterfacePackage());
        sb3.append('.');
        sb3.append(mapboxModuleType.getInterfaceClassName());
        sb3.append(".\n    - Your custom module class is annotated with @MapboxModule(MapboxModuleType.");
        sb3.append(mapboxModuleType.name());
        sb3.append(").\n    - You've provided a `ModuleProvider` instance to ");
        x0 x0Var = x0.f105818a;
        sb3.append(String.format(MapboxAnnotationConstants.MODULE_CONFIGURATION_CLASS_NAME_FORMAT, Arrays.copyOf(new Object[]{mapboxModuleType.getSimplifiedName()}, 1)));
        sb3.append("#set");
        Locale locale = Locale.getDefault();
        locale.getClass();
        sb3.append(u.k(MapboxAnnotationConstants.MODULE_CONFIGURATION_PROVIDER_VARIABLE_NAME, locale));
        sb3.append(" before initializing the library,\n      unless `enableConfiguration` flag is set to false and your implementation has a public, non-arg constructor or is a Kotlin object.\n  ");
        super(n.c(sb3.toString()));
        this.type = mapboxModuleType;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final MapboxModuleType getType() {
        return this.type;
    }

    public static /* synthetic */ MapboxInvalidModuleException copy$default(MapboxInvalidModuleException mapboxInvalidModuleException, MapboxModuleType mapboxModuleType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            mapboxModuleType = mapboxInvalidModuleException.type;
        }
        return mapboxInvalidModuleException.copy(mapboxModuleType);
    }

    public final MapboxInvalidModuleException copy(MapboxModuleType type) {
        type.getClass();
        return new MapboxInvalidModuleException(type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapboxInvalidModuleException) && this.type == ((MapboxInvalidModuleException) other).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MapboxInvalidModuleException(type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
