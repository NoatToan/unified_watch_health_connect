package com.huawei.sim.esim.view.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.sim.R;
import com.huawei.sim.esim.view.adapter.MultiSimAdapter;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.pxe;
import defpackage.pxh;
import defpackage.pxk;
import defpackage.qrs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes15.dex */
public class MultiSimAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f23080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23082c;
    private boolean d;
    private List<Map<String, Object>> e;
    private String h;
    private OnRadioButtonClickListener i;
    private String[] j;

    public interface OnRadioButtonClickListener {
        void onClick(int i);
    }

    public static /* synthetic */ boolean a(int i) {
        return i != 65288;
    }

    public static /* synthetic */ boolean b(int i) {
        return i != 40;
    }

    public static /* synthetic */ boolean c(int i) {
        return i != 41;
    }

    public static /* synthetic */ boolean d(int i) {
        return i != 65289;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    public MultiSimAdapter(Context context, List<Map<String, Object>> list) {
        this.f23081b = 0;
        this.d = false;
        this.f23080a = context;
        this.e = list;
        this.f23082c = false;
    }

    public MultiSimAdapter(Context context, String[] strArr) {
        this.f23081b = 0;
        this.d = false;
        this.f23080a = context;
        a(strArr);
        this.f23082c = true;
    }

    private void a(String[] strArr) {
        this.j = strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f23082c) {
            return this.j.length;
        }
        return this.e.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return Optional.empty();
    }

    public void e(OnRadioButtonClickListener onRadioButtonClickListener) {
        this.i = onRadioButtonClickListener;
        notifyDataSetChanged();
    }

    public void d(String str) {
        this.h = str;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar = null;
        if (view == null) {
            a aVar2 = new a();
            View viewInflate = LayoutInflater.from(this.f23080a).inflate(R.layout.multi_sim_item, (ViewGroup) null);
            aVar2.d = (LinearLayout) viewInflate.findViewById(R.id.multi_sim_item_layout);
            aVar2.f23085a = (RelativeLayout) viewInflate.findViewById(R.id.multi_sim_content_layout);
            aVar2.f23086b = (HealthTextView) viewInflate.findViewById(R.id.item_display_provider);
            aVar2.e = (HealthTextView) viewInflate.findViewById(R.id.item_phone_number);
            b(aVar2);
            aVar2.g = (HealthRadioButton) viewInflate.findViewById(R.id.item_radio_button);
            aVar2.f23087c = viewInflate.findViewById(R.id.item_display_line);
            viewInflate.setTag(aVar2);
            aVar = aVar2;
            view = viewInflate;
        } else {
            Object tag = view.getTag();
            if (tag instanceof a) {
                aVar = (a) tag;
            }
        }
        if (aVar != null) {
            if (this.f23082c) {
                d(i, aVar);
                return view;
            }
            c(i, aVar);
            return view;
        }
        LogUtil.j("MultiSimAdapter", "getView() SimViewHolder is null");
        return view;
    }

    private void b(a aVar) {
        if (this.f23082c) {
            aVar.f23085a.setPadding(qrs.d(this.f23080a, 12.0f), 0, qrs.d(this.f23080a, 12.0f), 0);
        } else {
            aVar.f23085a.setPadding(qrs.d(this.f23080a, 12.0f), qrs.d(this.f23080a, 8.0f), qrs.d(this.f23080a, 12.0f), qrs.d(this.f23080a, 8.0f));
        }
    }

    private void d(int i, a aVar) {
        String str = this.j[i];
        aVar.f23086b.setText(str);
        aVar.e.setVisibility(8);
        if (i == this.j.length - 1) {
            aVar.f23087c.setVisibility(4);
        } else {
            aVar.f23087c.setVisibility(0);
        }
        if (str.equals(this.f23080a.getString(R.string.IDS_plugin_multi_esim_ctcc_not_support)) || str.equals(this.f23080a.getString(R.string.IDS_plugin_multi_esim_cmcc_not_support))) {
            aVar.g.setVisibility(4);
        } else {
            aVar.g.setVisibility(0);
            e(i, aVar);
        }
    }

    private void c(int i, a aVar) {
        Object obj = this.e.get(i).get("imsi");
        String str = obj instanceof String ? (String) obj : "";
        Object obj2 = this.e.get(i).get("number");
        String str2 = obj2 instanceof String ? (String) obj2 : "";
        int i2 = i + 1;
        String strC = pxk.c(this.f23080a, str);
        if (pxh.e()) {
            pxe pxeVarA = pxh.a(this.e.get(i));
            String strC2 = c(pxeVarA, strC, i);
            if (pxeVarA == null || TextUtils.isEmpty(pxeVarA.d())) {
                e(i2, strC2, aVar);
                a(i, aVar);
                return;
            }
            if (pxk.i()) {
                ReleaseLogUtil.d("MultiSimAdapter", "mOpenMethod: ", this.h);
                if (!TextUtils.isEmpty(this.h) && !this.h.equals(HiAnalyticsConstant.KeyAndValue.NUMBER_01) && !pxk.d(pxeVarA)) {
                    e(i2, strC2, aVar);
                    a(i, aVar);
                    return;
                }
            }
            if (!TextUtils.isEmpty(pxeVarA.d())) {
                if (i == 0) {
                    this.d = true;
                }
                if (!this.d) {
                    this.f23081b = i;
                }
                a(i2, strC2, aVar);
                c(str2, aVar);
                e(i, aVar);
            } else {
                c(i2, strC2, aVar);
            }
        } else {
            a(i2, strC, aVar);
            c(str2, aVar);
            e(i, aVar);
        }
        a(i, aVar);
    }

    private void e(int i, String str, a aVar) {
        aVar.d.setClickable(false);
        aVar.f23086b.setVisibility(8);
        aVar.g.setVisibility(8);
        String strC = c(str, i);
        aVar.e.setVisibility(0);
        aVar.e.setTextDirection(5);
        aVar.e.setText(String.format(Locale.ENGLISH, this.f23080a.getResources().getString(R.string.IDS_esim_single_card_no_support), strC));
    }

    private String c(String str, int i) {
        String string = String.format(Locale.ENGLISH, this.f23080a.getResources().getString(R.string.IDS_plugin_multi_esim_card), Integer.valueOf(i), str);
        if (TextUtils.isEmpty(str)) {
            string = ((StringBuilder) string.chars().filter(new IntPredicate() { // from class: pwc
                @Override // java.util.function.IntPredicate
                public final boolean test(int i2) {
                    return MultiSimAdapter.b(i2);
                }
            }).filter(new IntPredicate() { // from class: pvz
                @Override // java.util.function.IntPredicate
                public final boolean test(int i2) {
                    return MultiSimAdapter.c(i2);
                }
            }).filter(new IntPredicate() { // from class: pvy
                @Override // java.util.function.IntPredicate
                public final boolean test(int i2) {
                    return MultiSimAdapter.a(i2);
                }
            }).filter(new IntPredicate() { // from class: pwd
                @Override // java.util.function.IntPredicate
                public final boolean test(int i2) {
                    return MultiSimAdapter.d(i2);
                }
            }).collect(new Supplier() { // from class: pwg
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new StringBuilder();
                }
            }, new ObjIntConsumer() { // from class: pwe
                @Override // java.util.function.ObjIntConsumer
                public final void accept(Object obj, int i2) {
                    ((StringBuilder) obj).appendCodePoint(i2);
                }
            }, new BiConsumer() { // from class: pwh
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ((StringBuilder) obj).append((CharSequence) obj2);
                }
            })).toString();
        }
        LogUtil.a("MultiSimAdapter", "tips = ", string);
        return string;
    }

    private void a(int i, a aVar) {
        if (i == this.e.size() - 1) {
            aVar.f23087c.setVisibility(4);
        } else {
            aVar.f23087c.setVisibility(0);
        }
    }

    private String c(pxe pxeVar, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            Object obj = this.e.get(i).get("spn");
            if (obj instanceof String) {
                str = (String) obj;
            }
        }
        return (!TextUtils.isEmpty(str) || pxeVar == null) ? str : pxeVar.e();
    }

    private void a(int i, String str, a aVar) {
        aVar.f23086b.setVisibility(0);
        aVar.f23086b.setText(String.format(Locale.ENGLISH, this.f23080a.getResources().getString(R.string.IDS_plugin_multi_esim_card), Integer.valueOf(i), str));
    }

    private void c(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.e.setVisibility(8);
        } else {
            aVar.e.setText(str);
            aVar.e.setVisibility(0);
        }
    }

    private void c(int i, String str, a aVar) {
        aVar.d.setClickable(false);
        aVar.f23086b.setVisibility(8);
        aVar.g.setVisibility(8);
        String strC = c(str, i);
        aVar.e.setVisibility(0);
        aVar.e.setTextDirection(5);
        aVar.e.setText(String.format(Locale.ENGLISH, this.f23080a.getResources().getString(R.string.IDS_open_method_no_support), strC));
    }

    private void e(final int i, a aVar) {
        aVar.g.setVisibility(0);
        if (this.i == null) {
            LogUtil.a("MultiSimAdapter", "setRadioButton mListener is null");
            aVar.d.setClickable(false);
        } else {
            aVar.d.setClickable(true);
            aVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.sim.esim.view.adapter.MultiSimAdapter.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    MultiSimAdapter.this.f23081b = i;
                    MultiSimAdapter.this.i.onClick(i);
                    MultiSimAdapter.this.notifyDataSetChanged();
                }
            });
        }
        aVar.g.setChecked(i == this.f23081b);
    }

    public int a() {
        return this.f23081b;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RelativeLayout f23085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f23086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        View f23087c;
        LinearLayout d;
        HealthTextView e;
        HealthRadioButton g;

        a() {
        }
    }
}
