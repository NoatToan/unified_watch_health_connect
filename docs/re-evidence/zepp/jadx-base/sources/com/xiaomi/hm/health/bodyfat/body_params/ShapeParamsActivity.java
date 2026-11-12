package com.xiaomi.hm.health.bodyfat.body_params;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;

/* JADX INFO: loaded from: classes19.dex */
public class ShapeParamsActivity extends BaseTitleActivity {
    private static final String M = "ShapeParamsActivity";
    private TextView A;
    private ImageView B;
    private TextView C;
    private RelativeLayout D;
    private RelativeLayout E;
    private RelativeLayout F;
    private GridView G;
    private View H;
    private int I;
    private int J;
    private Context K;
    private int L;
    private Integer[] x = {Integer.valueOf(R.drawable.shape_type1_normal), Integer.valueOf(R.drawable.shape_type2_normal), Integer.valueOf(R.drawable.shape_type3_normal), Integer.valueOf(R.drawable.shape_type4_normal), Integer.valueOf(R.drawable.shape_type5_normal), Integer.valueOf(R.drawable.shape_type6_normal), Integer.valueOf(R.drawable.shape_type7_normal), Integer.valueOf(R.drawable.shape_type8_normal), Integer.valueOf(R.drawable.shape_type9_normal)};
    private int y;
    private String z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            HMLog.d(ShapeParamsActivity.M, "end", new Object[0]);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            HMLog.d(ShapeParamsActivity.M, "onAnimationRepeat", new Object[0]);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            HMLog.d(ShapeParamsActivity.M, "start", new Object[0]);
        }
    }

    public class b extends BaseAdapter {
        private int[] a = {R.drawable.shape_type7_normal, R.drawable.shape_type8_normal, R.drawable.shape_type9_normal, R.drawable.shape_type4_normal, R.drawable.shape_type5_normal, R.drawable.shape_type6_normal, R.drawable.shape_type1_normal, R.drawable.shape_type2_normal, R.drawable.shape_type3_normal};
        private String[] b;
        private int c;

        public class a {
            public TextView a;
            public ImageView b;
            public RelativeLayout c;
            public View d;
            public View e;

            public a() {
            }
        }

        public b(int i) {
            this.c = -1;
            this.b = ShapeParamsActivity.this.getResources().getStringArray(R.array.show_body_shape_array);
            if (i >= 0) {
                this.c = i;
                if (i >= 6) {
                    this.c = i - 6;
                } else if (i <= 2) {
                    this.c = i + 6;
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(this.a[i]);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = View.inflate(ShapeParamsActivity.this.K, R.layout.shape_type_item, null);
                aVar = new a();
                aVar.a = (TextView) view.findViewById(R.id.shape_tv);
                aVar.b = (ImageView) view.findViewById(R.id.type_icon);
                aVar.c = (RelativeLayout) view.findViewById(R.id.rl);
                aVar.d = view.findViewById(R.id.right_line);
                aVar.e = view.findViewById(R.id.bottom_line);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            aVar.c.setLayoutParams(new AbsListView.LayoutParams(-2, (int) (ViewUtils.dp2px(ShapeParamsActivity.this.K, 191.0f) / 3.0f)));
            if (i >= 6) {
                aVar.e.setVisibility(8);
            } else {
                aVar.e.setVisibility(0);
            }
            if (i % 3 == 2) {
                aVar.d.setVisibility(8);
            } else {
                aVar.d.setVisibility(0);
            }
            aVar.a.setText(this.b[i]);
            aVar.b.setBackgroundResource(this.a[i]);
            return view;
        }
    }

    private void initView() {
        if (this.K.getString(R.string.empty_value).equals(this.z)) {
            this.D.setVisibility(0);
            this.E.setVisibility(8);
            this.H.setAlpha(0.3f);
            r();
        } else {
            this.D.setVisibility(8);
            this.E.setVisibility(0);
            this.C.setText(this.z);
            this.H.setAlpha(1.0f);
            this.B.setImageResource(this.x[this.y - 1].intValue());
        }
        this.G.setAdapter((ListAdapter) new b(this.y - 1));
    }

    private void n() {
        this.D = (RelativeLayout) findViewById(R.id.no_shape_ll);
        this.E = (RelativeLayout) findViewById(R.id.has_shape_ll);
        this.A = (TextView) findViewById(R.id.reason_tv);
        this.B = (ImageView) findViewById(R.id.shape_iv);
        this.C = (TextView) findViewById(R.id.shape_type_tv);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        this.G = gridView;
        gridView.setSelector(new ColorDrawable(0));
        this.H = findViewById(R.id.shape_rl);
        TextView textView = (TextView) findViewById(R.id.en_radio_tv);
        TextView textView2 = (TextView) findViewById(R.id.zh_radio_tv);
        if (Language.isChinese()) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
        } else {
            textView2.setVisibility(8);
            textView.setVisibility(0);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -90.0f, 0.5f, 0.5f);
            rotateAnimation.setDuration(10L);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setAnimationListener(new a());
            textView.startAnimation(rotateAnimation);
        }
        ((RelativeLayout) findViewById(R.id.contain_layout)).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ds6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.a.q();
            }
        });
        this.F = (RelativeLayout) findViewById(R.id.up_layout);
        initView();
    }

    private void o() {
        if (BFCallback.getInstance().enableMiDongFlavor()) {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s38), true);
            setTitleText(R.string.body_shape);
            getTitleTextView().setTextColor(ContextCompat.getColor(this, R.color.s1));
            getTitleTextView().setTextSize(17.0f);
            return;
        }
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.s38), true);
        setTitleText(R.string.body_shape);
        setBaseTitleColor(getResources().getColor(R.color.s1));
        getTitleTextView().setTextSize(0, getResources().getDimension(R.dimen.shape_title_text_size));
    }

    private void p() {
        if (getIntent() != null) {
            HMLog.d(M, "mUserInfo is " + HMWeightUtils.parserUserInfos(UserInfoManager.getManager().getInfo(getIntent().getLongExtra("UID", Long.valueOf(BFCallback.getHMPersonInfo().getUserid()).longValue()))), new Object[0]);
            int intExtra = getIntent().getIntExtra("body_params", 0);
            this.y = intExtra;
            this.z = BodyParamsUtils.getBodyShapeTypeLevelStr(this.K, intExtra);
            this.I = getIntent().getIntExtra("height", -1);
            this.J = getIntent().getIntExtra("weight_age", -1);
            HMLog.d(M, "shapeStr = " + this.z, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int i = getResources().getDisplayMetrics().heightPixels;
        int height = defaultDisplay.getHeight();
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
        } catch (Exception unused) {
        }
        if (this.L != height) {
            HMLog.d(M, "mLastShownHeight=" + this.L + ",shownHeight=" + height + ",rowHeight=" + i, new Object[0]);
            s(i - height);
            this.L = height;
        }
    }

    private void r() {
        String string = getTitleTextView().getText().toString();
        int i = this.J;
        if (i < 6 || i > 99) {
            if (i < 6) {
                this.A.setText(getResources().getQuantityString(R.plurals.no_body_params_for_age_min, 6, 6, string));
                return;
            } else {
                this.A.setText(getResources().getQuantityString(R.plurals.no_body_params_for_age_max, 99, 99, string));
                return;
            }
        }
        int i2 = this.I;
        if (i2 >= 90 && i2 <= 220) {
            this.A.setText(R.string.no_shape_for_no_measure);
        } else if (i2 < 90) {
            this.A.setText(getString(R.string.no_body_params_for_height_min, new Object[]{90, string}));
        } else {
            this.A.setText(getString(R.string.no_body_params_for_height_max, new Object[]{220, string}));
        }
    }

    private void s(int i) {
        HMLog.d(M, "barHeight = " + i, new Object[0]);
        this.F.setLayoutParams(new RelativeLayout.LayoutParams(-1, (((int) ViewUtils.dp2px(this, 316.0f)) - i) + (-10)));
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_params_shape);
        this.K = getApplicationContext();
        o();
        p();
        n();
    }
}
