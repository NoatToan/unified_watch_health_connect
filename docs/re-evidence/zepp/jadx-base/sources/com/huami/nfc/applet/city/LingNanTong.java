package com.huami.nfc.applet.city;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.base.INfcChannel;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/nfc/applet/city/LingNanTong;", "Lcom/huami/nfc/applet/city/ICityApplet;", "Lcom/huami/nfc/base/INfcChannel;", "", "aid", "", "Lcom/huami/nfc/applet/TransEntity;", "a", "", "isInstalled", "", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "getTransRecord", "Lcom/huami/nfc/base/INfcChannel;", "channel", "b", "Ljava/lang/String;", "path", "c", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class LingNanTong implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String path = "00A4000002DDF1";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String aid = ConstantKt.AID_LING_NAN_TONG;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return Intrinsics.stringPlus("Balance = ", Integer.valueOf(this.a));
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

    public LingNanTong(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final List<TransEntity> a(INfcChannel iNfcChannel, String str) throws Exception {
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
    public int getBalance() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4000002ADF3");
        int amount = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 7)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount), 1, null);
        return amount;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public CardInfo getCardInfo() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "00B0950058");
        long jActivationDate = CityAppletExtensionsKt.activationDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(46, 53)));
        long jExpiredDate = CityAppletExtensionsKt.expiredDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(54, 61)));
        String strSubstring = StringsKt__StringsKt.substring(strSendWithException, new IntRange(22, 31));
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4000002ADF3");
        CardInfo cardInfo = new CardInfo(strSubstring, jActivationDate, jExpiredDate, false, CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 7))), 8, null);
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
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4000002ADF3");
        return a(this.channel, this.aid);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return INfcChannelExtensionsKt.isInstalled(this.channel, this.aid, this.path);
    }
}
