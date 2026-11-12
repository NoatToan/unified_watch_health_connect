package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.g6i;
import defpackage.nh4;
import defpackage.qh4;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f2085a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f2086a;

        public a(ClipData clipData, int i) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2086a = new b(clipData, i);
            } else {
                this.f2086a = new d(clipData, i);
            }
        }

        public ContentInfoCompat a() {
            return this.f2086a.build();
        }

        public a b(Bundle bundle) {
            this.f2086a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.f2086a.setFlags(i);
            return this;
        }

        public a d(Uri uri) {
            this.f2086a.a(uri);
            return this;
        }
    }

    @RequiresApi(31)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f2087a;

        public b(ClipData clipData, int i) {
            this.f2087a = qh4.a(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(Uri uri) {
            this.f2087a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new e(this.f2087a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(Bundle bundle) {
            this.f2087a.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setFlags(int i) {
            this.f2087a.setFlags(i);
        }
    }

    public interface c {
        void a(Uri uri);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);

        void setFlags(int i);
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f2088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2089b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.f2088a = clipData;
            this.f2089b = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void a(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public ContentInfoCompat build() {
            return new ContentInfoCompat(new g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public void setFlags(int i) {
            this.c = i;
        }
    }

    @RequiresApi(31)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f2090a;

        public e(ContentInfo contentInfo) {
            this.f2090a = nh4.a(g6i.g(contentInfo));
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ContentInfo a() {
            return this.f2090a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ClipData b() {
            return this.f2090a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getFlags() {
            return this.f2090a.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getSource() {
            return this.f2090a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2090a + "}";
        }
    }

    public interface f {
        ContentInfo a();

        ClipData b();

        int getFlags();

        int getSource();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f2091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2092b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.f2091a = (ClipData) g6i.g(dVar.f2088a);
            this.f2092b = g6i.c(dVar.f2089b, 0, 5, "source");
            this.c = g6i.f(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public ClipData b() {
            return this.f2091a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getFlags() {
            return this.c;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public int getSource() {
            return this.f2092b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2091a.getDescription());
            sb.append(", source=");
            sb.append(ContentInfoCompat.e(this.f2092b));
            sb.append(", flags=");
            sb.append(ContentInfoCompat.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public ContentInfoCompat(f fVar) {
        this.f2085a = fVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i != 4) {
            return i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    @RequiresApi(31)
    public static ContentInfoCompat g(ContentInfo contentInfo) {
        return new ContentInfoCompat(new e(contentInfo));
    }

    public ClipData b() {
        return this.f2085a.b();
    }

    public int c() {
        return this.f2085a.getFlags();
    }

    public int d() {
        return this.f2085a.getSource();
    }

    @RequiresApi(31)
    public ContentInfo f() {
        ContentInfo contentInfoA = this.f2085a.a();
        Objects.requireNonNull(contentInfoA);
        return nh4.a(contentInfoA);
    }

    public String toString() {
        return this.f2085a.toString();
    }
}
