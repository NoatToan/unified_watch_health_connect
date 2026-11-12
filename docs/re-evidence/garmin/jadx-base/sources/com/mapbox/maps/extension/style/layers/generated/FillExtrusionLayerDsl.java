package com.mapbox.maps.extension.style.layers.generated;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionBaseAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionHeightAlignment;
import com.mapbox.maps.extension.style.layers.properties.generated.FillExtrusionTranslateAnchor;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.LayersDsl;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.plugin.locationcomponent.model.AnimatableModel;
import e23.l;
import java.util.List;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@LayersDsl
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\rH'¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007H'¢\u0006\u0004\b\u0011\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\rH'¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b\u0015\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\rH'¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007H'¢\u0006\u0004\b\u001c\u0010\tJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u001d\u0010\u0016J#\u0010\u001d\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b\u001d\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0007H&¢\u0006\u0004\b\u001e\u0010\tJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u001f\u0010\u0016J#\u0010\u001f\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010 \u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\rH&¢\u0006\u0004\b \u0010\u000fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0007H&¢\u0006\u0004\b \u0010\tJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b!\u0010\u0016J#\u0010!\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b!\u0010\u001bJ\u0019\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\rH'¢\u0006\u0004\b\"\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\tJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b#\u0010\u0016J#\u0010#\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b#\u0010\u001bJ\u0019\u0010$\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\rH&¢\u0006\u0004\b$\u0010\u000fJ\u0017\u0010$\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b$\u0010\tJ\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b%\u0010\u0016J#\u0010%\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b%\u0010\u001bJ\u0019\u0010'\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020&H'¢\u0006\u0004\b'\u0010(J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010\tJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u0005J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0007H&¢\u0006\u0004\b)\u0010\tJ\u0019\u0010)\u001a\u00020\u00042\b\b\u0001\u0010)\u001a\u00020*H&¢\u0006\u0004\b)\u0010+J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b,\u0010\u0016J#\u0010,\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b,\u0010\u001bJ\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H'¢\u0006\u0004\b-\u0010\u0005J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\tJ\u0019\u0010.\u001a\u00020\u00042\b\b\u0002\u0010.\u001a\u00020\rH&¢\u0006\u0004\b.\u0010\u000fJ\u0017\u0010.\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0007H&¢\u0006\u0004\b.\u0010\tJ\u0019\u0010/\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\rH&¢\u0006\u0004\b/\u0010\u000fJ\u0017\u0010/\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0007H&¢\u0006\u0004\b/\u0010\tJ\u0017\u00100\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b0\u0010\u0016J#\u00100\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b0\u0010\u001bJ\u0019\u00101\u001a\u00020\u00042\b\b\u0002\u00101\u001a\u00020\u0002H'¢\u0006\u0004\b1\u0010\u0005J\u0017\u00101\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0007H'¢\u0006\u0004\b1\u0010\tJ\u0019\u00101\u001a\u00020\u00042\b\b\u0001\u00101\u001a\u00020*H'¢\u0006\u0004\b1\u0010+J\u0017\u00102\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b2\u0010\u0016J#\u00102\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0002H'¢\u0006\u0004\b3\u0010\u0005J\u0017\u00103\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H'¢\u0006\u0004\b3\u0010\tJ\u0019\u00104\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020\rH'¢\u0006\u0004\b4\u0010\u000fJ\u0017\u00104\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0007H'¢\u0006\u0004\b4\u0010\tJ\u0017\u00105\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b5\u0010\u0016J#\u00105\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b5\u0010\u001bJ\u0019\u00106\u001a\u00020\u00042\b\b\u0002\u00106\u001a\u00020\rH'¢\u0006\u0004\b6\u0010\u000fJ\u0017\u00106\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u0007H'¢\u0006\u0004\b6\u0010\tJ\u0017\u00107\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b7\u0010\u0016J#\u00107\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b7\u0010\u001bJ\u0019\u00108\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\rH'¢\u0006\u0004\b8\u0010\u000fJ\u0017\u00108\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0007H'¢\u0006\u0004\b8\u0010\tJ\u0017\u00109\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b9\u0010\u0016J#\u00109\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b9\u0010\u001bJ\u0019\u0010:\u001a\u00020\u00042\b\b\u0002\u0010:\u001a\u00020\rH'¢\u0006\u0004\b:\u0010\u000fJ\u0017\u0010:\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0007H'¢\u0006\u0004\b:\u0010\tJ\u0017\u0010;\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b;\u0010\u0016J#\u0010;\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\b;\u0010\u001bJ\u0019\u0010<\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020\rH&¢\u0006\u0004\b<\u0010\u000fJ\u0017\u0010<\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0007H&¢\u0006\u0004\b<\u0010\tJ\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b=\u0010\u0016J#\u0010=\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\b=\u0010\u001bJ\u0019\u0010?\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020>H'¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0007H'¢\u0006\u0004\b?\u0010\tJ\u0019\u0010A\u001a\u00020\u00042\b\b\u0002\u0010A\u001a\u00020\rH'¢\u0006\u0004\bA\u0010\u000fJ\u0017\u0010A\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u0007H'¢\u0006\u0004\bA\u0010\tJ\u0017\u0010B\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\bB\u0010\u0016J#\u0010B\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\bB\u0010\u001bJ\u0019\u0010C\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\rH&¢\u0006\u0004\bC\u0010\u000fJ\u0017\u0010C\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0007H&¢\u0006\u0004\bC\u0010\tJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bD\u0010\u0016J#\u0010D\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\bD\u0010\u001bJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0002H&¢\u0006\u0004\bE\u0010\u0005J\u0017\u0010E\u001a\u00020\u00042\u0006\u0010E\u001a\u00020\u0007H&¢\u0006\u0004\bE\u0010\tJ\u0019\u0010F\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\rH&¢\u0006\u0004\bF\u0010\u000fJ\u0017\u0010F\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0007H&¢\u0006\u0004\bF\u0010\tJ\u0019\u0010H\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020GH'¢\u0006\u0004\bH\u0010IJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u0007H'¢\u0006\u0004\bH\u0010\tJ\u001f\u0010K\u001a\u00020\u00042\u000e\b\u0002\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0JH&¢\u0006\u0004\bK\u0010LJ\u0017\u0010K\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u0007H&¢\u0006\u0004\bK\u0010\tJ\u0017\u0010M\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\bM\u0010\u0016J#\u0010M\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H&¢\u0006\u0004\bM\u0010\u001bJ\u0019\u0010O\u001a\u00020\u00042\b\b\u0002\u0010O\u001a\u00020NH&¢\u0006\u0004\bO\u0010PJ\u0017\u0010O\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0007H&¢\u0006\u0004\bO\u0010\tJ\u0019\u0010Q\u001a\u00020\u00042\b\b\u0002\u0010Q\u001a\u00020GH&¢\u0006\u0004\bQ\u0010IJ\u0017\u0010Q\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020\u0007H&¢\u0006\u0004\bQ\u0010\tJ\u0019\u0010R\u001a\u00020\u00042\b\b\u0002\u0010R\u001a\u00020\rH'¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010R\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0007H'¢\u0006\u0004\bR\u0010\tJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\bS\u0010\u0016J#\u0010S\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H'¢\u0006\u0004\bS\u0010\u001b¨\u0006T"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayerDsl;", "", "", "sourceLayer", "Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "slot", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "filter", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "maxZoom", "fillExtrusionEdgeRadius", "fillExtrusionAmbientOcclusionGroundAttenuation", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "fillExtrusionAmbientOcclusionGroundAttenuationTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionAmbientOcclusionGroundRadius", "fillExtrusionAmbientOcclusionGroundRadiusTransition", "fillExtrusionAmbientOcclusionIntensity", "fillExtrusionAmbientOcclusionIntensityTransition", "fillExtrusionAmbientOcclusionRadius", "fillExtrusionAmbientOcclusionRadiusTransition", "fillExtrusionAmbientOcclusionWallRadius", "fillExtrusionAmbientOcclusionWallRadiusTransition", "fillExtrusionBase", "fillExtrusionBaseTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;", "fillExtrusionBaseAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionBaseAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionColorTransition", "fillExtrusionColorUseTheme", "fillExtrusionCutoffFadeRange", "fillExtrusionEmissiveStrength", "fillExtrusionEmissiveStrengthTransition", "fillExtrusionFloodLightColor", "fillExtrusionFloodLightColorTransition", "fillExtrusionFloodLightColorUseTheme", "fillExtrusionFloodLightGroundAttenuation", "fillExtrusionFloodLightGroundAttenuationTransition", "fillExtrusionFloodLightGroundRadius", "fillExtrusionFloodLightGroundRadiusTransition", "fillExtrusionFloodLightIntensity", "fillExtrusionFloodLightIntensityTransition", "fillExtrusionFloodLightWallRadius", "fillExtrusionFloodLightWallRadiusTransition", "fillExtrusionHeight", "fillExtrusionHeightTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;", "fillExtrusionHeightAlignment", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionHeightAlignment;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionLineWidth", "fillExtrusionLineWidthTransition", "fillExtrusionOpacity", "fillExtrusionOpacityTransition", "fillExtrusionPattern", "fillExtrusionPatternCrossFade", "", "fillExtrusionRoundedRoof", "(Z)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "", "fillExtrusionTranslate", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionTranslateTransition", "Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;", "fillExtrusionTranslateAnchor", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/FillExtrusionTranslateAnchor;)Lcom/mapbox/maps/extension/style/layers/generated/FillExtrusionLayer;", "fillExtrusionVerticalGradient", "fillExtrusionVerticalScale", "fillExtrusionVerticalScaleTransition", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FillExtrusionLayerDsl {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionAmbientOcclusionGroundAttenuation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.69d;
            }
            return fillExtrusionLayerDsl.fillExtrusionAmbientOcclusionGroundAttenuation(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionAmbientOcclusionGroundRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 3.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionAmbientOcclusionGroundRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionAmbientOcclusionIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionAmbientOcclusionIntensity(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionAmbientOcclusionRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionAmbientOcclusionRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 3.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionAmbientOcclusionRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionAmbientOcclusionWallRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 3.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionAmbientOcclusionWallRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionBase$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionBase");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionBase(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionBaseAlignment$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, FillExtrusionBaseAlignment fillExtrusionBaseAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionBaseAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                fillExtrusionBaseAlignment = FillExtrusionBaseAlignment.TERRAIN;
            }
            return fillExtrusionLayerDsl.fillExtrusionBaseAlignment(fillExtrusionBaseAlignment);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionColor$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = "#000000";
            }
            return fillExtrusionLayerDsl.fillExtrusionColor(str);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionCutoffFadeRange$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionCutoffFadeRange");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionCutoffFadeRange(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionEdgeRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionEdgeRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionEdgeRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionEmissiveStrength$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionEmissiveStrength");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionEmissiveStrength(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionFloodLightColor$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, String str, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionFloodLightColor");
                return null;
            }
            if ((i14 & 1) != 0) {
                str = AnimatableModel.DEFAULT_COLOR;
            }
            return fillExtrusionLayerDsl.fillExtrusionFloodLightColor(str);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionFloodLightGroundAttenuation");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.69d;
            }
            return fillExtrusionLayerDsl.fillExtrusionFloodLightGroundAttenuation(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionFloodLightGroundRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionFloodLightGroundRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionFloodLightGroundRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionFloodLightIntensity$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionFloodLightIntensity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionFloodLightIntensity(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionFloodLightWallRadius$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionFloodLightWallRadius");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionFloodLightWallRadius(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionHeight$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionHeight");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionHeight(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionHeightAlignment$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, FillExtrusionHeightAlignment fillExtrusionHeightAlignment, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionHeightAlignment");
                return null;
            }
            if ((i14 & 1) != 0) {
                fillExtrusionHeightAlignment = FillExtrusionHeightAlignment.FLAT;
            }
            return fillExtrusionLayerDsl.fillExtrusionHeightAlignment(fillExtrusionHeightAlignment);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionLineWidth$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionLineWidth");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionLineWidth(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionOpacity$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionOpacity");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionOpacity(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionPatternCrossFade$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionPatternCrossFade");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 0.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionPatternCrossFade(d14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionRoundedRoof$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionRoundedRoof");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return fillExtrusionLayerDsl.fillExtrusionRoundedRoof(z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FillExtrusionLayer fillExtrusionTranslate$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, List list, int i14, Object obj) {
            Double dValueOf = Double.valueOf(0.0d);
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionTranslate");
                return null;
            }
            if ((i14 & 1) != 0) {
                list = x.k(dValueOf, dValueOf);
            }
            return fillExtrusionLayerDsl.fillExtrusionTranslate((List<Double>) list);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionTranslateAnchor$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionTranslateAnchor");
                return null;
            }
            if ((i14 & 1) != 0) {
                fillExtrusionTranslateAnchor = FillExtrusionTranslateAnchor.MAP;
            }
            return fillExtrusionLayerDsl.fillExtrusionTranslateAnchor(fillExtrusionTranslateAnchor);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionVerticalGradient$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, boolean z14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionVerticalGradient");
                return null;
            }
            if ((i14 & 1) != 0) {
                z14 = true;
            }
            return fillExtrusionLayerDsl.fillExtrusionVerticalGradient(z14);
        }

        public static /* synthetic */ FillExtrusionLayer fillExtrusionVerticalScale$default(FillExtrusionLayerDsl fillExtrusionLayerDsl, double d14, int i14, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: fillExtrusionVerticalScale");
                return null;
            }
            if ((i14 & 1) != 0) {
                d14 = 1.0d;
            }
            return fillExtrusionLayerDsl.fillExtrusionVerticalScale(d14);
        }
    }

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(double fillExtrusionAmbientOcclusionGroundAttenuation);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuation(Expression fillExtrusionAmbientOcclusionGroundAttenuation);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundAttenuationTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(double fillExtrusionAmbientOcclusionGroundRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadius(Expression fillExtrusionAmbientOcclusionGroundRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionGroundRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(double fillExtrusionAmbientOcclusionIntensity);

    FillExtrusionLayer fillExtrusionAmbientOcclusionIntensity(Expression fillExtrusionAmbientOcclusionIntensity);

    FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionAmbientOcclusionIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(double fillExtrusionAmbientOcclusionRadius);

    FillExtrusionLayer fillExtrusionAmbientOcclusionRadius(Expression fillExtrusionAmbientOcclusionRadius);

    FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionAmbientOcclusionRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(double fillExtrusionAmbientOcclusionWallRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadius(Expression fillExtrusionAmbientOcclusionWallRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionAmbientOcclusionWallRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionBase(double fillExtrusionBase);

    FillExtrusionLayer fillExtrusionBase(Expression fillExtrusionBase);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionBaseAlignment(Expression fillExtrusionBaseAlignment);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionBaseAlignment(FillExtrusionBaseAlignment fillExtrusionBaseAlignment);

    FillExtrusionLayer fillExtrusionBaseTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionBaseTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionColor(int fillExtrusionColor);

    FillExtrusionLayer fillExtrusionColor(Expression fillExtrusionColor);

    FillExtrusionLayer fillExtrusionColor(String fillExtrusionColor);

    FillExtrusionLayer fillExtrusionColorTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionColorUseTheme(Expression fillExtrusionColorUseTheme);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionColorUseTheme(String fillExtrusionColorUseTheme);

    FillExtrusionLayer fillExtrusionCutoffFadeRange(double fillExtrusionCutoffFadeRange);

    FillExtrusionLayer fillExtrusionCutoffFadeRange(Expression fillExtrusionCutoffFadeRange);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionEdgeRadius(double fillExtrusionEdgeRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionEdgeRadius(Expression fillExtrusionEdgeRadius);

    FillExtrusionLayer fillExtrusionEmissiveStrength(double fillExtrusionEmissiveStrength);

    FillExtrusionLayer fillExtrusionEmissiveStrength(Expression fillExtrusionEmissiveStrength);

    FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionEmissiveStrengthTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColor(int fillExtrusionFloodLightColor);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColor(Expression fillExtrusionFloodLightColor);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColor(String fillExtrusionFloodLightColor);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColorTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColorTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(Expression fillExtrusionFloodLightColorUseTheme);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightColorUseTheme(String fillExtrusionFloodLightColorUseTheme);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(double fillExtrusionFloodLightGroundAttenuation);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundAttenuation(Expression fillExtrusionFloodLightGroundAttenuation);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundAttenuationTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundRadius(double fillExtrusionFloodLightGroundRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundRadius(Expression fillExtrusionFloodLightGroundRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightGroundRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightIntensity(double fillExtrusionFloodLightIntensity);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightIntensity(Expression fillExtrusionFloodLightIntensity);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightIntensityTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightWallRadius(double fillExtrusionFloodLightWallRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightWallRadius(Expression fillExtrusionFloodLightWallRadius);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionFloodLightWallRadiusTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionHeight(double fillExtrusionHeight);

    FillExtrusionLayer fillExtrusionHeight(Expression fillExtrusionHeight);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionHeightAlignment(Expression fillExtrusionHeightAlignment);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionHeightAlignment(FillExtrusionHeightAlignment fillExtrusionHeightAlignment);

    FillExtrusionLayer fillExtrusionHeightTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionHeightTransition(l<? super StyleTransition.Builder, Unit> block);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionLineWidth(double fillExtrusionLineWidth);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionLineWidth(Expression fillExtrusionLineWidth);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionLineWidthTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionLineWidthTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionOpacity(double fillExtrusionOpacity);

    FillExtrusionLayer fillExtrusionOpacity(Expression fillExtrusionOpacity);

    FillExtrusionLayer fillExtrusionOpacityTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionOpacityTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionPattern(Expression fillExtrusionPattern);

    FillExtrusionLayer fillExtrusionPattern(String fillExtrusionPattern);

    FillExtrusionLayer fillExtrusionPatternCrossFade(double fillExtrusionPatternCrossFade);

    FillExtrusionLayer fillExtrusionPatternCrossFade(Expression fillExtrusionPatternCrossFade);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionRoundedRoof(Expression fillExtrusionRoundedRoof);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionRoundedRoof(boolean fillExtrusionRoundedRoof);

    FillExtrusionLayer fillExtrusionTranslate(Expression fillExtrusionTranslate);

    FillExtrusionLayer fillExtrusionTranslate(List<Double> fillExtrusionTranslate);

    FillExtrusionLayer fillExtrusionTranslateAnchor(Expression fillExtrusionTranslateAnchor);

    FillExtrusionLayer fillExtrusionTranslateAnchor(FillExtrusionTranslateAnchor fillExtrusionTranslateAnchor);

    FillExtrusionLayer fillExtrusionTranslateTransition(StyleTransition options);

    FillExtrusionLayer fillExtrusionTranslateTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer fillExtrusionVerticalGradient(Expression fillExtrusionVerticalGradient);

    FillExtrusionLayer fillExtrusionVerticalGradient(boolean fillExtrusionVerticalGradient);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionVerticalScale(double fillExtrusionVerticalScale);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionVerticalScale(Expression fillExtrusionVerticalScale);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionVerticalScaleTransition(StyleTransition options);

    @MapboxExperimental
    FillExtrusionLayer fillExtrusionVerticalScaleTransition(l<? super StyleTransition.Builder, Unit> block);

    FillExtrusionLayer filter(Expression filter);

    FillExtrusionLayer maxZoom(double maxZoom);

    FillExtrusionLayer minZoom(double minZoom);

    FillExtrusionLayer slot(String slot);

    FillExtrusionLayer sourceLayer(String sourceLayer);

    FillExtrusionLayer visibility(Expression visibility);

    FillExtrusionLayer visibility(Visibility visibility);
}
