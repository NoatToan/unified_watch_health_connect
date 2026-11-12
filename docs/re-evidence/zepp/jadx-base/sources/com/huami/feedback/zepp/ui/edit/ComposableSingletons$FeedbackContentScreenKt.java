package com.huami.feedback.zepp.ui.edit;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.huami.feedback.zepp.ui.R;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.ShapeKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public final class ComposableSingletons$FeedbackContentScreenKt {

    @NotNull
    public static final ComposableSingletons$FeedbackContentScreenKt INSTANCE = new ComposableSingletons$FeedbackContentScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f21lambda1 = ComposableLambdaKt.composableLambdaInstance(-985535427, false, a.a);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f22lambda2 = ComposableLambdaKt.composableLambdaInstance(-985539687, false, b.a);

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f23lambda3 = ComposableLambdaKt.composableLambdaInstance(-985546113, false, c.a);

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f24lambda4 = ComposableLambdaKt.composableLambdaInstance(-985544896, false, d.a);

    /* JADX INFO: renamed from: lambda-5, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f25lambda5 = ComposableLambdaKt.composableLambdaInstance(-985543601, false, e.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
        public static final a a = new a();

        public a() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i) {
            if (((i & 81) ^ 16) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.feedback_submit, composer, 0), null, ColorKt.getS5(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody3(), composer, 0, 64, 32762);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u000b"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public static final b a = new b();

        public b() {
            super(2);
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
            TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.feedback_issue_user_desc_guide, composer, 0), null, ColorKt.getS3(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composer, 0, 64, 32762);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u000b"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public static final c a = new c();

        public c() {
            super(2);
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
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.feedback_ic_close, composer, 0), "取消按钮的图标", PaddingKt.m281padding3ABfNKs(BackgroundKt.m110backgroundbw27NRU(SizeKt.m322size3ABfNKs(Modifier.INSTANCE, Dp.m2965constructorimpl(22)), ColorKt.getS2(), RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(Dp.m2965constructorimpl(11))), Dp.m2965constructorimpl(4)), ColorKt.getS5(), composer, 56, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u000b"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public static final d a = new d();

        public d() {
            super(2);
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
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.feedback_ic_add, composer, 0), "添加图片", PaddingKt.m281padding3ABfNKs(BackgroundKt.m110backgroundbw27NRU(PaddingKt.m285paddingqDBjuR0$default(SizeKt.m322size3ABfNKs(Modifier.INSTANCE, Dp.m2965constructorimpl(64)), 0.0f, Dp.m2965constructorimpl(4), 0.0f, 0.0f, 13, null), ColorKt.getS10(), ShapeKt.getShapes().getMedium()), Dp.m2965constructorimpl(22)), ColorKt.getP3(), composer, 56, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u000b"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public static final e a = new e();

        public e() {
            super(2);
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
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_expand_more_20, composer, 0), "箭头图标", PaddingKt.m281padding3ABfNKs(Modifier.INSTANCE, Dp.m2965constructorimpl(13)), ColorKt.getS2(), composer, 440, 0);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$feedback_zepp_ui_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m3333getLambda1$feedback_zepp_ui_release() {
        return f21lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$feedback_zepp_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3334getLambda2$feedback_zepp_ui_release() {
        return f22lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$feedback_zepp_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3335getLambda3$feedback_zepp_ui_release() {
        return f23lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$feedback_zepp_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3336getLambda4$feedback_zepp_ui_release() {
        return f24lambda4;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-5$feedback_zepp_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m3337getLambda5$feedback_zepp_ui_release() {
        return f25lambda5;
    }
}
