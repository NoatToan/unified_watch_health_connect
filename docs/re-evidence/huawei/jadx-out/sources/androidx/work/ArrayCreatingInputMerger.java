package androidx.work;

import defpackage.zcp;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016¨\u0006\u0011"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "()V", "concatenateArrayAndNonArray", "", "array", "obj", "valueClass", "Ljava/lang/Class;", "concatenateArrays", "array1", "array2", "createArrayFor", "merge", "Landroidx/work/Data;", "inputs", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ArrayCreatingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> inputs) throws Throwable {
        Class<?> cls;
        zcp.c(inputs, "");
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> keyValueMap = it.next().getKeyValueMap();
            zcp.b((Object) keyValueMap, "");
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (cls = value.getClass()) == null) {
                    cls = String.class;
                }
                Object obj = map.get(key);
                zcp.b((Object) key, "");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = createArrayFor(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (zcp.b(cls2, cls)) {
                        zcp.b(value, "");
                        value = concatenateArrays(obj, value);
                    } else if (zcp.b(cls2.getComponentType(), cls)) {
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                zcp.b(value, "");
                map.put(key, value);
            }
        }
        builder.putAll(map);
        Data dataBuild = builder.build();
        zcp.b((Object) dataBuild, "");
        return dataBuild;
    }

    private final Object concatenateArrays(Object array1, Object array2) {
        int length = Array.getLength(array1);
        int length2 = Array.getLength(array2);
        Class<?> componentType = array1.getClass().getComponentType();
        zcp.e(componentType);
        Object objNewInstance = Array.newInstance(componentType, length + length2);
        System.arraycopy(array1, 0, objNewInstance, 0, length);
        System.arraycopy(array2, 0, objNewInstance, length, length2);
        zcp.b(objNewInstance, "");
        return objNewInstance;
    }

    private final Object concatenateArrayAndNonArray(Object array, Object obj, Class<?> valueClass) {
        int length = Array.getLength(array);
        Object objNewInstance = Array.newInstance(valueClass, length + 1);
        System.arraycopy(array, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj);
        zcp.b(objNewInstance, "");
        return objNewInstance;
    }

    private final Object createArrayFor(Object obj, Class<?> valueClass) {
        Object objNewInstance = Array.newInstance(valueClass, 1);
        Array.set(objNewInstance, 0, obj);
        zcp.b(objNewInstance, "");
        return objNewInstance;
    }
}
