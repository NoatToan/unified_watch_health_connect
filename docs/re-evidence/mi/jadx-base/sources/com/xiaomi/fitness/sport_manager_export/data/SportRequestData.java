package com.xiaomi.fitness.sport_manager_export.data;

import com.xiaomi.fit.data.common.data.sport.Location;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class SportRequestData implements Serializable {
    public int accessoryWearMode;
    public int code;
    public boolean disableAudioBroadcast;
    public FinishSportData finishSportData;
    public boolean hasPreRoute;
    public byte[] ids;
    public boolean isAcessoryDevice;
    public boolean isCommandFromDevice;
    public boolean isNotSport;
    public boolean isRestartSport;
    public List<Location> routeList;
    public SportCourse sportCourse;
    public int sportLaunchType;
    public final int sportState;
    public SportTarget sportTargetArr;
    public final int sportType;
    public final int supportVersions;
    public int timeStamp;
    public int timeZone;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13214b;
        public int c;
        public int d;
        public byte[] e;
        public int f;
        public int g;
        public SportTarget h;
        public SportCourse i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f13215k;
        public int l;
        public FinishSportData m;
        public boolean n;
        public List<Location> o;
        public boolean p;
        public long q;

        public a A(int i) {
            this.f = i;
            return this;
        }

        public a B(long j, TimeUnit timeUnit) {
            this.f13213a = (int) timeUnit.toSeconds(j);
            return this;
        }

        public a C(long j) {
            this.f13213a = (int) j;
            return this;
        }

        public a D(long j, TimeUnit timeUnit) {
            this.f13214b = ((int) timeUnit.toMinutes(j)) / 15;
            return this;
        }

        public a E(int i) {
            this.f13214b = i;
            return this;
        }

        public a F(byte[] bArr) {
            this.e = bArr;
            return this;
        }

        public a G(long j) {
            this.q = j;
            return this;
        }

        public a H(int i) {
            this.l = i;
            return this;
        }

        public SportRequestData o() {
            return new SportRequestData(this);
        }

        public a p(SportCourse sportCourse) {
            this.i = sportCourse;
            return this;
        }

        public a q(boolean z) {
            this.f13215k = z;
            return this;
        }

        public a r(FinishSportData finishSportData) {
            this.m = finishSportData;
            return this;
        }

        public a s(boolean z) {
            this.p = z;
            return this;
        }

        public a t(boolean z) {
            this.n = z;
            return this;
        }

        public a u(boolean z) {
            this.j = z;
            return this;
        }

        public a v(List<Location> list) {
            this.o = list;
            return this;
        }

        public a w(int i) {
            this.g = i;
            return this;
        }

        public a x(int i) {
            this.d = i;
            return this;
        }

        public a y(SportTarget sportTarget) {
            this.h = sportTarget;
            return this;
        }

        public a z(int i) {
            this.c = i;
            return this;
        }
    }

    public SportRequestData(a aVar) {
        this.timeStamp = aVar.f13213a;
        this.timeZone = aVar.f13214b;
        this.sportType = aVar.c;
        this.sportState = aVar.d;
        this.ids = aVar.e;
        this.supportVersions = aVar.f;
        this.sportLaunchType = aVar.g;
        this.sportTargetArr = aVar.h;
        this.sportCourse = aVar.i;
        this.isNotSport = aVar.j;
        this.disableAudioBroadcast = aVar.f13215k;
        this.accessoryWearMode = aVar.l;
        this.finishSportData = aVar.m;
        this.isAcessoryDevice = aVar.n;
        this.routeList = aVar.o;
        this.hasPreRoute = aVar.p;
    }

    public String toString() {
        return "timeStamp = " + this.timeStamp + ", timeZone = " + this.timeZone + ", sportType = " + this.sportType + ", sportState = " + this.sportState + ", sportLaunchType = " + this.sportLaunchType + ", disableAudioBroadcast = " + this.disableAudioBroadcast + ", course = " + this.sportCourse + ", wearmode = " + this.accessoryWearMode + ", sportLaunchType = " + this.sportLaunchType + ", hasPreRoute = " + this.hasPreRoute;
    }
}
