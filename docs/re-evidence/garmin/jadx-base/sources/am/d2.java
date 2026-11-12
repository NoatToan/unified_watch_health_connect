package am;

import okhttp3.MultipartBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lam/d2;", "", "", "activityId", "Lokhttp3/MultipartBody$Part;", "part", "Lc83/a0;", "Lps/j;", "a", "(JLokhttp3/MultipartBody$Part;Lt13/d;)Ljava/lang/Object;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d2 {
    @i83.o("/activity-service/activity/{activityId}/image")
    @i83.l
    Object a(@i83.s("activityId") long j8, @i83.q MultipartBody.Part part, t13.d<? super c83.a0<ps.j>> dVar);
}
