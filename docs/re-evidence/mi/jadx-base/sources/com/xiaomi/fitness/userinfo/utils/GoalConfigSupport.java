package com.xiaomi.fitness.userinfo.utils;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.goal.GoalPreference;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.user.DallyGoalItem;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.is9;
import defpackage.s7r;
import defpackage.ur9;
import defpackage.xpd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b2\bÆ\u0002\u0018\u00002\u00020\u0001B\n\b\u0002¢\u0006\u0005\b¡\u0001\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'¢\u0006\u0004\b*\u0010)J%\u0010/\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00072\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b/\u00100J%\u00101\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00072\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,H\u0007¢\u0006\u0004\b3\u00104J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\rJ\u001d\u00107\u001a\u00020\u00042\u000e\u00106\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010,¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\b:\u0010\u0006J!\u0010=\u001a\u00020\u00042\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040;¢\u0006\u0004\b=\u0010>J!\u0010?\u001a\u00020\u00042\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040;¢\u0006\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010AR$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR(\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040;0E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR2\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010C\u001a\u0004\bI\u0010)\"\u0004\bJ\u0010KR2\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u000f0&j\b\u0012\u0004\u0012\u00020\u000f`'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010C\u001a\u0004\bM\u0010)\"\u0004\bN\u0010KR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010\u0011R\u001a\u0010V\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010T\u001a\u0004\bW\u0010\u0011R\u001a\u0010X\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010\u0011R\u001a\u0010Z\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010\u0011R\u001a\u0010\\\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\\\u0010A\u001a\u0004\b]\u0010^R\u001a\u0010_\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b_\u0010A\u001a\u0004\b`\u0010^R\u001a\u0010a\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\ba\u0010A\u001a\u0004\bb\u0010^R\u001a\u0010c\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\bc\u0010A\u001a\u0004\bd\u0010^R\u001a\u0010e\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\be\u0010T\u001a\u0004\bf\u0010\u0011R\u001a\u0010g\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bg\u0010T\u001a\u0004\bh\u0010\u0011R\u001a\u0010i\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bi\u0010T\u001a\u0004\bj\u0010\u0011R\u001a\u0010k\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bk\u0010T\u001a\u0004\bl\u0010\u0011R\u001a\u0010m\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\bm\u0010T\u001a\u0004\bn\u0010\u0011RB\u0010q\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010oj\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010w\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010T\u001a\u0004\bx\u0010\u0011\"\u0004\by\u0010zR\"\u0010{\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010T\u001a\u0004\b|\u0010\u0011\"\u0004\b}\u0010zR#\u0010~\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010T\u001a\u0004\b\u007f\u0010\u0011\"\u0005\b\u0080\u0001\u0010zR&\u0010\u0081\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010T\u001a\u0005\b\u0082\u0001\u0010\u0011\"\u0005\b\u0083\u0001\u0010zR&\u0010\u0084\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010T\u001a\u0005\b\u0085\u0001\u0010\u0011\"\u0005\b\u0086\u0001\u0010zR&\u0010\u0087\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010T\u001a\u0005\b\u0088\u0001\u0010\u0011\"\u0005\b\u0089\u0001\u0010zR&\u0010\u008a\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010T\u001a\u0005\b\u008b\u0001\u0010\u0011\"\u0005\b\u008c\u0001\u0010zR&\u0010\u008d\u0001\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010T\u001a\u0005\b\u008e\u0001\u0010\u0011\"\u0005\b\u008f\u0001\u0010zR\u001d\u0010\u0090\u0001\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010T\u001a\u0005\b\u0091\u0001\u0010\u0011R\u001b\u0010\u0093\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u00104R\u0014\u0010\u0094\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0014\u0010\u0096\u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0011R\u0013\u0010\u009a\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0011R\u0013\u0010\u009c\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0011R\u0013\u0010\u009e\u0001\u001a\u00020\u000f8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0011R\u0018\u0010\u009f\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0,8F¢\u0006\u0006\u001a\u0004\b5\u00104R\u0014\u0010 \u0001\u001a\u00020\u00028F¢\u0006\b\u001a\u0006\b \u0001\u0010\u0095\u0001¨\u0006¢\u0001"}, d2 = {"Lcom/xiaomi/fitness/userinfo/utils/GoalConfigSupport;", "", "", "isSupportMhs", "", "addDeviceSupportGoal", "(Z)V", "", "sid", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "getHuamiApiCaller", "(Ljava/lang/String;)Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "clearDeviceGoal", "()V", "clearDeviceTarget", "", "getDefaultCalTarget", "()I", "Lcom/xiaomi/fitness/account/api/bean/UserProfile;", "data", "supportMhs", "setDefaultSupport", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;Z)Ljava/lang/String;", "userProfile", "getGoalList", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)Ljava/lang/String;", Scopes.PROFILE, "updateGoalList", "(Lcom/xiaomi/fitness/account/api/bean/UserProfile;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "currentDeviceModel", "hmDeviceSupportALLGoal", "updateSupportTarget", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Ljava/lang/Boolean;)V", "Lcom/xiaomi/fitness/device/contact/export/SyncResult;", "result", "updateTargetFromDevice", "(Lcom/xiaomi/fitness/device/contact/export/SyncResult;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getCurrentTarget", "()Ljava/util/ArrayList;", "getDeviceSupportTarget", "type", "", "Lcom/xiaomi/fitness/account/user/DallyGoalItem;", FitnessPersistKey.Rainbow, "getGoalValue", "(Ljava/lang/String;Ljava/util/List;)I", "containsKey", "(Ljava/lang/String;Ljava/util/List;)Z", "getCurrentGoalList1", "()Ljava/util/List;", "getCurrentGoalList", "target", "setCurrentTarget", "(Ljava/util/List;)V", "finished", "setDeviceUpdateAllGoalSupportListener", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDeviceUpdateAllGoalSupportListener", "(Lkotlin/jvm/functions/Function1;)V", "removeDeviceUpdateAllGoalSupportListener", "TAG", "Ljava/lang/String;", "mDeviceCurrentGoal", "Ljava/util/ArrayList;", "mDeviceSupportGoal", "Ljava/util/concurrent/CopyOnWriteArraySet;", "deviceUpdateAllGoalSupportListener", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mCurrentTarget", "getMCurrentTarget", "setMCurrentTarget", "(Ljava/util/ArrayList;)V", "mSupportTarget", "getMSupportTarget", "setMSupportTarget", "", "Lis9;", "mSupportGoal", "[Lis9;", "SUPPORT_GOAL_STEP", "I", "getSUPPORT_GOAL_STEP", "SUPPORT_GOAL_CALORIE", "getSUPPORT_GOAL_CALORIE", "SUPPORT_GOAL_STAND_TIMES", "getSUPPORT_GOAL_STAND_TIMES", "SUPPORT_GOAL_MHS", "getSUPPORT_GOAL_MHS", "STEP_GOAL_FIELD", "getSTEP_GOAL_FIELD", "()Ljava/lang/String;", "CALORIE_GOAL_FIELD", "getCALORIE_GOAL_FIELD", "STAND_TIMES_GOAL_FIELD", "getSTAND_TIMES_GOAL_FIELD", "MHS_GOAL_FIELD", "getMHS_GOAL_FIELD", "STEP_GOAL_TARGET", "getSTEP_GOAL_TARGET", "CALORIE_GOAL_TARGET", "getCALORIE_GOAL_TARGET", "STAND_TIMES_GOAL_TARGET", "getSTAND_TIMES_GOAL_TARGET", "MHS_GOAL_TARGET", "getMHS_GOAL_TARGET", "INVALID_DEFAULT_VALUE", "getINVALID_DEFAULT_VALUE", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mMapGoal", "Ljava/util/HashMap;", "getMMapGoal", "()Ljava/util/HashMap;", "setMMapGoal", "(Ljava/util/HashMap;)V", "mCalorieGoal", "getMCalorieGoal", "setMCalorieGoal", "(I)V", "mStepGoal", "getMStepGoal", "setMStepGoal", "mMhsGoal", "getMMhsGoal", "setMMhsGoal", "mStandTime", "getMStandTime", "setMStandTime", "mSupportCalorieGoal", "getMSupportCalorieGoal", "setMSupportCalorieGoal", "mSupportStepGoal", "getMSupportStepGoal", "setMSupportStepGoal", "mSupportMhsGoal", "getMSupportMhsGoal", "setMSupportMhsGoal", "mSupportStandTime", "getMSupportStandTime", "setMSupportStandTime", "DEFAULT_GOAL_SIZE", "getDEFAULT_GOAL_SIZE", "getDeviceSupportGoal", "deviceSupportGoal", "isDeviceCurrentSupportStand", "()Z", "isDeviceSupportMhs", "getCalorieGoal", "calorieGoal", "getStepGoal", "stepGoal", "getStandTimeGoal", "standTimeGoal", "getMhsGoal", "mhsGoal", "currentGoalList", "isDeviceSupportAllGoal", "<init>", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGoalConfigSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoalConfigSupport.kt\ncom/xiaomi/fitness/userinfo/utils/GoalConfigSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1#2:577\n1863#3,2:578\n*S KotlinDebug\n*F\n+ 1 GoalConfigSupport.kt\ncom/xiaomi/fitness/userinfo/utils/GoalConfigSupport\n*L\n564#1:578,2\n*E\n"})
public final class GoalConfigSupport {

    @NotNull
    private static final String CALORIE_GOAL_FIELD;
    private static final int CALORIE_GOAL_TARGET;
    private static final int DEFAULT_GOAL_SIZE;

    @NotNull
    public static final GoalConfigSupport INSTANCE;
    private static final int INVALID_DEFAULT_VALUE;

    @NotNull
    private static final String MHS_GOAL_FIELD;
    private static final int MHS_GOAL_TARGET;

    @NotNull
    private static final String STAND_TIMES_GOAL_FIELD;
    private static final int STAND_TIMES_GOAL_TARGET;

    @NotNull
    private static final String STEP_GOAL_FIELD;
    private static final int STEP_GOAL_TARGET;
    private static final int SUPPORT_GOAL_CALORIE;
    private static final int SUPPORT_GOAL_MHS;
    private static final int SUPPORT_GOAL_STAND_TIMES;
    private static final int SUPPORT_GOAL_STEP;

    @NotNull
    private static final String TAG;

    @NotNull
    private static CopyOnWriteArraySet<Function1<Boolean, Unit>> deviceUpdateAllGoalSupportListener;
    private static int mCalorieGoal;

    @NotNull
    private static ArrayList<Integer> mCurrentTarget;

    @NotNull
    private static final ArrayList<Integer> mDeviceCurrentGoal;

    @NotNull
    private static final ArrayList<Integer> mDeviceSupportGoal;

    @Nullable
    private static HashMap<String, String> mMapGoal;
    private static int mMhsGoal;
    private static int mStandTime;
    private static int mStepGoal;
    private static int mSupportCalorieGoal;

    @Nullable
    private static is9[] mSupportGoal;
    private static int mSupportMhsGoal;
    private static int mSupportStandTime;
    private static int mSupportStepGoal;

    @NotNull
    private static ArrayList<Integer> mSupportTarget;

    static {
        GoalConfigSupport goalConfigSupport = new GoalConfigSupport();
        INSTANCE = goalConfigSupport;
        TAG = "GoalConfigSupport";
        mDeviceCurrentGoal = new ArrayList<>(3);
        mDeviceSupportGoal = new ArrayList<>(4);
        deviceUpdateAllGoalSupportListener = new CopyOnWriteArraySet<>();
        mCurrentTarget = new ArrayList<>(3);
        mSupportTarget = new ArrayList<>(4);
        SUPPORT_GOAL_STEP = 1;
        SUPPORT_GOAL_CALORIE = 2;
        SUPPORT_GOAL_STAND_TIMES = 3;
        SUPPORT_GOAL_MHS = 4;
        STEP_GOAL_FIELD = "1";
        CALORIE_GOAL_FIELD = "2";
        STAND_TIMES_GOAL_FIELD = "3";
        MHS_GOAL_FIELD = "4";
        STEP_GOAL_TARGET = 6000;
        CALORIE_GOAL_TARGET = 400;
        STAND_TIMES_GOAL_TARGET = 12;
        MHS_GOAL_TARGET = 30;
        INVALID_DEFAULT_VALUE = -1;
        mCalorieGoal = goalConfigSupport.getDefaultCalTarget();
        mStepGoal = 6000;
        mMhsGoal = 30;
        mStandTime = 12;
        mSupportCalorieGoal = -1;
        mSupportStepGoal = -1;
        mSupportMhsGoal = -1;
        mSupportStandTime = -1;
        DEFAULT_GOAL_SIZE = 3;
    }

    private GoalConfigSupport() {
    }

    private final void addDeviceSupportGoal(boolean isSupportMhs) {
        ArrayList<Integer> arrayList = mDeviceCurrentGoal;
        arrayList.clear();
        if (isSupportMhs) {
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_STEP));
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_CALORIE));
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_MHS));
        } else {
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_STEP));
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_CALORIE));
            arrayList.add(Integer.valueOf(SUPPORT_GOAL_STAND_TIMES));
        }
        Logger.i(TAG, " Goal manager addDeviceSupportGoal mDeviceCurrentGoal is " + arrayList);
    }

    private final void clearDeviceGoal() {
        mDeviceCurrentGoal.clear();
        mDeviceSupportGoal.clear();
    }

    private final void clearDeviceTarget() {
        Logger.i(TAG + "updateGoalFromDevice clearDeviceTarget = ", new Object[0]);
        mCurrentTarget.clear();
        mSupportTarget.clear();
    }

    private final HuamiApiCaller getHuamiApiCaller(String sid) {
        String mac;
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getDeviceModel(sid);
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            mac = "";
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    public final void addDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (deviceUpdateAllGoalSupportListener.contains(listener)) {
            return;
        }
        deviceUpdateAllGoalSupportListener.add(listener);
    }

    public final boolean containsKey(@NotNull String type, @Nullable List<DallyGoalItem> goal) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (goal != null) {
            int size = goal.size();
            for (int i = 0; i < size; i++) {
                if (goal.get(i).getField() == Integer.parseInt(type)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public final String getCALORIE_GOAL_FIELD() {
        return CALORIE_GOAL_FIELD;
    }

    public final int getCALORIE_GOAL_TARGET() {
        return CALORIE_GOAL_TARGET;
    }

    public final int getCalorieGoal() {
        return mCalorieGoal;
    }

    @NotNull
    public final List<Integer> getCurrentGoalList() {
        updateGoalList(UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null));
        ArrayList arrayList = new ArrayList(3);
        int i = mSupportStepGoal;
        int i2 = INVALID_DEFAULT_VALUE;
        if (i != i2) {
            arrayList.add(Integer.valueOf(i));
        }
        int i3 = mSupportCalorieGoal;
        if (i3 != i2) {
            arrayList.add(Integer.valueOf(i3));
        }
        int i4 = mSupportStandTime;
        if (i4 != i2) {
            arrayList.add(Integer.valueOf(i4));
        }
        int i5 = mSupportMhsGoal;
        if (i5 != i2) {
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    @JvmName(name = "getCurrentGoalList1")
    @Nullable
    public final List<Integer> getCurrentGoalList1() {
        updateGoalList();
        ArrayList arrayList = new ArrayList(3);
        int i = mSupportStepGoal;
        int i2 = INVALID_DEFAULT_VALUE;
        if (i != i2) {
            arrayList.add(Integer.valueOf(i));
        }
        int i3 = mSupportCalorieGoal;
        if (i3 != i2) {
            arrayList.add(Integer.valueOf(i3));
        }
        int i4 = mSupportStandTime;
        if (i4 != i2) {
            arrayList.add(Integer.valueOf(i4));
        }
        int i5 = mSupportMhsGoal;
        if (i5 != i2) {
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<Integer> getCurrentTarget() {
        Logger.i(TAG, "getSupportTarget getCurrentTarget == " + mCurrentTarget);
        return mCurrentTarget;
    }

    public final int getDEFAULT_GOAL_SIZE() {
        return DEFAULT_GOAL_SIZE;
    }

    public final int getDefaultCalTarget() {
        if (!AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            return GoalPreference.getDefaultCalore$default(GoalPreference.INSTANCE, 0.0f, 1, null);
        }
        float weight = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getWeight();
        if (weight == 0.0f) {
            weight = 60.0f;
        }
        return GoalPreference.INSTANCE.getDefaultCalore(weight);
    }

    @NotNull
    public final List<Integer> getDeviceSupportGoal() {
        clearDeviceGoal();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if ((wearableDeviceModel != null && (DeviceModelExtKt.isPanGu(wearableDeviceModel) || DeviceModelExtKt.isKongMing(wearableDeviceModel))) || wearableDeviceModel == null) {
            addDeviceSupportGoal(true);
        } else if (getCurrentTarget().size() != 0) {
            ArrayList<Integer> arrayList = mDeviceCurrentGoal;
            arrayList.addAll(getCurrentTarget());
            ArrayList<Integer> arrayList2 = mDeviceSupportGoal;
            arrayList2.addAll(getDeviceSupportTarget());
            Logger.i(TAG, " Goal manager deviceModel.getSupportTarget() = " + arrayList2 + ", mDeviceSupportGoal = " + arrayList);
        } else {
            addDeviceSupportGoal(false);
        }
        String str = TAG;
        ArrayList<Integer> arrayList3 = mDeviceCurrentGoal;
        Logger.i(str, " Goal manager device support goal is " + arrayList3.size());
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            Logger.i(TAG, " Goal manager device support target is " + mDeviceCurrentGoal.get(i));
        }
        return mDeviceCurrentGoal;
    }

    @NotNull
    public final ArrayList<Integer> getDeviceSupportTarget() {
        Logger.i(TAG, "getDeviceSupportTarget mSupportTarget == " + mSupportTarget);
        return mSupportTarget;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x0163  */
    @Nullable
    public final String getGoalList(@NotNull UserProfile userProfile) {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        List<DallyGoalItem> regularGoalList;
        DallyGoalItem dallyGoalItem;
        DallyGoalItem dallyGoalItem2;
        List<DallyGoalItem> regularGoalList2;
        DallyGoalItem dallyGoalItem3;
        DallyGoalItem dallyGoalItem4;
        List<DallyGoalItem> regularGoalList3;
        DallyGoalItem dallyGoalItem5;
        DallyGoalItem dallyGoalItem6;
        List<DallyGoalItem> regularGoalList4;
        DallyGoalItem dallyGoalItem7;
        String strValueOf4;
        DallyGoalItem dallyGoalItem8;
        String strValueOf5;
        DallyGoalItem dallyGoalItem9;
        String strValueOf6;
        DallyGoalItem dallyGoalItem10;
        DallyGoalItem dallyGoalItem11;
        DallyGoalItem dallyGoalItem12;
        DallyGoalItem dallyGoalItem13;
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        Logger.i(TAG, " GoalConfigSupport goalList is " + userProfile);
        List<DallyGoalItem> regularGoalList5 = userProfile.getRegularGoalList();
        Integer numValueOf = null;
        Integer numValueOf2 = regularGoalList5 != null ? Integer.valueOf(regularGoalList5.size()) : null;
        if (userProfile.getRegularGoalList() == null || numValueOf2 == null || numValueOf2.intValue() < DEFAULT_GOAL_SIZE) {
            return isDeviceCurrentSupportStand() ? setDefaultSupport(userProfile, false) : setDefaultSupport(userProfile, true);
        }
        HashMap map = new HashMap(3);
        if (userProfile.getRegularGoalList() == null || numValueOf2.intValue() < 3 || (regularGoalList4 = userProfile.getRegularGoalList()) == null || (dallyGoalItem7 = regularGoalList4.get(2)) == null) {
            String str = CALORIE_GOAL_FIELD;
            if (userProfile.getRegularGoalList() == null && numValueOf2.intValue() >= 3 && ((regularGoalList3 = userProfile.getRegularGoalList()) == null || (dallyGoalItem6 = regularGoalList3.get(0)) == null || dallyGoalItem6.getTarget() != 0)) {
                List<DallyGoalItem> regularGoalList6 = userProfile.getRegularGoalList();
                strValueOf = String.valueOf((regularGoalList6 == null || (dallyGoalItem5 = regularGoalList6.get(0)) == null) ? null : Integer.valueOf(dallyGoalItem5.getTarget()));
            } else {
                strValueOf = String.valueOf(INSTANCE.getDefaultCalTarget());
            }
            map.put(str, strValueOf);
            String str2 = STEP_GOAL_FIELD;
            if (userProfile.getRegularGoalList() == null && numValueOf2.intValue() >= 3 && ((regularGoalList2 = userProfile.getRegularGoalList()) == null || (dallyGoalItem4 = regularGoalList2.get(1)) == null || dallyGoalItem4.getTarget() != 0)) {
                List<DallyGoalItem> regularGoalList7 = userProfile.getRegularGoalList();
                strValueOf2 = String.valueOf((regularGoalList7 == null || (dallyGoalItem3 = regularGoalList7.get(1)) == null) ? null : Integer.valueOf(dallyGoalItem3.getTarget()));
            } else {
                strValueOf2 = String.valueOf(STEP_GOAL_TARGET);
            }
            map.put(str2, strValueOf2);
            String str3 = STAND_TIMES_GOAL_FIELD;
            if (userProfile.getRegularGoalList() == null && numValueOf2.intValue() >= 3 && ((regularGoalList = userProfile.getRegularGoalList()) == null || (dallyGoalItem2 = regularGoalList.get(2)) == null || dallyGoalItem2.getTarget() != 0)) {
                List<DallyGoalItem> regularGoalList8 = userProfile.getRegularGoalList();
                if (regularGoalList8 != null && (dallyGoalItem = regularGoalList8.get(2)) != null) {
                    numValueOf = Integer.valueOf(dallyGoalItem.getTarget());
                }
                strValueOf3 = String.valueOf(numValueOf);
            } else {
                strValueOf3 = String.valueOf(STAND_TIMES_GOAL_TARGET);
            }
            map.put(str3, strValueOf3);
        } else {
            int field = dallyGoalItem7.getField();
            String str4 = MHS_GOAL_FIELD;
            if (field == Integer.parseInt(str4)) {
                String str5 = CALORIE_GOAL_FIELD;
                List<DallyGoalItem> regularGoalList9 = userProfile.getRegularGoalList();
                if (regularGoalList9 == null || (dallyGoalItem13 = regularGoalList9.get(0)) == null || dallyGoalItem13.getTarget() != 0) {
                    List<DallyGoalItem> regularGoalList10 = userProfile.getRegularGoalList();
                    strValueOf4 = String.valueOf((regularGoalList10 == null || (dallyGoalItem8 = regularGoalList10.get(0)) == null) ? null : Integer.valueOf(dallyGoalItem8.getTarget()));
                } else {
                    strValueOf4 = String.valueOf(INSTANCE.getDefaultCalTarget());
                }
                map.put(str5, strValueOf4);
                String str6 = STEP_GOAL_FIELD;
                List<DallyGoalItem> regularGoalList11 = userProfile.getRegularGoalList();
                if (regularGoalList11 == null || (dallyGoalItem12 = regularGoalList11.get(1)) == null || dallyGoalItem12.getTarget() != 0) {
                    List<DallyGoalItem> regularGoalList12 = userProfile.getRegularGoalList();
                    strValueOf5 = String.valueOf((regularGoalList12 == null || (dallyGoalItem9 = regularGoalList12.get(1)) == null) ? null : Integer.valueOf(dallyGoalItem9.getTarget()));
                } else {
                    strValueOf5 = String.valueOf(STEP_GOAL_TARGET);
                }
                map.put(str6, strValueOf5);
                List<DallyGoalItem> regularGoalList13 = userProfile.getRegularGoalList();
                if (regularGoalList13 == null || (dallyGoalItem11 = regularGoalList13.get(2)) == null || dallyGoalItem11.getTarget() != 0) {
                    List<DallyGoalItem> regularGoalList14 = userProfile.getRegularGoalList();
                    if (regularGoalList14 != null && (dallyGoalItem10 = regularGoalList14.get(2)) != null) {
                        numValueOf = Integer.valueOf(dallyGoalItem10.getTarget());
                    }
                    strValueOf6 = String.valueOf(numValueOf);
                } else {
                    strValueOf6 = String.valueOf(MHS_GOAL_TARGET);
                }
                map.put(str4, strValueOf6);
            } else {
                String str7 = CALORIE_GOAL_FIELD;
                if (userProfile.getRegularGoalList() == null) {
                    strValueOf = String.valueOf(INSTANCE.getDefaultCalTarget());
                } else {
                    strValueOf = String.valueOf(INSTANCE.getDefaultCalTarget());
                }
                map.put(str7, strValueOf);
                String str8 = STEP_GOAL_FIELD;
                if (userProfile.getRegularGoalList() == null) {
                    strValueOf2 = String.valueOf(STEP_GOAL_TARGET);
                } else {
                    strValueOf2 = String.valueOf(STEP_GOAL_TARGET);
                }
                map.put(str8, strValueOf2);
                String str9 = STAND_TIMES_GOAL_FIELD;
                if (userProfile.getRegularGoalList() == null) {
                    strValueOf3 = String.valueOf(STAND_TIMES_GOAL_TARGET);
                } else {
                    strValueOf3 = String.valueOf(STAND_TIMES_GOAL_TARGET);
                }
                map.put(str9, strValueOf3);
            }
        }
        return xpd.h(map);
    }

    public final int getGoalValue(@NotNull String type, @Nullable List<DallyGoalItem> goal) {
        Intrinsics.checkNotNullParameter(type, "type");
        Logger.d(TAG, "getGoalValue");
        if (goal != null) {
            int size = goal.size();
            for (int i = 0; i < size; i++) {
                String str = TAG;
                Logger.d(str, "i == " + i + " dallyGoalItem " + goal.get(i) + " + " + goal.get(i).getField() + " + " + goal.get(i).getTarget());
                if (goal.get(i).getField() == Integer.parseInt(type)) {
                    Logger.d(str, "type -- " + Integer.parseInt(type) + "dallyGoalItem " + goal.get(i) + " + " + goal.get(i).getField() + " + " + goal.get(i).getTarget());
                    return goal.get(i).getTarget();
                }
            }
        }
        return UserInfoManager.getUserProfile$default(new UserInfoManager(), false, 1, null).getDEFAULT_TARGET()[Integer.parseInt(type) - 1];
    }

    public final int getINVALID_DEFAULT_VALUE() {
        return INVALID_DEFAULT_VALUE;
    }

    public final int getMCalorieGoal() {
        return mCalorieGoal;
    }

    @NotNull
    public final ArrayList<Integer> getMCurrentTarget() {
        return mCurrentTarget;
    }

    @NotNull
    public final String getMHS_GOAL_FIELD() {
        return MHS_GOAL_FIELD;
    }

    public final int getMHS_GOAL_TARGET() {
        return MHS_GOAL_TARGET;
    }

    @Nullable
    public final HashMap<String, String> getMMapGoal() {
        return mMapGoal;
    }

    public final int getMMhsGoal() {
        return mMhsGoal;
    }

    public final int getMStandTime() {
        return mStandTime;
    }

    public final int getMStepGoal() {
        return mStepGoal;
    }

    public final int getMSupportCalorieGoal() {
        return mSupportCalorieGoal;
    }

    public final int getMSupportMhsGoal() {
        return mSupportMhsGoal;
    }

    public final int getMSupportStandTime() {
        return mSupportStandTime;
    }

    public final int getMSupportStepGoal() {
        return mSupportStepGoal;
    }

    @NotNull
    public final ArrayList<Integer> getMSupportTarget() {
        return mSupportTarget;
    }

    public final int getMhsGoal() {
        return mMhsGoal;
    }

    @NotNull
    public final String getSTAND_TIMES_GOAL_FIELD() {
        return STAND_TIMES_GOAL_FIELD;
    }

    public final int getSTAND_TIMES_GOAL_TARGET() {
        return STAND_TIMES_GOAL_TARGET;
    }

    @NotNull
    public final String getSTEP_GOAL_FIELD() {
        return STEP_GOAL_FIELD;
    }

    public final int getSTEP_GOAL_TARGET() {
        return STEP_GOAL_TARGET;
    }

    public final int getSUPPORT_GOAL_CALORIE() {
        return SUPPORT_GOAL_CALORIE;
    }

    public final int getSUPPORT_GOAL_MHS() {
        return SUPPORT_GOAL_MHS;
    }

    public final int getSUPPORT_GOAL_STAND_TIMES() {
        return SUPPORT_GOAL_STAND_TIMES;
    }

    public final int getSUPPORT_GOAL_STEP() {
        return SUPPORT_GOAL_STEP;
    }

    public final int getStandTimeGoal() {
        return mStandTime;
    }

    public final int getStepGoal() {
        return mStepGoal;
    }

    public final boolean isDeviceCurrentSupportStand() {
        String str = TAG;
        ArrayList<Integer> arrayList = mDeviceCurrentGoal;
        Logger.i(str, " Goal manager isDeviceSupportStand mDeviceSupportGoal = " + arrayList);
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Integer num = mDeviceCurrentGoal.get(i);
            int i2 = SUPPORT_GOAL_STAND_TIMES;
            if (num != null && num.intValue() == i2) {
                Logger.i(TAG, " Goal manager mDeviceSupportGoal SUPPORT_GOAL_STAND_TIMES");
                return true;
            }
        }
        return false;
    }

    public final boolean isDeviceSupportAllGoal() {
        String did;
        HuamiApiCaller huamiApiCaller;
        String str = TAG;
        ArrayList<Integer> arrayList = mDeviceSupportGoal;
        Logger.i(str, "isDeviceSupportAllGoal mDeviceSupportGoal is " + arrayList);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Boolean boolValueOf = null;
        if (wearableDeviceModel != null && (did = wearableDeviceModel.getDid()) != null && (huamiApiCaller = INSTANCE.getHuamiApiCaller(did)) != null) {
            boolValueOf = Boolean.valueOf(huamiApiCaller.isSupportActivityData());
        }
        Logger.d(str, "huamiDeviceSupportALLGoal is " + boolValueOf + " mDeviceSupportGoal.size is " + arrayList.size());
        updateSupportTarget(wearableDeviceModel, boolValueOf);
        if (wearableDeviceModel == null || DeviceModelExtKt.isKongMing(wearableDeviceModel) || DeviceModelExtKt.isPanGu(wearableDeviceModel)) {
            return false;
        }
        return arrayList.size() == 4 || Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }

    public final boolean isDeviceSupportMhs() {
        ArrayList<Integer> arrayList = mDeviceCurrentGoal;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Integer num = mDeviceCurrentGoal.get(i);
            int i2 = SUPPORT_GOAL_MHS;
            if (num != null && num.intValue() == i2) {
                return true;
            }
        }
        return false;
    }

    public final void removeDeviceUpdateAllGoalSupportListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        deviceUpdateAllGoalSupportListener.remove(listener);
    }

    public final void setCurrentTarget(@Nullable List<Integer> target) {
        String str = TAG;
        Logger.i(str, "setCurrentTarget  come target == " + target);
        if (target == null || target.size() < 3) {
            return;
        }
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 43;
        Logger.i(str, "setCurrentTarget mCurrentTarget  == " + mCurrentTarget);
        ur9 ur9Var = new ur9();
        final is9.a aVar = new is9.a();
        is9[] is9VarArr = new is9[3];
        aVar.c = is9VarArr;
        Logger.i(str, "setCurrentTarget list.currentGoals  == " + is9VarArr.length);
        aVar.c[0] = new is9();
        aVar.c[0].c = target.get(0).intValue();
        aVar.c[1] = new is9();
        aVar.c[1].c = target.get(1).intValue();
        aVar.c[2] = new is9();
        int iIntValue = target.get(2).intValue();
        int i = SUPPORT_GOAL_STAND_TIMES;
        if (iIntValue == i) {
            aVar.c[2].c = SUPPORT_GOAL_MHS;
        } else {
            aVar.c[2].c = i;
        }
        Logger.i(str, "setCurrentTarget currentGoals == " + aVar.c);
        is9[] is9VarArr2 = mSupportGoal;
        if (is9VarArr2 != null) {
            aVar.d = is9VarArr2;
            Intrinsics.checkNotNull(is9VarArr2);
            Logger.i(str, "setCurrentTarget mSupportGoal  == " + is9VarArr2.length);
        } else {
            is9[] is9VarArr3 = new is9[4];
            aVar.d = is9VarArr3;
            is9VarArr3[0] = new is9();
            is9[] is9VarArr4 = aVar.d;
            is9VarArr4[0].c = SUPPORT_GOAL_STEP;
            is9VarArr4[1] = new is9();
            is9[] is9VarArr5 = aVar.d;
            is9VarArr5[1].c = SUPPORT_GOAL_CALORIE;
            is9VarArr5[2] = new is9();
            is9[] is9VarArr6 = aVar.d;
            is9VarArr6[2].c = i;
            is9VarArr6[3] = new is9();
            is9[] is9VarArr7 = aVar.d;
            is9VarArr7[3].c = SUPPORT_GOAL_MHS;
            Logger.i(str, "setCurrentTarget supportedGoals  == " + is9VarArr7.length);
        }
        ur9Var.k0(aVar);
        s7rVar.S(ur9Var);
        Logger.i(str + "setCurrentTarget  fitnessProto is " + ur9Var, new Object[0]);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(s7rVar, false, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.utils.GoalConfigSupport.setCurrentTarget.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(GoalConfigSupport.TAG + "code  = " + code, new Object[0]);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("read ble watch info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null), new Object[0]);
                Logger.d(GoalConfigSupport.TAG, "setCurrentTarget: type = " + aVar + "; code = " + (result != null ? Integer.valueOf(result.getCode()) : null));
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
        Logger.i(str + "mCurrentTarget  = " + mCurrentTarget, new Object[0]);
    }

    @NotNull
    public final String setDefaultSupport(@NotNull UserProfile data, boolean supportMhs) {
        Intrinsics.checkNotNullParameter(data, "data");
        int iRoundToInt = MathKt__MathJVMKt.roundToInt((((data.getWeight() * 8) * 45) / 60) / 100) * 100;
        String str = TAG;
        Logger.i(str, " Goal manager supportMhs is " + supportMhs + "calTargetGoal:" + iRoundToInt);
        HashMap<String, String> map = new HashMap<>(3);
        mMapGoal = map;
        if (supportMhs) {
            String str2 = CALORIE_GOAL_FIELD;
            if (data.getDailyCalGoal() != 0) {
                iRoundToInt = data.getDailyCalGoal();
            }
            map.put(str2, String.valueOf(iRoundToInt));
            map.put(STEP_GOAL_FIELD, String.valueOf(data.getDailyStepGoal() != 0 ? data.getDailyStepGoal() : STEP_GOAL_TARGET));
            map.put(MHS_GOAL_FIELD, String.valueOf(data.getDailyMhsGoal() != 0 ? data.getDailyMhsGoal() : MHS_GOAL_TARGET));
        } else {
            String str3 = CALORIE_GOAL_FIELD;
            if (data.getDailyCalGoal() != 0) {
                iRoundToInt = data.getDailyCalGoal();
            }
            map.put(str3, String.valueOf(iRoundToInt));
            map.put(STEP_GOAL_FIELD, String.valueOf(data.getDailyStepGoal() != 0 ? data.getDailyStepGoal() : STEP_GOAL_TARGET));
            map.put(STAND_TIMES_GOAL_FIELD, String.valueOf(data.getDailyStandTimesGoal() != 0 ? data.getDailyStandTimesGoal() : STAND_TIMES_GOAL_TARGET));
        }
        Logger.i(str, " Goal manager mMapGoal is " + mMapGoal);
        String strH = xpd.h(mMapGoal);
        Intrinsics.checkNotNullExpressionValue(strH, "mapToJsonString(...)");
        return strH;
    }

    public final void setDeviceUpdateAllGoalSupportListener(boolean finished) {
        Logger.i(TAG, "setDeviceUpdateAllGoalSupportListener result " + finished);
        Iterator<T> it = deviceUpdateAllGoalSupportListener.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke2(Boolean.valueOf(finished));
        }
    }

    public final void setMCalorieGoal(int i) {
        mCalorieGoal = i;
    }

    public final void setMCurrentTarget(@NotNull ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        mCurrentTarget = arrayList;
    }

    public final void setMMapGoal(@Nullable HashMap<String, String> map) {
        mMapGoal = map;
    }

    public final void setMMhsGoal(int i) {
        mMhsGoal = i;
    }

    public final void setMStandTime(int i) {
        mStandTime = i;
    }

    public final void setMStepGoal(int i) {
        mStepGoal = i;
    }

    public final void setMSupportCalorieGoal(int i) {
        mSupportCalorieGoal = i;
    }

    public final void setMSupportMhsGoal(int i) {
        mSupportMhsGoal = i;
    }

    public final void setMSupportStandTime(int i) {
        mSupportStandTime = i;
    }

    public final void setMSupportStepGoal(int i) {
        mSupportStepGoal = i;
    }

    public final void setMSupportTarget(@NotNull ArrayList<Integer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        mSupportTarget = arrayList;
    }

    public final void updateGoalList(@NotNull UserProfile profile) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        mCalorieGoal = getGoalValue(CALORIE_GOAL_FIELD, profile.getRegularGoalList());
        mSupportCalorieGoal = SUPPORT_GOAL_CALORIE;
        mStepGoal = getGoalValue(STEP_GOAL_FIELD, profile.getRegularGoalList());
        mSupportStepGoal = SUPPORT_GOAL_STEP;
        mStandTime = getGoalValue(STAND_TIMES_GOAL_FIELD, profile.getRegularGoalList());
        mSupportStandTime = SUPPORT_GOAL_STAND_TIMES;
        int i = INVALID_DEFAULT_VALUE;
        mSupportMhsGoal = i;
        int goalValue = getGoalValue(MHS_GOAL_FIELD, profile.getRegularGoalList());
        mMhsGoal = goalValue;
        mSupportMhsGoal = SUPPORT_GOAL_MHS;
        mSupportStandTime = i;
        Logger.i(TAG, " Goal manager setListener Calorie Goal is " + mCalorieGoal + ", Step Goal is " + mStepGoal + ", stand time is " + mStandTime + ", mhs is " + goalValue);
    }

    public final void updateSupportTarget(@Nullable final WearableDeviceModel currentDeviceModel, @Nullable final Boolean hmDeviceSupportALLGoal) {
        clearDeviceTarget();
        Logger.i(TAG + "updateSupportTarget come", new Object[0]);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 42;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.userinfo.utils.GoalConfigSupport.updateSupportTarget.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.i(GoalConfigSupport.TAG, "registerDeviceHr error , did : " + did + " , type : " + type + " , code : " + code);
                GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
                goalConfigSupport.getDeviceSupportGoal();
                WearableDeviceModel wearableDeviceModel = currentDeviceModel;
                boolean z = false;
                if (wearableDeviceModel != null && !DeviceModelExtKt.isKongMing(wearableDeviceModel) && !DeviceModelExtKt.isPanGu(currentDeviceModel) && (GoalConfigSupport.mDeviceSupportGoal.size() == 4 || Intrinsics.areEqual(hmDeviceSupportALLGoal, Boolean.TRUE))) {
                    z = true;
                }
                goalConfigSupport.setDeviceUpdateAllGoalSupportListener(z);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i(GoalConfigSupport.TAG, "registerDeviceHr success");
                GoalConfigSupport goalConfigSupport = GoalConfigSupport.INSTANCE;
                goalConfigSupport.updateTargetFromDevice(result);
                WearableDeviceModel wearableDeviceModel = currentDeviceModel;
                boolean z = false;
                if (wearableDeviceModel != null && !DeviceModelExtKt.isKongMing(wearableDeviceModel) && !DeviceModelExtKt.isPanGu(currentDeviceModel) && (GoalConfigSupport.mDeviceSupportGoal.size() == 4 || Intrinsics.areEqual(hmDeviceSupportALLGoal, Boolean.TRUE))) {
                    z = true;
                }
                goalConfigSupport.setDeviceUpdateAllGoalSupportListener(z);
            }
        }, 0, 8, null);
    }

    public final void updateTargetFromDevice(@Nullable SyncResult result) {
        clearDeviceTarget();
        if (result != null) {
            s7r packet = result.getPacket();
            if (packet != null) {
                Logger.i(TAG, "updateGoalFromDevice resultPacket is " + packet + ", resultPacket.getFitness()  = " + packet.u());
            }
            if (packet == null || packet.u() == null) {
                return;
            }
            is9.a aVarU = packet.u().u();
            String str = TAG;
            Logger.i(str + "updateGoalFromDevice goalStatus = " + aVarU, new Object[0]);
            if (aVarU != null) {
                mCurrentTarget.clear();
                mSupportTarget.clear();
                is9[] is9VarArr = aVarU.c;
                int length = is9VarArr != null ? is9VarArr.length : 0;
                Logger.i(str, "updateGoalFromDevice currentGoalsLength = " + length);
                if (length >= 3) {
                    mCurrentTarget.add(Integer.valueOf(SUPPORT_GOAL_STEP));
                    mCurrentTarget.add(Integer.valueOf(SUPPORT_GOAL_CALORIE));
                    int i = aVarU.c[2].c;
                    int i2 = SUPPORT_GOAL_STAND_TIMES;
                    if (i == i2) {
                        mCurrentTarget.add(Integer.valueOf(SUPPORT_GOAL_MHS));
                    } else {
                        mCurrentTarget.add(Integer.valueOf(i2));
                    }
                }
                is9[] is9VarArr2 = aVarU.d;
                mSupportGoal = is9VarArr2;
                int length2 = is9VarArr2 != null ? is9VarArr2.length : 0;
                Logger.i(str, "updateGoalFromDevice supportedGoalsLength = " + length2);
                if (length2 >= 4) {
                    mSupportTarget.add(Integer.valueOf(aVarU.d[0].c));
                    mSupportTarget.add(Integer.valueOf(aVarU.d[1].c));
                    mSupportTarget.add(Integer.valueOf(aVarU.d[2].c));
                    mSupportTarget.add(Integer.valueOf(aVarU.d[3].c));
                }
                getDeviceSupportGoal();
                Logger.i(str, "updateGoalFromDevice mSupportGoal is " + mSupportGoal + ", mCurrentTarget is " + mCurrentTarget);
            }
        }
    }

    public final void updateGoalList() {
        List<DallyGoalItem> regularGoalList = null;
        try {
            regularGoalList = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getRegularGoalList();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (regularGoalList != null) {
            int size = regularGoalList.size();
            for (int i = 0; i < size; i++) {
                if (regularGoalList.get(i).getField() == Integer.parseInt(CALORIE_GOAL_FIELD)) {
                    mCalorieGoal = regularGoalList.get(i).getTarget();
                    mSupportCalorieGoal = SUPPORT_GOAL_CALORIE;
                }
                if (regularGoalList.get(i).getField() == Integer.parseInt(STEP_GOAL_FIELD)) {
                    mStepGoal = regularGoalList.get(i).getTarget();
                    mSupportStepGoal = SUPPORT_GOAL_STEP;
                }
                if (regularGoalList.get(i).getField() == Integer.parseInt(STAND_TIMES_GOAL_FIELD)) {
                    mStandTime = regularGoalList.get(i).getTarget();
                    mSupportStandTime = SUPPORT_GOAL_STAND_TIMES;
                    mSupportMhsGoal = INVALID_DEFAULT_VALUE;
                } else if (regularGoalList.get(i).getField() == Integer.parseInt(MHS_GOAL_FIELD)) {
                    mMhsGoal = regularGoalList.get(i).getTarget();
                    mSupportMhsGoal = SUPPORT_GOAL_MHS;
                    mSupportStandTime = INVALID_DEFAULT_VALUE;
                }
            }
        }
        String str = TAG;
        int i2 = mCalorieGoal;
        Logger.i(str, " Goal manager setListener Calorie Goal is " + i2 + ", Step Goal is " + mStepGoal + ", stand time is " + mStandTime + ", mhs is " + mMhsGoal + ", mSupportCalorieGoal = " + mSupportCalorieGoal + ", mCalorieGoal = " + i2 + ", mSupportMhsGoal = " + mSupportMhsGoal + ", mSupportStandTime = " + mSupportStandTime);
    }
}
