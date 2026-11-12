package com.ximalaya.ting.android.sdkdownloader.http;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseParams {
    private String a = "UTF-8";
    private final List<Header> b = new ArrayList();
    private final List<KeyValue> c = new ArrayList();

    public static final class ArrayItem extends KeyValue {
        public ArrayItem(String str, Object obj) {
            super(str, obj);
        }
    }

    public static final class Header extends KeyValue {
        public final boolean setHeader;

        public Header(String str, String str2, boolean z) {
            super(str, str2);
            this.setHeader = z;
        }
    }

    public void addHeader(String str, String str2) {
        this.b.add(new Header(str, str2, false));
    }

    public void addParameter(String str, Object obj) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                this.c.add(new ArrayItem(str, it2.next()));
            }
            return;
        }
        if (!obj.getClass().isArray()) {
            this.c.add(new KeyValue(str, obj));
            return;
        }
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.add(new ArrayItem(str, Array.get(obj, i)));
        }
    }

    public void addQueryStringParameter(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.add(new KeyValue(str, str2));
    }

    public String getCharset() {
        return this.a;
    }

    public List<Header> getHeaders() {
        return new ArrayList(this.b);
    }

    public List<KeyValue> getQueryStringParams() {
        return new ArrayList(this.c);
    }

    public void setCharset(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a = str;
    }

    public void setHeader(String str, String str2) {
        Header header = new Header(str, str2, true);
        Iterator<Header> it2 = this.b.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().key)) {
                it2.remove();
            }
        }
        this.b.add(header);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.c.isEmpty()) {
            for (KeyValue keyValue : this.c) {
                sb.append(keyValue.key);
                sb.append(SearchCriteria.EQ);
                sb.append(keyValue.value);
                sb.append(com.alipay.sdk.m.s.a.l);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
