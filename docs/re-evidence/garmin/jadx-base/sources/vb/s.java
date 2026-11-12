package vb;

import bb.k0;
import com.google.common.primitives.ImmutableIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class s implements k0 {
    public s(int i14, int[] iArr) {
        if (iArr != null) {
            ImmutableIntArray.copyOf(iArr);
        } else {
            ImmutableIntArray.of();
        }
    }
}
