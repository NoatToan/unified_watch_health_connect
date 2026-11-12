package com.mapbox.maps.extension.style.expressions.types;

import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/types/FormatSection;", "", FirebaseAnalytics.Param.CONTENT, "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fontScale", GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "getContent", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getFontScale", "setFontScale", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "getTextColor", "setTextColor", "getTextFont", "setTextFont", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FormatSection {
    private final Expression content;
    private Expression fontScale;
    private Expression textColor;
    private Expression textFont;

    public /* synthetic */ FormatSection(Expression expression, Expression expression2, Expression expression3, Expression expression4, int i14, j jVar) {
        this(expression, (i14 & 2) != 0 ? null : expression2, (i14 & 4) != 0 ? null : expression3, (i14 & 8) != 0 ? null : expression4);
    }

    public static /* synthetic */ FormatSection copy$default(FormatSection formatSection, Expression expression, Expression expression2, Expression expression3, Expression expression4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            expression = formatSection.content;
        }
        if ((i14 & 2) != 0) {
            expression2 = formatSection.fontScale;
        }
        if ((i14 & 4) != 0) {
            expression3 = formatSection.textFont;
        }
        if ((i14 & 8) != 0) {
            expression4 = formatSection.textColor;
        }
        return formatSection.copy(expression, expression2, expression3, expression4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Expression getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Expression getFontScale() {
        return this.fontScale;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Expression getTextFont() {
        return this.textFont;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Expression getTextColor() {
        return this.textColor;
    }

    public final FormatSection copy(Expression content, Expression fontScale, Expression textFont, Expression textColor) {
        content.getClass();
        return new FormatSection(content, fontScale, textFont, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormatSection)) {
            return false;
        }
        FormatSection formatSection = (FormatSection) other;
        return s.g(this.content, formatSection.content) && s.g(this.fontScale, formatSection.fontScale) && s.g(this.textFont, formatSection.textFont) && s.g(this.textColor, formatSection.textColor);
    }

    public final Expression getContent() {
        return this.content;
    }

    public final Expression getFontScale() {
        return this.fontScale;
    }

    public final Expression getTextColor() {
        return this.textColor;
    }

    public final Expression getTextFont() {
        return this.textFont;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        Expression expression = this.fontScale;
        int iHashCode2 = (iHashCode + (expression == null ? 0 : expression.hashCode())) * 31;
        Expression expression2 = this.textFont;
        int iHashCode3 = (iHashCode2 + (expression2 == null ? 0 : expression2.hashCode())) * 31;
        Expression expression3 = this.textColor;
        return iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
    }

    public final void setFontScale(Expression expression) {
        this.fontScale = expression;
    }

    public final void setTextColor(Expression expression) {
        this.textColor = expression;
    }

    public final void setTextFont(Expression expression) {
        this.textFont = expression;
    }

    public String toString() {
        return "FormatSection(content=" + this.content + ", fontScale=" + this.fontScale + ", textFont=" + this.textFont + ", textColor=" + this.textColor + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormatSection(Expression expression, Expression expression2) {
        this(expression, expression2, null, null, 12, null);
        expression.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormatSection(Expression expression, Expression expression2, Expression expression3) {
        this(expression, expression2, expression3, null, 8, null);
        expression.getClass();
    }

    public FormatSection(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        expression.getClass();
        this.content = expression;
        this.fontScale = expression2;
        this.textFont = expression3;
        this.textColor = expression4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormatSection(Expression expression) {
        this(expression, null, null, null, 14, null);
        expression.getClass();
    }
}
