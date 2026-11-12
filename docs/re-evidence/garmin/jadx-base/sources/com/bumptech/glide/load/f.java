package com.bumptech.glide.load;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class f implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f28567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28568b;

    public f(ByteBuffer byteBuffer, xi.b bVar) {
        this.f28567a = byteBuffer;
        this.f28568b = bVar;
    }

    @Override // com.bumptech.glide.load.a.c
    public final boolean a(ImageHeaderParser imageHeaderParser) {
        ByteBuffer byteBuffer = this.f28567a;
        try {
            return imageHeaderParser.e(byteBuffer, this.f28568b);
        } finally {
            qj.a.c(byteBuffer);
        }
    }
}
