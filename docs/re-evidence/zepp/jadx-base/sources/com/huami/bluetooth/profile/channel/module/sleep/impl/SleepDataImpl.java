package com.huami.bluetooth.profile.channel.module.sleep.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.base.BaseApiImpl;
import com.huami.bluetooth.profile.channel.module.base.ResultCodec;
import com.huami.bluetooth.profile.channel.module.sleep.Config;
import com.huami.bluetooth.profile.channel.module.sleep.SleepData;
import com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi;
import com.huami.bluetooth.profile.channel.module.sleep.Version;
import com.huami.bluetooth.profile.channel.module.sleep.WriteDataHistory;
import com.huami.bluetooth.profile.channel.module.sleep.impl.codec.ConfigCodec;
import com.huami.bluetooth.profile.channel.module.sleep.impl.codec.SleepDataCodec;
import com.huami.bluetooth.profile.channel.module.sleep.impl.codec.VersionCodec;
import com.huami.bluetooth.profile.channel.module.sleep.impl.codec.WriteDataHistoryCodec;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002J\u0016\u0010\t\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0006H\u0014J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u0014R\u001c\u0010\u001d\u001a\u00020\u00188\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/impl/SleepDataImpl;", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepDataApi;", "Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/sleep/impl/Command;", "h", "", "", "g", Constant.h, "f", "Lcom/huami/bluetooth/profile/channel/module/sleep/Version;", "getVersion", "Lcom/huami/bluetooth/profile/channel/module/sleep/Config;", "getConfig", "Lcom/huami/bluetooth/profile/channel/module/sleep/WriteDataHistory;", "getLastWriteHistory", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "data", "", "writeData", "rawData", "parseCommand", "", "handleCommand", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDataImpl extends BaseApiImpl<Command> implements SleepDataApi {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Command a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Command command) {
            super(0);
            this.a = command;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Unsupported decode(" + this.a + ")!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(0);
            this.a = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Unsupported encode(" + ((Object) this.a.getClass().getSimpleName()) + ")!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Command a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Command command) {
            super(0);
            this.a = command;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Skipped command: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Command a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Command command) {
            super(0);
            this.a = command;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Unsupported request command(" + this.a + ")!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Write data exception!";
        }
    }

    public SleepDataImpl(@NotNull BaseModule baseModule) {
        super(baseModule);
        this.tag = "SleepDataImpl";
    }

    private final Object f(byte[] bArr, Command command) {
        if (Intrinsics.areEqual(command, Command.VersionResult.INSTANCE)) {
            return new VersionCodec().decode(bArr);
        }
        if (Intrinsics.areEqual(command, Command.ConfigResult.INSTANCE)) {
            return new ConfigCodec().decode(bArr);
        }
        if (Intrinsics.areEqual(command, Command.DataResult.INSTANCE)) {
            return new WriteDataHistoryCodec().decode(bArr);
        }
        if (Intrinsics.areEqual(command, Command.WriteDataResult.INSTANCE)) {
            return new ResultCodec().decode(bArr);
        }
        HMLog.warn$default(getTag(), null, new a(command), 2, null);
        return null;
    }

    private final byte[] g(Object obj) {
        if (obj instanceof SleepData) {
            return new SleepDataCodec().encode((SleepData) obj);
        }
        HMLog.warn$default(getTag(), null, new b(obj), 2, null);
        return new byte[0];
    }

    private final Command h(Command command) {
        if (Intrinsics.areEqual(command, Command.VersionResult.INSTANCE)) {
            return Command.QueryVersion.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.ConfigResult.INSTANCE)) {
            return Command.QueryConfig.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.DataResult.INSTANCE)) {
            return Command.QueryData.INSTANCE;
        }
        if (Intrinsics.areEqual(command, Command.WriteDataResult.INSTANCE)) {
            return Command.WriteData.INSTANCE;
        }
        HMLog.warn$default(getTag(), null, new d(command), 2, null);
        return command;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi
    @Nullable
    public Config getConfig() {
        Response responseSendRequest$default = BaseApiImpl.sendRequest$default(this, Command.QueryConfig.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (Config) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi
    @Nullable
    public WriteDataHistory getLastWriteHistory() {
        Response responseSendRequest$default = BaseApiImpl.sendRequest$default(this, Command.QueryData.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (WriteDataHistory) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi
    @Nullable
    public Version getVersion() {
        Response responseSendRequest$default = BaseApiImpl.sendRequest$default(this, Command.QueryVersion.INSTANCE, null, 0L, 6, null);
        if (responseSendRequest$default instanceof Success) {
            return (Version) ((Success) responseSendRequest$default).getData();
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.sleep.SleepDataApi
    public boolean writeData(@NotNull SleepData data) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Response responseSendRequest$default = BaseApiImpl.sendRequest$default(this, Command.WriteData.INSTANCE, g(data), 0L, 4, null);
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf((responseSendRequest$default instanceof Success) && ((Boolean) ((Success) responseSendRequest$default).getData()).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(getTag(), null, thM3848exceptionOrNullimpl, e.a, 2, null);
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    public void handleCommand(@NotNull Command cmd, @NotNull byte[] data) {
        if (!(Intrinsics.areEqual(cmd, Command.VersionResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.ConfigResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.DataResult.INSTANCE) ? true : Intrinsics.areEqual(cmd, Command.WriteDataResult.INSTANCE))) {
            HMLog.warn$default(getTag(), null, new c(cmd), 2, null);
            return;
        }
        Object objF = f(data, cmd);
        if (objF == null) {
            return;
        }
        dispatchResponse(h(cmd), objF);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @Nullable
    public Command parseCommand(@NotNull byte[] rawData) {
        return Command.INSTANCE.toCommand(rawData);
    }
}
