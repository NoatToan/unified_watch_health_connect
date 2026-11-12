package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class aek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final adb f330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final yo f331b;
    private static final yn d;
    private static final yn e;

    aek() {
    }

    static {
        adb adbVar = new adb();
        f330a = adbVar;
        e = adbVar.n();
        d = adbVar.n().b();
        f331b = adbVar.c(JsonNode.class);
    }

    public static String a(JsonNode jsonNode) {
        try {
            return e.c(jsonNode);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String d(JsonNode jsonNode) {
        try {
            return d.c(jsonNode);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] b(Object obj) throws IOException {
        return f330a.b(obj);
    }

    public static JsonNode a(byte[] bArr) throws IOException {
        return (JsonNode) f331b.b(bArr);
    }
}
