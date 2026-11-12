package com.xiaomi.fitness.mine.personal.data.management.data;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.m0j;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0016\u001a\n\u0010\u0017\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u001a\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u001c\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u001d\u001a\u00020\u0015*\u00020\u0018\u001a\n\u0010\u001e\u001a\u00020\u0001*\u00020\u0001\u001a\u001e\u0010\u001f\u001a\u00020 *\b\u0012\u0004\u0012\u00020\u00010!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!\u001a\u0012\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"PARAM_APP_ID", "", "PARAM_APP_NAME", "PARAM_APP_AUTH_SCOPE_TYPE", "APP_ID_WECHAT", "", "APP_ID_ALIPAY", "APP_ID_ZEPP_LIFE", "APP_ID_STRAVA", "APP_ID_GOOGLE_FIT", "APP_ID_SUUNTO", "APP_ID_HEALTH_CONNECT", "HEALTH_DATA_TYPE_READ_SUFFIX", "HEALTH_DATA_TYPE_WRITE_SUFFIX", "TYPE_KEY_SPORT_RECORD", "PARAM_TENANT_ID", "PARAM_THIRD_PARTY_TYPE", "curtDeviceModelDid", "getCurtDeviceModelDid", "()Ljava/lang/String;", "goToWechatShareHomepage", "", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "goToAlipayShareHomepage", "Landroidx/fragment/app/FragmentActivity;", "goToZeppLifePage", "goToStravaPage", "goToGoogleFitPage", "goToSuuntoPage", "gotoHealthConnect", "convertToHealthDataTypeName", "hasSameContent", "", "", "list", "getHomeTypeByHealthDataPersistKey", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "persistKey", "mine_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersonalDataManagementExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalDataManagementExt.kt\ncom/xiaomi/fitness/mine/personal/data/management/data/PersonalDataManagementExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1863#2,2:187\n*S KotlinDebug\n*F\n+ 1 PersonalDataManagementExt.kt\ncom/xiaomi/fitness/mine/personal/data/management/data/PersonalDataManagementExtKt\n*L\n132#1:187,2\n*E\n"})
public final class PersonalDataManagementExtKt {
    public static final long APP_ID_ALIPAY = -102;
    public static final long APP_ID_GOOGLE_FIT = -105;
    public static final long APP_ID_HEALTH_CONNECT = -107;
    public static final long APP_ID_STRAVA = -104;
    public static final long APP_ID_SUUNTO = -106;
    public static final long APP_ID_WECHAT = -101;
    public static final long APP_ID_ZEPP_LIFE = -103;

    @NotNull
    public static final String HEALTH_DATA_TYPE_READ_SUFFIX = ".read";

    @NotNull
    public static final String HEALTH_DATA_TYPE_WRITE_SUFFIX = ".write";

    @NotNull
    public static final String PARAM_APP_AUTH_SCOPE_TYPE = "param_app_auth_scope_type";

    @NotNull
    public static final String PARAM_APP_ID = "param_app_id";

    @NotNull
    public static final String PARAM_APP_NAME = "param_app_name";

    @NotNull
    public static final String PARAM_TENANT_ID = "tenant_id";

    @NotNull
    public static final String PARAM_THIRD_PARTY_TYPE = "third_party_type";

