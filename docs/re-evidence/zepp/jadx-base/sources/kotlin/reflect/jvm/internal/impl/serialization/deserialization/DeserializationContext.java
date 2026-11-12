package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DeserializationContext {

    @NotNull
    private final DeserializationComponents a;

    @NotNull
    private final NameResolver b;

    @NotNull
    private final DeclarationDescriptor c;

    @NotNull
    private final TypeTable d;

    @NotNull
    private final VersionRequirementTable e;

    @NotNull
    private final BinaryVersion f;

    @Nullable
    private final DeserializedContainerSource g;

    @NotNull
    private final TypeDeserializer h;

    @NotNull
    private final MemberDeserializer i;

    public DeserializationContext(@NotNull DeserializationComponents deserializationComponents, @NotNull NameResolver nameResolver, @NotNull DeclarationDescriptor declarationDescriptor, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion, @Nullable DeserializedContainerSource deserializedContainerSource, @Nullable TypeDeserializer typeDeserializer, @NotNull List<ProtoBuf.TypeParameter> list) {
        String presentableString;
        this.a = deserializationComponents;
        this.b = nameResolver;
        this.c = declarationDescriptor;
        this.d = typeTable;
        this.e = versionRequirementTable;
        this.f = binaryVersion;
        this.g = deserializedContainerSource;
        this.h = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + declarationDescriptor.getName() + '\"', (deserializedContainerSource == null || (presentableString = deserializedContainerSource.getPresentableString()) == null) ? "[container not found]" : presentableString, false, 32, null);
        this.i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext childContext$default(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i, Object obj) {
        if ((i & 4) != 0) {
            nameResolver = deserializationContext.b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i & 8) != 0) {
            typeTable = deserializationContext.d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i & 16) != 0) {
            versionRequirementTable = deserializationContext.e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i & 32) != 0) {
            binaryVersion = deserializationContext.f;
        }
        return deserializationContext.childContext(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    @NotNull
    public final DeserializationContext childContext(@NotNull DeclarationDescriptor declarationDescriptor, @NotNull List<ProtoBuf.TypeParameter> list, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull VersionRequirementTable versionRequirementTable, @NotNull BinaryVersion binaryVersion) {
        return new DeserializationContext(this.a, nameResolver, declarationDescriptor, typeTable, VersionSpecificBehaviorKt.isVersionRequirementTableWrittenCorrectly(binaryVersion) ? versionRequirementTable : this.e, binaryVersion, this.g, this.h, list);
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        return this.a;
    }

    @Nullable
    public final DeserializedContainerSource getContainerSource() {
        return this.g;
    }

    @NotNull
    public final DeclarationDescriptor getContainingDeclaration() {
        return this.c;
    }

    @NotNull
    public final MemberDeserializer getMemberDeserializer() {
        return this.i;
    }

    @NotNull
    public final NameResolver getNameResolver() {
        return this.b;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.a.getStorageManager();
    }

    @NotNull
    public final TypeDeserializer getTypeDeserializer() {
        return this.h;
    }

    @NotNull
    public final TypeTable getTypeTable() {
        return this.d;
    }

    @NotNull
    public final VersionRequirementTable getVersionRequirementTable() {
        return this.e;
    }
}
