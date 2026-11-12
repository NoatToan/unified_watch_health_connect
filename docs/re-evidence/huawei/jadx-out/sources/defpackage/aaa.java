package defpackage;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class aaa implements NullValueProvider, Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Object f14c;
    protected final AccessPattern d;
    private static final aaa e = new aaa(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final aaa f13a = new aaa(null);

    protected aaa(Object obj) {
        AccessPattern accessPattern;
        this.f14c = obj;
        if (obj == null) {
            accessPattern = AccessPattern.ALWAYS_NULL;
        } else {
            accessPattern = AccessPattern.CONSTANT;
        }
        this.d = accessPattern;
    }

    public static aaa b() {
        return e;
    }

    public static aaa d() {
        return f13a;
    }

    public static aaa b(Object obj) {
        if (obj == null) {
            return f13a;
        }
        return new aaa(obj);
    }

    public static boolean c(NullValueProvider nullValueProvider) {
        return nullValueProvider == e;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public AccessPattern getNullAccessPattern() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.deser.NullValueProvider
    public Object getNullValue(DeserializationContext deserializationContext) {
        return this.f14c;
    }
}
