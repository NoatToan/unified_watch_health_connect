package com.xiaomi.fitness.sport_eco.view.launch.gym;

import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.ftp.request.FtpModel;
import com.xiaomi.fitness.sport_eco.request.EnvironmentalRequest;
import com.xiaomi.fitness.sport_eco.viewmodel.EcoEnvironmentalViewModel;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.sport_eco.view.launch.gym.GymDeviceModel$syncGymData$1$onSyncSuccess$1", f = "GymDeviceModel.kt", i = {}, l = {651}, m = "invokeSuspend", n = {}, s = {})
public final class GymDeviceModel$syncGymData$1$onSyncSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $environmentalValue;
    final /* synthetic */ EnvironmentalRequest $request;
    final /* synthetic */ long $time;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GymDeviceModel$syncGymData$1$onSyncSuccess$1(EnvironmentalRequest environmentalRequest, int i, long j, Continuation<? super GymDeviceModel$syncGymData$1$onSyncSuccess$1> continuation) {
        super(2, continuation);
        this.$request = environmentalRequest;
        this.$environmentalValue = i;
        this.$time = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GymDeviceModel$syncGymData$1$onSyncSuccess$1(this.$request, this.$environmentalValue, this.$time, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EnvironmentalRequest environmentalRequest = this.$request;
                String strValueOf = String.valueOf(this.$environmentalValue);
                String strValueOf2 = String.valueOf(System.currentTimeMillis());
                this.label = 1;
                obj = environmentalRequest.addEnvironmentalValue(strValueOf, strValueOf2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FtpModel.RespData respData = (FtpModel.RespData) obj;
            Logger.d(EcoEnvironmentalViewModel.TAG, "add resp = " + new Gson().toJson(respData));
            JSONObject jSONObject = new JSONObject(respData.getResp());
            int iOptInt = jSONObject.optInt("code");
            jSONObject.optString("msg");
            if (iOptInt == 0 || iOptInt == 200) {
                SportManagerExportPreference sportManagerExportPreference = SportManagerExportPreference.INSTANCE;
                sportManagerExportPreference.setKEY_GYM_ENVIRONMENTAL_UPDATE_TIME(this.$time);
                sportManagerExportPreference.setKEY_GYM_ENVIRONMENTAL_VALUE(-1);
                FitnessLogUtils.i(EcoEnvironmentalViewModel.TAG, "upload environment value success");
            } else {
                FitnessLogUtils.e(EcoEnvironmentalViewModel.TAG, "error code = " + iOptInt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GymDeviceModel$syncGymData$1$onSyncSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
