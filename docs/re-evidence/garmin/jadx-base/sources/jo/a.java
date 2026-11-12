package jo;

import am.j;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Ljo/a;", "", "", "messageResId", "<init>", "(I)V", "c", "b", "a", "Ljo/a$a;", "Ljo/a$b;", "Ljo/a$c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99689a;

    /* JADX INFO: renamed from: jo.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljo/a$a;", "Ljo/a;", "", "min", "max", "<init>", "(II)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1915a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99691c;

        public C1915a(int i14, int i15) {
            super(R.string.message_error_min_out_of_range, null);
            this.f99690b = i14;
            this.f99691c = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1915a)) {
                return false;
            }
            C1915a c1915a = (C1915a) obj;
            return this.f99690b == c1915a.f99690b && this.f99691c == c1915a.f99691c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99691c) + (Integer.hashCode(this.f99690b) * 31);
        }

        public final String toString() {
            return j.g(this.f99690b, this.f99691c, "InvalidRange(min=", ", max=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/a$b;", "Ljo/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f99692b = new b();

        private b() {
            super(R.string.filter_error_max_too_low, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljo/a$c;", "Ljo/a;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f99693b = new c();

        private c() {
            super(R.string.filter_error_min_too_high, null);
        }
    }

    private a(int i14) {
        this.f99689a = i14;
    }

    public final Object[] a() {
        if (!(this instanceof C1915a)) {
            return new Object[0];
        }
        C1915a c1915a = (C1915a) this;
        return new Object[]{Integer.valueOf(c1915a.f99690b), Integer.valueOf(c1915a.f99691c)};
    }

    public /* synthetic */ a(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }
}
