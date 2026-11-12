package com.huami.flutter.commonchannelplugin;

import android.content.Context;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.lib.rainbow.utils.RainbowUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.bean.BaseEvent;
import com.huami.mifit.analytics.builder.CalculationEventBuilder;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.builder.EventBuilder;
import com.huami.module.darkmode.AppNightModeHelper;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004H\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/flutter/commonchannelplugin/PigeonCommonChannelApiImpl;", "Lcom/huami/flutter/commonchannelplugin/PigeonCommonChannel$PigeonCommonChannelApi;", "Lcom/huami/flutter/commonchannelplugin/PigeonCommonChannel$EventModel;", "arg", "Lcom/huami/flutter/commonchannelplugin/PigeonCommonChannel$Result;", "", "result", "", "recordEvent", "Lcom/huami/flutter/commonchannelplugin/PigeonCommonChannel$HeaderInfo;", "getHeaderInfo", "", "getHostInfo", "Ljava/lang/Void;", "exitFlutterModule", "isDarkMode", "canPopFlutterPage", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "common_channel_plugin_release"}, k = 1, mv = {1, 5, 1})
public final class PigeonCommonChannelApiImpl implements PigeonCommonChannel.PigeonCommonChannelApi {

    @NotNull
    private static final String b = "PigeonCommonChannelApiImpl";
    private static final long c = 0;
    private static final long d = 1;
    private static final int e = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.flutter.commonchannelplugin.PigeonCommonChannelApiImpl$getHeaderInfo$2", f = "PigeonCommonChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PigeonCommonChannel.Result<PigeonCommonChannel.HeaderInfo> b;

