package xb0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p1.z;
import p13.h0;
import sd2.f;
import vg1.z0;
import wv2.h;
import xa2.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lxb0/a;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "b", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f189862b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f189863a = new w1(s0.f105811a.b(yb0.a.class), new c(this), new e(this), new d(null, this));

    /* JADX INFO: renamed from: xb0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lxb0/a$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lxb0/a$a$a;", "", "Lsd2/f;", "devicesList", "Lkotlin/Function1;", "", "onDeviceSelected", "Lkotlin/Function0;", "onCancel", "<init>", "(Ljava/util/List;Le23/l;Le23/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3532a extends RecyclerView.h<C3533a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<f> f189864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<f, Unit> f189865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f189866c;

        /* JADX INFO: renamed from: xb0.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxb0/a$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3533a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f189867a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3533a(View view2) {
                Resources resources;
                super(view2);
                view2.getClass();
                Context context = view2.getContext();
                Integer numValueOf = (context == null || (resources = context.getResources()) == null) ? null : Integer.valueOf((int) resources.getDimension(R.dimen.spacing_normal));
                View viewFindViewById = view2.findViewById(android.R.id.text1);
                TextView textView = (TextView) viewFindViewById;
                textView.setTypeface(h22.a.a("font/roboto_regular.ttf", textView.getContext()));
                textView.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
                textView.setTextSize(0, view2.getContext().getResources().getDimension(R.dimen.andfont_body_1));
                if (numValueOf != null) {
                    textView.setPadding(numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue());
                }
                viewFindViewById.getClass();
                this.f189867a = (TextView) viewFindViewById;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C3532a(List<? extends f> list, l<? super f, Unit> lVar, e23.a<Unit> aVar) {
            list.getClass();
            lVar.getClass();
            aVar.getClass();
            this.f189864a = list;
            this.f189865b = lVar;
            this.f189866c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f189864a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            return i14 == getItemCount() - 1 ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            C3533a c3533a = (C3533a) f0Var;
            c3533a.getClass();
            TextView textView = c3533a.f189867a;
            textView.setGravity(1);
            if (getItemViewType(i14) == 2) {
                Context context = textView.getContext();
                textView.setText(context != null ? context.getString(R.string.lbl_cancel) : null);
                textView.setOnClickListener(new z0(this, 18));
            } else {
                f fVar = this.f189864a.get(i14);
                String displayName = fVar.getDisplayName();
                textView.setText((displayName == null || displayName.length() <= 0) ? String.valueOf(fVar.getUnitID()) : fVar.getDisplayName());
                textView.setOnClickListener(new h(4, this, fVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(android.R.layout.simple_list_item_1, viewGroup, false);
            viewGroup.getContext();
            viewInflate.getClass();
            return new C3533a(viewInflate);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f189868a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f189868a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f189868a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f189869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f189870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e23.a aVar, Fragment fragment) {
            super(0);
            this.f189869a = aVar;
            this.f189870b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f189869a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f189870b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f189871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f189871a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f189871a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.select_device_bottom_sheet, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        z<f> zVar = ((yb0.a) this.f189863a.getValue()).f195679b;
        zVar.getClass();
        ArrayList arrayList = new ArrayList();
        int iH = zVar.h();
        for (int i14 = 0; i14 < iH; i14++) {
            zVar.e(i14);
            arrayList.add(zVar.i(i14));
        }
        recyclerView.setAdapter(new C3532a(h0.b1(arrayList), new g(this, 1), new wd.c(this, 23)));
        viewFindViewById.getClass();
        return viewInflate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lxb0/a$b;", "", "<init>", "()V", "", "VIEW_TYPE_DEVICE", "I", "VIEW_TYPE_CANCEL", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
