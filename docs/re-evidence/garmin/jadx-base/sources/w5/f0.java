package w5;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.perf.util.Constants;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lw5/f0;", "", "", "weight", "<init>", "(I)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f0 implements Comparable<f0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f182097b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f182098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f182099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f0 f182100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f182101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f0 f182102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f0 f182103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f0 f182104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f0 f182105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List<f0> f182106k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f182107a;

    static {
        f0 f0Var = new f0(100);
        f0 f0Var2 = new f0(200);
        f0 f0Var3 = new f0(300);
        f0 f0Var4 = new f0(400);
        f182098c = f0Var4;
        f0 f0Var5 = new f0(500);
        f182099d = f0Var5;
        f0 f0Var6 = new f0(600);
        f182100e = f0Var6;
        f0 f0Var7 = new f0(Constants.FROZEN_FRAME_TIME);
        f0 f0Var8 = new f0(800);
        f0 f0Var9 = new f0(900);
        f182101f = f0Var3;
        f182102g = f0Var4;
        f182103h = f0Var5;
        f182104i = f0Var6;
        f182105j = f0Var7;
        f182106k = p13.x.k(f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9);
    }

    public f0(int i14) {
        this.f182107a = i14;
        boolean z14 = false;
        if (1 <= i14 && i14 < 1001) {
            z14 = true;
        }
        if (z14) {
            return;
        }
        y5.a.a("Font weight can be in range [1, 1000]. Current value: " + i14);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f0 f0Var) {
        return p005kotlin.jvm.internal.s.h(this.f182107a, f0Var.f182107a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f182107a == ((f0) obj).f182107a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF182107a() {
        return this.f182107a;
    }

    public final String toString() {
        return ds.e0.j(new StringBuilder("FontWeight(weight="), this.f182107a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/f0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
