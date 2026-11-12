package com.xiaomi.fitness.userinfo.collect;

import android.os.Build;
import com.google.gson.Gson;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DeviceUtil;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.AndroidScope;
import com.xiaomi.fitness.user.info.export.ICollectReportManager;
import com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager;
import com.xiaomi.fitness.userinfo.net.UserInfoReportRequest;
import com.xiaomi.passport.ui.utils.OsHelper;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u0019H\u0082@¢\u0006\u0002\u0010\u0017J\u001c\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/userinfo/collect/CollectReportInfoManager;", "Lcom/xiaomi/fitness/user/info/export/ICollectReportManager;", "<init>", "()V", "reportIntervalSecond", "", "getReportIntervalSecond", "()J", "reportRequest", "Lcom/xiaomi/fitness/userinfo/net/UserInfoReportRequest;", "getReportRequest", "()Lcom/xiaomi/fitness/userinfo/net/UserInfoReportRequest;", "setReportRequest", "(Lcom/xiaomi/fitness/userinfo/net/UserInfoReportRequest;)V", "collectDeviceInfo", "", "buildOsVer", "", "collectPhoneAndEmailInfo", "phone", "email", "collectGps", "reportInfoIfNeed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportServerResult", "", "reportUserInfoList", "list", "", "Lcom/xiaomi/fitness/userinfo/collect/ReportItemData;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfoReportWrapper", "Lcom/xiaomi/fitness/userinfo/collect/UserInfoReportWrapper;", "setWrapperReportUserInfo", "report", "cnPrivacyEnable", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectReportInfoManager implements ICollectReportManager {

    @NotNull
    public static final String TAG = "CollectReportInfoManager";
    public UserInfoReportRequest reportRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectDeviceInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectDeviceInfo$1", f = "CollectReportInfoManager.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectReportInfoManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoReportWrapper userInfoReportWrapper = CollectReportInfoManager.this.getUserInfoReportWrapper();
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                String str = Build.MODEL;
                String strBuildOsVer = CollectReportInfoManager.this.buildOsVer();
                String displayName = TimeZone.getDefault().getDisplayName(false, 0);
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("%s:%s", Arrays.copyOf(new Object[]{displayName, currentLocale$default}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                String oaid = DeviceUtil.INSTANCE.getOAID(ApplicationExtKt.getApplication());
                if (oaid == null) {
                    oaid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getUniqueIdentify();
                }
                String str3 = oaid;
                if (str == null || StringsKt__StringsKt.isBlank(str)) {
                    str3 = str3;
                } else {
                    Map<String, ReportItemData> deviceModelInfoMap = userInfoReportWrapper.getDeviceModelInfoMap();
                    if (deviceModelInfoMap == null) {
                        deviceModelInfoMap = new LinkedHashMap<>();
                    }
                    Map<String, ReportItemData> map = deviceModelInfoMap;
                    ReportItemData reportItemData = map.get(str);
                    if (reportItemData != null) {
                        reportItemData.setCount(reportItemData.getCount() + 1);
                        reportItemData.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData = new ReportItemData(Category.DEVICE_INFO, DeviceInfoKey.PHONE_HARDWARE_MODEL, str, jCurrentTimeMillis, 1);
                    }
                    map.put(str, reportItemData);
                    userInfoReportWrapper.setDeviceModelInfoMap(map);
                }
                if (!StringsKt__StringsKt.isBlank(strBuildOsVer)) {
                    Map<String, ReportItemData> osVerInfoMap = userInfoReportWrapper.getOsVerInfoMap();
                    if (osVerInfoMap == null) {
                        osVerInfoMap = new LinkedHashMap<>();
                    }
                    ReportItemData reportItemData2 = osVerInfoMap.get(strBuildOsVer);
                    if (reportItemData2 != null) {
                        reportItemData2.setCount(reportItemData2.getCount() + 1);
                        reportItemData2.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData2 = new ReportItemData(Category.DEVICE_INFO, "os_ver", strBuildOsVer, jCurrentTimeMillis, 1);
                    }
                    osVerInfoMap.put(strBuildOsVer, reportItemData2);
                    userInfoReportWrapper.setOsVerInfoMap(osVerInfoMap);
                }
                if (!StringsKt__StringsKt.isBlank(str2)) {
                    Map<String, ReportItemData> deviceSettingInfoMap = userInfoReportWrapper.getDeviceSettingInfoMap();
                    if (deviceSettingInfoMap == null) {
                        deviceSettingInfoMap = new LinkedHashMap<>();
                    }
                    ReportItemData reportItemData3 = deviceSettingInfoMap.get(str2);
                    if (reportItemData3 != null) {
                        reportItemData3.setCount(reportItemData3.getCount() + 1);
                        reportItemData3.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData3 = new ReportItemData(Category.DEVICE_INFO, "device_setting", str2, jCurrentTimeMillis, 1);
                    }
                    deviceSettingInfoMap.put(str2, reportItemData3);
                    userInfoReportWrapper.setDeviceSettingInfoMap(deviceSettingInfoMap);
                }
                if (!StringsKt__StringsKt.isBlank(str3)) {
                    Map<String, ReportItemData> deviceIdInfoMap = userInfoReportWrapper.getDeviceIdInfoMap();
                    if (deviceIdInfoMap == null) {
                        deviceIdInfoMap = new LinkedHashMap<>();
                    }
                    String str4 = str3;
                    ReportItemData reportItemData4 = deviceIdInfoMap.get(str4);
                    if (reportItemData4 != null) {
                        reportItemData4.setCount(reportItemData4.getCount() + 1);
                        reportItemData4.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData4 = new ReportItemData(Category.DEVICE_INFO, "device_id", str4, jCurrentTimeMillis, 1);
                    }
                    deviceIdInfoMap.put(str4, reportItemData4);
                    userInfoReportWrapper.setDeviceIdInfoMap(deviceIdInfoMap);
                }
                CollectReportInfoManager.this.setWrapperReportUserInfo(userInfoReportWrapper);
                CollectReportInfoManager collectReportInfoManager = CollectReportInfoManager.this;
                this.label = 1;
                if (collectReportInfoManager.reportInfoIfNeed(this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectGps$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectGps$1", f = "CollectReportInfoManager.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C32941(Continuation<? super C32941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectReportInfoManager.this.new C32941(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReportItemData reportItemData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoReportWrapper userInfoReportWrapper = CollectReportInfoManager.this.getUserInfoReportWrapper();
                ReportItemData gpsData = userInfoReportWrapper.getGpsData();
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                if (gpsData == null || (reportItemData = ReportItemData.copy$default(gpsData, null, null, null, 0L, 0, 31, null)) == null) {
                    reportItemData = new ReportItemData(Category.APPLICATION_DATA, "gps", "", jCurrentTimeMillis, 1);
                } else {
                    reportItemData.setCount(reportItemData.getCount() + 1);
                    reportItemData.setTimeSecond(jCurrentTimeMillis);
                }
                userInfoReportWrapper.setGpsData(reportItemData);
                CollectReportInfoManager.this.setWrapperReportUserInfo(userInfoReportWrapper);
                CollectReportInfoManager collectReportInfoManager = CollectReportInfoManager.this;
                this.label = 1;
                if (collectReportInfoManager.reportInfoIfNeed(this) == coroutine_suspended) {
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
            return ((C32941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectPhoneAndEmailInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$collectPhoneAndEmailInfo$1", f = "CollectReportInfoManager.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class C32951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        final /* synthetic */ String $phone;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32951(String str, String str2, Continuation<? super C32951> continuation) {
            super(2, continuation);
            this.$phone = str;
            this.$email = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectReportInfoManager.this.new C32951(this.$phone, this.$email, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoReportWrapper userInfoReportWrapper = CollectReportInfoManager.this.getUserInfoReportWrapper();
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                String str = this.$phone;
                if (str != null && !StringsKt__StringsKt.isBlank(str)) {
                    Map<String, ReportItemData> phoneInfoMap = userInfoReportWrapper.getPhoneInfoMap();
                    if (phoneInfoMap == null) {
                        phoneInfoMap = new LinkedHashMap<>();
                    }
                    ReportItemData reportItemData = phoneInfoMap.get(this.$phone);
                    if (reportItemData != null) {
                        reportItemData.setCount(reportItemData.getCount() + 1);
                        reportItemData.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData = new ReportItemData(Category.BASIC_INFO, BasicInfoKey.PHONE_NUMBER, this.$phone, jCurrentTimeMillis, 1);
                    }
                    phoneInfoMap.put(this.$phone, reportItemData);
                    userInfoReportWrapper.setPhoneInfoMap(phoneInfoMap);
                }
                String str2 = this.$email;
                if (str2 != null && !StringsKt__StringsKt.isBlank(str2)) {
                    Map<String, ReportItemData> emailInfoMap = userInfoReportWrapper.getEmailInfoMap();
                    if (emailInfoMap == null) {
                        emailInfoMap = new LinkedHashMap<>();
                    }
                    ReportItemData reportItemData2 = emailInfoMap.get(this.$email);
                    if (reportItemData2 != null) {
                        reportItemData2.setCount(reportItemData2.getCount() + 1);
                        reportItemData2.setTimeSecond(jCurrentTimeMillis);
                    } else {
                        reportItemData2 = new ReportItemData(Category.BASIC_INFO, "email", this.$email, jCurrentTimeMillis, 1);
                    }
                    emailInfoMap.put(this.$email, reportItemData2);
                    userInfoReportWrapper.setEmailInfoMap(emailInfoMap);
                }
                CollectReportInfoManager.this.setWrapperReportUserInfo(userInfoReportWrapper);
                CollectReportInfoManager collectReportInfoManager = CollectReportInfoManager.this;
                this.label = 1;
                if (collectReportInfoManager.reportInfoIfNeed(this) == coroutine_suspended) {
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
            return ((C32951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$reportInfoIfNeed$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$reportInfoIfNeed$2", f = "CollectReportInfoManager.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $currentTimeSecond;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentTimeSecond = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CollectReportInfoManager.this.new AnonymousClass2(this.$currentTimeSecond, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CollectReportInfoManager collectReportInfoManager = CollectReportInfoManager.this;
                this.label = 1;
                obj = collectReportInfoManager.reportServerResult(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue) {
                Logger.i(CollectReportInfoManager.TAG, "report collect info success");
                CollectReportPreference collectReportPreference = CollectReportPreference.INSTANCE;
                collectReportPreference.setREPORT_TIME_SECOND(this.$currentTimeSecond);
                collectReportPreference.setWRAPPER_REPORT_USER_INFO("");
            } else {
                Logger.i(CollectReportInfoManager.TAG, "report collect info error " + zBooleanValue);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager$reportUserInfoList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.userinfo.collect.CollectReportInfoManager", f = "CollectReportInfoManager.kt", i = {1, 1, 1}, l = {207, 210, 216}, m = "reportUserInfoList", n = {"this", "list", MediaStoreUtil.MediaInfo.SIZE}, s = {"L$0", "L$1", "I$0"})
    public static final class C32961 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C32961(Continuation<? super C32961> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CollectReportInfoManager.this.reportUserInfoList(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildOsVer() {
        String name;
        String name2;
        RomUtils.RomInfo romInfo = RomUtils.INSTANCE.getRomInfo();
        if (romInfo.isMiui()) {
            name = OsHelper.ROM_MIUI;
        } else if (romInfo.getName() == null || ((name2 = romInfo.getName()) != null && StringsKt__StringsKt.isBlank(name2))) {
            name = PluginPackageConstant.RN_DIR_A;
        } else {
            name = romInfo.getName();
            Intrinsics.checkNotNull(name);
        }
        String version = romInfo.getVersion();
        StringBuilder sb = new StringBuilder(name);
        if (version != null && version.length() > 0) {
            sb.append(" ");
            sb.append(version);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final boolean cnPrivacyEnable() {
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Logger.i(TAG, "app currentRegion:" + currentRegion);
        return !AppUtil.INSTANCE.isPlayChannel() && LocaleUtil.INSTANCE.isSimplifiedChinese() && (currentRegion.length() == 0 || StringsKt__StringsJVMKt.equals(currentRegion, "cn", true));
    }

    private final long getReportIntervalSecond() {
        return TimeUnit.DAYS.toSeconds(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoReportWrapper getUserInfoReportWrapper() {
        String wrapper_report_user_info = CollectReportPreference.INSTANCE.getWRAPPER_REPORT_USER_INFO();
        Logger.d(TAG, "getUserInfoReportWrapperFromJson: " + wrapper_report_user_info);
        UserInfoReportWrapper userInfoReportWrapper = (UserInfoReportWrapper) new Gson().fromJson(wrapper_report_user_info, UserInfoReportWrapper.class);
        return userInfoReportWrapper == null ? new UserInfoReportWrapper() : userInfoReportWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reportInfoIfNeed(Continuation<? super Unit> continuation) {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            return Unit.INSTANCE;
        }
        long report_time_second = CollectReportPreference.INSTANCE.getREPORT_TIME_SECOND();
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        if (jCurrentTimeMillis - report_time_second > getReportIntervalSecond()) {
            ScopeExtKt.scopeNet$default(null, new AnonymousClass2(jCurrentTimeMillis, null), 1, null).m503catch(new Function2() { // from class: e44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CollectReportInfoManager.reportInfoIfNeed$lambda$0((AndroidScope) obj, (Throwable) obj2);
                }
            });
        } else {
            Logger.i(TAG, "reporting cycle is too short !! last time" + report_time_second);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reportInfoIfNeed$lambda$0(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(TAG, "report collect info exception " + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object reportServerResult(Continuation<? super Boolean> continuation) {
        List<ReportItemData> list = CollectInfoDataKt.toUserInfoReport(getUserInfoReportWrapper()).getList();
        if (list == null || list.size() == 0) {
            return Boxing.boxBoolean(false);
        }
        Intrinsics.checkNotNull(list);
        return reportUserInfoList(list, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00ae, please report this as an issue */
    public final Object reportUserInfoList(List<ReportItemData> list, Continuation<? super Boolean> continuation) {
        C32961 c32961;
        int size;
        Object objReportCollectInfo;
        CollectReportInfoManager collectReportInfoManager;
        if (continuation instanceof C32961) {
            c32961 = (C32961) continuation;
            int i = c32961.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c32961.label = i - Integer.MIN_VALUE;
            } else {
                c32961 = new C32961(continuation);
            }
        } else {
            c32961 = new C32961(continuation);
        }
        Object objReportCollectInfo2 = c32961.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c32961.label;
        boolean zIsSuccess = false;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objReportCollectInfo2);
                zIsSuccess = ((BaseResult) objReportCollectInfo2).isSuccess();
                return Boxing.boxBoolean(zIsSuccess);
            }
            if (i2 == 2) {
                int i3 = c32961.I$0;
                List<ReportItemData> list2 = (List) c32961.L$1;
                collectReportInfoManager = (CollectReportInfoManager) c32961.L$0;
                ResultKt.throwOnFailure(objReportCollectInfo2);
                size = i3;
                list = list2;
                objReportCollectInfo = objReportCollectInfo2;
                if (((BaseResult) objReportCollectInfo).isSuccess()) {
                    Logger.i(TAG, "reportUserInfoList fail");
                    return Boxing.boxBoolean(zIsSuccess);
                }
                Logger.i(TAG, "reportUserInfoList success");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list.subList(20, size));
                Logger.d(TAG, "reportUserInfoList newList " + arrayList);
                c32961.L$0 = null;
                c32961.L$1 = null;
                c32961.label = 3;
                objReportCollectInfo2 = collectReportInfoManager.reportUserInfoList(arrayList, c32961);
                if (objReportCollectInfo2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReportCollectInfo2);
            }
            return objReportCollectInfo2;
        }
        ResultKt.throwOnFailure(objReportCollectInfo2);
        size = list.size();
        Logger.i(TAG, "reportUserInfoList size " + size);
        if (size <= 20) {
            UserInfoReportRequest reportRequest = getReportRequest();
            UserInfoReport userInfoReport = new UserInfoReport(list);
            c32961.label = 1;
            objReportCollectInfo2 = reportRequest.reportCollectInfo(userInfoReport, c32961);
            if (objReportCollectInfo2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            zIsSuccess = ((BaseResult) objReportCollectInfo2).isSuccess();
            return Boxing.boxBoolean(zIsSuccess);
        }
        List<ReportItemData> listSubList = list.subList(0, 20);
        UserInfoReportRequest reportRequest2 = getReportRequest();
        UserInfoReport userInfoReport2 = new UserInfoReport(listSubList);
        c32961.L$0 = this;
        c32961.L$1 = list;
        c32961.I$0 = size;
        c32961.label = 2;
        objReportCollectInfo = reportRequest2.reportCollectInfo(userInfoReport2, c32961);
        if (objReportCollectInfo == coroutine_suspended) {
            return coroutine_suspended;
        }
        collectReportInfoManager = this;
        if (((BaseResult) objReportCollectInfo).isSuccess()) {
            Logger.i(TAG, "reportUserInfoList fail");
            return Boxing.boxBoolean(zIsSuccess);
        }
        Logger.i(TAG, "reportUserInfoList success");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(list.subList(20, size));
        Logger.d(TAG, "reportUserInfoList newList " + arrayList2);
        c32961.L$0 = null;
        c32961.L$1 = null;
        c32961.label = 3;
        objReportCollectInfo2 = collectReportInfoManager.reportUserInfoList(arrayList2, c32961);
        if (objReportCollectInfo2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objReportCollectInfo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWrapperReportUserInfo(UserInfoReportWrapper report) {
        String json = new Gson().toJson(report);
        Logger.d(TAG, "setReportUserInfo new value: " + json);
        CollectReportPreference.INSTANCE.setWRAPPER_REPORT_USER_INFO(json);
    }

    @Override // com.xiaomi.fitness.user.info.export.ICollectReportManager
    public void collectDeviceInfo() {
        Logger.i(TAG, "collectDeviceInfo");
        if (cnPrivacyEnable()) {
            AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
        } else {
            Logger.i(TAG, "collectDeviceInfo is play channel, do nothing");
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.ICollectReportManager
    public void collectGps() {
        Logger.i(TAG, "collectGps");
        if (cnPrivacyEnable()) {
            AnyExtKt.io$default(null, new C32941(null), 1, null);
        } else {
            Logger.i(TAG, "collectGps is play channel, do nothing");
        }
    }

    @Override // com.xiaomi.fitness.user.info.export.ICollectReportManager
    public void collectPhoneAndEmailInfo(@Nullable String phone, @Nullable String email) {
        Logger.i(TAG, "collectPhoneAndEmailInfo");
        if (cnPrivacyEnable()) {
            AnyExtKt.io$default(null, new C32951(phone, email, null), 1, null);
        } else {
            Logger.i(TAG, "collectPhoneAndEmailInfo is play channel, do nothing");
        }
    }

    @NotNull
    public final UserInfoReportRequest getReportRequest() {
        UserInfoReportRequest userInfoReportRequest = this.reportRequest;
        if (userInfoReportRequest != null) {
            return userInfoReportRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reportRequest");
        return null;
    }

    public final void setReportRequest(@NotNull UserInfoReportRequest userInfoReportRequest) {
        Intrinsics.checkNotNullParameter(userInfoReportRequest, "<set-?>");
        this.reportRequest = userInfoReportRequest;
    }
}
