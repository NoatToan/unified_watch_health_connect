package com.facebook.react.bridge;

import defpackage.pyo;
import defpackage.v07;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class JavaModuleWrapper {
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @v07
    public class MethodDescriptor {

        @v07
        Method method;

        @v07
        String name;

        @v07
        String signature;

        @v07
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @v07
    private void findMethods() {
        com.facebook.systrace.Systrace.c(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (hashSet.contains(name)) {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
                MethodDescriptor methodDescriptor = new MethodDescriptor();
                JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                methodDescriptor.name = name;
                String type = javaMethodWrapper.getType();
                methodDescriptor.type = type;
                if (type == BaseJavaModule.METHOD_TYPE_SYNC) {
                    methodDescriptor.signature = javaMethodWrapper.getSignature();
                    methodDescriptor.method = method;
                }
                this.mMethods.add(javaMethodWrapper);
                this.mDescs.add(methodDescriptor);
            }
        }
        com.facebook.systrace.Systrace.g(0L);
    }

    @v07
    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        pyo.a(0L, "JavaModuleWrapper.getConstants").b("moduleName", name).c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        com.facebook.systrace.Systrace.c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        com.facebook.systrace.Systrace.g(0L);
        com.facebook.systrace.Systrace.c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            com.facebook.systrace.Systrace.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            pyo.b(0L).c();
        }
    }

    @v07
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @v07
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @v07
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @v07
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList == null || i >= arrayList.size()) {
            return;
        }
        this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
    }
}
