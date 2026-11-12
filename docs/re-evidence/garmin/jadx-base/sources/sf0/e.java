package sf0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import i3.e5;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lsf0/e;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "b", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f158826d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f158827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f158828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f158829c = new w1(s0.f105811a.b(j.class), new d(this), new f(this), new C2999e(null, this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lsf0/e$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lsf0/e$a$a;", "", "Luf0/a;", "devicesList", "Lkotlin/Function1;", "", "onDeviceSelected", "Lkotlin/Function0;", "onCancel", "<init>", "(Ljava/util/List;Le23/l;Le23/a;)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.h<C2998a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<uf0.a> f158830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.l<uf0.a, Unit> f158831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<Unit> f158832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Context f158833d;

        /* JADX INFO: renamed from: sf0.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsf0/e$a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2998a extends RecyclerView.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f158834a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2998a(View view2) {
                Resources resources;
                super(view2);
                view2.getClass();
                Context context = view2.getContext();
                Integer numValueOf = (context == null || (resources = context.getResources()) == null) ? null : Integer.valueOf((int) resources.getDimension(R.dimen.spacing_normal));
                View viewFindViewById = view2.findViewById(android.R.id.text1);
                TextView textView = (TextView) viewFindViewById;
                textView.setTextColor(a7.b.getColor(view2.getContext(), R.color.gcm_text_primary));
                textView.setTextSize(0, view2.getContext().getResources().getDimension(R.dimen.andfont_h_3));
                if (numValueOf != null) {
                    textView.setPadding(numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue(), numValueOf.intValue());
                }
                viewFindViewById.getClass();
                this.f158834a = (TextView) viewFindViewById;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<uf0.a> list, e23.l<? super uf0.a, Unit> lVar, e23.a<Unit> aVar) {
            list.getClass();
            lVar.getClass();
            aVar.getClass();
            this.f158830a = list;
            this.f158831b = lVar;
            this.f158832c = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f158830a.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemViewType(int i14) {
            return i14 == getItemCount() - 1 ? 2 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            C2998a c2998a = (C2998a) f0Var;
            c2998a.getClass();
            TextView textView = c2998a.f158834a;
            textView.setGravity(1);
            if (getItemViewType(i14) == 2) {
                Context context = this.f158833d;
                textView.setText(context != null ? context.getString(R.string.lbl_cancel) : null);
                textView.setOnClickListener(new oq.a(this, 23));
            } else {
                List<uf0.a> list = this.f158830a;
                String deviceName = list.get(i14).getDeviceName();
                textView.setText((deviceName == null || deviceName.length() <= 0) ? list.get(i14).getDeviceId() : list.get(i14).getDeviceName());
                textView.setOnClickListener(new b0(this, i14, 19));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            View viewE = e5.e(viewGroup, android.R.layout.simple_list_item_1, viewGroup, false);
            this.f158833d = viewGroup.getContext();
            viewE.getClass();
            return new C2998a(viewE);
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"sf0/e$c", "Lkotlin/Function1;", "Luf0/a;", "", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.l<uf0.a, Unit> {
        public c() {
        }

        @Override // e23.l
        public final Unit invoke(uf0.a aVar) {
            uf0.a aVar2 = aVar;
            aVar2.getClass();
            b bVar = e.f158826d;
            e eVar = e.this;
            j jVar = (j) eVar.f158829c.getValue();
            String str = eVar.f158828b;
            if (str == null) {
                s.m("dateRequested");
                throw null;
            }
            String deviceId = aVar2.getDeviceId();
            deviceId.getClass();
            ge1.b.T(v1.a(jVar), null, null, new l(jVar, str, deviceId, null), 3);
            eVar.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f158836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f158836a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f158836a.requireActivity().getF189591b();
        }
    }

    /* JADX INFO: renamed from: sf0.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2999e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f158837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f158838b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2999e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f158837a = aVar;
            this.f158838b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f158837a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f158838b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f158839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f158839a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f158839a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        String string;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.epoch_select_device_bottom_sheet, viewGroup, false);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = Build.VERSION.SDK_INT >= 33 ? arguments.getParcelableArrayList("DEVICES_LIST", uf0.a.class) : arguments.getParcelableArrayList("DEVICES_LIST");
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        }
        this.f158827a = arrayList;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("DATE_SELECTED")) == null) {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            string = fz0.d.b(dateTimeNow).toString();
        }
        this.f158828b = string;
        View viewFindViewById = viewInflate.findViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        ArrayList arrayList2 = this.f158827a;
        if (arrayList2 == null) {
            s.m("devicesList");
            throw null;
        }
        recyclerView.setAdapter(new a(arrayList2, new c(), new ro0.g(this, 21)));
        viewFindViewById.getClass();
        return viewInflate;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lsf0/e$b;", "", "<init>", "()V", "", "DEVICES_LIST", "Ljava/lang/String;", "DATE_SELECTED", "", "VIEW_TYPE_DEVICE", "I", "VIEW_TYPE_CANCEL", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
