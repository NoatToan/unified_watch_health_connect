package i7;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p1.c0;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0<b, ProviderInfo> f91905a = new c0<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.browser.trusted.c f91906b = new androidx.browser.trusted.c(15);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f91907a;

        public a(Context context, Uri uri) {
            this.f91907a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<List<byte[]>> f91910c;

        public b(String str, String str2, List<List<byte[]>> list) {
            this.f91908a = str;
            this.f91909b = str2;
            this.f91910c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f91908a, bVar.f91908a) && Objects.equals(this.f91909b, bVar.f91909b) && Objects.equals(this.f91910c, bVar.f91910c);
        }

        public final int hashCode() {
            return Objects.hash(this.f91908a, this.f91909b, this.f91910c);
        }
    }

    private d() {
    }

    public static k a(Context context, List list) {
        String str;
        Typeface typefaceC;
        Trace.beginSection(ce.a.d("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < list.size(); i14++) {
                e eVar = (e) list.get(i14);
                if (Build.VERSION.SDK_INT < 31 || (typefaceC = c7.h.c((str = eVar.f91916f))) == null || c7.h.d(typefaceC) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), eVar, context.getResources());
                    if (providerInfoB == null) {
                        return new k(1, (l[]) null);
                    }
                    arrayList.add(c(context, eVar, providerInfoB.authority));
                } else {
                    arrayList.add(new l[]{new l(str, eVar.f91917g)});
                }
            }
            return new k(0, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, e eVar, Resources resources) {
        androidx.browser.trusted.c cVar = f91906b;
        c0<b, ProviderInfo> c0Var = f91905a;
        Trace.beginSection(ce.a.d("FontProvider.getProvider"));
        try {
            List<List<byte[]>> listB = eVar.f91914d;
            String str = eVar.f91911a;
            String str2 = eVar.f91912b;
            if (listB == null) {
                listB = b7.e.b(resources, eVar.f91915e);
            }
            b bVar = new b(str, str2, listB);
            ProviderInfo providerInfo = c0Var.get(bVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, cVar);
            for (int i14 = 0; i14 < listB.size(); i14++) {
                ArrayList arrayList2 = new ArrayList(listB.get(i14));
                Collections.sort(arrayList2, cVar);
                if (arrayList.size() == arrayList2.size()) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList.size()) {
                            c0Var.put(bVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i15), (byte[]) arrayList2.get(i15))) {
                            break;
                        }
                        i15++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l[] c(Context context, e eVar, String str) {
        ContentProviderClient contentProviderClient;
        ContentProviderClient contentProviderClient2;
        Trace.beginSection(ce.a.d("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClient3 = new a(context, uriBuild).f91907a;
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(ce.a.d("ContentQueryWrapper.query"));
                try {
                    try {
                        String[] strArr2 = {eVar.f91913c};
                        if (contentProviderClient3 != null) {
                            try {
                                cursorQuery = contentProviderClient3.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                            } catch (RemoteException unused) {
                            }
                        }
                        Trace.endSection();
                        if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                            contentProviderClient2 = contentProviderClient3;
                        } else {
                            int columnIndex = cursorQuery.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                            int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                            int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                            while (cursorQuery.moveToNext()) {
                                int i14 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                                arrayList2.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, eVar.f91917g, i14));
                                contentProviderClient3 = contentProviderClient3;
                            }
                            contentProviderClient2 = contentProviderClient3;
                            arrayList = arrayList2;
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClient2 != null) {
                            contentProviderClient2.close();
                        }
                        l[] lVarArr = (l[]) arrayList.toArray(new l[0]);
                        Trace.endSection();
                        return lVarArr;
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    contentProviderClient = context;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != 0) {
                        contentProviderClient.close();
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                contentProviderClient = contentProviderClient3;
            }
        } catch (Throwable th6) {
            Trace.endSection();
            throw th6;
        }
    }
}
