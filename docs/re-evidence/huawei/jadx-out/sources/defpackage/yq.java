package defpackage;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class yq implements Serializable {
    private static final long serialVersionUID = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Nulls f53747c;
    protected final String e;
    protected final String f;
    protected Nulls g;
    protected final Boolean h;
    protected final transient d i;
    protected final Integer j;
    public static final yq d = new yq(Boolean.TRUE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq f53745a = new yq(Boolean.FALSE, null, null, null, null, null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yq f53746b = new yq(null, null, null, null, null, null, null);

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f53748a;
        public final AnnotatedMember d;

        protected d(AnnotatedMember annotatedMember, boolean z) {
            this.d = annotatedMember;
            this.f53748a = z;
        }

        public static d a(AnnotatedMember annotatedMember) {
            return new d(annotatedMember, true);
        }

        public static d d(AnnotatedMember annotatedMember) {
            return new d(annotatedMember, false);
        }

        public static d b(AnnotatedMember annotatedMember) {
            return new d(annotatedMember, false);
        }
    }

    protected yq(Boolean bool, String str, Integer num, String str2, d dVar, Nulls nulls, Nulls nulls2) {
        this.h = bool;
        this.f = str;
        this.j = num;
        this.e = (str2 == null || str2.isEmpty()) ? null : str2;
        this.i = dVar;
        this.g = nulls;
        this.f53747c = nulls2;
    }

    public static yq e(Boolean bool, String str, Integer num, String str2) {
        if (str != null || num != null || str2 != null) {
            return new yq(bool, str, num, str2, null, null, null);
        }
        if (bool == null) {
            return f53746b;
        }
        return bool.booleanValue() ? d : f53745a;
    }

    protected Object readResolve() {
        if (this.f != null || this.j != null || this.e != null || this.i != null || this.g != null || this.f53747c != null) {
            return this;
        }
        Boolean bool = this.h;
        if (bool == null) {
            return f53746b;
        }
        return bool.booleanValue() ? d : f53745a;
    }

    public yq b(String str) {
        return new yq(this.h, str, this.j, this.e, this.i, this.g, this.f53747c);
    }

    public yq c(d dVar) {
        return new yq(this.h, this.f, this.j, this.e, dVar, this.g, this.f53747c);
    }

    public yq e(Nulls nulls, Nulls nulls2) {
        return new yq(this.h, this.f, this.j, this.e, this.i, nulls, nulls2);
    }

    public boolean g() {
        Boolean bool = this.h;
        return bool != null && bool.booleanValue();
    }

    public Integer d() {
        return this.j;
    }

    public boolean e() {
        return this.j != null;
    }

    public d a() {
        return this.i;
    }

    public Nulls c() {
        return this.g;
    }

    public Nulls b() {
        return this.f53747c;
    }
}
