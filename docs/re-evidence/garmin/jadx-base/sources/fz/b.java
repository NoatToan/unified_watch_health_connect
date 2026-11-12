package fz;

import com.github.mikephil.charting.data.Entry;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfz/b;", "", "Lcom/github/mikephil/charting/data/Entry;", "p1", "p2", "<init>", "(Lcom/github/mikephil/charting/data/Entry;Lcom/github/mikephil/charting/data/Entry;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Entry f73960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Entry f73961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f73962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f73963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f73964e;

    public b(Entry entry, Entry entry2) {
        entry.getClass();
        entry2.getClass();
        this.f73960a = entry;
        this.f73961b = entry2;
        float x14 = entry.getX() - entry2.getX();
        this.f73962c = x14;
        float y14 = entry.getY() - entry2.getY();
        this.f73963d = y14;
        this.f73964e = Math.sqrt((((double) x14) * ((double) x14)) + ((double) (y14 * y14)));
    }
}
