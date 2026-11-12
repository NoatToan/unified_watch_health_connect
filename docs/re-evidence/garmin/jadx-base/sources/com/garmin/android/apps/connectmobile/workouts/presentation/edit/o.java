package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Intent;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
public interface o extends r52.a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "message", "", "showSnackBar", "<init>", "(Ljava/lang/String;Z)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49209b;

        public a(String str, boolean z14) {
            str.getClass();
            this.f49208a = str;
            this.f49209b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49208a.equals(aVar.f49208a) && this.f49209b == aVar.f49209b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f49209b) + (this.f49208a.hashCode() * 31);
        }

        public final String toString() {
            return n23.j.g("DisplaySnackbar(message=", this.f49208a, ", showSnackBar=", this.f49209b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "repeatNode", "", "isRoundTypeEditEnabled", "skipLastRestStep", "isSkipLastRestClicked", "Lm52/d;", "lastNodeStepType", "<init>", "(Ll52/i$a;ZLjava/lang/Boolean;ZLm52/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f49212c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f49213d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m52.d f49214e;

        public b(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, boolean z14, Boolean bool, boolean z15, m52.d dVar) {
            this.f49210a = aVar;
            this.f49211b = z14;
            this.f49212c = bool;
            this.f49213d = z15;
            this.f49214e = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f49210a, bVar.f49210a) && this.f49211b == bVar.f49211b && p005kotlin.jvm.internal.s.g(this.f49212c, bVar.f49212c) && this.f49213d == bVar.f49213d && this.f49214e == bVar.f49214e;
        }

        public final int hashCode() {
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar = this.f49210a;
            int iG = q6.f.g((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f49211b);
            Boolean bool = this.f49212c;
            int iG2 = q6.f.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f49213d);
            m52.d dVar = this.f49214e;
            return iG2 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final String toString() {
            return "EditRoundCondition(repeatNode=" + this.f49210a + ", isRoundTypeEditEnabled=" + this.f49211b + ", skipLastRestStep=" + this.f49212c + ", isSkipLastRestClicked=" + this.f49213d + ", lastNodeStepType=" + this.f49214e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f49215a;

        public c(Intent intent) {
            intent.getClass();
            this.f49215a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f49215a.equals(((c) obj).f49215a);
        }

        public final int hashCode() {
            return this.f49215a.hashCode();
        }

        public final String toString() {
            return "EditStep(intent=" + this.f49215a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$d;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "textNote", "", "shouldEnforceCharacterLimit", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "audioNote", "<init>", "(Ljava/lang/String;ZLcom/garmin/android/apps/connectmobile/workouts/data/model/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.a f49218c;

        static {
            Parcelable.Creator<com.garmin.android.apps.connectmobile.workouts.data.model.a> creator = com.garmin.android.apps.connectmobile.workouts.data.model.a.CREATOR;
        }

        public d(String str, boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar) {
            this.f49216a = str;
            this.f49217b = z14;
            this.f49218c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f49216a, dVar.f49216a) && this.f49217b == dVar.f49217b && p005kotlin.jvm.internal.s.g(this.f49218c, dVar.f49218c);
        }

        public final int hashCode() {
            String str = this.f49216a;
            int iG = q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f49217b);
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.f49218c;
            return iG + (aVar != null ? aVar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbD = zl.a.d("EditWorkoutNotes(textNote=", this.f49216a, ", shouldEnforceCharacterLimit=", this.f49217b, ", audioNote=");
            sbD.append(this.f49218c);
            sbD.append(")");
            return sbD.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$e;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "poolLength", "<init>", "(Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d f49219a;

        public e(com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar) {
            dVar.getClass();
            this.f49219a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f49219a.equals(((e) obj).f49219a);
        }

        public final int hashCode() {
            return this.f49219a.hashCode();
        }

        public final String toString() {
            return "PoolSizeClicked(poolLength=" + this.f49219a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$f;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "workoutId", "", "workoutName", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "segmentContext", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f49220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g f49222c;

        public f(Long l14, String str, com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar) {
            gVar.getClass();
            this.f49220a = l14;
            this.f49221b = str;
            this.f49222c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f49220a, fVar.f49220a) && p005kotlin.jvm.internal.s.g(this.f49221b, fVar.f49221b) && this.f49222c.equals(fVar.f49222c);
        }

        public final int hashCode() {
            Long l14 = this.f49220a;
            int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
            String str = this.f49221b;
            return this.f49222c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbJ = b71.i.j("PreSaveStepsComplete(workoutId=", ", workoutName=", this.f49221b, this.f49220a, ", segmentContext=");
            sbJ.append(this.f49222c);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$g;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "titleTextRes", "messageTextRes", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "repeatNode", "<init>", "(IILl52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49225c;

        public g(int i14, int i15, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            aVar.getClass();
            this.f49223a = i14;
            this.f49224b = i15;
            this.f49225c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f49223a == gVar.f49223a && this.f49224b == gVar.f49224b && this.f49225c.equals(gVar.f49225c);
        }

        public final int hashCode() {
            return this.f49225c.hashCode() + q2.d(this.f49224b, Integer.hashCode(this.f49223a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbJ = e5.j(this.f49223a, this.f49224b, "ShowDeleteRepeatDialog(titleTextRes=", ", messageTextRes=", ", repeatNode=");
            sbJ.append(this.f49225c);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$h;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Lm52/k;", "workoutSportType", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "stepNode", "<init>", "(Lm52/k;Ll52/i$a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m52.k f49226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49227b;

        public h(m52.k kVar, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
            kVar.getClass();
            aVar.getClass();
            this.f49226a = kVar;
            this.f49227b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f49226a == hVar.f49226a && this.f49227b.equals(hVar.f49227b);
        }

        public final int hashCode() {
            return this.f49227b.hashCode() + (this.f49226a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowDeleteStepDialog(workoutSportType=" + this.f49226a + ", stepNode=" + this.f49227b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$i;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f49228a = new i();

        private i() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1347649811;
        }

        public final String toString() {
            return "ShowEmptyRepeatDialog";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$j;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f49229a = new j();

        private j() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -591104189;
        }

        public final String toString() {
            return "ShowNonCompliantWorkoutStepsDialog";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$k;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Ll52/i$a;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "repeatNode", "", "skipLastRest", "", "skipRestStepType", "", "default", "<init>", "(Ll52/i$a;Ljava/lang/Boolean;Ljava/lang/String;I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f49231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f49232c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49233d;

        public k(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, Boolean bool, String str, int i14) {
            aVar.getClass();
            this.f49230a = aVar;
            this.f49231b = bool;
            this.f49232c = str;
            this.f49233d = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f49230a.equals(kVar.f49230a) && p005kotlin.jvm.internal.s.g(this.f49231b, kVar.f49231b) && p005kotlin.jvm.internal.s.g(this.f49232c, kVar.f49232c) && this.f49233d == kVar.f49233d;
        }

        public final int hashCode() {
            int iHashCode = this.f49230a.hashCode() * 31;
            Boolean bool = this.f49231b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f49232c;
            return Integer.hashCode(this.f49233d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ShowRepeatNumberSheet(repeatNode=" + this.f49230a + ", skipLastRest=" + this.f49231b + ", skipRestStepType=" + this.f49232c + ", default=" + this.f49233d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$l;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "audioUrl", "audioFile", "Lkotlin/Function0;", "", "playFunc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f49236c;

        public l(String str, String str2, e23.a<Unit> aVar) {
            str.getClass();
            str2.getClass();
            aVar.getClass();
            this.f49234a = str;
            this.f49235b = str2;
            this.f49236c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f49234a.equals(lVar.f49234a) && this.f49235b.equals(lVar.f49235b) && this.f49236c.equals(lVar.f49236c);
        }

        public final int hashCode() {
            return this.f49236c.hashCode() + wr.g.j(this.f49234a.hashCode() * 31, 31, this.f49235b);
        }

        public final String toString() {
            return n23.j.i(p6.b.i("ShowRetryDownloadAudioNoteDialog(audioUrl=", this.f49234a, ", audioFile=", this.f49235b, ", playFunc="), this.f49236c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$m;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f49237a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1610049706;
        }

        public final String toString() {
            return "ShowRetryUploadAudioNoteDialog";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$n;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "Lm52/k;", "workoutSportsType", "<init>", "(Lm52/k;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m52.k f49238a;

        public n(m52.k kVar) {
            kVar.getClass();
            this.f49238a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f49238a == ((n) obj).f49238a;
        }

        public final int hashCode() {
            return this.f49238a.hashCode();
        }

        public final String toString() {
            return "ShowSelectExerciseAlertDialog(workoutSportsType=" + this.f49238a + ")";
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.o$o, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$o;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "messageTextRes", "<init>", "(I)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0966o implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49239a;

        public C0966o(int i14) {
            this.f49239a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0966o) && this.f49239a == ((C0966o) obj).f49239a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f49239a);
        }

        public final String toString() {
            return v.e0.f(this.f49239a, "ShowStepLimitExceededDialog(messageTextRes=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$p;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f49240a = new p();

        private p() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return -2026397926;
        }

        public final String toString() {
            return "UnusedAudioNoteClearComplete";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f49241a = new q();

        private q() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return -684815920;
        }

        public final String toString() {
            return "WorkoutCreateFailed";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$r;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "", "targetDeviceIdToSendWorkoutTo", "workoutId", "<init>", "(Ljava/lang/Long;J)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f49242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f49243b;

        public r(Long l14, long j8) {
            this.f49242a = l14;
            this.f49243b = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return p005kotlin.jvm.internal.s.g(this.f49242a, rVar.f49242a) && this.f49243b == rVar.f49243b;
        }

        public final int hashCode() {
            Long l14 = this.f49242a;
            return Long.hashCode(this.f49243b) + ((l14 == null ? 0 : l14.hashCode()) * 31);
        }

        public final String toString() {
            return "WorkoutSaveComplete(targetDeviceIdToSendWorkoutTo=" + this.f49242a + ", workoutId=" + this.f49243b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o$s;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/o;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f49244a = new s();

        private s() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return 1134121949;
        }

        public final String toString() {
            return "WorkoutUpdateFailed";
        }
    }
}
