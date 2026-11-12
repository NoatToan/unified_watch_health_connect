package ww1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lww1/b;", "Lww1/f;", "", "planId", "", "planName", "", "progressWeeks", "totalWeeks", "Lorg/joda/time/DateTime;", "raceDate", "Lvt1/o;", "trainingType", "Lfg0/k;", "eventDTO", "<init>", "(JLjava/lang/String;IILorg/joda/time/DateTime;Lvt1/o;Lfg0/k;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vt1.o f187720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fg0.k f187721h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j8, String str, int i14, int i15, DateTime dateTime, vt1.o oVar, fg0.k kVar) {
        super(j8, str, i14, i15, dateTime, null, 32, null);
        str.getClass();
        this.f187720g = oVar;
        this.f187721h = kVar;
    }

    public /* synthetic */ b(long j8, String str, int i14, int i15, DateTime dateTime, vt1.o oVar, fg0.k kVar, int i16, p005kotlin.jvm.internal.j jVar) {
        this(j8, str, i14, i15, dateTime, oVar, (i16 & 64) != 0 ? null : kVar);
    }
}
