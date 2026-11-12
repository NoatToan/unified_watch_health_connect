package v12;

import am.x0;
import androidx.lifecycle.u1;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\t\nB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lv12/p;", "Landroidx/lifecycle/u1;", "Lip/i;", "activityPrivacyRepo", "", "Lam/x0;", "topActivityTypes", "<init>", "(Lip/i;Ljava/util/List;)V", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip.i f174790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f174791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f174792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f174793d;

    public p(ip.i iVar, List<? extends x0> list) {
        iVar.getClass();
        list.getClass();
        this.f174790a = iVar;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ip.a((x0) it.next(), null, 2, null));
        }
        p2 p2VarA = q2.a(new a(arrayList, false, false, 6, null));
        this.f174791b = p2VarA;
        this.f174792c = g2.b(0, 0, null, 7);
        this.f174793d = p2VarA;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lv12/p$b;", "", "<init>", "()V", "c", "b", "d", "a", "Lv12/p$b$a;", "Lv12/p$b$b;", "Lv12/p$b$c;", "Lv12/p$b$d;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv12/p$b$a;", "Lv12/p$b;", "Lfw/c;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lfw/c;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final fw.c f174797a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fw.c cVar) {
                super(null);
                cVar.getClass();
                this.f174797a = cVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f174797a, ((a) obj).f174797a);
            }

            public final int hashCode() {
                return this.f174797a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f174797a + ")";
            }
        }

        /* JADX INFO: renamed from: v12.p$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/p$b$b;", "Lv12/p$b;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3255b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3255b f174798a = new C3255b();

            private C3255b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/p$b$c;", "Lv12/p$b;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f174799a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/p$b$d;", "Lv12/p$b;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f174800a = new d();

            private d() {
                super(null);
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv12/p$a;", "", "", "Lip/a;", "privacyLevels", "", "isUpdateButtonActive", "isConfirmationDialogVisible", "<init>", "(Ljava/util/List;ZZ)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ip.a> f174794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f174795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f174796c;

        public /* synthetic */ a(List list, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
            this(list, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15);
        }

        public static a a(a aVar, List list, boolean z14, boolean z15, int i14) {
            if ((i14 & 1) != 0) {
                list = aVar.f174794a;
            }
            if ((i14 & 2) != 0) {
                z14 = aVar.f174795b;
            }
            if ((i14 & 4) != 0) {
                z15 = aVar.f174796c;
            }
            aVar.getClass();
            list.getClass();
            return new a(list, z14, z15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f174794a, aVar.f174794a) && this.f174795b == aVar.f174795b && this.f174796c == aVar.f174796c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f174796c) + q6.f.g(this.f174794a.hashCode() * 31, 31, this.f174795b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("State(privacyLevels=");
            sb3.append(this.f174794a);
            sb3.append(", isUpdateButtonActive=");
            sb3.append(this.f174795b);
            sb3.append(", isConfirmationDialogVisible=");
            return hb.a.k(sb3, this.f174796c, ")");
        }

        public a(List<ip.a> list, boolean z14, boolean z15) {
            list.getClass();
            this.f174794a = list;
            this.f174795b = z14;
            this.f174796c = z15;
        }
    }
}
