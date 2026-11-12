package com.xiaomi.smarthome.library.apache.http.message;

import com.xiaomi.smarthome.library.apache.http.NameValuePair;
import com.xiaomi.smarthome.library.apache.http.util.CharArrayBuffer;
import com.xiaomi.smarthome.library.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes2.dex */
public class BasicNameValuePair implements NameValuePair, Cloneable {
    private final String name;
    private final String value;

    public BasicNameValuePair(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.name = str;
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
        return this.name.equals(basicNameValuePair.name) && LangUtils.equals(this.value, basicNameValuePair.value);
    }

    @Override // com.xiaomi.smarthome.library.apache.http.NameValuePair
    public String getName() {
        return this.name;
    }

    @Override // com.xiaomi.smarthome.library.apache.http.NameValuePair
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(17, this.name), this.value);
    }

    public String toString() {
        int length = this.name.length();
        String str = this.value;
        if (str != null) {
            length += str.length() + 1;
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(length);
        charArrayBuffer.append(this.name);
        if (this.value != null) {
            charArrayBuffer.append("=");
            charArrayBuffer.append(this.value);
        }
        return charArrayBuffer.toString();
    }
}
