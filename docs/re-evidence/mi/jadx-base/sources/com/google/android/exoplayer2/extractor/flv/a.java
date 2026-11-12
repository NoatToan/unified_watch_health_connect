package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import defpackage.C3515if;
import defpackage.okh;
import defpackage.snp;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends TagPayloadReader {
    public static final int[] e = {5512, 11025, DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7914b;
    public boolean c;
    public int d;

    public a(snp snpVar) {
        super(snpVar);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(okh okhVar) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f7914b) {
            okhVar.Q(1);
        } else {
            int iD = okhVar.D();
            int i = (iD >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.f7913a.b(new Format.b().e0("audio/mpeg").H(1).f0(e[(iD >> 2) & 3]).E());
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.f7913a.b(new Format.b().e0(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.c = true;
            } else if (i != 10) {
                int i2 = this.d;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i2);
                throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
            }
            this.f7914b = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(okh okhVar, long j) throws ParserException {
        if (this.d == 2) {
            int iA = okhVar.a();
            this.f7913a.d(okhVar, iA);
            this.f7913a.e(j, 1, iA, 0, null);
            return true;
        }
        int iD = okhVar.D();
        if (iD != 0 || this.c) {
            if (this.d == 10 && iD != 1) {
                return false;
            }
            int iA2 = okhVar.a();
            this.f7913a.d(okhVar, iA2);
            this.f7913a.e(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = okhVar.a();
        byte[] bArr = new byte[iA3];
        okhVar.j(bArr, 0, iA3);
        C3515if.b bVarG = C3515if.g(bArr);
        this.f7913a.b(new Format.b().e0(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE).I(bVarG.c).H(bVarG.f21073b).f0(bVarG.f21072a).T(Collections.singletonList(bArr)).E());
        this.c = true;
        return false;
    }
}
