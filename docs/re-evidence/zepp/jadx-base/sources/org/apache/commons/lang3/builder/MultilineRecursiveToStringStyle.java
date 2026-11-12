package org.apache.commons.lang3.builder;

import com.alipay.sdk.m.u.i;
import org.apache.commons.lang3.ClassUtils;

/* JADX INFO: loaded from: classes23.dex */
public class MultilineRecursiveToStringStyle extends RecursiveToStringStyle {
    private static final long serialVersionUID = 1;
    private static final int w = 2;
    private int v = 2;

    public MultilineRecursiveToStringStyle() {
        f();
    }

    private void f() {
        setArrayStart("{" + System.lineSeparator() + ((Object) g(this.v)));
        setArraySeparator("," + System.lineSeparator() + ((Object) g(this.v)));
        setArrayEnd(System.lineSeparator() + ((Object) g(this.v + (-2))) + i.d);
        setContentStart("[" + System.lineSeparator() + ((Object) g(this.v)));
        setFieldSeparator("," + System.lineSeparator() + ((Object) g(this.v)));
        setContentEnd(System.lineSeparator() + ((Object) g(this.v + (-2))) + "]");
    }

    private StringBuilder g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        return sb;
    }

    @Override // org.apache.commons.lang3.builder.RecursiveToStringStyle, org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object obj) {
        if (ClassUtils.isPrimitiveWrapper(obj.getClass()) || String.class.equals(obj.getClass()) || !accept(obj.getClass())) {
            super.appendDetail(stringBuffer, str, obj);
            return;
        }
        this.v += 2;
        f();
        stringBuffer.append(ReflectionToStringBuilder.toString(obj, this));
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void reflectionAppendArrayDetail(StringBuffer stringBuffer, String str, Object obj) {
        this.v += 2;
        f();
        super.reflectionAppendArrayDetail(stringBuffer, str, obj);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, Object[] objArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, objArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, long[] jArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, jArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, int[] iArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, iArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, short[] sArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, sArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, byte[] bArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, bArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, char[] cArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, cArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, double[] dArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, dArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, float[] fArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, fArr);
        this.v -= 2;
        f();
    }

    @Override // org.apache.commons.lang3.builder.ToStringStyle
    public void appendDetail(StringBuffer stringBuffer, String str, boolean[] zArr) {
        this.v += 2;
        f();
        super.appendDetail(stringBuffer, str, zArr);
        this.v -= 2;
        f();
    }
}
