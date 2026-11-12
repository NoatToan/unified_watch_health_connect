package yj1;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyj1/e$a;", "Lyj1/e;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f197531a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 238346480;
        }

        public final String toString() {
            return "AdminSetupRequired";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyj1/e$b;", "Lyj1/e;", "Lwj1/a;", "data", "<init>", "(Lwj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wj1.a f197532a;

        static {
            Parcelable.Creator<wj1.a> creator = wj1.a.CREATOR;
        }

        public b(wj1.a aVar) {
            aVar.getClass();
            this.f197532a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f197532a.equals(((b) obj).f197532a);
        }

        public final int hashCode() {
            return this.f197532a.hashCode();
        }

        public final String toString() {
            return "MissingPhoneNumbers(data=" + this.f197532a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyj1/e$c;", "Lyj1/e;", "Lwj1/a;", "data", "<init>", "(Lwj1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wj1.a f197533a;

        static {
            Parcelable.Creator<wj1.a> creator = wj1.a.CREATOR;
        }

        public c(wj1.a aVar) {
            aVar.getClass();
            this.f197533a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f197533a.equals(((c) obj).f197533a);
        }

        public final int hashCode() {
            return this.f197533a.hashCode();
        }

        public final String toString() {
            return "NoContacts(data=" + this.f197533a + ")";
        }
    }
}
