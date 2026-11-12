package com.huawei.hms.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;

/* JADX INFO: loaded from: classes10.dex */
public class ChoicesView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dn f12738a;

    public void setAdChoiceIcon(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hw.a("ChoicesView", "updateIcon from server.");
        o.d(new AnonymousClass1(str));
    }

    public void b() {
        hw.a("ChoicesView", "updateIcon from local.");
        setImageResource(R.drawable.hiad_choices_adchoice);
    }

    public void a(int i) {
        hw.a("ChoicesView", "changeChoiceViewSize dp = %d", Integer.valueOf(i));
        Resources resources = getContext().getResources();
        setLayoutParams(new RelativeLayout.LayoutParams(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i)));
    }

    public void a() {
        setImageResource(R.drawable.hiad_choices_close_btn);
    }

    private void a(Context context) {
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_24_dp);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hiad_24_dp);
        hw.a("ChoicesView", "adChoiceViewWidth = %d", Integer.valueOf(dimensionPixelSize));
        setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        setImageResource(R.drawable.hiad_hm_info);
        this.f12738a = dk.a(context, "normal");
    }

    public ChoicesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        a(context);
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.ChoicesView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12739a;

        @Override // java.lang.Runnable
        public void run() {
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f12739a);
            so soVarA = new sl(ChoicesView.this.getContext(), snVar).a();
            if (soVarA != null) {
                String strA = soVarA.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                String strC = ChoicesView.this.f12738a.c(strA);
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                bd.a(ChoicesView.this.getContext(), strC, new bd.a() { // from class: com.huawei.hms.ads.ChoicesView.1.1
                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a(final Drawable drawable) {
                        if (drawable != null) {
                            dq.a(new Runnable() { // from class: com.huawei.hms.ads.ChoicesView.1.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ChoicesView.this.setImageDrawable(drawable);
                                }
                            });
                        }
                    }

                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a() {
                        hw.a("ChoicesView", "download icon fail, use local icon");
                        dq.a(new Runnable() { // from class: com.huawei.hms.ads.ChoicesView.1.1.2
                            @Override // java.lang.Runnable
                            public void run() {
                                ChoicesView.this.b();
                            }
                        });
                    }
                });
            }
        }

        AnonymousClass1(String str) {
            this.f12739a = str;
        }
    }

    public ChoicesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public ChoicesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ChoicesView(Context context) {
        super(context, null);
        a(context);
    }
}
