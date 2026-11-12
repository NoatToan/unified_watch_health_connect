package androidx.media3.ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f10106a = Pattern.compile("(&#13;)?&#10;");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, String> f10108b;

        private b(String str, Map<String, String> map) {
            this.f10107a = str;
            this.f10108b = map;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final androidx.browser.trusted.c f10109e = new androidx.browser.trusted.c(16);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final androidx.browser.trusted.c f10110f = new androidx.browser.trusted.c(17);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10113c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10114d;

        private c(int i14, int i15, String str, String str2) {
            this.f10111a = i14;
            this.f10112b = i15;
            this.f10113c = str;
            this.f10114d = str2;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    public static final class C0134d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f10115a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f10116b = new ArrayList();
    }

    private d() {
    }

    public static String a(CharSequence charSequence) {
        return f10106a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
