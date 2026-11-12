package ie2;

import android.graphics.Color;
import java.util.Collection;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lie2/h;", "Lie2/u;", "", "Lcom/garmin/android/library/mapsdkadapter/s;", "weightedData", "Lie2/g;", "gradient", "", "opacity", "maxIntensity", "", "radius", "<init>", "(Ljava/util/Collection;Lie2/g;DDI)V", "a", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection<com.garmin.android.library.mapsdkadapter.s> f93125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f93126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f93127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f93128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93129e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lie2/h$a;", "", "<init>", "()V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Collection<com.garmin.android.library.mapsdkadapter.s> f93130a = j0.f134944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f93131b = new g(new int[]{Color.rgb(102, 255, 0), Color.rgb(255, 0, 0)}, new float[]{0.2f, 1.0f});

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f93132c = 0.6d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f93133d = Double.MAX_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f93134e = 20;

        public final h a() {
            return new h(this.f93130a, this.f93131b, this.f93132c, this.f93133d, this.f93134e, null);
        }

        public final void b(Collection collection) {
            collection.getClass();
            if (collection.isEmpty()) {
                vb.h.s("No input points");
            } else {
                this.f93130a = collection;
            }
        }
    }

    private h(Collection<com.garmin.android.library.mapsdkadapter.s> collection, g gVar, double d14, double d15, int i14) {
        this.f93125a = collection;
        this.f93126b = gVar;
        this.f93127c = d14;
        this.f93128d = d15;
        this.f93129e = i14;
    }

    public /* synthetic */ h(Collection collection, g gVar, double d14, double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(collection, gVar, d14, d15, i14);
    }
}
