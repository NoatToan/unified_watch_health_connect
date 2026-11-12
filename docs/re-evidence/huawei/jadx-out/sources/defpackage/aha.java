package defpackage;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class aha extends ToStringSerializerBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aha f401b = new aha();

    public aha() {
        super(Object.class);
    }

    public aha(Class<?> cls) {
        super(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
    public final String valueToString(Object obj) {
        return obj.toString();
    }
}
