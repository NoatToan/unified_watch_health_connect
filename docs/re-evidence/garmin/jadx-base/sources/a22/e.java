package a22;

import c83.a0;
import i83.o;
import i83.q;
import i83.s;
import java.util.List;
import o53.i0;
import okhttp3.MultipartBody;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001Jg\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011JW\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"La22/e;", "", "", "displayName", "", "Lokhttp3/MultipartBody$Part;", "files", "", "isAvatar", "Lcom/garmin/android/apps/connectmobile/userprofile/model/h;", "imageType", "frameKey", "avatarKey", "Lo53/i0;", "Lc83/a0;", "Lj12/h;", "b", "(Ljava/lang/String;Ljava/util/List;ZLcom/garmin/android/apps/connectmobile/userprofile/model/h;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "a", "(Ljava/lang/String;ZLcom/garmin/android/apps/connectmobile/userprofile/model/h;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface e {
    @o("image-service/imageservice/upload/{displayName}")
    i0<a0<List<j12.h>>> a(@s("displayName") String displayName, @i83.i("isAvatar") boolean isAvatar, @i83.i("x-gc-profile-image-type") com.garmin.android.apps.connectmobile.userprofile.model.h imageType, @i83.i("x-gc-profile-image-frame-key") String frameKey, @i83.i("x-gc-profile-image-avatar-key") String avatarKey);

    @o("image-service/imageservice/upload/{displayName}")
    @i83.l
    i0<a0<List<j12.h>>> b(@s("displayName") String displayName, @q List<MultipartBody.Part> files, @i83.i("isAvatar") boolean isAvatar, @i83.i("x-gc-profile-image-type") com.garmin.android.apps.connectmobile.userprofile.model.h imageType, @i83.i("x-gc-profile-image-frame-key") String frameKey, @i83.i("x-gc-profile-image-avatar-key") String avatarKey);
}
