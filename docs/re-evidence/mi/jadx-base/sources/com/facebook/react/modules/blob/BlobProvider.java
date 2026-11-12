package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.mcj;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public final class BlobProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        if (str.equals("r")) {
            Object applicationContext = getContext().getApplicationContext();
            if (!(applicationContext instanceof mcj)) {
                throw new RuntimeException("No blob module associated with BlobProvider");
            }
            ((mcj) applicationContext).a();
            throw null;
        }
        throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + "'");
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
