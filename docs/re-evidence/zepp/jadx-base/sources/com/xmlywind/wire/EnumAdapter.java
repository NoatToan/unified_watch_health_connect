package com.xmlywind.wire;

import com.xmlywind.wire.WireEnum;

/* JADX INFO: loaded from: classes22.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    public EnumAdapter(Class<E> cls) {
        super(FieldEncoding.VARINT, cls);
    }

    @Override // com.xmlywind.wire.ProtoAdapter
    public final E decode(ProtoReader protoReader) {
        int varint32 = protoReader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, this.javaType);
    }

    @Override // com.xmlywind.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, E e) {
        protoWriter.writeVarint32(e.getValue());
    }

    @Override // com.xmlywind.wire.ProtoAdapter
    public final int encodedSize(E e) {
        return ProtoWriter.varint32Size(e.getValue());
    }

    public abstract E fromValue(int i);
}
