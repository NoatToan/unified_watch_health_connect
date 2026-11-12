package defpackage;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class qqf implements slh, r3b {
    public final String d;
    public final MergePaths f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f31745a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f31746b = new Path();
    public final Path c = new Path();
    public final List<slh> e = new ArrayList();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31747a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f31747a = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31747a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31747a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31747a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31747a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public qqf(MergePaths mergePaths) {
        this.d = mergePaths.c();
        this.f = mergePaths;
    }

    @Override // defpackage.r3b
    public void b(ListIterator<hh4> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            hh4 hh4VarPrevious = listIterator.previous();
            if (hh4VarPrevious instanceof slh) {
                this.e.add((slh) hh4VarPrevious);
                listIterator.remove();
            }
        }
    }

    public final void c() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).getPath());
        }
    }

    @TargetApi(19)
    public final void e(Path.Op op) {
        this.f31746b.reset();
        this.f31745a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            slh slhVar = this.e.get(size);
            if (slhVar instanceof kh4) {
                kh4 kh4Var = (kh4) slhVar;
                List<slh> listK = kh4Var.k();
                for (int size2 = listK.size() - 1; size2 >= 0; size2--) {
                    Path path = listK.get(size2).getPath();
                    path.transform(kh4Var.l());
                    this.f31746b.addPath(path);
                }
            } else {
                this.f31746b.addPath(slhVar.getPath());
            }
        }
        slh slhVar2 = this.e.get(0);
        if (slhVar2 instanceof kh4) {
            kh4 kh4Var2 = (kh4) slhVar2;
            List<slh> listK2 = kh4Var2.k();
            for (int i = 0; i < listK2.size(); i++) {
                Path path2 = listK2.get(i).getPath();
                path2.transform(kh4Var2.l());
                this.f31745a.addPath(path2);
            }
        } else {
            this.f31745a.set(slhVar2.getPath());
        }
        this.c.op(this.f31745a, this.f31746b, op);
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).f(list, list2);
        }
    }

    @Override // defpackage.slh
    public Path getPath() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.f31747a[this.f.b().ordinal()];
        if (i == 1) {
            c();
        } else if (i == 2) {
            e(Path.Op.UNION);
        } else if (i == 3) {
            e(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            e(Path.Op.INTERSECT);
        } else if (i == 5) {
            e(Path.Op.XOR);
        }
        return this.c;
    }
}
