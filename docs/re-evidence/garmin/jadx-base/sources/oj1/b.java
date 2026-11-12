package oj1;

import c83.a0;
import i83.p;
import o53.i0;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u0004H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Loj1/b;", "", "Lokhttp3/RequestBody;", "requestBodyAsJson", "Lo53/i0;", "Lc83/a0;", "", "b", "(Lokhttp3/RequestBody;)Lo53/i0;", "", "a", "()Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @i83.f("/userprofile-service/userprofile/user-settings")
    i0<a0<String>> a();

    @p("/userprofile-service/userprofile/user-settings")
    i0<a0<Unit>> b(@i83.a RequestBody requestBodyAsJson);
}
