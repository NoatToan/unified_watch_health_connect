package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.GpsSignalView;
import com.huami.moving.ui.view.SportingDataView;
import com.huami.moving.ui.view.progresslayout.CustomRoundProgressBar;

/* JADX INFO: loaded from: classes11.dex */
public final class FragmentRunningGpsMainNormalBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView btnCloseMap;

    @NonNull
    public final FrameLayout btnContainer;

    @NonNull
    public final CustomRoundProgressBar btnDone;

    @NonNull
    public final ImageButton btnLock;

    @NonNull
    public final ImageButton btnPause;

    @NonNull
    public final ImageView btnResume;

    @NonNull
    public final ImageButton btnSettings;

    @NonNull
    public final CustomRoundProgressBar btnUnlock;

    @NonNull
    public final ImageView chooseDataItemTipsClose;

    @NonNull
    public final LinearLayout chooseDataItemTipsLayout;

    @NonNull
    public final FrameLayout dataContainer;

    @NonNull
    public final LinearLayout dataDisplayContainer;

    @NonNull
    public final Space dataMargin;

    @NonNull
    public final GpsSignalView gpsSignal;

    @NonNull
    public final ImageView ivBtnMap;

    @NonNull
    public final FrameLayout mapContainer;

    @NonNull
    public final FrameLayout root;

    @NonNull
    public final SportingDataView sportData1;

    @NonNull
    public final SportingDataView sportData2;

    @NonNull
    public final SportingDataView sportData3;

    @NonNull
    public final SportingDataView sportData4;

    @NonNull
    public final FrameLayout titleContainer;

    @NonNull
    public final TextView tvChooseDataItemTips;

    @NonNull
    public final TextView tvDoneTips;

    @NonNull
    public final TextView tvTitle;

    @NonNull
    public final TextView tvUnlockTips;

    private FragmentRunningGpsMainNormalBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull CustomRoundProgressBar customRoundProgressBar, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull ImageView imageView2, @NonNull ImageButton imageButton3, @NonNull CustomRoundProgressBar customRoundProgressBar2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout3, @NonNull LinearLayout linearLayout2, @NonNull Space space, @NonNull GpsSignalView gpsSignalView, @NonNull ImageView imageView4, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull SportingDataView sportingDataView, @NonNull SportingDataView sportingDataView2, @NonNull SportingDataView sportingDataView3, @NonNull SportingDataView sportingDataView4, @NonNull FrameLayout frameLayout6, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = frameLayout;
        this.btnCloseMap = imageView;
        this.btnContainer = frameLayout2;
        this.btnDone = customRoundProgressBar;
        this.btnLock = imageButton;
        this.btnPause = imageButton2;
        this.btnResume = imageView2;
        this.btnSettings = imageButton3;
        this.btnUnlock = customRoundProgressBar2;
        this.chooseDataItemTipsClose = imageView3;
        this.chooseDataItemTipsLayout = linearLayout;
        this.dataContainer = frameLayout3;
        this.dataDisplayContainer = linearLayout2;
        this.dataMargin = space;
        this.gpsSignal = gpsSignalView;
        this.ivBtnMap = imageView4;
        this.mapContainer = frameLayout4;
        this.root = frameLayout5;
        this.sportData1 = sportingDataView;
        this.sportData2 = sportingDataView2;
        this.sportData3 = sportingDataView3;
        this.sportData4 = sportingDataView4;
        this.titleContainer = frameLayout6;
        this.tvChooseDataItemTips = textView;
        this.tvDoneTips = textView2;
        this.tvTitle = textView3;
        this.tvUnlockTips = textView4;
    }

    @NonNull
    public static FragmentRunningGpsMainNormalBinding bind(@NonNull View view) {
        int i = R.id.btn_close_map;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btn_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.btn_done;
                CustomRoundProgressBar customRoundProgressBar = (CustomRoundProgressBar) ViewBindings.findChildViewById(view, i);
                if (customRoundProgressBar != null) {
                    i = R.id.btn_lock;
                    ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
                    if (imageButton != null) {
                        i = R.id.btn_pause;
                        ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                        if (imageButton2 != null) {
                            i = R.id.btn_resume;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.btn_settings;
                                ImageButton imageButton3 = (ImageButton) ViewBindings.findChildViewById(view, i);
                                if (imageButton3 != null) {
                                    i = R.id.btn_unlock;
                                    CustomRoundProgressBar customRoundProgressBar2 = (CustomRoundProgressBar) ViewBindings.findChildViewById(view, i);
                                    if (customRoundProgressBar2 != null) {
                                        i = R.id.choose_data_item_tips_close;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.choose_data_item_tips_layout;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.data_container;
                                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                if (frameLayout2 != null) {
                                                    i = R.id.data_display_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.data_margin;
                                                        Space space = (Space) ViewBindings.findChildViewById(view, i);
                                                        if (space != null) {
                                                            i = R.id.gps_signal;
                                                            GpsSignalView gpsSignalView = (GpsSignalView) ViewBindings.findChildViewById(view, i);
                                                            if (gpsSignalView != null) {
                                                                i = R.id.iv_btn_map;
                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView4 != null) {
                                                                    i = R.id.map_container;
                                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (frameLayout3 != null) {
                                                                        FrameLayout frameLayout4 = (FrameLayout) view;
                                                                        i = R.id.sport_data_1;
                                                                        SportingDataView sportingDataView = (SportingDataView) ViewBindings.findChildViewById(view, i);
                                                                        if (sportingDataView != null) {
                                                                            i = R.id.sport_data_2;
                                                                            SportingDataView sportingDataView2 = (SportingDataView) ViewBindings.findChildViewById(view, i);
                                                                            if (sportingDataView2 != null) {
                                                                                i = R.id.sport_data_3;
                                                                                SportingDataView sportingDataView3 = (SportingDataView) ViewBindings.findChildViewById(view, i);
                                                                                if (sportingDataView3 != null) {
                                                                                    i = R.id.sport_data_4;
                                                                                    SportingDataView sportingDataView4 = (SportingDataView) ViewBindings.findChildViewById(view, i);
                                                                                    if (sportingDataView4 != null) {
                                                                                        i = R.id.title_container;
                                                                                        FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (frameLayout5 != null) {
                                                                                            i = R.id.tv_choose_data_item_tips;
                                                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView != null) {
                                                                                                i = R.id.tv_done_tips;
                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView2 != null) {
                                                                                                    i = R.id.tv_title;
                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView3 != null) {
                                                                                                        i = R.id.tv_unlock_tips;
                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView4 != null) {
                                                                                                            return new FragmentRunningGpsMainNormalBinding(frameLayout4, imageView, frameLayout, customRoundProgressBar, imageButton, imageButton2, imageView2, imageButton3, customRoundProgressBar2, imageView3, linearLayout, frameLayout2, linearLayout2, space, gpsSignalView, imageView4, frameLayout3, frameLayout4, sportingDataView, sportingDataView2, sportingDataView3, sportingDataView4, frameLayout5, textView, textView2, textView3, textView4);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRunningGpsMainNormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRunningGpsMainNormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_running_gps_main_normal, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
