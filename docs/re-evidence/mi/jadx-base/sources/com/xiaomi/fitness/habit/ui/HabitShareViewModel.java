package com.xiaomi.fitness.habit.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.habit.model.HabitModel;
import defpackage.hfb;
import defpackage.im9;
import defpackage.kfi;
import defpackage.kq2;
import defpackage.nni;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/HabitShareViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/habit/model/HabitModel;", "<init>", "()V", "createQRBitmap", "", "resources", "Landroid/content/res/Resources;", "success", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitShareViewModel extends BaseViewModel<HabitModel> {

    /* JADX INFO: renamed from: com.xiaomi.fitness.habit.ui.HabitShareViewModel$createQRBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.habit.ui.HabitShareViewModel$createQRBitmap$1", f = "HabitShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filePathName;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ Function1<Bitmap, Unit> $success;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.habit.ui.HabitShareViewModel$createQRBitmap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.habit.ui.HabitShareViewModel$createQRBitmap$1$1", f = "HabitShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $qrCodeBitmap;
            final /* synthetic */ Function1<Bitmap, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C05761(Function1<? super Bitmap, Unit> function1, Bitmap bitmap, Continuation<? super C05761> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$qrCodeBitmap = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05761(this.$success, this.$qrCodeBitmap, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<Bitmap, Unit> function1 = this.$success;
                Bitmap bitmap = this.$qrCodeBitmap;
                Intrinsics.checkNotNull(bitmap);
                function1.invoke(bitmap);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Resources resources, String str, Function1<? super Bitmap, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$resources = resources;
            this.$filePathName = str;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$resources, this.$filePathName, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapC = kfi.c("https://hlth.io.mi.com/download?redir=mifitness", DisplayUtil.dip2px(80.0f), -16777216, BitmapFactory.decodeResource(this.$resources, nni.o));
            kq2.c(bitmapC, this.$filePathName);
            AnyExtKt.main$default(null, new C05761(this.$success, bitmapC, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void createQRBitmap(@NotNull Resources resources, @NotNull Function1<? super Bitmap, Unit> success) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(success, "success");
        String str = im9.K() + File.separator + "qrLogoNew.jpg";
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            hfb.a(" Get QR_Logo bitmap from file failed need download!");
            AnyExtKt.io$default(null, new AnonymousClass1(resources, str, success, null), 1, null);
        } else {
            hfb.a("Get QR_Logo bitmap from file exist!");
            success.invoke(bitmapDecodeFile);
        }
    }
}
