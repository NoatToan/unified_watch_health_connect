package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import c2.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.google.android.flexbox.FlexItem;
import com.google.android.gms.identity.intents.AddressConstants;
import f2.o0;
import f62.l0;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.r0;
import p006l2.w2;
import r53.o2;
import r53.p2;
import r53.q2;
import w52.q1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r;", "Landroidx/lifecycle/u1;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "<init>", "()V", "d", "a", "c", "b", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class r extends u1 implements com.garmin.android.apps.connectmobile.workouts.presentation.edit.p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final m52.j f49273q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m52.j f49278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f49280g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f49282i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f49284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> f49285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> f49286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> f49287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> f49288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49289p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l52.y f49274a = (l52.y) KoinJavaComponent.get$default(l52.y.class, null, null, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f49275b = o13.m.b(new ey0.a(25));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f49276c = o13.m.b(new ey0.a(26));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f49277d = o13.m.b(new ey0.a(27));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f49281h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f49283j = new d(null, null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012$\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r$a;", "", "", "audioDirectory", "Lkotlin/Function3;", "Lt13/d;", "", "downloadAudioNoteFunc", "Lkotlin/Function2;", "Ljava/io/File;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "uploadAudioNoteFunc", "Lk23/i;", "audioFileToUploadProperty", "<init>", "(Ljava/lang/String;Le23/q;Le23/p;Lk23/i;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.q<String, String, t13.d<? super Boolean>, Object> f49291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> f49292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final k23.i<File> f49293d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, e23.q<? super String, ? super String, ? super t13.d<? super Boolean>, ? extends Object> qVar, e23.p<? super File, ? super t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, ? extends Object> pVar, k23.i<File> iVar) {
            str.getClass();
            qVar.getClass();
            pVar.getClass();
            iVar.getClass();
            this.f49290a = str;
            this.f49291b = qVar;
            this.f49292c = pVar;
            this.f49293d = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF49290a() {
            return this.f49290a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f49290a.equals(aVar.f49290a) && this.f49291b.equals(aVar.f49291b) && this.f49292c.equals(aVar.f49292c) && this.f49293d.equals(aVar.f49293d);
        }

        public final int hashCode() {
            return this.f49293d.hashCode() + ((this.f49292c.hashCode() + ((this.f49291b.hashCode() + (this.f49290a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "AudioNoteHandler(audioDirectory=" + this.f49290a + ", downloadAudioNoteFunc=" + this.f49291b + ", uploadAudioNoteFunc=" + this.f49292c + ", audioFileToUploadProperty=" + this.f49293d + ")";
        }
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0018\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r$c;", "", "Lm52/k;", "workoutSportType", "Lm52/l;", "workoutSubType", "", "targetDeviceIdToSendWorkoutTo", "workoutId", "", "workoutName", "Ll52/i;", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/j0;", "workoutSteps", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;", "stepGenerator", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "powerCurveTargetDTOList", "Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;", "powerZonesDTO", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/b;", "benchmarkList", "workoutNote", "", "hasTrainingPlan", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;", "poolLength", "Lf62/o;", "timeDistance", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;", "segmentContext", "isAtpWorkout", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/a;", "workoutAudioNote", "<init>", "(Lm52/k;Lm52/l;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ll52/i;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/k0$a;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/settings/user/PowerZonesDTO;Ljava/util/List;Ljava/lang/String;ZLcom/garmin/android/apps/connectmobile/workouts/presentation/edit/d;Lf62/o;Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/g;ZLcom/garmin/android/apps/connectmobile/workouts/data/model/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m52.k f49294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m52.l f49295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f49296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f49297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f49298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k0.a f49300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> f49301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final PowerZonesDTO f49302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> f49303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f49304k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f49305l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d f49306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final f62.o f49307n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g f49308o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f49309p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.a f49310q;

        public c(m52.k kVar, m52.l lVar, Long l14, Long l15, String str, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, k0.a aVar, List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list, PowerZonesDTO powerZonesDTO, List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2, String str2, boolean z14, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, f62.o oVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar, boolean z15, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2) {
            kVar.getClass();
            iVar.getClass();
            aVar.getClass();
            dVar.getClass();
            oVar.getClass();
            gVar.getClass();
            this.f49294a = kVar;
            this.f49295b = lVar;
            this.f49296c = l14;
            this.f49297d = l15;
            this.f49298e = str;
            this.f49299f = iVar;
            this.f49300g = aVar;
            this.f49301h = list;
            this.f49302i = powerZonesDTO;
            this.f49303j = list2;
            this.f49304k = str2;
            this.f49305l = z14;
            this.f49306m = dVar;
            this.f49307n = oVar;
            this.f49308o = gVar;
            this.f49309p = z15;
            this.f49310q = aVar2;
        }

        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.b> a() {
            return this.f49303j;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getF49305l() {
            return this.f49305l;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.d getF49306m() {
            return this.f49306m;
        }

        public final List<com.garmin.android.apps.connectmobile.workouts.data.model.v> d() {
            return this.f49301h;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.presentation.edit.g getF49308o() {
            return this.f49308o;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f49294a == cVar.f49294a && this.f49295b == cVar.f49295b && p005kotlin.jvm.internal.s.g(this.f49296c, cVar.f49296c) && p005kotlin.jvm.internal.s.g(this.f49297d, cVar.f49297d) && p005kotlin.jvm.internal.s.g(this.f49298e, cVar.f49298e) && this.f49299f.equals(cVar.f49299f) && this.f49300g.equals(cVar.f49300g) && p005kotlin.jvm.internal.s.g(this.f49301h, cVar.f49301h) && p005kotlin.jvm.internal.s.g(this.f49302i, cVar.f49302i) && p005kotlin.jvm.internal.s.g(this.f49303j, cVar.f49303j) && p005kotlin.jvm.internal.s.g(this.f49304k, cVar.f49304k) && this.f49305l == cVar.f49305l && this.f49306m.equals(cVar.f49306m) && this.f49307n.equals(cVar.f49307n) && this.f49308o.equals(cVar.f49308o) && this.f49309p == cVar.f49309p && p005kotlin.jvm.internal.s.g(this.f49310q, cVar.f49310q);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k0.a getF49300g() {
            return this.f49300g;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Long getF49296c() {
            return this.f49296c;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final f62.o getF49307n() {
            return this.f49307n;
        }

        public final int hashCode() {
            int iHashCode = this.f49294a.hashCode() * 31;
            m52.l lVar = this.f49295b;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            Long l14 = this.f49296c;
            int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
            Long l15 = this.f49297d;
            int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
            String str = this.f49298e;
            int iHashCode5 = (this.f49300g.hashCode() + ((this.f49299f.hashCode() + ((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = this.f49301h;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            PowerZonesDTO powerZonesDTO = this.f49302i;
            int iHashCode7 = (iHashCode6 + (powerZonesDTO == null ? 0 : powerZonesDTO.hashCode())) * 31;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.b> list2 = this.f49303j;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.f49304k;
            int iG = q6.f.g((this.f49308o.hashCode() + ((this.f49307n.hashCode() + ((this.f49306m.hashCode() + q6.f.g((iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f49305l)) * 31)) * 31)) * 31, 31, this.f49309p);
            com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = this.f49310q;
            return iG + (aVar != null ? aVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final com.garmin.android.apps.connectmobile.workouts.data.model.a getF49310q() {
            return this.f49310q;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Long getF49297d() {
            return this.f49297d;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getF49298e() {
            return this.f49298e;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getF49304k() {
            return this.f49304k;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final m52.k getF49294a() {
            return this.f49294a;
        }

        public final l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> n() {
            return this.f49299f;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final m52.l getF49295b() {
            return this.f49295b;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getF49309p() {
            return this.f49309p;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Context(workoutSportType=");
            sb3.append(this.f49294a);
            sb3.append(", workoutSubType=");
            sb3.append(this.f49295b);
            sb3.append(", targetDeviceIdToSendWorkoutTo=");
            kg.f.s(sb3, this.f49296c, ", workoutId=", this.f49297d, ", workoutName=");
            sb3.append(this.f49298e);
            sb3.append(", workoutSteps=");
            sb3.append(this.f49299f);
            sb3.append(", stepGenerator=");
            sb3.append(this.f49300g);
            sb3.append(", powerCurveTargetDTOList=");
            sb3.append(this.f49301h);
            sb3.append(", powerZonesDTO=");
            sb3.append(this.f49302i);
            sb3.append(", benchmarkList=");
            sb3.append(this.f49303j);
            sb3.append(", workoutNote=");
            v.h.C(this.f49304k, ", hasTrainingPlan=", ", poolLength=", sb3, this.f49305l);
            sb3.append(this.f49306m);
            sb3.append(", timeDistance=");
            sb3.append(this.f49307n);
            sb3.append(", segmentContext=");
            sb3.append(this.f49308o);
            sb3.append(", isAtpWorkout=");
            sb3.append(this.f49309p);
            sb3.append(", workoutAudioNote=");
            sb3.append(this.f49310q);
            sb3.append(")");
            return sb3.toString();
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49315a;

        static {
            int[] iArr = new int[m52.k.values().length];
            try {
                iArr[m52.k.f116754n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.k.f116755o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.k.f116758r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.k.f116759t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m52.k.f116760v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m52.k.f116764z.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m52.k.f116762x.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m52.k.f116761w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m52.k.f116756p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[m52.k.f116763y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f49315a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$addRepeat$1", f = "WorkoutEditCreateViewModel.kt", l = {1502}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49316a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49316a;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = r.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> listH = qVar.f49251g.h();
                l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
                l52.w.a(eVarB, listH);
                this.f49316a = 1;
                if (r.x4(rVar, eVarB, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$addStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1512}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f49318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49319b;

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new g(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> list;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49319b;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                List<l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> listA = qVar.f49251g.a();
                l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
                l52.w.a(eVarB, listA);
                this.f49318a = listA;
                this.f49319b = 1;
                obj = r.x4(rVar, eVarB, this);
                if (obj == aVar) {
                    return aVar;
                }
                list = listA;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = this.f49318a;
                o13.r.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                rVar.L0((l52.i.a) p13.h0.b0(list));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$clickPoolSize$1", f = "WorkoutEditCreateViewModel.kt", l = {1686}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49321a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.d f49323c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, t13.d<? super h> dVar2) {
            super(2, dVar2);
            this.f49323c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new h(this.f49323c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49321a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = r.this.f49287n;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.e eVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.e(this.f49323c);
                this.f49321a = 1;
                if (v52.d.d(wVar, eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$clickRepeatCondition$1", f = "WorkoutEditCreateViewModel.kt", l = {1798}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f49327d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, boolean z14, t13.d<? super i> dVar) {
            super(2, dVar);
            this.f49326c = aVar;
            this.f49327d = z14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new i(this.f49326c, this.f49327d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49324a;
            if (i14 == 0) {
                o13.r.b(obj);
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f49326c;
                l52.g path = aVar2.getPath();
                r rVar = r.this;
                rVar.f49279f = path;
                boolean z14 = aVar2.getHeight() < 2;
                r0 r0Var = new r0();
                l52.o.f(aVar2, new s0(r0Var, 3));
                rVar.f49280g = true;
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.b bVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.b(aVar2, z14, ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData()).f48221g, this.f49327d, (m52.d) r0Var.f105810a);
                this.f49324a = 1;
                if (v52.d.d(wVar, bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$copyStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1536}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49328a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, t13.d<? super j> dVar) {
            super(2, dVar);
            this.f49330c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new j(this.f49330c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49328a;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = r.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f49330c;
                List listC = p13.w.c(r.E4(aVar2));
                l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar.f49250f);
                l52.e.b bVarN3 = ((l52.m) eVarB).n3(aVar2.getPath());
                if (bVarN3 != null) {
                    bVarN3.j(new aq1.d0(listC, 6));
                }
                this.f49328a = 1;
                if (r.x4(rVar, eVarB, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$createWorkout$1", f = "WorkoutEditCreateViewModel.kt", l = {596, 597, 599, 608}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f49333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super k> dVar) {
            super(2, dVar);
            this.f49333c = workoutDetailsDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new k(this.f49333c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x006d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0071  */
        /* JADX WARN: Code duplicated, block: B:33:0x0081  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
        
            if (v52.d.d(r1, r2, r7) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
        
            if (v52.d.d(r8, r1, r7) == r0) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49331a;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f49331a = 1;
                if (wVar.h(bVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar2 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r rVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m)).f49247c, ((WorkoutDetailsDTO) ((v2.b) v2Var).f47386a).f48040a);
                    this.f49331a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar3 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.q qVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.q.f49241a;
                    this.f49331a = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            l52.y yVar = rVar.f49274a;
            this.f49331a = 2;
            obj = yVar.v(this.f49333c, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar4 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r rVar3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m)).f49247c, ((WorkoutDetailsDTO) ((v2.b) v2Var).f47386a).f48040a);
                    this.f49331a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar5 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.q qVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.q.f49241a;
                    this.f49331a = 4;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$downloadAudioNote$1", f = "WorkoutEditCreateViewModel.kt", l = {1692, 1694, 1697, 1702}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49335b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49337d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49338e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f49339f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, e23.a<Unit> aVar, t13.d<? super l> dVar) {
            super(2, dVar);
            this.f49337d = str;
            this.f49338e = str2;
            this.f49339f = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            l lVar = r.this.new l(this.f49337d, this.f49338e, this.f49339f, dVar);
            lVar.f49335b = obj;
            return lVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0077  */
        /* JADX WARN: Code duplicated, block: B:30:0x007b  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r12.h(r0, r11) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        
            if (v52.d.d(r12, r2, r11) == r1) goto L32;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            e23.a<Unit> aVar;
            o53.b0 b0Var = (o53.b0) this.f49335b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49334a;
            String str = this.f49338e;
            String str2 = this.f49337d;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f49335b = b0Var;
                this.f49334a = 1;
                if (wVar.h(bVar, this) != aVar2) {
                }
                return aVar2;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 3) {
                    o13.r.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    aVar = this.f49339f;
                    if (zBooleanValue) {
                        aVar.invoke();
                    } else {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar2 = rVar.f49287n;
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l lVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l(str2, str, aVar);
                        this.f49335b = null;
                        this.f49334a = 4;
                    }
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            a aVar3 = rVar.f49282i;
            if (aVar3 == null) {
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar3 = rVar.f49287n;
                v52.c.a aVar4 = new v52.c.a(null, 1, null);
                this.f49335b = null;
                this.f49334a = 2;
            } else {
                e23.q<String, String, t13.d<? super Boolean>, Object> qVar = aVar3.f49291b;
                this.f49335b = null;
                this.f49334a = 3;
                obj = qVar.invoke(str2, str, this);
                if (obj != aVar2) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    aVar = this.f49339f;
                    if (zBooleanValue) {
                        aVar.invoke();
                    } else {
                        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar4 = rVar.f49287n;
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l lVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.l(str2, str, aVar);
                        this.f49335b = null;
                        this.f49334a = 4;
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$editNotes$1", f = "WorkoutEditCreateViewModel.kt", l = {710}, m = "invokeSuspend", v = 2)
    public static final class m extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49340a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f49343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f49344e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, t13.d<? super m> dVar) {
            super(2, dVar);
            this.f49342c = str;
            this.f49343d = z14;
            this.f49344e = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new m(this.f49342c, this.f49343d, this.f49344e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49340a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = r.this.f49287n;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.d dVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.d(this.f49342c, this.f49343d, this.f49344e);
                this.f49340a = 1;
                if (v52.d.d(wVar, dVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$editRepeatNumber$1", f = "WorkoutEditCreateViewModel.kt", l = {1585}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49345a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49347c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49348a;

            static {
                int[] iArr = new int[m52.d.values().length];
                try {
                    iArr[m52.d.REST.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[m52.d.RECOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f49348a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, t13.d<? super n> dVar) {
            super(2, dVar);
            this.f49347c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new n(this.f49347c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49345a;
            if (i14 == 0) {
                o13.r.b(obj);
                l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f49347c;
                l52.g path = aVar2.getPath();
                r rVar = r.this;
                rVar.f49279f = path;
                r0 r0Var = new r0();
                l52.o.f(aVar2, new s0(r0Var, 4));
                T t7 = r0Var.f105810a;
                String string = null;
                Boolean bool = (t7 == m52.d.RECOVERY || t7 == m52.d.REST) ? ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData()).f48221g : null;
                m52.d dVar = (m52.d) r0Var.f105810a;
                int i15 = dVar == null ? -1 : a.f49348a[dVar.ordinal()];
                if (i15 == 1) {
                    string = rVar.K4().getString(R.string.workout_step_type_rest);
                } else if (i15 == 2) {
                    string = rVar.K4().getString(R.string.workout_step_type_recovery);
                }
                int i16 = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData()).f48219e;
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k kVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.k(aVar2, bool, string, i16);
                this.f49345a = 1;
                if (v52.d.d(wVar, kVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$editStep$1", f = "WorkoutEditCreateViewModel.kt", l = {1076}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49349a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49351c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, t13.d<? super o> dVar) {
            super(2, dVar);
            this.f49351c = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new o(this.f49351c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r51) {
            /*
                Method dump skipped, instruction units count: 658
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$enterReorderMode$1", f = "WorkoutEditCreateViewModel.kt", l = {1816}, m = "invokeSuspend", v = 2)
    public static final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49352a;

        public p(t13.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new p(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49352a;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = r.this;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                rVar.f49289p = qVar.f49250f;
                r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = rVar.f49285l;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L(qVar, null, null, null, null, null, null, true, FlexItem.MAX_SIZE);
                this.f49352a = 1;
                if (v52.d.a(jVar, qVarL, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$move$1", f = "WorkoutEditCreateViewModel.kt", l = {1316}, m = "invokeSuspend", v = 2)
    public static final class q extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49354a;

        public q(t13.d<? super q> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new q(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49354a;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = r.this.f49287n;
                v52.c.C3278c c3278c = new v52.c.C3278c(com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.j.f49229a);
                this.f49354a = 1;
                if (wVar.h(c3278c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.r$r, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$move$2", f = "WorkoutEditCreateViewModel.kt", l = {1323, 1324}, m = "invokeSuspend", v = 2)
    public static final class C0968r extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49356a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q f49358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49359d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0968r(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar, l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar, t13.d<? super C0968r> dVar) {
            super(2, dVar);
            this.f49358c = qVar;
            this.f49359d = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new C0968r(this.f49358c, this.f49359d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C0968r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r2.N4(r14) == r0) goto L15;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49356a;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = rVar.f49285l;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L(this.f49358c, this.f49359d, null, null, null, null, null, false, 33554399);
                this.f49356a = 1;
                if (v52.d.a(jVar, qVarL, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            this.f49356a = 2;
            m52.j jVar2 = r.f49273q;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$onDragEnd$1", f = "WorkoutEditCreateViewModel.kt", l = {1188, 1964, 1204, 1967}, m = "invokeSuspend", v = 2)
    public static final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a f49361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f49362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m52.k f49364e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a aVar, r rVar, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, m52.k kVar, t13.d<? super s> dVar) {
            super(2, dVar);
            this.f49361b = aVar;
            this.f49362c = rVar;
            this.f49363d = iVar;
            this.f49364e = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new s(this.f49361b, this.f49362c, this.f49363d, this.f49364e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00d5  */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f6, code lost:
        
            if (v52.d.a(r3, r2, r18) == r1) goto L46;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49360a;
            m52.a aVar2 = null;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a aVar3 = this.f49361b;
            r rVar = this.f49362c;
            if (i14 == 0) {
                o13.r.b(obj);
                if (!(aVar3 instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b)) {
                    i2.a.q(i2.f36769a, "Unexpected onDragEnd call while reorderState is not in progress.");
                    return Unit.INSTANCE;
                }
                if (!((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) aVar3).f49272b) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.j.f49229a;
                    this.f49360a = 1;
                    if (v52.d.d(wVar, jVar, this) != aVar) {
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    o13.r.b(obj);
                    this.f49360a = 3;
                    m52.j jVar2 = r.f49273q;
                    if (rVar.N4(this) != aVar) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), null, null, null, null, null, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.C0967a.f49270a, false, 29360127);
                        r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar3 = rVar.f49285l;
                        this.f49360a = 4;
                    }
                    return aVar;
                }
                if (i14 == 3) {
                    o13.r.b(obj);
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), null, null, null, null, null, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.C0967a.f49270a, false, 29360127);
                    r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar4 = rVar.f49285l;
                    this.f49360a = 4;
                } else {
                    if (i14 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            }
            return Unit.INSTANCE;
            l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(this.f49363d);
            l52.e.b bVarN3 = ((l52.m) eVarB).n3(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b) aVar3).f49271a);
            if (bVarN3 != null) {
                l52.f.a parent = bVarN3.getParent();
                if (parent != null && (j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parent.f110251e) != null) {
                    aVar2 = j0Var.f48227l;
                }
                m52.a aVar4 = m52.a.f116649e;
                if (aVar2 == aVar4) {
                    if (bVarN3.k()) {
                        m52.j jVar5 = r.f49273q;
                        rVar.getClass();
                        r.O4(this.f49364e, bVarN3);
                    } else {
                        l52.f.a parent2 = bVarN3.getParent();
                        parent2.getClass();
                        m52.j jVar6 = r.f49273q;
                        rVar.getClass();
                        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) parent2.f110251e;
                        if (j0Var2.f48227l == aVar4) {
                            j0Var2.f48227l = m52.a.f116654j;
                            j0Var2.f48219e = 2;
                        }
                    }
                }
            }
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), eVarB, null, null, null, null, null, false, 33554399);
            r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar7 = rVar.f49285l;
            this.f49360a = 2;
            if (v52.d.a(jVar7, qVarL3, this) != aVar) {
                this.f49360a = 3;
                m52.j jVar8 = r.f49273q;
                if (rVar.N4(this) != aVar) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), null, null, null, null, null, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.C0967a.f49270a, false, 29360127);
                    r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar9 = rVar.f49285l;
                    this.f49360a = 4;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$onDragOver$1", f = "WorkoutEditCreateViewModel.kt", l = {1964, 1967}, m = "invokeSuspend", v = 2)
    public static final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.c f49366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f49368d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.garmin.android.apps.connectmobile.workouts.presentation.edit.c cVar, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, r rVar, t13.d<? super t> dVar) {
            super(2, dVar);
            this.f49366b = cVar;
            this.f49367c = iVar;
            this.f49368d = rVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new t(this.f49366b, this.f49367c, this.f49368d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
        
            if (v52.d.a(r3, r2, r19) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
        
            if (v52.d.a(r2, r4, r19) == r1) goto L23;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49365a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i14 == 2) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = this.f49367c;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.c cVar = this.f49366b;
            o13.u<l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> uVarA = cVar.a(iVar);
            if (uVarA == null) {
                return Unit.INSTANCE;
            }
            l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar = uVarA.f128605a;
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = uVarA.f128606b;
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar3 = uVarA.f128607c;
            eVar.getClass();
            boolean zC = l52.o.c(eVar, new w2(24));
            r rVar = this.f49368d;
            if (zC) {
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), null, null, null, null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b(cVar.f48935a, false), false, 29360127);
                r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = rVar.f49285l;
                this.f49365a = 1;
            } else {
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                rVar.P4(aVar3, cVar, qVar.f49245a, qVar.f49256l);
                rVar.f49280g = true;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), eVar, null, null, null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b(aVar2.getPath(), true), false, 29360095);
                r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar2 = rVar.f49285l;
                this.f49365a = 2;
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$onDragStart$1", f = "WorkoutEditCreateViewModel.kt", l = {1172}, m = "invokeSuspend", v = 2)
    public static final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49369a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49371c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar, t13.d<? super u> dVar) {
            super(2, dVar);
            this.f49371c = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new u(this.f49371c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49369a;
            if (i14 == 0) {
                o13.r.b(obj);
                r rVar = r.this;
                r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = rVar.f49285l;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m), null, null, null, null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a.b(this.f49371c, true), false, 29360127);
                this.f49369a = 1;
                if (v52.d.a(jVar, qVarL, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$preDelete$1", f = "WorkoutEditCreateViewModel.kt", l = {1128, 1133, 1141}, m = "invokeSuspend", v = 2)
    public static final class v extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> f49374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f49375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m52.k f49376e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, r rVar, m52.k kVar, t13.d<? super v> dVar) {
            super(2, dVar);
            this.f49374c = aVar;
            this.f49375d = rVar;
            this.f49376e = kVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            v vVar = new v(this.f49374c, this.f49375d, this.f49376e, dVar);
            vVar.f49373b = obj;
            return vVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r9.h(r1, r8) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        
            if (v52.d.d(r1, r2, r8) == r0) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
        
            if (v52.d.d(r1, r3, r8) == r0) goto L42;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i14;
            int i15;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f49372a;
            if (i16 != 0) {
                if (i16 == 1) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                if (i16 == 2 || i16 == 3) {
                    o13.r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar2 = this.f49374c;
            m52.d dVar = ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar2.getData()).f48217c;
            r rVar = this.f49375d;
            if (dVar == null) {
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                v52.c.a aVar3 = new v52.c.a(null, 1, null);
                this.f49373b = null;
                this.f49372a = 1;
            } else {
                m52.d dVar2 = m52.d.REPEAT;
                m52.k kVar = this.f49376e;
                if (dVar == dVar2) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar2 = rVar.f49287n;
                    o13.t tVar = k52.g.f102952a;
                    kVar.getClass();
                    int[] iArr = k52.g.a.f102955a;
                    switch (iArr[kVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                            i14 = R.string.workout_lbl_delete_round;
                            break;
                        case 4:
                            i14 = R.string.strength_training_delete_exercise_sets_title;
                            break;
                        case 5:
                            i14 = R.string.workout_lbl_delete_circuit;
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i14 = R.string.workout_lbl_delete_repeat;
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                    switch (iArr[kVar.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                            i15 = R.string.workout_delete_round_description;
                            break;
                        case 4:
                            i15 = R.string.workout_delete_sets_description;
                            break;
                        case 5:
                            i15 = R.string.workout_delete_circuit_description;
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i15 = R.string.workout_delete_repeat_description;
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g gVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.g(i14, i15, aVar2);
                    this.f49373b = null;
                    this.f49372a = 2;
                } else {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar3 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h hVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.h(kVar, aVar2);
                    this.f49373b = null;
                    this.f49372a = 3;
                }
            }
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel$updateWorkout$1", f = "WorkoutEditCreateViewModel.kt", l = {554, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, 557, 566}, m = "invokeSuspend", v = 2)
    public static final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49377a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WorkoutDetailsDTO f49379c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(WorkoutDetailsDTO workoutDetailsDTO, t13.d<? super w> dVar) {
            super(2, dVar);
            this.f49379c = workoutDetailsDTO;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return r.this.new w(this.f49379c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0067  */
        /* JADX WARN: Code duplicated, block: B:28:0x006b  */
        /* JADX WARN: Code duplicated, block: B:33:0x007b  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (v52.d.d(r9, r1, r8) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        
            if (v52.d.d(r9, r1, r8) == r0) goto L30;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v2 v2Var;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f49377a;
            WorkoutDetailsDTO workoutDetailsDTO = this.f49379c;
            r rVar = r.this;
            if (i14 == 0) {
                o13.r.b(obj);
                q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
                v52.c.b bVar = v52.c.b.f175759a;
                this.f49377a = 1;
                if (wVar.h(bVar, this) != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else if (i14 == 2) {
                o13.r.b(obj);
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar2 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r rVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m)).f49247c, workoutDetailsDTO.f48040a);
                    this.f49377a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar3 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.s sVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.s.f49244a;
                    this.f49377a = 4;
                }
            } else {
                if (i14 != 3 && i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
            l52.y yVar = rVar.f49274a;
            this.f49377a = 2;
            obj = yVar.N(workoutDetailsDTO, this);
            if (obj != aVar) {
                v2Var = (v2) obj;
                if (v2Var instanceof v2.b) {
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar4 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r rVar3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.r(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m)).f49247c, workoutDetailsDTO.f48040a);
                    this.f49377a = 3;
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar5 = rVar.f49287n;
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.s sVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.s.f49244a;
                    this.f49377a = 4;
                }
            }
            return aVar;
        }
    }

    static {
        new b(null);
        f49273q = m52.j.f116747g;
    }

    public r() {
        p2 p2VarA = q2.a(v52.c.b.f175759a);
        o13.p pVar = new o13.p(p2VarA, p2VarA);
        r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = (r53.j) pVar.f128594a;
        o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> o2Var = (o2) pVar.f128595b;
        this.f49285l = jVar;
        this.f49286m = o2Var;
        q53.b bVarA = q53.l.a(0, 7, null);
        o13.p pVar2 = new o13.p(bVarA, r53.s.F(bVarA));
        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = (q53.w) pVar2.f128594a;
        r53.i<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> iVar = (r53.i) pVar2.f128595b;
        this.f49287n = wVar;
        this.f49288o = iVar;
    }

    public static final void C4(r rVar, l52.i iVar, m52.j jVar) {
        rVar.f49278e = jVar;
        if (((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m)).f49245a == m52.k.f116758r) {
            l52.o.a(iVar, l52.h.PRE_ORDER, new en0.n(jVar, 15));
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[PHI: r3 r7
      0x008b: PHI (r3v4 java.io.File) = (r3v3 java.io.File), (r3v7 java.io.File) binds: [B:31:0x0088, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x008b: PHI (r7v8 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:31:0x0088, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        if (r0.h(r6, r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        if (v52.d.d(r0, r6, r1) == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (v52.d.d(r0, r7, r1) == r2) goto L45;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D4(r rVar, v13.c cVar) {
        l0 l0Var;
        a aVar;
        File file;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar3;
        q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f69281e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f69281e = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(rVar, cVar);
            }
        } else {
            l0Var = new l0(rVar, cVar);
        }
        Object objInvoke = l0Var.f69279c;
        u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
        switch (l0Var.f69281e) {
            case 0:
                o13.r.b(objInvoke);
                v52.c.b bVar = v52.c.b.f175759a;
                l0Var.f69281e = 1;
                if (wVar.h(bVar, l0Var) != aVar4) {
                    aVar = rVar.f49282i;
                    if (aVar != null) {
                        file = aVar.f49293d.get();
                        if (file != null) {
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar.f49248d, qVar.f49249e, qVar.f49263s);
                            l0Var.f69277a = null;
                            l0Var.f69278b = null;
                            l0Var.f69281e = 6;
                        } else {
                            e23.p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> pVar = aVar.f49292c;
                            l0Var.f69277a = file;
                            l0Var.f69281e = 3;
                            objInvoke = pVar.invoke(file, l0Var);
                            if (objInvoke != aVar4) {
                                aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objInvoke;
                                l0Var.f69277a = null;
                                l0Var.f69278b = aVar2;
                                l0Var.f69281e = 4;
                                if (rVar.S4(aVar2, file, l0Var) != aVar4) {
                                    aVar3 = aVar2;
                                    if (aVar3 != null) {
                                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar2.f49248d, qVar2.f49249e, qVar2.f49263s);
                                        l0Var.f69277a = null;
                                        l0Var.f69278b = null;
                                        l0Var.f69281e = 6;
                                    } else {
                                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m mVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m.f49237a;
                                        l0Var.f69277a = null;
                                        l0Var.f69278b = null;
                                        l0Var.f69281e = 5;
                                    }
                                }
                            }
                        }
                    } else {
                        v52.c.a aVar5 = new v52.c.a(null, 1, null);
                        l0Var.f69281e = 2;
                    }
                    break;
                }
                return aVar4;
            case 1:
                o13.r.b(objInvoke);
                aVar = rVar.f49282i;
                if (aVar != null) {
                    v52.c.a aVar6 = new v52.c.a(null, 1, null);
                    l0Var.f69281e = 2;
                    break;
                } else {
                    file = aVar.f49293d.get();
                    if (file != null) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar3 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar3.f49248d, qVar3.f49249e, qVar3.f49263s);
                        l0Var.f69277a = null;
                        l0Var.f69278b = null;
                        l0Var.f69281e = 6;
                    } else {
                        e23.p<File, t13.d<? super com.garmin.android.apps.connectmobile.workouts.data.model.a>, Object> pVar2 = aVar.f49292c;
                        l0Var.f69277a = file;
                        l0Var.f69281e = 3;
                        objInvoke = pVar2.invoke(file, l0Var);
                        if (objInvoke != aVar4) {
                            aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objInvoke;
                            l0Var.f69277a = null;
                            l0Var.f69278b = aVar2;
                            l0Var.f69281e = 4;
                            if (rVar.S4(aVar2, file, l0Var) != aVar4) {
                                aVar3 = aVar2;
                                if (aVar3 != null) {
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar4 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar4 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar4.f49248d, qVar4.f49249e, qVar4.f49263s);
                                    l0Var.f69277a = null;
                                    l0Var.f69278b = null;
                                    l0Var.f69281e = 6;
                                } else {
                                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m mVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m.f49237a;
                                    l0Var.f69277a = null;
                                    l0Var.f69278b = null;
                                    l0Var.f69281e = 5;
                                }
                            }
                        }
                    }
                    break;
                }
                return aVar4;
            case 2:
                o13.r.b(objInvoke);
                return Unit.INSTANCE;
            case 3:
                file = l0Var.f69277a;
                o13.r.b(objInvoke);
                aVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.a) objInvoke;
                l0Var.f69277a = null;
                l0Var.f69278b = aVar2;
                l0Var.f69281e = 4;
                if (rVar.S4(aVar2, file, l0Var) != aVar4) {
                    aVar3 = aVar2;
                    if (aVar3 != null) {
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar5 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar5 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar5.f49248d, qVar5.f49249e, qVar5.f49263s);
                        l0Var.f69277a = null;
                        l0Var.f69278b = null;
                        l0Var.f69281e = 6;
                    } else {
                        com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m mVar3 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m.f49237a;
                        l0Var.f69277a = null;
                        l0Var.f69278b = null;
                        l0Var.f69281e = 5;
                    }
                    break;
                }
                return aVar4;
            case 4:
                aVar3 = l0Var.f69278b;
                o13.r.b(objInvoke);
                if (aVar3 != null) {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m mVar4 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.m.f49237a;
                    l0Var.f69277a = null;
                    l0Var.f69278b = null;
                    l0Var.f69281e = 5;
                    break;
                } else {
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar6 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
                    com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f fVar6 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.f(qVar6.f49248d, qVar6.f49249e, qVar6.f49263s);
                    l0Var.f69277a = null;
                    l0Var.f69278b = null;
                    l0Var.f69281e = 6;
                    break;
                }
                return aVar4;
            case 5:
                o13.r.b(objInvoke);
                return Unit.INSTANCE;
            case 6:
                o13.r.b(objInvoke);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public static final l52.e.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> E4(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        if (((com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData()).f48217c != m52.d.REPEAT) {
            return l52.n.c(aVar.getData());
        }
        l52.f.a aVarB = l52.n.b(aVar.getData());
        l52.o.f(aVar, new o0(aVarB, 4));
        return aVarB;
    }

    public static void O4(m52.k kVar, l52.i.a aVar) {
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
        if (j0Var.f48227l == m52.a.f116649e) {
            m52.d dVar = j0Var.f48217c;
            if (dVar == m52.d.REST) {
                j0Var.f48227l = m52.a.f116648d;
                return;
            }
            x52.c cVar = x52.c.REPS;
            x52.e.f189070c.getClass();
            double dA = cVar.a(kVar, x52.e.a.a(dVar));
            j0Var.f48227l = m52.a.f116657m;
            j0Var.f48229n = dA;
        }
    }

    public static void T4(com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var, m52.j jVar, Double d14) {
        if ((j0Var != null ? j0Var.f48227l : null) == m52.a.f116650f) {
            if (zf.b.D(d14)) {
                int iD = com.garmin.android.apps.connectmobile.workouts.data.model.j0.d(j0Var.f48229n / d14.doubleValue());
                if (iD == 0) {
                    iD = 1;
                }
                j0Var.j((float) d14.doubleValue(), iD);
            } else {
                j0Var.f48229n = com.garmin.android.apps.connectmobile.workouts.data.model.j0.d(j0Var.f48229n);
            }
        }
        if (j0Var == null || !zf.b.D(d14)) {
            return;
        }
        if (j0Var.E == m52.g.PACE) {
            j0Var.P = jVar != null ? p005kotlin.jvm.internal.s.g(jVar.f116752c, Boolean.FALSE) : false ? m52.h.YARD : m52.h.METER;
        }
        if (j0Var.f48227l == m52.a.f116656l) {
            j0Var.f48231p = jVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (v52.d.d(r0, r2, r3) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        if (r20.N4(r3) == r4) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x4(r rVar, l52.e eVar, v13.c cVar) {
        f62.d0 d0Var;
        l52.e eVar2 = eVar;
        rVar.getClass();
        if (cVar instanceof f62.d0) {
            d0Var = (f62.d0) cVar;
            int i14 = d0Var.f69228d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f69228d = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new f62.d0(rVar, cVar);
            }
        } else {
            d0Var = new f62.d0(rVar, cVar);
        }
        Object obj = d0Var.f69226b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f69228d;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(obj);
            d0Var.f69225a = eVar2;
            d0Var.f69228d = 1;
            if (rVar.R4(eVar2, true, d0Var) != obj2) {
            }
            return obj2;
        }
        if (i15 == 1) {
            eVar2 = d0Var.f69225a;
            o13.r.b(obj);
        } else if (i15 == 2) {
            o13.r.b(obj);
            z14 = false;
        } else if (i15 == 3) {
            o13.r.b(obj);
            d0Var.f69225a = null;
            d0Var.f69228d = 4;
        } else {
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Boolean.valueOf(z14);
        l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = eVar2;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(rVar.f49286m);
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar = qVar.f49260p;
        if (l52.o.d(iVar) > qVar.f49245a.f116775k) {
            int i16 = qVar.f49263s instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a ? R.string.msg_workout_step_limit_reached_alert_msg : R.string.workout_message_maximum_step_reached;
            q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = rVar.f49287n;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.C0966o c0966o = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.C0966o(i16);
            d0Var.f69225a = null;
            d0Var.f69228d = 2;
        } else {
            rVar.U4(iVar, new Double(dVar.getF48947b()), dVar.getF48948c());
            d.f49311c.getClass();
            rVar.f49283j = d.f49312d;
            rVar.f49280g = true;
            r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = rVar.f49285l;
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVarL = com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L(qVar, iVar, null, null, null, null, null, false, 33554399);
            d0Var.f69225a = null;
            d0Var.f69228d = 3;
            if (v52.d.a(jVar, qVarL, d0Var) != obj2) {
                d0Var.f69225a = null;
                d0Var.f69228d = 4;
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable z4(r rVar, v13.c cVar) {
        f62.f0 f0Var;
        rVar.getClass();
        if (cVar instanceof f62.f0) {
            f0Var = (f62.f0) cVar;
            int i14 = f0Var.f69239c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f69239c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f62.f0(rVar, cVar);
            }
        } else {
            f0Var = new f62.f0(rVar, cVar);
        }
        Object objB = f0Var.f69237a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f69239c;
        if (i15 == 0) {
            o13.r.b(objB);
            g60.c cVar2 = (g60.c) rVar.f49276c.getValue();
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            f0Var.f69239c = 1;
            objB = cVar2.b(dateTimeNow, f0Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                f62.g.f69240a.getClass();
                return f62.g.f69241b;
            }
            u0.r();
            return null;
        }
        v2.b bVar = (v2.b) v2Var;
        g60.b bVar2 = bVar.f47387b == 200 ? (g60.b) bVar.f47386a : null;
        f62.g gVar = f62.g.f69240a;
        Double d14 = bVar2 != null ? bVar2.d() : null;
        gVar.getClass();
        return new o13.p(Boolean.TRUE, d14);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void A0() {
        ge1.b.T(v1.a(this), null, null, new f(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void A2(com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar) {
        dVar.getClass();
        ge1.b.T(v1.a(this), null, null, new h(dVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void B2(l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c cVar) {
        iVar.getClass();
        cVar.getClass();
        ge1.b.T(v1.a(this), null, null, new t(cVar, iVar, this, null), 3);
    }

    public void F4(WorkoutDetailsDTO workoutDetailsDTO) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new k(workoutDetailsDTO, null), 2);
    }

    public final void G4(m52.k kVar, m52.l lVar, Long l14, Long l15, String str, l52.i iVar, k0.a aVar, ArrayList arrayList, PowerZonesDTO powerZonesDTO, ArrayList arrayList2, String str2, boolean z14, com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar, f62.o oVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar, boolean z15, d dVar2, boolean z16, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar2) {
        iVar.getClass();
        dVar.getClass();
        gVar.getClass();
        dVar2.getClass();
        c cVar = new c(kVar, lVar, l14, l15, str, iVar, aVar, arrayList, powerZonesDTO, arrayList2, str2, z14, dVar, oVar, gVar, z15, aVar2);
        this.f49283j = dVar2;
        this.f49284k = z16;
        w9.a aVarA = v1.a(this);
        x53.c cVar2 = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.w(this, cVar, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object H4(m52.k kVar, v13.c cVar) {
        f62.e0 e0Var;
        double avgSpeed;
        if (cVar instanceof f62.e0) {
            e0Var = (f62.e0) cVar;
            int i14 = e0Var.f69233c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f69233c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new f62.e0(this, cVar);
            }
        } else {
            e0Var = new f62.e0(this, cVar);
        }
        Object objD = e0Var.f69231a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f69233c;
        if (i15 == 0) {
            o13.r.b(objD);
            String str = kVar.f116765a;
            e0Var.f69233c = 1;
            objD = this.f49274a.d(str, e0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        v2 v2Var = (v2) objD;
        if (v2Var instanceof v2.b) {
            avgSpeed = ((com.garmin.android.apps.connectmobile.workouts.data.model.j) ((v2.b) v2Var).f47386a).getAvgSpeed();
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            avgSpeed = 0.0d;
        }
        return new Double(avgSpeed);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r11 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I4(m52.k kVar, v13.c cVar) {
        f62.g0 g0Var;
        double dDoubleValue;
        if (cVar instanceof f62.g0) {
            g0Var = (f62.g0) cVar;
            int i14 = g0Var.f69245d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f69245d = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new f62.g0(this, cVar);
            }
        } else {
            g0Var = new f62.g0(this, cVar);
        }
        Object objH4 = g0Var.f69243b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f69245d;
        if (i15 == 0) {
            o13.r.b(objH4);
            g0Var.f69242a = kVar;
            g0Var.f69245d = 1;
            objH4 = H4(kVar, g0Var);
            if (objH4 != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            kVar = g0Var.f69242a;
            o13.r.b(objH4);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = g0Var.f69242a;
            o13.r.b(objH4);
        }
        dDoubleValue = ((Number) objH4).doubleValue();
        if (dDoubleValue == 0.0d) {
            dDoubleValue = kVar.f116771g;
        }
        return new Double(dDoubleValue);
        dDoubleValue = ((Number) objH4).doubleValue();
        if (dDoubleValue == 0.0d) {
            g0Var.f69242a = kVar;
            g0Var.f69245d = 2;
            objH4 = L4(kVar, g0Var);
        }
        return new Double(dDoubleValue);
    }

    /* JADX INFO: renamed from: J4, reason: from getter */
    public final m52.j getF49278e() {
        return this.f49278e;
    }

    public final Resources K4() {
        return (Resources) this.f49277d.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void L0(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        aVar.getClass();
        ge1.b.T(v1.a(this), null, null, new o(aVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object L4(m52.k kVar, v13.c cVar) {
        f62.h0 h0Var;
        Double swimmingTrainingSpeed;
        if (cVar instanceof f62.h0) {
            h0Var = (f62.h0) cVar;
            int i14 = h0Var.f69251d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f69251d = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new f62.h0(this, cVar);
            }
        } else {
            h0Var = new f62.h0(this, cVar);
        }
        Object objB = h0Var.f69249b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f69251d;
        if (i15 == 0) {
            o13.r.b(objB);
            qo1.c.f145960d.getClass();
            qo1.c cVarA = qo1.c.a.a();
            h0Var.f69248a = kVar;
            h0Var.f69251d = 1;
            objB = qo1.c.b(cVarA, h0Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kVar = h0Var.f69248a;
            o13.r.b(objB);
        }
        v2 v2Var = (v2) objB;
        double dDoubleValue = 0.0d;
        if (v2Var instanceof v2.b) {
            int i16 = e.f49315a[kVar.ordinal()];
            if (i16 == 1) {
                Double runningTrainingSpeed = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).getRunningTrainingSpeed();
                if (runningTrainingSpeed != null) {
                    dDoubleValue = runningTrainingSpeed.doubleValue();
                }
            } else if (i16 == 2) {
                Double cyclingTrainingSpeed = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).getCyclingTrainingSpeed();
                if (cyclingTrainingSpeed != null) {
                    dDoubleValue = cyclingTrainingSpeed.doubleValue();
                }
            } else if (i16 == 3 && (swimmingTrainingSpeed = ((com.garmin.android.apps.connectmobile.userprofile.model.m) ((v2.b) v2Var).f47386a).getSwimmingTrainingSpeed()) != null) {
                dDoubleValue = swimmingTrainingSpeed.doubleValue();
            }
        }
        return new Double(dDoubleValue);
    }

    public final void M4(com.garmin.android.apps.connectmobile.workouts.presentation.edit.c cVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m);
        o13.u<l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>, l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0>> uVarA = cVar.a(l52.w.b(qVar.f49250f));
        if (uVarA == null) {
            return;
        }
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVar = uVarA.f128605a;
        l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar = uVarA.f128607c;
        eVar.getClass();
        if (l52.o.c(eVar, new w2(24))) {
            ge1.b.T(v1.a(this), null, null, new q(null), 3);
        } else {
            P4(aVar, cVar, qVar.f49245a, qVar.f49256l);
            ge1.b.T(v1.a(this), null, null, new C0968r(qVar, eVar, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b2, code lost:
    
        if (r1 == r3) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, m52.j] */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, m52.b] */
    /* JADX WARN: Type inference failed for: r9v14, types: [T, m52.b] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, m52.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N4(v13.c cVar) {
        f62.i0 i0Var;
        Object objA;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar;
        Object objA2;
        if (cVar instanceof f62.i0) {
            i0Var = (f62.i0) cVar;
            int i14 = i0Var.f69257c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f69257c = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new f62.i0(this, cVar);
            }
        } else {
            i0Var = new f62.i0(this, cVar);
        }
        Object obj = i0Var.f69255a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f69257c;
        r53.j<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> jVar = this.f49285l;
        o2<v52.c<com.garmin.android.apps.connectmobile.workouts.presentation.edit.q>> o2Var = this.f49286m;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        i0Var.f69257c = 1;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar2 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(o2Var);
        l52.e<com.garmin.android.apps.connectmobile.workouts.data.model.j0> eVarB = l52.w.b(qVar2.f49250f);
        Object objB = ((l52.m) eVarB).b(l52.h.PRE_ORDER, new f62.k0(this, eVarB, qVar2));
        Boolean bool = Boolean.FALSE;
        int i16 = o13.q.f128596b;
        if (objB instanceof o13.q.b) {
            objB = bool;
        }
        if (!((Boolean) objB).booleanValue() || (objA = v52.d.a(jVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(o2Var), eVarB, null, null, null, null, null, false, 33554399), i0Var)) != aVar) {
            objA = Unit.INSTANCE;
        }
        if (objA != aVar) {
        }
        return aVar;
        i0Var.f69257c = 2;
        m52.k kVar = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(o2Var)).f49245a;
        if (kVar == m52.k.f116754n || kVar == m52.k.f116755o || kVar == m52.k.f116758r) {
            n0 n0Var = new n0();
            n0 n0Var2 = new n0();
            r0 r0Var = new r0();
            m0 m0Var = new m0();
            m0 m0Var2 = new m0();
            r0 r0Var2 = new r0();
            r0 r0Var3 = new r0();
            com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar3 = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(o2Var);
            l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar = qVar3.f49250f;
            m52.k kVar2 = qVar3.f49245a;
            if (l52.o.d(iVar) == 0) {
                objA2 = Q4(i0Var);
                if (objA2 != aVar) {
                    objA2 = Unit.INSTANCE;
                }
            } else {
                p0 p0Var = new p0();
                p0Var.f105807a = 1;
                l52.o.b(iVar, l52.h.PRE_ORDER, new a11.j(new p13.k(), p0Var, qVar3, n0Var, n0Var2, r0Var, r0Var2, m0Var, r0Var3, m0Var2, 4));
                double d14 = n0Var.f105805a;
                if (d14 == 0.0d && n0Var2.f105805a == 0.0d) {
                    objA2 = Q4(i0Var);
                    if (objA2 != aVar) {
                        objA2 = Unit.INSTANCE;
                    }
                } else {
                    if (m0Var2.f105804a) {
                        r0Var3.f105810a = m52.j.f116747g;
                    }
                    int i17 = (int) d14;
                    double d15 = n0Var2.f105805a;
                    T t7 = r0Var2.f105810a;
                    m52.b bVar = m52.b.TIME_AND_DISTANCE_ESTIMATED;
                    int i18 = 0;
                    if (t7 != bVar) {
                        if (r0Var.f105810a == m52.a.f116649e) {
                            r0Var2.f105810a = m52.b.DISTANCE_ESTIMATED;
                            r0Var3.f105810a = null;
                        } else {
                            r0Var2.f105810a = m52.b.TIME_ESTIMATED;
                            if (kVar2 == m52.k.f116758r) {
                                i17 = 0;
                            }
                        }
                    }
                    if (kVar2 == m52.k.f116758r) {
                        qVar = qVar3;
                        r0Var3.f105810a = qVar.f49260p.getF48948c();
                        T t14 = r0Var2.f105810a;
                        if (t14 != m52.b.TIME_ESTIMATED && t14 != bVar) {
                        }
                        objA2 = v52.d.a(jVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L(qVar, null, null, null, new f62.o(new Integer(i18), new Double(d15), (m52.b) r0Var2.f105810a, (m52.j) r0Var3.f105810a), null, null, false, 33423359), i0Var);
                        if (objA2 != aVar) {
                            objA2 = Unit.INSTANCE;
                        }
                    } else {
                        qVar = qVar3;
                    }
                    i18 = i17;
                    objA2 = v52.d.a(jVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L(qVar, null, null, null, new f62.o(new Integer(i18), new Double(d15), (m52.b) r0Var2.f105810a, (m52.j) r0Var3.f105810a), null, null, false, 33423359), i0Var);
                    if (objA2 != aVar) {
                        objA2 = Unit.INSTANCE;
                    }
                }
            }
        } else {
            objA2 = Q4(i0Var);
            if (objA2 != aVar) {
                objA2 = Unit.INSTANCE;
            }
        }
    }

    public final void P4(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.c cVar, m52.k kVar, com.garmin.android.apps.connectmobile.repcounting.model.c cVar2) {
        String strR;
        if (aVar.k() || (cVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b) || (cVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c)) {
            if (aVar.f()) {
                strR = "";
            } else {
                m52.k kVar2 = m52.k.f116758r;
                if (kVar == kVar2) {
                    Context context = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
                    com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData();
                    context.getClass();
                    j0Var.getClass();
                    m52.d dVar = j0Var.f48217c;
                    x52.e.f189070c.getClass();
                    strR = x52.e.a.a(dVar).b(context, kVar2);
                } else {
                    strR = k52.g.b().contains(kVar) ? q1.r((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), kVar, (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData(), cVar2) : q1.q((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null), kVar, (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar.getData(), cVar2);
                }
            }
            Context context2 = (Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null);
            String string = K4().getString(cVar.getF48940c(), strR);
            string.getClass();
            c22.b.h(context2, string);
        }
    }

    public final Object Q4(f62.i0 i0Var) {
        Object objA = v52.d.a(this.f49285l, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m), null, null, null, new f62.o(new Integer(0), new Double(0.0d), null, null), null, null, false, 33423359), i0Var);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final Object R4(l52.i iVar, boolean z14, v13.c cVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m);
        m52.k kVar = qVar.f49245a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.g gVar = qVar.f49263s;
        if (gVar instanceof com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a) {
            int i14 = kVar.f116775k;
            int i15 = m52.k.A.f116775k;
            int iD = l52.o.d(iVar);
            int i16 = ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.g.a) gVar).f48993b + iD;
            q53.w<v52.c<? extends com.garmin.android.apps.connectmobile.workouts.presentation.edit.o>> wVar = this.f49287n;
            if (i16 >= i15) {
                String string = K4().getString(R.string.msg_workout_multisport_step_limit_reached);
                string.getClass();
                Object objD = v52.d.d(wVar, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a(string, z14), cVar);
                return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
            }
            if (iD >= i14) {
                String string2 = K4().getString(R.string.workout_multisport_leg_step_limit_reached);
                string2.getClass();
                Object objD2 = v52.d.d(wVar, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a(string2, z14), cVar);
                return objD2 == u13.a.COROUTINE_SUSPENDED ? objD2 : Unit.INSTANCE;
            }
            if (i16 >= 225) {
                String string3 = K4().getString(R.string.msg_workout_multisport_close_to_step_limit);
                string3.getClass();
                Object objD3 = v52.d.d(wVar, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a(string3, z14), cVar);
                return objD3 == u13.a.COROUTINE_SUSPENDED ? objD3 : Unit.INSTANCE;
            }
            if (iD >= 75 && kVar != m52.k.f116761w) {
                String string4 = K4().getString(R.string.workout_multisport_close_leg_step_limit, K4().getString(R.string.activity_type_with_leg_appended, K4().getString(kVar.e())), String.valueOf(i14));
                string4.getClass();
                Object objD4 = v52.d.d(wVar, new com.garmin.android.apps.connectmobile.workouts.presentation.edit.o.a(string4, z14), cVar);
                return objD4 == u13.a.COROUTINE_SUSPENDED ? objD4 : Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public final Object S4(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, File file, v13.c cVar) {
        a aVar2 = this.f49282i;
        if (aVar2 == null) {
            Object objH = this.f49287n.h(new v52.c.a(null, 1, null), cVar);
            return objH == u13.a.COROUTINE_SUSPENDED ? objH : Unit.INSTANCE;
        }
        aVar2.f49293d.set(file);
        this.f49280g = true;
        Object objA = v52.d.a(this.f49285l, com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.L((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m), null, null, null, null, aVar, null, false, 32505855), cVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void T(l52.i.b<com.garmin.android.apps.connectmobile.workouts.data.model.j0> bVar) {
        bVar.getClass();
        ge1.b.T(v1.a(this), null, null, new u(bVar, null), 3);
    }

    public final void U4(l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar, Double d14, m52.j jVar) {
        if (((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m)).f49245a == m52.k.f116758r) {
            m52.j jVar2 = jVar == null ? m52.j.f116747g : jVar;
            jVar2.getClass();
            ge1.b.T(v1.a(this), null, null, new c0(this, d14, jVar2, null), 3);
            l52.o.a(iVar, l52.h.PRE_ORDER, new com.google.android.exoplayer2.analytics.q(this, jVar, d14));
        }
    }

    public void V4(WorkoutDetailsDTO workoutDetailsDTO) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new w(workoutDetailsDTO, null), 2);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void X0(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.c aVar2;
        l52.e.b bVarN3 = ((l52.m) l52.w.b(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m)).f49250f)).n3(aVar.getPath());
        if (bVarN3 == null) {
            return;
        }
        l52.f<T> fVar = l52.n.a(bVarN3).f110249c;
        l52.e.b bVarC = fVar instanceof l52.f.c ? null : fVar.c();
        if (bVarC == null) {
            l52.g path = bVarN3.getPath();
            l52.f.a parent = bVarN3.getParent();
            parent.getClass();
            aVar2 = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a(path, parent.getPath());
        } else {
            aVar2 = bVarC.k() ? new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.a(bVarN3.getPath(), bVarC.getPath()) : new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.C0955c(bVarN3.getPath(), bVarC.getPath());
        }
        M4(aVar2);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void c0(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar, boolean z14) {
        ge1.b.T(v1.a(this), null, null, new i(aVar, z14, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void f1() {
        ge1.b.T(v1.a(this), null, null, new g(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void n1(m52.k kVar, l52.i.a aVar) {
        kVar.getClass();
        ge1.b.T(v1.a(this), null, null, new v(aVar, this, kVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void q3(String str, boolean z14, com.garmin.android.apps.connectmobile.workouts.data.model.a aVar) {
        ge1.b.T(v1.a(this), null, null, new m(str, z14, aVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void s0(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        ge1.b.T(v1.a(this), null, null, new n(aVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void t(e23.a aVar, String str, String str2) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        ge1.b.T(v1.a(this), null, null, new l(str, str2, aVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void u0() {
        ge1.b.T(v1.a(this), null, null, new p(null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void v(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.c bVar;
        l52.e.b bVarN3 = ((l52.m) l52.w.b(((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) v52.d.c(this.f49286m)).f49250f)).n3(aVar.getPath());
        if (bVarN3 == null) {
            return;
        }
        l52.f<T> fVar = l52.n.a(bVarN3).f110248b;
        l52.e.b bVarC = fVar instanceof l52.f.c ? null : fVar.c();
        if (bVarC == null) {
            l52.g path = bVarN3.getPath();
            l52.f.a parent = bVarN3.getParent();
            parent.getClass();
            bVar = new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b(path, parent.getPath());
        } else {
            bVar = bVarC.k() ? new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.b(bVarN3.getPath(), bVarC.getPath()) : new com.garmin.android.apps.connectmobile.workouts.presentation.edit.c.d(bVarN3.getPath(), bVarC.getPath());
        }
        M4(bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void y3(com.garmin.android.apps.connectmobile.workouts.presentation.edit.q.a aVar, m52.k kVar, l52.i<com.garmin.android.apps.connectmobile.workouts.data.model.j0> iVar) {
        aVar.getClass();
        kVar.getClass();
        iVar.getClass();
        ge1.b.T(v1.a(this), null, null, new s(aVar, this, iVar, kVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.edit.p
    public final void z3(l52.i.a<com.garmin.android.apps.connectmobile.workouts.data.model.j0> aVar) {
        ge1.b.T(v1.a(this), null, null, new j(aVar, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r$d;", "", "", "provider", "sourceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f49311c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f49312d = new d(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f49313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f49314b;

        public d(String str, String str2) {
            this.f49313a = str;
            this.f49314b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f49313a, dVar.f49313a) && p005kotlin.jvm.internal.s.g(this.f49314b, dVar.f49314b);
        }

        public final int hashCode() {
            String str = this.f49313a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f49314b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return v.e0.g("ProviderInfo(provider=", this.f49313a, ", sourceId=", this.f49314b, ")");
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r$d$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/r$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_POOL_SIZE", "D", "Lm52/j;", "DEFAULT_POOL_SIZE_UNIT", "Lm52/j;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
