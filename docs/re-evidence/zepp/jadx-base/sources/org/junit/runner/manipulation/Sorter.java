package org.junit.runner.manipulation;

import java.util.Comparator;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes23.dex */
public class Sorter implements Comparator<Description> {
    public static final Sorter NULL = new Sorter(new a());
    private final Comparator<Description> a;

    public static class a implements Comparator<Description> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Description description, Description description2) {
            return 0;
        }
    }

    public Sorter(Comparator<Description> comparator) {
        this.a = comparator;
    }

    public void apply(Object obj) {
        if (obj instanceof Sortable) {
            ((Sortable) obj).sort(this);
        }
    }

    @Override // java.util.Comparator
    public int compare(Description description, Description description2) {
        return this.a.compare(description, description2);
    }
}
