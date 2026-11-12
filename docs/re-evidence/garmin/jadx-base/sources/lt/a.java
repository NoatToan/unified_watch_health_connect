package lt;

import androidx.room.a0;
import com.google.firebase.messaging.Constants;
import ht.r;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends r {

    /* JADX INFO: renamed from: lt.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/a$a;", "", "", "errorString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2181a {
        REQUEST_API_FAILED("RequestApiFailed"),
        GET_REPORT_API_FAILED("GetReportApiFailed"),
        API_ERROR_WITHOUT_CACHE_FAILED("APIErrorWithoutCacheFailed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114798a;

        EnumC2181a(String str) {
            this.f114798a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/a$b;", "Llt/a;", "Llt/a$a;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Llt/a$a;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC2181a f114799a;

        public b(EnumC2181a enumC2181a) {
            enumC2181a.getClass();
            this.f114799a = enumC2181a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f114799a == ((b) obj).f114799a;
        }

        public final int hashCode() {
            return this.f114799a.hashCode();
        }

        public final String toString() {
            return "AnnualReportAPIErrorEvent(error=" + this.f114799a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/a$c;", "", "", "actionString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        ACTION_CHAPTER_SHARE("Share"),
        ACTION_CHAPTER_PAUSE("Pause"),
        ACTION_CHAPTER_SKIP("Skip"),
        ACTION_CHAPTER_SCREENSHOT("Screenshot"),
        ACTION_CHAPTER_GENERATED("Generated");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114806a;

        c(String str) {
            this.f114806a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/a$d;", "", "", "errorString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum d {
        MAP_VIEW_FAILED("MapViewFailed"),
        CHAPTER_MAIN_ANIMATION_FAILED("MainAnimationFailed"),
        CHAPTER_SHARE_IMAGE_FAILED("ShareImageFailed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114811a;

        d(String str) {
            this.f114811a = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/a$e;", "Llt/a;", "", "chapterName", "Llt/a$d;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Llt/a$d;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f114813b;

        public e(String str, d dVar) {
            str.getClass();
            dVar.getClass();
            this.f114812a = str;
            this.f114813b = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f114812a.equals(eVar.f114812a) && this.f114813b == eVar.f114813b;
        }

        public final int hashCode() {
            return this.f114813b.hashCode() + (this.f114812a.hashCode() * 31);
        }

        public final String toString() {
            return "AnnualReportChapterErrorEvent(chapterName=" + this.f114812a + ", error=" + this.f114813b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt/a$f;", "Llt/a;", "", "chapterName", "Llt/a$c;", "action", "<init>", "(Ljava/lang/String;Llt/a$c;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f114814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f114815b;

        public f(String str, c cVar) {
            str.getClass();
            cVar.getClass();
            this.f114814a = str;
            this.f114815b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f114814a.equals(fVar.f114814a) && this.f114815b == fVar.f114815b;
        }

        public final int hashCode() {
            return this.f114815b.hashCode() + (this.f114814a.hashCode() * 31);
        }

        public final String toString() {
            return "AnnualReportChapterEvent(chapterName=" + this.f114814a + ", action=" + this.f114815b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llt/a$g;", "Llt/a;", "", "processDuration", "<init>", "(J)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f114816a;

        public g(long j8) {
            this.f114816a = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f114816a == ((g) obj).f114816a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f114816a);
        }

        public final String toString() {
            return a0.f(this.f114816a, "AnnualReportProcessEvent(processDuration=", ")");
        }
    }

    @Override // ht.r
    default zk.a a() {
        String str;
        ArrayList arrayList = new ArrayList();
        boolean z14 = this instanceof b;
        if (z14) {
            arrayList.add(new zk.e(Constants.IPC_BUNDLE_KEY_SEND_ERROR, ((b) this).f114799a.f114798a));
        } else if (this instanceof e) {
            e eVar = (e) this;
            arrayList.add(new zk.e(Constants.IPC_BUNDLE_KEY_SEND_ERROR, k.g(eVar.f114812a, eVar.f114813b.f114811a)));
        } else if (this instanceof f) {
            f fVar = (f) this;
            arrayList.add(new zk.e("Action", k.g(fVar.f114814a, fVar.f114815b.f114806a)));
        } else {
            if (!(this instanceof g)) {
                u0.r();
                return null;
            }
            arrayList.add(new zk.e("DurationMillis", Long.valueOf(((g) this).f114816a)));
        }
        if (z14) {
            str = "AnnualReportAPIErrorEvent";
        } else if (this instanceof e) {
            str = "AnnualReportChapterErrorEvent";
        } else if (this instanceof f) {
            str = "AnnualReportChapterEvent";
        } else {
            if (!(this instanceof g)) {
                u0.r();
                return null;
            }
            str = "AnnualReportProcessEvent";
        }
        return new zk.a(str, arrayList, false, 0L, 12, null);
    }
}
