package rk2;

import android.content.Context;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.UrlSourceException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import java.io.File;
import java.net.URI;
import java.util.HashMap;
import ok2.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import wk2.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0011B?\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lrk2/h;", "Lwk2/o;", "Lrs2/c;", "deviceInfo", "Lgy2/c;", "deviceMessageDto", "Ljy2/a;", "firmwareUpdate", "Lwk2/f;", TtmlNode.TAG_METADATA, "", "url", "logPrefix", "<init>", "(Lrs2/c;Lgy2/c;Ljy2/a;Lwk2/f;Ljava/lang/String;Ljava/lang/String;)V", "(Lrs2/c;Lgy2/c;Lwk2/f;Ljava/lang/String;)V", "(Lrs2/c;Ljy2/a;Lwk2/f;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f153384n = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final rs2.c f153385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final gy2.c f153386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jy2.a f153387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f153388m;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(rs2.c cVar, gy2.c cVar2, wk2.f fVar, String str) {
        cVar.getClass();
        cVar2.getClass();
        fVar.getClass();
        str.getClass();
        String strG = cVar2.g();
        if (strG != null) {
            this(cVar, cVar2, null, fVar, strG, str);
        } else {
            vb.h.s("serverPath must be non-null");
            throw null;
        }
    }

    @Override // wk2.o
    public final Object h(File file, t13.d<? super Unit> dVar) throws CoreTransferException {
        File file2;
        gy2.e eVarA;
        URI uri;
        try {
            String str = this.f153388m;
            wk2.f fVar = this.f185872e;
            jy2.a aVar = this.f153387l;
            rs2.c cVar = this.f153385j;
            iy2.e eVar = new iy2.e(str);
            gy2.c cVar2 = this.f153386k;
            if (cVar2 != null) {
                a0.a aVar2 = a0.f132585h;
                Context context = aVar2.a().getConfiguration().f132622b;
                context.getClass();
                eVarA = eVar.b(cVar2, file, context, aVar2.a().getConfiguration().p());
                file2 = file;
            } else {
                HashMap mapC = cl2.c.c(nd2.a.f125408a, cVar);
                long f172494b = cVar.getF92746j();
                String string = (aVar == null || (uri = aVar.f101855c) == null) ? null : uri.toString();
                long j8 = aVar != null ? aVar.f101858f : 0L;
                a0.a aVar3 = a0.f132585h;
                Context context2 = aVar3.a().getConfiguration().f132622b;
                context2.getClass();
                file2 = file;
                eVarA = eVar.a(f172494b, string, j8, file2, context2, aVar3.a().getConfiguration().p(), mapC);
            }
            long j14 = eVarA.f80307c;
            String str2 = eVarA.f80306b;
            long j15 = fVar.f185845d;
            if (j15 > 0 && j15 != j14) {
                file2.delete();
                a aVar4 = f153384n;
                String str3 = this.f185873f;
                aVar4.getClass();
                fVar.getClass();
                str3.getClass();
                StringBuilder sbK = e0.k(fVar.f185845d, "mismatch between expected size ", " and downloaded size ");
                sbK.append(j14);
                throw new UrlSourceException(new IllegalStateException(sbK.toString()), "Failed SW doDownload mismatch between expected size", null, str3, 4, null);
            }
            if (!new File(eVarA.f80305a, str2).exists()) {
                throw new UrlSourceException(null, "SW File " + str2 + " does not exist", null, this.f185873f, 4, null);
            }
            iy2.a.f95840a.getClass();
            if (iy2.a.b(file2)) {
                return Unit.INSTANCE;
            }
            file2.delete();
            throw new UrlSourceException(null, "SW File " + str2 + " contents contain HTML instead of valid content", null, this.f185873f, 4, null);
        } catch (Exception e4) {
            throw g(e4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrk2/h$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    private h(rs2.c cVar, gy2.c cVar2, jy2.a aVar, wk2.f fVar, String str, String str2) {
        super(cVar, fVar, str);
        this.f153385j = cVar;
        this.f153386k = cVar2;
        this.f153387l = aVar;
        this.f153388m = str2;
    }

    public /* synthetic */ h(rs2.c cVar, gy2.c cVar2, jy2.a aVar, wk2.f fVar, String str, String str2, int i14, j jVar) {
        this(cVar, cVar2, aVar, fVar, str, (i14 & 32) != 0 ? "CFT#" : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(rs2.c cVar, jy2.a aVar, wk2.f fVar) {
        cVar.getClass();
        aVar.getClass();
        fVar.getClass();
        String string = aVar.f101855c.toString();
        string.getClass();
        this(cVar, null, aVar, fVar, string, null, 32, null);
    }
}
