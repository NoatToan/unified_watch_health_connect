package com.google.accompanist.insets;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.passport.Configs;
import defpackage.sf4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/google/accompanist/insets/MutableInsets;", "Lcom/google/accompanist/insets/Insets;", "", Configs.Params.RESET, "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getLeft", "()I", "setLeft", "(I)V", "left", "b", "getTop", "setTop", "top", "c", "getRight", "setRight", "right", GoogleApiAvailabilityLight.a, "getBottom", "setBottom", "bottom", "<init>", "(IIII)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class MutableInsets implements Insets {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableState left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableState top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableState right;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableState bottom;

    public MutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    public MutableInsets(int i, int i2, int i3, int i4) {
        this.left = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
        this.top = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i2), null, 2, null);
        this.right = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i3), null, 2, null);
        this.bottom = SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i4), null, 2, null);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets copy(int i, int i2, int i3, int i4) {
        return sf4.a(this, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.Insets
    public int getBottom() {
        return ((Number) this.bottom.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.Insets
    public int getLeft() {
        return ((Number) this.left.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.Insets
    public int getRight() {
        return ((Number) this.right.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.accompanist.insets.Insets
    public int getTop() {
        return ((Number) this.top.getValue()).intValue();
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets minus(Insets insets) {
        return sf4.b(this, insets);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets plus(Insets insets) {
        return sf4.c(this, insets);
    }

    public final void reset() {
        setLeft(0);
        setTop(0);
        setRight(0);
        setBottom(0);
    }

    public void setBottom(int i) {
        this.bottom.setValue(Integer.valueOf(i));
    }

    public void setLeft(int i) {
        this.left.setValue(Integer.valueOf(i));
    }

    public void setRight(int i) {
        this.right.setValue(Integer.valueOf(i));
    }

    public void setTop(int i) {
        this.top.setValue(Integer.valueOf(i));
    }

    public /* synthetic */ MutableInsets(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
