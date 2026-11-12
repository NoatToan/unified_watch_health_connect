package com.huami.lib.compose.rainbow.view;

import androidx.compose.runtime.Immutable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lcom/huami/lib/compose/rainbow/view/ButtonStyle;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getColor-0d7_KjU", "()J", "color", "", "b", LogUtil.I, "getSize", "()I", "size", "", "c", "Z", "getOutline", "()Z", "outline", GoogleApiAvailabilityLight.a, "getCircular", "circular", "<init>", "(JIZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "rainbow_release"}, k = 1, mv = {1, 5, 1})
public final class ButtonStyle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean outline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean circular;

    private ButtonStyle(long j, int i, boolean z, boolean z2) {
        this.color = j;
        this.size = i;
        this.outline = z;
        this.circular = z2;
    }

    public /* synthetic */ ButtonStyle(long j, int i, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, z, z2);
    }

    public final boolean getCircular() {
        return this.circular;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final boolean getOutline() {
        return this.outline;
    }

    public final int getSize() {
        return this.size;
    }

    public /* synthetic */ ButtonStyle(long j, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i2 & 2) != 0 ? 48 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, null);
    }
}
