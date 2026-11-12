package com.huami.femalehealth.uilib.helper;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.AlarmManagerCompat;
import androidx.core.app.NotificationManagerCompat;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.widget.calendar.CalculationManager;
import com.huami.femalehealth.uilib.widget.calendar.StyleCatch;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.ForecastStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.OvulationStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.PeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.status.StatusKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tencent.open.SocialConstants;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.mipush.sdk.MiPushClient;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 J2\u00020\u0001:\u0001JB\u0017\u0012\u0006\u00101\u001a\u00020/\u0012\u0006\u00104\u001a\u000202¢\u0006\u0004\bH\u0010IJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J8\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J&\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u001eJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010*\u001a\u00020&2\u0006\u0010)\u001a\u00020(J\u000e\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010-\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010.\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R$\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010;R\u0016\u0010=\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010;R\u0016\u0010@\u001a\u00020&8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010C\u001a\u00020\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0016\u0010G\u001a\u00020\u00048B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;¨\u0006K"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "req", "", "a", "Lcom/huami/femalehealth/uilib/widget/calendar/StyleCatch;", "styleCatch", "beforeDay", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "descStyle", "msgRes", hl.k, "Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "dateTripleDesc", "offset", "", "b", "newReq", "occurDate", "delayMillis", "", "msg", z.j, "Landroid/app/PendingIntent;", "i", "testNotice", "refreshCalendarTimezone", "Lkotlin/Function1;", "callback", "register", MiPushClient.COMMAND_UNREGISTER, "changeNotice", "cancelCurrentUserAppNotifyTask", "cancelCurrentUserMenstruationNotifyTask", "cancelCurrentUserOvulationNotifyTask", "", "hasNotifyPermission", "Landroid/app/Activity;", "activity", "jumpToNotifySettingActivity", "Lkotlinx/coroutines/Job;", "notice", "hasExactAlarmPermission", "requireAlarmPermission", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", CommonLanguageSettingFragment.KEY_REPO, "c", "Lkotlin/jvm/functions/Function1;", "Landroid/content/BroadcastReceiver;", GoogleApiAvailabilityLight.a, "Landroid/content/BroadcastReceiver;", SocialConstants.PARAM_RECEIVER, "()I", "appBeforeMenstruationDay", "appBeforeOvulationDay", "e", "()Z", "enableAppNotice", "h", "()Ljava/lang/String;", "uid", "f", "menstruationCode", "g", "ovulationCode", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;)V", "Companion", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class FemaleAppNoticeHelper {

    @NotNull
    private static final String e = "FemaleAppNoticeHelper";

    @NotNull
    private static final String f;

    @NotNull
    private static final String g = "MSG";

    @NotNull
    private static final String h = "DATE";
    private static final long i = -1;

    @NotNull
    private static final Calendar j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MenstruationRepo repo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super String, Unit> callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BroadcastReceiver receiver = new BroadcastReceiver() { // from class: com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper$receiver$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Intent a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ FemaleAppNoticeHelper c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Intent intent, Context context, FemaleAppNoticeHelper femaleAppNoticeHelper) {
                super(0);
                this.a = intent;
                this.b = context;
                this.c = femaleAppNoticeHelper;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                StringBuilder sb = new StringBuilder();
                sb.append("女性notice onReceive:");
                Intent intent = this.a;
                sb.append((Object) (intent == null ? null : intent.getAction()));
                sb.append(" context:");
                sb.append(this.b);
                sb.append(" callback:");
                sb.append(this.c.callback);
                return sb.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Intent a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Intent intent) {
                super(0);
                this.a = intent;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("女性notice msg:", this.a.getStringExtra("MSG"));
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            Function1 function1;
            HMLog.info("xys_FemaleAppNoticeHelper", new a(intent, context, this.a));
            String action = intent == null ? null : intent.getAction();
            if (TextUtils.isEmpty(action) || !Intrinsics.areEqual(FemaleAppNoticeHelper.f, action)) {
                return;
            }
            HMLog.info("xys_FemaleAppNoticeHelper", new b(intent));
            String stringExtra = intent.getStringExtra("MSG");
            if (stringExtra == null || (function1 = this.a.callback) == null) {
                return;
            }
            function1.invoke(stringExtra);
        }
    };

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("uid:", FemaleAppNoticeHelper.this.h());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "changeNotice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ DateTriple a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DateTriple dateTriple, int i, long j) {
            super(0);
            this.a = dateTriple;
            this.b = i;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dateTripleDesc:" + this.a + " offset:" + this.b + " delay:" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("跳转通知页面失败:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("跳转通知设置页面失败:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper$notice$1", f = "FemaleAppNoticeHelper.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ FemaleAppNoticeHelper a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FemaleAppNoticeHelper femaleAppNoticeHelper) {
                super(0);
                this.a = femaleAppNoticeHelper;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "enableAppNotice:" + this.a.e() + " enablePredict:" + FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper$notice$1$2", f = "FemaleAppNoticeHelper.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public final /* synthetic */ FemaleAppNoticeHelper b;
            public final /* synthetic */ DateTriple c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FemaleAppNoticeHelper femaleAppNoticeHelper, DateTriple dateTriple, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = femaleAppNoticeHelper;
                this.c = dateTriple;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenstruationVo>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<MenstruationVo>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MenstruationRepo menstruationRepo = this.b.repo;
                    Date date = AidKt.toDate(this.c);
                    this.a = 1;
                    obj = menstruationRepo.getLastMenstruation(date, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljava/util/Date;", "date", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper$notice$1$4", f = "FemaleAppNoticeHelper.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<Date, Continuation<? super List<? extends MenstruationVo>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FemaleAppNoticeHelper c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(FemaleAppNoticeHelper femaleAppNoticeHelper, Continuation<? super c> continuation) {
                super(2, continuation);
                this.c = femaleAppNoticeHelper;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Date date, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
                return ((c) create(date, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                c cVar = new c(this.c, continuation);
                cVar.b = obj;
                return cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Date date = (Date) this.b;
                    MenstruationRepo menstruationRepo = this.c.repo;
                    this.a = 1;
                    obj = menstruationRepo.getLastMenstruation(date, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<CalendarPeriodStyle, Boolean> {
            public static final d a = new d();

            public d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull CalendarPeriodStyle calendarPeriodStyle) {
                if (calendarPeriodStyle instanceof OvulationStyle) {
                    return Boolean.TRUE;
                }
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<Unit> {
            public final /* synthetic */ StyleCatch a;
            public final /* synthetic */ DateTriple b;
            public final /* synthetic */ FemaleAppNoticeHelper c;
            public final /* synthetic */ Context d;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "通知预测经期";
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "通知排卵日";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(StyleCatch styleCatch, DateTriple dateTriple, FemaleAppNoticeHelper femaleAppNoticeHelper, Context context) {
                super(0);
                this.a = styleCatch;
                this.b = dateTriple;
                this.c = femaleAppNoticeHelper;
                this.d = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x003b  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                boolean z;
                Pair<CalendarPeriodStyle, MenstruationVo> dayStyle = this.a.getDayStyle(ExtKt.toCalendar(this.b));
                if ((dayStyle == null ? null : dayStyle.getFirst()) instanceof PeriodStyle) {
                    Pair<CalendarPeriodStyle, MenstruationVo> dayStyle2 = this.a.getDayStyle(ExtKt.toCalendar(this.b.offsetDay(1)));
                    z = (dayStyle2 != null ? dayStyle2.getFirst() : null) instanceof ForecastStyle;
                }
                if (this.c.c() > 0 && !z) {
                    HMLog.info("xys_FemaleAppNoticeHelper", a.a);
                    FemaleAppNoticeHelper femaleAppNoticeHelper = this.c;
                    femaleAppNoticeHelper.k(this.d, this.a, femaleAppNoticeHelper.c(), StatusKt.getForecastStyle(), this.c.f(), R.string.fh_app_notification_menstruation);
                }
                if (this.c.d() > 0) {
                    HMLog.info("xys_FemaleAppNoticeHelper", b.a);
                    FemaleAppNoticeHelper femaleAppNoticeHelper2 = this.c;
                    femaleAppNoticeHelper2.k(this.d, this.a, femaleAppNoticeHelper2.d(), StatusKt.getOvulationStyle(), this.c.g(), R.string.fh_app_notification_ovulation);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FemaleAppNoticeHelper.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMLog.info("xys_FemaleAppNoticeHelper", new a(FemaleAppNoticeHelper.this));
                if (FemaleAppNoticeHelper.this.e() && FHCalculation.INSTANCE.getBasicInputValue().getEnablePredict()) {
                    StyleCatch overNowStyleCatch = StyleCatch.INSTANCE.getOverNowStyleCatch();
                    DateTriple dateTripleNowDate$default = DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null);
                    for (MenstruationVo menstruationVo : (Iterable) kotlinx.coroutines.d.b(null, new b(FemaleAppNoticeHelper.this, dateTripleNowDate$default, null), 1, null)) {
                        StyleCatch.put$default(overNowStyleCatch, ExtKt.toCalendar(menstruationVo.getDate()), TuplesKt.to(StatusKt.getPeriodStyle(), menstruationVo), false, 4, null);
                    }
                    DateTriple dateTripleOffsetDay = dateTripleNowDate$default.offsetDay(FHCalculation.INSTANCE.getBasicInputValue().getMenstruationCycleDay());
                    CalculationManager calculationManager = CalculationManager.INSTANCE;
                    com.huami.calendarview.Calendar calendar = ExtKt.toCalendar(dateTripleNowDate$default);
                    c cVar = new c(FemaleAppNoticeHelper.this, null);
                    d dVar = d.a;
                    e eVar = new e(overNowStyleCatch, dateTripleNowDate$default, FemaleAppNoticeHelper.this, this.c);
                    this.a = 1;
                    if (calculationManager.predictionMenstruation(calendar, dateTripleOffsetDay, overNowStyleCatch, cVar, dVar, eVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ DateTriple a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DateTriple dateTriple, long j, String str) {
            super(0);
            this.a = dateTriple;
            this.b = j;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "NO_NOTICE occurDate:" + this.a + " delayMillis:" + this.b + " msg:" + this.c + StringUtil.SPACE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "提醒时间:" + DateHelper.convertUTCDate$default(DateHelper.INSTANCE, this.a, false, 2, null) + "->" + ((Object) FemaleAppNoticeHelper.j.getTimeZone().getID());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "申请精确闹钟失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n"}, d2 = {"Lcom/huami/femalehealth/logiclib/helper/DateTriple;", "date", "Lkotlin/Pair;", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "pair", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function2<DateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo>, Unit> {
        public final /* synthetic */ Ref.ObjectRef<Integer> a;
        public final /* synthetic */ DateTriple b;
        public final /* synthetic */ CalendarPeriodStyle c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ FemaleAppNoticeHelper f;
        public final /* synthetic */ Context g;
        public final /* synthetic */ int h;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.ObjectRef<Integer> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Integer> objectRef) {
                super(0);
                this.a = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("day:", this.a.element);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i, int i2, long j) {
                super(0);
                this.a = i;
                this.b = i2;
                this.c = j;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "day:" + this.a + "  beforeDay:" + this.b + " delayTime:" + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Ref.ObjectRef<Integer> objectRef, DateTriple dateTriple, CalendarPeriodStyle calendarPeriodStyle, int i, int i2, FemaleAppNoticeHelper femaleAppNoticeHelper, Context context, int i3) {
            super(2);
            this.a = objectRef;
            this.b = dateTriple;
            this.c = calendarPeriodStyle;
            this.d = i;
            this.e = i2;
            this.f = femaleAppNoticeHelper;
            this.g = context;
            this.h = i3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Integer] */
        public final void a(@NotNull DateTriple dateTriple, @NotNull Pair<? extends CalendarPeriodStyle, MenstruationVo> pair) {
            Ref.ObjectRef<Integer> objectRef = this.a;
            Integer num = objectRef.element;
            objectRef.element = num == null ? 0 : Integer.valueOf(num.intValue() + 1);
            if (Intrinsics.areEqual(dateTriple, this.b)) {
                this.a.element = 0;
            }
            if (Intrinsics.areEqual(pair.getFirst(), this.c)) {
                HMLog.info("xys_FemaleAppNoticeHelper", new a(this.a));
                Ref.ObjectRef<Integer> objectRef2 = this.a;
                Integer num2 = objectRef2.element;
                if (num2 == null) {
                    return;
                }
                int i = this.d;
                int i2 = this.e;
                FemaleAppNoticeHelper femaleAppNoticeHelper = this.f;
                Context context = this.g;
                int i3 = this.h;
                int iIntValue = num2.intValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(ResourceHelper.INSTANCE.getString(i), Arrays.copyOf(new Object[]{Integer.valueOf(Math.min(i2, iIntValue))}, 1));
                long jB = -1;
                if (iIntValue != 0 && iIntValue >= i2) {
                    jB = femaleAppNoticeHelper.b(dateTriple, -i2);
                }
                long j = jB;
                HMLog.info("xys_FemaleAppNoticeHelper", new b(iIntValue, i2, j));
                femaleAppNoticeHelper.j(context, i3, i3, dateTriple, j, str);
                objectRef2.element = null;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(DateTriple dateTriple, Pair<? extends CalendarPeriodStyle, ? extends MenstruationVo> pair) {
            a(dateTriple, pair);
            return Unit.INSTANCE;
        }
    }

    static {
        String str;
        SupportAppHelper.Companion companion = SupportAppHelper.INSTANCE;
        if (companion.isMifit()) {
            str = "com.xiaomi.hm.health.action.FEMALE";
        } else {
            str = companion.isAmazfit() ? "com.huami.watch.hmwatchmanager.action.FEMALE" : "com.huami.femalehealth.uilib.action.amazfit";
        }
        f = str;
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 21);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        j = calendar;
    }

    public FemaleAppNoticeHelper(@NotNull SharedPreferencesUtils sharedPreferencesUtils, @NotNull MenstruationRepo menstruationRepo) {
        this.sp = sharedPreferencesUtils;
        this.repo = menstruationRepo;
        HMLog.info("xys_FemaleAppNoticeHelper", new a());
    }

    private final void a(Context context, int req) {
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(i(context, "", null, req));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long b(DateTriple dateTripleDesc, int offset) {
        Calendar calendar = j;
        calendar.set(1, dateTripleDesc.getYear());
        calendar.set(2, dateTripleDesc.getMonth() - 1);
        calendar.set(5, dateTripleDesc.getDay());
        calendar.add(5, offset);
        long timeInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
        HMLog.info("xys_FemaleAppNoticeHelper", new c(dateTripleDesc, offset, timeInMillis));
        return Math.max(-1L, timeInMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c() {
        return this.sp.getAppBeforeMenstruationDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d() {
        return this.sp.getAppBeforeOvulationDay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        return this.sp.getAppNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f() {
        return Intrinsics.stringPlus("0_", h()).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int g() {
        return Intrinsics.stringPlus("1_", h()).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h() {
        return this.sp.getUserId();
    }

    private final PendingIntent i(Context context, String msg, DateTriple occurDate, int req) {
        Intent intent = new Intent();
        intent.putExtra(g, msg);
        intent.putExtra(h, occurDate != null ? DateTriple.toYearMonthDayString$default(occurDate, null, 1, null) : null);
        intent.setAction(f);
        return PendingIntent.getBroadcast(context, req, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Context context, int req, int newReq, DateTriple occurDate, long delayMillis, String msg) {
        if (delayMillis == -1) {
            HMLog.info("xys_FemaleAppNoticeHelper", new g(occurDate, delayMillis, msg));
            return;
        }
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        alarmManager.cancel(i(context, msg, occurDate, req));
        a(context, req);
        long jCurrentTimeMillis = System.currentTimeMillis() + delayMillis;
        HMLog.info("xys_FemaleAppNoticeHelper", new h(jCurrentTimeMillis));
        try {
            if (hasExactAlarmPermission(context)) {
                AlarmManagerCompat.setExact(alarmManager, 0, jCurrentTimeMillis, i(context, msg, occurDate, newReq));
            }
        } catch (Exception e2) {
            HMLog.error$default(e, null, e2, i.a, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Context context, StyleCatch styleCatch, int beforeDay, CalendarPeriodStyle descStyle, int req, int msgRes) {
        styleCatch.forEachSortByTIme(new k(new Ref.ObjectRef(), DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null), descStyle, msgRes, beforeDay, this, context, req));
    }

    public final void cancelCurrentUserAppNotifyTask(@NotNull Context context) {
        a(context, f());
        a(context, g());
    }

    public final void cancelCurrentUserMenstruationNotifyTask(@NotNull Context context) {
        a(context, f());
    }

    public final void cancelCurrentUserOvulationNotifyTask(@NotNull Context context) {
        a(context, g());
    }

    public final void changeNotice(@NotNull Context context) {
        HMLog.info("xys_FemaleAppNoticeHelper", b.a);
        cancelCurrentUserAppNotifyTask(context);
        notice(context);
    }

    public final boolean hasExactAlarmPermission(@NotNull Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        return ((AlarmManager) systemService).canScheduleExactAlarms();
    }

    public final boolean hasNotifyPermission(@NotNull Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public final boolean jumpToNotifySettingActivity(@NotNull Activity activity) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", activity.getApplicationInfo().uid);
            intent.putExtra("app_package", activity.getPackageName());
            intent.putExtra("app_uid", activity.getApplicationInfo().uid);
            activity.startActivity(intent);
            return true;
        } catch (Exception e2) {
            HMLog.error$default("xys_FemaleAppNoticeHelper", null, null, new d(e2), 6, null);
            try {
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent2.putExtra(NotificationEvent.KEY_PACKAGE, activity.getPackageName());
                activity.startActivity(intent2);
                return true;
            } catch (Exception e3) {
                HMLog.error$default("xys_FemaleAppNoticeHelper", null, null, new e(e3), 6, null);
                return false;
            }
        }
    }

    @NotNull
    public final Job notice(@NotNull Context context) {
        return kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new f(context, null), 2, null);
    }

    public final void refreshCalendarTimezone(@NotNull Context context) {
        j.setTimeZone(TimeZone.getDefault());
        changeNotice(context);
    }

    public final void register(@NotNull Context context, @NotNull Function1<? super String, Unit> callback) {
        this.callback = callback;
        Context applicationContext = context.getApplicationContext();
        try {
            Result.Companion companion = Result.Companion;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(f);
            Result.m3845constructorimpl(applicationContext.registerReceiver(this.receiver, intentFilter));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        notice(applicationContext);
    }

    public final boolean requireAlarmPermission(@NotNull Context context) {
        try {
            context.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse(Intrinsics.stringPlus("package:", context.getPackageName()))));
            return true;
        } catch (Exception e2) {
            HMLog.error$default(e, null, e2, j.a, 2, null);
            return false;
        }
    }

    public final void testNotice(@NotNull Context context, @NotNull String msg, int req, long delayMillis) {
        j(context, req, req, DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null), delayMillis, msg);
    }

    public final void unregister(@NotNull Context context) {
        try {
            Result.Companion companion = Result.Companion;
            context.getApplicationContext().unregisterReceiver(this.receiver);
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }
}
