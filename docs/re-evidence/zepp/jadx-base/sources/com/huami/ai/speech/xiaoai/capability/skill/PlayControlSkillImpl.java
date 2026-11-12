package com.huami.ai.speech.xiaoai.capability.skill;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.media.AudioManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.helper.VoiceConfigFuncKt;
import com.huami.ai.helper.VoiceConfigGot;
import com.huami.ai.skill.PlayControlSkill;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.NLPCommand;
import com.huami.bluetooth.profile.channel.module.voice.content.OpenAppContent;
import com.huami.device.feature.notification.utils.PkgNameConstants;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.Iterator;
import java.util.Objects;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/PlayControlSkillImpl;", "Lcom/huami/ai/skill/PlayControlSkill;", "", "c", "", GoogleApiAvailabilityLight.a, "Lcom/huami/ai/speech/xiaoai/capability/skill/AppInfo;", "appInfo", "b", "e", "f", "", "type", "a", "next", "prev", "start", Command.STOP, "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/helper/VoiceConfigGot;", "Lcom/huami/ai/helper/VoiceConfigGot;", "voiceConfigGot", "<init>", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/helper/VoiceConfigGot;)V", "Companion", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class PlayControlSkillImpl implements PlayControlSkill {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<AppInfo[]> d = LazyKt__LazyJVMKt.lazy(a.a);
    private static final long e = 3000;
    private static final long f = 500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final VoiceConfigGot voiceConfigGot;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/PlayControlSkillImpl$Companion;", "", "", "Lcom/huami/ai/speech/xiaoai/capability/skill/AppInfo;", "appInfoArray$delegate", "Lkotlin/Lazy;", "a", "()[Lcom/huami/ai/speech/xiaoai/capability/skill/AppInfo;", "appInfoArray", "", "checkInterval", "J", "waitTime", "<init>", "()V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "appInfoArray", "getAppInfoArray()[Lcom/huami/ai/speech/xiaoai/capability/skill/AppInfo;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AppInfo[] a() {
            return (AppInfo[]) PlayControlSkillImpl.d.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/ai/speech/xiaoai/capability/skill/AppInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AppInfo[]> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AppInfo[] getA() {
            return new AppInfo[]{new AppInfo(PkgNameConstants.QQ_MUSIC, "com.tencent.qqmusic.activity.AppStarterActivity"), new AppInfo("cn.kuwo.player", "cn.kuwo.player.activities.MainActivity"), new AppInfo("com.miui.player", "com.miui.player.ui.MusicBrowserActivity")};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("发送打开音乐的指令：", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "play start";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "music play check";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.skill.PlayControlSkillImpl$start$3", f = "PlayControlSkillImpl.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.ai.speech.xiaoai.capability.skill.PlayControlSkillImpl$start$3$1", f = "PlayControlSkillImpl.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ PlayControlSkillImpl b;

            /* JADX INFO: renamed from: com.huami.ai.speech.xiaoai.capability.skill.PlayControlSkillImpl$e$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0281a extends Lambda implements Function0<String> {
                public static final C0281a a = new C0281a();

                public C0281a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "music start checking...";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PlayControlSkillImpl playControlSkillImpl, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = playControlSkillImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                while (!this.b.c()) {
                    HMLog.info("speech", C0281a.a);
                    this.a = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(true);
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return PlayControlSkillImpl.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a(PlayControlSkillImpl.this, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj) == null) {
                PlayControlSkillImpl.this.d();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ AppInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AppInfo appInfo) {
            super(0);
            this.a = appInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("start music package:", this.a.getPackageName());
        }
    }

    public PlayControlSkillImpl(@NotNull Context context, @NotNull HMBaseDevice hMBaseDevice, @NotNull VoiceConfigGot voiceConfigGot) {
        this.context = context;
        this.baseDevice = hMBaseDevice;
        this.voiceConfigGot = voiceConfigGot;
    }

    private final boolean a(int type) {
        boolean zSendCommand$default = DeviceUtilsKt.sendCommand$default(this.baseDevice, new NLPCommand(new OpenAppContent(9, new OpenAppContent.MusicParameter(type, null, 2, null))), null, 2, null);
        HMLog.info("speech", new b(zSendCommand$default));
        return zSendCommand$default;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    private final AppInfo b(AppInfo appInfo) {
        Object next;
        Iterator<T> it2 = this.context.getPackageManager().getInstalledPackages(0).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!Intrinsics.areEqual(((PackageInfo) next).packageName, appInfo.getPackageName()));
        if (((PackageInfo) next) == null) {
            return null;
        }
        return appInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c() {
        Object systemService = this.context.getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return ((AudioManager) systemService).isMusicActive();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        for (AppInfo appInfo : INSTANCE.a()) {
            if (b(appInfo) != null) {
                f(appInfo);
                return;
            }
        }
        e();
    }

    private final void e() {
        Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }

    private final void f(AppInfo appInfo) {
        HMLog.info("speech", new f(appInfo));
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName(appInfo.getPackageName(), appInfo.getStartActivity()));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean next() {
        return a(3);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean prev() {
        return a(4);
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean start() {
        HMLog.info("speech", c.a);
        a(0);
        if (!VoiceConfigFuncKt.needStartThirdMusicApp(this.voiceConfigGot.getVoiceConfig())) {
            return true;
        }
        HMLog.info("speech", d.a);
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new e(null), 3, null);
        return true;
    }

    @Override // com.huami.ai.skill.PlayControlSkill
    public boolean stop() {
        return a(1);
    }
}
