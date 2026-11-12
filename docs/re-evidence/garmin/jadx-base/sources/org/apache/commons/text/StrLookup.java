package org.apache.commons.text;

import am.j;
import java.util.Map;
import java.util.ResourceBundle;
import org.apache.commons.text.lookup.StringLookup;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class StrLookup<V> implements StringLookup {
    private static final StrLookup<String> NONE_LOOKUP = new MapStrLookup(null);
    private static final StrLookup<String> SYSTEM_PROPERTIES_LOOKUP = new SystemPropertiesStrLookup();

    public static class MapStrLookup<V> extends StrLookup<V> {
        private final Map<String, V> map;

        public MapStrLookup(Map<String, V> map) {
            this.map = map;
        }

        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            V v14;
            Map<String, V> map = this.map;
            if (map == null || (v14 = map.get(str)) == null) {
                return null;
            }
            return v14.toString();
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(super.toString());
            sb3.append(" [map=");
            return j.s(sb3, this.map, "]");
        }
    }

    public static final class ResourceBundleLookup extends StrLookup<String> {
        private final ResourceBundle resourceBundle;

        private ResourceBundleLookup(ResourceBundle resourceBundle) {
            this.resourceBundle = resourceBundle;
        }

        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            ResourceBundle resourceBundle = this.resourceBundle;
            if (resourceBundle == null || str == null || !resourceBundle.containsKey(str)) {
                return null;
            }
            return this.resourceBundle.getString(str);
        }

        public String toString() {
            return super.toString() + " [resourceBundle=" + this.resourceBundle + "]";
        }
    }

    public static final class SystemPropertiesStrLookup extends StrLookup<String> {
        private SystemPropertiesStrLookup() {
        }

        @Override // org.apache.commons.text.lookup.StringLookup
        public String lookup(String str) {
            if (str.length() > 0) {
                try {
                    return System.getProperty(str);
                } catch (SecurityException unused) {
                }
            }
            return null;
        }
    }

    public static <V> StrLookup<V> mapLookup(Map<String, V> map) {
        return new MapStrLookup(map);
    }

    public static StrLookup<?> noneLookup() {
        return NONE_LOOKUP;
    }

    public static StrLookup<String> resourceBundleLookup(ResourceBundle resourceBundle) {
        return new ResourceBundleLookup(resourceBundle);
    }

    public static StrLookup<String> systemPropertiesLookup() {
        return SYSTEM_PROPERTIES_LOOKUP;
    }
}
