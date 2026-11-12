package bn0;

import c83.a0;
import i83.s;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0006J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lbn0/c;", "", "", "groupTrackId", "Lc83/a0;", "Lcn0/b;", "a", "(Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18976a = a.f18977a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbn0/c$a;", "", "<init>", "()V", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f18977a = new a();

        private a() {
        }
    }

    @i83.f("/tracker/fitness/groupride/api/v1/sessions/{groupTrackId}")
    Object a(@s("groupTrackId") String str, t13.d<? super a0<cn0.b>> dVar);
}
