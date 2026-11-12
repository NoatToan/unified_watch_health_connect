package com.huami.feedback.zepp.ui.image;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.GridCells;
import androidx.compose.foundation.lazy.LazyGridKt;
import androidx.compose.foundation.lazy.LazyGridScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import com.google.android.exoplayer2.C;
import com.huami.feedback.zepp.ui.ImageLoaderKt;
import com.huami.feedback.zepp.ui.R;
import com.huami.lib.compose.rainbow.ColorKt;
import com.huami.lib.compose.rainbow.ShapeKt;
import com.huami.lib.compose.rainbow.TextStyleKt;
import com.loc.z;
import defpackage.jk7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0003¢\u0006\u0004\b\n\u0010\b\u001a-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0017\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016\"\u0016\u0010\u0019\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"", "selectCount", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "", "onImageSelect", "ImageScreen", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "userSelectCount", z.j, "uri", "", "enable", "Lkotlin/Function0;", "a", "(Landroid/net/Uri;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/ContentResolver;", "contentResolver", "Lcom/huami/feedback/zepp/ui/image/MediaStoreImage;", "m", "(Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", LogUtil.I, "ITEMS_ONE_ROW", "b", "MAX_SELECT_COUNT", "feedback-zepp-ui_release"}, k = 2, mv = {1, 5, 1})
public final class ImagesScreenKt {
    private static final int a = 3;
    private static final int b = 4;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.image.ImagesScreenKt$ImageItem$1", f = "ImagesScreen.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ContentResolver b;
        public final /* synthetic */ Uri c;
        public final /* synthetic */ int d;
        public final /* synthetic */ MutableState<Bitmap> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ContentResolver contentResolver, Uri uri, int i, MutableState<Bitmap> mutableState, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = contentResolver;
            this.c = uri;
            this.d = i;
            this.e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ContentResolver contentResolver = this.b;
                Uri uri = this.c;
                Integer numBoxInt = Boxing.boxInt(this.d);
                this.a = 1;
                obj = ImageLoaderKt.loadImage(contentResolver, uri, numBoxInt, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                ImagesScreenKt.c(this.e, bitmap);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function0<Unit> b;
        public final /* synthetic */ MutableState<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, Function0<Unit> function0, MutableState<Boolean> mutableState) {
            super(0);
            this.a = z;
            this.b = function0;
            this.c = mutableState;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a || ImagesScreenKt.d(this.c)) {
                MutableState<Boolean> mutableState = this.c;
                ImagesScreenKt.e(mutableState, !ImagesScreenKt.d(mutableState));
                this.b.getA();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Uri a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.a = uri;
            this.b = z;
            this.c = function0;
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ImagesScreenKt.a(this.a, this.b, this.c, composer, this.d | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SystemUiController a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SystemUiController systemUiController) {
            super(0);
            this.a = systemUiController;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            jk7.h(this.a, ColorKt.getS40(), true, false, null, 12, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ MutableState<List<Uri>> a;
        public final /* synthetic */ MutableState<Integer> b;
        public final /* synthetic */ Function1<List<? extends Uri>, Unit> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<List<? extends Uri>, Unit> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super List<? extends Uri>, Unit> function1) {
                super(0);
                this.a = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(CollectionsKt__CollectionsKt.emptyList());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Function1<List<? extends Uri>, Unit> a;
            public final /* synthetic */ MutableState<List<Uri>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Function1<? super List<? extends Uri>, Unit> function1, MutableState<List<Uri>> mutableState) {
                super(0);
                this.a = function1;
                this.b = mutableState;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.invoke(ImagesScreenKt.f(this.b));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
            public final /* synthetic */ int a;
            public final /* synthetic */ MutableState<List<Uri>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i, MutableState<List<Uri>> mutableState) {
                super(3);
                this.a = i;
                this.b = mutableState;
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
                } else {
                    TextKt.m869TextfLXpl1I(StringResources_androidKt.stringResource(R.string.feedback_btn_image_select, new Object[]{Integer.valueOf(ImagesScreenKt.f(this.b).size()), Integer.valueOf(4 - this.a)}, composer, 64), null, ColorKt.getS5(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TextStyleKt.getBody4(), composer, 0, 64, 32762);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<Uri, Unit> {
            public final /* synthetic */ MutableState<List<Uri>> a;
            public final /* synthetic */ MutableState<Integer> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(MutableState<List<Uri>> mutableState, MutableState<Integer> mutableState2) {
                super(1);
                this.a = mutableState;
                this.b = mutableState2;
            }

            public final void a(@NotNull Uri uri) {
                List listPlus;
                MutableState<List<Uri>> mutableState = this.a;
                if (ImagesScreenKt.f(mutableState).contains(uri)) {
                    ImagesScreenKt.i(this.b, ImagesScreenKt.h(this.b) - 1);
                    listPlus = CollectionsKt___CollectionsKt.minus(ImagesScreenKt.f(this.a), uri);
                } else {
                    ImagesScreenKt.i(this.b, ImagesScreenKt.h(this.b) + 1);
                    listPlus = CollectionsKt___CollectionsKt.plus((Collection<? extends Uri>) ImagesScreenKt.f(this.a), uri);
                }
                ImagesScreenKt.g(mutableState, listPlus);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                a(uri);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(MutableState<List<Uri>> mutableState, MutableState<Integer> mutableState2, Function1<? super List<? extends Uri>, Unit> function1, int i, int i2) {
            super(2);
            this.a = mutableState;
            this.b = mutableState2;
            this.c = function1;
            this.d = i;
            this.e = i2;
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
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MutableState<List<Uri>> mutableState = this.a;
            MutableState<Integer> mutableState2 = this.b;
            Function1<List<? extends Uri>, Unit> function1 = this.c;
            int i2 = this.e;
            composer.startReplaceableGroup(-1113031299);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxSize$default);
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
            Updater.m906setimpl(composerM899constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(276693241);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM283paddingVpY3zN4$default = PaddingKt.m283paddingVpY3zN4$default(SizeKt.m309height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m2965constructorimpl(50)), Dp.m2965constructorimpl(13), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composer.startReplaceableGroup(-1989997546);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 0);
            composer.startReplaceableGroup(1376089335);
            Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM283paddingVpY3zN4$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM899constructorimpl2 = Updater.m899constructorimpl(composer);
            Updater.m906setimpl(composerM899constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m906setimpl(composerM899constructorimpl2, density2, companion3.getSetDensity());
            Updater.m906setimpl(composerM899constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            composer.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-326682743);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-3686930);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a(function1);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            float f = 10;
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m283paddingVpY3zN4$default(companion, Dp.m2965constructorimpl(f), 0.0f, 2, null), false, null, null, ShapeKt.getShapes().getSmall(), null, ButtonDefaults.INSTANCE.m601buttonColorsro_MJ88(ColorKt.getS4(), 0L, 0L, 0L, composer, 32768, 14), null, ComposableSingletons$ImagesScreenKt.INSTANCE.m3348getLambda1$feedback_zepp_ui_release(), composer, 48, 348);
            composer.startReplaceableGroup(-3686552);
            boolean zChanged2 = composer.changed(function1) | composer.changed(mutableState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new b(function1, mutableState);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            ButtonKt.Button((Function0) objRememberedValue2, BackgroundKt.m110backgroundbw27NRU(PaddingKt.m283paddingVpY3zN4$default(companion, Dp.m2965constructorimpl(f), 0.0f, 2, null), ColorKt.getP3(), ShapeKt.getShapes().getSmall()), false, null, null, null, null, null, null, ComposableLambdaKt.composableLambda(composer, -819890614, true, new c(i2, mutableState)), composer, C.ENCODING_PCM_32BIT, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            int iH = ImagesScreenKt.h(mutableState2);
            composer.startReplaceableGroup(-3686552);
            boolean zChanged3 = composer.changed(mutableState) | composer.changed(mutableState2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new d(mutableState, mutableState2);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            ImagesScreenKt.j(iH, (Function1) objRememberedValue3, composer, 0);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Function1<List<? extends Uri>, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i, Function1<? super List<? extends Uri>, Unit> function1, int i2) {
            super(2);
            this.a = i;
            this.b = function1;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ImagesScreenKt.ImageScreen(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.image.ImagesScreenKt$ImagesView$1", f = "ImagesScreen.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ContentResolver c;
        public final /* synthetic */ MutableState<List<MediaStoreImage>> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ContentResolver contentResolver, MutableState<List<MediaStoreImage>> mutableState, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = contentResolver;
            this.d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableState<List<MediaStoreImage>> mutableState;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableState<List<MediaStoreImage>> mutableState2 = this.d;
                ContentResolver contentResolver = this.c;
                this.a = mutableState2;
                this.b = 1;
                Object objM = ImagesScreenKt.m(contentResolver, this);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                obj = objM;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableState = (MutableState) this.a;
                ResultKt.throwOnFailure(obj);
            }
            ImagesScreenKt.l(mutableState, (List) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int a;
        public final /* synthetic */ Function1<Uri, Unit> b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(int i, Function1<? super Uri, Unit> function1, int i2) {
            super(2);
            this.a = i;
            this.b = function1;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ImagesScreenKt.j(this.a, this.b, composer, this.c | 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/feedback/zepp/ui/image/MediaStoreImage;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.image.ImagesScreenKt$loadImages$2", f = "ImagesScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<MediaStoreImage>>, Object> {
        public int a;
        public final /* synthetic */ ContentResolver b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ContentResolver contentResolver, Continuation<? super i> continuation) {
            super(2, continuation);
            this.b = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<MediaStoreImage>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = this.b.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "date_added"}, null, null, "date_added DESC");
            if (cursorQuery != null) {
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("date_added");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("_display_name");
                    while (cursorQuery.moveToNext()) {
                        long j = cursorQuery.getLong(columnIndexOrThrow);
                        arrayList.add(new MediaStoreImage(j, cursorQuery.getString(columnIndexOrThrow3), new Date(TimeUnit.SECONDS.toMillis(cursorQuery.getLong(columnIndexOrThrow2))), ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j)));
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            return arrayList;
        }
    }

    @Composable
    public static final void ImageScreen(int i2, @NotNull Function1<? super List<? extends Uri>, Unit> function1, @Nullable Composer composer, int i3) {
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268352876);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        int i5 = i4;
        if (((i5 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            SystemUiController systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-3686930);
            boolean zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new d(systemUiControllerRememberSystemUiController);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
            long s40 = ColorKt.getS40();
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819893566, true, new e(mutableState, mutableState2, function1, i5, i2));
            composer2 = composerStartRestartGroup;
            SurfaceKt.m815SurfaceFjzlyU((Modifier) null, (Shape) null, s40, 0L, (BorderStroke) null, 0.0f, composableLambda, composer2, 1572864, 59);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(i2, function1, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void a(Uri uri, boolean z, Function0<Unit> function0, Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2077093269);
        int i3 = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp / 3;
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        EffectsKt.LaunchedEffect("loadImage", new a(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getContentResolver(), uri, i3, mutableState, null), composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState2 = (MutableState) objRememberedValue2;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM322size3ABfNKs = SizeKt.m322size3ABfNKs(companion2, Dp.m2965constructorimpl(i3));
        Boolean boolValueOf = Boolean.valueOf(z);
        composerStartRestartGroup.startReplaceableGroup(-3686095);
        boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(function0);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new b(z, function0, mutableState2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM129clickableXHw0xAI$default = ClickableKt.m129clickableXHw0xAI$default(modifierM322size3ABfNKs, false, null, null, (Function0) objRememberedValue3, 7, null);
        Alignment topEnd = Alignment.INSTANCE.getTopEnd();
        composerStartRestartGroup.startReplaceableGroup(-1990474327);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(1376089335);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM129clickableXHw0xAI$default);
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
        Updater.m906setimpl(composerM899constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m906setimpl(composerM899constructorimpl, density, companion3.getSetDensity());
        Updater.m906setimpl(composerM899constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        composerStartRestartGroup.startReplaceableGroup(-1253629305);
        ImageKt.Image(AndroidImageBitmap_androidKt.asImageBitmap(b(mutableState)), "图片选择Item", BoxScopeInstance.INSTANCE.matchParentSize(companion2), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 104);
        if (d(mutableState2)) {
            composerStartRestartGroup.startReplaceableGroup(-842351351);
            float f2 = 6;
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.feedback_ic_all_done_12, composerStartRestartGroup, 0), "选中图标", PaddingKt.m281padding3ABfNKs(BackgroundKt.m110backgroundbw27NRU(SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(companion2, Dp.m2965constructorimpl(f2)), Dp.m2965constructorimpl(24)), ColorKt.getS20(), RoundedCornerShapeKt.m400RoundedCornerShape0680j_4(Dp.m2965constructorimpl(12))), Dp.m2965constructorimpl(f2)), ColorKt.getS5(), composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-842350943);
            IconKt.m717Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.feedback_ic_image_un_select, composerStartRestartGroup, 0), "未选中图标", SizeKt.m322size3ABfNKs(PaddingKt.m281padding3ABfNKs(companion2, Dp.m2965constructorimpl(6)), Dp.m2965constructorimpl(24)), ColorKt.getS5(), composerStartRestartGroup, 440, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(uri, z, function0, i2));
    }

    private static final Bitmap b(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MutableState<Bitmap> mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Uri> f(MutableState<List<Uri>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(MutableState<List<Uri>> mutableState, List<? extends Uri> list) {
        mutableState.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(MutableState<Integer> mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void j(final int i2, final Function1<? super Uri, Unit> function1, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1140044432);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(function1) ? 32 : 16;
        }
        if (((i4 & 91) ^ 18) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(CollectionsKt__CollectionsKt.emptyList(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final MutableState mutableState = (MutableState) objRememberedValue;
            EffectsKt.LaunchedEffect("加载所以图片", new g(((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getContentResolver(), mutableState, null), composerStartRestartGroup, 6);
            GridCells.Fixed fixed = new GridCells.Fixed(3);
            Integer numValueOf = Integer.valueOf(i2);
            composerStartRestartGroup.startReplaceableGroup(-3686095);
            boolean zChanged = composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(function1);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1<LazyGridScope, Unit>() { // from class: com.huami.feedback.zepp.ui.image.ImagesScreenKt$ImagesView$2$1

                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<Unit> {
                        public final /* synthetic */ Function1<Uri, Unit> a;
                        public final /* synthetic */ MediaStoreImage b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(Function1<? super Uri, Unit> function1, MediaStoreImage mediaStoreImage) {
                            super(0);
                            this.a = function1;
                            this.b = mediaStoreImage;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Unit getA() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            this.a.invoke(this.b.getContentUri());
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void a(@NotNull LazyGridScope lazyGridScope) {
                        final List listK = ImagesScreenKt.k(mutableState);
                        final int i5 = i2;
                        final Function1<Uri, Unit> function2 = function1;
                        lazyGridScope.items(listK.size(), ComposableLambdaKt.composableLambdaInstance(-985537774, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.huami.feedback.zepp.ui.image.ImagesScreenKt$ImagesView$2$1$invoke$$inlined$items$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer2, Integer num2) {
                                invoke(lazyItemScope, num.intValue(), composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i6, @Nullable Composer composer2, int i7) {
                                int i8;
                                if ((i7 & 14) == 0) {
                                    i8 = (composer2.changed(lazyItemScope) ? 4 : 2) | i7;
                                } else {
                                    i8 = i7;
                                }
                                if ((i7 & 112) == 0) {
                                    i8 |= composer2.changed(i6) ? 32 : 16;
                                }
                                if (((i8 & 731) ^ 146) == 0 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                } else {
                                    MediaStoreImage mediaStoreImage = (MediaStoreImage) listK.get(i6);
                                    ImagesScreenKt.a(mediaStoreImage.getContentUri(), i5 != 4, new ImagesScreenKt$ImagesView$2$1.a(function2, mediaStoreImage), composer2, 8);
                                }
                            }
                        }));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                        a(lazyGridScope);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            LazyGridKt.LazyVerticalGrid(fixed, null, null, null, (Function1) objRememberedValue2, composerStartRestartGroup, GridCells.Fixed.$stable, 14);
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(i2, function1, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<MediaStoreImage> k(MutableState<List<MediaStoreImage>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(MutableState<List<MediaStoreImage>> mutableState, List<MediaStoreImage> list) {
        mutableState.setValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m(ContentResolver contentResolver, Continuation<? super List<MediaStoreImage>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new i(contentResolver, null), continuation);
    }
}
