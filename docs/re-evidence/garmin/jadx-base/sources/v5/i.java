package v5;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0011"}, d2 = {"Lv5/i;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "widthAsSpInPx", "heightAsSpInPx", "verticalAlign", "<init>", "(FIFIFFI)V", "Lg6/c;", "density", "(FIFILg6/c;I)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends ReplacementSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f175723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f175724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f175725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f175726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f175727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f175728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f175729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint.FontMetricsInt f175730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f175731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f175732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f175733k;

    static {
        new a(null);
    }

    public i(float f14, int i14, float f15, int i15, g6.c cVar, int i16) {
        this(f14, i14, f15, i15, i14 == 0 ? cVar.g0(f0.H(f14, 4294967296L)) : 0.0f, i15 == 0 ? cVar.g0(f0.H(f15, 4294967296L)) : 0.0f, i16);
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f175730h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        s.m("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f175733k) {
            y5.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f175732j;
    }

    public final int c() {
        if (!this.f175733k) {
            y5.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.f175731i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f14, int i16, int i17, int i18, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(Paint paint, CharSequence charSequence, int i14, int i15, Paint.FontMetricsInt fontMetricsInt) {
        float f14;
        float f15;
        this.f175733k = true;
        float textSize = paint.getTextSize();
        this.f175730h = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            y5.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i16 = this.f175724b;
        if (i16 == 0) {
            f14 = this.f175727e;
        } else {
            if (i16 != 1) {
                y5.a.b("Unsupported unit.");
                o2.c.f();
                return 0;
            }
            f14 = this.f175723a * textSize;
        }
        this.f175731i = (int) Math.ceil(f14);
        int i17 = this.f175726d;
        if (i17 == 0) {
            f15 = this.f175728f;
        } else {
            if (i17 != 1) {
                y5.a.b("Unsupported unit.");
                o2.c.f();
                return 0;
            }
            f15 = this.f175725c * textSize;
        }
        this.f175732j = (int) Math.ceil(f15);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f175729g) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    y5.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lv5/i$a;", "", "<init>", "()V", "", "ALIGN_ABOVE_BASELINE", "I", "ALIGN_TOP", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "UNIT_SP", "UNIT_EM", "UNIT_UNSPECIFIED", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    private i(float f14, int i14, float f15, int i15, float f16, float f17, int i16) {
        this.f175723a = f14;
        this.f175724b = i14;
        this.f175725c = f15;
        this.f175726d = i15;
        this.f175727e = f16;
        this.f175728f = f17;
        this.f175729g = i16;
    }
}
