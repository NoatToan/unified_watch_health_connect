package com.huawei.openalliance.ad;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public class uh implements Callable<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sl f20307a;

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap call() {
        return BitmapFactory.decodeFile(this.f20307a.a().a());
    }

    public uh(sl slVar) {
        this.f20307a = slVar;
    }
}