    @NotNull
    public static final String TYPE_KEY_SPORT_RECORD = "sport_record";

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt$gotoHealthConnect$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt$gotoHealthConnect$1", f = "PersonalDataManagementExt.kt", i = {}, l = {93, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AccessManager $instance;
        final /* synthetic */ FragmentActivity $this_gotoHealthConnect;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt$gotoHealthConnect$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt$gotoHealthConnect$1$1", f = "PersonalDataManagementExt.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $hasAuthed;
            final /* synthetic */ AccessManager $instance;
            final /* synthetic */ FragmentActivity $this_gotoHealthConnect;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06431(boolean z, AccessManager accessManager, FragmentActivity fragmentActivity, Continuation<? super C06431> continuation) {
                super(2, continuation);
                this.$hasAuthed = z;
                this.$instance = accessManager;
                this.$this_gotoHealthConnect = fragmentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06431(this.$hasAuthed, this.$instance, this.$this_gotoHealthConnect, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (this.$hasAuthed) {
                    this.$instance.gotoHealthConnectPermissionInfoActivity(this.$this_gotoHealthConnect);
                } else {
                    this.$instance.gotoHealthConnectIntroductionActivity(this.$this_gotoHealthConnect);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AccessManager accessManager, FragmentActivity fragmentActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$instance = accessManager;
            this.$this_gotoHealthConnect = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$instance, this.$this_gotoHealthConnect, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            AccessManager accessManager = this.$instance;
            FragmentActivity fragmentActivity = this.$this_gotoHealthConnect;
            this.label = 1;
            obj = accessManager.isHealthConnectAuthed(fragmentActivity, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C06431 c06431 = new C06431(zBooleanValue, this.$instance, this.$this_gotoHealthConnect, null);
            this.label = 2;
            if (BuildersKt.withContext(main, c06431, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @NotNull
    public static final String convertToHealthDataTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        if (StringsKt__StringsJVMKt.endsWith$default(str, HEALTH_DATA_TYPE_READ_SUFFIX, false, 2, null)) {
            str = str.substring(0, length - 5);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        } else if (StringsKt__StringsJVMKt.endsWith$default(str, HEALTH_DATA_TYPE_WRITE_SUFFIX, false, 2, null)) {
            str = str.substring(0, length - 6);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        if (Intrinsics.areEqual(str, TYPE_KEY_SPORT_RECORD)) {
            return ResourceExtKt.getString(m0j.V);
        }
        HomeDataType homeTypeByHealthDataPersistKey = getHomeTypeByHealthDataPersistKey(str);
        return homeTypeByHealthDataPersistKey == null ? "" : HealthPageExtKt.getInstance(IHealthPage.INSTANCE).getHealthDataTypeNameByHomeDataType(homeTypeByHealthDataPersistKey);
    }

    @Nullable
    public static final String getCurtDeviceModelDid() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            return wearableDeviceModel.getDid();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0158, code lost:
    
        if (r1.equals("stress") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0185, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualHr) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0191, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualSpo2) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019a, code lost:
    
        if (r1.equals("low_spo2") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01a6, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ManualStress) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.NightSleep) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ac, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.STRESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.STEP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.HEARING_HEALTH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.SLEEP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.WOMEN_HEALTH;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.HR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return com.xiaomi.fit.fitness.export.data.annotation.HomeDataType.SPO2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.RestHr) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.equals("headset") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalHr) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r1.equals("abnormal_heart_beat") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        if (r1.equals("steps") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        if (r1.equals("sleep") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.Noise) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.WomenHealthStatus) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMinHr) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c7, code lost:
    
        if (r1.equals("spo2") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ActiveStage) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalHrLow) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f7, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.AbnormalStress) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010f, code lost:
    
        if (r1.equals("high_heart_rate") == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0119, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.DaytimeSleep) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0135, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.ReportMaxHr) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x014c, code lost:
    
        if (r1.equals(com.xiaomi.fit.fitness.export.data.FitnessPersistKey.WomenHealthSymptoms) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r1.equals("heart_rate") == false) goto L130;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.xiaomi.fit.fitness.export.data.annotation.HomeDataType getHomeTypeByHealthDataPersistKey(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.mine.personal.data.management.data.PersonalDataManagementExtKt.getHomeTypeByHealthDataPersistKey(java.lang.String):com.xiaomi.fit.fitness.export.data.annotation.HomeDataType");
    }

    public static final void goToAlipayShareHomepage(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoAlipayActivity(fragmentActivity);
    }

    public static final void goToGoogleFitPage(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).goToGoogleFitActivity(fragmentActivity);
    }

    public static final void goToStravaPage(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoStravaActivity(fragmentActivity);
    }

    public static final void goToSuuntoPage(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).goToSuuntoAccessActivity(fragmentActivity);
    }

    public static final void goToWechatShareHomepage(@NotNull final BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getWechatBindStatus(new Function1() { // from class: ysh
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return PersonalDataManagementExtKt.goToWechatShareHomepage$lambda$1(baseActivity, ((Boolean) obj).booleanValue());
            }
        }, new Function0() { // from class: zsh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PersonalDataManagementExtKt.goToWechatShareHomepage$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToWechatShareHomepage$lambda$1(final BaseActivity this_goToWechatShareHomepage, boolean z) {
        Intrinsics.checkNotNullParameter(this_goToWechatShareHomepage, "$this_goToWechatShareHomepage");
        Logger.i("goToWechatShareHomepage", "getWechatBindStatus success. isBound=" + z);
        if (z) {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).goToWechatDeviceActivity(this_goToWechatShareHomepage);
        } else {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).getWechatSupportBindDeviceLiveData(this_goToWechatShareHomepage).observe(this_goToWechatShareHomepage, new PersonalDataManagementExtKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: xsh
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return PersonalDataManagementExtKt.goToWechatShareHomepage$lambda$1$lambda$0(this_goToWechatShareHomepage, (Boolean) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToWechatShareHomepage$lambda$1$lambda$0(BaseActivity this_goToWechatShareHomepage, Boolean bool) {
        Intrinsics.checkNotNullParameter(this_goToWechatShareHomepage, "$this_goToWechatShareHomepage");
        Logger.i("goToWechatShareHomepage", "getWechatSupportBindDevice success. result=" + bool);
        if (bool.booleanValue()) {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoWechatAccessDeviceManagerActivity(this_goToWechatShareHomepage);
        } else {
            AccessManagerExtKt.getInstance(AccessManager.INSTANCE).goToWechatSportSettingsNoDeviceActivity(this_goToWechatShareHomepage);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToWechatShareHomepage$lambda$2() {
        Logger.i("goToWechatShareHomepage", "getWechatBindStatus error");
        return Unit.INSTANCE;
    }

    public static final void goToZeppLifePage(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoMiSportImportActivity(fragmentActivity);
    }

    public static final void gotoHealthConnect(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        AccessManager accessManagerExtKt = AccessManagerExtKt.getInstance(AccessManager.INSTANCE);
        if (accessManagerExtKt.isHealthConnectInstalled(fragmentActivity)) {
            ScopeExtKt.scope(Dispatchers.getIO(), new AnonymousClass1(accessManagerExtKt, fragmentActivity, null));
        } else {
            Logger.i("gotoHealthConnect", "health connect is not installed!!");
            ToastUtil.INSTANCE.showToast(m0j.R);
        }
    }

    public static final boolean hasSameContent(@NotNull List<String> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "list");
        if (list.size() != list2.size()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!list2.contains((String) it.next())) {
                return false;
            }
        }
        return true;
    }
}
