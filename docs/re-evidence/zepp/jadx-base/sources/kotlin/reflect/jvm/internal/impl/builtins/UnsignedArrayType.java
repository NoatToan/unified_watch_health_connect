package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public enum UnsignedArrayType {
    UBYTEARRAY(ClassId.fromString("kotlin/UByteArray")),
    USHORTARRAY(ClassId.fromString("kotlin/UShortArray")),
    UINTARRAY(ClassId.fromString("kotlin/UIntArray")),
    ULONGARRAY(ClassId.fromString("kotlin/ULongArray"));


    @NotNull
    private final ClassId classId;

    @NotNull
    private final Name typeName;

    UnsignedArrayType(ClassId classId) {
        this.classId = classId;
        this.typeName = classId.getShortClassName();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
