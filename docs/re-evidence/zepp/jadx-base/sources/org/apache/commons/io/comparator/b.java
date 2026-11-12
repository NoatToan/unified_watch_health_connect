package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes23.dex */
class b extends a implements Serializable {
    private static final long serialVersionUID = -4808255005272229056L;
    private final Comparator<File> a;

    public b(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.a = comparator;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[" + this.a.toString() + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.a.compare(file2, file);
    }
}
