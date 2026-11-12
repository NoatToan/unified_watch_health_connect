package au2;

import a23.g;
import com.google.gson.Gson;
import e23.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "file", "Lau2/a$a;", "invoke", "(Ljava/io/File;)Lau2/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class c extends w implements l<File, a.C0184a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gson f13061a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Gson gson) {
        super(1);
        this.f13061a = gson;
    }

    @Override // e23.l
    public final a.C0184a invoke(File file) throws IOException {
        boolean zAdd;
        zt2.a aVar;
        File file2 = file;
        a.c cVar = a.f13046e;
        file2.getClass();
        Gson gson = this.f13061a;
        cVar.getClass();
        LinkedHashSet linkedHashSet = a.f13048g;
        synchronized (linkedHashSet) {
            String absolutePath = file2.getAbsolutePath();
            absolutePath.getClass();
            zAdd = linkedHashSet.add(absolutePath);
        }
        a.C0184a c0184a = null;
        if (!zAdd) {
            return null;
        }
        if (System.currentTimeMillis() - file2.lastModified() > 1209600000) {
            synchronized (linkedHashSet) {
                linkedHashSet.remove(file2.getAbsolutePath());
            }
            try {
                file2.delete();
                a.c.c().debug("deleted stale file [" + file2.getAbsolutePath() + "]");
            } catch (Exception e4) {
                a.c.c().error("error deleting stale file [" + file2.getAbsolutePath() + "]", (Throwable) e4);
            }
        } else {
            FileInputStream fileInputStream = new FileInputStream(file2);
            try {
                long length = file2.length();
                if (length > 2147483647L) {
                    throw new OutOfMemoryError("File " + file2 + " is too big (" + length + " bytes) to fit in memory.");
                }
                int i14 = (int) length;
                byte[] bArrCopyOf = new byte[i14];
                int i15 = i14;
                int i16 = 0;
                while (i15 > 0) {
                    int i17 = fileInputStream.read(bArrCopyOf, i16, i15);
                    if (i17 < 0) {
                        break;
                    }
                    i15 -= i17;
                    i16 += i17;
                }
                if (i15 > 0) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i16);
                } else {
                    int i18 = fileInputStream.read();
                    if (i18 != -1) {
                        a23.a aVar2 = new a23.a(8193);
                        aVar2.write(i18);
                        dh.b.p(fileInputStream, aVar2, 8192);
                        int size = aVar2.size() + i14;
                        if (size < 0) {
                            throw new OutOfMemoryError("File " + file2 + " is too big to fit in memory.");
                        }
                        byte[] bArrA = aVar2.a();
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                        s.e(bArrA, i14, 0, bArrCopyOf, aVar2.size());
                    }
                }
                fileInputStream.close();
                gson.getClass();
                try {
                    aVar = (zt2.a) gson.fromJson(new String(bArrCopyOf, d53.c.f57666b), zt2.a.class);
                } catch (Exception e14) {
                    a.c.c().error("parse", (Throwable) e14);
                    aVar = null;
                }
                if (aVar != null) {
                    c0184a = new a.C0184a(file2, aVar);
                } else {
                    a.c.c().error("failed to parse [" + file2.getAbsolutePath() + "], deleting...");
                    if (!g.d(file2)) {
                        com.airbnb.lottie.animation.keyframe.a.z("failed to delete [", file2.getAbsolutePath(), "]", a.c.c());
                    }
                }
                if (c0184a == null) {
                    LinkedHashSet linkedHashSet2 = a.f13048g;
                    synchronized (linkedHashSet2) {
                        linkedHashSet2.remove(file2.getAbsolutePath());
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(fileInputStream, th3);
                    throw th4;
                }
            }
        }
        return c0184a;
    }
}
