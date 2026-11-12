package defpackage;

import com.huawei.operation.ble.BleConstants;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", BleConstants.LIMIT, "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
final class zem implements Sequence<zdl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54027a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f54028c;
    private final Function2<CharSequence, Integer, yyu<Integer, Integer>> d;
    private final CharSequence e;

    /* JADX WARN: Multi-variable type inference failed */
    public zem(CharSequence charSequence, int i, int i2, Function2<? super CharSequence, ? super Integer, yyu<Integer, Integer>> function2) {
        zcp.c(charSequence, "");
        zcp.c(function2, "");
        this.e = charSequence;
        this.f54027a = i;
        this.f54028c = i2;
        this.d = function2;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u0002H\u0096\u0002J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "nextState", "", "getNextState", "()I", "setNextState", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "counter", "getCounter", "setCounter", "calcNext", "", "next", "hasNext", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Iterator<zdl>, KMappedMarker {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f54030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f54031c;
        private zdl d;
        private int e;
        private int j = -1;

        d() {
            int iB = zdm.b(zem.this.f54027a, 0, zem.this.e.length());
            this.e = iB;
            this.f54031c = iB;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void d() {
            yyu yyuVar;
            if (this.f54031c >= 0) {
                if (zem.this.f54028c > 0) {
                    int i = this.f54030b + 1;
                    this.f54030b = i;
                    if (i < zem.this.f54028c) {
                        if (this.f54031c <= zem.this.e.length() || (yyuVar = (yyu) zem.this.d.invoke(zem.this.e, Integer.valueOf(this.f54031c))) == null) {
                            this.d = new zdl(this.e, zes.e(zem.this.e));
                            this.f54031c = -1;
                        } else {
                            int iIntValue = ((Number) yyuVar.a()).intValue();
                            int iIntValue2 = ((Number) yyuVar.e()).intValue();
                            this.d = zdm.b(this.e, iIntValue);
                            int i2 = iIntValue + iIntValue2;
                            this.e = i2;
                            this.f54031c = i2 + (iIntValue2 == 0 ? 1 : 0);
                        }
                    } else {
                        this.d = new zdl(this.e, zes.e(zem.this.e));
                        this.f54031c = -1;
                    }
                } else if (this.f54031c <= zem.this.e.length()) {
                    this.d = new zdl(this.e, zes.e(zem.this.e));
                    this.f54031c = -1;
                } else {
                    int iIntValue3 = ((Number) yyuVar.a()).intValue();
                    int iIntValue4 = ((Number) yyuVar.e()).intValue();
                    this.d = zdm.b(this.e, iIntValue3);
                    int i3 = iIntValue3 + iIntValue4;
                    this.e = i3;
                    this.f54031c = i3 + (iIntValue4 == 0 ? 1 : 0);
                }
                this.j = 1;
                return;
            }
            this.j = 0;
            this.d = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zdl next() {
            if (this.j == -1) {
                d();
            }
            if (this.j == 0) {
                throw new NoSuchElementException();
            }
            zdl zdlVar = this.d;
            zcp.e(zdlVar, "");
            this.d = null;
            this.j = -1;
            return zdlVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.j == -1) {
                d();
            }
            return this.j == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<zdl> iterator() {
        return new d();
    }
}
