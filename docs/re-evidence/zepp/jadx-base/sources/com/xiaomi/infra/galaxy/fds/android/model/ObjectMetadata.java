package com.xiaomi.infra.galaxy.fds.android.model;

import com.xiaomi.infra.galaxy.fds.android.util.Util;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes22.dex */
public class ObjectMetadata {
    private static final Set<String> c;
    private final Map<String, String> a = new HashMap();
    private final Map<String, String> b = new HashMap();

    static {
        HashSet hashSet = new HashSet();
        c = hashSet;
        hashSet.add("Last-Modified");
        hashSet.add("Content-MD5");
        hashSet.add("Content-Type");
        hashSet.add("Content-Length");
        hashSet.add("Content-Encoding");
        hashSet.add("Cache-Control");
    }

    private void a(String str) {
        boolean zStartsWith = str.startsWith("x-xiaomi-meta-");
        if (!zStartsWith) {
            Iterator<String> it2 = c.iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next())) {
                    zStartsWith = true;
                    break;
                }
            }
        }
        if (zStartsWith) {
            return;
        }
        throw new RuntimeException("Invalid metadata: " + str, null);
    }

    public static ObjectMetadata parseObjectMetadata(Header[] headerArr) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        for (Header header : headerArr) {
            String name = header.getName();
            String value = header.getValue();
            if (name.startsWith("x-xiaomi-meta-")) {
                objectMetadata.addUserMetadata(name, value);
            } else if (c.contains(name)) {
                objectMetadata.addPredefinedMetadata(name, value);
            }
        }
        return objectMetadata;
    }

    public void addPredefinedMetadata(String str, String str2) {
        a(str);
        this.b.put(str, str2);
    }

    public void addUserMetadata(String str, String str2) {
        a(str);
        this.a.put(str, str2);
    }

    public Map<String, String> getAllMetadata() {
        HashMap map = new HashMap(this.b);
        map.putAll(this.a);
        return map;
    }

    public String getCacheControl() {
        return this.b.get("Cache-Control");
    }

    public String getContentEncoding() {
        return this.b.get("Content-Encoding");
    }

    public long getContentLength() {
        String str = this.b.get("Content-Length");
        if (str != null) {
            return Long.parseLong(str);
        }
        return -1L;
    }

    public String getContentMD5() {
        return this.b.get("Content-MD5");
    }

    public String getContentType() {
        return this.b.get("Content-Type");
    }

    public Date getLastModified() {
        String str = this.b.get("Last-Modified");
        if (str != null) {
            try {
                return Util.parseDate(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public Map<String, String> getUserMetadata() {
        return this.a;
    }

    public void setCacheControl(String str) {
        this.b.put("Cache-Control", str);
    }

    public void setContentEncoding(String str) {
        this.b.put("Content-Encoding", str);
    }

    public void setContentLength(long j) {
        this.b.put("Content-Length", Long.toString(j));
    }

    public void setContentMD5(String str) {
        this.b.put("Content-MD5", str);
    }

    public void setContentType(String str) {
        this.b.put("Content-Type", str);
    }

    public void setLastModified(Date date) {
        this.b.put("Last-Modified", Util.formatDateString(date));
    }
}
