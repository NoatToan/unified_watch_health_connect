package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class g implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f28569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28570b;

    public g(InputStream inputStream, xi.b bVar) {
        this.f28569a = inputStream;
        this.f28570b = bVar;
    }

    @Override // com.bumptech.glide.load.a.c
    public final boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
        InputStream inputStream = this.f28569a;
        try {
            return imageHeaderParser.b(inputStream, this.f28570b);
        } finally {
            inputStream.reset();
        }
    }
}
