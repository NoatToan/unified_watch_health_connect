package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import fa.k;
import fa.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kc.i;
import kc.j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<ea.a> f10007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kc.a f10009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f10010e;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10006a = new ArrayList();
        this.f10007b = Collections.EMPTY_LIST;
        this.f10008c = 0.0533f;
        this.f10009d = kc.a.f103841g;
        this.f10010e = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, kc.a aVar, float f14, float f15) {
        this.f10007b = list;
        this.f10009d = aVar;
        this.f10008c = f14;
        this.f10010e = f15;
        while (true) {
            ArrayList arrayList = this.f10006a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new i(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x045b  */
    /* JADX WARN: Code duplicated, block: B:188:0x045e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0461  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f14;
        int i14;
        int i15;
        boolean z14;
        float f15;
        int i16;
        float f16;
        int i17;
        int iMax;
        int iMin;
        int iRound;
        int i18;
        a aVar = this;
        List<ea.a> list = aVar.f10007b;
        if (list.isEmpty()) {
            return;
        }
        int height = aVar.getHeight();
        int paddingLeft = aVar.getPaddingLeft();
        int paddingTop = aVar.getPaddingTop();
        int width = aVar.getWidth() - aVar.getPaddingRight();
        int paddingBottom = height - aVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float fB = j.b(0, aVar.f10008c, height, i19);
        float f17 = 0.0f;
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i24 = 0;
        while (i24 < size) {
            ea.a aVarA = list.get(i24);
            float f18 = f17;
            if (aVarA.f63566p != Integer.MIN_VALUE) {
                ea.a.b bVar = new ea.a.b();
                bVar.f63575h = -3.4028235E38f;
                bVar.f63576i = Integer.MIN_VALUE;
                bVar.f63570c = null;
                int i25 = aVarA.f63556f;
                float f19 = aVarA.f63555e;
                if (i25 == 0) {
                    bVar.f63572e = 1.0f - f19;
                    i18 = 0;
                    bVar.f63573f = 0;
                } else {
                    i18 = 0;
                    bVar.f63572e = (-f19) - 1.0f;
                    bVar.f63573f = 1;
                }
                int i26 = aVarA.f63557g;
                if (i26 == 0) {
                    bVar.f63574g = 2;
                } else if (i26 == 2) {
                    bVar.f63574g = i18;
                }
                aVarA = bVar.a();
            }
            float fB2 = j.b(aVarA.f63564n, aVarA.f63565o, height, i19);
            i iVar = (i) aVar.f10006a.get(i24);
            kc.a aVar2 = aVar.f10009d;
            List<ea.a> list2 = list;
            float f22 = aVar.f10010e;
            TextPaint textPaint = iVar.f103901f;
            int i27 = height;
            Bitmap bitmap = aVarA.f63554d;
            int i28 = i19;
            float f24 = aVarA.f63561k;
            int i29 = size;
            float f25 = aVarA.f63560j;
            int i30 = i24;
            int i34 = aVarA.f63559i;
            float f26 = aVarA.f63558h;
            int i35 = aVarA.f63557g;
            float f27 = fB;
            int i36 = aVarA.f63556f;
            float f28 = aVarA.f63555e;
            Layout.Alignment alignment = aVarA.f63552b;
            CharSequence charSequence = aVarA.f63551a;
            boolean z15 = bitmap == null;
            if (z15) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    z14 = false;
                } else {
                    f14 = f26;
                    i14 = aVarA.f63562l ? aVarA.f63563m : aVar2.f103844c;
                }
                i24 = i30 + 1;
                aVar = this;
                f17 = f18;
                list = list2;
                height = i27;
                i19 = i28;
                size = i29;
                fB = f27;
                paddingLeft = paddingLeft;
            } else {
                f14 = f26;
                i14 = -16777216;
            }
            CharSequence charSequence2 = iVar.f103904i;
            if (charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) {
                Layout.Alignment alignment2 = iVar.f103905j;
                int i37 = z.f70071a;
                if (Objects.equals(alignment2, alignment) && iVar.f103906k == bitmap && iVar.f103907l == f28 && iVar.f103908m == i36) {
                    i15 = i35;
                    if (Integer.valueOf(iVar.f103909n).equals(Integer.valueOf(i15)) && iVar.f103910o == f14 && Integer.valueOf(iVar.f103911p).equals(Integer.valueOf(i34)) && iVar.f103912q == f25 && iVar.f103913r == f24 && iVar.f103914s == aVar2.f103842a && iVar.f103915t == aVar2.f103843b && iVar.f103916u == i14 && iVar.f103918w == aVar2.f103845d && iVar.f103917v == aVar2.f103846e && Objects.equals(textPaint.getTypeface(), aVar2.f103847f) && iVar.f103919x == f27 && iVar.f103920y == fB2 && iVar.f103921z == f22 && iVar.A == paddingLeft && iVar.B == paddingTop && iVar.C == width && iVar.D == paddingBottom) {
                        iVar.a(canvas, z15);
                        paddingLeft = paddingLeft;
                        z14 = false;
                    }
                    i24 = i30 + 1;
                    aVar = this;
                    f17 = f18;
                    list = list2;
                    height = i27;
                    i19 = i28;
                    size = i29;
                    fB = f27;
                    paddingLeft = paddingLeft;
                } else {
                    i15 = i35;
                }
            } else {
                i15 = i35;
            }
            iVar.f103904i = charSequence;
            iVar.f103905j = alignment;
            iVar.f103906k = bitmap;
            iVar.f103907l = f28;
            iVar.f103908m = i36;
            iVar.f103909n = i15;
            iVar.f103910o = f14;
            iVar.f103911p = i34;
            iVar.f103912q = f25;
            iVar.f103913r = f24;
            iVar.f103914s = aVar2.f103842a;
            iVar.f103915t = aVar2.f103843b;
            iVar.f103916u = i14;
            iVar.f103918w = aVar2.f103845d;
            iVar.f103917v = aVar2.f103846e;
            textPaint.setTypeface(aVar2.f103847f);
            f27 = f27;
            iVar.f103919x = f27;
            iVar.f103920y = fB2;
            iVar.f103921z = f22;
            iVar.A = paddingLeft;
            iVar.B = paddingTop;
            iVar.C = width;
            iVar.D = paddingBottom;
            if (z15) {
                iVar.f103904i.getClass();
                CharSequence charSequence3 = iVar.f103904i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(iVar.f103904i);
                int i38 = iVar.C - iVar.A;
                int i39 = iVar.D - iVar.B;
                textPaint.setTextSize(iVar.f103919x);
                int i44 = (int) ((iVar.f103919x * 0.125f) + 0.5f);
                int i45 = i44 * 2;
                int i46 = i38 - i45;
                float f29 = iVar.f103912q;
                if (f29 != -3.4028235E38f) {
                    i46 = (int) (i46 * f29);
                }
                int i47 = i46;
                if (i47 <= 0) {
                    k.g("Skipped drawing subtitle cue (insufficient space)");
                    f27 = f27;
                    paddingLeft = paddingLeft;
                } else {
                    if (iVar.f103920y > f18) {
                        i17 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) iVar.f103920y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i17 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (iVar.f103918w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i17, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i48 = 0;
                        for (int length = foregroundColorSpanArr.length; i48 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i48]);
                            i48++;
                        }
                    }
                    if (Color.alpha(iVar.f103915t) > 0) {
                        int i49 = iVar.f103918w;
                        if (i49 == 0 || i49 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(iVar.f103915t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(iVar.f103915t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = iVar.f103905j;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment4 = alignment3;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i47, alignment4, iVar.f103899d, iVar.f103900e, true);
                    iVar.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = iVar.E.getLineCount();
                    int i54 = 0;
                    int iMax2 = 0;
                    while (i54 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(iVar.E.getLineWidth(i54)), iMax2);
                        i54++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    int i55 = height2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i56 = ((iVar.f103912q == -3.4028235E38f || iMax2 >= i47) ? iMax2 : i47) + i45;
                    float f34 = iVar.f103910o;
                    if (f34 != -3.4028235E38f) {
                        int iRound2 = Math.round(i38 * f34);
                        int i57 = iVar.A;
                        int i58 = iRound2 + i57;
                        int i59 = iVar.f103911p;
                        if (i59 == 1) {
                            i58 = ((i58 * 2) - i56) / 2;
                        } else if (i59 == 2) {
                            i58 -= i56;
                        }
                        iMax = Math.max(i58, i57);
                        iMin = Math.min(iMax + i56, iVar.C);
                    } else {
                        iMax = iVar.A + ((i38 - i56) / 2);
                        iMin = iMax + i56;
                    }
                    int i64 = iMin - iMax;
                    if (i64 <= 0) {
                        k.g("Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f35 = iVar.f103907l;
                        if (f35 != -3.4028235E38f) {
                            if (iVar.f103908m == 0) {
                                iRound = Math.round(i39 * f35) + iVar.B;
                                int i65 = iVar.f103909n;
                                if (i65 == 2) {
                                    iRound -= i55;
                                } else if (i65 == 1) {
                                    iRound = ((iRound * 2) - i55) / 2;
                                }
                                z14 = false;
                            } else {
                                z14 = false;
                                int lineBottom = iVar.E.getLineBottom(0) - iVar.E.getLineTop(0);
                                float f36 = iVar.f103907l;
                                iRound = f36 >= f18 ? Math.round(f36 * lineBottom) + iVar.B : (Math.round((f36 + 1.0f) * lineBottom) + iVar.D) - i55;
                            }
                            int i66 = iRound + i55;
                            int i67 = iVar.D;
                            if (i66 > i67) {
                                iRound = i67 - i55;
                            } else {
                                int i68 = iVar.B;
                                if (iRound < i68) {
                                    iRound = i68;
                                }
                            }
                        } else {
                            z14 = false;
                            iRound = (iVar.D - i55) - ((int) (i39 * iVar.f103921z));
                        }
                        iVar.E = new StaticLayout(spannableStringBuilder3, r2, i64, alignment4, iVar.f103899d, iVar.f103900e, true);
                        iVar.F = new StaticLayout(spannableStringBuilder4, textPaint, i64, alignment4, iVar.f103899d, iVar.f103900e, true);
                        iVar.G = iMax;
                        iVar.H = iRound;
                        iVar.I = i44;
                    }
                }
                z14 = false;
            } else {
                f27 = f27;
                paddingLeft = paddingLeft;
                z14 = false;
                iVar.f103906k.getClass();
                Bitmap bitmap2 = iVar.f103906k;
                int i69 = iVar.C;
                int i74 = iVar.A;
                int i75 = iVar.D;
                int i76 = iVar.B;
                float f37 = i69 - i74;
                float f38 = (iVar.f103910o * f37) + i74;
                float f39 = i75 - i76;
                float f44 = (iVar.f103907l * f39) + i76;
                int iRound3 = Math.round(f37 * iVar.f103912q);
                float f45 = iVar.f103913r;
                int iRound4 = f45 != -3.4028235E38f ? Math.round(f39 * f45) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i77 = iVar.f103911p;
                if (i77 == 2) {
                    f15 = iRound3;
                } else {
                    if (i77 == 1) {
                        f15 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f38);
                    i16 = iVar.f103909n;
                    if (i16 == 2) {
                        f16 = iRound4;
                    } else {
                        if (i16 == 1) {
                            f16 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f44);
                        iVar.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f44 -= f16;
                    int iRound7 = Math.round(f44);
                    iVar.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f38 -= f15;
                int iRound8 = Math.round(f38);
                i16 = iVar.f103909n;
                if (i16 == 2) {
                    f16 = iRound4;
                } else {
                    if (i16 == 1) {
                        f16 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f44);
                    iVar.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f44 -= f16;
                int iRound10 = Math.round(f44);
                iVar.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            iVar.a(canvas, z15);
            i24 = i30 + 1;
            aVar = this;
            f17 = f18;
            list = list2;
            height = i27;
            i19 = i28;
            size = i29;
            fB = f27;
            paddingLeft = paddingLeft;
        }
    }

    public a(Context context) {
        this(context, null);
    }
}
