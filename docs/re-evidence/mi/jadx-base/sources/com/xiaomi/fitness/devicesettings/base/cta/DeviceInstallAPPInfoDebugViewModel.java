package com.xiaomi.fitness.devicesettings.base.cta;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.sport.route.detail.util.MapAppLaunchExtKt;
import defpackage.q64;
import defpackage.s7r;
import defpackage.v69;
import defpackage.w69;
import defpackage.x69;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\t\b\u0007¢\u0006\u0004\b'\u0010\u0018J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002¢\u0006\u0004\b\u001c\u0010\u001dR%\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "Lw69;", "getFakerApps", "()Ljava/util/List;", "Ljava/io/File;", "file", "", MiuiCursorConstants.CONTENT, "", "append", "writeCSV", "(Ljava/io/File;Ljava/lang/String;Z)Z", "Lv69;", "ctaAppBehavior", "getEachColumnStr", "(Lv69;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "getCTAAppList", "()V", "subscribeAppBehavior", "unSubscribeAppBehavior", "ctaAppBehaviorList", "downloadCTAFile", "(Ljava/util/List;)V", "Landroidx/lifecycle/MutableLiveData;", "deviceCTAAppList", "Landroidx/lifecycle/MutableLiveData;", "getDeviceCTAAppList", "()Landroidx/lifecycle/MutableLiveData;", "downloadSaveResult", "getDownloadSaveResult", "SPLIT", "Ljava/lang/String;", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceInstallAPPInfoDebugViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInstallAPPInfoDebugViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,315:1\n13402#2,2:316\n*S KotlinDebug\n*F\n+ 1 DeviceInstallAPPInfoDebugViewModel.kt\ncom/xiaomi/fitness/devicesettings/base/cta/DeviceInstallAPPInfoDebugViewModel\n*L\n298#1:316,2\n*E\n"})
public final class DeviceInstallAPPInfoDebugViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "CTA_APP";

    @NotNull
    private final MutableLiveData<List<w69>> deviceCTAAppList = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> downloadSaveResult = new MutableLiveData<>();

    @NotNull
    private final String SPLIT = ",";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {245}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<v69> $ctaAppBehaviorList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<v69> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctaAppBehaviorList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceInstallAPPInfoDebugViewModel.this.new AnonymousClass1(this.$ctaAppBehaviorList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1 deviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1 = new DeviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1(DeviceInstallAPPInfoDebugViewModel.this, this.$ctaAppBehaviorList, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, deviceInstallAPPInfoDebugViewModel$downloadCTAFile$1$saveResult$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$getCTAAppList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$getCTAAppList$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$getCTAAppList$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$getCTAAppList$1$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DeviceInstallAPPInfoDebugViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04401(DeviceInstallAPPInfoDebugViewModel deviceInstallAPPInfoDebugViewModel, Continuation<? super C04401> continuation) {
                super(2, continuation);
                this.this$0 = deviceInstallAPPInfoDebugViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04401(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 13;
                s7rVar.f = 9;
                DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
                final DeviceInstallAPPInfoDebugViewModel deviceInstallAPPInfoDebugViewModel = this.this$0;
                DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel.getCTAAppList.1.1.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        Logger.d("CTA_APP", "getDeviceMode fail: " + code);
                        deviceInstallAPPInfoDebugViewModel.getDeviceCTAAppList().postValue(deviceInstallAPPInfoDebugViewModel.getFakerApps());
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        w69[] w69VarArr;
                        s7r packet;
                        x69 x69VarT;
                        List<w69> mutableList = null;
                        w69.a aVarP = (result == null || (packet = result.getPacket()) == null || (x69VarT = packet.t()) == null) ? null : x69VarT.p();
                        Logger.d("CTA_APP", "getCTAAppList: " + aVarP);
                        MutableLiveData<List<w69>> deviceCTAAppList = deviceInstallAPPInfoDebugViewModel.getDeviceCTAAppList();
                        if (aVarP != null && (w69VarArr = aVarP.c) != null) {
                            mutableList = ArraysKt___ArraysKt.toMutableList(w69VarArr);
                        }
                        deviceCTAAppList.postValue(mutableList);
                    }
                }, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C20071(Continuation<? super C20071> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceInstallAPPInfoDebugViewModel.this.new C20071(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04401 c04401 = new C04401(DeviceInstallAPPInfoDebugViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04401, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$subscribeAppBehavior$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$subscribeAppBehavior$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {218}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$subscribeAppBehavior$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$subscribeAppBehavior$1$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C04421(Continuation<? super C04421> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04421(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 13;
                s7rVar.f = 12;
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C20081(Continuation<? super C20081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20081(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04421 c04421 = new C04421(null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04421, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$unSubscribeAppBehavior$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$unSubscribeAppBehavior$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {ErrorCode.ERROR_SP_NOTICE_NOT_READY}, m = "invokeSuspend", n = {}, s = {})
    public static final class C20091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$unSubscribeAppBehavior$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.base.cta.DeviceInstallAPPInfoDebugViewModel$unSubscribeAppBehavior$1$1", f = "DeviceInstallAPPInfoDebugViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;

            public C04431(Continuation<? super C04431> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04431(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                s7r s7rVar = new s7r();
                s7rVar.e = 13;
                s7rVar.f = 13;
                DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 8, null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C20091(Continuation<? super C20091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C20091(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C04431 c04431 = new C04431(null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c04431, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEachColumnStr(v69 ctaAppBehavior) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        q64[] q64VarArr;
        int i = 0;
        boolean z = ctaAppBehavior == null;
        String str6 = "";
        if (ctaAppBehavior == null || (q64VarArr = ctaAppBehavior.d) == null) {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        } else {
            int length = q64VarArr.length;
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
            while (i < length) {
                String str7 = str6;
                q64 q64Var = q64VarArr[i];
                q64[] q64VarArr2 = q64VarArr;
                if (Intrinsics.areEqual(q64Var.c, "时间")) {
                    str7 = q64Var.d;
                }
                if (Intrinsics.areEqual(q64Var.c, "进程号")) {
                    str = q64Var.d;
                }
                if (Intrinsics.areEqual(q64Var.c, "敏感行为")) {
                    str2 = q64Var.d;
                }
                if (Intrinsics.areEqual(q64Var.c, "API")) {
                    str3 = q64Var.d;
                }
                if (Intrinsics.areEqual(q64Var.c, "包名")) {
                    str4 = q64Var.d;
                }
                i++;
                str6 = str7;
                q64VarArr = q64VarArr2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "时间" : str6);
        sb.append(this.SPLIT);
        if (z) {
            str5 = "应用";
        } else {
            str5 = ctaAppBehavior != null ? ctaAppBehavior.c : null;
        }
        sb.append(str5);
        sb.append(this.SPLIT);
        sb.append(z ? "进程号" : str);
        sb.append(this.SPLIT);
        sb.append(z ? "敏感行为" : str2);
        sb.append(this.SPLIT);
        sb.append(z ? "API" : str3);
        sb.append(this.SPLIT);
        sb.append(z ? "包名" : str4);
        sb.append(this.SPLIT);
        sb.append("\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<w69> getFakerApps() {
        ArrayList arrayList = new ArrayList();
        w69 w69Var = new w69();
        w69Var.c = "com.yunmai.scale";
        w69Var.d = "好轻";
        w69Var.f = "u1";
        w69Var.e = "v1";
        arrayList.add(w69Var);
        w69 w69Var2 = new w69();
        w69Var2.c = "com.ximalaya.wearsmart";
        w69Var2.d = "喜马拉雅";
        w69Var2.f = "u1";
        w69Var2.e = "v1";
        arrayList.add(w69Var2);
        w69 w69Var3 = new w69();
        w69Var3.c = "com.watch.qq.vela";
        w69Var3.d = "QQ音乐";
        w69Var3.f = "u1";
        w69Var3.e = "v1";
        arrayList.add(w69Var3);
        w69 w69Var4 = new w69();
        w69Var4.c = "com.umetrip.hlzhmiWatchN62";
        w69Var4.d = "航旅纵横";
        w69Var4.f = "u1";
        w69Var4.e = "v1";
        arrayList.add(w69Var4);
        w69 w69Var5 = new w69();
        w69Var5.c = "com.tencent.wechatrtos";
        w69Var5.d = "微信";
        w69Var5.f = "u1";
        w69Var5.e = "v1";
        arrayList.add(w69Var5);
        w69 w69Var6 = new w69();
        w69Var6.c = "com.szc.drinkwater";
        w69Var6.d = "喝水时间";
        w69Var6.f = "u1";
        w69Var6.e = "v1";
        arrayList.add(w69Var6);
        w69 w69Var7 = new w69();
        w69Var7.c = "com.netease.vela";
        w69Var7.d = "网易云音乐";
        w69Var7.f = "u1";
        w69Var7.e = "v1";
        arrayList.add(w69Var7);
        w69 w69Var8 = new w69();
        w69Var8.c = "com.lemonpiggy.drinkwater";
        w69Var8.d = "柠檬喝水";
        w69Var8.f = "u1";
        w69Var8.e = "v1";
        arrayList.add(w69Var8);
        w69 w69Var9 = new w69();
        w69Var9.c = "com.kugou.xiaomi";
        w69Var9.d = "酷狗音乐";
        w69Var9.f = "u1";
        w69Var9.e = "v1";
        arrayList.add(w69Var9);
        w69 w69Var10 = new w69();
        w69Var10.c = "com.ifengfm.watch.vela";
        w69Var10.d = "凤凰FM";
        w69Var10.f = "u1";
        w69Var10.e = "v1";
        arrayList.add(w69Var10);
        w69 w69Var11 = new w69();
        w69Var11.c = "com.icoolme.android.weather";
        w69Var11.d = "最美天气";
        w69Var11.f = "u1";
        w69Var11.e = "v1";
        arrayList.add(w69Var11);
        w69 w69Var12 = new w69();
        w69Var12.c = "com.fxkj.huabeivela";
        w69Var12.d = "滑呗";
        w69Var12.f = "u1";
        w69Var12.e = "v1";
        arrayList.add(w69Var12);
        w69 w69Var13 = new w69();
        w69Var13.c = "com.example.calculator.vela";
        w69Var13.d = "科学计算器";
        w69Var13.f = "u1";
        w69Var13.e = "v1";
        arrayList.add(w69Var13);
        w69 w69Var14 = new w69();
        w69Var14.c = "com.calendar.vela.wnlxiaomi";
        w69Var14.d = "万年历日历";
        w69Var14.f = "u1";
        w69Var14.e = "v1";
        arrayList.add(w69Var14);
        w69 w69Var15 = new w69();
        w69Var15.c = "com.bcz.watch";
        w69Var15.d = "百词斩";
        w69Var15.f = "u1";
        w69Var15.e = "v1";
        arrayList.add(w69Var15);
        w69 w69Var16 = new w69();
        w69Var16.c = MapAppLaunchExtKt.BAIDU_MAP_PACKAGE_NAME;
        w69Var16.d = "百度地图";
        w69Var16.f = "u1";
        w69Var16.e = "v1";
        arrayList.add(w69Var16);
        w69 w69Var17 = new w69();
        w69Var17.c = "cn.ticktick.task";
        w69Var17.d = "滴答清单";
        w69Var17.f = "u1";
        w69Var17.e = "v1";
        arrayList.add(w69Var17);
        w69 w69Var18 = new w69();
        w69Var18.c = "cn.goski.miwatch";
        w69Var18.d = "GOSKI去滑雪";
        w69Var18.f = "u1";
        w69Var18.e = "v1";
        arrayList.add(w69Var18);
        w69 w69Var19 = new w69();
        w69Var19.c = "cn.cgmcare.app";
        w69Var19.d = "糖动";
        w69Var19.f = "u1";
        w69Var19.e = "v1";
        arrayList.add(w69Var19);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean writeCSV(File file, String content, boolean append) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, append);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            FitnessLogUtils.e("CTA_APP", "writeCSV " + e.getMessage());
            return false;
        } catch (IOException e2) {
            FitnessLogUtils.e("CTA_APP", "writeCSV" + e2.getMessage());
            return false;
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void downloadCTAFile(@NotNull List<v69> ctaAppBehaviorList) {
        Intrinsics.checkNotNullParameter(ctaAppBehaviorList, "ctaAppBehaviorList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(ctaAppBehaviorList, null), 3, null);
    }

    public final void getCTAAppList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20071(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<List<w69>> getDeviceCTAAppList() {
        return this.deviceCTAAppList;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDownloadSaveResult() {
        return this.downloadSaveResult;
    }

    public final void subscribeAppBehavior() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20081(null), 3, null);
    }

    public final void unSubscribeAppBehavior() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C20091(null), 3, null);
    }
}
