package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class q67 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f31161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31162b;
    public String c;
    public HashSet<String> d;

    public q67(Object obj) {
        this.f31161a = obj;
    }

    public static q67 e(JsonGenerator jsonGenerator) {
        return new q67(jsonGenerator);
    }

    public static q67 f(JsonParser jsonParser) {
        return new q67(jsonParser);
    }

    public q67 a() {
        return new q67(this.f31161a);
    }

    public Object b() {
        return this.f31161a;
    }

    public boolean c(String str) throws JsonParseException {
        String str2 = this.f31162b;
        if (str2 == null) {
            this.f31162b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.c;
        if (str3 == null) {
            this.c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.d = hashSet;
            hashSet.add(this.f31162b);
            this.d.add(this.c);
        }
        return !this.d.add(str);
    }

    public void d() {
        this.f31162b = null;
        this.c = null;
        this.d = null;
    }
}
