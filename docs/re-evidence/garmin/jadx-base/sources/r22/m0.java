package r22;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lr22/m0;", "Landroidx/fragment/app/i;", "Lr22/v0;", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 extends androidx.fragment.app.i implements v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f149759e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f149760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnClickListener f149761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u0 f149762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f149763d;

    public m0() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("EXTRA_TITLE", "") : null;
        this.f149763d = "GCMFeatureInfoDialog_".concat(string != null ? string : "");
    }

    @Override // r22.v0
    public final void L3(u0 u0Var) {
        this.f149762c = u0Var;
    }

    @Override // r22.v0
    /* JADX INFO: renamed from: b5, reason: from getter */
    public final String getF149763d() {
        return this.f149763d;
    }

    @Override // r22.v0
    public final void g(androidx.fragment.app.v vVar) {
        showNow(vVar, this.f149763d);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020c  */
    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:104:0x022f  */
    /* JADX WARN: Code duplicated, block: B:105:0x023e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0248  */
    /* JADX WARN: Code duplicated, block: B:109:0x0254  */
    /* JADX WARN: Code duplicated, block: B:110:0x0256  */
    /* JADX WARN: Code duplicated, block: B:114:0x0278  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    @Override // androidx.fragment.app.i
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z14;
        Button button;
        TextView textView;
        int i14;
        int i15;
        Window window;
        u0 u0Var;
        int i16;
        String string;
        Bundle arguments = getArguments();
        int i17 = arguments != null ? arguments.getInt("EXTRA_IMAGE_RES_ID", -1) : -1;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("EXTRA_IMAGE_URL") : null;
        Bundle arguments3 = getArguments();
        int i18 = arguments3 != null ? arguments3.getInt("EXTRA_IMAGE_BACKGROUND_RES_ID", -1) : -1;
        Bundle arguments4 = getArguments();
        boolean z15 = arguments4 != null ? arguments4.getBoolean("EXTRA_IS_ICON_IMAGE", true) : true;
        Bundle arguments5 = getArguments();
        String string3 = arguments5 != null ? arguments5.getString("EXTRA_TITLE", "") : null;
        if (string3 == null) {
            string3 = "";
        }
        Bundle arguments6 = getArguments();
        String string4 = arguments6 != null ? arguments6.getString("EXTRA_TAG", null) : null;
        Bundle arguments7 = getArguments();
        String string5 = arguments7 != null ? arguments7.getString("EXTRA_DESCRIPTION", "") : null;
        String str = string5 != null ? string5 : "";
        Bundle arguments8 = getArguments();
        int i19 = arguments8 != null ? arguments8.getInt("EXTRA_POSITIVE_BUTTON_TEXT", -1) : -1;
        Bundle arguments9 = getArguments();
        int i24 = arguments9 != null ? arguments9.getInt("EXTRA_NEGATIVE_BUTTON_TEXT", -1) : -1;
        Bundle arguments10 = getArguments();
        boolean z16 = arguments10 != null ? arguments10.getBoolean("IS_CANCELLED_ON_TOUCH_OUTSIDE", false) : false;
        Bundle arguments11 = getArguments();
        int i25 = arguments11 != null ? arguments11.getInt("DESCRIPTION_GRAVITY", 17) : 17;
        Bundle arguments12 = getArguments();
        boolean z17 = arguments12 != null ? arguments12.getBoolean("SHOW_CLOSE_ICON", false) : false;
        Bundle arguments13 = getArguments();
        String str2 = "cache_availability_today";
        if (arguments13 != null && (string = arguments13.getString("EXTRA_IMAGE_CACHE_AVAILABILITY", "cache_availability_today")) != null) {
            str2 = string;
        }
        Bundle arguments14 = getArguments();
        boolean z18 = arguments14 != null ? arguments14.getBoolean("EXTRA_EDGE_TO_EDGE", false) : false;
        boolean z19 = z17;
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.gcm4_feature_info_dialog, (ViewGroup) null);
        ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.feature_info_title);
        if (string2 != null) {
            z14 = z16;
            if (!d53.w.J(string2)) {
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.feature_info_image);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (z15) {
                    layoutParams.width = (int) getResources().getDimension(R.dimen.image_xxlarge);
                    layoutParams.height = (int) getResources().getDimension(R.dimen.image_xxlarge);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else {
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart(0);
                        marginLayoutParams.setMarginEnd(0);
                        marginLayoutParams.topMargin = 0;
                        marginLayoutParams.width = -1;
                    }
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setAdjustViewBounds(true);
                }
                zp0.c.f206560v.getClass();
                zp0.c cVar = new zp0.c(this);
                cVar.f206565e = string2;
                if (i17 != -1) {
                    cVar.f206570j = i17;
                }
                cVar.f206578r = str2;
                cVar.h(imageView);
            }
            composeView.setContent(new z3.e(-2036879080, true, new h50.d(z18, string3, string4)));
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.feature_info_description);
            textView2.setText(str);
            textView2.setGravity(i25);
            button = (Button) viewInflate.findViewById(R.id.feature_info_positive_btn);
            if (i19 != -1) {
                button.setText(i19);
                final int i26 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m0 f149748b;

                    {
                        this.f149748b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i27 = i26;
                        m0 m0Var = this.f149748b;
                        switch (i27) {
                            case 0:
                                m0.a aVar = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener = m0Var.f149760a;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view2);
                                }
                                break;
                            case 1:
                                m0.a aVar2 = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener2 = m0Var.f149761b;
                                if (onClickListener2 != null) {
                                    onClickListener2.onClick(view2);
                                }
                                break;
                            default:
                                m0.a aVar3 = m0.f149759e;
                                m0Var.dismiss();
                                break;
                        }
                    }
                });
            } else {
                button.getClass();
                button.setVisibility(8);
            }
            textView = (TextView) viewInflate.findViewById(R.id.feature_info_negative_btn);
            i14 = i24;
            if (i14 != -1) {
                textView.setText(i14);
                final int i27 = 1;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m0 f149748b;

                    {
                        this.f149748b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i28 = i27;
                        m0 m0Var = this.f149748b;
                        switch (i28) {
                            case 0:
                                m0.a aVar = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener = m0Var.f149760a;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view2);
                                }
                                break;
                            case 1:
                                m0.a aVar2 = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener2 = m0Var.f149761b;
                                if (onClickListener2 != null) {
                                    onClickListener2.onClick(view2);
                                }
                                break;
                            default:
                                m0.a aVar3 = m0.f149759e;
                                m0Var.dismiss();
                                break;
                        }
                    }
                });
                i15 = 8;
            } else {
                textView.getClass();
                i15 = 8;
                textView.setVisibility(8);
            }
            if (z19) {
                View viewFindViewById = viewInflate.findViewById(R.id.close_icon);
                viewFindViewById.getClass();
                if (z19) {
                    i16 = 0;
                } else {
                    i16 = i15;
                }
                viewFindViewById.setVisibility(i16);
                final int i28 = 2;
                viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ m0 f149748b;

                    {
                        this.f149748b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i29 = i28;
                        m0 m0Var = this.f149748b;
                        switch (i29) {
                            case 0:
                                m0.a aVar = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener = m0Var.f149760a;
                                if (onClickListener != null) {
                                    onClickListener.onClick(view2);
                                }
                                break;
                            case 1:
                                m0.a aVar2 = m0.f149759e;
                                m0Var.dismiss();
                                View.OnClickListener onClickListener2 = m0Var.f149761b;
                                if (onClickListener2 != null) {
                                    onClickListener2.onClick(view2);
                                }
                                break;
                            default:
                                m0.a aVar3 = m0.f149759e;
                                m0Var.dismiss();
                                break;
                        }
                    }
                });
            }
            Dialog dialog = new Dialog(viewInflate.getContext(), R.style.GCMInfoDialogStyle);
            dialog.setContentView(viewInflate);
            window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.setCanceledOnTouchOutside(z14);
            u0Var = this.f149762c;
            if (u0Var != null) {
                u0Var.a();
            }
            return dialog;
        }
        z14 = z16;
        i24 = i24;
        if (i17 != -1) {
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.feature_info_image);
            if (i18 != -1) {
                imageView2.setBackgroundResource(i18);
                int dimension = (int) getResources().getDimension(R.dimen.spacing_normal);
                imageView2.setPadding(dimension, dimension, dimension, dimension);
            }
            if (z15 == 0) {
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(0);
                    marginLayoutParams2.setMarginEnd(0);
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.width = -1;
                }
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView2.setAdjustViewBounds(true);
            }
            imageView2.setImageResource(i17);
        } else {
            View viewFindViewById2 = viewInflate.findViewById(R.id.feature_info_image);
            viewFindViewById2.getClass();
            viewFindViewById2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams3 = composeView.getLayoutParams();
            LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.topMargin = getResources().getDimensionPixelSize(R.dimen.spacing_normal);
            }
        }
        composeView.setContent(new z3.e(-2036879080, true, new h50.d(z18, string3, string4)));
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.feature_info_description);
        textView3.setText(str);
        textView3.setGravity(i25);
        button = (Button) viewInflate.findViewById(R.id.feature_info_positive_btn);
        if (i19 != -1) {
            button.setText(i19);
            final int i29 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m0 f149748b;

                {
                    this.f149748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i210 = i29;
                    m0 m0Var = this.f149748b;
                    switch (i210) {
                        case 0:
                            m0.a aVar = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener = m0Var.f149760a;
                            if (onClickListener != null) {
                                onClickListener.onClick(view2);
                            }
                            break;
                        case 1:
                            m0.a aVar2 = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener2 = m0Var.f149761b;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view2);
                            }
                            break;
                        default:
                            m0.a aVar3 = m0.f149759e;
                            m0Var.dismiss();
                            break;
                    }
                }
            });
        } else {
            button.getClass();
            button.setVisibility(8);
        }
        textView = (TextView) viewInflate.findViewById(R.id.feature_info_negative_btn);
        i14 = i24;
        if (i14 != -1) {
            textView.setText(i14);
            final int i210 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m0 f149748b;

                {
                    this.f149748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i211 = i210;
                    m0 m0Var = this.f149748b;
                    switch (i211) {
                        case 0:
                            m0.a aVar = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener = m0Var.f149760a;
                            if (onClickListener != null) {
                                onClickListener.onClick(view2);
                            }
                            break;
                        case 1:
                            m0.a aVar2 = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener2 = m0Var.f149761b;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view2);
                            }
                            break;
                        default:
                            m0.a aVar3 = m0.f149759e;
                            m0Var.dismiss();
                            break;
                    }
                }
            });
            i15 = 8;
        } else {
            textView.getClass();
            i15 = 8;
            textView.setVisibility(8);
        }
        if (z19) {
            View viewFindViewById3 = viewInflate.findViewById(R.id.close_icon);
            viewFindViewById3.getClass();
            if (z19) {
                i16 = 0;
            } else {
                i16 = i15;
            }
            viewFindViewById3.setVisibility(i16);
            final int i211 = 2;
            viewFindViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: r22.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m0 f149748b;

                {
                    this.f149748b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i212 = i211;
                    m0 m0Var = this.f149748b;
                    switch (i212) {
                        case 0:
                            m0.a aVar = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener = m0Var.f149760a;
                            if (onClickListener != null) {
                                onClickListener.onClick(view2);
                            }
                            break;
                        case 1:
                            m0.a aVar2 = m0.f149759e;
                            m0Var.dismiss();
                            View.OnClickListener onClickListener2 = m0Var.f149761b;
                            if (onClickListener2 != null) {
                                onClickListener2.onClick(view2);
                            }
                            break;
                        default:
                            m0.a aVar3 = m0.f149759e;
                            m0Var.dismiss();
                            break;
                    }
                }
            });
        }
        Dialog dialog2 = new Dialog(viewInflate.getContext(), R.style.GCMInfoDialogStyle);
        dialog2.setContentView(viewInflate);
        window = dialog2.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog2.setCanceledOnTouchOutside(z14);
        u0Var = this.f149762c;
        if (u0Var != null) {
            u0Var.a();
        }
        return dialog2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        u0 u0Var = this.f149762c;
        if (u0Var != null) {
            u0Var.onDismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lr22/m0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_IMAGE_RES_ID", "EXTRA_IMAGE_URL", "EXTRA_IMAGE_BACKGROUND_RES_ID", "EXTRA_IS_ICON_IMAGE", "EXTRA_TITLE", "EXTRA_TAG", "EXTRA_DESCRIPTION", "EXTRA_POSITIVE_BUTTON_TEXT", "EXTRA_NEGATIVE_BUTTON_TEXT", "IS_CANCELLED_ON_TOUCH_OUTSIDE", "DESCRIPTION_GRAVITY", "SHOW_CLOSE_ICON", "EXTRA_IMAGE_CACHE_AVAILABILITY", "EXTRA_EDGE_TO_EDGE", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m0 a(a aVar, int i14, String str, boolean z14, String str2, String str3, String str4, int i15, View.OnClickListener onClickListener, int i16, View.OnClickListener onClickListener2, boolean z15, int i17, boolean z16, String str5, boolean z17, int i18) {
            if ((i18 & 32) != 0) {
                str3 = null;
            }
            boolean z18 = (i18 & 2048) != 0 ? false : z15;
            int i19 = (i18 & 4096) != 0 ? 17 : i17;
            boolean z19 = (i18 & 8192) == 0 ? z16 : false;
            String str6 = (i18 & 16384) != 0 ? "cache_availability_today" : str5;
            aVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_IMAGE_RES_ID", i14);
            bundle.putString("EXTRA_IMAGE_URL", str);
            bundle.putInt("EXTRA_IMAGE_BACKGROUND_RES_ID", -1);
            bundle.putBoolean("EXTRA_IS_ICON_IMAGE", z14);
            bundle.putString("EXTRA_TITLE", str2);
            bundle.putString("EXTRA_TAG", str3);
            bundle.putString("EXTRA_DESCRIPTION", str4);
            bundle.putInt("EXTRA_POSITIVE_BUTTON_TEXT", i15);
            bundle.putInt("EXTRA_NEGATIVE_BUTTON_TEXT", i16);
            bundle.putBoolean("IS_CANCELLED_ON_TOUCH_OUTSIDE", z18);
            bundle.putInt("DESCRIPTION_GRAVITY", i19);
            bundle.putBoolean("SHOW_CLOSE_ICON", z19);
            bundle.putString("EXTRA_IMAGE_CACHE_AVAILABILITY", str6);
            bundle.putBoolean("EXTRA_EDGE_TO_EDGE", z17);
            m0 m0Var = new m0();
            m0Var.setArguments(bundle);
            m0Var.f149760a = onClickListener;
            m0Var.f149761b = onClickListener2;
            return m0Var;
        }

        public static m0 b(a aVar, String str, String str2, int i14) {
            aVar.getClass();
            return a(aVar, 2131231871, null, true, str, null, str2, -1, null, -1, null, true, 0, false, null, false, 28704);
        }

        public static m0 c(a aVar, String str, String str2, int i14, View.OnClickListener onClickListener, int i15, View.OnClickListener onClickListener2, int i16) {
            int i17 = (i16 & 4) != 0 ? -1 : i14;
            View.OnClickListener onClickListener3 = (i16 & 8) != 0 ? null : onClickListener;
            int i18 = (i16 & 16) != 0 ? -1 : i15;
            View.OnClickListener onClickListener4 = (i16 & 32) != 0 ? null : onClickListener2;
            aVar.getClass();
            return a(aVar, -1, null, false, str, null, str2, i17, onClickListener3, i18, onClickListener4, false, 17, false, null, false, 26656);
        }

        public static m0 d(a aVar, int i14, String str, String str2, int i15, View.OnClickListener onClickListener, int i16, View.OnClickListener onClickListener2, String str3, int i17) {
            String str4 = (i17 & 2) != 0 ? null : str;
            int i18 = (i17 & 8) != 0 ? -1 : i15;
            View.OnClickListener onClickListener3 = (i17 & 16) != 0 ? null : onClickListener;
            int i19 = (i17 & 32) != 0 ? -1 : i16;
            View.OnClickListener onClickListener4 = (i17 & 64) != 0 ? null : onClickListener2;
            String str5 = (i17 & 512) != 0 ? null : str3;
            aVar.getClass();
            return a(aVar, i14, null, true, str4, str5, str2, i18, onClickListener3, i19, onClickListener4, false, 0, false, null, false, 22528);
        }

        public static m0 e(a aVar, int i14, String str, String str2, int i15, View.OnClickListener onClickListener, int i16, View.OnClickListener onClickListener2, int i17) {
            View.OnClickListener onClickListener3 = (i17 & 64) != 0 ? null : onClickListener2;
            aVar.getClass();
            return a(aVar, i14, null, false, str, null, str2, i15, onClickListener, i16, onClickListener3, false, 0, false, null, false, 30752);
        }

        private a() {
        }
    }
}
