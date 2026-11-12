package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.fragment.FragmentKt;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.devicex.manage.koin.KoinExtKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.netty.util.internal.StringUtil;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a<\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001a<\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000\u001aW\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f23\u0010\u000e\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\r\u001a'\u0010\u0014\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0017\u001a\u0004\u0018\u00010\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001f\u001a\n\u0010!\u001a\u00020 *\u00020\u0019\u001a\n\u0010\"\u001a\u00020\u0013*\u00020\u0001\"\u0013\u0010&\u001a\u00020#8F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LiveData;", "liveData", "Lkotlin/Function1;", "", "action", "observe", "Landroidx/appcompat/app/AppCompatActivity;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "Lkotlin/ExtensionFunctionType;", PointCategory.INIT, "getSettings", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "type", "settings", "", "write", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needDesc", "query", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "start", Command.STOP, "", "", "getTimeDesc", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)[Ljava/lang/String;", "", "toMinutes", "navigateUpSafely", "Lcom/xiaomi/hm/health/device/setting/network/WatchSettingsManager;", "getWatchSettingManager", "()Lcom/xiaomi/hm/health/device/setting/network/WatchSettingsManager;", "watchSettingManager", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class WatchSettingExtsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "navigate: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt", f = "WatchSettingExts.kt", i = {0}, l = {42}, m = "query", n = {"type"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingExtsKt.query(null, null, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<HashMap<SettingsGroupType, Settings>, Unit> {
        public final /* synthetic */ SettingsGroupType a;
        public final /* synthetic */ Settings b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SettingsGroupType settingsGroupType, Settings settings) {
            super(1);
            this.a = settingsGroupType;
            this.b = settings;
        }

        public final void a(@NotNull HashMap<SettingsGroupType, Settings> map) {
            map.put(this.a, this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HashMap<SettingsGroupType, Settings> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final HashMap<SettingsGroupType, Settings> getSettings(@NotNull Function1<? super HashMap<SettingsGroupType, Settings>, Unit> function1) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        function1.invoke(map);
        return map;
    }

    @NotNull
    public static final String[] getTimeDesc(@NotNull Time time, @NotNull Time time2) {
        int hour = (time.getHour() * 60) + time.getMinute();
        int hour2 = (time2.getHour() * 60) + time2.getMinute();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (hour >= hour2) {
            sb2.append(IntroduceShuffleFactoryKt.getString(R.string.unit_tomorrow));
            sb2.append(StringUtil.SPACE);
        }
        sb.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), hour));
        sb2.append(TimeUtils.formatTime((Context) DeviceXFunctionsKt.getContext(), hour2));
        return new String[]{sb.toString(), sb2.toString()};
    }

    @NotNull
    public static final WatchSettingsManager getWatchSettingManager() {
        return (WatchSettingsManager) KoinExtKt.getWatchSettingsScope().get(Reflection.getOrCreateKotlinClass(WatchSettingsManager.class), null, null);
    }

    public static final boolean navigateUpSafely(@NotNull Fragment fragment) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(FragmentKt.findNavController(fragment).navigateUp()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("Navigate", new a(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object query(@NotNull SettingsModule settingsModule, @NotNull SettingsGroupType settingsGroupType, boolean z, @NotNull Continuation<? super Settings> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQuerySettings = bVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuerySettings);
            bVar.a = settingsGroupType;
            bVar.c = 1;
            objQuerySettings = settingsModule.querySettings(z, new SettingsGroupType[]{settingsGroupType}, bVar);
            if (objQuerySettings == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsGroupType = (SettingsGroupType) bVar.a;
            ResultKt.throwOnFailure(objQuerySettings);
        }
        HashMap map = (HashMap) objQuerySettings;
        if (map == null) {
            return null;
        }
        return (Settings) map.get(settingsGroupType);
    }

    public static /* synthetic */ Object query$default(SettingsModule settingsModule, SettingsGroupType settingsGroupType, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return query(settingsModule, settingsGroupType, z, continuation);
    }

    public static final int toMinutes(@NotNull Time time) {
        return (time.getHour() * 60) + time.getMinute();
    }

    @Nullable
    public static final Object write(@NotNull SettingsModule settingsModule, @NotNull SettingsGroupType settingsGroupType, @NotNull Settings settings, @NotNull Continuation<? super Boolean> continuation) {
        return settingsModule.writeSetting(getSettings(new c(settingsGroupType, settings)), continuation);
    }
}
