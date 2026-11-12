package com.mapbox.maps.extension.compose.style;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import java.util.HashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006HÀ\u0003¢\u0006\u0002\b\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0005J/\u0010\u0010\u001a\u00020\u00002$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R0\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/ImportConfigs;", "", "configs", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getConfigs$extension_compose_release", "()Ljava/util/HashMap;", "component1", "component1$extension_compose_release", "config", "", "name", "value", "copy", "equals", "", "other", "hashCode", "", "toString", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ImportConfigs {
    private final HashMap<String, Value> configs;

    public /* synthetic */ ImportConfigs(HashMap map, int i14, j jVar) {
        this((i14 & 1) != 0 ? new HashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImportConfigs copy$default(ImportConfigs importConfigs, HashMap map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            map = importConfigs.configs;
        }
        return importConfigs.copy(map);
    }

    public final HashMap<String, Value> component1$extension_compose_release() {
        return this.configs;
    }

    public final void config(String name, Value value) {
        name.getClass();
        value.getClass();
        if (this.configs.containsKey(name)) {
            h.s(am.j.m("Config name [", name, "] already set"));
        } else {
            this.configs.put(name, value);
        }
    }

    public final ImportConfigs copy(HashMap<String, Value> configs) {
        configs.getClass();
        return new ImportConfigs(configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ImportConfigs) && s.g(this.configs, ((ImportConfigs) other).configs);
    }

    public final HashMap<String, Value> getConfigs$extension_compose_release() {
        return this.configs;
    }

    public int hashCode() {
        return this.configs.hashCode();
    }

    public String toString() {
        return "ImportConfigs(configs=" + this.configs + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ImportConfigs(HashMap<String, Value> map) {
        map.getClass();
        this.configs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImportConfigs() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
