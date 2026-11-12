package com.xiaomi.hm.health.pushHelper;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.service.AnonymousService;
import com.huami.account.service.model.Area;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.util.ThirdPartUtil;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.play.bean.EventFriendFollow;
import com.xiaomi.hm.health.play.bean.EventFriendUnFollow;
import com.xiaomi.hm.health.push.Accounts;
import com.xiaomi.hm.health.push.BaseMessage;
import com.xiaomi.hm.health.push.ConfigMessage;
import com.xiaomi.hm.health.push.JumpMessage;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.push.Push;
import com.xiaomi.hm.health.push.PushConfig;
import com.xiaomi.hm.health.push.Type;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import com.xiaomi.hm.health.relation.message.CareMessage;
import com.xiaomi.hm.health.relation.message.FollowMessage;
import com.xiaomi.hm.health.relation.message.UnfollowMessage;
import com.xiaomi.hm.health.reminder.NotifyMessage;
import com.xiaomi.mipush.sdk.MiPushClient;
import de.greenrobot.event.EventBus;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/pushHelper/PushHelper;", "", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PushHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "MiPush";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0006\u0010\u0010\u001a\u00020\u0002R\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/pushHelper/PushHelper$Companion;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "", "c", "", SportAnalytics.ParamValue.MapButtonType.MAP, "", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "content", "Lcom/xiaomi/hm/health/push/BaseMessage;", "a", "initPush", MiPushClient.COMMAND_UNREGISTER, "TAG", "Ljava/lang/String;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion implements KoinComponent {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Map<String, String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map<String, String> map) {
                super(0);
                this.a = map;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "checkNotifyMessage:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ NotifyMessage a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(NotifyMessage notifyMessage) {
                super(0);
                this.a = notifyMessage;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "notifyMessage:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Map<String, ? extends String>, Boolean> {
            public d(Companion companion) {
                super(1, companion, Companion.class, "checkNotifyMessage", "checkNotifyMessage(Ljava/util/Map;)Z", 0);
            }

            public final boolean a(@Nullable Map<String, String> map) {
                return ((Companion) this.receiver).b(map);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Map<String, ? extends String> map) {
                return Boolean.valueOf(a(map));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "huamiId", "thirdId", "loginType", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function3<String, String, String, Boolean> {
            public static final e a = new e();

            public e() {
                super(3);
            }

            public final boolean a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                return HMLoginManager.theSameUser(str, str2, str3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2, String str3) {
                return Boolean.valueOf(a(str, str2, str3));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class f extends FunctionReferenceImpl implements Function2<Context, String, BaseMessage> {
            public f(Companion companion) {
                super(2, companion, Companion.class, "buildMessage", "buildMessage(Landroid/content/Context;Ljava/lang/String;)Lcom/xiaomi/hm/health/push/BaseMessage;", 0);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BaseMessage invoke(@NotNull Context context, @NotNull String str) {
                return ((Companion) this.receiver).a(context, str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "name", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function1<String, Object> {
            public final /* synthetic */ Class<?> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(Class<?> cls) {
                super(1);
                this.a = cls;
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull String str) {
                Object[] enumConstants = this.a.getEnumConstants();
                int length = enumConstants.length;
                int i = 0;
                while (i < length) {
                    Object obj = enumConstants[i];
                    i++;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Enum<*>");
                    if (Intrinsics.areEqual(((Enum) obj).name(), str)) {
                        return obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.push.BaseMessage] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.xiaomi.hm.health.push.BaseMessage] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v20, types: [com.xiaomi.hm.health.push.ConfigMessage] */
        /* JADX WARN: Type inference failed for: r2v21, types: [com.xiaomi.hm.health.relation.message.CareMessage] */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v23, types: [com.xiaomi.hm.health.push.JumpMessage] */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
        public final BaseMessage a(Context context, String content) {
            ?? AreEqual;
            ?? r0 = 0;
            r0 = 0;
            try {
                JSONObject jSONObject = new JSONObject(content);
                String string = jSONObject.getString("type");
                long jOptLong = jSONObject.optLong("uid");
                long jOptLong2 = jSONObject.optLong("msg_id");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (Intrinsics.areEqual(Type.JUMP_MESSAGE, string)) {
                    AreEqual = new JumpMessage(context, jOptLong2, jOptLong, jSONObject2);
                } else if (Intrinsics.areEqual(Type.CARE_MESSAGE, string)) {
                    AreEqual = new CareMessage(context, jOptLong2, jOptLong, jSONObject2);
                } else {
                    AreEqual = Intrinsics.areEqual(Type.FOLLOW_MESSAGE, string);
                    try {
                        if (AreEqual == 0 && !Intrinsics.areEqual("follow_reject", string)) {
                            if (Intrinsics.areEqual("config", string)) {
                                AreEqual = new ConfigMessage(context, jOptLong2, jOptLong, jSONObject2);
                            } else if (Intrinsics.areEqual(Type.UNFOLLOW_MESSAGE, string)) {
                                UnfollowMessage unfollowMessage = new UnfollowMessage(context, jOptLong2, jOptLong, jSONObject2);
                                EventBus.getDefault().post(new EventFriendUnFollow(String.valueOf(jSONObject2.optLong(WebAPI.PARAM_FROM_UID))));
                                AreEqual = unfollowMessage;
                            } else {
                                Intrinsics.areEqual(Type.FIRMWARE_NOTIFICATION_MESSAGE, string);
                            }
                            if (r0 != 0) {
                                r0.fromType = 1;
                                r0.setMessageType(string);
                            }
                            return r0;
                        }
                        FollowMessage followMessage = new FollowMessage(context, jOptLong2, jOptLong, jSONObject2);
                        int subtype = followMessage.getSubtype();
                        AreEqual = followMessage;
                        if (subtype == 0) {
                            EventBus.getDefault().post(new EventFriendFollow(String.valueOf(jSONObject2.optLong(WebAPI.PARAM_FROM_UID))));
                            AreEqual = followMessage;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r0 = AreEqual;
                        HMLog.error$default(null, null, e, new a(e), 3, null);
                        e.printStackTrace();
                    }
                }
                r0 = AreEqual;
                if (r0 != 0) {
                    r0.fromType = 1;
                    r0.setMessageType(string);
                }
            } catch (Exception e3) {
                e = e3;
            }
            return r0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(Map<String, String> map) {
            HMLog.debug(PushHelper.a, new b(map));
            if (map != null && map.size() != 0) {
                String str = map.get("data");
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                NotifyMessage notifyMessage = NotifyMessage.parse(str, true);
                HMLog.debug(PushHelper.a, new c(notifyMessage));
                if (notifyMessage != null) {
                    notifyMessage.work(null, true);
                    return true;
                }
            }
            return false;
        }

        private final String c() {
            Area area = SelectAreaHelper.getArea();
            if (SelectAreaHelper.isUnknown(area)) {
                return null;
            }
            return "user_" + area.getValue();
        }

        private final void d() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
            String str;
            if (CompanionApplication.isOverSea) {
                Class<?> cls = Class.forName("com.xiaomi.channel.commonutils.android.Region");
                g gVar = new g(cls);
                Method method = MiPushClient.class.getMethod("setRegion", cls);
                Object[] objArr = new Object[1];
                if (HMLoginManager.isInEU()) {
                    str = "Europe";
                } else if (HMLoginManager.isInRU()) {
                    str = "Russia";
                } else {
                    str = HMLoginManager.isInIN() ? "India" : "Global";
                }
                objArr[0] = gVar.invoke(str);
                method.invoke(null, objArr);
            }
        }

        @Override // org.koin.core.component.KoinComponent
        @NotNull
        public Koin getKoin() {
            return KoinComponent.DefaultImpls.getKoin(this);
        }

        @JvmStatic
        public final void initPush(@NotNull Context context) {
            AnonymousService anonymousService = (AnonymousService) getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AnonymousService.class), null, null);
            if (!MessageManager.ENABLE.booleanValue() || anonymousService.isAnonymousUser()) {
                return;
            }
            PushConfig.Companion companion = PushConfig.INSTANCE;
            Companion companion2 = PushHelper.INSTANCE;
            companion.setCheckMessage(new d(companion2));
            companion.setAccounts(new Accounts(Account.getUID(context), HMLoginManager.isInChina(), HMLoginManager.getThirdId(), HMLoginManager.getHuamiId(), HMLoginManager.isOldAccount(), HMLoginManager.isHuamiSDKLogin(), HMConfig.getScheme(), companion2.c()));
            companion.setPush(new Push(ThirdPartUtil.getXiaomiId(), ThirdPartUtil.getXiaomiKey()));
            companion.setTheSameUer(e.a);
            companion.setBuildMessage(new f(companion2));
            d();
            MessageManager.getDefault(context).initMiPush(context);
        }

        public final void unregister() {
            MessageManager messageManager;
            if (!MessageManager.ENABLE.booleanValue() || (messageManager = MessageManager.getDefault()) == null) {
                return;
            }
            messageManager.logout();
        }
    }

    @JvmStatic
    public static final void initPush(@NotNull Context context) {
        INSTANCE.initPush(context);
    }
}
