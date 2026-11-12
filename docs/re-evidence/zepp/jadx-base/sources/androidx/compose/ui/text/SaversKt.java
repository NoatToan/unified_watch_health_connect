package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.exifinterface.media.ExifInterface;
import com.huami.widget.share.ShareAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ULong;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001aN\u0010\f\u001a\u0004\u0018\u00018\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0006\b\u0003\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\t\u0010\u000e\u001a$\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\bH\u0080\b¢\u0006\u0004\b\f\u0010\u000e\"(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"0\u0010\u0016\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00150\u0014\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\"*\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0015\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011\"\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011\"(\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013\"\"\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011\"\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0011\"\"\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0011\"\"\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0011\"%\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b)\u0010\u0011\"%\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b+\u0010\u0011\"\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0011\"+\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010\u0011\u0012\u0004\b0\u00101\"+\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010\u0011\u0012\u0004\b4\u00101\"%\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b6\u0010\u0011\"\"\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0011\"\"\u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0011\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\b0\u0000*\u00020;8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b0\u0000*\u00020?8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010@\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0\u0000*\u00020A8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010B\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u0000*\u00020C8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010D\")\u0010>\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\b0\u0000*\u00020E8@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010F\")\u0010>\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0\u0000*\u00020G8@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010H\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b0\u0000*\u00020I8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010J\")\u0010>\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0\u0000*\u00020K8@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010L\")\u0010>\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\b0\u0000*\u00020M8@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010N\")\u0010>\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8@@\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b<\u0010P\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\b0\u0000*\u00020Q8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010R\"&\u0010>\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010T\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", ExifInterface.GPS_DIRECTION_TRUE, "Original", "Saveable", "value", "saver", "Landroidx/compose/runtime/saveable/SaverScope;", "scope", "", ShareAnalytics.ParamValue.SAVE, "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "Result", "restore", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeListSaver", "AnnotationRangeSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "ParagraphStyleSaver", "getParagraphStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "SpanStyleSaver", "getSpanStyleSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextIndentSaver", "Landroidx/compose/ui/text/font/FontWeight;", "FontWeightSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "BaselineShiftSaver", "Landroidx/compose/ui/text/TextRange;", "TextRangeSaver", "Landroidx/compose/ui/graphics/Shadow;", "ShadowSaver", "Landroidx/compose/ui/graphics/Color;", "ColorSaver", "getColorSaver$annotations", "()V", "Landroidx/compose/ui/unit/TextUnit;", "TextUnitSaver", "getTextUnitSaver$annotations", "Landroidx/compose/ui/geometry/Offset;", "OffsetSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/Locale;", "LocaleSaver", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "getSaver", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Saver", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 2, mv = {1, 5, 1})
public final class SaversKt {

