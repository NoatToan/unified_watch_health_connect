package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
class m extends e {
    private static final String[] b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        public final int androidKind;
        public final int height;
        public final int width;

        a(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    public m(Context context) {
        super(context);
    }

    public static int i(ContentResolver contentResolver, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(0);
                cursorQuery.close();
                return i;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static a j(int i, int i2) {
        a aVar = a.MICRO;
        if (i <= aVar.width && i2 <= aVar.height) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i > aVar2.width || i2 > aVar2.height) ? a.FULL : aVar2;
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.e, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.a.getContentResolver();
        int i2 = i(contentResolver, request.uri);
        String type = contentResolver.getType(request.uri);
        boolean z = type != null && type.startsWith("video/");
        if (request.hasSize()) {
            a aVarJ = j(request.targetWidth, request.targetHeight);
            if (!z && aVarJ == a.FULL) {
                return new RequestHandler.Result(null, h(request), Picasso.LoadedFrom.DISK, i2);
            }
            long id = ContentUris.parseId(request.uri);
            BitmapFactory.Options optionsC = RequestHandler.c(request);
            optionsC.inJustDecodeBounds = true;
            RequestHandler.a(request.targetWidth, request.targetHeight, aVarJ.width, aVarJ.height, optionsC, request);
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, aVarJ == a.FULL ? 1 : aVarJ.androidKind, optionsC);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, aVarJ.androidKind, optionsC);
            }
            if (thumbnail != null) {
                return new RequestHandler.Result(thumbnail, null, Picasso.LoadedFrom.DISK, i2);
            }
        }
        return new RequestHandler.Result(null, h(request), Picasso.LoadedFrom.DISK, i2);
    }
}
