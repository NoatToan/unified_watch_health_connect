package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
class r extends RequestHandler {
    private final Context a;

    public r(Context context) {
        this.a = context;
    }

    private static Bitmap h(Resources resources, int i, Request request) {
        BitmapFactory.Options optionsC = RequestHandler.c(request);
        if (RequestHandler.e(optionsC)) {
            BitmapFactory.decodeResource(resources, i, optionsC);
            RequestHandler.b(request.targetWidth, request.targetHeight, optionsC, request);
        }
        return BitmapFactory.decodeResource(resources, i, optionsC);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        if (request.resourceId != 0) {
            return true;
        }
        return "android.resource".equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i) throws IOException {
        Resources resourcesP = u.p(this.a, request);
        return new RequestHandler.Result(h(resourcesP, u.o(resourcesP, request), request), Picasso.LoadedFrom.DISK);
    }
}
