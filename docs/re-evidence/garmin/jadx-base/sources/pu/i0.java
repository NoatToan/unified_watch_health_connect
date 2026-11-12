package pu;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lpu/i0;", "", "<init>", "()V", "b", "a", "Lpu/i0$a;", "Lpu/i0$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpu/i0$a;", "Lpu/i0;", "Lpu/h0;", "errorType", "<init>", "(Lpu/h0;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0 f141086a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var) {
            super(null);
            h0Var.getClass();
            this.f141086a = h0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f141086a == ((a) obj).f141086a;
        }

        public final int hashCode() {
            return this.f141086a.hashCode();
        }

        public final String toString() {
            return "Error(errorType=" + this.f141086a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpu/i0$b;", "Lpu/i0;", "Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;", "userSettingsDTO", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "socialProfileDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/model/UserSettingsDTO;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserSettingsDTO f141087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.garmin.android.apps.connectmobile.userprofile.model.m f141088b;

        static {
            Parcelable.Creator<com.garmin.android.apps.connectmobile.userprofile.model.m> creator = com.garmin.android.apps.connectmobile.userprofile.model.m.CREATOR;
            Parcelable.Creator<UserSettingsDTO> creator2 = UserSettingsDTO.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserSettingsDTO userSettingsDTO, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
            super(null);
            userSettingsDTO.getClass();
            mVar.getClass();
            this.f141087a = userSettingsDTO;
            this.f141088b = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f141087a, bVar.f141087a) && p005kotlin.jvm.internal.s.g(this.f141088b, bVar.f141088b);
        }

        public final int hashCode() {
            return this.f141088b.hashCode() + (this.f141087a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(userSettingsDTO=" + this.f141087a + ", socialProfileDTO=" + this.f141088b + ")";
        }
    }

    public /* synthetic */ i0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i0() {
    }
}
