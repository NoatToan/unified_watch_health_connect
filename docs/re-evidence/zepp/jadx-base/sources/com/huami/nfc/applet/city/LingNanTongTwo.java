package com.huami.nfc.applet.city;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.SeResponseErrorException;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/applet/city/LingNanTongTwo;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "Lcom/huami/nfc/base/INfcChannel;", "", "aid", "", "Lcom/huami/nfc/applet/TransEntity;", "b", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "getTransRecord", "Lcom/huami/nfc/base/INfcChannel;", "channel", "Ljava/lang/String;", "path", "c", "mocAid", GoogleApiAvailabilityLight.a, "motAid", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class LingNanTongTwo implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String path = "00A4000002DDF1";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String mocAid = ConstantKt.AID_LNT_TWO_IN_ONE;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String motAid = "A0000006320101055800022058100000";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "Balance = " + (this.a - this.b) + " (" + this.a + " - " + this.b + ')';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ CardInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CardInfo cardInfo) {
            super(0);
            this.a = cardInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(StringUtil.SPACE);
            return sb.toString();
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

    public LingNanTongTwo(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() throws Exception {
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "805C050210");
        int amount = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(strSendWithException, new IntRange(16, 23)));
        int amount2 = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(strSendWithException, new IntRange(0, 7)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount2, amount), 1, null);
        return amount2 - amount;
    }

    private final List<TransEntity> b(INfcChannel iNfcChannel, String str) throws Exception {
        Ref.ByteRef byteRef = new Ref.ByteRef();
        byteRef.element = (byte) 1;
        String strSend = INfcChannelExtensionsKt.send(iNfcChannel, "00B201C400");
        ArrayList arrayList = new ArrayList();
        String strSend2 = strSend;
        while (CityAppletExtensionsKt.isSuccess(strSend2) && !CityAppletExtensionsKt.isLastRecord(strSend2)) {
            TransEntity transEntity = new TransEntity(strSend2, str, String.valueOf(CityAppletExtensionsKt.toDecimal(INfcChannelExtensionsKt.subByte(strSend2, new IntRange(0, 2)))), CityAppletExtensionsKt.toTimestamp(INfcChannelExtensionsKt.subByte(strSend2, new IntRange(18, 23)), "MMddHHmmss"), CityAppletExtensionsKt.toAmount(INfcChannelExtensionsKt.subByte(strSend2, new IntRange(5, 9))), TransType.INSTANCE.from(Integer.parseInt(INfcChannelExtensionsKt.subByte(strSend2, new IntRange(9, 10)))), INfcChannelExtensionsKt.subByte(strSend2, new IntRange(10, 16)), 0, 128, null);
            arrayList.add(transEntity);
            LogcatKt.info$default(Logcat.INSTANCE, null, new c(byteRef, transEntity), 1, null);
            byte b2 = (byte) (byteRef.element + 1);
            byteRef.element = b2;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strSend2 = INfcChannelExtensionsKt.send(iNfcChannel, String.format("00B2%02xC400", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
        }
        return arrayList;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public int getBalance() throws SeResponseErrorException {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.motAid);
        return a();
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public CardInfo getCardInfo() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.motAid);
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "00B0950000");
        CardInfo cardInfo = new CardInfo(StringsKt__StringsKt.substring(strSendWithException, new IntRange(21, 39)), CityAppletExtensionsKt.activationDate(INfcChannelExtensionsKt.subByte(strSendWithException, new IntRange(20, 24))), CityAppletExtensionsKt.expiredDate(INfcChannelExtensionsKt.subByte(strSendWithException, new IntRange(24, 28))), false, a(), 8, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(cardInfo), 1, null);
        return cardInfo;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getChargeRecord() {
        return ICityApplet.DefaultImpls.getChargeRecord(this);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getTransRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.motAid);
        List<TransEntity> listB = b(this.channel, this.motAid);
        INfcChannelExtensionsKt.selectWithException(this.channel, this.mocAid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4000002ADF3");
        listB.addAll(b(this.channel, this.mocAid));
        return listB;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.select(this.channel, this.motAid));
    }
}
