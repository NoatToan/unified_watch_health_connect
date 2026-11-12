package defpackage;

import java.util.Comparator;
import org.ahocorasick.interval.Intervalable;

/* JADX INFO: loaded from: classes20.dex */
public class zun implements Comparator<Intervalable> {
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compare(Intervalable intervalable, Intervalable intervalable2) {
        return intervalable.getStart() - intervalable2.getStart();
    }
}
