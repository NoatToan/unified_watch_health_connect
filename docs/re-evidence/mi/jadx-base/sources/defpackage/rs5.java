package defpackage;

import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes4.dex */
public interface rs5<I, O, E extends DecoderException> {
    I a() throws DecoderException;

    O c() throws DecoderException;

    void d(I i) throws DecoderException;

    void flush();

    void release();
}
