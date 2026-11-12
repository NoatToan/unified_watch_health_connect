package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class g9g extends odm {
    public final okh o;

    public g9g() {
        super("Mp4WebvttDecoder");
        this.o = new okh();
    }

    public static h55 B(okh okhVar, int i) throws SubtitleDecoderException {
        CharSequence charSequenceQ = null;
        h55.b bVarO = null;
        while (i > 0) {
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iN = okhVar.n();
            int iN2 = okhVar.n();
            int i2 = iN - 8;
            String strF = wlq.F(okhVar.d(), okhVar.e(), i2);
            okhVar.Q(i2);
            i = (i - 8) - i2;
            if (iN2 == 1937011815) {
                bVarO = pcr.o(strF);
            } else if (iN2 == 1885436268) {
                charSequenceQ = pcr.q(null, strF.trim(), Collections.emptyList());
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return bVarO != null ? bVarO.o(charSequenceQ).a() : pcr.l(charSequenceQ);
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.o.N(bArr, i);
        ArrayList arrayList = new ArrayList();
        while (this.o.a() > 0) {
            if (this.o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iN = this.o.n();
            if (this.o.n() == 1987343459) {
                arrayList.add(B(this.o, iN - 8));
            } else {
                this.o.Q(iN - 8);
            }
        }
        return new h9g(arrayList);
    }
}
