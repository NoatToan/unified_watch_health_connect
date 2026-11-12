package p03;

import com.google.android.flexbox.FlexItem;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private a() {
    }

    public static int a(int i14, int i15) {
        return (i14 & FlexItem.MAX_SIZE) | (i15 << 24);
    }
}
