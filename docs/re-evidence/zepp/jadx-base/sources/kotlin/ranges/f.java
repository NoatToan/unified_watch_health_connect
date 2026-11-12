package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.collections.UIntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
final class f extends UIntIterator {
    private final int a;
    private boolean b;
    private final int c;
    private int d;

    private f(int i, int i2, int i3) {
        this.a = i2;
        boolean z = true;
        int iUintCompare = UnsignedKt.uintCompare(i, i2);
        if (i3 <= 0 ? iUintCompare < 0 : iUintCompare > 0) {
            z = false;
        }
        this.b = z;
        this.c = UInt.m3880constructorimpl(i3);
        this.d = this.b ? i : i2;
    }

    public /* synthetic */ f(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }

    @Override // kotlin.collections.UIntIterator
    /* JADX INFO: renamed from: nextUInt-pVg5ArA */
    public int mo3903nextUIntpVg5ArA() {
        int i = this.d;
        if (i != this.a) {
            this.d = UInt.m3880constructorimpl(this.c + i);
        } else {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        }
        return i;
    }
}
