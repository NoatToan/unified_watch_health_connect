package rq;

import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrq/a;", "", "<init>", "()V", "a", "b", "Lrq/a$a;", "Lrq/a$b;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: rq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrq/a$a;", "Header", "Lrq/a;", "data", "<init>", "(Ljava/lang/Object;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2917a<Header> extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Header f154106a;

        public C2917a(Header header) {
            super(null);
            this.f154106a = header;
            hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2917a) && s.g(this.f154106a, ((C2917a) obj).f154106a);
        }

        public final int hashCode() {
            Header header = this.f154106a;
            if (header == null) {
                return 0;
            }
            return header.hashCode();
        }

        public final String toString() {
            return e.f("Header(data=", ")", this.f154106a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrq/a$b;", "Row", "Lrq/a;", "data", "<init>", "(Ljava/lang/Object;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<Row> extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Row f154107a;

        public b(Row row) {
            super(null);
            this.f154107a = row;
            hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f154107a, ((b) obj).f154107a);
        }

        public final int hashCode() {
            Row row = this.f154107a;
            if (row == null) {
                return 0;
            }
            return row.hashCode();
        }

        public final String toString() {
            return e.f("Row(data=", ")", this.f154107a);
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
