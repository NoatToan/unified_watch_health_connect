package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Registry;
import com.bumptech.glide.b;
import defpackage.b0b;
import defpackage.e0b;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class OkHttpGlideModule implements b0b {
    @Override // defpackage.b0b
    public void a(Context context, b bVar) {
    }

    @Override // defpackage.b0b
    public void b(Context context, com.bumptech.glide.a aVar, Registry registry) {
        registry.r(e0b.class, InputStream.class, new a.C0134a());
    }
}
