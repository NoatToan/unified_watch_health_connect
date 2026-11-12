package cn.hutool.core.convert.impl;

import cn.hutool.core.convert.AbstractConverter;
import cn.hutool.core.convert.ConverterRegistry;
import defpackage.i5q;
import defpackage.rh2;
import defpackage.tt3;
import defpackage.v4f;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MapConverter extends AbstractConverter<Map<?, ?>> {
    private static final long serialVersionUID = 1;
    private final Type keyType;
    private final Type mapType;
    private final Type valueType;

    public MapConverter(Type type) {
        this(type, i5q.o(type, 0), i5q.o(type, 1));
    }

    private void convertMapToMap(Map<?, ?> map, Map<Object, Object> map2) {
        ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            map2.put(i5q.r(this.keyType) ? entry.getKey() : converterRegistry.convert(this.keyType, entry.getKey()), i5q.r(this.valueType) ? entry.getValue() : converterRegistry.convert(this.valueType, entry.getValue()));
        }
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Class<Map<?, ?>> getTargetType() {
        return i5q.e(this.mapType);
    }

    public MapConverter(Type type, Type type2, Type type3) {
        this.mapType = type;
        this.keyType = type2;
        this.valueType = type3;
    }

    @Override // cn.hutool.core.convert.AbstractConverter
    public Map<?, ?> convertInternal(Object obj) {
        if (!(obj instanceof Map)) {
            if (rh2.t(obj.getClass())) {
                return convertInternal((Object) rh2.e(obj));
            }
            throw new UnsupportedOperationException(tt3.y("Unsupport toMap value type: {}", obj.getClass().getName()));
        }
        Type[] typeArrP = i5q.p(obj.getClass());
        if (typeArrP != null && 2 == typeArrP.length && Objects.equals(this.keyType, typeArrP[0]) && Objects.equals(this.valueType, typeArrP[1])) {
            return (Map) obj;
        }
        Map<?, ?> mapF = v4f.f(i5q.e(this.mapType));
        convertMapToMap((Map) obj, mapF);
        return mapF;
    }
}
