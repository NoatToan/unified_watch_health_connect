package z6;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f202622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence[] f202623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f202624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f202625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f202626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<String> f202627g;

    public static class a {
        private a() {
        }

        public static int a(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        public static void b(RemoteInput.Builder builder, int i14) {
            builder.setEditChoicesBeforeSending(i14);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f202628a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f202631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence[] f202632e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f202629b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f202630c = new Bundle();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f202633f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f202634g = 0;

        public b(String str) {
            if (str != null) {
                this.f202628a = str;
            } else {
                vb.h.s("Result key can't be null");
                throw null;
            }
        }
    }

    public f0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z14, int i14, Bundle bundle, Set<String> set) {
        this.f202621a = str;
        this.f202622b = charSequence;
        this.f202623c = charSequenceArr;
        this.f202624d = z14;
        this.f202625e = i14;
        this.f202626f = bundle;
        this.f202627g = set;
        if (i14 != 2 || z14) {
            return;
        }
        vb.h.s("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }
}
