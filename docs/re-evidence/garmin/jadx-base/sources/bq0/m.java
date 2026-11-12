package bq0;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.lifecycle.t0;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import j20.x;
import java.io.File;
import java.util.List;
import java.util.Locale;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/net/Uri;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagemultipicker.StorageImageViewModel$addImageFromUriToSharedMedia$1", f = "StorageImageViewModel.kt", l = {SyslogConstants.LOG_LOCAL6, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<t0<Uri>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f19518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f19519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f19520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, Uri uri, l lVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f19518c = context;
        this.f19519d = uri;
        this.f19520e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f19518c, this.f19519d, this.f19520e, dVar);
        mVar.f19517b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Uri> t0Var, t13.d<? super Unit> dVar) {
        return ((m) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r0.emit(null, r14) == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0105, code lost:
    
        if (r0.a(r15, r14) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o13.p pVar;
        Bitmap.CompressFormat compressFormat;
        t0 t0Var = (t0) this.f19517b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19516a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                r.b(obj);
                return Unit.INSTANCE;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        Context context = this.f19518c;
        ContentResolver contentResolver = context.getContentResolver();
        int i15 = Build.VERSION.SDK_INT;
        Uri uri = this.f19519d;
        Bitmap bitmapDecodeBitmap = i15 >= 29 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri)) : MediaStore.Images.Media.getBitmap(contentResolver, uri);
        if (bitmapDecodeBitmap == null) {
            this.f19517b = null;
            this.f19516a = 1;
        } else {
            List<String> list = l.f19513b;
            l lVar = this.f19520e;
            lVar.getClass();
            String path = uri.getPath();
            if (path == null) {
                pVar = new o13.p(String.valueOf(System.currentTimeMillis()), "jpg");
            } else {
                File file = new File(path);
                String name = file.getName();
                name.getClass();
                if (name.length() == 0) {
                    name = String.valueOf(System.currentTimeMillis());
                }
                String strE = a23.g.e(file);
                if (strE.length() == 0) {
                    strE = "jpg";
                }
                pVar = new o13.p(name, strE);
            }
            String str = (String) pVar.f128594a;
            String str2 = (String) pVar.f128595b;
            Locale locale = Locale.ENGLISH;
            switch (x.f(locale, str2, locale)) {
                case "jpg":
                    compressFormat = Bitmap.CompressFormat.JPEG;
                    break;
                case "png":
                    compressFormat = Bitmap.CompressFormat.PNG;
                    break;
                case "jpeg":
                    compressFormat = Bitmap.CompressFormat.JPEG;
                    break;
                case "webp":
                    compressFormat = Bitmap.CompressFormat.WEBP;
                    break;
                default:
                    compressFormat = Bitmap.CompressFormat.JPEG;
                    break;
            }
            Bitmap.CompressFormat compressFormat2 = compressFormat;
            Integer num = new Integer(100);
            lVar.getClass();
            context.getClass();
            compressFormat2.getClass();
            str.getClass();
            androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(lVar.f19514a, new n(context, num, lVar, compressFormat2, str, bitmapDecodeBitmap, null), 2);
            this.f19517b = null;
            this.f19516a = 2;
        }
        return aVar;
    }
}
