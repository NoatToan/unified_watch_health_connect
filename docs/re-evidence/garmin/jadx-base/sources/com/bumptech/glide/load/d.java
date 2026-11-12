package com.bumptech.glide.load;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class d implements a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f28531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi.b f28532b;

    public d(ByteBuffer byteBuffer, xi.b bVar) {
        this.f28531a = byteBuffer;
        this.f28532b = bVar;
    }

    @Override // com.bumptech.glide.load.a.d
    public final int a(ImageHeaderParser imageHeaderParser) {
        ByteBuffer byteBuffer = this.f28531a;
        try {
            return imageHeaderParser.f(byteBuffer, this.f28532b);
        } finally {
            qj.a.c(byteBuffer);
        }
    }
}
