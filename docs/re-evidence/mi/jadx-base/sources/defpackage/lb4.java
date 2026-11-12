package defpackage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class lb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24847b;
    public boolean c;
    public boolean d;
    public long e;
    public long f;
    public long g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24848a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24849b = -1;
        public int c = -1;
        public String d = null;
        public long e = -1;
        public long f = -1;
        public long g = -1;

        public lb4 h(Context context) {
            return new lb4(context, this);
        }

        public a i(String str) {
            this.d = str;
            return this;
        }

        public a j(boolean z) {
            this.f24848a = z ? 1 : 0;
            return this;
        }

        public a k(long j) {
            this.f = j;
            return this;
        }

        public a l(boolean z) {
            this.f24849b = z ? 1 : 0;
            return this;
        }

        public a m(long j) {
            this.e = j;
            return this;
        }

        public a n(long j) {
            this.g = j;
            return this;
        }

        public a o(boolean z) {
            this.c = z ? 1 : 0;
            return this;
        }
    }

    public static lb4 a(Context context) {
        return b().j(true).i(ifs.b(context)).m(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED).l(false).k(86400L).o(false).n(86400L).h(context);
    }

    public static a b() {
        return new a();
    }

    public long c() {
        return this.f;
    }

    public long d() {
        return this.e;
    }

    public long e() {
        return this.g;
    }

    public boolean f() {
        return this.f24847b;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.d;
    }

    public String toString() {
        return "Config{mEventEncrypted=" + this.f24847b + ", mAESKey='" + this.f24846a + "', mMaxFileLength=" + this.e + ", mEventUploadSwitchOpen=" + this.c + ", mPerfUploadSwitchOpen=" + this.d + ", mEventUploadFrequency=" + this.f + ", mPerfUploadFrequency=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    public lb4(Context context, a aVar) {
        this.f24847b = true;
        this.c = false;
        this.d = false;
        this.e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        this.f = 86400L;
        this.g = 86400L;
        if (aVar.f24848a == 0) {
            this.f24847b = false;
        } else if (aVar.f24848a == 1) {
            this.f24847b = true;
        } else {
            this.f24847b = true;
        }
        if (TextUtils.isEmpty(aVar.d)) {
            this.f24846a = ifs.b(context);
        } else {
            this.f24846a = aVar.d;
        }
        if (aVar.e > -1) {
            this.e = aVar.e;
        } else {
            this.e = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        if (aVar.f > -1) {
            this.f = aVar.f;
        } else {
            this.f = 86400L;
        }
        if (aVar.g > -1) {
            this.g = aVar.g;
        } else {
            this.g = 86400L;
        }
        if (aVar.f24849b != 0 && aVar.f24849b == 1) {
            this.c = true;
        } else {
            this.c = false;
        }
        if (aVar.c == 0) {
            this.d = false;
        } else if (aVar.c == 1) {
            this.d = true;
        } else {
            this.d = false;
        }
    }
}
