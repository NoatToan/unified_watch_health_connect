package defpackage;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class vtk extends q00 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<File> f37215a;

    public vtk(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.f37215a = comparator;
    }

    @Override // defpackage.q00
    public String toString() {
        return super.toString() + "[" + this.f37215a.toString() + "]";
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return this.f37215a.compare(file2, file);
    }
}
