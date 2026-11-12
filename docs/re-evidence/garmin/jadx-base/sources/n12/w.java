package n12;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ln12/w;", "Lhe/a;", "Li/c;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isEligible", "<init>", "(Li/c;Z)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends he.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f122333j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<a> f122334k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(i.c cVar, boolean z14) {
        super(cVar);
        cVar.getClass();
        this.f122333j = z14;
        a.f122335a.getClass();
        this.f122334k = z14 ? p13.x.k(a.f122336b, a.f122337c) : p13.w.c(a.f122336b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f122334k.size();
    }

    @Override // he.a
    public final Fragment u(int i14) {
        return this.f122334k.get(i14).b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln12/w$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2311a f122335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f122336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f122337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f122338d;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageTabsAdapter.ProfileImageTabItems.Frame", "Ln12/w$a;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {
            public b(String str, int i14) {
                super(str, i14, null);
            }

            @Override // n12.w.a
            public final int a() {
                return R.string.edit_profile_tab_title_frame;
            }

            @Override // n12.w.a
            public final Fragment b() {
                return new l();
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageTabsAdapter.ProfileImageTabItems.Image", "Ln12/w$a;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {
            public c(String str, int i14) {
                super(str, i14, null);
            }

            @Override // n12.w.a
            public final int a() {
                return R.string.edit_profile_tab_title_image;
            }

            @Override // n12.w.a
            public final Fragment b() {
                return new com.garmin.android.apps.connectmobile.userprofile.editimage.a();
            }
        }

        static {
            c cVar = new c("Image", 0);
            f122336b = cVar;
            b bVar = new b("Frame", 1);
            f122337c = bVar;
            f122338d = new a[]{cVar, bVar};
            f122335a = new C2311a(null);
        }

        public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f122338d.clone();
        }

        public abstract int a();

        public abstract Fragment b();

        /* JADX INFO: renamed from: n12.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln12/w$a$a;", "", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2311a {
            public /* synthetic */ C2311a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C2311a() {
            }
        }

        private a(String str, int i14) {
            super(str, i14);
        }
    }

    public /* synthetic */ w(i.c cVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(cVar, (i14 & 2) != 0 ? true : z14);
    }
}
