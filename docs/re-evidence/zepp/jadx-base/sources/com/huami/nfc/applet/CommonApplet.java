package com.huami.nfc.applet;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.dev.Logcat;
import com.huami.dev.LogcatKt;
import com.huami.nfc.applet.city.CityAppletExtensionsKt;
import com.huami.nfc.base.INfcChannel;
import com.huami.nfc.base.SeResponseErrorException;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/nfc/applet/CommonApplet;", "Lcom/huami/nfc/applet/ICommonApplet;", "", AbstractJSONTokenResponse.RESPONSE, "aid", "", "a", "b", "isDefault", "c", "getCplc", "activateCard", "activateCardBySearchSe", "activateCardByResponse", "Lcom/huami/nfc/applet/AppletState;", "getAppletState", "", "aids", "getAppletsState", "getActiveApplet", "getAppletStateFromSe", "getAppletInfoFromSe", "getLingNanTongCityCode", "Lcom/huami/nfc/base/INfcChannel;", "Lcom/huami/nfc/base/INfcChannel;", Constant.h, "<init>", "(Lcom/huami/nfc/base/INfcChannel;)V", "nfc-applet_release"}, k = 1, mv = {1, 5, 1})
public final class CommonApplet implements ICommonApplet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final INfcChannel cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return "check applet aid = " + this.a + ", active = " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            return Intrinsics.stringPlus("city code = ", this.a);
        }
    }

    public CommonApplet(@NotNull INfcChannel iNfcChannel) {
        this.cmd = iNfcChannel;
    }

    private final boolean a(String response, String aid) {
        List<Tlv> listBuildTlvsForFull = new TlvDecodeUtil().buildTlvsForFull(StringsKt___StringsKt.dropLast(response, 4));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listBuildTlvsForFull) {
            if (Intrinsics.areEqual(((Tlv) obj).getTag(), "A0")) {
                arrayList.add(obj);
            }
        }
        if (CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.send(this.cmd, c(((Tlv) CollectionsKt.first((List) new TlvDecodeUtil().buildTlvsForFull(((Tlv) arrayList.get(0)).getValue()))).getValue(), false)))) {
            return CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.send(this.cmd, c(aid, true)));
        }
        return false;
    }

    private final boolean b(String aid) {
        Object obj = null;
        for (Object obj2 : ICommonApplet.DefaultImpls.getAppletStateFromSe$default(this, null, 1, null)) {
            if (((AppletState) obj2).isActive()) {
                obj = obj2;
                break;
            }
        }
        AppletState appletState = (AppletState) obj;
        if (appletState != null && CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.send(this.cmd, c(appletState.getAid(), false)))) {
            return CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.send(this.cmd, c(aid, true)));
        }
        return false;
    }

    private final String c(String aid, boolean isDefault) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("4F%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(aid.length() / 2), aid}, 2));
        return isDefault ? String.format("80F00101%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2)) : String.format("80F00100%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2));
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCard(@NotNull String aid, boolean isDefault) throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        String strSend = INfcChannelExtensionsKt.send(this.cmd, c(aid, isDefault));
        if (CityAppletExtensionsKt.isSuccess(strSend)) {
            return true;
        }
        if (!isDefault) {
            return false;
        }
        if (m.endsWith$default(strSend, "6330", false, 2, null) && a(strSend, aid)) {
            return true;
        }
        return b(aid);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCardByResponse(@NotNull String aid, boolean isDefault) throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        String strSend = INfcChannelExtensionsKt.send(this.cmd, c(aid, isDefault));
        if (CityAppletExtensionsKt.isSuccess(strSend)) {
            return true;
        }
        return isDefault && m.endsWith$default(strSend, "6330", false, 2, null) && a(strSend, aid);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    public boolean activateCardBySearchSe(@NotNull String aid, boolean isDefault) throws SeResponseErrorException {
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        if (CityAppletExtensionsKt.isSuccess(INfcChannelExtensionsKt.send(this.cmd, c(aid, isDefault)))) {
            return true;
        }
        if (isDefault) {
            return b(aid);
        }
        return false;
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @Nullable
    public AppletState getActiveApplet() throws Exception {
        Object next;
        String value;
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        for (String str : BusCardExtensions.aidList()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean zEndsWith$default = false;
            String str2 = String.format("4F%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2));
            String strSend = INfcChannelExtensionsKt.send(this.cmd, String.format("80F24000%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str2.length() / 2), str2}, 2)));
            if (CityAppletExtensionsKt.isSuccess(strSend)) {
                Iterator<T> it2 = new TlvDecodeUtil().buildTlvsForFull(strSend).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Tlv) next).getTag(), "9F70"));
                Tlv tlv = (Tlv) next;
                if (tlv != null && (value = tlv.getValue()) != null) {
                    zEndsWith$default = m.endsWith$default(value, "01", false, 2, null);
                }
                LogcatKt.debug$default(Logcat.INSTANCE, null, new a(str, zEndsWith$default), 1, null);
                if (zEndsWith$default) {
                    return new AppletState(true, str);
                }
            }
        }
        return null;
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getAppletInfoFromSe() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        String strSend = INfcChannelExtensionsKt.send(this.cmd, "80F24000024F00");
        String strDropLast = StringsKt___StringsKt.dropLast(strSend, 4);
        while (m.endsWith$default(strSend, "6310", false, 2, null)) {
            strSend = INfcChannelExtensionsKt.send(this.cmd, "80F24003024F00");
            strDropLast = Intrinsics.stringPlus(strDropLast, StringsKt___StringsKt.dropLast(strSend, 4));
        }
        return strDropLast;
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public AppletState getAppletState(@NotNull String aid) throws SeResponseErrorException {
        Object next;
        String value;
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        boolean zEndsWith$default = false;
        String str = String.format("4F%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(aid.length() / 2), aid}, 2));
        Iterator<T> it2 = new TlvDecodeUtil().buildTlvsForFull(INfcChannelExtensionsKt.sendWithException(this.cmd, String.format("80F24000%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2)))).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((Tlv) next).getTag(), "9F70"));
        Tlv tlv = (Tlv) next;
        if (tlv != null && (value = tlv.getValue()) != null) {
            zEndsWith$default = m.endsWith$default(value, "01", false, 2, null);
        }
        return new AppletState(zEndsWith$default, aid);
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public List<AppletState> getAppletStateFromSe(@NotNull List<String> aids) throws Exception {
        boolean zEndsWith$default;
        Object next;
        Object next2;
        String value;
        Tlv tlv;
        String appletInfoFromSe = getAppletInfoFromSe();
        TlvDecodeUtil tlvDecodeUtil = new TlvDecodeUtil();
        List<Tlv> listBuildTlvsForFull = tlvDecodeUtil.buildTlvsForFull(appletInfoFromSe);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listBuildTlvsForFull) {
            if (Intrinsics.areEqual(((Tlv) obj).getTag(), "61")) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List<Tlv> listBuildTlvsForFull2 = tlvDecodeUtil.buildTlvsForFull(((Tlv) it2.next()).getValue());
            Iterator<T> it3 = listBuildTlvsForFull2.iterator();
            do {
                zEndsWith$default = false;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                tlv = (Tlv) next;
            } while (!(Intrinsics.areEqual(tlv.getTag(), "4F") && aids.contains(tlv.getValue())));
            Tlv tlv2 = (Tlv) next;
            if (tlv2 != null) {
                String value2 = tlv2.getValue();
                Iterator<T> it4 = listBuildTlvsForFull2.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!Intrinsics.areEqual(((Tlv) next2).getTag(), "9F70"));
                Tlv tlv3 = (Tlv) next2;
                if (tlv3 != null && (value = tlv3.getValue()) != null) {
                    zEndsWith$default = m.endsWith$default(value, "1", false, 2, null);
                }
                arrayList.add(new AppletState(zEndsWith$default, value2));
            }
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.distinct(arrayList));
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public List<AppletState> getAppletsState(@NotNull List<String> aids) throws Exception {
        Object next;
        String value;
        ArrayList arrayList = new ArrayList();
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A00000015143525300");
        for (String str : aids) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            boolean zEndsWith$default = false;
            String str2 = String.format("4F%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str.length() / 2), str}, 2));
            String strSend = INfcChannelExtensionsKt.send(this.cmd, String.format("80F24000%02x%s", Arrays.copyOf(new Object[]{Integer.valueOf(str2.length() / 2), str2}, 2)));
            if (CityAppletExtensionsKt.isSuccess(strSend)) {
                Iterator<T> it2 = new TlvDecodeUtil().buildTlvsForFull(strSend).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((Tlv) next).getTag(), "9F70"));
                Tlv tlv = (Tlv) next;
                if (tlv != null && (value = tlv.getValue()) != null) {
                    zEndsWith$default = m.endsWith$default(value, "01", false, 2, null);
                }
                arrayList.add(new AppletState(zEndsWith$default, str));
            } else {
                arrayList.add(new AppletState(false, str));
            }
        }
        return arrayList;
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getCplc() throws SeResponseErrorException {
        INfcChannelExtensionsKt.selectWithException(this.cmd, "A000000151000000");
        return StringsKt__StringsKt.substring(INfcChannelExtensionsKt.sendWithException(this.cmd, "80CA9F7F00"), new IntRange(6, 89));
    }

    @Override // com.huami.nfc.applet.ICommonApplet
    @NotNull
    public String getLingNanTongCityCode() throws Exception {
        INfcChannelExtensionsKt.selectWithException(this.cmd, ConstantKt.AID_LING_NAN_TONG);
        INfcChannelExtensionsKt.sendWithException(this.cmd, "00A4000002DDF1");
        String strSlice = StringsKt___StringsKt.slice(INfcChannelExtensionsKt.sendWithException(this.cmd, "00B0953101"), new IntRange(0, 1));
        LogcatKt.info$default(Logcat.INSTANCE, null, new b(strSlice), 1, null);
        return strSlice;
    }
}
