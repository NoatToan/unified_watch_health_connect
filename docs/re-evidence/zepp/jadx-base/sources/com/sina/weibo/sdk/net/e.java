package com.sina.weibo.sdk.net;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class e implements d {
    private String i;
    private Bundle j = new Bundle();
    private Bundle k = new Bundle();
    private Map<String, Object<File>> l = new HashMap();
    private Map<String, byte[]> m = new HashMap();
    private int n;
    private int o;

    public static final class a {
        public String i;
        public Bundle j = new Bundle();
        public Bundle k = new Bundle();
        public Map<String, Object<File>> l = new HashMap();
        public Map<String, byte[]> m = new HashMap();
        public int n = 30000;
        public int o = 60000;

        public final a a(String str, Object obj) {
            a(this.j, str, obj);
            return this;
        }

        public final a b(String str, Object obj) {
            a(this.k, str, obj);
            return this;
        }

        public final e h() {
            return new e(this);
        }

        private void a(Bundle bundle, String str, Object obj) {
            if (obj != null) {
                if (obj instanceof String) {
                    bundle.putString(str, String.valueOf(obj));
                    return;
                }
                if (obj instanceof Integer) {
                    bundle.putInt(str, ((Integer) obj).intValue());
                    return;
                }
                if (obj instanceof Short) {
                    bundle.putShort(str, ((Short) obj).shortValue());
                    return;
                }
                if (obj instanceof Character) {
                    bundle.putChar(str, ((Character) obj).charValue());
                    return;
                }
                if (obj instanceof Byte) {
                    bundle.putByte(str, ((Byte) obj).byteValue());
                    return;
                }
                if (obj instanceof Long) {
                    bundle.putLong(str, ((Long) obj).longValue());
                    return;
                }
                if (obj instanceof Float) {
                    bundle.putFloat(str, ((Float) obj).floatValue());
                    return;
                }
                if (obj instanceof Double) {
                    bundle.putDouble(str, ((Double) obj).doubleValue());
                    return;
                }
                if (obj instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof byte[]) {
                    this.m.put(str, (byte[]) obj);
                } else {
                    if (!(obj instanceof Serializable)) {
                        throw new IllegalArgumentException("Unsupported params type!");
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            }
        }
    }

    public e(a aVar) {
        this.i = aVar.i;
        this.j.putAll(aVar.j);
        this.k.putAll(aVar.k);
        this.l.putAll(aVar.l);
        this.m.putAll(aVar.m);
        this.n = aVar.n;
        this.o = aVar.o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle g() {
        return this.k;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getConnectTimeout() {
        return this.n;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final Bundle getParams() {
        return this.j;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final int getReadTimeout() {
        return this.o;
    }

    @Override // com.sina.weibo.sdk.net.d
    public final String getUrl() {
        return this.i;
    }
}
