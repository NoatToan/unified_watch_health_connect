package s5;

import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.flexbox.FlexItem;
import o4.q1;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001AB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB×\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b\b\u0010,Bï\u0001\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b\b\u0010/B\u0087\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b\b\u00104B\u009f\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u00109B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010:B¡\u0002\b\u0016\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010?B©\u0002\b\u0017\u0012\b\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b\b\u0010@¨\u0006B"}, d2 = {"Ls5/x0;", "", "Ls5/i0;", "spanStyle", "Ls5/w;", "paragraphStyle", "Ls5/c0;", "platformStyle", "<init>", "(Ls5/i0;Ls5/w;Ls5/c0;)V", "(Ls5/i0;Ls5/w;)V", "Lo4/d0;", TtmlNode.ATTR_TTS_COLOR, "Lg6/q;", TtmlNode.ATTR_TTS_FONT_SIZE, "Lw5/f0;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Lw5/b0;", TtmlNode.ATTR_TTS_FONT_STYLE, "Lw5/c0;", "fontSynthesis", "Lw5/q;", TtmlNode.ATTR_TTS_FONT_FAMILY, "", "fontFeatureSettings", "letterSpacing", "Ld6/a;", "baselineShift", "Ld6/m;", "textGeometricTransform", "Lz5/c;", "localeList", "background", "Ld6/i;", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Lo4/q1;", "shadow", "Ld6/h;", TtmlNode.ATTR_TTS_TEXT_ALIGN, "Ld6/j;", "textDirection", "lineHeight", "Ld6/n;", "textIndent", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ld6/h;Ld6/j;JLd6/n;Lkotlin/jvm/internal/j;)V", "Ld6/f;", "lineHeightStyle", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ld6/h;Ld6/j;JLd6/n;Ls5/c0;Ld6/f;Lkotlin/jvm/internal/j;)V", "Ld6/e;", "lineBreak", "Ld6/d;", "hyphens", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Ld6/h;Ld6/j;JLd6/n;Ls5/c0;Ld6/f;Ld6/e;Ld6/d;Lkotlin/jvm/internal/j;)V", "Lq4/g;", "drawStyle", "Ld6/o;", "textMotion", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Lq4/g;Ld6/h;Ld6/j;JLd6/n;Ls5/c0;Ld6/f;Ld6/e;Ld6/d;Ld6/o;Lkotlin/jvm/internal/j;)V", "(JJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Lq4/g;IIJLd6/n;Ls5/c0;Ld6/f;IILd6/o;Lkotlin/jvm/internal/j;)V", "Lo4/w;", "brush", "", "alpha", "(Lo4/w;FJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Lq4/g;IIJLd6/n;Ls5/c0;Ld6/f;IILd6/o;Lkotlin/jvm/internal/j;)V", "(Lo4/w;FJLw5/f0;Lw5/b0;Lw5/c0;Lw5/q;Ljava/lang/String;JLd6/a;Ld6/m;Lz5/c;JLd6/i;Lo4/q1;Lq4/g;Ld6/h;Ld6/j;JLd6/n;Ls5/c0;Ld6/f;Ld6/e;Ld6/d;Ld6/o;Lkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f157320d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x0 f157321e = new x0(0, 0, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0, (d6.a) null, (d6.m) null, (z5.c) null, 0, (d6.i) null, (q1) null, (q4.g) null, 0, 0, 0, (d6.n) null, (c0) null, (d6.f) null, 0, 0, (d6.o) null, FlexItem.MAX_SIZE, (p005kotlin.jvm.internal.j) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f157322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f157323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from toString */
    public final c0 platformStyle;

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar, int i18, p005kotlin.jvm.internal.j jVar) {
        long j18;
        long j19;
        long j24;
        long j25;
        int i19;
        int i24;
        long j26;
        int i25;
        if ((i18 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j8;
        }
        if ((i18 & 2) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j14;
        }
        w5.f0 f0Var2 = (i18 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i18 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i18 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i18 & 32) != 0 ? null : qVar;
        String str2 = (i18 & 64) != 0 ? null : str;
        if ((i18 & 128) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j15;
        }
        d6.a aVar2 = (i18 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i18 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i18 & 1024) != 0 ? null : cVar;
        if ((i18 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j25 = o4.d0.f128832k;
        } else {
            j25 = j16;
        }
        d6.i iVar2 = (i18 & 4096) != 0 ? null : iVar;
        long j27 = j18;
        q1 q1Var2 = (i18 & 8192) != 0 ? null : q1Var;
        q4.g gVar2 = (i18 & 16384) != 0 ? null : gVar;
        int i26 = 0;
        if ((i18 & 32768) != 0) {
            d6.h.f57752b.getClass();
            i19 = 0;
        } else {
            i19 = i14;
        }
        if ((i18 & 65536) != 0) {
            d6.j.f57765b.getClass();
            i24 = 0;
        } else {
            i24 = i15;
        }
        if ((i18 & 131072) != 0) {
            g6.q.f76018b.getClass();
            j26 = g6.q.f76020d;
        } else {
            j26 = j17;
        }
        d6.n nVar2 = (i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : nVar;
        c0 c0Var4 = (i18 & 524288) != 0 ? null : c0Var2;
        d6.f fVar2 = (i18 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : fVar;
        if ((i18 & 2097152) != 0) {
            d6.e.f57712b.getClass();
            i25 = 0;
        } else {
            i25 = i16;
        }
        if ((i18 & 4194304) != 0) {
            d6.d.f57708b.getClass();
        } else {
            i26 = i17;
        }
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var5 = c0Var3;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j28 = j24;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j29 = j25;
        this(j27, j19, f0Var2, b0Var3, c0Var5, qVar3, str3, j28, aVar3, mVar3, cVar3, j29, iVar2, q1Var2, gVar2, i19, i24, j26, nVar2, c0Var4, fVar2, i25, i26, (i18 & 8388608) != 0 ? null : oVar, (p005kotlin.jvm.internal.j) null);
    }

    public static x0 a(x0 x0Var, long j8, long j14, w5.f0 f0Var, w5.q qVar, long j15, q1 q1Var, q4.k kVar, int i14, long j16, c0 c0Var, d6.f fVar, int i15) {
        d6.l lVarB;
        long jB = (i15 & 1) != 0 ? x0Var.f157322a.f157211a.getF57707b() : j8;
        long j17 = (i15 & 2) != 0 ? x0Var.f157322a.fontSize : j14;
        w5.f0 f0Var2 = (i15 & 4) != 0 ? x0Var.f157322a.fontWeight : f0Var;
        i0 i0Var = x0Var.f157322a;
        w5.b0 b0Var = i0Var.fontStyle;
        w5.c0 c0Var2 = i0Var.fontSynthesis;
        w5.q qVar2 = (i15 & 32) != 0 ? i0Var.fontFamily : qVar;
        String str = i0Var.fontFeatureSettings;
        long j18 = (i15 & 128) != 0 ? i0Var.letterSpacing : j15;
        d6.a aVar = i0Var.baselineShift;
        d6.m mVar = i0Var.textGeometricTransform;
        z5.c cVar = i0Var.localeList;
        long j19 = i0Var.f157222l;
        d6.i iVar = i0Var.background;
        q1 q1Var2 = (i15 & 8192) != 0 ? i0Var.shadow : q1Var;
        q4.g gVar = (i15 & 16384) != 0 ? i0Var.drawStyle : kVar;
        int i16 = (32768 & i15) != 0 ? x0Var.f157323b.f157306a : i14;
        w wVar = x0Var.f157323b;
        int i17 = wVar.f157307b;
        long j24 = (i15 & 131072) != 0 ? wVar.f157308c : j16;
        d6.n nVar = wVar.f157309d;
        c0 c0Var3 = (i15 & 524288) != 0 ? x0Var.platformStyle : c0Var;
        d6.f fVar2 = (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? wVar.f157311f : fVar;
        int i18 = wVar.f157312g;
        int i19 = wVar.f157313h;
        d6.o oVar = wVar.f157314i;
        if (o4.d0.d(jB, i0Var.f157211a.getF57707b())) {
            lVarB = i0Var.f157211a;
        } else {
            d6.l.f57772a.getClass();
            lVarB = d6.l.a.b(jB);
        }
        return new x0(new i0(lVarB, j17, f0Var2, b0Var, c0Var2, qVar2, str, j18, aVar, mVar, cVar, j19, iVar, q1Var2, c0Var3 != null ? c0Var3.f157153a : null, gVar, (p005kotlin.jvm.internal.j) null), new w(i16, i17, j24, nVar, c0Var3 != null ? c0Var3.f157154b : null, fVar2, i18, i19, oVar, (p005kotlin.jvm.internal.j) null), c0Var3);
    }

    public static x0 f(x0 x0Var, long j8, long j14, w5.f0 f0Var, long j15, int i14, long j16, int i15) {
        long j17;
        long j18;
        long j19;
        int i16;
        long j24;
        if ((i15 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j17 = o4.d0.f128832k;
        } else {
            j17 = j8;
        }
        if ((i15 & 2) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        w5.f0 f0Var2 = (i15 & 4) != 0 ? null : f0Var;
        if ((i15 & 128) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j15;
        }
        o4.d0.f128823b.getClass();
        long j25 = o4.d0.f128832k;
        if ((32768 & i15) != 0) {
            d6.h.f57752b.getClass();
            i16 = 0;
        } else {
            i16 = i14;
        }
        d6.j.f57765b.getClass();
        if ((i15 & 131072) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j16;
        }
        d6.e.f57712b.getClass();
        d6.d.f57708b.getClass();
        i0 i0VarA = j0.a(x0Var.f157322a, j17, null, Float.NaN, j18, f0Var2, null, null, null, null, j19, null, null, null, j25, null, null, null, null);
        w wVarA = x.a(x0Var.f157323b, i16, 0, j24, null, null, null, 0, 0, null);
        return (x0Var.f157322a == i0VarA && x0Var.f157323b == wVarA) ? x0Var : new x0(i0VarA, wVarA);
    }

    public final o4.w b() {
        return this.f157322a.f157211a.e();
    }

    public final long c() {
        return this.f157322a.f157211a.getF57707b();
    }

    public final boolean d(x0 x0Var) {
        if (this != x0Var) {
            return p005kotlin.jvm.internal.s.g(this.f157323b, x0Var.f157323b) && this.f157322a.b(x0Var.f157322a);
        }
        return true;
    }

    public final x0 e(x0 x0Var) {
        return (x0Var == null || x0Var.equals(f157321e)) ? this : new x0(this.f157322a.d(x0Var.f157322a), this.f157323b.a(x0Var.f157323b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return p005kotlin.jvm.internal.s.g(this.f157322a, x0Var.f157322a) && p005kotlin.jvm.internal.s.g(this.f157323b, x0Var.f157323b) && p005kotlin.jvm.internal.s.g(this.platformStyle, x0Var.platformStyle);
    }

    public final int hashCode() {
        int iHashCode = (this.f157323b.hashCode() + (this.f157322a.hashCode() * 31)) * 31;
        c0 c0Var = this.platformStyle;
        return iHashCode + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextStyle(color=");
        sb3.append((Object) o4.d0.j(c()));
        sb3.append(", brush=");
        sb3.append(b());
        sb3.append(", alpha=");
        i0 i0Var = this.f157322a;
        sb3.append(i0Var.f157211a.a());
        sb3.append(", fontSize=");
        sb3.append((Object) g6.q.f(i0Var.fontSize));
        sb3.append(", fontWeight=");
        sb3.append(i0Var.fontWeight);
        sb3.append(", fontStyle=");
        sb3.append(i0Var.fontStyle);
        sb3.append(", fontSynthesis=");
        sb3.append(i0Var.fontSynthesis);
        sb3.append(", fontFamily=");
        sb3.append(i0Var.fontFamily);
        sb3.append(", fontFeatureSettings=");
        sb3.append(i0Var.fontFeatureSettings);
        sb3.append(", letterSpacing=");
        sb3.append((Object) g6.q.f(i0Var.letterSpacing));
        sb3.append(", baselineShift=");
        sb3.append(i0Var.baselineShift);
        sb3.append(", textGeometricTransform=");
        sb3.append(i0Var.textGeometricTransform);
        sb3.append(", localeList=");
        sb3.append(i0Var.localeList);
        sb3.append(", background=");
        q2.m(i0Var.f157222l, ", textDecoration=", sb3);
        sb3.append(i0Var.background);
        sb3.append(", shadow=");
        sb3.append(i0Var.shadow);
        sb3.append(", drawStyle=");
        sb3.append(i0Var.drawStyle);
        sb3.append(", textAlign=");
        w wVar = this.f157323b;
        sb3.append((Object) d6.h.b(wVar.f157306a));
        sb3.append(", textDirection=");
        sb3.append((Object) d6.j.b(wVar.f157307b));
        sb3.append(", lineHeight=");
        sb3.append((Object) g6.q.f(wVar.f157308c));
        sb3.append(", textIndent=");
        sb3.append(wVar.f157309d);
        sb3.append(", platformStyle=");
        sb3.append(this.platformStyle);
        sb3.append(", lineHeightStyle=");
        sb3.append(wVar.f157311f);
        sb3.append(", lineBreak=");
        sb3.append((Object) d6.e.b(wVar.f157312g));
        sb3.append(", hyphens=");
        sb3.append((Object) d6.d.b(wVar.f157313h));
        sb3.append(", textMotion=");
        sb3.append(wVar.f157314i);
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/x0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @o13.e
    public /* synthetic */ x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, hVar, jVar, j17, nVar, c0Var2, fVar, eVar, dVar);
    }

    @o13.e
    public /* synthetic */ x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, hVar, jVar, j17, nVar, c0Var2, fVar);
    }

    public /* synthetic */ x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar, p005kotlin.jvm.internal.j jVar) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, gVar, i14, i15, j17, nVar, c0Var2, fVar, i16, i17, oVar);
    }

    @o13.e
    public /* synthetic */ x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, gVar, hVar, jVar, j17, nVar, c0Var2, fVar, eVar, dVar, oVar);
    }

    public /* synthetic */ x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar, p005kotlin.jvm.internal.j jVar) {
        this(wVar, f14, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, gVar, i14, i15, j16, nVar, c0Var2, fVar, i16, i17, oVar);
    }

    @o13.e
    public /* synthetic */ x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, p005kotlin.jvm.internal.j jVar2) {
        this(wVar, f14, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, gVar, hVar, jVar, j16, nVar, c0Var2, fVar, eVar, dVar, oVar);
    }

    public x0(i0 i0Var, w wVar, c0 c0Var) {
        this.f157322a = i0Var;
        this.f157323b = wVar;
        this.platformStyle = c0Var;
    }

    public /* synthetic */ x0(i0 i0Var, w wVar, c0 c0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(i0Var, wVar, (i14 & 4) != 0 ? null : c0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        long j18;
        long j19;
        long j24;
        long j25;
        long j26;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var2 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j25 = o4.d0.f128832k;
        } else {
            j25 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j27 = j18;
        q1 q1Var2 = (i14 & 8192) != 0 ? null : q1Var;
        d6.h hVar2 = (i14 & 16384) != 0 ? null : hVar;
        d6.j jVar3 = (i14 & 32768) != 0 ? null : jVar;
        if ((i14 & 65536) != 0) {
            g6.q.f76018b.getClass();
            j26 = g6.q.f76020d;
        } else {
            j26 = j17;
        }
        long j28 = j19;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var3 = c0Var2;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j29 = j24;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j34 = j25;
        this(j27, j28, f0Var3, b0Var3, c0Var3, qVar3, str3, j29, aVar3, mVar3, cVar3, j34, iVar3, q1Var2, hVar2, jVar3, j26, (i14 & 131072) != 0 ? null : nVar, null);
    }

    private x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar) {
        int i14;
        i0 i0Var = new i0(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, (b0) null, (q4.g) null, (p005kotlin.jvm.internal.j) null);
        int i15 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
        }
        d6.e.f57712b.getClass();
        d6.d.f57708b.getClass();
        this(i0Var, new w(i14, i15, j17, nVar, (a0) null, (d6.f) null, 0, 0, (d6.o) null, (p005kotlin.jvm.internal.j) null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(i0 i0Var, w wVar) {
        b0 b0Var = i0Var.platformStyle;
        a0 a0Var = wVar.f157310e;
        this(i0Var, wVar, (b0Var == null && a0Var == null) ? null : new c0(b0Var, a0Var));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        long j18;
        long j19;
        long j24;
        long j25;
        long j26;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j25 = o4.d0.f128832k;
        } else {
            j25 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j27 = j18;
        q1 q1Var2 = (i14 & 8192) != 0 ? null : q1Var;
        d6.h hVar2 = (i14 & 16384) != 0 ? null : hVar;
        d6.j jVar3 = (i14 & 32768) != 0 ? null : jVar;
        if ((i14 & 65536) != 0) {
            g6.q.f76018b.getClass();
            j26 = g6.q.f76020d;
        } else {
            j26 = j17;
        }
        d6.n nVar2 = (i14 & 131072) != 0 ? null : nVar;
        c0 c0Var4 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : c0Var2;
        long j28 = j19;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var5 = c0Var3;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j29 = j24;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j34 = j25;
        this(j27, j28, f0Var3, b0Var3, c0Var5, qVar3, str3, j29, aVar3, mVar3, cVar3, j34, iVar3, q1Var2, hVar2, jVar3, j26, nVar2, c0Var4, (i14 & 524288) != 0 ? null : fVar, null);
    }

    private x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar) {
        int i14;
        i0 i0Var = new i0(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, (q4.g) null, (p005kotlin.jvm.internal.j) null);
        int i15 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
        }
        a0 a0Var = c0Var2 != null ? c0Var2.f157154b : null;
        d6.e.f57712b.getClass();
        d6.d.f57708b.getClass();
        this(i0Var, new w(i14, i15, j17, nVar, a0Var, fVar, 0, 0, (d6.o) null, (p005kotlin.jvm.internal.j) null), c0Var2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        long j18;
        long j19;
        long j24;
        long j25;
        long j26;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j25 = o4.d0.f128832k;
        } else {
            j25 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j27 = j18;
        q1 q1Var2 = (i14 & 8192) != 0 ? null : q1Var;
        d6.h hVar2 = (i14 & 16384) != 0 ? null : hVar;
        d6.j jVar3 = (i14 & 32768) != 0 ? null : jVar;
        if ((i14 & 65536) != 0) {
            g6.q.f76018b.getClass();
            j26 = g6.q.f76020d;
        } else {
            j26 = j17;
        }
        d6.n nVar2 = (i14 & 131072) != 0 ? null : nVar;
        c0 c0Var4 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : c0Var2;
        d6.f fVar2 = (i14 & 524288) != 0 ? null : fVar;
        d6.e eVar2 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : eVar;
        long j28 = j19;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var5 = c0Var3;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j29 = j24;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j34 = j25;
        this(j27, j28, f0Var3, b0Var3, c0Var5, qVar3, str3, j29, aVar3, mVar3, cVar3, j34, iVar3, q1Var2, hVar2, jVar3, j26, nVar2, c0Var4, fVar2, eVar2, (i14 & 2097152) != 0 ? null : dVar, null);
    }

    private x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar) {
        int i14;
        int i15;
        int i16;
        i0 i0Var = new i0(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, (q4.g) null, 32768, (p005kotlin.jvm.internal.j) null);
        int i17 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
            i15 = 0;
        }
        a0 a0Var = c0Var2 != null ? c0Var2.f157154b : null;
        if (eVar != null) {
            i16 = eVar.f57714a;
        } else {
            d6.e.f57712b.getClass();
            i16 = 0;
        }
        if (dVar != null) {
            i17 = dVar.f57711a;
        } else {
            d6.d.f57708b.getClass();
        }
        this(i0Var, new w(i14, i15, j17, nVar, a0Var, fVar, i16, i17, (d6.o) null, 256, (p005kotlin.jvm.internal.j) null), c0Var2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        long j18;
        long j19;
        long j24;
        long j25;
        long j26;
        if ((i14 & 1) != 0) {
            o4.d0.f128823b.getClass();
            j18 = o4.d0.f128832k;
        } else {
            j18 = j8;
        }
        if ((i14 & 2) != 0) {
            g6.q.f76018b.getClass();
            j19 = g6.q.f76020d;
        } else {
            j19 = j14;
        }
        w5.f0 f0Var2 = (i14 & 4) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 8) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i14 & 16) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 32) != 0 ? null : qVar;
        String str2 = (i14 & 64) != 0 ? null : str;
        if ((i14 & 128) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j15;
        }
        d6.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 512) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 1024) != 0 ? null : cVar;
        if ((i14 & 2048) != 0) {
            o4.d0.f128823b.getClass();
            j25 = o4.d0.f128832k;
        } else {
            j25 = j16;
        }
        d6.i iVar2 = (i14 & 4096) != 0 ? null : iVar;
        long j27 = j18;
        q1 q1Var2 = (i14 & 8192) != 0 ? null : q1Var;
        q4.g gVar2 = (i14 & 16384) != 0 ? null : gVar;
        d6.h hVar2 = (i14 & 32768) != 0 ? null : hVar;
        d6.j jVar3 = (i14 & 65536) != 0 ? null : jVar;
        if ((i14 & 131072) != 0) {
            g6.q.f76018b.getClass();
            j26 = g6.q.f76020d;
        } else {
            j26 = j17;
        }
        d6.n nVar2 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : nVar;
        c0 c0Var4 = (i14 & 524288) != 0 ? null : c0Var2;
        d6.f fVar2 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : fVar;
        d6.e eVar2 = (i14 & 2097152) != 0 ? null : eVar;
        d6.d dVar2 = (i14 & 4194304) != 0 ? null : dVar;
        long j28 = j19;
        w5.f0 f0Var3 = f0Var2;
        d6.i iVar3 = iVar2;
        w5.b0 b0Var3 = b0Var2;
        w5.c0 c0Var5 = c0Var3;
        w5.q qVar3 = qVar2;
        String str3 = str2;
        long j29 = j24;
        d6.a aVar3 = aVar2;
        d6.m mVar3 = mVar2;
        z5.c cVar3 = cVar2;
        long j34 = j25;
        this(j27, j28, f0Var3, b0Var3, c0Var5, qVar3, str3, j29, aVar3, mVar3, cVar3, j34, iVar3, q1Var2, gVar2, hVar2, jVar3, j26, nVar2, c0Var4, fVar2, eVar2, dVar2, (i14 & 8388608) != 0 ? null : oVar, (p005kotlin.jvm.internal.j) null);
    }

    private x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar) {
        int i14;
        int i15;
        int i16;
        i0 i0Var = new i0(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, gVar, (p005kotlin.jvm.internal.j) null);
        int i17 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
            i15 = 0;
        }
        a0 a0Var = c0Var2 != null ? c0Var2.f157154b : null;
        if (eVar != null) {
            i16 = eVar.f57714a;
        } else {
            d6.e.f57712b.getClass();
            i16 = 0;
        }
        if (dVar != null) {
            i17 = dVar.f57711a;
        } else {
            d6.d.f57708b.getClass();
        }
        this(i0Var, new w(i14, i15, j17, nVar, a0Var, fVar, i16, i17, oVar, (p005kotlin.jvm.internal.j) null), c0Var2);
    }

    @o13.e
    public /* synthetic */ x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, d6.h hVar, d6.j jVar, long j17, d6.n nVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, hVar, jVar, j17, nVar);
    }

    private x0(long j8, long j14, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j15, d6.a aVar, d6.m mVar, z5.c cVar, long j16, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j17, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar) {
        this(new i0(j8, j14, f0Var, b0Var, c0Var, qVar, str, j15, aVar, mVar, cVar, j16, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, gVar, (p005kotlin.jvm.internal.j) null), new w(i14, i15, j17, nVar, c0Var2 != null ? c0Var2.f157154b : null, fVar, i16, i17, oVar, (p005kotlin.jvm.internal.j) null), c0Var2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar, int i18, p005kotlin.jvm.internal.j jVar) {
        long j17;
        long j18;
        long j19;
        int i19;
        int i24;
        long j24;
        int i25;
        int i26;
        float f15 = (i18 & 2) != 0 ? Float.NaN : f14;
        if ((i18 & 4) != 0) {
            g6.q.f76018b.getClass();
            j17 = g6.q.f76020d;
        } else {
            j17 = j8;
        }
        w5.f0 f0Var2 = (i18 & 8) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i18 & 16) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i18 & 32) != 0 ? null : c0Var;
        w5.q qVar2 = (i18 & 64) != 0 ? null : qVar;
        String str2 = (i18 & 128) != 0 ? null : str;
        if ((i18 & 256) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        d6.a aVar2 = (i18 & 512) != 0 ? null : aVar;
        d6.m mVar2 = (i18 & 1024) != 0 ? null : mVar;
        z5.c cVar2 = (i18 & 2048) != 0 ? null : cVar;
        if ((i18 & 4096) != 0) {
            o4.d0.f128823b.getClass();
            j19 = o4.d0.f128832k;
        } else {
            j19 = j15;
        }
        d6.i iVar2 = (i18 & 8192) != 0 ? null : iVar;
        q1 q1Var2 = (i18 & 16384) != 0 ? null : q1Var;
        q4.g gVar2 = (32768 & i18) != 0 ? null : gVar;
        if ((65536 & i18) != 0) {
            d6.h.f57752b.getClass();
            i19 = 0;
        } else {
            i19 = i14;
        }
        if ((131072 & i18) != 0) {
            d6.j.f57765b.getClass();
            i24 = 0;
        } else {
            i24 = i15;
        }
        if ((262144 & i18) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j16;
        }
        d6.n nVar2 = (524288 & i18) != 0 ? null : nVar;
        c0 c0Var4 = (1048576 & i18) != 0 ? null : c0Var2;
        d6.f fVar2 = (2097152 & i18) != 0 ? null : fVar;
        if ((4194304 & i18) != 0) {
            d6.e.f57712b.getClass();
            i25 = 0;
        } else {
            i25 = i16;
        }
        if ((8388608 & i18) != 0) {
            d6.d.f57708b.getClass();
            i26 = 0;
        } else {
            i26 = i17;
        }
        this(wVar, f15, j17, f0Var2, b0Var2, c0Var3, qVar2, str2, j18, aVar2, mVar2, cVar2, j19, iVar2, q1Var2, gVar2, i19, i24, j24, nVar2, c0Var4, fVar2, i25, i26, (i18 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : oVar, (p005kotlin.jvm.internal.j) null);
    }

    private x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, int i14, int i15, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, int i16, int i17, d6.o oVar) {
        this(new i0(wVar, f14, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, gVar, (p005kotlin.jvm.internal.j) null), new w(i14, i15, j16, nVar, c0Var2 != null ? c0Var2.f157154b : null, fVar, i16, i17, oVar, (p005kotlin.jvm.internal.j) null), c0Var2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        long j17;
        long j18;
        long j19;
        long j24;
        float f15 = (i14 & 2) != 0 ? Float.NaN : f14;
        if ((i14 & 4) != 0) {
            g6.q.f76018b.getClass();
            j17 = g6.q.f76020d;
        } else {
            j17 = j8;
        }
        w5.f0 f0Var2 = (i14 & 8) != 0 ? null : f0Var;
        w5.b0 b0Var2 = (i14 & 16) != 0 ? null : b0Var;
        w5.c0 c0Var3 = (i14 & 32) != 0 ? null : c0Var;
        w5.q qVar2 = (i14 & 64) != 0 ? null : qVar;
        String str2 = (i14 & 128) != 0 ? null : str;
        if ((i14 & 256) != 0) {
            g6.q.f76018b.getClass();
            j18 = g6.q.f76020d;
        } else {
            j18 = j14;
        }
        d6.a aVar2 = (i14 & 512) != 0 ? null : aVar;
        d6.m mVar2 = (i14 & 1024) != 0 ? null : mVar;
        z5.c cVar2 = (i14 & 2048) != 0 ? null : cVar;
        if ((i14 & 4096) != 0) {
            o4.d0.f128823b.getClass();
            j19 = o4.d0.f128832k;
        } else {
            j19 = j15;
        }
        d6.i iVar2 = (i14 & 8192) != 0 ? null : iVar;
        q1 q1Var2 = (i14 & 16384) != 0 ? null : q1Var;
        q4.g gVar2 = (32768 & i14) != 0 ? null : gVar;
        d6.h hVar2 = (65536 & i14) != 0 ? null : hVar;
        d6.j jVar3 = (131072 & i14) != 0 ? null : jVar;
        if ((262144 & i14) != 0) {
            g6.q.f76018b.getClass();
            j24 = g6.q.f76020d;
        } else {
            j24 = j16;
        }
        this(wVar, f15, j17, f0Var2, b0Var2, c0Var3, qVar2, str2, j18, aVar2, mVar2, cVar2, j19, iVar2, q1Var2, gVar2, hVar2, jVar3, j24, (524288 & i14) != 0 ? null : nVar, (1048576 & i14) != 0 ? null : c0Var2, (2097152 & i14) != 0 ? null : fVar, (4194304 & i14) != 0 ? null : eVar, (8388608 & i14) != 0 ? null : dVar, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : oVar, (p005kotlin.jvm.internal.j) null);
    }

    private x0(o4.w wVar, float f14, long j8, w5.f0 f0Var, w5.b0 b0Var, w5.c0 c0Var, w5.q qVar, String str, long j14, d6.a aVar, d6.m mVar, z5.c cVar, long j15, d6.i iVar, q1 q1Var, q4.g gVar, d6.h hVar, d6.j jVar, long j16, d6.n nVar, c0 c0Var2, d6.f fVar, d6.e eVar, d6.d dVar, d6.o oVar) {
        int i14;
        int i15;
        int i16;
        i0 i0Var = new i0(wVar, f14, j8, f0Var, b0Var, c0Var, qVar, str, j14, aVar, mVar, cVar, j15, iVar, q1Var, c0Var2 != null ? c0Var2.f157153a : null, gVar, (p005kotlin.jvm.internal.j) null);
        int i17 = 0;
        if (hVar != null) {
            i14 = hVar.f57759a;
        } else {
            d6.h.f57752b.getClass();
            i14 = 0;
        }
        if (jVar != null) {
            i15 = jVar.f57771a;
        } else {
            d6.j.f57765b.getClass();
            i15 = 0;
        }
        a0 a0Var = c0Var2 != null ? c0Var2.f157154b : null;
        if (eVar != null) {
            i16 = eVar.f57714a;
        } else {
            d6.e.f57712b.getClass();
            i16 = 0;
        }
        if (dVar != null) {
            i17 = dVar.f57711a;
        } else {
            d6.d.f57708b.getClass();
        }
        this(i0Var, new w(i14, i15, j16, nVar, a0Var, fVar, i16, i17, oVar, (p005kotlin.jvm.internal.j) null), c0Var2);
    }
}
