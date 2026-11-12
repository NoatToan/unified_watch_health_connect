package com.huami.nfc.applet.city;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.CardInfo;
import com.huami.nfc.applet.ConstantKt;
import com.huami.nfc.applet.INfcChannelExtensionsKt;
import com.huami.nfc.applet.TransEntity;
import com.huami.nfc.base.INfcChannel;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/huami/nfc/applet/city/HaErBin;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "", "b", "Ljava/lang/String;", "aid", "c", "motAid", GoogleApiAvailabilityLight.a, "path", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class HaErBin implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String aid = ConstantKt.AID_HA_ER_BIN;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String motAid = "A0000006320101051500484145524249";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String path = "00A40000023F01";

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

    public HaErBin(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() throws Exception {
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204");
        int amount = CityAppletExtensionsKt.toAmount(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(0, 2)));
        int amount2 = CityAppletExtensionsKt.toAmount(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(2, 4)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount2, amount), 1, null);
        CityAppletExtensionsKt.checkBalance(amount2, amount);
        return amount2 - amount;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public int getBalance() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        return a();
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public CardInfo getCardInfo() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "00B0950000");
        int decimal = CityAppletExtensionsKt.toDecimal(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(16, 20)));
        long jActivationDate = CityAppletExtensionsKt.activationDate(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(20, 24)));
        long jExpiredDate = CityAppletExtensionsKt.expiredDate(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(24, 28)));
        int iA = a();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        CardInfo cardInfo = new CardInfo(String.format("2000%08d", Arrays.copyOf(new Object[]{Integer.valueOf(decimal)}, 1)), jActivationDate, jExpiredDate, false, iA, 8, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(cardInfo), 1, null);
        return cardInfo;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getChargeRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        List<TransEntity> chargeRecords = INfcChannelExtensionsKt.getChargeRecords(this.channel, this.aid);
        INfcChannelExtensionsKt.selectWithException(this.channel, this.motAid);
        chargeRecords.addAll(INfcChannelExtensionsKt.getChargeRecords(this.channel, this.aid));
        return chargeRecords;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getTransRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        List<TransEntity> transRecords = INfcChannelExtensionsKt.getTransRecords(this.channel, this.aid);
        INfcChannelExtensionsKt.selectWithException(this.channel, this.motAid);
        transRecords.addAll(INfcChannelExtensionsKt.getTransRecords(this.channel, this.aid));
        return transRecords;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return INfcChannelExtensionsKt.isInstalled(this.channel, this.aid, this.path);
    }
}
