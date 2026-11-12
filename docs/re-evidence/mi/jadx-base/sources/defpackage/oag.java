package defpackage;

import com.google.common.collect.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class oag<K0, V0> {

    public class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28925a;

        public a(int i) {
            this.f28925a = i;
        }

        @Override // oag.e
        public <K, V> Map<K, Collection<V>> c() {
            return d0i.c(this.f28925a);
        }
    }

    public class b extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f28926a;

        public b(Comparator comparator) {
            this.f28926a = comparator;
        }

        @Override // oag.e
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f28926a);
        }
    }

    public static final class c<V> implements spo<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f28927a;

        public c(int i) {
            this.f28927a = d44.b(i, "expectedValuesPerKey");
        }

        @Override // defpackage.spo
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f28927a);
        }
    }

    public static abstract class d<K0, V0> extends oag<K0, V0> {
        public d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> wge<K, V> e();
    }

    public static abstract class e<K0> {

        public class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f28928a;

            public a(int i) {
                this.f28928a = i;
            }

            @Override // oag.d
            public <K extends K0, V> wge<K, V> e() {
                return t.b(e.this.c(), new c(this.f28928a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i) {
            d44.b(i, "expectedValuesPerKey");
            return new a(i);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    public oag() {
    }

    public /* synthetic */ oag(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i) {
        d44.b(i, "expectedKeys");
        return new a(i);
    }

    public static e<Comparable> c() {
        return d(ich.e());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        c6i.o(comparator);
        return new b(comparator);
    }
}
