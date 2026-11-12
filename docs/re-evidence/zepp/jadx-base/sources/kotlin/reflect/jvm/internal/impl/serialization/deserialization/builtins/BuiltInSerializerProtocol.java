package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BuiltInSerializerProtocol extends SerializerExtensionProtocol {

    @NotNull
    public static final BuiltInSerializerProtocol INSTANCE = new BuiltInSerializerProtocol();

    /* JADX WARN: Illegal instructions before constructor call */
    private BuiltInSerializerProtocol() {
        ExtensionRegistryLite extensionRegistryLiteNewInstance = ExtensionRegistryLite.newInstance();
        BuiltInsProtoBuf.registerAllExtensions(extensionRegistryLiteNewInstance);
        Unit unit = Unit.INSTANCE;
        super(extensionRegistryLiteNewInstance, BuiltInsProtoBuf.packageFqName, BuiltInsProtoBuf.constructorAnnotation, BuiltInsProtoBuf.classAnnotation, BuiltInsProtoBuf.functionAnnotation, BuiltInsProtoBuf.propertyAnnotation, BuiltInsProtoBuf.propertyGetterAnnotation, BuiltInsProtoBuf.propertySetterAnnotation, BuiltInsProtoBuf.enumEntryAnnotation, BuiltInsProtoBuf.compileTimeValue, BuiltInsProtoBuf.parameterAnnotation, BuiltInsProtoBuf.typeAnnotation, BuiltInsProtoBuf.typeParameterAnnotation);
    }

    private final String a(FqName fqName) {
        return fqName.isRoot() ? "default-package" : fqName.shortName().asString();
    }

    @NotNull
    public final String getBuiltInsFileName(@NotNull FqName fqName) {
        return Intrinsics.stringPlus(a(fqName), ".kotlin_builtins");
    }

    @NotNull
    public final String getBuiltInsFilePath(@NotNull FqName fqName) {
        return m.replace$default(fqName.asString(), '.', '/', false, 4, (Object) null) + '/' + getBuiltInsFileName(fqName);
    }
}
