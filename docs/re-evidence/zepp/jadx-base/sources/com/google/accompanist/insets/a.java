package com.google.accompanist.insets;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.ew8;
import defpackage.sf4;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0017\"\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\n\u001a\u00020\u00028V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\r\u001a\u00020\u000b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\u000b8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0016\u001a\u00020\u00128V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/google/accompanist/insets/a;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "Lcom/google/accompanist/insets/Insets;", "a", "Landroidx/compose/runtime/State;", "getLayoutInsets", "()Lcom/google/accompanist/insets/Insets;", "layoutInsets", "b", "getAnimatedInsets", "animatedInsets", "", "c", "isVisible", "()Z", GoogleApiAvailabilityLight.a, "getAnimationInProgress", "animationInProgress", "", "e", "getAnimationFraction", "()F", "animationFraction", "", "types", "<init>", "([Lcom/google/accompanist/insets/WindowInsets$Type;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
final class a implements WindowInsets.Type {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final State layoutInsets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final State animatedInsets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final State isVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final State animationInProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final State animationFraction;

    /* JADX INFO: renamed from: com.google.accompanist.insets.a$a, reason: collision with other inner class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/accompanist/insets/Insets;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C0136a extends Lambda implements Function0<Insets> {
        public final /* synthetic */ WindowInsets.Type[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0136a(WindowInsets.Type[] typeArr) {
            super(0);
            this.a = typeArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Insets invoke() {
            WindowInsets.Type[] typeArr = this.a;
            Insets empty = Insets.INSTANCE.getEmpty();
            for (WindowInsets.Type type : typeArr) {
                empty = InsetsKt.coerceEachDimensionAtLeast(empty, type);
            }
            return empty;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0007\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Float> {
        public final /* synthetic */ WindowInsets.Type[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WindowInsets.Type[] typeArr) {
            super(0);
            this.a = typeArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Float invoke() {
            WindowInsets.Type[] typeArr = this.a;
            int i = 1;
            if (typeArr.length == 0) {
                throw new NoSuchElementException();
            }
            float animationFraction = typeArr[0].getAnimationFraction();
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(typeArr);
            if (1 <= lastIndex) {
                while (true) {
                    animationFraction = Math.max(animationFraction, typeArr[i].getAnimationFraction());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return Float.valueOf(animationFraction);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ WindowInsets.Type[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WindowInsets.Type[] typeArr) {
            super(0);
            this.a = typeArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z = false;
            for (WindowInsets.Type type : this.a) {
                if (type.getAnimationInProgress()) {
                    z = true;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public final /* synthetic */ WindowInsets.Type[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(WindowInsets.Type[] typeArr) {
            super(0);
            this.a = typeArr;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean z = false;
            for (WindowInsets.Type type : this.a) {
                if (!type.getIsVisible()) {
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/google/accompanist/insets/Insets;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Insets> {
        public final /* synthetic */ WindowInsets.Type[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(WindowInsets.Type[] typeArr) {
            super(0);
            this.a = typeArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Insets invoke() {
            WindowInsets.Type[] typeArr = this.a;
            Insets empty = Insets.INSTANCE.getEmpty();
            for (WindowInsets.Type type : typeArr) {
                empty = InsetsKt.coerceEachDimensionAtLeast(empty, type);
            }
            return empty;
        }
    }

    public a(@NotNull WindowInsets.Type... typeArr) {
        this.layoutInsets = SnapshotStateKt.derivedStateOf(new e(typeArr));
        this.animatedInsets = SnapshotStateKt.derivedStateOf(new C0136a(typeArr));
        this.isVisible = SnapshotStateKt.derivedStateOf(new d(typeArr));
        this.animationInProgress = SnapshotStateKt.derivedStateOf(new c(typeArr));
        this.animationFraction = SnapshotStateKt.derivedStateOf(new b(typeArr));
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets copy(int i, int i2, int i3, int i4) {
        return sf4.a(this, i, i2, i3, i4);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getAnimatedInsets() {
        return (Insets) this.animatedInsets.getValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public float getAnimationFraction() {
        return ((Number) this.animationFraction.getValue()).floatValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public boolean getAnimationInProgress() {
        return ((Boolean) this.animationInProgress.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type, com.google.accompanist.insets.Insets
    public /* synthetic */ int getBottom() {
        return ew8.a(this);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getLayoutInsets() {
        return (Insets) this.layoutInsets.getValue();
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type, com.google.accompanist.insets.Insets
    public /* synthetic */ int getLeft() {
        return ew8.b(this);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type, com.google.accompanist.insets.Insets
    public /* synthetic */ int getRight() {
        return ew8.c(this);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type, com.google.accompanist.insets.Insets
    public /* synthetic */ int getTop() {
        return ew8.d(this);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets minus(Insets insets) {
        return sf4.b(this, insets);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets plus(Insets insets) {
        return sf4.c(this, insets);
    }
}
