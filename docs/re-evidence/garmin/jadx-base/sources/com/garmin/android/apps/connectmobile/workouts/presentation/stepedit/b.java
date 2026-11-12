package com.garmin.android.apps.connectmobile.workouts.presentation.stepedit;

import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import java.util.List;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "powerCurveTargetList", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZones", "<init>", "(Ljava/util/List;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<v> f49620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PowerZonesDTO f49621b;

        public a(List<v> list, PowerZonesDTO powerZonesDTO) {
            this.f49620a = list;
            this.f49621b = powerZonesDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f49620a, aVar.f49620a) && s.g(this.f49621b, aVar.f49621b);
        }

        public final int hashCode() {
            List<v> list = this.f49620a;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            PowerZonesDTO powerZonesDTO = this.f49621b;
            return iHashCode + (powerZonesDTO != null ? powerZonesDTO.hashCode() : 0);
        }

        public final String toString() {
            return "NormalData(powerCurveTargetList=" + this.f49620a + ", powerZones=" + this.f49621b + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b;", "", "isInTimedRepeat", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "benchmarks", "<init>", "(ZLcom/garmin/android/apps/connectmobile/repcounting/model/c;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0980b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.repcounting.model.c f49623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f49624c;

        public C0980b(boolean z14, com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list) {
            cVar.getClass();
            list.getClass();
            this.f49622a = z14;
            this.f49623b = cVar;
            this.f49624c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0980b)) {
                return false;
            }
            C0980b c0980b = (C0980b) obj;
            return this.f49622a == c0980b.f49622a && this.f49623b.equals(c0980b.f49623b) && this.f49624c.equals(c0980b.f49624c);
        }

        public final int hashCode() {
            return this.f49624c.hashCode() + ((this.f49623b.hashCode() + (Boolean.hashCode(this.f49622a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RepCountingData(isInTimedRepeat=");
            sb3.append(this.f49622a);
            sb3.append(", exerciseList=");
            sb3.append(this.f49623b);
            sb3.append(", benchmarks=");
            return z.c(sb3, this.f49624c, ")");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/stepedit/b;", "", "isInRepeat", "", "poolSize", "Lm52/j;", "poolSizeUnit", "poolSizeUnitForUnspecifiedPoolSize", "Lo13/p;", "criticalSwimSpeed", "hasSendOffTimeStep", "hasTargetPaceStep", "<init>", "(ZLjava/lang/Double;Lm52/j;Lm52/j;Lo13/p;ZZ)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f49626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m52.j f49627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final m52.j f49628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p<Boolean, Double> f49629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f49630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f49631g;

        public c(boolean z14, Double d14, m52.j jVar, m52.j jVar2, p<Boolean, Double> pVar, boolean z15, boolean z16) {
            jVar.getClass();
            this.f49625a = z14;
            this.f49626b = d14;
            this.f49627c = jVar;
            this.f49628d = jVar2;
            this.f49629e = pVar;
            this.f49630f = z15;
            this.f49631g = z16;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f49625a == cVar.f49625a && s.g(this.f49626b, cVar.f49626b) && this.f49627c == cVar.f49627c && this.f49628d == cVar.f49628d && s.g(this.f49629e, cVar.f49629e) && this.f49630f == cVar.f49630f && this.f49631g == cVar.f49631g;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f49625a) * 31;
            Double d14 = this.f49626b;
            int iHashCode2 = (this.f49627c.hashCode() + ((iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31)) * 31;
            m52.j jVar = this.f49628d;
            int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
            p<Boolean, Double> pVar = this.f49629e;
            return Boolean.hashCode(this.f49631g) + q6.f.g((iHashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 31, 31, this.f49630f);
        }

        public final String toString() {
            boolean z14 = this.f49630f;
            boolean z15 = this.f49631g;
            StringBuilder sb3 = new StringBuilder("SwimmingData(isInRepeat=");
            sb3.append(this.f49625a);
            sb3.append(", poolSize=");
            sb3.append(this.f49626b);
            sb3.append(", poolSizeUnit=");
            sb3.append(this.f49627c);
            sb3.append(", poolSizeUnitForUnspecifiedPoolSize=");
            sb3.append(this.f49628d);
            sb3.append(", criticalSwimSpeed=");
            sb3.append(this.f49629e);
            sb3.append(", hasSendOffTimeStep=");
            sb3.append(z14);
            sb3.append(", hasTargetPaceStep=");
            return hb.a.k(sb3, z15, ")");
        }
    }
}
