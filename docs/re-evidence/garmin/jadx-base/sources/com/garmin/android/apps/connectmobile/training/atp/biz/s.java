package com.garmin.android.apps.connectmobile.training.atp.biz;

import c22.j0;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.RescheduleWorkoutActivity;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/s;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "Lwt1/u;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends com.garmin.android.library.backgroundtaskmanagement.a implements wt1.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45196b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static s f45197c;

    public /* synthetic */ s(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Override // wt1.u
    public final long A(long j8, xw1.c cVar, fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> interfaceC0995b) {
        cVar.getClass();
        iVar.getClass();
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new t(j8, cVar, iVar, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long B(long j8, xw1.c cVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.d> interfaceC0995b) {
        cVar.getClass();
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new u(j8, cVar, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final o53.r<fu1.h> H(String str) {
        str.getClass();
        fy1.i.f73924a.getClass();
        return new f(str, fy1.i.a.e(), this).k();
    }

    @Override // wt1.u
    public final long I(long j8, long j14, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b) {
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new b(j8, j14, "", 2, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long K(int i14, String str, Integer num, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<xw1.h>> interfaceC0995b) {
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new g(i14, str, num, fy1.i.a.f(), fy1.i.a.e(), this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long L(long j8, cu1.b.h hVar) {
        hVar.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new com.garmin.android.apps.connectmobile.training.atp.biz.a(j8, null, 4, this, 2, null), hVar);
    }

    @Override // wt1.u
    public final long a(String str, long j8, cu1.b.i iVar) {
        str.getClass();
        iVar.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new com.garmin.android.apps.connectmobile.training.atp.biz.a(j8, str, 2, this), iVar);
    }

    @Override // wt1.u
    public final long e(fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b) {
        iVar.getClass();
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new r(iVar, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long f(int i14, String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.n> interfaceC0995b) {
        interfaceC0995b.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new k(i14, str, fy1.i.a.e(), this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long g(Integer num, Integer num2, Integer num3, Long l14, boolean z14, com.garmin.android.apps.connectmobile.training.atp.create.steps.j.b bVar) {
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new n(num, num2, num3, l14, z14, this), bVar);
    }

    @Override // wt1.u
    public final long i(int i14, long j8, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.m> interfaceC0995b) {
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new j(i14, j8, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long j(long j8, fu1.i iVar, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> interfaceC0995b) {
        iVar.getClass();
        interfaceC0995b.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new q(j8, iVar, this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long k(long j8, cu1.n nVar) {
        nVar.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new com.garmin.android.apps.connectmobile.training.atp.biz.a(j8, null, 1, this, 2, null), nVar);
    }

    @Override // wt1.u
    public final long l(long j8, long j14, DateTime dateTime, RescheduleWorkoutActivity.b bVar) {
        bVar.getClass();
        String strB = j0.b(dateTime, "yyyy-MM-dd", null);
        strB.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new b(j8, j14, strB, 1, this), bVar);
    }

    @Override // wt1.u
    public final long m(long j8, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.h> interfaceC0995b) {
        interfaceC0995b.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new i(j8, fy1.i.a.f(), this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long p(long j8, cu1.b.d dVar) {
        dVar.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new e(j8, fy1.i.a.f(), this), dVar);
    }

    @Override // wt1.u
    public final long q(long j8, DateTime dateTime, DateTime dateTime2, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<List<fu1.u>> interfaceC0995b) {
        dateTime.getClass();
        dateTime2.getClass();
        interfaceC0995b.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new p(j8, dateTime, dateTime2, fy1.i.a.f(), this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long s(Integer num, Integer num2, Integer num3, com.garmin.android.apps.connectmobile.training.atp.create.steps.g.b bVar) {
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new m(num, fy1.i.a.f(), num2, num3, this), bVar);
    }

    @Override // wt1.u
    public final long t(long j8, cu1.b.g gVar) {
        gVar.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new com.garmin.android.apps.connectmobile.training.atp.biz.a(j8, null, 3, this, 2, null), gVar);
    }

    @Override // wt1.u
    public final long w(int i14, String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<fu1.p> interfaceC0995b) {
        interfaceC0995b.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new l(i14, str, fy1.i.a.e(), this), interfaceC0995b);
    }

    @Override // wt1.u
    public final long x(String str, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<xw1.o> interfaceC0995b) {
        interfaceC0995b.getClass();
        fy1.i.f73924a.getClass();
        return com.garmin.android.library.backgroundtaskmanagement.c.d(new o(str, fy1.i.a.e(), this), interfaceC0995b);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/s$a;", "", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/s;", "mInstance", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/s;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private s() {
    }
}
