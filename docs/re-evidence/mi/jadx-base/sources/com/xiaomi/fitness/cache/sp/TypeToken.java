package com.xiaomi.fitness.cache.sp;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/TypeToken;", "T", "", "<init>", "()V", "superclass", "Ljava/lang/reflect/ParameterizedType;", "type", "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "ParameterizedTypeImpl", "GenericArrayTypeImpl", "WildcardTypeImpl", "Companion", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class TypeToken<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    @NotNull
    private final ParameterizedType superclass;

    @NotNull
    private final Type type;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0001\u0010\u00142\b\u0010\u0015\u001a\u0004\u0018\u0001H\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/TypeToken$Companion;", "", "<init>", "()V", "EMPTY_TYPE_ARRAY", "", "Ljava/lang/reflect/Type;", "getEMPTY_TYPE_ARRAY$cache_release", "()[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", "canonicalize", "type", "canonicalize$cache_release", "typeToString", "", "typeToString$cache_release", "checkNotPrimitive", "", "checkNotPrimitive$cache_release", "checkNotNull", "T", "obj", "checkNotNull$cache_release", "(Ljava/lang/Object;)Ljava/lang/Object;", "checkArgument", "condition", "", "checkArgument$cache_release", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Type canonicalize$cache_release(@NotNull Type type) {
            Type wildcardTypeImpl;
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (!cls.isArray()) {
                    return type;
                }
                Class<?> componentType = cls.getComponentType();
                Intrinsics.checkNotNull(componentType);
                return new GenericArrayTypeImpl(canonicalize$cache_release(componentType));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type ownerType = parameterizedType.getOwnerType();
                Type rawType = parameterizedType.getRawType();
                Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                wildcardTypeImpl = new ParameterizedTypeImpl(ownerType, rawType, (Type[]) Arrays.copyOf(actualTypeArguments, actualTypeArguments.length));
            } else if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
                wildcardTypeImpl = new GenericArrayTypeImpl(genericComponentType);
            } else {
                if (!(type instanceof WildcardType)) {
                    return type;
                }
                WildcardType wildcardType = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
                wildcardTypeImpl = new WildcardTypeImpl(upperBounds, lowerBounds);
            }
            return wildcardTypeImpl;
        }

        public final void checkArgument$cache_release(boolean condition) {
            if (!condition) {
                throw new IllegalArgumentException();
            }
        }

        public final <T> T checkNotNull$cache_release(@Nullable T obj) {
            obj.getClass();
            return obj;
        }

        public final void checkNotPrimitive$cache_release(@NotNull Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            checkArgument$cache_release(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
        }

        @NotNull
        public final Type[] getEMPTY_TYPE_ARRAY$cache_release() {
            return TypeToken.EMPTY_TYPE_ARRAY;
        }

        @NotNull
        public final String typeToString$cache_release(@NotNull Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (!(type instanceof Class)) {
                return type.toString();
            }
            String name = ((Class) type).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/TypeToken$GenericArrayTypeImpl;", "Ljava/lang/reflect/GenericArrayType;", "Ljava/io/Serializable;", "componentType", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;)V", "getGenericComponentType", "toString", "", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        @NotNull
        private final Type componentType;

        public GenericArrayTypeImpl(@NotNull Type componentType) {
            Intrinsics.checkNotNullParameter(componentType, "componentType");
            this.componentType = TypeToken.INSTANCE.canonicalize$cache_release(componentType);
        }

        @Override // java.lang.reflect.GenericArrayType
        @NotNull
        public Type getGenericComponentType() {
            return this.componentType;
        }

        @NotNull
        public String toString() {
            return TypeToken.INSTANCE.typeToString$cache_release(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0007\"\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0004H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/TypeToken$ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Ljava/io/Serializable;", "ownerType", "Ljava/lang/reflect/Type;", "rawType", "typeArguments", "", "<init>", "(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V", "", "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getRawType", "getOwnerType", "toString", "", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTypeToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeToken.kt\ncom/xiaomi/fitness/cache/sp/TypeToken$ParameterizedTypeImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,129:1\n11158#2:130\n11493#2,3:131\n37#3:134\n36#3,3:135\n*S KotlinDebug\n*F\n+ 1 TypeToken.kt\ncom/xiaomi/fitness/cache/sp/TypeToken$ParameterizedTypeImpl\n*L\n29#1:130\n29#1:131,3\n32#1:134\n32#1:135,3\n*E\n"})
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        @Nullable
        private final Type ownerType;

        @NotNull
        private final Type rawType;

        @NotNull
        private final List<Type> typeArguments;

        public ParameterizedTypeImpl(@Nullable Type type, @NotNull Type rawType, @NotNull Type... typeArguments) {
            Intrinsics.checkNotNullParameter(rawType, "rawType");
            Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                Companion companion = TypeToken.INSTANCE;
                if (type == null && !z2) {
                    z = false;
                }
                companion.checkArgument$cache_release(z);
            }
            this.ownerType = type == null ? null : TypeToken.INSTANCE.canonicalize$cache_release(type);
            this.rawType = TypeToken.INSTANCE.canonicalize$cache_release(rawType);
            ArrayList arrayList = new ArrayList(typeArguments.length);
            for (Type type2 : typeArguments) {
                arrayList.add(TypeToken.INSTANCE.canonicalize$cache_release(type2));
            }
            this.typeArguments = arrayList;
        }

        @Override // java.lang.reflect.ParameterizedType
        @NotNull
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.toArray(new Type[0]);
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        @NotNull
        public Type getRawType() {
            return this.rawType;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder((this.typeArguments.size() + 1) * 30);
            Companion companion = TypeToken.INSTANCE;
            sb.append(companion.typeToString$cache_release(this.rawType));
            if (this.typeArguments.isEmpty()) {
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            sb.append("<");
            sb.append(companion.typeToString$cache_release(this.typeArguments.get(0)));
            int size = this.typeArguments.size();
            for (int i = 1; i < size; i++) {
                sb.append(", ");
                sb.append(TypeToken.INSTANCE.typeToString$cache_release(this.typeArguments.get(i)));
            }
            sb.append(">");
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/cache/sp/TypeToken$WildcardTypeImpl;", "Ljava/lang/reflect/WildcardType;", "Ljava/io/Serializable;", "upperBounds", "", "Ljava/lang/reflect/Type;", "lowerBounds", "<init>", "([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V", "upperBound", "lowerBound", "getUpperBounds", "()[Ljava/lang/reflect/Type;", "getLowerBounds", "toString", "", "cache_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WildcardTypeImpl implements WildcardType, Serializable {

        @Nullable
        private final Type lowerBound;

        @NotNull
        private final Type upperBound;

        public WildcardTypeImpl(@NotNull Type[] upperBounds, @NotNull Type[] lowerBounds) {
            Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
            Intrinsics.checkNotNullParameter(lowerBounds, "lowerBounds");
            Companion companion = TypeToken.INSTANCE;
            companion.checkArgument$cache_release(lowerBounds.length <= 1);
            companion.checkArgument$cache_release(upperBounds.length == 1);
            if (lowerBounds.length != 1) {
                companion.checkNotNull$cache_release(upperBounds[0]);
                companion.checkNotPrimitive$cache_release(upperBounds[0]);
                this.lowerBound = null;
                this.upperBound = companion.canonicalize$cache_release(upperBounds[0]);
                return;
            }
            companion.checkNotNull$cache_release(lowerBounds[0]);
            companion.checkNotPrimitive$cache_release(lowerBounds[0]);
            companion.checkArgument$cache_release(upperBounds[0] == Object.class);
            this.lowerBound = companion.canonicalize$cache_release(lowerBounds[0]);
            this.upperBound = Object.class;
        }

        @Override // java.lang.reflect.WildcardType
        @NotNull
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : TypeToken.INSTANCE.getEMPTY_TYPE_ARRAY$cache_release();
        }

        @Override // java.lang.reflect.WildcardType
        @NotNull
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        @NotNull
        public String toString() {
            Type type = this.lowerBound;
            if (type != null) {
                return "? super " + TypeToken.INSTANCE.typeToString$cache_release(type);
            }
            Type type2 = this.upperBound;
            if (type2 == Object.class) {
                return "?";
            }
            return "? extends " + TypeToken.INSTANCE.typeToString$cache_release(type2);
        }
    }

    public TypeToken() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Intrinsics.checkNotNull(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        this.superclass = parameterizedType;
        Companion companion = INSTANCE;
        Type type = parameterizedType.getActualTypeArguments()[0];
        Intrinsics.checkNotNullExpressionValue(type, "get(...)");
        this.type = companion.canonicalize$cache_release(type);
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }
}
