package com.xmlywind.sdk.nativead;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.AdActivity;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import com.xmlywind.sdk.videoAd.BaseAdActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class a extends Dialog implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, View.OnClickListener, k {
    private Context a;
    private Window b;
    private int c;
    private int d;
    private BaseAdUnit e;
    private k.a f;
    private List<String> g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private RelativeLayout l;
    private EditText m;
    private SigFlowLayout n;
    private ViewGroup o;

    public a(Context context, BaseAdUnit baseAdUnit) {
        super(context, com.xmlywind.sdk.base.b.d());
        this.b = null;
        this.g = new ArrayList();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.e = baseAdUnit;
        int i = applicationContext.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.a.getResources().getDisplayMetrics().heightPixels;
        int iB = com.xmlywind.sdk.common.utils.c.b(40.0f, this.a);
        if (i2 > i) {
            this.d = i - iB;
            this.c = -2;
        } else {
            this.d = i2 - iB;
            this.c = i2 - c();
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, final String str3, final String str4) {
        com.xmlywind.sdk.base.common.t.a(str, str2, this.e, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.a.3
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    pointEntitySigmob.setAdtype(String.valueOf(a.this.e.getAd_type()));
                    pointEntitySigmob.setLoad_id(a.this.e.getLoad_id());
                    pointEntitySigmob.setRequest_id(a.this.e.getRequestId());
                    pointEntitySigmob.setReason(str3);
                    pointEntitySigmob.setContent(str4);
                    pointEntitySigmob.setVid(a.this.e.getVid());
                }
            }
        });
    }

    private int c() {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return getContext().getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void d() {
        this.g.clear();
        this.g.add("违法违规");
        this.g.add("疑似抄袭");
        this.g.add("虚假欺诈");
        this.g.add("低俗色情");
        this.g.add("诱导点击");
    }

    private void e() {
        Window window = getWindow();
        this.b = window;
        if (window != null) {
            window.setGravity(17);
            int iE = com.xmlywind.sdk.base.b.e();
            if (iE != 0) {
                this.b.setWindowAnimations(iE);
            }
            this.b.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = this.b.getAttributes();
            attributes.width = this.d;
            attributes.height = this.c;
            this.b.setAttributes(attributes);
        }
    }

    @Override // com.xmlywind.sdk.nativead.k
    public void a() {
        show();
        a(PointCategory.DISLIKE, "click", "", "");
    }

    @Override // com.xmlywind.sdk.nativead.k
    public void a(k.a aVar) {
        this.f = aVar;
    }

    public void b() {
        if (this.f != null) {
            this.f = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        EditText editText;
        String string;
        String str;
        int i = 0;
        String str2 = "";
        if (view.equals(this.l)) {
            a(PointCategory.DISLIKE, PointCategory.WHY_CLICK, "", "");
            BaseAdActivity.b(this.a, AdActivity.class, this.e.getUuid());
        } else if (view.equals(this.i)) {
            String str3 = (String) this.i.getText();
            a(PointCategory.DISLIKE, PointCategory.ADNORMAL_SHOW, "", "");
            str2 = str3;
            i = 1;
        } else {
            if (view.equals(this.j)) {
                string = (String) this.j.getText();
                i = 2;
                str = PointCategory.CANNOT_CLOSE;
            } else if (view.equals(this.h)) {
                string = (String) this.h.getText();
                i = 3;
                str = PointCategory.NOINTEREST_CLICK;
            } else if (view.equals(this.k) && (editText = this.m) != null) {
                string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    str2 = string;
                } else {
                    a(PointCategory.DISLIKE, PointCategory.ADVICE, "", Base64.encodeToString(string.getBytes(), 0));
                    str2 = string;
                    i = 5;
                }
            }
            a(PointCategory.DISLIKE, str, "", "");
            str2 = string;
        }
        k.a aVar = this.f;
        if (aVar == null || i == 0) {
            return;
        }
        aVar.onSelected(i, str2, true);
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.xmlywind.sdk.common.utils.o.b(this.a, "sig_dislike_layout"));
        this.l = (RelativeLayout) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_why_watch_rl"));
        this.i = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_not_show_tv"));
        this.j = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_not_close_tv"));
        this.h = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_dislike_tv"));
        this.k = (TextView) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_commit_sl"));
        this.m = (EditText) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_suggest_et"));
        this.l.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.m.addTextChangedListener(new TextWatcher() { // from class: com.xmlywind.sdk.nativead.a.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (!TextUtils.isEmpty(editable.toString()) || a.this.k == null) {
                    return;
                }
                a.this.k.setTextColor(Color.parseColor("#C2C2C2"));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (a.this.k != null) {
                    a.this.k.setTextColor(Color.parseColor("#FE7E03"));
                }
            }
        });
        this.o = (ViewGroup) findViewById(com.xmlywind.sdk.common.utils.o.a(this.a, "sig_flow_sl"));
        SigFlowLayout sigFlowLayout = new SigFlowLayout(this.a);
        this.n = sigFlowLayout;
        sigFlowLayout.setList(this.g);
        this.n.setOnItemClickListener(new SigFlowLayout.d() { // from class: com.xmlywind.sdk.nativead.a.2
            @Override // com.xmlywind.sdk.nativead.SigFlowLayout.d
            public void a(int i, String str) {
                a.this.a(PointCategory.DISLIKE, PointCategory.REPORT, String.valueOf(i), "");
                if (a.this.f != null) {
                    a.this.f.onSelected(4, str, true);
                    a.this.dismiss();
                }
            }
        });
        this.o.addView(this.n, new ViewGroup.LayoutParams(-1, -2));
        setOnShowListener(this);
        setOnDismissListener(this);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        e();
        SigmobLog.i("DisLikeDialog onCreate:" + this.d + ":" + this.c);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        SigmobLog.i("DisLikeDialog  onDismiss");
        k.a aVar = this.f;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        SigmobLog.i("DisLikeDialog  onShow");
        k.a aVar = this.f;
        if (aVar != null) {
            aVar.onShow();
        }
        SigFlowLayout sigFlowLayout = this.n;
        if (sigFlowLayout != null) {
            sigFlowLayout.a();
        }
    }
}
