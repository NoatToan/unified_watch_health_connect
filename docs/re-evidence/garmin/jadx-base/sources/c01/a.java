package c01;

import c83.a0;
import com.garmin.android.apps.connectmobile.calories.model.MyFitnessPalUserAuthDTO;
import i83.f;
import i83.k;
import i83.o;
import i83.s;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lc01/a;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;", "c", "()Lo53/i0;", "userAuthDTO", "", "b", "(Lcom/garmin/android/apps/connectmobile/calories/model/MyFitnessPalUserAuthDTO;)Lo53/i0;", "", "date", "a", "(Ljava/lang/String;)Lo53/i0;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("/myfitnesspal-service/syncData/{date}")
    i0<a0<Unit>> a(@s("date") String date);

    @k({"Content-Type: application/json"})
    @o("/myfitnesspal-service/userAuthorization")
    i0<a0<Unit>> b(@i83.a MyFitnessPalUserAuthDTO userAuthDTO);

    @f("/myfitnesspal-service/userAuthorization")
    i0<a0<MyFitnessPalUserAuthDTO>> c();
}
