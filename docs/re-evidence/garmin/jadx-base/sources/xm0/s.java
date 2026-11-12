package xm0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxm0/s;", "Landroidx/lifecycle/x1$c;", "", "groupId", "Lorg/joda/time/DateTime;", "startDateTime", "endDateTime", "Lj10/d;", "leaderboardType", "Lxm0/v;", "relationshipType", "<init>", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lj10/d;Lxm0/v;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f191461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f191462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f191463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j10.d f191464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f191465e;

    public s(long j8, DateTime dateTime, DateTime dateTime2, j10.d dVar, v vVar) {
        dateTime.getClass();
        dateTime2.getClass();
        dVar.getClass();
        this.f191461a = j8;
        this.f191462b = dateTime;
        this.f191463c = dateTime2;
        this.f191464d = dVar;
        this.f191465e = vVar;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (!cls.equals(p.class)) {
            vb.h.s("Failed requirement.");
            return null;
        }
        return new p(this.f191461a, this.f191462b, this.f191463c, this.f191464d, this.f191465e);
    }
}
