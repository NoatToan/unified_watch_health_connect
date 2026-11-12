package com.mapbox.common.module.provider;

import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.annotation.MapboxAnnotationConstants;
import com.mapbox.annotation.module.MapboxModuleType;
import e23.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0004\u0012\u0015\u0018\u001b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider;", "", "<init>", "()V", "", "asGetterFun", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Lcom/mapbox/annotation/module/MapboxModuleType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "createModule", "(Lcom/mapbox/annotation/module/MapboxModuleType;Le23/l;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "com/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1", "noArgConstructorCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$noArgConstructorCreator$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1", "kotlinObjectReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$kotlinObjectReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1", "singletonReferenceProvider", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$singletonReferenceProvider$1;", "com/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1", "defaultMapboxModuleCreator", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$defaultMapboxModuleCreator$1;", "Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "instanceCreators", "[Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "ModuleInstanceProvider", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxModuleProvider {
    public static final MapboxModuleProvider INSTANCE = new MapboxModuleProvider();
    private static final String TAG = "MapboxModuleProvider";
    private static final MapboxModuleProvider$defaultMapboxModuleCreator$1 defaultMapboxModuleCreator;
    private static final ModuleInstanceProvider[] instanceCreators;
    private static final MapboxModuleProvider$kotlinObjectReferenceProvider$1 kotlinObjectReferenceProvider;
    private static final MapboxModuleProvider$noArgConstructorCreator$1 noArgConstructorCreator;
    private static final MapboxModuleProvider$singletonReferenceProvider$1 singletonReferenceProvider;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/mapbox/common/module/provider/MapboxModuleProvider$ModuleInstanceProvider;", "", "Ljava/lang/Class;", MapboxAnnotationConstants.MODULE_CONFIGURATION_DISABLED_CLASS, "Lcom/mapbox/annotation/module/MapboxModuleType;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lkotlin/Function1;", "", "Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "paramsProvider", "getInstance", "(Ljava/lang/Class;Lcom/mapbox/annotation/module/MapboxModuleType;Le23/l;)Ljava/lang/Object;", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ModuleInstanceProvider {
        Object getInstance(Class<?> implClass, MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1] */
    static {
        ?? r14 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$noArgConstructorCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) throws NoSuchMethodException {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                Constructor<?> constructor = implClass.getConstructor(null);
                constructor.getClass();
                return constructor.newInstance(null);
            }
        };
        noArgConstructorCreator = r14;
        ?? r15 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$kotlinObjectReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                return implClass.getField("INSTANCE").get(null);
            }
        };
        kotlinObjectReferenceProvider = r15;
        ?? r16 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$singletonReferenceProvider$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                return implClass.getMethod("getInstance", null).invoke(null, null);
            }
        };
        singletonReferenceProvider = r16;
        ?? r17 = new ModuleInstanceProvider() { // from class: com.mapbox.common.module.provider.MapboxModuleProvider$defaultMapboxModuleCreator$1
            @Override // com.mapbox.common.module.provider.MapboxModuleProvider.ModuleInstanceProvider
            public Object getInstance(Class<?> implClass, MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) throws NoSuchMethodException {
                implClass.getClass();
                type.getClass();
                paramsProvider.getClass();
                ModuleProviderArgument[] moduleProviderArgumentArrInvoke = paramsProvider.invoke(type);
                ArrayList arrayList = new ArrayList(moduleProviderArgumentArrInvoke.length);
                for (ModuleProviderArgument moduleProviderArgument : moduleProviderArgumentArrInvoke) {
                    arrayList.add(moduleProviderArgument.getExpectedArgumentClass());
                }
                Object[] array = arrayList.toArray(new Class[0]);
                array.getClass();
                Class[] clsArr = (Class[]) array;
                Constructor<?> constructor = implClass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                constructor.getClass();
                ArrayList arrayList2 = new ArrayList(moduleProviderArgumentArrInvoke.length);
                for (ModuleProviderArgument moduleProviderArgument2 : moduleProviderArgumentArrInvoke) {
                    arrayList2.add(moduleProviderArgument2.getArgumentInstance());
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                array2.getClass();
                return constructor.newInstance(Arrays.copyOf(array2, array2.length));
            }
        };
        defaultMapboxModuleCreator = r17;
        instanceCreators = new ModuleInstanceProvider[]{r14, r15, r16, r17};
    }

    private MapboxModuleProvider() {
    }

    private final String asGetterFun(String str) {
        return "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public final <T> T createModule(MapboxModuleType type, l<? super MapboxModuleType, ModuleProviderArgument[]> paramsProvider) throws Exception {
        type.getClass();
        paramsProvider.getClass();
        try {
            x0 x0Var = x0.f105818a;
            Class<?> cls = Class.forName("com.mapbox.module.".concat(String.format(MapboxAnnotationConstants.MODULE_CONFIGURATION_CLASS_NAME_FORMAT, Arrays.copyOf(new Object[]{type.getSimplifiedName()}, 1))));
            T t7 = null;
            Object objInvoke = cls.getMethod(asGetterFun(MapboxAnnotationConstants.MODULE_CONFIGURATION_ENABLE_CONFIGURATION), null).invoke(null, null);
            objInvoke.getClass();
            if (((Boolean) objInvoke).booleanValue()) {
                Field declaredField = cls.getDeclaredField(MapboxAnnotationConstants.MODULE_CONFIGURATION_PROVIDER_VARIABLE_NAME);
                declaredField.getClass();
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                if (obj == null) {
                    throw new MapboxInvalidModuleException(type);
                }
                Class<?> type2 = declaredField.getType();
                type2.getClass();
                Method declaredMethod = type2.getDeclaredMethod(String.format(MapboxAnnotationConstants.MODULE_CONFIGURATION_PROVIDER_METHOD_FORMAT, Arrays.copyOf(new Object[]{type.getSimplifiedName()}, 1)), null);
                declaredMethod.getClass();
                T t14 = (T) declaredMethod.invoke(obj, null);
                t14.getClass();
                return t14;
            }
            Object objInvoke2 = cls.getMethod(asGetterFun(MapboxAnnotationConstants.MODULE_CONFIGURATION_DISABLED_CLASS), null).invoke(null, null);
            objInvoke2.getClass();
            Class<?> cls2 = (Class) objInvoke2;
            ArrayList<Throwable> arrayList = new ArrayList();
            for (ModuleInstanceProvider moduleInstanceProvider : instanceCreators) {
                try {
                    t7 = (T) moduleInstanceProvider.getInstance(cls2, type, paramsProvider);
                } catch (Exception e4) {
                    if (e4 instanceof MapboxInvalidModuleException) {
                        throw e4;
                    }
                    arrayList.add(e4);
                }
                if (t7 != null) {
                    break;
                }
            }
            if (t7 == null) {
                for (Throwable th3 : arrayList) {
                }
            }
            if (t7 != null) {
                return t7;
            }
            throw new MapboxInvalidModuleException(type);
        } catch (Exception e14) {
            if (e14 instanceof MapboxInvalidModuleException) {
                throw e14;
            }
            e14.printStackTrace();
            throw new MapboxInvalidModuleException(type);
        }
    }
}
