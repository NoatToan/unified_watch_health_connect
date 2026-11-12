package androidx.room;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zaj;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcw;
import defpackage.zdl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\u0004\u0012\u00020\u00040\rH\u0002JO\u0010\u000e\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112$\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0007\u0012\u0004\u0012\u00020\u00040\u0014H\u0002¢\u0006\u0002\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00112\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0011H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001e"}, d2 = {"Landroidx/room/AmbiguousColumnResolver;", "", "()V", "dfs", "", ExifInterface.GPS_DIRECTION_TRUE, "content", "", "current", "", "depth", "", "block", "Lkotlin/Function1;", "rabinKarpSearch", "Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "pattern", "", "", "onHashMatch", "Lkotlin/Function3;", "(Ljava/util/List;[Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "resolve", "", "resultColumns", "mappings", "([Ljava/lang/String;[[Ljava/lang/String;)[[I", "Match", "ResultColumn", "Solution", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AmbiguousColumnResolver {
    public static final AmbiguousColumnResolver INSTANCE = new AmbiguousColumnResolver();

    private AmbiguousColumnResolver() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    @JvmStatic
    public static final int[][] resolve(String[] resultColumns, String[][] mappings) {
        zcp.c(resultColumns, "");
        zcp.c(mappings, "");
        int length = resultColumns.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String strSubstring = resultColumns[i2];
            if (strSubstring.charAt(0) == '`' && strSubstring.charAt(strSubstring.length() - 1) == '`') {
                strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                zcp.b((Object) strSubstring, "");
            }
            Locale locale = Locale.US;
            zcp.b((Object) locale, "");
            String lowerCase = strSubstring.toLowerCase(locale);
            zcp.b((Object) lowerCase, "");
            resultColumns[i2] = lowerCase;
        }
        String[][] strArr = mappings;
        int length2 = strArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = mappings[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr2 = mappings[i3];
                String str = strArr2[i4];
                Locale locale2 = Locale.US;
                zcp.b((Object) locale2, "");
                String lowerCase2 = str.toLowerCase(locale2);
                zcp.b((Object) lowerCase2, "");
                strArr2[i4] = lowerCase2;
            }
        }
        Set setE = zaj.e();
        for (String[] strArr3 : strArr) {
            yzp.c(setE, strArr3);
        }
        Set setD = zaj.d(setE);
        List listC = yzp.c();
        int length4 = resultColumns.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length4) {
            String str2 = resultColumns[i5];
            if (setD.contains(str2)) {
                listC.add(new ResultColumn(str2, i6));
            }
            i5++;
            i6++;
        }
        List<ResultColumn> listC2 = yzp.c(listC);
        int length5 = strArr.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i7 = 0; i7 < length5; i7++) {
            arrayList.add(new ArrayList());
        }
        final ArrayList arrayList2 = arrayList;
        int length6 = strArr.length;
        int i8 = 0;
        final int i9 = 0;
        while (i8 < length6) {
            final String[] strArr4 = strArr[i8];
            INSTANCE.rabinKarpSearch(listC2, strArr4, new Function3<Integer, Integer, List<? extends ResultColumn>, yzc>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* synthetic */ yzc invoke(Integer num, Integer num2, List<? extends AmbiguousColumnResolver.ResultColumn> list) {
                    invoke(num.intValue(), num2.intValue(), (List<AmbiguousColumnResolver.ResultColumn>) list);
                    return yzc.e;
                }

                public final void invoke(int i10, int i11, List<AmbiguousColumnResolver.ResultColumn> list) {
                    Object next;
                    zcp.c(list, "");
                    String[] strArr5 = strArr4;
                    ArrayList arrayList3 = new ArrayList(strArr5.length);
                    for (String str3 : strArr5) {
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!zcp.b((Object) str3, (Object) ((AmbiguousColumnResolver.ResultColumn) next).getName()));
                        AmbiguousColumnResolver.ResultColumn resultColumn = (AmbiguousColumnResolver.ResultColumn) next;
                        if (resultColumn == null) {
                            return;
                        }
                        arrayList3.add(Integer.valueOf(resultColumn.getIndex()));
                    }
                    arrayList2.get(i9).add(new AmbiguousColumnResolver.Match(new zdl(i10, i11 - 1), arrayList3));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }
            });
            if (((List) arrayList2.get(i9)).isEmpty()) {
                ArrayList arrayList3 = new ArrayList(strArr4.length);
                int length7 = strArr4.length;
                for (int i10 = i; i10 < length7; i10++) {
                    String str3 = strArr4[i10];
                    List listC3 = yzp.c();
                    for (ResultColumn resultColumn : listC2) {
                        if (zcp.b((Object) str3, (Object) resultColumn.getName())) {
                            listC3.add(Integer.valueOf(resultColumn.getIndex()));
                        }
                    }
                    List listC4 = yzp.c(listC3);
                    if (listC4.isEmpty()) {
                        throw new IllegalStateException(("Column " + str3 + " not found in result").toString());
                    }
                    arrayList3.add(listC4);
                }
                dfs$default(INSTANCE, arrayList3, null, 0, new Function1<List<? extends Integer>, yzc>() { // from class: androidx.room.AmbiguousColumnResolver$resolve$1$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ yzc invoke(List<? extends Integer> list) {
                        invoke2((List<Integer>) list);
                        return yzc.e;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<Integer> list) {
                        zcp.c(list, "");
                        List<Integer> list2 = list;
                        Iterator<T> it = list2.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            if (iIntValue > iIntValue2) {
                                iIntValue = iIntValue2;
                            }
                        }
                        Iterator<T> it2 = list2.iterator();
                        if (!it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        int iIntValue3 = ((Number) it2.next()).intValue();
                        while (it2.hasNext()) {
                            int iIntValue4 = ((Number) it2.next()).intValue();
                            if (iIntValue3 < iIntValue4) {
                                iIntValue3 = iIntValue4;
                            }
                        }
                        arrayList2.get(i9).add(new AmbiguousColumnResolver.Match(new zdl(iIntValue, iIntValue3), list));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }
                }, 6, null);
            }
            i8++;
            i9++;
            i = 0;
        }
        ArrayList arrayList4 = arrayList2;
        if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    throw new IllegalStateException("Failed to find matches for all mappings".toString());
                }
            }
        }
        final zcw.e eVar = new zcw.e();
        eVar.f53983c = Solution.INSTANCE.getNO_SOLUTION();
        dfs$default(INSTANCE, arrayList2, null, 0, new Function1<List<? extends Match>, yzc>() { // from class: androidx.room.AmbiguousColumnResolver.resolve.4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ yzc invoke(List<? extends Match> list) {
                invoke2((List<Match>) list);
                return yzc.e;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Match> list) {
                zcp.c(list, "");
                ?? Build = Solution.INSTANCE.build(list);
                if (Build.compareTo(eVar.f53983c) < 0) {
                    eVar.f53983c = Build;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        }, 6, null);
        List<Match> matches = ((Solution) eVar.f53983c).getMatches();
        ArrayList arrayList5 = new ArrayList(yzp.e(matches, 10));
        Iterator<T> it2 = matches.iterator();
        while (it2.hasNext()) {
            arrayList5.add(yzp.c((Collection<Integer>) ((Match) it2.next()).getResultIndices()));
        }
        Object[] array = arrayList5.toArray(new int[0][]);
        zcp.e(array, "");
        return (int[][]) array;
    }

    private final void rabinKarpSearch(List<ResultColumn> content, String[] pattern, Function3<? super Integer, ? super Integer, ? super List<ResultColumn>, yzc> onHashMatch) {
        int i = 0;
        int iHashCode = 0;
        for (String str : pattern) {
            iHashCode += str.hashCode();
        }
        int length = pattern.length;
        Iterator<T> it = content.subList(0, length).iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            iHashCode2 += ((ResultColumn) it.next()).getName().hashCode();
        }
        while (true) {
            if (iHashCode == iHashCode2) {
                onHashMatch.invoke(Integer.valueOf(i), Integer.valueOf(length), content.subList(i, length));
            }
            int i2 = length + 1;
            if (i2 > content.size()) {
                return;
            }
            iHashCode2 = (iHashCode2 - content.get(i).getName().hashCode()) + content.get(length).getName().hashCode();
            i++;
            length = i2;
        }
    }

    static /* synthetic */ void dfs$default(AmbiguousColumnResolver ambiguousColumnResolver, List list, List list2, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list2 = new ArrayList();
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        ambiguousColumnResolver.dfs(list, list2, i, function1);
    }

    private final <T> void dfs(List<? extends List<? extends T>> content, List<T> current, int depth, Function1<? super List<? extends T>, yzc> block) {
        if (depth == content.size()) {
            block.invoke(yzp.i((Iterable) current));
            return;
        }
        Iterator<T> it = content.get(depth).iterator();
        while (it.hasNext()) {
            current.add(it.next());
            INSTANCE.dfs(content, current, depth + 1, block);
            yzp.e((List) current);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$ResultColumn;", "", "name", "", "index", "", "(Ljava/lang/String;I)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", WatchFaceConstant.HASHCODE, "toString", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final /* data */ class ResultColumn {
        private final int index;
        private final String name;

        public ResultColumn(String str, int i) {
            zcp.c(str, "");
            this.name = str;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public String toString() {
            return "ResultColumn(name=" + this.name + ", index=" + this.index + g4.l;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResultColumn)) {
                return false;
            }
            ResultColumn resultColumn = (ResultColumn) other;
            return zcp.b((Object) this.name, (Object) resultColumn.name) && this.index == resultColumn.index;
        }

        public final ResultColumn copy(String name, int index) {
            zcp.c(name, "");
            return new ResultColumn(name, index);
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public static /* synthetic */ ResultColumn copy$default(ResultColumn resultColumn, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = resultColumn.name;
            }
            if ((i2 & 2) != 0) {
                i = resultColumn.index;
            }
            return resultColumn.copy(str, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Match;", "", "resultRange", "Lkotlin/ranges/IntRange;", "resultIndices", "", "", "(Lkotlin/ranges/IntRange;Ljava/util/List;)V", "getResultIndices", "()Ljava/util/List;", "getResultRange", "()Lkotlin/ranges/IntRange;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Match {
        private final List<Integer> resultIndices;
        private final zdl resultRange;

        public Match(zdl zdlVar, List<Integer> list) {
            zcp.c(zdlVar, "");
            zcp.c(list, "");
            this.resultRange = zdlVar;
            this.resultIndices = list;
        }

        public final zdl getResultRange() {
            return this.resultRange;
        }

        public final List<Integer> getResultIndices() {
            return this.resultIndices;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution;", "", "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "coverageOffset", "", "overlaps", "(Ljava/util/List;II)V", "getCoverageOffset", "()I", "getMatches", "()Ljava/util/List;", "getOverlaps", "compareTo", "other", "Companion", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class Solution implements Comparable<Solution> {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Solution NO_SOLUTION = new Solution(yzp.e(), Integer.MAX_VALUE, Integer.MAX_VALUE);
        private final int coverageOffset;
        private final List<Match> matches;
        private final int overlaps;

        public Solution(List<Match> list, int i, int i2) {
            zcp.c(list, "");
            this.matches = list;
            this.coverageOffset = i;
            this.overlaps = i2;
        }

        public final List<Match> getMatches() {
            return this.matches;
        }

        public final int getCoverageOffset() {
            return this.coverageOffset;
        }

        public final int getOverlaps() {
            return this.overlaps;
        }

        @Override // java.lang.Comparable
        public int compareTo(Solution other) {
            zcp.c(other, "");
            int iD = zcp.d(this.overlaps, other.overlaps);
            return iD != 0 ? iD : zcp.d(this.coverageOffset, other.coverageOffset);
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/AmbiguousColumnResolver$Solution$Companion;", "", "()V", "NO_SOLUTION", "Landroidx/room/AmbiguousColumnResolver$Solution;", "getNO_SOLUTION", "()Landroidx/room/AmbiguousColumnResolver$Solution;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "matches", "", "Landroidx/room/AmbiguousColumnResolver$Match;", "room-common"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final Solution getNO_SOLUTION() {
                return Solution.NO_SOLUTION;
            }

            public final Solution build(List<Match> matches) {
                zcp.c(matches, "");
                List<Match> list = matches;
                int i = 0;
                int iE = 0;
                for (Match match : list) {
                    iE += ((match.getResultRange().getD() - match.getResultRange().getF53990c()) + 1) - match.getResultIndices().size();
                }
                Iterator<T> it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iB = ((Match) it.next()).getResultRange().getF53990c();
                while (it.hasNext()) {
                    int iB2 = ((Match) it.next()).getResultRange().getF53990c();
                    if (iB > iB2) {
                        iB = iB2;
                    }
                }
                Iterator<T> it2 = list.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iE2 = ((Match) it2.next()).getResultRange().getD();
                while (it2.hasNext()) {
                    int iE3 = ((Match) it2.next()).getResultRange().getD();
                    if (iE2 < iE3) {
                        iE2 = iE3;
                    }
                }
                Iterable zdlVar = new zdl(iB, iE2);
                if (!(zdlVar instanceof Collection) || !((Collection) zdlVar).isEmpty()) {
                    Iterator it3 = zdlVar.iterator();
                    int i2 = 0;
                    while (it3.hasNext()) {
                        int iNextInt = ((IntIterator) it3).nextInt();
                        Iterator<T> it4 = list.iterator();
                        int i3 = 0;
                        while (it4.hasNext()) {
                            if (((Match) it4.next()).getResultRange().c(iNextInt)) {
                                i3++;
                            }
                            if (i3 > 1) {
                                i2++;
                                if (i2 >= 0) {
                                    break;
                                }
                                yzp.b();
                                break;
                            }
                        }
                    }
                    i = i2;
                }
                return new Solution(matches, iE, i);
            }

            public /* synthetic */ Companion(zcm zcmVar) {
                this();
            }
        }
    }
}
