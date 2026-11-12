package wb;

import bb.o;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import fa.r;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f183827a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f183828b = new r(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183829c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f183831e;

    public final int a(int i14) {
        int i15;
        int i16 = 0;
        this.f183830d = 0;
        do {
            int i17 = this.f183830d;
            int i18 = i14 + i17;
            e eVar = this.f183827a;
            if (i18 >= eVar.f183834c) {
                break;
            }
            int[] iArr = eVar.f183837f;
            this.f183830d = i17 + 1;
            i15 = iArr[i18];
            i16 += i15;
        } while (i15 == 255);
        return i16;
    }

    public final boolean b(o oVar) {
        int i14;
        fa.a.d(oVar != null);
        boolean z14 = this.f183831e;
        r rVar = this.f183828b;
        if (z14) {
            this.f183831e = false;
            rVar.D(0);
        }
        while (!this.f183831e) {
            int i15 = this.f183829c;
            e eVar = this.f183827a;
            if (i15 < 0) {
                if (eVar.b(oVar, -1L) && eVar.a(oVar, true)) {
                    int iA = eVar.f183835d;
                    if ((eVar.f183832a & 1) == 1 && rVar.f70056c == 0) {
                        iA += a(0);
                        i14 = this.f183830d;
                    } else {
                        i14 = 0;
                    }
                    try {
                        oVar.skipFully(iA);
                        this.f183829c = i14;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.f183829c);
            int i16 = this.f183829c + this.f183830d;
            if (iA2 > 0) {
                rVar.b(rVar.f70056c + iA2);
                try {
                    oVar.readFully(rVar.f70054a, rVar.f70056c, iA2);
                    rVar.F(rVar.f70056c + iA2);
                    this.f183831e = eVar.f183837f[i16 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i16 == eVar.f183834c) {
                i16 = -1;
            }
            this.f183829c = i16;
        }
        return true;
    }
}
