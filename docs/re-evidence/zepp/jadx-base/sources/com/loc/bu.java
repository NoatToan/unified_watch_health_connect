package com.loc;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class bu extends eq {
    public bu(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    @Override // com.loc.eq
    public final int a(CharSequence charSequence) {
        try {
            return super.a(charSequence);
        } catch (Throwable th) {
            df.a(th);
            return super.a("");
        }
    }
}
