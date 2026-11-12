package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes4.dex */
public class ce1 extends fl8 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f5237k;

    public class a extends fl8.c {
        public final File e;
        public final int f;

        public a(fl8 fl8Var) throws IOException {
            super(fl8Var);
            this.e = new File(ce1.this.d.getApplicationInfo().nativeLibraryDir);
            this.f = ce1.this.f5237k;
        }

        @Override // fl8.c
        public boolean m(ZipEntry zipEntry, String str) {
            boolean z;
            String name = zipEntry.getName();
            if (str.equals(ce1.this.e)) {
                ce1.this.e = null;
                String.format("allowing consideration of corrupted lib %s", str);
                return true;
            }
            if ((this.f & 1) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("allowing consideration of ");
                sb.append(name);
                sb.append(": self-extraction preferred");
                return true;
            }
            File file = new File(this.e, str);
            try {
                if (file.getCanonicalPath().startsWith(this.e.getCanonicalPath())) {
                    z = true;
                } else {
                    String.format("not allowing consideration of %s: %s not in lib dir", name, str);
                    z = false;
                }
            } catch (IOException e) {
                String.format("not allowing consideration of %s: %s, IOException when constructing path: %s", name, str, e.toString());
            }
            if (z) {
                if (!file.isFile()) {
                    String.format("allowing consideration of %s: %s not in system lib dir", name, str);
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length != size) {
                    String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    return true;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("not allowing consideration of ");
                sb2.append(name);
                sb2.append(": deferring to libdir");
            }
            return false;
        }
    }

    public ce1(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f5237k = i;
    }

    @Override // defpackage.bbq
    public byte[] o() throws IOException {
        File canonicalFile = this.i.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(SysUtil.g(this.d));
            if ((this.f5237k & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = this.d.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // defpackage.bbq
    public bbq.g t(byte b2) throws IOException {
        return new a(this);
    }
}
