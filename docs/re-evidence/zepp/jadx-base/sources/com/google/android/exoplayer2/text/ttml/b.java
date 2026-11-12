package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class b {
    public static final String A = "data";
    public static final String A0 = "filled";
    public static final String B = "information";
    public static final String B0 = "open";
    public static final String C = "";
    public static final String D = "id";
    public static final String E = "origin";
    public static final String F = "extent";
    public static final String G = "displayAlign";
    public static final String H = "backgroundColor";
    public static final String I = "fontStyle";
    public static final String J = "fontSize";
    public static final String K = "fontFamily";
    public static final String L = "fontWeight";
    public static final String M = "color";
    public static final String N = "ruby";
    public static final String O = "rubyPosition";
    public static final String P = "textDecoration";
    public static final String Q = "textAlign";
    public static final String R = "textCombine";
    public static final String S = "textEmphasis";
    public static final String T = "writingMode";
    public static final String U = "shear";
    public static final String V = "multiRowAlign";
    public static final String W = "container";
    public static final String X = "base";
    public static final String Y = "baseContainer";
    public static final String Z = "text";
    public static final String a0 = "textContainer";
    public static final String b0 = "delimiter";
    public static final String c0 = "before";
    public static final String d0 = "after";
    public static final String e0 = "outside";
    public static final String f0 = "linethrough";
    public static final String g0 = "nolinethrough";
    public static final String h0 = "underline";
    public static final String i0 = "nounderline";
    public static final String j0 = "italic";
    public static final String k0 = "bold";
    public static final String l0 = "left";
    public static final String m0 = "center";
    public static final String n = "tt";
    public static final String n0 = "right";
    public static final String o = "head";
    public static final String o0 = "start";
    public static final String p = "body";
    public static final String p0 = "end";
    public static final String q = "div";
    public static final String q0 = "none";
    public static final String r = "p";
    public static final String r0 = "all";
    public static final String s = "span";
    public static final String s0 = "tb";
    public static final String t = "br";
    public static final String t0 = "tblr";
    public static final String u = "style";
    public static final String u0 = "tbrl";
    public static final String v = "styling";
    public static final String v0 = "none";
    public static final String w = "layout";
    public static final String w0 = "auto";
    public static final String x = "region";
    public static final String x0 = "dot";
    public static final String y = "metadata";
    public static final String y0 = "sesame";
    public static final String z = "image";
    public static final String z0 = "circle";

    @Nullable
    public final String a;

    @Nullable
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;

    @Nullable
    public final TtmlStyle f;

    @Nullable
    private final String[] g;
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final b j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private List<b> m;

    private b(@Nullable String tag, @Nullable String text, long startTimeUs, long endTimeUs, @Nullable TtmlStyle style, @Nullable String[] styleIds, String regionId, @Nullable String imageId, @Nullable b parent) {
        this.a = tag;
        this.b = text;
        this.i = imageId;
        this.f = style;
        this.g = styleIds;
        this.c = text != null;
        this.d = startTimeUs;
        this.e = endTimeUs;
        this.h = (String) Assertions.checkNotNull(regionId);
        this.j = parent;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    private void b(Map<String, TtmlStyle> globalStyles, Cue.Builder regionOutput, int start, int end, int verticalType) {
        TtmlStyle ttmlStyleF = d.f(this.f, this.g, globalStyles);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) regionOutput.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            regionOutput.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (ttmlStyleF != null) {
            d.a(spannableStringBuilder2, start, end, ttmlStyleF, this.j, globalStyles, verticalType);
            if (r.equals(this.a)) {
                if (ttmlStyleF.k() != Float.MAX_VALUE) {
                    regionOutput.setShearDegrees((ttmlStyleF.k() * (-90.0f)) / 100.0f);
                }
                if (ttmlStyleF.m() != null) {
                    regionOutput.setTextAlignment(ttmlStyleF.m());
                }
                if (ttmlStyleF.h() != null) {
                    regionOutput.setMultiRowAlignment(ttmlStyleF.h());
                }
            }
        }
    }

    public static b c(@Nullable String tag, long startTimeUs, long endTimeUs, @Nullable TtmlStyle style, @Nullable String[] styleIds, String regionId, @Nullable String imageId, @Nullable b parent) {
        return new b(tag, null, startTimeUs, endTimeUs, style, styleIds, regionId, imageId, parent);
    }

    public static b d(String text) {
        return new b(null, d.b(text), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static void e(SpannableStringBuilder builder) {
        for (a aVar : (a[]) builder.getSpans(0, builder.length(), a.class)) {
            builder.replace(builder.getSpanStart(aVar), builder.getSpanEnd(aVar), "");
        }
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < builder.length() && builder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    builder.delete(i, i4 + i);
                }
            }
        }
        if (builder.length() > 0 && builder.charAt(0) == ' ') {
            builder.delete(0, 1);
        }
        for (int i5 = 0; i5 < builder.length() - 1; i5++) {
            if (builder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (builder.charAt(i6) == ' ') {
                    builder.delete(i6, i5 + 2);
                }
            }
        }
        if (builder.length() > 0 && builder.charAt(builder.length() - 1) == ' ') {
            builder.delete(builder.length() - 1, builder.length());
        }
        for (int i7 = 0; i7 < builder.length() - 1; i7++) {
            if (builder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (builder.charAt(i8) == '\n') {
                    builder.delete(i7, i8);
                }
            }
        }
        if (builder.length() <= 0 || builder.charAt(builder.length() - 1) != '\n') {
            return;
        }
        builder.delete(builder.length() - 1, builder.length());
    }

    private void i(TreeSet<Long> out, boolean descendsPNode) {
        boolean zEquals = r.equals(this.a);
        boolean zEquals2 = q.equals(this.a);
        if (descendsPNode || zEquals || (zEquals2 && this.i != null)) {
            long j = this.d;
            if (j != C.TIME_UNSET) {
                out.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != C.TIME_UNSET) {
                out.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            this.m.get(i).i(out, descendsPNode || zEquals);
        }
    }

    private static SpannableStringBuilder k(String resolvedRegionId, Map<String, Cue.Builder> regionOutputs) {
        if (!regionOutputs.containsKey(resolvedRegionId)) {
            Cue.Builder builder = new Cue.Builder();
            builder.setText(new SpannableStringBuilder());
            regionOutputs.put(resolvedRegionId, builder);
        }
        return (SpannableStringBuilder) Assertions.checkNotNull(regionOutputs.get(resolvedRegionId).getText());
    }

    private void n(long timeUs, String inheritedRegion, List<Pair<String, String>> regionImageList) {
        if (!"".equals(this.h)) {
            inheritedRegion = this.h;
        }
        if (m(timeUs) && q.equals(this.a) && this.i != null) {
            regionImageList.add(new Pair<>(inheritedRegion, this.i));
            return;
        }
        for (int i = 0; i < g(); i++) {
            f(i).n(timeUs, inheritedRegion, regionImageList);
        }
    }

    private void o(long timeUs, Map<String, TtmlStyle> globalStyles, Map<String, c> regionMaps, String inheritedRegion, Map<String, Cue.Builder> regionOutputs) {
        int i;
        if (m(timeUs)) {
            String str = "".equals(this.h) ? inheritedRegion : this.h;
            Iterator<Map.Entry<String, Integer>> it2 = this.l.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                int iIntValue = this.k.containsKey(key) ? this.k.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    b(globalStyles, (Cue.Builder) Assertions.checkNotNull(regionOutputs.get(key)), iIntValue, iIntValue2, ((c) Assertions.checkNotNull(regionMaps.get(str))).j);
                }
            }
            for (i = 0; i < g(); i++) {
                f(i).o(timeUs, globalStyles, regionMaps, str, regionOutputs);
            }
        }
    }

    private void p(long timeUs, boolean descendsPNode, String inheritedRegion, Map<String, Cue.Builder> regionOutputs) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            inheritedRegion = this.h;
        }
        if (this.c && descendsPNode) {
            k(inheritedRegion, regionOutputs).append((CharSequence) Assertions.checkNotNull(this.b));
            return;
        }
        if (t.equals(this.a) && descendsPNode) {
            k(inheritedRegion, regionOutputs).append('\n');
            return;
        }
        if (m(timeUs)) {
            for (Map.Entry<String, Cue.Builder> entry : regionOutputs.entrySet()) {
                this.k.put(entry.getKey(), Integer.valueOf(((CharSequence) Assertions.checkNotNull(entry.getValue().getText())).length()));
            }
            boolean zEquals = r.equals(this.a);
            for (int i = 0; i < g(); i++) {
                f(i).p(timeUs, descendsPNode || zEquals, inheritedRegion, regionOutputs);
            }
            if (zEquals) {
                d.c(k(inheritedRegion, regionOutputs));
            }
            for (Map.Entry<String, Cue.Builder> entry2 : regionOutputs.entrySet()) {
                this.l.put(entry2.getKey(), Integer.valueOf(((CharSequence) Assertions.checkNotNull(entry2.getValue().getText())).length()));
            }
        }
    }

    public void a(b child) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(child);
    }

    public b f(int index) {
        List<b> list = this.m;
        if (list != null) {
            return list.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<b> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<Cue> h(long timeUs, Map<String, TtmlStyle> globalStyles, Map<String, c> regionMap, Map<String, String> imageMap) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        n(timeUs, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(timeUs, false, this.h, treeMap);
        o(timeUs, globalStyles, regionMap, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = imageMap.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                c cVar = (c) Assertions.checkNotNull(regionMap.get(pair.first));
                arrayList2.add(new Cue.Builder().setBitmap(bitmapDecodeByteArray).setPosition(cVar.b).setPositionAnchor(0).setLine(cVar.c, 0).setLineAnchor(cVar.e).setSize(cVar.f).setBitmapHeight(cVar.g).setVerticalType(cVar.j).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar2 = (c) Assertions.checkNotNull(regionMap.get(entry.getKey()));
            Cue.Builder builder = (Cue.Builder) entry.getValue();
            e((SpannableStringBuilder) Assertions.checkNotNull(builder.getText()));
            builder.setLine(cVar2.c, cVar2.d);
            builder.setLineAnchor(cVar2.e);
            builder.setPosition(cVar2.b);
            builder.setSize(cVar2.f);
            builder.setTextSize(cVar2.i, cVar2.h);
            builder.setVerticalType(cVar2.j);
            arrayList2.add(builder.build());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it2 = treeSet.iterator();
        while (it2.hasNext()) {
            jArr[i] = it2.next().longValue();
            i++;
        }
        return jArr;
    }

    @Nullable
    public String[] l() {
        return this.g;
    }

    public boolean m(long timeUs) {
        long j = this.d;
        return (j == C.TIME_UNSET && this.e == C.TIME_UNSET) || (j <= timeUs && this.e == C.TIME_UNSET) || ((j == C.TIME_UNSET && timeUs < this.e) || (j <= timeUs && timeUs < this.e));
    }
}
