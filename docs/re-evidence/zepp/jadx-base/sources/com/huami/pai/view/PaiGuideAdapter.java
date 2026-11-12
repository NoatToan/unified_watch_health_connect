package com.huami.pai.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.pai.lib.R;
import com.huami.pai.vo.PaiGuide;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R!\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001c\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/pai/view/PaiGuideAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "", "getCount", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "object", "", "isViewFromObject", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "", "destroyItem", "Ljava/util/ArrayList;", "Lcom/huami/pai/vo/PaiGuide;", "a", "Ljava/util/ArrayList;", "getPaiGuides", "()Ljava/util/ArrayList;", "paiGuides", "Landroid/content/Context;", "b", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiGuideAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<PaiGuide> paiGuides;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public PaiGuideAdapter(@NotNull ArrayList<PaiGuide> arrayList, @NotNull Context context) {
        this.paiGuides = arrayList;
        this.context = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        container.removeView((View) object);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        ArrayList<PaiGuide> arrayList = this.paiGuides;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @NotNull
    public final ArrayList<PaiGuide> getPaiGuides() {
        return this.paiGuides;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        View viewInflate = LayoutInflater.from(this.context).inflate(R.layout.fragment_pai_item_guide_content, container, false);
        ArrayList<PaiGuide> arrayList = this.paiGuides;
        PaiGuide paiGuide = arrayList == null ? null : arrayList.get(position);
        TextView textView = (TextView) viewInflate.findViewById(R.id.guide_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.guide_desc);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewInflate.findViewById(R.id.guide_illustration);
        if (paiGuide != null) {
            textView.setText(paiGuide.getTitle());
            textView2.setText(paiGuide.getDesc());
            appCompatImageView.setImageResource(paiGuide.getIllustrationId());
        }
        container.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return view == object;
    }
}
