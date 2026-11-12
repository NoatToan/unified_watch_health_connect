package com.huawei.pluginachievement.ui.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class ShareMedalItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Integer> f22195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22196c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22194a = "true";
    private int e = 1;

    public ShareMedalItemDecoration(Context context, int i) {
        this.f22196c = context;
        a(i);
    }

    public int d() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (rect == null || this.f22195b == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: layoutManager is null");
            return;
        }
        int itemCount = layoutManager.getItemCount();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.e;
        if (this.f22194a.equals("true")) {
            Integer num = this.f22195b.get("left");
            if (num == null) {
                LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: itemDecorationLeft is null");
            } else {
                rect.left = num.intValue() - ((num.intValue() * i) / this.e);
            }
            Integer num2 = this.f22195b.get("right");
            if (num2 == null) {
                LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: itemDecorationRight is null");
            } else {
                rect.right = ((i + 1) * num2.intValue()) / this.e;
            }
            if (childAdapterPosition < this.e) {
                Integer num3 = this.f22195b.get(Constant.MAP_KEY_TOP);
                if (num3 == null) {
                    LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: itemDecorationTop is null");
                } else {
                    rect.top = num3.intValue();
                }
            }
            if (childAdapterPosition >= this.e) {
                Integer num4 = this.f22195b.get("bottom");
                if (num4 == null) {
                    LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: itemDecorationBottom is null");
                } else {
                    rect.top = num4.intValue();
                }
            }
            if (childAdapterPosition >= itemCount - this.e) {
                Integer num5 = this.f22195b.get(TtmlNode.END);
                if (num5 == null) {
                    LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "getItemOffsets: itemDecorationEnd is null");
                } else {
                    rect.bottom = num5.intValue();
                }
            }
        }
    }

    private void a(int i) {
        this.f22195b = new HashMap<>(5);
        if (i == 1) {
            this.e = 1;
            c(50, 16, 16, 16, 16);
        } else if (i == 2) {
            this.e = 2;
            c(70, 44, 44, 24, 16);
        } else if (i > 2 && i < 5) {
            this.e = 2;
            c(20, 44, 44, 24, 16);
        } else if (i == 5 || i == 6) {
            this.e = 3;
            c(40, 16, 16, 30, 0);
        } else if (i < 7) {
            LogUtil.j("PLGACHIEVE_ShareMedalItemDecoration", "medalCount error:", Integer.valueOf(i));
            return;
        } else {
            this.e = 3;
            c(20, 16, 16, 12, 8);
        }
        int i2 = this.e;
        LogUtil.a("PLGACHIEVE_ShareMedalItemDecoration", "medalCount =", Integer.valueOf(i), "spanCount =", Integer.valueOf(i2), " includeEdge =", this.f22194a);
    }

    private void c(int i, int i2, int i3, int i4, int i5) {
        this.f22194a = "true";
        this.f22195b.put(Constant.MAP_KEY_TOP, Integer.valueOf(a(this.f22196c, i)));
        this.f22195b.put("left", Integer.valueOf(a(this.f22196c, i2)));
        this.f22195b.put("right", Integer.valueOf(a(this.f22196c, i3)));
        this.f22195b.put("bottom", Integer.valueOf(a(this.f22196c, i4)));
        this.f22195b.put(TtmlNode.END, Integer.valueOf(a(this.f22196c, i5)));
    }

    private int a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
