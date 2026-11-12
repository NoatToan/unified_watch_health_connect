package h33;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static /* synthetic */ void a(int i14) {
        Object[] objArr = new Object[3];
        if (i14 == 1 || i14 == 2) {
            objArr[0] = "companionObject";
        } else if (i14 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i14 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i14 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i14 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
