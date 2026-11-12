package s30;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013BS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ls30/f;", "", "", "originLat", "originLng", "metersPerDegreeLng", "maxToleranceMeters", "cellSizeMeters", "", "oppositeBearingToleranceDegrees", "", "", "", "Ls30/f$c;", "cells", "<init>", "(DDDDDFLjava/util/Map;)V", "c", "b", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f156429h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f156430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f156431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f156432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f156433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f156434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f156435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Long, List<c>> f156436g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls30/f$b;", "", "", "distanceSquared", "fraction", "<init>", "(DD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f156437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f156438b;

        public b(double d14, double d15) {
            this.f156437a = d14;
            this.f156438b = d15;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls30/f$c;", "", "", "x0", "y0", "x1", "y1", "", "bearing", "routeDistanceMeters", "lengthMeters", "<init>", "(DDDDFDD)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f156439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f156440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f156441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f156442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f156443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f156444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f156445g;

        public c(double d14, double d15, double d16, double d17, float f14, double d18, double d19) {
            this.f156439a = d14;
            this.f156440b = d15;
            this.f156441c = d16;
            this.f156442d = d17;
            this.f156443e = f14;
            this.f156444f = d18;
            this.f156445g = d19;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private f(double d14, double d15, double d16, double d17, double d18, float f14, Map<Long, ? extends List<c>> map) {
        this.f156430a = d14;
        this.f156431b = d15;
        this.f156432c = d16;
        this.f156433d = d17;
        this.f156434e = d18;
        this.f156435f = f14;
        this.f156436g = map;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Ls30/f$a;", "", "<init>", "()V", "", "METERS_PER_DEGREE_LAT", "D", "METERS_PER_DEGREE_LNG_AT_EQUATOR", "MIN_CELL_SIZE_METERS", "MIN_SEGMENT_LENGTH_METERS", "MIN_VISIT_SEPARATION_METERS", "VISIT_SEPARATION_TOLERANCE_FACTOR", "", "DEFAULT_TOLERANCE_PX", "F", "DEFAULT_MAX_TOLERANCE_METERS", "DEFAULT_OPPOSITE_BEARING_TOLERANCE_DEGREES", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(double d14, double d15, double d16, double d17, double d18, float f14, Map map, j jVar) {
        this(d14, d15, d16, d17, d18, f14, map);
    }
}
