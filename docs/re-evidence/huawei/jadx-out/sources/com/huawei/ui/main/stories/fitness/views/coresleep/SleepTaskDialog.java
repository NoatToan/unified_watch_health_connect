package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.health.healthmodel.bean.PictureBean;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.ezl;
import defpackage.qqf;
import defpackage.qrs;

/* JADX INFO: loaded from: classes2.dex */
public class SleepTaskDialog extends BaseDialog {
    public SleepTaskDialog(Context context) {
        super(context, R.style.CustomDialog, 0);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View.OnClickListener f27269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageBean f27270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27271c;
        private View d;
        private final Activity e;
        private String f;
        private String g;
        private View.OnClickListener h;
        private View.OnClickListener i;
        private View.OnClickListener j;
        private String k;
        private String l;
        private View.OnClickListener m;
        private String n;
        private SleepTaskDialog o;

        public Builder(Context context) {
            if (context instanceof Activity) {
                this.e = (Activity) context;
            } else {
                this.e = BaseApplication.j();
            }
        }

        public Builder e(String str) {
            this.l = str;
            return this;
        }

        public Builder a(String str) {
            this.n = str;
            return this;
        }

        public Builder b(String str) {
            this.f27271c = str;
            return this;
        }

        public Builder c(View view) {
            this.d = view;
            return this;
        }

        public Builder a(ImageBean imageBean) {
            this.f27270b = imageBean;
            return this;
        }

        public Builder d(String str, View.OnClickListener onClickListener) {
            this.k = str;
            this.j = onClickListener;
            return this;
        }

        public Builder a(String str, View.OnClickListener onClickListener) {
            this.g = str;
            this.h = onClickListener;
            return this;
        }

        public Builder e(String str, View.OnClickListener onClickListener) {
            this.f = str;
            this.i = onClickListener;
            return this;
        }

        public Builder b(View.OnClickListener onClickListener) {
            this.f27269a = onClickListener;
            return this;
        }

        public Builder c(View.OnClickListener onClickListener) {
            this.m = onClickListener;
            return this;
        }

        public SleepTaskDialog b() {
            View viewInflate = View.inflate(this.e, com.huawei.health.servicesui.R.layout.dialog_task, null);
            Size sizeA = a(this.f27270b, viewInflate.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_background));
            int width = sizeA.getWidth();
            int height = sizeA.getHeight();
            this.o = new SleepTaskDialog(this.e);
            boolean zY = qrs.y(this.e);
            int iD = ezl.d(this.e, zY);
            int iA = ezl.a(this.e, zY, (height * iD) / width);
            Window window = this.o.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = iD;
            attributes.height = iA;
            if (new HealthColumnSystem(BaseApplication.b(), 0).a()) {
                attributes.y = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.dialogMarginBottom);
                window.setGravity(80);
            } else {
                window.setGravity(17);
            }
            window.setAttributes(attributes);
            this.o.setContentView(viewInflate);
            d(viewInflate);
            e(viewInflate);
            a(viewInflate, zY, iD, iA);
            b(viewInflate);
            return this.o;
        }

        private void d(View view) {
            e((HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_title), this.l);
            e((HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_subtitle), this.n);
            e((HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_content), this.f27271c);
        }

        private void e(View view) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_positive);
            b(healthTextView, this.k, this.j);
            HealthTextView healthTextView2 = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_negative);
            b(healthTextView2, this.g, this.h);
            HealthTextView healthTextView3 = (HealthTextView) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_know);
            b(healthTextView3, this.f, this.i);
            e(healthTextView, healthTextView2, healthTextView3);
            a(healthTextView, healthTextView2, healthTextView3);
            view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_about).setOnClickListener(new View.OnClickListener() { // from class: umj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f50361c.a(view2);
                }
            });
            View viewFindViewById = view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_share);
            if (this.m != null) {
                viewFindViewById.setVisibility(0);
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.SleepTaskDialog.Builder.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        Builder.this.o.dismiss();
                        if (Builder.this.m != null) {
                            Builder.this.m.onClick(view2);
                        }
                    }
                });
            }
        }

        public /* synthetic */ void a(View view) {
            this.o.dismiss();
            View.OnClickListener onClickListener = this.f27269a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        private void b(HealthTextView healthTextView, String str, final View.OnClickListener onClickListener) {
            if (TextUtils.isEmpty(str)) {
                healthTextView.setVisibility(8);
                return;
            }
            healthTextView.setVisibility(0);
            healthTextView.setText(str);
            healthTextView.setOnClickListener(new View.OnClickListener() { // from class: umk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f50362a.a(onClickListener, view);
                }
            });
        }

        public /* synthetic */ void a(View.OnClickListener onClickListener, View view) {
            this.o.dismiss();
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        private void e(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
            if (healthTextView.getVisibility() != 8) {
                a(healthTextView, BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
            } else if (healthTextView2.getVisibility() != 8) {
                a(healthTextView2, BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.elementsMarginVerticalM));
            } else if (healthTextView3.getVisibility() != 8) {
                a(healthTextView3, BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.defaultPaddingBottomFixed));
            }
        }

        private void a(HealthTextView healthTextView, int i) {
            ViewGroup.LayoutParams layoutParams = healthTextView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.defaultPaddingTop);
                layoutParams2.bottomMargin = i;
                healthTextView.setLayoutParams(layoutParams2);
            }
        }

        private void a(HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
            if (healthTextView.getVisibility() == 0) {
                healthTextView.setBackground(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.button_background_model_dialog));
            } else if (healthTextView2.getVisibility() == 0) {
                healthTextView2.setBackground(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.button_background_model_dialog));
            } else if (healthTextView3.getVisibility() == 0) {
                healthTextView3.setBackground(ContextCompat.getDrawable(BaseApplication.b(), R.drawable.button_background_model_dialog));
            }
        }

        private void a(View view, boolean z, int i, int i2) {
            FrameLayout frameLayout = (FrameLayout) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_background);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            frameLayout.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_layout);
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = z ? 48 : 80;
                linearLayout.setLayoutParams(layoutParams3);
            }
        }

        private void b(View view) {
            if (this.d == null) {
                return;
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(com.huawei.health.servicesui.R.id.dialog_base_task_custom);
            linearLayout.setVisibility(0);
            linearLayout.addView(this.d);
        }

        private void e(HealthTextView healthTextView, String str) {
            if (TextUtils.isEmpty(str)) {
                healthTextView.setVisibility(8);
            } else {
                healthTextView.setVisibility(0);
                healthTextView.setText(str);
            }
        }

        private Size a(ImageBean imageBean, View view) {
            Drawable drawableC = c(imageBean);
            if (drawableC != null) {
                view.setBackground(drawableC);
                return new Size(drawableC.getIntrinsicWidth(), drawableC.getIntrinsicHeight());
            }
            Bitmap bitmapC = qqf.c(R.drawable.health_life_background);
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(BaseApplication.b().getResources(), bitmapC);
            roundedBitmapDrawableCreate.setAntiAlias(true);
            roundedBitmapDrawableCreate.setDither(true);
            roundedBitmapDrawableCreate.setCornerRadius(BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_dialog));
            view.setBackground(roundedBitmapDrawableCreate);
            return new Size(bitmapC.getWidth(), bitmapC.getHeight());
        }

        private Drawable c(ImageBean imageBean) {
            if (imageBean == null) {
                return null;
            }
            for (PictureBean pictureBean : imageBean.getPictureList()) {
                if (pictureBean.getScenario() == 100) {
                    return c(qqf.f(pictureBean.getPath()));
                }
            }
            return null;
        }

        private Drawable c(Bitmap bitmap) {
            RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(BaseApplication.b().getResources(), bitmap);
            roundedBitmapDrawableCreate.setAntiAlias(true);
            roundedBitmapDrawableCreate.setDither(true);
            roundedBitmapDrawableCreate.setCornerRadius(BaseApplication.b().getResources().getDimensionPixelSize(R.dimen.emui_corner_radius_dialog));
            return roundedBitmapDrawableCreate;
        }
    }
}
