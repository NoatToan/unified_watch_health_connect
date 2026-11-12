package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface q0 extends r0 {

    public interface a extends r0, Cloneable {
    }

    void b(CodedOutputStream codedOutputStream);

    z0<? extends q0> getParserForType();

    int getSerializedSize();

    x.a newBuilderForType();

    x.a toBuilder();

    h.C0094h toByteString();
}
