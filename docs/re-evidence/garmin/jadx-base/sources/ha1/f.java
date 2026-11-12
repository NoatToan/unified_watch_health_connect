package ha1;

import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lha1/f;", "", "", "imageUrl", "imageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82700b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lha1/f$a;", "Lha1/f;", "Lps/j;", "activityImageDTO", "<init>", "(Lps/j;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f82701c;

        static {
            Parcelable.Creator<j> creator = j.CREATOR;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar) {
            super(jVar.getUrl(), jVar.getImageId());
            jVar.getClass();
            this.f82701c = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f82701c, ((a) obj).f82701c);
        }

        public final int hashCode() {
            return this.f82701c.hashCode();
        }

        public final String toString() {
            return "ActivityPhotoData(activityImageDTO=" + this.f82701c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lha1/f$b;", "Lha1/f;", "Ljo1/f;", "postImageDTO", "<init>", "(Ljo1/f;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jo1.f f82702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jo1.f fVar) {
            super(fVar.getImageUrl(), String.valueOf(fVar.getNewsPostHasImageId()));
            fVar.getClass();
            this.f82702c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f82702c, ((b) obj).f82702c);
        }

        public final int hashCode() {
            return this.f82702c.hashCode();
        }

        public final String toString() {
            return "PostPhotoData(postImageDTO=" + this.f82702c + ")";
        }
    }

    public f(String str, String str2) {
        this.f82699a = str;
        this.f82700b = str2;
    }
}
