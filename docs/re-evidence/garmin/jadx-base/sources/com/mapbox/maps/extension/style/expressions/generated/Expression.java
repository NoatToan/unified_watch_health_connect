package com.mapbox.maps.extension.style.expressions.generated;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.gncs.settings.GNCSOptOutSettingsFragment;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.types.FormatSection;
import com.mapbox.maps.extension.style.types.ExpressionDsl;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.annotation.generated.PointAnnotationOptions;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o13.p;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u0;
import p13.x;
import p13.y;
import q6.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 &2\u00020\u0001:\t$%&'()*+,B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0002\u0010\rB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011B\u000f\b\u0012\u0012\u0006\u0010\u0005\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013B\u0015\b\u0012\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0002\u0010\u0015B\u0015\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0002\u0010\u0016B\u0015\b\u0010\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019B+\b\u0010\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001aj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001`\u001b¢\u0006\u0002\u0010\u001cJ\u0018\u0010!\u001a\u0004\u0018\u0001H\"\"\u0006\b\u0000\u0010\"\u0018\u0001H\u0086\b¢\u0006\u0002\u0010 J\u0006\u0010#\u001a\u00020\nR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/bindgen/Value;", "builder", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;)V", "value", "", "(D)V", "", "(J)V", "", "(Z)V", "", "(Ljava/lang/String;)V", "", "([D)V", "", "([J)V", "", "([Z)V", "", "([Ljava/lang/String;)V", "([[D)V", "", "", "(Ljava/util/List;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "<set-?>", "literalValue", "getLiteralValue", "()Ljava/lang/Object;", "getLiteral", "T", "isLiteral", "Builder", "CollatorBuilder", "Companion", "ExpressionBuilder", "FormatBuilder", "FormatSectionBuilder", "ImageBuilder", "InterpolatorBuilder", "NumberFormatBuilder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Expression extends Value {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Object literalValue;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0002\b\u0011R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "", "operator", "", "(Ljava/lang/String;)V", "arguments", "Ljava/util/ArrayList;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lkotlin/collections/ArrayList;", "getArguments$extension_style_release", "()Ljava/util/ArrayList;", "getOperator$extension_style_release", "()Ljava/lang/String;", "build", "contents", "", "Lcom/mapbox/bindgen/Value;", "contents$extension_style_release", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Builder {
        private final ArrayList<Expression> arguments;
        private final String operator;

        public Builder(String str) {
            str.getClass();
            this.operator = str;
            this.arguments = new ArrayList<>();
        }

        public Expression build() {
            j jVar = null;
            if (!s.g(this.operator, "match")) {
                return new Expression(this, jVar);
            }
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("match");
            int size = this.arguments.size() - 1;
            int i14 = 0;
            for (Object obj : this.arguments) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                Expression expressionUnwrapFromLiteralArray = (Expression) obj;
                if (i14 % 2 == 1 && i14 != size) {
                    expressionUnwrapFromLiteralArray = TypeUtilsKt.unwrapFromLiteralArray(expressionUnwrapFromLiteralArray);
                }
                expressionBuilder.addArgument(expressionUnwrapFromLiteralArray);
                i14 = i15;
            }
            return new Expression(expressionBuilder, jVar);
        }

        public final List<Value> contents$extension_style_release() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Value(this.operator));
            arrayList.addAll(this.arguments);
            return arrayList;
        }

        public final ArrayList<Expression> getArguments$extension_style_release() {
            return this.arguments;
        }

        /* JADX INFO: renamed from: getOperator$extension_style_release, reason: from getter */
        public final String getOperator() {
            return this.operator;
        }
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\t\u001a\u00020\u00002*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "<init>", "()V", "", "Lo13/p;", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "pairs", "imageOptions", "([Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ImageBuilder extends ExpressionBuilder {
        public ImageBuilder() {
            super("image");
        }

        @MapboxExperimental
        public final ImageBuilder imageOptions(p<String, Expression>... pairs) {
            pairs.getClass();
            getArguments$extension_style_release().add(new Expression((HashMap<String, Value>) u0.d(new p("params", Value.valueOf((HashMap<String, Value>) u0.d((p[]) Arrays.copyOf(pairs, pairs.length)))))));
            return this;
        }
    }

    public Expression(double[][] dArr) {
        dArr.getClass();
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double d14 : dArr2) {
                arrayList2.add(new Value(d14));
            }
            arrayList.add(new Value((List<Value>) arrayList2));
        }
        super((List<Value>) arrayList);
        this.literalValue = dArr;
    }

    public static final Expression abs(double d14) {
        return INSTANCE.abs(d14);
    }

    public static final Expression accumulated() {
        return INSTANCE.accumulated();
    }

    public static final Expression acos(double d14) {
        return INSTANCE.acos(d14);
    }

    @MapboxExperimental
    public static final Expression activeAnchor() {
        return INSTANCE.activeAnchor();
    }

    public static final Expression all(Expression... expressionArr) {
        return INSTANCE.all(expressionArr);
    }

    public static final Expression any(Expression... expressionArr) {
        return INSTANCE.any(expressionArr);
    }

    public static final Expression array(Expression... expressionArr) {
        return INSTANCE.array(expressionArr);
    }

    public static final Expression asin(double d14) {
        return INSTANCE.asin(d14);
    }

    public static final Expression at(double d14, Expression expression) {
        return INSTANCE.at(d14, expression);
    }

    public static final Expression atInterpolated(Expression... expressionArr) {
        return INSTANCE.atInterpolated(expressionArr);
    }

    public static final Expression atan(double d14) {
        return INSTANCE.atan(d14);
    }

    /* JADX INFO: renamed from: boolean, reason: not valid java name */
    public static final Expression m223boolean(Expression... expressionArr) {
        return INSTANCE.m225boolean(expressionArr);
    }

    public static final Expression ceil(double d14) {
        return INSTANCE.ceil(d14);
    }

    public static final Expression coalesce(Expression... expressionArr) {
        return INSTANCE.coalesce(expressionArr);
    }

    public static final Expression collator(Expression expression, Expression expression2, Expression expression3) {
        return INSTANCE.collator(expression, expression2, expression3);
    }

    public static final Expression color(int i14) {
        return INSTANCE.color(i14);
    }

    public static final Expression concat(Expression... expressionArr) {
        return INSTANCE.concat(expressionArr);
    }

    public static final Expression config(Expression... expressionArr) {
        return INSTANCE.config(expressionArr);
    }

    public static final Expression cos(double d14) {
        return INSTANCE.cos(d14);
    }

    public static final Expression cubicBezier(double d14, double d15, double d16, double d17) {
        return INSTANCE.cubicBezier(d14, d15, d16, d17);
    }

    public static final Expression cubicBezierInterpolator(double d14, double d15, double d16, double d17, Expression expression, p<Expression, Expression>... pVarArr) {
        return INSTANCE.cubicBezierInterpolator(d14, d15, d16, d17, expression, pVarArr);
    }

    public static final Expression distance(GeoJson geoJson) {
        return INSTANCE.distance(geoJson);
    }

    public static final Expression distanceFromCenter() {
        return INSTANCE.distanceFromCenter();
    }

    public static final Expression division(double d14, double d15) {
        return INSTANCE.division(d14, d15);
    }

    public static final Expression downcase(String str) {
        return INSTANCE.downcase(str);
    }

    public static final Expression e() {
        return INSTANCE.e();
    }

    public static final Expression eq(Expression... expressionArr) {
        return INSTANCE.eq(expressionArr);
    }

    public static final Expression exponential(double d14) {
        return INSTANCE.exponential(d14);
    }

    public static final Expression exponentialInterpolator(double d14, Expression expression, p<Expression, Expression>... pVarArr) {
        return INSTANCE.exponentialInterpolator(d14, expression, pVarArr);
    }

    public static final Expression featureState(Expression... expressionArr) {
        return INSTANCE.featureState(expressionArr);
    }

    public static final Expression floor(double d14) {
        return INSTANCE.floor(d14);
    }

    public static final Expression format(FormatSection... formatSectionArr) {
        return INSTANCE.format(formatSectionArr);
    }

    public static final Expression fromRaw(String str) {
        return INSTANCE.fromRaw(str);
    }

    public static final Expression geometryType() {
        return INSTANCE.geometryType();
    }

    public static final Expression get(String str) {
        return INSTANCE.get(str);
    }

    public static final Expression gt(Expression... expressionArr) {
        return INSTANCE.gt(expressionArr);
    }

    public static final Expression gte(Expression... expressionArr) {
        return INSTANCE.gte(expressionArr);
    }

    public static final Expression has(String str) {
        return INSTANCE.has(str);
    }

    public static final Expression heatmapDensity() {
        return INSTANCE.heatmapDensity();
    }

    public static final Expression hsl(Expression... expressionArr) {
        return INSTANCE.hsl(expressionArr);
    }

    public static final Expression hsla(Expression... expressionArr) {
        return INSTANCE.hsla(expressionArr);
    }

    public static final Expression id() {
        return INSTANCE.id();
    }

    @MapboxExperimental
    public static final Expression image(Expression expression, Map<String, Expression> map) {
        return INSTANCE.image(expression, map);
    }

    public static final Expression inExpression(double d14, Expression expression) {
        return INSTANCE.inExpression(d14, expression);
    }

    public static final Expression indexOf(Expression... expressionArr) {
        return INSTANCE.indexOf(expressionArr);
    }

    public static final Expression interpolate(Expression... expressionArr) {
        return INSTANCE.interpolate(expressionArr);
    }

    public static final Expression isSupportedScript(String str) {
        return INSTANCE.isSupportedScript(str);
    }

    public static final Expression length(String str) {
        return INSTANCE.length(str);
    }

    public static final Expression letExpression(Expression... expressionArr) {
        return INSTANCE.letExpression(expressionArr);
    }

    public static final Expression lineProgress() {
        return INSTANCE.lineProgress();
    }

    public static final Expression linear() {
        return INSTANCE.linear();
    }

    public static final Expression linearInterpolator(Expression expression, p<Expression, Expression>... pVarArr) {
        return INSTANCE.linearInterpolator(expression, pVarArr);
    }

    public static final Expression literal(double d14) {
        return INSTANCE.literal(d14);
    }

    public static final Expression ln(double d14) {
        return INSTANCE.ln(d14);
    }

    public static final Expression ln2() {
        return INSTANCE.ln2();
    }

    public static final Expression log10(double d14) {
        return INSTANCE.log10(d14);
    }

    public static final Expression log2(double d14) {
        return INSTANCE.log2(d14);
    }

    public static final Expression lt(Expression... expressionArr) {
        return INSTANCE.lt(expressionArr);
    }

    public static final Expression lte(Expression... expressionArr) {
        return INSTANCE.lte(expressionArr);
    }

    public static final Expression match(Expression expression, p<Expression, Expression>[] pVarArr, Expression expression2) {
        return INSTANCE.match(expression, pVarArr, expression2);
    }

    public static final Expression max(double... dArr) {
        return INSTANCE.max(dArr);
    }

    public static final Expression measureLight(Expression... expressionArr) {
        return INSTANCE.measureLight(expressionArr);
    }

    public static final Expression min(double... dArr) {
        return INSTANCE.min(dArr);
    }

    public static final Expression mod(double d14, double d15) {
        return INSTANCE.mod(d14, d15);
    }

    public static final Expression neq(Expression... expressionArr) {
        return INSTANCE.neq(expressionArr);
    }

    public static final Expression not(boolean z14) {
        return INSTANCE.not(z14);
    }

    public static final Expression number(Expression... expressionArr) {
        return INSTANCE.number(expressionArr);
    }

    public static final Expression numberFormat(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5) {
        return INSTANCE.numberFormat(expression, expression2, expression3, expression4, expression5);
    }

    public static final Expression objectExpression(Expression... expressionArr) {
        return INSTANCE.objectExpression(expressionArr);
    }

    public static final Expression pi() {
        return INSTANCE.pi();
    }

    public static final Expression pitch() {
        return INSTANCE.pitch();
    }

    public static final Expression pow(double d14, double d15) {
        return INSTANCE.pow(d14, d15);
    }

    public static final Expression product(double... dArr) {
        return INSTANCE.product(dArr);
    }

    public static final Expression properties() {
        return INSTANCE.properties();
    }

    public static final Expression random(Expression... expressionArr) {
        return INSTANCE.random(expressionArr);
    }

    public static final Expression rasterParticleSpeed() {
        return INSTANCE.rasterParticleSpeed();
    }

    public static final Expression rasterValue() {
        return INSTANCE.rasterValue();
    }

    public static final Expression resolvedLocale(Expression... expressionArr) {
        return INSTANCE.resolvedLocale(expressionArr);
    }

    public static final Expression rgb(double d14, double d15, double d16) {
        return INSTANCE.rgb(d14, d15, d16);
    }

    public static final Expression rgba(double d14, double d15, double d16, double d17) {
        return INSTANCE.rgba(d14, d15, d16, d17);
    }

    public static final Expression round(double d14) {
        return INSTANCE.round(d14);
    }

    public static final Expression sin(double d14) {
        return INSTANCE.sin(d14);
    }

    public static final Expression skyRadialProgress() {
        return INSTANCE.skyRadialProgress();
    }

    public static final Expression slice(Expression... expressionArr) {
        return INSTANCE.slice(expressionArr);
    }

    public static final Expression split(Expression... expressionArr) {
        return INSTANCE.split(expressionArr);
    }

    public static final Expression sqrt(double d14) {
        return INSTANCE.sqrt(d14);
    }

    public static final Expression step(Expression expression, Expression expression2, p<Expression, Expression>... pVarArr) {
        return INSTANCE.step(expression, expression2, pVarArr);
    }

    public static final Expression string(Expression... expressionArr) {
        return INSTANCE.string(expressionArr);
    }

    public static final Expression subtract(double d14) {
        return INSTANCE.subtract(d14);
    }

    public static final Expression sum(double... dArr) {
        return INSTANCE.sum(dArr);
    }

    public static final Expression switchCase(Expression... expressionArr) {
        return INSTANCE.switchCase(expressionArr);
    }

    public static final Expression tan(double d14) {
        return INSTANCE.tan(d14);
    }

    public static final Expression toBoolean(Expression... expressionArr) {
        return INSTANCE.toBoolean(expressionArr);
    }

    public static final Expression toColor(Expression... expressionArr) {
        return INSTANCE.toColor(expressionArr);
    }

    public static final Expression toHsla(Expression... expressionArr) {
        return INSTANCE.toHsla(expressionArr);
    }

    public static final Expression toNumber(Expression... expressionArr) {
        return INSTANCE.toNumber(expressionArr);
    }

    public static final Expression toRgba(Expression... expressionArr) {
        return INSTANCE.toRgba(expressionArr);
    }

    public static final Expression toString(Expression... expressionArr) {
        return INSTANCE.toString(expressionArr);
    }

    public static final Expression typeofExpression(Expression... expressionArr) {
        return INSTANCE.typeofExpression(expressionArr);
    }

    public static final Expression upcase(String str) {
        return INSTANCE.upcase(str);
    }

    public static final Expression varExpression(String str) {
        return INSTANCE.varExpression(str);
    }

    public static final Expression within(Geometry geometry) {
        return INSTANCE.within(geometry);
    }

    @MapboxExperimental
    public static final Expression worldview(Expression... expressionArr) {
        return INSTANCE.worldview(expressionArr);
    }

    public static final Expression zoom() {
        return INSTANCE.zoom();
    }

    public final <T> T getLiteral() {
        getLiteralValue();
        s.l();
        throw null;
    }

    public final Object getLiteralValue() {
        return this.literalValue;
    }

    public final boolean isLiteral() {
        return this.literalValue != null;
    }

    @Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000b\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u000b\u0010\u0011J#\u0010\u0012\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\fJ!\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0013\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\fJ!\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0014\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\fJ!\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\fJ!\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0015\u0010\u0011J#\u0010\u0016\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\fJ!\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0016\u0010\u0011J#\u0010\u0017\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\fJ!\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0017\u0010\u0011J#\u0010\u0018\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\fJ!\u0010\u0018\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0018\u0010\u0011J#\u0010\u0019\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\fJ!\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0019\u0010\u0011J#\u0010\u001a\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\fJ!\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001a\u0010\u0011J#\u0010\u001b\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\fJ!\u0010\u001b\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001b\u0010\u0011J#\u0010\u001c\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\fJ!\u0010\u001c\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001c\u0010\u0011J#\u0010\u001d\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001d\u0010\fJ!\u0010\u001d\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001d\u0010\u0011J#\u0010\u001e\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\fJ!\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\fJ!\u0010!\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b!\u0010\u0011J\u000f\u0010\"\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\"\u0010 J#\u0010#\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010\fJ!\u0010#\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b#\u0010\u0011J#\u0010$\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b$\u0010\fJ!\u0010$\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b$\u0010\u0011J#\u0010%\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b%\u0010\fJ!\u0010%\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b%\u0010\u0011J#\u0010&\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b&\u0010\fJ!\u0010&\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b&\u0010\u0011J#\u0010'\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b'\u0010\fJ!\u0010'\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b'\u0010\u0011J#\u0010(\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b(\u0010\fJ!\u0010(\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b(\u0010\u0011J#\u0010*\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b*\u0010\fJ!\u0010*\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b*\u0010\u0011J#\u0010+\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b+\u0010\fJ!\u0010+\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b+\u0010\u0011J#\u0010,\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010\fJ!\u0010,\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b,\u0010\u0011J#\u0010-\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010\fJ!\u0010-\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b-\u0010\u0011J#\u0010.\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010\fJ!\u0010.\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b.\u0010\u0011J+\u00104\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J+\u00104\u001a\u00020\u00062\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020/2\u0006\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b4\u00106J'\u00104\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0007¢\u0006\u0004\b4\u00107J!\u00104\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b4\u0010\u0011J#\u00109\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b9\u0010\fJ!\u00109\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b9\u0010\u0011J#\u0010:\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b:\u0010\fJ!\u0010:\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b:\u0010\u0011J#\u0010;\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010\fJ!\u0010;\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b;\u0010\u0011J\u0017\u0010>\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0006H\u0007¢\u0006\u0004\b@\u0010 J#\u0010A\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bA\u0010\fJ!\u0010A\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bA\u0010\u0011J\u000f\u0010B\u001a\u00020\u0006H\u0007¢\u0006\u0004\bB\u0010 J#\u0010C\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bC\u0010\fJ!\u0010C\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bC\u0010\u0011J#\u0010D\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bD\u0010\fJ!\u0010D\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bD\u0010\u0011J#\u0010G\u001a\u00020\u00062\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u00020E0\t\"\u00020EH\u0007¢\u0006\u0004\bG\u0010HJ!\u0010G\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bG\u0010\u0011J\u000f\u0010J\u001a\u00020\u0006H\u0007¢\u0006\u0004\bJ\u0010 J#\u0010K\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bK\u0010\fJ!\u0010K\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bK\u0010\u0011J#\u0010L\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bL\u0010\fJ!\u0010L\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bL\u0010\u0011J\u000f\u0010M\u001a\u00020\u0006H\u0007¢\u0006\u0004\bM\u0010 J#\u0010N\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bN\u0010\fJ!\u0010N\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bN\u0010\u0011J#\u0010O\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bO\u0010\fJ!\u0010O\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bO\u0010\u0011J\u000f\u0010P\u001a\u00020\u0006H\u0007¢\u0006\u0004\bP\u0010 J#\u0010Q\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bQ\u0010\fJ+\u0010Q\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060RH\u0007¢\u0006\u0004\bQ\u0010TJG\u0010Q\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060R2\u0006\u0010U\u001a\u00020\u00062\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060RH\u0007¢\u0006\u0004\bQ\u0010WJ!\u0010Q\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bQ\u0010\u0011J#\u0010Y\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bY\u0010\fJ!\u0010Y\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bY\u0010\u0011J#\u0010Z\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bZ\u0010\fJ!\u0010Z\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bZ\u0010\u0011J#\u0010[\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b[\u0010\fJ!\u0010[\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b[\u0010\u0011J#\u0010\\\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b\\\u0010\fJ!\u0010\\\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\\\u0010\u0011J#\u0010]\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b]\u0010\fJ!\u0010]\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b]\u0010\u0011J#\u0010^\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b^\u0010\fJ!\u0010^\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b^\u0010\u0011J\u000f\u0010_\u001a\u00020\u0006H\u0007¢\u0006\u0004\b_\u0010 J\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bb\u0010cJ\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020dH\u0007¢\u0006\u0004\bb\u0010eJ\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020/H\u0007¢\u0006\u0004\bb\u0010fJ\u0017\u0010b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0004H\u0007¢\u0006\u0004\bb\u0010\bJ\u001d\u0010b\u001a\u00020\u00062\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00010gH\u0001¢\u0006\u0004\bh\u0010iJ3\u0010b\u001a\u00020\u00062\"\u0010a\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010jj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`kH\u0001¢\u0006\u0004\bh\u0010lJ#\u0010m\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bm\u0010\fJ!\u0010m\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bm\u0010\u0011J\u000f\u0010n\u001a\u00020\u0006H\u0007¢\u0006\u0004\bn\u0010 J#\u0010o\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bo\u0010\fJ!\u0010o\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bo\u0010\u0011J#\u0010p\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bp\u0010\fJ!\u0010p\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bp\u0010\u0011J#\u0010q\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bq\u0010\fJ!\u0010q\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bq\u0010\u0011J#\u0010r\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\br\u0010\fJ!\u0010r\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\br\u0010\u0011J#\u0010s\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bs\u0010\fJ!\u0010s\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bs\u0010\u0011J#\u0010t\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bt\u0010\fJ!\u0010t\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bt\u0010\u0011J#\u0010u\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\bu\u0010\fJ!\u0010u\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\bu\u0010\u0011JG\u0010y\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\by\u0010zJ)\u0010y\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\by\u0010|J#\u0010}\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0004\b}\u0010\fJ!\u0010}\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b}\u0010\u0011J\u000f\u0010~\u001a\u00020\u0006H\u0007¢\u0006\u0004\b~\u0010 J\u000f\u0010\u007f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u007f\u0010 J\u0011\u0010\u0080\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0080\u0001\u0010 J%\u0010\u0081\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0081\u0001\u0010\fJ#\u0010\u0081\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0081\u0001\u0010\u0011J\u0011\u0010\u0082\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0082\u0001\u0010 J\u0011\u0010\u0083\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0083\u0001\u0010 J%\u0010\u0084\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0084\u0001\u0010\fJ#\u0010\u0084\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0084\u0001\u0010\u0011J%\u0010\u0085\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0085\u0001\u0010\fJ#\u0010\u0085\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0085\u0001\u0010\u0011J%\u0010\u0086\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0086\u0001\u0010\fJ#\u0010\u0086\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0086\u0001\u0010\u0011J%\u0010\u0087\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0087\u0001\u0010\fJ#\u0010\u0087\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0087\u0001\u0010\u0011J%\u0010\u0088\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0088\u0001\u0010\fJ#\u0010\u0088\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u0011\u0010\u0089\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0089\u0001\u0010 J%\u0010\u008a\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008a\u0001\u0010\fJ#\u0010\u008a\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008a\u0001\u0010\u0011J%\u0010\u008b\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008b\u0001\u0010\fJ#\u0010\u008b\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008b\u0001\u0010\u0011J%\u0010\u008c\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008c\u0001\u0010\fJ#\u0010\u008c\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008c\u0001\u0010\u0011J%\u0010\u008d\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008d\u0001\u0010\fJ#\u0010\u008d\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008d\u0001\u0010\u0011J%\u0010\u008e\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008e\u0001\u0010\fJ#\u0010\u008e\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008e\u0001\u0010\u0011J%\u0010\u008f\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u008f\u0001\u0010\fJ#\u0010\u008f\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u008f\u0001\u0010\u0011J%\u0010\u0090\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0090\u0001\u0010\fJ#\u0010\u0090\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0090\u0001\u0010\u0011J%\u0010\u0091\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\fJ#\u0010\u0091\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0091\u0001\u0010\u0011J%\u0010\u0092\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0092\u0001\u0010\fJ#\u0010\u0092\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0092\u0001\u0010\u0011J%\u0010\u0093\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\fJ#\u0010\u0093\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0093\u0001\u0010\u0011J%\u0010\u0094\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0094\u0001\u0010\fJ#\u0010\u0094\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0094\u0001\u0010\u0011J%\u0010\u0095\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0095\u0001\u0010\fJ#\u0010\u0095\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0095\u0001\u0010\u0011J%\u0010\u0096\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0096\u0001\u0010\fJ#\u0010\u0096\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0096\u0001\u0010\u0011J%\u0010\u0097\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0097\u0001\u0010\fJ#\u0010\u0097\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0097\u0001\u0010\u0011J%\u0010\u0098\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u0098\u0001\u0010\fJ#\u0010\u0098\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u0098\u0001\u0010\u0011J\u001c\u0010\u009b\u0001\u001a\u00020\u00062\b\u0010\u009a\u0001\u001a\u00030\u0099\u0001H\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J%\u0010\u009d\u0001\u001a\u00020\u00062\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H\u0007¢\u0006\u0005\b\u009d\u0001\u0010\fJ#\u0010\u009d\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b\u009d\u0001\u0010\u0011J\u0011\u0010\u009e\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u009e\u0001\u0010 J-\u0010\u0085\u0001\u001a\u00020\u00062\u0007\u0010\u009f\u0001\u001a\u00020`2\u0007\u0010 \u0001\u001a\u00020`2\u0007\u0010¡\u0001\u001a\u00020`H\u0007¢\u0006\u0006\b\u0085\u0001\u0010¢\u0001J6\u0010\u0086\u0001\u001a\u00020\u00062\u0007\u0010\u009f\u0001\u001a\u00020`2\u0007\u0010 \u0001\u001a\u00020`2\u0007\u0010¡\u0001\u001a\u00020`2\u0007\u0010£\u0001\u001a\u00020`H\u0007¢\u0006\u0006\b\u0086\u0001\u0010¤\u0001JS\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062\u0007\u0010¦\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b\u008d\u0001\u0010©\u0001JH\u0010,\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00012\u0007\u0010ª\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b,\u0010«\u0001JQ\u0010q\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00012\u0007\u0010ª\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\bq\u0010¬\u0001JJ\u0010\u00ad\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001JS\u0010°\u0001\u001a\u00020\u00062\u0007\u0010¯\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b°\u0001\u0010©\u0001JS\u0010°\u0001\u001a\u00020\u00062\u0007\u0010¯\u0001\u001a\u00020`2\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b°\u0001\u0010±\u0001Jn\u0010¶\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u00062\u0007\u0010³\u0001\u001a\u00020\u00062\u0007\u0010´\u0001\u001a\u00020\u00062\u0007\u0010µ\u0001\u001a\u00020\u00062\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b¶\u0001\u0010·\u0001Jn\u0010¶\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020`2\u0007\u0010³\u0001\u001a\u00020`2\u0007\u0010´\u0001\u001a\u00020`2\u0007\u0010µ\u0001\u001a\u00020`2\u0007\u0010¥\u0001\u001a\u00020\u00062-\u0010¨\u0001\u001a\u0017\u0012\u0013\b\u0001\u0012\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u00010\t\"\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060§\u0001H\u0007¢\u0006\u0006\b¶\u0001\u0010¸\u0001J\u0011\u0010¹\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b¹\u0001\u0010 J\u001a\u0010º\u0001\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0019\u0010º\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0005\bº\u0001\u0010cJ#\u0010º\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\bº\u0001\u0010\u0011J6\u0010¾\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020\u00062\u0007\u0010´\u0001\u001a\u00020\u00062\u0007\u0010¼\u0001\u001a\u00020\u00062\u0007\u0010½\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0006\b¾\u0001\u0010¿\u0001J6\u0010¾\u0001\u001a\u00020\u00062\u0007\u0010²\u0001\u001a\u00020`2\u0007\u0010´\u0001\u001a\u00020`2\u0007\u0010¼\u0001\u001a\u00020`2\u0007\u0010½\u0001\u001a\u00020`H\u0007¢\u0006\u0006\b¾\u0001\u0010¤\u0001J#\u0010¾\u0001\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0005\b¾\u0001\u0010\u0011J\u001e\u0010Â\u0001\u001a\u00020\u00062\n\b\u0001\u0010Á\u0001\u001a\u00030À\u0001H\u0007¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0018\u0010K\u001a\u00020\u00062\u0007\u0010Ä\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0004\bK\u0010\bJ!\u0010K\u001a\u00020\u00062\u0007\u0010Ä\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0005\bK\u0010Å\u0001J\u0018\u0010\u0012\u001a\u00020\u00062\u0007\u0010Æ\u0001\u001a\u00020/H\u0007¢\u0006\u0004\b\u0012\u0010fJ!\u0010'\u001a\u00020\u00062\u0007\u0010Ç\u0001\u001a\u00020`2\u0006\u0010%\u001a\u00020\u0006H\u0007¢\u0006\u0005\b'\u0010È\u0001J\"\u0010Y\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020\u00042\u0007\u0010Ê\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\bY\u0010Å\u0001J\"\u0010Y\u001a\u00020\u00062\u0007\u0010É\u0001\u001a\u00020`2\u0007\u0010Ê\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\bY\u0010È\u0001J!\u0010L\u001a\u00020\u00062\u0007\u0010\u008e\u0001\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0005\bL\u0010Å\u0001J\u0018\u0010L\u001a\u00020\u00062\u0007\u0010\u008e\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0004\bL\u0010\bJ\u0018\u0010]\u001a\u00020\u00062\u0007\u0010\u008e\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0004\b]\u0010\bJ\u001e\u0010\u0018\u001a\u00020\u00062\f\u0010Ì\u0001\u001a\u00030Ë\u0001\"\u00020`H\u0007¢\u0006\u0005\b\u0018\u0010Í\u0001J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010Ì\u0001\u001a\u00030Ë\u0001\"\u00020`H\u0007¢\u0006\u0005\b\u0014\u0010Í\u0001J\"\u0010\u000b\u001a\u00020\u00062\u0007\u0010Î\u0001\u001a\u00020`2\u0007\u0010Ï\u0001\u001a\u00020`H\u0007¢\u0006\u0005\b\u000b\u0010Ð\u0001J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b\u000b\u0010cJ\"\u0010\u0015\u001a\u00020\u00062\u0007\u0010Î\u0001\u001a\u00020`2\u0007\u0010Ï\u0001\u001a\u00020`H\u0007¢\u0006\u0005\b\u0015\u0010Ð\u0001J\"\u0010\u0016\u001a\u00020\u00062\u0007\u0010Î\u0001\u001a\u00020`2\u0007\u0010Ï\u0001\u001a\u00020`H\u0007¢\u0006\u0005\b\u0016\u0010Ð\u0001J\"\u0010\u0017\u001a\u00020\u00062\u0007\u0010Î\u0001\u001a\u00020`2\u0007\u0010Ï\u0001\u001a\u00020`H\u0007¢\u0006\u0005\b\u0017\u0010Ð\u0001J\u0019\u0010\u008c\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0005\b\u008c\u0001\u0010cJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bo\u0010cJ\u0017\u0010m\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bm\u0010cJ\u0017\u0010p\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bp\u0010cJ\u0019\u0010\u0088\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0005\b\u0088\u0001\u0010cJ\u0017\u0010;\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b;\u0010cJ\u0019\u0010\u008f\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0005\b\u008f\u0001\u0010cJ\u0017\u0010&\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b&\u0010cJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b!\u0010cJ\u0017\u0010*\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b*\u0010cJ\u001e\u0010t\u001a\u00020\u00062\f\u0010Ñ\u0001\u001a\u00030Ë\u0001\"\u00020`H\u0007¢\u0006\u0005\bt\u0010Í\u0001J\u001e\u0010r\u001a\u00020\u00062\f\u0010Ñ\u0001\u001a\u00030Ë\u0001\"\u00020`H\u0007¢\u0006\u0005\br\u0010Í\u0001J\u0019\u0010\u0087\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0005\b\u0087\u0001\u0010cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b\u001e\u0010cJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\b-\u0010cJ\u0017\u0010D\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`H\u0007¢\u0006\u0004\bD\u0010cJ\u0018\u0010\\\u001a\u00020\u00062\u0007\u0010Ò\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\\\u0010\bJ\u0019\u0010\u0097\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0097\u0001\u0010\bJ\u0017\u0010A\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010\bJ%\u00109\u001a\u00020\u00062\u0013\u0010Ñ\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\t\"\u00020\u0004H\u0007¢\u0006\u0005\b9\u0010Ó\u0001J,\u0010y\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0005\by\u0010Ô\u0001J\u0019\u0010\u0098\u0001\u001a\u00020\u00062\u0006\u0010a\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u0098\u0001\u0010\b¨\u0006Õ\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Companion;", "", "<init>", "()V", "", "expression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fromRaw", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "", "expressions", "subtract", "([Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "not", "neq", "product", "division", "mod", "pow", "sum", "lt", "lte", "eq", "gt", "gte", "abs", "accumulated", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "acos", "activeAnchor", TtmlNode.COMBINE_ALL, Languages.ANY, "array", "asin", "at", "atInterpolated", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "atan", "boolean", "switchCase", "ceil", "coalesce", "", "caseSensitive", "diacriticSensitive", "Ljava/util/Locale;", "locale", "collator", "(ZZLjava/util/Locale;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(ZZLjava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "concat", "config", "cos", "Lcom/mapbox/geojson/GeoJson;", "geojson", "distance", "(Lcom/mapbox/geojson/GeoJson;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "distanceFromCenter", "downcase", JWKParameterNames.RSA_EXPONENT, "featureState", "floor", "Lcom/mapbox/maps/extension/style/expressions/types/FormatSection;", "formatSections", "format", "([Lcom/mapbox/maps/extension/style/expressions/types/FormatSection;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "geometryType", "get", "has", "heatmapDensity", "hsl", "hsla", TtmlNode.ATTR_ID, "image", "", "options", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/util/Map;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "image2", "options2", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/util/Map;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Ljava/util/Map;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "inExpression", "indexOf", "interpolate", "isSupportedScript", "length", "letExpression", "lineProgress", "", "value", "literal", "(D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "", "(J)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Z)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "", "literal$extension_style_release", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "ln", "ln2", "log10", "log2", "match", "max", "measureLight", "min", "number", FirebaseAnalytics.Param.CURRENCY, "minFractionDigits", "maxFractionDigits", "numberFormat", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "objectExpression", "pi", "pitch", "properties", "random", "rasterParticleSpeed", "rasterValue", "resolvedLocale", "rgb", "rgba", "round", "sin", "skyRadialProgress", "slice", "split", "sqrt", "step", "string", "tan", "toBoolean", "toColor", "toHsla", "toNumber", "toRgba", "toString", "typeofExpression", "upcase", "varExpression", "Lcom/mapbox/geojson/Geometry;", "geometry", "within", "(Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "worldview", "zoom", "red", "green", "blue", "(DDD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "alpha", "(DDDD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "input", "output", "Lo13/p;", "stops", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "fallback", "([Lo13/p;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "linearInterpolator", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", TtmlNode.RUBY_BASE, "exponentialInterpolator", "(DLcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "x1", "y1", "x2", "y2", "cubicBezierInterpolator", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(DDDDLcom/mapbox/maps/extension/style/expressions/generated/Expression;[Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "linear", "exponential", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "x3", "x4", "cubicBezier", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "", "intColor", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", Action.KEY_ATTRIBUTE, "(Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "bool", FirebaseAnalytics.Param.INDEX, "(DLcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "needle", "haystack", "", "double", "([D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "first", "second", "(DD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "values", StringLookupFactory.KEY_SCRIPT, "([Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(DLe23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ Expression collator$default(Companion companion, boolean z14, boolean z15, Locale locale, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            if ((i14 & 2) != 0) {
                z15 = false;
            }
            return companion.collator(z14, z15, locale);
        }

        public static /* synthetic */ Expression numberFormat$default(Companion companion, Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                expression2 = null;
            }
            if ((i14 & 4) != 0) {
                expression3 = null;
            }
            if ((i14 & 8) != 0) {
                expression4 = null;
            }
            if ((i14 & 16) != 0) {
                expression5 = null;
            }
            return companion.numberFormat(expression, expression2, expression3, expression4, expression5);
        }

        public final Expression abs(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "abs");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression accumulated() {
            return new ExpressionBuilder("accumulated").build();
        }

        public final Expression acos(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "acos");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        @MapboxExperimental
        public final Expression activeAnchor() {
            return new ExpressionBuilder("active-anchor").build();
        }

        public final Expression all(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, TtmlNode.COMBINE_ALL);
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression any(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, Languages.ANY);
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression array(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "array");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression asin(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "asin");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression at(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "at");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression atInterpolated(Expression... expressions) {
            expressions.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("at-interpolated");
            for (Expression expression : expressions) {
                interpolatorBuilder.addArgument(expression);
            }
            return interpolatorBuilder.build();
        }

        public final Expression atan(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "atan");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final Expression m225boolean(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "boolean");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression ceil(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "ceil");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression coalesce(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "coalesce");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression collator(Expression caseSensitive, Expression diacriticSensitive, Expression locale) {
            caseSensitive.getClass();
            diacriticSensitive.getClass();
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        public final Expression color(int intColor) {
            float[] fArrColorToRgbaArray = ColorUtils.INSTANCE.colorToRgbaArray(intColor);
            return rgba(literal(fArrColorToRgbaArray[0]), literal(fArrColorToRgbaArray[1]), literal(fArrColorToRgbaArray[2]), literal(fArrColorToRgbaArray[3]));
        }

        public final Expression concat(String... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("concat");
            for (String str : values) {
                expressionBuilder.addArgument(literal(str));
            }
            return expressionBuilder.build();
        }

        public final Expression config(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "config");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression cos(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "cos");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression cubicBezier(double x14, double x15, double x16, double x17) {
            return new ExpressionBuilder("cubic-bezier").addArgument(literal(x14)).addArgument(literal(x15)).addArgument(literal(x16)).addArgument(literal(x17)).build();
        }

        public final Expression cubicBezierInterpolator(Expression x14, Expression y14, Expression x15, Expression y15, Expression input, p<Expression, Expression>... stops) {
            x14.getClass();
            y14.getClass();
            x15.getClass();
            y15.getClass();
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.cubicBezier(x14, y14, x15, y15);
            interpolatorBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                interpolatorBuilder.addArgument(pVar.f128594a);
                interpolatorBuilder.addArgument(pVar.f128595b);
            }
            return interpolatorBuilder.build();
        }

        public final Expression distance(GeoJson geojson) {
            geojson.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("distance");
            Expected<String, Value> expectedFromJson = Value.fromJson(geojson.toJson());
            expectedFromJson.getClass();
            Value value = expectedFromJson.getValue();
            if (value == null) {
                com.mapbox.maps.p.n(expectedFromJson.getError());
                return null;
            }
            Object contents = value.getContents();
            contents.getClass();
            expressionBuilder.addArgument(new Expression((HashMap<String, Value>) contents));
            return expressionBuilder.build();
        }

        public final Expression distanceFromCenter() {
            return new ExpressionBuilder("distance-from-center").build();
        }

        public final Expression division(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "/");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression downcase(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "downcase");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression e() {
            return new ExpressionBuilder(JWKParameterNames.RSA_EXPONENT).build();
        }

        public final Expression eq(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "==");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression exponential(double value) {
            return new ExpressionBuilder("exponential").addArgument(literal(value)).build();
        }

        public final Expression exponentialInterpolator(Expression base, Expression input, p<Expression, Expression>... stops) {
            base.getClass();
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.exponential(base);
            interpolatorBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                interpolatorBuilder.addArgument(pVar.f128594a);
                interpolatorBuilder.addArgument(pVar.f128595b);
            }
            return interpolatorBuilder.build();
        }

        public final Expression featureState(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "feature-state");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression floor(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "floor");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression format(FormatSection... formatSections) {
            formatSections.getClass();
            FormatBuilder formatBuilder = new FormatBuilder();
            for (FormatSection formatSection : formatSections) {
                FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(formatSection.getContent());
                Expression fontScale = formatSection.getFontScale();
                if (fontScale != null) {
                    formatSectionBuilder.fontScale(fontScale);
                }
                Expression textFont = formatSection.getTextFont();
                if (textFont != null) {
                    formatSectionBuilder.textFont(textFont);
                }
                Expression textColor = formatSection.getTextColor();
                if (textColor != null) {
                    formatSectionBuilder.textColor(textColor);
                }
                formatBuilder.getArguments$extension_style_release().addAll(formatSectionBuilder.build());
            }
            return formatBuilder.build();
        }

        public final Expression fromRaw(String expression) {
            expression.getClass();
            Expected<String, Value> expectedFromJson = Value.fromJson(expression);
            if (expectedFromJson != null) {
                String error = expectedFromJson.getError();
                if (error != null) {
                    com.mapbox.maps.p.n(error);
                    return null;
                }
                Value value = expectedFromJson.getValue();
                if (value != null) {
                    return TypeUtilsKt.unwrapToExpression(value);
                }
            }
            com.mapbox.maps.p.n("Plugin is not added to Style yet.");
            return null;
        }

        public final Expression geometryType() {
            return new ExpressionBuilder("geometry-type").build();
        }

        public final Expression get(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "get");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression gt(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, ">");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression gte(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, ">=");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression has(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "has");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression heatmapDensity() {
            return new ExpressionBuilder("heatmap-density").build();
        }

        public final Expression hsl(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "hsl");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression hsla(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "hsla");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression id() {
            return new ExpressionBuilder(TtmlNode.ATTR_ID).build();
        }

        @MapboxExperimental
        public final Expression image(Expression image, Map<String, Expression> options, Expression image2, Map<String, Expression> options2) {
            image.getClass();
            options.getClass();
            image2.getClass();
            options2.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            imageBuilder.addArgument(image);
            ArrayList arrayList = new ArrayList(options.size());
            for (Map.Entry<String, Expression> entry : options.entrySet()) {
                arrayList.add(new p(entry.getKey(), entry.getValue()));
            }
            Object[] array = arrayList.toArray(new p[0]);
            array.getClass();
            p[] pVarArr = (p[]) array;
            imageBuilder.imageOptions((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
            imageBuilder.addArgument(image2);
            ArrayList arrayList2 = new ArrayList(options2.size());
            for (Map.Entry<String, Expression> entry2 : options2.entrySet()) {
                arrayList2.add(new p(entry2.getKey(), entry2.getValue()));
            }
            Object[] array2 = arrayList2.toArray(new p[0]);
            array2.getClass();
            p[] pVarArr2 = (p[]) array2;
            imageBuilder.imageOptions((p[]) Arrays.copyOf(pVarArr2, pVarArr2.length));
            return imageBuilder.build();
        }

        public final Expression inExpression(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "in");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression indexOf(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "index-of");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression interpolate(Expression... expressions) {
            expressions.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            for (Expression expression : expressions) {
                interpolatorBuilder.addArgument(expression);
            }
            return interpolatorBuilder.build();
        }

        public final Expression isSupportedScript(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "is-supported-script");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression length(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "length");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression letExpression(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "let");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression lineProgress() {
            return new ExpressionBuilder("line-progress").build();
        }

        public final Expression linear() {
            return new ExpressionBuilder("linear").build();
        }

        public final Expression linearInterpolator(Expression input, p<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.linear();
            interpolatorBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                interpolatorBuilder.addArgument(pVar.f128594a);
                interpolatorBuilder.addArgument(pVar.f128595b);
            }
            return interpolatorBuilder.build();
        }

        public final Expression literal(String value) {
            value.getClass();
            return new Expression(value, (j) null);
        }

        public final Expression literal$extension_style_release(HashMap<String, Object> value) {
            value.getClass();
            HashMap map = new HashMap();
            for (Map.Entry<String, Object> entry : value.entrySet()) {
                map.put(entry.getKey(), TypeUtils.INSTANCE.wrapToValue(entry.getValue()));
            }
            return new ExpressionBuilder("literal").addArgument(new Expression((HashMap<String, Value>) map)).build();
        }

        public final Expression ln(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "ln");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression ln2() {
            return new ExpressionBuilder("ln2").build();
        }

        public final Expression log10(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "log10");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression log2(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "log2");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression lt(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "<");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression lte(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "<=");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression match(Expression input, p<Expression, Expression>[] stops, Expression fallback) {
            input.getClass();
            stops.getClass();
            fallback.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("match");
            expressionBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                expressionBuilder.addArgument(pVar.f128594a);
                expressionBuilder.addArgument(pVar.f128595b);
            }
            expressionBuilder.addArgument(fallback);
            return expressionBuilder.build();
        }

        public final Expression max(double... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("max");
            for (double d14 : values) {
                expressionBuilder.addArgument(literal(d14));
            }
            return expressionBuilder.build();
        }

        public final Expression measureLight(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "measure-light");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression min(double... values) {
            values.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("min");
            for (double d14 : values) {
                expressionBuilder.addArgument(literal(d14));
            }
            return expressionBuilder.build();
        }

        public final Expression mod(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "%");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression neq(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "!=");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression not(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "!");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression number(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "number");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression numberFormat(Expression number, Expression locale, Expression currency, Expression minFractionDigits, Expression maxFractionDigits) {
            number.getClass();
            NumberFormatBuilder numberFormatBuilder = new NumberFormatBuilder(number);
            if (locale != null) {
                numberFormatBuilder.locale(locale);
            }
            if (currency != null) {
                numberFormatBuilder.currency(currency);
            }
            if (minFractionDigits != null) {
                numberFormatBuilder.minFractionDigits(minFractionDigits);
            }
            if (maxFractionDigits != null) {
                numberFormatBuilder.maxFractionDigits(maxFractionDigits);
            }
            return numberFormatBuilder.build();
        }

        public final Expression objectExpression(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "object");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression pi() {
            return new ExpressionBuilder("pi").build();
        }

        public final Expression pitch() {
            return new ExpressionBuilder("pitch").build();
        }

        public final Expression pow(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "^");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression product(double... dArr) {
            dArr.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(Marker.ANY_MARKER);
            for (double d14 : dArr) {
                expressionBuilder.addArgument(literal(d14));
            }
            return expressionBuilder.build();
        }

        public final Expression properties() {
            return new ExpressionBuilder("properties").build();
        }

        public final Expression random(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "random");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression rasterParticleSpeed() {
            return new ExpressionBuilder("raster-particle-speed").build();
        }

        public final Expression rasterValue() {
            return new ExpressionBuilder("raster-value").build();
        }

        public final Expression resolvedLocale(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "resolved-locale");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression rgb(double red, double green, double blue) {
            return new ExpressionBuilder("rgb").addArgument(literal(red)).addArgument(literal(green)).addArgument(literal(blue)).build();
        }

        public final Expression rgba(double red, double green, double blue, double alpha) {
            return new ExpressionBuilder("rgba").addArgument(literal(red)).addArgument(literal(green)).addArgument(literal(blue)).addArgument(literal(alpha)).build();
        }

        public final Expression round(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "round");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression sin(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "sin");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression skyRadialProgress() {
            return new ExpressionBuilder("sky-radial-progress").build();
        }

        public final Expression slice(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "slice");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression split(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "split");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression sqrt(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "sqrt");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression step(Expression input, Expression output, p<Expression, Expression>... stops) {
            input.getClass();
            output.getClass();
            stops.getClass();
            ExpressionBuilder expressionBuilderAddArgument = new ExpressionBuilder("step").addArgument(input).addArgument(output);
            for (p<Expression, Expression> pVar : stops) {
                expressionBuilderAddArgument.addArgument(pVar.f128594a);
                expressionBuilderAddArgument.addArgument(pVar.f128595b);
            }
            return expressionBuilderAddArgument.build();
        }

        public final Expression string(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "string");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression subtract(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "-");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression sum(double... dArr) {
            dArr.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(Marker.ANY_NON_NULL_MARKER);
            for (double d14 : dArr) {
                expressionBuilder.addArgument(literal(d14));
            }
            return expressionBuilder.build();
        }

        public final Expression switchCase(p<Expression, Expression>[] stops, Expression fallback) {
            stops.getClass();
            fallback.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("case");
            for (p<Expression, Expression> pVar : stops) {
                expressionBuilder.addArgument(pVar.f128594a);
                expressionBuilder.addArgument(pVar.f128595b);
            }
            expressionBuilder.addArgument(fallback);
            return expressionBuilder.build();
        }

        public final Expression tan(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "tan");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toBoolean(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-boolean");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toColor(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-color");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toHsla(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-hsla");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toNumber(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-number");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toRgba(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-rgba");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression toString(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "to-string");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression typeofExpression(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "typeof");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression upcase(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "upcase");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression varExpression(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "var");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression within(Geometry geometry) {
            geometry.getClass();
            ExpressionBuilder expressionBuilder = new ExpressionBuilder("within");
            Expected<String, Value> expectedFromJson = Value.fromJson(geometry.toJson());
            expectedFromJson.getClass();
            Value value = expectedFromJson.getValue();
            if (value == null) {
                com.mapbox.maps.p.n(expectedFromJson.getError());
                return null;
            }
            Object contents = value.getContents();
            contents.getClass();
            expressionBuilder.addArgument(new Expression((HashMap<String, Value>) contents));
            return expressionBuilder.build();
        }

        @MapboxExperimental
        public final Expression worldview(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "worldview");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression zoom() {
            return new ExpressionBuilder("zoom").build();
        }

        private Companion() {
        }

        public final Expression literal(long value) {
            return new Expression(value, (j) null);
        }

        public final Expression literal(boolean value) {
            return new Expression(value, (j) null);
        }

        public final Expression literal(double value) {
            return new Expression(value, (j) null);
        }

        public static /* synthetic */ Expression collator$default(Companion companion, boolean z14, boolean z15, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            if ((i14 & 2) != 0) {
                z15 = false;
            }
            return companion.collator(z14, z15, str);
        }

        public final Expression exponential(Expression expression) {
            expression.getClass();
            return new ExpressionBuilder("exponential").addArgument(expression).build();
        }

        public final Expression exponential(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "exponential");
        }

        public final Expression abs(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "abs");
        }

        public final Expression acos(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "acos");
        }

        public final Expression all(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, TtmlNode.COMBINE_ALL);
        }

        public final Expression any(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, Languages.ANY);
        }

        public final Expression array(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "array");
        }

        public final Expression asin(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "asin");
        }

        public final Expression at(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "at");
        }

        public final Expression atan(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "atan");
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final Expression m224boolean(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "boolean");
        }

        public final Expression ceil(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "ceil");
        }

        public final Expression coalesce(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "coalesce");
        }

        public final Expression config(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "config");
        }

        public final Expression cos(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "cos");
        }

        public final Expression division(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "/");
        }

        public final Expression downcase(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "downcase");
        }

        public final Expression eq(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "==");
        }

        public final Expression featureState(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "feature-state");
        }

        public final Expression floor(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "floor");
        }

        public final Expression get(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "get");
        }

        public final Expression gt(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, ">");
        }

        public final Expression gte(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, ">=");
        }

        public final Expression has(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "has");
        }

        public final Expression hsl(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "hsl");
        }

        public final Expression hsla(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "hsla");
        }

        public final Expression inExpression(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "in");
        }

        public final Expression indexOf(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "index-of");
        }

        public final Expression isSupportedScript(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "is-supported-script");
        }

        public final Expression length(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "length");
        }

        public final Expression letExpression(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "let");
        }

        public final Expression ln(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "ln");
        }

        public final Expression log10(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "log10");
        }

        public final Expression log2(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "log2");
        }

        public final Expression lt(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "<");
        }

        public final Expression lte(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "<=");
        }

        public final Expression measureLight(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "measure-light");
        }

        public final Expression mod(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "%");
        }

        public final Expression neq(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "!=");
        }

        public final Expression not(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "!");
        }

        public final Expression number(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "number");
        }

        public final Expression objectExpression(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "object");
        }

        public final Expression pow(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "^");
        }

        public final Expression random(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "random");
        }

        public final Expression resolvedLocale(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "resolved-locale");
        }

        public final Expression round(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "round");
        }

        public final Expression sin(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "sin");
        }

        public final Expression slice(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "slice");
        }

        public final Expression split(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "split");
        }

        public final Expression sqrt(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "sqrt");
        }

        public final Expression string(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "string");
        }

        public final Expression subtract(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "-");
        }

        public final Expression tan(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "tan");
        }

        public final Expression toBoolean(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-boolean");
        }

        public final Expression toColor(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-color");
        }

        public final Expression toHsla(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-hsla");
        }

        public final Expression toNumber(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-number");
        }

        public final Expression toRgba(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-rgba");
        }

        public final Expression toString(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "to-string");
        }

        public final Expression typeofExpression(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "typeof");
        }

        public final Expression upcase(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "upcase");
        }

        public final Expression varExpression(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "var");
        }

        public final Expression worldview(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "worldview");
        }

        public final Expression abs(double value) {
            return abs(literal(value));
        }

        public final Expression acos(double value) {
            return acos(literal(value));
        }

        public final Expression asin(double value) {
            return asin(literal(value));
        }

        public final Expression at(double index, Expression array) {
            array.getClass();
            return at(literal(index), array);
        }

        public final Expression atan(double value) {
            return atan(literal(value));
        }

        public final Expression ceil(double value) {
            return ceil(literal(value));
        }

        public final Expression cos(double value) {
            return cos(literal(value));
        }

        public final Expression division(double first, double second) {
            return division(literal(first), literal(second));
        }

        public final Expression downcase(String value) {
            value.getClass();
            return downcase(literal(value));
        }

        public final Expression floor(double value) {
            return floor(literal(value));
        }

        public final Expression get(String key) {
            key.getClass();
            return get(literal(key));
        }

        public final Expression has(String string, Expression expression) {
            string.getClass();
            expression.getClass();
            return has(literal(string), expression);
        }

        public final Expression inExpression(String needle, Expression haystack) {
            needle.getClass();
            haystack.getClass();
            return inExpression(literal(needle), haystack);
        }

        public final Expression isSupportedScript(String script) {
            script.getClass();
            return isSupportedScript(literal(script));
        }

        public final Expression length(String string) {
            string.getClass();
            return length(literal(string));
        }

        public final Expression ln(double value) {
            return ln(literal(value));
        }

        public final Expression log10(double value) {
            return log10(literal(value));
        }

        public final Expression log2(double value) {
            return log2(literal(value));
        }

        public final Expression mod(double first, double second) {
            return mod(literal(first), literal(second));
        }

        public final Expression not(boolean bool) {
            return not(literal(bool));
        }

        public final Expression pow(double first, double second) {
            return pow(literal(first), literal(second));
        }

        public final Expression round(double value) {
            return round(literal(value));
        }

        public final Expression sin(double value) {
            return sin(literal(value));
        }

        public final Expression sqrt(double value) {
            return sqrt(literal(value));
        }

        public final Expression subtract(double first, double second) {
            return subtract(literal(first), literal(second));
        }

        public final Expression tan(double value) {
            return tan(literal(value));
        }

        public final Expression upcase(String value) {
            value.getClass();
            return upcase(literal(value));
        }

        public final Expression varExpression(String value) {
            value.getClass();
            return varExpression(literal(value));
        }

        public final Expression get(String key, Expression expression) {
            key.getClass();
            expression.getClass();
            return get(literal(key), expression);
        }

        public final Expression has(String string) {
            string.getClass();
            return has(literal(string));
        }

        public final Expression inExpression(double needle, Expression haystack) {
            haystack.getClass();
            return inExpression(literal(needle), haystack);
        }

        public final Expression subtract(double value) {
            return subtract(literal(value));
        }

        public final Expression atInterpolated(l<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("at-interpolated");
            block.invoke(interpolatorBuilder);
            return interpolatorBuilder.build();
        }

        public final Expression interpolate(l<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            block.invoke(interpolatorBuilder);
            return interpolatorBuilder.build();
        }

        public final Expression collator(boolean caseSensitive, boolean diacriticSensitive, String locale) {
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        public final Expression concat(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "concat");
        }

        public final Expression max(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "max");
        }

        public final Expression min(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "min");
        }

        public final Expression product(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, Marker.ANY_MARKER);
        }

        public final Expression sum(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, Marker.ANY_NON_NULL_MARKER);
        }

        public final Expression collator(boolean caseSensitive, boolean diacriticSensitive, Locale locale) {
            locale.getClass();
            return new CollatorBuilder().caseSensitive(caseSensitive).diacriticSensitive(diacriticSensitive).locale(locale).build();
        }

        public final Expression concat(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "concat");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression max(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "max");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression min(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "min");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression numberFormat(Expression number, l<? super NumberFormatBuilder, Unit> block) {
            number.getClass();
            block.getClass();
            NumberFormatBuilder numberFormatBuilder = new NumberFormatBuilder(number);
            block.invoke(numberFormatBuilder);
            return numberFormatBuilder.build();
        }

        public final Expression product(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, Marker.ANY_MARKER);
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression sum(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, Marker.ANY_NON_NULL_MARKER);
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression numberFormat(double value, l<? super NumberFormatBuilder, Unit> block) {
            block.getClass();
            return numberFormat(literal(value), block);
        }

        public final Expression collator(l<? super CollatorBuilder, Unit> block) {
            block.getClass();
            CollatorBuilder collatorBuilder = new CollatorBuilder();
            block.invoke(collatorBuilder);
            return collatorBuilder.build();
        }

        public final Expression rgb(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "rgb");
        }

        public final Expression rgb(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "rgb");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression cubicBezier(Expression x14, Expression x15, Expression x16, Expression x17) {
            x14.getClass();
            x15.getClass();
            x16.getClass();
            x17.getClass();
            return new ExpressionBuilder("cubic-bezier").addArgument(x14).addArgument(x15).addArgument(x16).addArgument(x17).build();
        }

        public final Expression rgba(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "rgba");
        }

        public final Expression switchCase(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "case");
        }

        public final Expression cubicBezier(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "cubic-bezier");
        }

        public final Expression rgba(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "rgba");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression switchCase(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "case");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression exponentialInterpolator(double base, Expression input, p<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.exponential(base);
            interpolatorBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                interpolatorBuilder.addArgument(pVar.f128594a);
                interpolatorBuilder.addArgument(pVar.f128595b);
            }
            return interpolatorBuilder.build();
        }

        public final Expression match(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "match");
        }

        public final Expression match(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "match");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression step(l<? super ExpressionBuilder, Unit> block) {
            return f.k(block, "step");
        }

        public final Expression step(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "step");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression cubicBezierInterpolator(double x14, double y14, double x15, double y15, Expression input, p<Expression, Expression>... stops) {
            input.getClass();
            stops.getClass();
            InterpolatorBuilder interpolatorBuilder = new InterpolatorBuilder("interpolate");
            interpolatorBuilder.cubicBezier(x14, y14, x15, y15);
            interpolatorBuilder.addArgument(input);
            for (p<Expression, Expression> pVar : stops) {
                interpolatorBuilder.addArgument(pVar.f128594a);
                interpolatorBuilder.addArgument(pVar.f128595b);
            }
            return interpolatorBuilder.build();
        }

        public final Expression format(l<? super FormatBuilder, Unit> block) {
            block.getClass();
            FormatBuilder formatBuilder = new FormatBuilder();
            block.invoke(formatBuilder);
            return formatBuilder.build();
        }

        public final Expression literal$extension_style_release(List<? extends Object> value) {
            value.getClass();
            return new ExpressionBuilder("literal").addArgument(new Expression(value)).build();
        }

        @MapboxExperimental
        public final Expression image(Expression image, Map<String, Expression> options) {
            image.getClass();
            options.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            imageBuilder.addArgument(image);
            ArrayList arrayList = new ArrayList(options.size());
            for (Map.Entry<String, Expression> entry : options.entrySet()) {
                arrayList.add(new p(entry.getKey(), entry.getValue()));
            }
            Object[] array = arrayList.toArray(new p[0]);
            array.getClass();
            p[] pVarArr = (p[]) array;
            imageBuilder.imageOptions((p[]) Arrays.copyOf(pVarArr, pVarArr.length));
            return imageBuilder.build();
        }

        public final Expression image(Expression... expressions) {
            ExpressionBuilder expressionBuilderJ = f.j(expressions, "image");
            for (Expression expression : expressions) {
                expressionBuilderJ.addArgument(expression);
            }
            return expressionBuilderJ.build();
        }

        public final Expression image(l<? super ImageBuilder, Unit> block) {
            block.getClass();
            ImageBuilder imageBuilder = new ImageBuilder();
            block.invoke(imageBuilder);
            return imageBuilder.build();
        }
    }

    public static final Expression abs(Expression... expressionArr) {
        return INSTANCE.abs(expressionArr);
    }

    public static final Expression acos(Expression... expressionArr) {
        return INSTANCE.acos(expressionArr);
    }

    public static final Expression asin(Expression... expressionArr) {
        return INSTANCE.asin(expressionArr);
    }

    public static final Expression at(Expression... expressionArr) {
        return INSTANCE.at(expressionArr);
    }

    public static final Expression atan(Expression... expressionArr) {
        return INSTANCE.atan(expressionArr);
    }

    public static final Expression ceil(Expression... expressionArr) {
        return INSTANCE.ceil(expressionArr);
    }

    public static final Expression collator(boolean z14, boolean z15, String str) {
        return INSTANCE.collator(z14, z15, str);
    }

    public static final Expression concat(String... strArr) {
        return INSTANCE.concat(strArr);
    }

    public static final Expression cos(Expression... expressionArr) {
        return INSTANCE.cos(expressionArr);
    }

    public static final Expression division(Expression... expressionArr) {
        return INSTANCE.division(expressionArr);
    }

    public static final Expression downcase(Expression... expressionArr) {
        return INSTANCE.downcase(expressionArr);
    }

    public static final Expression exponential(Expression expression) {
        return INSTANCE.exponential(expression);
    }

    public static final Expression exponentialInterpolator(Expression expression, Expression expression2, p<Expression, Expression>... pVarArr) {
        return INSTANCE.exponentialInterpolator(expression, expression2, pVarArr);
    }

    public static final Expression floor(Expression... expressionArr) {
        return INSTANCE.floor(expressionArr);
    }

    public static final Expression get(String str, Expression expression) {
        return INSTANCE.get(str, expression);
    }

    public static final Expression has(String str, Expression expression) {
        return INSTANCE.has(str, expression);
    }

    @MapboxExperimental
    public static final Expression image(Expression expression, Map<String, Expression> map, Expression expression2, Map<String, Expression> map2) {
        return INSTANCE.image(expression, map, expression2, map2);
    }

    public static final Expression inExpression(String str, Expression expression) {
        return INSTANCE.inExpression(str, expression);
    }

    public static final Expression isSupportedScript(Expression... expressionArr) {
        return INSTANCE.isSupportedScript(expressionArr);
    }

    public static final Expression length(Expression... expressionArr) {
        return INSTANCE.length(expressionArr);
    }

    public static final Expression literal(long j8) {
        return INSTANCE.literal(j8);
    }

    public static final Expression ln(Expression... expressionArr) {
        return INSTANCE.ln(expressionArr);
    }

    public static final Expression log10(Expression... expressionArr) {
        return INSTANCE.log10(expressionArr);
    }

    public static final Expression log2(Expression... expressionArr) {
        return INSTANCE.log2(expressionArr);
    }

    public static final Expression match(Expression... expressionArr) {
        return INSTANCE.match(expressionArr);
    }

    public static final Expression max(Expression... expressionArr) {
        return INSTANCE.max(expressionArr);
    }

    public static final Expression min(Expression... expressionArr) {
        return INSTANCE.min(expressionArr);
    }

    public static final Expression mod(Expression... expressionArr) {
        return INSTANCE.mod(expressionArr);
    }

    public static final Expression not(Expression... expressionArr) {
        return INSTANCE.not(expressionArr);
    }

    public static final Expression pow(Expression... expressionArr) {
        return INSTANCE.pow(expressionArr);
    }

    public static final Expression product(Expression... expressionArr) {
        return INSTANCE.product(expressionArr);
    }

    public static final Expression round(Expression... expressionArr) {
        return INSTANCE.round(expressionArr);
    }

    public static final Expression sin(Expression... expressionArr) {
        return INSTANCE.sin(expressionArr);
    }

    public static final Expression sqrt(Expression... expressionArr) {
        return INSTANCE.sqrt(expressionArr);
    }

    public static final Expression step(Expression... expressionArr) {
        return INSTANCE.step(expressionArr);
    }

    public static final Expression subtract(double d14, double d15) {
        return INSTANCE.subtract(d14, d15);
    }

    public static final Expression sum(Expression... expressionArr) {
        return INSTANCE.sum(expressionArr);
    }

    public static final Expression switchCase(p<Expression, Expression>[] pVarArr, Expression expression) {
        return INSTANCE.switchCase(pVarArr, expression);
    }

    public static final Expression tan(Expression... expressionArr) {
        return INSTANCE.tan(expressionArr);
    }

    public static final Expression upcase(Expression... expressionArr) {
        return INSTANCE.upcase(expressionArr);
    }

    public static final Expression varExpression(Expression... expressionArr) {
        return INSTANCE.varExpression(expressionArr);
    }

    public static final Expression collator(boolean z14, boolean z15, Locale locale) {
        return INSTANCE.collator(z14, z15, locale);
    }

    public static final Expression get(Expression... expressionArr) {
        return INSTANCE.get(expressionArr);
    }

    public static final Expression has(Expression... expressionArr) {
        return INSTANCE.has(expressionArr);
    }

    public static final Expression image(Expression... expressionArr) {
        return INSTANCE.image(expressionArr);
    }

    public static final Expression inExpression(Expression... expressionArr) {
        return INSTANCE.inExpression(expressionArr);
    }

    public static final Expression literal(String str) {
        return INSTANCE.literal(str);
    }

    public static final Expression subtract(Expression... expressionArr) {
        return INSTANCE.subtract(expressionArr);
    }

    public static final Expression literal(boolean z14) {
        return INSTANCE.literal(z14);
    }

    public static final Expression rgb(Expression... expressionArr) {
        return INSTANCE.rgb(expressionArr);
    }

    public static final Expression cubicBezier(Expression expression, Expression expression2, Expression expression3, Expression expression4) {
        return INSTANCE.cubicBezier(expression, expression2, expression3, expression4);
    }

    public static final Expression rgba(Expression... expressionArr) {
        return INSTANCE.rgba(expressionArr);
    }

    public static final Expression numberFormat(double d14, l<? super NumberFormatBuilder, Unit> lVar) {
        return INSTANCE.numberFormat(d14, lVar);
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0005\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006J!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R0\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "<init>", "()V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "caseSensitive", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "", "(Z)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "diacriticSensitive", "locale", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "Ljava/util/Locale;", "(Ljava/util/Locale;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "build", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "options", "Ljava/util/HashMap;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CollatorBuilder extends Builder {
        private final HashMap<String, Value> options;

        public CollatorBuilder() {
            super("collator");
            this.options = new HashMap<>();
        }

        public static /* synthetic */ CollatorBuilder caseSensitive$default(CollatorBuilder collatorBuilder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return collatorBuilder.caseSensitive(z14);
        }

        public static /* synthetic */ CollatorBuilder diacriticSensitive$default(CollatorBuilder collatorBuilder, boolean z14, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                z14 = false;
            }
            return collatorBuilder.diacriticSensitive(z14);
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        public Expression build() {
            getArguments$extension_style_release().add(new Expression(this.options));
            return super.build();
        }

        public final CollatorBuilder caseSensitive(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("case-sensitive", Expression.INSTANCE.m224boolean(block));
            return this;
        }

        public final CollatorBuilder diacriticSensitive(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("diacritic-sensitive", Expression.INSTANCE.m224boolean(block));
            return this;
        }

        public final CollatorBuilder locale(Locale locale) {
            locale.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(locale.getLanguage());
            String country = locale.getCountry();
            country.getClass();
            if (country.length() > 0) {
                sb3.append("-");
                sb3.append(country);
            }
            this.options.put("locale", Expression.INSTANCE.literal(sb3.toString()));
            return this;
        }

        public final CollatorBuilder caseSensitive(Expression caseSensitive) {
            caseSensitive.getClass();
            this.options.put("case-sensitive", caseSensitive);
            return this;
        }

        public final CollatorBuilder diacriticSensitive(Expression diacriticSensitive) {
            diacriticSensitive.getClass();
            this.options.put("diacritic-sensitive", diacriticSensitive);
            return this;
        }

        public final CollatorBuilder caseSensitive(boolean caseSensitive) {
            this.options.put("case-sensitive", Expression.INSTANCE.literal(caseSensitive));
            return this;
        }

        public final CollatorBuilder diacriticSensitive(boolean diacriticSensitive) {
            this.options.put("diacritic-sensitive", Expression.INSTANCE.literal(diacriticSensitive));
            return this;
        }

        public final CollatorBuilder locale(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("locale", Expression.INSTANCE.string(block));
            return this;
        }

        public final CollatorBuilder locale(String locale) {
            locale.getClass();
            this.options.put("locale", Expression.INSTANCE.literal(locale));
            return this;
        }

        public final CollatorBuilder locale(Expression locale) {
            locale.getClass();
            this.options.put("locale", locale);
            return this;
        }
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0013\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0012\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0014\u0010\u000eJ!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0015\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0016\u0010\u000eJ!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0017\u0010\u000eJ!\u0010\u0018\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0018\u0010\u000eJ!\u0010\u0019\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0019\u0010\u000eJ!\u0010\u001a\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001b\u0010\u000eJ\r\u0010\u001c\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ!\u0010 \u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b \u0010\u000eJ!\u0010!\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b!\u0010\u000eJ!\u0010\"\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\"\u0010\u000eJ!\u0010#\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b#\u0010\u000eJ!\u0010$\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b$\u0010\u000eJ!\u0010&\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b&\u0010\u000eJ!\u0010'\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b'\u0010\u000eJ!\u0010(\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b(\u0010\u000eJ!\u0010)\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b)\u0010\u000eJ!\u0010*\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b*\u0010\u000eJ!\u0010+\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b+\u0010\u000eJ!\u0010-\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b-\u0010\u000eJ!\u0010.\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b.\u0010\u000eJ!\u0010/\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b/\u0010\u000eJ!\u00100\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b0\u0010\u000eJ\u0015\u00103\u001a\u00020\u00002\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0000¢\u0006\u0004\b5\u0010\u001dJ!\u00106\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b6\u0010\u000eJ\r\u00107\u001a\u00020\u0000¢\u0006\u0004\b7\u0010\u001dJ!\u00108\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b8\u0010\u000eJ!\u00109\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b9\u0010\u000eJ!\u0010;\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b;\u0010\u000eJ\r\u0010<\u001a\u00020\u0000¢\u0006\u0004\b<\u0010\u001dJ!\u0010=\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b=\u0010\u000eJ!\u0010>\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b>\u0010\u000eJ\r\u0010?\u001a\u00020\u0000¢\u0006\u0004\b?\u0010\u001dJ!\u0010@\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b@\u0010\u000eJ!\u0010A\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bA\u0010\u000eJ\r\u0010B\u001a\u00020\u0000¢\u0006\u0004\bB\u0010\u001dJ!\u0010D\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bD\u0010\u000eJ!\u0010E\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bE\u0010\u000eJ!\u0010F\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bF\u0010\u000eJ!\u0010G\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bG\u0010\u000eJ!\u0010H\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bH\u0010\u000eJ!\u0010I\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bI\u0010\u000eJ!\u0010J\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bJ\u0010\u000eJ\r\u0010K\u001a\u00020\u0000¢\u0006\u0004\bK\u0010\u001dJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020P¢\u0006\u0004\bN\u0010QJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020R¢\u0006\u0004\bN\u0010SJ\u0015\u0010N\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010TJ1\u0010N\u001a\u00020\u00002\"\u0010M\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V0Uj\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020V`W¢\u0006\u0004\bN\u0010XJ\u001b\u0010N\u001a\u00020\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00020V0Y¢\u0006\u0004\bN\u0010ZJ!\u0010[\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b[\u0010\u000eJ\r\u0010\\\u001a\u00020\u0000¢\u0006\u0004\b\\\u0010\u001dJ!\u0010]\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b]\u0010\u000eJ!\u0010^\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b^\u0010\u000eJ!\u0010_\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b_\u0010\u000eJ!\u0010`\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b`\u0010\u000eJ!\u0010a\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\ba\u0010\u000eJ!\u0010b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bb\u0010\u000eJ!\u0010c\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bc\u0010\u000eJ)\u0010f\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bf\u0010gJ!\u0010h\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bh\u0010\u000eJ\r\u0010i\u001a\u00020\u0000¢\u0006\u0004\bi\u0010\u001dJ\r\u0010j\u001a\u00020\u0000¢\u0006\u0004\bj\u0010\u001dJ\r\u0010k\u001a\u00020\u0000¢\u0006\u0004\bk\u0010\u001dJ!\u0010l\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bl\u0010\u000eJ\r\u0010m\u001a\u00020\u0000¢\u0006\u0004\bm\u0010\u001dJ\r\u0010n\u001a\u00020\u0000¢\u0006\u0004\bn\u0010\u001dJ!\u0010o\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bo\u0010\u000eJ!\u0010p\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bp\u0010\u000eJ!\u0010q\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bq\u0010\u000eJ!\u0010r\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\br\u0010\u000eJ!\u0010s\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bs\u0010\u000eJ\r\u0010t\u001a\u00020\u0000¢\u0006\u0004\bt\u0010\u001dJ!\u0010u\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bu\u0010\u000eJ!\u0010v\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bv\u0010\u000eJ!\u0010w\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bw\u0010\u000eJ!\u0010x\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bx\u0010\u000eJ!\u0010y\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\by\u0010\u000eJ!\u0010z\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\bz\u0010\u000eJ!\u0010{\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b{\u0010\u000eJ!\u0010|\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b|\u0010\u000eJ!\u0010}\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b}\u0010\u000eJ!\u0010~\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b~\u0010\u000eJ!\u0010\u007f\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u007f\u0010\u000eJ#\u0010\u0080\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\b\u0080\u0001\u0010\u000eJ#\u0010\u0081\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\b\u0081\u0001\u0010\u000eJ#\u0010\u0082\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\b\u0082\u0001\u0010\u000eJ#\u0010\u0083\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\b\u0083\u0001\u0010\u000eJ\u001a\u0010\u0086\u0001\u001a\u00020\u00002\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J%\u0010\u0088\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0005\b\u0088\u0001\u0010\u000eJ\u000f\u0010\u0089\u0001\u001a\u00020\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u001dJ)\u0010p\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020L2\u0007\u0010\u008b\u0001\u001a\u00020L2\u0007\u0010\u008c\u0001\u001a\u00020L¢\u0006\u0005\bp\u0010\u008d\u0001J2\u0010q\u001a\u00020\u00002\u0007\u0010\u008a\u0001\u001a\u00020L2\u0007\u0010\u008b\u0001\u001a\u00020L2\u0007\u0010\u008c\u0001\u001a\u00020L2\u0007\u0010\u008e\u0001\u001a\u00020L¢\u0006\u0005\bq\u0010\u008f\u0001J\u001c\u0010\u0092\u0001\u001a\u00020\u00002\n\b\u0001\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J#\u0010\u0094\u0001\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\b\u0094\u0001\u0010\u000eJ,\u0010\u0094\u0001\u001a\u00020\u00002\u0006\u0010d\u001a\u00020L2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J!\u0010\u0094\u0001\u001a\u00020\u00002\u0006\u0010d\u001a\u00020\u00062\u0007\u0010\u0096\u0001\u001a\u00020\u0006¢\u0006\u0006\b\u0094\u0001\u0010\u0097\u0001J!\u0010\u0094\u0001\u001a\u00020\u00002\u0006\u0010d\u001a\u00020L2\u0007\u0010\u0096\u0001\u001a\u00020L¢\u0006\u0006\b\u0094\u0001\u0010\u0098\u0001J&\u0010\u0094\u0001\u001a\u00020\u00002\u0014\u0010\u009a\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0099\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u009b\u0001J\u0016\u0010=\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\u0002¢\u0006\u0004\b=\u0010TJ\u001f\u0010=\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0005\b=\u0010\u009d\u0001J\u0016\u0010\u000f\u001a\u00020\u00002\u0007\u0010\u009e\u0001\u001a\u00020R¢\u0006\u0004\b\u000f\u0010SJ\u001f\u0010$\u001a\u00020\u00002\u0007\u0010\u009f\u0001\u001a\u00020L2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0005\b$\u0010 \u0001J \u0010E\u001a\u00020\u00002\u0007\u0010¡\u0001\u001a\u00020\u00022\u0007\u0010¢\u0001\u001a\u00020\u0006¢\u0006\u0005\bE\u0010\u009d\u0001J \u0010E\u001a\u00020\u00002\u0007\u0010¡\u0001\u001a\u00020L2\u0007\u0010¢\u0001\u001a\u00020\u0006¢\u0006\u0005\bE\u0010 \u0001J\u001e\u0010>\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0005\b>\u0010\u009d\u0001J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u0002¢\u0006\u0004\b>\u0010TJ\u0015\u0010I\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u0002¢\u0006\u0004\bI\u0010TJ\u001c\u0010\u0015\u001a\u00020\u00002\f\u0010¤\u0001\u001a\u00030£\u0001\"\u00020L¢\u0006\u0005\b\u0015\u0010¥\u0001J\u001c\u0010\u0011\u001a\u00020\u00002\f\u0010¤\u0001\u001a\u00030£\u0001\"\u00020L¢\u0006\u0005\b\u0011\u0010¥\u0001J \u0010\r\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020L2\u0007\u0010§\u0001\u001a\u00020L¢\u0006\u0005\b\r\u0010\u0098\u0001J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b\r\u0010OJ \u0010\u0012\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020L2\u0007\u0010§\u0001\u001a\u00020L¢\u0006\u0005\b\u0012\u0010\u0098\u0001J \u0010\u0013\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020L2\u0007\u0010§\u0001\u001a\u00020L¢\u0006\u0005\b\u0013\u0010\u0098\u0001J \u0010\u0014\u001a\u00020\u00002\u0007\u0010¦\u0001\u001a\u00020L2\u0007\u0010§\u0001\u001a\u00020L¢\u0006\u0005\b\u0014\u0010\u0098\u0001J\u0015\u0010w\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bw\u0010OJ\u0015\u0010]\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b]\u0010OJ\u0015\u0010[\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b[\u0010OJ\u0015\u0010^\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b^\u0010OJ\u0015\u0010s\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bs\u0010OJ\u0015\u00100\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b0\u0010OJ\u0015\u0010z\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bz\u0010OJ\u0015\u0010#\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b#\u0010OJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b\u001e\u0010OJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b'\u0010OJ\u001c\u0010b\u001a\u00020\u00002\f\u0010¨\u0001\u001a\u00030£\u0001\"\u00020L¢\u0006\u0005\bb\u0010¥\u0001J\u001c\u0010`\u001a\u00020\u00002\f\u0010¨\u0001\u001a\u00030£\u0001\"\u00020L¢\u0006\u0005\b`\u0010¥\u0001J\u0015\u0010r\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\br\u0010OJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b\u001b\u0010OJ\u0015\u0010*\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b*\u0010OJ\u0015\u00109\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L¢\u0006\u0004\b9\u0010OJ\u0016\u0010H\u001a\u00020\u00002\u0007\u0010©\u0001\u001a\u00020\u0002¢\u0006\u0004\bH\u0010TJ\u0017\u0010\u0082\u0001\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0005\b\u0082\u0001\u0010TJ\u0015\u00106\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\b6\u0010TJ$\u0010.\u001a\u00020\u00002\u0014\u0010¨\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020\u00020ª\u0001\"\u00020\u0002¢\u0006\u0005\b.\u0010«\u0001J*\u0010f\u001a\u00020\u00002\u0006\u0010M\u001a\u00020L2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0005\bf\u0010\u0095\u0001J\u0017\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0005\b\u0083\u0001\u0010T¨\u0006¬\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "", "operator", "<init>", "(Ljava/lang/String;)V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "expression", "addArgument", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "Lkotlin/Function1;", "", "block", "subtract", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "not", "neq", "product", "division", "mod", "pow", "sum", "lt", "lte", "eq", "gt", "gte", "abs", "accumulated", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "acos", "activeAnchor", TtmlNode.COMBINE_ALL, Languages.ANY, "array", "asin", "at", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "atInterpolated", "atan", "boolean", "switchCase", "ceil", "coalesce", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$CollatorBuilder;", "collator", "concat", "config", "cos", "Lcom/mapbox/geojson/GeoJson;", "geojson", "distance", "(Lcom/mapbox/geojson/GeoJson;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "distanceFromCenter", "downcase", JWKParameterNames.RSA_EXPONENT, "featureState", "floor", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "format", "geometryType", "get", "has", "heatmapDensity", "hsl", "hsla", TtmlNode.ATTR_ID, "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ImageBuilder;", "image", "inExpression", "indexOf", "interpolate", "isSupportedScript", "length", "letExpression", "lineProgress", "", "value", "literal", "(D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "(J)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "(Z)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "ln", "ln2", "log10", "log2", "match", "max", "measureLight", "min", "number", "input", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "numberFormat", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "objectExpression", "pi", "pitch", "properties", "random", "rasterParticleSpeed", "rasterValue", "resolvedLocale", "rgb", "rgba", "round", "sin", "skyRadialProgress", "slice", "split", "sqrt", "step", "string", "tan", "toBoolean", "toColor", "toHsla", "toNumber", "toRgba", "toString", "typeofExpression", "upcase", "varExpression", "Lcom/mapbox/geojson/Geometry;", "geometry", "within", "(Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "worldview", "zoom", "red", "green", "blue", "(DDD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "alpha", "(DDDD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "intColor", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "stop", "(DLe23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "output", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "(DD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "Lo13/p;", "pair", "(Lo13/p;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", Action.KEY_ATTRIBUTE, "(Ljava/lang/String;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "bool", FirebaseAnalytics.Param.INDEX, "(DLcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "needle", "haystack", "", "double", "([D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "first", "second", "values", StringLookupFactory.KEY_SCRIPT, "", "([Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class ExpressionBuilder extends Builder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpressionBuilder(String str) {
            super(str);
            str.getClass();
        }

        public final ExpressionBuilder abs(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.abs(block));
            return this;
        }

        public final ExpressionBuilder accumulated() {
            getArguments$extension_style_release().add(Expression.INSTANCE.accumulated());
            return this;
        }

        public final ExpressionBuilder acos(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.acos(block));
            return this;
        }

        @MapboxExperimental
        public final ExpressionBuilder activeAnchor() {
            getArguments$extension_style_release().add(Expression.INSTANCE.activeAnchor());
            return this;
        }

        public final ExpressionBuilder addArgument(Expression expression) {
            expression.getClass();
            getArguments$extension_style_release().add(expression);
            return this;
        }

        public final ExpressionBuilder all(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.all(block));
            return this;
        }

        public final ExpressionBuilder any(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.any(block));
            return this;
        }

        public final ExpressionBuilder array(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.array(block));
            return this;
        }

        public final ExpressionBuilder asin(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.asin(block));
            return this;
        }

        public final ExpressionBuilder at(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.at(block));
            return this;
        }

        public final ExpressionBuilder atInterpolated(l<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.atInterpolated(block));
            return this;
        }

        public final ExpressionBuilder atan(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.atan(block));
            return this;
        }

        /* JADX INFO: renamed from: boolean, reason: not valid java name */
        public final ExpressionBuilder m226boolean(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.m224boolean(block));
            return this;
        }

        public final ExpressionBuilder ceil(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.ceil(block));
            return this;
        }

        public final ExpressionBuilder coalesce(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.coalesce(block));
            return this;
        }

        public final ExpressionBuilder collator(l<? super CollatorBuilder, Unit> block) {
            block.getClass();
            ArrayList<Expression> arguments$extension_style_release = getArguments$extension_style_release();
            CollatorBuilder collatorBuilder = new CollatorBuilder();
            block.invoke(collatorBuilder);
            arguments$extension_style_release.add(collatorBuilder.build());
            return this;
        }

        public final ExpressionBuilder color(int intColor) {
            getArguments$extension_style_release().add(Expression.INSTANCE.color(intColor));
            return this;
        }

        public final ExpressionBuilder concat(String... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.concat((String[]) Arrays.copyOf(values, values.length)));
            return this;
        }

        public final ExpressionBuilder config(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.config(block));
            return this;
        }

        public final ExpressionBuilder cos(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cos(block));
            return this;
        }

        public final ExpressionBuilder distance(GeoJson geojson) {
            geojson.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.distance(geojson));
            return this;
        }

        public final ExpressionBuilder distanceFromCenter() {
            getArguments$extension_style_release().add(Expression.INSTANCE.distanceFromCenter());
            return this;
        }

        public final ExpressionBuilder division(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.division(block));
            return this;
        }

        public final ExpressionBuilder downcase(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.downcase(block));
            return this;
        }

        public final ExpressionBuilder e() {
            getArguments$extension_style_release().add(Expression.INSTANCE.e());
            return this;
        }

        public final ExpressionBuilder eq(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.eq(block));
            return this;
        }

        public final ExpressionBuilder featureState(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.featureState(block));
            return this;
        }

        public final ExpressionBuilder floor(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.floor(block));
            return this;
        }

        public final ExpressionBuilder format(l<? super FormatBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.format(block));
            return this;
        }

        public final ExpressionBuilder geometryType() {
            getArguments$extension_style_release().add(Expression.INSTANCE.geometryType());
            return this;
        }

        public final ExpressionBuilder get(String key, Expression expression) {
            key.getClass();
            expression.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(key, expression));
            return this;
        }

        public final ExpressionBuilder gt(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.gt(block));
            return this;
        }

        public final ExpressionBuilder gte(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.gte(block));
            return this;
        }

        public final ExpressionBuilder has(String string, Expression expression) {
            string.getClass();
            expression.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(string, expression));
            return this;
        }

        public final ExpressionBuilder heatmapDensity() {
            getArguments$extension_style_release().add(Expression.INSTANCE.heatmapDensity());
            return this;
        }

        public final ExpressionBuilder hsl(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.hsl(block));
            return this;
        }

        public final ExpressionBuilder hsla(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.hsla(block));
            return this;
        }

        public final ExpressionBuilder id() {
            getArguments$extension_style_release().add(Expression.INSTANCE.id());
            return this;
        }

        public final ExpressionBuilder image(l<? super ImageBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.image(block));
            return this;
        }

        public final ExpressionBuilder inExpression(String needle, Expression haystack) {
            needle.getClass();
            haystack.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(needle, haystack));
            return this;
        }

        public final ExpressionBuilder indexOf(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.indexOf(block));
            return this;
        }

        public final ExpressionBuilder interpolate(l<? super InterpolatorBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.interpolate(block));
            return this;
        }

        public final ExpressionBuilder isSupportedScript(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.isSupportedScript(block));
            return this;
        }

        public final ExpressionBuilder length(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.length(block));
            return this;
        }

        public final ExpressionBuilder letExpression(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.letExpression(block));
            return this;
        }

        public final ExpressionBuilder lineProgress() {
            getArguments$extension_style_release().add(Expression.INSTANCE.lineProgress());
            return this;
        }

        public final ExpressionBuilder literal(String value) {
            value.getClass();
            getArguments$extension_style_release().add(new Expression(value, (j) null));
            return this;
        }

        public final ExpressionBuilder ln(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.ln(block));
            return this;
        }

        public final ExpressionBuilder ln2() {
            getArguments$extension_style_release().add(Expression.INSTANCE.ln2());
            return this;
        }

        public final ExpressionBuilder log10(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.log10(block));
            return this;
        }

        public final ExpressionBuilder log2(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.log2(block));
            return this;
        }

        public final ExpressionBuilder lt(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.lt(block));
            return this;
        }

        public final ExpressionBuilder lte(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.lte(block));
            return this;
        }

        public final ExpressionBuilder match(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.match(block));
            return this;
        }

        public final ExpressionBuilder max(double... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.max(Arrays.copyOf(values, values.length)));
            return this;
        }

        public final ExpressionBuilder measureLight(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.measureLight(block));
            return this;
        }

        public final ExpressionBuilder min(double... values) {
            values.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.min(Arrays.copyOf(values, values.length)));
            return this;
        }

        public final ExpressionBuilder mod(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.mod(block));
            return this;
        }

        public final ExpressionBuilder neq(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.neq(block));
            return this;
        }

        public final ExpressionBuilder not(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.not(block));
            return this;
        }

        public final ExpressionBuilder number(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.number(block));
            return this;
        }

        public final ExpressionBuilder numberFormat(Expression input, l<? super NumberFormatBuilder, Unit> block) {
            input.getClass();
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.numberFormat(input, block));
            return this;
        }

        public final ExpressionBuilder objectExpression(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.objectExpression(block));
            return this;
        }

        public final ExpressionBuilder pi() {
            getArguments$extension_style_release().add(Expression.INSTANCE.pi());
            return this;
        }

        public final ExpressionBuilder pitch() {
            getArguments$extension_style_release().add(Expression.INSTANCE.pitch());
            return this;
        }

        public final ExpressionBuilder pow(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.pow(block));
            return this;
        }

        public final ExpressionBuilder product(double... dArr) {
            dArr.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.product(Arrays.copyOf(dArr, dArr.length)));
            return this;
        }

        public final ExpressionBuilder properties() {
            getArguments$extension_style_release().add(Expression.INSTANCE.properties());
            return this;
        }

        public final ExpressionBuilder random(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.random(block));
            return this;
        }

        public final ExpressionBuilder rasterParticleSpeed() {
            getArguments$extension_style_release().add(Expression.INSTANCE.rasterParticleSpeed());
            return this;
        }

        public final ExpressionBuilder rasterValue() {
            getArguments$extension_style_release().add(Expression.INSTANCE.rasterValue());
            return this;
        }

        public final ExpressionBuilder resolvedLocale(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.resolvedLocale(block));
            return this;
        }

        public final ExpressionBuilder rgb(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.rgb(block));
            return this;
        }

        public final ExpressionBuilder rgba(double red, double green, double blue, double alpha) {
            getArguments$extension_style_release().add(Expression.INSTANCE.rgba(red, green, blue, alpha));
            return this;
        }

        public final ExpressionBuilder round(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.round(block));
            return this;
        }

        public final ExpressionBuilder sin(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sin(block));
            return this;
        }

        public final ExpressionBuilder skyRadialProgress() {
            getArguments$extension_style_release().add(Expression.INSTANCE.skyRadialProgress());
            return this;
        }

        public final ExpressionBuilder slice(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.slice(block));
            return this;
        }

        public final ExpressionBuilder split(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.split(block));
            return this;
        }

        public final ExpressionBuilder sqrt(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sqrt(block));
            return this;
        }

        public final ExpressionBuilder step(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.step(block));
            return this;
        }

        public final ExpressionBuilder stop(p<Expression, Expression> pair) {
            pair.getClass();
            addArgument(pair.f128594a).addArgument(pair.f128595b);
            return this;
        }

        public final ExpressionBuilder string(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.string(block));
            return this;
        }

        public final ExpressionBuilder subtract(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(block));
            return this;
        }

        public final ExpressionBuilder sum(double... dArr) {
            dArr.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sum(Arrays.copyOf(dArr, dArr.length)));
            return this;
        }

        public final ExpressionBuilder switchCase(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.switchCase(block));
            return this;
        }

        public final ExpressionBuilder tan(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.tan(block));
            return this;
        }

        public final ExpressionBuilder toBoolean(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toBoolean(block));
            return this;
        }

        public final ExpressionBuilder toColor(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toColor(block));
            return this;
        }

        public final ExpressionBuilder toHsla(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toHsla(block));
            return this;
        }

        public final ExpressionBuilder toNumber(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toNumber(block));
            return this;
        }

        public final ExpressionBuilder toRgba(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toRgba(block));
            return this;
        }

        public final ExpressionBuilder toString(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.toString(block));
            return this;
        }

        public final ExpressionBuilder typeofExpression(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.typeofExpression(block));
            return this;
        }

        public final ExpressionBuilder upcase(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.upcase(block));
            return this;
        }

        public final ExpressionBuilder varExpression(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.varExpression(block));
            return this;
        }

        public final ExpressionBuilder within(Geometry geometry) {
            geometry.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.within(geometry));
            return this;
        }

        @MapboxExperimental
        public final ExpressionBuilder worldview(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.worldview(block));
            return this;
        }

        public final ExpressionBuilder zoom() {
            getArguments$extension_style_release().add(Expression.INSTANCE.zoom());
            return this;
        }

        public final ExpressionBuilder abs(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.abs(value));
            return this;
        }

        public final ExpressionBuilder acos(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.acos(value));
            return this;
        }

        public final ExpressionBuilder asin(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.asin(value));
            return this;
        }

        public final ExpressionBuilder at(double index, Expression array) {
            array.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.at(index, array));
            return this;
        }

        public final ExpressionBuilder atan(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.atan(value));
            return this;
        }

        public final ExpressionBuilder ceil(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.ceil(value));
            return this;
        }

        public final ExpressionBuilder cos(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.cos(value));
            return this;
        }

        public final ExpressionBuilder division(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.division(first, second));
            return this;
        }

        public final ExpressionBuilder downcase(String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.downcase(value));
            return this;
        }

        public final ExpressionBuilder floor(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.floor(value));
            return this;
        }

        public final ExpressionBuilder isSupportedScript(String script) {
            script.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.isSupportedScript(script));
            return this;
        }

        public final ExpressionBuilder length(String string) {
            string.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.length(string));
            return this;
        }

        public final ExpressionBuilder literal(long value) {
            getArguments$extension_style_release().add(new Expression(value, (j) null));
            return this;
        }

        public final ExpressionBuilder ln(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.ln(value));
            return this;
        }

        public final ExpressionBuilder log10(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.log10(value));
            return this;
        }

        public final ExpressionBuilder log2(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.log2(value));
            return this;
        }

        public final ExpressionBuilder mod(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.mod(first, second));
            return this;
        }

        public final ExpressionBuilder not(boolean bool) {
            getArguments$extension_style_release().add(Expression.INSTANCE.not(bool));
            return this;
        }

        public final ExpressionBuilder pow(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.pow(first, second));
            return this;
        }

        public final ExpressionBuilder rgb(double red, double green, double blue) {
            getArguments$extension_style_release().add(Expression.INSTANCE.rgb(red, green, blue));
            return this;
        }

        public final ExpressionBuilder round(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.round(value));
            return this;
        }

        public final ExpressionBuilder sin(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.sin(value));
            return this;
        }

        public final ExpressionBuilder sqrt(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.sqrt(value));
            return this;
        }

        public final ExpressionBuilder subtract(double first, double second) {
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(first, second));
            return this;
        }

        public final ExpressionBuilder tan(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.tan(value));
            return this;
        }

        public final ExpressionBuilder upcase(String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.upcase(value));
            return this;
        }

        public final ExpressionBuilder varExpression(String value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.varExpression(value));
            return this;
        }

        public final ExpressionBuilder literal(boolean value) {
            getArguments$extension_style_release().add(new Expression(value, (j) null));
            return this;
        }

        public final ExpressionBuilder subtract(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.subtract(value));
            return this;
        }

        public final ExpressionBuilder literal(double value) {
            getArguments$extension_style_release().add(new Expression(value, (j) null));
            return this;
        }

        public final ExpressionBuilder rgba(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.rgba(block));
            return this;
        }

        public final ExpressionBuilder stop(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            block.invoke(this);
            return this;
        }

        public final ExpressionBuilder get(String key) {
            key.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(key));
            return this;
        }

        public final ExpressionBuilder has(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(block));
            return this;
        }

        public final ExpressionBuilder inExpression(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(block));
            return this;
        }

        public final ExpressionBuilder literal(HashMap<String, Object> value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.literal$extension_style_release(value));
            return this;
        }

        public final ExpressionBuilder numberFormat(double value, l<? super NumberFormatBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.numberFormat(value, block));
            return this;
        }

        public final ExpressionBuilder stop(double input, l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            block.invoke(addArgument(Expression.INSTANCE.literal(input)));
            return this;
        }

        public final ExpressionBuilder get(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.get(block));
            return this;
        }

        public final ExpressionBuilder has(String string) {
            string.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.has(string));
            return this;
        }

        public final ExpressionBuilder inExpression(double needle, Expression haystack) {
            haystack.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.inExpression(needle, haystack));
            return this;
        }

        public final ExpressionBuilder literal(List<? extends Object> value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.literal$extension_style_release(value));
            return this;
        }

        public final ExpressionBuilder stop(Expression input, Expression output) {
            input.getClass();
            output.getClass();
            addArgument(input).addArgument(output);
            return this;
        }

        public final ExpressionBuilder max(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.max(block));
            return this;
        }

        public final ExpressionBuilder min(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.min(block));
            return this;
        }

        public final ExpressionBuilder product(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.product(block));
            return this;
        }

        public final ExpressionBuilder stop(double input, double output) {
            Companion companion = Expression.INSTANCE;
            addArgument(companion.literal(input)).addArgument(companion.literal(output));
            return this;
        }

        public final ExpressionBuilder sum(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.sum(block));
            return this;
        }

        public final ExpressionBuilder concat(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.concat(block));
            return this;
        }
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ!\u0010\u0007\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0007\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\tJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\tJ!\u0010\u0014\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0014\u0010\u000eJ\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R0\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", FirebaseAnalytics.Param.CONTENT, "<init>", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "", "fontScale", "(D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", "", GNCSOptOutSettingsFragment.EXTRA_TEXT_FONT, "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", GNCSOptOutSettingsFragment.EXTRA_TEXT_COLOR, "(I)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "build", "()Ljava/util/List;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "options", "Ljava/util/HashMap;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FormatSectionBuilder {
        private final Expression content;
        private final HashMap<String, Value> options;

        public FormatSectionBuilder(Expression expression) {
            expression.getClass();
            this.content = expression;
            this.options = new HashMap<>();
        }

        public final List<Expression> build() {
            return x.k(this.content, new Expression(this.options));
        }

        public final FormatSectionBuilder fontScale(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("font-scale", Expression.INSTANCE.number(block));
            return this;
        }

        public final FormatSectionBuilder textColor(String textColor) {
            textColor.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.literal(textColor));
            return this;
        }

        public final FormatSectionBuilder textFont(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            HashMap<String, Value> map = this.options;
            ExpressionBuilder expressionBuilderAddArgument = new ExpressionBuilder("array").addArgument(Expression.INSTANCE.literal("string"));
            block.invoke(expressionBuilderAddArgument);
            map.put("text-font", expressionBuilderAddArgument.build());
            return this;
        }

        public final FormatSectionBuilder fontScale(Expression fontScale) {
            fontScale.getClass();
            this.options.put("font-scale", fontScale);
            return this;
        }

        public final FormatSectionBuilder textColor(int textColor) {
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.color(textColor));
            return this;
        }

        public final FormatSectionBuilder fontScale(double fontScale) {
            this.options.put("font-scale", Expression.INSTANCE.literal(fontScale));
            return this;
        }

        public final FormatSectionBuilder textColor(Expression textColor) {
            textColor.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, textColor);
            return this;
        }

        public final FormatSectionBuilder textColor(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put(PointAnnotationOptions.PROPERTY_TEXT_COLOR, Expression.INSTANCE.toColor(block));
            return this;
        }

        public final FormatSectionBuilder textFont(Expression textFont) {
            textFont.getClass();
            this.options.put("text-font", textFont);
            return this;
        }

        public final FormatSectionBuilder textFont(List<String> textFont) {
            textFont.getClass();
            this.options.put("text-font", Expression.INSTANCE.literal$extension_style_release(textFont));
            return this;
        }
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0011J!\u0010\u0012\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0012\u0010\fJ-\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0017J-\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "operator", "<init>", "(Ljava/lang/String;)V", "linear", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "Lkotlin/Function1;", "", "block", "exponential", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "", "value", "(D)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "cubicBezier", "x1", "x2", "x3", "x4", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "(DDDD)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$InterpolatorBuilder;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class InterpolatorBuilder extends ExpressionBuilder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterpolatorBuilder(String str) {
            super(str);
            str.getClass();
        }

        public final InterpolatorBuilder cubicBezier(Expression x14, Expression x15, Expression x16, Expression x17) {
            x14.getClass();
            x15.getClass();
            x16.getClass();
            x17.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(x14, x15, x16, x17));
            return this;
        }

        public final InterpolatorBuilder exponential(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(block));
            return this;
        }

        public final InterpolatorBuilder linear() {
            getArguments$extension_style_release().add(Expression.INSTANCE.linear());
            return this;
        }

        public final InterpolatorBuilder exponential(double value) {
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(value));
            return this;
        }

        public final InterpolatorBuilder exponential(Expression value) {
            value.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.exponential(value));
            return this;
        }

        public final InterpolatorBuilder cubicBezier(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(block));
            return this;
        }

        public final InterpolatorBuilder cubicBezier(double x14, double x15, double x16, double x17) {
            getArguments$extension_style_release().add(Expression.INSTANCE.cubicBezier(x14, x15, x16, x17));
            return this;
        }
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ!\u0010\u0007\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0007\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\tJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\tJ!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R0\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0017j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "input", "<init>", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)V", "", "locale", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$ExpressionBuilder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", FirebaseAnalytics.Param.CURRENCY, "", "minFractionDigits", "(I)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$NumberFormatBuilder;", "maxFractionDigits", "build", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "Lkotlin/collections/HashMap;", "options", "Ljava/util/HashMap;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NumberFormatBuilder extends Builder {
        private final Expression input;
        private final HashMap<String, Value> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NumberFormatBuilder(Expression expression) {
            super("number-format");
            expression.getClass();
            this.input = expression;
            this.options = new HashMap<>();
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        public Expression build() {
            getArguments$extension_style_release().add(this.input);
            getArguments$extension_style_release().add(new Expression(this.options));
            return super.build();
        }

        public final NumberFormatBuilder currency(String currency) {
            currency.getClass();
            this.options.put(FirebaseAnalytics.Param.CURRENCY, Expression.INSTANCE.literal(currency));
            return this;
        }

        public final NumberFormatBuilder locale(String locale) {
            locale.getClass();
            this.options.put("locale", Expression.INSTANCE.literal(locale));
            return this;
        }

        public final NumberFormatBuilder maxFractionDigits(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("max-fraction-digits", Expression.INSTANCE.number(block));
            return this;
        }

        public final NumberFormatBuilder minFractionDigits(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("min-fraction-digits", Expression.INSTANCE.number(block));
            return this;
        }

        public final NumberFormatBuilder currency(Expression currency) {
            currency.getClass();
            this.options.put(FirebaseAnalytics.Param.CURRENCY, currency);
            return this;
        }

        public final NumberFormatBuilder locale(Expression locale) {
            locale.getClass();
            this.options.put("locale", locale);
            return this;
        }

        public final NumberFormatBuilder maxFractionDigits(Expression maxFractionDigits) {
            maxFractionDigits.getClass();
            this.options.put("max-fraction-digits", maxFractionDigits);
            return this;
        }

        public final NumberFormatBuilder minFractionDigits(Expression minFractionDigits) {
            minFractionDigits.getClass();
            this.options.put("min-fraction-digits", minFractionDigits);
            return this;
        }

        public final NumberFormatBuilder currency(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put(FirebaseAnalytics.Param.CURRENCY, Expression.INSTANCE.string(block));
            return this;
        }

        public final NumberFormatBuilder locale(l<? super ExpressionBuilder, Unit> block) {
            block.getClass();
            this.options.put("locale", Expression.INSTANCE.string(block));
            return this;
        }

        public final NumberFormatBuilder maxFractionDigits(int maxFractionDigits) {
            this.options.put("max-fraction-digits", Expression.INSTANCE.literal(maxFractionDigits));
            return this;
        }

        public final NumberFormatBuilder minFractionDigits(int minFractionDigits) {
            this.options.put("min-fraction-digits", Expression.INSTANCE.literal(minFractionDigits));
            return this;
        }
    }

    public static final Expression cubicBezierInterpolator(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, p<Expression, Expression>... pVarArr) {
        return INSTANCE.cubicBezierInterpolator(expression, expression2, expression3, expression4, expression5, pVarArr);
    }

    @ExpressionDsl
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0006\u0010\fJ\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ)\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0013j\b\u0012\u0004\u0012\u00020\u0004`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$Builder;", "<init>", "()V", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", FirebaseAnalytics.Param.CONTENT, "formatSection", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatSectionBuilder;", "", "block", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "", "text", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "(Ljava/lang/String;Le23/l;)Lcom/mapbox/maps/extension/style/expressions/generated/Expression$FormatBuilder;", "build", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sections", "Ljava/util/ArrayList;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FormatBuilder extends Builder {
        private final ArrayList<Expression> sections;

        public FormatBuilder() {
            super("format");
            this.sections = new ArrayList<>();
        }

        @Override // com.mapbox.maps.extension.style.expressions.generated.Expression.Builder
        public Expression build() {
            getArguments$extension_style_release().addAll(this.sections);
            return super.build();
        }

        public final FormatBuilder formatSection(String text, l<? super FormatSectionBuilder, Unit> block) {
            text.getClass();
            block.getClass();
            ArrayList<Expression> arrayList = this.sections;
            FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(Expression.INSTANCE.literal(text));
            block.invoke(formatSectionBuilder);
            arrayList.addAll(formatSectionBuilder.build());
            return this;
        }

        public final FormatBuilder formatSection(Expression content, l<? super FormatSectionBuilder, Unit> block) {
            content.getClass();
            block.getClass();
            ArrayList<Expression> arrayList = this.sections;
            FormatSectionBuilder formatSectionBuilder = new FormatSectionBuilder(content);
            block.invoke(formatSectionBuilder);
            arrayList.addAll(formatSectionBuilder.build());
            return this;
        }

        public final FormatBuilder formatSection(String text) {
            text.getClass();
            this.sections.addAll(new FormatSectionBuilder(Expression.INSTANCE.literal(text)).build());
            return this;
        }

        public final FormatBuilder formatSection(Expression content) {
            content.getClass();
            this.sections.addAll(new FormatSectionBuilder(content).build());
            return this;
        }
    }

    public /* synthetic */ Expression(long j8, j jVar) {
        this(j8);
    }

    public /* synthetic */ Expression(Builder builder, j jVar) {
        this(builder);
    }

    public /* synthetic */ Expression(String str, j jVar) {
        this(str);
    }

    public /* synthetic */ Expression(boolean z14, j jVar) {
        this(z14);
    }

    private Expression(Builder builder) {
        super(builder.contents$extension_style_release());
        if ("literal".equals(builder.getOperator())) {
            this.literalValue = ((Expression) h0.m0(builder.getArguments$extension_style_release())).literalValue;
        }
    }

    private Expression(double d14) {
        super(d14);
        this.literalValue = Double.valueOf(d14);
    }

    private Expression(long j8) {
        super(j8);
        this.literalValue = Long.valueOf(j8);
    }

    private Expression(boolean z14) {
        super(z14);
        this.literalValue = Boolean.valueOf(z14);
    }

    private Expression(String str) {
        super(str);
        this.literalValue = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Expression(HashMap<String, Value> map) {
        super(map);
        map.getClass();
        this.literalValue = map;
    }

    private Expression(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d14 : dArr) {
            arrayList.add(new Value(d14));
        }
        super((List<Value>) arrayList);
        this.literalValue = dArr;
    }

    private Expression(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j8 : jArr) {
            arrayList.add(new Value(j8));
        }
        super((List<Value>) arrayList);
        this.literalValue = jArr;
    }

    private Expression(boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z14 : zArr) {
            arrayList.add(new Value(z14));
        }
        super((List<Value>) arrayList);
        this.literalValue = zArr;
    }

    private Expression(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new Value(str));
        }
        super((List<Value>) arrayList);
        this.literalValue = strArr;
    }

    public /* synthetic */ Expression(double d14, j jVar) {
        this(d14);
    }

    public Expression(List<? extends Object> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TypeUtils.INSTANCE.wrapToValue(it.next()));
        }
        super((List<Value>) arrayList);
        this.literalValue = list;
    }
}
