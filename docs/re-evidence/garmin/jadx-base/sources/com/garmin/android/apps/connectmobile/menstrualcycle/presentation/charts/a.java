package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts;

import androidx.core.view.j;
import ds.e0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/charts/a;", "", "", "dateString", "", "totalDays", "pregnancyWindowDays", "periodDays", "gapDays", "fertileWindowDays", "<init>", "(Ljava/lang/String;IIIII)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0688a f38776g = new C0688a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38782f;

    public a(String str, int i14, int i15, int i16, int i17, int i18) {
        str.getClass();
        this.f38777a = str;
        this.f38778b = i14;
        this.f38779c = i15;
        this.f38780d = i16;
        this.f38781e = i17;
        this.f38782f = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38777a.equals(aVar.f38777a) && this.f38778b == aVar.f38778b && this.f38779c == aVar.f38779c && this.f38780d == aVar.f38780d && this.f38781e == aVar.f38781e && this.f38782f == aVar.f38782f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38782f) + q2.d(this.f38781e, q2.d(this.f38780d, q2.d(this.f38779c, q2.d(this.f38778b, this.f38777a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = j.k(this.f38778b, "CycleBarData(dateString=", this.f38777a, ", totalDays=", ", pregnancyWindowDays=");
        e0.m(this.f38779c, this.f38780d, ", periodDays=", ", gapDays=", sbK);
        return j.e(this.f38781e, this.f38782f, ", fertileWindowDays=", ")", sbK);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/charts/a$a;", "", "<init>", "()V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0688a {
        public /* synthetic */ C0688a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0688a() {
        }
    }
}
