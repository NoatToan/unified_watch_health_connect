package ww1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B?\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lww1/f;", "", "", "planId", "", "planName", "", "progressWeeks", "totalWeeks", "Lorg/joda/time/DateTime;", "raceDate", "atpCoachName", "<init>", "(JLjava/lang/String;IILorg/joda/time/DateTime;Ljava/lang/String;)V", "Lww1/a;", "Lww1/b;", "Lww1/c;", "Lww1/d;", "Lww1/e;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f187758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DateTime f187759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f187760f;

    public /* synthetic */ f(long j8, String str, int i14, int i15, DateTime dateTime, String str2, int i16, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, i14, i15, dateTime, (i16 & 32) != 0 ? null : str2, null);
    }

    private f(long j8, String str, int i14, int i15, DateTime dateTime, String str2) {
        this.f187755a = j8;
        this.f187756b = str;
        this.f187757c = i14;
        this.f187758d = i15;
        this.f187759e = dateTime;
        this.f187760f = str2;
    }

    public /* synthetic */ f(long j8, String str, int i14, int i15, DateTime dateTime, String str2, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, i14, i15, dateTime, str2);
    }
}
