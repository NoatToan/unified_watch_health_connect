package com.huami.lib.compose.rainbow.compat;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0003\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b \u0010!J(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u0013\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001f\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001f\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001f\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u001f\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001f\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u001f\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u001f\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lcom/huami/lib/compose/rainbow/compat/a;", "Lcom/huami/lib/compose/rainbow/compat/SwitchColors;", "", Constants.ENABLED, "checked", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "trackColor", "", "other", "equals", "", "hashCode", "a", "J", "checkedThumbColor", "b", "checkedTrackColor", "c", "uncheckedThumbColor", GoogleApiAvailabilityLight.a, "uncheckedTrackColor", "e", "disabledCheckedThumbColor", "f", "disabledCheckedTrackColor", "g", "disabledUncheckedThumbColor", "h", "disabledUncheckedTrackColor", "<init>", "(JJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "rainbow_release"}, k = 1, mv = {1, 5, 1})
final class a implements SwitchColors {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long checkedThumbColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long checkedTrackColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long uncheckedThumbColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long uncheckedTrackColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final long disabledCheckedThumbColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long disabledCheckedTrackColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long disabledUncheckedThumbColor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long disabledUncheckedTrackColor;

    private a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.checkedThumbColor = j;
        this.checkedTrackColor = j2;
        this.uncheckedThumbColor = j3;
        this.uncheckedTrackColor = j4;
        this.disabledCheckedThumbColor = j5;
        this.disabledCheckedTrackColor = j6;
        this.disabledUncheckedThumbColor = j7;
        this.disabledUncheckedTrackColor = j8;
    }

    public /* synthetic */ a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(a.class), Reflection.getOrCreateKotlinClass(other.getClass()))) {
            return false;
        }
        a aVar = (a) other;
        return Color.m1213equalsimpl0(this.checkedThumbColor, aVar.checkedThumbColor) && Color.m1213equalsimpl0(this.checkedTrackColor, aVar.checkedTrackColor) && Color.m1213equalsimpl0(this.uncheckedThumbColor, aVar.uncheckedThumbColor) && Color.m1213equalsimpl0(this.uncheckedTrackColor, aVar.uncheckedTrackColor) && Color.m1213equalsimpl0(this.disabledCheckedThumbColor, aVar.disabledCheckedThumbColor) && Color.m1213equalsimpl0(this.disabledCheckedTrackColor, aVar.disabledCheckedTrackColor) && Color.m1213equalsimpl0(this.disabledUncheckedThumbColor, aVar.disabledUncheckedThumbColor) && Color.m1213equalsimpl0(this.disabledUncheckedTrackColor, aVar.disabledUncheckedTrackColor);
    }

    public int hashCode() {
        return (((((((((((((Color.m1219hashCodeimpl(this.checkedThumbColor) * 31) + Color.m1219hashCodeimpl(this.checkedTrackColor)) * 31) + Color.m1219hashCodeimpl(this.uncheckedThumbColor)) * 31) + Color.m1219hashCodeimpl(this.uncheckedTrackColor)) * 31) + Color.m1219hashCodeimpl(this.disabledCheckedThumbColor)) * 31) + Color.m1219hashCodeimpl(this.disabledCheckedTrackColor)) * 31) + Color.m1219hashCodeimpl(this.disabledUncheckedThumbColor)) * 31) + Color.m1219hashCodeimpl(this.disabledUncheckedTrackColor);
    }

    @Override // com.huami.lib.compose.rainbow.compat.SwitchColors
    @Composable
    @NotNull
    public State<Color> thumbColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(1445857367);
        if (z) {
            j = z2 ? this.checkedThumbColor : this.uncheckedThumbColor;
        } else {
            j = z2 ? this.disabledCheckedThumbColor : this.disabledUncheckedThumbColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1202boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // com.huami.lib.compose.rainbow.compat.SwitchColors
    @Composable
    @NotNull
    public State<Color> trackColor(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(419437952);
        if (z) {
            j = z2 ? this.checkedTrackColor : this.uncheckedTrackColor;
        } else {
            j = z2 ? this.disabledCheckedTrackColor : this.disabledUncheckedTrackColor;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m1202boximpl(j), composer, 0);
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
