package com.bumptech.glide.load;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class b implements a.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f28528a;

    public b(ByteBuffer byteBuffer) {
        this.f28528a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.a.e
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
        ByteBuffer byteBuffer = this.f28528a;
        try {
            return imageHeaderParser.c(byteBuffer);
        } finally {
            qj.a.c(byteBuffer);
        }
    }
}
