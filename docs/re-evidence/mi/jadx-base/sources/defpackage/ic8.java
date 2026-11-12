package defpackage;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class ic8 implements Comparator<Entry> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Entry entry, Entry entry2) {
        float x = entry.getX() - entry2.getX();
        if (x == 0.0f) {
            return 0;
        }
        return x > 0.0f ? 1 : -1;
    }
}
