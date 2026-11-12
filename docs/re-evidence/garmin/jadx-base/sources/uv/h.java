package uv;

import bs2.bk;
import bs2.id;
import java.io.File;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface h {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luv/h$a;", "", "", "fileIndex", "", "fileName", "Ljava/io/File;", "filesDir", "<init>", "(ILjava/lang/String;Ljava/io/File;)V", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f172895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f172896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f172897c;

        public a(int i14, String str, File file) {
            str.getClass();
            file.getClass();
            this.f172895a = i14;
            this.f172896b = str;
            this.f172897c = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f172895a == aVar.f172895a && this.f172896b.equals(aVar.f172896b) && this.f172897c.equals(aVar.f172897c);
        }

        public final int hashCode() {
            return this.f172897c.hashCode() + wr.g.j(Integer.hashCode(this.f172895a) * 31, 31, this.f172896b);
        }

        public final String toString() {
            StringBuilder sbR = wr.g.r(this.f172895a, "FileProprieties(fileIndex=", ", fileName=", this.f172896b, ", filesDir=");
            sbR.append(this.f172897c);
            sbR.append(")");
            return sbR.toString();
        }
    }

    boolean a();

    id b();

    bk c();
}
