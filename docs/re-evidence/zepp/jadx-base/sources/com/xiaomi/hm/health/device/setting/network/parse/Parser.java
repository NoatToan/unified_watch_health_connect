package com.xiaomi.hm.health.device.setting.network.parse;

import com.google.gson.Gson;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.network.bean.Display;
import com.xiaomi.hm.health.device.setting.network.bean.DndMode;
import com.xiaomi.hm.health.device.setting.network.bean.IWatchSettings;
import com.xiaomi.hm.health.device.setting.network.bean.OfflineVoice;
import com.xiaomi.hm.health.device.setting.network.bean.QuickStart;
import com.xiaomi.hm.health.device.setting.network.bean.SleepMode;
import com.xiaomi.hm.health.device.setting.network.bean.Sort;
import com.xiaomi.hm.health.device.setting.network.bean.Sound;
import com.xiaomi.hm.health.device.setting.network.bean.Sport;
import com.xiaomi.hm.health.device.setting.network.bean.Wearing;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/parse/Parser;", "Lcom/xiaomi/hm/health/device/setting/network/parse/IParser;", "", "raw", "Ljava/lang/Class;", "Lcom/xiaomi/hm/health/device/setting/network/bean/IWatchSettings;", "clazz", "parse", "iWatchSettings", "deParse", "Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "gson", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class Parser implements IParser {

    @NotNull
    private static final String b = "Parser";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Gson gson = new Gson();

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
            return "deParse exception: " + this.a;
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
            return "parse: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ IWatchSettings a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(IWatchSettings iWatchSettings) {
            super(0);
            this.a = iWatchSettings;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parsed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parse e: " + this.a;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.network.parse.IParser
    @Nullable
    public String deParse(@Nullable IWatchSettings iWatchSettings) {
        Object objM3845constructorimpl;
        String json;
        try {
            Result.Companion companion = Result.Companion;
            if (iWatchSettings instanceof SleepMode) {
                json = this.gson.toJson(iWatchSettings, SleepMode.class);
            } else if (iWatchSettings instanceof Display) {
                json = this.gson.toJson(iWatchSettings, Display.class);
            } else if (iWatchSettings instanceof DndMode) {
                json = this.gson.toJson(iWatchSettings, DndMode.class);
            } else if (iWatchSettings instanceof OfflineVoice) {
                json = this.gson.toJson(iWatchSettings, OfflineVoice.class);
            } else if (iWatchSettings instanceof QuickStart) {
                json = this.gson.toJson(iWatchSettings, QuickStart.class);
            } else if (iWatchSettings instanceof Sort) {
                json = this.gson.toJson(iWatchSettings, Sort.class);
            } else if (iWatchSettings instanceof Sound) {
                json = this.gson.toJson(iWatchSettings, Sound.class);
            } else if (iWatchSettings instanceof Sport) {
                json = this.gson.toJson(iWatchSettings, Sport.class);
            } else {
                json = iWatchSettings instanceof Wearing ? this.gson.toJson(iWatchSettings, Wearing.class) : null;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(json);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(b, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    @Override // com.xiaomi.hm.health.device.setting.network.parse.IParser
    @Nullable
    public IWatchSettings parse(@Nullable String raw, @NotNull Class<? extends IWatchSettings> clazz) {
        Object objM3845constructorimpl;
        IWatchSettings iWatchSettings;
        try {
            Result.Companion companion = Result.Companion;
            HMLog.info(b, new b(raw));
            if (raw == null || m.isBlank(raw)) {
                iWatchSettings = null;
            } else {
                iWatchSettings = (IWatchSettings) this.gson.fromJson(raw, (Class) clazz);
                HMLog.info(b, new c(iWatchSettings));
            }
            objM3845constructorimpl = Result.m3845constructorimpl(iWatchSettings);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(b, null, null, new d(thM3848exceptionOrNullimpl), 6, null);
        }
        return (IWatchSettings) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
