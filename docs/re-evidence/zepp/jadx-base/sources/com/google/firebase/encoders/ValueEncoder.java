package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface ValueEncoder<T> extends a<T, ValueEncoderContext> {
    @Override // com.google.firebase.encoders.a
    /* synthetic */ void a(@NonNull TValue tvalue, @NonNull TContext tcontext) throws IOException;
}
