package com.xiaomi.hm.health.device.headset.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.bluetooth.profile.channel.module.HeadPhoneModule;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetFeatureTree;
import com.xiaomi.hm.health.device.headset.pattern.HeadsetSoftFeature;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.e;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.f;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.g;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.h;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.i;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.j;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.k;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.l;
import com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel.m;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.HeadsetSportSettingVo;
import com.xiaomi.hm.health.device.headset.vo.HearingHealthStatusVo;
import com.xiaomi.hm.health.device.headset.vo.HrReminderInfoVo;
import com.xiaomi.hm.health.device.headset.vo.NoiseReductionModeVo;
import com.xiaomi.hm.health.device.headset.vo.PercussionBroadcastVo;
import com.xiaomi.hm.health.device.headset.vo.RunningRecognitionVo;
import com.xiaomi.hm.health.device.headset.vo.SmartPlayVo;
import com.xiaomi.hm.health.device.headset.vo.WearInductionVo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.headset.viewmodel.HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1", f = "HeadSettingViewModel.kt", i = {0, 1, 2, 3, 4, 5, 6, 7}, l = {72, 84, 96, 108, 119, 130, 142, 153, 165}, m = "invokeSuspend", n = {"$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21", "$this$getHeadsetAllConfigInfo_u24lambda_u2d21"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
public final class HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ HeadSettingViewModel c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1(Continuation continuation, HeadSettingViewModel headSettingViewModel) {
        super(2, continuation);
        this.c = headSettingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1 headSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1 = new HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1(continuation, this.c);
        headSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1.b = obj;
        return headSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((HeadSettingViewModel$getHeadsetAllConfigInfo$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0301  */
    /* JADX WARN: Code duplicated, block: B:102:0x0327 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x0338  */
    /* JADX WARN: Code duplicated, block: B:107:0x034a A[PHI: r4
      0x034a: PHI (r4v33 kotlinx.coroutines.CoroutineScope) = (r4v29 kotlinx.coroutines.CoroutineScope), (r4v34 kotlinx.coroutines.CoroutineScope) binds: [B:98:0x02fe, B:106:0x033c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0361  */
    /* JADX WARN: Code duplicated, block: B:113:0x0365  */
    /* JADX WARN: Code duplicated, block: B:115:0x038c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:118:0x039d  */
    /* JADX WARN: Code duplicated, block: B:120:0x03af A[PHI: r4
      0x03af: PHI (r4v37 kotlinx.coroutines.CoroutineScope) = (r4v33 kotlinx.coroutines.CoroutineScope), (r4v41 kotlinx.coroutines.CoroutineScope) binds: [B:111:0x0362, B:119:0x03a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:130:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:139:0x0412 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:140:0x0413  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0109  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0144  */
    /* JADX WARN: Code duplicated, block: B:42:0x0156 A[PHI: r4
      0x0156: PHI (r4v13 kotlinx.coroutines.CoroutineScope) = (r4v9 kotlinx.coroutines.CoroutineScope), (r4v14 kotlinx.coroutines.CoroutineScope) binds: [B:33:0x010a, B:41:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x016d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0171  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x020c  */
    /* JADX WARN: Code duplicated, block: B:68:0x021e A[PHI: r4
      0x021e: PHI (r4v21 kotlinx.coroutines.CoroutineScope) = (r4v17 kotlinx.coroutines.CoroutineScope), (r4v22 kotlinx.coroutines.CoroutineScope) binds: [B:59:0x01d2, B:67:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0235  */
    /* JADX WARN: Code duplicated, block: B:74:0x0239  */
    /* JADX WARN: Code duplicated, block: B:76:0x025f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0270  */
    /* JADX WARN: Code duplicated, block: B:81:0x0282 A[PHI: r4
      0x0282: PHI (r4v25 kotlinx.coroutines.CoroutineScope) = (r4v21 kotlinx.coroutines.CoroutineScope), (r4v26 kotlinx.coroutines.CoroutineScope) binds: [B:72:0x0236, B:80:0x0274] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0299  */
    /* JADX WARN: Code duplicated, block: B:87:0x029d  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e6 A[PHI: r4
      0x02e6: PHI (r4v29 kotlinx.coroutines.CoroutineScope) = (r4v25 kotlinx.coroutines.CoroutineScope), (r4v30 kotlinx.coroutines.CoroutineScope) binds: [B:85:0x029a, B:93:0x02d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x02fd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        MutableLiveData mutableLiveData;
        HeadsetFeatureTree headsetFeatureTree;
        MutableLiveData mutableLiveData2;
        Boolean boolBoxBoolean;
        HeadsetFeatureTree headsetFeatureTree2;
        MutableLiveData mutableLiveData3;
        Boolean boolBoxBoolean2;
        HeadsetFeatureTree headsetFeatureTree3;
        MutableLiveData mutableLiveData4;
        Boolean boolBoxBoolean3;
        HeadsetFeatureTree headsetFeatureTree4;
        MutableLiveData mutableLiveData5;
        Boolean boolBoxBoolean4;
        HeadsetFeatureTree headsetFeatureTree5;
        MutableLiveData mutableLiveData6;
        Boolean boolBoxBoolean5;
        HeadsetFeatureTree headsetFeatureTree6;
        MutableLiveData mutableLiveData7;
        Boolean boolBoxBoolean6;
        HeadsetFeatureTree headsetFeatureTree7;
        MutableLiveData mutableLiveData8;
        Boolean boolBoxBoolean7;
        CoroutineScope coroutineScope2;
        HeadsetFeatureTree headsetFeatureTree8;
        boolean z;
        MutableLiveData mutableLiveData9;
        MutableLiveData mutableLiveData10;
        HMBaseDevice hMBaseDeviceF;
        Boolean boolBoxBoolean8;
        boolean zBooleanValue;
        Boolean boolBoxBoolean9;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (this.a) {
            case 0:
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.b;
                HeadsetFeatureTree headsetFeatureTree9 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree9.isSupport(HeadsetSoftFeature.NOISE_REDUCTION)).booleanValue()) {
                    headsetFeatureTree9 = null;
                }
                if (headsetFeatureTree9 == null) {
                    coroutineScope = coroutineScope3;
                } else {
                    Deferred deferredB = e.b(coroutineScope3, coroutineScope3.getCoroutineContext(), null, this.c.new j(null), 2, null);
                    MutableLiveData mutableLiveData11 = this.c._noiseControl;
                    this.b = coroutineScope3;
                    this.d = mutableLiveData11;
                    this.a = 1;
                    Object objAwait = deferredB.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutineScope = coroutineScope3;
                    obj = objAwait;
                    mutableLiveData = mutableLiveData11;
                    NoiseControl noiseControl = (NoiseControl) obj;
                    boolBoxBoolean = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean == null) {
                        boolBoxBoolean = Boxing.boxBoolean(true);
                    }
                    mutableLiveData.postValue(new NoiseReductionModeVo(noiseControl, boolBoxBoolean.booleanValue()));
                    Unit unit = Unit.INSTANCE;
                }
                headsetFeatureTree = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_RUNNING_RECOGNITION)).booleanValue()) {
                    headsetFeatureTree = null;
                }
                if (headsetFeatureTree == null) {
                    headsetFeatureTree2 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree2.isSupport(HeadsetSoftFeature.WEAR_INDUCTION)).booleanValue()) {
                        headsetFeatureTree2 = null;
                    }
                    if (headsetFeatureTree2 == null) {
                        Deferred deferredB2 = e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new l(null), 2, null);
                        mutableLiveData3 = this.c._wearInduction;
                        this.b = coroutineScope;
                        this.d = mutableLiveData3;
                        this.a = 3;
                        obj = deferredB2.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool = (Boolean) obj;
                        boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean3 == null) {
                            boolBoxBoolean3 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData3.postValue(new WearInductionVo(bool, boolBoxBoolean3.booleanValue()));
                        Unit unit2 = Unit.INSTANCE;
                    }
                    headsetFeatureTree4 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                        headsetFeatureTree4 = null;
                    }
                    if (headsetFeatureTree4 == null) {
                        headsetFeatureTree5 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                            headsetFeatureTree5 = null;
                        }
                        if (headsetFeatureTree5 == null) {
                            Deferred deferredB3 = e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                            mutableLiveData6 = this.c._hrReminderInfo;
                            this.b = coroutineScope;
                            this.d = mutableLiveData6;
                            this.a = 6;
                            obj = deferredB3.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HrReminderInfo hrReminderInfo = (HrReminderInfo) obj;
                            boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean6 == null) {
                                boolBoxBoolean6 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo, boolBoxBoolean6.booleanValue()));
                            Unit unit3 = Unit.INSTANCE;
                        }
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            coroutineScope2 = coroutineScope;
                            headsetFeatureTree8 = this.c.headsetFeatureTree;
                            z = false;
                            if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                                hMBaseDeviceF = this.c.f();
                                if (hMBaseDeviceF == null && (boolBoxBoolean8 = Boxing.boxBoolean(hMBaseDeviceF.supportModule(HeadPhoneModule.class))) != null) {
                                    zBooleanValue = boolBoxBoolean8.booleanValue();
                                } else {
                                    zBooleanValue = false;
                                }
                                if (zBooleanValue) {
                                    z = true;
                                }
                            }
                            if (!Boxing.boxBoolean(z).booleanValue()) {
                                headsetFeatureTree8 = null;
                            }
                            if (headsetFeatureTree8 != null) {
                                Deferred deferredB4 = e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                                mutableLiveData9 = this.c._smartPlay;
                                this.b = mutableLiveData9;
                                this.d = null;
                                this.a = 9;
                                obj = deferredB4.await(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableLiveData10 = mutableLiveData9;
                                mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        } else {
                            Deferred deferredB5 = e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB5.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool2 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool2, boolBoxBoolean9.booleanValue()));
                            Unit unit5 = Unit.INSTANCE;
                            coroutineScope2 = coroutineScope;
                            headsetFeatureTree8 = this.c.headsetFeatureTree;
                            z = false;
                            if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                                hMBaseDeviceF = this.c.f();
                                if (hMBaseDeviceF == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolBoxBoolean8.booleanValue();
                                }
                                if (zBooleanValue) {
                                    z = true;
                                }
                            }
                            if (!Boxing.boxBoolean(z).booleanValue()) {
                                headsetFeatureTree8 = null;
                            }
                            if (headsetFeatureTree8 != null) {
                                Deferred deferredB6 = e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                                mutableLiveData9 = this.c._smartPlay;
                                this.b = mutableLiveData9;
                                this.d = null;
                                this.a = 9;
                                obj = deferredB6.await(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableLiveData10 = mutableLiveData9;
                                mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                                Unit unit6 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB7 = e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                    mutableLiveData5 = this.c._percussionBroadcast;
                    this.b = coroutineScope;
                    this.d = mutableLiveData5;
                    this.a = 5;
                    obj = deferredB7.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool3 = (Boolean) obj;
                    boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean5 == null) {
                        boolBoxBoolean5 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData5.postValue(new PercussionBroadcastVo(bool3, boolBoxBoolean5.booleanValue()));
                    Unit unit7 = Unit.INSTANCE;
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB8 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB8.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo2 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo2, boolBoxBoolean6.booleanValue()));
                        Unit unit8 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB9 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB9.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit9 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB10 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB10.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool4 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool4, boolBoxBoolean9.booleanValue()));
                        Unit unit10 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB11 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB11.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit11 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            Deferred deferredB12 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB12.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool5 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool5, boolBoxBoolean9.booleanValue()));
                            Unit unit12 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB13 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB13.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting, boolBoxBoolean7.booleanValue()));
                    Unit unit13 = Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB14 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB14.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool6 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool6, boolBoxBoolean9.booleanValue()));
                        Unit unit14 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB15 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB15.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit15 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB16 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new k(null), 2, null);
                mutableLiveData2 = this.c._runningRecognition;
                this.b = coroutineScope;
                this.d = mutableLiveData2;
                this.a = 2;
                obj = deferredB16.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool7 = (Boolean) obj;
                boolBoxBoolean2 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean2 == null) {
                    boolBoxBoolean2 = Boxing.boxBoolean(true);
                }
                mutableLiveData2.postValue(new RunningRecognitionVo(bool7, boolBoxBoolean2.booleanValue()));
                Unit unit16 = Unit.INSTANCE;
                headsetFeatureTree2 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree2.isSupport(HeadsetSoftFeature.WEAR_INDUCTION)).booleanValue()) {
                    headsetFeatureTree2 = null;
                }
                if (headsetFeatureTree2 == null) {
                    Deferred deferredB17 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new l(null), 2, null);
                    mutableLiveData3 = this.c._wearInduction;
                    this.b = coroutineScope;
                    this.d = mutableLiveData3;
                    this.a = 3;
                    obj = deferredB17.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool8 = (Boolean) obj;
                    boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean3 == null) {
                        boolBoxBoolean3 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData3.postValue(new WearInductionVo(bool8, boolBoxBoolean3.booleanValue()));
                    Unit unit17 = Unit.INSTANCE;
                }
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB18 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB18.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo3 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo3, boolBoxBoolean6.booleanValue()));
                        Unit unit18 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB19 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB19.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit19 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB110.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool9 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool9, boolBoxBoolean9.booleanValue()));
                        Unit unit110 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB20 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                mutableLiveData5 = this.c._percussionBroadcast;
                this.b = coroutineScope;
                this.d = mutableLiveData5;
                this.a = 5;
                obj = deferredB20.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool10 = (Boolean) obj;
                boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean5 == null) {
                    boolBoxBoolean5 = Boxing.boxBoolean(true);
                }
                mutableLiveData5.postValue(new PercussionBroadcastVo(bool10, boolBoxBoolean5.booleanValue()));
                Unit unit20 = Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    Deferred deferredB112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                    mutableLiveData6 = this.c._hrReminderInfo;
                    this.b = coroutineScope;
                    this.d = mutableLiveData6;
                    this.a = 6;
                    obj = deferredB112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HrReminderInfo hrReminderInfo4 = (HrReminderInfo) obj;
                    boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean6 == null) {
                        boolBoxBoolean6 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo4, boolBoxBoolean6.booleanValue()));
                    Unit unit112 = Unit.INSTANCE;
                }
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit113 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB114 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB114.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool11 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool11, boolBoxBoolean9.booleanValue()));
                    Unit unit114 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB115 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit115 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB116.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool12 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool12, boolBoxBoolean9.booleanValue()));
                        Unit unit116 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB117 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB117.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting2 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting2, boolBoxBoolean7.booleanValue()));
                Unit unit117 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB118.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool13 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool13, boolBoxBoolean9.booleanValue()));
                    Unit unit118 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB119.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit119 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree3 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree3.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION)).booleanValue()) {
                    headsetFeatureTree3 = null;
                }
                if (headsetFeatureTree3 == null) {
                    headsetFeatureTree4 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                        headsetFeatureTree4 = null;
                    }
                    if (headsetFeatureTree4 == null) {
                        Deferred deferredB21 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                        mutableLiveData5 = this.c._percussionBroadcast;
                        this.b = coroutineScope;
                        this.d = mutableLiveData5;
                        this.a = 5;
                        obj = deferredB21.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool14 = (Boolean) obj;
                        boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean5 == null) {
                            boolBoxBoolean5 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData5.postValue(new PercussionBroadcastVo(bool14, boolBoxBoolean5.booleanValue()));
                        Unit unit21 = Unit.INSTANCE;
                    }
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            Deferred deferredB1110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB1110.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool15 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool15, boolBoxBoolean9.booleanValue()));
                            Unit unit1110 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB1111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB1111.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting3 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting3, boolBoxBoolean7.booleanValue()));
                    Unit unit1111 = Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1112.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool16 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool16, boolBoxBoolean9.booleanValue()));
                        Unit unit1112 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1113 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB22 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new m(null), 2, null);
                mutableLiveData4 = this.c._cervicalProtection;
                this.b = coroutineScope;
                this.d = mutableLiveData4;
                this.a = 4;
                obj = deferredB22.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool17 = (Boolean) obj;
                boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean4 == null) {
                    boolBoxBoolean4 = Boxing.boxBoolean(true);
                }
                mutableLiveData4.postValue(new CervicalProtectionVo(bool17, boolBoxBoolean4.booleanValue()));
                Unit unit22 = Unit.INSTANCE;
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    Deferred deferredB23 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                    mutableLiveData5 = this.c._percussionBroadcast;
                    this.b = coroutineScope;
                    this.d = mutableLiveData5;
                    this.a = 5;
                    obj = deferredB23.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool18 = (Boolean) obj;
                    boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean5 == null) {
                        boolBoxBoolean5 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData5.postValue(new PercussionBroadcastVo(bool18, boolBoxBoolean5.booleanValue()));
                    Unit unit23 = Unit.INSTANCE;
                }
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1114 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1114.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool19 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool19, boolBoxBoolean9.booleanValue()));
                        Unit unit1114 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1115.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting4 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting4, boolBoxBoolean7.booleanValue()));
                Unit unit1115 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB1116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1116.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool110 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool110, boolBoxBoolean9.booleanValue()));
                    Unit unit1116 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB1117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB1117.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit1117 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB1118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB1118.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting5 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting5, boolBoxBoolean7.booleanValue()));
                        Unit unit1118 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1119 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1120 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                mutableLiveData6 = this.c._hrReminderInfo;
                this.b = coroutineScope;
                this.d = mutableLiveData6;
                this.a = 6;
                obj = deferredB1120.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HrReminderInfo hrReminderInfo5 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo5, boolBoxBoolean6.booleanValue()));
                Unit unit1120 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    Deferred deferredB11110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB11110.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting6 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting6, boolBoxBoolean7.booleanValue()));
                    Unit unit11110 = Unit.INSTANCE;
                }
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11112 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11112.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11112 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB11113 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11113.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111, boolBoxBoolean9.booleanValue()));
                    Unit unit11113 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11114.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11114 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                mutableLiveData = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                NoiseControl noiseControl2 = (NoiseControl) obj;
                boolBoxBoolean = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean == null) {
                    boolBoxBoolean = Boxing.boxBoolean(true);
                }
                mutableLiveData.postValue(new NoiseReductionModeVo(noiseControl2, boolBoxBoolean.booleanValue()));
                Unit unit24 = Unit.INSTANCE;
                headsetFeatureTree = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree.isSupport(HeadsetSoftFeature.SPORT_RUNNING_RECOGNITION)).booleanValue()) {
                    headsetFeatureTree = null;
                }
                if (headsetFeatureTree == null) {
                    headsetFeatureTree2 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree2.isSupport(HeadsetSoftFeature.WEAR_INDUCTION)).booleanValue()) {
                        headsetFeatureTree2 = null;
                    }
                    if (headsetFeatureTree2 == null) {
                        Deferred deferredB120 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new l(null), 2, null);
                        mutableLiveData3 = this.c._wearInduction;
                        this.b = coroutineScope;
                        this.d = mutableLiveData3;
                        this.a = 3;
                        obj = deferredB120.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool20 = (Boolean) obj;
                        boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean3 == null) {
                            boolBoxBoolean3 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData3.postValue(new WearInductionVo(bool20, boolBoxBoolean3.booleanValue()));
                        Unit unit120 = Unit.INSTANCE;
                    }
                    headsetFeatureTree4 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                        headsetFeatureTree4 = null;
                    }
                    if (headsetFeatureTree4 == null) {
                        headsetFeatureTree5 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                            headsetFeatureTree5 = null;
                        }
                        if (headsetFeatureTree5 == null) {
                            Deferred deferredB1121 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                            mutableLiveData6 = this.c._hrReminderInfo;
                            this.b = coroutineScope;
                            this.d = mutableLiveData6;
                            this.a = 6;
                            obj = deferredB1121.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HrReminderInfo hrReminderInfo6 = (HrReminderInfo) obj;
                            boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean6 == null) {
                                boolBoxBoolean6 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo6, boolBoxBoolean6.booleanValue()));
                            Unit unit1121 = Unit.INSTANCE;
                        }
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            coroutineScope2 = coroutineScope;
                            headsetFeatureTree8 = this.c.headsetFeatureTree;
                            z = false;
                            if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                                hMBaseDeviceF = this.c.f();
                                if (hMBaseDeviceF == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolBoxBoolean8.booleanValue();
                                }
                                if (zBooleanValue) {
                                    z = true;
                                }
                            }
                            if (!Boxing.boxBoolean(z).booleanValue()) {
                                headsetFeatureTree8 = null;
                            }
                            if (headsetFeatureTree8 != null) {
                                Deferred deferredB11115 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                                mutableLiveData9 = this.c._smartPlay;
                                this.b = mutableLiveData9;
                                this.d = null;
                                this.a = 9;
                                obj = deferredB11115.await(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableLiveData10 = mutableLiveData9;
                                mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                                Unit unit11115 = Unit.INSTANCE;
                            }
                        } else {
                            Deferred deferredB11116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB11116.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool112 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool112, boolBoxBoolean9.booleanValue()));
                            Unit unit11116 = Unit.INSTANCE;
                            coroutineScope2 = coroutineScope;
                            headsetFeatureTree8 = this.c.headsetFeatureTree;
                            z = false;
                            if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                                hMBaseDeviceF = this.c.f();
                                if (hMBaseDeviceF == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolBoxBoolean8.booleanValue();
                                }
                                if (zBooleanValue) {
                                    z = true;
                                }
                            }
                            if (!Boxing.boxBoolean(z).booleanValue()) {
                                headsetFeatureTree8 = null;
                            }
                            if (headsetFeatureTree8 != null) {
                                Deferred deferredB11117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                                mutableLiveData9 = this.c._smartPlay;
                                this.b = mutableLiveData9;
                                this.d = null;
                                this.a = 9;
                                obj = deferredB11117.await(this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                mutableLiveData10 = mutableLiveData9;
                                mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                                Unit unit11117 = Unit.INSTANCE;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB24 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                    mutableLiveData5 = this.c._percussionBroadcast;
                    this.b = coroutineScope;
                    this.d = mutableLiveData5;
                    this.a = 5;
                    obj = deferredB24.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool113 = (Boolean) obj;
                    boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean5 == null) {
                        boolBoxBoolean5 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData5.postValue(new PercussionBroadcastVo(bool113, boolBoxBoolean5.booleanValue()));
                    Unit unit25 = Unit.INSTANCE;
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB1122 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB1122.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo7 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo7, boolBoxBoolean6.booleanValue()));
                        Unit unit1122 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB11118 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB11118.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit11118 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB11119 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB11119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool114 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool114, boolBoxBoolean9.booleanValue()));
                        Unit unit11119 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111110 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111110.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111110 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            Deferred deferredB111111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB111111.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool115 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool115, boolBoxBoolean9.booleanValue()));
                            Unit unit111111 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting7 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting7, boolBoxBoolean7.booleanValue()));
                    Unit unit111112 = Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB111113 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool116 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool116, boolBoxBoolean9.booleanValue()));
                        Unit unit111113 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111114.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111114 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB121 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new k(null), 2, null);
                mutableLiveData2 = this.c._runningRecognition;
                this.b = coroutineScope;
                this.d = mutableLiveData2;
                this.a = 2;
                obj = deferredB121.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool21 = (Boolean) obj;
                boolBoxBoolean2 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean2 == null) {
                    boolBoxBoolean2 = Boxing.boxBoolean(true);
                }
                mutableLiveData2.postValue(new RunningRecognitionVo(bool21, boolBoxBoolean2.booleanValue()));
                Unit unit121 = Unit.INSTANCE;
                headsetFeatureTree2 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree2.isSupport(HeadsetSoftFeature.WEAR_INDUCTION)).booleanValue()) {
                    headsetFeatureTree2 = null;
                }
                if (headsetFeatureTree2 == null) {
                    Deferred deferredB122 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new l(null), 2, null);
                    mutableLiveData3 = this.c._wearInduction;
                    this.b = coroutineScope;
                    this.d = mutableLiveData3;
                    this.a = 3;
                    obj = deferredB122.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool22 = (Boolean) obj;
                    boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean3 == null) {
                        boolBoxBoolean3 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData3.postValue(new WearInductionVo(bool22, boolBoxBoolean3.booleanValue()));
                    Unit unit122 = Unit.INSTANCE;
                }
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB1123 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB1123.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo8 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo8, boolBoxBoolean6.booleanValue()));
                        Unit unit1123 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111115 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111115.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111115 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB111116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB111116.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool117 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool117, boolBoxBoolean9.booleanValue()));
                        Unit unit111116 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111117.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111117 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB25 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                mutableLiveData5 = this.c._percussionBroadcast;
                this.b = coroutineScope;
                this.d = mutableLiveData5;
                this.a = 5;
                obj = deferredB25.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool118 = (Boolean) obj;
                boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean5 == null) {
                    boolBoxBoolean5 = Boxing.boxBoolean(true);
                }
                mutableLiveData5.postValue(new PercussionBroadcastVo(bool118, boolBoxBoolean5.booleanValue()));
                Unit unit26 = Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    Deferred deferredB1124 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                    mutableLiveData6 = this.c._hrReminderInfo;
                    this.b = coroutineScope;
                    this.d = mutableLiveData6;
                    this.a = 6;
                    obj = deferredB1124.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HrReminderInfo hrReminderInfo9 = (HrReminderInfo) obj;
                    boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean6 == null) {
                        boolBoxBoolean6 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo9, boolBoxBoolean6.booleanValue()));
                    Unit unit1124 = Unit.INSTANCE;
                }
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111118 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111118.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111118 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB111119 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB111119.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool119 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool119, boolBoxBoolean9.booleanValue()));
                    Unit unit111119 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111110 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111110.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111110 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1111111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111111.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1110 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool1110, boolBoxBoolean9.booleanValue()));
                        Unit unit1111111 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1111112.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting8 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting8, boolBoxBoolean7.booleanValue()));
                Unit unit1111112 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB1111113 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111113.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1111 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool1111, boolBoxBoolean9.booleanValue()));
                    Unit unit1111113 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB1111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB1111114.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit1111114 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree3 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree3.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION)).booleanValue()) {
                    headsetFeatureTree3 = null;
                }
                if (headsetFeatureTree3 == null) {
                    headsetFeatureTree4 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                        headsetFeatureTree4 = null;
                    }
                    if (headsetFeatureTree4 == null) {
                        Deferred deferredB26 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                        mutableLiveData5 = this.c._percussionBroadcast;
                        this.b = coroutineScope;
                        this.d = mutableLiveData5;
                        this.a = 5;
                        obj = deferredB26.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1112 = (Boolean) obj;
                        boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean5 == null) {
                            boolBoxBoolean5 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData5.postValue(new PercussionBroadcastVo(bool1112, boolBoxBoolean5.booleanValue()));
                        Unit unit27 = Unit.INSTANCE;
                    }
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            Deferred deferredB1111115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB1111115.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool1113 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool1113, boolBoxBoolean9.booleanValue()));
                            Unit unit1111115 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB1111116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB1111116.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting9 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting9, boolBoxBoolean7.booleanValue()));
                    Unit unit1111116 = Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1111117 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1114 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool1114, boolBoxBoolean9.booleanValue()));
                        Unit unit1111117 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111118 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111118.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111118 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB27 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new m(null), 2, null);
                mutableLiveData4 = this.c._cervicalProtection;
                this.b = coroutineScope;
                this.d = mutableLiveData4;
                this.a = 4;
                obj = deferredB27.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool120 = (Boolean) obj;
                boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean4 == null) {
                    boolBoxBoolean4 = Boxing.boxBoolean(true);
                }
                mutableLiveData4.postValue(new CervicalProtectionVo(bool120, boolBoxBoolean4.booleanValue()));
                Unit unit28 = Unit.INSTANCE;
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    Deferred deferredB28 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                    mutableLiveData5 = this.c._percussionBroadcast;
                    this.b = coroutineScope;
                    this.d = mutableLiveData5;
                    this.a = 5;
                    obj = deferredB28.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1115 = (Boolean) obj;
                    boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean5 == null) {
                        boolBoxBoolean5 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData5.postValue(new PercussionBroadcastVo(bool1115, boolBoxBoolean5.booleanValue()));
                    Unit unit29 = Unit.INSTANCE;
                }
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1111119 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1116 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool1116, boolBoxBoolean9.booleanValue()));
                        Unit unit1111119 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB11111110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB11111110.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting10 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting10, boolBoxBoolean7.booleanValue()));
                Unit unit11111110 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB11111111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11111111.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1117 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool1117, boolBoxBoolean9.booleanValue()));
                    Unit unit11111111 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111112 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111112 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB11111113 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB11111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting11 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting11, boolBoxBoolean7.booleanValue()));
                        Unit unit11111113 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111114.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111114 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1125 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                mutableLiveData6 = this.c._hrReminderInfo;
                this.b = coroutineScope;
                this.d = mutableLiveData6;
                this.a = 6;
                obj = deferredB1125.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HrReminderInfo hrReminderInfo10 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo10, boolBoxBoolean6.booleanValue()));
                Unit unit1125 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    Deferred deferredB11111115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB11111115.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting12 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting12, boolBoxBoolean7.booleanValue()));
                    Unit unit11111115 = Unit.INSTANCE;
                }
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111116 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111116.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111116 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111117 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB11111118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11111118.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1118 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool1118, boolBoxBoolean9.booleanValue()));
                    Unit unit11111118 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111119 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                mutableLiveData2 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                Boolean bool23 = (Boolean) obj;
                boolBoxBoolean2 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean2 == null) {
                    boolBoxBoolean2 = Boxing.boxBoolean(true);
                }
                mutableLiveData2.postValue(new RunningRecognitionVo(bool23, boolBoxBoolean2.booleanValue()));
                Unit unit123 = Unit.INSTANCE;
                headsetFeatureTree2 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree2.isSupport(HeadsetSoftFeature.WEAR_INDUCTION)).booleanValue()) {
                    headsetFeatureTree2 = null;
                }
                if (headsetFeatureTree2 == null) {
                    headsetFeatureTree3 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree3.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION)).booleanValue()) {
                        headsetFeatureTree3 = null;
                    }
                    if (headsetFeatureTree3 == null) {
                        Deferred deferredB29 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new m(null), 2, null);
                        mutableLiveData4 = this.c._cervicalProtection;
                        this.b = coroutineScope;
                        this.d = mutableLiveData4;
                        this.a = 4;
                        obj = deferredB29.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool121 = (Boolean) obj;
                        boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean4 == null) {
                            boolBoxBoolean4 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData4.postValue(new CervicalProtectionVo(bool121, boolBoxBoolean4.booleanValue()));
                        Unit unit210 = Unit.INSTANCE;
                    }
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        headsetFeatureTree6 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                            headsetFeatureTree6 = null;
                        }
                        if (headsetFeatureTree6 == null) {
                            Deferred deferredB111111110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                            mutableLiveData7 = this.c._headsetSportSetting;
                            this.b = coroutineScope;
                            this.d = mutableLiveData7;
                            this.a = 7;
                            obj = deferredB111111110.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            HeadsetSportSetting headsetSportSetting13 = (HeadsetSportSetting) obj;
                            boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean7 == null) {
                                boolBoxBoolean7 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting13, boolBoxBoolean7.booleanValue()));
                            Unit unit111111110 = Unit.INSTANCE;
                        }
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111111111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111111111.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111111111 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB1126 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                    mutableLiveData6 = this.c._hrReminderInfo;
                    this.b = coroutineScope;
                    this.d = mutableLiveData6;
                    this.a = 6;
                    obj = deferredB1126.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HrReminderInfo hrReminderInfo11 = (HrReminderInfo) obj;
                    boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean6 == null) {
                        boolBoxBoolean6 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo11, boolBoxBoolean6.booleanValue()));
                    Unit unit1126 = Unit.INSTANCE;
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB111111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB111111112.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting14 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting14, boolBoxBoolean7.booleanValue()));
                        Unit unit111111112 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111113 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111111114.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111111114 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB111111115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB111111115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1119 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool1119, boolBoxBoolean9.booleanValue()));
                        Unit unit111111115 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111111116 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111111116.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111111116 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB123 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new l(null), 2, null);
                mutableLiveData3 = this.c._wearInduction;
                this.b = coroutineScope;
                this.d = mutableLiveData3;
                this.a = 3;
                obj = deferredB123.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool24 = (Boolean) obj;
                boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean3 == null) {
                    boolBoxBoolean3 = Boxing.boxBoolean(true);
                }
                mutableLiveData3.postValue(new WearInductionVo(bool24, boolBoxBoolean3.booleanValue()));
                Unit unit124 = Unit.INSTANCE;
                headsetFeatureTree3 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree3.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION)).booleanValue()) {
                    headsetFeatureTree3 = null;
                }
                if (headsetFeatureTree3 == null) {
                    Deferred deferredB210 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new m(null), 2, null);
                    mutableLiveData4 = this.c._cervicalProtection;
                    this.b = coroutineScope;
                    this.d = mutableLiveData4;
                    this.a = 4;
                    obj = deferredB210.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool122 = (Boolean) obj;
                    boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean4 == null) {
                        boolBoxBoolean4 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData4.postValue(new CervicalProtectionVo(bool122, boolBoxBoolean4.booleanValue()));
                    Unit unit211 = Unit.INSTANCE;
                }
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB111111117 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB111111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting15 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting15, boolBoxBoolean7.booleanValue()));
                        Unit unit111111117 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111118 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111118.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111118 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1127 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                mutableLiveData6 = this.c._hrReminderInfo;
                this.b = coroutineScope;
                this.d = mutableLiveData6;
                this.a = 6;
                obj = deferredB1127.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HrReminderInfo hrReminderInfo12 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo12, boolBoxBoolean6.booleanValue()));
                Unit unit1127 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    Deferred deferredB111111119 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB111111119.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting16 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting16, boolBoxBoolean7.booleanValue()));
                    Unit unit111111119 = Unit.INSTANCE;
                }
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB1111111110 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB1111111110.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit1111111110 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111111.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111111 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB1111111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool11110 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool11110, boolBoxBoolean9.booleanValue()));
                    Unit unit1111111112 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111113 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB1128 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB1128.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo13 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo13, boolBoxBoolean6.booleanValue()));
                        Unit unit1128 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB1111111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB1111111114.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit1111111114 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB1111111115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111111115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool11111 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool11111, boolBoxBoolean9.booleanValue()));
                        Unit unit1111111115 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB1111111116 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB1111111116.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit1111111116 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB211 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                mutableLiveData5 = this.c._percussionBroadcast;
                this.b = coroutineScope;
                this.d = mutableLiveData5;
                this.a = 5;
                obj = deferredB211.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool11112 = (Boolean) obj;
                boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean5 == null) {
                    boolBoxBoolean5 = Boxing.boxBoolean(true);
                }
                mutableLiveData5.postValue(new PercussionBroadcastVo(bool11112, boolBoxBoolean5.booleanValue()));
                Unit unit212 = Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    Deferred deferredB1129 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                    mutableLiveData6 = this.c._hrReminderInfo;
                    this.b = coroutineScope;
                    this.d = mutableLiveData6;
                    this.a = 6;
                    obj = deferredB1129.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HrReminderInfo hrReminderInfo14 = (HrReminderInfo) obj;
                    boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean6 == null) {
                        boolBoxBoolean6 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo14, boolBoxBoolean6.booleanValue()));
                    Unit unit1129 = Unit.INSTANCE;
                }
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111117 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB1111111118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111111118.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool11113 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool11113, boolBoxBoolean9.booleanValue()));
                    Unit unit1111111118 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111119 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB11111111110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB11111111110.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool11114 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool11114, boolBoxBoolean9.booleanValue()));
                        Unit unit11111111110 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1111111120 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1111111120.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting17 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting17, boolBoxBoolean7.booleanValue()));
                Unit unit1111111120 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB11111111111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11111111111.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool11115 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool11115, boolBoxBoolean9.booleanValue()));
                    Unit unit11111111111 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111111112 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111111112 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 3:
                mutableLiveData3 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                Boolean bool25 = (Boolean) obj;
                boolBoxBoolean3 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean3 == null) {
                    boolBoxBoolean3 = Boxing.boxBoolean(true);
                }
                mutableLiveData3.postValue(new WearInductionVo(bool25, boolBoxBoolean3.booleanValue()));
                Unit unit125 = Unit.INSTANCE;
                headsetFeatureTree3 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree3.isSupport(HeadsetSoftFeature.CERVICAL_PROTECTION)).booleanValue()) {
                    headsetFeatureTree3 = null;
                }
                if (headsetFeatureTree3 == null) {
                    headsetFeatureTree4 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                        headsetFeatureTree4 = null;
                    }
                    if (headsetFeatureTree4 == null) {
                        Deferred deferredB212 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                        mutableLiveData5 = this.c._percussionBroadcast;
                        this.b = coroutineScope;
                        this.d = mutableLiveData5;
                        this.a = 5;
                        obj = deferredB212.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool11116 = (Boolean) obj;
                        boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean5 == null) {
                            boolBoxBoolean5 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData5.postValue(new PercussionBroadcastVo(bool11116, boolBoxBoolean5.booleanValue()));
                        Unit unit213 = Unit.INSTANCE;
                    }
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        headsetFeatureTree7 = this.c.headsetFeatureTree;
                        if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                            headsetFeatureTree7 = null;
                        }
                        if (headsetFeatureTree7 == null) {
                            Deferred deferredB11111111113 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                            mutableLiveData8 = this.c._statusHearingHealth;
                            this.b = coroutineScope;
                            this.d = mutableLiveData8;
                            this.a = 8;
                            obj = deferredB11111111113.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Boolean bool11117 = (Boolean) obj;
                            boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                            if (boolBoxBoolean9 == null) {
                                boolBoxBoolean9 = Boxing.boxBoolean(true);
                            }
                            mutableLiveData8.postValue(new HearingHealthStatusVo(bool11117, boolBoxBoolean9.booleanValue()));
                            Unit unit11111111113 = Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    Deferred deferredB1111111121 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB1111111121.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting18 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting18, boolBoxBoolean7.booleanValue()));
                    Unit unit1111111121 = Unit.INSTANCE;
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB11111111114 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB11111111114.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool11118 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool11118, boolBoxBoolean9.booleanValue()));
                        Unit unit11111111114 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111111115 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111111115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111111115 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB213 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new m(null), 2, null);
                mutableLiveData4 = this.c._cervicalProtection;
                this.b = coroutineScope;
                this.d = mutableLiveData4;
                this.a = 4;
                obj = deferredB213.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool123 = (Boolean) obj;
                boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean4 == null) {
                    boolBoxBoolean4 = Boxing.boxBoolean(true);
                }
                mutableLiveData4.postValue(new CervicalProtectionVo(bool123, boolBoxBoolean4.booleanValue()));
                Unit unit214 = Unit.INSTANCE;
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    Deferred deferredB214 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                    mutableLiveData5 = this.c._percussionBroadcast;
                    this.b = coroutineScope;
                    this.d = mutableLiveData5;
                    this.a = 5;
                    obj = deferredB214.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool11119 = (Boolean) obj;
                    boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean5 == null) {
                        boolBoxBoolean5 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData5.postValue(new PercussionBroadcastVo(bool11119, boolBoxBoolean5.booleanValue()));
                    Unit unit215 = Unit.INSTANCE;
                }
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB11111111116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB11111111116.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool111110 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool111110, boolBoxBoolean9.booleanValue()));
                        Unit unit11111111116 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1111111122 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1111111122.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting19 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting19, boolBoxBoolean7.booleanValue()));
                Unit unit1111111122 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB11111111117 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11111111117.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111111 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111111, boolBoxBoolean9.booleanValue()));
                    Unit unit11111111117 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111111118 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111111118.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111111118 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB1111111123 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB1111111123.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting110 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting110, boolBoxBoolean7.booleanValue()));
                        Unit unit1111111123 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111111119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111111119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111111119 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB11210 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                mutableLiveData6 = this.c._hrReminderInfo;
                this.b = coroutineScope;
                this.d = mutableLiveData6;
                this.a = 6;
                obj = deferredB11210.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HrReminderInfo hrReminderInfo15 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo15, boolBoxBoolean6.booleanValue()));
                Unit unit11210 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    Deferred deferredB1111111124 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB1111111124.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting111 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting111, boolBoxBoolean7.booleanValue()));
                    Unit unit1111111124 = Unit.INSTANCE;
                }
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB111111111110 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB111111111110.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit111111111110 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111111111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111111111.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111111111 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB111111111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB111111111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111112 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111112, boolBoxBoolean9.booleanValue()));
                    Unit unit111111111112 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111111113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111111113 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                mutableLiveData4 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                Boolean bool124 = (Boolean) obj;
                boolBoxBoolean4 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean4 == null) {
                    boolBoxBoolean4 = Boxing.boxBoolean(true);
                }
                mutableLiveData4.postValue(new CervicalProtectionVo(bool124, boolBoxBoolean4.booleanValue()));
                Unit unit216 = Unit.INSTANCE;
                headsetFeatureTree4 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree4.isSupport(HeadsetSoftFeature.SPORT_PERCUSSION_BROADCAST)).booleanValue()) {
                    headsetFeatureTree4 = null;
                }
                if (headsetFeatureTree4 == null) {
                    headsetFeatureTree5 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                        headsetFeatureTree5 = null;
                    }
                    if (headsetFeatureTree5 == null) {
                        Deferred deferredB11211 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                        mutableLiveData6 = this.c._hrReminderInfo;
                        this.b = coroutineScope;
                        this.d = mutableLiveData6;
                        this.a = 6;
                        obj = deferredB11211.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HrReminderInfo hrReminderInfo16 = (HrReminderInfo) obj;
                        boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean6 == null) {
                            boolBoxBoolean6 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo16, boolBoxBoolean6.booleanValue()));
                        Unit unit11211 = Unit.INSTANCE;
                    }
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111111111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111111111114.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111111111114 = Unit.INSTANCE;
                        }
                    } else {
                        Deferred deferredB111111111115 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB111111111115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool111113 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool111113, boolBoxBoolean9.booleanValue()));
                        Unit unit111111111115 = Unit.INSTANCE;
                        coroutineScope2 = coroutineScope;
                        headsetFeatureTree8 = this.c.headsetFeatureTree;
                        z = false;
                        if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                            hMBaseDeviceF = this.c.f();
                            if (hMBaseDeviceF == null) {
                                zBooleanValue = false;
                            } else {
                                zBooleanValue = boolBoxBoolean8.booleanValue();
                            }
                            if (zBooleanValue) {
                                z = true;
                            }
                        }
                        if (!Boxing.boxBoolean(z).booleanValue()) {
                            headsetFeatureTree8 = null;
                        }
                        if (headsetFeatureTree8 != null) {
                            Deferred deferredB111111111116 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                            mutableLiveData9 = this.c._smartPlay;
                            this.b = mutableLiveData9;
                            this.d = null;
                            this.a = 9;
                            obj = deferredB111111111116.await(this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutableLiveData10 = mutableLiveData9;
                            mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                            Unit unit111111111116 = Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB215 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new e(null), 2, null);
                mutableLiveData5 = this.c._percussionBroadcast;
                this.b = coroutineScope;
                this.d = mutableLiveData5;
                this.a = 5;
                obj = deferredB215.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Boolean bool111114 = (Boolean) obj;
                boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean5 == null) {
                    boolBoxBoolean5 = Boxing.boxBoolean(true);
                }
                mutableLiveData5.postValue(new PercussionBroadcastVo(bool111114, boolBoxBoolean5.booleanValue()));
                Unit unit217 = Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    Deferred deferredB11212 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                    mutableLiveData6 = this.c._hrReminderInfo;
                    this.b = coroutineScope;
                    this.d = mutableLiveData6;
                    this.a = 6;
                    obj = deferredB11212.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HrReminderInfo hrReminderInfo17 = (HrReminderInfo) obj;
                    boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean6 == null) {
                        boolBoxBoolean6 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo17, boolBoxBoolean6.booleanValue()));
                    Unit unit11212 = Unit.INSTANCE;
                }
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111111117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111111117 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB111111111118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB111111111118.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111115 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111115, boolBoxBoolean9.booleanValue()));
                    Unit unit111111111118 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB111111111119 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB111111111119.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit111111111119 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1111111111110 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111111111110.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool111116 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool111116, boolBoxBoolean9.booleanValue()));
                        Unit unit1111111111110 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1111111125 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1111111125.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting112 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting112, boolBoxBoolean7.booleanValue()));
                Unit unit1111111125 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB1111111111111 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111111111111.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111117 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111117, boolBoxBoolean9.booleanValue()));
                    Unit unit1111111111111 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB1111111111112 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB1111111111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit1111111111112 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 5:
                mutableLiveData5 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                Boolean bool111118 = (Boolean) obj;
                boolBoxBoolean5 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean5 == null) {
                    boolBoxBoolean5 = Boxing.boxBoolean(true);
                }
                mutableLiveData5.postValue(new PercussionBroadcastVo(bool111118, boolBoxBoolean5.booleanValue()));
                Unit unit218 = Unit.INSTANCE;
                headsetFeatureTree5 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree5.isSupport(HeadsetSoftFeature.SPORT_HIGH_HEART_RATE_REMINDER)).booleanValue()) {
                    headsetFeatureTree5 = null;
                }
                if (headsetFeatureTree5 == null) {
                    headsetFeatureTree6 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                        headsetFeatureTree6 = null;
                    }
                    if (headsetFeatureTree6 == null) {
                        Deferred deferredB1111111126 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                        mutableLiveData7 = this.c._headsetSportSetting;
                        this.b = coroutineScope;
                        this.d = mutableLiveData7;
                        this.a = 7;
                        obj = deferredB1111111126.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        HeadsetSportSetting headsetSportSetting113 = (HeadsetSportSetting) obj;
                        boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean7 == null) {
                            boolBoxBoolean7 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting113, boolBoxBoolean7.booleanValue()));
                        Unit unit1111111126 = Unit.INSTANCE;
                    }
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111111113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111111113 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB11213 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new f(null), 2, null);
                mutableLiveData6 = this.c._hrReminderInfo;
                this.b = coroutineScope;
                this.d = mutableLiveData6;
                this.a = 6;
                obj = deferredB11213.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HrReminderInfo hrReminderInfo18 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo18, boolBoxBoolean6.booleanValue()));
                Unit unit11213 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    Deferred deferredB1111111127 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                    mutableLiveData7 = this.c._headsetSportSetting;
                    this.b = coroutineScope;
                    this.d = mutableLiveData7;
                    this.a = 7;
                    obj = deferredB1111111127.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    HeadsetSportSetting headsetSportSetting114 = (HeadsetSportSetting) obj;
                    boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean7 == null) {
                        boolBoxBoolean7 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting114, boolBoxBoolean7.booleanValue()));
                    Unit unit1111111127 = Unit.INSTANCE;
                }
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB1111111111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB1111111111114.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit1111111111114 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111111115 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111111115.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111111115 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB1111111111116 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111111111116.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool111119 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool111119, boolBoxBoolean9.booleanValue()));
                    Unit unit1111111111116 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB1111111111117 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB1111111111117.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit1111111111117 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 6:
                mutableLiveData6 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                HrReminderInfo hrReminderInfo19 = (HrReminderInfo) obj;
                boolBoxBoolean6 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean6 == null) {
                    boolBoxBoolean6 = Boxing.boxBoolean(true);
                }
                mutableLiveData6.postValue(new HrReminderInfoVo(hrReminderInfo19, boolBoxBoolean6.booleanValue()));
                Unit unit11214 = Unit.INSTANCE;
                headsetFeatureTree6 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree6.isSupport(HeadsetSoftFeature.SPORT_BEAT_ENHANCEMENT)).booleanValue()) {
                    headsetFeatureTree6 = null;
                }
                if (headsetFeatureTree6 == null) {
                    headsetFeatureTree7 = this.c.headsetFeatureTree;
                    if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                        headsetFeatureTree7 = null;
                    }
                    if (headsetFeatureTree7 == null) {
                        Deferred deferredB1111111111118 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                        mutableLiveData8 = this.c._statusHearingHealth;
                        this.b = coroutineScope;
                        this.d = mutableLiveData8;
                        this.a = 8;
                        obj = deferredB1111111111118.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Boolean bool1111110 = (Boolean) obj;
                        boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                        if (boolBoxBoolean9 == null) {
                            boolBoxBoolean9 = Boxing.boxBoolean(true);
                        }
                        mutableLiveData8.postValue(new HearingHealthStatusVo(bool1111110, boolBoxBoolean9.booleanValue()));
                        Unit unit1111111111118 = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                Deferred deferredB1111111128 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new g(null), 2, null);
                mutableLiveData7 = this.c._headsetSportSetting;
                this.b = coroutineScope;
                this.d = mutableLiveData7;
                this.a = 7;
                obj = deferredB1111111128.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                HeadsetSportSetting headsetSportSetting115 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting115, boolBoxBoolean7.booleanValue()));
                Unit unit1111111128 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    Deferred deferredB1111111111119 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB1111111111119.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1111111 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool1111111, boolBoxBoolean9.booleanValue()));
                    Unit unit1111111111119 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111111111110 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111111111110.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111111111110 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 7:
                mutableLiveData7 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                HeadsetSportSetting headsetSportSetting116 = (HeadsetSportSetting) obj;
                boolBoxBoolean7 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean7 == null) {
                    boolBoxBoolean7 = Boxing.boxBoolean(true);
                }
                mutableLiveData7.postValue(new HeadsetSportSettingVo(headsetSportSetting116, boolBoxBoolean7.booleanValue()));
                Unit unit1111111129 = Unit.INSTANCE;
                headsetFeatureTree7 = this.c.headsetFeatureTree;
                if (!Boxing.boxBoolean(headsetFeatureTree7.isSupport(HeadsetSoftFeature.HEARING_HEALTH)).booleanValue()) {
                    headsetFeatureTree7 = null;
                }
                if (headsetFeatureTree7 == null) {
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111111111111 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111111111111.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111111111111 = Unit.INSTANCE;
                    }
                } else {
                    Deferred deferredB11111111111112 = kotlinx.coroutines.e.b(coroutineScope, coroutineScope.getCoroutineContext(), null, this.c.new h(null), 2, null);
                    mutableLiveData8 = this.c._statusHearingHealth;
                    this.b = coroutineScope;
                    this.d = mutableLiveData8;
                    this.a = 8;
                    obj = deferredB11111111111112.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Boolean bool1111112 = (Boolean) obj;
                    boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                    if (boolBoxBoolean9 == null) {
                        boolBoxBoolean9 = Boxing.boxBoolean(true);
                    }
                    mutableLiveData8.postValue(new HearingHealthStatusVo(bool1111112, boolBoxBoolean9.booleanValue()));
                    Unit unit11111111111112 = Unit.INSTANCE;
                    coroutineScope2 = coroutineScope;
                    headsetFeatureTree8 = this.c.headsetFeatureTree;
                    z = false;
                    if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                        hMBaseDeviceF = this.c.f();
                        if (hMBaseDeviceF == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = boolBoxBoolean8.booleanValue();
                        }
                        if (zBooleanValue) {
                            z = true;
                        }
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        headsetFeatureTree8 = null;
                    }
                    if (headsetFeatureTree8 != null) {
                        Deferred deferredB11111111111113 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                        mutableLiveData9 = this.c._smartPlay;
                        this.b = mutableLiveData9;
                        this.d = null;
                        this.a = 9;
                        obj = deferredB11111111111113.await(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutableLiveData10 = mutableLiveData9;
                        mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                        Unit unit11111111111113 = Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 8:
                mutableLiveData8 = (MutableLiveData) this.d;
                coroutineScope = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                Boolean bool1111113 = (Boolean) obj;
                boolBoxBoolean9 = (Boolean) this.c._deviceEnable.getValue();
                if (boolBoxBoolean9 == null) {
                    boolBoxBoolean9 = Boxing.boxBoolean(true);
                }
                mutableLiveData8.postValue(new HearingHealthStatusVo(bool1111113, boolBoxBoolean9.booleanValue()));
                Unit unit11111111111114 = Unit.INSTANCE;
                coroutineScope2 = coroutineScope;
                headsetFeatureTree8 = this.c.headsetFeatureTree;
                z = false;
                if (headsetFeatureTree8.isSupport(HeadsetSoftFeature.SMART_PLAY_MUSIC)) {
                    hMBaseDeviceF = this.c.f();
                    if (hMBaseDeviceF == null) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = boolBoxBoolean8.booleanValue();
                    }
                    if (zBooleanValue) {
                        z = true;
                    }
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    headsetFeatureTree8 = null;
                }
                if (headsetFeatureTree8 != null) {
                    Deferred deferredB11111111111114 = kotlinx.coroutines.e.b(coroutineScope2, coroutineScope2.getCoroutineContext(), null, this.c.new i(null), 2, null);
                    mutableLiveData9 = this.c._smartPlay;
                    this.b = mutableLiveData9;
                    this.d = null;
                    this.a = 9;
                    obj = deferredB11111111111114.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData10 = mutableLiveData9;
                    mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                    Unit unit11111111111115 = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 9:
                mutableLiveData10 = (MutableLiveData) this.b;
                ResultKt.throwOnFailure(obj);
                mutableLiveData10.postValue(new SmartPlayVo((Boolean) obj, true));
                Unit unit11111111111116 = Unit.INSTANCE;
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
