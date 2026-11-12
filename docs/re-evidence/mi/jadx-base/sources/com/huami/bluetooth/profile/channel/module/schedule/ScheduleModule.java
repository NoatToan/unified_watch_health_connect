package com.huami.bluetooth.profile.channel.module.schedule;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.ChannelResponse;
import defpackage.mr;
import defpackage.r3;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lkotlinx/coroutines/CoroutineScope;", "", "init", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "loadOperationApi", "Lm4;", "error", "onError", "Lkotlinx/coroutines/Job;", "job$delegate", "Lkotlin/Lazy;", "getJob", "()Lkotlinx/coroutines/Job;", "job", "", RnReportConst.ApiReport.PARAM_MODULE, "I", "getModule", "()I", "<set-?>", "scheduleApi$delegate", "Lkotlin/properties/ReadWriteProperty;", "getScheduleApi", "()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "setScheduleApi", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;)V", "scheduleApi", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lr3;", "channelController", "<init>", "(Lr3;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ScheduleModule extends com.huami.bluetooth.profile.channel.module.a implements CoroutineScope {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ScheduleModule.class, "scheduleApi", "getScheduleApi()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", 0))};

    /* JADX INFO: renamed from: job$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;
    private final int module;

    /* JADX INFO: renamed from: scheduleApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty scheduleApi;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/coroutines/CompletableJob;", PluginDeviceInfo.FMODEL, "()Lkotlinx/coroutines/CompletableJob;"}, k = 3, mv = {1, 7, 1})
    public static final class a extends Lambda implements Function0<CompletableJob> {
        public static final a t = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CompletableJob invoke() {
            return JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleModule(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.job = LazyKt__LazyJVMKt.lazy(a.t);
        this.module = 7;
        this.scheduleApi = Delegates.INSTANCE.notNull();
    }

    private final Job getJob() {
        return (Job) this.job.getValue();
    }

    private final ScheduleApi getScheduleApi() {
        return (ScheduleApi) this.scheduleApi.getValue(this, $$delegatedProperties[0]);
    }

    private final void setScheduleApi(ScheduleApi scheduleApi) {
        this.scheduleApi.setValue(this, $$delegatedProperties[0], scheduleApi);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getU() {
        return getJob().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        super.init();
        setScheduleApi(new mr(this));
    }

    @NotNull
    public final ScheduleApi loadOperationApi() {
        return getScheduleApi();
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void onError(@NotNull ChannelResponse error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getScheduleApi().onError(error.getMsg(), Integer.valueOf(error.getErrorCode()));
    }
}
