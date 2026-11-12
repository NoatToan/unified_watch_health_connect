package sa;

import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements androidx.media3.exoplayer.source.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bb.r f158102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb.n f158103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bb.i f158104c;

    public a(bb.r rVar) {
        this.f158102a = rVar;
    }

    public final long a() {
        bb.i iVar = this.f158104c;
        if (iVar != null) {
            return iVar.f17191d;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public final void b(ha.d dVar, Uri uri, Map map, long j8, long j14, bb.p pVar) throws UnrecognizedInputFormatException {
        bb.i iVar = new bb.i(dVar, j8, j14);
        this.f158104c = iVar;
        if (this.f158103b != null) {
            return;
        }
        bb.n[] nVarArrCreateExtractors = this.f158102a.createExtractors(uri, map);
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(nVarArrCreateExtractors.length);
        boolean z14 = true;
        if (nVarArrCreateExtractors.length == 1) {
            this.f158103b = nVarArrCreateExtractors[0];
        } else {
            for (bb.n nVar : nVarArrCreateExtractors) {
                try {
                    if (nVar.d(iVar)) {
                        this.f158103b = nVar;
                        iVar.f17193f = 0;
                        break;
                    }
                    builderBuilderWithExpectedSize.addAll((Iterable) nVar.a());
                    boolean z15 = this.f158103b != null || iVar.f17191d == j8;
                    fa.a.d(z15);
                    iVar.f17193f = 0;
                } catch (EOFException unused) {
                    if (this.f158103b != null || iVar.f17191d == j8) {
                    }
                } catch (Throwable th3) {
                    if (this.f158103b == null && iVar.f17191d != j8) {
                        z14 = false;
                    }
                    fa.a.d(z14);
                    iVar.f17193f = 0;
                    throw th3;
                }
                fa.a.d(z15);
                iVar.f17193f = 0;
            }
            if (this.f158103b == null) {
                String str = "None of the available extractors (" + Joiner.on(", ").join(Lists.transform(ImmutableList.copyOf(nVarArrCreateExtractors), new androidx.media3.common.p(12))) + ") could read the stream.";
                uri.getClass();
                throw new UnrecognizedInputFormatException(str, uri, builderBuilderWithExpectedSize.build());
            }
        }
        this.f158103b.c(pVar);
    }
}
