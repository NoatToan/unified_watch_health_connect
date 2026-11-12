package defpackage;

import org.apache.commons.lang3.builder.ToStringStyle;

/* JADX INFO: loaded from: classes3.dex */
public class mgp {
    public static volatile ToStringStyle d = ToStringStyle.DEFAULT_STYLE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuffer f26167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f26168b;
    public final ToStringStyle c;

    public mgp(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        toStringStyle = toStringStyle == null ? b() : toStringStyle;
        stringBuffer = stringBuffer == null ? new StringBuffer(512) : stringBuffer;
        this.f26167a = stringBuffer;
        this.c = toStringStyle;
        this.f26168b = obj;
        toStringStyle.appendStart(stringBuffer, obj);
    }

    public static ToStringStyle b() {
        return d;
    }

    public mgp a(String str, Object obj) {
        this.c.append(this.f26167a, str, obj, (Boolean) null);
        return this;
    }

    public Object c() {
        return this.f26168b;
    }

    public StringBuffer d() {
        return this.f26167a;
    }

    public ToStringStyle e() {
        return this.c;
    }

    public String toString() {
        if (c() == null) {
            d().append(e().getNullText());
        } else {
            this.c.appendEnd(d(), c());
        }
        return d().toString();
    }
}
