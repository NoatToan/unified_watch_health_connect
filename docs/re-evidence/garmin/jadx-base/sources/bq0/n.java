package bq0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.OutputStream;
import java.util.List;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/t0;", "Landroid/net/Uri;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagemultipicker.StorageImageViewModel$addImageToSharedMedia$1", f = "StorageImageViewModel.kt", l = {226, 232}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<t0<Uri>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f19523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f19524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f19525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.CompressFormat f19526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f19527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bitmap f19528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, Integer num, l lVar, Bitmap.CompressFormat compressFormat, String str, Bitmap bitmap, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f19523c = context;
        this.f19524d = num;
        this.f19525e = lVar;
        this.f19526f = compressFormat;
        this.f19527g = str;
        this.f19528h = bitmap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f19523c, this.f19524d, this.f19525e, this.f19526f, this.f19527g, this.f19528h, dVar);
        nVar.f19522b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(t0<Uri> t0Var, t13.d<? super Unit> dVar) {
        return ((n) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        if (r0.emit(null, r11) == r1) goto L55;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int iIntValue;
        t0 t0Var = (t0) this.f19522b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19521a;
        try {
            if (i14 == 0) {
                r.b(obj);
                ContentValues contentValues = new ContentValues();
                String str2 = this.f19527g;
                contentValues.put("title", str2);
                contentValues.put("_display_name", str2);
                List<String> list = l.f19513b;
                this.f19525e.getClass();
                int[] iArr = l.b.f19515a;
                Bitmap.CompressFormat compressFormat = this.f19526f;
                int i15 = iArr[compressFormat.ordinal()];
                if (i15 == 1) {
                    str = MimeTypes.IMAGE_JPEG;
                } else if (i15 != 2) {
                    str = i15 != 3 ? null : "image/webp";
                } else {
                    str = "image/png";
                }
                if (str != null) {
                    contentValues.put("mime_type", str);
                }
                contentValues.put("date_added", new Long(DateTime.now().getMillis() / ((long) 1000)));
                if (Build.VERSION.SDK_INT >= 29) {
                    contentValues.put("datetaken", new Long(DateTime.now().getMillis()));
                }
                ContentResolver contentResolver = this.f19523c.getApplicationContext().getContentResolver();
                Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert != null) {
                    Integer num = this.f19524d;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = iArr[compressFormat.ordinal()] != 1 ? 100 : 90;
                    }
                    OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            this.f19528h.compress(compressFormat, iIntValue, outputStreamOpenOutputStream);
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                jg.b.l(outputStreamOpenOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                    this.f19522b = t0Var;
                    this.f19521a = 1;
                    if (t0Var.emit(uriInsert, this) == aVar) {
                    }
                } else {
                    this.f19522b = null;
                    this.f19521a = 2;
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    r.b(obj);
                    return Unit.INSTANCE;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            return Unit.INSTANCE;
        } catch (Exception e4) {
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "Cannot insert image to media: ");
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "StorageImageViewModel", strD);
            this.f19522b = null;
            this.f19521a = 2;
        }
    }
}
