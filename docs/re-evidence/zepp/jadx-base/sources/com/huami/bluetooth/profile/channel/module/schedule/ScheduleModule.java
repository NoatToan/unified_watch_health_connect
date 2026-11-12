package com.huami.bluetooth.profile.channel.module.schedule;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lkotlinx/coroutines/CoroutineScope;", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "loadOperationApi", "Lcom/huami/bluetooth/profile/channel/ChannelResponse;", "error", "onError", "Lkotlinx/coroutines/Job;", "g", "Lkotlin/Lazy;", "c", "()Lkotlinx/coroutines/Job;", "job", "", "h", LogUtil.I, "getModule", "()I", "module", "<set-?>", "i", "Lkotlin/properties/ReadWriteProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "e", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;)V", "scheduleApi", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleModule extends BaseModule implements CoroutineScope {
    public static final /* synthetic */ KProperty<Object>[] j;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty scheduleApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Job> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Job invoke() {
            return JobKt__JobKt.e(null, 1, null);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ScheduleModule.class), "scheduleApi", "getScheduleApi()Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;"));
        j = kPropertyArr;
    }

    public ScheduleModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.job = LazyKt__LazyJVMKt.lazy(a.a);
        this.module = 7;
        this.scheduleApi = Delegates.INSTANCE.notNull();
    }

    private final Job c() {
        return (Job) this.job.getValue();
    }

    private final ScheduleApi d() {
        return (ScheduleApi) this.scheduleApi.getValue(this, j[1]);
    }

    private final void e(ScheduleApi scheduleApi) {
        this.scheduleApi.setValue(this, j[1], scheduleApi);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return c().plus(Dispatchers.getIO());
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        super.init();
        e(new ScheduleImpl(this));
    }

    @NotNull
    public final ScheduleApi loadOperationApi() {
        return d();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule, com.huami.bluetooth.profile.channel.ChannelDataCallback
    public void onError(@NotNull ChannelResponse error) {
        int errorCode = error.getErrorCode();
        d().onError(error.getMsg(), Integer.valueOf(errorCode));
    }
}
