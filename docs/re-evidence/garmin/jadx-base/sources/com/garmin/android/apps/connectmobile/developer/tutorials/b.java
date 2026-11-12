package com.garmin.android.apps.connectmobile.developer.tutorials;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import k80.d;
import k80.f;
import o13.m;
import o13.t;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tb0.q;
import tb0.y;
import vb.h;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33722b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33723a = m.b(new f(this, 2));

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_composable_container, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        AbstractC0563b abstractC0563b = (AbstractC0563b) this.f33723a.getValue();
        if ((abstractC0563b != null ? abstractC0563b.getF33724a() : null) == null) {
            y6();
        }
        ((ComposeView) view2.findViewById(R.id.composable_container)).setContent(new e(1349491498, true, new ik1.c(this, 20)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    public final void u6(Uri uri, l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-776165317);
        int i15 = i14 | (o0VarE.r(uri) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            StringQualifier stringQualifierNamed = QualifierKt.named("ZipGestureTutorial");
            boolean zR = o0VarE.r(uri);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new k80.e(uri, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k80.e(uri, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(q.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), stringQualifierNamed, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
            o0VarE.g0(false);
            q qVar = (q) u1VarResolveViewModel;
            o90.a aVar3 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (j) null);
            boolean zR2 = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new f(this, 3);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(this, 3);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean zR3 = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new f(this, 4);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new f(this, 4);
                    o0VarE.K(objQ3);
                }
            }
            tb0.e.a(qVar, "Testing Device", aVar3, aVar4, (e23.a) objQ3, lVar, null, o0VarE, ((i15 << 12) & 458752) | (o90.a.f130960i << 6) | 56, 64);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, uri, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    public final void v6(Uri uri, l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-354725220);
        int i15 = i14 | (o0VarE.r(uri) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            StringQualifier stringQualifierNamed = QualifierKt.named("ZipPairTutorial");
            boolean zR = o0VarE.r(uri);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new k80.e(uri, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k80.e(uri, 0);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(y.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), stringQualifierNamed, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar2);
            o0VarE.g0(false);
            y yVar = (y) u1VarResolveViewModel;
            o90.a aVar3 = new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (j) null);
            boolean zR2 = o0VarE.r(this);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new f(this, 0);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(this, 0);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            boolean zR3 = o0VarE.r(this);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new f(this, 1);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new f(this, 1);
                    o0VarE.K(objQ3);
                }
            }
            tb0.l.a(yVar, "Testing Device", aVar3, aVar4, (e23.a) objQ3, lVar, o0VarE, (o90.a.f130960i << 6) | 56 | ((i15 << 12) & 458752));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(this, uri, lVar, i14, 1);
        }
    }

    public final void w6(AbstractC0563b abstractC0563b, l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-644790219);
        int i15 = (o0VarE.r(abstractC0563b) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(this) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            if (abstractC0563b instanceof AbstractC0563b.C0565b) {
                o0VarE.C(-1851498619);
                v6(((AbstractC0563b.C0565b) abstractC0563b).f33726b, lVar, o0VarE, i15 & 1008);
                o0VarE.g0(false);
            } else if (abstractC0563b instanceof AbstractC0563b.a) {
                o0VarE.C(-1851354779);
                u6(((AbstractC0563b.a) abstractC0563b).f33725b, lVar, o0VarE, i15 & 1008);
                o0VarE.g0(false);
            } else {
                if (abstractC0563b != null) {
                    throw kg.f.h(o0VarE, -1168106086, false);
                }
                o0VarE.C(-1851231554);
                o0VarE.g0(false);
                y6();
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(this, abstractC0563b, false, lVar, i14, 8);
        }
    }

    public final void y6() {
        getParentFragmentManager().Z();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$a;", "", "<init>", "()V", "", "ZIP_TUTORIAL_DATA_KEY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "b", "a", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b$a;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC0563b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f33724a;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.b$b$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b$a;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a extends AbstractC0563b {
            public static final Parcelable.Creator<a> CREATOR = new C0564a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Uri f33725b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.b$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0564a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new a((Uri) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i14) {
                    return new a[i14];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Uri uri) {
                super(uri, null);
                uri.getClass();
                this.f33725b = uri;
            }

            @Override // com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final Uri getF33724a() {
                return this.f33725b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.g(this.f33725b, ((a) obj).f33725b);
            }

            public final int hashCode() {
                return this.f33725b.hashCode();
            }

            public final String toString() {
                return "Gesture(uri=" + this.f33725b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeParcelable(this.f33725b, i14);
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.b$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b$b;", "Lcom/garmin/android/apps/connectmobile/developer/tutorials/b$b;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C0565b extends AbstractC0563b {
            public static final Parcelable.Creator<C0565b> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Uri f33726b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.developer.tutorials.b$b$b$a */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0565b> {
                @Override // android.os.Parcelable.Creator
                public final C0565b createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new C0565b((Uri) parcel.readParcelable(C0565b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final C0565b[] newArray(int i14) {
                    return new C0565b[i14];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0565b(Uri uri) {
                super(uri, null);
                uri.getClass();
                this.f33726b = uri;
            }

            @Override // com.garmin.android.apps.connectmobile.developer.tutorials.b.AbstractC0563b
            /* JADX INFO: renamed from: b, reason: from getter */
            public final Uri getF33724a() {
                return this.f33726b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0565b) && s.g(this.f33726b, ((C0565b) obj).f33726b);
            }

            public final int hashCode() {
                return this.f33726b.hashCode();
            }

            public final String toString() {
                return "Pairing(uri=" + this.f33726b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeParcelable(this.f33726b, i14);
            }
        }

        private AbstractC0563b(Uri uri) {
            this.f33724a = uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public Uri getF33724a() {
            return this.f33724a;
        }

        public /* synthetic */ AbstractC0563b(Uri uri, j jVar) {
            this(uri);
        }
    }
}
