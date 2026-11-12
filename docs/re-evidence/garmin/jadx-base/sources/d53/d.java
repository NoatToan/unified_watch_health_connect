package d53;

import com.mapbox.maps.MapboxMap;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ld53/d;", "Lc53/j;", "Lj23/l;", "", "input", "", "startIndex", MapboxMap.QFE_LIMIT, "Lkotlin/Function2;", "Lo13/p;", "getNextMatch", "<init>", "(Ljava/lang/CharSequence;IILe23/p;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements c53.j<j23.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f57671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.p<CharSequence, Integer, o13.p<Integer, Integer>> f57674d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"d53/d$a", "", "Lj23/l;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<j23.l>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f57675a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f57676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f57677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j23.l f57678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f57679e;

        public a() {
            int iE = j23.t.e(d.this.f57672b, 0, d.this.f57671a.length());
            this.f57676b = iE;
            this.f57677c = iE;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        public final void a() {
            o13.p<Integer, Integer> pVarInvoke;
            int i14 = this.f57677c;
            if (i14 < 0) {
                this.f57675a = 0;
                this.f57678d = null;
                return;
            }
            d dVar = d.this;
            int i15 = dVar.f57673c;
            CharSequence charSequence = dVar.f57671a;
            if (i15 > 0) {
                int i16 = this.f57679e + 1;
                this.f57679e = i16;
                if (i16 >= i15) {
                    this.f57678d = new j23.l(this.f57676b, charSequence.length() - 1);
                    this.f57677c = -1;
                } else if (i14 > charSequence.length() && (pVarInvoke = dVar.f57674d.invoke(charSequence, Integer.valueOf(this.f57677c))) != null) {
                    int iIntValue = pVarInvoke.f128594a.intValue();
                    int iIntValue2 = pVarInvoke.f128595b.intValue();
                    this.f57678d = j23.t.o(this.f57676b, iIntValue);
                    int i17 = iIntValue + iIntValue2;
                    this.f57676b = i17;
                    this.f57677c = i17 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f57678d = new j23.l(this.f57676b, charSequence.length() - 1);
                    this.f57677c = -1;
                }
            } else if (i14 > charSequence.length()) {
                this.f57678d = new j23.l(this.f57676b, charSequence.length() - 1);
                this.f57677c = -1;
            } else {
                int iIntValue3 = pVarInvoke.f128594a.intValue();
                int iIntValue4 = pVarInvoke.f128595b.intValue();
                this.f57678d = j23.t.o(this.f57676b, iIntValue3);
                int i18 = iIntValue3 + iIntValue4;
                this.f57676b = i18;
                this.f57677c = i18 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f57675a = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f57675a == -1) {
                a();
            }
            return this.f57675a == 1;
        }

        @Override // java.util.Iterator
        public final j23.l next() {
            if (this.f57675a == -1) {
                a();
            }
            if (this.f57675a == 0) {
                c22.t.g();
                return null;
            }
            j23.l lVar = this.f57678d;
            lVar.getClass();
            this.f57678d = null;
            this.f57675a = -1;
            return lVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence charSequence, int i14, int i15, e23.p<? super CharSequence, ? super Integer, o13.p<Integer, Integer>> pVar) {
        charSequence.getClass();
        pVar.getClass();
        this.f57671a = charSequence;
        this.f57672b = i14;
        this.f57673c = i15;
        this.f57674d = pVar;
    }

    @Override // c53.j
    public final Iterator<j23.l> iterator() {
        return new a();
    }
}
