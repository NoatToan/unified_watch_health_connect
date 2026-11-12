package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.alipay.sdk.m.u.i;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @VisibleForTesting
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zai CREATOR = new zai();

        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int a;

        @Nullable
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        private final String b;
        private zaj c;

        @Nullable
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private FieldConverter<I, O> d;

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        public final int zaa;

        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        public final boolean zab;

        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        public final int zac;

        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        public final boolean zad;

        @RecentlyNonNull
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        public final String zae;

        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        public final int zaf;

        @RecentlyNullable
        public final Class<? extends FastJsonResponse> zag;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i4, @Nullable @SafeParcelable.Param(id = 8) String str2, @Nullable @SafeParcelable.Param(id = 9) zab zabVar) {
            this.a = i;
            this.zaa = i2;
            this.zab = z;
            this.zac = i3;
            this.zad = z2;
            this.zae = str;
            this.zaf = i4;
            if (str2 == null) {
                this.zag = null;
                this.b = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.b = str2;
            }
            if (zabVar == null) {
                this.d = null;
            } else {
                this.d = (FieldConverter<I, O>) zabVar.zaa();
            }
        }

        @Nullable
        private final String b() {
            String str = this.b;
            if (str == null) {
                return null;
            }
            return str;
        }

        @Nullable
        private final zab c() {
            FieldConverter<I, O> fieldConverter = this.d;
            if (fieldConverter == null) {
                return null;
            }
            return zab.zaa(fieldConverter);
        }

        @RecentlyNonNull
        @VisibleForTesting
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@RecentlyNonNull String str, int i) {
            return new Field<>(8, false, 8, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@RecentlyNonNull String str, int i) {
            return new Field<>(6, false, 6, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@RecentlyNonNull String str, int i, @RecentlyNonNull Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i, cls, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@RecentlyNonNull String str, int i, @RecentlyNonNull Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i, cls, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<Double, Double> forDouble(@RecentlyNonNull String str, int i) {
            return new Field<>(4, false, 4, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<Float, Float> forFloat(@RecentlyNonNull String str, int i) {
            return new Field<>(3, false, 3, false, str, i, null, null);
        }

        @RecentlyNonNull
        @VisibleForTesting
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@RecentlyNonNull String str, int i) {
            return new Field<>(0, false, 0, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<Long, Long> forLong(@RecentlyNonNull String str, int i) {
            return new Field<>(2, false, 2, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<String, String> forString(@RecentlyNonNull String str, int i) {
            return new Field<>(7, false, 7, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@RecentlyNonNull String str, int i) {
            return new Field<>(10, false, 10, false, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@RecentlyNonNull String str, int i) {
            return new Field<>(7, true, 7, true, str, i, null, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public static Field withConverter(@RecentlyNonNull String str, int i, @RecentlyNonNull FieldConverter<?, ?> fieldConverter, boolean z) {
            return new Field(fieldConverter.zaa(), z, fieldConverter.zab(), false, str, i, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @RecentlyNonNull
        public String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.a)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", b());
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.d;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, this.a);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, b(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, c(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        @RecentlyNonNull
        public final Field<I, O> zaa() {
            return new Field<>(this.a, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.b, c());
        }

        public final boolean zab() {
            return this.d != null;
        }

        @RecentlyNonNull
        public final FastJsonResponse zac() throws IllegalAccessException, InstantiationException {
            Preconditions.checkNotNull(this.zag);
            Class<? extends FastJsonResponse> cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return cls.newInstance();
            }
            Preconditions.checkNotNull(this.b);
            Preconditions.checkNotNull(this.c, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.c, this.b);
        }

        @RecentlyNonNull
        public final Map<String, Field<?, ?>> zad() {
            Preconditions.checkNotNull(this.b);
            Preconditions.checkNotNull(this.c);
            return (Map) Preconditions.checkNotNull(this.c.zaa(this.b));
        }

        @RecentlyNonNull
        public final I zab(@RecentlyNonNull O o) {
            Preconditions.checkNotNull(this.d);
            return this.d.zaa(o);
        }

        public final void zaa(zaj zajVar) {
            this.c = zajVar;
        }

        @RecentlyNonNull
        public final O zaa(@Nullable I i) {
            Preconditions.checkNotNull(this.d);
            return (O) Preconditions.checkNotNull(this.d.zab(i));
        }

        private Field(int i, boolean z, int i2, boolean z2, String str, int i3, @Nullable Class<? extends FastJsonResponse> cls, @Nullable FieldConverter<I, O> fieldConverter) {
            this.a = 1;
            this.zaa = i;
            this.zab = z;
            this.zac = i2;
            this.zad = z2;
            this.zae = str;
            this.zaf = i3;
            this.zag = cls;
            if (cls == null) {
                this.b = null;
            } else {
                this.b = cls.getCanonicalName();
            }
            this.d = fieldConverter;
        }
    }

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        @RecentlyNonNull
        I zaa(@RecentlyNonNull O o);

        int zab();

        @RecentlyNullable
        O zab(@RecentlyNonNull I i);
    }

    private static <O> void a(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58);
            sb.append("Output field (");
            sb.append(str);
            sb.append(") has a null value, but expected a primitive");
            Log.e("FastJsonResponse", sb.toString());
        }
    }

    private static void b(StringBuilder sb, Field field, Object obj) {
        int i = field.zaa;
        if (i == 11) {
            Class<? extends FastJsonResponse> cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(cls.cast(obj).toString());
        } else {
            if (i != 7) {
                sb.append(obj);
                return;
            }
            sb.append("\"");
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append("\"");
        }
    }

    private final <I, O> void c(Field<I, O> field, @Nullable I i) {
        String str = field.zae;
        O oZaa = field.zaa(i);
        switch (field.zac) {
            case 0:
                if (oZaa != null) {
                    setIntegerInternal(field, str, ((Integer) oZaa).intValue());
                    return;
                } else {
                    a(str);
                    return;
                }
            case 1:
                zaa((Field<?, ?>) field, str, (BigInteger) oZaa);
                return;
            case 2:
                if (oZaa != null) {
                    setLongInternal(field, str, ((Long) oZaa).longValue());
                    return;
                } else {
                    a(str);
                    return;
                }
            case 3:
            default:
                int i2 = field.zac;
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            case 4:
                if (oZaa != null) {
                    zaa((Field<?, ?>) field, str, ((Double) oZaa).doubleValue());
                    return;
                } else {
                    a(str);
                    return;
                }
            case 5:
                zaa((Field<?, ?>) field, str, (BigDecimal) oZaa);
                return;
            case 6:
                if (oZaa != null) {
                    setBooleanInternal(field, str, ((Boolean) oZaa).booleanValue());
                    return;
                } else {
                    a(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) oZaa);
                return;
            case 8:
            case 9:
                if (oZaa != null) {
                    setDecodedBytesInternal(field, str, (byte[]) oZaa);
                    return;
                } else {
                    a(str);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RecentlyNonNull
    public static <O, I> I zaa(@RecentlyNonNull Field<I, O> field, @Nullable Object obj) {
        return ((Field) field).d != null ? field.zab(obj) : obj;
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @RecentlyNonNull T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @RecentlyNonNull
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @RecentlyNullable
    @KeepForSdk
    public Object getFieldValue(@RecentlyNonNull Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String strSubstring = str.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(strSubstring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @RecentlyNullable
    @KeepForSdk
    public abstract Object getValueObject(@RecentlyNonNull String str);

    @KeepForSdk
    public boolean isFieldSet(@RecentlyNonNull Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(@RecentlyNonNull String str);

    @KeepForSdk
    public void setBooleanInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @RecentlyNonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaa = zaa(field, getFieldValue(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (objZaa != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.encode((byte[]) objZaa));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) objZaa));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) objZaa);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) objZaa;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        b(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                            } else {
                                b(sb, field, objZaa);
                            }
                            break;
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append(i.d);
        } else {
            sb.append(MessageFormatter.c);
        }
        return sb.toString();
    }

    public final <O> void zab(@RecentlyNonNull Field<ArrayList<BigInteger>, O> field, @Nullable ArrayList<BigInteger> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zab(field, field.zae, arrayList);
        }
    }

    public final <O> void zac(@RecentlyNonNull Field<ArrayList<Long>, O> field, @Nullable ArrayList<Long> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zac(field, field.zae, arrayList);
        }
    }

    public final <O> void zad(@RecentlyNonNull Field<ArrayList<Float>, O> field, @Nullable ArrayList<Float> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public final <O> void zae(@RecentlyNonNull Field<ArrayList<Double>, O> field, @Nullable ArrayList<Double> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zae(field, field.zae, arrayList);
        }
    }

    public final <O> void zaf(@RecentlyNonNull Field<ArrayList<BigDecimal>, O> field, @Nullable ArrayList<BigDecimal> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zaf(field, field.zae, arrayList);
        }
    }

    public final <O> void zag(@RecentlyNonNull Field<ArrayList<Boolean>, O> field, @Nullable ArrayList<Boolean> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zag(field, field.zae, arrayList);
        }
    }

    public final <O> void zah(@RecentlyNonNull Field<ArrayList<String>, O> field, @Nullable ArrayList<String> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Integer, O> field, int i) {
        if (((Field) field).d != null) {
            c(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.zae, i);
        }
    }

    public void zab(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void zac(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public void zad(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void zae(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void zaf(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void zag(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final <O> void zaa(@RecentlyNonNull Field<ArrayList<Integer>, O> field, @Nullable ArrayList<Integer> arrayList) {
        if (((Field) field).d != null) {
            c(field, arrayList);
        } else {
            zaa(field, field.zae, arrayList);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<BigInteger, O> field, @Nullable BigInteger bigInteger) {
        if (((Field) field).d != null) {
            c(field, bigInteger);
        } else {
            zaa(field, field.zae, bigInteger);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Long, O> field, long j) {
        if (((Field) field).d != null) {
            c(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.zae, j);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Float, O> field, float f) {
        if (((Field) field).d != null) {
            c(field, Float.valueOf(f));
        } else {
            zaa((Field<?, ?>) field, field.zae, f);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Double, O> field, double d) {
        if (((Field) field).d != null) {
            c(field, Double.valueOf(d));
        } else {
            zaa(field, field.zae, d);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<BigDecimal, O> field, @Nullable BigDecimal bigDecimal) {
        if (((Field) field).d != null) {
            c(field, bigDecimal);
        } else {
            zaa(field, field.zae, bigDecimal);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Boolean, O> field, boolean z) {
        if (((Field) field).d != null) {
            c(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.zae, z);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<String, O> field, @Nullable String str) {
        if (((Field) field).d != null) {
            c(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<byte[], O> field, @Nullable byte[] bArr) {
        if (((Field) field).d != null) {
            c(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final <O> void zaa(@RecentlyNonNull Field<Map<String, String>, O> field, @Nullable Map<String, String> map) {
        if (((Field) field).d != null) {
            c(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public void zaa(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void zaa(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void zaa(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void zaa(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void zaa(@RecentlyNonNull Field<?, ?> field, @RecentlyNonNull String str, @Nullable BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }
}
