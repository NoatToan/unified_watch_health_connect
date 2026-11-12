package defpackage;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes4.dex */
public class aej extends ImageRequest {
    public final ReadableMap s;

    public aej(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        super(imageRequestBuilder);
        this.s = readableMap;
    }

    public static aej w(ImageRequestBuilder imageRequestBuilder, ReadableMap readableMap) {
        return new aej(imageRequestBuilder, readableMap);
    }

    public ReadableMap x() {
        return this.s;
    }
}
