package androidx.compose.ui.text.font;

import com.google.android.exoplayer2.text.ttml.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u000eJ-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "Landroidx/compose/ui/text/font/FontWeight;", b.L, "Landroidx/compose/ui/text/font/FontStyle;", b.I, "matchFont-RetOiIg", "(Ljava/lang/Iterable;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "matchFont", "Landroidx/compose/ui/text/font/FontFamily;", b.K, "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public class FontMatcher {
    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public Font m2754matchFontRetOiIg(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
        if (fontFamily instanceof FontListFontFamily) {
            return m2755matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, fontStyle);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public Font m2755matchFontRetOiIg(@NotNull FontListFontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
        return m2756matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }

    @NotNull
    /* JADX INFO: renamed from: matchFont-RetOiIg, reason: not valid java name */
    public Font m2756matchFontRetOiIg(@NotNull Iterable<? extends Font> fontList, @NotNull FontWeight fontWeight, int fontStyle) {
        int i;
        Object obj;
        Font font;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Font> it2 = fontList.iterator();
        while (true) {
            boolean z = false;
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            Font next = it2.next();
            Font font2 = next;
            if (Intrinsics.areEqual(font2.getWeight(), fontWeight) && FontStyle.m2760equalsimpl0(font2.getStyle(), fontStyle)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return (Font) arrayList.get(0);
        }
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList2 = new ArrayList();
        for (Font font3 : fontList) {
            if (FontStyle.m2760equalsimpl0(font3.getStyle(), fontStyle)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        FontWeight.Companion companion = FontWeight.INSTANCE;
        Object obj5 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : fontList) {
                if (((Font) obj6).getWeight().compareTo(fontWeight) <= 0) {
                    arrayList3.add(obj6);
                }
            }
            if (arrayList3.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList3.get(0);
                FontWeight weight = ((Font) obj4).getWeight();
                int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList3);
                if (1 <= lastIndex) {
                    int i2 = 1;
                    while (true) {
                        int i3 = i2 + 1;
                        Object obj7 = arrayList3.get(i2);
                        FontWeight weight2 = ((Font) obj7).getWeight();
                        if (weight.compareTo(weight2) < 0) {
                            obj4 = obj7;
                            weight = weight2;
                        }
                        if (i2 == lastIndex) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            }
            font = (Font) obj4;
            if (font == null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : fontList) {
                    if (((Font) obj8).getWeight().compareTo(fontWeight) > 0) {
                        arrayList4.add(obj8);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Object obj9 = arrayList4.get(0);
                    FontWeight weight3 = ((Font) obj9).getWeight();
                    int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(arrayList4);
                    if (1 <= lastIndex2) {
                        while (true) {
                            int i4 = i + 1;
                            Object obj10 = arrayList4.get(i);
                            FontWeight weight4 = ((Font) obj10).getWeight();
                            if (weight3.compareTo(weight4) > 0) {
                                obj9 = obj10;
                                weight3 = weight4;
                            }
                            if (i == lastIndex2) {
                                break;
                            }
                            i = i4;
                        }
                    }
                    obj5 = obj9;
                }
                font = (Font) obj5;
            }
        } else if (fontWeight.compareTo(companion.getW500()) > 0) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj11 : fontList) {
                if (((Font) obj11).getWeight().compareTo(fontWeight) >= 0) {
                    arrayList5.add(obj11);
                }
            }
            if (arrayList5.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList5.get(0);
                FontWeight weight5 = ((Font) obj3).getWeight();
                int lastIndex3 = CollectionsKt__CollectionsKt.getLastIndex(arrayList5);
                if (1 <= lastIndex3) {
                    int i5 = 1;
                    while (true) {
                        int i6 = i5 + 1;
                        Object obj12 = arrayList5.get(i5);
                        FontWeight weight6 = ((Font) obj12).getWeight();
                        if (weight5.compareTo(weight6) > 0) {
                            obj3 = obj12;
                            weight5 = weight6;
                        }
                        if (i5 == lastIndex3) {
                            break;
                        }
                        i5 = i6;
                    }
                }
            }
            font = (Font) obj3;
            if (font == null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj13 : fontList) {
                    if (((Font) obj13).getWeight().compareTo(fontWeight) < 0) {
                        arrayList6.add(obj13);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    Object obj14 = arrayList6.get(0);
                    FontWeight weight7 = ((Font) obj14).getWeight();
                    int lastIndex4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList6);
                    if (1 <= lastIndex4) {
                        while (true) {
                            int i7 = i + 1;
                            Object obj15 = arrayList6.get(i);
                            FontWeight weight8 = ((Font) obj15).getWeight();
                            if (weight7.compareTo(weight8) < 0) {
                                obj14 = obj15;
                                weight7 = weight8;
                            }
                            if (i == lastIndex4) {
                                break;
                            }
                            i = i7;
                        }
                    }
                    obj5 = obj14;
                }
                font = (Font) obj5;
            }
        } else {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj16 : fontList) {
                Font font4 = (Font) obj16;
                if (font4.getWeight().compareTo(fontWeight) >= 0 && font4.getWeight().compareTo(FontWeight.INSTANCE.getW500()) <= 0) {
                    arrayList7.add(obj16);
                }
            }
            if (arrayList7.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList7.get(0);
                FontWeight weight9 = ((Font) obj).getWeight();
                int lastIndex5 = CollectionsKt__CollectionsKt.getLastIndex(arrayList7);
                if (1 <= lastIndex5) {
                    int i8 = 1;
                    while (true) {
                        int i9 = i8 + 1;
                        Object obj17 = arrayList7.get(i8);
                        FontWeight weight10 = ((Font) obj17).getWeight();
                        if (weight9.compareTo(weight10) > 0) {
                            obj = obj17;
                            weight9 = weight10;
                        }
                        if (i8 == lastIndex5) {
                            break;
                        }
                        i8 = i9;
                    }
                }
            }
            font = (Font) obj;
            if (font == null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj18 : fontList) {
                    if (((Font) obj18).getWeight().compareTo(fontWeight) < 0) {
                        arrayList8.add(obj18);
                    }
                }
                if (arrayList8.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList8.get(0);
                    FontWeight weight11 = ((Font) obj2).getWeight();
                    int lastIndex6 = CollectionsKt__CollectionsKt.getLastIndex(arrayList8);
                    if (1 <= lastIndex6) {
                        int i10 = 1;
                        while (true) {
                            int i11 = i10 + 1;
                            Object obj19 = arrayList8.get(i10);
                            FontWeight weight12 = ((Font) obj19).getWeight();
                            if (weight11.compareTo(weight12) < 0) {
                                obj2 = obj19;
                                weight11 = weight12;
                            }
                            if (i10 == lastIndex6) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                }
                font = (Font) obj2;
                if (font == null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj20 : fontList) {
                        if (((Font) obj20).getWeight().compareTo(FontWeight.INSTANCE.getW500()) > 0) {
                            arrayList9.add(obj20);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        Object obj21 = arrayList9.get(0);
                        FontWeight weight13 = ((Font) obj21).getWeight();
                        int lastIndex7 = CollectionsKt__CollectionsKt.getLastIndex(arrayList9);
                        if (1 <= lastIndex7) {
                            while (true) {
                                int i12 = i + 1;
                                Object obj22 = arrayList9.get(i);
                                FontWeight weight14 = ((Font) obj22).getWeight();
                                if (weight13.compareTo(weight14) > 0) {
                                    obj21 = obj22;
                                    weight13 = weight14;
                                }
                                if (i == lastIndex7) {
                                    break;
                                }
                                i = i12;
                            }
                        }
                        obj5 = obj21;
                    }
                    font = (Font) obj5;
                }
            }
        }
        if (font != null) {
            return font;
        }
        throw new IllegalStateException("Cannot match any font");
    }
}
