package defpackage;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class zje implements zdp<o98> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f41342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i f41343b;
    public final ContentResolver c;

    public class a extends ddo<o98> {
        public final /* synthetic */ ImageRequest f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, hbi hbiVar, String str, String str2, ImageRequest imageRequest) {
            super(cg4Var, hbiVar, str, str2);
            this.f = imageRequest;
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(o98 o98Var) {
            o98.c(o98Var);
        }

        @Override // defpackage.ddo
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(o98 o98Var) {
            return ImmutableMap.of("createdThumbnail", Boolean.toString(o98Var != null));
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public o98 c() throws Exception {
            ExifInterface exifInterfaceG = zje.this.g(this.f.q());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return zje.this.e(zje.this.f41343b.c(exifInterfaceG.getThumbnail()), exifInterfaceG);
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ddo f41344a;

        public b(ddo ddoVar) {
            this.f41344a = ddoVar;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f41344a.a();
        }
    }

    public zje(Executor executor, n3i n3iVar, ContentResolver contentResolver) {
        this.f41342a = executor;
        this.f41343b = n3iVar;
        this.c = contentResolver;
    }

    @Override // defpackage.dbi
    public void a(cg4<o98> cg4Var, ebi ebiVar) {
        a aVar = new a(cg4Var, ebiVar.f(), "LocalExifThumbnailProducer", ebiVar.getId(), ebiVar.b());
        ebiVar.c(new b(aVar));
        this.f41342a.execute(aVar);
    }

    @Override // defpackage.zdp
    public boolean b(ypk ypkVar) {
        return bep.b(512, 512, ypkVar);
    }

    public final o98 e(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairA = jq2.a(new o3i(pooledByteBuffer));
        int iH = h(exifInterface);
        int iIntValue = pairA != null ? ((Integer) pairA.first).intValue() : -1;
        int iIntValue2 = pairA != null ? ((Integer) pairA.second).intValue() : -1;
        w14 w14VarD = w14.D(pooledByteBuffer);
        try {
            o98 o98Var = new o98((w14<PooledByteBuffer>) w14VarD);
            w14.l(w14VarD);
            o98Var.b0(pv5.f30818a);
            o98Var.c0(iH);
            o98Var.f0(iIntValue);
            o98Var.Z(iIntValue2);
            return o98Var;
        } catch (Throwable th) {
            w14.l(w14VarD);
            throw th;
        }
    }

    public boolean f(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    public ExifInterface g(Uri uri) throws Throwable {
        String strA = idq.a(this.c, uri);
        try {
            if (f(strA)) {
                return new ExifInterface(strA);
            }
            return null;
        } catch (IOException unused) {
            return null;
        } catch (StackOverflowError unused2) {
            cm8.e(zje.class, "StackOverflowError in ExifInterface constructor");
            return null;
        }
    }

    public final int h(ExifInterface exifInterface) {
        return ird.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }
}
