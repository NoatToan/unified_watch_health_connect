package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\"\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\u0013\b\u0002\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0019\u0010\n\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004R$\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\t¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/CrossfadeAnimationItem;", ExifInterface.GPS_DIRECTION_TRUE, "", "component1", "()Ljava/lang/Object;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "component2", "()Lkotlin/jvm/functions/Function2;", "key", "content", "copy", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/animation/CrossfadeAnimationItem;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "getKey", "Lkotlin/jvm/functions/Function2;", "getContent", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "animation_release"}, k = 1, mv = {1, 5, 1})
final /* data */ class CrossfadeAnimationItem<T> {

    @NotNull
    private final Function2<Composer, Integer, Unit> content;
    private final T key;

    /* JADX WARN: Multi-variable type inference failed */
    public CrossfadeAnimationItem(T t, @NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        this.key = t;
        this.content = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CrossfadeAnimationItem copy$default(CrossfadeAnimationItem crossfadeAnimationItem, Object obj, Function2 function2, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = crossfadeAnimationItem.key;
        }
        if ((i & 2) != 0) {
            function2 = crossfadeAnimationItem.content;
        }
        return crossfadeAnimationItem.copy(obj, function2);
    }

    public final T component1() {
        return this.key;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> component2() {
        return this.content;
    }

    @NotNull
    public final CrossfadeAnimationItem<T> copy(T key, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        return new CrossfadeAnimationItem<>(key, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossfadeAnimationItem)) {
            return false;
        }
        CrossfadeAnimationItem crossfadeAnimationItem = (CrossfadeAnimationItem) other;
        return Intrinsics.areEqual(this.key, crossfadeAnimationItem.key) && Intrinsics.areEqual(this.content, crossfadeAnimationItem.content);
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getContent() {
        return this.content;
    }

    public final T getKey() {
        return this.key;
    }

    public int hashCode() {
        T t = this.key;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.content.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrossfadeAnimationItem(key=" + this.key + ", content=" + this.content + ')';
    }
}
