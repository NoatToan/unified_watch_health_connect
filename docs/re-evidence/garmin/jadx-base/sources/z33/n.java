package z33;

import p005kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface n extends o {

    public interface a extends Cloneable, o {
        a b1(d dVar, e eVar);

        n build();
    }

    void a(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
