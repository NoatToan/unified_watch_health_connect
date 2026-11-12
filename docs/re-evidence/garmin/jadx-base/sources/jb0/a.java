package jb0;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Ljb0/a;", "", "Ljb0/b;", "source", "<init>", "(Ljb0/b;)V", "a", "b", "Ljb0/a$a;", "Ljb0/a$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb0.b f98100a;

    /* JADX INFO: renamed from: jb0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljb0/a$a;", "Ljb0/a;", "Ljb0/b;", "picSource", "<init>", "(Ljb0/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1877a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jb0.b f98101b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1877a(jb0.b bVar) {
            super(bVar, null);
            bVar.getClass();
            this.f98101b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1877a) && this.f98101b == ((C1877a) obj).f98101b;
        }

        public final int hashCode() {
            return this.f98101b.hashCode();
        }

        public final String toString() {
            return "Rationale(picSource=" + this.f98101b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljb0/a$b;", "Ljb0/a;", "Ljb0/b;", "picSource", "<init>", "(Ljb0/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jb0.b f98102b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jb0.b bVar) {
            super(bVar, null);
            bVar.getClass();
            this.f98102b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f98102b == ((b) obj).f98102b;
        }

        public final int hashCode() {
            return this.f98102b.hashCode();
        }

        public final String toString() {
            return "Required(picSource=" + this.f98102b + ")";
        }
    }

    private a(jb0.b bVar) {
        this.f98100a = bVar;
    }

    public /* synthetic */ a(jb0.b bVar, j jVar) {
        this(bVar);
    }
}
