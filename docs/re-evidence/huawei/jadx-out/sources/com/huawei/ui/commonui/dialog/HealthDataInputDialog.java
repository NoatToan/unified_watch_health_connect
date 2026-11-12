package com.huawei.ui.commonui.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.scrollview.ScrollScaleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthDataInputDialog extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f23437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f23438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f23439c;
    private boolean d;
    private HealthTextView e;
    private HealthSubHeader f;
    private View g;
    private List<d> h;
    private HealthButton i;
    private Drawable j;
    private int l;
    private ViewGroup m;

    public interface DataSetFormatter {
        String format(int i);
    }

    public interface PositiveBtnClickListener {
        void onClick(List<Integer> list);
    }

    public interface SelectedValueProcessor {
        String format(int i);

        int process(int i, int i2);
    }

    public HealthDataInputDialog(Context context) {
        super(context, R.style.CustomDialog);
        this.h = new ArrayList();
        this.f23439c = context;
        e();
    }

    private void e() {
        View viewInflate = LayoutInflater.from(this.f23439c).inflate(R.layout.health_data_input_dialog_layout, (ViewGroup) null);
        this.g = viewInflate;
        viewInflate.setWillNotDraw(false);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.g.findViewById(R.id.sub_header);
        this.f = healthSubHeader;
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f23439c, R.color.common_transparent));
        if (LanguageUtil.d(this.f23439c) || LanguageUtil.q(this.f23439c)) {
            this.f.setHeadTitleForEnglish();
        }
        this.m = (ViewGroup) this.g.findViewById(R.id.views_container);
        this.e = (HealthTextView) this.g.findViewById(R.id.dialog_content);
        this.i = (HealthButton) this.g.findViewById(R.id.positive_btn);
        HealthButton healthButton = (HealthButton) this.g.findViewById(R.id.negative_btn);
        this.f23437a = healthButton;
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: qka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(view);
            }
        });
        setContentView(this.g);
    }

    public /* synthetic */ void e(View view) {
        dismiss();
    }

    private void d() {
        this.i.setBackground(this.j);
        this.i.setTextColor(ContextCompat.getColor(this.f23439c, R.color.textColorPrimaryInverse));
        this.f23437a.setBackground(this.f23438b);
        this.f23437a.setTextColor(this.l);
    }

    public HealthDataInputDialog e(int i) {
        this.l = i;
        this.j = a(i);
        this.f23438b = a(ContextCompat.getColor(this.f23439c, R.color.common_transparent));
        d();
        return this;
    }

    public HealthDataInputDialog c(String str) {
        this.f.setHeadTitleText(str);
        return this;
    }

    public HealthDataInputDialog b(String str) {
        this.e.setText(str);
        return this;
    }

    public HealthDataInputDialog b(boolean z) {
        this.e.setSplittable(z);
        return this;
    }

    public HealthDataInputDialog d(String str) {
        this.i.setText(str);
        return this;
    }

    public HealthDataInputDialog e(boolean z) {
        this.d = z;
        return this;
    }

    public HealthDataInputDialog a(e eVar) {
        View viewInflate = LayoutInflater.from(this.f23439c).inflate(R.layout.health_data_input_scroll_ruler_layout, this.m, false);
        d dVar = new d(viewInflate, eVar);
        if (this.h.isEmpty() && dVar.d != null) {
            dVar.d.setVisibility(8);
        }
        this.h.add(dVar);
        this.m.addView(viewInflate);
        return this;
    }

    public void a(boolean z) {
        HealthButton healthButton = this.i;
        if (healthButton != null) {
            healthButton.setEnabled(z);
            if (!z) {
                this.i.setAlpha(0.4f);
            } else {
                this.i.setAlpha(1.0f);
                d();
            }
        }
    }

    public HealthDataInputDialog a(View view) {
        this.m.addView(view);
        return this;
    }

    private Drawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(this.f23439c.getResources().getDimensionPixelSize(R.dimen.health_common_20dp));
        return gradientDrawable;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        List<d> list;
        super.onWindowFocusChanged(z);
        if (!z || (list = this.h) == null) {
            return;
        }
        for (d dVar : list) {
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    public boolean b() {
        if (!this.d) {
            return false;
        }
        boolean z = true;
        for (d dVar : this.h) {
            if (dVar != null && dVar.f23442c != null && !dVar.f23442c.f23445c) {
                z = false;
            }
        }
        return z;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f23443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f23444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f23445c;
        DataSetFormatter d;
        boolean e;
        String f;
        SelectedValueProcessor g;
        int h;
        String i;
        int j;
        int o = 10;

        public e(int i, int i2, DataSetFormatter dataSetFormatter, SelectedValueProcessor selectedValueProcessor) {
            this.j = i;
            this.h = i2;
            this.d = dataSetFormatter;
            this.g = selectedValueProcessor;
        }

        public e c(String str) {
            this.f = str;
            return this;
        }

        public e d(int i) {
            this.f23444b = i;
            return this;
        }

        public e e(String str) {
            this.i = str;
            return this;
        }

        public e e(int i) {
            this.o = i;
            return this;
        }

        public e d(String str) {
            this.f23443a = str;
            return this;
        }

        public e b(boolean z) {
            this.e = z;
            return this;
        }
    }

    public HealthDataInputDialog d(final PositiveBtnClickListener positiveBtnClickListener) {
        HealthButton healthButton = this.i;
        if (healthButton != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: qjz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f46372a.b(positiveBtnClickListener, view);
                }
            });
        }
        return this;
    }

    public /* synthetic */ void b(PositiveBtnClickListener positiveBtnClickListener, View view) {
        ArrayList arrayList = new ArrayList();
        for (d dVar : this.h) {
            if (dVar != null) {
                arrayList.add(Integer.valueOf(dVar.g));
            }
        }
        positiveBtnClickListener.onClick(arrayList);
    }

    public HealthDataInputDialog c(View.OnClickListener onClickListener) {
        HealthButton healthButton = this.f23437a;
        if (healthButton != null) {
            healthButton.setOnClickListener(onClickListener);
        }
        return this;
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f23440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f23441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f23442c;
        View d;
        ScrollScaleView e;
        HealthTextView f;
        int g;
        HealthTextView h;
        HealthTextView i;
        View j;
        ConstraintLayout o;

        public d(View view, e eVar) {
            this.j = view;
            this.f23442c = eVar;
            this.i = (HealthTextView) view.findViewById(R.id.selected_value_text);
            ScrollScaleView scrollScaleView = (ScrollScaleView) this.j.findViewById(R.id.scroll_scale);
            this.e = scrollScaleView;
            scrollScaleView.setCustomStartColor(HealthDataInputDialog.this.l);
            this.h = (HealthTextView) this.j.findViewById(R.id.selected_title_text);
            this.f = (HealthTextView) this.j.findViewById(R.id.selected_unit_text);
            this.d = this.j.findViewById(R.id.divider);
            this.o = (ConstraintLayout) this.j.findViewById(R.id.blood_data_input_title_parent);
            this.f23440a = (HealthTextView) this.j.findViewById(R.id.hint_content);
            if (LanguageUtil.br(HealthDataInputDialog.this.f23439c)) {
                this.o.setLayoutDirection(0);
            }
            int i = this.f23442c.h;
            DataSetFormatter dataSetFormatter = this.f23442c.d;
            ArrayList arrayList = new ArrayList();
            int i2 = this.f23442c.o;
            for (int i3 = this.f23442c.j; i3 <= i; i3 += i2) {
                arrayList.add(dataSetFormatter.format(i3));
            }
            this.e.setOnSelectedListener(new ScrollScaleView.OnSelectedListener() { // from class: qkd
                @Override // com.huawei.ui.commonui.scrollview.ScrollScaleView.OnSelectedListener
                public final void onSelected(List list, int i4) {
                    this.f46378c.d(list, i4);
                }
            });
            this.e.setData(arrayList, 10, 40);
            this.e.setSelectedPosition(this.f23442c.f23444b);
            this.h.setText(this.f23442c.f);
            this.f.setText(this.f23442c.i);
            if (this.f23442c.e) {
                this.o.setVisibility(8);
                this.f23440a.setVisibility(0);
                this.f23440a.setText(this.f23442c.f23443a);
            }
        }

        public /* synthetic */ void d(List list, int i) {
            String strValueOf;
            SelectedValueProcessor selectedValueProcessor = this.f23442c.g;
            int i2 = this.f23442c.j;
            if (selectedValueProcessor != null) {
                int iProcess = selectedValueProcessor.process(i, i2);
                this.g = iProcess;
                strValueOf = selectedValueProcessor.format(iProcess);
            } else {
                int i3 = i + i2;
                this.g = i3;
                strValueOf = String.valueOf(i3);
            }
            this.f23441b = strValueOf;
            this.i.setText(strValueOf);
            if (this.o.getVisibility() == 8) {
                this.f23440a.setVisibility(8);
                this.o.setVisibility(0);
                this.f23442c.f23445c = true;
                if (HealthDataInputDialog.this.b()) {
                    HealthDataInputDialog.this.a(true);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.i.setText(this.f23441b);
            this.i.setVisibility(0);
            this.h.setText(this.f23442c.f);
            this.h.setVisibility(0);
            this.f.setText(this.f23442c.i);
            this.f.setVisibility(0);
        }
    }
}
