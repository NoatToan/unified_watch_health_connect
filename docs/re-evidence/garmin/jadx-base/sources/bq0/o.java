package bq0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.lifecycle.t0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import d53.w;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lbq0/k;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.imagemultipicker.StorageImageViewModel$getStorageImages$1", f = "StorageImageViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<t0<List<? extends k>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f19531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f19532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f19533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ContentResolver contentResolver, String str, List<String> list, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f19531c = contentResolver;
        this.f19532d = str;
        this.f19533e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f19531c, this.f19532d, this.f19533e, dVar);
        oVar.f19530b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends k>> t0Var, t13.d<? super Unit> dVar) {
        return ((o) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Cursor cursorQuery;
        Object obj2;
        t0 t0Var = (t0) this.f19530b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19529a;
        if (i14 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            try {
                cursorQuery = this.f19531c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_size"}, null, null, this.f19532d);
            } catch (Throwable th3) {
                String strP = am.j.p("Failed to access external storage: ", th3);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "StorageImageViewModel", strP);
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                List<String> list = this.f19533e;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_size");
                    int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("_display_name");
                    while (cursor2.moveToNext()) {
                        long j8 = cursor2.getLong(columnIndexOrThrow);
                        double d14 = ((double) cursor2.getInt(columnIndexOrThrow2)) / 1000000.0d;
                        String string = cursor2.getString(columnIndexOrThrow3);
                        if (string != null) {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j8);
                            uriWithAppendedId.getClass();
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(string);
                            fileExtensionFromUrl.getClass();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
                            lowerCase.getClass();
                            if (w.J(lowerCase)) {
                                try {
                                    String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(URLEncoder.encode(string, "UTF-8"));
                                    fileExtensionFromUrl2.getClass();
                                    String lowerCase2 = fileExtensionFromUrl2.toLowerCase(locale);
                                    lowerCase2.getClass();
                                    lowerCase = lowerCase2;
                                } catch (UnsupportedEncodingException e4) {
                                    a2 a2Var2 = a2.GENERAL;
                                    String string2 = e4.toString();
                                    i2.f36769a.getClass();
                                    i2.a.e(a2Var2, string2);
                                }
                                if (w.J(lowerCase)) {
                                    String fileExtensionFromUrl3 = MimeTypeMap.getFileExtensionFromUrl(Uri.encode(string));
                                    fileExtensionFromUrl3.getClass();
                                    Locale locale2 = Locale.US;
                                    locale2.getClass();
                                    lowerCase = fileExtensionFromUrl3.toLowerCase(locale2);
                                    lowerCase.getClass();
                                }
                            }
                            if (list.contains(lowerCase)) {
                                arrayListX.add(new k(uriWithAppendedId, string, lowerCase, d14));
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    cursor.close();
                    obj2 = null;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        jg.b.l(cursor, th4);
                        throw th5;
                    }
                }
            } else {
                obj2 = null;
            }
            this.f19530b = obj2;
            this.f19529a = 1;
            if (t0Var.emit(arrayListX, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
