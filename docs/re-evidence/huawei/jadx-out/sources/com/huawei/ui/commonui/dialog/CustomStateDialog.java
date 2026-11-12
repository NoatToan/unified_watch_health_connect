package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.pic;
import defpackage.pig;
import health.compact.a.EzPluginManager;
import health.compact.a.utils.StringUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class CustomStateDialog extends BaseDialog {
    private CustomStateDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f23416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f23417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f23418c;
        private List<List<String>> d;
        private Context e;
        private int f = 0;
        private ImageView g;
        private CustomStateDialog h;
        private int i;
        private HealthButton j;
        private HealthButton l;
        private List<String> m;
        private HealthTextView n;

        public Builder(Context context) {
            this.e = context;
        }

        public Builder c(List<List<String>> list) {
            this.d = list;
            return this;
        }

        public Builder e(List<String> list) {
            this.m = list;
            return this;
        }

        public Builder a(List<String> list) {
            this.f23416a = list;
            return this;
        }

        public Builder e(String str) {
            this.f23417b = str;
            return this;
        }

        public Builder d(int i) {
            this.i = i;
            return this;
        }

        public CustomStateDialog a(int i) {
            LogUtil.a("CustomStateDialog", "enter create dialog, isTextCenter: ", Integer.valueOf(i));
            CustomStateDialog customStateDialog = new CustomStateDialog(this.e, R.style.CustomDialog);
            this.h = customStateDialog;
            if (this.f23416a == null) {
                return customStateDialog;
            }
            View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.commonui_custom_state_dialog, (ViewGroup) null);
            TypedValue typedValue = new TypedValue();
            this.e.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
            TypedArray typedArrayObtainStyledAttributes = this.e.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
            typedArrayObtainStyledAttributes.recycle();
            viewInflate.setBackground(drawable);
            this.h.addContentView(viewInflate, new ViewGroup.LayoutParams(-2, -2));
            this.g = (ImageView) viewInflate.findViewById(R.id.custom_state_dialog_image);
            this.n = (HealthTextView) viewInflate.findViewById(R.id.custom_state_dialog_title);
            this.f23418c = (HealthTextView) viewInflate.findViewById(R.id.custom_state_dialog_description);
            c(this.f);
            a(this.f, i);
            j(this.f);
            e(viewInflate, i);
            this.h.setContentView(viewInflate);
            return this.h;
        }

        private void e(View view, final int i) {
            HealthButton healthButton = (HealthButton) view.findViewById(R.id.status_dialog_btn_negative);
            this.j = healthButton;
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.CustomStateDialog.Builder.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Builder.this.e(i);
                }
            });
            HealthButton healthButton2 = (HealthButton) view.findViewById(R.id.status_dialog_btn_positive);
            this.l = healthButton2;
            healthButton2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.commonui.dialog.CustomStateDialog.Builder.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Builder.this.b(i);
                }
            });
            if (this.f23416a.size() == 1) {
                b();
            } else {
                c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i) {
            if (this.h == null) {
                return;
            }
            int i2 = this.f - 1;
            this.f = i2;
            LogUtil.a("CustomStateDialog", "on click negativeButton button, mPageIndex is: ", Integer.valueOf(i2));
            int i3 = this.f;
            if (i3 < 0) {
                this.h.dismiss();
                return;
            }
            e(i3, i);
            if (this.f == 0) {
                this.j.setText(R.string.IDS_device_user_guide_cancel_btn);
            } else {
                this.j.setText(R.string.IDS_device_user_guide_previous_btn);
            }
            if (this.f == this.f23416a.size() - 2) {
                this.l.setText(R.string.IDS_device_user_guide_next_btn);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i) {
            int i2 = this.f + 1;
            this.f = i2;
            LogUtil.a("CustomStateDialog", "on click positive button, mPageIndex is: ", Integer.valueOf(i2), ", isTextCenter: ", Integer.valueOf(i));
            int size = this.f23416a.size();
            if (size > 1 && this.f == 1) {
                this.j.setText(R.string.IDS_device_user_guide_previous_btn);
            }
            int i3 = this.f;
            if (i3 < size) {
                e(i3, i);
            }
            if (this.f == size - 1) {
                LogUtil.a("CustomStateDialog", "last page");
                this.l.setText(R.string.IDS_device_user_guide_complete_btn);
            }
            if (this.f >= size) {
                LogUtil.a("CustomStateDialog", "close dialog");
                CustomStateDialog customStateDialog = this.h;
                if (customStateDialog != null) {
                    customStateDialog.dismiss();
                }
            }
        }

        private void e(int i, int i2) {
            c(i);
            a(i, i2);
            j(i);
        }

        private void b() {
            this.j.setVisibility(0);
            this.j.setText(R.string.IDS_common_notification_know_tips);
        }

        private void c() {
            this.j.setVisibility(0);
            this.l.setVisibility(0);
            this.j.setText(R.string.IDS_device_user_guide_cancel_btn);
            this.l.setText(R.string.IDS_device_user_guide_next_btn);
        }

        private void c(int i) {
            List<String> list = this.m;
            if (list == null || list.isEmpty() || i >= this.m.size()) {
                return;
            }
            if (StringUtils.g(this.m.get(i))) {
                this.n.setVisibility(8);
            } else {
                this.n.setVisibility(0);
                this.n.setText(this.m.get(i));
            }
        }

        private void a(int i, int i2) {
            List<String> list = this.f23416a;
            if (list == null || list.isEmpty() || i >= this.f23416a.size()) {
                return;
            }
            this.f23418c.setText(this.f23416a.get(i));
            if (i2 != 0) {
                this.f23418c.setGravity(17);
            }
        }

        private void j(int i) {
            LogUtil.a("CustomStateDialog", "enter setmImageView");
            List<List<String>> list = this.d;
            if (list == null || list.isEmpty()) {
                LogUtil.a("CustomStateDialog", "mAnimationDrawablesList is null");
                return;
            }
            if (i >= this.d.size()) {
                return;
            }
            pic picVarA = EzPluginManager.b().a(this.f23417b);
            if (picVarA == null) {
                LogUtil.a("CustomStateDialog", "ezPluginInfo is null");
                return;
            }
            List<String> list2 = this.d.get(i);
            if (list2 == null || list2.isEmpty()) {
                LogUtil.a("CustomStateDialog", "image name list is null");
                return;
            }
            if (list2.size() == 1) {
                LogUtil.a("CustomStateDialog", "image name list size is 1");
                Bitmap bitmapE = e(picVarA, list2.get(0));
                if (bitmapE == null) {
                    LogUtil.a("CustomStateDialog", "don't have image bitmap");
                    return;
                } else {
                    this.g.setImageDrawable(new BitmapDrawable(bitmapE));
                    return;
                }
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = 200;
            }
            AnimationDrawable animationDrawable = new AnimationDrawable();
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                Bitmap bitmapE2 = e(picVarA, it.next());
                if (bitmapE2 != null) {
                    animationDrawable.addFrame(new BitmapDrawable(bitmapE2), i2);
                }
            }
            this.g.setImageDrawable(animationDrawable);
            animationDrawable.setOneShot(false);
            animationDrawable.start();
        }

        private Bitmap e(pic picVar, String str) {
            return EzPluginManager.b().h(pig.c().e(picVar.b()) + File.separator + picVar.b() + File.separator + "img" + File.separator + str + ".png");
        }
    }
}
