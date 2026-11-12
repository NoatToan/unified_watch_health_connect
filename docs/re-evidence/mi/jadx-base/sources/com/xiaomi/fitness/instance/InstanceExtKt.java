package com.xiaomi.fitness.instance;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\b0\t¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u000b\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\f¢\u0006\u0002\u0010\r\"&\u0010\u0000\u001a\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"instanceMap", "", "Ljava/lang/Class;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "getInstanceMap", "()Ljava/util/Map;", "getInstance", "T", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "instance", "", "(Ljava/lang/String;)Ljava/lang/Object;", "instance_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InstanceExtKt {

    @NotNull
    private static final Map<Class<?>, Object> instanceMap = ((InstancePoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), InstancePoint.class)).getInstanceMap();

    @Nullable
    public static final <T> T getInstance(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return (T) instanceMap.get(JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    @NotNull
    public static final Map<Class<?>, Object> getInstanceMap() {
        return instanceMap;
    }

    public static final <T> T instance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (T) Class.forName(str).newInstance();
    }
}
