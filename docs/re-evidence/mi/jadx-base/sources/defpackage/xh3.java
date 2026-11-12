package defpackage;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class xh3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xh3 f39114b = new a().d(0).b();
    public static final xh3 c = new a().d(1).b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashSet<bh3> f39115a;

    public xh3(LinkedHashSet<bh3> linkedHashSet) {
        this.f39115a = linkedHashSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<CameraInternal> a(LinkedHashSet<CameraInternal> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<CameraInternal> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        List<ch3> listB = b(arrayList);
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>();
        for (CameraInternal cameraInternal : linkedHashSet) {
            if (listB.contains(cameraInternal.getCameraInfo())) {
                linkedHashSet2.add(cameraInternal);
            }
        }
        return linkedHashSet2;
    }

    public List<ch3> b(List<ch3> list) {
        List<ch3> arrayList = new ArrayList<>(list);
        Iterator<bh3> it = this.f39115a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public LinkedHashSet<bh3> c() {
        return this.f39115a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Integer d() {
        Integer num = null;
        for (bh3 bh3Var : this.f39115a) {
            if (bh3Var instanceof efe) {
                Integer numValueOf = Integer.valueOf(((efe) bh3Var).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal e(LinkedHashSet<CameraInternal> linkedHashSet) {
        Iterator<CameraInternal> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet<bh3> f39116a;

        public a() {
            this.f39116a = new LinkedHashSet<>();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static a c(xh3 xh3Var) {
            return new a(xh3Var.c());
        }

        public a a(bh3 bh3Var) {
            this.f39116a.add(bh3Var);
            return this;
        }

        public xh3 b() {
            return new xh3(this.f39116a);
        }

        public a d(int i) {
            this.f39116a.add(new efe(i));
            return this;
        }

        public a(LinkedHashSet<bh3> linkedHashSet) {
            this.f39116a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
