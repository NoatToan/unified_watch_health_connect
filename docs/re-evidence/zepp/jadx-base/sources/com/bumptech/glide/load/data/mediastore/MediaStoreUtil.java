package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaStoreUtil {
    private static final int a = 512;
    private static final int b = 384;

    private MediaStoreUtil() {
    }

    private static boolean a(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean isMediaStoreImageUri(Uri uri) {
        return isMediaStoreUri(uri) && !a(uri);
    }

    public static boolean isMediaStoreUri(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean isMediaStoreVideoUri(Uri uri) {
        return isMediaStoreUri(uri) && a(uri);
    }

    public static boolean isThumbnailSize(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= b;
    }
}
