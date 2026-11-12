package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.health.servicesui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter;
import com.huawei.ui.commonui.tablewidget.BaseViewHolder;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class jmb extends BaseHealthTableAdapter<BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f38720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38722c;
    private final float[] d;
    private boolean e;
    private String f;
    private Set<Integer> g;
    private final qpv<jpj, jpn, jpn, jpn, jpn, jpn> h;
    private float i;
    private final LayoutInflater j;

    public jmb(Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z) {
        this(context, qpvVar, z, 0.0f);
    }

    public jmb(Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z, float f) {
        this.d = new float[]{59.75f, 53.75f, 47.5f, 50.75f, 52.0f, 49.0f};
        this.g = new HashSet();
        this.j = LayoutInflater.from(context);
        this.h = qpvVar;
        this.f38720a = context;
        this.f = context.getString(R.string.IDS_motiontrack_show_invalid_data);
        this.f38721b = z;
        this.i = f;
    }

    public jmb(Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z, float f, boolean z2) {
        this.d = new float[]{59.75f, 53.75f, 47.5f, 50.75f, 52.0f, 49.0f};
        this.g = new HashSet();
        this.j = LayoutInflater.from(context);
        this.h = qpvVar;
        this.f38720a = context;
        this.f = context.getString(R.string.IDS_motiontrack_show_invalid_data);
        this.f38721b = z;
        this.i = f;
        this.e = z2;
        Context context2 = this.f38720a;
        if (context2 != null) {
            this.f38722c = context2.getResources().getConfiguration().fontScale > 1.0f;
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getRowCount() {
        return this.h.getRowsCount();
    }

    @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getColumnCount() {
        return this.h.getColumnsCount();
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateItemViewHolder(ViewGroup viewGroup) {
        return new d(this.j.inflate(this.f38722c ? R.layout.item_content_large_style : R.layout.item_content, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateColumnHeaderViewHolder(ViewGroup viewGroup) {
        return new c(this.j.inflate(R.layout.item_header_column, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateRowHeaderViewHolder(ViewGroup viewGroup) {
        return new d(this.j.inflate(R.layout.item_header_row, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateRowColumnHeaderViewHolder(ViewGroup viewGroup) {
        return new c(this.j.inflate(R.layout.item_header_rowcolumn, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateStatisticHeaderViewHolder(ViewGroup viewGroup) {
        return new d(this.j.inflate(R.layout.item_statistic_header, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public BaseViewHolder onCreateStatisticViewHolder(ViewGroup viewGroup) {
        return new d(this.j.inflate(R.layout.item_statistic, viewGroup, false));
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindContentViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        int iB;
        boolean zE;
        boolean zD;
        int iArgb;
        if (baseViewHolder instanceof d) {
            d dVar = (d) baseViewHolder;
            if (i2 == 0) {
                dVar.d(a());
            }
            jpn jpnVar = (jpn) this.h.getContentData(i, i2);
            String value = this.f;
            if (jpnVar != null) {
                value = jpnVar.getValue();
                zE = jpnVar.e();
                zD = jpnVar.d();
                iB = jpnVar.b();
            } else {
                iB = 0;
                zE = false;
                zD = false;
            }
            dVar.b(value, this.f38721b);
            if (this.g.contains(Integer.valueOf(i))) {
                d(dVar.getItemView(), i, i2);
            } else {
                a(dVar.getItemView(), i, i2);
            }
            if (qqs.e(this.f38720a)) {
                iArgb = Color.argb(153, 255, 255, 255);
            } else {
                iArgb = Color.argb(153, 0, 0, 0);
            }
            if (!this.e || !this.f38722c) {
                dVar.c(zE);
            }
            if (!zD) {
                iB = iArgb;
            }
            dVar.c(iB);
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindColumnHeaderViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        String strB;
        boolean z;
        if (baseViewHolder instanceof c) {
            c cVar = (c) baseViewHolder;
            jpj jpjVar = (jpj) this.h.getColumnHeaderData(i, i2);
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 == getColumnCount() - 1) {
                    cVar.e(0);
                }
            } else {
                cVar.b(a());
            }
            String value = this.f;
            String str = "";
            if (jpjVar != null) {
                value = jpjVar.getValue();
                strB = jpjVar.b();
                if (value == null || strB == null || !strB.trim().replaceAll("[()（）]", "").equals(value.trim())) {
                    str = strB;
                    strB = str;
                    z = false;
                } else {
                    z = true;
                }
            } else {
                strB = str;
                z = false;
            }
            if (cVar.f38724b != null) {
                cVar.f38724b.setVisibility(z ? 4 : 0);
            }
            cVar.a(cVar.f38724b, strB, this.f38721b);
            HealthTextView healthTextView = cVar.f38723a;
            if (!this.e && !this.f38721b) {
                z2 = false;
            }
            cVar.a(healthTextView, value, z2);
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindRowHeaderViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        if (baseViewHolder instanceof d) {
            d dVar = (d) baseViewHolder;
            jpn jpnVar = (jpn) this.h.getRowHeaderData(i, i2);
            String value = this.f;
            if (jpnVar != null && !TextUtils.isEmpty(jpnVar.getValue())) {
                value = jpnVar.getValue();
            }
            if (i2 == 0) {
                dVar.d(a());
            }
            if (this.e && this.f38722c) {
                dVar.d(1, 12);
            }
            dVar.b(value, this.f38721b);
            if (this.g.contains(Integer.valueOf(i))) {
                d(dVar.getItemView(), i, i2);
            } else {
                a(dVar.getItemView(), i, i2);
            }
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindRowColumnHeaderViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        if (baseViewHolder instanceof c) {
            c cVar = (c) baseViewHolder;
            jpn jpnVar = (jpn) this.h.getRowColumnHeaderData(i, i2);
            if (i2 == 0) {
                cVar.b(a());
            }
            if (jpnVar != null) {
                cVar.a(cVar.f38723a, jpnVar.getValue(), this.f38721b);
            }
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindStatisticHeaderViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        if (baseViewHolder instanceof d) {
            d dVar = (d) baseViewHolder;
            jpn jpnVar = (jpn) this.h.getStatisticHeaderData(i, i2);
            String value = this.f;
            if (jpnVar != null && !TextUtils.isEmpty(jpnVar.getValue())) {
                value = jpnVar.getValue();
            }
            if (i2 == 0) {
                dVar.d(a());
            }
            dVar.b(value, this.f38721b);
            if (getStatisticNum() <= 1) {
                a(dVar.getItemView(), i, i2);
            } else {
                a(i, i2, dVar);
            }
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindStatisticViewHolder(BaseViewHolder baseViewHolder, int i, int i2) {
        if (baseViewHolder instanceof d) {
            d dVar = (d) baseViewHolder;
            jpn jpnVar = (jpn) this.h.getStatisticData(i, i2);
            String value = this.f;
            if (jpnVar != null && !TextUtils.isEmpty(jpnVar.getValue())) {
                value = jpnVar.getValue();
            }
            if (i2 == 0) {
                dVar.d(a());
            }
            dVar.b(value, this.f38721b);
            if (getStatisticNum() <= 1) {
                a(dVar.getItemView(), i, i2);
            } else {
                a(i, i2, dVar);
            }
        }
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getColumnWidth(int i) {
        Context context = this.f38720a;
        float[] fArr = this.d;
        return qrs.d(context, fArr[i % fArr.length]);
    }

    @Override // com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getRowHeight(int i) {
        if (i != 0) {
            return qrs.d(this.f38720a, this.f38721b ? 25.0f : 20.0f);
        }
        Context context = this.f38720a;
        float f = this.i;
        if (f == 0.0f) {
            f = this.f38721b ? 46.5f : 34.5f;
        }
        return qrs.d(context, f);
    }

    @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getRowHeaderNum() {
        return this.h.a();
    }

    @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getStatisticNum() {
        return this.h.e();
    }

    @Override // com.huawei.ui.commonui.tablewidget.BaseHealthTableAdapter, com.huawei.ui.commonui.tablewidget.HealthTableAdapter
    public int getColumnHeaderNum() {
        return this.h.b();
    }

    public void d(int i) {
        this.g.add(Integer.valueOf(i));
    }

    public int a() {
        return qrs.d(this.f38720a, 8.0f);
    }

    public void b(int i) {
        this.g.remove(Integer.valueOf(i));
    }

    private void a(View view, int i, int i2) {
        Drawable drawableD;
        if ((i - getRowHeaderNum()) % 2 == 0) {
            if (e(i2)) {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_odd_begin);
            } else if (a(i2)) {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_odd_end);
            } else {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_odd_middle);
            }
        } else {
            drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_even);
        }
        view.setBackground(drawableD);
    }

    private void d(View view, int i, int i2) {
        Drawable drawableD;
        if (e(i2)) {
            drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_begin);
        } else if (a(i2)) {
            drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_end);
        } else {
            drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_middle);
        }
        view.setBackground(drawableD);
    }

    public void a(int i, int i2, d dVar) {
        Drawable drawableD;
        if (i == getRowCount() - 1) {
            if (njy.e(this.g) && i2 != 0) {
                dVar.b(null, this.f38721b);
            }
            if (e(i2)) {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_begin);
            } else if (a(i2)) {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_end);
            } else {
                drawableD = qre.d(this.f38720a, R.drawable.table_item_bg_select_middle);
            }
            dVar.getItemView().setBackground(drawableD);
        } else {
            dVar.getItemView().setBackgroundColor(0);
        }
        dVar.c(qre.e(R.color.colorAccent));
    }

    public boolean e(int i) {
        if (isRtl()) {
            return i == getColumnCount() - 1;
        }
        return i == 0;
    }

    public boolean a(int i) {
        if (isRtl()) {
            return i == 0;
        }
        return i == getColumnCount() - 1;
    }

    public static class d extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f38725a;

        public d(View view) {
            super(view);
            this.f38725a = (HealthTextView) view.findViewById(R.id.tvText);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i) {
            View itemView = getItemView();
            if (itemView != null) {
                getItemView().setPaddingRelative(i, itemView.getPaddingTop(), itemView.getPaddingEnd(), itemView.getPaddingBottom());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, boolean z) {
            HealthTextView healthTextView = this.f38725a;
            if (healthTextView != null) {
                if (z) {
                    healthTextView.setConnectionSymbol(false);
                    this.f38725a.setSplittable(true);
                    this.f38725a.setMaxLines(3);
                } else {
                    healthTextView.setMaxLines(1);
                    this.f38725a.setEllipsize(TextUtils.TruncateAt.END);
                }
                this.f38725a.setText(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, int i2) {
            HealthTextView healthTextView = this.f38725a;
            if (healthTextView != null) {
                healthTextView.setAutoTextSize(i, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i) {
            HealthTextView healthTextView = this.f38725a;
            if (healthTextView != null) {
                healthTextView.setTextColor(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(boolean z) {
            HealthTextView healthTextView = this.f38725a;
            if (healthTextView != null) {
                healthTextView.getPaint().setFakeBoldText(z);
            }
        }
    }

    public static class c extends BaseViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthTextView f38723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f38724b;

        public c(View view) {
            super(view);
            this.f38723a = (HealthTextView) view.findViewById(R.id.tvTitle);
            this.f38724b = (HealthTextView) view.findViewById(R.id.tvUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i) {
            View itemView = getItemView();
            if (itemView != null) {
                getItemView().setPaddingRelative(i, itemView.getPaddingTop(), itemView.getPaddingEnd(), itemView.getPaddingBottom());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(int i) {
            View itemView = getItemView();
            if (itemView != null) {
                getItemView().setPaddingRelative(itemView.getPaddingStart(), itemView.getPaddingTop(), i, itemView.getPaddingBottom());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(HealthTextView healthTextView, String str, boolean z) {
            if (healthTextView != null) {
                if (z) {
                    healthTextView.setConnectionSymbol(false);
                    healthTextView.setSplittable(false);
                    healthTextView.setMaxLines(3);
                } else {
                    healthTextView.setMaxLines(1);
                    healthTextView.setEllipsize(TextUtils.TruncateAt.END);
                }
                healthTextView.setText(str);
            }
        }
    }
}
