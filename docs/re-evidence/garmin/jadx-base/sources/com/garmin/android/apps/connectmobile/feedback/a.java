package com.garmin.android.apps.connectmobile.feedback;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0603a f35206a;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.feedback.a$a, reason: collision with other inner class name */
    public interface InterfaceC0603a {
        void E2();

        void R3();

        void d5();

        void m7();

        void y2();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f35206a = (InterfaceC0603a) ((Activity) context);
        } catch (ClassCastException unused) {
            l2.k(context, " must implement FeedbackAlertListener");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        InterfaceC0603a interfaceC0603a;
        int id3 = view2.getId();
        if (id3 == R.id.feedback_alert_ask_later_button) {
            InterfaceC0603a interfaceC0603a2 = this.f35206a;
            if (interfaceC0603a2 != null) {
                interfaceC0603a2.m7();
                return;
            }
            return;
        }
        if (id3 == R.id.feedback_alert_do_not_ask_again_button) {
            InterfaceC0603a interfaceC0603a3 = this.f35206a;
            if (interfaceC0603a3 != null) {
                interfaceC0603a3.d5();
                return;
            }
            return;
        }
        if (id3 == R.id.feedback_alert_bad_image) {
            InterfaceC0603a interfaceC0603a4 = this.f35206a;
            if (interfaceC0603a4 != null) {
                interfaceC0603a4.R3();
                return;
            }
            return;
        }
        if (id3 == R.id.feedback_alert_neutral_image) {
            InterfaceC0603a interfaceC0603a5 = this.f35206a;
            if (interfaceC0603a5 != null) {
                interfaceC0603a5.E2();
                return;
            }
            return;
        }
        if (id3 != R.id.feedback_alert_happy_image || (interfaceC0603a = this.f35206a) == null) {
            return;
        }
        interfaceC0603a.y2();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.gcm3_feedback_alert_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f35206a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        TextView textView = (TextView) view2.findViewById(R.id.feedback_alert_ask_later_button);
        TextView textView2 = (TextView) view2.findViewById(R.id.feedback_alert_do_not_ask_again_button);
        ImageView imageView = (ImageView) view2.findViewById(R.id.feedback_alert_bad_image);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.feedback_alert_neutral_image);
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.feedback_alert_happy_image);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
    }
}
