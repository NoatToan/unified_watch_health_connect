package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class ListFieldSchemas {
    private static final ListFieldSchema FULL_SCHEMA = loadSchemaForFullRuntime();
    private static final ListFieldSchema LITE_SCHEMA = new ListFieldSchemaLite();

    static ListFieldSchema full() {
        return FULL_SCHEMA;
    }

    static ListFieldSchema lite() {
        return LITE_SCHEMA;
    }

    private static ListFieldSchema loadSchemaForFullRuntime() {
        if (Protobuf.assumeLiteRuntime) {
            return null;
        }
        try {
            return (ListFieldSchema) Class.forName("androidx.health.platform.client.proto.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private ListFieldSchemas() {
    }
}
