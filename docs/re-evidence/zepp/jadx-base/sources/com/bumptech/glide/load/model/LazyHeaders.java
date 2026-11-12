package com.bumptech.glide.load.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyHeaders implements Headers {
    private final Map<String, List<LazyHeaderFactory>> a;
    private volatile Map<String, String> b;

    public static final class Builder {
        private static final String d = "User-Agent";
        private static final String e;
        private static final Map<String, List<LazyHeaderFactory>> f;
        private boolean a = true;
        private Map<String, List<LazyHeaderFactory>> b = f;
        private boolean c = true;

        static {
            String strD = d();
            e = strD;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strD)) {
                map.put("User-Agent", Collections.singletonList(new a(strD)));
            }
            f = Collections.unmodifiableMap(map);
        }

        private Map<String, List<LazyHeaderFactory>> a() {
            HashMap map = new HashMap(this.b.size());
            for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.b.entrySet()) {
                map.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return map;
        }

        private void b() {
            if (this.a) {
                this.a = false;
                this.b = a();
            }
        }

        private List<LazyHeaderFactory> c(String str) {
            List<LazyHeaderFactory> list = this.b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.b.put(str, arrayList);
            return arrayList;
        }

        @VisibleForTesting
        public static String d() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public Builder addHeader(String str, String str2) {
            return addHeader(str, new a(str2));
        }

        public LazyHeaders build() {
            this.a = true;
            return new LazyHeaders(this.b);
        }

        public Builder setHeader(String str, String str2) {
            return setHeader(str, str2 == null ? null : new a(str2));
        }

        public Builder addHeader(String str, LazyHeaderFactory lazyHeaderFactory) {
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, lazyHeaderFactory);
            }
            b();
            c(str).add(lazyHeaderFactory);
            return this;
        }

        public Builder setHeader(String str, LazyHeaderFactory lazyHeaderFactory) {
            b();
            if (lazyHeaderFactory == null) {
                this.b.remove(str);
            } else {
                List<LazyHeaderFactory> listC = c(str);
                listC.clear();
                listC.add(lazyHeaderFactory);
            }
            if (this.c && "User-Agent".equalsIgnoreCase(str)) {
                this.c = false;
            }
            return this;
        }
    }

    public static final class a implements LazyHeaderFactory {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public String buildHeader() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    public LazyHeaders(Map<String, List<LazyHeaderFactory>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    @NonNull
    private String a(@NonNull List<LazyHeaderFactory> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String strBuildHeader = list.get(i).buildHeader();
            if (!TextUtils.isEmpty(strBuildHeader)) {
                sb.append(strBuildHeader);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> b() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.a.entrySet()) {
            String strA = a(entry.getValue());
            if (!TextUtils.isEmpty(strA)) {
                map.put(entry.getKey(), strA);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.a.equals(((LazyHeaders) obj).a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.b;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.a + '}';
    }
}
