package org.apache.commons.lang.text;

import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class StrLookup {
    private static final StrLookup a = new a(null);
    private static final StrLookup b;

    public static class a extends StrLookup {
        private final Map c;

        public a(Map map) {
            this.c = map;
        }

        @Override // org.apache.commons.lang.text.StrLookup
        public String lookup(String str) {
            Object obj;
            Map map = this.c;
            if (map == null || (obj = map.get(str)) == null) {
                return null;
            }
            return obj.toString();
        }
    }

    static {
        StrLookup aVar;
        try {
            aVar = new a(System.getProperties());
        } catch (SecurityException unused) {
            aVar = a;
        }
        b = aVar;
    }

    public static StrLookup mapLookup(Map map) {
        return new a(map);
    }

    public static StrLookup noneLookup() {
        return a;
    }

    public static StrLookup systemPropertiesLookup() {
        return b;
    }

    public abstract String lookup(String str);
}
