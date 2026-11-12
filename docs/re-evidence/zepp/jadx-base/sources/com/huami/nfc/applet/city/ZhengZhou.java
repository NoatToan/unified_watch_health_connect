package com.huami.nfc.applet.city;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.INfcChannel;
import io.netty.util.internal.StringUtil;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/huami/nfc/applet/city/ZhengZhou;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "", "originNumber", "b", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "Ljava/lang/String;", "adf1", "c", "aid", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class ZhengZhou implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String adf1 = "00A40000021001";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String aid = ConstantKt.AID_ZHENG_ZHOU;

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
            return Intrinsics.stringPlus("balance = ", Integer.valueOf(this.a));
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

    public ZhengZhou(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() {
        int amount = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 7)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount), 1, null);
        return amount;
    }

    private final String b(String originNumber) {
        Objects.requireNonNull(originNumber, "null cannot be cast to non-null type java.lang.String");
        String strStringPlus = Intrinsics.stringPlus(originNumber.substring(0, 1), originNumber.substring(4));
        int i = 0;
        for (int i2 = 0; i2 < strStringPlus.length(); i2++) {
            i ^= Integer.parseInt(String.valueOf(strStringPlus.charAt(i2)));
        }
        return Intrinsics.stringPlus(strStringPlus, Integer.valueOf(i % 10));
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public int getBalance() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.adf1);
        return a();
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public CardInfo getCardInfo() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4040009A0000053425A5A4854");
        INfcChannelExtensionsKt.sendWithException(this.channel, this.adf1);
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "00B0950000");
        CardInfo cardInfo = new CardInfo(b(StringsKt__StringsKt.substring(strSendWithException, new IntRange(24, 39))), CityAppletExtensionsKt.activationDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(40, 47))), CityAppletExtensionsKt.expiredDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(48, 55))), false, a(), 8, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(cardInfo), 1, null);
        return cardInfo;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getChargeRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4040009A0000053425A5A4854");
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4040009A00000000386980701");
        return INfcChannelExtensionsKt.getChargeRecords(this.channel, this.aid);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getTransRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A4040009A0000053425A5A4854");
        INfcChannelExtensionsKt.sendWithException(this.channel, this.adf1);
        return INfcChannelExtensionsKt.getTransRecords(this.channel, this.aid);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return INfcChannelExtensionsKt.isInstalled(this.channel, this.aid, this.adf1);
    }
}
