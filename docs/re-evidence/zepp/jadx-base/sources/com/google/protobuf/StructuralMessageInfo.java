package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class StructuralMessageInfo implements j {
    private final int[] checkInitialized;
    private final MessageLite defaultInstance;
    private final FieldInfo[] fields;
    private final boolean messageSetWireFormat;
    private final ProtoSyntax syntax;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.syntax = protoSyntax;
        this.messageSetWireFormat = z;
        this.checkInitialized = iArr;
        this.fields = fieldInfoArr;
        this.defaultInstance = (MessageLite) Internal.b(obj, "defaultInstance");
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public int[] getCheckInitialized() {
        return this.checkInitialized;
    }

    @Override // com.google.protobuf.j
    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public FieldInfo[] getFields() {
        return this.fields;
    }

    @Override // com.google.protobuf.j
    public ProtoSyntax getSyntax() {
        return this.syntax;
    }

    @Override // com.google.protobuf.j
    public boolean isMessageSetWireFormat() {
        return this.messageSetWireFormat;
    }

    public static Builder newBuilder(int i) {
        return new Builder(i);
    }

    public static final class Builder {
        private final List<FieldInfo> a;
        private ProtoSyntax b;
        private boolean c;
        private boolean d;
        private int[] e;
        private Object f;

        public Builder() {
            this.e = null;
            this.a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.b == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.c = true;
            Collections.sort(this.a);
            return new StructuralMessageInfo(this.b, this.d, this.e, (FieldInfo[]) this.a.toArray(new FieldInfo[0]), this.f);
        }

        public void withCheckInitialized(int[] iArr) {
            this.e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.c) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.a.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z) {
            this.d = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.b = (ProtoSyntax) Internal.b(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.e = null;
            this.a = new ArrayList(i);
        }
    }
}
