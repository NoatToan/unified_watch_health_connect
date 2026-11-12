package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public interface c1 extends d1 {

    public interface a extends d1, Cloneable {
    }

    void b(CodedOutputStream codedOutputStream);

    l1<? extends c1> getParserForType();

    int getSerializedSize();

    j0.a newBuilderForType();

    j0.a toBuilder();

    i.h toByteString();
}
