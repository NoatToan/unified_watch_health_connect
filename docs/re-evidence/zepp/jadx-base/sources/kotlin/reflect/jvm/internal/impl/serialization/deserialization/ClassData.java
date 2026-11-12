package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class ClassData {

    @NotNull
    private final NameResolver a;

    @NotNull
    private final ProtoBuf.Class b;

    @NotNull
    private final BinaryVersion c;

    @NotNull
    private final SourceElement d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class r2, @NotNull BinaryVersion binaryVersion, @NotNull SourceElement sourceElement) {
        this.a = nameResolver;
        this.b = r2;
        this.c = binaryVersion;
        this.d = sourceElement;
    }

    @NotNull
    public final NameResolver component1() {
        return this.a;
    }

    @NotNull
    public final ProtoBuf.Class component2() {
        return this.b;
    }

    @NotNull
    public final BinaryVersion component3() {
        return this.c;
    }

    @NotNull
    public final SourceElement component4() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.areEqual(this.a, classData.a) && Intrinsics.areEqual(this.b, classData.b) && Intrinsics.areEqual(this.c, classData.c) && Intrinsics.areEqual(this.d, classData.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
