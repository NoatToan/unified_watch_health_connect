package yc;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u000eB5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bB\u001f\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lyc/p4;", "", "T", "", "originalPageOffsets", "", "data", "", "hintOriginalPageOffset", "hintOriginalIndices", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class p4<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f196316e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p4<Object> f196317f = new p4<>(0, p13.j0.f134944a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f196318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<T> f196319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f196320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f196321d;

    /* JADX WARN: Multi-variable type inference failed */
    public p4(int[] iArr, List<? extends T> list, int i14, List<Integer> list2) {
        iArr.getClass();
        list.getClass();
        this.f196318a = iArr;
        this.f196319b = list;
        this.f196320c = i14;
        this.f196321d = list2;
        if (iArr.length == 0) {
            vb.h.s("originalPageOffsets cannot be empty when constructing TransformablePage");
            throw null;
        }
        if (list2 == null || list2.size() == list.size()) {
            return;
        }
        list2.getClass();
        throw new IllegalArgumentException(("If originalIndices (size = " + list2.size() + ") is provided, it must be same length as data (size = " + list.size() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p4.class != obj.getClass()) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return Arrays.equals(this.f196318a, p4Var.f196318a) && p005kotlin.jvm.internal.s.g(this.f196319b, p4Var.f196319b) && this.f196320c == p4Var.f196320c && p005kotlin.jvm.internal.s.g(this.f196321d, p4Var.f196321d);
    }

    public final int hashCode() {
        int iB = (lc.u0.b(Arrays.hashCode(this.f196318a) * 31, 31, this.f196319b) + this.f196320c) * 31;
        List<Integer> list = this.f196321d;
        return iB + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TransformablePage(originalPageOffsets=");
        sb3.append(Arrays.toString(this.f196318a));
        sb3.append(", data=");
        sb3.append(this.f196319b);
        sb3.append(", hintOriginalPageOffset=");
        sb3.append(this.f196320c);
        sb3.append(", hintOriginalIndices=");
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f196321d, sb3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/p4$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p4(int i14, List<? extends T> list) {
        this(new int[]{i14}, list, i14, null);
        list.getClass();
    }
}
