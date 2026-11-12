package com.garmin.android.apps.connectmobile.performance.picker;

import am.j;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import c53.c0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableTwoLineRow;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k32.h;
import lc.u0;
import n71.g;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.w;
import p13.y;
import po2.o;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "c", JWKParameterNames.RSA_EXPONENT, "d", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ItemPickerActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f39974a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$c;", "Landroid/os/Parcelable;", "T", "Lg/a;", "Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$c$a;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c<T extends Parcelable> extends g.a<a<T>, T> {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$c$a;", "Landroid/os/Parcelable;", "T", "", "title", "", "Lcom/garmin/android/apps/connectmobile/performance/picker/b;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "currentSelected", "Lq61/a;", "pickerViewConfig", "<init>", "(Ljava/lang/String;Ljava/util/List;Landroid/os/Parcelable;Lq61/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class a<T extends Parcelable> implements Parcelable {
            public static final Parcelable.Creator<a<?>> CREATOR = new C0740a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f39983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List<com.garmin.android.apps.connectmobile.performance.picker.b<T>> f39984b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final T f39985c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final q61.a<T> f39986d;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class C0740a implements Parcelable.Creator<a<?>> {
                @Override // android.os.Parcelable.Creator
                public final a<?> createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    String string = parcel.readString();
                    int i14 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i14);
                    int iD = 0;
                    while (iD != i14) {
                        iD = u0.d(a.class, parcel, arrayList, iD, 1);
                    }
                    return new a<>(string, arrayList, parcel.readParcelable(a.class.getClassLoader()), (q61.a) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final a<?>[] newArray(int i14) {
                    return new a[i14];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(String str, List<? extends com.garmin.android.apps.connectmobile.performance.picker.b<? extends T>> list, T t7, q61.a<T> aVar) {
                str.getClass();
                list.getClass();
                t7.getClass();
                aVar.getClass();
                this.f39983a = str;
                this.f39984b = list;
                this.f39985c = t7;
                this.f39986d = aVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f39983a.equals(aVar.f39983a) && this.f39984b.equals(aVar.f39984b) && this.f39985c.equals(aVar.f39985c) && this.f39986d.equals(aVar.f39986d);
            }

            public final int hashCode() {
                return this.f39986d.hashCode() + ((this.f39985c.hashCode() + u0.b(this.f39983a.hashCode() * 31, 31, this.f39984b)) * 31);
            }

            public final String toString() {
                StringBuilder sbG = l2.g("Input(title=", this.f39983a, ", entries=", this.f39984b, ", currentSelected=");
                sbG.append(this.f39985c);
                sbG.append(", pickerViewConfig=");
                sbG.append(this.f39986d);
                sbG.append(")");
                return sbG.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i14) {
                parcel.getClass();
                parcel.writeString(this.f39983a);
                Iterator itE = kg.f.e(this.f39984b, parcel);
                while (itE.hasNext()) {
                    parcel.writeParcelable((Parcelable) itE.next(), i14);
                }
                parcel.writeParcelable(this.f39985c, i14);
                parcel.writeParcelable(this.f39986d, i14);
            }
        }

        @Override // g.a
        public final Intent a(Context context, Object obj) {
            a aVar = (a) obj;
            context.getClass();
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) ItemPickerActivity.class);
            intent.putExtra("extra.input", aVar);
            return intent;
        }

        @Override // g.a
        public final Object c(int i14, Intent intent) {
            Parcelable parcelableExtra;
            if (i14 != -1) {
                return null;
            }
            if (intent != null && (parcelableExtra = intent.getParcelableExtra("extra.result")) != null) {
                return parcelableExtra;
            }
            kg.f.n("Should not be a null intent if resultCode is RESULT_OK");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$d;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow;", "checkableRow", "<init>", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMCheckableTwoLineRow;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends RecyclerView.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f39987b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GCMCheckableTwoLineRow f39988a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(GCMCheckableTwoLineRow gCMCheckableTwoLineRow) {
            super(gCMCheckableTwoLineRow);
            gCMCheckableTwoLineRow.getClass();
            this.f39988a = gCMCheckableTwoLineRow;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$e;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f39989a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view2) {
            super(view2);
            view2.getClass();
            this.f39989a = new h(view2);
            view2.setPadding(view2.getPaddingLeft(), view2.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal), view2.getPaddingRight(), view2.getPaddingBottom());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements l<Parcelable, Unit> {
        public f(Object obj) {
            super(1, obj, ItemPickerActivity.class, "onCurrentSelectedChanged", "onCurrentSelectedChanged(Landroid/os/Parcelable;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Parcelable parcelable) {
            Parcelable parcelable2 = parcelable;
            parcelable2.getClass();
            ((ItemPickerActivity) this.receiver).f39974a = parcelable2;
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_recycler_view_layout);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra.input", c.a.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra.input") : null;
            if (!(parcelableExtra instanceof c.a)) {
                parcelableExtra = null;
            }
            parcelable = (c.a) parcelableExtra;
        }
        c.a aVar = (c.a) parcelable;
        if (aVar == null) {
            throw new RuntimeException();
        }
        String str = aVar.f39983a;
        List<com.garmin.android.apps.connectmobile.performance.picker.b<T>> list = aVar.f39984b;
        T t7 = aVar.f39985c;
        q61.a<T> aVar2 = aVar.f39986d;
        this.f39974a = t7;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        a aVar3 = new a(aVar2, new f(this));
        q13.b bVarB = w.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.garmin.android.apps.connectmobile.performance.picker.b bVar = (com.garmin.android.apps.connectmobile.performance.picker.b) it.next();
            if (bVar instanceof com.garmin.android.apps.connectmobile.performance.picker.b.a) {
                T t14 = ((com.garmin.android.apps.connectmobile.performance.picker.b.a) bVar).f39995a;
                bVarB.add(new a.b.C0738a(t14, s.g(t14, t7)));
            } else {
                if (!(bVar instanceof com.garmin.android.apps.connectmobile.performance.picker.b.C0742b)) {
                    u0.r();
                    return;
                }
                com.garmin.android.apps.connectmobile.performance.picker.b.C0742b c0742b = (com.garmin.android.apps.connectmobile.performance.picker.b.C0742b) bVar;
                bVarB.add(new a.b.C0739b(c0742b.f39996a));
                Collection<Parcelable> collection = c0742b.f39997b;
                ArrayList arrayList = new ArrayList(y.r(collection, 10));
                for (Parcelable parcelable2 : collection) {
                    arrayList.add(new a.b.C0738a(parcelable2, s.g(parcelable2, t7)));
                }
                bVarB.addAll(arrayList);
            }
        }
        aVar3.t(w.a(bVarB));
        List<T> list2 = aVar3.f10698a.f10426f;
        list2.getClass();
        Iterator it3 = list2.iterator();
        int i14 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i14 = -1;
                break;
            }
            a.b bVar2 = (a.b) it3.next();
            if (bVar2 instanceof a.b.C0738a ? ((a.b.C0738a) bVar2).f39980b : false) {
                break;
            } else {
                i14++;
            }
        }
        RecyclerView.p layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager2 = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager2 != null) {
            Resources resources = recyclerView.getResources();
            resources.getClass();
            linearLayoutManager2.scrollToPositionWithOffset(i14, MathKt.c(xy2.b.n(resources, 112.0f)));
        }
        recyclerView.setAdapter(aVar3);
        Iterator it4 = aVar2.G2(this).iterator();
        while (it4.hasNext()) {
            recyclerView.addItemDecoration((RecyclerView.o) it4.next());
        }
        initActionBar(str, 2);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.menu_done, menu);
        menu.findItem(R.id.menu_item_done).setEnabled(true);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_done) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        Parcelable parcelable = this.f39974a;
        if (parcelable == null) {
            s.m("currentSelected");
            throw null;
        }
        setResult(-1, intent.putExtra("extra.result", parcelable));
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\f\r\u000eB)\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012²\u0006\u0014\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Lq61/a;", "Landroid/os/Parcelable;", "viewDataProvider", "Lkotlin/Function1;", "", "onCurrentSelectedChanged", "<init>", "(Lq61/a;Le23/l;)V", "b", "c", "d", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "layoutInflater", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends x<b, RecyclerView.f0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f39975d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q61.a<Parcelable> f39976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l<Parcelable, Unit> f39977c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class C0737a extends q implements p<b, Object, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0737a f39978a = new C0737a();

            public C0737a() {
                super(2, b.class, "equals", "equals(Ljava/lang/Object;)Z", 0);
            }

            @Override // e23.p
            public final Boolean invoke(b bVar, Object obj) {
                b bVar2 = bVar;
                bVar2.getClass();
                return Boolean.valueOf(bVar2.equals(obj));
            }
        }

        public interface b {

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b$a;", "Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b;", "Landroid/os/Parcelable;", "data", "", "isChecked", "<init>", "(Landroid/os/Parcelable;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C0738a implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Parcelable f39979a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public boolean f39980b;

                public C0738a(Parcelable parcelable, boolean z14) {
                    parcelable.getClass();
                    this.f39979a = parcelable;
                    this.f39980b = z14;
                }

                @Override // com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity.a.b
                public final int getViewType() {
                    return 0;
                }
            }

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity$a$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b$b;", "Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$b;", "", "name", "<init>", "(Ljava/lang/String;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C0739b implements b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f39981a;

                public C0739b(String str) {
                    str.getClass();
                    this.f39981a = str;
                }

                @Override // com.garmin.android.apps.connectmobile.performance.picker.ItemPickerActivity.a.b
                public final int getViewType() {
                    return 1;
                }
            }

            int getViewType();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$c;", "", "", "isChecked", "<init>", "(Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f39982a;

            public c(boolean z14) {
                this.f39982a = z14;
            }
        }

        static {
            new d(null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q61.a<Parcelable> aVar, l<? super Parcelable, Unit> lVar) {
            aVar.getClass();
            lVar.getClass();
            C0737a c0737a = C0737a.f39978a;
            c0737a.getClass();
            super(new n71.a(c0737a));
            this.f39976b = aVar;
            this.f39977c = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            return r(i14).getViewType();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            f0Var.getClass();
            b bVarR = r(i14);
            if (!(bVarR instanceof b.C0738a)) {
                if (!(bVarR instanceof b.C0739b)) {
                    u0.r();
                    return;
                }
                if (!(f0Var instanceof e)) {
                    vb.h.s("Failed requirement.");
                    return;
                }
                String str = ((b.C0739b) bVarR).f39981a;
                h hVar = ((e) f0Var).f39989a;
                hVar.getClass();
                TextView textView = hVar.f102692a;
                if (textView != null) {
                    textView.setText(str);
                    return;
                }
                return;
            }
            if (!(f0Var instanceof d)) {
                vb.h.s("Failed requirement.");
                return;
            }
            b.C0738a c0738a = (b.C0738a) bVarR;
            Parcelable parcelable = c0738a.f39979a;
            Context context = f0Var.itemView.getContext();
            GCMCheckableTwoLineRow gCMCheckableTwoLineRow = ((d) f0Var).f39988a;
            context.getClass();
            q61.a<Parcelable> aVar = this.f39976b;
            String strA = n71.h.a(context, aVar.X(parcelable));
            g gVarO4 = aVar.o4(parcelable);
            String strA2 = gVarO4 != null ? n71.h.a(context, gVarO4) : null;
            boolean z14 = c0738a.f39980b;
            a83.a aVar2 = new a83.a(c0738a, this, i14, 12);
            gCMCheckableTwoLineRow.setTopLabel(strA);
            if (strA2 != null) {
                gCMCheckableTwoLineRow.setBottomLabel(strA2);
            } else {
                TextView textView2 = gCMCheckableTwoLineRow.f47754c;
                if (textView2 == null) {
                    s.m("mBottomLabelTextView");
                    throw null;
                }
                textView2.setVisibility(8);
            }
            gCMCheckableTwoLineRow.setChecked(z14);
            gCMCheckableTwoLineRow.setOnClickListener(new oq.a(aVar2, 6));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            t tVarB = m.b(new q42.d(viewGroup, 1));
            if (i14 == 0) {
                return new d(new GCMCheckableTwoLineRow(viewGroup.getContext()));
            }
            if (i14 != 1) {
                kg.f.n(j.h(i14, "Unknown viewType: "));
                return null;
            }
            View viewInflate = ((LayoutInflater) tVarB.getValue()).inflate(R.layout.gcm_group_header, viewGroup, false);
            viewInflate.getClass();
            return new e(viewInflate);
        }

        public final b.C0738a u() {
            Object obj = null;
            c53.g.a aVar = new c53.g.a(c0.p(new c53.m(new com.garmin.android.apps.connectmobile.performance.picker.a(this, null)), new o(22)));
            boolean z14 = false;
            while (aVar.hasNext()) {
                Object next = aVar.next();
                if (((b.C0738a) next).f39980b) {
                    if (z14) {
                        vb.h.s("Sequence contains more than one matching element.");
                        return null;
                    }
                    z14 = true;
                    obj = next;
                }
            }
            if (z14) {
                return (b.C0738a) obj;
            }
            n23.j.s("Sequence contains no element matching the predicate.");
            return null;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$a$d;", "", "<init>", "()V", "", "VIEW_TYPE_ITEM", "I", "VIEW_TYPE_SECTION_HEADER", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d {
            public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private d() {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List<Object> list) {
            f0Var.getClass();
            list.getClass();
            if (list.isEmpty()) {
                super.onBindViewHolder(f0Var, i14, list);
                return;
            }
            for (Object obj : list) {
                b bVarR = r(i14);
                if ((f0Var instanceof d) && (bVarR instanceof b.C0738a) && (obj instanceof c)) {
                    ((d) f0Var).f39988a.setChecked(((c) obj).f39982a);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/picker/ItemPickerActivity$b;", "", "<init>", "()V", "", "EXTRA_INPUT", "Ljava/lang/String;", "EXTRA_RESULT", "", "SCROLL_POSITION_OFFSET_IN_DP", "F", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
