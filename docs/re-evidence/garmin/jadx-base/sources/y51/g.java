package y51;

import b63.o;
import c83.a0;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\u000e2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Ly51/g;", "", "Lo53/i0;", "Lc83/a0;", "Lz51/g;", "b", "()Lo53/i0;", "", "pendingActivityId", "Lfz0/c;", "calendarDate", "Lz51/a;", "c", "(Ljava/lang/String;Lfz0/c;)Lo53/i0;", "Lb63/o;", "Lz51/f;", "statusRequestDTO", "", "a", "(Lb63/o;Ljava/lang/String;Lz51/f;)Lo53/i0;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface g {
    @p("/pendingactivity-service/pending-activities/{calendarDate}/{pendingActivityUUID}")
    i0<a0<Unit>> a(@s("calendarDate") o calendarDate, @s("pendingActivityUUID") String pendingActivityId, @i83.a z51.f statusRequestDTO);

    @i83.f("/pendingactivity-service/pending-activities")
    i0<a0<z51.g>> b();

    @i83.f("/pendingactivity-service/pending-activities/{calendarDate}/{pendingActivityUUID}")
    i0<a0<z51.a>> c(@s("pendingActivityUUID") String pendingActivityId, @s("calendarDate") fz0.c calendarDate);
}
