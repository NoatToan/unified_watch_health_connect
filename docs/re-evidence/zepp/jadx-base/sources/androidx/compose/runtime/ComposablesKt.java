package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a,\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a6\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u001a@\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\n\u001aJ\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\f\u001aD\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u000f\u001aD\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\r\"\u0004\u0018\u00010\u00062\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a0\u0010\u0016\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ad\u0010\u001f\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001ad\u0010!\u001a\u00020\u0014\"\b\b\u0000\u0010\u0000*\u00020\u0006\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001dH\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010 \u001as\u0010\u001f\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001d2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\"\u001as\u0010!\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001d2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0099\u0001\u0010\u001f\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001d2$\b\b\u0010$\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001d2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010%\u001a\u0099\u0001\u0010!\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0019\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00182\u000e\b\b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u001e\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u001d2$\b\b\u0010$\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u001d2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00140\u0001¢\u0006\u0002\b\u0010H\u0087\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010%\u001a\b\u0010&\u001a\u00020\u0014H\u0001\u001a\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)\"\u0013\u0010-\u001a\u00020*8G@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0013\u00101\u001a\u00020.8G@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0013\u00105\u001a\u0002028G@\u0006¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "calculation", "remember", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "key1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "keys", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "Landroidx/compose/runtime/Composable;", TransportUri.ACTION_BLOCK, "key", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "", "content", "ReusableContent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Applier;", "E", "factory", "Lkotlin/Function1;", "Landroidx/compose/runtime/Updater;", "Lkotlin/ExtensionFunctionType;", "update", "ComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ReusableComposeNode", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/SkippableUpdater;", "skippableUpdate", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "invalidApplier", "Landroidx/compose/runtime/CompositionContext;", "rememberCompositionContext", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Composer;", "getCurrentComposer", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/Composer;", "currentComposer", "Landroidx/compose/runtime/RecomposeScope;", "getCurrentRecomposeScope", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/RecomposeScope;", "currentRecomposeScope", "", "getCurrentCompositeKeyHash", "(Landroidx/compose/runtime/Composer;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 5, 1})
public final class ComposablesKt {
    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(final Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(-2103251527);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt.ComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(final Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(1546164280);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(new Function0<T>() { // from class: androidx.compose.runtime.ComposablesKt.ReusableComposeNode.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final T invoke() {
                    return function0.invoke();
                }
            });
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        composer.enableReusing();
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void ReusableContent(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1530021272);
        composer.startReusableGroup(207, obj);
        function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReusableGroup();
        composer.endReplaceableGroup();
    }

    @JvmName(name = "getCurrentComposer")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final Composer getCurrentComposer(@Nullable Composer composer, int i) {
        throw new NotImplementedError("Implemented as an intrinsic");
    }

    @Composable
    @JvmName(name = "getCurrentCompositeKeyHash")
    public static final int getCurrentCompositeKeyHash(@Nullable Composer composer, int i) {
        return composer.getCompoundKeyHash();
    }

    @JvmName(name = "getCurrentRecomposeScope")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public static final RecomposeScope getCurrentRecomposeScope(@Nullable Composer composer, int i) {
        RecomposeScope recomposeScope = composer.getRecomposeScope();
        if (recomposeScope == null) {
            throw new IllegalStateException("no recompose scope found".toString());
        }
        composer.recordUsed(recomposeScope);
        return recomposeScope;
    }

    @PublishedApi
    public static final void invalidApplier() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    @Composable
    public static final <T> T key(@NotNull Object[] objArr, @NotNull Function2<? super Composer, ? super Integer, ? extends T> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1542330587);
        T tInvoke = function2.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @NotNull Function0<? extends T> function0, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3686930);
        boolean zChanged = composer.changed(obj);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    @NotNull
    public static final CompositionContext rememberCompositionContext(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1359198498);
        CompositionContext compositionContextBuildContext = composer.buildContext();
        composer.endReplaceableGroup();
        return compositionContextBuildContext;
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @NotNull Function0<? extends T> function0, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(-2103248778);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        function2.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        composer.startReplaceableGroup(1546167211);
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        composer.enableReusing();
        function2.invoke(composer, Integer.valueOf((i >> 6) & 14));
        composer.endNode();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final <T> T remember(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function0<? extends T> function0, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        function3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final /* synthetic */ <T, E extends Applier<?>> void ReusableComposeNode(Function0<? extends T> function0, Function1<? super Updater<T>, Unit> function1, Function3<? super SkippableUpdater<T>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        Applier<?> applier = composer.getApplier();
        Intrinsics.reifiedOperationMarker(3, "E");
        if (!(applier instanceof Applier)) {
            invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(function0);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        function1.invoke(Updater.m898boximpl(Updater.m899constructorimpl(composer)));
        composer.enableReusing();
        function3.invoke(SkippableUpdater.m890boximpl(SkippableUpdater.m891constructorimpl(composer)), composer, Integer.valueOf((i >> 3) & 112));
        composer.startReplaceableGroup(2058660585);
        function2.invoke(composer, Integer.valueOf((i >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
    }

    @Composable
    public static final <T> T remember(@NotNull Object[] objArr, @NotNull Function0<? extends T> function0, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3685570);
        int length = objArr.length;
        int i2 = 0;
        boolean zChanged = false;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            zChanged |= composer.changed(obj);
        }
        T tInvoke = (T) composer.rememberedValue();
        if (zChanged || tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }

    @Composable
    public static final <T> T remember(@NotNull Function0<? extends T> function0, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3687241);
        T tInvoke = (T) composer.rememberedValue();
        if (tInvoke == Composer.INSTANCE.getEmpty()) {
            tInvoke = function0.invoke();
            composer.updateRememberedValue(tInvoke);
        }
        composer.endReplaceableGroup();
        return tInvoke;
    }
}
