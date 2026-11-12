package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;
import w63.g0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28203b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f28202a = i14;
        this.f28203b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28202a) {
            case 0:
                Utils.closeQuietly((JsonReader) this.f28203b);
                break;
            case 1:
                Utils.closeQuietly((g0) this.f28203b);
                break;
            case 2:
                Utils.closeQuietly((InputStream) this.f28203b);
                break;
            default:
                ((LottieTask) this.f28203b).notifyListenersInternal();
                break;
        }
    }
}
