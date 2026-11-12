package d53;

import c53.c0;
import c53.h0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import p005kotlin.Metadata;
import p13.g0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld53/j;", "Ld53/i;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f57691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f57692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f57693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f57694d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"d53/j$a", "Lp13/c;", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends p13.c<String> {
        public a() {
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a */
        public final int getF134973e() {
            return j.this.f57691a.groupCount() + 1;
        }

        @Override // p13.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        @Override // java.util.List
        public final Object get(int i14) {
            String strGroup = j.this.f57691a.group(i14);
            return strGroup == null ? "" : strGroup;
        }

        @Override // p13.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        @Override // p13.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"d53/j$b", "", "Lp13/a;", "Ld53/h;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends p13.a<h> implements Collection {
        public b() {
        }

        @Override // p13.a
        /* JADX INFO: renamed from: a */
        public final int getF134973e() {
            return j.this.f57691a.groupCount() + 1;
        }

        public final h b(int i14) {
            j jVar = j.this;
            Matcher matcher = jVar.f57691a;
            j23.l lVarO = j23.t.o(matcher.start(i14), matcher.end(i14));
            if (lVarO.f96796a < 0) {
                return null;
            }
            String strGroup = jVar.f57691a.group(i14);
            strGroup.getClass();
            return new h(strGroup, lVarO);
        }

        @Override // p13.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof h) {
                return super.contains((h) obj);
            }
            return false;
        }

        @Override // p13.a, java.util.Collection
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<h> iterator() {
            return new h0.a(c0.o(new g0(p13.x.i(this)), new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 19)));
        }
    }

    public j(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.f57691a = matcher;
        this.f57692b = charSequence;
        this.f57693c = new b();
    }

    @Override // d53.i
    public final List<String> a() {
        if (this.f57694d == null) {
            this.f57694d = new a();
        }
        a aVar = this.f57694d;
        aVar.getClass();
        return aVar;
    }

    @Override // d53.i
    public final j23.l b() {
        Matcher matcher = this.f57691a;
        return j23.t.o(matcher.start(), matcher.end());
    }

    public final j c() {
        Matcher matcher = this.f57691a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f57692b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new j(matcher2, charSequence);
        }
        return null;
    }

    @Override // d53.i
    public final String getValue() {
        String strGroup = this.f57691a.group();
        strGroup.getClass();
        return strGroup;
    }
}
