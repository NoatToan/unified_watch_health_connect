package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
class b extends RequestHandler {
    public static final String b = "android_asset";
    private static final int c = 22;
    private final AssetManager a;

    public b(Context context) {
        this.a = context.getAssets();
    }

    public static String h(Request request) {
        return request.uri.toString().substring(c);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && b.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        return new RequestHandler.Result(this.a.open(h(request)), Picasso.LoadedFrom.DISK);
    }
}
