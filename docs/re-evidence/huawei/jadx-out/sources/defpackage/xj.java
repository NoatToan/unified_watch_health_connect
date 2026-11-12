package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public class xj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f53092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Object f53093c;
    protected HashSet<String> d;
    protected String e;

    private xj(Object obj) {
        this.f53093c = obj;
    }

    public static xj d(JsonParser jsonParser) {
        return new xj(jsonParser);
    }

    public static xj e(JsonGenerator jsonGenerator) {
        return new xj(jsonGenerator);
    }

    public xj d() {
        return new xj(this.f53093c);
    }

    public void b() {
        this.f53092b = null;
        this.e = null;
        this.d = null;
    }

    public Object c() {
        return this.f53093c;
    }

    public boolean d(String str) throws wn {
        String str2 = this.f53092b;
        if (str2 == null) {
            this.f53092b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.e;
        if (str3 == null) {
            this.e = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.d = hashSet;
            hashSet.add(this.f53092b);
            this.d.add(this.e);
        }
        return !this.d.add(str);
    }
}