        /* JADX INFO: renamed from: com.huami.flutter.commonchannelplugin.PigeonCommonChannelApiImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0428a extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0428a(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Get AccountService read user id/ region/ token country code exception! ", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ HashMap<String, String> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HashMap<String, String> map) {
                super(0);
                this.a = map;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("Get header info is ", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.flutter.commonchannelplugin.PigeonCommonChannelApiImpl$getHeaderInfo$2$8", f = "PigeonCommonChannelApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ PigeonCommonChannel.Result<PigeonCommonChannel.HeaderInfo> b;
            public final /* synthetic */ PigeonCommonChannel.HeaderInfo c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PigeonCommonChannel.Result<PigeonCommonChannel.HeaderInfo> result, PigeonCommonChannel.HeaderInfo headerInfo, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = result;
                this.c = headerInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.success(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(PigeonCommonChannel.Result<PigeonCommonChannel.HeaderInfo> result, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = result;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HashMap map = new HashMap();
            try {
                List<Pair> list = s.toList(r.toMap(HMWebUtil.getSystemHeader()));
                if (list != null) {
                    for (Pair pair : list) {
                        if (pair.getFirst() != null && pair.getSecond() != null) {
                            map.put(pair.getFirst(), pair.getSecond());
                        }
                    }
                }
                AccountService accountService = (AccountService) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
                if (accountService != null) {
                    map.put("userid", accountService.userIdOrThrow());
                    String strUserRegion = AccountServiceExtKt.userRegion(accountService);
                    if (strUserRegion != null) {
                        map.put("user_region", strUserRegion);
                    }
                    map.put("user_country", accountService.userCountryCode());
                    map.put("apptoken", accountService.appTokenOrThrow());
                }
            } catch (Exception e) {
                HMLog.error$default(PigeonCommonChannelApiImpl.b, null, null, new C0428a(e), 6, null);
            }
            HMLog.info(PigeonCommonChannelApiImpl.b, new b(map));
            PigeonCommonChannel.HeaderInfo headerInfo = new PigeonCommonChannel.HeaderInfo();
            headerInfo.setHeaderInfo(map);
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new c(this.b, headerInfo, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Get host url is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Get dark mode result > " + this.a.element + " with isDarkMode() api.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Get dark mode value is = " + this.a + '.';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Finally, get dark mode is ", Boolean.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ PigeonCommonChannel.EventModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PigeonCommonChannel.EventModel eventModel) {
            super(0);
            this.a = eventModel;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List list;
            StringBuilder sb = new StringBuilder();
            sb.append("Record event info is : eventType is ");
            sb.append(this.a.getEventType());
            sb.append(", eventId is ");
            sb.append((Object) this.a.getEventId());
            sb.append(", extras is ");
            Map<String, String> extras = this.a.getExtras();
            String string = null;
            if (extras != null && (list = s.toList(extras)) != null) {
                string = list.toString();
            }
            sb.append((Object) string);
            sb.append(StringUtil.SPACE);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Record event success!";
        }
    }

    public PigeonCommonChannelApiImpl(@NotNull Context context) {
        this.context = context;
    }

    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public /* bridge */ /* synthetic */ void canPopFlutterPage(Boolean bool, PigeonCommonChannel.Result result) {
        canPopFlutterPage(bool.booleanValue(), (PigeonCommonChannel.Result<Void>) result);
    }

    public void canPopFlutterPage(boolean arg, @Nullable PigeonCommonChannel.Result<Void> result) {
    }

    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public void exitFlutterModule(@Nullable PigeonCommonChannel.Result<Void> result) {
    }

    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public void getHeaderInfo(@Nullable PigeonCommonChannel.Result<PigeonCommonChannel.HeaderInfo> result) {
        if (result != null) {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(result, null), 2, null);
            return;
        }
        throw new IllegalArgumentException(("PigeonCommonChannelApiImpl getHeaderInfo(): Bad result=" + result + " param").toString());
    }

    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public void getHostInfo(@Nullable PigeonCommonChannel.Result<String> result) {
        if (result != null) {
            String host = HMServerDef.getHost();
            HMLog.info(b, new b(host));
            result.success(host);
        } else {
            throw new IllegalArgumentException(("PigeonCommonChannelApiImpl getHostInfo(): Bad result=" + result + " param").toString());
        }
    }

    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public void isDarkMode(@Nullable PigeonCommonChannel.Result<Boolean> result) {
        if (!(result != null)) {
            throw new IllegalArgumentException(("PigeonCommonChannelApiImpl isDarkMode(): Bad result=" + result + " param").toString());
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean zIsDarkMode = RainbowUtils.isDarkMode(this.context);
        booleanRef.element = zIsDarkMode;
        if (!zIsDarkMode) {
            HMLog.info(b, new c(booleanRef));
            int nightMode = AppNightModeHelper.getNightMode();
            HMLog.info(b, new d(nightMode));
            booleanRef.element = 2 == nightMode;
        }
        HMLog.info(b, new e(booleanRef));
        result.success(Boolean.valueOf(booleanRef.element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huami.flutter.commonchannelplugin.PigeonCommonChannel.PigeonCommonChannelApi
    public void recordEvent(@Nullable PigeonCommonChannel.EventModel arg, @Nullable PigeonCommonChannel.Result<Boolean> result) {
        EventBuilder eventBuilder;
        CountEventBuilder countEventBuilder;
        CalculationEventBuilder calculationEventBuilder = 0;
        if (!((result == null || arg == null) ? false : true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("PigeonCommonChannelApiImpl : Record event error! arg is ");
            sb.append(arg);
            sb.append(", eventId is ");
            sb.append((Object) (arg == null ? null : arg.getEventId()));
            sb.append(", eventType is ");
            sb.append(arg != null ? arg.getEventType() : null);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        HMLog.info(b, new f(arg));
        Map<String, String> extras = arg.getExtras();
        Long eventType = arg.getEventType();
        if (eventType != null && eventType.longValue() == 0) {
            countEventBuilder = new CountEventBuilder(arg.getEventId());
            if (extras != null && extras.size() > 0) {
                for (Map.Entry<String, String> entry : extras.entrySet()) {
                    countEventBuilder.addExtra(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            eventBuilder = countEventBuilder;
        } else {
            CalculationEventBuilder calculationEventBuilder2 = new CalculationEventBuilder(arg.getEventId(), arg.getCalculationTimeValue().longValue());
            if (extras != null && extras.size() > 0) {
                for (Map.Entry<String, String> entry2 : extras.entrySet()) {
                    calculationEventBuilder2.addExtra(entry2.getKey().toString(), entry2.getValue().toString());
                }
            }
            eventBuilder = calculationEventBuilder2;
            countEventBuilder = null;
            calculationEventBuilder = eventBuilder;
        }
        BaseEvent baseEventBuild = eventBuilder.build();
        if (arg.getAnonymous() != null) {
            baseEventBuild.anonymous = arg.getAnonymous().booleanValue();
        }
        if (arg.getIdentified() != null) {
            baseEventBuild.identified = arg.getIdentified().booleanValue();
        }
        if (arg.getRealTimeRecord() != null) {
            baseEventBuild.isRealTimeRecord = arg.getRealTimeRecord().booleanValue();
        }
        if (calculationEventBuilder != 0) {
            Analytics.recordEvent(calculationEventBuilder);
        } else if (countEventBuilder != null) {
            Analytics.recordEvent(countEventBuilder);
        }
        HMLog.debug(b, g.a);
        result.success(Boolean.TRUE);
    }
}
