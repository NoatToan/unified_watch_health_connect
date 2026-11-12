package com.garmin.android.apps.connectmobile.golf.truswing;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.m;
import androidx.lifecycle.b0;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingSessionDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.o0;
import com.garmin.android.apps.connectmobile.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import wd2.h0;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a extends o0 implements j.c {
    public j A;
    public c D;
    public com.garmin.android.apps.connectmobile.golf.truswing.c F;
    public q1 I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Menu f35801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MenuItem f35802x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f35803y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SwingSessionDTO f35804z;
    public int B = 0;
    public int C = 0;
    public final cl0.b E = (cl0.b) KoinJavaComponent.get(cl0.b.class);

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.golf.truswing.a$a, reason: collision with other inner class name */
    public class C0623a implements s {
        public C0623a() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            a.this.f35801w = menu;
        }

        @Override // androidx.core.view.s
        public final void Z4(Menu menu) {
            cl0.a.e().getClass();
            boolean zH = cl0.a.h();
            a aVar = a.this;
            aVar.getClass();
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_cancel);
            aVar.f35802x = menu.findItem(R.id.menu_item_sort);
            menuItemFindItem.setVisible(zH);
            aVar.f35802x.setVisible(!zH);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            a2 a2Var = a2.GOLF;
            i2.a(a2Var, "AbstractSwingSFragment", "Menu item [" + ((Object) menuItem.getTitle()) + "] clicked.");
            int itemId = menuItem.getItemId();
            a aVar = a.this;
            if (itemId == R.id.menu_item_sort) {
                new d(aVar.B, new wl0.b(aVar)).show(aVar.getFragmentManager(), (String) null);
                return false;
            }
            if (itemId != R.id.menu_item_cancel) {
                if (itemId != 16908332) {
                    return false;
                }
                aVar.requireActivity().onBackPressed();
                return false;
            }
            aVar.getClass();
            cl0.a.e().getClass();
            if (!((cl0.b) KoinJavaComponent.get(cl0.b.class)).G()) {
                i2.f36769a.getClass();
                i2.a.f(a2Var, "AbstractSwingSFragment", "Could not cancel compare mode");
                return false;
            }
            aVar.getActivity().invalidateOptionsMenu();
            j jVar = aVar.A;
            jVar.f35861g = null;
            jVar.notifyDataSetChanged();
            aVar.i7();
            return false;
        }
    }

    public static class b extends androidx.fragment.app.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EditText f35807b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC0624a f35808c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.golf.truswing.a$b$a, reason: collision with other inner class name */
        public interface InterfaceC0624a {
        }

        public b(String str, InterfaceC0624a interfaceC0624a) {
            this.f35806a = str;
            this.f35808c = interfaceC0624a;
        }

        @Override // androidx.fragment.app.i
        public final Dialog onCreateDialog(Bundle bundle) {
            if (getActivity() == null) {
                return super.onCreateDialog(bundle);
            }
            View viewInflate = ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
            EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edit_text);
            this.f35807b = editText;
            editText.setText(this.f35806a);
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(getActivity()).setTitle(R.string.golf_lbl_add_session_note).setCancelable(true).setView(viewInflate).setPositiveButton(R.string.lbl_done, new sa2.b(this, 25)).create();
            eVarCreate.getWindow().setSoftInputMode(4);
            return eVarCreate;
        }
    }

    public interface c {
        void C4();
    }

    public static class d extends androidx.fragment.app.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC0625a f35810b;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.golf.truswing.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0625a {
        }

        public d(int i14, InterfaceC0625a interfaceC0625a) {
            this.f35809a = i14;
            this.f35810b = interfaceC0625a;
        }

        @Override // androidx.fragment.app.i
        public final Dialog onCreateDialog(Bundle bundle) {
            m activity = getActivity();
            if (activity == null) {
                return super.onCreateDialog(bundle);
            }
            return new androidx.appcompat.app.e.a(activity).setTitle(R.string.lbl_sort).setPositiveButton(R.string.lbl_cancel, new vu1.k(5)).setSingleChoiceItems(new String[]{getString(R.string.golf_sort_by_swing_order), getString(R.string.golf_sort_by_club_type)}, this.f35809a, new sa2.b(this, 26)).create();
        }
    }

    public static void m7(List list) {
        if (list != null) {
            Collections.sort(list, new tl2.g(11));
            int i14 = 0;
            while (i14 < list.size()) {
                SwingDTO swingDTO = (SwingDTO) list.get(i14);
                i14++;
                swingDTO.f35881j = i14;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0
    public final void I6() {
        d7();
    }

    public abstract boolean T6(SwingDTO swingDTO);

    public final void U6() {
        j jVar = this.A;
        if (jVar != null) {
            jVar.f35861g = Y6();
            this.A.notifyDataSetChanged();
        }
        m activity = getActivity();
        int i14 = SwingDetailsActivity.f35774o;
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) SwingDetailsActivity.class);
            intent.setAction("GCM_action_swings_compare");
            activity.startActivity(intent);
        }
    }

    public void V6(SwingDTO swingDTO) {
        m activity = getActivity();
        boolean z14 = this.f35804z.f35886e == 1;
        int i14 = SwingDetailsActivity.f35774o;
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) SwingDetailsActivity.class);
            intent.putExtra("GCM_swing_dto", swingDTO);
            intent.putExtra("GCM_last_swing", z14);
            intent.setAction("GCM_action_swings_historical");
            activity.startActivity(intent);
        }
    }

    public abstract void X6();

    public abstract List<Long> Y6();

    public abstract boolean c7(List<Long> list, SwingDTO swingDTO);

    public abstract void d7();

    public final void e7() {
        int i14 = this.C - 1;
        this.C = i14;
        if (i14 <= 0) {
            boolean z14 = this.f35804z != null;
            MenuItem menuItem = this.f35802x;
            if (menuItem != null) {
                menuItem.setVisible(z14);
            }
        }
        F6();
    }

    public final void f7() {
        S6();
        this.C++;
        MenuItem menuItem = this.f35802x;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    public final void g7() {
        List<SwingDTO> list;
        List<SwingDTO> list2;
        int i14 = this.B;
        SwingSessionDTO swingSessionDTO = this.f35804z;
        if (i14 != 1) {
            if (swingSessionDTO == null || (list2 = swingSessionDTO.f35888g) == null || list2.isEmpty()) {
                j7(null);
                return;
            }
            List<SwingDTO> list3 = this.f35804z.f35888g;
            m7(list3);
            j7(list3);
            return;
        }
        if (swingSessionDTO == null || (list = swingSessionDTO.f35888g) == null || list.isEmpty()) {
            j7(null);
            return;
        }
        List<SwingDTO> list4 = this.f35804z.f35888g;
        m7(list4);
        ArrayList arrayList = new ArrayList(list4);
        Collections.sort(arrayList, new tl2.g(10));
        j7(arrayList);
    }

    public void h7() {
        f7();
        SwingSessionDTO swingSessionDTO = this.f35804z;
        if (swingSessionDTO.f35887f == null) {
            swingSessionDTO.f35887f = this.E.k(swingSessionDTO.f35885d);
        }
        com.garmin.android.apps.connectmobile.golf.truswing.c cVar = this.F;
        SwingSessionDTO swingSessionDTO2 = this.f35804z;
        cVar.getClass();
        swingSessionDTO2.getClass();
        androidx.lifecycle.m.a(null, new wl0.s(cVar, swingSessionDTO2, null), 3).f(this, new h0(this, 2));
    }

    public final void i7() {
        SwingSessionDTO swingSessionDTO = this.f35804z;
        cl0.b bVar = this.E;
        boolean z14 = (swingSessionDTO == null || (TextUtils.isEmpty(swingSessionDTO.f35887f) && TextUtils.isEmpty(bVar.k(this.f35804z.f35885d)))) ? false : true;
        cl0.a.e().getClass();
        boolean zH = cl0.a.h();
        View.OnClickListener onClickListener = null;
        if (!z14) {
            int i14 = zH ? R.style.GCMAddGolfSessionNoteTextStyle_Disabled : R.style.GCMAddGolfSessionNoteTextStyle;
            this.f35803y.setText(getString(R.string.golf_lbl_add_session_note));
            this.f35803y.setTextAppearance(getActivity(), i14);
            this.f35803y.setGravity(1);
            if (!zH) {
                final int i15 = 1;
                onClickListener = new View.OnClickListener(this) { // from class: wl0.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.a f185891b;

                    {
                        this.f185891b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                com.garmin.android.apps.connectmobile.golf.truswing.a aVar = this.f185891b;
                                if (TextUtils.isEmpty(aVar.f35804z.f35887f)) {
                                    SwingSessionDTO swingSessionDTO2 = aVar.f35804z;
                                    swingSessionDTO2.f35887f = aVar.E.k(swingSessionDTO2.f35885d);
                                }
                                new com.garmin.android.apps.connectmobile.golf.truswing.a.b(aVar.f35804z.f35887f, new b(aVar)).show(aVar.getFragmentManager(), (String) null);
                                break;
                            default:
                                com.garmin.android.apps.connectmobile.golf.truswing.a aVar2 = this.f185891b;
                                SwingSessionDTO swingSessionDTO3 = aVar2.f35804z;
                                new com.garmin.android.apps.connectmobile.golf.truswing.a.b(swingSessionDTO3 != null ? swingSessionDTO3.f35887f : null, new b(aVar2)).show(aVar2.getFragmentManager(), (String) null);
                                break;
                        }
                    }
                };
            }
            this.f35803y.setOnClickListener(onClickListener);
            this.f35803y.setVisibility(0);
            return;
        }
        TextView textView = this.f35803y;
        boolean zIsEmpty = TextUtils.isEmpty(this.f35804z.f35887f);
        SwingSessionDTO swingSessionDTO2 = this.f35804z;
        textView.setText(!zIsEmpty ? swingSessionDTO2.f35887f : bVar.k(swingSessionDTO2.f35885d));
        this.f35803y.setTextAppearance(getActivity(), R.style.GCMGolfSessionNoteTextStyle);
        this.f35803y.setGravity(0);
        if (!zH) {
            final int i16 = 0;
            onClickListener = new View.OnClickListener(this) { // from class: wl0.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.a f185891b;

                {
                    this.f185891b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            com.garmin.android.apps.connectmobile.golf.truswing.a aVar = this.f185891b;
                            if (TextUtils.isEmpty(aVar.f35804z.f35887f)) {
                                SwingSessionDTO swingSessionDTO3 = aVar.f35804z;
                                swingSessionDTO3.f35887f = aVar.E.k(swingSessionDTO3.f35885d);
                            }
                            new com.garmin.android.apps.connectmobile.golf.truswing.a.b(aVar.f35804z.f35887f, new b(aVar)).show(aVar.getFragmentManager(), (String) null);
                            break;
                        default:
                            com.garmin.android.apps.connectmobile.golf.truswing.a aVar2 = this.f185891b;
                            SwingSessionDTO swingSessionDTO4 = aVar2.f35804z;
                            new com.garmin.android.apps.connectmobile.golf.truswing.a.b(swingSessionDTO4 != null ? swingSessionDTO4.f35887f : null, new b(aVar2)).show(aVar2.getFragmentManager(), (String) null);
                            break;
                    }
                }
            };
        }
        this.f35803y.setOnClickListener(onClickListener);
        this.f35803y.setVisibility(0);
    }

    public final void j7(List<SwingDTO> list) {
        this.A.f35861g = Y6();
        j jVar = this.A;
        jVar.clear();
        if (list != null) {
            jVar.addAll(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.D = (c) context;
        } catch (ClassCastException unused) {
            l2.k(context, " must implement OnActivityFinishListener");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = (com.garmin.android.apps.connectmobile.golf.truswing.c) new x1(this).a(com.garmin.android.apps.connectmobile.golf.truswing.c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.A;
        if (jVar != null) {
            cl0.d dVarH = this.E.h();
            if (jVar.f35859e != dVarH) {
                jVar.notifyDataSetChanged();
            }
            jVar.f35859e = dVarH;
            ArrayList arrayList = new ArrayList();
            cl0.a.e().getClass();
            List listF = cl0.a.f();
            if (listF != null) {
                arrayList.addAll(listF);
            }
            cl0.a.e().getClass();
            List listD = cl0.a.d();
            if (listD != null) {
                arrayList.addAll(listD);
            }
            j jVar2 = this.A;
            jVar2.f35861g = arrayList;
            jVar2.notifyDataSetChanged();
        }
        if (this.f35804z == null) {
            X6();
        }
        cl0.a.e().getClass();
        boolean zH = cl0.a.h();
        Menu menu = this.f35801w;
        if (menu != null) {
            MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_cancel);
            this.f35802x = menu.findItem(R.id.menu_item_sort);
            menuItemFindItem.setVisible(zH);
            this.f35802x.setVisible(!zH);
        }
        if (this.f35804z != null) {
            i7();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("KEY_BUNDLE_SELECTED_ORDER", this.B);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        cl0.a.e().getClass();
        if (cl0.a.h()) {
            return;
        }
        d7();
    }

    @Override // com.garmin.android.apps.connectmobile.o0, androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        g22.e.k(this, new C0623a(), b0.b.RESUMED);
        if (bundle != null && bundle.containsKey("KEY_BUNDLE_SELECTED_ORDER")) {
            this.B = bundle.getInt("KEY_BUNDLE_SELECTED_ORDER");
        }
        u6();
        ListView listView = this.f7311e;
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.gcm_golf_swing_session_detail_list_header, (ViewGroup) null);
        listView.addHeaderView(linearLayout);
        listView.setDivider(null);
        listView.setCacheColorHint(requireContext().getColor(R.color.gcm_surface_1));
        listView.setSelector(R.drawable.gcm_surface_1_selector_background);
        listView.setFastScrollEnabled(true);
        listView.setChoiceMode(1);
        this.f35803y = (TextView) linearLayout.findViewById(R.id.swing_session_notes);
        j jVar = new j(getActivity(), this.E.h(), this);
        this.A = jVar;
        listView.setAdapter((ListAdapter) jVar);
        listView.setVisibility(0);
    }
}
