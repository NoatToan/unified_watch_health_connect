package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleHorizontalGridContent;
import com.huawei.health.marketing.datatype.SingleHorizontalGridStandardContent;
import com.huawei.health.marketing.views.BaseSeriesSidingAdapter;
import com.huawei.health.marketing.views.holders.ThreeGridSeriesViewHolder;
import com.huawei.health.servicesui.R;
import health.compact.a.util.LogUtil;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gan extends BaseSeriesSidingAdapter<SingleHorizontalGridStandardContent> {
    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    public int getTitleColorId() {
        return 0;
    }

    public gan(Context context, int i, ResourceBriefInfo resourceBriefInfo, String str) {
        super(context, i, resourceBriefInfo, str);
    }

    @Override // com.huawei.health.marketing.views.BaseSeriesSidingAdapter
    public int getItemWidth() {
        if (getItemCount() > 1) {
            return qre.b(R.dimen.health_common_268dp);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ThreeGridSeriesViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.three_grid_series_layout, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (njy.e((Collection<?>) this.mList, i)) {
            LogUtil.c(this.TAG, "position is error");
            return;
        }
        if (!(viewHolder instanceof ThreeGridSeriesViewHolder)) {
            LogUtil.c(this.TAG, "holder error");
            return;
        }
        ThreeGridSeriesViewHolder threeGridSeriesViewHolder = (ThreeGridSeriesViewHolder) viewHolder;
        SingleHorizontalGridStandardContent singleHorizontalGridStandardContent = (SingleHorizontalGridStandardContent) this.mList.get(i);
        qsp.b(threeGridSeriesViewHolder.g(), singleHorizontalGridStandardContent.getThemeVisibility() ? singleHorizontalGridStandardContent.getTheme() : "", true);
        qsp.b(threeGridSeriesViewHolder.i(), singleHorizontalGridStandardContent.getSubThemeVisibility() ? singleHorizontalGridStandardContent.getSubTheme() : "", true);
        qsp.b(threeGridSeriesViewHolder.c(), singleHorizontalGridStandardContent.getTitle(), true);
        setBackground(singleHorizontalGridStandardContent.getBackgroundPicture(), singleHorizontalGridStandardContent.getBackgroundColor(), singleHorizontalGridStandardContent.getDarkBackgroundPicture(), singleHorizontalGridStandardContent.getDarkBackgroundColor(), threeGridSeriesViewHolder.e());
        setRecyclerViewItemLayout(viewHolder, i);
        qsp.b(threeGridSeriesViewHolder.itemView, qji.d(getViewClickListener(singleHorizontalGridStandardContent.getLinkValue(), singleHorizontalGridStandardContent.getTheme(), i), this.mContext, true, ""));
        List<SingleHorizontalGridContent> subContents = singleHorizontalGridStandardContent.getSubContents();
        if (subContents == null || subContents.size() < 3) {
            return;
        }
        d(threeGridSeriesViewHolder.b(), subContents, 0, singleHorizontalGridStandardContent.getTheme());
        d(threeGridSeriesViewHolder.d(), subContents, 1, singleHorizontalGridStandardContent.getTheme());
        d(threeGridSeriesViewHolder.a(), subContents, 2, singleHorizontalGridStandardContent.getTheme());
    }

    private void d(ImageView imageView, List<SingleHorizontalGridContent> list, int i, String str) {
        if (qqs.e(this.mContext)) {
            imageView.setAlpha(0.86f);
        }
        SingleHorizontalGridContent singleHorizontalGridContent = list.get(i);
        if (!TextUtils.isEmpty(singleHorizontalGridContent.getPicture())) {
            qqf.b(imageView, singleHorizontalGridContent.getPicture(), 0, 0, R.drawable.section_blank_1008);
        }
        qsp.b(imageView, qji.d(getViewClickListener(singleHorizontalGridContent.getLink(), str, i), this.mContext, true, ""));
        setBiEventListener(str, "", null, i, imageView);
    }
}
