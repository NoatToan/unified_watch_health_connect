package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rcr extends odm {
    public final okh o;
    public final w45 p;

    public rcr() {
        super("WebvttDecoder");
        this.o = new okh();
        this.p = new w45();
    }

    public static int B(okh okhVar) {
        int i = -1;
        int iE = 0;
        while (i == -1) {
            iE = okhVar.e();
            String strP = okhVar.p();
            if (strP == null) {
                i = 0;
            } else if ("STYLE".equals(strP)) {
                i = 2;
            } else {
                i = strP.startsWith("NOTE") ? 1 : 3;
            }
        }
        okhVar.P(iE);
        return i;
    }

    public static void C(okh okhVar) {
        while (!TextUtils.isEmpty(okhVar.p())) {
        }
    }

    @Override // defpackage.odm
    public soo z(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        ocr ocrVarM;
        this.o.N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            tcr.e(this.o);
            while (!TextUtils.isEmpty(this.o.p())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iB = B(this.o);
                if (iB == 0) {
                    return new vcr(arrayList2);
                }
                if (iB == 1) {
                    C(this.o);
                } else if (iB == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.o.p();
                    arrayList.addAll(this.p.d(this.o));
                } else if (iB == 3 && (ocrVarM = pcr.m(this.o, arrayList)) != null) {
                    arrayList2.add(ocrVarM);
                }
            }
        } catch (ParserException e) {
            throw new SubtitleDecoderException(e);
        }
    }
}
