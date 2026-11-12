package yl;

import android.graphics.Bitmap;
import j53.l;
import m92.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyl/c;", "", "Li53/c;", "Lm92/h0$e$c;", "spo2ChartData", "Lm92/h0$e$a;", "elevationChartData", "", "maxElevationValue", "", "chartXAxisLabels", "Li53/d;", "", "Landroid/graphics/Bitmap;", "timelineImages", "Lyl/b;", "chartHoverEntries", "<init>", "(Li53/c;Li53/c;FLi53/c;Li53/d;Li53/d;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.c> f197633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<h0.e.a> f197634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f197635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<String> f197636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.d<Integer, Bitmap> f197637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.d<Integer, b> f197638f;

    public c(i53.c cVar, i53.c cVar2, float f14, i53.c cVar3, i53.d dVar, i53.d dVar2, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.b() : cVar, (i14 & 2) != 0 ? l.b() : cVar2, f14, (i14 & 8) != 0 ? l.b() : cVar3, (i14 & 16) != 0 ? i53.a.c() : dVar, (i14 & 32) != 0 ? i53.a.c() : dVar2);
    }

    public final boolean a() {
        return (this.f197633a.isEmpty() && this.f197634b.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f197633a, cVar.f197633a) && s.g(this.f197634b, cVar.f197634b) && Float.compare(this.f197635c, cVar.f197635c) == 0 && s.g(this.f197636d, cVar.f197636d) && s.g(this.f197637e, cVar.f197637e) && s.g(this.f197638f, cVar.f197638f);
    }

    public final int hashCode() {
        return this.f197638f.hashCode() + l2.b(this.f197637e, l2.a(this.f197636d, q6.f.d(this.f197635c, l2.a(this.f197634b, this.f197633a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "PulseOxAcclimationDailyReportChartState(spo2ChartData=" + this.f197633a + ", elevationChartData=" + this.f197634b + ", maxElevationValue=" + this.f197635c + ", chartXAxisLabels=" + this.f197636d + ", timelineImages=" + this.f197637e + ", chartHoverEntries=" + this.f197638f + ")";
    }

    public c(i53.c<h0.e.c> cVar, i53.c<h0.e.a> cVar2, float f14, i53.c<String> cVar3, i53.d<Integer, Bitmap> dVar, i53.d<Integer, b> dVar2) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        dVar.getClass();
        dVar2.getClass();
        this.f197633a = cVar;
        this.f197634b = cVar2;
        this.f197635c = f14;
        this.f197636d = cVar3;
        this.f197637e = dVar;
        this.f197638f = dVar2;
    }
}