    @NotNull
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull AnnotatedString annotatedString) {
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(annotatedString.getText()), SaversKt.save(annotatedString.getSpanStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, saverScope), SaversKt.save(annotatedString.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope));
        }
    }, new Function1<Object, AnnotatedString>() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            List list2 = null;
            String str = obj2 == null ? null : (String) obj2;
            Object obj3 = list.get(1);
            Saver saver = SaversKt.AnnotationRangeListSaver;
            Boolean bool = Boolean.FALSE;
            List list3 = (Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : (List) saver.restore(obj3);
            Object obj4 = list.get(2);
            List list4 = (Intrinsics.areEqual(obj4, bool) || obj4 == null) ? null : (List) SaversKt.AnnotationRangeListSaver.restore(obj4);
            Object obj5 = list.get(3);
            Saver saver2 = SaversKt.AnnotationRangeListSaver;
            if (!Intrinsics.areEqual(obj5, bool) && obj5 != null) {
                list2 = (List) saver2.restore(obj5);
            }
            return new AnnotatedString(str, list3, list4, list2);
        }
    });

    @NotNull
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull List<? extends AnnotatedString.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(SaversKt.save(list.get(i), SaversKt.AnnotationRangeSaver, saverScope));
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    }, new Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final List<? extends AnnotatedString.Range<? extends Object>> invoke(@NotNull Object obj) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = list.get(i);
                    Saver saver = SaversKt.AnnotationRangeSaver;
                    AnnotatedString.Range range = null;
                    if (!Intrinsics.areEqual(obj2, Boolean.FALSE) && obj2 != null) {
                        range = (AnnotatedString.Range) saver.restore(obj2);
                    }
                    arrayList.add(range);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    });

    @NotNull
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull AnnotatedString.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object objSave;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else {
                annotationType = item instanceof VerbatimTtsAnnotation ? AnnotationType.VerbatimTts : AnnotationType.String;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                objSave = SaversKt.save((ParagraphStyle) range.getItem(), SaversKt.getParagraphStyleSaver(), saverScope);
            } else if (i == 2) {
                objSave = SaversKt.save((SpanStyle) range.getItem(), SaversKt.getSpanStyleSaver(), saverScope);
            } else if (i == 3) {
                objSave = SaversKt.save((VerbatimTtsAnnotation) range.getItem(), SaversKt.VerbatimTtsAnnotationSaver, saverScope);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                objSave = SaversKt.save(range.getItem());
            }
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(annotationType), objSave, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        }
    }, new Function1<Object, AnnotatedString.Range<? extends Object>>() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
                iArr[AnnotationType.Span.ordinal()] = 2;
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                iArr[AnnotationType.String.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            Object objRestore = null;
            AnnotationType annotationType = obj2 == null ? null : (AnnotationType) obj2;
            Object obj3 = list.get(2);
            int iIntValue = (obj3 == null ? null : (Integer) obj3).intValue();
            Object obj4 = list.get(3);
            int iIntValue2 = (obj4 == null ? null : (Integer) obj4).intValue();
            Object obj5 = list.get(4);
            String str = obj5 == null ? null : (String) obj5;
            int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
            if (i == 1) {
                Object obj6 = list.get(1);
                Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                if (!Intrinsics.areEqual(obj6, Boolean.FALSE) && obj6 != null) {
                    objRestore = paragraphStyleSaver.restore(obj6);
                }
                return new AnnotatedString.Range<>(objRestore, iIntValue, iIntValue2, str);
            }
            if (i == 2) {
                Object obj7 = list.get(1);
                Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                if (!Intrinsics.areEqual(obj7, Boolean.FALSE) && obj7 != null) {
                    objRestore = spanStyleSaver.restore(obj7);
                }
                return new AnnotatedString.Range<>(objRestore, iIntValue, iIntValue2, str);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                Object obj8 = list.get(1);
                return new AnnotatedString.Range<>(obj8 != null ? (String) obj8 : null, iIntValue, iIntValue2, str);
            }
            Object obj9 = list.get(1);
            Saver saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!Intrinsics.areEqual(obj9, Boolean.FALSE) && obj9 != null) {
                objRestore = (VerbatimTtsAnnotation) saver.restore(obj9);
            }
            return new AnnotatedString.Range<>(objRestore, iIntValue, iIntValue2, str);
        }
    });

    @NotNull
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new Function2<SaverScope, VerbatimTtsAnnotation, Object>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new Function1<Object, VerbatimTtsAnnotation>() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final VerbatimTtsAnnotation invoke(@NotNull Object obj) {
            return new VerbatimTtsAnnotation((String) obj);
        }
    });

    @NotNull
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new Function2<SaverScope, ParagraphStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull ParagraphStyle paragraphStyle) {
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(paragraphStyle.getTextAlign()), SaversKt.save(paragraphStyle.getTextDirection()), SaversKt.save(TextUnit.m3096boximpl(paragraphStyle.getLineHeight()), SaversKt.getSaver(TextUnit.INSTANCE), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.INSTANCE), saverScope));
        }
    }, new Function1<Object, ParagraphStyle>() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final ParagraphStyle invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextIndent textIndentRestore = null;
            TextAlign textAlign = obj2 == null ? null : (TextAlign) obj2;
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 == null ? null : (TextDirection) obj3;
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.INSTANCE);
            Boolean bool = Boolean.FALSE;
            long packedValue = ((Intrinsics.areEqual(obj4, bool) || obj4 == null) ? null : saver.restore(obj4)).getPackedValue();
            Object obj5 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.INSTANCE);
            if (!Intrinsics.areEqual(obj5, bool) && obj5 != null) {
                textIndentRestore = saver2.restore(obj5);
            }
            return new ParagraphStyle(textAlign, textDirection, packedValue, textIndentRestore, null);
        }
    });

    @NotNull
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new Function2<SaverScope, SpanStyle, Object>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull SpanStyle spanStyle) {
            Color colorM1202boximpl = Color.m1202boximpl(spanStyle.getColor());
            Color.Companion companion = Color.INSTANCE;
            TextUnit textUnitM3096boximpl = TextUnit.m3096boximpl(spanStyle.getFontSize());
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(colorM1202boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(textUnitM3096boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.INSTANCE), saverScope), SaversKt.save(spanStyle.getFontStyle()), SaversKt.save(spanStyle.getFontSynthesis()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m3096boximpl(spanStyle.getLetterSpacing()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getBaselineShift(), SaversKt.getSaver(BaselineShift.INSTANCE), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.INSTANCE), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.INSTANCE), saverScope), SaversKt.save(Color.m1202boximpl(spanStyle.getBackground()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.INSTANCE), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.INSTANCE), saverScope));
        }
    }, new Function1<Object, SpanStyle>() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final SpanStyle invoke(@NotNull Object obj) {
            FontWeight fontWeightRestore;
            BaselineShift baselineShiftRestore;
            TextGeometricTransform textGeometricTransformRestore;
            LocaleList localeListRestore;
            TextDecoration textDecorationRestore;
            List list = (List) obj;
            Object obj2 = list.get(0);
            Color.Companion companion = Color.INSTANCE;
            Saver<Color, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            Shadow shadowRestore = null;
            long jM1222unboximpl = ((Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : saver.restore(obj2)).m1222unboximpl();
            Object obj3 = list.get(1);
            TextUnit.Companion companion2 = TextUnit.INSTANCE;
            long packedValue = ((Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(companion2).restore(obj3)).getPackedValue();
            Object obj4 = list.get(2);
            Saver<FontWeight, Object> saver2 = SaversKt.getSaver(FontWeight.INSTANCE);
            if (Intrinsics.areEqual(obj4, bool)) {
                fontWeightRestore = null;
            } else {
                fontWeightRestore = obj4 == null ? null : saver2.restore(obj4);
            }
            Object obj5 = list.get(3);
            FontStyle fontStyle = obj5 == null ? null : (FontStyle) obj5;
            Object obj6 = list.get(4);
            FontSynthesis fontSynthesis = obj6 == null ? null : (FontSynthesis) obj6;
            Object obj7 = list.get(6);
            String str = obj7 == null ? null : (String) obj7;
            Object obj8 = list.get(7);
            long packedValue2 = ((Intrinsics.areEqual(obj8, bool) || obj8 == null) ? null : SaversKt.getSaver(companion2).restore(obj8)).getPackedValue();
            Object obj9 = list.get(8);
            Saver<BaselineShift, Object> saver3 = SaversKt.getSaver(BaselineShift.INSTANCE);
            if (Intrinsics.areEqual(obj9, bool)) {
                baselineShiftRestore = null;
            } else {
                baselineShiftRestore = obj9 == null ? null : saver3.restore(obj9);
            }
            Object obj10 = list.get(9);
            Saver<TextGeometricTransform, Object> saver4 = SaversKt.getSaver(TextGeometricTransform.INSTANCE);
            if (Intrinsics.areEqual(obj10, bool)) {
                textGeometricTransformRestore = null;
            } else {
                textGeometricTransformRestore = obj10 == null ? null : saver4.restore(obj10);
            }
            Object obj11 = list.get(10);
            Saver<LocaleList, Object> saver5 = SaversKt.getSaver(LocaleList.INSTANCE);
            if (Intrinsics.areEqual(obj11, bool)) {
                localeListRestore = null;
            } else {
                localeListRestore = obj11 == null ? null : saver5.restore(obj11);
            }
            Object obj12 = list.get(11);
            long jM1222unboximpl2 = ((Intrinsics.areEqual(obj12, bool) || obj12 == null) ? null : SaversKt.getSaver(companion).restore(obj12)).m1222unboximpl();
            Object obj13 = list.get(12);
            Saver<TextDecoration, Object> saver6 = SaversKt.getSaver(TextDecoration.INSTANCE);
            if (Intrinsics.areEqual(obj13, bool)) {
                textDecorationRestore = null;
            } else {
                textDecorationRestore = obj13 == null ? null : saver6.restore(obj13);
            }
            Object obj14 = list.get(13);
            Saver<Shadow, Object> saver7 = SaversKt.getSaver(Shadow.INSTANCE);
            if (!Intrinsics.areEqual(obj14, bool) && obj14 != null) {
                shadowRestore = saver7.restore(obj14);
            }
            return new SpanStyle(jM1222unboximpl, packedValue, fontWeightRestore, fontStyle, fontSynthesis, null, str, packedValue2, baselineShiftRestore, textGeometricTransformRestore, localeListRestore, jM1222unboximpl2, textDecorationRestore, shadowRestore, 32, null);
        }
    });

    @NotNull
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new Function2<SaverScope, TextDecoration, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new Function1<Object, TextDecoration>() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextDecoration invoke(@NotNull Object obj) {
            return new TextDecoration(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new Function2<SaverScope, TextGeometricTransform, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull TextGeometricTransform textGeometricTransform) {
            return CollectionsKt__CollectionsKt.arrayListOf(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new Function1<Object, TextGeometricTransform>() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextGeometricTransform invoke(@NotNull Object obj) {
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });

    @NotNull
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new Function2<SaverScope, TextIndent, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull TextIndent textIndent) {
            TextUnit textUnitM3096boximpl = TextUnit.m3096boximpl(textIndent.getFirstLine());
            TextUnit.Companion companion = TextUnit.INSTANCE;
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(textUnitM3096boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m3096boximpl(textIndent.getRestLine()), SaversKt.getSaver(companion), saverScope));
        }
    }, new Function1<Object, TextIndent>() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final TextIndent invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.INSTANCE;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            long packedValue = ((Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : saver.restore(obj2)).getPackedValue();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if (!Intrinsics.areEqual(obj3, bool) && obj3 != null) {
                textUnitRestore = saver2.restore(obj3);
            }
            return new TextIndent(packedValue, textUnitRestore.getPackedValue(), null);
        }
    });

    @NotNull
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new Function2<SaverScope, FontWeight, Object>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new Function1<Object, FontWeight>() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final FontWeight invoke(@NotNull Object obj) {
            return new FontWeight(((Integer) obj).intValue());
        }
    });

    @NotNull
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new Function2<SaverScope, BaselineShift, Object>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, BaselineShift baselineShift) {
            return m2681invoke8a2Sb4w(saverScope, baselineShift.m2876unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m2681invoke8a2Sb4w(@NotNull SaverScope saverScope, float f) {
            return Float.valueOf(f);
        }
    }, new Function1<Object, BaselineShift>() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(@NotNull Object obj) {
            return BaselineShift.m2870boximpl(BaselineShift.m2871constructorimpl(((Float) obj).floatValue()));
        }
    });

    @NotNull
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new Function2<SaverScope, TextRange, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextRange textRange) {
            return m2687invokeFDrldGo(saverScope, textRange.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m2687invokeFDrldGo(@NotNull SaverScope saverScope, long j) {
            return CollectionsKt__CollectionsKt.arrayListOf((Integer) SaversKt.save(Integer.valueOf(TextRange.m2724getStartimpl(j))), (Integer) SaversKt.save(Integer.valueOf(TextRange.m2719getEndimpl(j))));
        }
    }, new Function1<Object, TextRange>() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            int iIntValue = (obj2 == null ? null : (Integer) obj2).intValue();
            Object obj3 = list.get(1);
            return TextRange.m2712boximpl(TextRangeKt.TextRange(iIntValue, (obj3 != null ? (Integer) obj3 : null).intValue()));
        }
    });

    @NotNull
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new Function2<SaverScope, Shadow, Object>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull Shadow shadow) {
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Color.m1202boximpl(shadow.getColor()), SaversKt.getSaver(Color.INSTANCE), saverScope), SaversKt.save(Offset.m972boximpl(shadow.getOffset()), SaversKt.getSaver(Offset.INSTANCE), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new Function1<Object, Shadow>() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Shadow invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.INSTANCE);
            Boolean bool = Boolean.FALSE;
            long jM1222unboximpl = ((Intrinsics.areEqual(obj2, bool) || obj2 == null) ? null : saver.restore(obj2)).m1222unboximpl();
            Object obj3 = list.get(1);
            long packedValue = ((Intrinsics.areEqual(obj3, bool) || obj3 == null) ? null : SaversKt.getSaver(Offset.INSTANCE).restore(obj3)).getPackedValue();
            Object obj4 = list.get(2);
            return new Shadow(jM1222unboximpl, packedValue, (obj4 != null ? (Float) obj4 : null).floatValue(), null);
        }
    });

    @NotNull
    private static final Saver<Color, Object> ColorSaver = SaverKt.Saver(new Function2<SaverScope, Color, Object>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
            return m2683invoke4WTKRHQ(saverScope, color.m1222unboximpl());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m2683invoke4WTKRHQ(@NotNull SaverScope saverScope, long j) {
            return ULong.m3904boximpl(j);
        }
    }, new Function1<Object, Color>() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(@NotNull Object obj) {
            return Color.m1202boximpl(Color.m1208constructorimpl(((ULong) obj).m3910unboximpl()));
        }
    });

    @NotNull
    private static final Saver<TextUnit, Object> TextUnitSaver = SaverKt.Saver(new Function2<SaverScope, TextUnit, Object>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, TextUnit textUnit) {
            return m2689invokempE4wyQ(saverScope, textUnit.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m2689invokempE4wyQ(@NotNull SaverScope saverScope, long j) {
            return CollectionsKt__CollectionsKt.arrayListOf(SaversKt.save(Float.valueOf(TextUnit.m3106getValueimpl(j))), SaversKt.save(TextUnitType.m3131boximpl(TextUnit.m3105getTypeUIouoOA(j))));
        }
    }, new Function1<Object, TextUnit>() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(@NotNull Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            float fFloatValue = (obj2 == null ? null : (Float) obj2).floatValue();
            Object obj3 = list.get(1);
            return TextUnit.m3096boximpl(TextUnitKt.m3118TextUnitanM5pPY(fFloatValue, (obj3 != null ? (TextUnitType) obj3 : null).getType()));
        }
    });

    @NotNull
    private static final Saver<Offset, Object> OffsetSaver = SaverKt.Saver(new Function2<SaverScope, Offset, Object>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Offset offset) {
            return m2685invokeUv8p0NA(saverScope, offset.getPackedValue());
        }

        @Nullable
        /* JADX INFO: renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m2685invokeUv8p0NA(@NotNull SaverScope saverScope, long j) {
            return Offset.m980equalsimpl0(j, Offset.INSTANCE.m998getUnspecifiedF1C5BW0()) ? Boolean.FALSE : CollectionsKt__CollectionsKt.arrayListOf((Float) SaversKt.save(Float.valueOf(Offset.m983getXimpl(j))), (Float) SaversKt.save(Float.valueOf(Offset.m984getYimpl(j))));
        }
    }, new Function1<Object, Offset>() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(@NotNull Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                return Offset.m972boximpl(Offset.INSTANCE.m998getUnspecifiedF1C5BW0());
            }
            List list = (List) obj;
            Object obj2 = list.get(0);
            float fFloatValue = (obj2 == null ? null : (Float) obj2).floatValue();
            Object obj3 = list.get(1);
            return Offset.m972boximpl(OffsetKt.Offset(fFloatValue, (obj3 != null ? (Float) obj3 : null).floatValue()));
        }
    });

    @NotNull
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new Function2<SaverScope, LocaleList, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull LocaleList localeList) {
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(SaversKt.save(localeList2.get(i), SaversKt.getSaver(Locale.INSTANCE), saverScope));
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        }
    }, new Function1<Object, LocaleList>() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final LocaleList invoke(@NotNull Object obj) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object obj2 = list.get(i);
                    Saver<Locale, Object> saver = SaversKt.getSaver(Locale.INSTANCE);
                    Locale localeRestore = null;
                    if (!Intrinsics.areEqual(obj2, Boolean.FALSE) && obj2 != null) {
                        localeRestore = saver.restore(obj2);
                    }
                    arrayList.add(localeRestore);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return new LocaleList(arrayList);
        }
    });

    @NotNull
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new Function2<SaverScope, Locale, Object>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SaverScope saverScope, @NotNull Locale locale) {
            return locale.toLanguageTag();
        }
    }, new Function1<Object, Locale>() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Locale invoke(@NotNull Object obj) {
            return new Locale((String) obj);
        }
    });

    @NotNull
    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    private static /* synthetic */ void getColorSaver$annotations() {
    }

    @NotNull
    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    @NotNull
    public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    @NotNull
    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    private static /* synthetic */ void getTextUnitSaver$annotations() {
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t) {
        if (Intrinsics.areEqual(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) t.restore(saveable);
        Intrinsics.reifiedOperationMarker(1, "Result");
        return result;
    }

    @Nullable
    public static final <T> T save(@Nullable T t) {
        return t;
    }

    @NotNull
    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Original original, @NotNull T t, @NotNull SaverScope saverScope) {
        Object objSave;
        return (original == null || (objSave = t.save(saverScope, original)) == null) ? Boolean.FALSE : objSave;
    }

    @NotNull
    public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    @NotNull
    public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "Result");
        return obj;
    }

    @NotNull
    public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    @NotNull
    public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    @NotNull
    public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion companion) {
        return TextRangeSaver;
    }

    @NotNull
    public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion companion) {
        return ShadowSaver;
    }

    @NotNull
    public static final Saver<Color, Object> getSaver(@NotNull Color.Companion companion) {
        return ColorSaver;
    }

    @NotNull
    public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    @NotNull
    public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion companion) {
        return OffsetSaver;
    }

    @NotNull
    public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    @NotNull
    public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion companion) {
        return LocaleSaver;
    }
}
