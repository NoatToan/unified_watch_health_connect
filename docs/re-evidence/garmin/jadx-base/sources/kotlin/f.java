package kotlin;

import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li5/f;", "Li5/b;", "<init>", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f91173c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f f91174d;

    public /* synthetic */ f(j jVar) {
        this();
    }

    @Override // kotlin.b
    public final int[] a(int i14) {
        int length = c().length();
        if (length <= 0 || i14 >= length) {
            return null;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        while (i14 < length && c().charAt(i14) == '\n' && (c().charAt(i14) == '\n' || (i14 != 0 && c().charAt(i14 - 1) != '\n'))) {
            i14++;
        }
        if (i14 >= length) {
            return null;
        }
        int i15 = i14 + 1;
        while (i15 < length && !e(i15)) {
            i15++;
        }
        return b(i14, i15);
    }

    @Override // kotlin.b
    public final int[] d(int i14) {
        int length = c().length();
        if (length <= 0 || i14 <= 0) {
            return null;
        }
        if (i14 > length) {
            i14 = length;
        }
        while (i14 > 0 && c().charAt(i14 - 1) == '\n' && !e(i14)) {
            i14--;
        }
        if (i14 <= 0) {
            return null;
        }
        int i15 = i14 - 1;
        while (i15 > 0 && (c().charAt(i15) == '\n' || (i15 != 0 && c().charAt(i15 - 1) != '\n'))) {
            i15--;
        }
        return b(i15, i14);
    }

    public final boolean e(int i14) {
        if (i14 <= 0 || c().charAt(i14 - 1) == '\n') {
            return false;
        }
        return i14 == c().length() || c().charAt(i14) == '\n';
    }

    @p005kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li5/f$a;", "", "<init>", "()V", "Li5/f;", "instance", "Li5/f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private f() {
    }
}
