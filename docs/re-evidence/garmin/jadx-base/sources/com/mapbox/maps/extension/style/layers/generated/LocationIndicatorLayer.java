package com.mapbox.maps.extension.style.layers.generated;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.Layer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\by\b\u0007\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0002¤\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b\u0015\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\bJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u0019\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J#\u0010\u001f\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003H\u0017¢\u0006\u0004\b \u0010\bJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\fH\u0017¢\u0006\u0004\b \u0010\rJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\bJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\rJ\u0019\u0010!\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010\u0016J#\u0010\"\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003H\u0017¢\u0006\u0004\b#\u0010\bJ\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\fH\u0017¢\u0006\u0004\b#\u0010\rJ\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\rJ\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0016J#\u0010%\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\bJ\u0017\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010\rJ\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010\u0016J#\u0010(\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010\bJ\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\rJ\u0019\u0010)\u001a\u00020\u00002\b\b\u0001\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u0016J#\u0010*\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b*\u0010\u001bJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0003H\u0017¢\u0006\u0004\b+\u0010\bJ\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\fH\u0017¢\u0006\u0004\b+\u0010\rJ\u001d\u0010-\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010-\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010\rJ\u0017\u0010/\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010\u0016J#\u0010/\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u0010J\u0017\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\rJ\u0017\u00101\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010\u0016J#\u00101\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b1\u0010\u001bJ\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u000eH\u0016¢\u0006\u0004\b2\u0010\u0010J\u0017\u00102\u001a\u00020\u00002\u0006\u00102\u001a\u00020\fH\u0016¢\u0006\u0004\b2\u0010\rJ\u001d\u00103\u001a\u00020\u00002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0,H\u0016¢\u0006\u0004\b3\u0010.J\u0017\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\rJ\u0017\u00104\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u0010\u0016J#\u00104\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b4\u0010\u001bJ\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0010J\u0017\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010\rJ\u0017\u00106\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u0010\u0016J#\u00106\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b6\u0010\u001bJ\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0010J\u0017\u00107\u001a\u00020\u00002\u0006\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\rJ\u0017\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b8\u0010\bJ\u0017\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u00020\fH\u0016¢\u0006\u0004\b8\u0010\rJ\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0010J\u0017\u00109\u001a\u00020\u00002\u0006\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010\rJ\u0017\u0010:\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u0010\u0016J#\u0010:\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b:\u0010\u001bJ\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0003H\u0016¢\u0006\u0004\b;\u0010\bJ\u0017\u0010;\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010\rJ\u0017\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b<\u0010\u0010J\u0017\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\fH\u0016¢\u0006\u0004\b<\u0010\rJ\u0017\u0010=\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b=\u0010\u0016J#\u0010=\u001a\u00020\u00002\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0016¢\u0006\u0004\b=\u0010\u001bJ\u000f\u0010@\u001a\u00020\u0003H\u0010¢\u0006\u0004\b>\u0010?R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010?R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010JR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0013\u0010N\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bM\u0010GR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bQ\u0010?R\u0013\u0010S\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bR\u0010GR\u0013\u0010V\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bW\u0010PR\u001c\u0010 \u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\bY\u0010Z\u001a\u0004\bX\u0010?R\u001c\u0010]\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010Z\u001a\u0004\b[\u0010GR\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b^\u0010?R\u0013\u0010`\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b_\u0010GR\u0013\u0010b\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bc\u0010PR\u001c\u0010#\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010Z\u001a\u0004\bd\u0010?R\u001c\u0010h\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bg\u0010Z\u001a\u0004\bf\u0010GR\u0013\u0010$\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bi\u0010JR\u0013\u0010k\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bj\u0010GR\u0013\u0010%\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bl\u0010PR\u0013\u0010&\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010?R\u0013\u0010o\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bn\u0010GR\u0013\u0010'\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bp\u0010JR\u0013\u0010r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bq\u0010GR\u0013\u0010(\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bs\u0010PR\u0013\u0010)\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bt\u0010?R\u0013\u0010v\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bu\u0010GR\u0013\u0010x\u001a\u0004\u0018\u00010\u001d8G¢\u0006\u0006\u001a\u0004\bw\u0010UR\u0013\u0010*\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\by\u0010PR\u001c\u0010+\u001a\u0004\u0018\u00010\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010Z\u001a\u0004\bz\u0010?R\u001c\u0010~\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b}\u0010Z\u001a\u0004\b|\u0010GR\u001a\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010GR\u0014\u0010/\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010PR\u0014\u00100\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010JR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010GR\u0014\u00101\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010PR\u0014\u00102\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010JR\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010GR\u001b\u00103\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010,8F¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0080\u0001R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010GR\u0014\u00104\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010PR\u0014\u00105\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010JR\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010GR\u0014\u00106\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010PR\u0014\u00107\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010JR\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010GR\u0014\u00108\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010?R\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010GR\u0014\u00109\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010JR\u0015\u0010\u009b\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010GR\u0014\u0010:\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010PR\u0014\u0010;\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010?R\u0015\u0010\u009f\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010GR\u0014\u0010<\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\b \u0001\u0010JR\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010GR\u0014\u0010=\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010P¨\u0006¥\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayerDsl;", "Lcom/mapbox/maps/extension/style/layers/Layer;", "", "layerId", "<init>", "(Ljava/lang/String;)V", "slot", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "visibility", "(Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "", "minZoom", "(D)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "maxZoom", "accuracyRadius", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "accuracyRadiusTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "accuracyRadiusBorderColor", "", "(I)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "accuracyRadiusBorderColorTransition", "accuracyRadiusBorderColorUseTheme", "accuracyRadiusColor", "accuracyRadiusColorTransition", "accuracyRadiusColorUseTheme", "bearing", "bearingTransition", "bearingImage", "bearingImageSize", "bearingImageSizeTransition", "emphasisCircleColor", "emphasisCircleColorTransition", "emphasisCircleColorUseTheme", "", "emphasisCircleGlowRange", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer;", "emphasisCircleGlowRangeTransition", "emphasisCircleRadius", "emphasisCircleRadiusTransition", "imagePitchDisplacement", FirebaseAnalytics.Param.LOCATION, "locationTransition", "locationIndicatorOpacity", "locationIndicatorOpacityTransition", "perspectiveCompensation", "shadowImage", "shadowImageSize", "shadowImageSizeTransition", "topImage", "topImageSize", "topImageSizeTransition", "getType$extension_style_release", "()Ljava/lang/String;", "getType", "Ljava/lang/String;", "getLayerId", "getSlot", "getVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getVisibilityAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "visibilityAsExpression", "getMinZoom", "()Ljava/lang/Double;", "getMaxZoom", "getAccuracyRadius", "getAccuracyRadiusAsExpression", "accuracyRadiusAsExpression", "getAccuracyRadiusTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getAccuracyRadiusBorderColor", "getAccuracyRadiusBorderColorAsExpression", "accuracyRadiusBorderColorAsExpression", "getAccuracyRadiusBorderColorAsColorInt", "()Ljava/lang/Integer;", "accuracyRadiusBorderColorAsColorInt", "getAccuracyRadiusBorderColorTransition", "getAccuracyRadiusBorderColorUseTheme", "getAccuracyRadiusBorderColorUseTheme$annotations", "()V", "getAccuracyRadiusBorderColorUseThemeAsExpression", "getAccuracyRadiusBorderColorUseThemeAsExpression$annotations", "accuracyRadiusBorderColorUseThemeAsExpression", "getAccuracyRadiusColor", "getAccuracyRadiusColorAsExpression", "accuracyRadiusColorAsExpression", "getAccuracyRadiusColorAsColorInt", "accuracyRadiusColorAsColorInt", "getAccuracyRadiusColorTransition", "getAccuracyRadiusColorUseTheme", "getAccuracyRadiusColorUseTheme$annotations", "getAccuracyRadiusColorUseThemeAsExpression", "getAccuracyRadiusColorUseThemeAsExpression$annotations", "accuracyRadiusColorUseThemeAsExpression", "getBearing", "getBearingAsExpression", "bearingAsExpression", "getBearingTransition", "getBearingImage", "getBearingImageAsExpression", "bearingImageAsExpression", "getBearingImageSize", "getBearingImageSizeAsExpression", "bearingImageSizeAsExpression", "getBearingImageSizeTransition", "getEmphasisCircleColor", "getEmphasisCircleColorAsExpression", "emphasisCircleColorAsExpression", "getEmphasisCircleColorAsColorInt", "emphasisCircleColorAsColorInt", "getEmphasisCircleColorTransition", "getEmphasisCircleColorUseTheme", "getEmphasisCircleColorUseTheme$annotations", "getEmphasisCircleColorUseThemeAsExpression", "getEmphasisCircleColorUseThemeAsExpression$annotations", "emphasisCircleColorUseThemeAsExpression", "getEmphasisCircleGlowRange", "()Ljava/util/List;", "getEmphasisCircleGlowRangeAsExpression", "emphasisCircleGlowRangeAsExpression", "getEmphasisCircleGlowRangeTransition", "getEmphasisCircleRadius", "getEmphasisCircleRadiusAsExpression", "emphasisCircleRadiusAsExpression", "getEmphasisCircleRadiusTransition", "getImagePitchDisplacement", "getImagePitchDisplacementAsExpression", "imagePitchDisplacementAsExpression", "getLocation", "getLocationAsExpression", "locationAsExpression", "getLocationTransition", "getLocationIndicatorOpacity", "getLocationIndicatorOpacityAsExpression", "locationIndicatorOpacityAsExpression", "getLocationIndicatorOpacityTransition", "getPerspectiveCompensation", "getPerspectiveCompensationAsExpression", "perspectiveCompensationAsExpression", "getShadowImage", "getShadowImageAsExpression", "shadowImageAsExpression", "getShadowImageSize", "getShadowImageSizeAsExpression", "shadowImageSizeAsExpression", "getShadowImageSizeTransition", "getTopImage", "getTopImageAsExpression", "topImageAsExpression", "getTopImageSize", "getTopImageSizeAsExpression", "topImageSizeAsExpression", "getTopImageSizeTransition", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LocationIndicatorLayer extends Layer implements LocationIndicatorLayerDsl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String layerId;

    public LocationIndicatorLayer(String str) {
        str.getClass();
        this.layerId = str;
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusBorderColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusBorderColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getAccuracyRadiusColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmphasisCircleColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getEmphasisCircleColorUseThemeAsExpression$annotations() {
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadius(double accuracyRadius) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius", Double.valueOf(accuracyRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusBorderColor(int accuracyRadiusBorderColor) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(accuracyRadiusBorderColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusBorderColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusBorderColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(String accuracyRadiusBorderColorUseTheme) {
        accuracyRadiusBorderColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color-use-theme", accuracyRadiusBorderColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusColor(int accuracyRadiusColor) {
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(accuracyRadiusColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer accuracyRadiusColorUseTheme(String accuracyRadiusColorUseTheme) {
        accuracyRadiusColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color-use-theme", accuracyRadiusColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        accuracyRadiusTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearing(double bearing) {
        setProperty$extension_style_release(new PropertyValue<>("bearing", Double.valueOf(bearing)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImage(String bearingImage) {
        bearingImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-image", bearingImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImageSize(double bearingImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("bearing-image-size", Double.valueOf(bearingImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImageSizeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        bearingImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        bearingTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleColor(int emphasisCircleColor) {
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(emphasisCircleColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer emphasisCircleColorUseTheme(String emphasisCircleColorUseTheme) {
        emphasisCircleColorUseTheme.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color-use-theme", emphasisCircleColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleGlowRange(List<Double> emphasisCircleGlowRange) {
        emphasisCircleGlowRange.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-glow-range", emphasisCircleGlowRange));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleGlowRangeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleGlowRangeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleRadius(double emphasisCircleRadius) {
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-radius", Double.valueOf(emphasisCircleRadius)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleRadiusTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        emphasisCircleRadiusTransition(builder.build());
        return this;
    }

    public final Double getAccuracyRadius() {
        return (Double) getPropertyValueWithType("accuracy-radius", Double.class);
    }

    public final Expression getAccuracyRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius");
    }

    public final String getAccuracyRadiusBorderColor() {
        Expression accuracyRadiusBorderColorAsExpression = getAccuracyRadiusBorderColorAsExpression();
        if (accuracyRadiusBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(accuracyRadiusBorderColorAsExpression);
        }
        return null;
    }

    public final Integer getAccuracyRadiusBorderColorAsColorInt() {
        Expression accuracyRadiusBorderColorAsExpression = getAccuracyRadiusBorderColorAsExpression();
        if (accuracyRadiusBorderColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(accuracyRadiusBorderColorAsExpression);
        }
        return null;
    }

    public final Expression getAccuracyRadiusBorderColorAsExpression() {
        return (Expression) getPropertyValueWithType("accuracy-radius-border-color", Expression.class);
    }

    public final StyleTransition getAccuracyRadiusBorderColorTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-border-color-transition", StyleTransition.class);
    }

    public final String getAccuracyRadiusBorderColorUseTheme() {
        return (String) getPropertyValueWithType("accuracy-radius-border-color-use-theme", String.class);
    }

    public final Expression getAccuracyRadiusBorderColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius-border-color-use-theme");
    }

    public final String getAccuracyRadiusColor() {
        Expression accuracyRadiusColorAsExpression = getAccuracyRadiusColorAsExpression();
        if (accuracyRadiusColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(accuracyRadiusColorAsExpression);
        }
        return null;
    }

    public final Integer getAccuracyRadiusColorAsColorInt() {
        Expression accuracyRadiusColorAsExpression = getAccuracyRadiusColorAsExpression();
        if (accuracyRadiusColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(accuracyRadiusColorAsExpression);
        }
        return null;
    }

    public final Expression getAccuracyRadiusColorAsExpression() {
        return (Expression) getPropertyValueWithType("accuracy-radius-color", Expression.class);
    }

    public final StyleTransition getAccuracyRadiusColorTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-color-transition", StyleTransition.class);
    }

    public final String getAccuracyRadiusColorUseTheme() {
        return (String) getPropertyValueWithType("accuracy-radius-color-use-theme", String.class);
    }

    public final Expression getAccuracyRadiusColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("accuracy-radius-color-use-theme");
    }

    public final StyleTransition getAccuracyRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("accuracy-radius-transition", StyleTransition.class);
    }

    public final Double getBearing() {
        return (Double) getPropertyValueWithType("bearing", Double.class);
    }

    public final Expression getBearingAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing");
    }

    public final String getBearingImage() {
        return (String) getPropertyValueWithType("bearing-image", String.class);
    }

    public final Expression getBearingImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing-image");
    }

    public final Double getBearingImageSize() {
        return (Double) getPropertyValueWithType("bearing-image-size", Double.class);
    }

    public final Expression getBearingImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("bearing-image-size");
    }

    public final StyleTransition getBearingImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("bearing-image-size-transition", StyleTransition.class);
    }

    public final StyleTransition getBearingTransition() {
        return (StyleTransition) getPropertyValueWithType("bearing-transition", StyleTransition.class);
    }

    public final String getEmphasisCircleColor() {
        Expression emphasisCircleColorAsExpression = getEmphasisCircleColorAsExpression();
        if (emphasisCircleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(emphasisCircleColorAsExpression);
        }
        return null;
    }

    public final Integer getEmphasisCircleColorAsColorInt() {
        Expression emphasisCircleColorAsExpression = getEmphasisCircleColorAsExpression();
        if (emphasisCircleColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(emphasisCircleColorAsExpression);
        }
        return null;
    }

    public final Expression getEmphasisCircleColorAsExpression() {
        return (Expression) getPropertyValueWithType("emphasis-circle-color", Expression.class);
    }

    public final StyleTransition getEmphasisCircleColorTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-color-transition", StyleTransition.class);
    }

    public final String getEmphasisCircleColorUseTheme() {
        return (String) getPropertyValueWithType("emphasis-circle-color-use-theme", String.class);
    }

    public final Expression getEmphasisCircleColorUseThemeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-color-use-theme");
    }

    public final List<Double> getEmphasisCircleGlowRange() {
        return (List) getPropertyValueWithType("emphasis-circle-glow-range", List.class);
    }

    public final Expression getEmphasisCircleGlowRangeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-glow-range");
    }

    public final StyleTransition getEmphasisCircleGlowRangeTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-glow-range-transition", StyleTransition.class);
    }

    public final Double getEmphasisCircleRadius() {
        return (Double) getPropertyValueWithType("emphasis-circle-radius", Double.class);
    }

    public final Expression getEmphasisCircleRadiusAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("emphasis-circle-radius");
    }

    public final StyleTransition getEmphasisCircleRadiusTransition() {
        return (StyleTransition) getPropertyValueWithType("emphasis-circle-radius-transition", StyleTransition.class);
    }

    public final Double getImagePitchDisplacement() {
        return (Double) getPropertyValueWithType("image-pitch-displacement", Double.class);
    }

    public final Expression getImagePitchDisplacementAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("image-pitch-displacement");
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getLayerId() {
        return this.layerId;
    }

    public final List<Double> getLocation() {
        return (List) getPropertyValueWithType(FirebaseAnalytics.Param.LOCATION, List.class);
    }

    public final Expression getLocationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release(FirebaseAnalytics.Param.LOCATION);
    }

    public final Double getLocationIndicatorOpacity() {
        return (Double) getPropertyValueWithType("location-indicator-opacity", Double.class);
    }

    public final Expression getLocationIndicatorOpacityAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("location-indicator-opacity");
    }

    public final StyleTransition getLocationIndicatorOpacityTransition() {
        return (StyleTransition) getPropertyValueWithType("location-indicator-opacity-transition", StyleTransition.class);
    }

    public final StyleTransition getLocationTransition() {
        return (StyleTransition) getPropertyValueWithType("location-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMaxZoom() {
        return (Double) getPropertyValueWithType("maxzoom", Double.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Double getMinZoom() {
        return (Double) getPropertyValueWithType("minzoom", Double.class);
    }

    public final Double getPerspectiveCompensation() {
        return (Double) getPropertyValueWithType("perspective-compensation", Double.class);
    }

    public final Expression getPerspectiveCompensationAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("perspective-compensation");
    }

    public final String getShadowImage() {
        return (String) getPropertyValueWithType("shadow-image", String.class);
    }

    public final Expression getShadowImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("shadow-image");
    }

    public final Double getShadowImageSize() {
        return (Double) getPropertyValueWithType("shadow-image-size", Double.class);
    }

    public final Expression getShadowImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("shadow-image-size");
    }

    public final StyleTransition getShadowImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("shadow-image-size-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getSlot() {
        return (String) getPropertyValueWithType("slot", String.class);
    }

    public final String getTopImage() {
        return (String) getPropertyValueWithType("top-image", String.class);
    }

    public final Expression getTopImageAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("top-image");
    }

    public final Double getTopImageSize() {
        return (Double) getPropertyValueWithType("top-image-size", Double.class);
    }

    public final Expression getTopImageSizeAsExpression() {
        return getPropertyValueAsExpressionOrLiteralExpression$extension_style_release("top-image-size");
    }

    public final StyleTransition getTopImageSizeTransition() {
        return (StyleTransition) getPropertyValueWithType("top-image-size-transition", StyleTransition.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public String getType$extension_style_release() {
        return "location-indicator";
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Visibility getVisibility() {
        String str = (String) getPropertyValueWithType("visibility", String.class);
        if (str == null) {
            return null;
        }
        Visibility.Companion companion = Visibility.INSTANCE;
        Locale locale = Locale.US;
        return companion.valueOf(p.h(locale, str, locale, '-', '_'));
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer
    public Expression getVisibilityAsExpression() {
        return (Expression) getPropertyValueWithType("visibility", Expression.class);
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer imagePitchDisplacement(double imagePitchDisplacement) {
        setProperty$extension_style_release(new PropertyValue<>("image-pitch-displacement", Double.valueOf(imagePitchDisplacement)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer location(List<Double> location) {
        location.getClass();
        setProperty$extension_style_release(new PropertyValue<>(FirebaseAnalytics.Param.LOCATION, location));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationIndicatorOpacity(double locationIndicatorOpacity) {
        setProperty$extension_style_release(new PropertyValue<>("location-indicator-opacity", Double.valueOf(locationIndicatorOpacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationIndicatorOpacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        locationIndicatorOpacityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        locationTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LocationIndicatorLayer maxZoom(double maxZoom) {
        setProperty$extension_style_release(new PropertyValue<>("maxzoom", Double.valueOf(maxZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LocationIndicatorLayer minZoom(double minZoom) {
        setProperty$extension_style_release(new PropertyValue<>("minzoom", Double.valueOf(minZoom)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer perspectiveCompensation(double perspectiveCompensation) {
        setProperty$extension_style_release(new PropertyValue<>("perspective-compensation", Double.valueOf(perspectiveCompensation)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImage(String shadowImage) {
        shadowImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-image", shadowImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImageSize(double shadowImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("shadow-image-size", Double.valueOf(shadowImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImageSizeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        shadowImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LocationIndicatorLayer slot(String slot) {
        slot.getClass();
        setProperty$extension_style_release(new PropertyValue<>("slot", slot));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImage(String topImage) {
        topImage.getClass();
        setProperty$extension_style_release(new PropertyValue<>("top-image", topImage));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImageSize(double topImageSize) {
        setProperty$extension_style_release(new PropertyValue<>("top-image-size", Double.valueOf(topImageSize)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImageSizeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        topImageSizeTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LocationIndicatorLayer visibility(Visibility visibility) {
        visibility.getClass();
        setProperty$extension_style_release(new PropertyValue<>("visibility", visibility));
        return this;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010 \n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u000eR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\nR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0013\u0010#\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0013\u0010%\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\nR\u0013\u0010-\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b.\u0010\u0018R\u0013\u0010/\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b0\u0010\u0006R\u0013\u00101\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b2\u0010\nR\u0013\u00103\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0013\u00105\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b6\u0010\nR\u0013\u00107\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b8\u0010\u0006R\u0013\u00109\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b:\u0010\nR\u0013\u0010;\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b<\u0010\u0018R\u0013\u0010=\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b>\u0010\u0018R\u0013\u0010?\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b@\u0010\u000eR\u0013\u0010A\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\bB\u0010\u0012R\u0013\u0010C\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bD\u0010\nR\u0013\u0010E\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bF\u0010\u0018R\u001c\u0010G\u001a\u0004\u0018\u00010\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0002\u001a\u0004\bI\u0010\u000eR\u001c\u0010J\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\nR\u0019\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010Q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bR\u0010\nR\u0013\u0010S\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bT\u0010\u0018R\u0013\u0010U\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u0013\u0010W\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bX\u0010\nR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bZ\u0010\u0018R\u0013\u0010[\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\\\u0010\u0006R\u0013\u0010]\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b^\u0010\nR\u0019\u0010_\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\b`\u0010PR\u0013\u0010a\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bb\u0010\nR\u0013\u0010c\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bd\u0010\u0006R\u0013\u0010e\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bf\u0010\nR\u0013\u0010g\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bh\u0010\u0018R\u0013\u0010i\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\bj\u0010\u0018R\u0013\u0010k\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bl\u0010\u0006R\u0013\u0010m\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bn\u0010\u0006R\u0013\u0010o\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bp\u0010\u0006R\u0013\u0010q\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\br\u0010\nR\u0013\u0010s\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bt\u0010\u000eR\u0013\u0010u\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bv\u0010\nR\u0013\u0010w\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010\u0006R\u0013\u0010y\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\bz\u0010\nR\u0013\u0010{\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b|\u0010\u0018R\u0013\u0010}\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b~\u0010\u000eR\u0014\u0010\u007f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\nR\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u0006R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010\nR\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u0018R\u0017\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u00018F¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/layers/generated/LocationIndicatorLayer$Companion;", "", "()V", "defaultAccuracyRadius", "", "getDefaultAccuracyRadius", "()Ljava/lang/Double;", "defaultAccuracyRadiusAsExpression", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getDefaultAccuracyRadiusAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "defaultAccuracyRadiusBorderColor", "", "getDefaultAccuracyRadiusBorderColor", "()Ljava/lang/String;", "defaultAccuracyRadiusBorderColorAsColorInt", "", "getDefaultAccuracyRadiusBorderColorAsColorInt", "()Ljava/lang/Integer;", "defaultAccuracyRadiusBorderColorAsExpression", "getDefaultAccuracyRadiusBorderColorAsExpression", "defaultAccuracyRadiusBorderColorTransition", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getDefaultAccuracyRadiusBorderColorTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "defaultAccuracyRadiusBorderColorUseTheme", "getDefaultAccuracyRadiusBorderColorUseTheme$annotations", "getDefaultAccuracyRadiusBorderColorUseTheme", "defaultAccuracyRadiusBorderColorUseThemeAsExpression", "getDefaultAccuracyRadiusBorderColorUseThemeAsExpression$annotations", "getDefaultAccuracyRadiusBorderColorUseThemeAsExpression", "defaultAccuracyRadiusColor", "getDefaultAccuracyRadiusColor", "defaultAccuracyRadiusColorAsColorInt", "getDefaultAccuracyRadiusColorAsColorInt", "defaultAccuracyRadiusColorAsExpression", "getDefaultAccuracyRadiusColorAsExpression", "defaultAccuracyRadiusColorTransition", "getDefaultAccuracyRadiusColorTransition", "defaultAccuracyRadiusColorUseTheme", "getDefaultAccuracyRadiusColorUseTheme$annotations", "getDefaultAccuracyRadiusColorUseTheme", "defaultAccuracyRadiusColorUseThemeAsExpression", "getDefaultAccuracyRadiusColorUseThemeAsExpression$annotations", "getDefaultAccuracyRadiusColorUseThemeAsExpression", "defaultAccuracyRadiusTransition", "getDefaultAccuracyRadiusTransition", "defaultBearing", "getDefaultBearing", "defaultBearingAsExpression", "getDefaultBearingAsExpression", "defaultBearingImage", "getDefaultBearingImage", "defaultBearingImageAsExpression", "getDefaultBearingImageAsExpression", "defaultBearingImageSize", "getDefaultBearingImageSize", "defaultBearingImageSizeAsExpression", "getDefaultBearingImageSizeAsExpression", "defaultBearingImageSizeTransition", "getDefaultBearingImageSizeTransition", "defaultBearingTransition", "getDefaultBearingTransition", "defaultEmphasisCircleColor", "getDefaultEmphasisCircleColor", "defaultEmphasisCircleColorAsColorInt", "getDefaultEmphasisCircleColorAsColorInt", "defaultEmphasisCircleColorAsExpression", "getDefaultEmphasisCircleColorAsExpression", "defaultEmphasisCircleColorTransition", "getDefaultEmphasisCircleColorTransition", "defaultEmphasisCircleColorUseTheme", "getDefaultEmphasisCircleColorUseTheme$annotations", "getDefaultEmphasisCircleColorUseTheme", "defaultEmphasisCircleColorUseThemeAsExpression", "getDefaultEmphasisCircleColorUseThemeAsExpression$annotations", "getDefaultEmphasisCircleColorUseThemeAsExpression", "defaultEmphasisCircleGlowRange", "", "getDefaultEmphasisCircleGlowRange", "()Ljava/util/List;", "defaultEmphasisCircleGlowRangeAsExpression", "getDefaultEmphasisCircleGlowRangeAsExpression", "defaultEmphasisCircleGlowRangeTransition", "getDefaultEmphasisCircleGlowRangeTransition", "defaultEmphasisCircleRadius", "getDefaultEmphasisCircleRadius", "defaultEmphasisCircleRadiusAsExpression", "getDefaultEmphasisCircleRadiusAsExpression", "defaultEmphasisCircleRadiusTransition", "getDefaultEmphasisCircleRadiusTransition", "defaultImagePitchDisplacement", "getDefaultImagePitchDisplacement", "defaultImagePitchDisplacementAsExpression", "getDefaultImagePitchDisplacementAsExpression", "defaultLocation", "getDefaultLocation", "defaultLocationAsExpression", "getDefaultLocationAsExpression", "defaultLocationIndicatorOpacity", "getDefaultLocationIndicatorOpacity", "defaultLocationIndicatorOpacityAsExpression", "getDefaultLocationIndicatorOpacityAsExpression", "defaultLocationIndicatorOpacityTransition", "getDefaultLocationIndicatorOpacityTransition", "defaultLocationTransition", "getDefaultLocationTransition", "defaultMaxZoom", "getDefaultMaxZoom", "defaultMinZoom", "getDefaultMinZoom", "defaultPerspectiveCompensation", "getDefaultPerspectiveCompensation", "defaultPerspectiveCompensationAsExpression", "getDefaultPerspectiveCompensationAsExpression", "defaultShadowImage", "getDefaultShadowImage", "defaultShadowImageAsExpression", "getDefaultShadowImageAsExpression", "defaultShadowImageSize", "getDefaultShadowImageSize", "defaultShadowImageSizeAsExpression", "getDefaultShadowImageSizeAsExpression", "defaultShadowImageSizeTransition", "getDefaultShadowImageSizeTransition", "defaultTopImage", "getDefaultTopImage", "defaultTopImageAsExpression", "getDefaultTopImageAsExpression", "defaultTopImageSize", "getDefaultTopImageSize", "defaultTopImageSizeAsExpression", "getDefaultTopImageSizeAsExpression", "defaultTopImageSizeTransition", "getDefaultTopImageSizeTransition", "defaultVisibility", "Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "getDefaultVisibility", "()Lcom/mapbox/maps/extension/style/layers/properties/generated/Visibility;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusBorderColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusBorderColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultAccuracyRadiusColorUseThemeAsExpression$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultEmphasisCircleColorUseTheme$annotations() {
        }

        @MapboxExperimental
        public static /* synthetic */ void getDefaultEmphasisCircleColorUseThemeAsExpression$annotations() {
        }

        public final Double getDefaultAccuracyRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultAccuracyRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultAccuracyRadius = getDefaultAccuracyRadius();
            if (defaultAccuracyRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultAccuracyRadius.doubleValue());
        }

        public final String getDefaultAccuracyRadiusBorderColor() {
            Expression defaultAccuracyRadiusBorderColorAsExpression = getDefaultAccuracyRadiusBorderColorAsExpression();
            if (defaultAccuracyRadiusBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultAccuracyRadiusBorderColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultAccuracyRadiusBorderColorAsColorInt() {
            Expression defaultAccuracyRadiusBorderColorAsExpression = getDefaultAccuracyRadiusBorderColorAsExpression();
            if (defaultAccuracyRadiusBorderColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultAccuracyRadiusBorderColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultAccuracyRadiusBorderColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultAccuracyRadiusBorderColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultAccuracyRadiusBorderColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultAccuracyRadiusBorderColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-border-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultAccuracyRadiusBorderColorUseTheme = getDefaultAccuracyRadiusBorderColorUseTheme();
            if (defaultAccuracyRadiusBorderColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultAccuracyRadiusBorderColorUseTheme);
            }
            return null;
        }

        public final String getDefaultAccuracyRadiusColor() {
            Expression defaultAccuracyRadiusColorAsExpression = getDefaultAccuracyRadiusColorAsExpression();
            if (defaultAccuracyRadiusColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultAccuracyRadiusColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultAccuracyRadiusColorAsColorInt() {
            Expression defaultAccuracyRadiusColorAsExpression = getDefaultAccuracyRadiusColorAsExpression();
            if (defaultAccuracyRadiusColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultAccuracyRadiusColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultAccuracyRadiusColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultAccuracyRadiusColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultAccuracyRadiusColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultAccuracyRadiusColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultAccuracyRadiusColorUseTheme = getDefaultAccuracyRadiusColorUseTheme();
            if (defaultAccuracyRadiusColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultAccuracyRadiusColorUseTheme);
            }
            return null;
        }

        public final StyleTransition getDefaultAccuracyRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "accuracy-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultBearing() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultBearingAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultBearing = getDefaultBearing();
            if (defaultBearing == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBearing.doubleValue());
        }

        public final String getDefaultBearingImage() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultBearingImageAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultBearingImage = getDefaultBearingImage();
            if (defaultBearingImage != null) {
                return Expression.INSTANCE.literal(defaultBearingImage);
            }
            return null;
        }

        public final Double getDefaultBearingImageSize() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultBearingImageSizeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultBearingImageSize = getDefaultBearingImageSize();
            if (defaultBearingImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultBearingImageSize.doubleValue());
        }

        public final StyleTransition getDefaultBearingImageSizeTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-image-size-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final StyleTransition getDefaultBearingTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "bearing-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultEmphasisCircleColor() {
            Expression defaultEmphasisCircleColorAsExpression = getDefaultEmphasisCircleColorAsExpression();
            if (defaultEmphasisCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorString(defaultEmphasisCircleColorAsExpression);
            }
            return null;
        }

        public final Integer getDefaultEmphasisCircleColorAsColorInt() {
            Expression defaultEmphasisCircleColorAsExpression = getDefaultEmphasisCircleColorAsExpression();
            if (defaultEmphasisCircleColorAsExpression != null) {
                return ColorUtils.INSTANCE.rgbaExpressionToColorInt(defaultEmphasisCircleColorAsExpression);
            }
            return null;
        }

        public final Expression getDefaultEmphasisCircleColorAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            return null;
        }

        public final StyleTransition getDefaultEmphasisCircleColorTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultEmphasisCircleColorUseTheme() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultEmphasisCircleColorUseThemeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-color-use-theme");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultEmphasisCircleColorUseTheme = getDefaultEmphasisCircleColorUseTheme();
            if (defaultEmphasisCircleColorUseTheme != null) {
                return Expression.INSTANCE.literal(defaultEmphasisCircleColorUseTheme);
            }
            return null;
        }

        public final List<Double> getDefaultEmphasisCircleGlowRange() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultEmphasisCircleGlowRangeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultEmphasisCircleGlowRange = getDefaultEmphasisCircleGlowRange();
            if (defaultEmphasisCircleGlowRange != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultEmphasisCircleGlowRange);
            }
            return null;
        }

        public final StyleTransition getDefaultEmphasisCircleGlowRangeTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-glow-range-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultEmphasisCircleRadius() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultEmphasisCircleRadiusAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultEmphasisCircleRadius = getDefaultEmphasisCircleRadius();
            if (defaultEmphasisCircleRadius == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultEmphasisCircleRadius.doubleValue());
        }

        public final StyleTransition getDefaultEmphasisCircleRadiusTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "emphasis-circle-radius-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultImagePitchDisplacement() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "image-pitch-displacement");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultImagePitchDisplacementAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "image-pitch-displacement");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultImagePitchDisplacement = getDefaultImagePitchDisplacement();
            if (defaultImagePitchDisplacement == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultImagePitchDisplacement.doubleValue());
        }

        public final List<Double> getDefaultLocation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", FirebaseAnalytics.Param.LOCATION);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, List.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (List) objUnwrap;
        }

        public final Expression getDefaultLocationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", FirebaseAnalytics.Param.LOCATION);
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            List<Double> defaultLocation = getDefaultLocation();
            if (defaultLocation != null) {
                return Expression.INSTANCE.literal$extension_style_release(defaultLocation);
            }
            return null;
        }

        public final Double getDefaultLocationIndicatorOpacity() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultLocationIndicatorOpacityAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultLocationIndicatorOpacity = getDefaultLocationIndicatorOpacity();
            if (defaultLocationIndicatorOpacity == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultLocationIndicatorOpacity.doubleValue());
        }

        public final StyleTransition getDefaultLocationIndicatorOpacityTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-indicator-opacity-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final StyleTransition getDefaultLocationTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "location-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Double getDefaultMaxZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "maxzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultMinZoom() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "minzoom");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Double getDefaultPerspectiveCompensation() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "perspective-compensation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultPerspectiveCompensationAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "perspective-compensation");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultPerspectiveCompensation = getDefaultPerspectiveCompensation();
            if (defaultPerspectiveCompensation == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultPerspectiveCompensation.doubleValue());
        }

        public final String getDefaultShadowImage() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultShadowImageAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultShadowImage = getDefaultShadowImage();
            if (defaultShadowImage != null) {
                return Expression.INSTANCE.literal(defaultShadowImage);
            }
            return null;
        }

        public final Double getDefaultShadowImageSize() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultShadowImageSizeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultShadowImageSize = getDefaultShadowImageSize();
            if (defaultShadowImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultShadowImageSize.doubleValue());
        }

        public final StyleTransition getDefaultShadowImageSizeTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "shadow-image-size-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final String getDefaultTopImage() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (String) objUnwrap;
        }

        public final Expression getDefaultTopImageAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            String defaultTopImage = getDefaultTopImage();
            if (defaultTopImage != null) {
                return Expression.INSTANCE.literal(defaultTopImage);
            }
            return null;
        }

        public final Double getDefaultTopImageSize() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Double.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (Double) objUnwrap;
        }

        public final Expression getDefaultTopImageSizeAsExpression() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, Expression.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            Expression expression = (Expression) objUnwrap;
            if (expression != null) {
                return expression;
            }
            Double defaultTopImageSize = getDefaultTopImageSize();
            if (defaultTopImageSize == null) {
                return null;
            }
            return Expression.INSTANCE.literal(defaultTopImageSize.doubleValue());
        }

        public final StyleTransition getDefaultTopImageSizeTransition() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "top-image-size-transition");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, StyleTransition.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            return (StyleTransition) objUnwrap;
        }

        public final Visibility getDefaultVisibility() {
            Object objUnwrap;
            StylePropertyValue styleLayerPropertyDefaultValue = StyleManager.getStyleLayerPropertyDefaultValue("location-indicator", "visibility");
            styleLayerPropertyDefaultValue.getClass();
            try {
                objUnwrap = TypeUtilsKt.unwrap(styleLayerPropertyDefaultValue, String.class);
            } catch (RuntimeException unused) {
                objUnwrap = null;
            }
            String str = (String) objUnwrap;
            if (str == null) {
                return null;
            }
            Visibility.Companion companion = Visibility.INSTANCE;
            Locale locale = Locale.US;
            return companion.valueOf(p.h(locale, str, locale, '-', '_'));
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer accuracyRadiusBorderColorUseTheme(Expression accuracyRadiusBorderColorUseTheme) {
        q2.q(accuracyRadiusBorderColorUseTheme, "accuracy-radius-border-color-use-theme", accuracyRadiusBorderColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer accuracyRadiusColorUseTheme(Expression accuracyRadiusColorUseTheme) {
        q2.q(accuracyRadiusColorUseTheme, "accuracy-radius-color-use-theme", accuracyRadiusColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImage(Expression bearingImage) {
        q2.q(bearingImage, "bearing-image", bearingImage, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    @MapboxExperimental
    public LocationIndicatorLayer emphasisCircleColorUseTheme(Expression emphasisCircleColorUseTheme) {
        q2.q(emphasisCircleColorUseTheme, "emphasis-circle-color-use-theme", emphasisCircleColorUseTheme, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleGlowRange(Expression emphasisCircleGlowRange) {
        q2.q(emphasisCircleGlowRange, "emphasis-circle-glow-range", emphasisCircleGlowRange, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer location(Expression location) {
        q2.q(location, FirebaseAnalytics.Param.LOCATION, location, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImage(Expression shadowImage) {
        q2.q(shadowImage, "shadow-image", shadowImage, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImage(Expression topImage) {
        q2.q(topImage, "top-image", topImage, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadius(Expression accuracyRadius) {
        q2.q(accuracyRadius, "accuracy-radius", accuracyRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearing(Expression bearing) {
        q2.q(bearing, "bearing", bearing, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImageSize(Expression bearingImageSize) {
        q2.q(bearingImageSize, "bearing-image-size", bearingImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleRadius(Expression emphasisCircleRadius) {
        q2.q(emphasisCircleRadius, "emphasis-circle-radius", emphasisCircleRadius, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer imagePitchDisplacement(Expression imagePitchDisplacement) {
        q2.q(imagePitchDisplacement, "image-pitch-displacement", imagePitchDisplacement, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationIndicatorOpacity(Expression locationIndicatorOpacity) {
        q2.q(locationIndicatorOpacity, "location-indicator-opacity", locationIndicatorOpacity, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer perspectiveCompensation(Expression perspectiveCompensation) {
        q2.q(perspectiveCompensation, "perspective-compensation", perspectiveCompensation, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImageSize(Expression shadowImageSize) {
        q2.q(shadowImageSize, "shadow-image-size", shadowImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImageSize(Expression topImageSize) {
        q2.q(topImageSize, "top-image-size", topImageSize, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.Layer, com.mapbox.maps.extension.style.layers.CustomLayerDsl
    public LocationIndicatorLayer visibility(Expression visibility) {
        q2.q(visibility, "visibility", visibility, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusBorderColor(Expression accuracyRadiusBorderColor) {
        q2.q(accuracyRadiusBorderColor, "accuracy-radius-border-color", accuracyRadiusBorderColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusColor(Expression accuracyRadiusColor) {
        q2.q(accuracyRadiusColor, "accuracy-radius-color", accuracyRadiusColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleColor(Expression emphasisCircleColor) {
        q2.q(emphasisCircleColor, "emphasis-circle-color", emphasisCircleColor, this);
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusBorderColor(String accuracyRadiusBorderColor) {
        accuracyRadiusBorderColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color", accuracyRadiusBorderColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusBorderColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-border-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusColor(String accuracyRadiusColor) {
        accuracyRadiusColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color", accuracyRadiusColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer accuracyRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("accuracy-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingImageSizeTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-image-size-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer bearingTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("bearing-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleColor(String emphasisCircleColor) {
        emphasisCircleColor.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color", emphasisCircleColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleColorTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleGlowRangeTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-glow-range-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer emphasisCircleRadiusTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("emphasis-circle-radius-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationIndicatorOpacityTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("location-indicator-opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer locationTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("location-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer shadowImageSizeTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("shadow-image-size-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.layers.generated.LocationIndicatorLayerDsl
    public LocationIndicatorLayer topImageSizeTransition(StyleTransition options) {
        options.getClass();
        setProperty$extension_style_release(new PropertyValue<>("top-image-size-transition", options));
        return this;
    }
}
