package io.netty.util;

import com.alipay.sdk.m.n.a;
import io.netty.util.internal.ObjectUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class DomainWildcardMappingBuilder<V> {
    private final V defaultValue;
    private final Map<String, V> map;

    public static final class ImmutableDomainWildcardMapping<V> implements Mapping<String, V> {
        private static final String REPR_HEADER = "ImmutableDomainWildcardMapping(default: ";
        private static final String REPR_MAP_CLOSING = ")";
        private static final String REPR_MAP_OPENING = ", map: ";
        private final V defaultValue;
        private final Map<String, V> map;

        public ImmutableDomainWildcardMapping(V v, Map<String, V> map) {
            this.defaultValue = v;
            this.map = new LinkedHashMap(map);
        }

        public static String normalize(String str) {
            return DomainNameMapping.normalizeHostname(str);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(REPR_HEADER);
            sb.append(this.defaultValue);
            sb.append(REPR_MAP_OPENING);
            sb.append('{');
            for (Map.Entry<String, V> entry : this.map.entrySet()) {
                String key = entry.getKey();
                if (key.charAt(0) == '.') {
                    key = '*' + key;
                }
                sb.append(key);
                sb.append(a.h);
                sb.append(entry.getValue());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append('}');
            sb.append(REPR_MAP_CLOSING);
            return sb.toString();
        }

        @Override // io.netty.util.Mapping
        public V map(String str) {
            V v;
            if (str != null) {
                String strNormalize = normalize(str);
                V v2 = this.map.get(strNormalize);
                if (v2 != null) {
                    return v2;
                }
                int iIndexOf = strNormalize.indexOf(46);
                if (iIndexOf != -1 && (v = this.map.get(strNormalize.substring(iIndexOf))) != null) {
                    return v;
                }
            }
            return this.defaultValue;
        }
    }

    public DomainWildcardMappingBuilder(V v) {
        this(4, v);
    }

    private String normalizeHostName(String str) {
        ObjectUtil.checkNotNull(str, "hostname");
        if (str.isEmpty() || str.charAt(0) == '.') {
            throw new IllegalArgumentException("Hostname '" + str + "' not valid");
        }
        String strNormalize = ImmutableDomainWildcardMapping.normalize((String) ObjectUtil.checkNotNull(str, "hostname"));
        if (strNormalize.charAt(0) != '*') {
            return strNormalize;
        }
        if (strNormalize.length() >= 3 && strNormalize.charAt(1) == '.') {
            return strNormalize.substring(1);
        }
        throw new IllegalArgumentException("Wildcard Hostname '" + strNormalize + "'not valid");
    }

    public DomainWildcardMappingBuilder<V> add(String str, V v) {
        this.map.put(normalizeHostName(str), (V) ObjectUtil.checkNotNull(v, "output"));
        return this;
    }

    public Mapping<String, V> build() {
        return new ImmutableDomainWildcardMapping(this.defaultValue, this.map);
    }

    public DomainWildcardMappingBuilder(int i, V v) {
        this.defaultValue = (V) ObjectUtil.checkNotNull(v, "defaultValue");
        this.map = new LinkedHashMap(i);
    }
}
