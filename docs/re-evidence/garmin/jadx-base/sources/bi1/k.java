package bi1;

import a61.d0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import b21.s4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.a0;
import com.garmin.android.apps.connectmobile.devices.model.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbi1/k;", "Landroidx/fragment/app/i;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends androidx.fragment.app.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18044d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f18045a = new w1(s0.f105811a.b(r.class), new b(this), new d(this), new c(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f18046b = o13.m.b(new s4(this, 15));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<? extends b0> f18047c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18048a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18048a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f18048a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f18049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f18050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f18049a = aVar;
            this.f18050b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f18049a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f18050b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f18051a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18051a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f18051a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        List<b0> list;
        boolean zG;
        w1 w1Var = this.f18045a;
        r rVar = (r) w1Var.getValue();
        o13.t tVar = this.f18046b;
        u uVar = (u) tVar.getValue();
        uVar.getClass();
        Iterable iterable = (List) rVar.f18066c.get(rVar.f18064a.d());
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            a0 a0Var = (a0) obj;
            int i14 = r.a.f18067a[uVar.ordinal()];
            if (i14 == 1) {
                zG = p005kotlin.jvm.internal.s.g(a0Var.f34094b, Boolean.TRUE);
            } else {
                if (i14 != 2) {
                    u0.r();
                    return null;
                }
                zG = p005kotlin.jvm.internal.s.g(a0Var.f34095c, Boolean.TRUE);
            }
            if (zG) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0 b0Var = ((a0) it.next()).f34093a;
            if (b0Var != null) {
                arrayList2.add(b0Var);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List<? extends b0> listC = arrayList2;
        if (zIsEmpty) {
            listC = p13.w.c(b0.NONE);
        }
        this.f18047c = listC;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.gcm3_device_settings_vivomove3_picker, (ViewGroup) null);
        final NumberPicker numberPicker = (NumberPicker) viewInflate.findViewById(R.id.field_value);
        List<? extends b0> list2 = this.f18047c;
        if (list2 == null) {
            p005kotlin.jvm.internal.s.m("supportedComplications");
            throw null;
        }
        ArrayList arrayList3 = new ArrayList(y.r(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(numberPicker.getContext().getString(((b0) it3.next()).f34110a));
        }
        numberPicker.setDisplayedValues((String[]) arrayList3.toArray(new String[0]));
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setMinValue(0);
        List<? extends b0> list3 = this.f18047c;
        if (list3 == null) {
            p005kotlin.jvm.internal.s.m("supportedComplications");
            throw null;
        }
        numberPicker.setMaxValue(list3.size() - 1);
        List<? extends b0> list4 = this.f18047c;
        if (list4 == null) {
            p005kotlin.jvm.internal.s.m("supportedComplications");
            throw null;
        }
        bi1.a aVarX4 = ((r) w1Var.getValue()).x4();
        numberPicker.setValue(list4.indexOf((aVarX4 == null || (list = aVarX4.f18013b) == null) ? null : list.get(((u) tVar.getValue()).f18086a)));
        androidx.appcompat.app.e.a view2 = new androidx.appcompat.app.e.a(requireContext()).setView(viewInflate);
        Context context = getContext();
        final androidx.appcompat.app.e eVarCreate = view2.setTitle(context != null ? context.getString(((u) tVar.getValue()).f18087b) : null).setPositiveButton(R.string.lbl_done, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create();
        eVarCreate.getClass();
        eVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: bi1.j
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                k.a aVar = k.f18044d;
                eVarCreate.e(-1).setOnClickListener(new d0(13, numberPicker, this));
            }
        });
        return eVarCreate;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbi1/k$a;", "", "<init>", "()V", "", "WATCH_FACE_POSITION_KEY", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
