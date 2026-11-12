package bb;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public interface n {
    default ImmutableList a() {
        return ImmutableList.of();
    }

    int b(o oVar, f0 f0Var);

    void c(p pVar);

    boolean d(o oVar);

    default n e() {
        return this;
    }

    void release();

    void seek(long j8, long j14);
}
