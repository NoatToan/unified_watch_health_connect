package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.manager.model.LevelInfoDesc;
import com.huawei.pluginachievement.ui.level.AchieveLevelTaskRvAdapter;
import com.huawei.pluginachievement.ui.views.CardLinearSnapHelper;
import com.huawei.pluginachievement.ui.views.LevelProgress;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes41.dex */
public class ozj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Integer[] f45011c = {Integer.valueOf(R.color.level_bg_huo_color), Integer.valueOf(R.color.level_bg_zi_color), Integer.valueOf(R.color.level_bg_neng_color), Integer.valueOf(R.color.level_bg_wang_color), Integer.valueOf(R.color.level_bg_quan_color), Integer.valueOf(R.color.level_bg_chuan_color), Integer.valueOf(R.color.level_bg_dian_color)};
    private static final Integer[] e = {Integer.valueOf(R.color.level_sign_huo_color), Integer.valueOf(R.color.level_sign_zi_color), Integer.valueOf(R.color.level_sign_neng_color), Integer.valueOf(R.color.level_sign_wang_color), Integer.valueOf(R.color.level_sign_quan_color), Integer.valueOf(R.color.level_sign_chuan_color), Integer.valueOf(R.color.level_sign_dian_color)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f45012a;
    private AchieveLevelTaskRvAdapter d;
    private LevelProgress g;
    private int h;
    private List<LevelInfoDesc> i;
    private int j;
    private double k;
    private View l;
    private ImageView n;
    private View o;
    private ArrayList<ozs> p;
    private LinearLayout q;
    private LinearLayout s;
    private CardLinearSnapHelper m = new CardLinearSnapHelper();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f45013b = -1;
    private int r = 0;
    private String t = "";
    private boolean f = false;

    public void b(RecyclerView recyclerView, final HealthTextView healthTextView, final HealthTextView healthTextView2) {
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: ozj.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                super.onScrollStateChanged(recyclerView2, i);
                ozj.this.m.c(true);
                ozj.this.a(recyclerView2, i, healthTextView, healthTextView2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                super.onScrolled(recyclerView2, i, i2);
                ozj.this.a(recyclerView2);
                ozj.this.g.setRotate(i, ozj.this.r, ozj.this.d(), ozj.this.j, ozj.this.k);
            }
        });
        this.m.attachToRecyclerView(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerView recyclerView, int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
        View viewFindSnapView;
        if (i != 0) {
            if (i == 1) {
                this.n.setAlpha(0.7f);
                this.r = 1;
                return;
            } else {
                if (i == 2) {
                    this.n.setAlpha(0.3f);
                    this.r = 2;
                    this.g.setRotate(0.0f, 2, d(), this.j, this.k);
                    return;
                }
                LogUtil.j("LevelHorizontalHelper", "no branch!");
                return;
            }
        }
        if (njy.e(this.i) || recyclerView.getChildCount() <= 0 || (viewFindSnapView = this.m.findSnapView(recyclerView.getLayoutManager())) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewFindSnapView.getLayoutParams();
        if (!(layoutParams instanceof RecyclerView.LayoutParams)) {
            LogUtil.e("layoutParams error", new Object[0]);
            return;
        }
        int viewAdapterPosition = ((RecyclerView.LayoutParams) layoutParams).getViewAdapterPosition() % this.i.size();
        this.f45013b = viewAdapterPosition;
        a(healthTextView, healthTextView2, viewAdapterPosition);
        this.r = 0;
        this.g.setRotate(0.0f, 0, viewAdapterPosition, this.j, this.k);
    }

    private void a(HealthTextView healthTextView, HealthTextView healthTextView2, int i) {
        if (njy.c(this.i, i)) {
            healthTextView.setText(this.i.get(i).getName());
            healthTextView2.setText(this.i.get(i).getDescription());
            if (i < this.h) {
                this.n.setVisibility(8);
            } else {
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                this.n.setImageResource(this.i.get(i).getIcon());
            }
            Integer[] numArr = f45011c;
            if (i < numArr.length) {
                int color = BaseApplication.getContext().getResources().getColor(numArr[i].intValue());
                this.f45012a.setBackgroundColor(color);
                this.o.setBackgroundColor(color);
                this.l.setBackgroundColor(color);
                e(this.i.get(i).getLabelList(), i);
            }
            this.d.c(this.p, i + 1);
            paq.c(1, this.j, 0L, this.t, this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerView recyclerView) {
        if (recyclerView == null) {
            LogUtil.j("LevelHorizontalHelper", "dealScrollCompute: recyclerView is null");
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = (recyclerView.getWidth() - recyclerView.getChildAt(0).getWidth()) / 2;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                View childAt2 = linearLayout.getChildAt(0);
                View childAt3 = linearLayout.getChildAt(1);
                if (childAt2 instanceof LinearLayout) {
                    View childAt4 = ((LinearLayout) childAt2).getChildAt(0);
                    View view = childAt4 instanceof ImageView ? childAt4 : childAt;
                    if (!(childAt3 instanceof ImageView)) {
                        childAt3 = null;
                    }
                    View view2 = childAt3;
                    if (view2 != null) {
                        b(recyclerView, childAt, view, view2, width);
                    }
                }
            }
        }
    }

    private void b(RecyclerView recyclerView, View view, View view2, View view3, int i) {
        if (recyclerView == null || view == null || view2 == null || view3 == null) {
            return;
        }
        if (view.getLeft() <= i) {
            float left = view.getLeft() >= i - view.getWidth() ? ((i - view.getLeft()) * 1.0f) / view.getWidth() : 1.0f;
            float f = 1.0f - (left * 0.3f);
            view2.setScaleY(f);
            view2.setScaleX(f);
            float f2 = 1.0f - left;
            view2.setAlpha(Math.max(f2, 0.3f));
            view3.setScaleX(f2);
            view3.setScaleY(f2);
            view3.setAlpha(Math.min(f2, 0.7f));
            return;
        }
        float width = view.getLeft() <= recyclerView.getWidth() - i ? (((recyclerView.getWidth() - i) - view.getLeft()) * 1.0f) / view.getWidth() : 0.0f;
        float f3 = (width * 0.3f) + 0.7f;
        view2.setScaleY(f3);
        view2.setScaleX(f3);
        view2.setAlpha(Math.max(width, 0.3f));
        view3.setAlpha(width);
        view3.setScaleX(width);
        view3.setAlpha(Math.min(width, 0.7f));
    }

    public void e(List<LevelInfoDesc> list, int i, int i2, double d) {
        this.i = list;
        this.h = i;
        this.j = i2;
        this.k = d;
    }

    public int d() {
        int i = this.f45013b;
        return i == -1 ? this.h - 1 : i;
    }

    public void b(ArrayList<ozs> arrayList) {
        if (njy.e(arrayList)) {
            LogUtil.j("LevelHorizontalHelper", "setTaskRecyclerViewData taskRecyclerViewDatas is null.");
        } else {
            this.p = arrayList;
        }
    }

    public void d(ImageView imageView, RelativeLayout relativeLayout, LevelProgress levelProgress, AchieveLevelTaskRvAdapter achieveLevelTaskRvAdapter) {
        this.n = imageView;
        this.f45012a = relativeLayout;
        this.g = levelProgress;
        this.d = achieveLevelTaskRvAdapter;
    }

    public void d(View view, View view2) {
        this.o = view;
        this.l = view2;
    }

    public void d(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.q = linearLayout;
        this.s = linearLayout2;
    }

    public void e(List<String> list, int i) {
        Drawable drawable = ContextCompat.getDrawable(BaseApplication.getContext(), R.mipmap.level_sign_btn);
        if (drawable != null) {
            Integer[] numArr = e;
            if (i < numArr.length) {
                if (njy.e(list)) {
                    LogUtil.j("LevelHorizontalHelper", "setBadgeDesignation labelList isEmpty!");
                    return;
                }
                int color = BaseApplication.getContext().getResources().getColor(numArr[i].intValue());
                Drawable drawableB = pbb.b(drawable, color);
                this.q.removeAllViews();
                this.s.removeAllViews();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (i2 < 3) {
                        this.q.addView(a(paq.b().get(Integer.valueOf(oun.d(list.get(i2)))), drawableB, color));
                    } else {
                        this.s.addView(a(paq.b().get(Integer.valueOf(oun.d(list.get(i2)))), drawableB, color));
                    }
                }
                return;
            }
        }
        LogUtil.j("LevelHorizontalHelper", "setBadgeDesignation isOutOfBounds!");
    }

    public View a(String str, Drawable drawable, int i) {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.level_sign_item, (ViewGroup) null);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.level_badge_sign);
        healthTextView.setBackground(drawable);
        healthTextView.setTextColor(i);
        healthTextView.setText(str);
        return viewInflate;
    }

    public static Integer[] c() {
        return (Integer[]) f45011c.clone();
    }

    public static Integer[] a() {
        return (Integer[]) e.clone();
    }

    public void d(String str, boolean z) {
        this.t = str;
        this.f = z;
    }
}
