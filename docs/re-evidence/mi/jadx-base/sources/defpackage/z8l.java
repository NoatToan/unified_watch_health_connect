package defpackage;

import com.th3rdwave.safeareacontext.SafeAreaViewEdges;
import com.th3rdwave.safeareacontext.SafeAreaViewMode;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes6.dex */
public class z8l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f08 f41027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeAreaViewMode f41028b;
    public EnumSet<SafeAreaViewEdges> c;

    public z8l(f08 f08Var, SafeAreaViewMode safeAreaViewMode, EnumSet<SafeAreaViewEdges> enumSet) {
        this.f41027a = f08Var;
        this.f41028b = safeAreaViewMode;
        this.c = enumSet;
    }

    public EnumSet<SafeAreaViewEdges> a() {
        return this.c;
    }

    public f08 b() {
        return this.f41027a;
    }

    public SafeAreaViewMode c() {
        return this.f41028b;
    }
}
