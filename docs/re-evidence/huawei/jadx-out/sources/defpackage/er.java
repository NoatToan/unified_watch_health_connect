package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.GreedyContent;
import com.airbnb.lottie.animation.content.PathContent;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes21.dex */
public class er implements PathContent, GreedyContent {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33378c;
    private final MergePaths e;
    private final Path d = new Path();
    private final Path j = new Path();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f33376a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<PathContent> f33377b = new ArrayList();

    public er(MergePaths mergePaths) {
        this.f33378c = mergePaths.d();
        this.e = mergePaths;
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    public void absorbContent(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content contentPrevious = listIterator.previous();
            if (contentPrevious instanceof PathContent) {
                this.f33377b.add((PathContent) contentPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f33377b.size(); i++) {
            this.f33377b.get(i).setContents(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    public Path getPath() {
        this.f33376a.reset();
        if (this.e.e()) {
            return this.f33376a;
        }
        int i = AnonymousClass3.f33379c[this.e.b().ordinal()];
        if (i == 1) {
            c();
        } else if (i == 2) {
            b(Path.Op.UNION);
        } else if (i == 3) {
            b(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            b(Path.Op.INTERSECT);
        } else if (i == 5) {
            b(Path.Op.XOR);
        }
        return this.f33376a;
    }

    /* JADX INFO: renamed from: er$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f33379c;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f33379c = iArr;
            try {
                iArr[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33379c[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33379c[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33379c[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33379c[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f33378c;
    }

    private void c() {
        for (int i = 0; i < this.f33377b.size(); i++) {
            this.f33376a.addPath(this.f33377b.get(i).getPath());
        }
    }

    private void b(Path.Op op) {
        this.j.reset();
        this.d.reset();
        for (int size = this.f33377b.size() - 1; size >= 1; size--) {
            PathContent pathContent = this.f33377b.get(size);
            if (pathContent instanceof em) {
                em emVar = (em) pathContent;
                List<PathContent> listE = emVar.e();
                for (int size2 = listE.size() - 1; size2 >= 0; size2--) {
                    Path path = listE.get(size2).getPath();
                    path.transform(emVar.a());
                    this.j.addPath(path);
                }
            } else {
                this.j.addPath(pathContent.getPath());
            }
        }
        PathContent pathContent2 = this.f33377b.get(0);
        if (pathContent2 instanceof em) {
            em emVar2 = (em) pathContent2;
            List<PathContent> listE2 = emVar2.e();
            for (int i = 0; i < listE2.size(); i++) {
                Path path2 = listE2.get(i).getPath();
                path2.transform(emVar2.a());
                this.d.addPath(path2);
            }
        } else {
            this.d.set(pathContent2.getPath());
        }
        this.f33376a.op(this.d, this.j, op);
    }
}
