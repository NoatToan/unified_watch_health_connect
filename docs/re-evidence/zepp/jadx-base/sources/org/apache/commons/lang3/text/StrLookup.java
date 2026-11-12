package org.apache.commons.lang3.text;

import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public abstract class StrLookup<V> {
    private static final StrLookup<String> a = new b(null);
    private static final StrLookup<String> b = new c();

    public static class b<V> extends StrLookup<V> {
        private final Map<String, V> c;

        public b(Map<String, V> map) {
            this.c = map;
        }

        @Override // org.apache.commons.lang3.text.StrLookup
        public String lookup(String str) {
            V v;
            Map<String, V> map = this.c;
            if (map == null || (v = map.get(str)) == null) {
                return null;
            }
            return v.toString();
        }
    }

    public static class c extends StrLookup<String> {
        private c() {
        }

        @Override // org.apache.commons.lang3.text.StrLookup
        public String lookup(String str) {
            if (str.length() <= 0) {
                return null;
            }
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    public static <V> StrLookup<V> mapLookup(Map<String, V> map) {
        return new b(map);
    }

    public static StrLookup<?> noneLookup() {
        return a;
    }

    public static StrLookup<String> systemPropertiesLookup() {
        return b;
    }

    public abstract String lookup(String str);
}
