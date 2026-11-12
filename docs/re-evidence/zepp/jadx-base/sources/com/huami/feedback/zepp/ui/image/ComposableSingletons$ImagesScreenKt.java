package com.huami.feedback.zepp.ui.image;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.huami.feedback.zepp.ui.R;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public final class ComposableSingletons$ImagesScreenKt {

    @NotNull
    public static final ComposableSingletons$ImagesScreenKt INSTANCE = new ComposableSingletons$ImagesScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<RowScope, Composer, Integer, Unit> f26lambda1 = ComposableLambdaKt.composableLambdaInstance(-985530813, false, a.a);

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
            TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.cancel, composer, 0), null, ColorKt.getS1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composer, 0, 64, 32762);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$feedback_zepp_ui_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m3348getLambda1$feedback_zepp_ui_release() {
        return f26lambda1;
    }
}
