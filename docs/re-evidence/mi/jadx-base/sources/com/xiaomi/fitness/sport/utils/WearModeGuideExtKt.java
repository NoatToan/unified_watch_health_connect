package com.xiaomi.fitness.sport.utils;

import android.content.DialogInterface;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.request.ImageRequest;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.av6;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.jcn;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"performOperationAndChooseNextOperationType", "", "recursionDataModel", "Lcom/xiaomi/fitness/sport/utils/RecursionDataModel;", "showCommonWearInstructionDialog", "supportsSportAdviceWithTemperature", "", DailyRecordKey.sportType, "", "temp", "(ILjava/lang/Integer;)Z", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWearModeGuideExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearModeGuideExt.kt\ncom/xiaomi/fitness/sport/utils/WearModeGuideExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,120:1\n54#2,3:121\n24#2:124\n57#2,6:125\n63#2,2:132\n57#3:131\n*S KotlinDebug\n*F\n+ 1 WearModeGuideExt.kt\ncom/xiaomi/fitness/sport/utils/WearModeGuideExtKt\n*L\n92#1:121,3\n92#1:124\n92#1:125,6\n92#1:132,2\n92#1:131\n*E\n"})
public final class WearModeGuideExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.utils.WearModeGuideExtKt$performOperationAndChooseNextOperationType$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.utils.WearModeGuideExtKt$performOperationAndChooseNextOperationType$1", f = "WearModeGuideExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RecursionDataModel $recursionDataModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RecursionDataModel recursionDataModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$recursionDataModel = recursionDataModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$recursionDataModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int operationType = this.$recursionDataModel.getOperationType();
            if (operationType == 1) {
                WearModeGuideExtKt.showCommonWearInstructionDialog(this.$recursionDataModel);
            } else if (operationType == 2) {
                this.$recursionDataModel.getLaunchSport().invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void performOperationAndChooseNextOperationType(@NotNull RecursionDataModel recursionDataModel) {
        Intrinsics.checkNotNullParameter(recursionDataModel, "recursionDataModel");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new AnonymousClass1(recursionDataModel, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCommonWearInstructionDialog(final RecursionDataModel recursionDataModel) {
        int i;
        CommonDialog commonDialogAddDialogCallback;
        recursionDataModel.setOperationType(2);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected() || SportPreference.INSTANCE.isInWearingInstructionAlreadyPoppedListBySid(wearableDeviceModel.getDid())) {
            performOperationAndChooseNextOperationType(recursionDataModel);
            return;
        }
        boolean zSupportsSportAdviceWithTemperature = supportsSportAdviceWithTemperature(recursionDataModel.getSportType(), recursionDataModel.getTempInt());
        int i2 = zSupportsSportAdviceWithTemperature ? c1j.L4 : c1j.A5;
        int i3 = zSupportsSportAdviceWithTemperature ? c1j.M4 : c1j.B5;
        WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        Product product = wearableDeviceModel2 != null ? wearableDeviceModel2.getProduct() : null;
        Integer numValueOf = product != null ? Integer.valueOf(DeviceModelExtKt.getDeviceScreenShapeType(product)) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            i = eoi.H;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            i = eoi.G;
        } else {
            i = (numValueOf != null && numValueOf.intValue() == 3) ? eoi.I : eoi.H;
        }
        Logger.d(SportBeanHelperExtKt.TAG, "curtDeviceModelProduct curtDeviceModelProduct=" + (product == null ? AbstractJsonLexerKt.NULL : product) + " DeviceScreenShape=" + (product != null ? Integer.valueOf(DeviceModelExtKt.getDeviceScreenShapeType(product)) : null));
        FragmentActivity fragmentActivity = recursionDataModel.getFragmentActivity();
        jcn jcnVarA0 = jcn.A0(fragmentActivity.getLayoutInflater());
        jcnVarA0.A.setText(i3);
        ImageView img = jcnVarA0.B;
        Intrinsics.checkNotNullExpressionValue(img, "img");
        Coil.imageLoader(img.getContext()).enqueue(new ImageRequest.Builder(img.getContext()).data(Integer.valueOf(i)).target(img).build());
        Intrinsics.checkNotNullExpressionValue(jcnVarA0, "apply(...)");
        CommonDialog commonDialogCreate = new CommonDialog.c("common_device_wear_guide").setDialogTitle(i2).setPositiveText(c1j.H1).setCustomView(jcnVarA0.getRoot()).create();
        if (commonDialogCreate == null || (commonDialogAddDialogCallback = commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.sport.utils.WearModeGuideExtKt.showCommonWearInstructionDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -1) {
                    SportPreference.INSTANCE.addDeviceToWearingInstructionPoppedList(wearableDeviceModel.getDid());
                    Logger.d(SportBeanHelperExtKt.TAG, "updateShouldShowWearingInstruction curtDeviceModel.did");
                    WearModeGuideExtKt.performOperationAndChooseNextOperationType(recursionDataModel);
                }
            }
        })) == null) {
            return;
        }
        commonDialogAddDialogCallback.showIfNeed(fragmentActivity.getSupportFragmentManager());
    }

    private static final boolean supportsSportAdviceWithTemperature(int i, Integer num) {
        Logger.d("supportsSportAdviceWithTemperature", "temp=" + (num == null ? AbstractJsonLexerKt.NULL : num));
        return num != null && num.intValue() < 5 && i == 1;
    }
}
