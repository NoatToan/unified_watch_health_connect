package com.xiaomi.fitness.nfc.utils;

import android.app.Application;
import android.text.TextUtils;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.service.mi.common.MiPayStatus;
import com.service.mi.entity.SpError;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.bean.yoyo.CardInfoRequest;
import com.xiaomi.fitness.nfc.exception.NfcException;
import com.xiaomi.fitness.nfc.export.NfcManager;
import com.xiaomi.fitness.nfc.export.NfcManagerExtKt;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import defpackage.o0j;
import defpackage.vqg;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\"\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0007J,\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0007J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/nfc/utils/NfcUtils;", "", "<init>", "()V", "isSupportNfc", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "isSupportMasterCard", "getPushId", "", "isYoYoApiSuccess", TSMAuthContants.PARAM_RESP_CODE, "getYoYoCardErrorMsg", "getYoYoCardFace", "path", "getCardStatusMsg", "", "cardWrapper", "Lcom/xiaomi/fitness/nfc/bean/CardWrapper;", "payName", "isShowCard", "getMasterErrorMsg", "resultCode", "reasonList", "", "Lcom/service/mi/entity/SpError;", "getVisaErrorMsg", "request", "getBankCardDeleteErrorMsg", "buildCardInfo", "Lcom/xiaomi/fitness/nfc/bean/yoyo/CardInfoRequest;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcUtils {

    @NotNull
    public static final NfcUtils INSTANCE = new NfcUtils();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SeCardStatus.values().length];
            try {
                iArr[SeCardStatus.NEGATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SeCardStatus.IN_BLACKLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SeCardStatus.DATA_ILLEGAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SeCardStatus.START_DATE_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SeCardStatus.END_DATE_INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private NfcUtils() {
    }

    @JvmStatic
    @NotNull
    public static final CardInfoRequest buildCardInfo() throws NfcException {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            vqg.d("YoYoCardViewModel createNewCard deviceModel is null");
            throw new NfcException(ResourceExtKt.getString(o0j.q2));
        }
        String alias = wearableDeviceModel.getAlias();
        if (alias == null) {
            vqg.d("YoYoCardViewModel createNewCard alias is null");
            throw new NfcException(ResourceExtKt.getString(o0j.q2));
        }
        String cplc = NfcManagerExtKt.getInstance(NfcManager.INSTANCE).getCplc();
        if (cplc != null) {
            return new CardInfoRequest(cplc, wearableDeviceModel.getDid(), alias);
        }
        vqg.d("YoYoCardViewModel createNewCard cplc is null");
        throw new NfcException(ResourceExtKt.getString(o0j.common_hint_unkonwn_error));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r2.equals("7003") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r2.equals("7002") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r2.equals("7001") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r2.equals("6002") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r2.equals("6001") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r2 = com.xiaomi.fitness.common.extensions.ApplicationExtKt.getApplication().getString(defpackage.o0j.X5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r2.equals(com.chinaums.pppay.unify.UnifyPayListener.ERR_COMM) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r2.equals("8002") == false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getBankCardDeleteErrorMsg(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            java.lang.String r0 = "resultCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.hashCode()
            java.lang.String r1 = "getString(...)"
            switch(r0) {
                case 1656379: goto L45;
                case 1656380: goto L3c;
                case 1686170: goto L33;
                case 1686171: goto L2a;
                case 1686172: goto L21;
                case 1715962: goto L18;
                case 1754688: goto Lf;
                default: goto Le;
            }
        Le:
            goto L4d
        Lf:
            java.lang.String r0 = "9999"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L4d
            goto L5b
        L18:
            java.lang.String r0 = "8002"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L4d
        L21:
            java.lang.String r0 = "7003"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L4d
        L2a:
            java.lang.String r0 = "7002"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L4d
        L33:
            java.lang.String r0 = "7001"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L4d
        L3c:
            java.lang.String r0 = "6002"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L4d
        L45:
            java.lang.String r0 = "6001"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
        L4d:
            android.app.Application r2 = com.xiaomi.fitness.common.extensions.ApplicationExtKt.getApplication()
            int r0 = defpackage.o0j.Y5
            java.lang.String r2 = r2.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            goto L68
        L5b:
            android.app.Application r2 = com.xiaomi.fitness.common.extensions.ApplicationExtKt.getApplication()
            int r0 = defpackage.o0j.X5
            java.lang.String r2 = r2.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
        L68:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.utils.NfcUtils.getBankCardDeleteErrorMsg(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @NotNull
    public static final String getMasterErrorMsg(@Nullable String resultCode, @Nullable List<SpError> reasonList) {
        if (Intrinsics.areEqual(resultCode, MiPayStatus.STATUS_REQUEST_FAILURE.getStatus())) {
            String string = ApplicationExtKt.getApplication().getString(o0j.H3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (Intrinsics.areEqual(resultCode, MiPayStatus.STATUS_BIZ_ERROR.getStatus())) {
            String string2 = AppUtil.getApp().getString(o0j.q4);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (Intrinsics.areEqual(resultCode, MiPayStatus.STATUS_PARAMS_IS_NULL.getStatus())) {
            String string3 = AppUtil.getApp().getString(o0j.r4);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (Intrinsics.areEqual(resultCode, MiPayStatus.STATUS_TASK_ID_IS_NULL.getStatus())) {
            String string4 = AppUtil.getApp().getString(o0j.s4);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_PARARM) || Intrinsics.areEqual(resultCode, "1006") || Intrinsics.areEqual(resultCode, "1007") || Intrinsics.areEqual(resultCode, "6001") || Intrinsics.areEqual(resultCode, "6002") || Intrinsics.areEqual(resultCode, "6003") || Intrinsics.areEqual(resultCode, "6004") || Intrinsics.areEqual(resultCode, "6005") || Intrinsics.areEqual(resultCode, "6006") || Intrinsics.areEqual(resultCode, "7001") || Intrinsics.areEqual(resultCode, "7002") || Intrinsics.areEqual(resultCode, "7003") || Intrinsics.areEqual(resultCode, "8001") || Intrinsics.areEqual(resultCode, "8002") || Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_COMM)) {
            String string5 = ApplicationExtKt.getApplication().getString(o0j.D3);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_SENT_FAILED)) {
            String string6 = ApplicationExtKt.getApplication().getString(o0j.G3);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            return string6;
        }
        if (Intrinsics.areEqual(resultCode, "1005")) {
            String string7 = ApplicationExtKt.getApplication().getString(o0j.E3);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            return string7;
        }
        if (Intrinsics.areEqual(resultCode, "2000")) {
            List<SpError> list = reasonList;
            if (list != null && !list.isEmpty()) {
                String reasonCode = reasonList.get(0).getReasonCode();
                if (reasonCode != null) {
                    switch (reasonCode.hashCode()) {
                        case -1743198940:
                            if (reasonCode.equals("INCORRECT_CODE_RETRIES_EXCEEDED")) {
                                String string8 = AppUtil.getApp().getString(o0j.d4);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                                return string8;
                            }
                            break;
                        case -1344203972:
                            if (reasonCode.equals("EXPIRED_SESSION")) {
                                String string9 = AppUtil.getApp().getString(o0j.c4);
                                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                                return string9;
                            }
                            break;
                        case -1252958167:
                            if (reasonCode.equals("INVALID_PUSH_ACCOUNT_RECEIPT")) {
                                String string10 = AppUtil.getApp().getString(o0j.g4);
                                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                                return string10;
                            }
                            break;
                        case -939221250:
                            if (reasonCode.equals("PAN_INELIGIBLE")) {
                                String string11 = AppUtil.getApp().getString(o0j.j4);
                                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                                return string11;
                            }
                            break;
                        case -789664338:
                            if (reasonCode.equals("NO_RESPONSE_FROM_ISSUER")) {
                                String string12 = AppUtil.getApp().getString(o0j.h4);
                                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                                return string12;
                            }
                            break;
                        case -511162649:
                            if (reasonCode.equals("EXPIRED_CODE")) {
                                String string13 = AppUtil.getApp().getString(o0j.i4);
                                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                                return string13;
                            }
                            break;
                        case 859615183:
                            if (reasonCode.equals("INCORRECT_TAV")) {
                                String string14 = AppUtil.getApp().getString(o0j.e4);
                                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                                return string14;
                            }
                            break;
                        case 877773415:
                            if (reasonCode.equals("INCORRECT_CODE")) {
                                String string15 = AppUtil.getApp().getString(o0j.f4);
                                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                                return string15;
                            }
                            break;
                        case 1097771661:
                            if (reasonCode.equals("PAN_INELIGIBLE_FOR_DEVICE")) {
                                String string16 = AppUtil.getApp().getString(o0j.k4);
                                Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
                                return string16;
                            }
                            break;
                        case 1201085973:
                            if (reasonCode.equals("INVALID_PAN")) {
                                String string17 = AppUtil.getApp().getString(o0j.l4);
                                Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
                                return string17;
                            }
                            break;
                        case 1628989211:
                            if (reasonCode.equals("DUPLICATE_REQUEST")) {
                                String string18 = AppUtil.getApp().getString(o0j.x3);
                                Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
                                return string18;
                            }
                            break;
                    }
                }
                String string19 = AppUtil.getApp().getString(o0j.v3);
                Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
                return string19;
            }
        } else {
            if (Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_ORDER_PROCESS) || Intrinsics.areEqual(resultCode, "2201") || Intrinsics.areEqual(resultCode, "2202")) {
                String string20 = ApplicationExtKt.getApplication().getString(o0j.v3);
                Intrinsics.checkNotNullExpressionValue(string20, "getString(...)");
                return string20;
            }
            if (Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_ORDER_DUPLICATE) || Intrinsics.areEqual(resultCode, UnifyPayListener.ERR_PAY_FAIL) || Intrinsics.areEqual(resultCode, "2100")) {
                String string21 = ApplicationExtKt.getApplication().getString(o0j.J3);
                Intrinsics.checkNotNullExpressionValue(string21, "getString(...)");
                return string21;
            }
            if (Intrinsics.areEqual(resultCode, "3002")) {
                String string22 = ApplicationExtKt.getApplication().getString(o0j.L3);
                Intrinsics.checkNotNullExpressionValue(string22, "getString(...)");
                return string22;
            }
            if (Intrinsics.areEqual(resultCode, "3003")) {
                String string23 = ApplicationExtKt.getApplication().getString(o0j.z3);
                Intrinsics.checkNotNullExpressionValue(string23, "getString(...)");
                return string23;
            }
            if (Intrinsics.areEqual(resultCode, "3004")) {
                String string24 = ApplicationExtKt.getApplication().getString(o0j.A3);
                Intrinsics.checkNotNullExpressionValue(string24, "getString(...)");
                return string24;
            }
            if (Intrinsics.areEqual(resultCode, "3006")) {
                String string25 = ApplicationExtKt.getApplication().getString(o0j.x3);
                Intrinsics.checkNotNullExpressionValue(string25, "getString(...)");
                return string25;
            }
            if (Intrinsics.areEqual(resultCode, AMap3DTileBuildType.TRAIN_STATION) || Intrinsics.areEqual(resultCode, AMap3DTileBuildType.COACH_STATION) || Intrinsics.areEqual(resultCode, AMap3DTileBuildType.AIRPORT_TERMINAL) || Intrinsics.areEqual(resultCode, "3104") || Intrinsics.areEqual(resultCode, "3105") || Intrinsics.areEqual(resultCode, "3106") || Intrinsics.areEqual(resultCode, "3107")) {
                String string26 = ApplicationExtKt.getApplication().getString(o0j.C3);
                Intrinsics.checkNotNullExpressionValue(string26, "getString(...)");
                return string26;
            }
            if (Intrinsics.areEqual(resultCode, "9997")) {
                String string27 = ApplicationExtKt.getApplication().getString(o0j.K3);
                Intrinsics.checkNotNullExpressionValue(string27, "getString(...)");
                return string27;
            }
            if (Intrinsics.areEqual(resultCode, "500") || Intrinsics.areEqual(resultCode, "503")) {
                String string28 = ApplicationExtKt.getApplication().getString(o0j.d8);
                Intrinsics.checkNotNullExpressionValue(string28, "getString(...)");
                return string28;
            }
            if (Intrinsics.areEqual(resultCode, "2200")) {
                List<SpError> list2 = reasonList;
                if (list2 != null && !list2.isEmpty()) {
                    String reasonCode2 = reasonList.get(0).getReasonCode();
                    if (reasonCode2 != null) {
                        switch (reasonCode2.hashCode()) {
                            case -2144752811:
                                if (reasonCode2.equals("notAllowed")) {
                                    String string29 = ApplicationExtKt.getApplication().getString(o0j.I3);
                                    Intrinsics.checkNotNullExpressionValue(string29, "getString(...)");
                                    return string29;
                                }
                                break;
                            case -1309235419:
                                if (reasonCode2.equals("expired")) {
                                    String string30 = ApplicationExtKt.getApplication().getString(o0j.M3);
                                    Intrinsics.checkNotNullExpressionValue(string30, "getString(...)");
                                    return string30;
                                }
                                break;
                            case -328547176:
                                if (reasonCode2.equals("staleCardMetadata")) {
                                    String string31 = ApplicationExtKt.getApplication().getString(o0j.w3);
                                    Intrinsics.checkNotNullExpressionValue(string31, "getString(...)");
                                    return string31;
                                }
                                break;
                            case -29634361:
                                if (reasonCode2.equals("msrNotSupported")) {
                                    String string32 = ApplicationExtKt.getApplication().getString(o0j.y3);
                                    Intrinsics.checkNotNullExpressionValue(string32, "getString(...)");
                                    return string32;
                                }
                                break;
                            case 252012698:
                                if (reasonCode2.equals("cardNotEligible")) {
                                    String string33 = ApplicationExtKt.getApplication().getString(o0j.y3);
                                    Intrinsics.checkNotNullExpressionValue(string33, "getString(...)");
                                    return string33;
                                }
                                break;
                            case 632840270:
                                if (reasonCode2.equals("Declined")) {
                                    String string34 = ApplicationExtKt.getApplication().getString(o0j.y3);
                                    Intrinsics.checkNotNullExpressionValue(string34, "getString(...)");
                                    return string34;
                                }
                                break;
                            case 1171746437:
                                if (reasonCode2.equals("cardNotAllowed")) {
                                    String string35 = ApplicationExtKt.getApplication().getString(o0j.y3);
                                    Intrinsics.checkNotNullExpressionValue(string35, "getString(...)");
                                    return string35;
                                }
                                break;
                            case 1180444530:
                                if (reasonCode2.equals("invalidParameter")) {
                                    String string36 = ApplicationExtKt.getApplication().getString(o0j.F3);
                                    Intrinsics.checkNotNullExpressionValue(string36, "getString(...)");
                                    return string36;
                                }
                                break;
                            case 1310956720:
                                if (reasonCode2.equals("cvmNotAvailable")) {
                                    String string37 = ApplicationExtKt.getApplication().getString(o0j.N3);
                                    Intrinsics.checkNotNullExpressionValue(string37, "getString(...)");
                                    return string37;
                                }
                                break;
                            case 1389552646:
                                if (reasonCode2.equals("provisionDataExpired")) {
                                    String string38 = ApplicationExtKt.getApplication().getString(o0j.w3);
                                    Intrinsics.checkNotNullExpressionValue(string38, "getString(...)");
                                    return string38;
                                }
                                break;
                            case 1822468456:
                                if (reasonCode2.equals("cardVerificationFailed")) {
                                    String string39 = ApplicationExtKt.getApplication().getString(o0j.B3);
                                    Intrinsics.checkNotNullExpressionValue(string39, "getString(...)");
                                    return string39;
                                }
                                break;
                        }
                    }
                    String string40 = AppUtil.getApp().getString(o0j.v3);
                    Intrinsics.checkNotNullExpressionValue(string40, "getString(...)");
                    return string40;
                }
            } else if (Intrinsics.areEqual(resultCode, "3002")) {
                String string41 = ApplicationExtKt.getApplication().getString(o0j.h2);
                Intrinsics.checkNotNullExpressionValue(string41, "getString(...)");
                return string41;
            }
        }
        Application app = AppUtil.getApp();
        int i = o0j.t4;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(resultCode)) {
            resultCode = "";
        } else {
            Intrinsics.checkNotNull(resultCode);
        }
        objArr[0] = resultCode;
        String string42 = app.getString(i, objArr);
        Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
        return string42;
    }

    @JvmStatic
    @NotNull
    public static final String getPushId() {
        return "123456";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:218:0x0411  */
    /* JADX WARN: Code duplicated, block: B:252:0x049f  */
    /* JADX WARN: Code duplicated, block: B:326:0x05e6  */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0426, code lost:
    
        if (r13.equals("confirmProvisioning") == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04b4, code lost:
    
        if (r13.equals("provisionToken") == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04b8, code lost:
    
        r13 = r14.getReasonCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04bc, code lost:
    
        if (r13 == null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04c2, code lost:
    
        switch(r13.hashCode()) {
            case -2144752811: goto L295;
            case -328547176: goto L291;
            case -29634361: goto L287;
            case 252012698: goto L283;
            case 336004179: goto L278;
            case 632840270: goto L274;
            case 1171746437: goto L270;
            case 1389552646: goto L266;
            case 1822468456: goto L262;
            default: goto L299;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04cb, code lost:
    
        if (r13.equals("cardVerificationFailed") != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04cf, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.Q7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04df, code lost:
    
        if (r13.equals("provisionDataExpired") != false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04e3, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.U7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04f3, code lost:
    
        if (r13.equals("cardNotAllowed") != false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04f7, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.O7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0507, code lost:
    
        if (r13.equals("Declined") != false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x050b, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.R7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x051b, code lost:
    
        if (r13.equals("serviceError") != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x051e, code lost:
    
        r13 = com.xiaomi.fitness.common.extensions.ApplicationExtKt.getApplication().getString(defpackage.o0j.d8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, "getString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x052b, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0530, code lost:
    
        if (r13.equals("cardNotEligible") != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0533, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.P7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0542, code lost:
    
        if (r13.equals("msrNotSupported") != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0545, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.S7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0554, code lost:
    
        if (r13.equals("staleCardMetadata") != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0557, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.V7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0566, code lost:
    
        if (r13.equals("notAllowed") != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0569, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.T7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0574, code lost:
    
        r13 = com.xiaomi.fitness.common.utils.AppUtil.getApp().getString(defpackage.o0j.v3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x057e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getVisaErrorMsg(@org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.Nullable java.lang.String r14, @org.jetbrains.annotations.Nullable java.util.List<com.service.mi.entity.SpError> r15) {
        /*
            Method dump skipped, instruction units count: 2220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.nfc.utils.NfcUtils.getVisaErrorMsg(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    @JvmStatic
    @NotNull
    public static final String getYoYoCardErrorMsg(@NotNull String respCode) {
        Intrinsics.checkNotNullParameter(respCode, "respCode");
        int iHashCode = respCode.hashCode();
        if (iHashCode != 1536) {
            return iHashCode != 1571 ? ResourceExtKt.getString(o0j.B7) : ResourceExtKt.getString(o0j.B7);
        }
        if (respCode.equals("00")) {
            return ResourceExtKt.getString(o0j.C2);
        }
        return ResourceExtKt.getString(o0j.common_hint_unkonwn_error);
    }

    @JvmStatic
    @NotNull
    public static final String getYoYoCardFace(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return "https://ezotat.easycard.com.tw" + path;
    }

    @JvmStatic
    public static final boolean isSupportMasterCard(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return DeviceModelExtKt.isSupportFeature(deviceModel, Feature.MASTERCARD);
    }

    @JvmStatic
    public static final boolean isSupportNfc(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return DeviceModelExtKt.isSupportFeature(deviceModel, "nfc");
    }

    @JvmStatic
    public static final boolean isYoYoApiSuccess(@NotNull String respCode) {
        Intrinsics.checkNotNullParameter(respCode, "respCode");
        return Intrinsics.areEqual(respCode, "00");
    }

    public final int getCardStatusMsg(@NotNull CardWrapper cardWrapper) {
        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
        SeCardStatus seCardStatus = cardWrapper.mStatus;
        int i = seCardStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[seCardStatus.ordinal()];
        if (i == 1) {
            return o0j.C;
        }
        if (i == 2) {
            return o0j.A;
        }
        if (i == 3) {
            return o0j.y;
        }
        if (i == 4) {
            return o0j.E;
        }
        if (i == 5) {
            return o0j.z;
        }
        if (IssuedTransCardDetailOptionView.t) {
            return -1;
        }
        return o0j.B;
    }

    public final boolean isShowCard(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        if (!DeviceModelExtKt.isHuaMi(deviceModel)) {
            return RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) ? DeviceModelExtKt.isSupportFeature(deviceModel, "nfc") : DeviceModelExtKt.isSupportFeature(deviceModel, Feature.MASTERCARD);
        }
        if (RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) {
            return DeviceModelExtKt.isSupportFeature(deviceModel, "nfc");
        }
        HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(DeviceModelExtKt.getMac(deviceModel));
        if (huaMiApiCaller == null || !huaMiApiCaller.isMiliMainLand()) {
            return DeviceModelExtKt.isSupportFeature(deviceModel, Feature.MASTERCARD);
        }
        return false;
    }

    @NotNull
    public final String payName() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null && DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD) && AppUtil.INSTANCE.isPlayChannel()) {
            String string = AppUtil.getApp().getString(o0j.c7);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = AppUtil.getApp().getString(o0j.a3);
        Intrinsics.checkNotNull(string2);
        return string2;
    }
}
