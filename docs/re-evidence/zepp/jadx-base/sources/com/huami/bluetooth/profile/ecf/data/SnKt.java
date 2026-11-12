package com.huami.bluetooth.profile.ecf.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0000\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u0003H\u0000\"\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "Lcom/huami/bluetooth/profile/ecf/data/SnType;", "toSnType", "", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "toSn", "", "toSnList", "", "a", LogUtil.I, "SN_MIN_BYTES", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class SnKt {
    private static final int a = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "offset", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Integer> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] bArr) {
            super(1);
            this.a = bArr;
        }

        public final int a(int i) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return -1;
            }
            int length = bArr.length;
            if (i >= length) {
                return i;
            }
            while (true) {
                int i2 = i + 1;
                if (this.a[i] == 0 || i2 >= length) {
                    return i;
                }
                i = i2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(a(num.intValue()));
        }
    }

    @Nullable
    public static final Sn toSn(@NotNull byte[] bArr) {
        if (bArr.length < 2) {
            return null;
        }
        return new Sn(toSnType(bArr[0]), ByteArrayKt.toString$default(bArr, 1, 0, 2, null));
    }

    @NotNull
    public static final List<Sn> toSnList(@NotNull byte[] bArr) {
        if (bArr.length < 2) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        a aVar = new a(bArr);
        int iIntValue = aVar.invoke(1).intValue();
        while (iIntValue > i) {
            int i2 = iIntValue + 1;
            Sn sn = toSn(ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i2));
            if (sn != null) {
                arrayList.add(sn);
            }
            if (i2 > bArr.length) {
                break;
            }
            iIntValue = aVar.invoke(Integer.valueOf(i2 + 1)).intValue();
            i = i2;
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public static final SnType toSnType(byte b) {
        SnType.Left left = SnType.Left.INSTANCE;
        if (b == left.getValue()) {
            return left;
        }
        SnType.Right right = SnType.Right.INSTANCE;
        if (b == right.getValue()) {
            return right;
        }
        SnType.Case r0 = SnType.Case.INSTANCE;
        return b == r0.getValue() ? r0 : new SnType(b);
    }
}
