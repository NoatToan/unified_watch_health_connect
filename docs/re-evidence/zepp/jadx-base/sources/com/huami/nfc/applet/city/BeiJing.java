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
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/huami/nfc/applet/city/BeiJing;", "Lcom/huami/nfc/applet/city/ICityApplet;", "", "a", "", "isInstalled", "getBalance", "Lcom/huami/nfc/applet/CardInfo;", "getCardInfo", "", "Lcom/huami/nfc/applet/TransEntity;", "getTransRecord", "getChargeRecord", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", "channel", "", "b", "Ljava/lang/String;", "path", "c", "aid", "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class BeiJing implements ICityApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel channel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String path = "00A40000023F00";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String aid = ConstantKt.AID_BEI_JING;

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
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "trans time = " + this.a + ", " + CityAppletExtensionsKt.toDateString(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Object> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ TransEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.IntRef intRef, TransEntity transEntity) {
            super(0);
            this.a = intRef;
            this.b = transEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "==> Trans record from device index = " + this.a.element + " , " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Object> {
        public final /* synthetic */ List<TransEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<TransEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return Intrinsics.stringPlus("trans record = ", this.a);
        }
    }

    public BeiJing(@NotNull INfcChannel iNfcChannel) {
        this.channel = iNfcChannel;
    }

    private final int a() throws Exception {
        int amount = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.channel, "00B0850504"), new IntRange(0, 7)));
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A40000021001");
        int amount2 = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.channel, "805C000204"), new IntRange(0, 7)));
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
        String strSendWithException = INfcChannelExtensionsKt.sendWithException(this.channel, "00B0841808");
        CardInfo cardInfo = new CardInfo(StringsKt___StringsKt.dropLast(INfcChannelExtensionsKt.sendWithException(this.channel, "00B0840008"), 4), CityAppletExtensionsKt.activationDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(0, 7))), CityAppletExtensionsKt.expiredDate(StringsKt__StringsKt.substring(strSendWithException, new IntRange(8, 15))), false, a(), 8, null);
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(cardInfo), 1, null);
        return cardInfo;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getChargeRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A40000021001");
        Ref.IntRef intRef = new Ref.IntRef();
        int i = 1;
        intRef.element = 1;
        ArrayList arrayList = new ArrayList();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i2 = 0;
        String strSend = INfcChannelExtensionsKt.send(this.channel, String.format("00B2%02x9C00", Arrays.copyOf(new Object[]{Integer.valueOf(intRef.element)}, 1)));
        while (CityAppletExtensionsKt.isSuccess(strSend) && !CityAppletExtensionsKt.isLastRecord(strSend)) {
            if (Intrinsics.areEqual(StringsKt__StringsKt.substring(strSend, new IntRange(32, 33)), "01")) {
                int i3 = intRef.element + i;
                intRef.element = i3;
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Object[] objArr = new Object[i];
                objArr[i2] = Integer.valueOf(i3);
                strSend = INfcChannelExtensionsKt.send(this.channel, String.format("00B2%02x9C00", Arrays.copyOf(objArr, i)));
            } else {
                long timestamp = CityAppletExtensionsKt.toTimestamp(StringsKt__StringsKt.substring(strSend, new IntRange(32, 45)), "yyyyMMddHHmmss");
                Logcat logcat = Logcat.INSTANCE;
                LogcatKt.info$default(logcat, null, new c(timestamp), i, null);
                int amount = CityAppletExtensionsKt.toAmount(StringsKt__StringsKt.substring(strSend, new IntRange(10, 17)));
                int i4 = Integer.parseInt(StringsKt__StringsKt.substring(strSend, new IntRange(18, 19)));
                TransEntity transEntity = new TransEntity(strSend, this.aid, StringsKt__StringsKt.substring(strSend, new IntRange(i2, 3)), timestamp, amount, TransType.INSTANCE.from(i4), StringsKt__StringsKt.substring(strSend, new IntRange(20, 31)), 0, 128, null);
                arrayList.add(transEntity);
                LogcatKt.info$default(logcat, null, new d(intRef, transEntity), 1, null);
                int i5 = intRef.element + 1;
                intRef.element = i5;
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                strSend = INfcChannelExtensionsKt.send(this.channel, String.format("00B2%02x9C17", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)));
                i = 1;
                i2 = 0;
            }
        }
        LogcatKt.info$default(Logcat.INSTANCE, null, new e(arrayList), 1, null);
        return arrayList;
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    @NotNull
    public List<TransEntity> getTransRecord() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.channel, this.aid);
        INfcChannelExtensionsKt.sendWithException(this.channel, this.path);
        INfcChannelExtensionsKt.sendWithException(this.channel, "00A40000021001");
        return INfcChannelExtensionsKt.getTransRecords(this.channel, this.aid);
    }

    @Override // com.huami.nfc.applet.city.ICityApplet
    public boolean isInstalled() {
        return INfcChannelExtensionsKt.isInstalled(this.channel, this.aid, this.path);
    }
}
