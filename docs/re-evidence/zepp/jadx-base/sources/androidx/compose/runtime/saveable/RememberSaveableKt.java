package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.huami.watch.util.AppUtil;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001ac\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001ai\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00012\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0002\"\u0004\u0018\u00010\u00002\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\bH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a>\u0010\u0010\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r0\u0004\"\u0004\b\u0000\u0010\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00020\u00000\u0004H\u0002\u001a\u0016\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0002¨\u0006\u0015"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "inputs", "Landroidx/compose/runtime/saveable/Saver;", "saver", "", "key", "Lkotlin/Function0;", PointCategory.INIT, "rememberSaveable", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "Landroidx/compose/runtime/MutableState;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", AppUtil.DEFAULT_CHANNEL, "mutableStateSaver", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "", "requireCanBeSaved", "runtime-saveable_release"}, k = 2, mv = {1, 5, 1})
public final class RememberSaveableKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        return SaverKt.Saver(new Function2<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final MutableState<Object> invoke(@NotNull SaverScope saverScope, @NotNull MutableState<T> mutableState) {
                if (mutableState instanceof SnapshotMutableState) {
                    return SnapshotStateKt.mutableStateOf(saver.save(saverScope, mutableState.getValue()), ((SnapshotMutableState) mutableState).getPolicy());
                }
                throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()".toString());
            }
        }, new Function1<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final MutableState<T> invoke(@NotNull MutableState<Object> mutableState) {
                if (mutableState instanceof SnapshotMutableState) {
                    return SnapshotStateKt.mutableStateOf(mutableState.getValue() != null ? saver.restore(mutableState.getValue()) : null, ((SnapshotMutableState) mutableState).getPolicy());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        });
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m912rememberSaveable(@NotNull Object[] objArr, @Nullable Saver<T, ? extends Object> saver, @Nullable String str, @NotNull Function0<? extends T> function0, @Nullable Composer composer, int i, int i2) {
        Object objConsumeRestored;
        composer.startReplaceableGroup(1059366159);
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        int i3 = 0;
        if (str == null || str.length() == 0) {
            composer.startReplaceableGroup(1059366467);
            str = String.valueOf(ComposablesKt.getCurrentCompositeKeyHash(composer, 0));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1059366442);
            composer.endReplaceableGroup();
        }
        final String str2 = str;
        Objects.requireNonNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        composer.startReplaceableGroup(-3685570);
        int length = objArrCopyOf.length;
        boolean zChanged = false;
        while (i3 < length) {
            Object obj = objArrCopyOf[i3];
            i3++;
            zChanged |= composer.changed(obj);
        }
        T tRestore = (T) composer.rememberedValue();
        if (zChanged || tRestore == Composer.INSTANCE.getEmpty()) {
            tRestore = (saveableStateRegistry == null || (objConsumeRestored = saveableStateRegistry.consumeRestored(str2)) == null) ? null : saver.restore(objConsumeRestored);
            if (tRestore == null) {
                tRestore = function0.invoke();
            }
            composer.updateRememberedValue(tRestore);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.mutableStateOf$default(saver, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) objRememberedValue;
        mutableState.setValue(saver);
        if (saveableStateRegistry != null) {
            composer.startReplaceableGroup(1059367381);
            final T t = tRestore;
            EffectsKt.DisposableEffect(saveableStateRegistry, str2, tRestore, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                    final MutableState<Saver<T, Object>> mutableState2 = mutableState;
                    final T t2 = t;
                    final SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    Function0<? extends Object> function1 = new Function0<Object>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final Object invoke() {
                            Object value = mutableState2.getValue();
                            T t3 = t2;
                            final SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry2;
                            return ((Saver) value).save(new SaverScope() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$1$1
                                @Override // androidx.compose.runtime.saveable.SaverScope
                                public final boolean canBeSaved(@NotNull Object obj2) {
                                    return saveableStateRegistry3.canBeSaved(obj2);
                                }
                            }, t3);
                        }
                    };
                    RememberSaveableKt.requireCanBeSaved(saveableStateRegistry, function1.invoke());
                    final SaveableStateRegistry.Entry entryRegisterProvider = saveableStateRegistry.registerProvider(str2, function1);
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            entryRegisterProvider.unregister();
                        }
                    };
                }
            }, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1059367799);
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        return tRestore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }

    @Composable
    @NotNull
    public static final <T> MutableState<T> rememberSaveable(@NotNull Object[] objArr, @NotNull Saver<T, ? extends Object> saver, @Nullable String str, @NotNull Function0<? extends MutableState<T>> function0, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1059368929);
        if ((i2 & 4) != 0) {
            str = null;
        }
        MutableState<T> mutableState = (MutableState) m912rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str, (Function0) function0, composer, (i & 896) | 8 | (i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY), 0);
        composer.endReplaceableGroup();
        return mutableState;
    }
}
