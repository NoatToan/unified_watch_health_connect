package com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import qb1.a0;
import qb1.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/a;", "Landroidx/fragment/app/Fragment;", "Lqb1/b0;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Fragment implements b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0773a f40946f = new C0773a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f40947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f40948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f40949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GCMComplexOneLineButton f40950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f40951e;

    public interface b {
        void j7(String str, boolean z14);
    }

    @Override // qb1.b0
    public final void i0() {
        b bVar = this.f40951e;
        if (bVar != null) {
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f40950d;
            if (gCMComplexOneLineButton == null) {
                s.m("mPageRadioButton");
                throw null;
            }
            bVar.j7(getTag(), gCMComplexOneLineButton.f47771k.isChecked());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (getActivity() instanceof a0) {
            a7.e activity = getActivity();
            activity.getClass();
            this.f40951e = (b) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_info_radio_button, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.setup_training_status_image);
        viewFindViewById.getClass();
        this.f40947a = (ImageView) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.setup_training_status_title);
        viewFindViewById2.getClass();
        this.f40948b = (TextView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.setup_training_status_description);
        viewFindViewById3.getClass();
        this.f40949c = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.setup_training_status_radio_button);
        viewFindViewById4.getClass();
        this.f40950d = (GCMComplexOneLineButton) viewFindViewById4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            ImageView imageView = this.f40947a;
            if (imageView == null) {
                s.m("mPageImage");
                throw null;
            }
            Context context = getContext();
            imageView.setImageDrawable(context != null ? context.getDrawable(arguments.getInt("DRAWABLE_RES_KEY")) : null);
            String string = arguments.getString("PAGE_TITLE_STRING");
            TextView textView = this.f40948b;
            if (string != null) {
                if (textView == null) {
                    s.m("mPageTitle");
                    throw null;
                }
                textView.setText(string);
            } else {
                if (textView == null) {
                    s.m("mPageTitle");
                    throw null;
                }
                Context context2 = getContext();
                textView.setText(context2 != null ? context2.getString(arguments.getInt("PAGE_TITLE_KEY")) : null);
            }
            TextView textView2 = this.f40949c;
            if (textView2 == null) {
                s.m("mPageDescription");
                throw null;
            }
            Context context3 = getContext();
            textView2.setText(context3 != null ? context3.getString(arguments.getInt("PAGE_DESCRIPTION_KEY")) : null);
            GCMComplexOneLineButton gCMComplexOneLineButton = this.f40950d;
            if (gCMComplexOneLineButton == null) {
                s.m("mPageRadioButton");
                throw null;
            }
            Context context4 = getContext();
            gCMComplexOneLineButton.setButtonLeftLabel(context4 != null ? context4.getString(arguments.getInt("RADIO_BUTTON_TITLE")) : null);
            GCMComplexOneLineButton gCMComplexOneLineButton2 = this.f40950d;
            if (gCMComplexOneLineButton2 == null) {
                s.m("mPageRadioButton");
                throw null;
            }
            gCMComplexOneLineButton2.i(arguments.getBoolean("RADIO_BUTTON_VALUE"));
            if (s.g(getTag(), e.TRAINING_STATUS.f40981a)) {
                int iApplyDimension = (int) TypedValue.applyDimension(1, 35.0f, requireContext().getResources().getDisplayMetrics());
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 15.0f, requireContext().getResources().getDisplayMetrics());
                ImageView imageView2 = this.f40947a;
                if (imageView2 == null) {
                    s.m("mPageImage");
                    throw null;
                }
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setPadding(0, iApplyDimension, 0, iApplyDimension2);
            }
        }
    }

    @Override // qb1.b0
    public final void r0() {
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/setup/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DRAWABLE_RES_KEY", "PAGE_TITLE_KEY", "PAGE_DESCRIPTION_KEY", "RADIO_BUTTON_TITLE", "RADIO_BUTTON_VALUE", "PAGE_TITLE_STRING", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0773a {
        public /* synthetic */ C0773a(j jVar) {
            this();
        }

        private C0773a() {
        }
    }
}
