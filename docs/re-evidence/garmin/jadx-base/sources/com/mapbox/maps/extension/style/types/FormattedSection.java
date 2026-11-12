package com.mapbox.maps.extension.style.types;

import androidx.annotation.Keep;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0019HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\r\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R&\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u00198G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/style/types/FormattedSection;", "", "text", "", "fontScale", "", "fontStack", "", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getFontScale", "()Ljava/lang/Double;", "setFontScale", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFontStack", "()Ljava/util/List;", "setFontStack", "(Ljava/util/List;)V", "getText", "()Ljava/lang/String;", "getTextColor", "setTextColor", "(Ljava/lang/String;)V", "value", "", "textColorAsInt", "getTextColorAsInt", "()I", "setTextColorAsInt", "(I)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/FormattedSection;", "equals", "", "other", "hashCode", "toString", "toValue", "Lcom/mapbox/bindgen/Value;", "toValue$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FormattedSection {
    private Double fontScale;
    private List<String> fontStack;
    private final String text;
    private String textColor;

    public /* synthetic */ FormattedSection(String str, Double d14, List list, String str2, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedSection copy$default(FormattedSection formattedSection, String str, Double d14, List list, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = formattedSection.text;
        }
        if ((i14 & 2) != 0) {
            d14 = formattedSection.fontScale;
        }
        if ((i14 & 4) != 0) {
            list = formattedSection.fontStack;
        }
        if ((i14 & 8) != 0) {
            str2 = formattedSection.textColor;
        }
        return formattedSection.copy(str, d14, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> component3() {
        return this.fontStack;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final FormattedSection copy(String text, Double fontScale, List<String> fontStack, String textColor) {
        text.getClass();
        return new FormattedSection(text, fontScale, fontStack, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedSection)) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) other;
        return s.g(this.text, formattedSection.text) && s.g(this.fontScale, formattedSection.fontScale) && s.g(this.fontStack, formattedSection.fontStack) && s.g(this.textColor, formattedSection.textColor);
    }

    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> getFontStack() {
        return this.fontStack;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int getTextColorAsInt() {
        Integer numRgbaToColor;
        String str = this.textColor;
        if (str != null && (numRgbaToColor = ColorUtils.INSTANCE.rgbaToColor(str)) != null) {
            return numRgbaToColor.intValue();
        }
        h.z("Property textColor is not set.");
        return 0;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Double d14 = this.fontScale;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        List<String> list = this.fontStack;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.textColor;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final void setFontScale(Double d14) {
        this.fontScale = d14;
    }

    public final void setFontStack(List<String> list) {
        this.fontStack = list;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public final void setTextColorAsInt(int i14) {
        this.textColor = ColorUtils.INSTANCE.colorToRgbaString(i14);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("FormattedSection(text=");
        sb3.append(this.text);
        sb3.append(", fontScale=");
        sb3.append(this.fontScale);
        sb3.append(", fontStack=");
        sb3.append(this.fontStack);
        sb3.append(", textColor=");
        return a0.m(sb3, this.textColor, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final Value toValue$extension_style_release() {
        HashMap map = new HashMap();
        Double d14 = this.fontScale;
        if (d14 != null) {
            map.put("font-scale", new Value(d14.doubleValue()));
        }
        List<String> list = this.fontStack;
        if (list != null) {
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value((String) it.next()));
            }
            map.put("text-font", new Value((List<Value>) arrayList));
        }
        String str = this.textColor;
        if (str != null) {
            map.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, new Value(str));
        }
        return new Value((List<Value>) x.k(new Value(this.text), new Value((HashMap<String, Value>) map)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str, Double d14) {
        this(str, d14, null, null, 12, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str, Double d14, List<String> list) {
        this(str, d14, list, null, 8, null);
        str.getClass();
    }

    public FormattedSection(String str, Double d14, List<String> list, String str2) {
        str.getClass();
        this.text = str;
        this.fontScale = d14;
        this.fontStack = list;
        this.textColor = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str) {
        this(str, null, null, null, 14, null);
        str.getClass();
    }
}
