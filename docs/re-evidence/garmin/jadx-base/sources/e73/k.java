package e73;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class k extends j73.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern[][] f63374e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73.j f63375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f63376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f63377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e73.a f63378d;

    public static class b extends j73.b {
        @Override // j73.e
        public final d a(h hVar, h.a aVar) {
            int i14 = hVar.f63357e;
            CharSequence charSequence = hVar.f63353a;
            if (hVar.f63359g < 4 && charSequence.charAt(i14) == '<') {
                for (int i15 = 1; i15 <= 7; i15++) {
                    if (i15 != 7 || !(aVar.f63368a.c() instanceof h73.t)) {
                        Pattern[] patternArr = k.f63374e[i15];
                        Pattern pattern = patternArr[0];
                        Pattern pattern2 = patternArr[1];
                        if (pattern.matcher(charSequence.subSequence(i14, charSequence.length())).find()) {
                            d dVar = new d(new k(pattern2));
                            dVar.f63332b = hVar.f63354b;
                            return dVar;
                        }
                    }
                }
            }
            return null;
        }
    }

    private k(Pattern pattern) {
        this.f63375a = new h73.j();
        this.f63377c = false;
        this.f63378d = new e73.a();
        this.f63376b = pattern;
    }

    @Override // j73.d
    public final h73.a c() {
        return this.f63375a;
    }

    @Override // j73.a, j73.d
    public final void d(CharSequence charSequence) {
        e73.a aVar = this.f63378d;
        StringBuilder sb3 = aVar.f63325a;
        if (aVar.f63326b != 0) {
            sb3.append('\n');
        }
        sb3.append(charSequence);
        aVar.f63326b++;
        Pattern pattern = this.f63376b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.f63377c = true;
    }

    @Override // j73.d
    public final j73.c g(h hVar) {
        if (this.f63377c) {
            return null;
        }
        if (hVar.f63360h && this.f63376b == null) {
            return null;
        }
        return j73.c.a(hVar.f63354b);
    }

    @Override // j73.a, j73.d
    public final void h() {
        this.f63378d.f63325a.toString();
        this.f63375a.getClass();
        this.f63378d = null;
    }
}
