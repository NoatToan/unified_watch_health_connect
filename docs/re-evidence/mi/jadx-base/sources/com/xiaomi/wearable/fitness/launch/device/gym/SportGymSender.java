package com.xiaomi.wearable.fitness.launch.device.gym;

import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager.device.data.BleSender;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportGymResponseData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;
import defpackage.bs9;
import defpackage.ds9;
import defpackage.gon;
import defpackage.gs9;
import defpackage.gt9;
import defpackage.mzn;
import defpackage.s7r;
import defpackage.tv9;
import defpackage.ur9;
import defpackage.wr9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010&\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\b\u0010\u0010\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+¨\u00064"}, d2 = {"Lcom/xiaomi/wearable/fitness/launch/device/gym/SportGymSender;", "Lcom/xiaomi/fitness/sport_manager/device/data/BleSender;", "Ls7r;", "wearPacket", "Lcom/xiaomi/fitness/sport_manager_export/data/SportGymResponseData;", "handleGymRequestResponse", "(Ls7r;)Lcom/xiaomi/fitness/sport_manager_export/data/SportGymResponseData;", "Lgs9$a;", "handleGymSettingRequestResponse", "(Ls7r;)Lgs9$a;", "Lgt9$a;", "handleGymSportReportList", "(Ls7r;)Lgt9$a;", "Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;", "callback", "", "sendSportRequestToWear", "(Lcom/xiaomi/fitness/sport_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "Lmzn;", "", "getSportReportList", "(Lmzn;)V", "Lgon;", "getGymLock", "(Lgon;)V", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "", "pace", "setGymPace", "(ILcom/xiaomi/fitness/sport_manager_export/listener/SportRequestCallback;)V", "Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;", "phoneSportData", "Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;", "sendPhoneSportDataToWear", "(Lcom/xiaomi/fitness/sport_manager_export/data/PhoneSportData;Lcom/xiaomi/fitness/device/contact/export/OnSyncCallback;)V", "wakeMachineScreen", "()V", "DEFAULT_TIMEOUT", "I", "", "TAG", "Ljava/lang/String;", "START_TIMEOUT", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportGymSender extends BleSender {
    private final int DEFAULT_TIMEOUT;
    private final int START_TIMEOUT;

    @NotNull
    private final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportGymSender(@NotNull WearableDeviceModel deviceModel) {
        super(deviceModel);
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.DEFAULT_TIMEOUT = 8000;
        this.TAG = "GymSender";
        this.START_TIMEOUT = ErrorCode.ERROR_CODE_DIGITAL_KEY_SHARE_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportGymResponseData handleGymRequestResponse(s7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        ur9 ur9VarU = wearPacket.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        ds9 ds9VarX = ur9VarU.x();
        if (ds9VarX == null) {
            FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
            return null;
        }
        SportGymResponseData sportGymResponseDataC = tv9.c(ds9VarX);
        Intrinsics.checkNotNullExpressionValue(sportGymResponseDataC, "convertProtoToGymResponseData(...)");
        FitnessLogUtils.d(this.TAG, "response data: " + sportGymResponseDataC);
        return sportGymResponseDataC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gs9.a handleGymSettingRequestResponse(s7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        ur9 ur9VarU = wearPacket.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        gs9.a aVarY = ur9VarU.y();
        if (aVarY != null) {
            return aVarY;
        }
        FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gt9.a handleGymSportReportList(s7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        ur9 ur9VarU = wearPacket.u();
        if (ur9VarU == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        gt9.a aVarJ = ur9VarU.J();
        if (aVarJ != null) {
            return aVarJ;
        }
        FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_manager.device.data.BleSender
    public void getGymLock(@Nullable gon callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 67;
        ur9 ur9Var = new ur9();
        gs9.a aVar = new gs9.a();
        aVar.c = gs9.n();
        ur9Var.n0(aVar);
        s7rVar.S(ur9Var);
        call(s7rVar, true, new OnSyncCallback(callback) { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.getGymLock.1
            final /* synthetic */ gon $callback;

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "sendGymRequestToDevice success");
                SportGymSender.this.handleGymSettingRequestResponse(result != null ? result.getPacket() : null);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager.device.data.BleSender
    public void getSportReportList(@Nullable mzn<Object> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 6;
        callTimeout(s7rVar, true, new OnSyncCallback(callback) { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.getSportReportList.1
            final /* synthetic */ mzn<Object> $callback;

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "getSportReportList fail , code : " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "getSportReportList success");
                SportGymSender.this.handleGymSportReportList(result != null ? result.getPacket() : null);
            }
        }, this.START_TIMEOUT);
    }

    @Override // com.xiaomi.fitness.sport_manager.data.ISender
    public void sendPhoneSportDataToWear(@NotNull PhoneSportData phoneSportData, @Nullable OnSyncCallback callback) {
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        FitnessLogUtils.d(this.TAG, "send heart rate to gym , hr:" + phoneSportData.heart_rate);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 65;
        wr9 wr9VarQ = tv9.q(phoneSportData);
        ur9 ur9Var = new ur9();
        ur9Var.l0(wr9VarQ);
        s7rVar.S(ur9Var);
        call(s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.sendPhoneSportDataToWear.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.d(SportGymSender.this.TAG, "sendPhoneSportDataToWear : fail code : " + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.d(SportGymSender.this.TAG, "sendPhoneSportDataToWear : isSuccess");
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager.data.ISender
    public void sendSportRequestToWear(@NotNull final SportRequestData requestData, @Nullable final SportRequestCallback callback) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        FitnessLogUtils.i(this.TAG, "sendSportRequestToWear, sportType : " + requestData.sportType + ",sportState : " + requestData.sportState);
        SportTarget sportTarget = requestData.sportTargetArr;
        if (sportTarget != null) {
            FitnessLogUtils.i(this.TAG, "sendSportRequestToWear target type:" + sportTarget.getType() + ",target value : " + requestData.sportTargetArr.getValue());
        }
        bs9 bs9VarA = tv9.a(requestData);
        ur9 ur9Var = new ur9();
        ur9Var.m0(bs9VarA);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 64;
        s7rVar.S(ur9Var);
        callTimeout(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.sendSportRequestToWear.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(requestData.sportState, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "sendGymRequestToDevice success ");
                SportGymResponseData sportGymResponseDataHandleGymRequestResponse = SportGymSender.this.handleGymRequestResponse(result != null ? result.getPacket() : null);
                if (sportGymResponseDataHandleGymRequestResponse == null) {
                    sportGymResponseDataHandleGymRequestResponse = new SportGymResponseData(result != null ? result.getCode() : 0, null, null);
                }
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(requestData.sportState, sportGymResponseDataHandleGymRequestResponse);
                }
            }
        }, requestData.sportState == 1 ? this.START_TIMEOUT : this.DEFAULT_TIMEOUT);
    }

    @Override // com.xiaomi.fitness.sport_manager.device.data.BleSender
    public void setGymPace(int pace, @Nullable final SportRequestCallback callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 65;
        ur9 ur9Var = new ur9();
        wr9 wr9Var = new wr9();
        wr9Var.e = pace;
        ur9Var.l0(wr9Var);
        s7rVar.S(ur9Var);
        call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.setGymPace.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "sendGymRequestToDevice resultCode = " + (result != null ? Integer.valueOf(result.getCode()) : null));
                SportGymResponseData sportGymResponseDataHandleGymRequestResponse = SportGymSender.this.handleGymRequestResponse(result != null ? result.getPacket() : null);
                if (sportGymResponseDataHandleGymRequestResponse == null) {
                    sportGymResponseDataHandleGymRequestResponse = new SportGymResponseData(result != null ? result.getCode() : 0, null, null);
                }
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseDataHandleGymRequestResponse);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager.device.data.BleSender
    public void setGymSpeed(float speed, @Nullable final SportRequestCallback callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 65;
        ur9 ur9Var = new ur9();
        wr9 wr9Var = new wr9();
        wr9Var.d = speed;
        ur9Var.l0(wr9Var);
        s7rVar.S(ur9Var);
        call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.setGymSpeed.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                SportGymResponseData sportGymResponseDataHandleGymRequestResponse = SportGymSender.this.handleGymRequestResponse(result != null ? result.getPacket() : null);
                if (sportGymResponseDataHandleGymRequestResponse == null) {
                    sportGymResponseDataHandleGymRequestResponse = new SportGymResponseData(result != null ? result.getCode() : 0, null, null);
                }
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseDataHandleGymRequestResponse);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_manager.device.data.BleSender
    public void wakeMachineScreen() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 67;
        s7rVar.S(new ur9());
        call(s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.wearable.fitness.launch.device.gym.SportGymSender.wakeMachineScreen.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
            }
        });
    }
}
