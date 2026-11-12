package com.garmin.android.apps.connectmobile.pulseox.data;

import b63.o;
import c83.h;
import com.garmin.android.apps.connectmobile.f0;
import fz0.c;
import fz0.d;
import i83.f;
import i83.s;
import i83.t;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pulseox/data/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Ldc1/b;", "<init>", "()V", "a", "b", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements f0, dc1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41054a = new b(null);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pulseox.data.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pulseox/data/a$a;", "", "Lfz0/c;", "date", "Lo53/i0;", "Ldc1/a;", "a", "(Lfz0/c;)Lo53/i0;", "startDate", "endDate", "Lnl/a;", "b", "(Lfz0/c;Lfz0/c;)Lo53/i0;", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface InterfaceC0776a {
        @f("/wellness-service/wellness/daily/spo2acclimation/{date}")
        i0<dc1.a> a(@s("date") c date);

        @f("/wellness-service/stats/daily/acclimation?")
        i0<nl.a> b(@t("fromDate") c startDate, @t("untilDate") c endDate);
    }

    @Override // dc1.b
    public final i0 a(o oVar, o oVar2) {
        f41054a.getClass();
        return ((InterfaceC0776a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, InterfaceC0776a.class, new h.a[0], null, null, null, 120)).b(d.a(oVar), d.a(oVar2));
    }

    @Override // dc1.b
    public final i0 b(o oVar) {
        f41054a.getClass();
        return ((InterfaceC0776a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, InterfaceC0776a.class, new h.a[0], null, null, null, 120)).a(d.a(oVar));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pulseox/data/a$b;", "", "<init>", "()V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
