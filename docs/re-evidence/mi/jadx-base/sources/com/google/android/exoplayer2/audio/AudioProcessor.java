package com.google.android.exoplayer2.audio;

import defpackage.wlq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f7823a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            String strValueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
            sb.append("Unhandled format: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    public static final class a {
        public static final a e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7825b;
        public final int c;
        public final int d;

        public a(int i, int i2, int i3) {
            this.f7824a = i;
            this.f7825b = i2;
            this.c = i3;
            this.d = wlq.o0(i3) ? wlq.Z(i3, i2) : -1;
        }

        public String toString() {
            int i = this.f7824a;
            int i2 = this.f7825b;
            int i3 = this.c;
            StringBuilder sb = new StringBuilder(83);
            sb.append("AudioFormat[sampleRate=");
            sb.append(i);
            sb.append(", channelCount=");
            sb.append(i2);
            sb.append(", encoding=");
            sb.append(i3);
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean b();

    void c();

    ByteBuffer d();

    a e(a aVar) throws UnhandledAudioFormatException;

    void flush();

    boolean isActive();

    void reset();
}
