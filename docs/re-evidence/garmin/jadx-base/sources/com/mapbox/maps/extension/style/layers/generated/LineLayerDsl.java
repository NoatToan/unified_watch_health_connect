package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineElevationReference;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.LineTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.LineWidthUnit;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\rH'¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H'¢\u0006\u0004\b\u0014\u0010\tJ\u0019\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0007H'¢\u0006\u0004\b\u0016\u0010\tJ\u0019\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b\u0019\u0010\tJ\u0019\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\rH&¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0007H&¢\u0006\u0004\b\u001b\u0010\tJ\u0019\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\rH&¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H&¢\u0006\u0004\b\u001c\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\rH&¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\tJ\u0019\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H'¢\u0006\u0004\b\u001f\u0010\tJ\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\rH'¢\u0006\u0004\b!\u0010\u000fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H'¢\u0006\u0004\b!\u0010\tJ\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\rH&¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H&¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J#\u0010%\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b%\u0010+J\u0019\u0010,\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0007H&¢\u0006\u0004\b,\u0010\tJ\u0019\u0010,\u001a\u00020\u00042\b\b\u0001\u0010,\u001a\u00020-H&¢\u0006\u0004\b,\u0010.J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b/\u0010&J#\u0010/\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0002H'¢\u0006\u0004\b0\u0010\u0005J\u0017\u00100\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0007H'¢\u0006\u0004\b0\u0010\tJ\u0019\u00101\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\rH&¢\u0006\u0004\b1\u0010\u000fJ\u0017\u00101\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0007H&¢\u0006\u0004\b1\u0010\tJ\u0017\u00102\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b2\u0010&J#\u00102\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b2\u0010+J\u0019\u00103\u001a\u00020\u00042\b\b\u0002\u00103\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u0005J\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H&¢\u0006\u0004\b3\u0010\tJ\u0019\u00103\u001a\u00020\u00042\b\b\u0001\u00103\u001a\u00020-H&¢\u0006\u0004\b3\u0010.J\u0017\u00104\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b4\u0010&J#\u00104\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b4\u0010+J\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0002H'¢\u0006\u0004\b5\u0010\u0005J\u0017\u00105\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0007H'¢\u0006\u0004\b5\u0010\tJ\u001d\u00107\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\r06H&¢\u0006\u0004\b7\u00108J\u0017\u00107\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0007H&¢\u0006\u0004\b7\u0010\tJ\u0019\u00109\u001a\u00020\u00042\b\b\u0002\u00109\u001a\u00020\rH&¢\u0006\u0004\b9\u0010\u000fJ\u0017\u00109\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0007H&¢\u0006\u0004\b9\u0010\tJ\u0017\u0010:\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b:\u0010&J#\u0010:\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b:\u0010+J\u0019\u0010;\u001a\u00020\u00042\b\b\u0002\u0010;\u001a\u00020\rH&¢\u0006\u0004\b;\u0010\u000fJ\u0017\u0010;\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0007H&¢\u0006\u0004\b;\u0010\tJ\u0017\u0010<\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b<\u0010&J#\u0010<\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b<\u0010+J\u0019\u0010=\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020\rH&¢\u0006\u0004\b=\u0010\u000fJ\u0017\u0010=\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0007H&¢\u0006\u0004\b=\u0010\tJ\u0017\u0010>\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b>\u0010&J#\u0010>\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\b>\u0010+J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0007H&¢\u0006\u0004\b?\u0010\tJ\u0017\u0010@\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0002H'¢\u0006\u0004\b@\u0010\u0005J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\u0007H'¢\u0006\u0004\b@\u0010\tJ\u0019\u0010A\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\rH&¢\u0006\u0004\bA\u0010\u000fJ\u0017\u0010A\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0007H&¢\u0006\u0004\bA\u0010\tJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\bB\u0010&J#\u0010B\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\bB\u0010+J\u0019\u0010C\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\rH&¢\u0006\u0004\bC\u0010\u000fJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0007H&¢\u0006\u0004\bC\u0010\tJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\bD\u0010&J#\u0010D\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\bD\u0010+J\u0019\u0010E\u001a\u00020\u00042\b\b\u0002\u0010E\u001a\u00020\rH&¢\u0006\u0004\bE\u0010\u000fJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0007H&¢\u0006\u0004\bE\u0010\tJ\u0017\u0010F\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\bF\u0010&J#\u0010F\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\bF\u0010+J\u0017\u0010G\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0002H&¢\u0006\u0004\bG\u0010\u0005J\u0017\u0010G\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u0007H&¢\u0006\u0004\bG\u0010\tJ\u0019\u0010H\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\rH&¢\u0006\u0004\bH\u0010\u000fJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0007H&¢\u0006\u0004\bH\u0010\tJ\u001f\u0010I\u001a\u00020\u00042\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020\r06H&¢\u0006\u0004\bI\u00108J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u0007H&¢\u0006\u0004\bI\u0010\tJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\bJ\u0010&J#\u0010J\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\bJ\u0010+J\u0019\u0010L\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020KH&¢\u0006\u0004\bL\u0010MJ\u0017\u0010L\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u0007H&¢\u0006\u0004\bL\u0010\tJ\u0019\u0010N\u001a\u00020\u00042\b\b\u0002\u0010N\u001a\u00020\u0002H'¢\u0006\u0004\bN\u0010\u0005J\u0017\u0010N\u001a\u00020\u00042\u0006\u0010N\u001a\u00020\u0007H'¢\u0006\u0004\bN\u0010\tJ\u0019\u0010N\u001a\u00020\u00042\b\b\u0001\u0010N\u001a\u00020-H'¢\u0006\u0004\bN\u0010.J\u0017\u0010O\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\bO\u0010&J#\u0010O\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H'¢\u0006\u0004\bO\u0010+J\u0017\u0010P\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0002H'¢\u0006\u0004\bP\u0010\u0005J\u0017\u0010P\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u0007H'¢\u0006\u0004\bP\u0010\tJ\u001f\u0010Q\u001a\u00020\u00042\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020\r06H'¢\u0006\u0004\bQ\u00108J\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0007H'¢\u0006\u0004\bQ\u0010\tJ\u001f\u0010R\u001a\u00020\u00042\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020\r06H&¢\u0006\u0004\bR\u00108J\u0017\u0010R\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0007H&¢\u0006\u0004\bR\u0010\tJ\u0019\u0010S\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020\rH&¢\u0006\u0004\bS\u0010\u000fJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0007H&¢\u0006\u0004\bS\u0010\tJ\u0017\u0010T\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\bT\u0010&J#\u0010T\u001a\u00020\u00042\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H&¢\u0006\u0004\bT\u0010+¨\u0006U"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LineLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "maxZoom", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;", "lineCap", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineCap;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineCrossSlope", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;", "lineElevationReference", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineElevationReference;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;", "lineJoin", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineJoin;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineMiterLimit", "lineRoundLimit", "lineSortKey", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;", "lineWidthUnit", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineWidthUnit;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineZOffset", "lineBlur", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "lineBlurTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineBorderColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineBorderColorTransition", "lineBorderColorUseTheme", "lineBorderWidth", "lineBorderWidthTransition", "lineColor", "lineColorTransition", "lineColorUseTheme", "", "lineDasharray", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineDepthOcclusionFactor", "lineDepthOcclusionFactorTransition", "lineEmissiveStrength", "lineEmissiveStrengthTransition", "lineGapWidth", "lineGapWidthTransition", "lineGradient", "lineGradientUseTheme", "lineOcclusionOpacity", "lineOcclusionOpacityTransition", "lineOffset", "lineOffsetTransition", "lineOpacity", "lineOpacityTransition", "linePattern", "linePatternCrossFade", "lineTranslate", "lineTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;", "lineTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/LineTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/LineLayer;", "lineTrimColor", "lineTrimColorTransition", "lineTrimColorUseTheme", "lineTrimFadeRange", "lineTrimOffset", "lineWidth", "lineWidthTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface LineLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ LineLayer lineBlur$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineBlur");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineBlur(d14);
        }

        public static /* synthetic */ LineLayer lineBorderColor$default(LineLayerDsl lineLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineBorderColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "rgba(0, 0, 0, 0)";
            }
            return lineLayerDsl.lineBorderColor(str);
        }

        public static /* synthetic */ LineLayer lineBorderWidth$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineBorderWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineBorderWidth(d14);
        }

        public static /* synthetic */ LineLayer lineCap$default(LineLayerDsl lineLayerDsl, LineCap lineCap, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineCap");
                return null;
            }
            if ((i14 & 1) != 0) {
                lineCap = LineCap.BUTT;
            }
            return lineLayerDsl.lineCap(lineCap);
        }

        public static /* synthetic */ LineLayer lineColor$default(LineLayerDsl lineLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return lineLayerDsl.lineColor(str);
        }

        public static /* synthetic */ LineLayer lineDepthOcclusionFactor$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineDepthOcclusionFactor");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return lineLayerDsl.lineDepthOcclusionFactor(d14);
        }

        public static /* synthetic */ LineLayer lineElevationReference$default(LineLayerDsl lineLayerDsl, LineElevationReference lineElevationReference, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineElevationReference");
                return null;
            }
            if ((i14 & 1) != 0) {
                lineElevationReference = LineElevationReference.NONE;
            }
            return lineLayerDsl.lineElevationReference(lineElevationReference);
        }

        public static /* synthetic */ LineLayer lineEmissiveStrength$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineEmissiveStrength(d14);
        }

        public static /* synthetic */ LineLayer lineGapWidth$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineGapWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineGapWidth(d14);
        }

        public static /* synthetic */ LineLayer lineJoin$default(LineLayerDsl lineLayerDsl, LineJoin lineJoin, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineJoin");
                return null;
            }
            if ((i14 & 1) != 0) {
                lineJoin = LineJoin.MITER;
            }
            return lineLayerDsl.lineJoin(lineJoin);
        }

        public static /* synthetic */ LineLayer lineMiterLimit$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineMiterLimit");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 2.0d;
            }
            return lineLayerDsl.lineMiterLimit(d14);
        }

        public static /* synthetic */ LineLayer lineOcclusionOpacity$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineOcclusionOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineOcclusionOpacity(d14);
        }

        public static /* synthetic */ LineLayer lineOffset$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineOffset(d14);
        }

        public static /* synthetic */ LineLayer lineOpacity$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return lineLayerDsl.lineOpacity(d14);
        }

        public static /* synthetic */ LineLayer linePatternCrossFade$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: linePatternCrossFade");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.linePatternCrossFade(d14);
        }

        public static /* synthetic */ LineLayer lineRoundLimit$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineRoundLimit");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.05d;
            }
            return lineLayerDsl.lineRoundLimit(d14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LineLayer lineTranslate$default(LineLayerDsl lineLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return lineLayerDsl.lineTranslate((List<Double>) list);
        }

        public static /* synthetic */ LineLayer lineTranslateAnchor$default(LineLayerDsl lineLayerDsl, LineTranslateAnchor lineTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                lineTranslateAnchor = LineTranslateAnchor.MAP;
            }
            return lineLayerDsl.lineTranslateAnchor(lineTranslateAnchor);
        }

        public static /* synthetic */ LineLayer lineTrimColor$default(LineLayerDsl lineLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineTrimColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "transparent";
            }
            return lineLayerDsl.lineTrimColor(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LineLayer lineTrimFadeRange$default(LineLayerDsl lineLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineTrimFadeRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return lineLayerDsl.lineTrimFadeRange((List<Double>) list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LineLayer lineTrimOffset$default(LineLayerDsl lineLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineTrimOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return lineLayerDsl.lineTrimOffset((List<Double>) list);
        }

        public static /* synthetic */ LineLayer lineWidth$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return lineLayerDsl.lineWidth(d14);
        }

        public static /* synthetic */ LineLayer lineWidthUnit$default(LineLayerDsl lineLayerDsl, LineWidthUnit lineWidthUnit, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineWidthUnit");
                return null;
            }
            if ((i14 & 1) != 0) {
                lineWidthUnit = LineWidthUnit.PIXELS;
            }
            return lineLayerDsl.lineWidthUnit(lineWidthUnit);
        }

        public static /* synthetic */ LineLayer lineZOffset$default(LineLayerDsl lineLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: lineZOffset");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return lineLayerDsl.lineZOffset(d14);
        }
    }

    LineLayer filter(Expression filter);

    LineLayer lineBlur(double lineBlur);

    LineLayer lineBlur(Expression lineBlur);

    LineLayer lineBlurTransition(StyleTransition options);

    LineLayer lineBlurTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineBorderColor(int lineBorderColor);

    LineLayer lineBorderColor(Expression lineBorderColor);

    LineLayer lineBorderColor(String lineBorderColor);

    LineLayer lineBorderColorTransition(StyleTransition options);

    LineLayer lineBorderColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineBorderColorUseTheme(Expression lineBorderColorUseTheme);

    @MapboxExperimental
    LineLayer lineBorderColorUseTheme(String lineBorderColorUseTheme);

    LineLayer lineBorderWidth(double lineBorderWidth);

    LineLayer lineBorderWidth(Expression lineBorderWidth);

    LineLayer lineBorderWidthTransition(StyleTransition options);

    LineLayer lineBorderWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineCap(Expression lineCap);

    LineLayer lineCap(LineCap lineCap);

    LineLayer lineColor(int lineColor);

    LineLayer lineColor(Expression lineColor);

    LineLayer lineColor(String lineColor);

    LineLayer lineColorTransition(StyleTransition options);

    LineLayer lineColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineColorUseTheme(Expression lineColorUseTheme);

    @MapboxExperimental
    LineLayer lineColorUseTheme(String lineColorUseTheme);

    @MapboxExperimental
    LineLayer lineCrossSlope(double lineCrossSlope);

    @MapboxExperimental
    LineLayer lineCrossSlope(Expression lineCrossSlope);

    LineLayer lineDasharray(Expression lineDasharray);

    LineLayer lineDasharray(List<Double> lineDasharray);

    LineLayer lineDepthOcclusionFactor(double lineDepthOcclusionFactor);

    LineLayer lineDepthOcclusionFactor(Expression lineDepthOcclusionFactor);

    LineLayer lineDepthOcclusionFactorTransition(StyleTransition options);

    LineLayer lineDepthOcclusionFactorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineElevationReference(Expression lineElevationReference);

    @MapboxExperimental
    LineLayer lineElevationReference(LineElevationReference lineElevationReference);

    LineLayer lineEmissiveStrength(double lineEmissiveStrength);

    LineLayer lineEmissiveStrength(Expression lineEmissiveStrength);

    LineLayer lineEmissiveStrengthTransition(StyleTransition options);

    LineLayer lineEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineGapWidth(double lineGapWidth);

    LineLayer lineGapWidth(Expression lineGapWidth);

    LineLayer lineGapWidthTransition(StyleTransition options);

    LineLayer lineGapWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineGradient(Expression lineGradient);

    @MapboxExperimental
    LineLayer lineGradientUseTheme(Expression lineGradientUseTheme);

    @MapboxExperimental
    LineLayer lineGradientUseTheme(String lineGradientUseTheme);

    LineLayer lineJoin(Expression lineJoin);

    LineLayer lineJoin(LineJoin lineJoin);

    LineLayer lineMiterLimit(double lineMiterLimit);

    LineLayer lineMiterLimit(Expression lineMiterLimit);

    LineLayer lineOcclusionOpacity(double lineOcclusionOpacity);

    LineLayer lineOcclusionOpacity(Expression lineOcclusionOpacity);

    LineLayer lineOcclusionOpacityTransition(StyleTransition options);

    LineLayer lineOcclusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineOffset(double lineOffset);

    LineLayer lineOffset(Expression lineOffset);

    LineLayer lineOffsetTransition(StyleTransition options);

    LineLayer lineOffsetTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer lineOpacity(double lineOpacity);

    LineLayer lineOpacity(Expression lineOpacity);

    LineLayer lineOpacityTransition(StyleTransition options);

    LineLayer lineOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    LineLayer linePattern(Expression linePattern);

    LineLayer linePattern(String linePattern);

    LineLayer linePatternCrossFade(double linePatternCrossFade);

    LineLayer linePatternCrossFade(Expression linePatternCrossFade);

    LineLayer lineRoundLimit(double lineRoundLimit);

    LineLayer lineRoundLimit(Expression lineRoundLimit);

    LineLayer lineSortKey(double lineSortKey);

    LineLayer lineSortKey(Expression lineSortKey);

    LineLayer lineTranslate(Expression lineTranslate);

    LineLayer lineTranslate(List<Double> lineTranslate);

    LineLayer lineTranslateAnchor(Expression lineTranslateAnchor);

    LineLayer lineTranslateAnchor(LineTranslateAnchor lineTranslateAnchor);

    LineLayer lineTranslateTransition(StyleTransition options);

    LineLayer lineTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineTrimColor(int lineTrimColor);

    @MapboxExperimental
    LineLayer lineTrimColor(Expression lineTrimColor);

    @MapboxExperimental
    LineLayer lineTrimColor(String lineTrimColor);

    @MapboxExperimental
    LineLayer lineTrimColorTransition(StyleTransition options);

    @MapboxExperimental
    LineLayer lineTrimColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineTrimColorUseTheme(Expression lineTrimColorUseTheme);

    @MapboxExperimental
    LineLayer lineTrimColorUseTheme(String lineTrimColorUseTheme);

    @MapboxExperimental
    LineLayer lineTrimFadeRange(Expression lineTrimFadeRange);

    @MapboxExperimental
    LineLayer lineTrimFadeRange(List<Double> lineTrimFadeRange);

    LineLayer lineTrimOffset(Expression lineTrimOffset);

    LineLayer lineTrimOffset(List<Double> lineTrimOffset);

    LineLayer lineWidth(double lineWidth);

    LineLayer lineWidth(Expression lineWidth);

    LineLayer lineWidthTransition(StyleTransition options);

    LineLayer lineWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    LineLayer lineWidthUnit(Expression lineWidthUnit);

    @MapboxExperimental
    LineLayer lineWidthUnit(LineWidthUnit lineWidthUnit);

    @MapboxExperimental
    LineLayer lineZOffset(double lineZOffset);

    @MapboxExperimental
    LineLayer lineZOffset(Expression lineZOffset);

    LineLayer maxZoom(double maxZoom);

    LineLayer minZoom(double minZoom);

    LineLayer slot(String slot);

    LineLayer sourceLayer(String sourceLayer);

    LineLayer visibility(Expression visibility);

    LineLayer visibility(Visibility visibility);
}
