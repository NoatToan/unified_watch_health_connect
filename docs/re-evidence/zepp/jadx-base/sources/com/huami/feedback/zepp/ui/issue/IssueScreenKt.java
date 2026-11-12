package com.huami.feedback.zepp.ui.issue;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.entity.DeviceAndIssue;
import com.huami.feedback.entity.IssueItem;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.zepp.ui.FeedbackViewModel;
import com.huami.feedback.zepp.ui.R;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.ShapeKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import com.huami.lib.compose.rainbow.view.TitleBarKt;
import com.huami.tools.analytics.DbUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022&\u0010\n\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aS\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022&\u0010\n\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00152&\u0010\n\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a9\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001a\u0010 \u001a\u00020\u001e*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002\u001a\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH\u0002\u001a\u0018\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¨\u0006%"}, d2 = {"Lcom/huami/feedback/zepp/ui/FeedbackViewModel;", "viewModel", "Lkotlin/Function0;", "", com.alipay.sdk.m.x.d.n, "Lkotlin/Function4;", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "", "", "Lcom/huami/feedback/entity/IssueItem;", "onSelectIssue", "IssueRoute", "(Lcom/huami/feedback/zepp/ui/FeedbackViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/huami/feedback/entity/DeviceAndIssue;", "deviceAndIssueList", "IssueScreen", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "IssueGuideText", "(Landroidx/compose/runtime/Composer;I)V", "deviceAndIssue", "", "isExpand", "IssueExpendableCard", "(Lcom/huami/feedback/entity/DeviceAndIssue;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "title", "isTitle", "onViewClick", "IssueItemView", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "onClick", "f", GoogleApiAvailabilityLight.a, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "e", "feedback-zepp-ui_release"}, k = 2, mv = {1, 5, 1})
public final class IssueScreenKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ DeviceAndIssue a;
        public final /* synthetic */ MutableState<Boolean> b;
        public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> c;

        /* JADX INFO: renamed from: com.huami.feedback.zepp.ui.issue.IssueScreenKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class C0399a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ MutableState<Boolean> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0399a(MutableState<Boolean> mutableState) {
                super(0);
                this.a = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                MutableState<Boolean> mutableState = this.a;
                IssueScreenKt.b(mutableState, !IssueScreenKt.a(mutableState));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> a;
            public final /* synthetic */ DeviceAndIssue b;
            public final /* synthetic */ IssueItem c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, DeviceAndIssue deviceAndIssue, IssueItem issueItem) {
                super(0);
                this.a = function4;
                this.b = deviceAndIssue;
                this.c = issueItem;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(this.b.getFeedbackDevice(), IssueScreenKt.d(this.b) + '-' + this.c.getTitle(), Integer.valueOf(this.b.getIssue().getId()), this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(DeviceAndIssue deviceAndIssue, MutableState<Boolean> mutableState, Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4) {
            super(2);
            this.a = deviceAndIssue;
            this.b = mutableState;
            this.c = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            DeviceAndIssue deviceAndIssue = this.a;
            MutableState<Boolean> mutableState = this.b;
            Function4<FeedbackDevice, String, Integer, IssueItem, Unit> function4 = this.c;
            composer.startReplaceableGroup(-1113031299);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strE = IssueScreenKt.e((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), deviceAndIssue);
            boolean zA = IssueScreenKt.a(mutableState);
            composer.startReplaceableGroup(-3686930);
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new C0399a(mutableState);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            IssueScreenKt.IssueItemView(strE, true, zA, (Function0) objRememberedValue, composer, 48, 0);
            if (IssueScreenKt.a(mutableState)) {
                composer.startReplaceableGroup(-462585250);
                SpacerKt.Spacer(BackgroundKt.m111backgroundbw27NRU$default(SizeKt.m309height3ABfNKs(PaddingKt.m283paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m2965constructorimpl(16), 0.0f, 2, null), Dp.m2965constructorimpl(1)), ColorKt.getS4(), null, 2, null), composer, 0);
                for (IssueItem issueItem : deviceAndIssue.getIssue().getItems()) {
                    IssueScreenKt.IssueItemView(issueItem.getTitle(), false, false, new b(function4, deviceAndIssue, issueItem), composer, 0, 6);
                }
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-462584451);
                composer.endReplaceableGroup();
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ DeviceAndIssue a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(DeviceAndIssue deviceAndIssue, boolean z, Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, int i, int i2) {
            super(2);
            this.a = deviceAndIssue;
            this.b = z;
            this.c = function4;
            this.d = i;
            this.e = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IssueScreenKt.IssueExpendableCard(this.a, this.b, this.c, composer, this.d | 1, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(2);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IssueScreenKt.IssueGuideText(composer, this.a | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.a = str;
            this.b = z;
            this.c = z2;
            this.d = function0;
            this.e = i;
            this.f = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IssueScreenKt.IssueItemView(this.a, this.b, this.c, this.d, composer, this.e | 1, this.f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ FeedbackViewModel a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(FeedbackViewModel feedbackViewModel, Function0<Unit> function0, Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, int i) {
            super(2);
            this.a = feedbackViewModel;
            this.b = function0;
            this.c = function4;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IssueScreenKt.IssueRoute(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, int i) {
            super(2);
            this.a = function0;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i) {
            if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TitleBarKt.m3381TitleBarmoYUDCk(R.string.feedback_title_new, null, Integer.valueOf(R.drawable.ic_arrow_back_20), 0L, null, null, null, null, 0L, 0L, this.a, null, composer, 0, (this.b >> 3) & 14, 3066);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {
        public final /* synthetic */ List<DeviceAndIssue> a;
        public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(List<DeviceAndIssue> list, Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, int i) {
            super(3);
            this.a = list;
            this.b = function4;
            this.c = i;
        }

        @Composable
        public final void a(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i) {
            if (((i & 81) ^ 16) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            List<DeviceAndIssue> list = this.a;
            Function4<FeedbackDevice, String, Integer, IssueItem, Unit> function4 = this.b;
            int i2 = this.c;
            composer.startReplaceableGroup(-1113031299);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierVerticalScroll$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM899constructorimpl = Updater.m899constructorimpl(composer);
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            IssueScreenKt.IssueGuideText(composer, 0);
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                IssueScreenKt.IssueExpendableCard((DeviceAndIssue) it2.next(), list.size() == 1, function4, composer, (i2 & 896) | 8, 0);
                SpacerKt.Spacer(SizeKt.m309height3ABfNKs(Modifier.INSTANCE, Dp.m2965constructorimpl(12)), composer, 6);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            a(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ List<DeviceAndIssue> a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ Function4<FeedbackDevice, String, Integer, IssueItem, Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(List<DeviceAndIssue> list, Function0<Unit> function0, Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, int i) {
            super(2);
            this.a = list;
            this.b = function0;
            this.c = function4;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            IssueScreenKt.IssueScreen(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0<Unit> function0) {
            super(3);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(-1039265591);
            composer.startReplaceableGroup(-3687241);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier modifierM126clickableO2vRcR0 = ClickableKt.m126clickableO2vRcR0(modifier, (MutableInteractionSource) objRememberedValue, null, (8 & 4) != 0, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null, this.a);
            composer.endReplaceableGroup();
            return modifierM126clickableO2vRcR0;
        }
    }

    @Composable
    public static final void IssueExpendableCard(@NotNull DeviceAndIssue deviceAndIssue, boolean z, @NotNull Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, @Nullable Composer composer, int i2, int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273049137);
        boolean z2 = (i3 & 2) != 0 ? false : z;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SurfaceKt.m815SurfaceFjzlyU(SizeKt.fillMaxWidth$default(PaddingKt.m283paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m2965constructorimpl(10), 0.0f, 2, null), 0.0f, 1, null), ShapeKt.getShapes().getSmall(), ColorKt.getS38(), 0L, (BorderStroke) null, Dp.m2965constructorimpl(1), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893946, true, new a(deviceAndIssue, (MutableState) objRememberedValue, function4)), composerStartRestartGroup, 1769478, 24);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(deviceAndIssue, z2, function4, i2, i3));
    }

    @Composable
    public static final void IssueGuideText(@Nullable Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1745072710);
        if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.feedback_issue_guide, composerStartRestartGroup, 0), PaddingKt.m282paddingVpY3zN4(Modifier.INSTANCE, Dp.m2965constructorimpl(20), Dp.m2965constructorimpl(16)), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getTitle3(), composerStartRestartGroup, 48, 64, 32760);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(i2));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @Composable
    public static final void IssueItemView(@NotNull String str, boolean z, boolean z2, @NotNull Function0<Unit> function0, @Nullable Composer composer, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        TextStyle body3;
        int i8;
        Function0<ComposeUiNode> constructor;
        boolean z7;
        boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(8895339);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 112) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 896) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    if (composerStartRestartGroup.changed(function0)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i4 |= i7;
                }
                if (((i4 & 5851) ^ 1170) == 0 || !composerStartRestartGroup.getSkipping()) {
                    if (i9 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (z5) {
                        body3 = TextStyleKt.getTitle3();
                    } else {
                        body3 = TextStyleKt.getBody3();
                    }
                    TextStyle textStyle = body3;
                    if (!z5 && z6) {
                        i8 = R.drawable.ic_expand_less_16;
                    } else if (z5 || z6) {
                        i8 = R.drawable.ic_arrow_forward_16;
                    } else {
                        i8 = R.drawable.ic_expand_more_16;
                    }
                    int i10 = i8;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierF = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(-1989997546);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1376089335);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierF);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM899constructorimpl = Updater.m899constructorimpl(composerStartRestartGroup);
                    Updater.m906setimpl(composerM899constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m906setimpl(composerM899constructorimpl, density, companion2.getSetDensity());
                    Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-326682743);
                    TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle, composerStartRestartGroup, i4 & 14, 64, 32760);
                    IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i10, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    z7 = z5;
                    z8 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z7 = z3;
                    z8 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(str, z7, z8, function0, i2, i3));
            }
            i4 |= 384;
            z4 = z2;
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function0)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if (((i4 & 5851) ^ 1170) == 0) {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (z5) {
                    body3 = TextStyleKt.getTitle3();
                } else {
                    body3 = TextStyleKt.getBody3();
                }
                TextStyle textStyle2 = body3;
                if (!z5) {
                    if (z5) {
                        i8 = R.drawable.ic_arrow_forward_16;
                    } else {
                        i8 = R.drawable.ic_arrow_forward_16;
                    }
                } else if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
                int i11 = i8;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierF2 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion3, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(-1989997546);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                constructor = companion4.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierF2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl2, density2, companion4.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-326682743);
                TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion3, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle2, composerStartRestartGroup, i4 & 14, 64, 32760);
                IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i11, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z7 = z5;
                z8 = z6;
            } else {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (z5) {
                    body3 = TextStyleKt.getTitle3();
                } else {
                    body3 = TextStyleKt.getBody3();
                }
                TextStyle textStyle3 = body3;
                if (!z5) {
                    if (z5) {
                        i8 = R.drawable.ic_arrow_forward_16;
                    } else {
                        i8 = R.drawable.ic_arrow_forward_16;
                    }
                } else if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
                int i12 = i8;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierF3 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion5, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
                Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(-1989997546);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween3, centerVertically3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierF3);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl3 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl3, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl3, density3, companion6.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl3, layoutDirection3, companion6.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-326682743);
                TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion5, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle3, composerStartRestartGroup, i4 & 14, 64, 32760);
                IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i12, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(str, z7, z8, function0, i2, i3));
        }
        i4 |= 48;
        z3 = z;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 896) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            if ((i3 & 8) != 0) {
                i4 |= 3072;
            } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                if (composerStartRestartGroup.changed(function0)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if (((i4 & 5851) ^ 1170) == 0) {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (z5) {
                    body3 = TextStyleKt.getTitle3();
                } else {
                    body3 = TextStyleKt.getBody3();
                }
                TextStyle textStyle4 = body3;
                if (!z5) {
                    if (z5) {
                        i8 = R.drawable.ic_arrow_forward_16;
                    } else {
                        i8 = R.drawable.ic_arrow_forward_16;
                    }
                } else if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
                int i13 = i8;
                Modifier.Companion companion7 = Modifier.INSTANCE;
                Modifier modifierF4 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion7, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
                Arrangement.HorizontalOrVertical spaceBetween4 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(-1989997546);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween4, centerVertically4, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierF4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl4 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl4, measurePolicyRowMeasurePolicy4, companion8.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl4, density4, companion8.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl4, layoutDirection4, companion8.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-326682743);
                TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion7, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle4, composerStartRestartGroup, i4 & 14, 64, 32760);
                IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i13, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z7 = z5;
                z8 = z6;
            } else {
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (z5) {
                    body3 = TextStyleKt.getTitle3();
                } else {
                    body3 = TextStyleKt.getBody3();
                }
                TextStyle textStyle5 = body3;
                if (!z5) {
                    if (z5) {
                        i8 = R.drawable.ic_arrow_forward_16;
                    } else {
                        i8 = R.drawable.ic_arrow_forward_16;
                    }
                } else if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
                int i14 = i8;
                Modifier.Companion companion9 = Modifier.INSTANCE;
                Modifier modifierF5 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion9, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
                Arrangement.HorizontalOrVertical spaceBetween5 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(-1989997546);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(spaceBetween5, centerVertically5, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1376089335);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierF5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM899constructorimpl5 = Updater.m899constructorimpl(composerStartRestartGroup);
                Updater.m906setimpl(composerM899constructorimpl5, measurePolicyRowMeasurePolicy5, companion10.getSetMeasurePolicy());
                Updater.m906setimpl(composerM899constructorimpl5, density5, companion10.getSetDensity());
                Updater.m906setimpl(composerM899constructorimpl5, layoutDirection5, companion10.getSetLayoutDirection());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-326682743);
                TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion9, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle5, composerStartRestartGroup, i4 & 14, 64, 32760);
                IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i14, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(str, z7, z8, function0, i2, i3));
        }
        i4 |= 384;
        z4 = z2;
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
            if (composerStartRestartGroup.changed(function0)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        if (((i4 & 5851) ^ 1170) == 0) {
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (z5) {
                body3 = TextStyleKt.getTitle3();
            } else {
                body3 = TextStyleKt.getBody3();
            }
            TextStyle textStyle6 = body3;
            if (!z5) {
                if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
            } else if (z5) {
                i8 = R.drawable.ic_arrow_forward_16;
            } else {
                i8 = R.drawable.ic_arrow_forward_16;
            }
            int i15 = i8;
            Modifier.Companion companion11 = Modifier.INSTANCE;
            Modifier modifierF6 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion11, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
            Arrangement.HorizontalOrVertical spaceBetween6 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(spaceBetween6, centerVertically6, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
            constructor = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierF6);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl6 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl6, measurePolicyRowMeasurePolicy6, companion12.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl6, density6, companion12.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl6, layoutDirection6, companion12.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf6.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion11, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle6, composerStartRestartGroup, i4 & 14, 64, 32760);
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i15, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            z7 = z5;
            z8 = z6;
        } else {
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (z5) {
                body3 = TextStyleKt.getTitle3();
            } else {
                body3 = TextStyleKt.getBody3();
            }
            TextStyle textStyle7 = body3;
            if (!z5) {
                if (z5) {
                    i8 = R.drawable.ic_arrow_forward_16;
                } else {
                    i8 = R.drawable.ic_arrow_forward_16;
                }
            } else if (z5) {
                i8 = R.drawable.ic_arrow_forward_16;
            } else {
                i8 = R.drawable.ic_arrow_forward_16;
            }
            int i16 = i8;
            Modifier.Companion companion13 = Modifier.INSTANCE;
            Modifier modifierF7 = f(SizeKt.fillMaxWidth$default(PaddingKt.m282paddingVpY3zN4(companion13, Dp.m2965constructorimpl(16), Dp.m2965constructorimpl(20)), 0.0f, 1, null), function0);
            Arrangement.HorizontalOrVertical spaceBetween7 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically7 = Alignment.INSTANCE.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(spaceBetween7, centerVertically7, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1376089335);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierF7);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM899constructorimpl7 = Updater.m899constructorimpl(composerStartRestartGroup);
            Updater.m906setimpl(composerM899constructorimpl7, measurePolicyRowMeasurePolicy7, companion14.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl7, density7, companion14.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl7, layoutDirection7, companion14.getSetLayoutDirection());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf7.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-326682743);
            TextKt.m869TextfLXpl1I(str, RowScopeInstance.INSTANCE.weight(companion13, 1.0f, false), ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, textStyle7, composerStartRestartGroup, i4 & 14, 64, 32760);
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(i16, composerStartRestartGroup, 0), "箭头图标", (Modifier) null, ColorKt.getS2(), composerStartRestartGroup, 56, 4);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            z7 = z5;
            z8 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(str, z7, z8, function0, i2, i3));
    }

    @Composable
    public static final void IssueRoute(@NotNull FeedbackViewModel feedbackViewModel, @NotNull Function0<Unit> function0, @NotNull Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, @Nullable Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-690205590);
        IssueScreen(c(SnapshotStateKt.collectAsState(feedbackViewModel.getDeviceAndIssueStateFlow(), null, composerStartRestartGroup, 8, 1)), function0, function4, composerStartRestartGroup, (i2 & 112) | 8 | (i2 & 896));
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(feedbackViewModel, function0, function4, i2));
    }

    @Composable
    public static final void IssueScreen(@NotNull List<DeviceAndIssue> list, @NotNull Function0<Unit> function0, @NotNull Function4<? super FeedbackDevice, ? super String, ? super Integer, ? super IssueItem, Unit> function4, @Nullable Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(619137965);
        ScaffoldKt.m789Scaffold27mzLpw(null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893007, true, new f(function0, i2)), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819892812, true, new g(list, function4, i2)), composerStartRestartGroup, 2097536, 12582912, 131067);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(list, function0, function4, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<DeviceAndIssue> c(State<? extends List<DeviceAndIssue>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(DeviceAndIssue deviceAndIssue) {
        FeedbackDevice feedbackDevice = deviceAndIssue.getFeedbackDevice();
        String descriptionName = feedbackDevice == null ? null : feedbackDevice.getDescriptionName();
        return descriptionName == null ? deviceAndIssue.getIssue().getType() : descriptionName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(Context context, DeviceAndIssue deviceAndIssue) {
        if (deviceAndIssue.getFeedbackDevice() == null || !deviceAndIssue.isConnected()) {
            return deviceAndIssue.getFeedbackDevice() != null ? Intrinsics.stringPlus(deviceAndIssue.getFeedbackDevice().getDescriptionName(), context.getString(R.string.feedback_un_connect_tip)) : deviceAndIssue.getIssue().getType();
        }
        return deviceAndIssue.getFeedbackDevice().getDescriptionName();
    }

    private static final Modifier f(Modifier modifier, Function0<Unit> function0) {
        return ComposedModifierKt.composed$default(modifier, null, new i(function0), 1, null);
    }
}
