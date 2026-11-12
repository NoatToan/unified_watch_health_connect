package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class NewInstanceSchemaLite implements NewInstanceSchema {
    NewInstanceSchemaLite() {
    }

    @Override // androidx.health.platform.client.proto.NewInstanceSchema
    public Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).newMutableInstance();
    }
}
