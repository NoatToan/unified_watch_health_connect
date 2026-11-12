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
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\f\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\"\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001cR\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c¨\u0006&"}, d2 = {"Lcom/huami/nfc/applet/city/QingDao;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "", "source", "b", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "Ljava/lang/String;", "aid", "c", "motAid", GoogleApiAvailabilityLight.a, "path", "", "", "e", "Ljava/util/Map;", "factor1", "f", "factor2", "g", "factor3", "h", "factor4", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class QingDao implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String aid = ConstantKt.AID_QING_DAO;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String motAid = "A00000063201010526600051494E4744";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String path = "00A40000023F01";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Map<Character, Integer> factor1 = r.mapOf(TuplesKt.to('0', 5), TuplesKt.to('1', 6), TuplesKt.to('2', 8), TuplesKt.to('3', 1), TuplesKt.to('4', 0), TuplesKt.to('5', 2), TuplesKt.to('6', 3), TuplesKt.to('7', 7), TuplesKt.to('8', 9), TuplesKt.to('9', 4));

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Map<Character, Integer> factor2 = r.mapOf(TuplesKt.to('0', 4), TuplesKt.to('1', 8), TuplesKt.to('2', 1), TuplesKt.to('3', 3), TuplesKt.to('4', 7), TuplesKt.to('5', 2), TuplesKt.to('6', 5), TuplesKt.to('7', 9), TuplesKt.to('8', 0), TuplesKt.to('9', 6));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Map<Character, Integer> factor3 = r.mapOf(TuplesKt.to('0', 1), TuplesKt.to('1', 7), TuplesKt.to('2', 2), TuplesKt.to('3', 6), TuplesKt.to('4', 8), TuplesKt.to('5', 5), TuplesKt.to('6', 9), TuplesKt.to('7', 3), TuplesKt.to('8', 4), TuplesKt.to('9', 0));

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Character, Integer> factor4 = r.mapOf(TuplesKt.to('0', 7), TuplesKt.to('1', 9), TuplesKt.to('2', 0), TuplesKt.to('3', 3), TuplesKt.to('4', 1), TuplesKt.to('5', 2), TuplesKt.to('6', 6), TuplesKt.to('7', 8), TuplesKt.to('8', 4), TuplesKt.to('9', 5));

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

    public QingDao(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() {
        int amount = CityAppletExtensionsKt.toAmount(INfcChannelExtensionsKt.subData(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 4)));
        LogcatKt.info$default(Logcat.INSTANCE, null, new a(amount), 1, null);
        return amount;
    }

    private final String b(String source) {
        int i = 0;
        for (int i2 = 0; i2 < source.length(); i2++) {
            char cCharAt = source.charAt(i2);
            i += Integer.parseInt(String.valueOf(cCharAt)) + ((Number) MapsKt.getValue(this.factor1, Character.valueOf(cCharAt))).intValue();
        }
        int i3 = (i + 31) % 9;
        int i4 = 0;
        for (int i5 = 0; i5 < source.length(); i5++) {
            char cCharAt2 = source.charAt(i5);
            i4 += Integer.parseInt(String.valueOf(cCharAt2)) + ((Number) MapsKt.getValue(this.factor2, Character.valueOf(cCharAt2))).intValue();
        }
        int i6 = (i4 + 31) % 9;
        int i7 = 0;
        for (int i8 = 0; i8 < source.length(); i8++) {
            char cCharAt3 = source.charAt(i8);
            i7 += Integer.parseInt(String.valueOf(cCharAt3)) + ((Number) MapsKt.getValue(this.factor3, Character.valueOf(cCharAt3))).intValue();
        }
        int i9 = (i7 + 31) % 9;
        int i10 = 0;
        for (int i11 = 0; i11 < source.length(); i11++) {
            char cCharAt4 = source.charAt(i11);
            i10 += Integer.parseInt(String.valueOf(cCharAt4)) + ((Number) MapsKt.getValue(this.factor4, Character.valueOf(cCharAt4))).intValue();
        }
        return source + i3 + i6 + i9 + ((i10 + 31) % 9);
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
        String strSubData = INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(14, 16));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        CardInfo cardInfo = new CardInfo(b(Intrinsics.stringPlus(strSubData, String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(CityAppletExtensionsKt.toDecimal(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(16, 20))))}, 1)))), CityAppletExtensionsKt.activationDate(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(20, 24))), CityAppletExtensionsKt.expiredDate(INfcChannelExtensionsKt.subData(strSendWithException, new IntRange(24, 28))), false, a(), 8, null);
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
