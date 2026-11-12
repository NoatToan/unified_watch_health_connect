package com.huawei.health.section.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import defpackage.fsz;
import defpackage.fta;
import defpackage.fts;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qrs;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class SectionX_YList_01Adapter extends RecyclerView.Adapter<e> {
    public static int BITMAP_DEFAULT_CORNER = (int) BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_8dp);
    protected static final int IMAGE_SIZE = 2;
    protected static final int LAST_TWO = 2;
    private static final String TAG = "SectionX_YList_01Adapter";
    protected List<String> difficultyList;
    protected List<String> durationList;
    protected List<Object> imageList;
    protected List<Integer> imageSize;
    protected List<String> intervalList;
    protected Context mContext;
    protected List<String> nameList;
    protected OnClickSectionListener recycleViewListener;
    protected List<fsz> tagDataList;
    protected e viewHolder;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    public SectionX_YList_01Adapter(Context context, fta ftaVar) {
        this.mContext = context;
        setDataInternal(ftaVar);
    }

    public void setData(fta ftaVar) {
        setDataInternal(ftaVar);
        notifyDataSetChanged();
    }

    protected void setDataInternal(fta ftaVar) {
        this.nameList = ftaVar.h();
        this.imageList = ftaVar.e();
        this.imageSize = ftaVar.c();
        this.intervalList = ftaVar.b();
        this.difficultyList = ftaVar.d();
        this.durationList = ftaVar.a();
        this.tagDataList = ftaVar.j();
        this.recycleViewListener = ftaVar.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(LayoutInflater.from(this.mContext).inflate(R.layout.sectionx_ylist_01_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(e eVar, int i) {
        this.viewHolder = eVar;
        if (i == getItemCount() - 1) {
            setDividerViewVisibility(8);
        } else {
            Context context = this.mContext;
            if (context != null && qrs.af(context) && i == getItemCount() - 2) {
                setDividerViewVisibility(8);
            } else {
                setDividerViewVisibility(0);
            }
        }
        setDataAndRefresh(eVar, i);
    }

    protected void setDataAndRefresh(e eVar, int i) {
        setItemImage(eVar, i);
        setHolderText(eVar, i);
    }

    protected void setItemImage(e eVar, int i) {
        if (this.imageList.size() == 0) {
            eVar.f8732b.setVisibility(8);
            LogUtil.a(TAG, "setItemImage imageList.size() == 0");
            return;
        }
        if (!fts.d(this.imageList, i) || eVar.f8733c == null) {
            return;
        }
        List<Integer> list = this.imageSize;
        if (list != null && list.size() == 2) {
            ViewGroup.LayoutParams layoutParams = eVar.f8733c.getLayoutParams();
            layoutParams.height = (int) TypedValue.applyDimension(1, this.imageSize.get(0).intValue(), this.mContext.getResources().getDisplayMetrics());
            layoutParams.width = (int) TypedValue.applyDimension(1, this.imageSize.get(1).intValue(), this.mContext.getResources().getDisplayMetrics());
            eVar.f8733c.setLayoutParams(layoutParams);
        }
        setLoadRoundRectangle(this.imageList.get(i), eVar.d(), eVar);
    }

    protected void setDividerViewVisibility(int i) {
        if (this.viewHolder.d == null) {
            return;
        }
        this.viewHolder.d.setVisibility(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return fts.e(this.imageList, this.nameList, this.difficultyList, this.intervalList, this.durationList);
    }

    static class e extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected TextView f8731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected RelativeLayout f8732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected HealthImageView f8733c;
        protected LinearLayout d;
        protected TextView e;
        protected TextView f;
        protected TextView g;
        protected TextView h;
        protected RelativeLayout i;
        protected Object j;

        public e(View view) {
            super(view);
        }

        public void b(Object obj) {
            this.j = obj;
        }

        public Object d() {
            return this.j;
        }
    }

    protected void setHolderText(e eVar, int i) {
        if (fts.d(this.nameList, i) && eVar.h != null) {
            eVar.h.setText(this.nameList.get(i));
        }
        if (fts.d(this.difficultyList, i) && eVar.e != null) {
            eVar.e.setText(this.difficultyList.get(i));
        }
        if (fts.d(this.intervalList, i) && eVar.f != null) {
            eVar.f.setText(this.intervalList.get(i));
        }
        if (fts.d(this.durationList, i) && eVar.f8731a != null) {
            eVar.f8731a.setText(this.durationList.get(i));
        }
        bindHolderTag(eVar, i);
        setItemClickListener(eVar, i);
    }

    protected void setItemClickListener(e eVar, final int i) {
        if (eVar.i != null) {
            eVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.section.adapter.SectionX_YList_01Adapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (SectionX_YList_01Adapter.this.recycleViewListener != null) {
                        SectionX_YList_01Adapter.this.recycleViewListener.onClick(i);
                    }
                }
            });
        }
    }

    protected void bindHolderTag(e eVar, int i) {
        if (eVar.g == null) {
            return;
        }
        fsz fszVar = njy.c(this.tagDataList, i) ? this.tagDataList.get(i) : null;
        if (fszVar == null || TextUtils.isEmpty(fszVar.b())) {
            eVar.g.setVisibility(8);
            return;
        }
        eVar.g.setText(fszVar.b());
        eVar.g.setTextColor(fszVar.a());
        eVar.g.setBackground(fszVar.e());
        eVar.g.setVisibility(0);
    }

    protected void setLoadRoundRectangle(Object obj, Object obj2, e eVar) {
        if (obj instanceof String) {
            String str = (String) obj;
            String str2 = obj2 instanceof String ? (String) obj2 : "";
            if (str.length() <= 0 || str2.equals(str)) {
                return;
            }
            loadRoundRectangleImage(eVar, str, BITMAP_DEFAULT_CORNER);
            eVar.b(str);
            return;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            if ((obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0) != iIntValue) {
                qqf.a(iIntValue, eVar.f8733c, BITMAP_DEFAULT_CORNER);
                eVar.b(num);
                return;
            }
            return;
        }
        qqf.a(R.drawable.section_sug_bg_trining_defuct_section, eVar.f8733c, BITMAP_DEFAULT_CORNER);
    }

    private void loadRoundRectangleImage(e eVar, String str, int i) {
        eVar.f8733c.setTag(R.id.item_picture, str);
        if (eVar.f8733c.getTag(R.id.item_picture) == null || !str.equals(eVar.f8733c.getTag(R.id.item_picture))) {
            return;
        }
        qqf.c(str, eVar.f8733c, i);
    }
}
