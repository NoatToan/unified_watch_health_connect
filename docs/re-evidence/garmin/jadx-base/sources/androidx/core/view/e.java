package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f6414a;

    public interface c {
        void a(Uri uri);

        e build();

        void setExtras(Bundle bundle);

        void setFlags(int i14);
    }

    /* JADX INFO: renamed from: androidx.core.view.e$e, reason: collision with other inner class name */
    public static final class C0087e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f6422a;

        public C0087e(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f6422a = androidx.core.view.d.s(contentInfo);
        }

        @Override // androidx.core.view.e.f
        public final ContentInfo a() {
            return this.f6422a;
        }

        @Override // androidx.core.view.e.f
        public final ClipData b() {
            return this.f6422a.getClip();
        }

        @Override // androidx.core.view.e.f
        public final Uri c() {
            return this.f6422a.getLinkUri();
        }

        @Override // androidx.core.view.e.f
        public final Bundle getExtras() {
            return this.f6422a.getExtras();
        }

        @Override // androidx.core.view.e.f
        public final int getFlags() {
            return this.f6422a.getFlags();
        }

        @Override // androidx.core.view.e.f
        public final int getSource() {
            return this.f6422a.getSource();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f6422a + StringSubstitutor.DEFAULT_VAR_END;
        }
    }

    public interface f {
        ContentInfo a();

        ClipData b();

        Uri c();

        Bundle getExtras();

        int getFlags();

        int getSource();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f6423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f6426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f6427e;

        public g(d dVar) {
            ClipData clipData = dVar.f6417a;
            clipData.getClass();
            this.f6423a = clipData;
            int i14 = dVar.f6418b;
            k7.h.c(i14, 0, 5, "source");
            this.f6424b = i14;
            int i15 = dVar.f6419c;
            if ((i15 & 1) != i15) {
                am.j.w(Integer.toHexString(i15), ", but only 0x", Integer.toHexString(1), " are allowed", "Requested flags 0x");
                throw null;
            }
            this.f6425c = i15;
            this.f6426d = dVar.f6420d;
            this.f6427e = dVar.f6421e;
        }

        @Override // androidx.core.view.e.f
        public final ContentInfo a() {
            return null;
        }

        @Override // androidx.core.view.e.f
        public final ClipData b() {
            return this.f6423a;
        }

        @Override // androidx.core.view.e.f
        public final Uri c() {
            return this.f6426d;
        }

        @Override // androidx.core.view.e.f
        public final Bundle getExtras() {
            return this.f6427e;
        }

        @Override // androidx.core.view.e.f
        public final int getFlags() {
            return this.f6425c;
        }

        @Override // androidx.core.view.e.f
        public final int getSource() {
            return this.f6424b;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb3 = new StringBuilder("ContentInfoCompat{clip=");
            sb3.append(this.f6423a.getDescription());
            sb3.append(", source=");
            int i14 = this.f6424b;
            if (i14 == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i14 == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i14 == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i14 == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i14 != 4) {
                strValueOf = i14 != 5 ? String.valueOf(i14) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb3.append(strValueOf);
            sb3.append(", flags=");
            int i15 = this.f6425c;
            sb3.append((i15 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i15));
            Uri uri = this.f6426d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb3.append(str);
            return am.j.o(this.f6427e != null ? ", hasExtras" : "", StringSubstitutor.DEFAULT_VAR_END, sb3);
        }
    }

    public e(f fVar) {
        this.f6414a = fVar;
    }

    public final String toString() {
        return this.f6414a.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f6415a;

        public a(e eVar) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f6415a = new b(eVar);
            } else {
                this.f6415a = new d(eVar);
            }
        }

        public a(ClipData clipData, int i14) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f6415a = new b(clipData, i14);
            } else {
                this.f6415a = new d(clipData, i14);
            }
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f6416a;

        public b(e eVar) {
            androidx.core.view.d.u();
            ContentInfo contentInfoA = eVar.f6414a.a();
            Objects.requireNonNull(contentInfoA);
            this.f6416a = androidx.core.view.d.q(androidx.core.view.d.s(contentInfoA));
        }

        @Override // androidx.core.view.e.c
        public final void a(Uri uri) {
            this.f6416a.setLinkUri(uri);
        }

        @Override // androidx.core.view.e.c
        public final e build() {
            return new e(new C0087e(this.f6416a.build()));
        }

        @Override // androidx.core.view.e.c
        public final void setExtras(Bundle bundle) {
            this.f6416a.setExtras(bundle);
        }

        @Override // androidx.core.view.e.c
        public final void setFlags(int i14) {
            this.f6416a.setFlags(i14);
        }

        public b(ClipData clipData, int i14) {
            this.f6416a = androidx.core.view.d.p(clipData, i14);
        }
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f6417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f6420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f6421e;

        public d(e eVar) {
            this.f6417a = eVar.f6414a.b();
            f fVar = eVar.f6414a;
            this.f6418b = fVar.getSource();
            this.f6419c = fVar.getFlags();
            this.f6420d = fVar.c();
            this.f6421e = fVar.getExtras();
        }

        @Override // androidx.core.view.e.c
        public final void a(Uri uri) {
            this.f6420d = uri;
        }

        @Override // androidx.core.view.e.c
        public final e build() {
            return new e(new g(this));
        }

        @Override // androidx.core.view.e.c
        public final void setExtras(Bundle bundle) {
            this.f6421e = bundle;
        }

        @Override // androidx.core.view.e.c
        public final void setFlags(int i14) {
            this.f6419c = i14;
        }

        public d(ClipData clipData, int i14) {
            this.f6417a = clipData;
            this.f6418b = i14;
        }
    }
}
