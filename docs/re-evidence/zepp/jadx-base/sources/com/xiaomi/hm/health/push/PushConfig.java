package com.xiaomi.hm.health.push;

import android.content.Context;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/push/PushConfig;", "", "<init>", "()V", "Companion", "push_release"}, k = 1, mv = {1, 5, 1})
public final class PushConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static Function1<? super Map<String, String>, Boolean> a;

    @Nullable
    private static Accounts b;

    @Nullable
    private static Push c;

    @Nullable
    private static Function3<? super String, ? super String, ? super String, Boolean> d;

    @Nullable
    private static Function2<? super Context, ? super String, ? extends BaseMessage> e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u0010\u0010RS\u0010\t\u001a-\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0010\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRu\u0010%\u001aO\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\"\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\b\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010\u0010\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\\\u00101\u001a6\u0012\u0013\u0012\u00110-¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(.\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u0010\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/push/PushConfig$Companion;", "", "Lkotlin/Function1;", "", "", "Lkotlin/ParameterName;", "name", SportAnalytics.ParamValue.MapButtonType.MAP, "", "checkMessage", "Lkotlin/jvm/functions/Function1;", "getCheckMessage", "()Lkotlin/jvm/functions/Function1;", "setCheckMessage", "(Lkotlin/jvm/functions/Function1;)V", "getCheckMessage$annotations", "()V", "Lcom/xiaomi/hm/health/push/Accounts;", "accounts", "Lcom/xiaomi/hm/health/push/Accounts;", "getAccounts", "()Lcom/xiaomi/hm/health/push/Accounts;", "setAccounts", "(Lcom/xiaomi/hm/health/push/Accounts;)V", "getAccounts$annotations", "Lcom/xiaomi/hm/health/push/Push;", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "Lcom/xiaomi/hm/health/push/Push;", "getPush", "()Lcom/xiaomi/hm/health/push/Push;", "setPush", "(Lcom/xiaomi/hm/health/push/Push;)V", "getPush$annotations", "Lkotlin/Function3;", "huamiId", "thirdId", "loginType", "theSameUer", "Lkotlin/jvm/functions/Function3;", "getTheSameUer", "()Lkotlin/jvm/functions/Function3;", "setTheSameUer", "(Lkotlin/jvm/functions/Function3;)V", "getTheSameUer$annotations", "Lkotlin/Function2;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "content", "Lcom/xiaomi/hm/health/push/BaseMessage;", "buildMessage", "Lkotlin/jvm/functions/Function2;", "getBuildMessage", "()Lkotlin/jvm/functions/Function2;", "setBuildMessage", "(Lkotlin/jvm/functions/Function2;)V", "getBuildMessage$annotations", "<init>", "push_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getAccounts$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getBuildMessage$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getCheckMessage$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getPush$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getTheSameUer$annotations() {
        }

        @Nullable
        public final Accounts getAccounts() {
            return PushConfig.b;
        }

        @Nullable
        public final Function2<Context, String, BaseMessage> getBuildMessage() {
            return PushConfig.e;
        }

        @Nullable
        public final Function1<Map<String, String>, Boolean> getCheckMessage() {
            return PushConfig.a;
        }

        @Nullable
        public final Push getPush() {
            return PushConfig.c;
        }

        @Nullable
        public final Function3<String, String, String, Boolean> getTheSameUer() {
            return PushConfig.d;
        }

        public final void setAccounts(@Nullable Accounts accounts) {
            PushConfig.b = accounts;
        }

        public final void setBuildMessage(@Nullable Function2<? super Context, ? super String, ? extends BaseMessage> function2) {
            PushConfig.e = function2;
        }

        public final void setCheckMessage(@Nullable Function1<? super Map<String, String>, Boolean> function1) {
            PushConfig.a = function1;
        }

        public final void setPush(@Nullable Push push) {
            PushConfig.c = push;
        }

        public final void setTheSameUer(@Nullable Function3<? super String, ? super String, ? super String, Boolean> function3) {
            PushConfig.d = function3;
        }
    }

    @Nullable
    public static final Accounts getAccounts() {
        return INSTANCE.getAccounts();
    }

    @Nullable
    public static final Function2<Context, String, BaseMessage> getBuildMessage() {
        return INSTANCE.getBuildMessage();
    }

    @Nullable
    public static final Function1<Map<String, String>, Boolean> getCheckMessage() {
        return INSTANCE.getCheckMessage();
    }

    @Nullable
    public static final Push getPush() {
        return INSTANCE.getPush();
    }

    @Nullable
    public static final Function3<String, String, String, Boolean> getTheSameUer() {
        return INSTANCE.getTheSameUer();
    }

    public static final void setAccounts(@Nullable Accounts accounts) {
        INSTANCE.setAccounts(accounts);
    }

    public static final void setBuildMessage(@Nullable Function2<? super Context, ? super String, ? extends BaseMessage> function2) {
        INSTANCE.setBuildMessage(function2);
    }

    public static final void setCheckMessage(@Nullable Function1<? super Map<String, String>, Boolean> function1) {
        INSTANCE.setCheckMessage(function1);
    }

    public static final void setPush(@Nullable Push push) {
        INSTANCE.setPush(push);
    }

    public static final void setTheSameUer(@Nullable Function3<? super String, ? super String, ? super String, Boolean> function3) {
        INSTANCE.setTheSameUer(function3);
    }
}
