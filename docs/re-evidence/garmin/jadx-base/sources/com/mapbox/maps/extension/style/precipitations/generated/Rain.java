package com.mapbox.maps.extension.style.precipitations.generated;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import com.mapbox.maps.extension.style.utils.ColorUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.p;
import e23.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b`\b\u0007\u0018\u0000 ¦\u00012\u00020\u00012\u00020\u0002:\u0002¦\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\n\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0006\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0014\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\u000bJ#\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001a\u0010\u000bJ#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0019\u0010\u0012J\u001d\u0010\u001c\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001e\u0010\u000bJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\u001e\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001c\u0010\u0012J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b \u0010\u000bJ#\u0010 \u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b \u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001f\u0010\u0012J\u001d\u0010!\u001a\u00020\u00002\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0017¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\"\u0010\u000bJ#\u0010\"\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0011H\u0017¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0005H\u0017¢\u0006\u0004\b#\u0010\u0007J\u0017\u0010$\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b$\u0010\u000bJ#\u0010$\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H\u0017¢\u0006\u0004\b#\u0010\u0012J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0005H\u0017¢\u0006\u0004\b%\u0010\u0007J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b&\u0010\u000bJ#\u0010&\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b&\u0010\u0010J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0011H\u0017¢\u0006\u0004\b%\u0010\u0012J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0005H\u0017¢\u0006\u0004\b'\u0010\u0007J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b(\u0010\u000bJ#\u0010(\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0011H\u0017¢\u0006\u0004\b'\u0010\u0012J\u0019\u0010)\u001a\u00020\u00002\b\b\u0001\u0010)\u001a\u00020\u0013H\u0017¢\u0006\u0004\b)\u0010\u0015J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0016H\u0017¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010*\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b*\u0010\u000bJ#\u0010*\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0017¢\u0006\u0004\b*\u0010\u0010J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0011H\u0017¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0016H\u0017¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010+\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0011H\u0017¢\u0006\u0004\b+\u0010\u0012J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0016H\u0017¢\u0006\u0004\b,\u0010\u0017J\u0017\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0011H\u0017¢\u0006\u0004\b,\u0010\u0012J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u00020\u000e2\n\u00102\u001a\u0006\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u000e2\n\u00105\u001a\u0006\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b6\u00104J\"\u00109\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u00107\u0018\u00012\u0006\u00108\u001a\u00020\u0016H\u0082\b¢\u0006\u0004\b9\u0010:J-\u0010=\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u001072\u0006\u00108\u001a\u00020\u00162\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020\u0016H\u0002¢\u0006\u0004\b@\u0010AR$\u0010.\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u00100R8\u0010H\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u0003010Fj\u0012\u0012\u0004\u0012\u00020\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000301`G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0004\u001a\u0004\bJ\u0010KR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0004\u001a\u0004\bM\u0010NR\u001c\u0010S\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010\u0004\u001a\u0004\bP\u0010QR\u001c\u0010W\u001a\u0004\u0018\u00010\u00138GX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0004\u001a\u0004\bT\u0010UR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010\u0004\u001a\u0004\bX\u0010YR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\\\u0010\u0004\u001a\u0004\b[\u0010NR\u001c\u0010_\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0004\u001a\u0004\b]\u0010QR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010\u0004\u001a\u0004\b`\u0010KR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bc\u0010\u0004\u001a\u0004\bb\u0010NR\u001c\u0010f\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010\u0004\u001a\u0004\bd\u0010QR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010\u0004\u001a\u0004\bg\u0010hR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bk\u0010\u0004\u001a\u0004\bj\u0010NR\u001c\u0010n\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0004\u001a\u0004\bl\u0010QR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0004\u001a\u0004\bo\u0010KR\u001c\u0010 \u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\br\u0010\u0004\u001a\u0004\bq\u0010NR\u001c\u0010u\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\bt\u0010\u0004\u001a\u0004\bs\u0010QR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b8FX\u0087\u0004¢\u0006\f\u0012\u0004\bw\u0010\u0004\u001a\u0004\bv\u0010hR\u001c\u0010\"\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0004\u001a\u0004\bx\u0010NR\u001c\u0010|\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b{\u0010\u0004\u001a\u0004\bz\u0010QR\u001c\u0010#\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b~\u0010\u0004\u001a\u0004\b}\u0010KR\u001d\u0010$\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010\u0004\u001a\u0004\b\u007f\u0010NR\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0004\u001a\u0005\b\u0081\u0001\u0010QR\u001e\u0010%\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0004\u001a\u0005\b\u0084\u0001\u0010KR\u001e\u0010&\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0087\u0001\u0010\u0004\u001a\u0005\b\u0086\u0001\u0010NR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0089\u0001\u0010\u0004\u001a\u0005\b\u0088\u0001\u0010QR\u001e\u0010'\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008c\u0001\u0010\u0004\u001a\u0005\b\u008b\u0001\u0010KR\u001e\u0010(\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0004\u001a\u0005\b\u008d\u0001\u0010NR\u001f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0090\u0001\u0010\u0004\u001a\u0005\b\u008f\u0001\u0010QR\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00138GX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0093\u0001\u0010\u0004\u001a\u0005\b\u0092\u0001\u0010UR\u001e\u0010)\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0096\u0001\u0010\u0004\u001a\u0005\b\u0095\u0001\u0010YR\u001e\u0010*\u001a\u0004\u0018\u00010\b8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0098\u0001\u0010\u0004\u001a\u0005\b\u0097\u0001\u0010NR\u001f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009a\u0001\u0010\u0004\u001a\u0005\b\u0099\u0001\u0010QR\u001e\u0010+\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009d\u0001\u0010\u0004\u001a\u0005\b\u009c\u0001\u0010YR\u001f\u0010 \u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u009f\u0001\u0010\u0004\u001a\u0005\b\u009e\u0001\u0010QR\u001e\u0010,\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¢\u0001\u0010\u0004\u001a\u0005\b¡\u0001\u0010YR\u001f\u0010¥\u0001\u001a\u0004\u0018\u00010\u00118FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b¤\u0001\u0010\u0004\u001a\u0005\b£\u0001\u0010Q¨\u0006§\u0001"}, d2 = {"Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/extension/style/precipitations/generated/RainDslReceiver;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleRainExtension;", "<init>", "()V", "", "centerThinning", "(D)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/extension/style/types/StyleTransition;", "options", "centerThinningTransition", "(Lcom/mapbox/maps/extension/style/types/StyleTransition;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/types/StyleTransition$Builder;", "", "block", "(Le23/l;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "(Lcom/mapbox/maps/extension/style/expressions/generated/Expression;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "", TtmlNode.ATTR_TTS_COLOR, "(I)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "colorTransition", "density", "densityTransition", "", "direction", "(Ljava/util/List;)Lcom/mapbox/maps/extension/style/precipitations/generated/Rain;", "directionTransition", "distortionStrength", "distortionStrengthTransition", "dropletSize", "dropletSizeTransition", "intensity", "intensityTransition", "opacity", "opacityTransition", "vignette", "vignetteTransition", "vignetteColor", "vignetteColorTransition", "colorUseTheme", "vignetteColorUseTheme", "Lcom/mapbox/maps/MapboxStyleManager;", "delegate", "bindTo", "(Lcom/mapbox/maps/MapboxStyleManager;)V", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "property", "setProperty", "(Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;)V", "propertyValue", "updateProperty", "T", "propertyName", "getPropertyValue", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/lang/Class;", "clazz", "getPropertyValueWithType", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "transitionName", "getTransitionProperty", "(Ljava/lang/String;)Lcom/mapbox/maps/extension/style/types/StyleTransition;", "Lcom/mapbox/maps/MapboxStyleManager;", "getDelegate$extension_style_release", "()Lcom/mapbox/maps/MapboxStyleManager;", "setDelegate$extension_style_release", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "properties", "Ljava/util/HashMap;", "getCenterThinning", "()Ljava/lang/Double;", "getCenterThinning$annotations", "getCenterThinningTransition", "()Lcom/mapbox/maps/extension/style/types/StyleTransition;", "getCenterThinningTransition$annotations", "getCenterThinningAsExpression", "()Lcom/mapbox/maps/extension/style/expressions/generated/Expression;", "getCenterThinningAsExpression$annotations", "centerThinningAsExpression", "getColorAsColorInt", "()Ljava/lang/Integer;", "getColorAsColorInt$annotations", "colorAsColorInt", "getColor", "()Ljava/lang/String;", "getColor$annotations", "getColorTransition", "getColorTransition$annotations", "getColorAsExpression", "getColorAsExpression$annotations", "colorAsExpression", "getDensity", "getDensity$annotations", "getDensityTransition", "getDensityTransition$annotations", "getDensityAsExpression", "getDensityAsExpression$annotations", "densityAsExpression", "getDirection", "()Ljava/util/List;", "getDirection$annotations", "getDirectionTransition", "getDirectionTransition$annotations", "getDirectionAsExpression", "getDirectionAsExpression$annotations", "directionAsExpression", "getDistortionStrength", "getDistortionStrength$annotations", "getDistortionStrengthTransition", "getDistortionStrengthTransition$annotations", "getDistortionStrengthAsExpression", "getDistortionStrengthAsExpression$annotations", "distortionStrengthAsExpression", "getDropletSize", "getDropletSize$annotations", "getDropletSizeTransition", "getDropletSizeTransition$annotations", "getDropletSizeAsExpression", "getDropletSizeAsExpression$annotations", "dropletSizeAsExpression", "getIntensity", "getIntensity$annotations", "getIntensityTransition", "getIntensityTransition$annotations", "getIntensityAsExpression", "getIntensityAsExpression$annotations", "intensityAsExpression", "getOpacity", "getOpacity$annotations", "getOpacityTransition", "getOpacityTransition$annotations", "getOpacityAsExpression", "getOpacityAsExpression$annotations", "opacityAsExpression", "getVignette", "getVignette$annotations", "getVignetteTransition", "getVignetteTransition$annotations", "getVignetteAsExpression", "getVignetteAsExpression$annotations", "vignetteAsExpression", "getVignetteColorAsColorInt", "getVignetteColorAsColorInt$annotations", "vignetteColorAsColorInt", "getVignetteColor", "getVignetteColor$annotations", "getVignetteColorTransition", "getVignetteColorTransition$annotations", "getVignetteColorAsExpression", "getVignetteColorAsExpression$annotations", "vignetteColorAsExpression", "getColorUseTheme", "getColorUseTheme$annotations", "getColorUseThemeAsExpression", "getColorUseThemeAsExpression$annotations", "colorUseThemeAsExpression", "getVignetteColorUseTheme", "getVignetteColorUseTheme$annotations", "getVignetteColorUseThemeAsExpression", "getVignetteColorUseThemeAsExpression$annotations", "vignetteColorUseThemeAsExpression", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class Rain implements RainDslReceiver, StyleContract.StyleRainExtension {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "Mbgl-Rain";
    private MapboxStyleManager delegate;
    private final HashMap<String, PropertyValue<?>> properties = new HashMap<>();

    @MapboxExperimental
    public static /* synthetic */ void getCenterThinning$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCenterThinningAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getCenterThinningTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDirection$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDirectionAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDirectionTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDistortionStrength$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDistortionStrengthAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDistortionStrengthTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDropletSize$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDropletSizeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getDropletSizeTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIntensity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIntensityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getIntensityTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacity$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacityAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getOpacityTransition$annotations() {
    }

    private final <T> T getPropertyValue(String propertyName) {
        s.l();
        throw null;
    }

    private final <T> T getPropertyValueWithType(String propertyName, Class<T> clazz) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", propertyName, " failed: rain is not added to style yet."));
            return null;
        }
        try {
            return (T) TypeUtilsKt.unwrap(mapboxStyleManager.getStyleRainProperty(propertyName), clazz);
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleRainProperty(propertyName).toString();
            return null;
        }
    }

    private final StyleTransition getTransitionProperty(String transitionName) {
        MapboxStyleManager mapboxStyleManager = this.delegate;
        if (mapboxStyleManager == null) {
            p.n(j.m("Get property ", transitionName, " failed: rain is not added to style yet."));
            return null;
        }
        try {
            Object contents = mapboxStyleManager.getStyleRainProperty(transitionName).getValue().getContents();
            contents.getClass();
            HashMap map = (HashMap) contents;
            Value value = (Value) map.get("duration");
            Object contents2 = value != null ? value.getContents() : null;
            contents2.getClass();
            long jLongValue = ((Long) contents2).longValue();
            Value value2 = (Value) map.get("delay");
            Object contents3 = value2 != null ? value2.getContents() : null;
            contents3.getClass();
            return new StyleTransition.Builder().delay(((Long) contents3).longValue()).duration(jLongValue).build();
        } catch (RuntimeException e4) {
            e4.getMessage();
            mapboxStyleManager.getStyleRainProperty(transitionName).toString();
            return null;
        }
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignette$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColor$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorAsColorInt$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorTransition$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorUseTheme$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteColorUseThemeAsExpression$annotations() {
    }

    @MapboxExperimental
    public static /* synthetic */ void getVignetteTransition$annotations() {
    }

    private final void setProperty(PropertyValue<?> property) {
        this.properties.put(property.getPropertyName(), property);
        updateProperty(property);
    }

    private final void updateProperty(PropertyValue<?> propertyValue) {
        String error;
        MapboxStyleManager mapboxStyleManager = this.delegate;
        Expected<String, None> styleRainProperty = mapboxStyleManager != null ? mapboxStyleManager.setStyleRainProperty(propertyValue.getPropertyName(), propertyValue.getValue()) : null;
        if (styleRainProperty == null || (error = styleRainProperty.getError()) == null) {
            return;
        }
        p.n("Set rain property failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleRainExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        this.delegate = delegate;
        HashMap map = new HashMap();
        for (Map.Entry<String, PropertyValue<?>> entry : this.properties.entrySet()) {
            map.put(entry.getKey(), entry.getValue().getValue());
        }
        String error = delegate.setStyleRain(new Value((HashMap<String, Value>) map)).getError();
        if (error == null) {
            return;
        }
        p.n("Set rain failed: ".concat(error));
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain centerThinning(double centerThinning) {
        setProperty(new PropertyValue<>("center-thinning", Double.valueOf(centerThinning)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain centerThinningTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        centerThinningTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain color(int color) {
        setProperty(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, ColorUtils.INSTANCE.colorIntToRgbaExpression(color)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain colorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        colorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain colorUseTheme(String colorUseTheme) {
        colorUseTheme.getClass();
        setProperty(new PropertyValue<>("color-use-theme", colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain density(double density) {
        setProperty(new PropertyValue<>("density", Double.valueOf(density)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain densityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        densityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain direction(List<Double> direction) {
        direction.getClass();
        setProperty(new PropertyValue<>("direction", direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain directionTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        directionTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain distortionStrength(double distortionStrength) {
        setProperty(new PropertyValue<>("distortion-strength", Double.valueOf(distortionStrength)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain distortionStrengthTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        distortionStrengthTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain dropletSize(List<Double> dropletSize) {
        dropletSize.getClass();
        setProperty(new PropertyValue<>("droplet-size", dropletSize));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain dropletSizeTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        dropletSizeTransition(builder.build());
        return this;
    }

    public final Double getCenterThinning() {
        return (Double) getPropertyValueWithType("center-thinning", Double.class);
    }

    public final Expression getCenterThinningAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("center-thinning", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double centerThinning = getCenterThinning();
        if (centerThinning == null) {
            return null;
        }
        return Expression.INSTANCE.literal(centerThinning.doubleValue());
    }

    public final StyleTransition getCenterThinningTransition() {
        return getTransitionProperty("center-thinning-transition");
    }

    public final String getColor() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(colorAsExpression);
        }
        return null;
    }

    public final Integer getColorAsColorInt() {
        Expression colorAsExpression = getColorAsExpression();
        if (colorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(colorAsExpression);
        }
        return null;
    }

    public final Expression getColorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType(TtmlNode.ATTR_TTS_COLOR, Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getColorTransition() {
        return getTransitionProperty("color-transition");
    }

    public final String getColorUseTheme() {
        return (String) getPropertyValueWithType("color-use-theme", String.class);
    }

    public final Expression getColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String colorUseTheme = getColorUseTheme();
        if (colorUseTheme != null) {
            return Expression.INSTANCE.literal(colorUseTheme);
        }
        return null;
    }

    /* JADX INFO: renamed from: getDelegate$extension_style_release, reason: from getter */
    public final MapboxStyleManager getDelegate() {
        return this.delegate;
    }

    public final Double getDensity() {
        return (Double) getPropertyValueWithType("density", Double.class);
    }

    public final Expression getDensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("density", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double density = getDensity();
        if (density == null) {
            return null;
        }
        return Expression.INSTANCE.literal(density.doubleValue());
    }

    public final StyleTransition getDensityTransition() {
        return getTransitionProperty("density-transition");
    }

    public final List<Double> getDirection() {
        return (List) getPropertyValueWithType("direction", List.class);
    }

    public final Expression getDirectionAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("direction", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> direction = getDirection();
        if (direction != null) {
            return Expression.INSTANCE.literal$extension_style_release(direction);
        }
        return null;
    }

    public final StyleTransition getDirectionTransition() {
        return getTransitionProperty("direction-transition");
    }

    public final Double getDistortionStrength() {
        return (Double) getPropertyValueWithType("distortion-strength", Double.class);
    }

    public final Expression getDistortionStrengthAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("distortion-strength", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double distortionStrength = getDistortionStrength();
        if (distortionStrength == null) {
            return null;
        }
        return Expression.INSTANCE.literal(distortionStrength.doubleValue());
    }

    public final StyleTransition getDistortionStrengthTransition() {
        return getTransitionProperty("distortion-strength-transition");
    }

    public final List<Double> getDropletSize() {
        return (List) getPropertyValueWithType("droplet-size", List.class);
    }

    public final Expression getDropletSizeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("droplet-size", Expression.class);
        if (expression != null) {
            return expression;
        }
        List<Double> dropletSize = getDropletSize();
        if (dropletSize != null) {
            return Expression.INSTANCE.literal$extension_style_release(dropletSize);
        }
        return null;
    }

    public final StyleTransition getDropletSizeTransition() {
        return getTransitionProperty("droplet-size-transition");
    }

    public final Double getIntensity() {
        return (Double) getPropertyValueWithType("intensity", Double.class);
    }

    public final Expression getIntensityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("intensity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double intensity = getIntensity();
        if (intensity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(intensity.doubleValue());
    }

    public final StyleTransition getIntensityTransition() {
        return getTransitionProperty("intensity-transition");
    }

    public final Double getOpacity() {
        return (Double) getPropertyValueWithType("opacity", Double.class);
    }

    public final Expression getOpacityAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("opacity", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double opacity = getOpacity();
        if (opacity == null) {
            return null;
        }
        return Expression.INSTANCE.literal(opacity.doubleValue());
    }

    public final StyleTransition getOpacityTransition() {
        return getTransitionProperty("opacity-transition");
    }

    public final Double getVignette() {
        return (Double) getPropertyValueWithType("vignette", Double.class);
    }

    public final Expression getVignetteAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("vignette", Expression.class);
        if (expression != null) {
            return expression;
        }
        Double vignette = getVignette();
        if (vignette == null) {
            return null;
        }
        return Expression.INSTANCE.literal(vignette.doubleValue());
    }

    public final String getVignetteColor() {
        Expression vignetteColorAsExpression = getVignetteColorAsExpression();
        if (vignetteColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorString(vignetteColorAsExpression);
        }
        return null;
    }

    public final Integer getVignetteColorAsColorInt() {
        Expression vignetteColorAsExpression = getVignetteColorAsExpression();
        if (vignetteColorAsExpression != null) {
            return ColorUtils.INSTANCE.rgbaExpressionToColorInt(vignetteColorAsExpression);
        }
        return null;
    }

    public final Expression getVignetteColorAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("vignette-color", Expression.class);
        if (expression != null) {
            return expression;
        }
        return null;
    }

    public final StyleTransition getVignetteColorTransition() {
        return getTransitionProperty("vignette-color-transition");
    }

    public final String getVignetteColorUseTheme() {
        return (String) getPropertyValueWithType("vignette-color-use-theme", String.class);
    }

    public final Expression getVignetteColorUseThemeAsExpression() {
        Expression expression = (Expression) getPropertyValueWithType("vignette-color-use-theme", Expression.class);
        if (expression != null) {
            return expression;
        }
        String vignetteColorUseTheme = getVignetteColorUseTheme();
        if (vignetteColorUseTheme != null) {
            return Expression.INSTANCE.literal(vignetteColorUseTheme);
        }
        return null;
    }

    public final StyleTransition getVignetteTransition() {
        return getTransitionProperty("vignette-transition");
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain intensity(double intensity) {
        setProperty(new PropertyValue<>("intensity", Double.valueOf(intensity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain intensityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        intensityTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain opacity(double opacity) {
        setProperty(new PropertyValue<>("opacity", Double.valueOf(opacity)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain opacityTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        opacityTransition(builder.build());
        return this;
    }

    public final void setDelegate$extension_style_release(MapboxStyleManager mapboxStyleManager) {
        this.delegate = mapboxStyleManager;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignette(double vignette) {
        setProperty(new PropertyValue<>("vignette", Double.valueOf(vignette)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColor(int vignetteColor) {
        setProperty(new PropertyValue<>("vignette-color", ColorUtils.INSTANCE.colorIntToRgbaExpression(vignetteColor)));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColorTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        vignetteColorTransition(builder.build());
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColorUseTheme(String vignetteColorUseTheme) {
        vignetteColorUseTheme.getClass();
        setProperty(new PropertyValue<>("vignette-color-use-theme", vignetteColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteTransition(l<? super StyleTransition.Builder, Unit> block) {
        block.getClass();
        StyleTransition.Builder builder = new StyleTransition.Builder();
        block.invoke(builder);
        vignetteTransition(builder.build());
        return this;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/style/precipitations/generated/Rain$Companion;", "", "()V", "TAG", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain colorUseTheme(Expression colorUseTheme) {
        setProperty(p.c("color-use-theme", colorUseTheme, colorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain direction(Expression direction) {
        setProperty(p.c("direction", direction, direction));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain dropletSize(Expression dropletSize) {
        setProperty(p.c("droplet-size", dropletSize, dropletSize));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColorUseTheme(Expression vignetteColorUseTheme) {
        setProperty(p.c("vignette-color-use-theme", vignetteColorUseTheme, vignetteColorUseTheme));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain centerThinning(Expression centerThinning) {
        setProperty(p.c("center-thinning", centerThinning, centerThinning));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain density(Expression density) {
        setProperty(p.c("density", density, density));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain distortionStrength(Expression distortionStrength) {
        setProperty(p.c("distortion-strength", distortionStrength, distortionStrength));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain intensity(Expression intensity) {
        setProperty(p.c("intensity", intensity, intensity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain opacity(Expression opacity) {
        setProperty(p.c("opacity", opacity, opacity));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignette(Expression vignette) {
        setProperty(p.c("vignette", vignette, vignette));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain color(String color) {
        color.getClass();
        setProperty(new PropertyValue<>(TtmlNode.ATTR_TTS_COLOR, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColor(String vignetteColor) {
        vignetteColor.getClass();
        setProperty(new PropertyValue<>("vignette-color", vignetteColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain color(Expression color) {
        setProperty(p.c(TtmlNode.ATTR_TTS_COLOR, color, color));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColor(Expression vignetteColor) {
        setProperty(p.c("vignette-color", vignetteColor, vignetteColor));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain centerThinningTransition(StyleTransition options) {
        setProperty(p.b(options, "center-thinning-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain colorTransition(StyleTransition options) {
        setProperty(p.b(options, "color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain densityTransition(StyleTransition options) {
        setProperty(p.b(options, "density-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain directionTransition(StyleTransition options) {
        setProperty(p.b(options, "direction-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain distortionStrengthTransition(StyleTransition options) {
        setProperty(p.b(options, "distortion-strength-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain dropletSizeTransition(StyleTransition options) {
        setProperty(p.b(options, "droplet-size-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain intensityTransition(StyleTransition options) {
        setProperty(p.b(options, "intensity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain opacityTransition(StyleTransition options) {
        setProperty(p.b(options, "opacity-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteColorTransition(StyleTransition options) {
        setProperty(p.b(options, "vignette-color-transition", options));
        return this;
    }

    @Override // com.mapbox.maps.extension.style.precipitations.generated.RainDslReceiver
    @MapboxExperimental
    public Rain vignetteTransition(StyleTransition options) {
        setProperty(p.b(options, "vignette-transition", options));
        return this;
    }
}
