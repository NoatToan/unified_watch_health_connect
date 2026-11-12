package g83;

import c83.b0;
import c83.h;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import n23.j;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtensionRegistryLite f76451a;

    private a(ExtensionRegistryLite extensionRegistryLite) {
        this.f76451a = extensionRegistryLite;
    }

    public static a c() {
        return new a(null);
    }

    @Override // c83.h.a
    public final h<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, b0 b0Var) {
        if ((type instanceof Class) && MessageLite.class.isAssignableFrom((Class) type)) {
            return new b();
        }
        return null;
    }

    @Override // c83.h.a
    public final h<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        Parser parser;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (MessageLite.class.isAssignableFrom(cls)) {
                try {
                    try {
                        parser = (Parser) cls.getDeclaredMethod("parser", null).invoke(null, null);
                    } catch (IllegalAccessException | NoSuchFieldException e4) {
                        j.v("Found a protobuf message but ", cls.getName(), " had no parser() method or PARSER field.", e4);
                        return null;
                    }
                } catch (IllegalAccessException | NoSuchMethodException unused) {
                    parser = (Parser) cls.getDeclaredField("PARSER").get(null);
                } catch (InvocationTargetException e14) {
                    o2.c.p(e14.getCause());
                    return null;
                }
                return new c(parser, this.f76451a);
            }
        }
        return null;
    }
}
