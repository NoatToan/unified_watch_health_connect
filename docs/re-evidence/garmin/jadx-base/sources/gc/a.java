package gc;

import com.google.android.exoplayer2.C;
import fa.r;
import fa.z;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import yb.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f76776a = new r();

    @Override // yb.n
    public final int a() {
        return 2;
    }

    @Override // yb.n
    public final void c(byte[] bArr, int i14, int i15, n.b bVar, fa.g<yb.c> gVar) {
        ea.a aVarA;
        r rVar = this.f76776a;
        rVar.E(bArr, i14 + i15);
        rVar.G(i14);
        ArrayList arrayList = new ArrayList();
        while (rVar.a() > 0) {
            fa.a.b(rVar.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iG = rVar.g();
            if (rVar.g() == 1987343459) {
                int i16 = iG - 8;
                CharSequence charSequenceF = null;
                ea.a.b bVarA = null;
                while (i16 > 0) {
                    fa.a.b(i16 >= 8, "Incomplete vtt cue box header found.");
                    int iG2 = rVar.g();
                    int iG3 = rVar.g();
                    int i17 = iG2 - 8;
                    byte[] bArr2 = rVar.f70054a;
                    int i18 = rVar.f70055b;
                    int i19 = z.f70071a;
                    String str = new String(bArr2, i18, i17, StandardCharsets.UTF_8);
                    rVar.H(i17);
                    i16 = (i16 - 8) - i17;
                    if (iG3 == 1937011815) {
                        Pattern pattern = e.f76801a;
                        e.C1547e c1547e = new e.C1547e();
                        e.e(str, c1547e);
                        bVarA = c1547e.a();
                    } else if (iG3 == 1885436268) {
                        charSequenceF = e.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (bVarA != null) {
                    bVarA.f63568a = charSequenceF;
                    aVarA = bVarA.a();
                } else {
                    Pattern pattern2 = e.f76801a;
                    e.C1547e c1547e2 = new e.C1547e();
                    c1547e2.f76816c = charSequenceF;
                    aVarA = c1547e2.a().a();
                }
                arrayList.add(aVarA);
            } else {
                rVar.H(iG - 8);
            }
        }
        gVar.accept(new yb.c(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
