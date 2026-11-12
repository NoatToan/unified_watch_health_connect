package defpackage;

import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class ahx implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Enum<?>> f440a;
    private final Enum<?>[] d;
    private final SerializableString[] e;

    private ahx(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        this.f440a = cls;
        this.d = cls.getEnumConstants();
        this.e = serializableStringArr;
    }

    public static ahx b(MapperConfig<?> mapperConfig, Class<Enum<?>> cls) {
        Class<? extends Enum<?>> clsE = ahw.e((Class<?>) cls);
        Enum<?>[] enumArr = (Enum[]) clsE.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class " + cls.getName());
        }
        String[] strArrFindEnumValues = mapperConfig.getAnnotationIntrospector().findEnumValues(clsE, enumArr, new String[enumArr.length]);
        SerializableString[] serializableStringArr = new SerializableString[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum<?> r5 = enumArr[i];
            String strName = strArrFindEnumValues[i];
            if (strName == null) {
                strName = r5.name();
            }
            serializableStringArr[r5.ordinal()] = mapperConfig.compileString(strName);
        }
        return e(cls, serializableStringArr);
    }

    public static ahx e(Class<Enum<?>> cls, SerializableString[] serializableStringArr) {
        return new ahx(cls, serializableStringArr);
    }

    public SerializableString b(Enum<?> r2) {
        return this.e[r2.ordinal()];
    }

    public Collection<SerializableString> a() {
        return Arrays.asList(this.e);
    }

    public List<Enum<?>> d() {
        return Arrays.asList(this.d);
    }

    public Class<Enum<?>> b() {
        return this.f440a;
    }
}
