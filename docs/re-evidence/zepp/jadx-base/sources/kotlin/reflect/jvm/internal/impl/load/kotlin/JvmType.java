package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class JvmType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Primitive a = new Primitive(JvmPrimitiveType.BOOLEAN);

    @NotNull
    private static final Primitive b = new Primitive(JvmPrimitiveType.CHAR);

    @NotNull
    private static final Primitive c = new Primitive(JvmPrimitiveType.BYTE);

    @NotNull
    private static final Primitive d = new Primitive(JvmPrimitiveType.SHORT);

    @NotNull
    private static final Primitive e = new Primitive(JvmPrimitiveType.INT);

    @NotNull
    private static final Primitive f = new Primitive(JvmPrimitiveType.FLOAT);

    @NotNull
    private static final Primitive g = new Primitive(JvmPrimitiveType.LONG);

    @NotNull
    private static final Primitive h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {

        @NotNull
        private final JvmType i;

        public Array(@NotNull JvmType jvmType) {
            super(null);
            this.i = jvmType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.i;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.a;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.c;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.b;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.h;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.e;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.g;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.d;
        }
    }

    public static final class Object extends JvmType {

        @NotNull
        private final String i;

        public Object(@NotNull String str) {
            super(null);
            this.i = str;
        }

        @NotNull
        public final String getInternalName() {
            return this.i;
        }
    }

    public static final class Primitive extends JvmType {

        @Nullable
        private final JvmPrimitiveType i;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.i = jvmPrimitiveType;
        }

        @Nullable
        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.i;
        }
    }

    private JvmType() {
    }

    public /* synthetic */ JvmType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.a.toString(this);
    }
}
