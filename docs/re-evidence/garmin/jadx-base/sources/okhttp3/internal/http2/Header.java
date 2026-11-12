package okhttp3.internal.http2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import w63.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Lw63/h;", "name", "value", "<init>", "(Lw63/h;Lw63/h;)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lw63/h;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "()Lw63/h;", "component2", "copy", "(Lw63/h;Lw63/h;)Lokhttp3/internal/http2/Header;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw63/h;", "hpackSize", "I", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {
    public static final h PSEUDO_PREFIX;
    public static final h RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final h TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final h TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final h TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final h TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final h name;
    public final h value;

    static {
        h.f183361d.getClass();
        PSEUDO_PREFIX = h.a.c(":");
        RESPONSE_STATUS = h.a.c(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = h.a.c(TARGET_METHOD_UTF8);
        TARGET_PATH = h.a.c(TARGET_PATH_UTF8);
        TARGET_SCHEME = h.a.c(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = h.a.c(TARGET_AUTHORITY_UTF8);
    }

    public Header(h hVar, h hVar2) {
        hVar.getClass();
        hVar2.getClass();
        this.name = hVar;
        this.value = hVar2;
        this.hpackSize = hVar2.d() + hVar.d() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, h hVar, h hVar2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            hVar = header.name;
        }
        if ((i14 & 2) != 0) {
            hVar2 = header.value;
        }
        return header.copy(hVar, hVar2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final h getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final h getValue() {
        return this.value;
    }

    public final Header copy(h name, h value) {
        name.getClass();
        value.getClass();
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return s.g(this.name, header.name) && s.g(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.s() + ": " + this.value.s();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(h.a.c(str), h.a.c(str2));
        str.getClass();
        str2.getClass();
        h.f183361d.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h hVar, String str) {
        this(hVar, h.a.c(str));
        hVar.getClass();
        str.getClass();
        h.f183361d.getClass();
    }
}
