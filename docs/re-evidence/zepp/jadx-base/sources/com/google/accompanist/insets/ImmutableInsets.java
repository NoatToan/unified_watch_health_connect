package com.google.accompanist.insets;

import androidx.compose.runtime.Immutable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.sf4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/google/accompanist/insets/ImmutableInsets;", "Lcom/google/accompanist/insets/Insets;", "", "a", LogUtil.I, "getLeft", "()I", "left", "b", "getTop", "top", "c", "getRight", "right", GoogleApiAvailabilityLight.a, "getBottom", "bottom", "<init>", "(IIII)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class ImmutableInsets implements Insets {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int bottom;

    public ImmutableInsets() {
        this(0, 0, 0, 0, 15, null);
    }

    public ImmutableInsets(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets copy(int i, int i2, int i3, int i4) {
        return sf4.a(this, i, i2, i3, i4);
    }

    @Override // com.google.accompanist.insets.Insets
    public int getBottom() {
        return this.bottom;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getLeft() {
        return this.left;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getRight() {
        return this.right;
    }

    @Override // com.google.accompanist.insets.Insets
    public int getTop() {
        return this.top;
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets minus(Insets insets) {
        return sf4.b(this, insets);
    }

    @Override // com.google.accompanist.insets.Insets
    public /* synthetic */ Insets plus(Insets insets) {
        return sf4.c(this, insets);
    }

    public /* synthetic */ ImmutableInsets(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
