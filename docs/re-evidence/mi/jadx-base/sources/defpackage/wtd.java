package defpackage;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wtd<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f38339b = "Invalid or non Implemented status";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vtd f38340a;

    public wtd(vtd vtdVar) {
        this.f38340a = vtdVar;
    }

    public abstract void a(Object obj, Object obj2) throws ParseException, IOException;

    /* JADX WARN: Multi-variable type inference failed */
    public T b(Object obj) {
        return obj;
    }

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f38339b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) throws ParseException, IOException {
        throw new RuntimeException(f38339b + " setValue in " + getClass() + " key=" + str);
    }

    public wtd<?> f(String str) throws ParseException, IOException {
        throw new RuntimeException(f38339b + " startArray in " + getClass() + " key=" + str);
    }

    public wtd<?> g(String str) throws ParseException, IOException {
        throw new RuntimeException(f38339b + " startObject(String key) in " + getClass() + " key=" + str);
    }
}
