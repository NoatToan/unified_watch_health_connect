package com.huami.nfc.applet.city;

import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.SeResponseErrorException;
import io.netty.util.internal.StringUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/nfc/applet/city/ShaoXingMotNew;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class ShaoXingMotNew implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

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
            return "Balance = " + this.a + StringUtil.SPACE;
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

    public ShaoXingMotNew(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() {
        int amount = CityAppletExtensionsKt.toAmount(INfcChannelExtensionsKt.subByte(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 4)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount), 1, null);
        return amount;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public int getBalance() throws SeResponseErrorException {
        INfcChannelExtensionsKt.selectWithException(this.channel, ConstantKt.AID_SHAO_XING_NEW);
        return a();
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public CardInfo getCardInfo() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, ConstantKt.AID_SHAO_XING_NEW);
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
    public List<TransEntity> getTransRecord() throws SeResponseErrorException {
        INfcChannelExtensionsKt.selectWithException(this.channel, ConstantKt.AID_SHAO_XING_NEW);
        return INfcChannelExtensionsKt.getTransRecords(this.channel, ConstantKt.AID_SHAO_XING_NEW);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.select(this.channel, ConstantKt.AID_SHAO_XING_NEW));
    }
}
