package com.google.android.gms.common.server.response;

import am.j;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.animation.keyframe.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.e;
import org.apache.commons.text.StringSubstitutor;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "SafeParcelResponseCreator")
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {

    @KeepForSdk
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new zaq();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
    private final int zaa;

    @SafeParcelable.Field(getter = "getParcel", id = 2)
    private final Parcel zab;
    private final int zac;

    @SafeParcelable.Field(getter = "getFieldMappingDictionary", id = 3)
    private final zan zad;
    private final String zae;
    private int zaf;
    private int zag;

    private SafeParcelResponse(SafeParcelable safeParcelable, zan zanVar, String str) {
        this.zaa = 1;
        Parcel parcelObtain = Parcel.obtain();
        this.zab = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zac = 1;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    @KeepForSdk
    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t7) {
        String str = (String) Preconditions.checkNotNull(t7.getClass().getCanonicalName());
        zan zanVar = new zan(t7.getClass());
        zaF(zanVar, t7);
        zanVar.zac();
        zanVar.zad();
        return new SafeParcelResponse(t7, zanVar, str);
    }

    private static void zaF(zan zanVar, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        Iterator<String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (FastJsonResponse) cls2.newInstance());
                } catch (IllegalAccessException e4) {
                    a.x("Could not access object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e4);
                    return;
                } catch (InstantiationException e14) {
                    a.x("Could not instantiate an object of type ".concat(String.valueOf(((Class) Preconditions.checkNotNull(field.zag)).getCanonicalName())), e14);
                    return;
                }
            }
        }
    }

    private final void zaG(FastJsonResponse.Field field) {
        if (field.zaf == -1) {
            h.z("Field does not have a valid safe parcelable field id.");
            return;
        }
        Parcel parcel = this.zab;
        if (parcel == null) {
            h.z("Internal Parcel object is null.");
            return;
        }
        int i14 = this.zaf;
        if (i14 == 0) {
            this.zag = SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        } else {
            if (i14 == 1) {
                return;
            }
            h.z("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
        }
    }

    private final void zaH(StringBuilder sb3, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb3.append(CoreConstants.CURLY_LEFT);
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z14 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z14) {
                    sb3.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb3.append("\"");
                sb3.append(str);
                sb3.append("\":");
                if (field.zaj()) {
                    int i14 = field.zac;
                    switch (i14) {
                        case 0:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, Integer.valueOf(SafeParcelReader.readInt(parcel, header))));
                            break;
                        case 1:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, SafeParcelReader.createBigInteger(parcel, header)));
                            break;
                        case 2:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, Long.valueOf(SafeParcelReader.readLong(parcel, header))));
                            break;
                        case 3:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, Float.valueOf(SafeParcelReader.readFloat(parcel, header))));
                            break;
                        case 4:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, Double.valueOf(SafeParcelReader.readDouble(parcel, header))));
                            break;
                        case 5:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, SafeParcelReader.createBigDecimal(parcel, header)));
                            break;
                        case 6:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, Boolean.valueOf(SafeParcelReader.readBoolean(parcel, header))));
                            break;
                        case 7:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, SafeParcelReader.createString(parcel, header)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb3, field, FastJsonResponse.zaD(field, SafeParcelReader.createByteArray(parcel, header)));
                            break;
                        case 10:
                            Bundle bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                            HashMap map2 = new HashMap();
                            for (String str2 : bundleCreateBundle.keySet()) {
                                map2.put(str2, (String) Preconditions.checkNotNull(bundleCreateBundle.getString(str2)));
                            }
                            zaJ(sb3, field, FastJsonResponse.zaD(field, map2));
                            break;
                        case 11:
                            h.s("Method does not accept concrete type.");
                            return;
                        default:
                            h.s(j.h(i14, "Unknown field out type = "));
                            return;
                    }
                } else if (field.zad) {
                    sb3.append("[");
                    switch (field.zac) {
                        case 0:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createIntArray(parcel, header));
                            break;
                        case 1:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createBigIntegerArray(parcel, header));
                            break;
                        case 2:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createLongArray(parcel, header));
                            break;
                        case 3:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createFloatArray(parcel, header));
                            break;
                        case 4:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createDoubleArray(parcel, header));
                            break;
                        case 5:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createBigDecimalArray(parcel, header));
                            break;
                        case 6:
                            ArrayUtils.writeArray(sb3, SafeParcelReader.createBooleanArray(parcel, header));
                            break;
                        case 7:
                            ArrayUtils.writeStringArray(sb3, SafeParcelReader.createStringArray(parcel, header));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            e.w("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            return;
                        case 11:
                            Parcel[] parcelArrCreateParcelArray = SafeParcelReader.createParcelArray(parcel, header);
                            int length = parcelArrCreateParcelArray.length;
                            for (int i15 = 0; i15 < length; i15++) {
                                if (i15 > 0) {
                                    sb3.append(",");
                                }
                                parcelArrCreateParcelArray[i15].setDataPosition(0);
                                zaH(sb3, field.zah(), parcelArrCreateParcelArray[i15]);
                            }
                            break;
                        default:
                            h.z("Unknown field type out.");
                            return;
                    }
                    sb3.append("]");
                } else {
                    switch (field.zac) {
                        case 0:
                            sb3.append(SafeParcelReader.readInt(parcel, header));
                            break;
                        case 1:
                            sb3.append(SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            sb3.append(SafeParcelReader.readLong(parcel, header));
                            break;
                        case 3:
                            sb3.append(SafeParcelReader.readFloat(parcel, header));
                            break;
                        case 4:
                            sb3.append(SafeParcelReader.readDouble(parcel, header));
                            break;
                        case 5:
                            sb3.append(SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            sb3.append(SafeParcelReader.readBoolean(parcel, header));
                            break;
                        case 7:
                            String strCreateString = SafeParcelReader.createString(parcel, header);
                            sb3.append("\"");
                            sb3.append(JsonUtils.escapeString(strCreateString));
                            sb3.append("\"");
                            break;
                        case 8:
                            byte[] bArrCreateByteArray = SafeParcelReader.createByteArray(parcel, header);
                            sb3.append("\"");
                            sb3.append(Base64Utils.encode(bArrCreateByteArray));
                            sb3.append("\"");
                            break;
                        case 9:
                            byte[] bArrCreateByteArray2 = SafeParcelReader.createByteArray(parcel, header);
                            sb3.append("\"");
                            sb3.append(Base64Utils.encodeUrlSafe(bArrCreateByteArray2));
                            sb3.append("\"");
                            break;
                        case 10:
                            Bundle bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                            Set<String> setKeySet = bundleCreateBundle2.keySet();
                            sb3.append("{");
                            boolean z15 = true;
                            for (String str3 : setKeySet) {
                                if (!z15) {
                                    sb3.append(",");
                                }
                                j.y(sb3, "\"", str3, "\":\"");
                                sb3.append(JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb3.append("\"");
                                z15 = false;
                            }
                            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
                            break;
                        case 11:
                            Parcel parcelCreateParcel = SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            zaH(sb3, field.zah(), parcelCreateParcel);
                            break;
                        default:
                            h.z("Unknown field type out");
                            return;
                    }
                }
                z14 = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new SafeParcelReader.ParseException(j.h(iValidateObjectHeader, "Overread allowed size end="), parcel);
        }
        sb3.append(CoreConstants.CURLY_RIGHT);
    }

    private static final void zaI(StringBuilder sb3, int i14, Object obj) {
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb3.append(obj);
                break;
            case 7:
                sb3.append("\"");
                sb3.append(JsonUtils.escapeString(Preconditions.checkNotNull(obj).toString()));
                sb3.append("\"");
                break;
            case 8:
                sb3.append("\"");
                sb3.append(Base64Utils.encode((byte[]) obj));
                sb3.append("\"");
                break;
            case 9:
                sb3.append("\"");
                sb3.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb3.append("\"");
                break;
            case 10:
                MapUtils.writeStringMapToJson(sb3, (HashMap) Preconditions.checkNotNull(obj));
                break;
            case 11:
                h.s("Method does not accept concrete type.");
                break;
            default:
                h.s(j.h(i14, "Unknown type = "));
                break;
        }
    }

    private static final void zaJ(StringBuilder sb3, FastJsonResponse.Field field, Object obj) {
        if (!field.zab) {
            zaI(sb3, field.zaa, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb3.append("[");
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (i14 != 0) {
                sb3.append(",");
            }
            zaI(sb3, field.zaa, arrayList.get(i14));
        }
        sb3.append("]");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        zaG(field);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList2.add(((SafeParcelResponse) arrayList.get(i14)).zaE());
        }
        SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t7) {
        zaG(field);
        SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t7).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((String) Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z14) {
        zaG(field);
        SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z14);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zaG(field);
        SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i14) {
        zaG(field);
        SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i14);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j8) {
        zaG(field);
        SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j8);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zaG(field);
        SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zaG(field);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        String[] strArr = new String[size];
        for (int i14 = 0; i14 < size; i14++) {
            strArr[i14] = arrayList.get(i14);
        }
        SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        StringBuilder sb3 = new StringBuilder(100);
        zaH(sb3, (Map) Preconditions.checkNotNull(this.zad.zab((String) Preconditions.checkNotNull(this.zae))), parcelZaE);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15 = this.zaa;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i15);
        SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zac != 0 ? this.zad : null, i14, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Parcel zaE() {
        int i14 = this.zaf;
        if (i14 == 0) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = iBeginObjectHeader;
            SafeParcelWriter.finishObjectHeader(this.zab, iBeginObjectHeader);
            this.zaf = 2;
        } else if (i14 == 1) {
            SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(FastJsonResponse.Field field, String str, BigDecimal bigDecimal) {
        zaG(field);
        SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i14 = 0; i14 < size; i14++) {
            bigDecimalArr[i14] = (BigDecimal) arrayList.get(i14);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(FastJsonResponse.Field field, String str, BigInteger bigInteger) {
        zaG(field);
        SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i14 = 0; i14 < size; i14++) {
            bigIntegerArr[i14] = (BigInteger) arrayList.get(i14);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i14 = 0; i14 < size; i14++) {
            zArr[i14] = ((Boolean) arrayList.get(i14)).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(FastJsonResponse.Field field, String str, double d14) {
        zaG(field);
        SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d14);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            dArr[i14] = ((Double) arrayList.get(i14)).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(FastJsonResponse.Field field, String str, float f14) {
        zaG(field);
        SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f14);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i14 = 0; i14 < size; i14++) {
            fArr[i14] = ((Float) arrayList.get(i14)).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        zaG(field);
        int size = ((ArrayList) Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i14 = 0; i14 < size; i14++) {
            jArr[i14] = ((Long) arrayList.get(i14)).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    @SafeParcelable.Constructor
    public SafeParcelResponse(@SafeParcelable.Param(id = 1) int i14, @SafeParcelable.Param(id = 2) Parcel parcel, @SafeParcelable.Param(id = 3) zan zanVar) {
        this.zaa = i14;
        this.zab = (Parcel) Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    public SafeParcelResponse(zan zanVar, String str) {
        this.zaa = 1;
        this.zab = Parcel.obtain();
        this.zac = 0;
        this.zad = (zan) Preconditions.checkNotNull(zanVar);
        this.zae = (String) Preconditions.checkNotNull(str);
        this.zaf = 0;
    }
}
