package com.mapbox.maps.extension.style.types;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.expressions.dsl.generated.ExpressionDslKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import e23.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/mapbox/maps/extension/style/types/Formatted;", "Ljava/util/ArrayList;", "Lcom/mapbox/maps/extension/style/types/FormattedSection;", "<init>", "()V", "Lcom/mapbox/bindgen/Value;", "toValue", "()Lcom/mapbox/bindgen/Value;", "", "getTextAsString", "()Ljava/lang/String;", "text", "Lkotlin/Function1;", "", "block", "formattedSection", "(Ljava/lang/String;Le23/l;)V", "section", "(Lcom/mapbox/maps/extension/style/types/FormattedSection;)V", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Formatted extends ArrayList<FormattedSection> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof FormattedSection) {
            return contains((FormattedSection) obj);
        }
        return false;
    }

    public final void formattedSection(String text, l<? super FormattedSection, Unit> block) {
        text.getClass();
        block.getClass();
        FormattedSection formattedSection = new FormattedSection(text, null, null, null, 14, null);
        block.invoke(formattedSection);
        add(formattedSection);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final String getTextAsString() {
        StringBuilder sb3 = new StringBuilder();
        Iterator<FormattedSection> it = iterator();
        while (it.hasNext()) {
            sb3.append(it.next().getText());
        }
        return sb3.toString();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof FormattedSection) {
            return indexOf((FormattedSection) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof FormattedSection) {
            return lastIndexOf((FormattedSection) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof FormattedSection) {
            return remove((FormattedSection) obj);
        }
        return false;
    }

    public /* bridge */ FormattedSection removeAt(int i14) {
        return remove(i14);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Value toValue() {
        ArrayList arrayList = new ArrayList(y.r(this, 10));
        Iterator<FormattedSection> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toValue$extension_style_release());
        }
        return new Value((List<Value>) arrayList);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/types/Formatted$Companion;", "", "()V", "fromExpression", "Lcom/mapbox/maps/extension/style/types/Formatted;", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fromProperty", "list", "Ljava/util/ArrayList;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final Formatted fromExpression(Expression expression) {
            expression.getClass();
            return fromProperty((ArrayList) TypeUtilsKt.unwrapToTyped(expression, ArrayList.class));
        }

        public final Formatted fromProperty(ArrayList<?> list) {
            list.getClass();
            Formatted formatted = new Formatted();
            if (s.g(d0.D(list), "format")) {
                int i14 = 0;
                for (Object obj : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        x.q();
                        throw null;
                    }
                    if (obj instanceof String) {
                        FormattedSection formattedSection = new FormattedSection((String) obj, null, null, null, 14, null);
                        Object obj2 = list.get(i15);
                        obj2.getClass();
                        HashMap map = (HashMap) obj2;
                        Set setKeySet = map.keySet();
                        setKeySet.getClass();
                        for (Object obj3 : setKeySet) {
                            if (s.g(obj3, PointAnnotationOptions.PROPERTY_TEXT_COLOR)) {
                                obj3.getClass();
                                Object obj4 = map.get(obj3);
                                obj4.getClass();
                                ArrayList arrayList = (ArrayList) obj4;
                                if (s.g(d0.D(arrayList), "rgba")) {
                                    formattedSection.setTextColor(ColorUtils.INSTANCE.rgbaExpressionToColorString(ExpressionDslKt.rgba(new Formatted$Companion$fromProperty$1$1$1(arrayList))));
                                }
                            } else if (s.g(obj3, "font-scale")) {
                                obj3.getClass();
                                Object obj5 = map.get(obj3);
                                obj5.getClass();
                                formattedSection.setFontScale((Double) obj5);
                            } else if (s.g(obj3, "text-font")) {
                                obj3.getClass();
                                Object obj6 = map.get(obj3);
                                obj6.getClass();
                                ArrayList arrayList2 = (ArrayList) obj6;
                                if (s.g(d0.D(arrayList2), "literal")) {
                                    Object objM0 = h0.m0(arrayList2);
                                    objM0.getClass();
                                    formattedSection.setFontStack((ArrayList) objM0);
                                }
                            }
                        }
                        formatted.add(formattedSection);
                    }
                    i14 = i15;
                }
            }
            return formatted;
        }

        private Companion() {
        }
    }

    public /* bridge */ boolean contains(FormattedSection formattedSection) {
        return super.contains((Object) formattedSection);
    }

    public /* bridge */ int indexOf(FormattedSection formattedSection) {
        return super.indexOf((Object) formattedSection);
    }

    public /* bridge */ int lastIndexOf(FormattedSection formattedSection) {
        return super.lastIndexOf((Object) formattedSection);
    }

    public /* bridge */ boolean remove(FormattedSection formattedSection) {
        return super.remove((Object) formattedSection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ FormattedSection remove(int i14) {
        return removeAt(i14);
    }

    public final void formattedSection(FormattedSection section) {
        section.getClass();
        add(section);
    }
}
