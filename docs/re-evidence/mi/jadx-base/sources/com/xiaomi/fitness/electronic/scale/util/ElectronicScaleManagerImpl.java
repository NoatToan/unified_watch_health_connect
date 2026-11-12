package com.xiaomi.fitness.electronic.scale.util;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceConfigManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.electronic.scale.DataReportActivity;
import com.xiaomi.fitness.electronic.scale.MainViewModel;
import com.xiaomi.fitness.electronic.scale.config.sync.EightDeviceSyncImpl;
import com.xiaomi.fitness.electronic.scale.data.WeightResult;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelper;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleCMDHelperExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequest;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleRequestExtKt;
import com.xiaomi.fitness.electronic.scale.export.PullWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.SyncWeightRecordCallback;
import com.xiaomi.fitness.electronic.scale.export.bean.ProxyResponse;
import com.xiaomi.fitness.electronic.scale.export.bean.ScaleData;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.export.sp.ElectronicScalePreference;
import com.xiaomi.fitness.electronic.scale.manager.MiAccountManager;
import com.xiaomi.fitness.electronic.scale.manager.VirtualAccountHelper;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleManagerImpl;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.bu7;
import defpackage.f4b;
import defpackage.kb;
import defpackage.zzi;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J@\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\u0012\u0010\u0019\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J$\u0010 \u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J \u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0016J\u001a\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J \u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\f2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0016J(\u0010/\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u00100\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\tH\u0016J\u0018\u00105\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\fH\u0002J\u0010\u00106\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0002¨\u00068"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/util/ElectronicScaleManagerImpl;", "Lcom/xiaomi/fitness/electronic/scale/export/ElectronicScaleManager;", "<init>", "()V", "launchToElectronicScaleMainActivity", "", "context", "Landroid/content/Context;", "did", "", "mac", "fromBind", "", "launchToElectronicScaleUserInfoActivity", "launchToElectronicScaleUserManageActivity", "launchToElectronicScaleOTA", "launchToElectronicWeightActivity", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "syncElectronicScale", "launchToElectronicPairGuideActivity", "name", "shareId", "userId", "model", "initElectronicScale", "launchToDataReportActivity", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "syncRecord", "onSyncWeightRecordCallback", "Lcom/xiaomi/fitness/electronic/scale/export/SyncWeightRecordCallback;", "startConfigWifiActivity", "bytes", "", "getScalePrivacyUrl", "isProduct", "region", "locale", "goVirtualAccount", "localData", "Lorg/joda/time/LocalDate;", "pullRecord", "needMore", "pullWeightRecordCallback", "Ljava/lang/ref/SoftReference;", "Lcom/xiaomi/fitness/electronic/scale/export/PullWeightRecordCallback;", "launchToElectronicScaleWeightGuideActivity", "loadImageFromNet", "imageView", "Landroid/widget/ImageView;", "light", "night", "getEcoScalePrivacyHost", "getRegionPrefix", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nElectronicScaleManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElectronicScaleManagerImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleManagerImpl\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n54#2,3:344\n24#2:347\n57#2,6:348\n63#2,2:355\n54#2,3:357\n24#2:360\n57#2,6:361\n63#2,2:368\n57#3:354\n57#3:367\n774#4:370\n865#4,2:371\n1863#4,2:373\n*S KotlinDebug\n*F\n+ 1 ElectronicScaleManagerImpl.kt\ncom/xiaomi/fitness/electronic/scale/util/ElectronicScaleManagerImpl\n*L\n322#1:344,3\n322#1:347\n322#1:348,6\n322#1:355,2\n324#1:357,3\n324#1:360\n324#1:361,6\n324#1:368,2\n322#1:354\n324#1:367\n276#1:370\n276#1:371,2\n276#1:373,2\n*E\n"})
public final class ElectronicScaleManagerImpl implements ElectronicScaleManager {

    @NotNull
    public static final String HOST_SERVICE_PRIVACY = "https://%sres.eco.mi.com/";

    @NotNull
    public static final String HOST_SERVICE_PRIVACY_PREVIEW = "https://res.pre.mi.com/";

    @NotNull
    public static final String TAG = "ElectronicScaleImpl";

    private final String getEcoScalePrivacyHost(String region, boolean isProduct) {
        if (!isProduct) {
            return HOST_SERVICE_PRIVACY_PREVIEW;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(HOST_SERVICE_PRIVACY, Arrays.copyOf(new Object[]{getRegionPrefix(region)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String getRegionPrefix(String region) {
        if (Intrinsics.areEqual(region, "cn")) {
            return "";
        }
        return region + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goVirtualAccount$lambda$6(LocalDate localDate, Context context, ScaleData it) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(it, "it");
        JSONArray jSONArrayOptJSONArray = new JSONObject(it.getResp()).optJSONArray("result");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            List listB = bu7.b(jSONArrayOptJSONArray.toString(), VirtualAccount.class);
            Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type java.util.ArrayList<com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount>");
            arrayList = (ArrayList) listB;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((VirtualAccount) obj).getType() == 2) {
                arrayList3.add(obj);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList2.add((VirtualAccount) it2.next());
        }
        Logger.i(BaseFragment.TAG, "getVirtualAccount() list : " + new Gson().toJson(arrayList2));
        if (arrayList2.isEmpty()) {
            kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_ADD).withInt("KEY_PAGE_TYPE", 1).withInt(ElectronicScaleManagerExtKt.KEY_PAGE_FROM, 100).withSerializable("local_date", localDate).navigation(context);
        } else {
            kb.c().a("/electronic/activity/VirtualMemberData").withSerializable("local_date", localDate).navigation(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goVirtualAccount$lambda$7(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(BaseFragment.TAG, "getVirtualAccount() it : " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void syncRecord$lambda$3(final SyncWeightRecordCallback syncWeightRecordCallback) {
        final ArrayList arrayList = new ArrayList();
        VirtualAccountHelper.INSTANCE.queryByUid(new VirtualAccount(null, null, Long.parseLong(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()), 0L, null, null, false, false, 0, null, null, 0L, 0L, null, 0, 0, 0L, 0, 0.0f, 524283, null), new Function1() { // from class: z48
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ElectronicScaleManagerImpl.syncRecord$lambda$3$lambda$2(arrayList, syncWeightRecordCallback, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncRecord$lambda$3$lambda$2(final List virtualAccounts, final SyncWeightRecordCallback syncWeightRecordCallback, List it) throws JSONException {
        Intrinsics.checkNotNullParameter(virtualAccounts, "$virtualAccounts");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isEmpty()) {
            Logger.i(TAG, "addRecord() isNullOrEmpty");
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = it.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                VirtualAccount virtualAccount = (VirtualAccount) it2.next();
                if (!virtualAccount.isSyn()) {
                    virtualAccount.setSyn(true);
                    virtualAccounts.add(virtualAccount);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("did", virtualAccount.getDid());
                    jSONObject.put("model", virtualAccount.getModel());
                    WeightResult weightResult = (WeightResult) bu7.a(virtualAccount.getBodyComposition(), WeightResult.class);
                    jSONObject.put("data", weightResult != null ? weightResult.spliceAllProperties() : null);
                    jSONObject.put("createTime", virtualAccount.getCreateTime());
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray.length() < 1) {
                Logger.i(TAG, "addRecord() jsonArray is empty");
                AnyExtKt.main$default(null, new ElectronicScaleManagerImpl$syncRecord$1$1$1(syncWeightRecordCallback, null), 1, null);
            } else {
                Logger.i(TAG, "addRecord() jsonArray length " + jSONArray.length());
                MainViewModel mainViewModel = new MainViewModel();
                String string = jSONArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                mainViewModel.addRecord(string, new Function1() { // from class: v48
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ElectronicScaleManagerImpl.syncRecord$lambda$3$lambda$2$lambda$1(virtualAccounts, syncWeightRecordCallback, (ProxyResponse) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncRecord$lambda$3$lambda$2$lambda$1(List virtualAccounts, SyncWeightRecordCallback syncWeightRecordCallback, ProxyResponse it) {
        Intrinsics.checkNotNullParameter(virtualAccounts, "$virtualAccounts");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "addRecord() response:" + it.getCode() + it.getMessage());
        if (it.getCode() == 0) {
            AnyExtKt.main$default(null, new ElectronicScaleManagerImpl$syncRecord$1$1$2$1(syncWeightRecordCallback, null), 1, null);
        } else {
            AnyExtKt.main$default(null, new ElectronicScaleManagerImpl$syncRecord$1$1$2$2(syncWeightRecordCallback, null), 1, null);
        }
        VirtualAccountHelper.INSTANCE.updateList(virtualAccounts, new Function0() { // from class: y48
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ElectronicScaleManagerImpl.syncRecord$lambda$3$lambda$2$lambda$1$lambda$0();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit syncRecord$lambda$3$lambda$2$lambda$1$lambda$0() {
        Logger.i(TAG, "addRecord() updateList success");
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    @NotNull
    public String getScalePrivacyUrl(boolean isProduct, @NotNull String region, @NotNull String locale) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(locale, "locale");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/html/privacy/index.html?type=scale_privacy_policy&locale=%s", Arrays.copyOf(new Object[]{getEcoScalePrivacyHost(region, isProduct), locale}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void goVirtualAccount(@NotNull final Context context, @Nullable final LocalDate localData) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!NetworkExtKt.isNetworkAvailable()) {
            ToastUtil.showShortToast(ResourceExtKt.getString(zzi.g4));
            return;
        }
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
            if (!Intrinsics.areEqual(AccountManagerExtKt.getInstance(companion).getUserId(), "")) {
                ElectronicScaleRequest.DefaultImpls.getVirtualAccount$default(ElectronicScaleRequestExtKt.getInstance(ElectronicScaleRequest.INSTANCE), Long.parseLong(AccountManagerExtKt.getInstance(companion).getUserId()), null, new Function1() { // from class: w48
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ElectronicScaleManagerImpl.goVirtualAccount$lambda$6(localData, context, (ScaleData) obj);
                    }
                }, new Function1() { // from class: x48
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return ElectronicScaleManagerImpl.goVirtualAccount$lambda$7((ApiException) obj);
                    }
                }, 2, null);
                return;
            }
        }
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).accountLogin();
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void initElectronicScale(@Nullable String did) {
        String model;
        if (did == null) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null || (model = EcoDeviceModelExtKt.getModel(ecoDeviceModel)) == null || EcoDeviceModelExtKt.isEightScale(model)) {
            ElectronicScaleCMDHelperExtKt.getInstance(ElectronicScaleCMDHelper.INSTANCE).syncBindUer(did);
            ElectronicScalePreference.putBoolean(ElectronicScalePreference.SCALE_RECORD_CLOSE_KEY + did, false);
            ElectronicScalePreference.putBoolean(ElectronicScalePreference.SCALE_RECORD_BABY_GUIDE_KEY + did, false);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToDataReportActivity(@NotNull Context context, @NotNull WeightItem weightItem) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(weightItem, "weightItem");
        Logger.i("launchToDataReportActivity result " + f4b.c(weightItem), new Object[0]);
        WeightInfoUtil weightInfoUtil = WeightInfoUtil.INSTANCE;
        MiAccountManager.Companion companion = MiAccountManager.INSTANCE;
        VirtualAccount virtualAccountWeightItemToVirtualAccount = weightInfoUtil.weightItemToVirtualAccount(companion.getInstance().getMiId(), weightItem);
        Logger.i("launchToDataReportActivity virtualAccount result " + f4b.c(virtualAccountWeightItemToVirtualAccount), new Object[0]);
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_DATA_REPORT_ACTIVITY).withSerializable(DataReportActivity.KEY_BODY_RESULT, virtualAccountWeightItemToVirtualAccount).withInt(DataReportActivity.KEY_BODY_SEX, companion.getInstance().getSex()).withInt(DataReportActivity.KEY_BODY_AGE, companion.getInstance().getAge()).withInt(DataReportActivity.KEY_BODY_HEIGHT, (int) companion.getInstance().getHeight()).withBoolean(DataReportActivity.KEY_BODY_IS_MAIN_USER, true).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicPairGuideActivity(@NotNull Context context, @NotNull String mac, @NotNull String name, @NotNull String shareId, @NotNull String userId, @NotNull String did, @NotNull String model) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PAIR_GUIDE).withFlags(268435456).withString("key_device_address", mac).withString("key_device_name", name).withString("KEY_SHARE_ID", shareId).withString("KEY_SHARE_USER_ID", userId).withString("KEY_SHARE_DID", did).withString("KEY_SHARE_MODEL", model).withString("to", "").withInt("from", 4).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicScaleMainActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_MAIN).withFlags(268435456).withString("did", did).withString("mac", mac).withBoolean(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, fromBind).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicScaleOTA(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_OTA).withFlags(268435456).withString(ElectronicScaleManagerExtKt.PARAM_ONlY_DID, "406451477").navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicScaleUserInfoActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER_INFO).withFlags(268435456).withString("did", did).withString("mac", mac).withBoolean(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, fromBind).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicScaleUserManageActivity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_USER).withFlags(268435456).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicScaleWeightGuideActivity(@NotNull Context context, @NotNull String did, @NotNull String mac, boolean fromBind) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(mac, "mac");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_EIGHT_SCALE_WEIGHT_GUIDE).withFlags(268435456).withString("did", did).withString("mac", mac).withBoolean(ElectronicScaleManagerExtKt.PARAM_FROM_BIND, fromBind).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void launchToElectronicWeightActivity(@NotNull Context context, @NotNull Bundle bundle, @NotNull String did) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if (ecoDeviceModel == null) {
            Logger.i("launchToElectronicWeightActivity device model is null", new Object[0]);
        } else {
            kb.c().a(EcoDeviceConfigManagerExtKt.getInstance(EcoDeviceConfigManager.INSTANCE).ecoWeightActivityPath(EcoDeviceModelExtKt.getModel(ecoDeviceModel))).withFlags(268435456).withBundle(ElectronicScaleManagerExtKt.PARAM_WEIGHT_BUNDLE_KEY, bundle).navigation(context);
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void loadImageFromNet(@NotNull ImageView imageView, @NotNull String light, @NotNull String night) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(night, "night");
        if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(night).target(imageView).build());
        } else {
            Coil.imageLoader(imageView.getContext()).enqueue(new ImageRequest.Builder(imageView.getContext()).data(light).target(imageView).build());
        }
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void pullRecord(boolean needMore, @Nullable SoftReference<PullWeightRecordCallback> pullWeightRecordCallback) {
        new MainViewModel().requestRecordResult(0, System.currentTimeMillis(), needMore, pullWeightRecordCallback);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void startConfigWifiActivity(@NotNull Context context, @Nullable String mac, @Nullable byte[] bytes) {
        Intrinsics.checkNotNullParameter(context, "context");
        kb.c().a(ElectronicScaleManagerExtKt.ELECTRONIC_SCALE_PATH_CONFIG_WIFI_ACTIVITY).withFlags(67108864).withFlags(268435456).withString("mac", mac).withByteArray(ElectronicScaleManagerExtKt.SCANRECORD, bytes).navigation(context);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void syncElectronicScale(@Nullable String did) {
        Logger.i(TAG, "syncElectronicScale");
        if (did == null) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        String model = ecoDeviceModel != null ? EcoDeviceModelExtKt.getModel(ecoDeviceModel) : null;
        if (model == null || !EcoDeviceModelExtKt.isEightScale(model)) {
            return;
        }
        new EightDeviceSyncImpl().sync(did);
    }

    @Override // com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManager
    public void syncRecord(@Nullable final SyncWeightRecordCallback onSyncWeightRecordCallback) {
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: a58
            @Override // java.lang.Runnable
            public final void run() {
                ElectronicScaleManagerImpl.syncRecord$lambda$3(onSyncWeightRecordCallback);
            }
        });
    }
}
