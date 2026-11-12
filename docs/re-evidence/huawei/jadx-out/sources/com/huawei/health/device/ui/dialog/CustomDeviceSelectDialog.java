package com.huawei.health.device.ui.dialog;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.dmp;
import defpackage.dru;
import defpackage.dsa;
import defpackage.dxw;
import defpackage.ekd;
import defpackage.elh;
import defpackage.qrs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class CustomDeviceSelectDialog extends BaseDialog {
    private CustomDeviceSelectDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HealthDevice.HealthDeviceKind f6336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<dru> f6337b = new ArrayList<>(16);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DeviceCheckAdapter f6338c;
        private final Context d;
        private CustomDeviceSelectDialog e;
        private HealthRecycleView f;
        private RelativeLayout g;
        private dru h;
        private LinearLayout i;
        private LinearLayout j;
        private HealthButton k;
        private View.OnClickListener l;
        private String m;
        private DeviceCheckAdapter.OnItemClickListener n;
        private HealthButton o;
        private String p;
        private String q;
        private String s;

        public Builder(Context context) {
            this.d = context;
        }

        private String a(int i) {
            try {
                return String.valueOf(this.d.getText(i));
            } catch (Resources.NotFoundException unused) {
                LogUtil.e("CustomTextAlertDialog", "Resources NotFound");
                return "";
            }
        }

        public Builder d(int i) {
            LogUtil.d("CustomTextAlertDialog", "setTitle: ", Integer.valueOf(i));
            this.s = a(i);
            return this;
        }

        public Builder d(HealthDevice.HealthDeviceKind healthDeviceKind) {
            LogUtil.d("CustomTextAlertDialog", "deviceKindId: ", healthDeviceKind);
            this.f6336a = healthDeviceKind;
            return this;
        }

        public Builder e(int i, DeviceCheckAdapter.OnItemClickListener onItemClickListener) {
            this.p = a(i);
            this.n = onItemClickListener;
            return this;
        }

        public Builder a(int i, View.OnClickListener onClickListener) {
            this.m = a(i);
            this.l = onClickListener;
            return this;
        }

        public CustomDeviceSelectDialog b() {
            Drawable drawable;
            int dimensionPixelSize;
            this.e = new CustomDeviceSelectDialog(this.d, R.style.CustomDialog);
            Object systemService = this.d.getSystemService("layout_inflater");
            if (systemService instanceof LayoutInflater) {
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.device_custom_select_dialog, (ViewGroup) null);
                TypedValue typedValue = new TypedValue();
                this.d.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
                if (typedValue.resourceId != 0) {
                    TypedArray typedArrayObtainStyledAttributes = this.d.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                    drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                    TypedValue typedValue2 = new TypedValue();
                    TypedValue typedValue3 = new TypedValue();
                    typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                    typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
                    dimensionPixelSize = qrs.d(this.d, (int) TypedValue.complexToFloat(typedValue2.data));
                    typedArrayObtainStyledAttributes.recycle();
                } else {
                    drawable = ContextCompat.getDrawable(this.d, R.drawable.activity_dialog_bg);
                    dimensionPixelSize = this.d.getResources().getDimensionPixelSize(R.dimen.custom_normal_titlebar_title_textsize);
                }
                viewInflate.setBackground(drawable);
                e(viewInflate, dimensionPixelSize);
                b(viewInflate);
                e(viewInflate);
                this.e.setContentView(viewInflate);
            }
            return this.e;
        }

        private void e(View view, int i) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_dailog_title);
            healthTextView.setTextSize(0, i);
            healthTextView.setText(this.s);
        }

        private void e(View view) {
            this.g = (RelativeLayout) view.findViewById(R.id.dialog_linearlayout1);
            this.j = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.k = (HealthButton) this.g.findViewById(R.id.dialog_btn_negative);
            HealthButton healthButton = (HealthButton) this.g.findViewById(R.id.dialog_btn_positive);
            this.o = healthButton;
            healthButton.setTextAppearance(R.style.health_button_style_emphasize);
            this.o.setBackground(ContextCompat.getDrawable(this.d, R.drawable.button_background_emphasize));
            this.g.setVisibility(0);
            this.j.setVisibility(8);
            this.o.setText(this.p);
            this.o.setAllCaps(true);
            if (this.n != null) {
                this.o.setOnClickListener(new a());
            }
            this.k.setText(this.m);
            this.k.setAllCaps(true);
            if (this.l != null) {
                this.k.setOnClickListener(new d());
            }
        }

        private void b(View view) {
            ArrayList<ContentValues> arrayListC;
            if (!TextUtils.isEmpty(this.q)) {
                arrayListC = dmp.d().c(this.q);
            } else if (this.f6336a == null) {
                arrayListC = dmp.d().f();
            } else {
                arrayListC = dmp.d().c(this.f6336a);
            }
            for (ContentValues contentValues : arrayListC) {
                String asString = contentValues.getAsString("productId");
                String asString2 = contentValues.getAsString("uniqueId");
                if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                    LogUtil.j("CustomTextAlertDialog", "initDeviceList : productId or deviceIdentify is empty");
                } else {
                    elh elhVarD = ResourceManager.c().d(asString);
                    if (elhVarD != null && !elhVarD.l().b().trim().isEmpty()) {
                        dru druVarB = ekd.b(elhVarD);
                        druVarB.a(contentValues);
                        druVarB.d(new dsa("deviceUsedTime").b(dxw.d(), contentValues.getAsString("uniqueId")));
                        this.f6337b.add(druVarB);
                    }
                }
            }
            this.f = (HealthRecycleView) view.findViewById(R.id.rc_card_device_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d);
            linearLayoutManager.setOrientation(1);
            this.f.setLayoutManager(linearLayoutManager);
            a(view);
            DeviceCheckAdapter deviceCheckAdapter = new DeviceCheckAdapter(this.d, this.f6337b, new DeviceCheckAdapter.OnItemClickListener() { // from class: dta
                @Override // com.huawei.health.device.ui.dialog.DeviceCheckAdapter.OnItemClickListener
                public final void onItemClick(dru druVar) {
                    this.e.a(druVar);
                }
            });
            this.f6338c = deviceCheckAdapter;
            this.f.setAdapter(deviceCheckAdapter);
        }

        public /* synthetic */ void a(dru druVar) {
            this.h = druVar;
        }

        private void a(View view) {
            int height;
            int size = this.f6337b.size();
            Context context = this.d;
            if (context == null || size <= 0 || !(context instanceof Activity) || qrs.d(this.d, (size * 90) + 120) <= (height = (int) (((Activity) context).getWindowManager().getDefaultDisplay().getHeight() * 0.8f))) {
                return;
            }
            this.i = (LinearLayout) view.findViewById(R.id.rc_card_device_linear);
            this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, height - qrs.d(this.d, 120.0f)));
        }

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.n != null) {
                    Builder.this.n.onItemClick(Builder.this.h);
                } else {
                    LogUtil.d("CustomTextAlertDialog", "positiveButtonClickListener is null");
                }
            }
        }

        class d implements View.OnClickListener {
            d() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.l != null) {
                    Builder.this.l.onClick(view);
                }
            }
        }
    }
}
