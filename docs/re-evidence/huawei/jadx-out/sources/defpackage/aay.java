package defpackage;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
public class aay {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet<String> f193b = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i = 0; i < 7; i++) {
            f193b.add(clsArr[i].getName());
        }
        for (Class<?> cls : FromStringDeserializer.types()) {
            f193b.add(cls.getName());
        }
    }

    public static JsonDeserializer<?> d(Class<?> cls, String str) {
        if (!f193b.contains(str)) {
            return null;
        }
        FromStringDeserializer<?> fromStringDeserializerFindDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (fromStringDeserializerFindDeserializer != null) {
            return fromStringDeserializerFindDeserializer;
        }
        if (cls == UUID.class) {
            return new abt();
        }
        if (cls == StackTraceElement.class) {
            return new abk();
        }
        if (cls == AtomicBoolean.class) {
            return new aap();
        }
        if (cls == AtomicInteger.class) {
            return new aao();
        }
        if (cls == AtomicLong.class) {
            return new aau();
        }
        if (cls == ByteBuffer.class) {
            return new aav();
        }
        if (cls == Void.class) {
            return abf.d;
        }
        return null;
    }

    public static boolean d(Class<?> cls) {
        return f193b.contains(cls.getName());
    }
}
