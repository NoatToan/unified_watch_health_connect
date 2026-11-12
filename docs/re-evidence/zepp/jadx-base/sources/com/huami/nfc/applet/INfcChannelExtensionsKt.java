package com.huami.nfc.applet;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.SeResponseErrorException;
import com.huami.watch.notification.TransportUri;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000\u001a\u001c\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0019\u001a\u00020\t*\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u001a\u0018\u0010\u001a\u001a\u00020\t*\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/nfc/base/INfcChannel;", "", "aid", "select", "apdu", "send", "data", "sendWithException", "selectWithException", "", "verifyPIN", "path", "", "isInstalled", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecords", Constant.h, "Lkotlin/ranges/IntRange;", "range", "subData", "subByte", "getChargeRecords", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "yes", "no", "nfc-applet_release"}, k = 2, mv = {1, 5, 1})
public final class INfcChannelExtensionsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ Ref.ByteRef a;
        public final /* synthetic */ TransEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref.ByteRef byteRef, TransEntity transEntity) {
            super(0);
            this.a = byteRef;
            this.b = transEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "==> charge recode from device index = " + ((int) this.a.element) + " , " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ Ref.ByteRef a;
        public final /* synthetic */ TransEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.ByteRef byteRef, TransEntity transEntity) {
            super(0);
            this.a = byteRef;
            this.b = transEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "==> Trans record from device index = " + ((int) this.a.element) + " , " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Object> {
        public final /* synthetic */ Ref.ByteRef a;
        public final /* synthetic */ TransEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ByteRef byteRef, TransEntity transEntity) {
            super(0);
            this.a = byteRef;
            this.b = transEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "==> Trans record from device index = " + ((int) this.a.element) + " , " + this.b;
        }
    }

    @NotNull
    public static final List<TransEntity> getChargeRecords(@NotNull INfcChannel iNfcChannel, @NotNull String str) throws Exception {
        Ref.ByteRef byteRef = new Ref.ByteRef();
        byteRef.element = (byte) 1;
        String strSend = send(iNfcChannel, "00B201FC00");
        ArrayList arrayList = new ArrayList();
        String strSend2 = strSend;
        while (CityAppletExtensionsKt.isSuccess(strSend2) && !CityAppletExtensionsKt.isLastRecord(strSend2)) {
            TransEntity transEntity = new TransEntity(strSend2, str, String.valueOf(CityAppletExtensionsKt.toDecimal(subData(strSend2, new IntRange(0, 2)))), CityAppletExtensionsKt.toTimestamp(subData(strSend2, new IntRange(16, 23)), "yyyyMMddHHmmss"), CityAppletExtensionsKt.toAmount(subData(strSend2, new IntRange(5, 9))), TransType.INSTANCE.from(Integer.parseInt(subData(strSend2, new IntRange(9, 10)))), subData(strSend2, new IntRange(10, 16)), 0, 128, null);
            arrayList.add(transEntity);
            LogcatKt.info$default(Logcat.INSTANCE, null, new a(byteRef, transEntity), 1, null);
            byte b2 = (byte) (byteRef.element + 1);
            byteRef.element = b2;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strSend2 = send(iNfcChannel, String.format("00B2%02xFC00", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<TransEntity> getTransRecords(@NotNull INfcChannel iNfcChannel, @NotNull String str) throws Exception {
        Ref.ByteRef byteRef = new Ref.ByteRef();
        byteRef.element = (byte) 1;
        String strSend = send(iNfcChannel, "00B201C400");
        ArrayList arrayList = new ArrayList();
        String strSend2 = strSend;
        while (CityAppletExtensionsKt.isSuccess(strSend2) && !CityAppletExtensionsKt.isLastRecord(strSend2)) {
            TransEntity transEntity = new TransEntity(strSend2, str, String.valueOf(CityAppletExtensionsKt.toDecimal(subData(strSend2, new IntRange(0, 2)))), CityAppletExtensionsKt.toTimestamp(subData(strSend2, new IntRange(16, 23)), "yyyyMMddHHmmss"), CityAppletExtensionsKt.toAmount(subData(strSend2, new IntRange(5, 9))), TransType.INSTANCE.from(Integer.parseInt(subData(strSend2, new IntRange(9, 10)))), subData(strSend2, new IntRange(10, 16)), 0, 128, null);
            arrayList.add(transEntity);
            LogcatKt.info$default(Logcat.INSTANCE, null, new b(byteRef, transEntity), 1, null);
            byte b2 = (byte) (byteRef.element + 1);
            byteRef.element = b2;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strSend2 = send(iNfcChannel, String.format("00B2%02xC400", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        return arrayList;
    }

    public static final boolean isInstalled(@NotNull INfcChannel iNfcChannel, @NotNull String str, @NotNull String str2) {
        if (CityAppletExtensionsKt.isSuccess(select(iNfcChannel, str))) {
            return CityAppletExtensionsKt.isSuccess(send(iNfcChannel, str2));
        }
        return false;
    }

    public static final void no(boolean z, @NotNull Function0<Unit> function0) {
        if (z) {
            return;
        }
        function0.invoke();
    }

    @NotNull
    public static final String select(@NotNull INfcChannel iNfcChannel, @NotNull String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return CityAppletExtensionsKt.toApduScript(iNfcChannel.transmit(CityAppletExtensionsKt.toBytes(String.format(ISeCommandKt.CMD_APDU_SELECTED, Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2)))));
    }

    @NotNull
    public static final String selectWithException(@NotNull INfcChannel iNfcChannel, @NotNull String str) throws SeResponseErrorException {
        String strSelect = select(iNfcChannel, str);
        if (CityAppletExtensionsKt.isSuccess(strSelect)) {
            return strSelect;
        }
        throw new SeResponseErrorException(str, strSelect);
    }

    @NotNull
    public static final String send(@NotNull INfcChannel iNfcChannel, @NotNull String str) throws Exception {
        byte[] bArrTransmit = iNfcChannel.transmit(CityAppletExtensionsKt.toBytes(str));
        if (bArrTransmit.length == 2 && bArrTransmit[0] == 108) {
            byte[] bytes = CityAppletExtensionsKt.toBytes(str);
            bytes[bytes.length - 1] = bArrTransmit[1];
            bArrTransmit = iNfcChannel.transmit(bytes);
        }
        return CityAppletExtensionsKt.toApduScript(bArrTransmit);
    }

    @NotNull
    public static final String sendWithException(@NotNull INfcChannel iNfcChannel, @NotNull String str) throws Exception {
        String strSend = send(iNfcChannel, str);
        if (CityAppletExtensionsKt.isSuccess(strSend)) {
            return strSend;
        }
        throw new SeResponseErrorException(str, strSend);
    }

    @NotNull
    public static final String subByte(@NotNull String str, @NotNull IntRange intRange) {
        return StringsKt__StringsKt.substring(str, e.until(intRange.getFirst() * 2, intRange.getLast() * 2));
    }

    @NotNull
    public static final String subData(@NotNull String str, @NotNull IntRange intRange) {
        return StringsKt__StringsKt.substring(str, e.until(intRange.getFirst() * 2, intRange.getLast() * 2));
    }

    public static final void verifyPIN(@NotNull INfcChannel iNfcChannel) throws Exception {
        sendWithException(iNfcChannel, "0020000003123456");
    }

    public static final void yes(boolean z, @NotNull Function0<Unit> function0) {
        if (z) {
            function0.invoke();
        }
    }

    @NotNull
    public static final List<TransEntity> getTransRecords(@NotNull INfcChannel iNfcChannel, @NotNull String str, @NotNull String str2) throws Exception {
        Ref.ByteRef byteRef = new Ref.ByteRef();
        byteRef.element = (byte) 1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i = 0;
        String strSend = send(iNfcChannel, String.format(str2, Arrays.copyOf(new Object[]{(byte) 1}, 1)));
        ArrayList arrayList = new ArrayList();
        String strSend2 = strSend;
        while (CityAppletExtensionsKt.isSuccess(strSend2) && !CityAppletExtensionsKt.isLastRecord(strSend2)) {
            TransEntity transEntity = new TransEntity(strSend2, str, String.valueOf(CityAppletExtensionsKt.toDecimal(subData(strSend2, new IntRange(i, 2)))), CityAppletExtensionsKt.toTimestamp(subData(strSend2, new IntRange(16, 23)), "yyyyMMddHHmmss"), CityAppletExtensionsKt.toAmount(subData(strSend2, new IntRange(5, 9))), TransType.INSTANCE.from(Integer.parseInt(subData(strSend2, new IntRange(9, 10)))), subData(strSend2, new IntRange(10, 16)), 0, 128, null);
            arrayList.add(transEntity);
            LogcatKt.info$default(Logcat.INSTANCE, null, new c(byteRef, transEntity), 1, null);
            byte b2 = (byte) (byteRef.element + 1);
            byteRef.element = b2;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            strSend2 = send(iNfcChannel, String.format(str2, Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
            i = 0;
        }
        return arrayList;
    }
}
