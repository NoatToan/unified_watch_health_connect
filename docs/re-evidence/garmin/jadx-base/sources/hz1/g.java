package hz1;

import am.j;
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
import e23.p;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v.h;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/t0;", "", "Lhz1/e;", "", "<anonymous>", "(Landroidx/lifecycle/t0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.traininginitiative.ui.imagemultipicker.StorageImageViewModel$getStorageImages$1", f = "StorageImageViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
public final class g extends i implements p<t0<List<? extends e>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f86540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f86541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f86542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f86543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f86544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ContentResolver contentResolver, String str, List<String> list, long j8, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f86541c = contentResolver;
        this.f86542d = str;
        this.f86543e = list;
        this.f86544f = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f86541c, this.f86542d, this.f86543e, this.f86544f, dVar);
        gVar.f86540b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(t0<List<? extends e>> t0Var, t13.d<? super Unit> dVar) {
        return ((g) create(t0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Cursor cursorQuery;
        ArrayList arrayList;
        String lowerCase;
        ArrayList arrayList2;
        t0 t0Var = (t0) this.f86540b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86539a;
        Object obj2 = null;
        if (i14 == 0) {
            ArrayList arrayListX = h.x(obj);
            try {
                cursorQuery = this.f86541c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name", "_size"}, null, null, this.f86542d);
            } catch (Throwable th3) {
                String strP = j.p("Failed to access external storage: ", th3);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "StorageImageViewModel", strP);
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                List<String> list = this.f86543e;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_size");
                    int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("_display_name");
                    while (cursor2.moveToNext()) {
                        long j8 = cursor2.getLong(columnIndexOrThrow);
                        int i15 = cursor2.getInt(columnIndexOrThrow2);
                        String string = cursor2.getString(columnIndexOrThrow3);
                        if (string != null) {
                            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j8);
                            uriWithAppendedId.getClass();
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(string);
                            fileExtensionFromUrl.getClass();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String lowerCase2 = fileExtensionFromUrl.toLowerCase(locale);
                            lowerCase2.getClass();
                            if (w.J(lowerCase2)) {
                                try {
                                    String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(URLEncoder.encode(string, "UTF-8"));
                                    fileExtensionFromUrl2.getClass();
                                    lowerCase = fileExtensionFromUrl2.toLowerCase(locale);
                                    lowerCase.getClass();
                                } catch (UnsupportedEncodingException e4) {
                                    a2 a2Var2 = a2.GENERAL;
                                    String string2 = e4.toString();
                                    i2.f36769a.getClass();
                                    i2.a.e(a2Var2, string2);
                                    lowerCase = lowerCase2;
                                }
                            } else {
                                lowerCase = lowerCase2;
                            }
                            if (list.contains(lowerCase)) {
                                ArrayList arrayList3 = arrayListX;
                                if (i15 > this.f86544f) {
                                    arrayList2 = arrayList3;
                                } else {
                                    e eVar = new e(uriWithAppendedId, string, lowerCase);
                                    arrayList2 = arrayList3;
                                    arrayList2.add(eVar);
                                }
                            } else {
                                arrayList2 = arrayListX;
                            }
                            arrayListX = arrayList2;
                        }
                    }
                    arrayList = arrayListX;
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
                arrayList = arrayListX;
            }
            this.f86540b = obj2;
            this.f86539a = 1;
            if (t0Var.emit(arrayList, this) == aVar) {
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
