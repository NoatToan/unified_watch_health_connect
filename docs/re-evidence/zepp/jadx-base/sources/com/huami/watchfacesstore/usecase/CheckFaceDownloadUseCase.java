package com.huami.watchfacesstore.usecase;

import com.huami.watchfacesstore.bean.WatchFaceDetailBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.repo.WatchFaceDetailRepo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086Bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/watchfacesstore/usecase/CheckFaceDownloadUseCase;", "", "", "watchfaceId", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "invoke", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;", "a", "Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "b", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceManager", "Lkotlinx/coroutines/CoroutineDispatcher;", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/huami/watchfacesstore/repo/WatchFaceDetailRepo;Lcom/huami/watchfacesstore/device/DeviceConfigManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class CheckFaceDownloadUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceDetailRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/WatchFaceDetailBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.usecase.CheckFaceDownloadUseCase$invoke$2", f = "CheckFaceDownloadUseCase.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends Boolean, ? extends WatchFaceDetailBean>>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return CheckFaceDownloadUseCase.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Pair<? extends Boolean, ? extends WatchFaceDetailBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Pair<Boolean, WatchFaceDetailBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Pair<Boolean, WatchFaceDetailBean>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDetailRepo watchFaceDetailRepo = CheckFaceDownloadUseCase.this.repo;
                String deviceId = CheckFaceDownloadUseCase.this.deviceManager.getDeviceInfo().getDeviceId();
                int i2 = this.c;
                this.a = 1;
                obj = watchFaceDetailRepo.getWatchFaceDetailByLocal(deviceId, i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            WatchFaceDetailBean watchFaceDetailBean = (WatchFaceDetailBean) obj;
            if (watchFaceDetailBean == null) {
                return TuplesKt.to(Boxing.boxBoolean(false), null);
            }
            return !new File(watchFaceDetailBean.getDownloadUrl()).exists() ? TuplesKt.to(Boxing.boxBoolean(false), watchFaceDetailBean) : TuplesKt.to(Boxing.boxBoolean(true), watchFaceDetailBean);
        }
    }

    public CheckFaceDownloadUseCase(@NotNull WatchFaceDetailRepo watchFaceDetailRepo, @NotNull DeviceConfigManager deviceConfigManager, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.repo = watchFaceDetailRepo;
        this.deviceManager = deviceConfigManager;
        this.ioDispatcher = coroutineDispatcher;
    }

    @Nullable
    public final Object invoke(int i, @NotNull Continuation<? super Pair<Boolean, WatchFaceDetailBean>> continuation) {
        return BuildersKt.withContext(this.ioDispatcher, new a(i, null), continuation);
    }

    public /* synthetic */ CheckFaceDownloadUseCase(WatchFaceDetailRepo watchFaceDetailRepo, DeviceConfigManager deviceConfigManager, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(watchFaceDetailRepo, deviceConfigManager, (i & 4) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }
}
