package wb2;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes11.dex */
public enum j {
    SHOW_PROGRESS_ONLY_WHEN_FILES_FOUND(0),
    ALWAYS_SHOW_PROGRESS(1),
    INVISIBLE(2);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseArray<j> f184036e = new SparseArray<>(values().length);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f184038a;

    static {
        for (j jVar : values()) {
            f184036e.put(jVar.f184038a, jVar);
        }
    }

    j(int i14) {
        this.f184038a = i14;
    }

    public static j a(String str, j jVar) {
        try {
            j jVarValueOf = valueOf(str);
            return jVarValueOf != null ? jVarValueOf : jVar;
        } catch (Exception unused) {
        }
    }
}
