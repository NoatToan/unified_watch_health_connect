package com.xiaomi.fitness.userinfo.medicalid.util;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J;\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/UriUtil;", "", "<init>", "()V", "getPath", "", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "getDataColumn", "context", "Landroid/content/Context;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "isExternalStorageDocument", "", "isDownloadsDocument", "isMediaDocument", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUriUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UriUtil.kt\ncom/xiaomi/fitness/userinfo/medicalid/util/UriUtil\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,123:1\n37#2:124\n36#2,3:125\n37#2:128\n36#2,3:129\n*S KotlinDebug\n*F\n+ 1 UriUtil.kt\ncom/xiaomi/fitness/userinfo/medicalid/util/UriUtil\n*L\n28#1:124\n28#1:125,3\n42#1:128\n42#1:129,3\n*E\n"})
public final class UriUtil {

    @NotNull
    public static final UriUtil INSTANCE = new UriUtil();

    private UriUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[PHI: r9
      0x003c: PHI (r9v8 android.database.Cursor) = (r9v7 android.database.Cursor), (r9v9 android.database.Cursor) binds: [B:19:0x003a, B:24:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    private final String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) throws Throwable {
        Cursor cursorQuery;
        String[] strArr = {"_data"};
        Cursor cursor = null;
        if (uri != null) {
            try {
                cursorQuery = context.getContentResolver().query(uri, strArr, selection, selectionArgs, null);
            } catch (Exception unused) {
                cursorQuery = null;
                Logger.d("UriUtil", "Unable to get path");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Exception unused2) {
                    Logger.d("UriUtil", "Unable to get path");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (Throwable th2) {
                cursor = cursorQuery;
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    private final boolean isDownloadsDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.downloads.documents", uri.getAuthority());
    }

    private final boolean isExternalStorageDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.externalstorage.documents", uri.getAuthority());
    }

    private final boolean isMediaDocument(Uri uri) {
        return Intrinsics.areEqual("com.android.providers.media.documents", uri.getAuthority());
    }

    @Nullable
    public final String getPath(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(ApplicationExtKt.getApplication(), uri)) {
            if (isExternalStorageDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                Intrinsics.checkNotNull(documentId);
                String[] strArr = (String[]) StringsKt__StringsKt.split$default((CharSequence) documentId, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (StringsKt__StringsJVMKt.equals("primary", strArr[0], true)) {
                    return Environment.getExternalStorageDirectory() + "/" + strArr[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    String documentId2 = DocumentsContract.getDocumentId(uri);
                    Uri uri3 = Uri.parse("content://downloads/public_downloads");
                    Long lValueOf = Long.valueOf(documentId2);
                    Intrinsics.checkNotNullExpressionValue(lValueOf, "valueOf(...)");
                    Uri uriWithAppendedId = ContentUris.withAppendedId(uri3, lValueOf.longValue());
                    Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                    return getDataColumn(ApplicationExtKt.getApplication(), uriWithAppendedId, null, null);
                }
                if (isMediaDocument(uri)) {
                    String documentId3 = DocumentsContract.getDocumentId(uri);
                    Intrinsics.checkNotNull(documentId3);
                    String[] strArr2 = (String[]) StringsKt__StringsKt.split$default((CharSequence) documentId3, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
                    String str = strArr2[0];
                    int iHashCode = str.hashCode();
                    if (iHashCode != 93166550) {
                        if (iHashCode != 100313435) {
                            if (iHashCode == 112202875 && str.equals("video")) {
                                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                            }
                        } else if (str.equals("image")) {
                            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        }
                    } else if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(ApplicationExtKt.getApplication(), uri2, "_id=?", new String[]{strArr2[1]});
                }
            }
        } else {
            if (StringsKt__StringsJVMKt.equals(MiuiCursorConstants.CONTENT, uri.getScheme(), true)) {
                return getDataColumn(ApplicationExtKt.getApplication(), uri, null, null);
            }
            if (StringsKt__StringsJVMKt.equals("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        }
        return null;
    }
}
