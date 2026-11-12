package com.airbnb.lottie;

import com.airbnb.lottie.utils.Utils;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f28213b;

    public /* synthetic */ h(ZipInputStream zipInputStream, int i14) {
        this.f28212a = i14;
        this.f28213b = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28212a) {
            case 0:
                Utils.closeQuietly(this.f28213b);
                break;
            default:
                Utils.closeQuietly(this.f28213b);
                break;
        }
    }
}
