package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.health.knit.section.utils.FitnessItemDecoration;
import com.huawei.health.knit.section.view.BaseBiItemView;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f34559a = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);

    public static <Section extends BaseSection> Section a(Context context, Class<Section> cls) {
        try {
            return cls.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.j("Section_SectionUtils", "create Section failed");
            return null;
        }
    }

    public static boolean g(Object obj) {
        Object obj2;
        if (obj == null || !(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() > 0 && (obj2 = list.get(0)) != null) {
            return obj2 instanceof String;
        }
        return false;
    }

    public static boolean c(Object obj) {
        return obj != null && (obj instanceof List) && ((List) obj).size() > 0;
    }

    public static boolean b(Object obj) {
        return obj != null && (obj instanceof Long);
    }

    public static boolean d(Object obj) {
        return obj != null && (obj instanceof SpannableString);
    }

    public static boolean j(Object obj) {
        return obj != null && (obj instanceof String);
    }

    public static boolean a(Object obj) {
        return obj != null && (obj instanceof Integer);
    }

    public static boolean e(Object obj) {
        return obj != null && (obj instanceof OnClickSectionListener);
    }

    public static <T> boolean d(List<T> list, int i) {
        return list != null && i >= 0 && i < list.size();
    }

    public static int e(List... listArr) {
        int size;
        if (listArr == null || listArr.length <= 0) {
            return 0;
        }
        int i = 0;
        for (List list : listArr) {
            if (list != null && (size = list.size()) > i) {
                i = size;
            }
        }
        return i;
    }

    public static void d(final Context context, HealthRecycleView healthRecycleView, LinearLayoutManager linearLayoutManager, boolean z, int i) {
        if (context == null || healthRecycleView == null || linearLayoutManager == null) {
            LogUtil.e("Section_SectionUtils", "setRecyclerViewLayout(), context or recycleView or linearLayoutManager is null!");
            return;
        }
        final boolean z2 = false;
        if (qrs.af(context)) {
            int iE = qrs.e(context, qqp.b(context));
            if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
                healthRecycleView.removeItemDecorationAt(0);
            }
            healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, iE, c(context)));
            final int i2 = 1;
            final int i3 = 2;
            if (z) {
                healthRecycleView.setLayoutManager(new GridLayoutManager(context, 2, 1, false));
                return;
            } else {
                healthRecycleView.setLayoutManager(new GridLayoutManager(context, i3, i2, z2) { // from class: com.huawei.health.knit.section.utils.SectionUtils$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public boolean canScrollVertically() {
                        return false;
                    }
                });
                return;
            }
        }
        if (healthRecycleView.getItemDecorationCount() > 0 && healthRecycleView.getItemDecorationAt(0) != null) {
            healthRecycleView.removeItemDecorationAt(0);
        }
        healthRecycleView.addItemDecoration(new FitnessItemDecoration(context, 0, i));
        healthRecycleView.setLayoutManager(linearLayoutManager);
    }

    public static int c(Context context) {
        return (int) Utils.convertPixelsToDp(context.getResources().getDimension(com.huawei.ui.commonui.R.dimen.cardMarginMiddle));
    }

    public static void b(HealthImageView healthImageView, Object obj) {
        if (healthImageView == null) {
            LogUtil.a("Section_SectionUtils", "loadImageContent imageView is null");
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 0) {
                qqf.e(healthImageView, str, f34559a, 0, R.drawable.section_sug_bg_trining_defuct_section);
                return;
            }
            return;
        }
        if (obj instanceof Integer) {
            qqf.a(((Integer) obj).intValue(), healthImageView, f34559a);
        } else if (obj instanceof Bitmap) {
            healthImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            healthImageView.setImageBitmap((Bitmap) obj);
        } else {
            a(healthImageView);
        }
    }

    public static void a(HealthImageView healthImageView) {
        qqf.a(R.drawable.section_sug_bg_trining_defuct_section, healthImageView, f34559a);
    }

    public static void c(View view, List<Map<String, Object>> list, int i) {
        if (view instanceof BaseBiItemView) {
            if (d(list, i)) {
                ((BaseBiItemView) view).a(list.get(i));
            } else {
                ((BaseBiItemView) view).a(null);
            }
        }
    }

    public static void a(HealthImageView healthImageView, List<Object> list, int i) {
        if (d(list, i) && healthImageView != null) {
            b(healthImageView, list.get(i));
        } else {
            a(healthImageView);
        }
    }

    public static void c(TextView textView, List<String> list, String str, int i, boolean z) {
        String strE;
        if (d(list, i) && textView != null) {
            if (z) {
                strE = ezi.e(list.get(i), str);
            } else {
                strE = list.get(i);
            }
            qsp.a(textView, strE, true);
            return;
        }
        qsp.c((View) textView, 8);
    }

    public static void d(View view, List<Drawable> list, int i) {
        if (d(list, i) && view != null) {
            qsp.c(view, list.get(i));
        } else {
            qsp.c(view, (Drawable) null);
        }
    }

    public static void d(View view, final OnClickSectionListener onClickSectionListener, final int i) {
        qsp.b(view, new View.OnClickListener() { // from class: fts.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                OnClickSectionListener onClickSectionListener2 = onClickSectionListener;
                if (onClickSectionListener2 != null) {
                    onClickSectionListener2.onClick(i);
                }
            }
        });
    }

    public static void a(Context context, View view, int i, int i2) {
        if (i == i2 - 1) {
            qsp.c(view, 8);
        } else if (context != null && qrs.af(context) && i == i2 - 2) {
            qsp.c(view, 8);
        } else {
            qsp.c(view, 0);
        }
    }

    public static boolean d(HashMap<String, Object> map) {
        return map.containsKey("IS_LOAD_DEFAULT_VIEW") && (map.get("IS_LOAD_DEFAULT_VIEW") instanceof Boolean) && ((Boolean) map.get("IS_LOAD_DEFAULT_VIEW")).booleanValue();
    }

    public static boolean d(HashMap<String, Object> map, HashMap<String, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getKey().equals("CLICK_EVENT_LISTENER") && !entry.getKey().equals("BUTTON_CLICK_EVENT") && (entry.getValue() == null || !entry.getValue().equals(map2.get(entry.getKey())))) {
                return false;
            }
        }
        return true;
    }

    public static void b(Context context, HealthRecycleView healthRecycleView, RecyclerView.Adapter adapter) {
        if (context == null || healthRecycleView == null || adapter == null) {
            return;
        }
        healthRecycleView.setAdapter(null);
        healthRecycleView.setLayoutManager(null);
        healthRecycleView.setAdapter(adapter);
        d(context, healthRecycleView, new HealthLinearLayoutManager(context), false, 0);
        adapter.notifyDataSetChanged();
    }

    public static void e(int i, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("page", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.VIEW_DIFFERENT_DATES_1040094.value(), map, 0);
    }
}
