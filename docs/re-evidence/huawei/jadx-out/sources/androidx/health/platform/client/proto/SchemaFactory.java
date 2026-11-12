package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
