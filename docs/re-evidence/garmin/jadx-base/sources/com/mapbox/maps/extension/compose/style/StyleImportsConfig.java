package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;", "", "", "", "Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "<init>", "(Ljava/util/Map;)V", "importId", "Lkotlin/Function1;", "", "configs", "importConfig", "(Ljava/lang/String;Le23/l;)V", "component1$extension_compose_release", "()Ljava/util/Map;", "component1", "copy", "(Ljava/util/Map;)Lcom/mapbox/maps/extension/compose/style/StyleImportsConfig;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getEntries$extension_compose_release", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class StyleImportsConfig {
    private final Map<String, ImportConfigs> entries;

    public /* synthetic */ StyleImportsConfig(Map map, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StyleImportsConfig copy$default(StyleImportsConfig styleImportsConfig, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            map = styleImportsConfig.entries;
        }
        return styleImportsConfig.copy(map);
    }

    public final Map<String, ImportConfigs> component1$extension_compose_release() {
        return this.entries;
    }

    public final StyleImportsConfig copy(Map<String, ImportConfigs> entries) {
        entries.getClass();
        return new StyleImportsConfig(entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StyleImportsConfig) && s.g(this.entries, ((StyleImportsConfig) other).entries);
    }

    public final Map<String, ImportConfigs> getEntries$extension_compose_release() {
        return this.entries;
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void importConfig(String importId, l<? super ImportConfigs, Unit> configs) {
        importId.getClass();
        configs.getClass();
        if (this.entries.containsKey(importId)) {
            h.s(am.j.m("Configs for Import ID [", importId, "] already set."));
            return;
        }
        Map<String, ImportConfigs> map = this.entries;
        ImportConfigs importConfigs = new ImportConfigs(null, 1, 0 == true ? 1 : 0);
        configs.invoke(importConfigs);
        map.put(importId, importConfigs);
    }

    public String toString() {
        return "StyleImportsConfig(entries=" + this.entries + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public StyleImportsConfig(Map<String, ImportConfigs> map) {
        map.getClass();
        this.entries = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyleImportsConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
