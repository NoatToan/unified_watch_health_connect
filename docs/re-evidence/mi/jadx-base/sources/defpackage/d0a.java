package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<byte[]> f14921a = new Comparator() { // from class: c0a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d0a.g((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    @RequiresApi(24)
    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f14922a;

        public b(Context context, Uri uri) {
            this.f14922a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // d0a.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f14922a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // d0a.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f14922a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> d(e0a e0aVar, Resources resources) {
        return e0aVar.b() != null ? e0aVar.b() : h0a.c(resources, e0aVar.c());
    }

    public static j0a.a e(Context context, e0a e0aVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), e0aVar, context.getResources());
        return providerInfoF == null ? j0a.a.a(1, null) : j0a.a.a(0, h(context, e0aVar, providerInfoF.authority, cancellationSignal));
    }

    @VisibleForTesting
    public static ProviderInfo f(PackageManager packageManager, e0a e0aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = e0aVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(e0aVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + e0aVar.f());
        }
        List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f14921a);
        List<List<byte[]>> listD = d(e0aVar, resources);
        for (int i = 0; i < listD.size(); i++) {
            ArrayList arrayList = new ArrayList(listD.get(i));
            Collections.sort(arrayList, f14921a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public static j0a.b[] h(Context context, e0a e0aVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme(MiuiCursorConstants.CONTENT).authority(str).appendPath("file").build();
        a aVarA = a.a(context, uriBuild);
        Cursor cursor = null;
        try {
            int i = 1;
            Cursor cursorB = aVarA.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", Constants.EXTRA_RESULT_CODE}, "query = ?", new String[]{e0aVar.g()}, null, cancellationSignal);
            if (cursorB != null) {
                try {
                    if (cursorB.getCount() > 0) {
                        int columnIndex = cursorB.getColumnIndex(Constants.EXTRA_RESULT_CODE);
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursorB.getColumnIndex("_id");
                        int columnIndex3 = cursorB.getColumnIndex("file_id");
                        int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorB.getColumnIndex("font_weight");
                        int columnIndex6 = cursorB.getColumnIndex("font_italic");
                        while (cursorB.moveToNext()) {
                            arrayList3.add(j0a.b.a(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3)), columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400, (columnIndex6 == -1 || cursorB.getInt(columnIndex6) != i) ? 0 : i, columnIndex != -1 ? cursorB.getInt(columnIndex) : 0));
                            i = 1;
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList2;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorB;
                    if (cursor != null) {
                        cursor.close();
                    }
                    aVarA.close();
                    throw th;
                }
            } else {
                arrayList = arrayList2;
            }
            if (cursorB != null) {
                cursorB.close();
            }
            aVarA.close();
            return (j0a.b[]) arrayList.toArray(new j0a.b[0]);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
