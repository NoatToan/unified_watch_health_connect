package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import w63.g0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28199c;

    public /* synthetic */ b(String str, String str2) {
        this.f28197a = 2;
        this.f28198b = str;
        this.f28199c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f28197a) {
            case 0:
                return ((LottieAnimationView) this.f28199c).lambda$fromAssets$2(this.f28198b);
            case 1:
                return LottieCompositionFactory.fromJsonSourceSync((g0) this.f28199c, this.f28198b);
            case 2:
                return LottieCompositionFactory.fromJsonStringSync(this.f28198b, (String) this.f28199c);
            case 3:
                return LottieCompositionFactory.fromJsonReaderSync((JsonReader) this.f28199c, this.f28198b);
            case 4:
                return LottieCompositionFactory.fromJsonInputStreamSync((InputStream) this.f28199c, this.f28198b);
            default:
                return LottieCompositionFactory.fromJsonSync((JSONObject) this.f28199c, this.f28198b);
        }
    }

    public /* synthetic */ b(int i14, String str, Object obj) {
        this.f28197a = i14;
        this.f28199c = obj;
        this.f28198b = str;
    }
}
