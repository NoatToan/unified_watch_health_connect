package com.google.gson.internal.bind;

import am.j;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import fb1.c;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r1.q2;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final FieldNamingStrategy fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final List<ReflectionAccessFilter> reflectionFilters;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        private final FieldsData fieldsData;

        public Adapter(FieldsData fieldsData) {
            this.fieldsData = fieldsData;
        }

        public abstract A createAccumulator();

        public abstract T finalize(A a14);

        @Override // com.google.gson.TypeAdapter
        /* JADX INFO: renamed from: read */
        public T read2(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A aCreateAccumulator = createAccumulator();
            Map<String, BoundField> map = this.fieldsData.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    BoundField boundField = map.get(jsonReader.nextName());
                    if (boundField == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(aCreateAccumulator, jsonReader, boundField);
                    }
                }
                jsonReader.endObject();
                return finalize(aCreateAccumulator);
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            } catch (IllegalStateException e14) {
                throw new JsonSyntaxException(e14);
            }
        }

        public abstract void readField(A a14, JsonReader jsonReader, BoundField boundField);

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t7) {
            if (t7 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<BoundField> it = this.fieldsData.serializedFields.iterator();
                while (it.hasNext()) {
                    it.next().write(jsonWriter, t7);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            }
        }
    }

    public static abstract class BoundField {
        final Field field;
        final String fieldName;
        final String serializedName;

        public BoundField(String str, Field field) {
            this.serializedName = str;
            this.field = field;
            this.fieldName = field.getName();
        }

        public abstract void readIntoArray(JsonReader jsonReader, int i14, Object[] objArr);

        public abstract void readIntoField(JsonReader jsonReader, Object obj);

        public abstract void write(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final ObjectConstructor<T> constructor;

        public FieldReflectionAdapter(ObjectConstructor<T> objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.constructor = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T t7) {
            return t7;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T t7, JsonReader jsonReader, BoundField boundField) {
            boundField.readIntoField(jsonReader, t7);
        }
    }

    public static class FieldsData {
        public static final FieldsData EMPTY = new FieldsData(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        public final Map<String, BoundField> deserializedFields;
        public final List<BoundField> serializedFields;

        public FieldsData(Map<String, BoundField> map, List<BoundField> list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        static final Map<Class<?>, Object> PRIMITIVE_DEFAULTS = primitiveDefaults();
        private final Map<String, Integer> componentIndices;
        private final Constructor<T> constructor;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class<T> cls, FieldsData fieldsData, boolean z14) {
            super(fieldsData);
            this.componentIndices = new HashMap();
            Constructor<T> canonicalRecordConstructor = ReflectionHelper.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            if (z14) {
                ReflectiveTypeAdapterFactory.checkAccessible(null, canonicalRecordConstructor);
            } else {
                ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            }
            String[] recordComponentNames = ReflectionHelper.getRecordComponentNames(cls);
            for (int i14 = 0; i14 < recordComponentNames.length; i14++) {
                this.componentIndices.put(recordComponentNames[i14], Integer.valueOf(i14));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i15 = 0; i15 < parameterTypes.length; i15++) {
                this.constructorArgsDefaults[i15] = PRIMITIVE_DEFAULTS.get(parameterTypes[i15]);
            }
        }

        private static Map<Class<?>, Object> primitiveDefaults() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object[] createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(Object[] objArr) {
            try {
                return this.constructor.newInstance(objArr);
            } catch (IllegalAccessException e4) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e4);
            } catch (IllegalArgumentException e14) {
                e = e14;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e15) {
                e = e15;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e16) {
                q2.v("Failed to invoke constructor '" + ReflectionHelper.constructorToString(this.constructor) + "' with args " + Arrays.toString(objArr), e16.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(Object[] objArr, JsonReader jsonReader, BoundField boundField) {
            Integer num = this.componentIndices.get(boundField.fieldName);
            if (num != null) {
                boundField.readIntoArray(jsonReader, num.intValue(), objArr);
                return;
            }
            StringBuilder sb3 = new StringBuilder("Could not find the index in the constructor '");
            sb3.append(ReflectionHelper.constructorToString(this.constructor));
            sb3.append("' for field with name '");
            h.z(j.o(boundField.fieldName, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.", sb3));
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.constructorConstructor = constructorConstructor;
        this.fieldNamingPolicy = fieldNamingStrategy;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        this.reflectionFilters = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void checkAccessible(Object obj, M m14) {
        if (Modifier.isStatic(m14.getModifiers())) {
            obj = null;
        }
        if (!ReflectionAccessFilterHelper.canAccess(m14, obj)) {
            throw new JsonIOException(k.g(ReflectionHelper.getAccessibleObjectDescription(m14, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    private BoundField createBoundField(Gson gson, Field field, final Method method, String str, TypeToken<?> typeToken, boolean z14, final boolean z15) {
        final TypeAdapter<?> typeAdapterRuntimeTypeWrapper;
        final boolean zIsPrimitive = Primitives.isPrimitive(typeToken.getRawType());
        int modifiers = field.getModifiers();
        final boolean z16 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z16 = true;
        }
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        TypeAdapter<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson, typeToken, jsonAdapter, false) : null;
        boolean z17 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = gson.getAdapter(typeToken);
        }
        final TypeAdapter<?> typeAdapter2 = typeAdapter;
        if (z14) {
            typeAdapterRuntimeTypeWrapper = z17 ? typeAdapter2 : new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapter2, typeToken.getType());
        } else {
            typeAdapterRuntimeTypeWrapper = typeAdapter2;
        }
        return new BoundField(str, field) { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.2
            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoArray(JsonReader jsonReader, int i14, Object[] objArr) {
                Object obj = typeAdapter2.read2(jsonReader);
                if (obj != null || !zIsPrimitive) {
                    objArr[i14] = obj;
                    return;
                }
                throw new JsonParseException("null is not allowed as value for record component '" + this.fieldName + "' of primitive type; at path " + jsonReader.getPath());
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void readIntoField(JsonReader jsonReader, Object obj) throws IllegalAccessException {
                Object obj2 = typeAdapter2.read2(jsonReader);
                if (obj2 == null && zIsPrimitive) {
                    return;
                }
                if (z15) {
                    ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                } else if (z16) {
                    throw new JsonIOException(c.n("Cannot set value of 'static final' ", ReflectionHelper.getAccessibleObjectDescription(this.field, false)));
                }
                this.field.set(obj, obj2);
            }

            @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
            public void write(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
                Object objInvoke;
                if (z15) {
                    Method method2 = method;
                    if (method2 == null) {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, this.field);
                    } else {
                        ReflectiveTypeAdapterFactory.checkAccessible(obj, method2);
                    }
                }
                Method method3 = method;
                if (method3 != null) {
                    try {
                        objInvoke = method3.invoke(obj, null);
                    } catch (InvocationTargetException e4) {
                        throw new JsonIOException(j.m("Accessor ", ReflectionHelper.getAccessibleObjectDescription(method, false), " threw exception"), e4.getCause());
                    }
                } else {
                    objInvoke = this.field.get(obj);
                }
                if (objInvoke == obj) {
                    return;
                }
                jsonWriter.name(this.serializedName);
                typeAdapterRuntimeTypeWrapper.write(jsonWriter, objInvoke);
            }
        };
    }

    private static IllegalArgumentException createDuplicateFieldException(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + TroubleshootingGuide.createUrl("duplicate-fields"));
    }

    private FieldsData getBoundFields(Gson gson, TypeToken<?> typeToken, Class<?> cls, boolean z14, boolean z15) {
        boolean z16;
        TypeToken<?> typeToken2;
        boolean z17;
        int i14;
        int i15;
        BoundField boundField;
        if (cls.isInterface()) {
            return FieldsData.EMPTY;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken<?> typeToken3 = typeToken;
        boolean z18 = z14;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            boolean z19 = true;
            boolean z24 = false;
            if (rawType != cls && declaredFields.length > 0) {
                ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
                if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z18 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            }
            boolean z25 = z18;
            int length = declaredFields.length;
            int i16 = 0;
            while (i16 < length) {
                int i17 = i16;
                Field field = declaredFields[i17];
                boolean zIncludeField = this.includeField(field, z19);
                boolean zIncludeField2 = this.includeField(field, z24);
                if (zIncludeField || zIncludeField2) {
                    Method accessor = null;
                    if (!z15) {
                        z16 = zIncludeField2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z16 = z24;
                    } else {
                        accessor = ReflectionHelper.getAccessor(rawType, field);
                        if (!z25) {
                            ReflectionHelper.makeAccessible(accessor);
                        }
                        if (accessor.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                            throw new JsonIOException(j.m("@SerializedName on ", ReflectionHelper.getAccessibleObjectDescription(accessor, z24), " is not supported"));
                        }
                        z16 = zIncludeField2;
                    }
                    if (!z25 && accessor == null) {
                        ReflectionHelper.makeAccessible(field);
                    }
                    Type typeResolve = GsonTypes.resolve(typeToken3.getType(), rawType, field.getGenericType());
                    List<String> fieldNames = this.getFieldNames(field);
                    typeToken2 = typeToken3;
                    z17 = false;
                    String str = fieldNames.get(0);
                    i14 = i17;
                    i15 = length;
                    BoundField boundFieldCreateBoundField = this.createBoundField(gson, field, accessor, str, TypeToken.get(typeResolve), zIncludeField, z25);
                    if (z16) {
                        for (String str2 : fieldNames) {
                            BoundField boundField2 = (BoundField) linkedHashMap.put(str2, boundFieldCreateBoundField);
                            if (boundField2 != null) {
                                throw createDuplicateFieldException(cls, str2, boundField2.field, field);
                            }
                        }
                    }
                    if (zIncludeField && (boundField = (BoundField) linkedHashMap2.put(str, boundFieldCreateBoundField)) != null) {
                        throw createDuplicateFieldException(cls, str, boundField.field, field);
                    }
                } else {
                    i15 = length;
                    i14 = i17;
                    typeToken2 = typeToken3;
                    z17 = z24;
                }
                i16 = i14 + 1;
                this = this;
                z24 = z17;
                typeToken3 = typeToken2;
                length = i15;
                z19 = true;
            }
            typeToken3 = TypeToken.get(GsonTypes.resolve(typeToken3.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = typeToken3.getRawType();
            z18 = z25;
        }
        return new FieldsData(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    private List<String> getFieldNames(Field field) {
        String strTranslateName;
        List<String> listAlternateNames;
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            strTranslateName = this.fieldNamingPolicy.translateName(field);
            listAlternateNames = this.fieldNamingPolicy.alternateNames(field);
        } else {
            String strValue = serializedName.value();
            List<String> listAsList = Arrays.asList(serializedName.alternate());
            strTranslateName = strValue;
            listAlternateNames = listAsList;
        }
        if (listAlternateNames.isEmpty()) {
            return Collections.singletonList(strTranslateName);
        }
        ArrayList arrayList = new ArrayList(listAlternateNames.size() + 1);
        arrayList.add(strTranslateName);
        arrayList.addAll(listAlternateNames);
        return arrayList;
    }

    private boolean includeField(Field field, boolean z14) {
        return !this.excluder.excludeField(field, z14);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (ReflectionHelper.isAnonymousOrNonStaticLocal(rawType)) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                /* JADX INFO: renamed from: read */
                public T read2(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t7) {
                    jsonWriter.nullValue();
                }
            };
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        if (filterResult == ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            throw new JsonIOException(androidx.core.view.j.i(rawType, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z14 = filterResult == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
        return ReflectionHelper.isRecord(rawType) ? new RecordAdapter(rawType, getBoundFields(gson, typeToken, rawType, z14, true), z14) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken, true), getBoundFields(gson, typeToken, rawType, z14, false));
    }
}
