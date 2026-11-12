package nv0;

import c83.a0;
import i83.f;
import i83.k;
import i83.p;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0006H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lnv0/c;", "", "", "userPref", "Lo53/i0;", "Lc83/a0;", "Lnv0/b;", "a", "(Ljava/lang/String;)Lo53/i0;", "data", "b", "(Ljava/lang/String;Lnv0/b;)Lo53/i0;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {
    @f("/userpreference-service/{userPref}")
    i0<a0<b>> a(@s("userPref") String userPref);

    @k({"Content-Type: application/json"})
    @p("/userpreference-service/{userPref}")
    i0<a0<b>> b(@s("userPref") String userPref, @i83.a b data);
}
