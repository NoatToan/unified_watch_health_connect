package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class d<DataType> implements DiskCache.Writer {
    private final Encoder<DataType> a;
    private final DataType b;
    private final Options c;

    public d(Encoder<DataType> encoder, DataType datatype, Options options) {
        this.a = encoder;
        this.b = datatype;
        this.c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public boolean write(@NonNull File file) {
        return this.a.encode(this.b, file, this.c);
    }
}
