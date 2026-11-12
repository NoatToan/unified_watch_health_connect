package com.huami.ecg.sync.mili.parser;

import android.text.TextUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.model.AdditionalInfo;
import com.huami.ecg.core.model.constant.EcgTagKeys;
import com.huami.ecg.core.util.AppUtil;
import com.huami.tools.log.HMLog;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\t*\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\"\u0010\u0015\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0013\u0018\u00010\u0012*\u00020\u0002J\n\u0010\u0016\u001a\u00020\u0002*\u00020\u0002R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/ecg/sync/mili/parser/EcgParser;", "", "", "Lcom/huami/ecg/core/db/entity/EcgTag;", "f", HTTP.CONTENT_RANGE_BYTES, "", "a", "", "", "e", "key", "Ljava/util/TimeZone;", "c", GoogleApiAvailabilityLight.a, "offset", "len", "b", "", "Lkotlin/Pair;", "Lcom/huami/ecg/core/db/entity/EcgData;", "toEcg", "toEcgData", LogUtil.I, "ITEM_LENGTH", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgParser {
    public static final EcgParser INSTANCE = new EcgParser();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int ITEM_LENGTH = 49;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String TAG = "EcgParser";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "getTimezoneOffset key:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "getTimezoneOffset rawOffset:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg parse error with data size:" + this.a.length;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg summary data:" + TextUtils.join(",", ArraysKt___ArraysJvmKt.asList(this.a));
        }
    }

    private EcgParser() {
    }

    private final long a(byte[] bytes) {
        int length = bytes.length;
        long j = 0;
        for (int i = 0; i < length; i++) {
            j |= (((long) bytes[i]) & 255) << (i * 8);
        }
        return j;
    }

    private final int b(byte[] bytes, int offset, int len) {
        int i = 0;
        int i2 = 0;
        while (i < len) {
            i2 |= (i == len + (-1) ? bytes[offset + i] : bytes[offset + i] & 255) << (i * 8);
            i++;
        }
        return i2;
    }

    private final TimeZone c(int key) {
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset(d(key));
        return timeZone;
    }

    private final int d(int key) {
        HMLog.info(TAG, new a(key));
        if (key == -128) {
            return 28800000;
        }
        int i = key < 0 ? -1 : 1;
        int iAbs = Math.abs(key);
        int i2 = (((iAbs / 4) * 60) + ((iAbs % 4) * 15)) * 60 * 1000 * i;
        HMLog.info(TAG, new b(i2));
        return i2;
    }

    private final int e(byte b2) {
        return b2 & 255;
    }

    private final EcgTag f(@NotNull byte[] bArr) {
        BitSet bitSetValueOf = BitSet.valueOf(bArr);
        EcgTagKeys[] ecgTagKeysArrValues = EcgTagKeys.values();
        ArrayList arrayList = new ArrayList();
        int length = ecgTagKeysArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            EcgTagKeys ecgTagKeys = ecgTagKeysArrValues[i];
            if (ecgTagKeys.getValue() >= 0 && bitSetValueOf.get(ecgTagKeys.getValue())) {
                arrayList.add(ecgTagKeys);
            }
            i++;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EcgTagKeys) it2.next()).getKey());
        }
        if (!(!arrayList2.isEmpty())) {
            return null;
        }
        EcgTag ecgTag = new EcgTag();
        EcgTagValue ecgTagValue = new EcgTagValue();
        ecgTagValue.setStringTags(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2));
        ecgTag.setValue(ecgTagValue);
        ecgTag.setSynced(0);
        return ecgTag;
    }

    @Nullable
    public final List<Pair<EcgData, EcgTag>> toEcg(@NotNull byte[] bArr) {
        byte[] bArr2 = bArr;
        char c2 = 0;
        int i = 1;
        char c3 = 2;
        if ((!(bArr2.length == 0)) && bArr2.length % 49 != 0) {
            HMLog.warn$default(TAG, null, new c(bArr2), 2, null);
            return null;
        }
        HMLog.info(TAG, new d(bArr2));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < bArr2.length - i) {
            int i3 = i2 + 1;
            e(bArr2[i2]);
            Byte[] bArr3 = new Byte[4];
            int i4 = i3 + 1;
            bArr3[c2] = Byte.valueOf(bArr2[i3]);
            int i5 = i4 + 1;
            bArr3[i] = Byte.valueOf(bArr2[i4]);
            int i6 = i5 + 1;
            bArr3[c3] = Byte.valueOf(bArr2[i5]);
            int i7 = i6 + 1;
            bArr3[3] = Byte.valueOf(bArr2[i6]);
            long jA = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) bArr3)));
            int i8 = i7 + 1;
            int iE = e(bArr2[i7]);
            int i9 = i8 + 1;
            boolean z = e(bArr2[i8]) == i;
            int i10 = i9 + 1;
            String str = e(bArr2[i9]) == 0 ? "LEFT_HAND" : "RIGHT_HAND";
            Byte[] bArr4 = new Byte[4];
            int i11 = i10 + 1;
            bArr4[c2] = Byte.valueOf(bArr2[i10]);
            int i12 = i11 + 1;
            bArr4[i] = Byte.valueOf(bArr2[i11]);
            int i13 = i12 + 1;
            bArr4[c3] = Byte.valueOf(bArr2[i12]);
            int i14 = i13 + 1;
            bArr4[3] = Byte.valueOf(bArr2[i13]);
            long jA2 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) bArr4)));
            Byte[] bArr5 = new Byte[4];
            int i15 = i14 + 1;
            bArr5[c2] = Byte.valueOf(bArr2[i14]);
            int i16 = i15 + 1;
            bArr5[i] = Byte.valueOf(bArr2[i15]);
            int i17 = i16 + 1;
            bArr5[c3] = Byte.valueOf(bArr2[i16]);
            int i18 = i17 + 1;
            bArr5[3] = Byte.valueOf(bArr2[i17]);
            long jA3 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) bArr5)));
            Byte[] bArr6 = new Byte[4];
            int i19 = i18 + 1;
            bArr6[c2] = Byte.valueOf(bArr2[i18]);
            int i20 = i19 + 1;
            bArr6[i] = Byte.valueOf(bArr2[i19]);
            int i21 = i20 + 1;
            bArr6[2] = Byte.valueOf(bArr2[i20]);
            int i22 = i21 + 1;
            bArr6[3] = Byte.valueOf(bArr2[i21]);
            long jA4 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) bArr6)));
            int i23 = i22 + 12;
            ArrayList arrayList2 = arrayList;
            String str2 = new String(ArraysKt___ArraysJvmKt.copyOfRange(bArr2, i22, i23), Charsets.UTF_8);
            int i24 = i23 + 1;
            int i25 = i24 + 1;
            int i26 = i25 + 1;
            int i27 = i26 + 1;
            long jA5 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf(bArr2[i23]), Byte.valueOf(bArr2[i24]), Byte.valueOf(bArr2[i25]), Byte.valueOf(bArr2[i26])})));
            int i28 = i27 + 1;
            int i29 = i28 + 1;
            int i30 = i29 + 1;
            int i31 = i30 + 1;
            long jA6 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf(bArr2[i27]), Byte.valueOf(bArr2[i28]), Byte.valueOf(bArr2[i29]), Byte.valueOf(bArr2[i30])})));
            int i32 = i31 + 1;
            int iE2 = e(bArr2[i31]);
            int i33 = i32 + 1;
            int i34 = i33 + 1;
            long jA7 = a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf(bArr2[i32]), Byte.valueOf(bArr2[i33])})));
            int i35 = i34 + 1;
            int i36 = i35 + 1;
            int iA = (int) a(CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf(bArr2[i34]), Byte.valueOf(bArr2[i35])})));
            int i37 = i36 + 1;
            int i38 = i37 + 1;
            int i39 = i38 + 1;
            int i40 = i39 + 1;
            byte[] byteArray = CollectionsKt___CollectionsKt.toByteArray(CollectionsKt__CollectionsKt.listOf((Object[]) new Byte[]{Byte.valueOf(bArr2[i36]), Byte.valueOf(bArr2[i37]), Byte.valueOf(bArr2[i38]), Byte.valueOf(bArr2[i39])}));
            EcgData ecgData = new EcgData();
            ecgData.setTimestamp(jA);
            ecgData.setTimeZone(INSTANCE.c(iE).getID());
            ecgData.setOnline(z);
            ecgData.setWearPosition(str);
            ecgData.setMExtFatigue((int) jA2);
            ecgData.getEcgResultData().getHealthRecord().setHr((int) jA3);
            ecgData.getEcgResultData().getHealthRecord().setFatigue(jA4);
            ecgData.getEcgResultData().setAlgoVersion(str2);
            AdditionalInfo additionalInfo = new AdditionalInfo();
            additionalInfo.setAFibResult((int) jA5);
            additionalInfo.setEcgQualityFlag((int) jA6);
            additionalInfo.setMAppVer(AppUtil.INSTANCE.getVersionName(EcgCore.INSTANCE.getContext()));
            ecgData.setAdditionalInfo(additionalInfo);
            ecgData.setMIsContainPPG(iE2);
            ecgData.setMeasureSecond(jA7);
            ecgData.setSampleRate(iA);
            ecgData.setLocalUpdatedTime(System.currentTimeMillis());
            EcgTag ecgTagF = f(byteArray);
            if (ecgTagF != null) {
                ecgTagF.setEcgId(jA);
            } else {
                ecgTagF = null;
            }
            arrayList2.add(new Pair(ecgData, ecgTagF));
            arrayList = arrayList2;
            i2 = i40;
            c2 = 0;
            i = 1;
            c3 = 2;
            bArr2 = bArr;
        }
        return arrayList;
    }

    @NotNull
    public final byte[] toEcgData(@NotNull byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < bArr.length - 1; i += 2) {
            String strValueOf = String.valueOf(b(bArr, i, 2));
            Charset charset = Charsets.UTF_8;
            if (strValueOf == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            byteArrayOutputStream.write(strValueOf.getBytes(charset));
            byteArrayOutputStream.write("\n".getBytes(charset));
            byteArrayOutputStream.flush();
        }
        return byteArrayOutputStream.toByteArray();
    }
}
