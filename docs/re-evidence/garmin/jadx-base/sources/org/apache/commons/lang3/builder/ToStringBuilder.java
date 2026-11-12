package org.apache.commons.lang3.builder;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.Validate;

/* JADX INFO: loaded from: classes3.dex */
public class ToStringBuilder implements Builder<String> {
    private static volatile ToStringStyle defaultStyle = ToStringStyle.DEFAULT_STYLE;
    private final StringBuffer buffer;
    private final Object object;
    private final ToStringStyle style;

    public ToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        toStringStyle = toStringStyle == null ? getDefaultStyle() : toStringStyle;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.buffer = stringBuffer;
        this.style = toStringStyle;
        this.object = obj;
        toStringStyle.appendStart(stringBuffer, obj);
    }

    public static ToStringStyle getDefaultStyle() {
        return defaultStyle;
    }

    public static String reflectionToString(Object obj, ToStringStyle toStringStyle, boolean z14) {
        return ReflectionToStringBuilder.toString(obj, toStringStyle, z14, false, null);
    }

    public static void setDefaultStyle(ToStringStyle toStringStyle) {
        defaultStyle = (ToStringStyle) Validate.notNull(toStringStyle, TtmlNode.TAG_STYLE, new Object[0]);
    }

    public ToStringBuilder append(String str, boolean[] zArr, boolean z14) {
        this.style.append(this.buffer, str, zArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder appendAsObjectToString(Object obj) {
        ObjectUtils.identityToString(getStringBuffer(), obj);
        return this;
    }

    public ToStringBuilder appendSuper(String str) {
        if (str != null) {
            this.style.appendSuper(this.buffer, str);
        }
        return this;
    }

    public ToStringBuilder appendToString(String str) {
        if (str != null) {
            this.style.appendToString(this.buffer, str);
        }
        return this;
    }

    public Object getObject() {
        return this.object;
    }

    public StringBuffer getStringBuffer() {
        return this.buffer;
    }

    public ToStringStyle getStyle() {
        return this.style;
    }

    public String toString() {
        if (getObject() == null) {
            getStringBuffer().append(getStyle().getNullText());
        } else {
            this.style.appendEnd(getStringBuffer(), getObject());
        }
        return getStringBuffer().toString();
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public String build() {
        return toString();
    }

    public static String reflectionToString(Object obj, ToStringStyle toStringStyle) {
        return ReflectionToStringBuilder.toString(obj, toStringStyle);
    }

    public static String reflectionToString(Object obj) {
        return ReflectionToStringBuilder.toString(obj);
    }

    public static <T> String reflectionToString(T t7, ToStringStyle toStringStyle, boolean z14, Class<? super T> cls) {
        return ReflectionToStringBuilder.toString(t7, toStringStyle, z14, false, cls);
    }

    public ToStringBuilder append(boolean[] zArr) {
        this.style.append(this.buffer, (String) null, zArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(byte b14) {
        this.style.append(this.buffer, (String) null, b14);
        return this;
    }

    public ToStringBuilder append(byte[] bArr) {
        this.style.append(this.buffer, (String) null, bArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(char c14) {
        this.style.append(this.buffer, (String) null, c14);
        return this;
    }

    public ToStringBuilder append(char[] cArr) {
        this.style.append(this.buffer, (String) null, cArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(double d14) {
        this.style.append(this.buffer, (String) null, d14);
        return this;
    }

    public ToStringBuilder append(double[] dArr) {
        this.style.append(this.buffer, (String) null, dArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(float f14) {
        this.style.append(this.buffer, (String) null, f14);
        return this;
    }

    public ToStringBuilder append(float[] fArr) {
        this.style.append(this.buffer, (String) null, fArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(int i14) {
        this.style.append(this.buffer, (String) null, i14);
        return this;
    }

    public ToStringBuilder append(int[] iArr) {
        this.style.append(this.buffer, (String) null, iArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(long j8) {
        this.style.append(this.buffer, (String) null, j8);
        return this;
    }

    public ToStringBuilder append(long[] jArr) {
        this.style.append(this.buffer, (String) null, jArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(Object obj) {
        this.style.append(this.buffer, (String) null, obj, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(Object[] objArr) {
        this.style.append(this.buffer, (String) null, objArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(short s8) {
        this.style.append(this.buffer, (String) null, s8);
        return this;
    }

    public ToStringBuilder(Object obj, ToStringStyle toStringStyle) {
        this(obj, toStringStyle, null);
    }

    public ToStringBuilder append(short[] sArr) {
        this.style.append(this.buffer, (String) null, sArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder(Object obj) {
        this(obj, null, null);
    }

    public ToStringBuilder append(String str, boolean z14) {
        this.style.append(this.buffer, str, z14);
        return this;
    }

    public ToStringBuilder append(String str, boolean[] zArr) {
        this.style.append(this.buffer, str, zArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(boolean z14) {
        this.style.append(this.buffer, (String) null, z14);
        return this;
    }

    public ToStringBuilder append(String str, byte b14) {
        this.style.append(this.buffer, str, b14);
        return this;
    }

    public ToStringBuilder append(String str, byte[] bArr) {
        this.style.append(this.buffer, str, bArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, byte[] bArr, boolean z14) {
        this.style.append(this.buffer, str, bArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, char c14) {
        this.style.append(this.buffer, str, c14);
        return this;
    }

    public ToStringBuilder append(String str, char[] cArr) {
        this.style.append(this.buffer, str, cArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, char[] cArr, boolean z14) {
        this.style.append(this.buffer, str, cArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, double d14) {
        this.style.append(this.buffer, str, d14);
        return this;
    }

    public ToStringBuilder append(String str, double[] dArr) {
        this.style.append(this.buffer, str, dArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, double[] dArr, boolean z14) {
        this.style.append(this.buffer, str, dArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, float f14) {
        this.style.append(this.buffer, str, f14);
        return this;
    }

    public ToStringBuilder append(String str, float[] fArr) {
        this.style.append(this.buffer, str, fArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, float[] fArr, boolean z14) {
        this.style.append(this.buffer, str, fArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, int i14) {
        this.style.append(this.buffer, str, i14);
        return this;
    }

    public ToStringBuilder append(String str, int[] iArr) {
        this.style.append(this.buffer, str, iArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, int[] iArr, boolean z14) {
        this.style.append(this.buffer, str, iArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, long j8) {
        this.style.append(this.buffer, str, j8);
        return this;
    }

    public ToStringBuilder append(String str, long[] jArr) {
        this.style.append(this.buffer, str, jArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, long[] jArr, boolean z14) {
        this.style.append(this.buffer, str, jArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, Object obj) {
        this.style.append(this.buffer, str, obj, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, Object obj, boolean z14) {
        this.style.append(this.buffer, str, obj, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, Object[] objArr) {
        this.style.append(this.buffer, str, objArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, Object[] objArr, boolean z14) {
        this.style.append(this.buffer, str, objArr, Boolean.valueOf(z14));
        return this;
    }

    public ToStringBuilder append(String str, short s8) {
        this.style.append(this.buffer, str, s8);
        return this;
    }

    public ToStringBuilder append(String str, short[] sArr) {
        this.style.append(this.buffer, str, sArr, (Boolean) null);
        return this;
    }

    public ToStringBuilder append(String str, short[] sArr, boolean z14) {
        this.style.append(this.buffer, str, sArr, Boolean.valueOf(z14));
        return this;
    }
}
