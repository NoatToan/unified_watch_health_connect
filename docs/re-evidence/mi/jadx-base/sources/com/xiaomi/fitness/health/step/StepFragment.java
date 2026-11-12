package com.xiaomi.fitness.health.step;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.base.BaseDetailParentFragment;
import com.xiaomi.fitness.base.WrapperDayWeekMonthChildFragment;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.step.StepFragment;
import com.xiaomi.fitness.motion.recognition.MotionRecognizer;
import com.xiaomi.fitness.motion.recognition.extensions.RecognizerExtKt;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.view.TitleBarAlphaView;
import defpackage.a4i;
import defpackage.eri;
import defpackage.jui;
import defpackage.nwi;
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
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0006H\u0014J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/step/StepFragment;", "Lcom/xiaomi/fitness/base/BaseDetailParentFragment;", "Lcom/xiaomi/fitness/base/WrapperDayWeekMonthChildFragment;", "<init>", "()V", "defaultSportType", "", "getDefaultSportType", "()I", "getClassChild", "Ljava/lang/Class;", "position", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getClassChildName", "", "contentResourceId", "getContentResourceId", "supportRecognize", "", "getSupportRecognize", "()Z", "initContentView", "contentView", "Landroid/view/View;", "onImgShareClick", "view", "showPopupMenu", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepFragment extends BaseDetailParentFragment<WrapperDayWeekMonthChildFragment> {

    @NotNull
    public static final String TAG = "StepFragment";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.step.StepFragment$onCreate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.step.StepFragment$onCreate$1", f = "StepFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            Logger.i(StepFragment.TAG, "syncWithServer");
            FitnessServerSyncer.DefaultImpls.syncWithServer$default(FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE), false, "miui_function_step", null, 4, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final boolean getSupportRecognize() {
        return RecognizerExtKt.getInstance(MotionRecognizer.INSTANCE).isSupport();
    }

    private final void showPopupMenu(View view) {
        if (getSupportRecognize()) {
            a4i a4iVar = new a4i(requireContext(), view);
            a4iVar.f(nwi.g);
            a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: feo
                @Override // a4i.c
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return StepFragment.showPopupMenu$lambda$0(this.f17713a, menuItem);
                }
            });
            a4iVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showPopupMenu$lambda$0(StepFragment this$0, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != eri.R5) {
            return true;
        }
        LaunchExtensionKt.startActivity$default(this$0, RecognizeSettingActivity.class, (Function1) null, 2, (Object) null);
        return true;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public Class<?> getClassChild(int position) {
        if (position != 1) {
            return position != 2 ? StepDayFragment.class : StepMonthFragment.class;
        }
        return StepWeekFragment.class;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    @NotNull
    public String getClassChildName(int position) {
        if (position != 1) {
            return position != 2 ? "StepDayFragment" : "StepMonthFragment";
        }
        return "StepWeekFragment";
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getContentResourceId() {
        return jui.f23149r;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public int getDefaultSportType() {
        return 3;
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment
    public void initContentView(@NotNull View contentView) {
        ImageView imgShare;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        super.initContentView(contentView);
        TitleBarAlphaView titleBarAlphaView = getTitleBarAlphaView();
        if (titleBarAlphaView == null || (imgShare = titleBarAlphaView.getImgShare()) == null) {
            return;
        }
        imgShare.setVisibility(getSupportRecognize() ? 0 : 8);
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("origin") : null;
        Logger.i(TAG, "origin is " + string);
        if (Intrinsics.areEqual(string, HealthUtil.ORIGIN_HOME_CARD) || Intrinsics.areEqual(string, HealthUtil.ORIGIN_SHOW_ALL_DATA)) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }

    @Override // com.xiaomi.fitness.base.BaseDetailParentFragment, defpackage.eah
    public void onImgShareClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        showPopupMenu(view);
    }
}
