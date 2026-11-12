package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "", "", "breakInWords", "", "text", "Ljava/text/BreakIterator;", "breaker", "breakWithBreakIterator", "Landroidx/compose/ui/text/android/animation/Segment;", "breakSegmentWithDocument", "breakSegmentWithParagraph", "", "dropSpaces", "breakSegmentWithLine", "breakSegmentWithWord", "breakSegmentWithChar", "Landroidx/compose/ui/text/android/animation/SegmentType;", "segmentType", "breakOffsets", "breakSegments", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class SegmentBreaker {

    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            iArr[SegmentType.Document.ordinal()] = 1;
            iArr[SegmentType.Paragraph.ordinal()] = 2;
            iArr[SegmentType.Line.ordinal()] = 3;
            iArr[SegmentType.Word.ordinal()] = 4;
            iArr[SegmentType.Character.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> listBreakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = listBreakWithBreakIterator.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                treeSet.add(Integer.valueOf(listBreakWithBreakIterator.get(i).intValue()));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        if (paragraphCount > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                Bidi bidiAnalyzeBidi = layoutHelper.analyzeBidi(i3);
                if (bidiAnalyzeBidi != null) {
                    int paragraphStart = layoutHelper.getParagraphStart(i3);
                    int runCount = bidiAnalyzeBidi.getRunCount();
                    if (runCount > 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            treeSet.add(Integer.valueOf(bidiAnalyzeBidi.getRunStart(i5) + paragraphStart));
                            if (i6 >= runCount) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                }
                if (i4 >= paragraphCount) {
                    break;
                }
                i3 = i4;
            }
        }
        return CollectionsKt___CollectionsKt.toList(treeSet);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (listBreakOffsets.size() != 0) {
            boolean z = true;
            if (listBreakOffsets.size() == 1) {
                CollectionsKt__CollectionsKt.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
                if (lastIndex > 0) {
                    int i = 0;
                    while (true) {
                        i += z ? 1 : 0;
                        Integer num2 = listBreakOffsets.get(i);
                        int iIntValue = num2.intValue();
                        int iIntValue2 = num.intValue();
                        Layout layout = layoutHelper.getLayout();
                        if (!dropSpaces || iIntValue != iIntValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(iIntValue2))) {
                            int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z2);
                            boolean z3 = layout.getParagraphDirection(lineForOffset) == -1;
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                            if (zIsRtlCharAt != z3) {
                                z = false;
                            }
                            int iCeil = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z, z2));
                            int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, zIsRtlCharAt == z3, true));
                            arrayList.add(new Segment(iIntValue2, iIntValue, Math.min(iCeil, iCeil2), layout.getLineTop(lineForOffset), Math.max(iCeil, iCeil2), layout.getLineBottom(lineForOffset)));
                        }
                        arrayList2.add(Unit.INSTANCE);
                        int i2 = lastIndex;
                        if (i >= i2) {
                            break;
                        }
                        lastIndex = i2;
                        num = num2;
                        z = true;
                        z2 = false;
                    }
                }
            }
        } else {
            CollectionsKt__CollectionsKt.emptyList();
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return e.listOf(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean dropSpaces) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        if (lineCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(new Segment(layout.getLineStart(i), layout.getLineEnd(i), dropSpaces ? (int) Math.ceil(layout.getLineLeft(i)) : 0, layout.getLineTop(i), dropSpaces ? (int) Math.ceil(layout.getLineRight(i)) : layout.getWidth(), layout.getLineBottom(i)));
                if (i2 >= lineCount) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        if (paragraphCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int paragraphStart = layoutHelper.getParagraphStart(i);
                int paragraphEnd = layoutHelper.getParagraphEnd(i);
                arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
                if (i2 >= paragraphCount) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean dropSpaces) {
        int i;
        Layout layout = layoutHelper.getLayout();
        int iCeil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> listBreakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (listBreakOffsets.size() != 0) {
            boolean z = true;
            if (listBreakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = false;
                Integer num = listBreakOffsets.get(0);
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(listBreakOffsets);
                if (lastIndex <= 0) {
                    return arrayList;
                }
                int i2 = 0;
                while (true) {
                    i2 += z ? 1 : 0;
                    Integer num2 = listBreakOffsets.get(i2);
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, iIntValue2, z2);
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1;
                    boolean zIsRtlCharAt = layout.isRtlCharAt(iIntValue2);
                    if (zIsRtlCharAt != z3) {
                        z = false;
                    }
                    int iCeil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue2, z, z2));
                    boolean z4 = zIsRtlCharAt == z3;
                    int i3 = lastIndex;
                    int iCeil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(iIntValue, z4, true));
                    int iMin = Math.min(iCeil2, iCeil3);
                    int iMax = Math.max(iCeil2, iCeil3);
                    if (dropSpaces && iIntValue != 0 && layout.getText().charAt(iIntValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != iIntValue) {
                            if (zIsRtlCharAt) {
                                iMin += iCeil;
                            } else {
                                iMax -= iCeil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new Segment(iIntValue2, iIntValue, iMin, layout.getLineTop(i), iMax, layout.getLineBottom(i)));
                    if (i2 >= i3) {
                        return arrayList;
                    }
                    num = num2;
                    lastIndex = i3;
                    z = true;
                    z2 = false;
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence text, BreakIterator breaker) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(text, 0, text.length());
        List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
        breaker.setText(charSequenceCharacterIterator);
        while (breaker.next() != -1) {
            listMutableListOf.add(Integer.valueOf(breaker.current()));
        }
        return listMutableListOf;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(text.length())});
        }
        if (i == 2) {
            List<Integer> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            if (paragraphCount > 0) {
                while (true) {
                    int i3 = i2 + 1;
                    listMutableListOf.add(Integer.valueOf(layoutHelper.getParagraphEnd(i2)));
                    if (i3 >= paragraphCount) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return listMutableListOf;
        }
        if (i != 3) {
            if (i == 4) {
                return breakInWords(layoutHelper);
            }
            if (i == 5) {
                return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            throw new NoWhenBranchMatchedException();
        }
        List<Integer> listMutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(0);
        int lineCount = layout.getLineCount();
        if (lineCount <= 0) {
            return listMutableListOf2;
        }
        while (true) {
            int i4 = i2 + 1;
            listMutableListOf2.add(Integer.valueOf(layout.getLineEnd(i2)));
            if (i4 >= lineCount) {
                return listMutableListOf2;
            }
            i2 = i4;
        }
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean dropSpaces) {
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i == 1) {
            return breakSegmentWithDocument(layoutHelper);
        }
        if (i == 2) {
            return breakSegmentWithParagraph(layoutHelper);
        }
        if (i == 3) {
            return breakSegmentWithLine(layoutHelper, dropSpaces);
        }
        if (i == 4) {
            return breakSegmentWithWord(layoutHelper, dropSpaces);
        }
        if (i == 5) {
            return breakSegmentWithChar(layoutHelper, dropSpaces);
        }
        throw new NoWhenBranchMatchedException();
    }
}
