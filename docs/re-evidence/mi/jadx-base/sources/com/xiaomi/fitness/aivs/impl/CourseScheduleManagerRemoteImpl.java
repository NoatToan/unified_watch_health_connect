package com.xiaomi.fitness.aivs.impl;

import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.fw4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/aivs/impl/CourseScheduleManagerRemoteImpl;", "Lfw4$a;", "", "initEngine", "()V", "<init>", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CourseScheduleManagerRemoteImpl extends fw4.a {
    public static final int KEY_COURSE_SCHEDULE_BINDER = 20;

    /* JADX INFO: renamed from: com.xiaomi.fitness.aivs.impl.CourseScheduleManagerRemoteImpl$initEngine$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.aivs.impl.CourseScheduleManagerRemoteImpl$initEngine$1", f = "CourseScheduleManagerRemoteImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCourseScheduleManagerRemoteImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CourseScheduleManagerRemoteImpl.kt\ncom/xiaomi/fitness/aivs/impl/CourseScheduleManagerRemoteImpl$initEngine$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String did = wearableDeviceModel != null ? wearableDeviceModel.getDid() : null;
            BaseAivsService aivsService = did != null ? BaseAivsService.INSTANCE.getAivsService(did, 101) : null;
            if (aivsService != null) {
                BaseAivsService.initEngine$default(aivsService, null, 1, null);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // defpackage.fw4
    public void initEngine() {
        AnyExtKt.main$default(null, new AnonymousClass1(null), 1, null);
    }
}
