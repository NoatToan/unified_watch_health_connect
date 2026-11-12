package com.google.android.gms.common.server.response;

import am.j;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.maps.android.BuildConfig;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o2.c;
import org.apache.commons.lang3.e;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
@KeepForSdk
public abstract class FastJsonResponse {

    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        Object zac(Object obj);

        Object zad(Object obj);
    }

    public static final Object zaD(Field field, Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(Field field, Object obj) {
        int i14 = field.zac;
        Object objZae = field.zae(obj);
        String str = field.zae;
        switch (i14) {
            case 0:
                if (objZae == null) {
                    zaG(str);
                } else {
                    setIntegerInternal(field, str, ((Integer) objZae).intValue());
                }
                break;
            case 1:
                zaf(field, str, (BigInteger) objZae);
                break;
            case 2:
                if (objZae == null) {
                    zaG(str);
                } else {
                    setLongInternal(field, str, ((Long) objZae).longValue());
                }
                break;
            case 3:
            default:
                h.z(j.h(i14, "Unsupported type for conversion: "));
                break;
            case 4:
                if (objZae == null) {
                    zaG(str);
                } else {
                    zan(field, str, ((Double) objZae).doubleValue());
                }
                break;
            case 5:
                zab(field, str, (BigDecimal) objZae);
                break;
            case 6:
                if (objZae == null) {
                    zaG(str);
                } else {
                    setBooleanInternal(field, str, ((Boolean) objZae).booleanValue());
                }
                break;
            case 7:
                setStringInternal(field, str, (String) objZae);
                break;
            case 8:
            case 9:
                if (objZae == null) {
                    zaG(str);
                } else {
                    setDecodedBytesInternal(field, str, (byte[]) objZae);
                }
                break;
        }
    }

    private static final void zaF(StringBuilder sb3, Field field, Object obj) {
        int i14 = field.zaa;
        if (i14 == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb3.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i14 != 7) {
                sb3.append(obj);
                return;
            }
            sb3.append("\"");
            sb3.append(JsonUtils.escapeString((String) obj));
            sb3.append("\"");
        }
    }

    private static final void zaG(String str) {
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field field, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field field, String str, T t7) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @KeepForSdk
    public Object getFieldValue(Field field) {
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", field.zae);
        try {
            return getClass().getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e4) {
            c.p(e4);
            return null;
        }
    }

    @KeepForSdk
    public abstract Object getValueObject(String str);

    @KeepForSdk
    public boolean isFieldSet(Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            e.w("Concrete type arrays not supported");
            return false;
        }
        e.w("Concrete types not supported");
        return false;
    }

    @KeepForSdk
    public abstract boolean isPrimitiveFieldSet(String str);

    @KeepForSdk
    public void setBooleanInternal(Field<?, ?> field, String str, boolean z14) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    @KeepForSdk
    public void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    @KeepForSdk
    public void setIntegerInternal(Field<?, ?> field, String str, int i14) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    @KeepForSdk
    public void setLongInternal(Field<?, ?> field, String str, long j8) {
        throw new UnsupportedOperationException("Long not supported");
    }

    @KeepForSdk
    public void setStringInternal(Field<?, ?> field, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    @KeepForSdk
    public void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    @KeepForSdk
    public void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb3 = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object objZaD = zaD(field, getFieldValue(field));
                if (sb3.length() == 0) {
                    sb3.append("{");
                } else {
                    sb3.append(",");
                }
                j.y(sb3, "\"", str, "\":");
                if (objZaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb3.append("\"");
                            sb3.append(Base64Utils.encode((byte[]) objZaD));
                            sb3.append("\"");
                            break;
                        case 9:
                            sb3.append("\"");
                            sb3.append(Base64Utils.encodeUrlSafe((byte[]) objZaD));
                            sb3.append("\"");
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb3, (HashMap) objZaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb3.append("[");
                                int size = arrayList.size();
                                for (int i14 = 0; i14 < size; i14++) {
                                    if (i14 > 0) {
                                        sb3.append(",");
                                    }
                                    Object obj = arrayList.get(i14);
                                    if (obj != null) {
                                        zaF(sb3, field, obj);
                                    }
                                }
                                sb3.append("]");
                            } else {
                                zaF(sb3, field, objZaD);
                            }
                            break;
                    }
                } else {
                    sb3.append(BuildConfig.TRAVIS);
                }
            }
        }
        if (sb3.length() > 0) {
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        } else {
            sb3.append("{}");
        }
        return sb3.toString();
    }

    public final void zaA(Field field, String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(Field field, Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(Field field, BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    public void zab(Field field, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    public void zad(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(Field field, BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    public void zaf(Field field, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    public void zah(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(Field field, boolean z14) {
        if (field.zak != null) {
            zaE(field, Boolean.valueOf(z14));
        } else {
            setBooleanInternal(field, field.zae, z14);
        }
    }

    public final void zaj(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    public void zak(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(Field field, byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(Field field, double d14) {
        if (field.zak != null) {
            zaE(field, Double.valueOf(d14));
        } else {
            zan(field, field.zae, d14);
        }
    }

    public void zan(Field field, String str, double d14) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    public void zap(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(Field field, float f14) {
        if (field.zak != null) {
            zaE(field, Float.valueOf(f14));
        } else {
            zar(field, field.zae, f14);
        }
    }

    public void zar(Field field, String str, float f14) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    public void zat(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(Field field, int i14) {
        if (field.zak != null) {
            zaE(field, Integer.valueOf(i14));
        } else {
            setIntegerInternal(field, field.zae, i14);
        }
    }

    public final void zav(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    public void zaw(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(Field field, long j8) {
        if (field.zak != null) {
            zaE(field, Long.valueOf(j8));
        } else {
            setLongInternal(field, field.zae, j8);
        }
    }

    public final void zay(Field field, ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    public void zaz(Field field, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;

        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;

        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;

        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;

        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;
        protected final Class zag;

        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String zah;

        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private zan zaj;

        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private final FieldConverter zak;

        @SafeParcelable.Constructor
        public Field(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) int i15, @SafeParcelable.Param(id = 3) boolean z14, @SafeParcelable.Param(id = 4) int i16, @SafeParcelable.Param(id = 5) boolean z15, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i17, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i14;
            this.zaa = i15;
            this.zab = z14;
            this.zac = i16;
            this.zad = z15;
            this.zae = str;
            this.zaf = i17;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(String str, int i14) {
            return new Field<>(8, false, 8, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(String str, int i14) {
            return new Field<>(6, false, 6, false, str, i14, null, null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i14, Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i14, cls, null);
        }

        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i14, Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i14, cls, null);
        }

        @KeepForSdk
        public static Field<Double, Double> forDouble(String str, int i14) {
            return new Field<>(4, false, 4, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<Float, Float> forFloat(String str, int i14) {
            return new Field<>(3, false, 3, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<Integer, Integer> forInteger(String str, int i14) {
            return new Field<>(0, false, 0, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<Long, Long> forLong(String str, int i14) {
            return new Field<>(2, false, 2, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<String, String> forString(String str, int i14) {
            return new Field<>(7, false, 7, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i14) {
            return new Field<>(10, false, 10, false, str, i14, null, null);
        }

        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i14) {
            return new Field<>(7, true, 7, true, str, i14, null, null);
        }

        @KeepForSdk
        public static Field withConverter(String str, int i14, FieldConverter<?, ?> fieldConverter, boolean z14) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z14, 0, false, str, i14, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        public final String toString() {
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("versionCode", Integer.valueOf(this.zai)).add("typeIn", Integer.valueOf(this.zaa)).add("typeInArray", Boolean.valueOf(this.zab)).add("typeOut", Integer.valueOf(this.zac)).add("typeOutArray", Boolean.valueOf(this.zad)).add("outputFieldName", this.zae).add("safeParcelFieldId", Integer.valueOf(this.zaf)).add("concreteTypeName", zag());
            Class cls = this.zag;
            if (cls != null) {
                toStringHelperAdd.add("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                toStringHelperAdd.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return toStringHelperAdd.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            int i15 = this.zai;
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i15);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i14, false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        public final Field zab() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        public final FastJsonResponse zad() {
            Preconditions.checkNotNull(this.zag);
            Class cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zaj, this.zah);
        }

        public final Object zae(Object obj) {
            Preconditions.checkNotNull(this.zak);
            return Preconditions.checkNotNull(this.zak.zac(obj));
        }

        public final Object zaf(Object obj) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj);
        }

        public final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        public Field(int i14, boolean z14, int i15, boolean z15, String str, int i16, Class cls, FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i14;
            this.zab = z14;
            this.zac = i15;
            this.zad = z15;
            this.zae = str;
            this.zaf = i16;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
