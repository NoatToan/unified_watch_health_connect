package com.garmin.android.apps.connectmobile.bikesensors.orca;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.m;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.orca.OrcaSensorsIndicatorsActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import z0.g0;
import zv.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaSensorsIndicatorsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OrcaSensorsIndicatorsActivity extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f30888g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f30889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f30890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f30891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f30892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f30893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f30894f;

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zv.f] */
    /* JADX WARN: Type inference failed for: r0v1, types: [zv.f] */
    /* JADX WARN: Type inference failed for: r0v2, types: [zv.f] */
    public OrcaSensorsIndicatorsActivity() {
        final int i14 = 0;
        this.f30892d = new View.OnClickListener(this) { // from class: zv.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaSensorsIndicatorsActivity f207148b;

            {
                this.f207148b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                final OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity = this.f207148b;
                switch (i15) {
                    case 0:
                        int i16 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        imageView.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView2 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView2 == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        Drawable drawable = imageView2.getDrawable();
                        drawable.getClass();
                        final AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                        animationDrawable.start();
                        final int i17 = 1;
                        Runnable runnable = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i18 = i17;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable2 = animationDrawable;
                                switch (i18) {
                                    case 0:
                                        int i19 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable2.stop();
                                        animationDrawable2.setVisible(false, false);
                                        ImageView imageView3 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView3 != null) {
                                            imageView3.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable2.stop();
                                        animationDrawable2.setVisible(false, false);
                                        ImageView imageView4 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView4 != null) {
                                            imageView4.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView3 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView3 != null) {
                            imageView3.postDelayed(runnable, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("pairingImageView");
                            throw null;
                        }
                    case 1:
                        int i18 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView4 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView4 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        imageView4.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView5 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView5 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        Drawable drawable2 = imageView5.getDrawable();
                        drawable2.getClass();
                        final AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
                        animationDrawable2.start();
                        final int i19 = 0;
                        Runnable runnable2 = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i110 = i19;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable3 = animationDrawable2;
                                switch (i110) {
                                    case 0:
                                        int i111 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView6 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView6 != null) {
                                            imageView6.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView7 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView7 != null) {
                                            imageView7.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView6 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView6 != null) {
                            imageView6.postDelayed(runnable2, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("updatingImageView");
                            throw null;
                        }
                    default:
                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        zp0.c cVar = new zp0.c((m) orcaSensorsIndicatorsActivity);
                        cVar.f206567g = 2131233606;
                        ImageView imageView7 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView7 == null) {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                        cVar.h(imageView7);
                        za.j jVar = new za.j(5, orcaSensorsIndicatorsActivity, new g0(orcaSensorsIndicatorsActivity, 7));
                        ImageView imageView8 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView8 != null) {
                            imageView8.postDelayed(jVar, 500L);
                            return;
                        } else {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                }
            }
        };
        final int i15 = 1;
        this.f30893e = new View.OnClickListener(this) { // from class: zv.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaSensorsIndicatorsActivity f207148b;

            {
                this.f207148b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                final OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity = this.f207148b;
                switch (i16) {
                    case 0:
                        int i17 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        imageView.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView2 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView2 == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        Drawable drawable = imageView2.getDrawable();
                        drawable.getClass();
                        final AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                        animationDrawable.start();
                        final int i18 = 1;
                        Runnable runnable = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i110 = i18;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable3 = animationDrawable;
                                switch (i110) {
                                    case 0:
                                        int i111 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView6 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView6 != null) {
                                            imageView6.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView7 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView7 != null) {
                                            imageView7.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView3 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView3 != null) {
                            imageView3.postDelayed(runnable, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("pairingImageView");
                            throw null;
                        }
                    case 1:
                        int i19 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView4 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView4 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        imageView4.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView5 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView5 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        Drawable drawable2 = imageView5.getDrawable();
                        drawable2.getClass();
                        final AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
                        animationDrawable2.start();
                        final int i110 = 0;
                        Runnable runnable2 = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i111 = i110;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable3 = animationDrawable2;
                                switch (i111) {
                                    case 0:
                                        int i112 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView6 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView6 != null) {
                                            imageView6.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView7 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView7 != null) {
                                            imageView7.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView6 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView6 != null) {
                            imageView6.postDelayed(runnable2, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("updatingImageView");
                            throw null;
                        }
                    default:
                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        zp0.c cVar = new zp0.c((m) orcaSensorsIndicatorsActivity);
                        cVar.f206567g = 2131233606;
                        ImageView imageView7 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView7 == null) {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                        cVar.h(imageView7);
                        za.j jVar = new za.j(5, orcaSensorsIndicatorsActivity, new g0(orcaSensorsIndicatorsActivity, 7));
                        ImageView imageView8 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView8 != null) {
                            imageView8.postDelayed(jVar, 500L);
                            return;
                        } else {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                }
            }
        };
        final int i16 = 2;
        this.f30894f = new View.OnClickListener(this) { // from class: zv.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrcaSensorsIndicatorsActivity f207148b;

            {
                this.f207148b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                final OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity = this.f207148b;
                switch (i17) {
                    case 0:
                        int i18 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        imageView.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView2 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView2 == null) {
                            s.m("pairingImageView");
                            throw null;
                        }
                        Drawable drawable = imageView2.getDrawable();
                        drawable.getClass();
                        final AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
                        animationDrawable.start();
                        final int i19 = 1;
                        Runnable runnable = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i111 = i19;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable3 = animationDrawable;
                                switch (i111) {
                                    case 0:
                                        int i112 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView6 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView6 != null) {
                                            imageView6.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView7 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView7 != null) {
                                            imageView7.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView3 = orcaSensorsIndicatorsActivity.f30889a;
                        if (imageView3 != null) {
                            imageView3.postDelayed(runnable, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("pairingImageView");
                            throw null;
                        }
                    case 1:
                        int i110 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        ImageView imageView4 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView4 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        imageView4.setImageResource(R.drawable.green_red_blink);
                        ImageView imageView5 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView5 == null) {
                            s.m("updatingImageView");
                            throw null;
                        }
                        Drawable drawable2 = imageView5.getDrawable();
                        drawable2.getClass();
                        final AnimationDrawable animationDrawable2 = (AnimationDrawable) drawable2;
                        animationDrawable2.start();
                        final int i111 = 0;
                        Runnable runnable2 = new Runnable() { // from class: zv.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i112 = i111;
                                OrcaSensorsIndicatorsActivity orcaSensorsIndicatorsActivity2 = orcaSensorsIndicatorsActivity;
                                AnimationDrawable animationDrawable3 = animationDrawable2;
                                switch (i112) {
                                    case 0:
                                        int i113 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView6 = orcaSensorsIndicatorsActivity2.f30890b;
                                        if (imageView6 != null) {
                                            imageView6.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("updatingImageView");
                                            throw null;
                                        }
                                    default:
                                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                                        animationDrawable3.stop();
                                        animationDrawable3.setVisible(false, false);
                                        ImageView imageView7 = orcaSensorsIndicatorsActivity2.f30889a;
                                        if (imageView7 != null) {
                                            imageView7.setImageResource(2131232091);
                                            return;
                                        } else {
                                            s.m("pairingImageView");
                                            throw null;
                                        }
                                }
                            }
                        };
                        ImageView imageView6 = orcaSensorsIndicatorsActivity.f30890b;
                        if (imageView6 != null) {
                            imageView6.postDelayed(runnable2, AbstractComponentTracker.LINGERING_TIMEOUT);
                            return;
                        } else {
                            s.m("updatingImageView");
                            throw null;
                        }
                    default:
                        int i24 = OrcaSensorsIndicatorsActivity.f30888g;
                        orcaSensorsIndicatorsActivity.ca();
                        zp0.c cVar = new zp0.c((m) orcaSensorsIndicatorsActivity);
                        cVar.f206567g = 2131233606;
                        ImageView imageView7 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView7 == null) {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                        cVar.h(imageView7);
                        za.j jVar = new za.j(5, orcaSensorsIndicatorsActivity, new g0(orcaSensorsIndicatorsActivity, 7));
                        ImageView imageView8 = orcaSensorsIndicatorsActivity.f30891c;
                        if (imageView8 != null) {
                            imageView8.postDelayed(jVar, 500L);
                            return;
                        } else {
                            s.m("wakeUpImageView");
                            throw null;
                        }
                }
            }
        };
    }

    public final void ca() {
        ImageView imageView = this.f30889a;
        if (imageView == null) {
            s.m("pairingImageView");
            throw null;
        }
        imageView.setImageResource(2131232091);
        ImageView imageView2 = this.f30890b;
        if (imageView2 == null) {
            s.m("updatingImageView");
            throw null;
        }
        imageView2.setImageResource(2131232091);
        ImageView imageView3 = this.f30891c;
        if (imageView3 != null) {
            imageView3.setImageResource(2131232091);
        } else {
            s.m("wakeUpImageView");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_orca_sensor_indicators);
        initActionBar(true, R.string.device_settings_sensor_indicators);
        View viewFindViewById = findViewById(R.id.mode_pairing);
        viewFindViewById.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) viewFindViewById;
        gCMComplexTwoLineButton.setOnClickListener(this.f30892d);
        View viewFindViewById2 = gCMComplexTwoLineButton.findViewById(R.id.icon_right);
        viewFindViewById2.getClass();
        ImageView imageView = (ImageView) viewFindViewById2;
        this.f30889a = imageView;
        imageView.setVisibility(0);
        View viewFindViewById3 = findViewById(R.id.mode_updating);
        viewFindViewById3.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) viewFindViewById3;
        gCMComplexTwoLineButton2.setOnClickListener(this.f30893e);
        View viewFindViewById4 = gCMComplexTwoLineButton2.findViewById(R.id.icon_right);
        viewFindViewById4.getClass();
        ImageView imageView2 = (ImageView) viewFindViewById4;
        this.f30890b = imageView2;
        imageView2.setVisibility(0);
        View viewFindViewById5 = findViewById(R.id.mode_wake_up);
        viewFindViewById5.getClass();
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = (GCMComplexTwoLineButton) viewFindViewById5;
        gCMComplexTwoLineButton3.setOnClickListener(this.f30894f);
        View viewFindViewById6 = gCMComplexTwoLineButton3.findViewById(R.id.icon_right);
        viewFindViewById6.getClass();
        ImageView imageView3 = (ImageView) viewFindViewById6;
        this.f30891c = imageView3;
        imageView3.setVisibility(0);
        ca();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/bikesensors/orca/OrcaSensorsIndicatorsActivity$a;", "", "<init>", "()V", "", "UPDATING_GIF_ANIMATION_TIME", "I", "WAKE_UP_ANIMATION_TIME", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
