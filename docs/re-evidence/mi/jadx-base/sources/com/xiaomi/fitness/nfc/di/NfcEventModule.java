package com.xiaomi.fitness.nfc.di;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.service.mi.entity.BaseResponse;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.GsonExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.StringExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.utils.RegionUtil;
import com.xiaomi.fitness.nfc.di.NfcEventModule;
import com.xiaomi.fitness.nfc.entity.MasterRegions;
import com.xiaomi.fitness.nfc.sp.NfcPreference;
import com.xiaomi.fitness.nfc.ui.CardManagerActivity;
import com.xiaomi.fitness.nfc.ui.issued.MasterCardListFragment;
import com.xiaomi.fitness.nfc.ui.issued.YoYoCardListFragment;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.nfc.utils.NfcUtils;
import com.xiaomi.fitness.nfc.utils.PageUtilsKt;
import com.xiaomi.fitness.nfc.utils.UtilsKt;
import defpackage.ltg;
import defpackage.o0j;
import defpackage.rvf;
import defpackage.ssg;
import defpackage.uxi;
import defpackage.vqg;
import defpackage.wni;
import defpackage.zl3;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J$\u0010\u000e\u001a\u00020\u000b2\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002J\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\b\u0010\u0016\u001a\u00020\u0005H\u0007J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u000bR\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/nfc/di/NfcEventModule;", "", "<init>", "()V", "mNfcContentItem", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "getMNfcContentItem", "()Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "mNfcContentItem$delegate", "Lkotlin/Lazy;", "toMasterCardListView", "", "curActivity", "Landroidx/fragment/app/FragmentActivity;", "checkPreAccountData", "callback", "Lkotlin/Function2;", "", "", "isShowCards", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "provideNFCItem", "provideYoYoCardItem", "updateCardNumber", RealNameWebViewActivity.NUMBER, "", "syncCardNumber", "NfcContentItem", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcEventModule {

    @NotNull
    public static final NfcEventModule INSTANCE = new NfcEventModule();

    /* JADX INFO: renamed from: mNfcContentItem$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mNfcContentItem = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: kmg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NfcEventModule.mNfcContentItem_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/nfc/di/NfcEventModule$NfcContentItem;", "Lcom/xiaomi/fitness/device/manager/export/bean/TabContentItem;", "Lcom/xiaomi/fitness/device/manager/export/IItemChangesWithDevice;", "<init>", "()V", "onDeviceChanged", "", "did", "", "handleItemClicked", "context", "Landroid/content/Context;", "nfc_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NfcContentItem extends TabContentItem implements IItemChangesWithDevice {
        public NfcContentItem() {
            super(11, 103, wni.f38164r, StringExtKt.toLiveData(NfcUtils.INSTANCE.payName()), null, false, null, StringExtKt.toLiveData(""), null, null, new Function1() { // from class: omg
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(NfcEventModule.NfcContentItem._init_$lambda$0((WearableDeviceModel) obj));
                }
            }, null, null, 7024, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _init_$lambda$0(WearableDeviceModel wearableDeviceModel) {
            Intrinsics.checkNotNullParameter(wearableDeviceModel, "<this>");
            return NfcEventModule.INSTANCE.isShowCards(wearableDeviceModel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleItemClicked$lambda$4$lambda$1(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handleItemClicked$lambda$4$lambda$2(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleItemClicked$lambda$4$lambda$3(FragmentActivity curActivity, Object obj) {
            Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
            AnyExtKt.main$default(null, new NfcEventModule$NfcContentItem$handleItemClicked$1$3$1(((Integer) obj).intValue(), curActivity, null), 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xiaomi.fitness.device.manager.export.bean.TabContentItem
        public void handleItemClicked(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            reportData(true);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null) {
                boolean zIsSupportFeature = DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD);
                RegionManager.Companion companion = RegionManager.INSTANCE;
                vqg.d("isSupportFeature:" + zIsSupportFeature + "  isInCN:" + RegionExtKt.isInland(RegionExtKt.getInstance(companion)));
                boolean zIsInland = RegionExtKt.isInland(RegionExtKt.getInstance(companion));
                if (!DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.MASTERCARD) || zIsInland) {
                    Intent intent = new Intent(context, (Class<?>) CardManagerActivity.class);
                    intent.putExtra(CardManagerActivity.sIsFromDevicePage, true);
                    context.startActivity(intent);
                    return;
                }
                if (!com.xiaomi.fitness.device.manager.export.DeviceModelExtKt.isVersionSupport(wearableDeviceModel, Feature.MASTERCARD)) {
                    ToastExtKt.toastShort(ApplicationExtKt.getApplication(), o0j.g);
                    return;
                }
                AppManager.Companion companion2 = AppManager.INSTANCE;
                if (companion2.getInstance().getCurrentActivity() instanceof FragmentActivity) {
                    Activity currentActivity = companion2.getInstance().getCurrentActivity();
                    Intrinsics.checkNotNull(currentActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    final FragmentActivity fragmentActivity = (FragmentActivity) currentActivity;
                    String supportMasterRegins = NfcPreference.INSTANCE.getSupportMasterRegins();
                    if (supportMasterRegins == null || supportMasterRegins.length() == 0) {
                        String string = ResourceExtKt.getString(o0j.o4);
                        int i = o0j.J;
                        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string, i, supportFragmentManager, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: lmg
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return NfcEventModule.NfcContentItem.handleItemClicked$lambda$4$lambda$1((DialogInterface) obj);
                            }
                        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
                        return;
                    }
                    MasterRegions masterRegions = (MasterRegions) GsonExtKt.toObject(new Gson(), supportMasterRegins, MasterRegions.class);
                    String upperCase = RegionUtil.getCurrentLocalCountry().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    vqg.d("countryCode:" + upperCase);
                    if (!masterRegions.getRegions().containsKey(upperCase)) {
                        String string2 = ResourceExtKt.getString(o0j.a4);
                        int i2 = o0j.J;
                        FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                        UtilsKt.showMsgDialog((80 & 1) != 0 ? null : null, string2, i2, supportFragmentManager2, (80 & 16) != 0 ? -1 : 0, (Function1<? super DialogInterface, Unit>) ((80 & 32) != 0 ? null : new Function1() { // from class: mmg
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return NfcEventModule.NfcContentItem.handleItemClicked$lambda$4$lambda$2((DialogInterface) obj);
                            }
                        }), (Function1<? super DialogInterface, Unit>) ((80 & 64) != 0 ? null : null));
                        return;
                    }
                    if (fragmentActivity instanceof PageState) {
                        PageState.DefaultImpls.showLoading$default((PageState) fragmentActivity, null, 0, false, 5, null);
                    }
                    try {
                        ltg.c().pinStatus(new ssg.b() { // from class: nmg
                            @Override // ssg.b
                            public final void onResult(Object obj) {
                                NfcEventModule.NfcContentItem.handleItemClicked$lambda$4$lambda$3(fragmentActivity, obj);
                            }
                        });
                    } catch (Exception e) {
                        vqg.b("pinStatus exception = " + e);
                        ToastUtil.showShortToast(o0j.common_hint_unkonwn_error);
                    }
                }
            }
        }

        @Override // com.xiaomi.fitness.device.manager.export.IItemChangesWithDevice
        public void onDeviceChanged(@NotNull String did) {
            Intrinsics.checkNotNullParameter(did, "did");
            Logger.i("NfcContentItem", "onDeviceChanged " + did + " ");
            String strPayName = NfcUtils.INSTANCE.payName();
            getTitle().postValue(strPayName);
            Logger.d("NfcItem title changed:" + strPayName, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.di.NfcEventModule$checkPreAccountData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.nfc.di.NfcEventModule$checkPreAccountData$1", f = "NfcEventModule.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<Boolean, String, Unit> $callback;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.nfc.di.NfcEventModule$checkPreAccountData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.nfc.di.NfcEventModule$checkPreAccountData$1$1", f = "NfcEventModule.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<Boolean, String, Unit> $callback;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06491(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C06491> continuation) {
                super(2, continuation);
                this.$callback = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06491(this.$callback, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                vqg.d("checkPreAccountData pre");
                BaseResponse baseResponseB = new rvf().b();
                vqg.d("checkUserBind code:" + baseResponseB.getResultCode() + "  msg:" + baseResponseB.getMsg());
                if (baseResponseB.isStatusOK()) {
                    BaseResponse baseResponseP = new rvf().p();
                    vqg.d("syncSe code:" + baseResponseP.getResultCode() + "  msg:" + baseResponseP.getMsg());
                    if (baseResponseP.isStatusOK()) {
                        this.$callback.invoke(Boxing.boxBoolean(true), null);
                    } else {
                        this.$callback.invoke(Boxing.boxBoolean(false), NfcUtils.getMasterErrorMsg(baseResponseP.getResultCode(), baseResponseP.getSpErrors()));
                    }
                } else {
                    this.$callback.invoke(Boxing.boxBoolean(false), NfcUtils.getMasterErrorMsg(baseResponseB.getResultCode(), baseResponseB.getSpErrors()));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C06491 c06491 = new C06491(this.$callback, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c06491, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private NfcEventModule() {
    }

    private final void checkPreAccountData(Function2<? super Boolean, ? super String, Unit> callback) {
        AnyExtKt.io$default(null, new AnonymousClass1(callback, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isShowCards(WearableDeviceModel wearableDeviceModel) {
        return NfcUtils.INSTANCE.isShowCard(wearableDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NfcContentItem mNfcContentItem_delegate$lambda$0() {
        return new NfcContentItem();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit provideYoYoCardItem$lambda$2(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        UtilsKt.gotoPage$default(it, YoYoCardListFragment.class, null, false, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideYoYoCardItem$lambda$3(WearableDeviceModel TabContentItem) {
        Intrinsics.checkNotNullParameter(TabContentItem, "$this$TabContentItem");
        return DeviceModelExtKt.isSupportFeature(TabContentItem, Feature.EASYCARD) && RegionUtil.isInTaiWan();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void toMasterCardListView(final FragmentActivity curActivity) {
        if (!NfcPreference.INSTANCE.isCheckUserBind()) {
            checkPreAccountData(new Function2() { // from class: hmg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NfcEventModule.toMasterCardListView$lambda$1(curActivity, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
            return;
        }
        if (curActivity instanceof PageState) {
            ((PageState) curActivity).dismissDialog();
        }
        PageUtilsKt.gotoPage$default(curActivity, MasterCardListFragment.class, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toMasterCardListView$lambda$1(FragmentActivity curActivity, boolean z, String str) {
        Intrinsics.checkNotNullParameter(curActivity, "$curActivity");
        AnyExtKt.main$default(null, new NfcEventModule$toMasterCardListView$1$1(curActivity, z, str, null), 1, null);
        return Unit.INSTANCE;
    }

    @NotNull
    public final TabContentItem getMNfcContentItem() {
        return (TabContentItem) mNfcContentItem.getValue();
    }

    @NotNull
    public final TabContentItem provideNFCItem() {
        return getMNfcContentItem();
    }

    @NotNull
    public final TabContentItem provideYoYoCardItem() {
        return new TabContentItem(11, 213, wni.f38164r, StringExtKt.toLiveData(ResourceExtKt.getString(o0j.D7)), StringExtKt.toLiveData(""), false, null, null, null, new Function1() { // from class: img
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NfcEventModule.provideYoYoCardItem$lambda$2((Context) obj);
            }
        }, new Function1() { // from class: jmg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(NfcEventModule.provideYoYoCardItem$lambda$3((WearableDeviceModel) obj));
            }
        }, null, null, 6624, null);
    }

    public final void syncCardNumber() {
        updateCardNumber(zl3.g().j().size() + zl3.g().f().size() + zl3.g().d().size());
    }

    public final void updateCardNumber(int number) {
        vqg.d("NfcComponet updateCardNumber size:" + number + "   isMainThread:" + AppUtil.INSTANCE.isMainThread());
        MutableLiveData<String> remindText = getMNfcContentItem().getRemindText();
        if (remindText != null) {
            remindText.setValue(number > 0 ? AppUtil.getApp().getResources().getQuantityString(uxi.f36252a, number, Integer.valueOf(number)) : null);
        }
    }
}
