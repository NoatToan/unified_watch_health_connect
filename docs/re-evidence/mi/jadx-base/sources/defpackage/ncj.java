package defpackage;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import androidx.room.FtsOptions;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.ReactBackgroundColorSpan;
import com.facebook.react.views.text.ReactForegroundColorSpan;
import com.facebook.react.views.text.ReactStrikethroughSpan;
import com.facebook.react.views.text.ReactUnderlineSpan;
import com.facebook.react.views.text.TextTransform;
import com.facebook.yoga.YogaUnit;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.FloatCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(23)
public abstract class ncj extends cbe {
    public int c;
    public int e;
    public Map<Integer, oej> w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f27782b = false;
    public boolean d = false;
    public int f = -1;
    public int g = 0;
    public int h = 1;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextTransform f27783k = TextTransform.UNSET;
    public float l = 0.0f;
    public float m = 0.0f;
    public float n = 0.0f;
    public int o = 1426063360;
    public boolean p = false;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27784r = true;
    public int s = -1;
    public int t = -1;
    public String u = null;
    public boolean v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n7p f27781a = new n7p();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27786b;
        public xej c;

        public a(int i, int i2, xej xejVar) {
            this.f27785a = i;
            this.f27786b = i2;
            this.c = xejVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            int i2 = this.f27785a;
            spannableStringBuilder.setSpan(this.c, i2, this.f27786b, ((i << 16) & 16711680) | ((i2 == 0 ? 18 : 34) & (-16711681)));
        }
    }

    public static void a(ncj ncjVar, SpannableStringBuilder spannableStringBuilder, List<a> list, n7p n7pVar, boolean z, Map<Integer, oej> map, int i) {
        float layoutWidth;
        float layoutHeight;
        n7p n7pVarA = n7pVar != null ? n7pVar.a(ncjVar.f27781a) : ncjVar.f27781a;
        int childCount = ncjVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            pej childAt = ncjVar.getChildAt(i2);
            if (childAt instanceof kej) {
                spannableStringBuilder.append((CharSequence) TextTransform.apply(((kej) childAt).a(), n7pVarA.l()));
            } else if (childAt instanceof ncj) {
                a((ncj) childAt, spannableStringBuilder, list, n7pVarA, z, map, spannableStringBuilder.length());
            } else {
                if (childAt instanceof dfj) {
                    spannableStringBuilder.append("0");
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((dfj) childAt).a()));
                } else {
                    if (!z) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    o0s styleWidth = childAt.getStyleWidth();
                    o0s styleHeight = childAt.getStyleHeight();
                    YogaUnit yogaUnit = styleWidth.f28628b;
                    YogaUnit yogaUnit2 = YogaUnit.POINT;
                    if (yogaUnit == yogaUnit2 && styleHeight.f28628b == yogaUnit2) {
                        layoutWidth = styleWidth.f28627a;
                        layoutHeight = styleHeight.f28627a;
                    } else {
                        if (!edj.f) {
                            throw new IllegalViewOperationException("Views nested within a <Text> must have a width and height");
                        }
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append("0");
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new e8p(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    map.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i) {
            if (ncjVar.f27782b) {
                list.add(new a(i, length, new ReactForegroundColorSpan(ncjVar.c)));
            }
            if (ncjVar.d) {
                list.add(new a(i, length, new ReactBackgroundColorSpan(ncjVar.e)));
            }
            float fD = n7pVarA.d();
            if (!Float.isNaN(fD) && (n7pVar == null || n7pVar.d() != fD)) {
                list.add(new a(i, length, new wd5(fD)));
            }
            int iC = n7pVarA.c();
            if (n7pVar == null || n7pVar.c() != iC) {
                list.add(new a(i, length, new ReactAbsoluteSizeSpan(iC)));
            }
            if (ncjVar.s != -1 || ncjVar.t != -1 || ncjVar.u != null) {
                list.add(new a(i, length, new je5(ncjVar.s, ncjVar.t, ncjVar.u, ncjVar.getThemedContext().getAssets())));
            }
            if (ncjVar.p) {
                list.add(new a(i, length, new ReactUnderlineSpan()));
            }
            if (ncjVar.q) {
                list.add(new a(i, length, new ReactStrikethroughSpan()));
            }
            if ((ncjVar.l != 0.0f || ncjVar.m != 0.0f || ncjVar.n != 0.0f) && Color.alpha(ncjVar.o) != 0) {
                list.add(new a(i, length, new o2m(ncjVar.l, ncjVar.m, ncjVar.n, ncjVar.o)));
            }
            float fE = n7pVarA.e();
            if (!Float.isNaN(fE) && (n7pVar == null || n7pVar.e() != fE)) {
                list.add(new a(i, length, new be5(fE)));
            }
            list.add(new a(i, length, new bfj(ncjVar.getReactTag())));
        }
    }

    public static int b(String str) {
        if (str.length() != 3 || !str.endsWith("00") || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public Spannable c(ncj ncjVar, String str, boolean z, aig aigVar) {
        int iB;
        int i = 0;
        sk1.b((z && aigVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap map = z ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.apply(str, ncjVar.f27781a.l()));
        }
        a(ncjVar, spannableStringBuilder, arrayList, null, z, map, 0);
        ncjVar.v = false;
        ncjVar.w = map;
        float f = Float.NaN;
        for (a aVar : arrayList) {
            xej xejVar = aVar.c;
            boolean z2 = xejVar instanceof d8p;
            if (z2 || (xejVar instanceof e8p)) {
                if (z2) {
                    iB = ((d8p) xejVar).b();
                    ncjVar.v = true;
                } else {
                    e8p e8pVar = (e8p) xejVar;
                    int iA = e8pVar.a();
                    oej oejVar = (oej) map.get(Integer.valueOf(e8pVar.b()));
                    aigVar.h(oejVar);
                    oejVar.setLayoutParent(ncjVar);
                    iB = iA;
                }
                if (Float.isNaN(f) || iB > f) {
                    f = iB;
                }
            }
            aVar.a(spannableStringBuilder, i);
            i++;
        }
        ncjVar.f27781a.o(f);
        return spannableStringBuilder;
    }

    @iej(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.f27781a.b()) {
            this.f27781a.m(z);
            markUpdated();
        }
    }

    @iej(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (isVirtual()) {
            boolean z = num != null;
            this.d = z;
            if (z) {
                this.e = num.intValue();
            }
            markUpdated();
        }
    }

    @iej(name = "color")
    public void setColor(Integer num) {
        boolean z = num != null;
        this.f27782b = z;
        if (z) {
            this.c = num.intValue();
        }
        markUpdated();
    }

    @iej(name = "fontFamily")
    public void setFontFamily(String str) {
        this.u = str;
        markUpdated();
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.f27781a.n(f);
        markUpdated();
    }

    @iej(name = "fontStyle")
    public void setFontStyle(String str) {
        int i;
        if ("italic".equals(str)) {
            i = 2;
        } else {
            i = "normal".equals(str) ? 0 : -1;
        }
        if (i != this.s) {
            this.s = i;
            markUpdated();
        }
    }

    @iej(name = "fontWeight")
    public void setFontWeight(String str) {
        int iB = str != null ? b(str) : -1;
        int i = 0;
        if (iB == -1) {
            iB = 0;
        }
        if (iB == 700 || "bold".equals(str)) {
            i = 1;
        } else if (iB != 400 && !"normal".equals(str)) {
            i = iB;
        }
        if (i != this.t) {
            this.t = i;
            markUpdated();
        }
    }

    @iej(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.f27784r = z;
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.f27781a.p(f);
        markUpdated();
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.f27781a.q(f);
        markUpdated();
    }

    @iej(defaultFloat = FloatCompanionObject.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f27781a.k()) {
            this.f27781a.r(f);
            markUpdated();
        }
    }

    @iej(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f = i;
        markUpdated();
    }

    @iej(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            this.j = 1;
            this.g = 3;
        } else {
            this.j = 0;
            if (str == null || "auto".equals(str)) {
                this.g = 0;
            } else if ("left".equals(str)) {
                this.g = 3;
            } else if (TSMAuthContants.PARAM_KEY_RIGHT.equals(str)) {
                this.g = 5;
            } else {
                if (!"center".equals(str)) {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
                this.g = 1;
            }
        }
        markUpdated();
    }

    @iej(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.h = 1;
        } else if (FtsOptions.TOKENIZER_SIMPLE.equals(str)) {
            this.h = 0;
        } else {
            if (!"balanced".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            this.h = 2;
        }
        markUpdated();
    }

    @iej(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.p = false;
        this.q = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.p = true;
                } else if ("line-through".equals(str2)) {
                    this.q = true;
                }
            }
        }
        markUpdated();
    }

    @iej(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.o) {
            this.o = i;
            markUpdated();
        }
    }

    @iej(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.l = 0.0f;
        this.m = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.l = exh.b(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.m = exh.b(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @iej(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.n) {
            this.n = f;
            markUpdated();
        }
    }

    @iej(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.f27781a.s(TextTransform.UNSET);
        } else if ("none".equals(str)) {
            this.f27781a.s(TextTransform.NONE);
        } else if ("uppercase".equals(str)) {
            this.f27781a.s(TextTransform.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.f27781a.s(TextTransform.LOWERCASE);
        } else {
            if (!"capitalize".equals(str)) {
                throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
            }
            this.f27781a.s(TextTransform.CAPITALIZE);
        }
        markUpdated();
    }
}
