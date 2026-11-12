package com.huawei.health.knit.section.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.marketing.datatype.ArticleImage;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.fcn;
import defpackage.njy;
import defpackage.qqw;
import defpackage.qqy;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class SectionArticleCombination extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f7740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ArticleImage> f7741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, Integer> f7742c;
    private LinearLayout d;
    private Context e;
    private HashMap<Integer, List<Drawable>> f;
    private Set<String> g;
    private boolean h;
    private HashMap<Integer, Boolean> i;
    private List<Integer> j;
    private HashMap<ImageView, ViewTreeVisibilityListener.ViewTreeListenee> m;
    private View n;
    private HashMap<ImageView, String> o;

    public SectionArticleCombination(Context context) {
        super(context);
        this.f7740a = false;
        this.h = false;
        this.f = new HashMap<>();
        this.f7742c = new HashMap<>();
        this.i = new HashMap<>();
        this.o = new HashMap<>();
        this.m = new HashMap<>();
        this.j = new ArrayList(10);
        this.f7741b = new ArrayList(10);
        this.g = new HashSet();
    }

    public SectionArticleCombination(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7740a = false;
        this.h = false;
        this.f = new HashMap<>();
        this.f7742c = new HashMap<>();
        this.i = new HashMap<>();
        this.o = new HashMap<>();
        this.m = new HashMap<>();
        this.j = new ArrayList(10);
        this.f7741b = new ArrayList(10);
        this.g = new HashSet();
    }

    public SectionArticleCombination(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7740a = false;
        this.h = false;
        this.f = new HashMap<>();
        this.f7742c = new HashMap<>();
        this.i = new HashMap<>();
        this.o = new HashMap<>();
        this.m = new HashMap<>();
        this.j = new ArrayList(10);
        this.f7741b = new ArrayList(10);
        this.g = new HashSet();
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("SectionArticleCombination", "onCreateView");
        this.e = context;
        c();
        return this.n;
    }

    private void c() {
        if (this.n == null) {
            LogUtil.j("SectionArticleCombination", "initView mainView is null, start to inflate");
            this.n = LayoutInflater.from(this.e).inflate(R.layout.section_article_combine_layout, (ViewGroup) this, false);
        }
        this.d = (LinearLayout) this.n.findViewById(R.id.section_article_combine);
        LogUtil.j("SectionArticleCombination", "initSectionArticleCombinationState");
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionArticleCombination";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionArticleCombination", "start to bindViewParams");
        List<Integer> listA = qqw.a((Map) map, "CARD_TITLE_INDEX", Integer.class, (List) null);
        List<ArticleImage> listA2 = qqw.a((Map) map, "ARTICLE_IMAGE_LIST", ArticleImage.class, (List) null);
        HashMap<Integer, Integer> map2 = (HashMap) qqw.a(map, "GRID_ORIENTATION", (Class<Object>) HashMap.class, (Object) null);
        HashMap<Integer, List<Drawable>> map3 = (HashMap) qqw.a(map, "CARD_COMBIN_IMAGES", (Class<Object>) HashMap.class, (Object) null);
        if (njy.e(listA) || njy.e(listA2) || map3 == null || map2 == null) {
            LogUtil.a("SectionArticleCombination", "bindViewParams has null data");
            return;
        }
        this.f7741b = listA2;
        this.f = map3;
        this.f7742c = map2;
        this.j = listA;
        if (!this.f7740a) {
            for (Integer num : listA) {
                e(num.intValue());
                this.i.put(num, false);
            }
            this.f7740a = true;
        }
        for (Integer num2 : listA) {
            int iIntValue = num2.intValue();
            if (!this.i.get(num2).booleanValue()) {
                a(iIntValue);
            }
        }
    }

    private void e(int i) {
        ArticleImage articleImage;
        HashMap<Integer, List<Drawable>> map = this.f;
        if (map == null || map.isEmpty() || !this.f7742c.containsKey(Integer.valueOf(i)) || !njy.c(this.f7741b, i)) {
            return;
        }
        int iIntValue = this.f7742c.get(Integer.valueOf(i)).intValue();
        LinearLayout linearLayout = new LinearLayout(this.e);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        if (iIntValue == 1) {
            linearLayout.setOrientation(0);
        } else {
            linearLayout.setOrientation(1);
        }
        linearLayout.setGravity(1);
        if (i < this.f7741b.size() && (articleImage = this.f7741b.get(i)) != null) {
            a(linearLayout, i, articleImage.getCombinNums());
        }
    }

    private void a(LinearLayout linearLayout, int i, int i2) {
        ArticleImage articleImage;
        for (int i3 = 0; i3 < i2; i3++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(this.e);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setLayoutParams(layoutParams);
            int i4 = i + i3;
            if (njy.c(this.f7741b, i4) && (articleImage = this.f7741b.get(i4)) != null) {
                String imgUrl = articleImage.getImgUrl();
                if (imgUrl != null) {
                    this.o.put(imageView, imgUrl);
                    imageView.setOnClickListener(this);
                }
                c(imageView, i4);
                linearLayout.addView(imageView);
            }
        }
        this.d.addView(linearLayout);
    }

    private void c(final ImageView imageView, final int i) {
        this.m.put(imageView, new ViewTreeVisibilityListener.ViewTreeListenee() { // from class: com.huawei.health.knit.section.view.SectionArticleCombination.1
            @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
            public void checkVisibilityAndSetBiEvent() {
                if (ViewTreeVisibilityListener.c(imageView) && !hasSetBiEvent() && njy.c(SectionArticleCombination.this.f7741b, i)) {
                    LogUtil.a("SectionArticleCombination", "visible to user: ", ((ArticleImage) SectionArticleCombination.this.f7741b.get(i)).getImgName());
                    biEvent();
                    SectionArticleCombination.this.g.add(((ArticleImage) SectionArticleCombination.this.f7741b.get(i)).getImgName());
                }
            }

            @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
            public boolean hasSetBiEvent() {
                if (njy.c(SectionArticleCombination.this.f7741b, i)) {
                    return SectionArticleCombination.this.g.contains(((ArticleImage) SectionArticleCombination.this.f7741b.get(i)).getImgName());
                }
                return false;
            }

            @Override // com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
            public void biEvent() {
                ArticleImage articleImage;
                if (imageView == null || !njy.c(SectionArticleCombination.this.f7741b, i) || SectionArticleCombination.this.o == null || (articleImage = (ArticleImage) SectionArticleCombination.this.f7741b.get(i)) == null || articleImage.getImgName() == null) {
                    return;
                }
                String imgName = articleImage.getImgName();
                if (articleImage.getImgUrl() != null) {
                    imgName = articleImage.getImgUrl();
                }
                String queryParameter = Uri.parse(qqy.g(imgName)).getQueryParameter("data");
                if (SectionArticleCombination.this.o.get(imageView) != null) {
                    imgName = (String) SectionArticleCombination.this.o.get(imageView);
                }
                if (TextUtils.isEmpty(imgName)) {
                    return;
                }
                if (imgName.contains("data")) {
                    fcn.m(queryParameter);
                } else {
                    fcn.h(imgName);
                }
            }
        });
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        MarketRouterApi marketRouterApi;
        if (qrs.e(view) || !this.o.containsKey(view) || (str = this.o.get(view)) == null || TextUtils.isEmpty(str) || (marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class)) == null) {
            return;
        }
        LogUtil.a("SectionArticleCombination", "url :", str);
        String queryParameter = Uri.parse(qqy.g(str)).getQueryParameter("data");
        if (str.contains("data")) {
            fcn.l(queryParameter);
        } else {
            fcn.g(str);
        }
        marketRouterApi.router(str);
    }

    private void a(int i) {
        List<Drawable> list;
        if (!njy.c(this.f7741b, i) || !this.f.containsKey(Integer.valueOf(i)) || (list = this.f.get(Integer.valueOf(i))) == null || list.isEmpty()) {
            return;
        }
        int iIndexOf = this.j.indexOf(Integer.valueOf(i));
        LinearLayout linearLayout = this.d;
        if (linearLayout == null || iIndexOf > linearLayout.getChildCount()) {
            return;
        }
        View childAt = this.d.getChildAt(iIndexOf);
        ArticleImage articleImage = this.f7741b.get(i);
        if (articleImage == null) {
            return;
        }
        int combinNums = articleImage.getCombinNums();
        if (childAt instanceof LinearLayout) {
            a(i, combinNums, (LinearLayout) childAt, list);
        }
        this.i.put(Integer.valueOf(i), true);
        LogUtil.a("SectionArticleCombination", "refreshRowLayout ", Integer.valueOf(i));
    }

    private void a(int i, int i2, LinearLayout linearLayout, List<Drawable> list) {
        HashMap<Integer, Integer> map;
        int iMax;
        if (linearLayout == null || list.isEmpty() || !njy.c(this.f7741b, i) || (map = this.f7742c) == null || !map.containsKey(Integer.valueOf(i))) {
            return;
        }
        list.removeAll(Collections.singleton(null));
        if (this.f7742c.get(Integer.valueOf(i)).intValue() == 1) {
            Iterator<Drawable> it = list.iterator();
            iMax = 0;
            while (it.hasNext()) {
                Drawable next = it.next();
                iMax += next == null ? 0 : next.getIntrinsicWidth();
            }
        } else {
            iMax = 0;
            for (Drawable drawable : list) {
                if (drawable == null) {
                    iMax = Math.max(0, iMax);
                } else {
                    iMax = Math.max(iMax, drawable.getIntrinsicWidth());
                }
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = LanguageUtil.ba(this.e) ? (i2 - 1) - i3 : i3;
            if ((linearLayout.getChildAt(i4) instanceof ImageView) && njy.c(list, i3)) {
                ImageView imageView = (ImageView) linearLayout.getChildAt(i4);
                imageView.setImageBitmap(b(list.get(i3), iMax));
                c((View) imageView, i + i3);
            }
        }
    }

    private void c(View view, int i) {
        if (njy.c(this.f7741b, i)) {
            ViewTreeVisibilityListener.c(view, new ViewTreeVisibilityListener(view, this.m.get(view)));
        }
    }

    private Bitmap d(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private Bitmap b(Drawable drawable, int i) {
        float fIntValue = (this.e.getResources().getDisplayMetrics().widthPixels - (((Integer) BaseActivity.getSafeRegionWidth().first).intValue() * 2)) / i;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapD = d(drawable);
        Matrix matrix = new Matrix();
        matrix.postScale(fIntValue, fIntValue);
        return Bitmap.createBitmap(bitmapD, 0, 0, intrinsicWidth, intrinsicHeight, matrix, true);
    }
}
