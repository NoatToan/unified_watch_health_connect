package com.huami.watch.companion.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.nfc.applet.ConstantKt;
import com.huami.watch.companion.R;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.location.LocationListener;
import com.huami.watch.companion.location.LocationManager;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.companion.weather.HotCityView;
import com.huami.watch.companion.weather.WeatherManager;
import com.huami.watch.companion.weather.bean.WeatherCity;
import com.huami.watch.companion.weather.bean.WeatherSearchedCity;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.DensityUtil;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.watch.util.Log;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherCityPickActivity extends WeatherBaseActivity {
    private static final String r = "Weather-CityPickActivity";
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final String[] v = {ConstantKt.CARD_NAME_BEI_JING, ConstantKt.CARD_NAME_SHANG_HAI, "广州", ConstantKt.CARD_NAME_SHEN_ZHEN, "珠海", "佛山", "南京", ConstantKt.CARD_NAME_SU_ZHOU, "杭州", "济南", ConstantKt.CARD_NAME_QING_DAO, ConstantKt.CARD_NAME_ZHENG_ZHOU, ConstantKt.CARD_NAME_SHI_JIA_ZHUANG, "福州", ConstantKt.CARD_NAME_XIA_MEN, ConstantKt.CARD_NAME_WU_HAN, "长沙", "成都", ConstantKt.CARD_NAME_CHONG_QING, "太原", ConstantKt.CARD_NAME_SHEN_YANG, "南宁", ConstantKt.CARD_NAME_XI_AN, ConstantKt.CARD_NAME_TIAN_JIN};
    private static final String[] w = {"39.904,116.408", "31.23,121.474", "23.108,113.265", "22.544,114.109", "22.248,113.565", "22.828,113.167", "32.048,118.769", "31.309,120.612", "30.319,120.165", "36.663,117.009", "36.088,120.343", "34.758,113.641", "38.042,114.498", "26.071,119.303", "24.445,118.07", "30.573,114.279", "28.197,112.967", "30.67,104.071", "29.581,106.549", "37.893,112.551", "41.799,123.418", "22.838,108.295", "34.285,108.969", "39.117,117.246"};
    private TextView c;
    private EditText d;
    private View e;
    private View f;
    private View g;
    private RecyclerView h;
    private HotCityView i;
    private View j;
    private TextView k;
    private View l;
    private boolean m;
    private boolean n;
    private i o;
    private int p = -1;
    private LocationListener q = new a();

    public class a implements LocationListener {
        public a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationError(int i) {
            if (i == 2) {
                WeatherCityPickActivity weatherCityPickActivity = WeatherCityPickActivity.this;
                weatherCityPickActivity.showLBSPermissionTipDialog(weatherCityPickActivity);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.huami.watch.companion.location.LocationListener
        public void onLocationReceived(@NonNull Location location) {
            WeatherCityPickActivity.this.dismissLBSPermissionTipDialog();
            WeatherCityPickActivity weatherCityPickActivity = WeatherCityPickActivity.this;
            weatherCityPickActivity.refreshCurrentWeatherCityLbs(weatherCityPickActivity, weatherCityPickActivity.c, location);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!WeatherCityPickActivity.this.m) {
                WeatherCityPickActivity.this.finish();
            } else {
                WeatherCityPickActivity.this.m = false;
                WeatherCityPickActivity.this.C();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WeatherCityPickActivity.this.A();
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Log.d(WeatherCityPickActivity.r, "AfterTextChanged : " + ((Object) editable), new Object[0]);
            if (!TextUtils.isEmpty(editable.toString())) {
                WeatherCityPickActivity.this.n = false;
                WeatherCityPickActivity.this.e.setEnabled(true);
                WeatherCityPickActivity.this.l.setVisibility(0);
                return;
            }
            WeatherCityPickActivity.this.n = true;
            WeatherCityPickActivity.this.e.setEnabled(false);
            WeatherCityPickActivity.this.l.setVisibility(8);
            if (WeatherCityPickActivity.this.m) {
                if (WeatherCityPickActivity.this.j.getVisibility() == 0) {
                    WeatherCityPickActivity.this.k.setText("");
                } else if (WeatherCityPickActivity.this.g.getVisibility() == 0) {
                    WeatherCityPickActivity.this.o.a(null);
                    WeatherCityPickActivity.this.o.notifyDataSetChanged();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class e implements TextView.OnEditorActionListener {
        public e() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            WeatherCityPickActivity weatherCityPickActivity = WeatherCityPickActivity.this;
            weatherCityPickActivity.onWeatherCitySearch(weatherCityPickActivity.d);
            return false;
        }
    }

    public class f implements HotCityView.onItemClickListener {
        public f() {
        }

        @Override // com.huami.watch.companion.weather.HotCityView.onItemClickListener
        public void onItemClick(String str, int i) {
            WeatherCityPickActivity.this.z(str, WeatherCityPickActivity.w[i]);
        }
    }

    public class g implements Consumer<List<WeatherSearchedCity>> {
        public g() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(List<WeatherSearchedCity> list) throws Exception {
            if (WeatherCityPickActivity.this.n) {
                return;
            }
            if (list.size() > 0) {
                WeatherCityPickActivity.this.p = 1;
            } else {
                WeatherCityPickActivity.this.p = 2;
            }
            WeatherCityPickActivity weatherCityPickActivity = WeatherCityPickActivity.this;
            weatherCityPickActivity.B(weatherCityPickActivity.p);
            WeatherCityPickActivity.this.o.a(list);
            WeatherCityPickActivity.this.o.notifyDataSetChanged();
        }
    }

    public class h implements Consumer<List<WeatherSearchedCity>> {
        public h() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(List<WeatherSearchedCity> list) throws Exception {
            if (list.size() > 0) {
                WeatherCityPickActivity.this.y(list.get(0));
            }
        }
    }

    public class i extends RecyclerView.Adapter<j> {
        private Context a;
        private LayoutInflater b;
        private List<WeatherSearchedCity> c = new ArrayList();

        public class a implements View.OnClickListener {
            public final /* synthetic */ WeatherSearchedCity a;

            public a(WeatherSearchedCity weatherSearchedCity) {
                this.a = weatherSearchedCity;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WeatherCityPickActivity.this.y(this.a);
            }
        }

        public i(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(List<WeatherSearchedCity> list) {
            this.c.clear();
            if (list != null) {
                this.c.addAll(list);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(j jVar, int i) {
            WeatherSearchedCity weatherSearchedCity = this.c.get(i);
            jVar.a.setPadding((int) DensityUtil.dpToPx(this.a, 8.0f), 0, 0, 0);
            jVar.a.setTextSize(2, 14.0f);
            jVar.a.setText(weatherSearchedCity.getCityName() + " - " + weatherSearchedCity.getAffiliation());
            jVar.a.setTextColor(WeatherCityPickActivity.this.getResources().getColor(R.color.black90));
            jVar.itemView.setOnClickListener(new a(weatherSearchedCity));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j onCreateViewHolder(ViewGroup viewGroup, int i) {
            return WeatherCityPickActivity.this.new j(this.b.inflate(android.R.layout.simple_list_item_1, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.c.size();
        }
    }

    public class j extends RecyclerView.ViewHolder {
        public TextView a;

        public j(View view) {
            super(view);
            this.a = (TextView) view.findViewById(android.R.id.text1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Log.d(r, "Pick City By LBS!!", new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("ByLBS", true);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(int i2) {
        if (i2 == 0) {
            this.k.setText(R.string.wather_searching);
            this.f.setVisibility(8);
            this.j.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        if (i2 == 1) {
            this.f.setVisibility(8);
            this.j.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            if (i2 != 2) {
                return;
            }
            this.k.setText(R.string.city_is_not_found);
            this.f.setVisibility(8);
            this.j.setVisibility(0);
            this.g.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.m) {
            return;
        }
        this.j.setVisibility(8);
        this.f.setVisibility(0);
        this.g.setVisibility(8);
        this.d.setText("");
    }

    private void initViews() {
        TextView textView = (TextView) findViewById(R.id.weather_current_location);
        this.c = textView;
        textView.setOnClickListener(new c());
        this.d = (EditText) findViewById(R.id.weather_city_search_input);
        this.e = findViewById(R.id.weather_city_search);
        this.d.addTextChangedListener(new d());
        this.d.setOnEditorActionListener(new e());
        this.e.setEnabled(false);
        this.f = findViewById(R.id.weather_city_non_input_layout);
        this.g = findViewById(R.id.weather_city_search_result_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.weather_city_search_result_list);
        this.h = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.h.setLayoutManager(new LinearLayoutManager(this));
        this.h.addItemDecoration(new BlackListRecyclerViewDivider(this, this, 0, R.drawable.divider_width_match_parent));
        i iVar = new i(this);
        this.o = iVar;
        this.h.setAdapter(iVar);
        if (Config.isLocaleOversea(this)) {
            findViewById(R.id.hot_city_view).setVisibility(8);
        } else {
            HotCityView hotCityView = (HotCityView) findViewById(R.id.weather_city_hot_layout);
            this.i = hotCityView;
            hotCityView.setCitys(v);
            this.i.setOnItemClickListener(new f());
        }
        this.j = findViewById(R.id.weather_city_search_hint_layout);
        this.k = (TextView) findViewById(R.id.weather_city_search_hint);
        this.l = findViewById(R.id.weather_city_search_clear);
        findViewById(R.id.view_current_location).setVisibility(Config.isUserKR(this) ? 8 : 0);
    }

    private void x(String str) {
        WeatherManager.getManager(this).searchCityASync(str, new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(WeatherSearchedCity weatherSearchedCity) {
        Log.d(r, "OnSearchResultItemClicked : " + weatherSearchedCity, new Object[0]);
        if (weatherSearchedCity == null) {
            return;
        }
        String locationKey = weatherSearchedCity.getCityInfo().getLocationKey();
        if (TextUtils.isEmpty(locationKey)) {
            return;
        }
        z(weatherSearchedCity.getCityName(), locationKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str, String str2) {
        WeatherCity weatherCity = new WeatherCity();
        weatherCity.setCityName(str);
        weatherCity.setLocationKey(str2);
        Log.d(r, "Pick City Success : " + weatherCity, new Object[0]);
        Intent intent = new Intent();
        intent.putExtra("CityName", weatherCity.getCityName());
        intent.putExtra("LocationKey", weatherCity.getLocationKey());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!this.m) {
            super.onBackPressed();
        } else {
            this.m = false;
            C();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weather_city_pick);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(R.id.actionbar);
        actionbarLayout.setTitleText(getString(R.string.weather_city_pick));
        actionbarLayout.setBackArrowClickListener(new b());
        initViews();
        refreshCurrentWeatherCity(this, this.c);
        LocationManager.getManager(this).addLocationListener(this.q);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LocationManager.getManager(this).removeLocationListener(this.q);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.endSession(this);
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public void onRefreshCurrentWeatherCity(TextView textView, @NonNull WeatherCity weatherCity, boolean z) {
        textView.setText(weatherCity.getCityName());
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.weather_result_icon_location, 0, 0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.startSession(this);
        LocationManager.getManager(this).requestLocation();
    }

    public void onWeatherCityClear(View view) {
        this.l.setVisibility(8);
        this.d.setText("");
    }

    public void onWeatherCitySearch(View view) {
        String string = this.d.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.l.setVisibility(0);
        this.p = 0;
        this.m = true;
        B(0);
        WeatherManager.getManager(this).searchCityASync(string, new g());
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public boolean refreshCurrentWeatherCity(Context context, TextView textView) {
        return refreshCurrentWeatherCityLbs(context, textView);
    }

    @Override // com.huami.watch.companion.ui.activity.WeatherBaseActivity
    public String tag() {
        return r;
    }

    public class BlackListRecyclerViewDivider extends RecyclerView.ItemDecoration {
        private Paint a;
        private Drawable b;
        private int c;
        private int d;
        private final int[] e;

        public BlackListRecyclerViewDivider(Context context, int i) {
            this.c = 1;
            int[] iArr = {android.R.attr.listDivider};
            this.e = iArr;
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException("请输入正确的参数！");
            }
            this.d = i;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
            this.b = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void drawHorizontal(Canvas canvas, RecyclerView recyclerView) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i2 = this.c;
                int i3 = bottom + i2;
                if (i == 0) {
                    this.b.setBounds(paddingLeft, 0, measuredWidth, i2);
                    this.b.draw(canvas);
                    Paint paint = this.a;
                    if (paint != null) {
                        canvas.drawRect(paddingLeft, bottom, measuredWidth, i3, paint);
                    }
                }
                Drawable drawable = this.b;
                if (drawable != null) {
                    drawable.setBounds(paddingLeft, bottom, measuredWidth, i3);
                    this.b.draw(canvas);
                }
                Paint paint2 = this.a;
                if (paint2 != null) {
                    canvas.drawRect(paddingLeft, bottom, measuredWidth, i3, paint2);
                }
            }
        }

        private void drawVertical(Canvas canvas, RecyclerView recyclerView) {
            int paddingTop = recyclerView.getPaddingTop();
            int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (i != childCount - 1) {
                    View childAt = recyclerView.getChildAt(i);
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                    int i2 = this.c + right;
                    Drawable drawable = this.b;
                    if (drawable != null) {
                        drawable.setBounds(right, paddingTop, i2, measuredHeight);
                        this.b.draw(canvas);
                    }
                    Paint paint = this.a;
                    if (paint != null) {
                        canvas.drawRect(right, paddingTop, i2, measuredHeight, paint);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.set(0, 0, 0, this.c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDraw(canvas, recyclerView, state);
            if (this.d == 1) {
                drawVertical(canvas, recyclerView);
            } else {
                drawHorizontal(canvas, recyclerView);
            }
        }

        public BlackListRecyclerViewDivider(WeatherCityPickActivity weatherCityPickActivity, Context context, int i, int i2) {
            this(context, i);
            Drawable drawable = ContextCompat.getDrawable(context, i2);
            this.b = drawable;
            this.c = drawable.getIntrinsicHeight();
        }

        public BlackListRecyclerViewDivider(WeatherCityPickActivity weatherCityPickActivity, Context context, int i, int i2, int i3) {
            this(context, i);
            this.c = i2;
            Paint paint = new Paint(1);
            this.a = paint;
            paint.setColor(i3);
            this.a.setStyle(Paint.Style.FILL);
        }
    }
}
