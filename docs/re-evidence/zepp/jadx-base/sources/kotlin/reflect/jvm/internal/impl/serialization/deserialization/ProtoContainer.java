package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ProtoContainer {

    @NotNull
    private final NameResolver a;

    @NotNull
    private final TypeTable b;

    @Nullable
    private final SourceElement c;

    public static final class Class extends ProtoContainer {

        @NotNull
        private final ProtoBuf.Class d;

        @Nullable
        private final Class e;

        @NotNull
        private final ClassId f;

        @NotNull
        private final ProtoBuf.Class.Kind g;
        private final boolean h;

        public Class(@NotNull ProtoBuf.Class r2, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement, @Nullable Class r6) {
            super(nameResolver, typeTable, sourceElement, null);
            this.d = r2;
            this.e = r6;
            this.f = NameResolverUtilKt.getClassId(nameResolver, r2.getFqName());
            ProtoBuf.Class.Kind kind = Flags.CLASS_KIND.get(r2.getFlags());
            this.g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            this.h = Flags.IS_INNER.get(r2.getFlags()).booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            return this.f.asSingleFqName();
        }

        @NotNull
        public final ClassId getClassId() {
            return this.f;
        }

        @NotNull
        public final ProtoBuf.Class getClassProto() {
            return this.d;
        }

        @NotNull
        public final ProtoBuf.Class.Kind getKind() {
            return this.g;
        }

        @Nullable
        public final Class getOuterClass() {
            return this.e;
        }

        public final boolean isInner() {
            return this.h;
        }
    }

    public static final class Package extends ProtoContainer {

        @NotNull
        private final FqName d;

        public Package(@NotNull FqName fqName, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @Nullable SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            this.d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        @NotNull
        public FqName debugFqName() {
            return this.d;
        }
    }

    private ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.a = nameResolver;
        this.b = typeTable;
        this.c = sourceElement;
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    @NotNull
    public abstract FqName debugFqName();

    @NotNull
    public final NameResolver getNameResolver() {
        return this.a;
    }

    @Nullable
    public final SourceElement getSource() {
        return this.c;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.b;
    }

    @NotNull
    public String toString() {
        return ((Object) getClass().getSimpleName()) + ": " + debugFqName();
    }
}
