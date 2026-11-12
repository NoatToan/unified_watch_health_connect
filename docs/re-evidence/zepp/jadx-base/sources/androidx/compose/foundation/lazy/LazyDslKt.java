package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.ingenic.iwds.remotedevice.RemoteDeviceManagerInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0003\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u000f\u001a-\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001a±\u0001\u0010\u0014\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\n2H\b\u0004\u0010\u000f\u001aB\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0087\u0001\u0010\u0003\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162%\b\n\u0010\t\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u000423\b\u0004\u0010\u000f\u001a-\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0017\u001a±\u0001\u0010\u0014\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162:\b\n\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\n2H\b\u0004\u0010\u000f\u001aB\u0012\u0004\u0012\u00020\u000b\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\f0\u0013¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0018\u001an\u0010(\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010&\u001a\u00020%2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b(\u0010)\u001an\u0010.\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010&\u001a\u00020%2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b.\u0010/\u001a.\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyListScope;", "", "items", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "key", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "itemContent", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "index", "Lkotlin/Function3;", "itemsIndexed", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "content", "LazyRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "LazyColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListItemsProvider;", "rememberStateOfItemsProvider", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "foundation_release"}, k = 2, mv = {1, 5, 1})
public final class LazyDslKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C13561 extends Lambda implements Function1<Integer, Object> {
        public final /* synthetic */ List<T> $items;
        public final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13561(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$key = function1;
            this.$items = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke((T) this.$items.get(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        public final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        public final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                this.$itemContent.invoke(lazyItemScope, (T) this.$items.get(i), composer, Integer.valueOf(i3 & 14));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        public final /* synthetic */ T[] $items;
        public final /* synthetic */ Function1<T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$key = function1;
            this.$items = tArr;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(this.$items[i]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$items$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        public final /* synthetic */ Function4<LazyItemScope, T, Composer, Integer, Unit> $itemContent;
        public final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                this.$itemContent.invoke(lazyItemScope, this.$items[i], composer, Integer.valueOf(i3 & 14));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C13571 extends Lambda implements Function1<Integer, Object> {
        public final /* synthetic */ List<T> $items;
        public final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13571(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$key = function2;
            this.$items = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), (T) this.$items.get(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C13582 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        public final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        public final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13582(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), (T) this.$items.get(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C13593 extends Lambda implements Function1<Integer, Object> {
        public final /* synthetic */ T[] $items;
        public final /* synthetic */ Function2<Integer, T, Object> $key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13593(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$key = function2;
            this.$items = tArr;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @NotNull
        public final Object invoke(int i) {
            return this.$key.invoke(Integer.valueOf(i), this.$items[i]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C13604 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        public final /* synthetic */ Function5<LazyItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        public final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13604(Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Composable
        public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, @Nullable Composer composer, int i2) {
            int i3;
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if (((i3 & 731) ^ 146) == 0 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                this.$itemContent.invoke(lazyItemScope, Integer.valueOf(i), this.$items[i], composer, Integer.valueOf((i3 & 14) | (i3 & 112)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:120:0x015a  */
    /* JADX WARN: Code duplicated, block: B:122:0x015d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:127:0x016e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0172  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:134:0x0182  */
    /* JADX WARN: Code duplicated, block: B:137:0x018f  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    @Composable
    public static final void LazyColumn(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Horizontal horizontal, @Nullable FlingBehavior flingBehavior, @NotNull final Function1<? super LazyListScope, Unit> function1, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM274PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Vertical vertical2;
        Alignment.Horizontal start;
        FlingBehavior flingBehavior2;
        int i6;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        Alignment.Horizontal horizontal2;
        final FlingBehavior flingBehavior3;
        boolean z3;
        Arrangement arrangement;
        Arrangement.Vertical bottom;
        final boolean z4;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        final Arrangement.Vertical vertical3;
        final PaddingValues paddingValues2;
        final Alignment.Horizontal horizontal3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-750323803);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i9 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i9;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i9;
        } else {
            lazyListState2 = lazyListState;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                paddingValuesM274PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM274PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        int i11 = composerStartRestartGroup.changed(vertical2) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        vertical2 = vertical;
                    }
                    i3 |= i11;
                } else {
                    vertical2 = vertical;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        start = horizontal;
                        int i12 = composerStartRestartGroup.changed(start) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        start = horizontal;
                    }
                    i3 |= i12;
                } else {
                    start = horizontal;
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior2)) {
                        i7 = 524288;
                    } else {
                        i7 = 1048576;
                    }
                    i3 |= i7;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((i & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(function1)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                    }
                    if (((23967451 & i3) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState2;
                            }
                            if (i10 != 0) {
                                paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    bottom = arrangement.getBottom();
                                } else {
                                    bottom = arrangement.getTop();
                                }
                                i3 &= -57345;
                                vertical2 = bottom;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                start = Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endDefaults();
                            lazyListState2 = lazyListStateRememberLazyListState;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                            modifier2 = modifier3;
                            z3 = z2;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 2) != 0) {
                                i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            z3 = z2;
                            horizontal2 = start;
                            flingBehavior3 = flingBehavior2;
                        }
                        int i13 = i3;
                        Arrangement.Vertical vertical4 = vertical2;
                        int i14 = i13 << 3;
                        LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i13 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical4, null, null, composerStartRestartGroup, 196608 | (i14 & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i14 & 57344) | (3670016 & i13) | ((i13 << 6) & 29360128) | ((i13 << 12) & 234881024), 0, 1536);
                        LazyListState lazyListState4 = lazyListState2;
                        z4 = z3;
                        modifier4 = modifier2;
                        lazyListState3 = lazyListState4;
                        Alignment.Horizontal horizontal4 = horizontal2;
                        vertical3 = vertical4;
                        paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                        horizontal3 = horizontal4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        lazyListState3 = lazyListState2;
                        paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                        z4 = z2;
                        vertical3 = vertical2;
                        horizontal3 = start;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                        }
                    });
                }
                i6 = 12582912;
                i3 |= i6;
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i15 = i3;
                    Arrangement.Vertical vertical5 = vertical2;
                    int i16 = i15 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i15 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical5, null, null, composerStartRestartGroup, 196608 | (i16 & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i16 & 57344) | (3670016 & i15) | ((i15 << 6) & 29360128) | ((i15 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState5 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState5;
                    Alignment.Horizontal horizontal5 = horizontal2;
                    vertical3 = vertical5;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal5;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i17 = i3;
                    Arrangement.Vertical vertical6 = vertical2;
                    int i18 = i17 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i17 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical6, null, null, composerStartRestartGroup, 196608 | (i18 & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i18 & 57344) | (3670016 & i17) | ((i17 << 6) & 29360128) | ((i17 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState6 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState6;
                    Alignment.Horizontal horizontal6 = horizontal2;
                    vertical3 = vertical6;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i11;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i11;
            } else {
                vertical2 = vertical;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    start = horizontal;
                    if (composerStartRestartGroup.changed(start)) {
                    }
                    i3 |= i12;
                } else {
                    start = horizontal;
                }
                i3 |= i12;
            } else {
                start = horizontal;
            }
            if ((i & 3670016) == 0) {
                flingBehavior2 = flingBehavior;
                if ((i2 & 64) == 0) {
                    i7 = 524288;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(function1)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i19 = i3;
                    Arrangement.Vertical vertical7 = vertical2;
                    int i110 = i19 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i19 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical7, null, null, composerStartRestartGroup, 196608 | (i110 & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i110 & 57344) | (3670016 & i19) | ((i19 << 6) & 29360128) | ((i19 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState7 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState7;
                    Alignment.Horizontal horizontal7 = horizontal2;
                    vertical3 = vertical7;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal7;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i111 = i3;
                    Arrangement.Vertical vertical8 = vertical2;
                    int i112 = i111 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical8, null, null, composerStartRestartGroup, 196608 | (i112 & 112) | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i112 & 57344) | (3670016 & i111) | ((i111 << 6) & 29360128) | ((i111 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState8 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState8;
                    Alignment.Horizontal horizontal8 = horizontal2;
                    vertical3 = vertical8;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i113 = i3;
                Arrangement.Vertical vertical9 = vertical2;
                int i114 = i113 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i113 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical9, null, null, composerStartRestartGroup, 196608 | (i114 & 112) | (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i114 & 57344) | (3670016 & i113) | ((i113 << 6) & 29360128) | ((i113 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState9 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState9;
                Alignment.Horizontal horizontal9 = horizontal2;
                vertical3 = vertical9;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i115 = i3;
                Arrangement.Vertical vertical10 = vertical2;
                int i116 = i115 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i115 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical10, null, null, composerStartRestartGroup, 196608 | (i116 & 112) | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i116 & 57344) | (3670016 & i115) | ((i115 << 6) & 29360128) | ((i115 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState10 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState10;
                Alignment.Horizontal horizontal10 = horizontal2;
                vertical3 = vertical10;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i117) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        paddingValuesM274PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    vertical2 = vertical;
                    if (composerStartRestartGroup.changed(vertical2)) {
                    }
                    i3 |= i11;
                } else {
                    vertical2 = vertical;
                }
                i3 |= i11;
            } else {
                vertical2 = vertical;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    start = horizontal;
                    if (composerStartRestartGroup.changed(start)) {
                    }
                    i3 |= i12;
                } else {
                    start = horizontal;
                }
                i3 |= i12;
            } else {
                start = horizontal;
            }
            if ((i & 3670016) == 0) {
                flingBehavior2 = flingBehavior;
                if ((i2 & 64) == 0) {
                    i7 = 524288;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((i & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(function1)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i117 = i3;
                    Arrangement.Vertical vertical11 = vertical2;
                    int i118 = i117 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i117 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical11, null, null, composerStartRestartGroup, 196608 | (i118 & 112) | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i118 & 57344) | (3670016 & i117) | ((i117 << 6) & 29360128) | ((i117 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState11 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState11;
                    Alignment.Horizontal horizontal11 = horizontal2;
                    vertical3 = vertical11;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal11;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                bottom = arrangement.getTop();
                            } else {
                                bottom = arrangement.getBottom();
                            }
                            i3 &= -57345;
                            vertical2 = bottom;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            start = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        horizontal2 = start;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i119 = i3;
                    Arrangement.Vertical vertical12 = vertical2;
                    int i1110 = i119 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i119 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical12, null, null, composerStartRestartGroup, 196608 | (i1110 & 112) | (i1110 & 896) | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1110 & 57344) | (3670016 & i119) | ((i119 << 6) & 29360128) | ((i119 << 12) & 234881024), 0, 1536);
                    LazyListState lazyListState12 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState12;
                    Alignment.Horizontal horizontal12 = horizontal2;
                    vertical3 = vertical12;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    horizontal3 = horizontal12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1111 = i3;
                Arrangement.Vertical vertical13 = vertical2;
                int i1112 = i1111 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical13, null, null, composerStartRestartGroup, 196608 | (i1112 & 112) | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1112 & 57344) | (3670016 & i1111) | ((i1111 << 6) & 29360128) | ((i1111 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState13 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState13;
                Alignment.Horizontal horizontal13 = horizontal2;
                vertical3 = vertical13;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal13;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1113 = i3;
                Arrangement.Vertical vertical14 = vertical2;
                int i1114 = i1113 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1113 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical14, null, null, composerStartRestartGroup, 196608 | (i1114 & 112) | (i1114 & 896) | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1114 & 57344) | (3670016 & i1113) | ((i1113 << 6) & 29360128) | ((i1113 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState14 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState14;
                Alignment.Horizontal horizontal14 = horizontal2;
                vertical3 = vertical14;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1115) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                vertical2 = vertical;
                if (composerStartRestartGroup.changed(vertical2)) {
                }
                i3 |= i11;
            } else {
                vertical2 = vertical;
            }
            i3 |= i11;
        } else {
            vertical2 = vertical;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                start = horizontal;
                if (composerStartRestartGroup.changed(start)) {
                }
                i3 |= i12;
            } else {
                start = horizontal;
            }
            i3 |= i12;
        } else {
            start = horizontal;
        }
        if ((i & 3670016) == 0) {
            flingBehavior2 = flingBehavior;
            if ((i2 & 64) == 0) {
                i7 = 524288;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        } else {
            flingBehavior2 = flingBehavior;
        }
        if ((i2 & 128) != 0) {
            if ((i & 29360128) == 0) {
                if (composerStartRestartGroup.changed(function1)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
            }
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1115 = i3;
                Arrangement.Vertical vertical15 = vertical2;
                int i1116 = i1115 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1115 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical15, null, null, composerStartRestartGroup, 196608 | (i1116 & 112) | (i1116 & 896) | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1116 & 57344) | (3670016 & i1115) | ((i1115 << 6) & 29360128) | ((i1115 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState15 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState15;
                Alignment.Horizontal horizontal15 = horizontal2;
                vertical3 = vertical15;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal15;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            bottom = arrangement.getTop();
                        } else {
                            bottom = arrangement.getBottom();
                        }
                        i3 &= -57345;
                        vertical2 = bottom;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        start = Alignment.INSTANCE.getStart();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    horizontal2 = start;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1117 = i3;
                Arrangement.Vertical vertical16 = vertical2;
                int i1118 = i1117 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1117 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical16, null, null, composerStartRestartGroup, 196608 | (i1118 & 112) | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1118 & 57344) | (3670016 & i1117) | ((i1117 << 6) & 29360128) | ((i1117 << 12) & 234881024), 0, 1536);
                LazyListState lazyListState16 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState16;
                Alignment.Horizontal horizontal16 = horizontal2;
                vertical3 = vertical16;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                horizontal3 = horizontal16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i6 = 12582912;
        i3 |= i6;
        if (((23967451 & i3) ^ 4793490) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                horizontal2 = start;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                horizontal2 = start;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            }
            int i1119 = i3;
            Arrangement.Vertical vertical17 = vertical2;
            int i11110 = i1119 << 3;
            LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1119 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical17, null, null, composerStartRestartGroup, 196608 | (i11110 & 112) | (i11110 & 896) | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11110 & 57344) | (3670016 & i1119) | ((i1119 << 6) & 29360128) | ((i1119 << 12) & 234881024), 0, 1536);
            LazyListState lazyListState17 = lazyListState2;
            z4 = z3;
            modifier4 = modifier2;
            lazyListState3 = lazyListState17;
            Alignment.Horizontal horizontal17 = horizontal2;
            vertical3 = vertical17;
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            horizontal3 = horizontal17;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                horizontal2 = start;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        bottom = arrangement.getTop();
                    } else {
                        bottom = arrangement.getBottom();
                    }
                    i3 &= -57345;
                    vertical2 = bottom;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    start = Alignment.INSTANCE.getStart();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                horizontal2 = start;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            }
            int i11111 = i3;
            Arrangement.Vertical vertical18 = vertical2;
            int i11112 = i11111 << 3;
            LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i11111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, true, flingBehavior3, horizontal2, vertical18, null, null, composerStartRestartGroup, 196608 | (i11112 & 112) | (i11112 & 896) | (i11112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11112 & 57344) | (3670016 & i11111) | ((i11111 << 6) & 29360128) | ((i11111 << 12) & 234881024), 0, 1536);
            LazyListState lazyListState18 = lazyListState2;
            z4 = z3;
            modifier4 = modifier2;
            lazyListState3 = lazyListState18;
            Alignment.Horizontal horizontal18 = horizontal2;
            vertical3 = vertical18;
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            horizontal3 = horizontal18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11113) {
                LazyDslKt.LazyColumn(modifier4, lazyListState3, paddingValues2, z4, vertical3, horizontal3, flingBehavior3, function1, composer2, i | 1, i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0143  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0151  */
    /* JADX WARN: Code duplicated, block: B:120:0x0159  */
    /* JADX WARN: Code duplicated, block: B:122:0x015c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:127:0x016d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0171  */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:134:0x0181  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00de  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    @Composable
    public static final void LazyRow(@Nullable Modifier modifier, @Nullable LazyListState lazyListState, @Nullable PaddingValues paddingValues, boolean z, @Nullable Arrangement.Horizontal horizontal, @Nullable Alignment.Vertical vertical, @Nullable FlingBehavior flingBehavior, @NotNull final Function1<? super LazyListScope, Unit> function1, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValuesM274PaddingValues0680j_4;
        int i4;
        boolean z2;
        int i5;
        Arrangement.Horizontal horizontal2;
        Alignment.Vertical top;
        FlingBehavior flingBehavior2;
        int i6;
        Modifier modifier3;
        LazyListState lazyListStateRememberLazyListState;
        Alignment.Vertical vertical2;
        final FlingBehavior flingBehavior3;
        boolean z3;
        Arrangement arrangement;
        Arrangement.Horizontal end;
        final boolean z4;
        final Modifier modifier4;
        final LazyListState lazyListState3;
        final Arrangement.Horizontal horizontal3;
        final PaddingValues paddingValues2;
        final Alignment.Vertical vertical3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(1356352169);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                int i9 = composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
                i3 |= i9;
            } else {
                lazyListState2 = lazyListState;
            }
            i3 |= i9;
        } else {
            lazyListState2 = lazyListState;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 896) == 0) {
                paddingValuesM274PaddingValues0680j_4 = paddingValues;
                i3 |= composerStartRestartGroup.changed(paddingValuesM274PaddingValues0680j_4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        int i11 = composerStartRestartGroup.changed(horizontal2) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i3 |= i11;
                } else {
                    horizontal2 = horizontal;
                }
                if ((458752 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        top = vertical;
                        int i12 = composerStartRestartGroup.changed(top) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        top = vertical;
                    }
                    i3 |= i12;
                } else {
                    top = vertical;
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(flingBehavior2)) {
                        i7 = 524288;
                    } else {
                        i7 = 1048576;
                    }
                    i3 |= i7;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    if ((29360128 & i) == 0) {
                        if (composerStartRestartGroup.changed(function1)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                    }
                    if (((23967451 & i3) ^ 4793490) == 0 || !composerStartRestartGroup.getSkipping()) {
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.startDefaults();
                            if (i8 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i2 & 2) != 0) {
                                lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            } else {
                                lazyListStateRememberLazyListState = lazyListState2;
                            }
                            if (i10 != 0) {
                                paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                arrangement = Arrangement.INSTANCE;
                                if (z2) {
                                    end = arrangement.getEnd();
                                } else {
                                    end = arrangement.getStart();
                                }
                                i3 &= -57345;
                                horizontal2 = end;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                top = Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endDefaults();
                            lazyListState2 = lazyListStateRememberLazyListState;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                            modifier2 = modifier3;
                            z3 = z2;
                        } else {
                            composerStartRestartGroup.skipCurrentGroup();
                            if ((i2 & 2) != 0) {
                                i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            z3 = z2;
                            vertical2 = top;
                            flingBehavior3 = flingBehavior2;
                        }
                        int i13 = i3;
                        Arrangement.Horizontal horizontal4 = horizontal2;
                        int i14 = i13 << 3;
                        LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i13 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal4, composerStartRestartGroup, 196608 | (i14 & 112) | (i14 & 896) | (i14 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i14 & 57344) | (3670016 & i13) | (1879048192 & (i13 << 12)), (i13 >> 12) & 14, 384);
                        LazyListState lazyListState4 = lazyListState2;
                        z4 = z3;
                        modifier4 = modifier2;
                        lazyListState3 = lazyListState4;
                        Alignment.Vertical vertical4 = vertical2;
                        horizontal3 = horizontal4;
                        paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                        vertical3 = vertical4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        lazyListState3 = lazyListState2;
                        paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                        z4 = z2;
                        horizontal3 = horizontal2;
                        vertical3 = top;
                        flingBehavior3 = flingBehavior2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer2, int i15) {
                            LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                        }
                    });
                }
                i6 = 12582912;
                i3 |= i6;
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i15 = i3;
                    Arrangement.Horizontal horizontal5 = horizontal2;
                    int i16 = i15 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i15 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal5, composerStartRestartGroup, 196608 | (i16 & 112) | (i16 & 896) | (i16 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i16 & 57344) | (3670016 & i15) | (1879048192 & (i15 << 12)), (i15 >> 12) & 14, 384);
                    LazyListState lazyListState5 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState5;
                    Alignment.Vertical vertical5 = vertical2;
                    horizontal3 = horizontal5;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical5;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i17 = i3;
                    Arrangement.Horizontal horizontal6 = horizontal2;
                    int i18 = i17 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i17 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal6, composerStartRestartGroup, 196608 | (i18 & 112) | (i18 & 896) | (i18 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i18 & 57344) | (3670016 & i17) | (1879048192 & (i17 << 12)), (i17 >> 12) & 14, 384);
                    LazyListState lazyListState6 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState6;
                    Alignment.Vertical vertical6 = vertical2;
                    horizontal3 = horizontal6;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i19) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i11;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i11;
            } else {
                horizontal2 = horizontal;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    top = vertical;
                    if (composerStartRestartGroup.changed(top)) {
                    }
                    i3 |= i12;
                } else {
                    top = vertical;
                }
                i3 |= i12;
            } else {
                top = vertical;
            }
            if ((i & 3670016) == 0) {
                flingBehavior2 = flingBehavior;
                if ((i2 & 64) == 0) {
                    i7 = 524288;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(function1)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i19 = i3;
                    Arrangement.Horizontal horizontal7 = horizontal2;
                    int i110 = i19 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i19 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal7, composerStartRestartGroup, 196608 | (i110 & 112) | (i110 & 896) | (i110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i110 & 57344) | (3670016 & i19) | (1879048192 & (i19 << 12)), (i19 >> 12) & 14, 384);
                    LazyListState lazyListState7 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState7;
                    Alignment.Vertical vertical7 = vertical2;
                    horizontal3 = horizontal7;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical7;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i111 = i3;
                    Arrangement.Horizontal horizontal8 = horizontal2;
                    int i112 = i111 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal8, composerStartRestartGroup, 196608 | (i112 & 112) | (i112 & 896) | (i112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i112 & 57344) | (3670016 & i111) | (1879048192 & (i111 << 12)), (i111 >> 12) & 14, 384);
                    LazyListState lazyListState8 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState8;
                    Alignment.Vertical vertical8 = vertical2;
                    horizontal3 = horizontal8;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i113) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i113 = i3;
                Arrangement.Horizontal horizontal9 = horizontal2;
                int i114 = i113 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i113 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal9, composerStartRestartGroup, 196608 | (i114 & 112) | (i114 & 896) | (i114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i114 & 57344) | (3670016 & i113) | (1879048192 & (i113 << 12)), (i113 >> 12) & 14, 384);
                LazyListState lazyListState9 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState9;
                Alignment.Vertical vertical9 = vertical2;
                horizontal3 = horizontal9;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical9;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i115 = i3;
                Arrangement.Horizontal horizontal10 = horizontal2;
                int i116 = i115 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i115 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal10, composerStartRestartGroup, 196608 | (i116 & 112) | (i116 & 896) | (i116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i116 & 57344) | (3670016 & i115) | (1879048192 & (i115 << 12)), (i115 >> 12) & 14, 384);
                LazyListState lazyListState10 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState10;
                Alignment.Vertical vertical10 = vertical2;
                horizontal3 = horizontal10;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i117) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 384;
        paddingValuesM274PaddingValues0680j_4 = paddingValues;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 57344) == 0) {
                if ((i2 & 16) == 0) {
                    horizontal2 = horizontal;
                    if (composerStartRestartGroup.changed(horizontal2)) {
                    }
                    i3 |= i11;
                } else {
                    horizontal2 = horizontal;
                }
                i3 |= i11;
            } else {
                horizontal2 = horizontal;
            }
            if ((458752 & i) == 0) {
                if ((i2 & 32) == 0) {
                    top = vertical;
                    if (composerStartRestartGroup.changed(top)) {
                    }
                    i3 |= i12;
                } else {
                    top = vertical;
                }
                i3 |= i12;
            } else {
                top = vertical;
            }
            if ((i & 3670016) == 0) {
                flingBehavior2 = flingBehavior;
                if ((i2 & 64) == 0) {
                    i7 = 524288;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            } else {
                flingBehavior2 = flingBehavior;
            }
            if ((i2 & 128) != 0) {
                if ((29360128 & i) == 0) {
                    if (composerStartRestartGroup.changed(function1)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                }
                if (((23967451 & i3) ^ 4793490) == 0) {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i117 = i3;
                    Arrangement.Horizontal horizontal11 = horizontal2;
                    int i118 = i117 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i117 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal11, composerStartRestartGroup, 196608 | (i118 & 112) | (i118 & 896) | (i118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i118 & 57344) | (3670016 & i117) | (1879048192 & (i117 << 12)), (i117 >> 12) & 14, 384);
                    LazyListState lazyListState11 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState11;
                    Alignment.Vertical vertical11 = vertical2;
                    horizontal3 = horizontal11;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical11;
                } else {
                    if ((i & 1) != 0) {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if (i8 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i2 & 2) != 0) {
                            lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                        } else {
                            lazyListStateRememberLazyListState = lazyListState2;
                        }
                        if (i10 != 0) {
                            paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            arrangement = Arrangement.INSTANCE;
                            if (z2) {
                                end = arrangement.getStart();
                            } else {
                                end = arrangement.getEnd();
                            }
                            i3 &= -57345;
                            horizontal2 = end;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            top = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endDefaults();
                        lazyListState2 = lazyListStateRememberLazyListState;
                        vertical2 = top;
                        flingBehavior3 = flingBehavior2;
                        modifier2 = modifier3;
                        z3 = z2;
                    }
                    int i119 = i3;
                    Arrangement.Horizontal horizontal12 = horizontal2;
                    int i1110 = i119 << 3;
                    LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i119 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal12, composerStartRestartGroup, 196608 | (i1110 & 112) | (i1110 & 896) | (i1110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1110 & 57344) | (3670016 & i119) | (1879048192 & (i119 << 12)), (i119 >> 12) & 14, 384);
                    LazyListState lazyListState12 = lazyListState2;
                    z4 = z3;
                    modifier4 = modifier2;
                    lazyListState3 = lazyListState12;
                    Alignment.Vertical vertical12 = vertical2;
                    horizontal3 = horizontal12;
                    paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                    vertical3 = vertical12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i1111) {
                        LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                    }
                });
            }
            i6 = 12582912;
            i3 |= i6;
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1111 = i3;
                Arrangement.Horizontal horizontal13 = horizontal2;
                int i1112 = i1111 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal13, composerStartRestartGroup, 196608 | (i1112 & 112) | (i1112 & 896) | (i1112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1112 & 57344) | (3670016 & i1111) | (1879048192 & (i1111 << 12)), (i1111 >> 12) & 14, 384);
                LazyListState lazyListState13 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState13;
                Alignment.Vertical vertical13 = vertical2;
                horizontal3 = horizontal13;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical13;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1113 = i3;
                Arrangement.Horizontal horizontal14 = horizontal2;
                int i1114 = i1113 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1113 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal14, composerStartRestartGroup, 196608 | (i1114 & 112) | (i1114 & 896) | (i1114 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1114 & 57344) | (3670016 & i1113) | (1879048192 & (i1113 << 12)), (i1113 >> 12) & 14, 384);
                LazyListState lazyListState14 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState14;
                Alignment.Vertical vertical14 = vertical2;
                horizontal3 = horizontal14;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1115) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 57344) == 0) {
            if ((i2 & 16) == 0) {
                horizontal2 = horizontal;
                if (composerStartRestartGroup.changed(horizontal2)) {
                }
                i3 |= i11;
            } else {
                horizontal2 = horizontal;
            }
            i3 |= i11;
        } else {
            horizontal2 = horizontal;
        }
        if ((458752 & i) == 0) {
            if ((i2 & 32) == 0) {
                top = vertical;
                if (composerStartRestartGroup.changed(top)) {
                }
                i3 |= i12;
            } else {
                top = vertical;
            }
            i3 |= i12;
        } else {
            top = vertical;
        }
        if ((i & 3670016) == 0) {
            flingBehavior2 = flingBehavior;
            if ((i2 & 64) == 0) {
                i7 = 524288;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        } else {
            flingBehavior2 = flingBehavior;
        }
        if ((i2 & 128) != 0) {
            if ((29360128 & i) == 0) {
                if (composerStartRestartGroup.changed(function1)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
            }
            if (((23967451 & i3) ^ 4793490) == 0) {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1115 = i3;
                Arrangement.Horizontal horizontal15 = horizontal2;
                int i1116 = i1115 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1115 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal15, composerStartRestartGroup, 196608 | (i1116 & 112) | (i1116 & 896) | (i1116 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1116 & 57344) | (3670016 & i1115) | (1879048192 & (i1115 << 12)), (i1115 >> 12) & 14, 384);
                LazyListState lazyListState15 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState15;
                Alignment.Vertical vertical15 = vertical2;
                horizontal3 = horizontal15;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical15;
            } else {
                if ((i & 1) != 0) {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if (i8 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                        i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                    } else {
                        lazyListStateRememberLazyListState = lazyListState2;
                    }
                    if (i10 != 0) {
                        paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                    }
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if ((i2 & 16) != 0) {
                        arrangement = Arrangement.INSTANCE;
                        if (z2) {
                            end = arrangement.getStart();
                        } else {
                            end = arrangement.getEnd();
                        }
                        i3 &= -57345;
                        horizontal2 = end;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                        top = Alignment.INSTANCE.getTop();
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endDefaults();
                    lazyListState2 = lazyListStateRememberLazyListState;
                    vertical2 = top;
                    flingBehavior3 = flingBehavior2;
                    modifier2 = modifier3;
                    z3 = z2;
                }
                int i1117 = i3;
                Arrangement.Horizontal horizontal16 = horizontal2;
                int i1118 = i1117 << 3;
                LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1117 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal16, composerStartRestartGroup, 196608 | (i1118 & 112) | (i1118 & 896) | (i1118 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i1118 & 57344) | (3670016 & i1117) | (1879048192 & (i1117 << 12)), (i1117 >> 12) & 14, 384);
                LazyListState lazyListState16 = lazyListState2;
                z4 = z3;
                modifier4 = modifier2;
                lazyListState3 = lazyListState16;
                Alignment.Vertical vertical16 = vertical2;
                horizontal3 = horizontal16;
                paddingValues2 = paddingValuesM274PaddingValues0680j_4;
                vertical3 = vertical16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i1119) {
                    LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
                }
            });
        }
        i6 = 12582912;
        i3 |= i6;
        if (((23967451 & i3) ^ 4793490) == 0) {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                vertical2 = top;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                vertical2 = top;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            }
            int i1119 = i3;
            Arrangement.Horizontal horizontal17 = horizontal2;
            int i11110 = i1119 << 3;
            LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i1119 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal17, composerStartRestartGroup, 196608 | (i11110 & 112) | (i11110 & 896) | (i11110 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11110 & 57344) | (3670016 & i1119) | (1879048192 & (i1119 << 12)), (i1119 >> 12) & 14, 384);
            LazyListState lazyListState17 = lazyListState2;
            z4 = z3;
            modifier4 = modifier2;
            lazyListState3 = lazyListState17;
            Alignment.Vertical vertical17 = vertical2;
            horizontal3 = horizontal17;
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            vertical3 = vertical17;
        } else {
            if ((i & 1) != 0) {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                vertical2 = top;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            } else {
                composerStartRestartGroup.startDefaults();
                if (i8 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                    i3 &= RemoteDeviceManagerInfo.DELETE_FAILED_USER_RESTRICTED;
                } else {
                    lazyListStateRememberLazyListState = lazyListState2;
                }
                if (i10 != 0) {
                    paddingValuesM274PaddingValues0680j_4 = PaddingKt.m274PaddingValues0680j_4(Dp.m2965constructorimpl(0));
                }
                if (i4 != 0) {
                    z2 = false;
                }
                if ((i2 & 16) != 0) {
                    arrangement = Arrangement.INSTANCE;
                    if (z2) {
                        end = arrangement.getStart();
                    } else {
                        end = arrangement.getEnd();
                    }
                    i3 &= -57345;
                    horizontal2 = end;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                    top = Alignment.INSTANCE.getTop();
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                lazyListState2 = lazyListStateRememberLazyListState;
                vertical2 = top;
                flingBehavior3 = flingBehavior2;
                modifier2 = modifier3;
                z3 = z2;
            }
            int i11111 = i3;
            Arrangement.Horizontal horizontal18 = horizontal2;
            int i11112 = i11111 << 3;
            LazyListKt.LazyList(rememberStateOfItemsProvider(function1, composerStartRestartGroup, (i11111 >> 21) & 14), modifier2, lazyListState2, paddingValuesM274PaddingValues0680j_4, z3, false, flingBehavior3, null, null, vertical2, horizontal18, composerStartRestartGroup, 196608 | (i11112 & 112) | (i11112 & 896) | (i11112 & RaceId.RACE_FOTA_PARTITION_INFO_QUERY) | (i11112 & 57344) | (3670016 & i11111) | (1879048192 & (i11111 << 12)), (i11111 >> 12) & 14, 384);
            LazyListState lazyListState18 = lazyListState2;
            z4 = z3;
            modifier4 = modifier2;
            lazyListState3 = lazyListState18;
            Alignment.Vertical vertical18 = vertical2;
            horizontal3 = horizontal18;
            paddingValues2 = paddingValuesM274PaddingValues0680j_4;
            vertical3 = vertical18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt.LazyRow.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i11113) {
                LazyDslKt.LazyRow(modifier4, lazyListState3, paddingValues2, z4, horizontal3, vertical3, flingBehavior3, function1, composer2, i | 1, i2);
            }
        });
    }

    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new C13561(function1, list) : null, ComposableLambdaKt.composableLambdaInstance(-985537599, true, new AnonymousClass2(function4, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new C13561(function1, list) : null, ComposableLambdaKt.composableLambdaInstance(-985537599, true, new AnonymousClass2(function4, list)));
    }

    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull List<? extends T> list, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new C13571(function2, list) : null, ComposableLambdaKt.composableLambdaInstance(-985536724, true, new C13582(function5, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new C13571(function2, list) : null, ComposableLambdaKt.composableLambdaInstance(-985536724, true, new C13582(function5, list)));
    }

    @Composable
    private static final State<LazyListItemsProvider> rememberStateOfItemsProvider(Function1<? super LazyListScope, Unit> function1, Composer composer, int i) {
        composer.startReplaceableGroup(-1542792672);
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<LazyListScopeImpl>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$rememberStateOfItemsProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final LazyListScopeImpl getA() {
                    LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
                    stateRememberUpdatedState.getValue().invoke(lazyListScopeImpl);
                    return lazyListScopeImpl;
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        State<LazyListItemsProvider> state = (State) objRememberedValue;
        composer.endReplaceableGroup();
        return state;
    }

    public static final <T> void items(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new AnonymousClass3(function1, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-985535672, true, new AnonymousClass4(function4, tArr)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new AnonymousClass3(function1, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-985535672, true, new AnonymousClass4(function4, objArr)));
    }

    public static final <T> void itemsIndexed(@NotNull LazyListScope lazyListScope, @NotNull T[] tArr, @Nullable Function2<? super Integer, ? super T, ? extends Object> function2, @NotNull Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new C13593(function2, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-985535297, true, new C13604(function5, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new C13593(function2, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-985535297, true, new C13604(function5, objArr)));
    }
}
