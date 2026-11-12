package com.xiaomi.fitness.sport_eco_manager_export.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportRequestData implements Serializable {
    public boolean disableAudioBroadcast;
    public byte[] ids;
    public ArrayList<IntervalSportTarget> intervalSportTargetArr;
    public boolean isNotSport;
    public SportCourse sportCourse;
    public int sportLaunchType;
    public final int sportState;
    public SportTarget sportTargetArr;
    public final int sportType;
    public final int supportVersions;
    public int timeStamp;
    public int timeZone;
    int trainingMode;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13164b;
        public int c;
        public int d;
        public byte[] e;
        public int f;
        public int g;
        public int h;
        public ArrayList<IntervalSportTarget> i;
        public SportTarget j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public SportCourse f13165k;
        public boolean l;
        public boolean m;

        public SportRequestData j() {
            return new SportRequestData(this);
        }

        public a k(SportCourse sportCourse) {
            this.f13165k = sportCourse;
            return this;
        }

        public a l(boolean z) {
            this.m = z;
            return this;
        }

        public a m(ArrayList<IntervalSportTarget> arrayList) {
            this.i = arrayList;
            return this;
        }

        public a n(boolean z) {
            this.l = z;
            return this;
        }

        public a o(int i) {
            this.g = i;
            return this;
        }

        public a p(int i) {
            this.d = i;
            return this;
        }

        public a q(SportTarget sportTarget) {
            this.j = sportTarget;
            return this;
        }

        public a r(int i) {
            this.h = i;
            return this;
        }

        public a s(int i) {
            this.c = i;
            return this;
        }

        public a t(int i) {
            this.f = i;
            return this;
        }

        public a u(long j, TimeUnit timeUnit) {
            this.f13163a = (int) timeUnit.toSeconds(j);
            return this;
        }

        public a v(long j) {
            this.f13163a = (int) j;
            return this;
        }

        public a w(long j, TimeUnit timeUnit) {
            this.f13164b = ((int) timeUnit.toMinutes(j)) / 15;
            return this;
        }

        public a x(int i) {
            this.f13164b = i;
            return this;
        }

        public a y(byte[] bArr) {
            this.e = bArr;
            return this;
        }
    }

    public SportRequestData(a aVar) {
        this.timeStamp = aVar.f13163a;
        this.timeZone = aVar.f13164b;
        this.sportType = aVar.c;
        this.sportState = aVar.d;
        this.ids = aVar.e;
        this.supportVersions = aVar.f;
        this.sportLaunchType = aVar.g;
        this.trainingMode = aVar.h;
        this.intervalSportTargetArr = aVar.i;
        this.sportTargetArr = aVar.j;
        this.sportCourse = aVar.f13165k;
        this.isNotSport = aVar.l;
        this.disableAudioBroadcast = aVar.m;
    }

    public String toString() {
        return "timeStamp = " + this.timeStamp + ", timeZone = " + this.timeZone + ", sportType = " + this.sportType + ", sportState = " + this.sportState + ", sportLaunchType = " + this.sportLaunchType + ", disableAudioBroadcast = " + this.disableAudioBroadcast + ", course = " + this.sportCourse + ", sportLaunchType = " + this.sportLaunchType;
    }
}
