package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class JvmPackagePartSource implements DeserializedContainerSource {

    @NotNull
    private final JvmClassName a;

    @Nullable
    private final JvmClassName b;

    @Nullable
    private final IncompatibleVersionErrorData<JvmMetadataVersion> c;
    private final boolean d;

    @NotNull
    private final DeserializedContainerAbiStability e;

    @Nullable
    private final KotlinJvmBinaryClass f;

    @NotNull
    private final String g;

    public JvmPackagePartSource(@NotNull JvmClassName jvmClassName, @Nullable JvmClassName jvmClassName2, @NotNull ProtoBuf.Package r3, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        String string;
        this.a = jvmClassName;
        this.b = jvmClassName2;
        this.c = incompatibleVersionErrorData;
        this.d = z;
        this.e = deserializedContainerAbiStability;
        this.f = kotlinJvmBinaryClass;
        Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(r3, JvmProtoBuf.packageModuleName);
        String str = "main";
        if (num != null && (string = nameResolver.getString(num.intValue())) != null) {
            str = string;
        }
        this.g = str;
    }

    @NotNull
    public final ClassId getClassId() {
        return new ClassId(this.a.getPackageFqName(), getSimpleName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    public SourceFile getContainingFile() {
        return SourceFile.NO_SOURCE_FILE;
    }

    @Nullable
    public final JvmClassName getFacadeClassName() {
        return this.b;
    }

    @Nullable
    public final KotlinJvmBinaryClass getKnownJvmBinaryClass() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    @NotNull
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    @NotNull
    public final Name getSimpleName() {
        return Name.identifier(StringsKt__StringsKt.substringAfterLast$default(this.a.getInternalName(), '/', (String) null, 2, (Object) null));
    }

    @NotNull
    public String toString() {
        return ((Object) JvmPackagePartSource.class.getSimpleName()) + ": " + this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmPackagePartSource(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @NotNull ProtoBuf.Package r12, @NotNull NameResolver nameResolver, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z, @NotNull DeserializedContainerAbiStability deserializedContainerAbiStability) {
        JvmClassName jvmClassNameByClassId = JvmClassName.byClassId(kotlinJvmBinaryClass.getClassId());
        String multifileClassName = kotlinJvmBinaryClass.getClassHeader().getMultifileClassName();
        JvmClassName jvmClassNameByInternalName = null;
        if (multifileClassName != null) {
            if (multifileClassName.length() > 0) {
                jvmClassNameByInternalName = JvmClassName.byInternalName(multifileClassName);
            }
        }
        this(jvmClassNameByClassId, jvmClassNameByInternalName, r12, nameResolver, incompatibleVersionErrorData, z, deserializedContainerAbiStability, kotlinJvmBinaryClass);
    }
}
