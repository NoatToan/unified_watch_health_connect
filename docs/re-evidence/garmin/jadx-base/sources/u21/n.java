package u21;

import androidx.lifecycle.u1;
import java.util.List;
import p005kotlin.Metadata;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu21/n;", "Landroidx/lifecycle/u1;", "", "Ls21/i;", "initialMeals", "", "requiresOneMealEnabled", "<init>", "(Ljava/util/List;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f168044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f168045c;

    public n(List<s21.i> list, boolean z14) {
        list.getClass();
        this.f168043a = z14;
        p2 p2VarA = q2.a(new m(list, false, false, 6, null));
        this.f168044b = p2VarA;
        this.f168045c = r53.s.d(p2VarA);
    }

    public /* synthetic */ n(List list, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? false : z14);
    }
}
