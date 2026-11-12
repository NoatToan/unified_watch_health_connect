package com.google.i18n.phonenumbers.internal;

import androidx.core.view.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class RegexCache {
    private LRUCache<String, Pattern> cache;

    public static class LRUCache<K, V> {
        private LinkedHashMap<K, V> map;
        private int size;

        public LRUCache(int i14) {
            this.size = i14;
            this.map = new LinkedHashMap<K, V>(j.a(i14, 4, 3, 1), 0.75f, true) { // from class: com.google.i18n.phonenumbers.internal.RegexCache.LRUCache.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > LRUCache.this.size;
                }
            };
        }

        public synchronized boolean containsKey(K k14) {
            return this.map.containsKey(k14);
        }

        public synchronized V get(K k14) {
            return this.map.get(k14);
        }

        public synchronized void put(K k14, V v14) {
            this.map.put(k14, v14);
        }
    }

    public RegexCache(int i14) {
        this.cache = new LRUCache<>(i14);
    }

    public boolean containsRegex(String str) {
        return this.cache.containsKey(str);
    }

    public Pattern getPatternForRegex(String str) {
        Pattern pattern = this.cache.get(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        this.cache.put(str, patternCompile);
        return patternCompile;
    }
}
