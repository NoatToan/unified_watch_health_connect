package com.garmin.android.apps.connectmobile.feedback;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import g22.e;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f35210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f35211e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewOnClickListenerC0604b f35212f = new ViewOnClickListenerC0604b();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            d dVar;
            b bVar = b.this;
            int i14 = bVar.f35208b;
            if (i14 == 1 || i14 == 2) {
                d dVar2 = bVar.f35210d;
                if (dVar2 != null) {
                    dVar2.T6();
                    return;
                }
                return;
            }
            if (i14 == 3 && (dVar = bVar.f35210d) != null) {
                dVar.M4();
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.feedback.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0604b implements View.OnClickListener {
        public ViewOnClickListenerC0604b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            d dVar = b.this.f35210d;
            if (dVar != null) {
                dVar.n5();
            }
        }
    }

    public class c implements s {
        public c() {
        }

        @Override // androidx.core.view.s
        public final void Y3(Menu menu, MenuInflater menuInflater) {
            menuInflater.inflate(R.menu.feedback_experience_menu, menu);
        }

        @Override // androidx.core.view.s
        public final boolean w5(MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.ask_me_later_menu_item) {
                return false;
            }
            d dVar = b.this.f35210d;
            if (dVar == null) {
                return true;
            }
            dVar.i1();
            return true;
        }
    }

    public interface d {
        void M4();

        void T6();

        void i1();

        void n5();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f35210d = (d) ((Activity) context);
        } catch (ClassCastException unused) {
            l2.k(context, " must implement ProvideFeedbackListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f35207a = getArguments().getInt("imageResourceId");
            this.f35208b = getArguments().getInt("contentBodyType");
            this.f35209c = getArguments().getString("message");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.gcm3_provide_feedback_fragment_layout, viewGroup, false);
        ViewGroup viewGroup2 = (LinearLayout) viewInflate.findViewById(R.id.content);
        View viewInflate2 = getActivity().getLayoutInflater().inflate(R.layout.gcm3_provide_feedback_header, viewGroup2, false);
        ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.feedback_header_image);
        TextView textView = (TextView) viewInflate2.findViewById(R.id.feedback_header_title);
        imageView.setImageResource(this.f35207a);
        textView.setText(this.f35209c);
        viewGroup2.addView(viewInflate2);
        View viewInflate3 = layoutInflater.inflate(R.layout.gcm3_provide_feedback_content_buttons, viewGroup2, false);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewInflate3.findViewById(R.id.feedback_content_button_top);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) viewInflate3.findViewById(R.id.feedback_content_button_bottom);
        gCMComplexOneLineButton.setOnClickListener(this.f35211e);
        gCMComplexOneLineButton2.setOnClickListener(this.f35212f);
        int i14 = this.f35208b;
        if (i14 == 1 || i14 == 2) {
            gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.feedback_visit_support_center));
            gCMComplexOneLineButton2.setButtonLeftLabel(getString(R.string.button_no_thanks));
        } else if (i14 == 3) {
            gCMComplexOneLineButton.setButtonLeftLabel(getString(R.string.label_rate_your_app));
            gCMComplexOneLineButton2.setButtonLeftLabel(getString(R.string.button_no_thanks));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        viewGroup2.addView(viewInflate3, layoutParams);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        e.j(this, new c());
    }
}
