package com.huami.moving.ui.sport.in;

import android.os.Bundle;
import android.view.View;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.DialogParams;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.moving.R;
import com.huami.widget.wheelview.WheelView;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class VerifyDistanceFragment extends AlertDialogFragment {
    private static double k = 0.0d;
    private static double l = 0.0d;
    private static boolean m = false;
    private static final double n = 0.5d;
    private d h;
    public List<String> i;
    private OnVerifyListener j;

    public interface OnVerifyListener {
        void onVerify(double d);
    }

    public class a implements Comparator<Double> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Double d, Double d2) {
            return d.compareTo(d2);
        }
    }

    public static Number displayNumberDouble(String str) {
        int i = 0;
        try {
            return NumberFormat.getNumberInstance(Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return i;
        }
    }

    private List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(k(k)));
        double dH = h(k);
        int iK = (int) ((k - k(k * 0.5d)) / dH);
        for (int i = 1; i <= iK; i++) {
            arrayList.add(Double.valueOf(k(sum(k, ((double) (-i)) * dH))));
            arrayList.add(Double.valueOf(k(sum(k, ((double) i) * dH))));
        }
        Collections.sort(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(l(((Double) it2.next()).doubleValue()));
        }
        return arrayList2;
    }

    private double h(double d) {
        return NumberFormatter.format(d >= 2.0d ? new BigDecimal(d).divide(new BigDecimal(100.0d), 1).doubleValue() : 0.01d, 2, new int[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        OnVerifyListener onVerifyListener = this.j;
        if (onVerifyListener != null) {
            onVerifyListener.onVerify(displayNumberDouble(this.h.a()).doubleValue());
        }
        dismissAllowingStateLoss();
    }

    private double k(double d) {
        return displayNumberDouble(new DecimalFormat("0.00").format(d)).doubleValue();
    }

    private String l(double d) {
        return NumberFormatter.formatDouble2StringByLocale(d, 2, new int[0]);
    }

    public static VerifyDistanceFragment newInstance(double d, double d2, boolean z) {
        k = d;
        l = d2;
        m = z;
        return new VerifyDistanceFragment();
    }

    public View getContentView() {
        View viewInflate = View.inflate(getContext(), R.layout.fragment_verify_distance, null);
        if (viewInflate != null) {
            WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.wv_verify_distance);
            this.h = new d(getActivity(), wheelView, this.i);
            String strL = l(l);
            int i = 0;
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (this.i.get(i2).equals(strL)) {
                    i = i2;
                    break;
                }
            }
            wheelView.setViewAdapter(this.h).setCurrentItem(i);
            viewInflate.findViewById(R.id.height_verify_cancel).setOnClickListener(new View.OnClickListener() { // from class: y88
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.i(view);
                }
            });
            viewInflate.findViewById(R.id.height_verify_save).setOnClickListener(new View.OnClickListener() { // from class: z88
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.j(view);
                }
            });
        }
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.AlertDialogFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!m) {
            k *= 0.6213712d;
            l *= 0.6213712d;
        }
        this.i = g();
        DialogParams dialogParams = new DialogParams();
        dialogParams.title = "";
        dialogParams.contentView = getContentView();
        setParams(dialogParams);
    }

    public void setOnVerifyListener(OnVerifyListener onVerifyListener) {
        this.j = onVerifyListener;
    }

    public double sum(double d, double d2) {
        return new BigDecimal(Double.toString(d)).add(new BigDecimal(Double.toString(d2))).doubleValue();
    }
}
