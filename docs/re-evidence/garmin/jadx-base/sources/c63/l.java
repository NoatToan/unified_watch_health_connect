package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/l;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f25004a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e63.b0<k> f25005b = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.l.a
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return ((k) obj).getDay();
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((k) obj).i((Integer) obj2);
        }
    }, null, 2, null), 1, 31, null, null, null, 56, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e63.b0<k> f25006c = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.l.c
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return ((k) obj).getDayOfWeek();
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((k) obj).j((Integer) obj2);
        }
    }, null, 2, null), 1, 7, null, null, null, 56, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e63.b0<k> f25007d = new e63.b0<>(new e63.w(new p005kotlin.jvm.internal.b0() { // from class: c63.l.b
        @Override // p005kotlin.jvm.internal.b0, k23.n
        public final Object get(Object obj) {
            return ((k) obj).getDayOfYear();
        }

        @Override // p005kotlin.jvm.internal.b0, k23.j
        public final void p(Object obj, Object obj2) {
            ((k) obj).l((Integer) obj2);
        }
    }, null, 2, null), 1, 366, null, null, null, 56, null);

    private l() {
    }
}
