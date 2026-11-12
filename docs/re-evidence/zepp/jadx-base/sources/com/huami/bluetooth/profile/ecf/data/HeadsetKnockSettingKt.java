package com.huami.bluetooth.profile.ecf.data;

import java.util.BitSet;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¨\u0006\u0004"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "toHeadsetKnockSetting", "toHeadsetKnockSettingNew", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class HeadsetKnockSettingKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "byte", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Byte, Integer> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final int a(@Nullable Byte b) {
            if (b == null) {
                return 0;
            }
            return b.byteValue();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Byte b) {
            return Integer.valueOf(a(b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "bitIndex", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Integer, Integer> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final int a(int i) {
            return 12 <= i && i <= 13 ? 7 : 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(a(num.intValue()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "bitIndex", "", "byte", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function2<Integer, Byte, Integer> {
        public final /* synthetic */ BitSet a;
        public final /* synthetic */ Function1<Integer, Integer> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(BitSet bitSet, Function1<? super Integer, Integer> function1) {
            super(2);
            this.a = bitSet;
            this.b = function1;
        }

        public final int a(int i, @Nullable Byte b) {
            if (!this.a.get(i)) {
                return this.b.invoke(Integer.valueOf(i)).intValue();
            }
            Integer numValueOf = b == null ? null : Integer.valueOf(b.byteValue());
            return numValueOf == null ? this.b.invoke(Integer.valueOf(i)).intValue() : numValueOf.intValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Byte b) {
            return Integer.valueOf(a(num.intValue(), b));
        }
    }

    @Nullable
    public static final HeadsetKnockSetting toHeadsetKnockSetting(@NotNull byte[] bArr) {
        a aVar = a.a;
        return new HeadsetKnockSetting(aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 0)).intValue(), aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 1)).intValue(), aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 2)).intValue(), aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 3)).intValue(), aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 4)).intValue(), aVar.invoke(ArraysKt___ArraysKt.getOrNull(bArr, 5)).intValue(), 0, 0, 0, 0, 0, 0, 0, 0, 16320, null);
    }

    @Nullable
    public static final HeadsetKnockSetting toHeadsetKnockSettingNew(@NotNull byte[] bArr) {
        c cVar = new c(BitSet.valueOf(ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, 4)), b.a);
        return new HeadsetKnockSetting(cVar.invoke(0, ArraysKt___ArraysKt.getOrNull(bArr, 4)).intValue(), cVar.invoke(1, ArraysKt___ArraysKt.getOrNull(bArr, 5)).intValue(), cVar.invoke(2, ArraysKt___ArraysKt.getOrNull(bArr, 6)).intValue(), cVar.invoke(3, ArraysKt___ArraysKt.getOrNull(bArr, 7)).intValue(), cVar.invoke(4, ArraysKt___ArraysKt.getOrNull(bArr, 8)).intValue(), cVar.invoke(5, ArraysKt___ArraysKt.getOrNull(bArr, 9)).intValue(), cVar.invoke(6, ArraysKt___ArraysKt.getOrNull(bArr, 10)).intValue(), cVar.invoke(7, ArraysKt___ArraysKt.getOrNull(bArr, 11)).intValue(), cVar.invoke(8, ArraysKt___ArraysKt.getOrNull(bArr, 12)).intValue(), cVar.invoke(9, ArraysKt___ArraysKt.getOrNull(bArr, 13)).intValue(), cVar.invoke(10, ArraysKt___ArraysKt.getOrNull(bArr, 14)).intValue(), cVar.invoke(11, ArraysKt___ArraysKt.getOrNull(bArr, 15)).intValue(), cVar.invoke(12, ArraysKt___ArraysKt.getOrNull(bArr, 16)).intValue(), cVar.invoke(13, ArraysKt___ArraysKt.getOrNull(bArr, 17)).intValue());
    }
}
