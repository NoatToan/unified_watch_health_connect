package m50;

import java.util.List;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
public interface b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm50/b$a;", "Lm50/b;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f116642a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -946366549;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    /* JADX INFO: renamed from: m50.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm50/b$b;", "Lm50/b;", "", "Lfn0/a;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2218b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.a> f116643a;

        public C2218b(List<fn0.a> list) {
            list.getClass();
            this.f116643a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2218b) && this.f116643a.equals(((C2218b) obj).f116643a);
        }

        public final int hashCode() {
            return this.f116643a.hashCode();
        }

        public final String toString() {
            return k.h("ShowHazardsOnMap(hazards=", ")", this.f116643a);
        }
    }
}
