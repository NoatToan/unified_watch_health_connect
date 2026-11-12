package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes18.dex */
class n extends RequestHandler {
    public static final int c = 2;
    private static final String d = "http";
    private static final String e = "https";
    private final Downloader a;
    private final s b;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public n(Downloader downloader, s sVar) {
        this.a = downloader;
        this.b = sVar;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    public int d() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean f(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean g() {
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        Downloader.Response responseLoad = this.a.load(request.uri, request.c);
        if (responseLoad == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom = responseLoad.c ? Picasso.LoadedFrom.DISK : Picasso.LoadedFrom.NETWORK;
        Bitmap bitmap = responseLoad.getBitmap();
        if (bitmap != null) {
            return new RequestHandler.Result(bitmap, loadedFrom);
        }
        InputStream inputStream = responseLoad.getInputStream();
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == Picasso.LoadedFrom.DISK && responseLoad.getContentLength() == 0) {
            u.f(inputStream);
            throw new a("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && responseLoad.getContentLength() > 0) {
            this.b.f(responseLoad.getContentLength());
        }
        return new RequestHandler.Result(inputStream, loadedFrom);
    }
}
