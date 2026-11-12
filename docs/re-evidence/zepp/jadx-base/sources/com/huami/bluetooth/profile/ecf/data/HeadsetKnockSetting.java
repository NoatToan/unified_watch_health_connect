package com.huami.bluetooth.profile.ecf.data;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\b\u0018\u0000 L2\u00020\u0001:\u0001LB\u0093\u0001\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\bJ\u0010KJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\u0095\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0002HÆ\u0001J\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\u0013\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\b;\u0010)R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)R\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)R\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bC\u0010)R\u0016\u0010G\u001a\u00020D8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020D8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F¨\u0006M"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "leftSingleKnock", "rightSingleKnock", "leftDoubleKnock", "rightDoubleKnock", "leftTripleKnock", "rightTripleKnock", "leftSingleDog", "rightSingleDog", "leftDoubleDog", "rightDoubleDog", "leftTripleDog", "rightTripleDog", "leftLongPress", "rightLongPress", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getLeftSingleKnock", "()I", "b", "getRightSingleKnock", "c", "getLeftDoubleKnock", GoogleApiAvailabilityLight.a, "getRightDoubleKnock", "e", "getLeftTripleKnock", "f", "getRightTripleKnock", "g", "getLeftSingleDog", "h", "getRightSingleDog", "i", "getLeftDoubleDog", z.j, "getRightDoubleDog", hl.k, "getLeftTripleDog", "l", "getRightTripleDog", "m", "getLeftLongPress", GoogleApiAvailabilityLight.b, "getRightLongPress", "", "getBytes$bluetooth_release", "()[B", HTTP.CONTENT_RANGE_BYTES, "getBytesNew$bluetooth_release", "bytesNew", "<init>", "(IIIIIIIIIIIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeadsetKnockSetting {
    public static final int DISABLE = 0;
    public static final int ENABLE_SIDE_LISTEN = 2;
    public static final int ENABLE_VOICE_ASSISTANT = 3;
    public static final int LONG_PRESS_DEFAULT = 7;
    public static final int NEXT = 5;
    public static final int NOISE_CLOSE = 4;
    public static final int NOISE_PENETRATE = 2;
    public static final int NOISE_REDUCTION = 1;
    public static final int PLAY = 1;
    public static final int PREVIOUS = 4;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int leftSingleKnock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int rightSingleKnock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int leftDoubleKnock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int rightDoubleKnock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int leftTripleKnock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int rightTripleKnock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int leftSingleDog;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int rightSingleDog;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int leftDoubleDog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int rightDoubleDog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int leftTripleDog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int rightTripleDog;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final int leftLongPress;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final int rightLongPress;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "value", "bitCount", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, Integer, Integer> {
        public final /* synthetic */ List<Byte> a;
        public final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Byte> list, Ref.IntRef intRef) {
            super(2);
            this.a = list;
            this.b = intRef;
        }

        public final int a(int i, int i2) {
            this.a.add(Byte.valueOf((byte) i));
            return this.b.element | (1 << i2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(a(num.intValue(), num2.intValue()));
        }
    }

    public HeadsetKnockSetting() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16383, null);
    }

    public HeadsetKnockSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.leftSingleKnock = i;
        this.rightSingleKnock = i2;
        this.leftDoubleKnock = i3;
        this.rightDoubleKnock = i4;
        this.leftTripleKnock = i5;
        this.rightTripleKnock = i6;
        this.leftSingleDog = i7;
        this.rightSingleDog = i8;
        this.leftDoubleDog = i9;
        this.rightDoubleDog = i10;
        this.leftTripleDog = i11;
        this.rightTripleDog = i12;
        this.leftLongPress = i13;
        this.rightLongPress = i14;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLeftSingleKnock() {
        return this.leftSingleKnock;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getRightDoubleDog() {
        return this.rightDoubleDog;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getLeftTripleDog() {
        return this.leftTripleDog;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getRightTripleDog() {
        return this.rightTripleDog;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getLeftLongPress() {
        return this.leftLongPress;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getRightLongPress() {
        return this.rightLongPress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRightSingleKnock() {
        return this.rightSingleKnock;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLeftDoubleKnock() {
        return this.leftDoubleKnock;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRightDoubleKnock() {
        return this.rightDoubleKnock;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLeftTripleKnock() {
        return this.leftTripleKnock;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRightTripleKnock() {
        return this.rightTripleKnock;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getLeftSingleDog() {
        return this.leftSingleDog;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getRightSingleDog() {
        return this.rightSingleDog;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLeftDoubleDog() {
        return this.leftDoubleDog;
    }

    @NotNull
    public final HeadsetKnockSetting copy(int leftSingleKnock, int rightSingleKnock, int leftDoubleKnock, int rightDoubleKnock, int leftTripleKnock, int rightTripleKnock, int leftSingleDog, int rightSingleDog, int leftDoubleDog, int rightDoubleDog, int leftTripleDog, int rightTripleDog, int leftLongPress, int rightLongPress) {
        return new HeadsetKnockSetting(leftSingleKnock, rightSingleKnock, leftDoubleKnock, rightDoubleKnock, leftTripleKnock, rightTripleKnock, leftSingleDog, rightSingleDog, leftDoubleDog, rightDoubleDog, leftTripleDog, rightTripleDog, leftLongPress, rightLongPress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeadsetKnockSetting)) {
            return false;
        }
        HeadsetKnockSetting headsetKnockSetting = (HeadsetKnockSetting) other;
        return this.leftSingleKnock == headsetKnockSetting.leftSingleKnock && this.rightSingleKnock == headsetKnockSetting.rightSingleKnock && this.leftDoubleKnock == headsetKnockSetting.leftDoubleKnock && this.rightDoubleKnock == headsetKnockSetting.rightDoubleKnock && this.leftTripleKnock == headsetKnockSetting.leftTripleKnock && this.rightTripleKnock == headsetKnockSetting.rightTripleKnock && this.leftSingleDog == headsetKnockSetting.leftSingleDog && this.rightSingleDog == headsetKnockSetting.rightSingleDog && this.leftDoubleDog == headsetKnockSetting.leftDoubleDog && this.rightDoubleDog == headsetKnockSetting.rightDoubleDog && this.leftTripleDog == headsetKnockSetting.leftTripleDog && this.rightTripleDog == headsetKnockSetting.rightTripleDog && this.leftLongPress == headsetKnockSetting.leftLongPress && this.rightLongPress == headsetKnockSetting.rightLongPress;
    }

    @NotNull
    public final byte[] getBytes$bluetooth_release() {
        return new byte[]{(byte) this.leftSingleKnock, (byte) this.rightSingleKnock, (byte) this.leftDoubleKnock, (byte) this.rightDoubleKnock, (byte) this.leftTripleKnock, (byte) this.rightTripleKnock};
    }

    @NotNull
    public final byte[] getBytesNew$bluetooth_release() {
        Ref.IntRef intRef = new Ref.IntRef();
        ArrayList arrayList = new ArrayList();
        a aVar = new a(arrayList, intRef);
        intRef.element = aVar.invoke(Integer.valueOf(this.leftSingleKnock), 0).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightSingleKnock), 1).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftDoubleKnock), 2).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightDoubleKnock), 3).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftTripleKnock), 4).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightTripleKnock), 5).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftSingleDog), 6).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightSingleDog), 7).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftDoubleDog), 8).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightDoubleDog), 9).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftTripleDog), 10).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightTripleDog), 11).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.leftLongPress), 12).intValue();
        intRef.element = aVar.invoke(Integer.valueOf(this.rightLongPress), 13).intValue();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(ArraysKt___ArraysKt.toList(ByteUtilsKt.toByteArray(intRef.element, 4)));
        arrayList2.addAll(arrayList);
        return CollectionsKt___CollectionsKt.toByteArray(arrayList2);
    }

    public final int getLeftDoubleDog() {
        return this.leftDoubleDog;
    }

    public final int getLeftDoubleKnock() {
        return this.leftDoubleKnock;
    }

    public final int getLeftLongPress() {
        return this.leftLongPress;
    }

    public final int getLeftSingleDog() {
        return this.leftSingleDog;
    }

    public final int getLeftSingleKnock() {
        return this.leftSingleKnock;
    }

    public final int getLeftTripleDog() {
        return this.leftTripleDog;
    }

    public final int getLeftTripleKnock() {
        return this.leftTripleKnock;
    }

    public final int getRightDoubleDog() {
        return this.rightDoubleDog;
    }

    public final int getRightDoubleKnock() {
        return this.rightDoubleKnock;
    }

    public final int getRightLongPress() {
        return this.rightLongPress;
    }

    public final int getRightSingleDog() {
        return this.rightSingleDog;
    }

    public final int getRightSingleKnock() {
        return this.rightSingleKnock;
    }

    public final int getRightTripleDog() {
        return this.rightTripleDog;
    }

    public final int getRightTripleKnock() {
        return this.rightTripleKnock;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.leftSingleKnock * 31) + this.rightSingleKnock) * 31) + this.leftDoubleKnock) * 31) + this.rightDoubleKnock) * 31) + this.leftTripleKnock) * 31) + this.rightTripleKnock) * 31) + this.leftSingleDog) * 31) + this.rightSingleDog) * 31) + this.leftDoubleDog) * 31) + this.rightDoubleDog) * 31) + this.leftTripleDog) * 31) + this.rightTripleDog) * 31) + this.leftLongPress) * 31) + this.rightLongPress;
    }

    @NotNull
    public String toString() {
        return "HeadsetKnockSetting(leftSingleKnock=" + this.leftSingleKnock + ", rightSingleKnock=" + this.rightSingleKnock + ", leftDoubleKnock=" + this.leftDoubleKnock + ", rightDoubleKnock=" + this.rightDoubleKnock + ", leftTripleKnock=" + this.leftTripleKnock + ", rightTripleKnock=" + this.rightTripleKnock + ", leftSingleDog=" + this.leftSingleDog + ", rightSingleDog=" + this.rightSingleDog + ", leftDoubleDog=" + this.leftDoubleDog + ", rightDoubleDog=" + this.rightDoubleDog + ", leftTripleDog=" + this.leftTripleDog + ", rightTripleDog=" + this.rightTripleDog + ", leftLongPress=" + this.leftLongPress + ", rightLongPress=" + this.rightLongPress + ')';
    }

    public /* synthetic */ HeadsetKnockSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i, (i15 & 2) != 0 ? 0 : i2, (i15 & 4) != 0 ? 0 : i3, (i15 & 8) != 0 ? 0 : i4, (i15 & 16) != 0 ? 0 : i5, (i15 & 32) != 0 ? 0 : i6, (i15 & 64) != 0 ? 0 : i7, (i15 & 128) != 0 ? 0 : i8, (i15 & 256) != 0 ? 0 : i9, (i15 & 512) != 0 ? 0 : i10, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) == 0 ? i12 : 0, (i15 & 4096) != 0 ? 7 : i13, (i15 & 8192) == 0 ? i14 : 7);
    }
}
