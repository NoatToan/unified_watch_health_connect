package com.xiaomi.hm.health.device.notification;

import com.huami.bluetooth.feature.file_transfer.FileInfo;
import com.huami.bluetooth.feature.file_transfer.FileTransferAppletApi;
import com.huami.bluetooth.feature.file_transfer.FileTransferManager;
import com.huami.bluetooth.profile.channel.module.file_transfer.PushListener;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoRequest;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoResponse;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.notification.TransferAppLogo$transferLogoFile$1", f = "TransferAppLogo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TransferAppLogo$transferLogoFile$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ HMMiLiProDevice b;
    public final /* synthetic */ LogoRequest c;
    public final /* synthetic */ String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "file transfer is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "transferLogoFile exception: " + this.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAppLogo$transferLogoFile$1(HMMiLiProDevice hMMiLiProDevice, LogoRequest logoRequest, String str, Continuation<? super TransferAppLogo$transferLogoFile$1> continuation) {
        super(2, continuation);
        this.b = hMMiLiProDevice;
        this.c = logoRequest;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TransferAppLogo$transferLogoFile$1(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TransferAppLogo$transferLogoFile$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            FileTransferAppletApi fileTransferAppletApiLoadApi = new FileTransferManager().loadApi(this.b);
            if (fileTransferAppletApiLoadApi == null) {
                fileTransferAppletApiLoadApi = null;
            } else {
                final LogoRequest logoRequest = this.c;
                String str = this.d;
                final HMMiLiProDevice hMMiLiProDevice = this.b;
                fileTransferAppletApiLoadApi.pushFileToDevice(new FileInfo("notification://logo?app_id=" + logoRequest.getPkg() + "&width=" + logoRequest.getWidth() + "&height=" + logoRequest.getHeight() + "&format=" + logoRequest.getFormat(), str), new PushListener() { // from class: com.xiaomi.hm.health.device.notification.TransferAppLogo$transferLogoFile$1$1$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "file transfer onCompleted";
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class b extends Lambda implements Function0<String> {
                        public final /* synthetic */ Throwable a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(Throwable th) {
                            super(0);
                            this.a = th;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "file transfer error: " + this.a;
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class c extends Lambda implements Function0<String> {
                        public final /* synthetic */ int a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public c(int i) {
                            super(0);
                            this.a = i;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "file transfer progress: " + this.a;
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
                            return "file transfer start";
                        }
                    }

                    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.PushListener
                    public void onCompleted() {
                        HMLog.info("TransferAppLogo", a.a);
                        TransferAppLogo.INSTANCE.e(hMMiLiProDevice, new LogoResponse(logoRequest.getPkg(), 1));
                    }

                    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.TransferListener
                    public void onFailed(@NotNull Throwable throwable) {
                        HMLog.info("TransferAppLogo", new b(throwable));
                        TransferAppLogo.INSTANCE.e(hMMiLiProDevice, new LogoResponse(logoRequest.getPkg(), 2));
                    }

                    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.TransferListener
                    public void onProgress(int progress) {
                        HMLog.info("TransferAppLogo", new c(progress));
                    }

                    @Override // com.huami.bluetooth.profile.channel.module.file_transfer.TransferListener
                    public void onStart() {
                        HMLog.info("TransferAppLogo", d.a);
                    }
                });
            }
            if (fileTransferAppletApiLoadApi == null) {
                HMLog.info("TransferAppLogo", a.a);
            }
        } catch (Exception e) {
            HMLog.info("TransferAppLogo", new b(e));
        }
        return Unit.INSTANCE;
    }
}
