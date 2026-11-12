package z0;

import android.util.Range;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range<Integer> f200592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f200593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f200594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f200595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f200596g;

    private c(Range<Integer> range, int i14, int i15, Range<Integer> range2, int i16) {
        this.f200592c = range;
        this.f200593d = i14;
        this.f200594e = i15;
        this.f200595f = range2;
        this.f200596g = i16;
    }

    @Override // z0.a
    public final Range<Integer> b() {
        return this.f200592c;
    }

    @Override // z0.a
    public final int c() {
        return this.f200596g;
    }

    @Override // z0.a
    public final Range<Integer> d() {
        return this.f200595f;
    }

    @Override // z0.a
    public final int e() {
        return this.f200594e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0.a)) {
            return false;
        }
        z0.a aVar = (z0.a) obj;
        return this.f200592c.equals(aVar.b()) && this.f200593d == aVar.f() && this.f200594e == aVar.e() && this.f200595f.equals(aVar.d()) && this.f200596g == aVar.c();
    }

    @Override // z0.a
    public final int f() {
        return this.f200593d;
    }

    public final int hashCode() {
        return ((((((((this.f200592c.hashCode() ^ 1000003) * 1000003) ^ this.f200593d) * 1000003) ^ this.f200594e) * 1000003) ^ this.f200595f.hashCode()) * 1000003) ^ this.f200596g;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioSpec{bitrate=");
        sb3.append(this.f200592c);
        sb3.append(", sourceFormat=");
        sb3.append(this.f200593d);
        sb3.append(", source=");
        sb3.append(this.f200594e);
        sb3.append(", sampleRate=");
        sb3.append(this.f200595f);
        sb3.append(", channelCount=");
        return am.j.q(sb3, this.f200596g, StringSubstitutor.DEFAULT_VAR_END);
    }

    public static final class b extends z0.a.AbstractC3749a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Range<Integer> f200597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f200598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f200599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Range<Integer> f200600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f200601e;

        private b(z0.a aVar) {
            this.f200597a = aVar.b();
            this.f200598b = Integer.valueOf(aVar.f());
            this.f200599c = Integer.valueOf(aVar.e());
            this.f200600d = aVar.d();
            this.f200601e = Integer.valueOf(aVar.c());
        }

        public final c a() {
            String strConcat = this.f200597a == null ? " bitrate" : "";
            if (this.f200598b == null) {
                strConcat = strConcat.concat(" sourceFormat");
            }
            if (this.f200599c == null) {
                strConcat = strConcat.concat(" source");
            }
            if (this.f200600d == null) {
                strConcat = strConcat.concat(" sampleRate");
            }
            if (this.f200601e == null) {
                strConcat = strConcat.concat(" channelCount");
            }
            if (strConcat.isEmpty()) {
                return new c(this.f200597a, this.f200598b.intValue(), this.f200599c.intValue(), this.f200600d, this.f200601e.intValue());
            }
            vb.h.z("Missing required properties:".concat(strConcat));
            return null;
        }

        public b() {
        }
    }
}
