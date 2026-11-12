package com.xiaomi.fitness.nfc.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.nfc.bean.CardWrapper;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.manager.APDUOpenCommand;
import com.xiaomi.fitness.nfc.manager.ApduOpenManager;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import defpackage.jg1;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.s3q;
import defpackage.vqg;
import defpackage.x0d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/nfc/service/NfcBYDOpenService;", "Landroid/app/Service;", "<init>", "()V", "nfcBinder", "Lcom/xiaomi/fitness/nfc/service/NfcBYDOpenService$NfcBinder;", "mHandler", "Landroid/os/Handler;", "onCreate", "", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "check", "", "checkSign", "", "Companion", "NfcBinder", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcBYDOpenService extends Service {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String[] sSigns = {"fc38d60de58f9dea1851c6ec57abff2aed053e7c", "03E95B3EE3536E5518BEE86835A28AC8B3067FD3"};
    private Handler mHandler;

    @NotNull
    private NfcBinder nfcBinder = new NfcBinder();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/nfc/service/NfcBYDOpenService$Companion;", "", "<init>", "()V", "sSigns", "", "", "getSSigns", "()[Ljava/lang/String;", "[Ljava/lang/String;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getSSigns() {
            return NfcBYDOpenService.sSigns;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\b\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/nfc/service/NfcBYDOpenService$NfcBinder;", "Lx0d$a;", "", "getDeviceList", "()Ljava/lang/String;", "", "", "map", "executeCommands", "(Ljava/util/Map;)Ljava/lang/String;", "aid", "deleteCard", "(Ljava/lang/String;)Ljava/lang/String;", "getCplc", "open", Constants.EXTRA_CLOSE_TAI, "", "issueStart", "()V", "", "isSuccess", "issueEnd", "(Z)V", "<init>", "(Lcom/xiaomi/fitness/nfc/service/NfcBYDOpenService;)V", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nNfcBYDOpenService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NfcBYDOpenService.kt\ncom/xiaomi/fitness/nfc/service/NfcBYDOpenService$NfcBinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,304:1\n1863#2,2:305\n1863#2,2:307\n*S KotlinDebug\n*F\n+ 1 NfcBYDOpenService.kt\ncom/xiaomi/fitness/nfc/service/NfcBYDOpenService$NfcBinder\n*L\n65#1:305,2\n134#1:307,2\n*E\n"})
    public final class NfcBinder extends x0d.a {
        public NfcBinder() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void deleteCard$lambda$10() {
            NfcEventModule.INSTANCE.syncCardNumber();
        }

        @Override // defpackage.x0d
        @NotNull
        public String close() throws JSONException {
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            boolean zClose = ApduOpenManager.INSTANCE.close();
            jSONObject.put("resultCode", 0);
            jSONObject.put("resultMsg", "success");
            jSONObject.put("data", zClose);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        @Override // defpackage.x0d
        @NotNull
        public String deleteCard(@NotNull String aid) throws Exception {
            Intrinsics.checkNotNullParameter(aid, "aid");
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            CardWrapper cardWrapperT = s3q.f0().T(aid, CardCategory.PROPRIETARY_CAR_KEY);
            if (cardWrapperT == null) {
                jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSInvalidParam());
                jSONObject.put("resultMsg", "productId must not null");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            vqg.d("NfcBYDOpenService deleteCard start to delete");
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                BaseResponse baseResponseDelete = cardWrapperT.delete();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                vqg.d("NfcBYDOpenService deleteCard end code:" + baseResponseDelete.mResultCode + " msg:" + baseResponseDelete.mMsg);
                if (baseResponseDelete.isSuccess()) {
                    ltg.c().l(aid, 8);
                    s3q.f0().X();
                    Handler handler = NfcBYDOpenService.this.mHandler;
                    if (handler == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                        handler = null;
                    }
                    handler.post(new Runnable() { // from class: com.xiaomi.fitness.nfc.service.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            NfcBYDOpenService.NfcBinder.deleteCard$lambda$10();
                        }
                    });
                    jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSSuccessCode());
                    jSONObject.put("resultMsg", "success");
                } else {
                    jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSUnknown());
                    jSONObject.put("resultMsg", "error");
                }
                String string2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }

        @Override // defpackage.x0d
        @NotNull
        public String executeCommands(@Nullable Map<Object, Object> map) throws JSONException {
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            Intrinsics.checkNotNull(map);
            NfcServiceConstants nfcServiceConstants = NfcServiceConstants.INSTANCE;
            Object obj = map.get(nfcServiceConstants.getSKeyIsExpect());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = map.get(nfcServiceConstants.getSKeyCommands());
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
            ArrayList arrayList = (ArrayList) obj2;
            ArrayList arrayList2 = (ArrayList) map.get(nfcServiceConstants.getSKeyExpectCommands());
            if (zBooleanValue) {
                jSONObject.put("resultCode", nfcServiceConstants.getSInvalidParam());
                if (arrayList2 == null) {
                    jSONObject.put("resultMsg", "expectCommands is null");
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    return string;
                }
                if (arrayList.size() != arrayList2.size()) {
                    jSONObject.put("resultMsg", "command size not equal expectCommands");
                    String string2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return string2;
                }
            }
            ArrayList<String> arrayListExecute = ApduOpenManager.INSTANCE.execute(new APDUOpenCommand(zBooleanValue, arrayList, arrayList2));
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            if (arrayListExecute == null) {
                jSONObject2.put("resultCode", nfcServiceConstants.getSUnknown());
                jSONObject2.put("resultMsg", "execute apdu cmd err");
            } else {
                Iterator<T> it = arrayListExecute.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject2.put("resultCode", 0);
                jSONObject2.put("resultMsg", "success");
                jSONObject2.put("data", jSONArray);
            }
            String string3 = jSONObject2.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            vqg.d("result = " + string3);
            return string3;
        }

        @Override // defpackage.x0d
        @NotNull
        public String getCplc() throws JSONException {
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null) {
                jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSNoConnect());
                jSONObject.put("resultMsg", "no device");
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return string;
            }
            if (!wearableDeviceModel.getIsDeviceConnected()) {
                jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSNoConnect());
                jSONObject.put("resultMsg", "no device connection");
                String string2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
            s3q.f0().t0(wearableDeviceModel);
            String strB0 = s3q.f0().b0();
            if (strB0 == null) {
                jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSUnknown());
                jSONObject.put("resultMsg", "get cplc err");
            } else {
                jSONObject.put("resultCode", 0);
                jSONObject.put("resultMsg", "success");
                jSONObject.put("data", strB0);
            }
            String string3 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            return string3;
        }

        @Override // defpackage.x0d
        @NotNull
        public String getDeviceList() throws JSONException {
            vqg.d("NfcBYDOpenService getDeviceList start");
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                Pair<String, List<WearableDeviceModel>> curAndDeviceModels = NfcServiceUtils.INSTANCE.getCurAndDeviceModels();
                String strComponent1 = curAndDeviceModels.component1();
                List<WearableDeviceModel> listComponent2 = curAndDeviceModels.component2();
                JSONArray jSONArray = new JSONArray();
                for (WearableDeviceModel wearableDeviceModel : listComponent2) {
                    if (NfcUtils.isSupportNfc(wearableDeviceModel)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", wearableDeviceModel.getDid());
                        jSONObject2.put("model", wearableDeviceModel.getAlias());
                        boolean z = true;
                        jSONObject2.put("type", DeviceModelExtKt.isBandType(wearableDeviceModel) ? 1 : 2);
                        jSONObject2.put("name", DeviceModelExtKt.getName(wearableDeviceModel));
                        jSONObject2.put("isConnection", wearableDeviceModel.getIsDeviceConnected());
                        int deviceCapabilityV2 = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(wearableDeviceModel.getDid());
                        if ((deviceCapabilityV2 & 512) == 0) {
                            z = false;
                        }
                        vqg.d("NfcBYDOpenService isSupportBYD:" + z + " " + DeviceModelExtKt.getName(wearableDeviceModel) + " " + deviceCapabilityV2);
                        jSONObject2.put("isSupportBYD", z);
                        jSONArray.put(jSONObject2);
                    }
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("curDid", strComponent1);
                jSONObject3.put("deviceList", jSONArray);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("resultCode", 0);
                jSONObject4.put("resultMsg", "success");
                jSONObject4.put("data", jSONObject3);
                String string = jSONObject4.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                vqg.d("result = " + string);
                return string;
            } catch (Exception e) {
                vqg.c("NfcBYDOpenService getDeviceList", e);
                jSONObject.put("resultCode", 0);
                jSONObject.put("resultMsg", "unkwon");
                String string2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return string2;
            }
        }

        @Override // defpackage.x0d
        public void issueEnd(boolean isSuccess) {
            ltg.c().s(8, isSuccess ? 1 : 2);
        }

        @Override // defpackage.x0d
        public void issueStart() {
            ltg.c().s(8, 0);
        }

        @Override // defpackage.x0d
        @NotNull
        public String open() throws JSONException {
            String strCheck = NfcBYDOpenService.this.check();
            if (strCheck != null) {
                return strCheck;
            }
            JSONObject jSONObject = new JSONObject();
            s3q.f0().t0((WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel());
            boolean zOpen = ApduOpenManager.INSTANCE.open();
            jSONObject.put("resultCode", 0);
            jSONObject.put("resultMsg", "success");
            jSONObject.put("data", zOpen);
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    private final boolean checkSign() {
        String[] packagesForUid = getPackageManager().getPackagesForUid(Binder.getCallingUid());
        Intrinsics.checkNotNull(packagesForUid);
        String strC = null;
        for (String str : packagesForUid) {
            strC = jg1.c(this, str, "SHA1");
            if (strC != null) {
                break;
            }
        }
        vqg.d("calling app sign:" + strC);
        String[] strArr = sSigns;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (StringsKt__StringsJVMKt.equals(strArr[i], strC, true)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String check() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!checkSign()) {
            jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSNoSign());
            jSONObject.put("resultMsg", AppUtil.getApp().getString(o0j.l5));
            return jSONObject.toString();
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            return null;
        }
        jSONObject.put("resultCode", NfcServiceConstants.INSTANCE.getSNotLogin());
        jSONObject.put("resultMsg", AppUtil.getApp().getString(o0j.r1));
        return jSONObject.toString();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent p0) {
        return this.nfcBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mHandler = new Handler();
    }
}
