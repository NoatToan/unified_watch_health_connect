package w5;

import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public interface w0 extends x3<Object> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw5/w0$a;", "Lw5/w0;", "Lp3/x3;", "", "Lw5/i;", "current", "<init>", "(Lw5/i;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements w0, x3<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f182174a;

        public a(i iVar) {
            this.f182174a = iVar;
        }

        @Override // p3.x3
        /* JADX INFO: renamed from: getValue */
        public final Object getF182175a() {
            return this.f182174a.getF182175a();
        }

        @Override // w5.w0
        /* JADX INFO: renamed from: s */
        public final boolean getF182176b() {
            return this.f182174a.f182123g;
        }
    }

    /* JADX INFO: renamed from: s */
    boolean getF182176b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw5/w0$b;", "Lw5/w0;", "", "value", "", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f182175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f182176b;

        public /* synthetic */ b(Object obj, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this(obj, (i14 & 2) != 0 ? true : z14);
        }

        @Override // p3.x3
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final Object getF182175a() {
            return this.f182175a;
        }

        @Override // w5.w0
        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getF182176b() {
            return this.f182176b;
        }

        public b(Object obj, boolean z14) {
            this.f182175a = obj;
            this.f182176b = z14;
        }
    }
}
