package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [M] */
/* JADX INFO: loaded from: classes23.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1<M> extends Lambda implements Function0<M> {
    public final /* synthetic */ Parser<M> a;
    public final /* synthetic */ ByteArrayInputStream b;
    public final /* synthetic */ DeserializedMemberScope c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser<M> parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.a = parser;
        this.b = byteArrayInputStream;
        this.c = deserializedMemberScope;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TM; */
    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final MessageLite invoke() {
        return (MessageLite) this.a.parseDelimitedFrom(this.b, this.c.getC().getComponents().getExtensionRegistryLite());
    }
}
