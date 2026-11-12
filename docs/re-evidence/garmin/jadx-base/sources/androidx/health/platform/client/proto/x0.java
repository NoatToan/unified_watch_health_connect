package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public interface x0 {
    w0 a();

    w0 forMapData(Object obj);

    v0.a<?, ?> forMapMetadata(Object obj);

    w0 forMutableMapData(Object obj);

    int getSerializedSize(int i14, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    w0 mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
