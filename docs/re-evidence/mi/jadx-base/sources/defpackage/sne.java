package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class sne implements dbi<w14<u14>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f33813b;

    public class a extends ddo<w14<u14>> {
        public final /* synthetic */ hbi f;
        public final /* synthetic */ String g;
        public final /* synthetic */ ImageRequest h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cg4 cg4Var, hbi hbiVar, String str, String str2, hbi hbiVar2, String str3, ImageRequest imageRequest) {
            super(cg4Var, hbiVar, str, str2);
            this.f = hbiVar2;
            this.g = str3;
            this.h = imageRequest;
        }

        @Override // defpackage.ddo, defpackage.edo
        public void e(Exception exc) {
            super.e(exc);
            this.f.i(this.g, "VideoThumbnailProducer", false);
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(w14<u14> w14Var) {
            w14.l(w14Var);
        }

        @Override // defpackage.ddo
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<String, String> i(w14<u14> w14Var) {
            return ImmutableMap.of("createdThumbnail", String.valueOf(w14Var != null));
        }

        @Override // defpackage.edo
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public w14<u14> c() throws Exception {
            Bitmap bitmapCreateVideoThumbnail;
            String strF = sne.this.f(this.h);
            if (strF == null || (bitmapCreateVideoThumbnail = ThumbnailUtils.createVideoThumbnail(strF, sne.e(this.h))) == null) {
                return null;
            }
            return w14.D(new z14(bitmapCreateVideoThumbnail, gcm.a(), z6d.d, 0));
        }

        @Override // defpackage.ddo, defpackage.edo
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(w14<u14> w14Var) {
            super.f(w14Var);
            this.f.i(this.g, "VideoThumbnailProducer", w14Var != null);
        }
    }

    public class b extends ea2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ddo f33814a;

        public b(ddo ddoVar) {
            this.f33814a = ddoVar;
        }

        @Override // defpackage.fbi
        public void b() {
            this.f33814a.a();
        }
    }

    public sne(Executor executor, ContentResolver contentResolver) {
        this.f33812a = executor;
        this.f33813b = contentResolver;
    }

    public static int e(ImageRequest imageRequest) {
        return (imageRequest.i() > 96 || imageRequest.h() > 96) ? 1 : 3;
    }

    @Override // defpackage.dbi
    public void a(cg4<w14<u14>> cg4Var, ebi ebiVar) {
        hbi hbiVarF = ebiVar.f();
        String id = ebiVar.getId();
        a aVar = new a(cg4Var, hbiVarF, "VideoThumbnailProducer", id, hbiVarF, id, ebiVar.b());
        ebiVar.c(new b(aVar));
        this.f33812a.execute(aVar);
    }

    public final String f(ImageRequest imageRequest) {
        Uri uri;
        String str;
        String[] strArr;
        Uri uriQ = imageRequest.q();
        if (idq.i(uriQ)) {
            return imageRequest.p().getPath();
        }
        if (idq.h(uriQ)) {
            if ("com.android.providers.media.documents".equals(uriQ.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(uriQ);
                Uri uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
                uri = uri2;
                str = "_id=?";
            } else {
                uri = uriQ;
                str = null;
                strArr = null;
            }
            Cursor cursorQuery = this.f33813b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }
}
