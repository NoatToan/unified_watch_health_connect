package com.huawei.health.ecologydevice.ui.dialog;

import android.app.Activity;
import android.content.Context;
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
import com.huawei.ecologydevice.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SelectDialog extends BaseDialog {
    private SelectDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f6585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LinearLayout f6586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthRecycleView f6587c;
        private LinearLayout d;
        private SelectDialog e;
        private String f;
        private HealthButton g;
        private HealthButton h;
        private View.OnClickListener i;
        private RelativeLayout j;
        private List<Map.Entry<String, String>> k = new ArrayList(16);
        private SelectAdapter.OnItemClickListener l;
        private String m;
        private SelectAdapter n;
        private String o;
        private String p;

        public Builder(Context context) {
            this.f6585a = context;
        }

        public Builder c(LinkedHashMap<String, String> linkedHashMap) {
            if (linkedHashMap != null) {
                ArrayList arrayList = new ArrayList(linkedHashMap.entrySet());
                if (njy.b(arrayList)) {
                    this.k.addAll(arrayList);
                    this.o = this.k.get(0).getKey();
                }
            }
            return this;
        }

        public Builder a(int i, SelectAdapter.OnItemClickListener onItemClickListener) {
            this.m = this.f6585a.getResources().getString(i);
            this.l = onItemClickListener;
            return this;
        }

        public Builder e(int i, View.OnClickListener onClickListener) {
            this.f = this.f6585a.getResources().getString(i);
            this.i = onClickListener;
            return this;
        }

        public SelectDialog a() {
            Drawable drawable;
            int dimensionPixelSize;
            this.e = new SelectDialog(this.f6585a, R.style.CustomDialog);
            Object systemService = this.f6585a.getSystemService("layout_inflater");
            if (systemService instanceof LayoutInflater) {
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_custom_select, (ViewGroup) null);
                TypedValue typedValue = new TypedValue();
                this.f6585a.getTheme().resolveAttribute(R.attr.customDialogStyleRefer, typedValue, true);
                if (typedValue.resourceId != 0) {
                    TypedArray typedArrayObtainStyledAttributes = this.f6585a.getTheme().obtainStyledAttributes(typedValue.resourceId, R.styleable.customDialogDefinition);
                    drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.customDialogDefinition_dialogBackground);
                    TypedValue typedValue2 = new TypedValue();
                    TypedValue typedValue3 = new TypedValue();
                    typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_titleTextSize, typedValue2);
                    typedArrayObtainStyledAttributes.getValue(R.styleable.customDialogDefinition_contentTextSize, typedValue3);
                    dimensionPixelSize = qrs.d(this.f6585a, (int) TypedValue.complexToFloat(typedValue2.data));
                    typedArrayObtainStyledAttributes.recycle();
                } else {
                    drawable = ContextCompat.getDrawable(this.f6585a, R.drawable.activity_dialog_bg);
                    dimensionPixelSize = this.f6585a.getResources().getDimensionPixelSize(R.dimen.custom_normal_titlebar_title_textsize);
                }
                viewInflate.setBackground(drawable);
                d(viewInflate, dimensionPixelSize);
                a(viewInflate);
                e(viewInflate);
                this.e.setContentView(viewInflate);
            }
            return this.e;
        }

        private void d(View view, int i) {
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.custom_dailog_title);
            if (TextUtils.isEmpty(this.p)) {
                healthTextView.setVisibility(8);
            } else {
                healthTextView.setTextSize(0, i);
                healthTextView.setText(this.p);
            }
        }

        private void e(View view) {
            this.j = (RelativeLayout) view.findViewById(R.id.dialog_linearlayout1);
            this.f6586b = (LinearLayout) view.findViewById(R.id.dialog_linearlayout2);
            this.g = (HealthButton) this.j.findViewById(R.id.dialog_btn_negative);
            this.h = (HealthButton) this.j.findViewById(R.id.dialog_btn_positive);
            this.j.setVisibility(0);
            this.f6586b.setVisibility(8);
            this.h.setText(this.m);
            this.h.setAllCaps(true);
            if (this.l != null) {
                this.h.setOnClickListener(new b());
            }
            this.g.setText(this.f);
            this.g.setAllCaps(true);
            if (this.i != null) {
                this.g.setOnClickListener(new a());
            }
        }

        private void a(View view) {
            this.f6587c = (HealthRecycleView) view.findViewById(R.id.rc_card_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f6585a);
            linearLayoutManager.setOrientation(1);
            this.f6587c.setLayoutManager(linearLayoutManager);
            d(view);
            SelectAdapter selectAdapter = new SelectAdapter(this.f6585a, this.k, new SelectAdapter.OnItemClickListener() { // from class: eob
                @Override // com.huawei.health.ecologydevice.ui.dialog.SelectAdapter.OnItemClickListener
                public final void onItemClick(String str) {
                    this.f33266a.d(str);
                }
            });
            this.n = selectAdapter;
            this.f6587c.setAdapter(selectAdapter);
        }

        public /* synthetic */ void d(String str) {
            this.o = str;
        }

        private void d(View view) {
            int height;
            int size = this.k.size();
            Context context = this.f6585a;
            if (context == null || size == 0 || !(context instanceof Activity) || qrs.d(this.f6585a, (size * 60) + 120) <= (height = (int) (((Activity) context).getWindowManager().getDefaultDisplay().getHeight() * 0.8f))) {
                return;
            }
            this.d = (LinearLayout) view.findViewById(R.id.rc_card_linear);
            this.d.setLayoutParams(new LinearLayout.LayoutParams(-1, height - qrs.d(this.f6585a, 120.0f)));
        }

        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.l != null) {
                    Builder.this.l.onItemClick(Builder.this.o);
                } else {
                    LogUtil.d("SelectDialog", "positiveButtonClickListener is null");
                }
            }
        }

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.e != null) {
                    Builder.this.e.dismiss();
                }
                if (Builder.this.i != null) {
                    Builder.this.i.onClick(view);
                }
            }
        }
    }
}
