package ie;

import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Comparator<int[]> {
    public a(b bVar) {
    }

    @Override // java.util.Comparator
    public final int compare(int[] iArr, int[] iArr2) {
        return iArr[0] - iArr2[0];
    }
}
