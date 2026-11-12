package com.google.accompanist.insets;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.ew8;
import defpackage.sf4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u00020\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0018\u001a\u00020\u00138\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/google/accompanist/insets/ImmutableWindowInsetsType;", "Lcom/google/accompanist/insets/WindowInsets$Type;", "Lcom/google/accompanist/insets/Insets;", "a", "Lcom/google/accompanist/insets/Insets;", "getLayoutInsets", "()Lcom/google/accompanist/insets/Insets;", "layoutInsets", "b", "getAnimatedInsets", "animatedInsets", "", "c", "Z", "isVisible", "()Z", GoogleApiAvailabilityLight.a, "getAnimationInProgress", "animationInProgress", "", "e", "F", "getAnimationFraction", "()F", "animationFraction", "<init>", "(Lcom/google/accompanist/insets/Insets;Lcom/google/accompanist/insets/Insets;ZZF)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class ImmutableWindowInsetsType implements WindowInsets.Type {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Insets layoutInsets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Insets animatedInsets;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean animationInProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float animationFraction;

    public ImmutableWindowInsetsType() {
        this(null, null, false, false, 0.0f, 31, null);
    }

    public ImmutableWindowInsetsType(@NotNull Insets insets, @NotNull Insets insets2, boolean z, boolean z2, float f) {
        this.layoutInsets = insets;
        this.animatedInsets = insets2;
        this.isVisible = z;
        this.animationInProgress = z2;
        this.animationFraction = f;
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets copy(int i, int i2, int i3, int i4) {
        return sf4.a(this, i, i2, i3, i4);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getAnimatedInsets() {
        return this.animatedInsets;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public float getAnimationFraction() {
        return this.animationFraction;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    public boolean getAnimationInProgress() {
        return this.animationInProgress;
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type, com.google.accompanist.insets.Insets
    public /* synthetic */ int getBottom() {
        return ew8.a(this);
    }

    @Override // com.google.accompanist.insets.WindowInsets.Type
    @NotNull
    public Insets getLayoutInsets() {
        return this.layoutInsets;
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
    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public boolean getIsVisible() {
        return this.isVisible;
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets minus(Insets insets) {
        return sf4.b(this, insets);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets plus(Insets insets) {
        return sf4.c(this, insets);
    }

    public /* synthetic */ ImmutableWindowInsetsType(Insets insets, Insets insets2, boolean z, boolean z2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Insets.INSTANCE.getEmpty() : insets, (i & 2) != 0 ? Insets.INSTANCE.getEmpty() : insets2, (i & 4) != 0 ? false : z, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? 0.0f : f);
    }
}
