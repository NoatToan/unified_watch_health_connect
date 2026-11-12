package androidx.compose.ui.text;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a0\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00052\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "", "transform", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ranges", "Ljava/util/SortedSet;", "target", "", "collectRangeTransitions", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class JvmAnnotatedString_jvmKt {
    private static final <T> void collectRangeTransitions(List<AnnotatedString.Range<T>> list, SortedSet<Integer> sortedSet) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            AnnotatedString.Range<T> range = list.get(i);
            sortedSet.add(Integer.valueOf(range.getStart()));
            sortedSet.add(Integer.valueOf(range.getEnd()));
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final AnnotatedString transform(@NotNull final AnnotatedString annotatedString, @NotNull final Function3<? super String, ? super Integer, ? super Integer, String> function3) {
        int i = 0;
        TreeSet treeSetSortedSetOf = x.sortedSetOf(0, Integer.valueOf(annotatedString.getText().length()));
        collectRangeTransitions(annotatedString.getSpanStyles(), treeSetSortedSetOf);
        collectRangeTransitions(annotatedString.getParagraphStyles(), treeSetSortedSetOf);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Map mapMutableMapOf = r.mutableMapOf(TuplesKt.to(0, 0));
        CollectionsKt___CollectionsKt.windowed$default(treeSetSortedSetOf, 2, 0, false, new Function1<List<? extends Integer>, Integer>() { // from class: androidx.compose.ui.text.JvmAnnotatedString_jvmKt.transform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Integer invoke2(@NotNull List<Integer> list) {
                int iIntValue = list.get(0).intValue();
                int iIntValue2 = list.get(1).intValue();
                Ref.ObjectRef<String> objectRef2 = objectRef;
                objectRef2.element = Intrinsics.stringPlus(objectRef2.element, function3.invoke(annotatedString.getText(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)));
                return mapMutableMapOf.put(Integer.valueOf(iIntValue2), Integer.valueOf(objectRef.element.length()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(List<? extends Integer> list) {
                return invoke2((List<Integer>) list);
            }
        }, 6, null);
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                AnnotatedString.Range<SpanStyle> range = spanStyles.get(i2);
                arrayList.add(new AnnotatedString.Range(range.getItem(), ((Number) mapMutableMapOf.get(Integer.valueOf(range.getStart()))).intValue(), ((Number) mapMutableMapOf.get(Integer.valueOf(range.getEnd()))).intValue()));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList2 = new ArrayList(paragraphStyles.size());
        int size2 = paragraphStyles.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                AnnotatedString.Range<ParagraphStyle> range2 = paragraphStyles.get(i4);
                arrayList2.add(new AnnotatedString.Range(range2.getItem(), ((Number) mapMutableMapOf.get(Integer.valueOf(range2.getStart()))).intValue(), ((Number) mapMutableMapOf.get(Integer.valueOf(range2.getEnd()))).intValue()));
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        }
        List<AnnotatedString.Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
        ArrayList arrayList3 = new ArrayList(annotations$ui_text_release.size());
        int size3 = annotations$ui_text_release.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                AnnotatedString.Range<? extends Object> range3 = annotations$ui_text_release.get(i);
                arrayList3.add(new AnnotatedString.Range(range3.getItem(), ((Number) mapMutableMapOf.get(Integer.valueOf(range3.getStart()))).intValue(), ((Number) mapMutableMapOf.get(Integer.valueOf(range3.getEnd()))).intValue()));
                if (i6 > size3) {
                    break;
                }
                i = i6;
            }
        }
        return new AnnotatedString((String) objectRef.element, arrayList, arrayList2, arrayList3);
    }
}
