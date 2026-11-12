package com.google.accompanist.insets;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.ew8;
import defpackage.sf4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R+\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\r8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R+\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u00020\u00158V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R+\u0010%\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001f8W@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/google/accompanist/insets/MutableWindowInsetsType;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "", "onAnimationStart", "onAnimationEnd", "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "()I", "b", "(I)V", "ongoingAnimationsCount", "Lcom/google/accompanist/insets/MutableInsets;", "Lcom/google/accompanist/insets/MutableInsets;", "getLayoutInsets", "()Lcom/google/accompanist/insets/MutableInsets;", "layoutInsets", "c", "getAnimatedInsets", "animatedInsets", "", GoogleApiAvailabilityLight.a, "isVisible", "()Z", "setVisible", "(Z)V", "e", "Landroidx/compose/runtime/State;", "getAnimationInProgress", "animationInProgress", "", "f", "getAnimationFraction", "()F", "setAnimationFraction", "(F)V", "animationFraction", "<init>", "()V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class MutableWindowInsetsType implements WindowInsets.Type {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableState ongoingAnimationsCount = SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableInsets layoutInsets = new MutableInsets(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableInsets animatedInsets = new MutableInsets(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableState isVisible = SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final State animationInProgress = SnapshotStateKt.derivedStateOf(new a());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableState animationFraction = SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(MutableWindowInsetsType.this.a() > 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int a() {
        return ((Number) this.ongoingAnimationsCount.getValue()).intValue();
    }

    private final void b(int i) {
        this.ongoingAnimationsCount.setValue(Integer.valueOf(i));
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets copy(int i, int i2, int i3, int i4) {
        return sf4.a(this, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.WindowInsets.Type
    @FloatRange(from = 0.0d, to = 1.0d)
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.WindowInsets.Type
    /* JADX INFO: renamed from: isVisible */
    public boolean getIsVisible() {
        return ((Boolean) this.isVisible.getValue()).booleanValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets minus(Insets insets) {
        return sf4.b(this, insets);
    }

    public final void onAnimationEnd() {
        b(a() - 1);
        if (a() == 0) {
            getAnimatedInsets().reset();
            setAnimationFraction(0.0f);
        }
    }

    public final void onAnimationStart() {
        b(a() + 1);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets plus(Insets insets) {
        return sf4.c(this, insets);
    }

    public void setAnimationFraction(float f) {
        this.animationFraction.setValue(Float.valueOf(f));
    }

    public void setVisible(boolean z) {
        this.isVisible.setValue(Boolean.valueOf(z));
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public MutableInsets getAnimatedInsets() {
        return this.animatedInsets;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public MutableInsets getLayoutInsets() {
        return this.layoutInsets;
    }
}
