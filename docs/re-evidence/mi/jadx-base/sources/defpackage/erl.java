package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class erl {
    public static final k7n d = k7n.d(AbstractJsonLexerKt.COLON);
    public static final k7n e = k7n.d('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f17001a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17002b = 0;
    public int c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17004b;
        public final int c;

        public a(int i, long j, int i2) {
            this.f17003a = i;
            this.f17004b = j;
            this.c = i2;
        }
    }

    public static int b(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw new ParserException("Invalid SEF name");
        }
    }

    public static SlowMotionData f(okh okhVar, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listF = e.f(okhVar.A(i));
        for (int i2 = 0; i2 < listF.size(); i2++) {
            List<String> listF2 = d.f(listF.get(i2));
            if (listF2.size() != 3) {
                throw new ParserException();
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong(listF2.get(0)), Long.parseLong(listF2.get(1)), 1 << (Integer.parseInt(listF2.get(2)) - 1)));
            } catch (NumberFormatException e2) {
                throw new ParserException(e2);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public final void a(jl8 jl8Var, r4i r4iVar) throws IOException {
        okh okhVar = new okh(8);
        jl8Var.readFully(okhVar.d(), 0, 8);
        this.c = okhVar.q() + 8;
        if (okhVar.n() != 1397048916) {
            r4iVar.f32179a = 0L;
        } else {
            r4iVar.f32179a = jl8Var.getPosition() - ((long) (this.c - 12));
            this.f17002b = 2;
        }
    }

    public int c(jl8 jl8Var, r4i r4iVar, List<Metadata.Entry> list) throws IOException {
        int i = this.f17002b;
        long j = 0;
        if (i == 0) {
            long length = jl8Var.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            r4iVar.f32179a = j;
            this.f17002b = 1;
        } else if (i == 1) {
            a(jl8Var, r4iVar);
        } else if (i == 2) {
            d(jl8Var, r4iVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            e(jl8Var, list);
            r4iVar.f32179a = 0L;
        }
        return 1;
    }

    public final void d(jl8 jl8Var, r4i r4iVar) throws IOException {
        long length = jl8Var.getLength();
        int i = this.c - 20;
        okh okhVar = new okh(i);
        jl8Var.readFully(okhVar.d(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            okhVar.Q(2);
            short s = okhVar.s();
            if (s == 2192 || s == 2816 || s == 2817 || s == 2819 || s == 2820) {
                this.f17001a.add(new a(s, (length - ((long) this.c)) - ((long) okhVar.q()), okhVar.q()));
            } else {
                okhVar.Q(8);
            }
        }
        if (this.f17001a.isEmpty()) {
            r4iVar.f32179a = 0L;
        } else {
            this.f17002b = 3;
            r4iVar.f32179a = this.f17001a.get(0).f17004b;
        }
    }

    public final void e(jl8 jl8Var, List<Metadata.Entry> list) throws IOException {
        long position = jl8Var.getPosition();
        int length = (int) ((jl8Var.getLength() - jl8Var.getPosition()) - ((long) this.c));
        okh okhVar = new okh(length);
        jl8Var.readFully(okhVar.d(), 0, length);
        for (int i = 0; i < this.f17001a.size(); i++) {
            a aVar = this.f17001a.get(i);
            okhVar.P((int) (aVar.f17004b - position));
            okhVar.Q(4);
            int iQ = okhVar.q();
            int iB = b(okhVar.A(iQ));
            int i2 = aVar.c - (iQ + 8);
            if (iB == 2192) {
                list.add(f(okhVar, i2));
            } else if (iB != 2816 && iB != 2817 && iB != 2819 && iB != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    public void g() {
        this.f17001a.clear();
        this.f17002b = 0;
    }
}
