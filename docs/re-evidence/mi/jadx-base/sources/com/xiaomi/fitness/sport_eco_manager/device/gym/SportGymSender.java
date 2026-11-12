package com.xiaomi.fitness.sport_eco_manager.device.gym;

import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager.device.data.BleSender;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportGymResponseData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportTarget;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;
import defpackage.cs9;
import defpackage.es9;
import defpackage.fs9;
import defpackage.ft9;
import defpackage.hon;
import defpackage.nzn;
import defpackage.u7r;
import defpackage.uv9;
import defpackage.vr9;
import defpackage.xr9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020#2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b(\u0010&J!\u0010,\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0010\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020#8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00101¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/device/gym/SportGymSender;", "Lcom/xiaomi/fitness/sport_eco_manager/device/data/BleSender;", "Lu7r;", "wearPacket", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportGymResponseData;", "handleGymRequestResponse", "(Lu7r;)Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportGymResponseData;", "Lfs9$a;", "handleGymSettingRequestResponse", "(Lu7r;)Lfs9$a;", "Lft9$a;", "handleGymSportReportList", "(Lu7r;)Lft9$a;", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;", Constants.KEY_REQUEST_DATA, "Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "callback", "", "sendSportRequestToWear", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportRequestData;Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "Lnzn;", "", "getSportReportList", "(Lnzn;)V", "Lhon;", "getGymLock", "(Lhon;)V", "", "speed", "setGymSpeed", "(FLcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "", "ftpTest", "setGymFtpTest", "(ZLcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "", "ftpPercentRpm", "setGymFtpPercentRpm", "(ILcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;)V", "pace", "setGymPace", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;", "phoneSportData", "Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;", "sendPhoneSportDataToWear", "(Lcom/xiaomi/fitness/sport_eco_manager_export/data/PhoneSportData;Lcom/xiaomi/fitness/eco/device/contact/export/OnEcoSyncCallback;)V", "wakeMachineScreen", "()V", "DEFAULT_TIMEOUT", "I", "", "TAG", "Ljava/lang/String;", "START_TIMEOUT", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;)V", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportGymSender extends BleSender {
    private final int DEFAULT_TIMEOUT;
    private final int START_TIMEOUT;

    @NotNull
    private final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportGymSender(@NotNull EcoDeviceModel deviceModel) {
        super(deviceModel);
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.DEFAULT_TIMEOUT = 8000;
        this.TAG = "GymSender";
        this.START_TIMEOUT = ErrorCode.ERROR_CODE_DIGITAL_KEY_SHARE_NOT_SUPPORTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SportGymResponseData handleGymRequestResponse(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        es9 es9VarV = vr9VarR.v();
        if (es9VarV == null) {
            FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
            return null;
        }
        SportGymResponseData sportGymResponseDataC = uv9.c(es9VarV);
        Intrinsics.checkNotNullExpressionValue(sportGymResponseDataC, "convertProtoToGymResponseData(...)");
        FitnessLogUtils.d(this.TAG, "response data: " + sportGymResponseDataC);
        return sportGymResponseDataC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fs9.a handleGymSettingRequestResponse(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        fs9.a aVarW = vr9VarR.w();
        if (aVarW != null) {
            return aVarW;
        }
        FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ft9.a handleGymSportReportList(u7r wearPacket) {
        if (wearPacket == null) {
            FitnessLogUtils.w(this.TAG, "wearPacket is null");
            return null;
        }
        if (wearPacket.e != 8) {
            FitnessLogUtils.w(this.TAG, "not fitness response type");
            return null;
        }
        vr9 vr9VarR = wearPacket.r();
        if (vr9VarR == null) {
            FitnessLogUtils.w(this.TAG, "no fitness proto");
            return null;
        }
        ft9.a aVarA = vr9VarR.A();
        if (aVarA != null) {
            return aVarA;
        }
        FitnessLogUtils.w(this.TAG, "no fitness sport response proto");
        return null;
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void getGymLock(@Nullable hon callback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        vr9 vr9Var = new vr9();
        fs9.a aVar = new fs9.a();
        aVar.c = fs9.n();
        vr9Var.N(aVar);
        u7rVar.B(vr9Var);
        call(u7rVar, true, new OnEcoSyncCallback(callback) { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.getGymLock.1
            final /* synthetic */ hon $callback;

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "sendGymRequestToDevice success");
                SportGymSender.this.handleGymSettingRequestResponse(result != null ? result.getPacket() : null);
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void getSportReportList(@Nullable nzn<Object> callback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 6;
        callTimeout(u7rVar, true, new OnEcoSyncCallback(callback) { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.getSportReportList.1
            final /* synthetic */ nzn<Object> $callback;

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "getSportReportList fail , code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "getSportReportList success");
                SportGymSender.this.handleGymSportReportList(result != null ? result.getPacket() : null);
            }
        }, this.START_TIMEOUT);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.data.ISender
    public void sendPhoneSportDataToWear(@NotNull PhoneSportData phoneSportData, @Nullable OnEcoSyncCallback callback) {
        Intrinsics.checkNotNullParameter(phoneSportData, "phoneSportData");
        FitnessLogUtils.d(this.TAG, "send heart rate to gym , hr:" + phoneSportData.heart_rate);
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 65;
        xr9 xr9VarO = uv9.o(phoneSportData);
        vr9 vr9Var = new vr9();
        vr9Var.L(xr9VarO);
        u7rVar.B(vr9Var);
        call(u7rVar, false, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.sendPhoneSportDataToWear.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.d(SportGymSender.this.TAG, "sendPhoneSportDataToWear : fail code : " + code);
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.d(SportGymSender.this.TAG, "sendPhoneSportDataToWear : isSuccess");
            }
        });
    }

    @Override // com.xiaomi.fitness.sport_eco_manager.data.ISender
    public void sendSportRequestToWear(@NotNull final SportRequestData requestData, @Nullable final SportRequestCallback callback) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        FitnessLogUtils.i(this.TAG, "sendSportRequestToWear, sportType : " + requestData.sportType + ",sportState : " + requestData.sportState);
        SportTarget sportTarget = requestData.sportTargetArr;
        if (sportTarget != null) {
            FitnessLogUtils.i(this.TAG, "sendSportRequestToWear target type:" + sportTarget.getType() + ",target value : " + requestData.sportTargetArr.getValue());
        }
        cs9 cs9VarA = uv9.a(requestData);
        vr9 vr9Var = new vr9();
        vr9Var.M(cs9VarA);
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 64;
        u7rVar.B(vr9Var);
        FitnessLogUtils.i(this.TAG, "sendSportRequestToWear======: " + u7rVar);
        callTimeout(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.sendSportRequestToWear.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(requestData.sportState, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
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

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void setGymFtpPercentRpm(int ftpPercentRpm, @Nullable final SportRequestCallback callback) {
        FitnessLogUtils.i(this.TAG, "setGymFtpPercentRpm=========04");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 65;
        vr9 vr9Var = new vr9();
        xr9 xr9Var = new xr9();
        xr9Var.g = ftpPercentRpm;
        vr9Var.L(xr9Var);
        u7rVar.B(vr9Var);
        FitnessLogUtils.i(this.TAG, "setGymFtpPercentRpm=========: " + u7rVar);
        call(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.setGymFtpPercentRpm.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "setGymFtpPercentRpm=========onError");
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "setGymFtpPercentRpm=========onSuccess");
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

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void setGymFtpTest(boolean ftpTest, @Nullable final SportRequestCallback callback) {
        FitnessLogUtils.i(this.TAG, "setGymFtpTest=========04");
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 65;
        vr9 vr9Var = new vr9();
        xr9 xr9Var = new xr9();
        xr9Var.h = ftpTest;
        vr9Var.L(xr9Var);
        u7rVar.B(vr9Var);
        FitnessLogUtils.i(this.TAG, "setGymFtpTest=========: " + u7rVar);
        call(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.setGymFtpTest.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "setGymFtpTest=========onError");
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
                FitnessLogUtils.i(SportGymSender.this.TAG, "setGymFtpTest=========onSuccess");
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

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void setGymPace(int pace, @Nullable final SportRequestCallback callback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 65;
        vr9 vr9Var = new vr9();
        xr9 xr9Var = new xr9();
        xr9Var.e = pace;
        vr9Var.L(xr9Var);
        u7rVar.B(vr9Var);
        call(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.setGymPace.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
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

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void setGymSpeed(float speed, @Nullable final SportRequestCallback callback) {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 65;
        vr9 vr9Var = new vr9();
        xr9 xr9Var = new xr9();
        xr9Var.d = speed;
        vr9Var.L(xr9Var);
        u7rVar.B(vr9Var);
        call(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.setGymSpeed.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
                SportGymResponseData sportGymResponseData = new SportGymResponseData(code, null, null);
                SportRequestCallback sportRequestCallback = callback;
                if (sportRequestCallback != null) {
                    sportRequestCallback.call(1, sportGymResponseData);
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
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

    @Override // com.xiaomi.fitness.sport_eco_manager.device.data.BleSender
    public void wakeMachineScreen() {
        u7r u7rVar = new u7r();
        u7rVar.e = 8;
        u7rVar.f = 67;
        u7rVar.B(new vr9());
        call(u7rVar, true, new OnEcoSyncCallback() { // from class: com.xiaomi.fitness.sport_eco_manager.device.gym.SportGymSender.wakeMachineScreen.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onError(String did, int type, int code) {
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.OnEcoSyncCallback
            public void onSuccess(String did, int type, EcoSyncResult result) {
            }
        });
    }
}
