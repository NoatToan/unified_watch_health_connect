package com.huami.assistant.ui.v2.repo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.assistant.AssistantModule;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import java.util.Iterator;
import java.util.Vector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004J\u001b\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0004J\u001b\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0015J\u001b\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0015H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\u001aJ\u001b\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fR\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010+\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0016\u0010,\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010%R\u0016\u0010.\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u00100\u001a\u00020#8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010%R+\u00109\u001a\u0002012\u0006\u00102\u001a\u0002018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001d\u0010=\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b'\u0010<R#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001f0>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010AR\u001d\u0010F\u001a\u00020C8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\b$\u0010E\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/SettingRepo;", "", "Landroid/content/SharedPreferences;", GoogleApiAvailabilityLight.a, "", "enable", "", "f", "g", "e", "isEnable", "updateAutoDetect", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAutoDetect", "loadSyncCalendar", "loadSyncCalendarDialogShow", "isShow", "updateSyncCalendarDialogShow", "updateSyncCalendar", "loadSyncChineseCal", "updateSyncChineseCal", "", "loadChineseCalRemindTime", "time", "updateChineseCalRemindTime", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "loadScheduleVersion", "version", "updateScheduleVersion", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/assistant/ui/v2/repo/ScheduleSettingChangeCallback;", "callback", "setSyncCalendarSettingChangeCallback", "removeCalendarSettingChangeCallback", "", "b", "Ljava/lang/String;", "TAG", "c", "storeFileName", "autoDetectNotification", "syncCalendar", "syncCalendarDialogShow", "syncChineseCal", "h", "scheduleVersionInfo", "i", "chineseCalReminderTime", "Landroid/content/Context;", "<set-?>", z.j, "Lkotlin/properties/ReadWriteProperty;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", DbUtils.Const.Table.CONTEXT, hl.k, "Lkotlin/Lazy;", "()Landroid/content/SharedPreferences;", "store", "Ljava/util/Vector;", "l", "a", "()Ljava/util/Vector;", "changeListener", "Lcom/google/gson/Gson;", "m", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class SettingRepo {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "SettingRepo";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String storeFileName = "as_schedule_setting_store";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String autoDetectNotification = "as::schedule::detect::notify";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String syncCalendar = "as::schedule::sync::calendar";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String syncCalendarDialogShow = "as::schedule::sync::calendar:dialog:show";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final String syncChineseCal = "as::schedule::sync::chinese::calendar";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final String scheduleVersionInfo = "as::schedule::version::info";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final String chineseCalReminderTime = "as::schedule::chinese::calendar::remind::time";
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SettingRepo.class, DbUtils.Const.Table.CONTEXT, "getContext()Landroid/content/Context;", 0))};

    @NotNull
    public static final SettingRepo INSTANCE = new SettingRepo();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty context = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private static final Lazy store = LazyKt__LazyJVMKt.lazy(h.a);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private static final Lazy changeListener = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private static final Lazy gson = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Ljava/util/Vector;", "Lcom/huami/assistant/ui/v2/repo/ScheduleSettingChangeCallback;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Vector<ScheduleSettingChangeCallback>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vector<ScheduleSettingChangeCallback> invoke() {
            return new Vector<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/gson/Gson;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Gson> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadAutoDetect$1", f = "SettingRepo.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadAutoDetect$1$1", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
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
                return Boxing.boxBoolean(SettingRepo.INSTANCE.c().getBoolean(SettingRepo.autoDetectNotification, true));
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadChineseCalRemindTime$1", f = "SettingRepo.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadChineseCalRemindTime$1$1", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
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
                return Boxing.boxInt(SettingRepo.INSTANCE.c().getInt(SettingRepo.chineseCalReminderTime, -1));
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Integer> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadScheduleVersion$1", f = "SettingRepo.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ScheduleVersion>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadScheduleVersion$1$1", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ScheduleVersion>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ScheduleVersion> continuation) {
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
                try {
                    SettingRepo settingRepo = SettingRepo.INSTANCE;
                    String string = settingRepo.c().getString(SettingRepo.scheduleVersionInfo, "");
                    return !TextUtils.isEmpty(string) ? (ScheduleVersion) settingRepo.b().fromJson(string, ScheduleVersion.class) : new ScheduleVersion(1, false, false);
                } catch (Exception unused) {
                    return new ScheduleVersion(1, false, false);
                }
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ScheduleVersion> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadSyncCalendar$1", f = "SettingRepo.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadSyncCalendar$1$1", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
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
                return Boxing.boxBoolean(SettingRepo.INSTANCE.c().getBoolean(SettingRepo.syncCalendar, false));
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadSyncChineseCal$1", f = "SettingRepo.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$loadSyncChineseCal$1$1", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
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
                return Boxing.boxBoolean(SettingRepo.INSTANCE.c().getBoolean(SettingRepo.syncChineseCal, false));
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                a aVar = new a(null);
                this.a = 1;
                obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/content/SharedPreferences;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<SharedPreferences> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return SettingRepo.INSTANCE.d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$updateAutoDetect$2", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences.Editor>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SharedPreferences.Editor> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SharedPreferences.Editor editorEdit = SettingRepo.INSTANCE.c().edit();
            editorEdit.putBoolean(SettingRepo.autoDetectNotification, this.b);
            editorEdit.apply();
            return editorEdit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$updateChineseCalRemindTime$2", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences.Editor>, Object> {
        public int a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SharedPreferences.Editor> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SettingRepo settingRepo = SettingRepo.INSTANCE;
            SharedPreferences.Editor editorEdit = settingRepo.c().edit();
            editorEdit.putInt(SettingRepo.chineseCalReminderTime, this.b);
            editorEdit.apply();
            settingRepo.e();
            return editorEdit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$updateScheduleVersion$2", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences.Editor>, Object> {
        public int a;
        public final /* synthetic */ ScheduleVersion b;

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
            public final String invoke() {
                return this.a.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ScheduleVersion scheduleVersion, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = scheduleVersion;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SharedPreferences.Editor> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String json;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                json = SettingRepo.INSTANCE.b().toJson(this.b);
            } catch (Exception e) {
                HMLog.error$default("SettingRepo", null, null, new a(e), 6, null);
                json = "";
            }
            SharedPreferences.Editor editorEdit = SettingRepo.INSTANCE.c().edit();
            editorEdit.putString(SettingRepo.scheduleVersionInfo, json);
            editorEdit.apply();
            return editorEdit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$updateSyncCalendar$2", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences.Editor>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z, Continuation<? super l> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new l(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SharedPreferences.Editor> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SettingRepo settingRepo = SettingRepo.INSTANCE;
            SharedPreferences.Editor editorEdit = settingRepo.c().edit();
            boolean z = this.b;
            editorEdit.putBoolean(SettingRepo.syncCalendar, z);
            editorEdit.apply();
            settingRepo.f(z);
            return editorEdit;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.assistant.ui.v2.repo.SettingRepo$updateSyncChineseCal$2", f = "SettingRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SharedPreferences.Editor>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(boolean z, Continuation<? super m> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new m(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SharedPreferences.Editor> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SettingRepo settingRepo = SettingRepo.INSTANCE;
            SharedPreferences.Editor editorEdit = settingRepo.c().edit();
            boolean z = this.b;
            editorEdit.putBoolean(SettingRepo.syncChineseCal, z);
            editorEdit.apply();
            settingRepo.g(z);
            return editorEdit;
        }
    }

    private SettingRepo() {
    }

    private final Vector<ScheduleSettingChangeCallback> a() {
        return (Vector) changeListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson b() {
        return (Gson) gson.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences c() {
        return (SharedPreferences) store.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences d() {
        return getContext().getSharedPreferences(storeFileName, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Iterator<T> it2 = a().iterator();
        while (it2.hasNext()) {
            ((ScheduleSettingChangeCallback) it2.next()).onChangeChineseCalRemindTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean enable) {
        Iterator<T> it2 = a().iterator();
        while (it2.hasNext()) {
            ((ScheduleSettingChangeCallback) it2.next()).onChangeSyncCalendar(enable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(boolean enable) {
        Iterator<T> it2 = a().iterator();
        while (it2.hasNext()) {
            ((ScheduleSettingChangeCallback) it2.next()).onChangeSyncChineseCal(enable);
        }
    }

    @NotNull
    public final Context getContext() {
        return (Context) context.getValue(this, a[0]);
    }

    public final boolean loadAutoDetect() {
        if (AssistantModule.isBleDevice()) {
            return ((Boolean) kotlinx.coroutines.d.b(null, new c(null), 1, null)).booleanValue();
        }
        return true;
    }

    public final int loadChineseCalRemindTime() {
        return ((Number) kotlinx.coroutines.d.b(null, new d(null), 1, null)).intValue();
    }

    @NotNull
    public final ScheduleVersion loadScheduleVersion() {
        return (ScheduleVersion) kotlinx.coroutines.d.b(null, new e(null), 1, null);
    }

    public final boolean loadSyncCalendar() {
        if (AssistantModule.isBleDevice()) {
            return ((Boolean) kotlinx.coroutines.d.b(null, new f(null), 1, null)).booleanValue();
        }
        return true;
    }

    public final boolean loadSyncCalendarDialogShow() {
        return c().getBoolean(syncCalendarDialogShow, true);
    }

    public final boolean loadSyncChineseCal() {
        return ((Boolean) kotlinx.coroutines.d.b(null, new g(null), 1, null)).booleanValue();
    }

    public final void removeCalendarSettingChangeCallback(@NotNull ScheduleSettingChangeCallback callback) {
        a().remove(callback);
    }

    public final void setContext(@NotNull Context context2) {
        context.setValue(this, a[0], context2);
    }

    public final void setSyncCalendarSettingChangeCallback(@NotNull ScheduleSettingChangeCallback callback) {
        if (a().contains(callback)) {
            return;
        }
        a().add(callback);
    }

    @Nullable
    public final Object updateAutoDetect(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new i(z, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateChineseCalRemindTime(int i2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new j(i2, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateScheduleVersion(@NotNull ScheduleVersion scheduleVersion, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new k(scheduleVersion, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSyncCalendar(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new l(z, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void updateSyncCalendarDialogShow(boolean isShow) {
        SharedPreferences.Editor editorEdit = c().edit();
        editorEdit.putBoolean(syncCalendarDialogShow, isShow);
        editorEdit.apply();
    }

    @Nullable
    public final Object updateSyncChineseCal(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new m(z, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
