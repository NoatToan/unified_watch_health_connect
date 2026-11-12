package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import androidx.lifecycle.u1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.a2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f48999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f49000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f49001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f49002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f49003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2 f49004f;

    public interface a {

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.workouts.presentation.edit.h0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a$a;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a;", "", "audioUrl", "audioFile", "Lkotlin/Function0;", "", "playFunc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Le23/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0958a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f49005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f49006b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final e23.a<Unit> f49007c;

            public C0958a(String str, String str2, e23.a<Unit> aVar) {
                str.getClass();
                str2.getClass();
                aVar.getClass();
                this.f49005a = str;
                this.f49006b = str2;
                this.f49007c = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0958a)) {
                    return false;
                }
                C0958a c0958a = (C0958a) obj;
                return this.f49005a.equals(c0958a.f49005a) && this.f49006b.equals(c0958a.f49006b) && this.f49007c.equals(c0958a.f49007c);
            }

            public final int hashCode() {
                return this.f49007c.hashCode() + wr.g.j(this.f49005a.hashCode() * 31, 31, this.f49006b);
            }

            public final String toString() {
                return n23.j.i(p6.b.i("DownloadFailed(audioUrl=", this.f49005a, ", audioFile=", this.f49006b, ", playFunc="), this.f49007c, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a$b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f49008a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1882312553;
            }

            public final String toString() {
                return "DownloadSuccess";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a$c;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/h0$a;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f49009a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1569509168;
            }

            public final String toString() {
                return "StartDownloadAudio";
            }
        }
    }

    public h0() {
        p2 p2VarA = q2.a(null);
        this.f48999a = p2VarA;
        this.f49000b = r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(null);
        this.f49001c = p2VarA2;
        this.f49002d = r53.s.d(p2VarA2);
        e2 e2VarB = g2.b(0, 0, null, 7);
        this.f49003e = e2VarB;
        this.f49004f = r53.s.c(e2VarB);
    }
}
